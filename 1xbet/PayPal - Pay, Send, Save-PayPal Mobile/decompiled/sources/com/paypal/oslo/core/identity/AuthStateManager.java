package com.paypal.oslo.core.identity;

@javax.inject.Singleton
@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\u0010\u001a\u00020\u00058WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR \u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00050\u00118\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015"}, d2 = {"Lcom/paypal/oslo/core/identity/AuthStateManager;", "Lcom/paypal/oslo/core/identity/AuthStateProvider;", "Lcom/paypal/oslo/core/identity/AuthStateSetter;", "<init>", "()V", "Lcom/paypal/oslo/core/identity/UserAccessTokenState;", "state", "", "setUserAccessTokenState", "(Lcom/paypal/oslo/core/identity/UserAccessTokenState;)V", "Lkotlinx/coroutines/flow/MutableStateFlow;", "getHighSpeedVideoSizes", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Camera2StreamConfigurationMap", "getCurrentUserAccessTokenState", "()Lcom/paypal/oslo/core/identity/UserAccessTokenState;", "currentUserAccessTokenState", "Lkotlinx/coroutines/flow/StateFlow;", "userAccessTokenStateFlow", "Lkotlinx/coroutines/flow/StateFlow;", "getUserAccessTokenStateFlow", "()Lkotlinx/coroutines/flow/StateFlow;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class AuthStateManager implements com.paypal.oslo.core.identity.AuthStateProvider, com.paypal.oslo.core.identity.AuthStateSetter {

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.core.identity.UserAccessTokenState> Camera2StreamConfigurationMap;
    private final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.core.identity.UserAccessTokenState> userAccessTokenStateFlow;

    @javax.inject.Inject
    public AuthStateManager() {
        kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.core.identity.UserAccessTokenState> MutableStateFlow = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(com.paypal.oslo.core.identity.UserAccessTokenState.None.INSTANCE);
        this.Camera2StreamConfigurationMap = MutableStateFlow;
        this.userAccessTokenStateFlow = kotlinx.coroutines.flow.FlowKt.asStateFlow(MutableStateFlow);
    }

    @Override // com.paypal.oslo.core.identity.AuthStateProvider
    public final com.paypal.oslo.core.identity.UserAccessTokenState getCurrentUserAccessTokenState() {
        return this.Camera2StreamConfigurationMap.getValue();
    }

    @Override // com.paypal.oslo.core.identity.AuthStateProvider
    public final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.core.identity.UserAccessTokenState> getUserAccessTokenStateFlow() {
        return this.userAccessTokenStateFlow;
    }

    @Override // com.paypal.oslo.core.identity.AuthStateSetter
    public final void setUserAccessTokenState(com.paypal.oslo.core.identity.UserAccessTokenState state) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(state, "");
        if (kotlin.jvm.internal.Intrinsics.areEqual(this.Camera2StreamConfigurationMap.getValue(), state)) {
            return;
        }
        this.Camera2StreamConfigurationMap.setValue(state);
    }
}
