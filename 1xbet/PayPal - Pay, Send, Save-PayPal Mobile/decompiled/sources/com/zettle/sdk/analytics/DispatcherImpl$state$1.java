package com.zettle.sdk.analytics;

@kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes16.dex */
final /* synthetic */ class DispatcherImpl$state$1 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function2<com.zettle.sdk.analytics.Dispatcher.State, com.zettle.sdk.analytics.Dispatcher.State, kotlin.Unit> {
    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ kotlin.Unit invoke(com.zettle.sdk.analytics.Dispatcher.State state, com.zettle.sdk.analytics.Dispatcher.State state2) {
        com.zettle.sdk.analytics.Dispatcher.State state3 = state;
        com.zettle.sdk.analytics.Dispatcher.State state4 = state2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(state3, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(state4, "");
        ((com.zettle.sdk.analytics.DispatcherImpl) this.receiver).mutate$core_publicRelease(state3, state4);
        return kotlin.Unit.INSTANCE;
    }

    DispatcherImpl$state$1(java.lang.Object obj) {
        super(2, obj, com.zettle.sdk.analytics.DispatcherImpl.class, "mutate", "mutate$core_publicRelease(Lcom/zettle/sdk/analytics/Dispatcher$State;Lcom/zettle/sdk/analytics/Dispatcher$State;)V", 0);
    }
}
