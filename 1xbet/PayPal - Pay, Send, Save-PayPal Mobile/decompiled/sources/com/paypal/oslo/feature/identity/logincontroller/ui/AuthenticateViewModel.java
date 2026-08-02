package com.paypal.oslo.feature.identity.logincontroller.ui;

@kotlin.Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001BC\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\b\u0001\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0015\u0010\u0016J)\u0010\u001d\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u00172\b\u0010\u001a\u001a\u0004\u0018\u00010\u00192\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0017H\u0086@¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0017H\u0086@¢\u0006\u0004\b!\u0010 J\u001e\u0010#\u001a\u0010\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001b\u0018\u00010\"H\u0086@¢\u0006\u0004\b#\u0010 R\u0014\u0010&\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010$\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010*\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010+\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010.\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010-R\u0014\u00100\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R&\u00106\u001a\u0014\u0012\u0004\u0012\u000202\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u000203018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u001d\u00108\u001a\b\u0012\u0004\u0012\u000202078\u0007¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010;R \u0010=\u001a\b\u0012\u0004\u0012\u0002030<8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@"}, d2 = {"Lcom/paypal/oslo/feature/identity/logincontroller/ui/AuthenticateViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/paypal/oslo/feature/identity/deviceregistration/domain/usecase/PostLoginDeviceRegisterUseCase;", "postLoginDeviceRegisterUseCase", "Lcom/paypal/oslo/feature/identity/rememberedlogin/domain/usecase/HasRememberedUserUseCase;", "hasRememberedUserUseCase", "Lcom/paypal/oslo/feature/identity/rememberedlogin/domain/usecase/GetRememberedUserUseCase;", "rememberedUserUseCase", "Lcom/paypal/oslo/feature/identity/login/domain/usecase/IsInContextLoginEnabledUseCase;", "isInContextLoginEnabledUseCase", "Lcom/paypal/oslo/feature/identity/analytics/domain/IdentityAnalyticsTracker;", "identityAnalyticsTracker", "Lcom/paypal/oslo/feature/identity/logincontroller/ui/AuthenticateReducer;", "reducer", "Lkotlinx/coroutines/CoroutineScope;", "applicationScope", "<init>", "(Lcom/paypal/oslo/feature/identity/deviceregistration/domain/usecase/PostLoginDeviceRegisterUseCase;Lcom/paypal/oslo/feature/identity/rememberedlogin/domain/usecase/HasRememberedUserUseCase;Lcom/paypal/oslo/feature/identity/rememberedlogin/domain/usecase/GetRememberedUserUseCase;Lcom/paypal/oslo/feature/identity/login/domain/usecase/IsInContextLoginEnabledUseCase;Lcom/paypal/oslo/feature/identity/analytics/domain/IdentityAnalyticsTracker;Lcom/paypal/oslo/feature/identity/logincontroller/ui/AuthenticateReducer;Lkotlinx/coroutines/CoroutineScope;)V", "Lcom/paypal/oslo/feature/identity/logincontroller/ui/AuthenticateEvent;", "event", "", "processEvent", "(Lcom/paypal/oslo/feature/identity/logincontroller/ui/AuthenticateEvent;)V", "", "isPassiveLogin", "Lcom/paypal/oslo/feature/identity/login/domain/model/PassiveLoginFlowType;", com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.FLOW_TYPE, "", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.TOKEN_KEY, "prepareAuthSuccessEvent", "(ZLcom/paypal/oslo/feature/identity/login/domain/model/PassiveLoginFlowType;Ljava/lang/String;)Lcom/paypal/oslo/feature/identity/logincontroller/ui/AuthenticateEvent;", "hasRememberedUser", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "isInContextLoginEnabled", "Lkotlin/Pair;", "getRememberedUserData", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/identity/deviceregistration/domain/usecase/PostLoginDeviceRegisterUseCase;", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/feature/identity/rememberedlogin/domain/usecase/HasRememberedUserUseCase;", "getInputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/identity/rememberedlogin/domain/usecase/GetRememberedUserUseCase;", "getHighSpeedVideoSizes", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/feature/identity/login/domain/usecase/IsInContextLoginEnabledUseCase;", "Lcom/paypal/oslo/feature/identity/analytics/domain/IdentityAnalyticsTracker;", "Camera2StreamConfigurationMap", "Lkotlinx/coroutines/CoroutineScope;", "getOutputMinFrameDuration", "Lcom/paypal/oslo/core/mvi/MviStateStore;", "Lcom/paypal/oslo/feature/identity/logincontroller/ui/AuthenticateUiState;", "Lcom/paypal/oslo/feature/identity/logincontroller/ui/AuthenticateUiEffect;", "getOutputFormats", "Lcom/paypal/oslo/core/mvi/MviStateStore;", "getInputFormats", "Lkotlinx/coroutines/flow/StateFlow;", "uiState", "Lkotlinx/coroutines/flow/StateFlow;", "getUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "Lkotlinx/coroutines/flow/Flow;", "uiEffect", "Lkotlinx/coroutines/flow/Flow;", "getUiEffect", "()Lkotlinx/coroutines/flow/Flow;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class AuthenticateViewModel extends androidx.view.ViewModel {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final kotlinx.coroutines.CoroutineScope getOutputMinFrameDuration;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.identity.deviceregistration.domain.usecase.PostLoginDeviceRegisterUseCase getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.identity.rememberedlogin.domain.usecase.HasRememberedUserUseCase getHighResolutionOutputSizeshNQ4ISI;
    private final com.paypal.oslo.feature.identity.login.domain.usecase.IsInContextLoginEnabledUseCase getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.identity.analytics.domain.IdentityAnalyticsTracker Camera2StreamConfigurationMap;

    /* renamed from: getInputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.identity.rememberedlogin.domain.usecase.GetRememberedUserUseCase getHighSpeedVideoSizes;

    /* renamed from: getOutputFormats, reason: from kotlin metadata */
    private final com.paypal.oslo.core.mvi.MviStateStore<com.paypal.oslo.feature.identity.logincontroller.ui.AuthenticateUiState, com.paypal.oslo.feature.identity.logincontroller.ui.AuthenticateEvent, com.paypal.oslo.feature.identity.logincontroller.ui.AuthenticateUiEffect> getInputFormats;
    private final kotlinx.coroutines.flow.Flow<com.paypal.oslo.feature.identity.logincontroller.ui.AuthenticateUiEffect> uiEffect;
    private final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.identity.logincontroller.ui.AuthenticateUiState> uiState;

    @javax.inject.Inject
    public AuthenticateViewModel(com.paypal.oslo.feature.identity.deviceregistration.domain.usecase.PostLoginDeviceRegisterUseCase postLoginDeviceRegisterUseCase, com.paypal.oslo.feature.identity.rememberedlogin.domain.usecase.HasRememberedUserUseCase hasRememberedUserUseCase, com.paypal.oslo.feature.identity.rememberedlogin.domain.usecase.GetRememberedUserUseCase getRememberedUserUseCase, com.paypal.oslo.feature.identity.login.domain.usecase.IsInContextLoginEnabledUseCase isInContextLoginEnabledUseCase, com.paypal.oslo.feature.identity.analytics.domain.IdentityAnalyticsTracker identityAnalyticsTracker, com.paypal.oslo.feature.identity.logincontroller.ui.AuthenticateReducer authenticateReducer, @com.paypal.oslo.core.di.annotations.IoApplicationScope kotlinx.coroutines.CoroutineScope coroutineScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(postLoginDeviceRegisterUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(hasRememberedUserUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getRememberedUserUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(isInContextLoginEnabledUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(identityAnalyticsTracker, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(authenticateReducer, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineScope, "");
        this.getHighSpeedVideoFpsRanges = postLoginDeviceRegisterUseCase;
        this.getHighResolutionOutputSizeshNQ4ISI = hasRememberedUserUseCase;
        this.getHighSpeedVideoSizes = getRememberedUserUseCase;
        this.getHighSpeedVideoFpsRangesFor = isInContextLoginEnabledUseCase;
        this.Camera2StreamConfigurationMap = identityAnalyticsTracker;
        this.getOutputMinFrameDuration = coroutineScope;
        com.paypal.oslo.core.mvi.MviStateStore<com.paypal.oslo.feature.identity.logincontroller.ui.AuthenticateUiState, com.paypal.oslo.feature.identity.logincontroller.ui.AuthenticateEvent, com.paypal.oslo.feature.identity.logincontroller.ui.AuthenticateUiEffect> mviStateStore = new com.paypal.oslo.core.mvi.MviStateStore<>("AuthenticateViewModel.store", com.paypal.oslo.feature.identity.logincontroller.ui.AuthenticateUiState.PreparingNativeAuth.INSTANCE, authenticateReducer, kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.core.mvi.MviStateStore.Middleware[]{new com.paypal.oslo.core.mvi.MviStateStore.Middleware<com.paypal.oslo.feature.identity.logincontroller.ui.AuthenticateUiState, com.paypal.oslo.feature.identity.logincontroller.ui.AuthenticateEvent>() { // from class: com.paypal.oslo.feature.identity.logincontroller.ui.AuthenticateViewModel$deviceRegistrationMiddleware$1
            @Override // com.paypal.oslo.core.mvi.MviStateStore.Middleware
            public final void invoke(com.paypal.oslo.core.mvi.MviStateStore.Middleware.Input<com.paypal.oslo.feature.identity.logincontroller.ui.AuthenticateUiState, com.paypal.oslo.feature.identity.logincontroller.ui.AuthenticateEvent> input) {
                kotlinx.coroutines.CoroutineScope coroutineScope2;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
                kotlin.Pair<com.paypal.oslo.feature.identity.logincontroller.ui.AuthenticateUiState, com.paypal.oslo.feature.identity.logincontroller.ui.AuthenticateUiState> states = input.getStates();
                com.paypal.oslo.feature.identity.logincontroller.ui.AuthenticateUiState component1 = states.component1();
                com.paypal.oslo.feature.identity.logincontroller.ui.AuthenticateUiState component2 = states.component2();
                if ((component1 instanceof com.paypal.oslo.feature.identity.logincontroller.ui.AuthenticateUiState.AuthenticationSuccess) || !(component2 instanceof com.paypal.oslo.feature.identity.logincontroller.ui.AuthenticateUiState.AuthenticationSuccess)) {
                    return;
                }
                coroutineScope2 = com.paypal.oslo.feature.identity.logincontroller.ui.AuthenticateViewModel.this.getOutputMinFrameDuration;
                kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(coroutineScope2, null, null, new com.paypal.oslo.feature.identity.logincontroller.ui.AuthenticateViewModel$deviceRegistrationMiddleware$1$invoke$1(com.paypal.oslo.feature.identity.logincontroller.ui.AuthenticateViewModel.this, null), 3, null);
            }
        }, new com.paypal.oslo.core.mvi.MviStateStore.Middleware<com.paypal.oslo.feature.identity.logincontroller.ui.AuthenticateUiState, com.paypal.oslo.feature.identity.logincontroller.ui.AuthenticateEvent>() { // from class: com.paypal.oslo.feature.identity.logincontroller.ui.AuthenticateViewModel$loggingMiddleware$1
            @Override // com.paypal.oslo.core.mvi.MviStateStore.Middleware
            public final void invoke(com.paypal.oslo.core.mvi.MviStateStore.Middleware.Input<com.paypal.oslo.feature.identity.logincontroller.ui.AuthenticateUiState, com.paypal.oslo.feature.identity.logincontroller.ui.AuthenticateEvent> input) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
            }
        }, new com.paypal.oslo.core.mvi.MviStateStore.Middleware<com.paypal.oslo.feature.identity.logincontroller.ui.AuthenticateUiState, com.paypal.oslo.feature.identity.logincontroller.ui.AuthenticateEvent>() { // from class: com.paypal.oslo.feature.identity.logincontroller.ui.AuthenticateViewModel$analyticsMiddleware$1
            @Override // com.paypal.oslo.core.mvi.MviStateStore.Middleware
            public final void invoke(com.paypal.oslo.core.mvi.MviStateStore.Middleware.Input<com.paypal.oslo.feature.identity.logincontroller.ui.AuthenticateUiState, com.paypal.oslo.feature.identity.logincontroller.ui.AuthenticateEvent> input) {
                com.paypal.oslo.feature.identity.analytics.domain.IdentityAnalyticsTracker identityAnalyticsTracker2;
                com.paypal.oslo.feature.identity.analytics.domain.IdentityAnalyticsTracker identityAnalyticsTracker3;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
                kotlin.Pair<com.paypal.oslo.feature.identity.logincontroller.ui.AuthenticateUiState, com.paypal.oslo.feature.identity.logincontroller.ui.AuthenticateUiState> states = input.getStates();
                com.paypal.oslo.feature.identity.logincontroller.ui.AuthenticateUiState component1 = states.component1();
                com.paypal.oslo.feature.identity.logincontroller.ui.AuthenticateUiState component2 = states.component2();
                com.paypal.oslo.feature.identity.logincontroller.ui.AuthenticateEvent event = input.getEvent();
                if (component2 instanceof com.paypal.oslo.feature.identity.logincontroller.ui.AuthenticateUiState.UsingNativeAuth) {
                    boolean z = component1 instanceof com.paypal.oslo.feature.identity.logincontroller.ui.AuthenticateUiState.UsingNativeAuth;
                    boolean z2 = (event instanceof com.paypal.oslo.feature.identity.logincontroller.ui.AuthenticateEvent.NativeAuthInitialized) && ((com.paypal.oslo.feature.identity.logincontroller.ui.AuthenticateEvent.NativeAuthInitialized) event).getAuthenticationContext().getAuthenticationState().ordinal() == com.paypal.oslo.core.identity.domain.model.AuthenticationState.LOGGED_IN.ordinal();
                    if (z || !z2) {
                        return;
                    }
                    identityAnalyticsTracker3 = com.paypal.oslo.feature.identity.logincontroller.ui.AuthenticateViewModel.this.Camera2StreamConfigurationMap;
                    identityAnalyticsTracker3.trackLoginInitiated();
                    return;
                }
                if (!(component2 instanceof com.paypal.oslo.feature.identity.logincontroller.ui.AuthenticateUiState.AuthenticationSuccess) || (component1 instanceof com.paypal.oslo.feature.identity.logincontroller.ui.AuthenticateUiState.AuthenticationSuccess)) {
                    return;
                }
                identityAnalyticsTracker2 = com.paypal.oslo.feature.identity.logincontroller.ui.AuthenticateViewModel.this.Camera2StreamConfigurationMap;
                identityAnalyticsTracker2.trackLoginSuccess();
            }
        }}), androidx.view.ViewModelKt.getViewModelScope(this));
        this.getInputFormats = mviStateStore;
        this.uiState = mviStateStore.getUiState();
        this.uiEffect = mviStateStore.getUiEffect();
    }

    public final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.identity.logincontroller.ui.AuthenticateUiState> getUiState() {
        return this.uiState;
    }

    public final kotlinx.coroutines.flow.Flow<com.paypal.oslo.feature.identity.logincontroller.ui.AuthenticateUiEffect> getUiEffect() {
        return this.uiEffect;
    }

    public final void processEvent(com.paypal.oslo.feature.identity.logincontroller.ui.AuthenticateEvent event) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
        this.getInputFormats.onEvent(event);
    }

    public final com.paypal.oslo.feature.identity.logincontroller.ui.AuthenticateEvent prepareAuthSuccessEvent(boolean isPassiveLogin, com.paypal.oslo.feature.identity.login.domain.model.PassiveLoginFlowType flowType, java.lang.String token) {
        if (isPassiveLogin && flowType != null) {
            return new com.paypal.oslo.feature.identity.logincontroller.ui.AuthenticateEvent.NativePassiveAuthSuccessfullyCompleted(flowType, token);
        }
        return new com.paypal.oslo.feature.identity.logincontroller.ui.AuthenticateEvent.NativeAuthCompleted(true, token, null, 4, null);
    }

    public final java.lang.Object hasRememberedUser(kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation) {
        return this.getHighResolutionOutputSizeshNQ4ISI.invoke(continuation);
    }

    public final java.lang.Object isInContextLoginEnabled(kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation) {
        return this.getHighSpeedVideoFpsRangesFor.invoke(continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0058 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getRememberedUserData(kotlin.coroutines.Continuation<? super kotlin.Pair<java.lang.String, java.lang.String>> continuation) {
        com.paypal.oslo.feature.identity.logincontroller.ui.AuthenticateViewModel$getRememberedUserData$1 authenticateViewModel$getRememberedUserData$1;
        int i;
        com.paypal.oslo.feature.identity.rememberedlogin.domain.model.RememberedUser rememberedUser;
        if (continuation instanceof com.paypal.oslo.feature.identity.logincontroller.ui.AuthenticateViewModel$getRememberedUserData$1) {
            authenticateViewModel$getRememberedUserData$1 = (com.paypal.oslo.feature.identity.logincontroller.ui.AuthenticateViewModel$getRememberedUserData$1) continuation;
            if ((authenticateViewModel$getRememberedUserData$1.getHighSpeedVideoSizes & Integer.MIN_VALUE) != 0) {
                authenticateViewModel$getRememberedUserData$1.getHighSpeedVideoSizes -= 2147483648;
                java.lang.Object obj = authenticateViewModel$getRememberedUserData$1.Camera2StreamConfigurationMap;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = authenticateViewModel$getRememberedUserData$1.getHighSpeedVideoSizes;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.feature.identity.rememberedlogin.domain.usecase.GetRememberedUserUseCase getRememberedUserUseCase = this.getHighSpeedVideoSizes;
                    authenticateViewModel$getRememberedUserData$1.getHighSpeedVideoSizes = 1;
                    obj = getRememberedUserUseCase.invoke(authenticateViewModel$getRememberedUserData$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                rememberedUser = (com.paypal.oslo.feature.identity.rememberedlogin.domain.model.RememberedUser) ((arrow.core.Either) obj).getOrNull();
                if (rememberedUser == null) {
                    return new kotlin.Pair(rememberedUser.getPublicCredential(), rememberedUser.getDisplayName());
                }
                return null;
            }
        }
        authenticateViewModel$getRememberedUserData$1 = new com.paypal.oslo.feature.identity.logincontroller.ui.AuthenticateViewModel$getRememberedUserData$1(this, continuation);
        java.lang.Object obj2 = authenticateViewModel$getRememberedUserData$1.Camera2StreamConfigurationMap;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = authenticateViewModel$getRememberedUserData$1.getHighSpeedVideoSizes;
        if (i != 0) {
        }
        rememberedUser = (com.paypal.oslo.feature.identity.rememberedlogin.domain.model.RememberedUser) ((arrow.core.Either) obj2).getOrNull();
        if (rememberedUser == null) {
        }
    }
}
