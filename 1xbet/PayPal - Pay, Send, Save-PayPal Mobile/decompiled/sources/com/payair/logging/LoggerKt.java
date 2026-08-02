package com.payair.logging;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\"*\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00008\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0002\u0010\u0003\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007\"\u001a\u0010\u000e\u001a\u00020\t8\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r"}, d2 = {"Lkotlin/Function0;", "", "a", "Lkotlin/jvm/functions/Function0;", "getPaymentAppInstanceIdProvider", "()Lkotlin/jvm/functions/Function0;", "setPaymentAppInstanceIdProvider", "(Lkotlin/jvm/functions/Function0;)V", "paymentAppInstanceIdProvider", "Lcom/paypal/android/logger/Logger;", util.h.xy.cb.b.f1091, "Lcom/paypal/android/logger/Logger;", "getLog", "()Lcom/paypal/android/logger/Logger;", "log"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class LoggerKt {

    /* renamed from: a, reason: collision with root package name */
    public static kotlin.jvm.functions.Function0 f4393a;
    public static final com.paypal.android.logger.Logger b = new com.paypal.android.logger.Logger("CSDK", kotlin.collections.CollectionsKt.listOf(new com.paypal.android.logger.LogHandler() { // from class: com.payair.logging.LoggerKt$log$1
        /* JADX WARN: Code restructure failed: missing block: B:6:0x0015, code lost:
        
            if (r0 == null) goto L7;
         */
        @Override // com.paypal.android.logger.LogHandler
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void handle(com.paypal.android.logger.Log log) {
            java.lang.String str;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(log, "");
            java.util.Map<java.lang.String, java.lang.Object> attributes = log.getAttributes();
            try {
                kotlin.jvm.functions.Function0<java.lang.String> paymentAppInstanceIdProvider = com.payair.logging.LoggerKt.getPaymentAppInstanceIdProvider();
                if (paymentAppInstanceIdProvider != null) {
                    str = paymentAppInstanceIdProvider.invoke();
                }
            } catch (java.lang.Throwable unused) {
            }
            str = "UNAVAILABLE";
            attributes.put("PAID", str);
        }
    }), kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.paypal.oslo.feature.p2p.analytics.P2pReviewAnalytics.FEATURE_MODULE, "CSDK")));

    public static final com.paypal.android.logger.Logger getLog() {
        return b;
    }

    public static final kotlin.jvm.functions.Function0<java.lang.String> getPaymentAppInstanceIdProvider() {
        return f4393a;
    }

    public static final void setPaymentAppInstanceIdProvider(kotlin.jvm.functions.Function0<java.lang.String> function0) {
        f4393a = function0;
    }
}
