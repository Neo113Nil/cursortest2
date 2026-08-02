package com.paypal.oslo.feature.subscriptions.analytics.shared;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001e\u0010\u0002\u001a\u0004\u0018\u00018\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\u0080\b¢\u0006\u0004\b\u0002\u0010\u0003\"\"\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00000\u00048\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/analytics/shared/CommonScreenAnalytics;", "T", "rememberSubscriptionAnalyticsProvider", "(Landroidx/compose/runtime/Composer;I)Lcom/paypal/oslo/feature/subscriptions/analytics/shared/CommonScreenAnalytics;", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "LocalScreenAnalytics", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "getLocalScreenAnalytics", "()Landroidx/compose/runtime/ProvidableCompositionLocal;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class AnalyticsCompositionLocalKt {
    private static final androidx.compose.runtime.ProvidableCompositionLocal<com.paypal.oslo.feature.subscriptions.analytics.shared.CommonScreenAnalytics> LocalScreenAnalytics = androidx.compose.runtime.CompositionLocalKt.compositionLocalOf$default(null, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.subscriptions.analytics.shared.AnalyticsCompositionLocalKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return com.paypal.oslo.feature.subscriptions.analytics.shared.AnalyticsCompositionLocalKt.$r8$lambda$2ebYz0bQvRgAjRJXYMe20cxEy2w();
        }
    }, 1, null);

    public static /* synthetic */ com.paypal.oslo.feature.subscriptions.analytics.shared.CommonScreenAnalytics $r8$lambda$2ebYz0bQvRgAjRJXYMe20cxEy2w() {
        return null;
    }

    public static final androidx.compose.runtime.ProvidableCompositionLocal<com.paypal.oslo.feature.subscriptions.analytics.shared.CommonScreenAnalytics> getLocalScreenAnalytics() {
        return LocalScreenAnalytics;
    }

    public static final /* synthetic */ <T extends com.paypal.oslo.feature.subscriptions.analytics.shared.CommonScreenAnalytics> T rememberSubscriptionAnalyticsProvider(androidx.compose.runtime.Composer composer, int i) {
        java.lang.String str;
        java.lang.Object consume = composer.consume(getLocalScreenAnalytics());
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(3, "T");
        if (!(consume instanceof com.paypal.oslo.feature.subscriptions.analytics.shared.CommonScreenAnalytics)) {
            composer.startReplaceGroup(-1571993001);
            com.paypal.android.logger.Logger logger = com.paypal.oslo.feature.subscriptions.LoggerKt.log;
            kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(4, "T");
            java.lang.String simpleName = com.paypal.oslo.feature.subscriptions.analytics.shared.CommonScreenAnalytics.class.getSimpleName();
            com.paypal.oslo.feature.subscriptions.analytics.shared.CommonScreenAnalytics commonScreenAnalytics = (com.paypal.oslo.feature.subscriptions.analytics.shared.CommonScreenAnalytics) composer.consume(getLocalScreenAnalytics());
            if (commonScreenAnalytics == null || (str = commonScreenAnalytics.getClass().getSimpleName()) == null) {
                str = "null";
            }
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Requested analytics of type ");
            sb.append(simpleName);
            sb.append(" but current analytics is of type ");
            sb.append(str);
            sb.append(". Returning null.");
            com.paypal.android.logger.Logger.w$default(logger, sb.toString(), null, null, 6, null);
            composer.endReplaceGroup();
            return null;
        }
        composer.startReplaceGroup(-1572055156);
        java.lang.Object consume2 = composer.consume(getLocalScreenAnalytics());
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(2, "T");
        T t = (T) consume2;
        composer.endReplaceGroup();
        return t;
    }
}
