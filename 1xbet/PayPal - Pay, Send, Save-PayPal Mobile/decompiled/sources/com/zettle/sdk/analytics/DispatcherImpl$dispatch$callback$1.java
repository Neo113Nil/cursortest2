package com.zettle.sdk.analytics;

@kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes16.dex */
final /* synthetic */ class DispatcherImpl$dispatch$callback$1 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function1<com.zettle.sdk.analytics.DispatcherImpl.Action, kotlin.Unit> {
    public final void getHighResolutionOutputSizeshNQ4ISI(com.zettle.sdk.analytics.DispatcherImpl.Action action) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(action, "");
        r0.getHighSpeedVideoFpsRangesFor.post(new com.zettle.sdk.analytics.DispatcherImpl$action$1((com.zettle.sdk.analytics.DispatcherImpl) this.receiver, action));
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ kotlin.Unit invoke(com.zettle.sdk.analytics.DispatcherImpl.Action action) {
        getHighResolutionOutputSizeshNQ4ISI(action);
        return kotlin.Unit.INSTANCE;
    }

    DispatcherImpl$dispatch$callback$1(java.lang.Object obj) {
        super(1, obj, com.zettle.sdk.analytics.DispatcherImpl.class, "action", "action(Lcom/zettle/sdk/analytics/DispatcherImpl$Action;)V", 0);
    }
}
