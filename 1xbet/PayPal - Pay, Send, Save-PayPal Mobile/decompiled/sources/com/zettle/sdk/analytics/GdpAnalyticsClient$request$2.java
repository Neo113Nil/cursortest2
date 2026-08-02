package com.zettle.sdk.analytics;

@kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes16.dex */
final /* synthetic */ class GdpAnalyticsClient$request$2 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function1<java.lang.Throwable, kotlin.Unit> {
    public final void getHighSpeedVideoFpsRanges(java.lang.Throwable th) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(th, "");
        ((com.zettle.sdk.analytics.CallbackWrapper) this.receiver).onFailure(th);
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ kotlin.Unit invoke(java.lang.Throwable th) {
        getHighSpeedVideoFpsRanges(th);
        return kotlin.Unit.INSTANCE;
    }

    GdpAnalyticsClient$request$2(java.lang.Object obj) {
        super(1, obj, com.zettle.sdk.analytics.CallbackWrapper.class, "onFailure", "onFailure(Ljava/lang/Throwable;)V", 0);
    }
}
