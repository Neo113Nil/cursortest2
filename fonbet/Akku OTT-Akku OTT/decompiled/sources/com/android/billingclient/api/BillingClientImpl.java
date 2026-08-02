package com.android.billingclient.api;

import android.R;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.ResultReceiver;
import android.text.TextUtils;
import android.view.View;
import androidx.annotation.AnyThread;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.core.app.BundleCompat;
import com.android.billingclient.api.BillingClient;
import com.android.billingclient.api.BillingFlowParams;
import com.android.billingclient.api.ProductDetails;
import com.android.billingclient.api.QueryProductDetailsParams;
import com.android.billingclient.ktx.BuildConfig;
import com.google.android.gms.internal.play_billing.zzev;
import com.google.android.gms.internal.play_billing.zzfb;
import com.google.android.gms.internal.play_billing.zzfm;
import com.google.android.gms.internal.play_billing.zzfn;
import com.google.android.gms.internal.play_billing.zzjx;
import com.google.android.gms.internal.play_billing.zzjz;
import com.google.android.gms.internal.play_billing.zzkb;
import com.google.android.gms.internal.play_billing.zzkd;
import com.google.android.gms.internal.play_billing.zzke;
import com.google.android.gms.internal.play_billing.zzkg;
import com.google.android.gms.internal.play_billing.zzki;
import com.google.android.gms.internal.play_billing.zzks;
import com.google.android.gms.internal.play_billing.zzku;
import com.google.android.gms.internal.play_billing.zzky;
import com.google.android.gms.internal.play_billing.zzlb;
import com.google.android.gms.internal.play_billing.zzlv;
import com.google.android.gms.internal.play_billing.zzlx;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.function.Function;
import java.util.function.Predicate;
import okhttp3.internal.http.HttpStatusCodesKt;
import org.json.JSONException;

/* loaded from: classes3.dex */
class BillingClientImpl extends BillingClient {
    private boolean zzA;

    @Nullable
    private PendingPurchasesParams zzB;
    private boolean zzC;
    private ExecutorService zzD;
    private volatile zzev zzE;
    private final Long zzF;
    private final Object zza;
    private volatile int zzb;
    private final String zzc;
    private final Handler zzd;

    @Nullable
    private volatile zzn zze;
    private Context zzf;
    private zzch zzg;
    private volatile com.google.android.gms.internal.play_billing.zzan zzh;
    private volatile zzba zzi;
    private boolean zzj;
    private boolean zzk;
    private int zzl;
    private boolean zzm;
    private boolean zzn;
    private boolean zzo;
    private boolean zzp;
    private boolean zzq;
    private boolean zzr;
    private boolean zzs;
    private boolean zzt;
    private boolean zzu;
    private boolean zzv;
    private boolean zzw;
    private boolean zzx;
    private boolean zzy;
    private boolean zzz;

    private BillingClientImpl(Activity activity, PendingPurchasesParams pendingPurchasesParams, String str) {
        this(activity.getApplicationContext(), pendingPurchasesParams, new zzbm(), str, null, null, null, null);
    }

    private void initialize(Context context, PurchasesUpdatedListener purchasesUpdatedListener, PendingPurchasesParams pendingPurchasesParams, @Nullable zzb zzbVar, String str, @Nullable zzch zzchVar) {
        this.zzf = context.getApplicationContext();
        zzks zzc = zzku.zzc();
        zzc.zzo(str);
        zzc.zzn(this.zzf.getPackageName());
        zzc.zzm(this.zzF.longValue());
        if (zzchVar != null) {
            this.zzg = zzchVar;
        } else {
            this.zzg = new zzcl(this.zzf, (zzku) zzc.zzf());
        }
        if (purchasesUpdatedListener == null) {
            com.google.android.gms.internal.play_billing.zze.zzl("BillingClient", "Billing client should have a valid listener but the provided is null.");
        }
        this.zze = new zzn(this.zzf, purchasesUpdatedListener, null, zzbVar, null, this.zzg);
        this.zzB = pendingPurchasesParams;
        this.zzC = zzbVar != null;
        this.zzf.getPackageName();
    }

    private int launchBillingFlowCpp(Activity activity, BillingFlowParams billingFlowParams) {
        return launchBillingFlow(activity, billingFlowParams).getResponseCode();
    }

    private void startConnection(long j) {
        startConnection(new zzbm(j));
    }

    @Nullable
    public static Future zzE(Callable callable, long j, @Nullable final Runnable runnable, Handler handler, ExecutorService executorService) {
        try {
            final Future submit = executorService.submit(callable);
            handler.postDelayed(new Runnable() { // from class: com.android.billingclient.api.zzaf
                @Override // java.lang.Runnable
                public final void run() {
                    Future future = submit;
                    if (future.isDone() || future.isCancelled()) {
                        return;
                    }
                    Runnable runnable2 = runnable;
                    future.cancel(true);
                    com.google.android.gms.internal.play_billing.zze.zzl("BillingClient", "Async task is taking too long, cancel it!");
                    if (runnable2 != null) {
                        runnable2.run();
                    }
                }
            }, (long) (j * 0.95d));
            return submit;
        } catch (Exception e) {
            com.google.android.gms.internal.play_billing.zze.zzm("BillingClient", "Async task throws exception!", e);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final BillingResult zzaA() {
        int[] iArr = {0, 3};
        synchronized (this.zza) {
            for (int i = 0; i < 2; i++) {
                if (this.zzb == iArr[i]) {
                    return zzcj.zzm;
                }
            }
            return zzcj.zzk;
        }
    }

    private final String zzaB(QueryProductDetailsParams queryProductDetailsParams) {
        if (TextUtils.isEmpty(null)) {
            return this.zzf.getPackageName();
        }
        return null;
    }

    @SuppressLint({"PrivateApi"})
    private static String zzaC() {
        try {
            return (String) BuildConfig.class.getField("VERSION_NAME").get(null);
        } catch (Exception unused) {
            return com.android.billingclient.BuildConfig.VERSION_NAME;
        }
    }

    private final synchronized ExecutorService zzaD() {
        try {
            if (this.zzD == null) {
                this.zzD = Executors.newFixedThreadPool(com.google.android.gms.internal.play_billing.zze.zza, new zzas(this));
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.zzD;
    }

    /* JADX WARN: Finally extract failed */
    private final void zzaE(ConsumeParams consumeParams, ConsumeResponseListener consumeResponseListener) {
        com.google.android.gms.internal.play_billing.zzan zzanVar;
        int zza;
        String str;
        String purchaseToken = consumeParams.getPurchaseToken();
        try {
            com.google.android.gms.internal.play_billing.zze.zzk("BillingClient", "Consuming purchase with token: " + purchaseToken);
            synchronized (this.zza) {
                try {
                    try {
                        zzanVar = this.zzh;
                    } catch (Throwable th) {
                        th = th;
                        while (true) {
                            try {
                                throw th;
                            } catch (Throwable th2) {
                                th = th2;
                            }
                        }
                    }
                } catch (DeadObjectException e) {
                    e = e;
                    zzaW(consumeResponseListener, purchaseToken, zzcj.zzm, 29, "Error consuming purchase!", e);
                    return;
                } catch (Exception e2) {
                    e = e2;
                    zzaW(consumeResponseListener, purchaseToken, zzcj.zzk, 29, "Error consuming purchase!", e);
                    return;
                }
            }
            if (zzanVar == null) {
                try {
                    zzaW(consumeResponseListener, purchaseToken, zzcj.zzm, 119, "Service has been reset to null.", null);
                    return;
                } catch (DeadObjectException e3) {
                    e = e3;
                    zzaW(consumeResponseListener, purchaseToken, zzcj.zzm, 29, "Error consuming purchase!", e);
                    return;
                } catch (Exception e4) {
                    e = e4;
                    zzaW(consumeResponseListener, purchaseToken, zzcj.zzk, 29, "Error consuming purchase!", e);
                    return;
                }
            }
            if (this.zzo) {
                String packageName = this.zzf.getPackageName();
                boolean z = this.zzo;
                String str2 = this.zzc;
                long longValue = this.zzF.longValue();
                Bundle bundle = new Bundle();
                if (z) {
                    com.google.android.gms.internal.play_billing.zze.zzc(bundle, str2, longValue);
                }
                Bundle zze = zzanVar.zze(9, packageName, purchaseToken, bundle);
                zza = zze.getInt("RESPONSE_CODE");
                str = com.google.android.gms.internal.play_billing.zze.zzh(zze, "BillingClient");
            } else {
                zza = zzanVar.zza(3, this.zzf.getPackageName(), purchaseToken);
                str = "";
            }
            BillingResult zza2 = zzcj.zza(zza, str);
            if (zza == 0) {
                com.google.android.gms.internal.play_billing.zze.zzk("BillingClient", "Successfully consumed purchase.");
                consumeResponseListener.onConsumeResponse(zza2, purchaseToken);
            } else {
                zzaW(consumeResponseListener, purchaseToken, zza2, 23, "Error consuming purchase with token. Response code: " + zza, null);
            }
        } catch (DeadObjectException e5) {
            e = e5;
        } catch (Exception e6) {
            e = e6;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzaF(zzjz zzjzVar) {
        try {
            this.zzg.zzb(zzjzVar, this.zzl);
        } catch (Throwable th) {
            com.google.android.gms.internal.play_billing.zze.zzm("BillingClient", "Unable to log.", th);
        }
    }

    private final void zzaG(zzkd zzkdVar) {
        try {
            this.zzg.zzd(zzkdVar, this.zzl);
        } catch (Throwable th) {
            com.google.android.gms.internal.play_billing.zze.zzm("BillingClient", "Unable to log.", th);
        }
    }

    private final void zzaH(String str, final PurchaseHistoryResponseListener purchaseHistoryResponseListener) {
        if (!isReady()) {
            BillingResult billingResult = zzcj.zzm;
            zzbe(2, 11, billingResult);
            purchaseHistoryResponseListener.onPurchaseHistoryResponse(billingResult, null);
        } else if (zzE(new zzau(this, str, purchaseHistoryResponseListener), 30000L, new Runnable() { // from class: com.android.billingclient.api.zzal
            @Override // java.lang.Runnable
            public final void run() {
                BillingClientImpl.this.zzak(purchaseHistoryResponseListener);
            }
        }, zzax(), zzaD()) == null) {
            BillingResult zzaA = zzaA();
            zzbe(25, 11, zzaA);
            purchaseHistoryResponseListener.onPurchaseHistoryResponse(zzaA, null);
        }
    }

    private final void zzaI(String str, final PurchasesResponseListener purchasesResponseListener) {
        if (!isReady()) {
            BillingResult billingResult = zzcj.zzm;
            zzbe(2, 9, billingResult);
            purchasesResponseListener.onQueryPurchasesResponse(billingResult, com.google.android.gms.internal.play_billing.zzco.zzl());
        } else {
            if (TextUtils.isEmpty(str)) {
                com.google.android.gms.internal.play_billing.zze.zzl("BillingClient", "Please provide a valid product type.");
                BillingResult billingResult2 = zzcj.zzh;
                zzbe(50, 9, billingResult2);
                purchasesResponseListener.onQueryPurchasesResponse(billingResult2, com.google.android.gms.internal.play_billing.zzco.zzl());
                return;
            }
            if (zzE(new zzat(this, str, purchasesResponseListener), 30000L, new Runnable() { // from class: com.android.billingclient.api.zzac
                @Override // java.lang.Runnable
                public final void run() {
                    BillingClientImpl.this.zzal(purchasesResponseListener);
                }
            }, zzax(), zzaD()) == null) {
                BillingResult zzaA = zzaA();
                zzbe(25, 9, zzaA);
                purchasesResponseListener.onQueryPurchasesResponse(zzaA, com.google.android.gms.internal.play_billing.zzco.zzl());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzaJ(int i) {
        synchronized (this.zza) {
            try {
                if (this.zzb == 3) {
                    return;
                }
                com.google.android.gms.internal.play_billing.zze.zzk("BillingClient", "Setting clientState from " + zzaN(this.zzb) + " to " + zzaN(i));
                this.zzb = i;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final synchronized void zzaK() {
        ExecutorService executorService = this.zzD;
        if (executorService != null) {
            executorService.shutdownNow();
            this.zzD = null;
            this.zzE = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void zzaL() {
        synchronized (this.zza) {
            if (this.zzi != null) {
                try {
                    this.zzf.unbindService(this.zzi);
                } catch (Throwable th) {
                    try {
                        com.google.android.gms.internal.play_billing.zze.zzm("BillingClient", "There was an exception while unbinding service!", th);
                        this.zzh = null;
                        this.zzi = null;
                    } finally {
                        this.zzh = null;
                        this.zzi = null;
                    }
                }
            }
        }
    }

    private final boolean zzaM() {
        return this.zzw && this.zzB.isEnabledForPrepaidPlans();
    }

    private static final String zzaN(int i) {
        return i != 0 ? i != 1 ? i != 2 ? "CLOSED" : "CONNECTED" : "CONNECTING" : "DISCONNECTED";
    }

    private final zzbj zzaO(BillingResult billingResult, int i, String str, @Nullable Exception exc) {
        com.google.android.gms.internal.play_billing.zze.zzm("BillingClient", str, exc);
        zzbf(i, 7, billingResult, zzcg.zza(exc));
        return new zzbj(billingResult.getResponseCode(), billingResult.getDebugMessage(), new ArrayList());
    }

    private final zzbk zzaP(BillingResult billingResult, int i, String str, @Nullable Exception exc) {
        com.google.android.gms.internal.play_billing.zze.zzm("BillingClient", str, exc);
        zzbf(i, 11, billingResult, zzcg.zza(exc));
        return new zzbk(billingResult, null);
    }

    private final zzcv zzaQ(int i, BillingResult billingResult, int i2, String str, @Nullable Exception exc) {
        zzbf(i2, 9, billingResult, zzcg.zza(exc));
        com.google.android.gms.internal.play_billing.zze.zzm("BillingClient", str, exc);
        return new zzcv(billingResult, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final zzcv zzaR(String str, int i) {
        com.google.android.gms.internal.play_billing.zzan zzanVar;
        BillingClientImpl billingClientImpl = this;
        com.google.android.gms.internal.play_billing.zze.zzk("BillingClient", "Querying owned items, item type: ".concat(String.valueOf(str)));
        ArrayList arrayList = new ArrayList();
        Bundle zzd = com.google.android.gms.internal.play_billing.zze.zzd(billingClientImpl.zzo, billingClientImpl.zzw, billingClientImpl.zzB.isEnabledForOneTimeProducts(), billingClientImpl.zzB.isEnabledForPrepaidPlans(), billingClientImpl.zzc, billingClientImpl.zzF.longValue());
        String str2 = null;
        do {
            try {
                synchronized (billingClientImpl.zza) {
                    zzanVar = billingClientImpl.zzh;
                }
                if (zzanVar == null) {
                    return billingClientImpl.zzaQ(9, zzcj.zzm, 119, "Service has been reset to null", null);
                }
                Bundle zzj = billingClientImpl.zzo ? zzanVar.zzj(true != billingClientImpl.zzw ? 9 : 19, billingClientImpl.zzf.getPackageName(), str, str2, zzd) : zzanVar.zzi(3, billingClientImpl.zzf.getPackageName(), str, str2);
                zzcx zza = zzcy.zza(zzj, "BillingClient", "getPurchase()");
                BillingResult zza2 = zza.zza();
                if (zza2 != zzcj.zzl) {
                    return billingClientImpl.zzaQ(9, zza2, zza.zzb(), "Purchase bundle invalid", null);
                }
                ArrayList<String> stringArrayList = zzj.getStringArrayList("INAPP_PURCHASE_ITEM_LIST");
                ArrayList<String> stringArrayList2 = zzj.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
                ArrayList<String> stringArrayList3 = zzj.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
                boolean z = false;
                for (int i2 = 0; i2 < stringArrayList2.size(); i2++) {
                    String str3 = stringArrayList2.get(i2);
                    String str4 = stringArrayList3.get(i2);
                    com.google.android.gms.internal.play_billing.zze.zzk("BillingClient", "Sku is owned: ".concat(String.valueOf(stringArrayList.get(i2))));
                    try {
                        Purchase purchase = new Purchase(str3, str4);
                        if (TextUtils.isEmpty(purchase.getPurchaseToken())) {
                            com.google.android.gms.internal.play_billing.zze.zzl("BillingClient", "BUG: empty/null token!");
                            z = true;
                        }
                        arrayList.add(purchase);
                    } catch (JSONException e) {
                        return zzaQ(9, zzcj.zzk, 51, "Got an exception trying to decode the purchase!", e);
                    }
                }
                billingClientImpl = this;
                if (z) {
                    billingClientImpl.zzbe(26, 9, zzcj.zzk);
                }
                str2 = zzj.getString("INAPP_CONTINUATION_TOKEN");
                com.google.android.gms.internal.play_billing.zze.zzk("BillingClient", "Continuation token: ".concat(String.valueOf(str2)));
            } catch (DeadObjectException e2) {
                return zzaQ(9, zzcj.zzm, 52, "Got exception trying to get purchases try to reconnect", e2);
            } catch (Exception e3) {
                return billingClientImpl.zzaQ(9, zzcj.zzk, 52, "Got exception trying to get purchases try to reconnect", e3);
            }
        } while (!TextUtils.isEmpty(str2));
        return new zzcv(zzcj.zzl, arrayList);
    }

    private final zzdc zzaS(BillingResult billingResult, int i, String str, @Nullable Exception exc) {
        com.google.android.gms.internal.play_billing.zze.zzm("BillingClient", str, exc);
        zzbf(i, 8, billingResult, zzcg.zza(exc));
        return new zzdc(billingResult.getResponseCode(), billingResult.getDebugMessage(), null);
    }

    private final void zzaT(BillingResult billingResult, int i, int i2) {
        zzkd zzkdVar = null;
        zzjz zzjzVar = null;
        if (billingResult.getResponseCode() == 0) {
            int i3 = zzcg.zza;
            try {
                zzkb zzc = zzkd.zzc();
                zzc.zzn(5);
                zzky zzc2 = zzlb.zzc();
                zzc2.zza(i2);
                zzc.zza((zzlb) zzc2.zzf());
                zzkdVar = (zzkd) zzc.zzf();
            } catch (Exception e) {
                com.google.android.gms.internal.play_billing.zze.zzm("BillingLogger", "Unable to create logging payload", e);
            }
            zzaG(zzkdVar);
            return;
        }
        int i4 = zzcg.zza;
        try {
            zzjx zzc3 = zzjz.zzc();
            zzke zzc4 = zzki.zzc();
            zzc4.zzn(billingResult.getResponseCode());
            zzc4.zzm(billingResult.getDebugMessage());
            zzc4.zzo(i);
            zzc3.zza(zzc4);
            zzc3.zzn(5);
            zzky zzc5 = zzlb.zzc();
            zzc5.zza(i2);
            zzc3.zzm((zzlb) zzc5.zzf());
            zzjzVar = (zzjz) zzc3.zzf();
        } catch (Exception e2) {
            com.google.android.gms.internal.play_billing.zze.zzm("BillingLogger", "Unable to create logging payload", e2);
        }
        zzaF(zzjzVar);
    }

    private final void zzaU(AcknowledgePurchaseResponseListener acknowledgePurchaseResponseListener, BillingResult billingResult, int i, @Nullable Exception exc) {
        com.google.android.gms.internal.play_billing.zze.zzm("BillingClient", "Error in acknowledge purchase!", exc);
        zzbf(i, 3, billingResult, zzcg.zza(exc));
        acknowledgePurchaseResponseListener.onAcknowledgePurchaseResponse(billingResult);
    }

    private final void zzaV(AlternativeBillingOnlyAvailabilityListener alternativeBillingOnlyAvailabilityListener, BillingResult billingResult, int i, @Nullable Exception exc) {
        zzbf(i, 14, billingResult, zzcg.zza(exc));
        alternativeBillingOnlyAvailabilityListener.onAlternativeBillingOnlyAvailabilityResponse(billingResult);
    }

    private final void zzaW(ConsumeResponseListener consumeResponseListener, String str, BillingResult billingResult, int i, String str2, @Nullable Exception exc) {
        com.google.android.gms.internal.play_billing.zze.zzm("BillingClient", str2, exc);
        zzbf(i, 4, billingResult, zzcg.zza(exc));
        consumeResponseListener.onConsumeResponse(billingResult, str);
    }

    private final void zzaX(AlternativeBillingOnlyReportingDetailsListener alternativeBillingOnlyReportingDetailsListener, BillingResult billingResult, int i, @Nullable Exception exc) {
        zzbf(i, 15, billingResult, zzcg.zza(exc));
        alternativeBillingOnlyReportingDetailsListener.onAlternativeBillingOnlyTokenResponse(billingResult, null);
    }

    private final void zzaY(ExternalOfferReportingDetailsListener externalOfferReportingDetailsListener, BillingResult billingResult, int i, @Nullable Exception exc) {
        zzbf(i, 24, billingResult, zzcg.zza(exc));
        externalOfferReportingDetailsListener.onExternalOfferReportingDetailsResponse(billingResult, null);
    }

    private final void zzaZ(ExternalOfferAvailabilityListener externalOfferAvailabilityListener, BillingResult billingResult, int i, @Nullable Exception exc) {
        zzbf(i, 23, billingResult, zzcg.zza(exc));
        externalOfferAvailabilityListener.onExternalOfferAvailabilityResponse(billingResult);
    }

    public static /* bridge */ /* synthetic */ boolean zzaq(BillingClientImpl billingClientImpl) {
        boolean z;
        synchronized (billingClientImpl.zza) {
            z = true;
            if (billingClientImpl.zzb != 1) {
                z = false;
            }
        }
        return z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Handler zzax() {
        return Looper.myLooper() == null ? this.zzd : new Handler(Looper.myLooper());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final zzbk zzay(String str) {
        com.google.android.gms.internal.play_billing.zzan zzanVar;
        com.google.android.gms.internal.play_billing.zze.zzk("BillingClient", "Querying purchase history, item type: ".concat(String.valueOf(str)));
        ArrayList arrayList = new ArrayList();
        Bundle zzd = com.google.android.gms.internal.play_billing.zze.zzd(this.zzo, this.zzw, this.zzB.isEnabledForOneTimeProducts(), this.zzB.isEnabledForPrepaidPlans(), this.zzc, this.zzF.longValue());
        String str2 = null;
        while (this.zzm) {
            try {
                synchronized (this.zza) {
                    zzanVar = this.zzh;
                }
                if (zzanVar == null) {
                    return zzaP(zzcj.zzm, 119, "Service reset to null", null);
                }
                Bundle zzh = zzanVar.zzh(6, this.zzf.getPackageName(), str, str2, zzd);
                zzcx zza = zzcy.zza(zzh, "BillingClient", "getPurchaseHistory()");
                BillingResult zza2 = zza.zza();
                if (zza2 != zzcj.zzl) {
                    zzbe(zza.zzb(), 11, zza2);
                    return new zzbk(zza2, null);
                }
                ArrayList<String> stringArrayList = zzh.getStringArrayList("INAPP_PURCHASE_ITEM_LIST");
                ArrayList<String> stringArrayList2 = zzh.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
                ArrayList<String> stringArrayList3 = zzh.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
                boolean z = false;
                for (int i = 0; i < stringArrayList2.size(); i++) {
                    String str3 = stringArrayList2.get(i);
                    String str4 = stringArrayList3.get(i);
                    com.google.android.gms.internal.play_billing.zze.zzk("BillingClient", "Purchase record found for sku : ".concat(String.valueOf(stringArrayList.get(i))));
                    try {
                        PurchaseHistoryRecord purchaseHistoryRecord = new PurchaseHistoryRecord(str3, str4);
                        if (TextUtils.isEmpty(purchaseHistoryRecord.getPurchaseToken())) {
                            com.google.android.gms.internal.play_billing.zze.zzl("BillingClient", "BUG: empty/null token!");
                            z = true;
                        }
                        arrayList.add(purchaseHistoryRecord);
                    } catch (JSONException e) {
                        return zzaP(zzcj.zzk, 51, "Got an exception trying to decode the purchase!", e);
                    }
                }
                if (z) {
                    zzbe(26, 11, zzcj.zzk);
                }
                str2 = zzh.getString("INAPP_CONTINUATION_TOKEN");
                com.google.android.gms.internal.play_billing.zze.zzk("BillingClient", "Continuation token: ".concat(String.valueOf(str2)));
                if (TextUtils.isEmpty(str2)) {
                    return new zzbk(zzcj.zzl, arrayList);
                }
            } catch (DeadObjectException e2) {
                return zzaP(zzcj.zzm, 59, "Got exception trying to get purchase history", e2);
            } catch (Exception e3) {
                return zzaP(zzcj.zzk, 59, "Got exception trying to get purchase history", e3);
            }
        }
        com.google.android.gms.internal.play_billing.zze.zzl("BillingClient", "getPurchaseHistory is not supported on current device");
        return new zzbk(zzcj.zzq, null);
    }

    private final BillingResult zzaz() {
        com.google.android.gms.internal.play_billing.zze.zzk("BillingClient", "Service connection is valid. No need to re-initialize.");
        zzkb zzc = zzkd.zzc();
        zzc.zzn(6);
        zzlv zzc2 = zzlx.zzc();
        zzc2.zza(true);
        zzc.zzm(zzc2);
        zzaG((zzkd) zzc.zzf());
        return zzcj.zzl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzba(ExternalOfferInformationDialogListener externalOfferInformationDialogListener, BillingResult billingResult, int i, @Nullable Exception exc) {
        zzbf(i, 25, billingResult, zzcg.zza(exc));
        externalOfferInformationDialogListener.onExternalOfferInformationDialogResponse(billingResult);
    }

    private final void zzbb(BillingConfigResponseListener billingConfigResponseListener, BillingResult billingResult, int i, @Nullable Exception exc) {
        com.google.android.gms.internal.play_billing.zze.zzm("BillingClient", "getBillingConfig got an exception.", exc);
        zzbf(i, 13, billingResult, zzcg.zza(exc));
        billingConfigResponseListener.onBillingConfigResponse(billingResult, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzbc(AlternativeBillingOnlyInformationDialogListener alternativeBillingOnlyInformationDialogListener, BillingResult billingResult, int i, @Nullable Exception exc) {
        zzbf(i, 16, billingResult, zzcg.zza(exc));
        alternativeBillingOnlyInformationDialogListener.onAlternativeBillingOnlyInformationDialogResponse(billingResult);
    }

    private final void zzbd(int i, int i2, @Nullable Exception exc) {
        zzjz zzjzVar;
        com.google.android.gms.internal.play_billing.zze.zzm("BillingClient", "showInAppMessages error.", exc);
        zzch zzchVar = this.zzg;
        String zza = zzcg.zza(exc);
        try {
            zzke zzc = zzki.zzc();
            zzc.zzn(i);
            zzc.zzo(i2);
            if (zza != null) {
                zzc.zza(zza);
            }
            zzjx zzc2 = zzjz.zzc();
            zzc2.zza(zzc);
            zzc2.zzn(30);
            zzjzVar = (zzjz) zzc2.zzf();
        } catch (Throwable th) {
            com.google.android.gms.internal.play_billing.zze.zzm("BillingLogger", "Unable to create logging payload", th);
            zzjzVar = null;
        }
        zzchVar.zza(zzjzVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void zzbe(int i, int i2, BillingResult billingResult) {
        try {
            zzaF(zzcg.zzb(i, i2, billingResult));
        } catch (Throwable th) {
            com.google.android.gms.internal.play_billing.zze.zzm("BillingClient", "Unable to log.", th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzbf(int i, int i2, BillingResult billingResult, @Nullable String str) {
        try {
            zzaF(zzcg.zzc(i, i2, billingResult, str));
        } catch (Throwable th) {
            com.google.android.gms.internal.play_billing.zze.zzm("BillingClient", "Unable to log.", th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void zzbg(int i) {
        try {
            zzaG(zzcg.zzd(i));
        } catch (Throwable th) {
            com.google.android.gms.internal.play_billing.zze.zzm("BillingClient", "Unable to log.", th);
        }
    }

    @Override // com.android.billingclient.api.BillingClient
    public void acknowledgePurchase(final AcknowledgePurchaseParams acknowledgePurchaseParams, final AcknowledgePurchaseResponseListener acknowledgePurchaseResponseListener) {
        if (!isReady()) {
            BillingResult billingResult = zzcj.zzm;
            zzbe(2, 3, billingResult);
            acknowledgePurchaseResponseListener.onAcknowledgePurchaseResponse(billingResult);
            return;
        }
        if (TextUtils.isEmpty(acknowledgePurchaseParams.getPurchaseToken())) {
            com.google.android.gms.internal.play_billing.zze.zzl("BillingClient", "Please provide a valid purchase token.");
            BillingResult billingResult2 = zzcj.zzj;
            zzbe(26, 3, billingResult2);
            acknowledgePurchaseResponseListener.onAcknowledgePurchaseResponse(billingResult2);
            return;
        }
        if (!this.zzo) {
            BillingResult billingResult3 = zzcj.zzb;
            zzbe(27, 3, billingResult3);
            acknowledgePurchaseResponseListener.onAcknowledgePurchaseResponse(billingResult3);
        } else if (zzE(new Callable() { // from class: com.android.billingclient.api.zzt
            @Override // java.util.concurrent.Callable
            public final Object call() {
                BillingClientImpl.this.zzs(acknowledgePurchaseResponseListener, acknowledgePurchaseParams);
                return null;
            }
        }, 30000L, new Runnable() { // from class: com.android.billingclient.api.zzu
            @Override // java.lang.Runnable
            public final void run() {
                BillingClientImpl.this.zzab(acknowledgePurchaseResponseListener);
            }
        }, zzax(), zzaD()) == null) {
            BillingResult zzaA = zzaA();
            zzbe(25, 3, zzaA);
            acknowledgePurchaseResponseListener.onAcknowledgePurchaseResponse(zzaA);
        }
    }

    @Override // com.android.billingclient.api.BillingClient
    public void consumeAsync(final ConsumeParams consumeParams, final ConsumeResponseListener consumeResponseListener) {
        if (!isReady()) {
            BillingResult billingResult = zzcj.zzm;
            zzbe(2, 4, billingResult);
            consumeResponseListener.onConsumeResponse(billingResult, consumeParams.getPurchaseToken());
        } else if (zzE(new Callable() { // from class: com.android.billingclient.api.zzag
            @Override // java.util.concurrent.Callable
            public final Object call() {
                BillingClientImpl.this.zzt(consumeParams, consumeResponseListener);
                return null;
            }
        }, 30000L, new Runnable() { // from class: com.android.billingclient.api.zzah
            @Override // java.lang.Runnable
            public final void run() {
                BillingClientImpl.this.zzad(consumeResponseListener, consumeParams);
            }
        }, zzax(), zzaD()) == null) {
            BillingResult zzaA = zzaA();
            zzbe(25, 4, zzaA);
            consumeResponseListener.onConsumeResponse(zzaA, consumeParams.getPurchaseToken());
        }
    }

    @Override // com.android.billingclient.api.BillingClient
    @zzf
    public void createAlternativeBillingOnlyReportingDetailsAsync(final AlternativeBillingOnlyReportingDetailsListener alternativeBillingOnlyReportingDetailsListener) {
        if (!isReady()) {
            zzaX(alternativeBillingOnlyReportingDetailsListener, zzcj.zzm, 2, null);
            return;
        }
        if (!this.zzy) {
            com.google.android.gms.internal.play_billing.zze.zzl("BillingClient", "Current client doesn't support alternative billing only.");
            zzaX(alternativeBillingOnlyReportingDetailsListener, zzcj.zzE, 66, null);
        } else if (zzE(new Callable() { // from class: com.android.billingclient.api.zzx
            @Override // java.util.concurrent.Callable
            public final Object call() {
                BillingClientImpl.this.zzx(alternativeBillingOnlyReportingDetailsListener);
                return null;
            }
        }, 30000L, new Runnable() { // from class: com.android.billingclient.api.zzy
            @Override // java.lang.Runnable
            public final void run() {
                BillingClientImpl.this.zzae(alternativeBillingOnlyReportingDetailsListener);
            }
        }, zzax(), zzaD()) == null) {
            zzaX(alternativeBillingOnlyReportingDetailsListener, zzaA(), 25, null);
        }
    }

    @Override // com.android.billingclient.api.BillingClient
    @zzg
    public void createExternalOfferReportingDetailsAsync(final ExternalOfferReportingDetailsListener externalOfferReportingDetailsListener) {
        if (!isReady()) {
            zzaY(externalOfferReportingDetailsListener, zzcj.zzm, 2, null);
            return;
        }
        if (!this.zzz) {
            com.google.android.gms.internal.play_billing.zze.zzl("BillingClient", "Current client doesn't support external offer.");
            zzaY(externalOfferReportingDetailsListener, zzcj.zzx, HttpStatusCodesKt.HTTP_EARLY_HINTS, null);
        } else if (zzE(new Callable() { // from class: com.android.billingclient.api.zzaa
            @Override // java.util.concurrent.Callable
            public final Object call() {
                BillingClientImpl.this.zzy(externalOfferReportingDetailsListener);
                return null;
            }
        }, 30000L, new Runnable() { // from class: com.android.billingclient.api.zzaj
            @Override // java.lang.Runnable
            public final void run() {
                BillingClientImpl.this.zzaf(externalOfferReportingDetailsListener);
            }
        }, zzax(), zzaD()) == null) {
            zzaY(externalOfferReportingDetailsListener, zzaA(), 25, null);
        }
    }

    @Override // com.android.billingclient.api.BillingClient
    public void endConnection() {
        zzbg(12);
        synchronized (this.zza) {
            try {
                if (this.zze != null) {
                    this.zze.zzf();
                }
            } finally {
                com.google.android.gms.internal.play_billing.zze.zzk("BillingClient", "Unbinding from service.");
                zzaL();
                zzaK();
            }
            try {
                com.google.android.gms.internal.play_billing.zze.zzk("BillingClient", "Unbinding from service.");
                zzaL();
            } catch (Throwable th) {
                com.google.android.gms.internal.play_billing.zze.zzm("BillingClient", "There was an exception while unbinding from the service while ending connection!", th);
            }
            try {
                zzaK();
            } finally {
                try {
                } finally {
                }
            }
        }
    }

    @Override // com.android.billingclient.api.BillingClient
    @zzh
    public void getBillingConfigAsync(GetBillingConfigParams getBillingConfigParams, final BillingConfigResponseListener billingConfigResponseListener) {
        if (!isReady()) {
            com.google.android.gms.internal.play_billing.zze.zzl("BillingClient", "Service disconnected.");
            BillingResult billingResult = zzcj.zzm;
            zzbe(2, 13, billingResult);
            billingConfigResponseListener.onBillingConfigResponse(billingResult, null);
            return;
        }
        if (!this.zzv) {
            com.google.android.gms.internal.play_billing.zze.zzl("BillingClient", "Current client doesn't support get billing config.");
            BillingResult billingResult2 = zzcj.zzA;
            zzbe(32, 13, billingResult2);
            billingConfigResponseListener.onBillingConfigResponse(billingResult2, null);
            return;
        }
        if (zzE(new Callable() { // from class: com.android.billingclient.api.zzv
            @Override // java.util.concurrent.Callable
            public final Object call() {
                BillingClientImpl.this.zzu(billingConfigResponseListener);
                return null;
            }
        }, 30000L, new Runnable() { // from class: com.android.billingclient.api.zzw
            @Override // java.lang.Runnable
            public final void run() {
                BillingClientImpl.this.zzag(billingConfigResponseListener);
            }
        }, zzax(), zzaD()) == null) {
            BillingResult zzaA = zzaA();
            zzbe(25, 13, zzaA);
            billingConfigResponseListener.onBillingConfigResponse(zzaA, null);
        }
    }

    @Override // com.android.billingclient.api.BillingClient
    public final int getConnectionState() {
        int i;
        synchronized (this.zza) {
            i = this.zzb;
        }
        return i;
    }

    @Override // com.android.billingclient.api.BillingClient
    @zzf
    public void isAlternativeBillingOnlyAvailableAsync(final AlternativeBillingOnlyAvailabilityListener alternativeBillingOnlyAvailabilityListener) {
        if (!isReady()) {
            zzaV(alternativeBillingOnlyAvailabilityListener, zzcj.zzm, 2, null);
            return;
        }
        if (!this.zzy) {
            com.google.android.gms.internal.play_billing.zze.zzl("BillingClient", "Current client doesn't support alternative billing only.");
            zzaV(alternativeBillingOnlyAvailabilityListener, zzcj.zzE, 66, null);
        } else if (zzE(new Callable() { // from class: com.android.billingclient.api.zzad
            @Override // java.util.concurrent.Callable
            public final Object call() {
                BillingClientImpl.this.zzz(alternativeBillingOnlyAvailabilityListener);
                return null;
            }
        }, 30000L, new Runnable() { // from class: com.android.billingclient.api.zzae
            @Override // java.lang.Runnable
            public final void run() {
                BillingClientImpl.this.zzah(alternativeBillingOnlyAvailabilityListener);
            }
        }, zzax(), zzaD()) == null) {
            zzaV(alternativeBillingOnlyAvailabilityListener, zzaA(), 25, null);
        }
    }

    @Override // com.android.billingclient.api.BillingClient
    @zzg
    public void isExternalOfferAvailableAsync(final ExternalOfferAvailabilityListener externalOfferAvailabilityListener) {
        if (!isReady()) {
            zzaZ(externalOfferAvailabilityListener, zzcj.zzm, 2, null);
            return;
        }
        if (!this.zzz) {
            com.google.android.gms.internal.play_billing.zze.zzl("BillingClient", "Current client doesn't support external offer.");
            zzaZ(externalOfferAvailabilityListener, zzcj.zzx, HttpStatusCodesKt.HTTP_EARLY_HINTS, null);
        } else if (zzE(new Callable() { // from class: com.android.billingclient.api.zzap
            @Override // java.util.concurrent.Callable
            public final Object call() {
                BillingClientImpl.this.zzA(externalOfferAvailabilityListener);
                return null;
            }
        }, 30000L, new Runnable() { // from class: com.android.billingclient.api.zzaq
            @Override // java.lang.Runnable
            public final void run() {
                BillingClientImpl.this.zzai(externalOfferAvailabilityListener);
            }
        }, zzax(), zzaD()) == null) {
            zzaZ(externalOfferAvailabilityListener, zzaA(), 25, null);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.android.billingclient.api.BillingClient
    public final BillingResult isFeatureSupported(String str) {
        char c;
        BillingResult billingResult;
        if (!isReady()) {
            billingResult = zzcj.zzm;
            if (billingResult.getResponseCode() != 0) {
                zzbe(2, 5, billingResult);
                return billingResult;
            }
            zzbg(5);
            return billingResult;
        }
        int i = zzcj.zzH;
        switch (str.hashCode()) {
            case -422092961:
                if (str.equals(BillingClient.FeatureType.SUBSCRIPTIONS_UPDATE)) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 96321:
                if (str.equals("aaa")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 97314:
                if (str.equals(BillingClient.FeatureType.IN_APP_MESSAGING)) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 98307:
                if (str.equals("ccc")) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case 99300:
                if (str.equals("ddd")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case 100293:
                if (str.equals("eee")) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case 101286:
                if (str.equals(BillingClient.FeatureType.PRODUCT_DETAILS)) {
                    c = '\b';
                    break;
                }
                c = 65535;
                break;
            case 102279:
                if (str.equals(BillingClient.FeatureType.BILLING_CONFIG)) {
                    c = '\t';
                    break;
                }
                c = 65535;
                break;
            case 103272:
                if (str.equals("hhh")) {
                    c = '\n';
                    break;
                }
                c = 65535;
                break;
            case 104265:
                if (str.equals("iii")) {
                    c = 11;
                    break;
                }
                c = 65535;
                break;
            case 105258:
                if (str.equals(BillingClient.FeatureType.ALTERNATIVE_BILLING_ONLY)) {
                    c = '\f';
                    break;
                }
                c = 65535;
                break;
            case 106251:
                if (str.equals(BillingClient.FeatureType.EXTERNAL_OFFER)) {
                    c = '\r';
                    break;
                }
                c = 65535;
                break;
            case 107244:
                if (str.equals("lll")) {
                    c = 14;
                    break;
                }
                c = 65535;
                break;
            case 207616302:
                if (str.equals(BillingClient.FeatureType.PRICE_CHANGE_CONFIRMATION)) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 1987365622:
                if (str.equals(BillingClient.FeatureType.SUBSCRIPTIONS)) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        switch (c) {
            case 0:
                BillingResult billingResult2 = this.zzj ? zzcj.zzl : zzcj.zzo;
                zzaT(billingResult2, 9, 2);
                break;
            case 1:
                BillingResult billingResult3 = this.zzk ? zzcj.zzl : zzcj.zzp;
                zzaT(billingResult3, 10, 3);
                break;
            case 2:
                BillingResult billingResult4 = this.zzn ? zzcj.zzl : zzcj.zzr;
                zzaT(billingResult4, 35, 4);
                break;
            case 3:
                BillingResult billingResult5 = this.zzq ? zzcj.zzl : zzcj.zzw;
                zzaT(billingResult5, 30, 5);
                break;
            case 4:
                BillingResult billingResult6 = this.zzs ? zzcj.zzl : zzcj.zzs;
                zzaT(billingResult6, 31, 6);
                break;
            case 5:
                BillingResult billingResult7 = this.zzr ? zzcj.zzl : zzcj.zzu;
                zzaT(billingResult7, 21, 7);
                break;
            case 6:
                BillingResult billingResult8 = this.zzt ? zzcj.zzl : zzcj.zzt;
                zzaT(billingResult8, 19, 8);
                break;
            case 7:
                BillingResult billingResult9 = this.zzt ? zzcj.zzl : zzcj.zzt;
                zzaT(billingResult9, 61, 9);
                break;
            case '\b':
                BillingResult billingResult10 = this.zzu ? zzcj.zzl : zzcj.zzv;
                zzaT(billingResult10, 20, 10);
                break;
            case '\t':
                BillingResult billingResult11 = this.zzv ? zzcj.zzl : zzcj.zzA;
                zzaT(billingResult11, 32, 11);
                break;
            case '\n':
                BillingResult billingResult12 = this.zzv ? zzcj.zzl : zzcj.zzB;
                zzaT(billingResult12, 33, 12);
                break;
            case 11:
                BillingResult billingResult13 = this.zzx ? zzcj.zzl : zzcj.zzD;
                zzaT(billingResult13, 60, 13);
                break;
            case '\f':
                BillingResult billingResult14 = this.zzy ? zzcj.zzl : zzcj.zzE;
                zzaT(billingResult14, 66, 14);
                break;
            case '\r':
                BillingResult billingResult15 = this.zzz ? zzcj.zzl : zzcj.zzx;
                zzaT(billingResult15, HttpStatusCodesKt.HTTP_EARLY_HINTS, 18);
                break;
            case 14:
                BillingResult billingResult16 = this.zzA ? zzcj.zzl : zzcj.zzy;
                zzaT(billingResult16, 116, 19);
                break;
            default:
                com.google.android.gms.internal.play_billing.zze.zzl("BillingClient", "Unsupported feature: ".concat(str));
                BillingResult billingResult17 = zzcj.zzz;
                zzaT(billingResult17, 34, 1);
                break;
        }
        return billingResult;
    }

    @Override // com.android.billingclient.api.BillingClient
    public final boolean isReady() {
        boolean z;
        synchronized (this.zza) {
            try {
                z = false;
                if (this.zzb == 2 && this.zzh != null && this.zzi != null) {
                    z = true;
                }
            } finally {
            }
        }
        return z;
    }

    /* JADX WARN: Removed duplicated region for block: B:132:0x046a  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0475  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x04b2  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0596  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x059d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:190:0x04c0 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:194:0x04c9  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x04cc  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x047d  */
    @Override // com.android.billingclient.api.BillingClient
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public BillingResult launchBillingFlow(Activity activity, final BillingFlowParams billingFlowParams) {
        String productId;
        String productType;
        String str;
        String str2;
        String str3;
        Future zzE;
        Object obj;
        int zza;
        int i;
        String string;
        String str4;
        boolean z;
        String str5;
        String str6;
        String str7;
        BillingFlowParams.ProductDetailsParams productDetailsParams;
        boolean z2;
        Intent intent;
        String str8;
        int i2;
        final int i3;
        String str9;
        final BillingClientImpl billingClientImpl = this;
        String str10 = "proxyPackageVersion";
        if (billingClientImpl.zze == null || billingClientImpl.zze.zzd() == null) {
            BillingResult billingResult = zzcj.zzF;
            billingClientImpl.zzbe(12, 2, billingResult);
            return billingResult;
        }
        if (!billingClientImpl.isReady()) {
            BillingResult billingResult2 = zzcj.zzm;
            billingClientImpl.zzbe(2, 2, billingResult2);
            billingClientImpl.zzm(billingResult2);
            return billingResult2;
        }
        ArrayList<SkuDetails> zzg = billingFlowParams.zzg();
        List zzh = billingFlowParams.zzh();
        SkuDetails skuDetails = (SkuDetails) com.google.android.gms.internal.play_billing.zzcx.zza(zzg, null);
        BillingFlowParams.ProductDetailsParams productDetailsParams2 = (BillingFlowParams.ProductDetailsParams) com.google.android.gms.internal.play_billing.zzcx.zza(zzh, null);
        if (skuDetails != null) {
            productId = skuDetails.getSku();
            productType = skuDetails.getType();
        } else {
            productId = productDetailsParams2.zza().getProductId();
            productType = productDetailsParams2.zza().getProductType();
        }
        String str11 = "BillingClient";
        if (productType.equals("subs") && !billingClientImpl.zzj) {
            com.google.android.gms.internal.play_billing.zze.zzl("BillingClient", "Current client doesn't support subscriptions.");
            BillingResult billingResult3 = zzcj.zzo;
            billingClientImpl.zzbe(9, 2, billingResult3);
            billingClientImpl.zzm(billingResult3);
            return billingResult3;
        }
        if (billingFlowParams.zzq() && !billingClientImpl.zzm) {
            com.google.android.gms.internal.play_billing.zze.zzl("BillingClient", "Current client doesn't support extra params for buy intent.");
            BillingResult billingResult4 = zzcj.zzi;
            billingClientImpl.zzbe(18, 2, billingResult4);
            billingClientImpl.zzm(billingResult4);
            return billingResult4;
        }
        if (zzg.size() > 1 && !billingClientImpl.zzt) {
            com.google.android.gms.internal.play_billing.zze.zzl("BillingClient", "Current client doesn't support multi-item purchases.");
            BillingResult billingResult5 = zzcj.zzt;
            billingClientImpl.zzbe(19, 2, billingResult5);
            billingClientImpl.zzm(billingResult5);
            return billingResult5;
        }
        if (!zzh.isEmpty() && !billingClientImpl.zzu) {
            com.google.android.gms.internal.play_billing.zze.zzl("BillingClient", "Current client doesn't support purchases with ProductDetails.");
            BillingResult billingResult6 = zzcj.zzv;
            billingClientImpl.zzbe(20, 2, billingResult6);
            billingClientImpl.zzm(billingResult6);
            return billingResult6;
        }
        BillingResult zzb = billingFlowParams.zzb();
        if (zzb != zzcj.zzl) {
            billingClientImpl.zzbe(120, 2, zzb);
            billingClientImpl.zzm(zzb);
            return zzb;
        }
        if (billingClientImpl.zzm) {
            boolean z3 = billingClientImpl.zzo;
            boolean z4 = billingClientImpl.zzw;
            boolean isEnabledForOneTimeProducts = billingClientImpl.zzB.isEnabledForOneTimeProducts();
            boolean isEnabledForPrepaidPlans = billingClientImpl.zzB.isEnabledForPrepaidPlans();
            boolean z5 = billingClientImpl.zzC;
            String str12 = billingClientImpl.zzc;
            final String str13 = productId;
            long longValue = billingClientImpl.zzF.longValue();
            final String packageName = billingClientImpl.zzf.getPackageName();
            final Bundle bundle = new Bundle();
            com.google.android.gms.internal.play_billing.zze.zzc(bundle, str12, longValue);
            if (billingFlowParams.zza() != 0) {
                bundle.putInt("prorationMode", billingFlowParams.zza());
            }
            if (!TextUtils.isEmpty(billingFlowParams.zzc())) {
                bundle.putString(BillingFlowParams.EXTRA_PARAM_KEY_ACCOUNT_ID, billingFlowParams.zzc());
            }
            if (!TextUtils.isEmpty(billingFlowParams.zzd())) {
                bundle.putString("obfuscatedProfileId", billingFlowParams.zzd());
            }
            if (billingFlowParams.zzp()) {
                bundle.putBoolean("isOfferPersonalizedByDeveloper", true);
            }
            if (!TextUtils.isEmpty(null)) {
                bundle.putStringArrayList("skusToReplace", new ArrayList<>(Arrays.asList(null)));
            }
            if (!TextUtils.isEmpty(billingFlowParams.zze())) {
                bundle.putString("oldSkuPurchaseToken", billingFlowParams.zze());
            }
            if (TextUtils.isEmpty(null)) {
                str4 = null;
            } else {
                str4 = null;
                bundle.putString("oldSkuPurchaseId", null);
            }
            if (!TextUtils.isEmpty(billingFlowParams.zzf())) {
                bundle.putString("originalExternalTransactionId", billingFlowParams.zzf());
            }
            if (!TextUtils.isEmpty(str4)) {
                bundle.putString("paymentsPurchaseParams", str4);
            }
            if (z3 && isEnabledForOneTimeProducts) {
                z = true;
                bundle.putBoolean("enablePendingPurchases", true);
            } else {
                z = true;
            }
            if (z4 && isEnabledForPrepaidPlans) {
                bundle.putBoolean("enablePendingPurchaseForSubscriptions", z);
            }
            if (z5) {
                bundle.putBoolean("enableAlternativeBilling", z);
            }
            if (billingFlowParams.zzh().stream().anyMatch(new Predicate() { // from class: com.google.android.gms.internal.play_billing.zza
                @Override // java.util.function.Predicate
                public final boolean test(Object obj2) {
                    int i4 = zze.zza;
                    return false;
                }
            })) {
                zzfm zza2 = zzfn.zza();
                zza2.zza((Iterable) billingFlowParams.zzh().stream().filter(new Predicate() { // from class: com.google.android.gms.internal.play_billing.zzb
                    @Override // java.util.function.Predicate
                    public final boolean test(Object obj2) {
                        int i4 = zze.zza;
                        return false;
                    }
                }).map(new Function() { // from class: com.google.android.gms.internal.play_billing.zzc
                    @Override // java.util.function.Function
                    public final Object apply(Object obj2) {
                        int i4 = zze.zza;
                        String productId2 = ((BillingFlowParams.ProductDetailsParams) obj2).zza().getProductId();
                        zzfk zza3 = zzfl.zza();
                        zzfp zza4 = zzfq.zza();
                        zza4.zza("subs:" + packageName + ":" + productId2);
                        zza3.zza(zza4);
                        zzfq.zza();
                        throw null;
                    }
                }).collect(com.google.android.gms.internal.play_billing.zzco.zzo()));
                bundle.putByteArray("subscriptionProductReplacementParamsList", ((zzfn) zza2.zzf()).zzh());
            }
            if (zzg.isEmpty()) {
                str5 = "proxyPackageVersion";
                str = "BUY_INTENT";
                str6 = productType;
                str7 = "BillingClient";
                ArrayList<String> arrayList = new ArrayList<>(zzh.size() - 1);
                ArrayList<String> arrayList2 = new ArrayList<>(zzh.size() - 1);
                ArrayList<String> arrayList3 = new ArrayList<>();
                ArrayList<String> arrayList4 = new ArrayList<>();
                ArrayList<String> arrayList5 = new ArrayList<>();
                ArrayList<Integer> arrayList6 = new ArrayList<>();
                for (int i4 = 0; i4 < zzh.size(); i4++) {
                    BillingFlowParams.ProductDetailsParams productDetailsParams3 = (BillingFlowParams.ProductDetailsParams) zzh.get(i4);
                    ProductDetails zza3 = productDetailsParams3.zza();
                    if (zza3.zzb().isEmpty()) {
                        productDetailsParams = productDetailsParams3;
                    } else {
                        productDetailsParams = productDetailsParams3;
                        arrayList3.add(zza3.zzb());
                    }
                    arrayList4.add(productDetailsParams.zzb());
                    String zzc = zza3.zzc();
                    if (zza3.zzd() != null && !zza3.zzd().isEmpty()) {
                        Iterator it = zza3.zzd().iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            ProductDetails.OneTimePurchaseOfferDetails oneTimePurchaseOfferDetails = (ProductDetails.OneTimePurchaseOfferDetails) it.next();
                            if (!TextUtils.isEmpty(oneTimePurchaseOfferDetails.zzc())) {
                                zzc = oneTimePurchaseOfferDetails.zzc();
                                break;
                            }
                        }
                    }
                    if (!TextUtils.isEmpty(zzc)) {
                        arrayList5.add(zzc);
                    }
                    if (i4 > 0) {
                        arrayList.add(((BillingFlowParams.ProductDetailsParams) zzh.get(i4)).zza().getProductId());
                        arrayList2.add(((BillingFlowParams.ProductDetailsParams) zzh.get(i4)).zza().getProductType());
                    }
                }
                bundle.putStringArrayList("SKU_OFFER_ID_TOKEN_LIST", arrayList4);
                bundle.putIntegerArrayList("AUTO_PAY_BALANCE_THRESHOLD_LIST", arrayList6);
                if (!arrayList3.isEmpty()) {
                    bundle.putStringArrayList("skuDetailsTokens", arrayList3);
                }
                if (!arrayList5.isEmpty()) {
                    bundle.putStringArrayList("SKU_SERIALIZED_DOCID_LIST", arrayList5);
                }
                if (!arrayList.isEmpty()) {
                    bundle.putStringArrayList("additionalSkus", arrayList);
                    bundle.putStringArrayList("additionalSkuTypes", arrayList2);
                }
            } else {
                ArrayList<String> arrayList7 = new ArrayList<>();
                ArrayList<String> arrayList8 = new ArrayList<>();
                str6 = productType;
                ArrayList<String> arrayList9 = new ArrayList<>();
                str = "BUY_INTENT";
                ArrayList<Integer> arrayList10 = new ArrayList<>();
                ArrayList<String> arrayList11 = new ArrayList<>();
                boolean z6 = false;
                boolean z7 = false;
                boolean z8 = false;
                boolean z9 = false;
                for (SkuDetails skuDetails2 : zzg) {
                    if (skuDetails2.zzf().isEmpty()) {
                        str9 = str10;
                    } else {
                        str9 = str10;
                        arrayList7.add(skuDetails2.zzf());
                    }
                    String zzc2 = skuDetails2.zzc();
                    String str14 = str11;
                    String zzb2 = skuDetails2.zzb();
                    int zza4 = skuDetails2.zza();
                    String zze = skuDetails2.zze();
                    arrayList8.add(zzc2);
                    z6 |= !TextUtils.isEmpty(zzc2);
                    arrayList9.add(zzb2);
                    z7 |= !TextUtils.isEmpty(zzb2);
                    arrayList10.add(Integer.valueOf(zza4));
                    z8 |= zza4 != 0;
                    z9 |= !TextUtils.isEmpty(zze);
                    arrayList11.add(zze);
                    str10 = str9;
                    str11 = str14;
                }
                str5 = str10;
                str7 = str11;
                if (!arrayList7.isEmpty()) {
                    bundle.putStringArrayList("skuDetailsTokens", arrayList7);
                }
                if (z6) {
                    bundle.putStringArrayList("SKU_OFFER_ID_TOKEN_LIST", arrayList8);
                }
                if (z7) {
                    bundle.putStringArrayList("SKU_OFFER_ID_LIST", arrayList9);
                }
                if (z8) {
                    bundle.putIntegerArrayList("SKU_OFFER_TYPE_LIST", arrayList10);
                }
                if (z9) {
                    bundle.putStringArrayList("SKU_SERIALIZED_DOCID_LIST", arrayList11);
                }
                if (zzg.size() > 1) {
                    ArrayList<String> arrayList12 = new ArrayList<>(zzg.size() - 1);
                    ArrayList<String> arrayList13 = new ArrayList<>(zzg.size() - 1);
                    for (int i5 = 1; i5 < zzg.size(); i5++) {
                        arrayList12.add(((SkuDetails) zzg.get(i5)).getSku());
                        arrayList13.add(((SkuDetails) zzg.get(i5)).getType());
                    }
                    bundle.putStringArrayList("additionalSkus", arrayList12);
                    bundle.putStringArrayList("additionalSkuTypes", arrayList13);
                }
            }
            billingClientImpl = this;
            if (bundle.containsKey("SKU_OFFER_ID_TOKEN_LIST") && !billingClientImpl.zzr) {
                BillingResult billingResult7 = zzcj.zzu;
                billingClientImpl.zzbe(21, 2, billingResult7);
                billingClientImpl.zzm(billingResult7);
                return billingResult7;
            }
            if (skuDetails != null && !TextUtils.isEmpty(skuDetails.zzd())) {
                bundle.putString("skuPackageName", skuDetails.zzd());
            } else if (productDetailsParams2 == null || TextUtils.isEmpty(productDetailsParams2.zza().zza())) {
                z2 = false;
                str2 = null;
                if (!TextUtils.isEmpty(null)) {
                    bundle.putString("accountName", null);
                }
                intent = activity.getIntent();
                if (intent != null) {
                    str3 = str7;
                    com.google.android.gms.internal.play_billing.zze.zzl(str3, "Activity's intent is null.");
                } else {
                    str3 = str7;
                    if (!TextUtils.isEmpty(intent.getStringExtra("PROXY_PACKAGE"))) {
                        String stringExtra = intent.getStringExtra("PROXY_PACKAGE");
                        bundle.putString("proxyPackage", stringExtra);
                        try {
                            str8 = str5;
                            try {
                                bundle.putString(str8, billingClientImpl.zzf.getPackageManager().getPackageInfo(stringExtra, 0).versionName);
                            } catch (PackageManager.NameNotFoundException unused) {
                                bundle.putString(str8, "package not found");
                                if (!billingClientImpl.zzu) {
                                }
                                if (!billingClientImpl.zzs) {
                                }
                                if (billingClientImpl.zzo) {
                                }
                            }
                        } catch (PackageManager.NameNotFoundException unused2) {
                            str8 = str5;
                        }
                    }
                }
                if (!billingClientImpl.zzu && !zzh.isEmpty()) {
                    i2 = 17;
                } else if (!billingClientImpl.zzs && z2) {
                    i2 = 15;
                } else if (billingClientImpl.zzo) {
                    i3 = 9;
                    final String str15 = str6;
                    zzE = zzE(new Callable() { // from class: com.android.billingclient.api.zzar
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            return BillingClientImpl.this.zzd(i3, str13, str15, billingFlowParams, bundle);
                        }
                    }, 5000L, null, billingClientImpl.zzd, billingClientImpl.zzaD());
                } else {
                    i2 = 6;
                }
                i3 = i2;
                final String str152 = str6;
                zzE = zzE(new Callable() { // from class: com.android.billingclient.api.zzar
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return BillingClientImpl.this.zzd(i3, str13, str152, billingFlowParams, bundle);
                    }
                }, 5000L, null, billingClientImpl.zzd, billingClientImpl.zzaD());
            } else {
                bundle.putString("skuPackageName", productDetailsParams2.zza().zza());
            }
            z2 = true;
            str2 = null;
            if (!TextUtils.isEmpty(null)) {
            }
            intent = activity.getIntent();
            if (intent != null) {
            }
            if (!billingClientImpl.zzu) {
            }
            if (!billingClientImpl.zzs) {
            }
            if (billingClientImpl.zzo) {
            }
        } else {
            final String str16 = productId;
            str = "BUY_INTENT";
            str2 = null;
            final String str17 = productType;
            str3 = "BillingClient";
            zzE = zzE(new Callable() { // from class: com.android.billingclient.api.zzq
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return BillingClientImpl.this.zze(str16, str17);
                }
            }, 5000L, null, billingClientImpl.zzd, billingClientImpl.zzaD());
        }
        try {
            if (zzE == null) {
                BillingResult billingResult8 = zzcj.zzd;
                billingClientImpl.zzbe(25, 2, billingResult8);
                billingClientImpl.zzm(billingResult8);
                return billingResult8;
            }
            Bundle bundle2 = (Bundle) zzE.get(5000L, TimeUnit.MILLISECONDS);
            int zzb3 = com.google.android.gms.internal.play_billing.zze.zzb(bundle2, str3);
            String zzh2 = com.google.android.gms.internal.play_billing.zze.zzh(bundle2, str3);
            if (zzb3 == 0) {
                Intent intent2 = new Intent(activity, (Class<?>) ProxyBillingActivity.class);
                String str18 = str;
                intent2.putExtra(str18, (PendingIntent) bundle2.getParcelable(str18));
                activity.startActivity(intent2);
                return zzcj.zzl;
            }
            com.google.android.gms.internal.play_billing.zze.zzl(str3, "Unable to buy item, Error response code: " + zzb3);
            BillingResult zza5 = zzcj.zza(zzb3, zzh2);
            if (bundle2 != null) {
                try {
                    obj = bundle2.get("LOG_REASON");
                } catch (Throwable th) {
                    com.google.android.gms.internal.play_billing.zze.zzl(str3, "Failed to get log reason from bundle: ".concat(String.valueOf(th.getMessage())));
                }
                if (obj != null) {
                    if (obj instanceof Integer) {
                        zza = zzkg.zza(((Integer) obj).intValue());
                        i = 1;
                        if (zza == i) {
                            zza = 23;
                        }
                        if (bundle2 != null) {
                            try {
                                string = bundle2.getString("ADDITIONAL_LOG_DETAILS");
                            } catch (Throwable th2) {
                                com.google.android.gms.internal.play_billing.zze.zzl(str3, "Failed to get additional log details from bundle: ".concat(String.valueOf(th2.getMessage())));
                            }
                            billingClientImpl.zzbf(zza, 2, zza5, string);
                            billingClientImpl.zzm(zza5);
                            return zza5;
                        }
                        string = str2;
                        billingClientImpl.zzbf(zza, 2, zza5, string);
                        billingClientImpl.zzm(zza5);
                        return zza5;
                    }
                    com.google.android.gms.internal.play_billing.zze.zzl(str3, "Unexpected type for bundle log reason: " + obj.getClass().getName());
                }
            }
            i = 1;
            zza = 1;
            if (zza == i) {
            }
            if (bundle2 != null) {
            }
            string = str2;
            billingClientImpl.zzbf(zza, 2, zza5, string);
            billingClientImpl.zzm(zza5);
            return zza5;
        } catch (CancellationException e) {
            e = e;
            com.google.android.gms.internal.play_billing.zze.zzm(str3, "Time out while launching billing flow. Try to reconnect", e);
            BillingResult billingResult9 = zzcj.zzn;
            billingClientImpl.zzbf(4, 2, billingResult9, zzcg.zza(e));
            billingClientImpl.zzm(billingResult9);
            return billingResult9;
        } catch (TimeoutException e2) {
            e = e2;
            com.google.android.gms.internal.play_billing.zze.zzm(str3, "Time out while launching billing flow. Try to reconnect", e);
            BillingResult billingResult92 = zzcj.zzn;
            billingClientImpl.zzbf(4, 2, billingResult92, zzcg.zza(e));
            billingClientImpl.zzm(billingResult92);
            return billingResult92;
        } catch (Exception e3) {
            com.google.android.gms.internal.play_billing.zze.zzm(str3, "Exception while launching billing flow. Try to reconnect", e3);
            BillingResult billingResult10 = zzcj.zzm;
            billingClientImpl.zzbf(5, 2, billingResult10, zzcg.zza(e3));
            billingClientImpl.zzm(billingResult10);
            return billingResult10;
        }
    }

    @Override // com.android.billingclient.api.BillingClient
    public void queryProductDetailsAsync(final QueryProductDetailsParams queryProductDetailsParams, final ProductDetailsResponseListener productDetailsResponseListener) {
        if (!isReady()) {
            BillingResult billingResult = zzcj.zzm;
            zzbe(2, 7, billingResult);
            productDetailsResponseListener.onProductDetailsResponse(billingResult, new ArrayList());
        } else {
            if (!this.zzu) {
                com.google.android.gms.internal.play_billing.zze.zzl("BillingClient", "Querying product details is not supported.");
                BillingResult billingResult2 = zzcj.zzv;
                zzbe(20, 7, billingResult2);
                productDetailsResponseListener.onProductDetailsResponse(billingResult2, new ArrayList());
                return;
            }
            if (zzE(new Callable() { // from class: com.android.billingclient.api.zzam
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    zzbj zzh = BillingClientImpl.this.zzh(queryProductDetailsParams);
                    productDetailsResponseListener.onProductDetailsResponse(zzcj.zza(zzh.zza(), zzh.zzb()), zzh.zzc());
                    return null;
                }
            }, 30000L, new Runnable() { // from class: com.android.billingclient.api.zzan
                @Override // java.lang.Runnable
                public final void run() {
                    BillingClientImpl.this.zzaj(productDetailsResponseListener);
                }
            }, zzax(), zzaD()) == null) {
                BillingResult zzaA = zzaA();
                zzbe(25, 7, zzaA);
                productDetailsResponseListener.onProductDetailsResponse(zzaA, new ArrayList());
            }
        }
    }

    @Override // com.android.billingclient.api.BillingClient
    public final void queryPurchaseHistoryAsync(QueryPurchaseHistoryParams queryPurchaseHistoryParams, PurchaseHistoryResponseListener purchaseHistoryResponseListener) {
        zzaH(queryPurchaseHistoryParams.zza(), purchaseHistoryResponseListener);
    }

    @Override // com.android.billingclient.api.BillingClient
    public final void queryPurchasesAsync(QueryPurchasesParams queryPurchasesParams, PurchasesResponseListener purchasesResponseListener) {
        zzaI(queryPurchasesParams.zza(), purchasesResponseListener);
    }

    @Override // com.android.billingclient.api.BillingClient
    public void querySkuDetailsAsync(SkuDetailsParams skuDetailsParams, final SkuDetailsResponseListener skuDetailsResponseListener) {
        if (!isReady()) {
            BillingResult billingResult = zzcj.zzm;
            zzbe(2, 8, billingResult);
            skuDetailsResponseListener.onSkuDetailsResponse(billingResult, null);
            return;
        }
        final String skuType = skuDetailsParams.getSkuType();
        final List<String> skusList = skuDetailsParams.getSkusList();
        if (TextUtils.isEmpty(skuType)) {
            com.google.android.gms.internal.play_billing.zze.zzl("BillingClient", "Please fix the input params. SKU type can't be empty.");
            BillingResult billingResult2 = zzcj.zzg;
            zzbe(49, 8, billingResult2);
            skuDetailsResponseListener.onSkuDetailsResponse(billingResult2, null);
            return;
        }
        if (skusList == null) {
            com.google.android.gms.internal.play_billing.zze.zzl("BillingClient", "Please fix the input params. The list of SKUs can't be empty.");
            BillingResult billingResult3 = zzcj.zzf;
            zzbe(48, 8, billingResult3);
            skuDetailsResponseListener.onSkuDetailsResponse(billingResult3, null);
            return;
        }
        final String str = null;
        if (zzE(new Callable(skuType, skusList, str, skuDetailsResponseListener) { // from class: com.android.billingclient.api.zzz
            public final /* synthetic */ String zzb;
            public final /* synthetic */ List zzc;
            public final /* synthetic */ SkuDetailsResponseListener zzd;

            {
                this.zzd = skuDetailsResponseListener;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                zzdc zzn = BillingClientImpl.this.zzn(this.zzb, this.zzc, null);
                this.zzd.onSkuDetailsResponse(zzcj.zza(zzn.zza(), zzn.zzb()), zzn.zzc());
                return null;
            }
        }, 30000L, new Runnable() { // from class: com.android.billingclient.api.zzab
            @Override // java.lang.Runnable
            public final void run() {
                BillingClientImpl.this.zzam(skuDetailsResponseListener);
            }
        }, zzax(), zzaD()) == null) {
            BillingResult zzaA = zzaA();
            zzbe(25, 8, zzaA);
            skuDetailsResponseListener.onSkuDetailsResponse(zzaA, null);
        }
    }

    @Override // com.android.billingclient.api.BillingClient
    @zzf
    public BillingResult showAlternativeBillingOnlyInformationDialog(final Activity activity, final AlternativeBillingOnlyInformationDialogListener alternativeBillingOnlyInformationDialogListener) {
        if (activity == null) {
            throw new IllegalArgumentException("Please provide a valid activity.");
        }
        if (!isReady()) {
            BillingResult billingResult = zzcj.zzm;
            zzbe(2, 16, billingResult);
            return billingResult;
        }
        if (!this.zzy) {
            com.google.android.gms.internal.play_billing.zze.zzl("BillingClient", "Current Play Store version doesn't support alternative billing only.");
            BillingResult billingResult2 = zzcj.zzE;
            zzbe(66, 16, billingResult2);
            return billingResult2;
        }
        final zzaw zzawVar = new zzaw(this, this.zzd, alternativeBillingOnlyInformationDialogListener);
        if (zzE(new Callable() { // from class: com.android.billingclient.api.zzr
            @Override // java.util.concurrent.Callable
            public final Object call() {
                BillingClientImpl.this.zzB(alternativeBillingOnlyInformationDialogListener, activity, zzawVar);
                return null;
            }
        }, 30000L, new Runnable() { // from class: com.android.billingclient.api.zzs
            @Override // java.lang.Runnable
            public final void run() {
                BillingClientImpl.this.zzan(alternativeBillingOnlyInformationDialogListener);
            }
        }, this.zzd, zzaD()) != null) {
            return zzcj.zzl;
        }
        BillingResult zzaA = zzaA();
        zzbe(25, 16, zzaA);
        return zzaA;
    }

    @Override // com.android.billingclient.api.BillingClient
    @zzg
    public BillingResult showExternalOfferInformationDialog(final Activity activity, final ExternalOfferInformationDialogListener externalOfferInformationDialogListener) {
        if (activity == null) {
            throw new IllegalArgumentException("Please provide a valid activity.");
        }
        if (!isReady()) {
            BillingResult billingResult = zzcj.zzm;
            zzbe(2, 25, billingResult);
            return billingResult;
        }
        if (!this.zzz) {
            com.google.android.gms.internal.play_billing.zze.zzl("BillingClient", "Current Play Store version doesn't support external offer.");
            BillingResult billingResult2 = zzcj.zzx;
            zzbe(HttpStatusCodesKt.HTTP_EARLY_HINTS, 25, billingResult2);
            return billingResult2;
        }
        final zzax zzaxVar = new zzax(this, this.zzd, externalOfferInformationDialogListener);
        if (zzE(new Callable() { // from class: com.android.billingclient.api.zzai
            @Override // java.util.concurrent.Callable
            public final Object call() {
                BillingClientImpl.this.zzC(externalOfferInformationDialogListener, activity, zzaxVar);
                return null;
            }
        }, 30000L, new Runnable() { // from class: com.android.billingclient.api.zzak
            @Override // java.lang.Runnable
            public final void run() {
                BillingClientImpl.this.zzao(externalOfferInformationDialogListener);
            }
        }, this.zzd, zzaD()) != null) {
            return zzcj.zzl;
        }
        BillingResult zzaA = zzaA();
        zzbe(25, 25, zzaA);
        return zzaA;
    }

    @Override // com.android.billingclient.api.BillingClient
    public final BillingResult showInAppMessages(final Activity activity, InAppMessageParams inAppMessageParams, InAppMessageResponseListener inAppMessageResponseListener) {
        if (!isReady()) {
            com.google.android.gms.internal.play_billing.zze.zzl("BillingClient", "Service disconnected.");
            return zzcj.zzm;
        }
        if (!this.zzq) {
            com.google.android.gms.internal.play_billing.zze.zzl("BillingClient", "Current client doesn't support showing in-app messages.");
            return zzcj.zzw;
        }
        View findViewById = activity.findViewById(R.id.content);
        IBinder windowToken = findViewById.getWindowToken();
        Rect rect = new Rect();
        findViewById.getGlobalVisibleRect(rect);
        final Bundle bundle = new Bundle();
        BundleCompat.putBinder(bundle, "KEY_WINDOW_TOKEN", windowToken);
        bundle.putInt("KEY_DIMEN_LEFT", rect.left);
        bundle.putInt("KEY_DIMEN_TOP", rect.top);
        bundle.putInt("KEY_DIMEN_RIGHT", rect.right);
        bundle.putInt("KEY_DIMEN_BOTTOM", rect.bottom);
        bundle.putString("playBillingLibraryVersion", this.zzc);
        bundle.putIntegerArrayList("KEY_CATEGORY_IDS", inAppMessageParams.zza());
        final zzav zzavVar = new zzav(this, this.zzd, inAppMessageResponseListener);
        zzE(new Callable() { // from class: com.android.billingclient.api.zzao
            @Override // java.util.concurrent.Callable
            public final Object call() {
                BillingClientImpl.this.zzv(bundle, activity, zzavVar);
                return null;
            }
        }, 5000L, null, this.zzd, zzaD());
        return zzcj.zzl;
    }

    public final /* synthetic */ Void zzA(ExternalOfferAvailabilityListener externalOfferAvailabilityListener) throws Exception {
        com.google.android.gms.internal.play_billing.zzan zzanVar;
        try {
            synchronized (this.zza) {
                zzanVar = this.zzh;
            }
            if (zzanVar == null) {
                zzaZ(externalOfferAvailabilityListener, zzcj.zzm, 119, null);
            } else {
                zzanVar.zzs(22, this.zzf.getPackageName(), com.google.android.gms.internal.play_billing.zze.zze(this.zzc, this.zzF.longValue()), new zzbh(externalOfferAvailabilityListener, this.zzg, this.zzl, null));
            }
        } catch (DeadObjectException e) {
            zzaZ(externalOfferAvailabilityListener, zzcj.zzm, 91, e);
        } catch (Exception e2) {
            zzaZ(externalOfferAvailabilityListener, zzcj.zzk, 91, e2);
        }
        return null;
    }

    public final /* synthetic */ Void zzB(AlternativeBillingOnlyInformationDialogListener alternativeBillingOnlyInformationDialogListener, Activity activity, ResultReceiver resultReceiver) throws Exception {
        com.google.android.gms.internal.play_billing.zzan zzanVar;
        try {
            synchronized (this.zza) {
                zzanVar = this.zzh;
            }
            if (zzanVar == null) {
                zzbc(alternativeBillingOnlyInformationDialogListener, zzcj.zzm, 119, null);
            } else {
                zzanVar.zzo(21, this.zzf.getPackageName(), com.google.android.gms.internal.play_billing.zze.zze(this.zzc, this.zzF.longValue()), new zzbd(new WeakReference(activity), resultReceiver, null));
            }
        } catch (DeadObjectException e) {
            zzbc(alternativeBillingOnlyInformationDialogListener, zzcj.zzm, 74, e);
        } catch (Exception e2) {
            zzbc(alternativeBillingOnlyInformationDialogListener, zzcj.zzk, 74, e2);
        }
        return null;
    }

    public final /* synthetic */ Void zzC(ExternalOfferInformationDialogListener externalOfferInformationDialogListener, Activity activity, ResultReceiver resultReceiver) throws Exception {
        com.google.android.gms.internal.play_billing.zzan zzanVar;
        try {
            synchronized (this.zza) {
                zzanVar = this.zzh;
            }
            if (zzanVar == null) {
                zzba(externalOfferInformationDialogListener, zzcj.zzm, 119, null);
            } else {
                zzanVar.zzq(22, this.zzf.getPackageName(), com.google.android.gms.internal.play_billing.zze.zze(this.zzc, this.zzF.longValue()), new zzbf(new WeakReference(activity), resultReceiver, null));
            }
        } catch (DeadObjectException e) {
            zzba(externalOfferInformationDialogListener, zzcj.zzm, 98, e);
        } catch (Exception e2) {
            zzba(externalOfferInformationDialogListener, zzcj.zzk, 98, e2);
        }
        return null;
    }

    public final /* synthetic */ void zzab(AcknowledgePurchaseResponseListener acknowledgePurchaseResponseListener) {
        BillingResult billingResult = zzcj.zzn;
        zzbe(24, 3, billingResult);
        acknowledgePurchaseResponseListener.onAcknowledgePurchaseResponse(billingResult);
    }

    public final /* synthetic */ void zzac(BillingResult billingResult) {
        if (this.zze.zzd() != null) {
            this.zze.zzd().onPurchasesUpdated(billingResult, null);
        } else {
            com.google.android.gms.internal.play_billing.zze.zzl("BillingClient", "No valid listener is set in BroadcastManager");
        }
    }

    public final /* synthetic */ void zzad(ConsumeResponseListener consumeResponseListener, ConsumeParams consumeParams) {
        BillingResult billingResult = zzcj.zzn;
        zzbe(24, 4, billingResult);
        consumeResponseListener.onConsumeResponse(billingResult, consumeParams.getPurchaseToken());
    }

    public final /* synthetic */ void zzae(AlternativeBillingOnlyReportingDetailsListener alternativeBillingOnlyReportingDetailsListener) {
        zzaX(alternativeBillingOnlyReportingDetailsListener, zzcj.zzn, 24, null);
    }

    public final /* synthetic */ void zzaf(ExternalOfferReportingDetailsListener externalOfferReportingDetailsListener) {
        zzaY(externalOfferReportingDetailsListener, zzcj.zzn, 24, null);
    }

    public final /* synthetic */ void zzag(BillingConfigResponseListener billingConfigResponseListener) {
        BillingResult billingResult = zzcj.zzn;
        zzbe(24, 13, billingResult);
        billingConfigResponseListener.onBillingConfigResponse(billingResult, null);
    }

    public final /* synthetic */ void zzah(AlternativeBillingOnlyAvailabilityListener alternativeBillingOnlyAvailabilityListener) {
        zzaV(alternativeBillingOnlyAvailabilityListener, zzcj.zzn, 24, null);
    }

    public final /* synthetic */ void zzai(ExternalOfferAvailabilityListener externalOfferAvailabilityListener) {
        zzaZ(externalOfferAvailabilityListener, zzcj.zzn, 24, null);
    }

    public final /* synthetic */ void zzaj(ProductDetailsResponseListener productDetailsResponseListener) {
        BillingResult billingResult = zzcj.zzn;
        zzbe(24, 7, billingResult);
        productDetailsResponseListener.onProductDetailsResponse(billingResult, new ArrayList());
    }

    public final /* synthetic */ void zzak(PurchaseHistoryResponseListener purchaseHistoryResponseListener) {
        BillingResult billingResult = zzcj.zzn;
        zzbe(24, 11, billingResult);
        purchaseHistoryResponseListener.onPurchaseHistoryResponse(billingResult, null);
    }

    public final /* synthetic */ void zzal(PurchasesResponseListener purchasesResponseListener) {
        BillingResult billingResult = zzcj.zzn;
        zzbe(24, 9, billingResult);
        purchasesResponseListener.onQueryPurchasesResponse(billingResult, com.google.android.gms.internal.play_billing.zzco.zzl());
    }

    public final /* synthetic */ void zzam(SkuDetailsResponseListener skuDetailsResponseListener) {
        BillingResult billingResult = zzcj.zzn;
        zzbe(24, 8, billingResult);
        skuDetailsResponseListener.onSkuDetailsResponse(billingResult, null);
    }

    public final /* synthetic */ void zzan(AlternativeBillingOnlyInformationDialogListener alternativeBillingOnlyInformationDialogListener) {
        zzbc(alternativeBillingOnlyInformationDialogListener, zzcj.zzn, 24, null);
    }

    public final /* synthetic */ void zzao(ExternalOfferInformationDialogListener externalOfferInformationDialogListener) {
        zzba(externalOfferInformationDialogListener, zzcj.zzn, 24, null);
    }

    public final /* synthetic */ Bundle zzd(int i, String str, String str2, BillingFlowParams billingFlowParams, Bundle bundle) throws Exception {
        com.google.android.gms.internal.play_billing.zzan zzanVar;
        try {
            synchronized (this.zza) {
                zzanVar = this.zzh;
            }
            return zzanVar == null ? com.google.android.gms.internal.play_billing.zze.zzn(zzcj.zzm, 119) : zzanVar.zzg(i, this.zzf.getPackageName(), str, str2, null, bundle);
        } catch (DeadObjectException e) {
            return com.google.android.gms.internal.play_billing.zze.zzo(zzcj.zzm, 5, zzcg.zza(e));
        } catch (Exception e2) {
            return com.google.android.gms.internal.play_billing.zze.zzo(zzcj.zzk, 5, zzcg.zza(e2));
        }
    }

    public final /* synthetic */ Bundle zze(String str, String str2) throws Exception {
        com.google.android.gms.internal.play_billing.zzan zzanVar;
        try {
            synchronized (this.zza) {
                zzanVar = this.zzh;
            }
            return zzanVar == null ? com.google.android.gms.internal.play_billing.zze.zzn(zzcj.zzm, 119) : zzanVar.zzf(3, this.zzf.getPackageName(), str, str2, null);
        } catch (DeadObjectException e) {
            return com.google.android.gms.internal.play_billing.zze.zzo(zzcj.zzm, 5, zzcg.zza(e));
        } catch (Exception e2) {
            return com.google.android.gms.internal.play_billing.zze.zzo(zzcj.zzk, 5, zzcg.zza(e2));
        }
    }

    @VisibleForTesting
    public final zzbj zzh(QueryProductDetailsParams queryProductDetailsParams) {
        com.google.android.gms.internal.play_billing.zzan zzanVar;
        ArrayList arrayList = new ArrayList();
        String zzb = queryProductDetailsParams.zzb();
        com.google.android.gms.internal.play_billing.zzco zza = queryProductDetailsParams.zza();
        int size = zza.size();
        int i = 0;
        while (i < size) {
            int i2 = i + 20;
            ArrayList arrayList2 = new ArrayList(zza.subList(i, i2 > size ? size : i2));
            ArrayList<String> arrayList3 = new ArrayList<>();
            int size2 = arrayList2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                arrayList3.add(((QueryProductDetailsParams.Product) arrayList2.get(i3)).zza());
            }
            Bundle bundle = new Bundle();
            bundle.putStringArrayList("ITEM_ID_LIST", arrayList3);
            bundle.putString("playBillingLibraryVersion", this.zzc);
            try {
                synchronized (this.zza) {
                    zzanVar = this.zzh;
                }
                if (zzanVar == null) {
                    return zzaO(zzcj.zzm, 119, "Service has been reset to null.", null);
                }
                boolean z = true;
                int i4 = true != this.zzx ? 17 : 20;
                String packageName = this.zzf.getPackageName();
                boolean zzaM = zzaM();
                String str = this.zzc;
                zzaB(queryProductDetailsParams);
                zzaB(queryProductDetailsParams);
                zzaB(queryProductDetailsParams);
                zzaB(queryProductDetailsParams);
                long longValue = this.zzF.longValue();
                Bundle bundle2 = new Bundle();
                com.google.android.gms.internal.play_billing.zze.zzc(bundle2, str, longValue);
                bundle2.putBoolean("enablePendingPurchases", true);
                bundle2.putString("SKU_DETAILS_RESPONSE_FORMAT", "PRODUCT_DETAILS");
                if (zzaM) {
                    bundle2.putBoolean("enablePendingPurchaseForSubscriptions", true);
                }
                ArrayList<String> arrayList4 = new ArrayList<>();
                ArrayList<String> arrayList5 = new ArrayList<>();
                int size3 = arrayList2.size();
                int i5 = 0;
                boolean z2 = false;
                boolean z3 = false;
                while (i5 < size3) {
                    QueryProductDetailsParams.Product product = (QueryProductDetailsParams.Product) arrayList2.get(i5);
                    boolean z4 = z;
                    arrayList4.add(null);
                    z2 |= !TextUtils.isEmpty(null);
                    String zzb2 = product.zzb();
                    com.google.android.gms.internal.play_billing.zzan zzanVar2 = zzanVar;
                    if (zzb2.equals("first_party")) {
                        com.google.android.gms.internal.play_billing.zzbe.zzc(null, "Serialized DocId is required for constructing ExtraParams to query ProductDetails for all first party products.");
                        arrayList5.add(null);
                        z3 = z4;
                    }
                    i5++;
                    zzanVar = zzanVar2;
                    z = z4;
                }
                com.google.android.gms.internal.play_billing.zzan zzanVar3 = zzanVar;
                if (z2) {
                    bundle2.putStringArrayList("SKU_OFFER_ID_TOKEN_LIST", arrayList4);
                }
                if (!arrayList5.isEmpty()) {
                    bundle2.putStringArrayList("SKU_SERIALIZED_DOCID_LIST", arrayList5);
                }
                if (z3 && !TextUtils.isEmpty(null)) {
                    bundle2.putString("accountName", null);
                }
                Bundle zzl = zzanVar3.zzl(i4, packageName, zzb, bundle, bundle2);
                if (zzl == null) {
                    return zzaO(zzcj.zzC, 44, "queryProductDetailsAsync got empty product details response.", null);
                }
                if (!zzl.containsKey("DETAILS_LIST")) {
                    int zzb3 = com.google.android.gms.internal.play_billing.zze.zzb(zzl, "BillingClient");
                    String zzh = com.google.android.gms.internal.play_billing.zze.zzh(zzl, "BillingClient");
                    return zzb3 != 0 ? zzaO(zzcj.zza(zzb3, zzh), 23, android.support.v4.media.a.a(zzb3, "getSkuDetails() failed for queryProductDetailsAsync. Response code: "), null) : zzaO(zzcj.zza(6, zzh), 45, "getSkuDetails() returned a bundle with neither an error nor a product detail list for queryProductDetailsAsync.", null);
                }
                ArrayList<String> stringArrayList = zzl.getStringArrayList("DETAILS_LIST");
                if (stringArrayList == null) {
                    return zzaO(zzcj.zzC, 46, "queryProductDetailsAsync got null response list", null);
                }
                for (int i6 = 0; i6 < stringArrayList.size(); i6++) {
                    try {
                        ProductDetails productDetails = new ProductDetails(stringArrayList.get(i6));
                        com.google.android.gms.internal.play_billing.zze.zzk("BillingClient", "Got product details: ".concat(productDetails.toString()));
                        arrayList.add(productDetails);
                    } catch (JSONException e) {
                        return zzaO(zzcj.zza(6, "Error trying to decode SkuDetails."), 47, "Got a JSON exception trying to decode ProductDetails. \n Exception: ", e);
                    }
                }
                i = i2;
            } catch (DeadObjectException e2) {
                return zzaO(zzcj.zzm, 43, "queryProductDetailsAsync got a remote exception (try to reconnect).", e2);
            } catch (Exception e3) {
                return zzaO(zzcj.zzk, 43, "queryProductDetailsAsync got a remote exception (try to reconnect).", e3);
            }
        }
        return new zzbj(0, "", arrayList);
    }

    public final zzch zzk() {
        return this.zzg;
    }

    public final BillingResult zzm(final BillingResult billingResult) {
        if (Thread.interrupted()) {
            return billingResult;
        }
        this.zzd.post(new Runnable() { // from class: com.android.billingclient.api.zzp
            @Override // java.lang.Runnable
            public final void run() {
                BillingClientImpl.this.zzac(billingResult);
            }
        });
        return billingResult;
    }

    @VisibleForTesting
    public final zzdc zzn(String str, List list, @Nullable String str2) {
        com.google.android.gms.internal.play_billing.zzan zzanVar;
        Bundle zzk;
        ArrayList arrayList = new ArrayList();
        int size = list.size();
        int i = 0;
        while (i < size) {
            int i2 = i + 20;
            ArrayList<String> arrayList2 = new ArrayList<>(list.subList(i, i2 > size ? size : i2));
            Bundle bundle = new Bundle();
            bundle.putStringArrayList("ITEM_ID_LIST", arrayList2);
            bundle.putString("playBillingLibraryVersion", this.zzc);
            try {
                synchronized (this.zza) {
                    zzanVar = this.zzh;
                }
                if (zzanVar == null) {
                    return zzaS(zzcj.zzm, 119, "Service has been reset to null.", null);
                }
                if (this.zzp) {
                    String packageName = this.zzf.getPackageName();
                    int i3 = this.zzl;
                    boolean isEnabledForOneTimeProducts = this.zzB.isEnabledForOneTimeProducts();
                    boolean zzaM = zzaM();
                    String str3 = this.zzc;
                    long longValue = this.zzF.longValue();
                    Bundle bundle2 = new Bundle();
                    if (i3 >= 9) {
                        com.google.android.gms.internal.play_billing.zze.zzc(bundle2, str3, longValue);
                    }
                    if (i3 >= 9 && isEnabledForOneTimeProducts) {
                        bundle2.putBoolean("enablePendingPurchases", true);
                    }
                    if (zzaM) {
                        bundle2.putBoolean("enablePendingPurchaseForSubscriptions", true);
                    }
                    zzk = zzanVar.zzl(10, packageName, str, bundle, bundle2);
                } else {
                    zzk = zzanVar.zzk(3, this.zzf.getPackageName(), str, bundle);
                }
                if (zzk == null) {
                    return zzaS(zzcj.zzC, 44, "querySkuDetailsAsync got null sku details list", null);
                }
                if (!zzk.containsKey("DETAILS_LIST")) {
                    int zzb = com.google.android.gms.internal.play_billing.zze.zzb(zzk, "BillingClient");
                    String zzh = com.google.android.gms.internal.play_billing.zze.zzh(zzk, "BillingClient");
                    return zzb != 0 ? zzaS(zzcj.zza(zzb, zzh), 23, android.support.v4.media.a.a(zzb, "getSkuDetails() failed. Response code: "), null) : zzaS(zzcj.zza(6, zzh), 45, "getSkuDetails() returned a bundle with neither an error nor a detail list.", null);
                }
                ArrayList<String> stringArrayList = zzk.getStringArrayList("DETAILS_LIST");
                if (stringArrayList == null) {
                    return zzaS(zzcj.zzC, 46, "querySkuDetailsAsync got null response list", null);
                }
                for (int i4 = 0; i4 < stringArrayList.size(); i4++) {
                    try {
                        SkuDetails skuDetails = new SkuDetails(stringArrayList.get(i4));
                        com.google.android.gms.internal.play_billing.zze.zzk("BillingClient", "Got sku details: ".concat(skuDetails.toString()));
                        arrayList.add(skuDetails);
                    } catch (JSONException e) {
                        return zzaS(zzcj.zza(6, "Error trying to decode SkuDetails."), 47, "Got a JSON exception trying to decode SkuDetails.", e);
                    }
                }
                i = i2;
            } catch (DeadObjectException e2) {
                return zzaS(zzcj.zzm, 43, "querySkuDetailsAsync got a remote exception (try to reconnect).", e2);
            } catch (Exception e3) {
                return zzaS(zzcj.zzk, 43, "querySkuDetailsAsync got a remote exception (try to reconnect).", e3);
            }
        }
        return new zzdc(0, "", arrayList);
    }

    public final synchronized zzev zzp() {
        try {
            if (this.zzE == null) {
                this.zzE = zzfb.zza(zzaD());
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.zzE;
    }

    public final /* synthetic */ Object zzs(AcknowledgePurchaseResponseListener acknowledgePurchaseResponseListener, AcknowledgePurchaseParams acknowledgePurchaseParams) throws Exception {
        com.google.android.gms.internal.play_billing.zzan zzanVar;
        try {
            synchronized (this.zza) {
                zzanVar = this.zzh;
            }
            if (zzanVar == null) {
                zzaU(acknowledgePurchaseResponseListener, zzcj.zzm, 119, null);
                return null;
            }
            String packageName = this.zzf.getPackageName();
            String purchaseToken = acknowledgePurchaseParams.getPurchaseToken();
            String str = this.zzc;
            long longValue = this.zzF.longValue();
            Bundle bundle = new Bundle();
            com.google.android.gms.internal.play_billing.zze.zzc(bundle, str, longValue);
            Bundle zzd = zzanVar.zzd(9, packageName, purchaseToken, bundle);
            acknowledgePurchaseResponseListener.onAcknowledgePurchaseResponse(zzcj.zza(com.google.android.gms.internal.play_billing.zze.zzb(zzd, "BillingClient"), com.google.android.gms.internal.play_billing.zze.zzh(zzd, "BillingClient")));
            return null;
        } catch (DeadObjectException e) {
            zzaU(acknowledgePurchaseResponseListener, zzcj.zzm, 28, e);
            return null;
        } catch (Exception e2) {
            zzaU(acknowledgePurchaseResponseListener, zzcj.zzk, 28, e2);
            return null;
        }
    }

    public final /* synthetic */ Object zzt(ConsumeParams consumeParams, ConsumeResponseListener consumeResponseListener) throws Exception {
        zzaE(consumeParams, consumeResponseListener);
        return null;
    }

    public final /* synthetic */ Object zzu(BillingConfigResponseListener billingConfigResponseListener) throws Exception {
        com.google.android.gms.internal.play_billing.zzan zzanVar;
        try {
            synchronized (this.zza) {
                zzanVar = this.zzh;
            }
            if (zzanVar == null) {
                zzbb(billingConfigResponseListener, zzcj.zzm, 119, null);
            } else {
                String packageName = this.zzf.getPackageName();
                String str = this.zzc;
                long longValue = this.zzF.longValue();
                Bundle bundle = new Bundle();
                com.google.android.gms.internal.play_billing.zze.zzc(bundle, str, longValue);
                zzanVar.zzp(18, packageName, bundle, new zzbe(billingConfigResponseListener, this.zzg, this.zzl, null));
            }
        } catch (DeadObjectException e) {
            zzbb(billingConfigResponseListener, zzcj.zzm, 62, e);
        } catch (Exception e2) {
            zzbb(billingConfigResponseListener, zzcj.zzk, 62, e2);
        }
        return null;
    }

    public final /* synthetic */ Object zzv(Bundle bundle, Activity activity, ResultReceiver resultReceiver) throws Exception {
        com.google.android.gms.internal.play_billing.zzan zzanVar;
        try {
            synchronized (this.zza) {
                zzanVar = this.zzh;
            }
            if (zzanVar == null) {
                zzbd(-1, 119, null);
            } else {
                zzanVar.zzt(12, this.zzf.getPackageName(), bundle, new zzbi(new WeakReference(activity), resultReceiver, null));
            }
        } catch (DeadObjectException e) {
            zzbd(-1, 118, e);
        } catch (Exception e2) {
            zzbd(6, 118, e2);
        }
        return null;
    }

    public final /* synthetic */ Void zzx(AlternativeBillingOnlyReportingDetailsListener alternativeBillingOnlyReportingDetailsListener) throws Exception {
        com.google.android.gms.internal.play_billing.zzan zzanVar;
        try {
            synchronized (this.zza) {
                zzanVar = this.zzh;
            }
            if (zzanVar == null) {
                zzaX(alternativeBillingOnlyReportingDetailsListener, zzcj.zzm, 119, null);
            } else {
                zzanVar.zzm(21, this.zzf.getPackageName(), com.google.android.gms.internal.play_billing.zze.zze(this.zzc, this.zzF.longValue()), new zzbb(alternativeBillingOnlyReportingDetailsListener, this.zzg, this.zzl, null));
            }
        } catch (DeadObjectException e) {
            zzaX(alternativeBillingOnlyReportingDetailsListener, zzcj.zzm, 70, e);
        } catch (Exception e2) {
            zzaX(alternativeBillingOnlyReportingDetailsListener, zzcj.zzk, 70, e2);
        }
        return null;
    }

    public final /* synthetic */ Void zzy(ExternalOfferReportingDetailsListener externalOfferReportingDetailsListener) throws Exception {
        com.google.android.gms.internal.play_billing.zzan zzanVar;
        try {
            synchronized (this.zza) {
                zzanVar = this.zzh;
            }
            if (zzanVar == null) {
                zzaY(externalOfferReportingDetailsListener, zzcj.zzm, 119, null);
            } else {
                zzanVar.zzn(22, this.zzf.getPackageName(), com.google.android.gms.internal.play_billing.zze.zze(this.zzc, this.zzF.longValue()), new zzbc(externalOfferReportingDetailsListener, this.zzg, this.zzl, null));
            }
        } catch (DeadObjectException e) {
            zzaY(externalOfferReportingDetailsListener, zzcj.zzm, 94, e);
        } catch (Exception e2) {
            zzaY(externalOfferReportingDetailsListener, zzcj.zzk, 94, e2);
        }
        return null;
    }

    public final /* synthetic */ Void zzz(AlternativeBillingOnlyAvailabilityListener alternativeBillingOnlyAvailabilityListener) throws Exception {
        com.google.android.gms.internal.play_billing.zzan zzanVar;
        try {
            synchronized (this.zza) {
                zzanVar = this.zzh;
            }
            if (zzanVar == null) {
                zzaV(alternativeBillingOnlyAvailabilityListener, zzcj.zzm, 119, null);
            } else {
                zzanVar.zzr(21, this.zzf.getPackageName(), com.google.android.gms.internal.play_billing.zze.zze(this.zzc, this.zzF.longValue()), new zzbg(alternativeBillingOnlyAvailabilityListener, this.zzg, this.zzl, null));
            }
        } catch (DeadObjectException e) {
            zzaV(alternativeBillingOnlyAvailabilityListener, zzcj.zzm, 69, e);
        } catch (Exception e2) {
            zzaV(alternativeBillingOnlyAvailabilityListener, zzcj.zzk, 69, e2);
        }
        return null;
    }

    @Override // com.android.billingclient.api.BillingClient
    public final void queryPurchaseHistoryAsync(String str, PurchaseHistoryResponseListener purchaseHistoryResponseListener) {
        zzaH(str, purchaseHistoryResponseListener);
    }

    @Override // com.android.billingclient.api.BillingClient
    public final void queryPurchasesAsync(String str, PurchasesResponseListener purchasesResponseListener) {
        zzaI(str, purchasesResponseListener);
    }

    @Override // com.android.billingclient.api.BillingClient
    public void startConnection(BillingClientStateListener billingClientStateListener) {
        BillingResult billingResult;
        synchronized (this.zza) {
            try {
                if (isReady()) {
                    billingResult = zzaz();
                } else if (this.zzb == 1) {
                    com.google.android.gms.internal.play_billing.zze.zzl("BillingClient", "Client is already in the process of connecting to billing service.");
                    billingResult = zzcj.zze;
                    zzbe(37, 6, billingResult);
                } else if (this.zzb == 3) {
                    com.google.android.gms.internal.play_billing.zze.zzl("BillingClient", "Client was already closed and can't be reused. Please create another instance.");
                    billingResult = zzcj.zzm;
                    zzbe(38, 6, billingResult);
                } else {
                    zzaJ(1);
                    zzaL();
                    com.google.android.gms.internal.play_billing.zze.zzk("BillingClient", "Starting in-app billing setup.");
                    this.zzi = new zzba(this, billingClientStateListener, null);
                    Intent intent = new Intent("com.android.vending.billing.InAppBillingService.BIND");
                    intent.setPackage("com.android.vending");
                    List<ResolveInfo> queryIntentServices = this.zzf.getPackageManager().queryIntentServices(intent, 0);
                    int i = 41;
                    if (queryIntentServices != null && !queryIntentServices.isEmpty()) {
                        ServiceInfo serviceInfo = queryIntentServices.get(0).serviceInfo;
                        i = 40;
                        if (serviceInfo != null) {
                            String str = serviceInfo.packageName;
                            String str2 = serviceInfo.name;
                            if (!Objects.equals(str, "com.android.vending") || str2 == null) {
                                com.google.android.gms.internal.play_billing.zze.zzl("BillingClient", "The device doesn't have valid Play Store.");
                            } else {
                                ComponentName componentName = new ComponentName(str, str2);
                                Intent intent2 = new Intent(intent);
                                intent2.setComponent(componentName);
                                intent2.putExtra("playBillingLibraryVersion", this.zzc);
                                synchronized (this.zza) {
                                    try {
                                        if (this.zzb == 2) {
                                            billingResult = zzaz();
                                        } else if (this.zzb != 1) {
                                            com.google.android.gms.internal.play_billing.zze.zzl("BillingClient", "Client state no longer CONNECTING, returning service disconnected.");
                                            billingResult = zzcj.zzm;
                                            zzbe(117, 6, billingResult);
                                        } else {
                                            zzba zzbaVar = this.zzi;
                                            if (this.zzf.bindService(intent2, zzbaVar, 1)) {
                                                com.google.android.gms.internal.play_billing.zze.zzk("BillingClient", "Service was bonded successfully.");
                                                billingResult = null;
                                            } else {
                                                com.google.android.gms.internal.play_billing.zze.zzl("BillingClient", "Connection to Billing service is blocked.");
                                                i = 39;
                                            }
                                        }
                                    } finally {
                                    }
                                }
                            }
                        } else {
                            com.google.android.gms.internal.play_billing.zze.zzl("BillingClient", "The device doesn't have valid Play Store.");
                        }
                    }
                    zzaJ(0);
                    com.google.android.gms.internal.play_billing.zze.zzk("BillingClient", "Billing service unavailable on device.");
                    billingResult = zzcj.zzc;
                    zzbe(i, 6, billingResult);
                }
            } finally {
            }
        }
        if (billingResult != null) {
            billingClientStateListener.onBillingSetupFinished(billingResult);
        }
    }

    @AnyThread
    private BillingClientImpl(Context context, PendingPurchasesParams pendingPurchasesParams, PurchasesUpdatedListener purchasesUpdatedListener, String str, String str2, @Nullable UserChoiceBillingListener userChoiceBillingListener, @Nullable zzch zzchVar, @Nullable ExecutorService executorService) {
        this.zza = new Object();
        this.zzb = 0;
        this.zzd = new Handler(Looper.getMainLooper());
        this.zzl = 0;
        this.zzF = Long.valueOf(new Random().nextLong());
        this.zzc = str;
        initialize(context, purchasesUpdatedListener, pendingPurchasesParams, userChoiceBillingListener, str, (zzch) null);
    }

    private BillingClientImpl(String str) {
        this.zza = new Object();
        this.zzb = 0;
        this.zzd = new Handler(Looper.getMainLooper());
        this.zzl = 0;
        this.zzF = Long.valueOf(new Random().nextLong());
        this.zzc = str;
    }

    @AnyThread
    public BillingClientImpl(@Nullable String str, Context context, @Nullable zzch zzchVar, @Nullable ExecutorService executorService) {
        this.zza = new Object();
        this.zzb = 0;
        this.zzd = new Handler(Looper.getMainLooper());
        this.zzl = 0;
        Long valueOf = Long.valueOf(new Random().nextLong());
        this.zzF = valueOf;
        String zzaC = zzaC();
        this.zzc = zzaC;
        this.zzf = context.getApplicationContext();
        zzks zzc = zzku.zzc();
        zzc.zzo(zzaC);
        zzc.zzn(this.zzf.getPackageName());
        zzc.zzm(valueOf.longValue());
        this.zzg = new zzcl(this.zzf, (zzku) zzc.zzf());
        this.zzf.getPackageName();
    }

    private void initialize(Context context, PurchasesUpdatedListener purchasesUpdatedListener, PendingPurchasesParams pendingPurchasesParams, @Nullable UserChoiceBillingListener userChoiceBillingListener, String str, @Nullable zzch zzchVar) {
        this.zzf = context.getApplicationContext();
        zzks zzc = zzku.zzc();
        zzc.zzo(str);
        zzc.zzn(this.zzf.getPackageName());
        zzc.zzm(this.zzF.longValue());
        if (zzchVar != null) {
            this.zzg = zzchVar;
        } else {
            this.zzg = new zzcl(this.zzf, (zzku) zzc.zzf());
        }
        if (purchasesUpdatedListener == null) {
            com.google.android.gms.internal.play_billing.zze.zzl("BillingClient", "Billing client should have a valid listener but the provided is null.");
        }
        this.zze = new zzn(this.zzf, purchasesUpdatedListener, null, null, userChoiceBillingListener, this.zzg);
        this.zzB = pendingPurchasesParams;
        this.zzC = userChoiceBillingListener != null;
    }

    @AnyThread
    public BillingClientImpl(@Nullable String str, PendingPurchasesParams pendingPurchasesParams, Context context, zzco zzcoVar, @Nullable zzch zzchVar, @Nullable ExecutorService executorService) {
        this.zza = new Object();
        this.zzb = 0;
        this.zzd = new Handler(Looper.getMainLooper());
        this.zzl = 0;
        Long valueOf = Long.valueOf(new Random().nextLong());
        this.zzF = valueOf;
        this.zzc = zzaC();
        this.zzf = context.getApplicationContext();
        zzks zzc = zzku.zzc();
        zzc.zzo(zzaC());
        zzc.zzn(this.zzf.getPackageName());
        zzc.zzm(valueOf.longValue());
        this.zzg = new zzcl(this.zzf, (zzku) zzc.zzf());
        com.google.android.gms.internal.play_billing.zze.zzl("BillingClient", "Billing client should have a valid listener but the provided is null.");
        this.zze = new zzn(this.zzf, null, null, null, null, this.zzg);
        this.zzB = pendingPurchasesParams;
        this.zzf.getPackageName();
    }

    @AnyThread
    public BillingClientImpl(@Nullable String str, PendingPurchasesParams pendingPurchasesParams, Context context, PurchasesUpdatedListener purchasesUpdatedListener, @Nullable zzb zzbVar, @Nullable zzch zzchVar, @Nullable ExecutorService executorService) {
        String zzaC = zzaC();
        this.zza = new Object();
        this.zzb = 0;
        this.zzd = new Handler(Looper.getMainLooper());
        this.zzl = 0;
        this.zzF = Long.valueOf(new Random().nextLong());
        this.zzc = zzaC;
        initialize(context, purchasesUpdatedListener, pendingPurchasesParams, (zzb) null, zzaC, (zzch) null);
    }

    @AnyThread
    public BillingClientImpl(@Nullable String str, PendingPurchasesParams pendingPurchasesParams, Context context, PurchasesUpdatedListener purchasesUpdatedListener, @Nullable UserChoiceBillingListener userChoiceBillingListener, @Nullable zzch zzchVar, @Nullable ExecutorService executorService) {
        this(context, pendingPurchasesParams, purchasesUpdatedListener, zzaC(), null, userChoiceBillingListener, null, null);
    }
}
