package com.paypal.android.taptopay.data.thales.logging;

@kotlin.Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u001a\u0010\u0001\u001a\u00020\u00008\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u0001\u0010\u0002\u001a\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/paypal/android/logger/Logger;", "log", "Lcom/paypal/android/logger/Logger;", "getLog", "()Lcom/paypal/android/logger/Logger;"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class LoggerKt {
    private static final com.paypal.android.logger.Logger log = new com.paypal.android.logger.Logger("TapToPay", kotlin.collections.CollectionsKt.listOf(new com.paypal.android.logger.LogHandler() { // from class: com.paypal.android.taptopay.data.thales.logging.LoggerKt$log$1
        @Override // com.paypal.android.logger.LogHandler
        public final void handle(com.paypal.android.logger.Log log2) {
            java.lang.String str;
            com.gemalto.mfs.mwsdk.mobilegateway.MGCardEnrollmentService cardEnrollmentService;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(log2, "");
            java.util.Map<java.lang.String, java.lang.Object> attributes = log2.getAttributes();
            try {
                com.gemalto.mfs.mwsdk.mobilegateway.MobileGatewayManager mobileGatewayManager = com.gemalto.mfs.mwsdk.mobilegateway.MobileGatewayManager.INSTANCE;
                str = (mobileGatewayManager == null || (cardEnrollmentService = mobileGatewayManager.getCardEnrollmentService()) == null) ? null : cardEnrollmentService.getWalletId();
            } catch (java.lang.Throwable unused) {
                str = "NA";
            }
            attributes.put("wid", str);
        }
    }), kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.paypal.oslo.feature.p2p.analytics.P2pReviewAnalytics.FEATURE_MODULE, "data-thales")));

    public static final com.paypal.android.logger.Logger getLog() {
        return log;
    }
}
