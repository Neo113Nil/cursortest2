package ee.forgr.nativepurchases;

import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.util.Log;
import com.android.billingclient.api.AccountIdentifiers;
import com.android.billingclient.api.AcknowledgePurchaseParams;
import com.android.billingclient.api.AcknowledgePurchaseResponseListener;
import com.android.billingclient.api.BillingClient;
import com.android.billingclient.api.BillingClientStateListener;
import com.android.billingclient.api.BillingFlowParams;
import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.ConsumeParams;
import com.android.billingclient.api.ConsumeResponseListener;
import com.android.billingclient.api.PendingPurchasesParams;
import com.android.billingclient.api.ProductDetails;
import com.android.billingclient.api.ProductDetailsResponseListener;
import com.android.billingclient.api.Purchase;
import com.android.billingclient.api.PurchasesResponseListener;
import com.android.billingclient.api.PurchasesUpdatedListener;
import com.android.billingclient.api.QueryProductDetailsParams;
import com.android.billingclient.api.QueryProductDetailsResult;
import com.android.billingclient.api.QueryPurchasesParams;
import com.facebook.AuthenticationTokenClaims;
import com.facebook.internal.ServerProtocol;
import com.facebook.share.internal.ShareConstants;
import com.getcapacitor.JSArray;
import com.getcapacitor.JSObject;
import com.getcapacitor.Plugin;
import com.getcapacitor.PluginCall;
import com.getcapacitor.PluginMethod;
import com.getcapacitor.annotation.CapacitorPlugin;
import com.google.common.collect.ImmutableList;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Phaser;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONArray;

@CapacitorPlugin(name = NativePurchasesPlugin.TAG)
/* loaded from: classes2.dex */
public class NativePurchasesPlugin extends Plugin {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    public static final String TAG = "NativePurchases";
    private static final Phaser semaphoreReady = new Phaser(1);
    private BillingClient billingClient;
    private final String pluginVersion = "8.0.13";
    private PluginCall pendingCall = null;
    private BillingResult lastBillingError = null;

    @PluginMethod
    public void isBillingSupported(PluginCall pluginCall) {
        Log.d(TAG, "isBillingSupported() called");
        try {
            initBillingClient(null);
            JSObject jSObject = new JSObject();
            jSObject.put("isBillingSupported", true);
            Log.d(TAG, "isBillingSupported() returning true - billing client initialized successfully");
            closeBillingClient();
            pluginCall.resolve(jSObject);
        } catch (RuntimeException e) {
            Log.e(TAG, "isBillingSupported() - billing client initialization failed: " + e.getMessage());
            closeBillingClient();
            JSObject jSObject2 = new JSObject();
            jSObject2.put("isBillingSupported", false);
            Log.d(TAG, "isBillingSupported() returning false - billing not available");
            pluginCall.resolve(jSObject2);
        } catch (Exception e2) {
            Log.e(TAG, "isBillingSupported() - unexpected error: " + e2.getMessage());
            closeBillingClient();
            JSObject jSObject3 = new JSObject();
            jSObject3.put("isBillingSupported", false);
            Log.d(TAG, "isBillingSupported() returning false - unexpected error");
            pluginCall.resolve(jSObject3);
        }
    }

    @Override // com.getcapacitor.Plugin
    public void load() {
        super.load();
        Log.d(TAG, "Plugin load() called");
        Log.i(TAG, "load");
        semaphoreDown();
        Log.d(TAG, "Plugin load() completed");
    }

    private void semaphoreWait() {
        Integer num = 10;
        Log.d(TAG, "semaphoreWait() called with waitTime: " + num);
        Log.i(TAG, "semaphoreWait " + num);
        try {
            Phaser phaser = semaphoreReady;
            phaser.awaitAdvanceInterruptibly(phaser.getPhase(), num.longValue(), TimeUnit.SECONDS);
            Log.i(TAG, "semaphoreReady count " + phaser.getPhase());
            Log.d(TAG, "semaphoreWait() completed successfully");
        } catch (InterruptedException e) {
            Log.d(TAG, "semaphoreWait() InterruptedException: " + e.getMessage());
            Log.i(TAG, "semaphoreWait InterruptedException");
            e.printStackTrace();
        } catch (TimeoutException e2) {
            Log.d(TAG, "semaphoreWait() TimeoutException: " + e2.getMessage());
            throw new RuntimeException(e2);
        }
    }

    private void semaphoreUp() {
        Log.d(TAG, "semaphoreUp() called");
        Log.i(TAG, "semaphoreUp");
        semaphoreReady.register();
        Log.d(TAG, "semaphoreUp() completed");
    }

    private void semaphoreDown() {
        Log.d(TAG, "semaphoreDown() called");
        Log.i(TAG, "semaphoreDown");
        StringBuilder sb = new StringBuilder("semaphoreDown count ");
        Phaser phaser = semaphoreReady;
        Log.i(TAG, sb.append(phaser.getPhase()).toString());
        phaser.arriveAndDeregister();
        Log.d(TAG, "semaphoreDown() completed");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void closeBillingClient() {
        Log.d(TAG, "closeBillingClient() called");
        if (this.billingClient != null) {
            Log.d(TAG, "Ending billing client connection");
            this.billingClient.endConnection();
            this.billingClient = null;
            semaphoreDown();
            Log.d(TAG, "Billing client closed and set to null");
        } else {
            Log.d(TAG, "Billing client was already null");
        }
        if (this.pendingCall != null) {
            Log.w(TAG, "Warning: Clearing pending call that was never resolved/rejected");
            this.pendingCall = null;
        }
        this.lastBillingError = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handlePurchase(Purchase purchase, PluginCall pluginCall) {
        Log.d(TAG, "handlePurchase() called");
        Log.d(TAG, "Purchase details: " + purchase.toString());
        Log.i(TAG, "handlePurchase" + purchase);
        Log.i(TAG, "getPurchaseState" + purchase.getPurchaseState());
        Log.d(TAG, "Purchase state: " + purchase.getPurchaseState());
        Log.d(TAG, "Purchase token: " + purchase.getPurchaseToken());
        Log.d(TAG, "Is acknowledged: " + purchase.isAcknowledged());
        if (purchase.getPurchaseState() == 1) {
            Log.d(TAG, "Purchase state is PURCHASED");
            boolean z = pluginCall != null && pluginCall.getBoolean("isConsumable", false).booleanValue();
            boolean booleanValue = pluginCall != null ? pluginCall.getBoolean("autoAcknowledgePurchases", true).booleanValue() : true;
            Log.d(TAG, "Auto-acknowledge enabled: " + booleanValue);
            PurchaseAction decide = PurchaseActionDecider.decide(z, purchase);
            AccountIdentifiers accountIdentifiers = purchase.getAccountIdentifiers();
            String obfuscatedAccountId = accountIdentifiers != null ? accountIdentifiers.getObfuscatedAccountId() : null;
            Log.d(TAG, "Purchase account identifier present: ".concat(obfuscatedAccountId != null ? "[REDACTED]" : "none"));
            int i = AnonymousClass8.$SwitchMap$ee$forgr$nativepurchases$PurchaseAction[decide.ordinal()];
            if (i == 1) {
                Log.d(TAG, "Purchase flagged as consumable, consuming...");
                this.billingClient.consumeAsync(ConsumeParams.newBuilder().setPurchaseToken(purchase.getPurchaseToken()).build(), new ConsumeResponseListener() { // from class: ee.forgr.nativepurchases.NativePurchasesPlugin$$ExternalSyntheticLambda1
                    @Override // com.android.billingclient.api.ConsumeResponseListener
                    public final void onConsumeResponse(BillingResult billingResult, String str) {
                        NativePurchasesPlugin.this.onConsumeResponse(billingResult, str);
                    }
                });
            } else if (i != 2) {
                Log.d(TAG, "No additional purchase handling required");
            } else if (booleanValue) {
                Log.d(TAG, "Purchase not acknowledged, auto-acknowledging...");
                acknowledgePurchase(purchase.getPurchaseToken());
            } else {
                Log.d(TAG, "Purchase not acknowledged, but auto-acknowledge is disabled. Developer must manually acknowledge.");
            }
            JSObject jSObject = new JSObject();
            jSObject.put("transactionId", purchase.getPurchaseToken());
            jSObject.put("productIdentifier", purchase.getProducts().get(0));
            jSObject.put("purchaseDate", new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'", Locale.US).format(new Date(purchase.getPurchaseTime())));
            jSObject.put(FirebaseAnalytics.Param.QUANTITY, purchase.getQuantity());
            jSObject.put("productType", purchase.getPurchaseState() == 1 ? "inapp" : "subs");
            jSObject.put("orderId", purchase.getOrderId());
            jSObject.put("purchaseToken", purchase.getPurchaseToken());
            jSObject.put("isAcknowledged", purchase.isAcknowledged());
            jSObject.put("purchaseState", String.valueOf(purchase.getPurchaseState()));
            jSObject.put("appAccountToken", obfuscatedAccountId);
            jSObject.put("willCancel", (String) null);
            if (purchase.getPurchaseState() == 1 && purchase.getProducts().get(0).contains(AuthenticationTokenClaims.JSON_KEY_SUB)) {
                jSObject.put("productType", "subs");
            }
            Log.d(TAG, "Resolving purchase call with transactionId: " + purchase.getPurchaseToken());
            if (pluginCall != null) {
                pluginCall.resolve(jSObject);
                return;
            } else {
                Log.d(TAG, "purchaseCall is null, cannot resolve");
                return;
            }
        }
        if (purchase.getPurchaseState() == 2) {
            Log.d(TAG, "Purchase state is PENDING");
            if (pluginCall != null) {
                pluginCall.reject("Purchase is pending");
                return;
            } else {
                Log.d(TAG, "purchaseCall is null for pending purchase");
                return;
            }
        }
        Log.d(TAG, "Purchase state is OTHER: " + purchase.getPurchaseState());
        if (pluginCall != null) {
            pluginCall.reject("Purchase is not purchased");
        } else {
            Log.d(TAG, "purchaseCall is null for failed purchase");
        }
    }

    /* renamed from: ee.forgr.nativepurchases.NativePurchasesPlugin$8, reason: invalid class name */
    static /* synthetic */ class AnonymousClass8 {
        static final /* synthetic */ int[] $SwitchMap$ee$forgr$nativepurchases$PurchaseAction;

        static {
            int[] iArr = new int[PurchaseAction.values().length];
            $SwitchMap$ee$forgr$nativepurchases$PurchaseAction = iArr;
            try {
                iArr[PurchaseAction.CONSUME.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$ee$forgr$nativepurchases$PurchaseAction[PurchaseAction.ACKNOWLEDGE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$ee$forgr$nativepurchases$PurchaseAction[PurchaseAction.NONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    private void acknowledgePurchase(String str) {
        Log.d(TAG, "acknowledgePurchase() called with token: " + str);
        this.billingClient.acknowledgePurchase(AcknowledgePurchaseParams.newBuilder().setPurchaseToken(str).build(), new AcknowledgePurchaseResponseListener(this) { // from class: ee.forgr.nativepurchases.NativePurchasesPlugin.1
            @Override // com.android.billingclient.api.AcknowledgePurchaseResponseListener
            public void onAcknowledgePurchaseResponse(BillingResult billingResult) {
                Log.d(NativePurchasesPlugin.TAG, "onAcknowledgePurchaseResponse() called");
                Log.d(NativePurchasesPlugin.TAG, "Acknowledge result: " + billingResult.getResponseCode() + " - " + billingResult.getDebugMessage());
                Log.i(NativePurchasesPlugin.TAG, "onAcknowledgePurchaseResponse" + billingResult);
            }
        });
    }

    private void initBillingClient(final PluginCall pluginCall) {
        Log.d(TAG, "initBillingClient() called");
        Log.d(TAG, "purchaseCall is null: " + (pluginCall == null));
        this.pendingCall = pluginCall;
        this.lastBillingError = null;
        semaphoreWait();
        closeBillingClient();
        semaphoreUp();
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        Log.d(TAG, "Creating new BillingClient");
        this.billingClient = BillingClient.newBuilder(getContext()).setListener(new PurchasesUpdatedListener() { // from class: ee.forgr.nativepurchases.NativePurchasesPlugin.2
            @Override // com.android.billingclient.api.PurchasesUpdatedListener
            public void onPurchasesUpdated(BillingResult billingResult, List<Purchase> list) {
                Log.d(NativePurchasesPlugin.TAG, "onPurchasesUpdated() called");
                Log.d(NativePurchasesPlugin.TAG, "Billing result: " + billingResult.getResponseCode() + " - " + billingResult.getDebugMessage());
                Log.d(NativePurchasesPlugin.TAG, "Purchases count: " + (list != null ? list.size() : 0));
                Log.i(NativePurchasesPlugin.TAG, "onPurchasesUpdated" + billingResult);
                if (billingResult.getResponseCode() == 0 && list != null) {
                    Log.d(NativePurchasesPlugin.TAG, "Purchase update successful, processing first purchase");
                    NativePurchasesPlugin.this.handlePurchase(list.get(0), pluginCall);
                } else {
                    Log.d(NativePurchasesPlugin.TAG, "Purchase update failed or purchases is null");
                    Log.i(NativePurchasesPlugin.TAG, "onPurchasesUpdated" + billingResult);
                    PluginCall pluginCall2 = pluginCall;
                    if (pluginCall2 != null) {
                        pluginCall2.reject("Purchase is not purchased");
                    }
                }
                NativePurchasesPlugin.this.closeBillingClient();
            }
        }).enablePendingPurchases(PendingPurchasesParams.newBuilder().enableOneTimeProducts().build()).build();
        Log.d(TAG, "Starting billing client connection");
        this.billingClient.startConnection(new BillingClientStateListener() { // from class: ee.forgr.nativepurchases.NativePurchasesPlugin.3
            @Override // com.android.billingclient.api.BillingClientStateListener
            public void onBillingSetupFinished(BillingResult billingResult) {
                String str;
                Log.d(NativePurchasesPlugin.TAG, "onBillingSetupFinished() called");
                Log.d(NativePurchasesPlugin.TAG, "Setup result: " + billingResult.getResponseCode() + " - " + billingResult.getDebugMessage());
                if (billingResult.getResponseCode() == 0) {
                    Log.d(NativePurchasesPlugin.TAG, "Billing setup successful, client is ready");
                    NativePurchasesPlugin.this.lastBillingError = null;
                    countDownLatch.countDown();
                    return;
                }
                Log.e(NativePurchasesPlugin.TAG, "Billing setup failed with code: " + billingResult.getResponseCode());
                Log.e(NativePurchasesPlugin.TAG, "Error message: " + billingResult.getDebugMessage());
                NativePurchasesPlugin.this.lastBillingError = billingResult;
                countDownLatch.countDown();
                if (NativePurchasesPlugin.this.pendingCall != null) {
                    Log.d(NativePurchasesPlugin.TAG, "Rejecting pending call due to billing setup failure");
                    int responseCode = billingResult.getResponseCode();
                    if (responseCode == -2) {
                        str = "This billing feature is not supported.";
                    } else if (responseCode == -1) {
                        str = "Billing service disconnected. Please try again.";
                    } else if (responseCode == 2) {
                        str = "Billing service unavailable. Please check your internet connection and Google Play Services.";
                    } else if (responseCode == 3) {
                        str = "Billing is not available on this device.";
                    } else {
                        str = "Billing setup failed: " + billingResult.getDebugMessage();
                    }
                    NativePurchasesPlugin.this.pendingCall.reject("BILLING_SETUP_FAILED", str);
                    NativePurchasesPlugin.this.pendingCall = null;
                }
            }

            @Override // com.android.billingclient.api.BillingClientStateListener
            public void onBillingServiceDisconnected() {
                Log.d(NativePurchasesPlugin.TAG, "onBillingServiceDisconnected() called");
            }
        });
        try {
            Log.d(TAG, "Waiting for billing client setup to finish");
            countDownLatch.await();
            Log.d(TAG, "Billing client setup wait completed");
            if (this.lastBillingError != null) {
                Log.e(TAG, "Billing setup failed, throwing exception");
                throw new RuntimeException("Billing setup failed: " + this.lastBillingError.getDebugMessage());
            }
            Log.d(TAG, "Billing client setup completed successfully");
        } catch (InterruptedException e) {
            Log.e(TAG, "InterruptedException while waiting for billing setup: " + e.getMessage());
            e.printStackTrace();
            PluginCall pluginCall2 = this.pendingCall;
            if (pluginCall2 != null) {
                pluginCall2.reject("BILLING_INTERRUPTED", "Billing setup was interrupted");
                this.pendingCall = null;
            }
        } catch (RuntimeException e2) {
            Log.e(TAG, "RuntimeException during billing setup: " + e2.getMessage());
            throw e2;
        }
    }

    @PluginMethod
    public void getPluginVersion(PluginCall pluginCall) {
        Log.d(TAG, "getPluginVersion() called");
        try {
            JSObject jSObject = new JSObject();
            Objects.requireNonNull(this);
            jSObject.put(ServerProtocol.FALLBACK_DIALOG_PARAM_VERSION, "8.0.13");
            Objects.requireNonNull(this);
            Log.d(TAG, "Returning plugin version: 8.0.13");
            pluginCall.resolve(jSObject);
        } catch (Exception e) {
            Log.d(TAG, "Error getting plugin version: " + e.getMessage());
            pluginCall.reject("Could not get plugin version", e);
        }
    }

    @PluginMethod
    public void purchaseProduct(final PluginCall pluginCall) {
        Log.d(TAG, "purchaseProduct() called");
        String string = pluginCall.getString("productIdentifier");
        final String string2 = pluginCall.getString("planIdentifier");
        final String string3 = pluginCall.getString("productType", "inapp");
        Integer num = pluginCall.getInt(FirebaseAnalytics.Param.QUANTITY, 1);
        String string4 = pluginCall.getString("appAccountToken");
        if (string4 == null || string4.isEmpty()) {
            string4 = null;
        }
        boolean z = false;
        boolean booleanValue = pluginCall.getBoolean("isConsumable", false).booleanValue();
        boolean booleanValue2 = pluginCall.getBoolean("autoAcknowledgePurchases", true).booleanValue();
        Log.d(TAG, "Product identifier: " + string);
        Log.d(TAG, "Plan identifier: " + string2);
        Log.d(TAG, "Product type: " + string3);
        Log.d(TAG, "Quantity: " + num);
        Log.d(TAG, "Account identifier provided: ".concat(string4 != null ? "[REDACTED]" : "none"));
        Log.d(TAG, "Is consumable: " + booleanValue);
        Log.d(TAG, "Auto-acknowledge purchases: " + booleanValue2);
        Log.d("CapacitorPurchases", "purchaseProduct: " + string);
        if (string == null || string.isEmpty()) {
            Log.d(TAG, "Error: productIdentifier is empty");
            pluginCall.reject("productIdentifier is empty");
            return;
        }
        if (string3 == null || string3.isEmpty()) {
            Log.d(TAG, "Error: productType is empty");
            pluginCall.reject("productType is empty");
            return;
        }
        if (string3.equals("subs") && (string2 == null || string2.isEmpty())) {
            Log.d(TAG, "Error: planIdentifier cannot be empty if productType is subs");
            pluginCall.reject("planIdentifier cannot be empty if productType is subs");
            return;
        }
        if (num.intValue() < 1) {
            Log.d(TAG, "Error: quantity is less than 1");
            pluginCall.reject("quantity is less than 1");
            return;
        }
        if (booleanValue && string3.equals("subs")) {
            Log.d(TAG, "isConsumable is not supported for subscriptions, ignoring flag");
        } else {
            z = booleanValue;
        }
        pluginCall.getData().put("isConsumable", z);
        pluginCall.getData().put("autoAcknowledgePurchases", booleanValue2);
        Log.d(TAG, "Using product ID for query: " + string);
        QueryProductDetailsParams build = QueryProductDetailsParams.newBuilder().setProductList(ImmutableList.of(QueryProductDetailsParams.Product.newBuilder().setProductId(string).setProductType(string3.equals("inapp") ? "inapp" : "subs").build())).build();
        Log.d(TAG, "Initializing billing client for purchase");
        try {
            initBillingClient(pluginCall);
            try {
                Log.d(TAG, "Querying product details for purchase");
                final String str = string4;
                this.billingClient.queryProductDetailsAsync(build, new ProductDetailsResponseListener() { // from class: ee.forgr.nativepurchases.NativePurchasesPlugin.4
                    static final /* synthetic */ boolean $assertionsDisabled = false;

                    @Override // com.android.billingclient.api.ProductDetailsResponseListener
                    public void onProductDetailsResponse(BillingResult billingResult, QueryProductDetailsResult queryProductDetailsResult) {
                        ProductDetails.SubscriptionOfferDetails subscriptionOfferDetails;
                        List<ProductDetails> productDetailsList = queryProductDetailsResult.getProductDetailsList();
                        Log.d(NativePurchasesPlugin.TAG, "onProductDetailsResponse() called for purchase");
                        Log.d(NativePurchasesPlugin.TAG, "Query result: " + billingResult.getResponseCode() + " - " + billingResult.getDebugMessage());
                        Log.d(NativePurchasesPlugin.TAG, "Product details count: " + productDetailsList.size());
                        if (productDetailsList.isEmpty()) {
                            Log.d(NativePurchasesPlugin.TAG, "No products found");
                            NativePurchasesPlugin.this.closeBillingClient();
                            pluginCall.reject("Product not found");
                            return;
                        }
                        ArrayList arrayList = new ArrayList();
                        for (ProductDetails productDetails : productDetailsList) {
                            Log.d(NativePurchasesPlugin.TAG, "Processing product: " + productDetails.getProductId());
                            BillingFlowParams.ProductDetailsParams.Builder productDetails2 = BillingFlowParams.ProductDetailsParams.newBuilder().setProductDetails(productDetails);
                            if (string3.equals("subs")) {
                                Log.d(NativePurchasesPlugin.TAG, "Processing subscription product");
                                Log.d(NativePurchasesPlugin.TAG, "Available offer details count: " + productDetails.getSubscriptionOfferDetails().size());
                                Iterator<ProductDetails.SubscriptionOfferDetails> it = productDetails.getSubscriptionOfferDetails().iterator();
                                while (true) {
                                    if (!it.hasNext()) {
                                        subscriptionOfferDetails = null;
                                        break;
                                    }
                                    subscriptionOfferDetails = it.next();
                                    Log.d(NativePurchasesPlugin.TAG, "Checking offer: " + subscriptionOfferDetails.getBasePlanId());
                                    if (subscriptionOfferDetails.getBasePlanId().equals(string2)) {
                                        Log.d(NativePurchasesPlugin.TAG, "Found matching plan: " + string2);
                                        break;
                                    }
                                }
                                if (subscriptionOfferDetails == null) {
                                    subscriptionOfferDetails = productDetails.getSubscriptionOfferDetails().get(0);
                                    Log.d(NativePurchasesPlugin.TAG, "Using first available offer: " + subscriptionOfferDetails.getBasePlanId());
                                }
                                productDetails2.setOfferToken(subscriptionOfferDetails.getOfferToken());
                                Log.d(NativePurchasesPlugin.TAG, "Set offer token: " + subscriptionOfferDetails.getOfferToken());
                            }
                            arrayList.add(productDetails2.build());
                        }
                        BillingFlowParams.Builder productDetailsParamsList = BillingFlowParams.newBuilder().setProductDetailsParamsList(arrayList);
                        String str2 = str;
                        if (str2 != null && !str2.isEmpty()) {
                            productDetailsParamsList.setObfuscatedAccountId(str);
                        }
                        BillingFlowParams build2 = productDetailsParamsList.build();
                        Log.d(NativePurchasesPlugin.TAG, "Launching billing flow");
                        BillingResult launchBillingFlow = NativePurchasesPlugin.this.billingClient.launchBillingFlow(NativePurchasesPlugin.this.getActivity(), build2);
                        Log.d(NativePurchasesPlugin.TAG, "Billing flow launch result: " + launchBillingFlow.getResponseCode() + " - " + launchBillingFlow.getDebugMessage());
                        Log.i(NativePurchasesPlugin.TAG, "onProductDetailsResponse2" + launchBillingFlow);
                    }
                });
            } catch (Exception e) {
                Log.d(TAG, "Exception during purchase: " + e.getMessage());
                closeBillingClient();
                pluginCall.reject(e.getMessage());
            }
        } catch (RuntimeException e2) {
            Log.e(TAG, "Failed to initialize billing client: " + e2.getMessage());
            closeBillingClient();
        }
    }

    private void processUnfinishedPurchases() {
        Log.d(TAG, "processUnfinishedPurchases() called");
        QueryPurchasesParams build = QueryPurchasesParams.newBuilder().setProductType("inapp").build();
        Log.d(TAG, "Querying unfinished in-app purchases");
        this.billingClient.queryPurchasesAsync(build, new PurchasesResponseListener() { // from class: ee.forgr.nativepurchases.NativePurchasesPlugin$$ExternalSyntheticLambda0
            @Override // com.android.billingclient.api.PurchasesResponseListener
            public final void onQueryPurchasesResponse(BillingResult billingResult, List list) {
                NativePurchasesPlugin.this.handlePurchases(billingResult, list);
            }
        });
        QueryPurchasesParams build2 = QueryPurchasesParams.newBuilder().setProductType("subs").build();
        Log.d(TAG, "Querying unfinished subscription purchases");
        this.billingClient.queryPurchasesAsync(build2, new PurchasesResponseListener() { // from class: ee.forgr.nativepurchases.NativePurchasesPlugin$$ExternalSyntheticLambda0
            @Override // com.android.billingclient.api.PurchasesResponseListener
            public final void onQueryPurchasesResponse(BillingResult billingResult, List list) {
                NativePurchasesPlugin.this.handlePurchases(billingResult, list);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handlePurchases(BillingResult billingResult, List<Purchase> list) {
        Log.d(TAG, "handlePurchases() called");
        Log.d(TAG, "Query purchases result: " + billingResult.getResponseCode() + " - " + billingResult.getDebugMessage());
        Log.d(TAG, "Purchases count: " + (list != null ? list.size() : 0));
        if (billingResult.getResponseCode() == 0) {
            for (Purchase purchase : list) {
                Log.d(TAG, "Processing purchase: " + purchase.getOrderId());
                Log.d(TAG, "Purchase state: " + purchase.getPurchaseState());
                if (purchase.getPurchaseState() == 1) {
                    if (PurchaseActionDecider.decide(false, purchase) == PurchaseAction.ACKNOWLEDGE) {
                        Log.d(TAG, "Purchase not acknowledged, acknowledging");
                        acknowledgePurchase(purchase.getPurchaseToken());
                    } else {
                        Log.d(TAG, "Purchase already acknowledged, skipping consume");
                    }
                }
            }
            return;
        }
        Log.d(TAG, "Query purchases failed");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onConsumeResponse(BillingResult billingResult, String str) {
        Log.d(TAG, "onConsumeResponse() called");
        Log.d(TAG, "Consume result: " + billingResult.getResponseCode() + " - " + billingResult.getDebugMessage());
        Log.d(TAG, "Purchase token: " + str);
        if (billingResult.getResponseCode() == 0) {
            Log.d(TAG, "Consume operation successful");
            Log.i(TAG, "onConsumeResponse OK " + billingResult + str);
        } else {
            Log.d(TAG, "Consume operation failed");
            Log.i(TAG, "onConsumeResponse OTHER " + billingResult + str);
        }
    }

    @PluginMethod
    public void restorePurchases(PluginCall pluginCall) {
        Log.d(TAG, "restorePurchases() called");
        Log.d(TAG, "restorePurchases");
        try {
            initBillingClient(pluginCall);
            processUnfinishedPurchases();
            pluginCall.resolve();
            Log.d(TAG, "restorePurchases() completed");
        } catch (RuntimeException e) {
            Log.e(TAG, "Failed to initialize billing client: " + e.getMessage());
            closeBillingClient();
        }
    }

    private void querySingleProductDetails(String str, final String str2, final PluginCall pluginCall) {
        Log.d(TAG, "querySingleProductDetails() called");
        Log.d(TAG, "Product identifier: " + str);
        Log.d(TAG, "Product type: " + str2);
        String str3 = str2.equals("inapp") ? "inapp" : "subs";
        Log.d(TAG, "Creating query product: ID='" + str + "', Type='" + str3 + "'");
        ArrayList arrayList = new ArrayList();
        arrayList.add(QueryProductDetailsParams.Product.newBuilder().setProductId(str).setProductType(str3).build());
        QueryProductDetailsParams build = QueryProductDetailsParams.newBuilder().setProductList(arrayList).build();
        Log.d(TAG, "Initializing billing client for single product query");
        try {
            initBillingClient(pluginCall);
            try {
                Log.d(TAG, "Querying product details");
                this.billingClient.queryProductDetailsAsync(build, new ProductDetailsResponseListener() { // from class: ee.forgr.nativepurchases.NativePurchasesPlugin.5
                    @Override // com.android.billingclient.api.ProductDetailsResponseListener
                    public void onProductDetailsResponse(BillingResult billingResult, QueryProductDetailsResult queryProductDetailsResult) {
                        List<ProductDetails> productDetailsList = queryProductDetailsResult.getProductDetailsList();
                        Log.d(NativePurchasesPlugin.TAG, "onProductDetailsResponse() called for single product query");
                        Log.d(NativePurchasesPlugin.TAG, "Query result: " + billingResult.getResponseCode() + " - " + billingResult.getDebugMessage());
                        Log.d(NativePurchasesPlugin.TAG, "Product details count: " + productDetailsList.size());
                        if (productDetailsList.isEmpty()) {
                            Log.d(NativePurchasesPlugin.TAG, "No product found in query");
                            Log.d(NativePurchasesPlugin.TAG, "This usually means:");
                            Log.d(NativePurchasesPlugin.TAG, "1. Product doesn't exist in Google Play Console");
                            Log.d(NativePurchasesPlugin.TAG, "2. Product is not published/active");
                            Log.d(NativePurchasesPlugin.TAG, "3. App is not properly configured for the product type");
                            Log.d(NativePurchasesPlugin.TAG, "4. Wrong product ID or type");
                            NativePurchasesPlugin.this.closeBillingClient();
                            pluginCall.reject("Product not found");
                            return;
                        }
                        ProductDetails productDetails = productDetailsList.get(0);
                        Log.d(NativePurchasesPlugin.TAG, "Processing product details: " + productDetails.getProductId());
                        JSObject jSObject = new JSObject();
                        jSObject.put(ShareConstants.WEB_DIALOG_PARAM_TITLE, productDetails.getName());
                        jSObject.put("description", productDetails.getDescription());
                        Log.d(NativePurchasesPlugin.TAG, "Product title: " + productDetails.getName());
                        Log.d(NativePurchasesPlugin.TAG, "Product description: " + productDetails.getDescription());
                        if (str2.equals("inapp")) {
                            Log.d(NativePurchasesPlugin.TAG, "Processing as in-app product");
                            jSObject.put("identifier", productDetails.getProductId());
                            double priceAmountMicros = ((ProductDetails.OneTimePurchaseOfferDetails) Objects.requireNonNull(productDetails.getOneTimePurchaseOfferDetails())).getPriceAmountMicros() / 1000000.0d;
                            jSObject.put(FirebaseAnalytics.Param.PRICE, priceAmountMicros);
                            jSObject.put("priceString", productDetails.getOneTimePurchaseOfferDetails().getFormattedPrice());
                            jSObject.put("currencyCode", productDetails.getOneTimePurchaseOfferDetails().getPriceCurrencyCode());
                            Log.d(NativePurchasesPlugin.TAG, "Price: " + priceAmountMicros);
                            Log.d(NativePurchasesPlugin.TAG, "Formatted price: " + productDetails.getOneTimePurchaseOfferDetails().getFormattedPrice());
                            Log.d(NativePurchasesPlugin.TAG, "Currency: " + productDetails.getOneTimePurchaseOfferDetails().getPriceCurrencyCode());
                        } else {
                            Log.d(NativePurchasesPlugin.TAG, "Processing as subscription product");
                            ProductDetails.SubscriptionOfferDetails subscriptionOfferDetails = productDetails.getSubscriptionOfferDetails().get(0);
                            jSObject.put("planIdentifier", productDetails.getProductId());
                            jSObject.put("identifier", subscriptionOfferDetails.getBasePlanId());
                            double priceAmountMicros2 = subscriptionOfferDetails.getPricingPhases().getPricingPhaseList().get(0).getPriceAmountMicros() / 1000000.0d;
                            jSObject.put(FirebaseAnalytics.Param.PRICE, priceAmountMicros2);
                            jSObject.put("priceString", subscriptionOfferDetails.getPricingPhases().getPricingPhaseList().get(0).getFormattedPrice());
                            jSObject.put("currencyCode", subscriptionOfferDetails.getPricingPhases().getPricingPhaseList().get(0).getPriceCurrencyCode());
                            Log.d(NativePurchasesPlugin.TAG, "Plan identifier: " + productDetails.getProductId());
                            Log.d(NativePurchasesPlugin.TAG, "Base plan ID: " + subscriptionOfferDetails.getBasePlanId());
                            Log.d(NativePurchasesPlugin.TAG, "Price: " + priceAmountMicros2);
                            Log.d(NativePurchasesPlugin.TAG, "Formatted price: " + subscriptionOfferDetails.getPricingPhases().getPricingPhaseList().get(0).getFormattedPrice());
                            Log.d(NativePurchasesPlugin.TAG, "Currency: " + subscriptionOfferDetails.getPricingPhases().getPricingPhaseList().get(0).getPriceCurrencyCode());
                        }
                        jSObject.put("isFamilyShareable", false);
                        JSObject jSObject2 = new JSObject();
                        jSObject2.put("product", (Object) jSObject);
                        Log.d(NativePurchasesPlugin.TAG, "Returning single product");
                        NativePurchasesPlugin.this.closeBillingClient();
                        pluginCall.resolve(jSObject2);
                    }
                });
            } catch (Exception e) {
                Log.d(TAG, "Exception during single product query: " + e.getMessage());
                closeBillingClient();
                pluginCall.reject(e.getMessage());
            }
        } catch (RuntimeException e2) {
            Log.e(TAG, "Failed to initialize billing client: " + e2.getMessage());
            closeBillingClient();
        }
    }

    private void queryProductDetails(List<String> list, final String str, final PluginCall pluginCall) {
        Log.d(TAG, "queryProductDetails() called");
        Log.d(TAG, "Product identifiers count: " + list.size());
        Log.d(TAG, "Product type: " + str);
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            Log.d(TAG, "Product ID: " + it.next());
        }
        ArrayList arrayList = new ArrayList();
        for (String str2 : list) {
            String str3 = "inapp";
            if (!str.equals("inapp")) {
                str3 = "subs";
            }
            Log.d(TAG, "Creating query product: ID='" + str2 + "', Type='" + str3 + "'");
            arrayList.add(QueryProductDetailsParams.Product.newBuilder().setProductId(str2).setProductType(str3).build());
        }
        Log.d(TAG, "Total products in query list: " + arrayList.size());
        QueryProductDetailsParams build = QueryProductDetailsParams.newBuilder().setProductList(arrayList).build();
        Log.d(TAG, "Initializing billing client for product query");
        try {
            initBillingClient(pluginCall);
            try {
                Log.d(TAG, "Querying product details");
                this.billingClient.queryProductDetailsAsync(build, new ProductDetailsResponseListener() { // from class: ee.forgr.nativepurchases.NativePurchasesPlugin.6
                    @Override // com.android.billingclient.api.ProductDetailsResponseListener
                    public void onProductDetailsResponse(BillingResult billingResult, QueryProductDetailsResult queryProductDetailsResult) {
                        boolean z;
                        List<ProductDetails> productDetailsList = queryProductDetailsResult.getProductDetailsList();
                        Log.d(NativePurchasesPlugin.TAG, "onProductDetailsResponse() called for query");
                        Log.d(NativePurchasesPlugin.TAG, "Query result: " + billingResult.getResponseCode() + " - " + billingResult.getDebugMessage());
                        Log.d(NativePurchasesPlugin.TAG, "Product details count: " + productDetailsList.size());
                        if (productDetailsList.isEmpty()) {
                            Log.d(NativePurchasesPlugin.TAG, "No products found in query");
                            Log.d(NativePurchasesPlugin.TAG, "This usually means:");
                            Log.d(NativePurchasesPlugin.TAG, "1. Product doesn't exist in Google Play Console");
                            Log.d(NativePurchasesPlugin.TAG, "2. Product is not published/active");
                            Log.d(NativePurchasesPlugin.TAG, "3. App is not properly configured for the product type");
                            Log.d(NativePurchasesPlugin.TAG, "4. Wrong product ID or type");
                            NativePurchasesPlugin.this.closeBillingClient();
                            pluginCall.reject("Product not found");
                            return;
                        }
                        JSONArray jSONArray = new JSONArray();
                        for (ProductDetails productDetails : productDetailsList) {
                            Log.d(NativePurchasesPlugin.TAG, "Processing product details: " + productDetails.getProductId());
                            JSObject jSObject = new JSObject();
                            jSObject.put(ShareConstants.WEB_DIALOG_PARAM_TITLE, productDetails.getName());
                            jSObject.put("description", productDetails.getDescription());
                            Log.d(NativePurchasesPlugin.TAG, "Product title: " + productDetails.getName());
                            Log.d(NativePurchasesPlugin.TAG, "Product description: " + productDetails.getDescription());
                            if (str.equals("inapp")) {
                                Log.d(NativePurchasesPlugin.TAG, "Processing as in-app product");
                                jSObject.put("identifier", productDetails.getProductId());
                                double priceAmountMicros = ((ProductDetails.OneTimePurchaseOfferDetails) Objects.requireNonNull(productDetails.getOneTimePurchaseOfferDetails())).getPriceAmountMicros() / 1000000.0d;
                                jSObject.put(FirebaseAnalytics.Param.PRICE, priceAmountMicros);
                                jSObject.put("priceString", productDetails.getOneTimePurchaseOfferDetails().getFormattedPrice());
                                jSObject.put("currencyCode", productDetails.getOneTimePurchaseOfferDetails().getPriceCurrencyCode());
                                Log.d(NativePurchasesPlugin.TAG, "Price: " + priceAmountMicros);
                                Log.d(NativePurchasesPlugin.TAG, "Formatted price: " + productDetails.getOneTimePurchaseOfferDetails().getFormattedPrice());
                                Log.d(NativePurchasesPlugin.TAG, "Currency: " + productDetails.getOneTimePurchaseOfferDetails().getPriceCurrencyCode());
                                z = false;
                            } else {
                                Log.d(NativePurchasesPlugin.TAG, "Processing as subscription product");
                                ProductDetails.SubscriptionOfferDetails subscriptionOfferDetails = productDetails.getSubscriptionOfferDetails().get(0);
                                jSObject.put("planIdentifier", productDetails.getProductId());
                                jSObject.put("identifier", subscriptionOfferDetails.getBasePlanId());
                                double priceAmountMicros2 = subscriptionOfferDetails.getPricingPhases().getPricingPhaseList().get(0).getPriceAmountMicros() / 1000000.0d;
                                jSObject.put(FirebaseAnalytics.Param.PRICE, priceAmountMicros2);
                                jSObject.put("priceString", subscriptionOfferDetails.getPricingPhases().getPricingPhaseList().get(0).getFormattedPrice());
                                jSObject.put("currencyCode", subscriptionOfferDetails.getPricingPhases().getPricingPhaseList().get(0).getPriceCurrencyCode());
                                Log.d(NativePurchasesPlugin.TAG, "Plan identifier: " + productDetails.getProductId());
                                Log.d(NativePurchasesPlugin.TAG, "Base plan ID: " + subscriptionOfferDetails.getBasePlanId());
                                Log.d(NativePurchasesPlugin.TAG, "Price: " + priceAmountMicros2);
                                z = false;
                                Log.d(NativePurchasesPlugin.TAG, "Formatted price: " + subscriptionOfferDetails.getPricingPhases().getPricingPhaseList().get(0).getFormattedPrice());
                                Log.d(NativePurchasesPlugin.TAG, "Currency: " + subscriptionOfferDetails.getPricingPhases().getPricingPhaseList().get(0).getPriceCurrencyCode());
                            }
                            jSObject.put("isFamilyShareable", z);
                            jSONArray.put(jSObject);
                        }
                        JSObject jSObject2 = new JSObject();
                        jSObject2.put("products", (Object) jSONArray);
                        Log.d(NativePurchasesPlugin.TAG, "Returning " + jSONArray.length() + " products");
                        NativePurchasesPlugin.this.closeBillingClient();
                        pluginCall.resolve(jSObject2);
                    }
                });
            } catch (Exception e) {
                Log.d(TAG, "Exception during product query: " + e.getMessage());
                closeBillingClient();
                pluginCall.reject(e.getMessage());
            }
        } catch (RuntimeException e2) {
            Log.e(TAG, "Failed to initialize billing client: " + e2.getMessage());
            closeBillingClient();
        }
    }

    @PluginMethod
    public void getProducts(PluginCall pluginCall) {
        Log.d(TAG, "getProducts() called");
        JSArray array = pluginCall.getArray("productIdentifiers");
        String string = pluginCall.getString("productType", "inapp");
        Log.d(TAG, "Product type: " + string);
        Log.d(TAG, "Raw productIdentifiersArray: " + array);
        Log.d(TAG, "productIdentifiersArray length: " + (array != null ? Integer.valueOf(array.length()) : "null"));
        if (array == null || array.length() == 0) {
            Log.d(TAG, "Error: productIdentifiers array missing or empty");
            pluginCall.reject("productIdentifiers array missing");
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < array.length(); i++) {
            String optString = array.optString(i, "");
            Log.d(TAG, "Array index " + i + ": '" + optString + "'");
            arrayList.add(optString);
            Log.d(TAG, "Added product identifier: " + optString);
        }
        Log.d(TAG, "Final productIdentifiers list: " + arrayList.toString());
        queryProductDetails(arrayList, string, pluginCall);
    }

    @PluginMethod
    public void getProduct(PluginCall pluginCall) {
        Log.d(TAG, "getProduct() called");
        String string = pluginCall.getString("productIdentifier");
        String string2 = pluginCall.getString("productType", "inapp");
        Log.d(TAG, "Product identifier: " + string);
        Log.d(TAG, "Product type: " + string2);
        if (string.isEmpty()) {
            Log.d(TAG, "Error: productIdentifier is empty");
            pluginCall.reject("productIdentifier is empty");
        } else {
            querySingleProductDetails(string, string2, pluginCall);
        }
    }

    @PluginMethod
    public void getPurchases(final PluginCall pluginCall) {
        Log.d(TAG, "getPurchases() called");
        String string = pluginCall.getString("productType");
        Log.d(TAG, "Product type filter: " + string);
        String string2 = pluginCall.getString("appAccountToken");
        if (string2 == null || string2.isEmpty()) {
            string2 = null;
        }
        final String str = string2;
        final boolean z = (str == null || str.isEmpty()) ? false : true;
        Log.d(TAG, "Account filter provided: ".concat(z ? "[REDACTED]" : "none"));
        int i = (string == null || string.equals("inapp")) ? 1 : 0;
        int i2 = (string == null || string.equals("subs")) ? 1 : 0;
        if (i == 0 && i2 == 0) {
            Log.d(TAG, "Unknown product type filter provided, returning empty result");
            JSObject jSObject = new JSObject();
            jSObject.put("purchases", (Object) new JSONArray());
            pluginCall.resolve(jSObject);
            return;
        }
        try {
            initBillingClient(pluginCall);
            final JSONArray jSONArray = new JSONArray();
            final AtomicInteger atomicInteger = new AtomicInteger(i + i2);
            final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            final Runnable runnable = new Runnable() { // from class: ee.forgr.nativepurchases.NativePurchasesPlugin$$ExternalSyntheticLambda2
                @Override // java.lang.Runnable
                public final void run() {
                    NativePurchasesPlugin.this.lambda$getPurchases$0(atomicInteger, atomicBoolean, jSONArray, pluginCall);
                }
            };
            if (i != 0) {
                try {
                    Log.d(TAG, "Querying in-app purchases");
                    this.billingClient.queryPurchasesAsync(QueryPurchasesParams.newBuilder().setProductType("inapp").build(), new PurchasesResponseListener() { // from class: ee.forgr.nativepurchases.NativePurchasesPlugin$$ExternalSyntheticLambda3
                        @Override // com.android.billingclient.api.PurchasesResponseListener
                        public final void onQueryPurchasesResponse(BillingResult billingResult, List list) {
                            NativePurchasesPlugin.lambda$getPurchases$1(z, str, jSONArray, runnable, billingResult, list);
                        }
                    });
                } catch (Exception e) {
                    Log.d(TAG, "Exception during getPurchases: " + e.getMessage());
                    atomicBoolean.set(true);
                    closeBillingClient();
                    pluginCall.reject(e.getMessage());
                    return;
                }
            }
            if (i2 != 0) {
                Log.d(TAG, "Querying only subscription purchases");
                this.billingClient.queryPurchasesAsync(QueryPurchasesParams.newBuilder().setProductType("subs").build(), new PurchasesResponseListener() { // from class: ee.forgr.nativepurchases.NativePurchasesPlugin$$ExternalSyntheticLambda4
                    @Override // com.android.billingclient.api.PurchasesResponseListener
                    public final void onQueryPurchasesResponse(BillingResult billingResult, List list) {
                        NativePurchasesPlugin.lambda$getPurchases$2(z, str, jSONArray, runnable, billingResult, list);
                    }
                });
            }
        } catch (RuntimeException e2) {
            Log.e(TAG, "Failed to initialize billing client: " + e2.getMessage());
            closeBillingClient();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$getPurchases$0(AtomicInteger atomicInteger, AtomicBoolean atomicBoolean, JSONArray jSONArray, PluginCall pluginCall) {
        int decrementAndGet = atomicInteger.decrementAndGet();
        Log.d(TAG, "Pending purchase queries remaining: " + decrementAndGet);
        if (decrementAndGet > 0 || !atomicBoolean.compareAndSet(false, true)) {
            return;
        }
        JSObject jSObject = new JSObject();
        jSObject.put("purchases", (Object) jSONArray);
        Log.d(TAG, "Returning " + jSONArray.length() + " purchases");
        closeBillingClient();
        pluginCall.resolve(jSObject);
    }

    static /* synthetic */ void lambda$getPurchases$1(boolean z, String str, JSONArray jSONArray, Runnable runnable, BillingResult billingResult, List list) {
        try {
            Log.d(TAG, "In-app purchases query result: " + billingResult.getResponseCode());
            if (billingResult.getResponseCode() == 0 && list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    Purchase purchase = (Purchase) it.next();
                    Log.d(TAG, "Processing in-app purchase: " + purchase.getOrderId());
                    AccountIdentifiers accountIdentifiers = purchase.getAccountIdentifiers();
                    String obfuscatedAccountId = accountIdentifiers != null ? accountIdentifiers.getObfuscatedAccountId() : null;
                    if (z && (obfuscatedAccountId == null || !obfuscatedAccountId.equals(str))) {
                        Log.d(TAG, "Skipping in-app purchase due to account filter mismatch");
                    } else {
                        JSObject jSObject = new JSObject();
                        jSObject.put("transactionId", purchase.getPurchaseToken());
                        jSObject.put("productIdentifier", purchase.getProducts().isEmpty() ? null : purchase.getProducts().get(0));
                        jSObject.put("purchaseDate", new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'", Locale.US).format(new Date(purchase.getPurchaseTime())));
                        jSObject.put(FirebaseAnalytics.Param.QUANTITY, purchase.getQuantity());
                        jSObject.put("productType", "inapp");
                        jSObject.put("orderId", purchase.getOrderId());
                        jSObject.put("purchaseToken", purchase.getPurchaseToken());
                        jSObject.put("isAcknowledged", purchase.isAcknowledged());
                        jSObject.put("purchaseState", String.valueOf(purchase.getPurchaseState()));
                        jSObject.put("appAccountToken", obfuscatedAccountId);
                        jSObject.put("willCancel", (String) null);
                        synchronized (jSONArray) {
                            jSONArray.put(jSObject);
                        }
                    }
                }
            } else {
                Log.d(TAG, "In-app purchase query failed: " + billingResult.getDebugMessage());
            }
        } catch (Exception e) {
            Log.d(TAG, "Error processing in-app purchase query: " + e.getMessage());
        } finally {
            runnable.run();
        }
    }

    static /* synthetic */ void lambda$getPurchases$2(boolean z, String str, JSONArray jSONArray, Runnable runnable, BillingResult billingResult, List list) {
        try {
            Log.d(TAG, "Subscription purchases query result: " + billingResult.getResponseCode());
            if (billingResult.getResponseCode() == 0 && list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    Purchase purchase = (Purchase) it.next();
                    Log.d(TAG, "Processing subscription purchase: " + purchase.getOrderId());
                    AccountIdentifiers accountIdentifiers = purchase.getAccountIdentifiers();
                    String obfuscatedAccountId = accountIdentifiers != null ? accountIdentifiers.getObfuscatedAccountId() : null;
                    if (z && (obfuscatedAccountId == null || !obfuscatedAccountId.equals(str))) {
                        Log.d(TAG, "Skipping subscription purchase due to account filter mismatch");
                    } else {
                        JSObject jSObject = new JSObject();
                        jSObject.put("transactionId", purchase.getPurchaseToken());
                        jSObject.put("productIdentifier", purchase.getProducts().isEmpty() ? null : purchase.getProducts().get(0));
                        jSObject.put("purchaseDate", new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'", Locale.US).format(new Date(purchase.getPurchaseTime())));
                        jSObject.put(FirebaseAnalytics.Param.QUANTITY, purchase.getQuantity());
                        jSObject.put("productType", "subs");
                        jSObject.put("orderId", purchase.getOrderId());
                        jSObject.put("purchaseToken", purchase.getPurchaseToken());
                        jSObject.put("isAcknowledged", purchase.isAcknowledged());
                        jSObject.put("purchaseState", String.valueOf(purchase.getPurchaseState()));
                        jSObject.put("appAccountToken", obfuscatedAccountId);
                        jSObject.put("willCancel", (String) null);
                        synchronized (jSONArray) {
                            jSONArray.put(jSObject);
                        }
                    }
                }
            } else {
                Log.d(TAG, "Subscription purchase query failed: " + billingResult.getDebugMessage());
            }
        } catch (Exception e) {
            Log.d(TAG, "Error processing subscription purchase query: " + e.getMessage());
        } finally {
            runnable.run();
        }
    }

    @PluginMethod
    public void manageSubscriptions(PluginCall pluginCall) {
        Log.d(TAG, "manageSubscriptions() called");
        try {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(Uri.parse("https://play.google.com/store/account/subscriptions?package=" + getContext().getPackageName()));
            intent.addFlags(268435456);
            getContext().startActivity(intent);
            Log.d(TAG, "manageSubscriptions() opened successfully");
            pluginCall.resolve();
        } catch (Exception e) {
            Log.d(TAG, "manageSubscriptions() error: " + e.getMessage());
            pluginCall.reject("Failed to open subscription management page", e);
        }
    }

    @PluginMethod
    public void acknowledgePurchase(final PluginCall pluginCall) {
        Log.d(TAG, "acknowledgePurchase() called");
        String string = pluginCall.getString("purchaseToken");
        if (string == null || string.isEmpty()) {
            Log.d(TAG, "Error: purchaseToken is empty");
            pluginCall.reject("purchaseToken is required");
            return;
        }
        Log.d(TAG, "Manually acknowledging purchase with token: " + string);
        try {
            initBillingClient(pluginCall);
            try {
                this.billingClient.acknowledgePurchase(AcknowledgePurchaseParams.newBuilder().setPurchaseToken(string).build(), new AcknowledgePurchaseResponseListener() { // from class: ee.forgr.nativepurchases.NativePurchasesPlugin.7
                    @Override // com.android.billingclient.api.AcknowledgePurchaseResponseListener
                    public void onAcknowledgePurchaseResponse(BillingResult billingResult) {
                        Log.d(NativePurchasesPlugin.TAG, "onAcknowledgePurchaseResponse() called");
                        Log.d(NativePurchasesPlugin.TAG, "Acknowledge result: " + billingResult.getResponseCode() + " - " + billingResult.getDebugMessage());
                        if (billingResult.getResponseCode() == 0) {
                            Log.d(NativePurchasesPlugin.TAG, "Purchase acknowledged successfully");
                            NativePurchasesPlugin.this.closeBillingClient();
                            pluginCall.resolve();
                        } else {
                            Log.d(NativePurchasesPlugin.TAG, "Purchase acknowledgment failed");
                            NativePurchasesPlugin.this.closeBillingClient();
                            pluginCall.reject("Failed to acknowledge purchase: " + billingResult.getDebugMessage());
                        }
                    }
                });
            } catch (Exception e) {
                Log.d(TAG, "Exception during acknowledgePurchase: " + e.getMessage());
                closeBillingClient();
                pluginCall.reject(e.getMessage());
            }
        } catch (RuntimeException e2) {
            Log.e(TAG, "Failed to initialize billing client: " + e2.getMessage());
            closeBillingClient();
        }
    }

    @PluginMethod
    public void getAppTransaction(PluginCall pluginCall) {
        Log.d(TAG, "getAppTransaction() called");
        try {
            PackageManager packageManager = getContext().getPackageManager();
            String packageName = getContext().getPackageName();
            PackageInfo packageInfo = Build.VERSION.SDK_INT >= 33 ? packageManager.getPackageInfo(packageName, PackageManager.PackageInfoFlags.of(0L)) : packageManager.getPackageInfo(packageName, 0);
            JSObject jSObject = new JSObject();
            String str = packageInfo.versionName != null ? packageInfo.versionName : "1.0.0";
            jSObject.put("appVersion", str);
            jSObject.put("originalAppVersion", str);
            String format = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'", Locale.US).format(new Date(packageInfo.firstInstallTime));
            jSObject.put("originalPurchaseDate", format);
            jSObject.put("bundleId", packageName);
            jSObject.put("environment", (String) null);
            Log.d(TAG, "App transaction - version: " + str + ", firstInstall: " + format);
            JSObject jSObject2 = new JSObject();
            jSObject2.put("appTransaction", (Object) jSObject);
            pluginCall.resolve(jSObject2);
        } catch (PackageManager.NameNotFoundException e) {
            Log.d(TAG, "getAppTransaction() error: " + e.getMessage());
            pluginCall.reject("Failed to get package info: " + e.getMessage());
        } catch (Exception e2) {
            Log.d(TAG, "getAppTransaction() error: " + e2.getMessage());
            pluginCall.reject("Failed to get app transaction: " + e2.getMessage());
        }
    }

    @PluginMethod
    public void isEntitledToOldBusinessModel(PluginCall pluginCall) {
        Log.d(TAG, "isEntitledToOldBusinessModel() called");
        String string = pluginCall.getString("targetVersion");
        if (string == null || string.isEmpty()) {
            Log.d(TAG, "Error: targetVersion is empty");
            pluginCall.reject("targetVersion is required on Android");
            return;
        }
        try {
            PackageManager packageManager = getContext().getPackageManager();
            String packageName = getContext().getPackageName();
            PackageInfo packageInfo = Build.VERSION.SDK_INT >= 33 ? packageManager.getPackageInfo(packageName, PackageManager.PackageInfoFlags.of(0L)) : packageManager.getPackageInfo(packageName, 0);
            String str = packageInfo.versionName != null ? packageInfo.versionName : "1.0.0";
            boolean z = compareVersions(str, string) < 0;
            Log.d(TAG, "isEntitledToOldBusinessModel - original: " + str + ", target: " + string + ", isOlder: " + z);
            JSObject jSObject = new JSObject();
            jSObject.put("isOlderVersion", z);
            jSObject.put("originalAppVersion", str);
            pluginCall.resolve(jSObject);
        } catch (PackageManager.NameNotFoundException e) {
            Log.d(TAG, "isEntitledToOldBusinessModel() error: " + e.getMessage());
            pluginCall.reject("Failed to get package info: " + e.getMessage());
        } catch (Exception e2) {
            Log.d(TAG, "isEntitledToOldBusinessModel() error: " + e2.getMessage());
            pluginCall.reject("Failed to check business model entitlement: " + e2.getMessage());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0046 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0031 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private int compareVersions(String str, String str2) {
        String replaceAll;
        int parseInt;
        String replaceAll2;
        int parseInt2;
        String[] split = str.split("\\.");
        String[] split2 = str2.split("\\.");
        int max = Math.max(split.length, split2.length);
        for (int i = 0; i < max; i++) {
            if (i < split.length) {
                try {
                    replaceAll = split[i].replaceAll("[^0-9].*", "");
                } catch (NumberFormatException unused) {
                }
                if (!replaceAll.isEmpty()) {
                    parseInt = Integer.parseInt(replaceAll);
                    if (i < split2.length) {
                        try {
                            replaceAll2 = split2[i].replaceAll("[^0-9].*", "");
                        } catch (NumberFormatException unused2) {
                        }
                        if (!replaceAll2.isEmpty()) {
                            parseInt2 = Integer.parseInt(replaceAll2);
                            if (parseInt < parseInt2) {
                                return -1;
                            }
                            if (parseInt > parseInt2) {
                                return 1;
                            }
                        }
                    }
                    parseInt2 = 0;
                    if (parseInt < parseInt2) {
                    }
                }
            }
            parseInt = 0;
            if (i < split2.length) {
            }
            parseInt2 = 0;
            if (parseInt < parseInt2) {
            }
        }
        return 0;
    }
}
