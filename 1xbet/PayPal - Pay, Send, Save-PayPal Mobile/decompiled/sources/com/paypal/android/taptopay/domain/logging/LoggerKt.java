package com.paypal.android.taptopay.domain.logging;

@kotlin.Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u001a\u0010\u0001\u001a\u00020\u00008\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u0001\u0010\u0002\u001a\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/paypal/android/logger/Logger;", "log", "Lcom/paypal/android/logger/Logger;", "getLog", "()Lcom/paypal/android/logger/Logger;"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class LoggerKt {
    private static final com.paypal.android.logger.Logger log = new com.paypal.android.logger.Logger("TapToPay", null, kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.paypal.oslo.feature.p2p.analytics.P2pReviewAnalytics.FEATURE_MODULE, "domain")), 2, null);

    public static final com.paypal.android.logger.Logger getLog() {
        return log;
    }
}
