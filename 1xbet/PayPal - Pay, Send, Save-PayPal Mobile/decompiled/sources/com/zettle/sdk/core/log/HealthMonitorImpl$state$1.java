package com.zettle.sdk.core.log;

@kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes17.dex */
final /* synthetic */ class HealthMonitorImpl$state$1 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function2<com.zettle.sdk.core.log.HealthMonitorImpl.State, com.zettle.sdk.core.log.HealthMonitorImpl.State, kotlin.Unit> {
    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ kotlin.Unit invoke(com.zettle.sdk.core.log.HealthMonitorImpl.State state, com.zettle.sdk.core.log.HealthMonitorImpl.State state2) {
        com.zettle.sdk.core.log.HealthMonitorImpl.State state3 = state;
        com.zettle.sdk.core.log.HealthMonitorImpl.State state4 = state2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(state3, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(state4, "");
        ((com.zettle.sdk.core.log.HealthMonitorImpl) this.receiver).mutate$core_publicRelease(state3, state4);
        return kotlin.Unit.INSTANCE;
    }

    HealthMonitorImpl$state$1(java.lang.Object obj) {
        super(2, obj, com.zettle.sdk.core.log.HealthMonitorImpl.class, "mutate", "mutate$core_publicRelease(Lcom/zettle/sdk/core/log/HealthMonitorImpl$State;Lcom/zettle/sdk/core/log/HealthMonitorImpl$State;)V", 0);
    }
}
