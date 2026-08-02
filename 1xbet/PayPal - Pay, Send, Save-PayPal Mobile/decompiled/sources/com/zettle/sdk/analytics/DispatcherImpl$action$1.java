package com.zettle.sdk.analytics;

@kotlin.Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "getHighSpeedVideoSizes", "()V"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes16.dex */
final class DispatcherImpl$action$1 extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function0<kotlin.Unit> {
    final /* synthetic */ com.zettle.sdk.analytics.DispatcherImpl.Action $Camera2StreamConfigurationMap;
    final /* synthetic */ com.zettle.sdk.analytics.DispatcherImpl getHighResolutionOutputSizeshNQ4ISI;

    @Override // kotlin.jvm.functions.Function0
    public final /* synthetic */ kotlin.Unit invoke() {
        getHighSpeedVideoSizes();
        return kotlin.Unit.INSTANCE;
    }

    public final void getHighSpeedVideoSizes() {
        com.zettle.sdk.commons.state.MutableState<com.zettle.sdk.analytics.Dispatcher.State> state = this.getHighResolutionOutputSizeshNQ4ISI.getState();
        final com.zettle.sdk.analytics.DispatcherImpl dispatcherImpl = this.getHighResolutionOutputSizeshNQ4ISI;
        final com.zettle.sdk.analytics.DispatcherImpl.Action action = this.$Camera2StreamConfigurationMap;
        state.update(new kotlin.jvm.functions.Function1<com.zettle.sdk.analytics.Dispatcher.State, com.zettle.sdk.analytics.Dispatcher.State>() { // from class: com.zettle.sdk.analytics.DispatcherImpl$action$1.1
            @Override // kotlin.jvm.functions.Function1
            /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: merged with bridge method [inline-methods] */
            public final com.zettle.sdk.analytics.Dispatcher.State invoke(com.zettle.sdk.analytics.Dispatcher.State state2) {
                com.zettle.sdk.commons.util.Log log;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(state2, "");
                com.zettle.sdk.analytics.Dispatcher.State reduce$core_publicRelease = com.zettle.sdk.analytics.DispatcherImpl.this.reduce$core_publicRelease(state2, action);
                com.zettle.sdk.analytics.DispatcherImpl dispatcherImpl2 = com.zettle.sdk.analytics.DispatcherImpl.this;
                com.zettle.sdk.analytics.DispatcherImpl.Action action2 = action;
                log = dispatcherImpl2.Camera2StreamConfigurationMap;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("State: ");
                sb.append(state2);
                sb.append(" -> ");
                sb.append(reduce$core_publicRelease);
                sb.append(". Action: ");
                sb.append(action2);
                com.zettle.sdk.commons.util.Log.DefaultImpls.d$default(log, sb.toString(), null, 2, null);
                return reduce$core_publicRelease;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }
        });
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DispatcherImpl$action$1(com.zettle.sdk.analytics.DispatcherImpl dispatcherImpl, com.zettle.sdk.analytics.DispatcherImpl.Action action) {
        super(0);
        this.getHighResolutionOutputSizeshNQ4ISI = dispatcherImpl;
        this.$Camera2StreamConfigurationMap = action;
    }
}
