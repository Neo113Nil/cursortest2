package com.zettle.sdk.analytics;

@kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes16.dex */
final /* synthetic */ class HerdAnalyticsClient$request$2 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function1<java.lang.Throwable, kotlin.Unit> {
    public final void getHighSpeedVideoSizes(java.lang.Throwable th) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(th, "");
        ((com.zettle.sdk.analytics.CallbackWrapper) this.receiver).onFailure(th);
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ kotlin.Unit invoke(java.lang.Throwable th) {
        getHighSpeedVideoSizes(th);
        return kotlin.Unit.INSTANCE;
    }

    HerdAnalyticsClient$request$2(java.lang.Object obj) {
        super(1, obj, com.zettle.sdk.analytics.CallbackWrapper.class, "onFailure", "onFailure(Ljava/lang/Throwable;)V", 0);
    }
}
