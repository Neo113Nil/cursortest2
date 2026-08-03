package com.unity3d.ads.core.data.manager;

/* compiled from: TransactionEventManager.kt */
@kotlin.Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 !2\u00020\u0001:\u0001!BW\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0015¢\u0006\u0002\u0010\u0016J\t\u0010\u0017\u001a\u00020\u0018H\u0086\u0002J(\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u001b2\u000e\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u001d2\u0006\u0010\u001f\u001a\u00020 H\u0002R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\""}, d2 = {"Lcom/unity3d/ads/core/data/manager/TransactionEventManager;", "", "scope", "Lkotlinx/coroutines/CoroutineScope;", "billingClientAdapter", "Lcom/unity3d/services/store/gpbl/bridges/billingclient/BillingClientAdapter;", "getTransactionData", "Lcom/unity3d/ads/core/domain/events/GetTransactionData;", "getTransactionRequest", "Lcom/unity3d/ads/core/domain/events/GetTransactionRequest;", "transactionEventRepository", "Lcom/unity3d/ads/core/data/repository/TransactionEventRepository;", "iapTransactionStore", "Lcom/unity3d/ads/core/data/datasource/ByteStringDataSource;", "isBillingClientAvailable", "Lcom/unity3d/ads/core/domain/billing/IsBillingClientAvailable;", "sessionRepository", "Lcom/unity3d/ads/core/data/repository/SessionRepository;", "productDetailsFetcher", "Lcom/unity3d/ads/core/domain/billing/ProductDetailsFetcher;", "logger", "Lcom/unity3d/ads/core/log/Logger;", "(Lkotlinx/coroutines/CoroutineScope;Lcom/unity3d/services/store/gpbl/bridges/billingclient/BillingClientAdapter;Lcom/unity3d/ads/core/domain/events/GetTransactionData;Lcom/unity3d/ads/core/domain/events/GetTransactionRequest;Lcom/unity3d/ads/core/data/repository/TransactionEventRepository;Lcom/unity3d/ads/core/data/datasource/ByteStringDataSource;Lcom/unity3d/ads/core/domain/billing/IsBillingClientAvailable;Lcom/unity3d/ads/core/data/repository/SessionRepository;Lcom/unity3d/ads/core/domain/billing/ProductDetailsFetcher;Lcom/unity3d/ads/core/log/Logger;)V", "invoke", "", "onPurchasesReceived", "billingResult", "Lcom/unity3d/services/store/gpbl/bridges/BillingResultBridge;", org.cocos2dx.bole.amazon.iap.SampleSQLiteHelper.TABLE_PURCHASES, "", "Lcom/unity3d/services/store/gpbl/bridges/PurchaseBridge;", "transactionOrigin", "Lgatewayprotocol/v1/TransactionEventRequestOuterClass$TransactionOrigin;", com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class TransactionEventManager {
    public static final java.lang.String BILLING_SERVICE_UNAVAILABLE = "Billing client is not available";
    private static final java.lang.String INAPP = "inapp";
    private static final java.lang.String SUBS = "subs";
    private final com.unity3d.services.store.gpbl.bridges.billingclient.BillingClientAdapter billingClientAdapter;
    private final com.unity3d.ads.core.domain.events.GetTransactionData getTransactionData;
    private final com.unity3d.ads.core.domain.events.GetTransactionRequest getTransactionRequest;
    private final com.unity3d.ads.core.data.datasource.ByteStringDataSource iapTransactionStore;
    private final com.unity3d.ads.core.domain.billing.IsBillingClientAvailable isBillingClientAvailable;
    private final com.unity3d.ads.core.log.Logger logger;
    private final com.unity3d.ads.core.domain.billing.ProductDetailsFetcher productDetailsFetcher;
    private final kotlinx.coroutines.CoroutineScope scope;
    private final com.unity3d.ads.core.data.repository.SessionRepository sessionRepository;
    private final com.unity3d.ads.core.data.repository.TransactionEventRepository transactionEventRepository;

    public TransactionEventManager(kotlinx.coroutines.CoroutineScope scope, com.unity3d.services.store.gpbl.bridges.billingclient.BillingClientAdapter billingClientAdapter, com.unity3d.ads.core.domain.events.GetTransactionData getTransactionData, com.unity3d.ads.core.domain.events.GetTransactionRequest getTransactionRequest, com.unity3d.ads.core.data.repository.TransactionEventRepository transactionEventRepository, com.unity3d.ads.core.data.datasource.ByteStringDataSource iapTransactionStore, com.unity3d.ads.core.domain.billing.IsBillingClientAvailable isBillingClientAvailable, com.unity3d.ads.core.data.repository.SessionRepository sessionRepository, com.unity3d.ads.core.domain.billing.ProductDetailsFetcher productDetailsFetcher, com.unity3d.ads.core.log.Logger logger) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(scope, "scope");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getTransactionData, "getTransactionData");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getTransactionRequest, "getTransactionRequest");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transactionEventRepository, "transactionEventRepository");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(iapTransactionStore, "iapTransactionStore");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(isBillingClientAvailable, "isBillingClientAvailable");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sessionRepository, "sessionRepository");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(productDetailsFetcher, "productDetailsFetcher");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(logger, "logger");
        this.scope = scope;
        this.billingClientAdapter = billingClientAdapter;
        this.getTransactionData = getTransactionData;
        this.getTransactionRequest = getTransactionRequest;
        this.transactionEventRepository = transactionEventRepository;
        this.iapTransactionStore = iapTransactionStore;
        this.isBillingClientAvailable = isBillingClientAvailable;
        this.sessionRepository = sessionRepository;
        this.productDetailsFetcher = productDetailsFetcher;
        this.logger = logger;
    }

    public final void invoke() {
        if (this.isBillingClientAvailable.invoke() && this.billingClientAdapter != null) {
            kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(this.scope, null, null, new com.unity3d.ads.core.data.manager.TransactionEventManager$invoke$1(this, null), 3, null);
        } else {
            com.unity3d.ads.core.log.Logger.DefaultImpls.trace$default(this.logger, BILLING_SERVICE_UNAVAILABLE, null, 2, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onPurchasesReceived(com.unity3d.services.store.gpbl.bridges.BillingResultBridge billingResult, java.util.List<? extends com.unity3d.services.store.gpbl.bridges.PurchaseBridge> purchases, gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionOrigin transactionOrigin) {
        java.util.List<? extends com.unity3d.services.store.gpbl.bridges.PurchaseBridge> list;
        if (billingResult.getResponseCode() != com.unity3d.services.store.gpbl.BillingResultResponseCode.OK || (list = purchases) == null || list.isEmpty() || this.billingClientAdapter == null) {
            return;
        }
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(this.scope, null, null, new com.unity3d.ads.core.data.manager.TransactionEventManager$onPurchasesReceived$1(purchases, this, transactionOrigin, null), 3, null);
    }
}
