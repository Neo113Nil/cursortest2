package com.paypal.oslo.feature.smartroute.data.repository;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
final /* synthetic */ class GraphQLAutoReloadRepository$setupAutoReload$5$1 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function1<com.paypal.oslo.feature.smartroute.domain.error.AutoReloadError, kotlin.Pair<? extends java.lang.String, ? extends java.lang.String>> {
    public static final com.paypal.oslo.feature.smartroute.data.repository.GraphQLAutoReloadRepository$setupAutoReload$5$1 getHighSpeedVideoFpsRangesFor = new com.paypal.oslo.feature.smartroute.data.repository.GraphQLAutoReloadRepository$setupAutoReload$5$1();

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ kotlin.Pair<? extends java.lang.String, ? extends java.lang.String> invoke(com.paypal.oslo.feature.smartroute.domain.error.AutoReloadError autoReloadError) {
        com.paypal.oslo.feature.smartroute.domain.error.AutoReloadError autoReloadError2 = autoReloadError;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(autoReloadError2, "");
        return com.paypal.oslo.feature.smartroute.analytics.SmartRouteApiTrackerKt.toTrackingAttributes(autoReloadError2);
    }

    GraphQLAutoReloadRepository$setupAutoReload$5$1() {
        super(1, com.paypal.oslo.feature.smartroute.analytics.SmartRouteApiTrackerKt.class, "toTrackingAttributes", "toTrackingAttributes(Lcom/paypal/oslo/feature/smartroute/domain/error/AutoReloadError;)Lkotlin/Pair;", 1);
    }
}
