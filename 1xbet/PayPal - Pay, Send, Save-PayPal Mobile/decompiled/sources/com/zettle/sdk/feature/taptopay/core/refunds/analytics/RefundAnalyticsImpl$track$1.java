package com.zettle.sdk.feature.taptopay.core.refunds.analytics;

@kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.zettle.sdk.feature.taptopay.core.refunds.analytics.RefundAnalyticsImpl", f = "RefundAnalytics.kt", i = {}, l = {56}, m = "track", n = {}, s = {})
/* loaded from: classes17.dex */
final class RefundAnalyticsImpl$track$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    final /* synthetic */ com.zettle.sdk.feature.taptopay.core.refunds.analytics.RefundAnalyticsImpl Camera2StreamConfigurationMap;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoFpsRanges = obj;
        this.getHighSpeedVideoSizes |= Integer.MIN_VALUE;
        return this.Camera2StreamConfigurationMap.track(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RefundAnalyticsImpl$track$1(com.zettle.sdk.feature.taptopay.core.refunds.analytics.RefundAnalyticsImpl refundAnalyticsImpl, kotlin.coroutines.Continuation<? super com.zettle.sdk.feature.taptopay.core.refunds.analytics.RefundAnalyticsImpl$track$1> continuation) {
        super(continuation);
        this.Camera2StreamConfigurationMap = refundAnalyticsImpl;
    }
}
