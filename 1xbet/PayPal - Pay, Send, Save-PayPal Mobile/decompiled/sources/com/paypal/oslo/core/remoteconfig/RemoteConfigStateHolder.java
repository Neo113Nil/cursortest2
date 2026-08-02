package com.paypal.oslo.core.remoteconfig;

@javax.inject.Singleton
@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR \u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\r8\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/core/remoteconfig/RemoteConfigStateHolder;", "Lcom/paypal/oslo/core/remoteconfig/contract/RemoteConfigState;", "<init>", "()V", "Lcom/paypal/oslo/core/remoteconfig/contract/RemoteConfigUserState;", "remoteConfigUserState", "", "updateUserState", "(Lcom/paypal/oslo/core/remoteconfig/contract/RemoteConfigUserState;)V", "Lkotlinx/coroutines/flow/MutableStateFlow;", "getHighSpeedVideoFpsRangesFor", "Lkotlinx/coroutines/flow/MutableStateFlow;", "getHighResolutionOutputSizeshNQ4ISI", "Lkotlinx/coroutines/flow/StateFlow;", "Lkotlinx/coroutines/flow/StateFlow;", "getRemoteConfigUserState", "()Lkotlinx/coroutines/flow/StateFlow;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class RemoteConfigStateHolder implements com.paypal.oslo.core.remoteconfig.contract.RemoteConfigState {

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.core.remoteconfig.contract.RemoteConfigUserState> getHighResolutionOutputSizeshNQ4ISI;
    private final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.core.remoteconfig.contract.RemoteConfigUserState> remoteConfigUserState;

    @javax.inject.Inject
    public RemoteConfigStateHolder() {
        kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.core.remoteconfig.contract.RemoteConfigUserState> MutableStateFlow = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(com.paypal.oslo.core.remoteconfig.contract.RemoteConfigUserState.SdkNotInitialized.INSTANCE);
        this.getHighResolutionOutputSizeshNQ4ISI = MutableStateFlow;
        this.remoteConfigUserState = kotlinx.coroutines.flow.FlowKt.asStateFlow(MutableStateFlow);
    }

    @Override // com.paypal.oslo.core.remoteconfig.contract.RemoteConfigState
    public final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.core.remoteconfig.contract.RemoteConfigUserState> getRemoteConfigUserState() {
        return this.remoteConfigUserState;
    }

    public final void updateUserState(com.paypal.oslo.core.remoteconfig.contract.RemoteConfigUserState remoteConfigUserState) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(remoteConfigUserState, "");
        this.getHighResolutionOutputSizeshNQ4ISI.setValue(remoteConfigUserState);
    }
}
