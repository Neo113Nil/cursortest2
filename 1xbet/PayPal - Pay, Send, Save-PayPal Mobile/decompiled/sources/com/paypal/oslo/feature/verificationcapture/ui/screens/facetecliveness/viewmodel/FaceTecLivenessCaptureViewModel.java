package com.paypal.oslo.feature.verificationcapture.ui.screens.facetecliveness.viewmodel;

@kotlin.Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u00018B!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J%\u0010\u0018\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0015¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001c\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001e\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0018\u0010\"\u001a\u0004\u0018\u00010\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!R\u0018\u0010%\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$R\u0016\u0010#\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010&R\u0016\u0010(\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010'R\u0016\u0010 \u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010'R&\u0010-\u001a\u0014\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020+0)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010,R\u001d\u0010/\u001a\b\u0012\u0004\u0012\u00020*0.8\u0007¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R \u00104\u001a\b\u0012\u0004\u0012\u00020+038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107"}, d2 = {"Lcom/paypal/oslo/feature/verificationcapture/ui/screens/facetecliveness/viewmodel/FaceTecLivenessCaptureViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/paypal/oslo/feature/verificationcapture/domain/usecase/StartLivenessCheckUseCase;", "startLivenessCheckUseCase", "Lcom/paypal/oslo/feature/verificationcapture/domain/repository/LivenessRepository;", "livenessRepository", "Lcom/paypal/oslo/feature/verificationcapture/ui/screens/facetecliveness/reducer/FaceTecLivenessCaptureReducer;", "reducer", "<init>", "(Lcom/paypal/oslo/feature/verificationcapture/domain/usecase/StartLivenessCheckUseCase;Lcom/paypal/oslo/feature/verificationcapture/domain/repository/LivenessRepository;Lcom/paypal/oslo/feature/verificationcapture/ui/screens/facetecliveness/reducer/FaceTecLivenessCaptureReducer;)V", "Lcom/paypal/oslo/feature/verificationcapture/ui/screens/facetecliveness/contract/FaceTecLivenessCaptureEvent;", "event", "", "processEvent", "(Lcom/paypal/oslo/feature/verificationcapture/ui/screens/facetecliveness/contract/FaceTecLivenessCaptureEvent;)V", "Landroid/content/Context;", "context", "setActivityContext", "(Landroid/content/Context;)V", "", "isWebFlow", "", com.paypal.oslo.core.network.graphql.interceptor.StepupChallengeInterceptor.FIELD_FLOW_NAME, "entityId", "setWebFlowParameters", "(ZLjava/lang/String;Ljava/lang/String;)V", "getOutputFormats", "Lcom/paypal/oslo/feature/verificationcapture/domain/usecase/StartLivenessCheckUseCase;", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/feature/verificationcapture/domain/repository/LivenessRepository;", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/feature/verificationcapture/ui/screens/facetecliveness/viewmodel/FaceTecLivenessCaptureViewModel$SdkCredentials;", "getInputFormats", "Lcom/paypal/oslo/feature/verificationcapture/ui/screens/facetecliveness/viewmodel/FaceTecLivenessCaptureViewModel$SdkCredentials;", "Camera2StreamConfigurationMap", "getHighSpeedVideoSizes", "Landroid/content/Context;", "getHighResolutionOutputSizeshNQ4ISI", "Z", "Ljava/lang/String;", "getHighSpeedVideoSizesFor", "Lcom/paypal/oslo/core/mvi/MviStateStore;", "Lcom/paypal/oslo/feature/verificationcapture/ui/screens/facetecliveness/contract/FaceTecLivenessCaptureUiState;", "Lcom/paypal/oslo/feature/verificationcapture/ui/screens/facetecliveness/contract/FaceTecLivenessCaptureUiEffect;", "Lcom/paypal/oslo/core/mvi/MviStateStore;", "getInputSizeshNQ4ISI", "Lkotlinx/coroutines/flow/StateFlow;", "uiState", "Lkotlinx/coroutines/flow/StateFlow;", "getUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "Lkotlinx/coroutines/flow/Flow;", "uiEffect", "Lkotlinx/coroutines/flow/Flow;", "getUiEffect", "()Lkotlinx/coroutines/flow/Flow;", "SdkCredentials"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class FaceTecLivenessCaptureViewModel extends androidx.view.ViewModel {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private java.lang.String getInputFormats;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private java.lang.String getHighSpeedVideoSizesFor;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.verificationcapture.domain.repository.LivenessRepository getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private boolean getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private android.content.Context getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoSizesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.core.mvi.MviStateStore<com.paypal.oslo.feature.verificationcapture.ui.screens.facetecliveness.contract.FaceTecLivenessCaptureUiState, com.paypal.oslo.feature.verificationcapture.ui.screens.facetecliveness.contract.FaceTecLivenessCaptureEvent, com.paypal.oslo.feature.verificationcapture.ui.screens.facetecliveness.contract.FaceTecLivenessCaptureUiEffect> getInputSizeshNQ4ISI;

    /* renamed from: getInputFormats, reason: from kotlin metadata */
    private com.paypal.oslo.feature.verificationcapture.ui.screens.facetecliveness.viewmodel.FaceTecLivenessCaptureViewModel.SdkCredentials Camera2StreamConfigurationMap;

    /* renamed from: getOutputFormats, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.verificationcapture.domain.usecase.StartLivenessCheckUseCase getHighSpeedVideoFpsRanges;
    private final kotlinx.coroutines.flow.Flow<com.paypal.oslo.feature.verificationcapture.ui.screens.facetecliveness.contract.FaceTecLivenessCaptureUiEffect> uiEffect;
    private final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.verificationcapture.ui.screens.facetecliveness.contract.FaceTecLivenessCaptureUiState> uiState;

    @javax.inject.Inject
    public FaceTecLivenessCaptureViewModel(com.paypal.oslo.feature.verificationcapture.domain.usecase.StartLivenessCheckUseCase startLivenessCheckUseCase, com.paypal.oslo.feature.verificationcapture.domain.repository.LivenessRepository livenessRepository, com.paypal.oslo.feature.verificationcapture.ui.screens.facetecliveness.reducer.FaceTecLivenessCaptureReducer faceTecLivenessCaptureReducer) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(startLivenessCheckUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(livenessRepository, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(faceTecLivenessCaptureReducer, "");
        this.getHighSpeedVideoFpsRanges = startLivenessCheckUseCase;
        this.getHighSpeedVideoFpsRangesFor = livenessRepository;
        this.getHighSpeedVideoSizesFor = "";
        this.getInputFormats = "";
        com.paypal.oslo.core.mvi.MviStateStore<com.paypal.oslo.feature.verificationcapture.ui.screens.facetecliveness.contract.FaceTecLivenessCaptureUiState, com.paypal.oslo.feature.verificationcapture.ui.screens.facetecliveness.contract.FaceTecLivenessCaptureEvent, com.paypal.oslo.feature.verificationcapture.ui.screens.facetecliveness.contract.FaceTecLivenessCaptureUiEffect> mviStateStore = new com.paypal.oslo.core.mvi.MviStateStore<>("FaceTecLivenessCaptureViewModel.store", com.paypal.oslo.feature.verificationcapture.ui.screens.facetecliveness.contract.FaceTecLivenessCaptureUiState.Initializing.INSTANCE, faceTecLivenessCaptureReducer, kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.core.mvi.MviStateStore.Middleware[]{new com.paypal.oslo.core.mvi.MviStateStore.Middleware<com.paypal.oslo.feature.verificationcapture.ui.screens.facetecliveness.contract.FaceTecLivenessCaptureUiState, com.paypal.oslo.feature.verificationcapture.ui.screens.facetecliveness.contract.FaceTecLivenessCaptureEvent>() { // from class: com.paypal.oslo.feature.verificationcapture.ui.screens.facetecliveness.viewmodel.FaceTecLivenessCaptureViewModel$livenessCheckMiddleware$1
            @Override // com.paypal.oslo.core.mvi.MviStateStore.Middleware
            public final void invoke(com.paypal.oslo.core.mvi.MviStateStore.Middleware.Input<com.paypal.oslo.feature.verificationcapture.ui.screens.facetecliveness.contract.FaceTecLivenessCaptureUiState, com.paypal.oslo.feature.verificationcapture.ui.screens.facetecliveness.contract.FaceTecLivenessCaptureEvent> input) {
                com.paypal.oslo.feature.verificationcapture.ui.screens.facetecliveness.viewmodel.FaceTecLivenessCaptureViewModel.SdkCredentials sdkCredentials;
                com.paypal.oslo.feature.verificationcapture.domain.repository.LivenessRepository livenessRepository2;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
                com.paypal.oslo.feature.verificationcapture.ui.screens.facetecliveness.contract.FaceTecLivenessCaptureEvent event = input.getEvent();
                if (event instanceof com.paypal.oslo.feature.verificationcapture.ui.screens.facetecliveness.contract.FaceTecLivenessCaptureEvent.Initialize) {
                    com.paypal.oslo.feature.verificationcapture.ui.screens.facetecliveness.contract.FaceTecLivenessCaptureEvent.Initialize initialize = (com.paypal.oslo.feature.verificationcapture.ui.screens.facetecliveness.contract.FaceTecLivenessCaptureEvent.Initialize) event;
                    com.paypal.oslo.feature.verificationcapture.ui.screens.facetecliveness.viewmodel.FaceTecLivenessCaptureViewModel.this.Camera2StreamConfigurationMap = new com.paypal.oslo.feature.verificationcapture.ui.screens.facetecliveness.viewmodel.FaceTecLivenessCaptureViewModel.SdkCredentials(initialize.getDeviceKeyIdentifier(), initialize.getProductionKey(), initialize.getLicenseExpirationDate());
                    kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(com.paypal.oslo.feature.verificationcapture.ui.screens.facetecliveness.viewmodel.FaceTecLivenessCaptureViewModel.this), null, null, new com.paypal.oslo.feature.verificationcapture.ui.screens.facetecliveness.viewmodel.FaceTecLivenessCaptureViewModel$livenessCheckMiddleware$1$invoke$1(com.paypal.oslo.feature.verificationcapture.ui.screens.facetecliveness.viewmodel.FaceTecLivenessCaptureViewModel.this, event, null), 3, null);
                    return;
                }
                if (event instanceof com.paypal.oslo.feature.verificationcapture.ui.screens.facetecliveness.contract.FaceTecLivenessCaptureEvent.SDKInitialized) {
                    return;
                }
                if (event instanceof com.paypal.oslo.feature.verificationcapture.ui.screens.facetecliveness.contract.FaceTecLivenessCaptureEvent.SetSessionToken) {
                    livenessRepository2 = com.paypal.oslo.feature.verificationcapture.ui.screens.facetecliveness.viewmodel.FaceTecLivenessCaptureViewModel.this.getHighSpeedVideoFpsRangesFor;
                    livenessRepository2.setSessionToken(((com.paypal.oslo.feature.verificationcapture.ui.screens.facetecliveness.contract.FaceTecLivenessCaptureEvent.SetSessionToken) event).getSessionToken());
                    com.paypal.oslo.feature.verificationcapture.ui.screens.facetecliveness.viewmodel.FaceTecLivenessCaptureViewModel.this.processEvent(com.paypal.oslo.feature.verificationcapture.ui.screens.facetecliveness.contract.FaceTecLivenessCaptureEvent.StartLivenessCheck.INSTANCE);
                } else {
                    if (event instanceof com.paypal.oslo.feature.verificationcapture.ui.screens.facetecliveness.contract.FaceTecLivenessCaptureEvent.RetryTapped) {
                        sdkCredentials = com.paypal.oslo.feature.verificationcapture.ui.screens.facetecliveness.viewmodel.FaceTecLivenessCaptureViewModel.this.Camera2StreamConfigurationMap;
                        if (sdkCredentials != null) {
                            kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(com.paypal.oslo.feature.verificationcapture.ui.screens.facetecliveness.viewmodel.FaceTecLivenessCaptureViewModel.this), null, null, new com.paypal.oslo.feature.verificationcapture.ui.screens.facetecliveness.viewmodel.FaceTecLivenessCaptureViewModel$livenessCheckMiddleware$1$invoke$2(com.paypal.oslo.feature.verificationcapture.ui.screens.facetecliveness.viewmodel.FaceTecLivenessCaptureViewModel.this, sdkCredentials, null), 3, null);
                            return;
                        } else {
                            com.paypal.oslo.feature.verificationcapture.ui.screens.facetecliveness.viewmodel.FaceTecLivenessCaptureViewModel.this.processEvent(new com.paypal.oslo.feature.verificationcapture.ui.screens.facetecliveness.contract.FaceTecLivenessCaptureEvent.SDKInitializationFailed("SDK credentials not available"));
                            return;
                        }
                    }
                    if (event instanceof com.paypal.oslo.feature.verificationcapture.ui.screens.facetecliveness.contract.FaceTecLivenessCaptureEvent.StartLivenessCheck) {
                        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(com.paypal.oslo.feature.verificationcapture.ui.screens.facetecliveness.viewmodel.FaceTecLivenessCaptureViewModel.this), null, null, new com.paypal.oslo.feature.verificationcapture.ui.screens.facetecliveness.viewmodel.FaceTecLivenessCaptureViewModel$livenessCheckMiddleware$1$invoke$3(com.paypal.oslo.feature.verificationcapture.ui.screens.facetecliveness.viewmodel.FaceTecLivenessCaptureViewModel.this, null), 3, null);
                    }
                }
            }
        }, com.paypal.oslo.feature.verificationcapture.ui.util.MviObservabilityMiddlewareKt.createObservabilityMiddleware("FaceTec liveness capture")}), androidx.view.ViewModelKt.getViewModelScope(this));
        this.getInputSizeshNQ4ISI = mviStateStore;
        this.uiState = mviStateStore.getUiState();
        this.uiEffect = mviStateStore.getUiEffect();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ java.lang.Object access$initializeSdk(com.paypal.oslo.feature.verificationcapture.ui.screens.facetecliveness.viewmodel.FaceTecLivenessCaptureViewModel faceTecLivenessCaptureViewModel, java.lang.String str, java.lang.String str2, java.lang.String str3, kotlin.coroutines.Continuation continuation) {
        com.paypal.oslo.feature.verificationcapture.ui.screens.facetecliveness.viewmodel.FaceTecLivenessCaptureViewModel$initializeSdk$1 faceTecLivenessCaptureViewModel$initializeSdk$1;
        int i;
        java.lang.Object mo20598initializeSdkBWLJW6A;
        java.lang.Throwable m23439exceptionOrNullimpl;
        if (continuation instanceof com.paypal.oslo.feature.verificationcapture.ui.screens.facetecliveness.viewmodel.FaceTecLivenessCaptureViewModel$initializeSdk$1) {
            faceTecLivenessCaptureViewModel$initializeSdk$1 = (com.paypal.oslo.feature.verificationcapture.ui.screens.facetecliveness.viewmodel.FaceTecLivenessCaptureViewModel$initializeSdk$1) continuation;
            if ((faceTecLivenessCaptureViewModel$initializeSdk$1.Camera2StreamConfigurationMap & Integer.MIN_VALUE) != 0) {
                faceTecLivenessCaptureViewModel$initializeSdk$1.Camera2StreamConfigurationMap -= 2147483648;
                java.lang.Object obj = faceTecLivenessCaptureViewModel$initializeSdk$1.getHighSpeedVideoFpsRangesFor;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = faceTecLivenessCaptureViewModel$initializeSdk$1.Camera2StreamConfigurationMap;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.feature.verificationcapture.domain.repository.LivenessRepository livenessRepository = faceTecLivenessCaptureViewModel.getHighSpeedVideoFpsRangesFor;
                    faceTecLivenessCaptureViewModel$initializeSdk$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str);
                    faceTecLivenessCaptureViewModel$initializeSdk$1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str2);
                    faceTecLivenessCaptureViewModel$initializeSdk$1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str3);
                    faceTecLivenessCaptureViewModel$initializeSdk$1.Camera2StreamConfigurationMap = 1;
                    mo20598initializeSdkBWLJW6A = livenessRepository.mo20598initializeSdkBWLJW6A(str, str2, str3, faceTecLivenessCaptureViewModel$initializeSdk$1);
                    if (mo20598initializeSdkBWLJW6A == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                    mo20598initializeSdkBWLJW6A = ((kotlin.Result) obj).getCamera2StreamConfigurationMap();
                }
                m23439exceptionOrNullimpl = kotlin.Result.m23439exceptionOrNullimpl(mo20598initializeSdkBWLJW6A);
                if (m23439exceptionOrNullimpl != null) {
                    com.paypal.android.logger.Logger.i$default(com.paypal.oslo.feature.verificationcapture.ui.util.TempMaterial3CompatKt.getLog(), "FaceTec SDK initialized successfully", null, null, 6, null);
                    faceTecLivenessCaptureViewModel.processEvent(com.paypal.oslo.feature.verificationcapture.ui.screens.facetecliveness.contract.FaceTecLivenessCaptureEvent.SDKInitialized.INSTANCE);
                } else {
                    com.paypal.oslo.feature.verificationcapture.ui.util.TempMaterial3CompatKt.getLog().e("FaceTec SDK initialization failed", m23439exceptionOrNullimpl);
                    java.lang.String message = m23439exceptionOrNullimpl.getMessage();
                    if (message == null) {
                        message = "SDK initialization failed";
                    }
                    faceTecLivenessCaptureViewModel.processEvent(new com.paypal.oslo.feature.verificationcapture.ui.screens.facetecliveness.contract.FaceTecLivenessCaptureEvent.SDKInitializationFailed(message));
                }
                return kotlin.Unit.INSTANCE;
            }
        }
        faceTecLivenessCaptureViewModel$initializeSdk$1 = new com.paypal.oslo.feature.verificationcapture.ui.screens.facetecliveness.viewmodel.FaceTecLivenessCaptureViewModel$initializeSdk$1(faceTecLivenessCaptureViewModel, continuation);
        java.lang.Object obj2 = faceTecLivenessCaptureViewModel$initializeSdk$1.getHighSpeedVideoFpsRangesFor;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = faceTecLivenessCaptureViewModel$initializeSdk$1.Camera2StreamConfigurationMap;
        if (i != 0) {
        }
        m23439exceptionOrNullimpl = kotlin.Result.m23439exceptionOrNullimpl(mo20598initializeSdkBWLJW6A);
        if (m23439exceptionOrNullimpl != null) {
        }
        return kotlin.Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ java.lang.Object access$performLivenessCheck(com.paypal.oslo.feature.verificationcapture.ui.screens.facetecliveness.viewmodel.FaceTecLivenessCaptureViewModel faceTecLivenessCaptureViewModel, kotlin.coroutines.Continuation continuation) {
        com.paypal.oslo.feature.verificationcapture.ui.screens.facetecliveness.viewmodel.FaceTecLivenessCaptureViewModel$performLivenessCheck$1 faceTecLivenessCaptureViewModel$performLivenessCheck$1;
        int i;
        java.lang.Object m20620invokeyxL6bBk;
        java.lang.Throwable m23439exceptionOrNullimpl;
        if (continuation instanceof com.paypal.oslo.feature.verificationcapture.ui.screens.facetecliveness.viewmodel.FaceTecLivenessCaptureViewModel$performLivenessCheck$1) {
            faceTecLivenessCaptureViewModel$performLivenessCheck$1 = (com.paypal.oslo.feature.verificationcapture.ui.screens.facetecliveness.viewmodel.FaceTecLivenessCaptureViewModel$performLivenessCheck$1) continuation;
            if ((faceTecLivenessCaptureViewModel$performLivenessCheck$1.getHighSpeedVideoFpsRanges & Integer.MIN_VALUE) != 0) {
                faceTecLivenessCaptureViewModel$performLivenessCheck$1.getHighSpeedVideoFpsRanges -= 2147483648;
                com.paypal.oslo.feature.verificationcapture.ui.screens.facetecliveness.viewmodel.FaceTecLivenessCaptureViewModel$performLivenessCheck$1 faceTecLivenessCaptureViewModel$performLivenessCheck$12 = faceTecLivenessCaptureViewModel$performLivenessCheck$1;
                java.lang.Object obj = faceTecLivenessCaptureViewModel$performLivenessCheck$12.getHighSpeedVideoSizes;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = faceTecLivenessCaptureViewModel$performLivenessCheck$12.getHighSpeedVideoFpsRanges;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    faceTecLivenessCaptureViewModel.processEvent(com.paypal.oslo.feature.verificationcapture.ui.screens.facetecliveness.contract.FaceTecLivenessCaptureEvent.LivenessCheckStarted.INSTANCE);
                    android.content.Context context = faceTecLivenessCaptureViewModel.getHighResolutionOutputSizeshNQ4ISI;
                    if (context == null) {
                        faceTecLivenessCaptureViewModel.processEvent(new com.paypal.oslo.feature.verificationcapture.ui.screens.facetecliveness.contract.FaceTecLivenessCaptureEvent.LivenessCheckError("Activity context not set. Call setActivityContext() before starting liveness check."));
                        return kotlin.Unit.INSTANCE;
                    }
                    com.paypal.oslo.feature.verificationcapture.domain.usecase.StartLivenessCheckUseCase startLivenessCheckUseCase = faceTecLivenessCaptureViewModel.getHighSpeedVideoFpsRanges;
                    boolean z = faceTecLivenessCaptureViewModel.getHighSpeedVideoSizes;
                    java.lang.String str = faceTecLivenessCaptureViewModel.getHighSpeedVideoSizesFor;
                    java.lang.String str2 = faceTecLivenessCaptureViewModel.getInputFormats;
                    faceTecLivenessCaptureViewModel$performLivenessCheck$12.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(context);
                    faceTecLivenessCaptureViewModel$performLivenessCheck$12.getHighSpeedVideoFpsRanges = 1;
                    m20620invokeyxL6bBk = startLivenessCheckUseCase.m20620invokeyxL6bBk(context, z, str, str2, faceTecLivenessCaptureViewModel$performLivenessCheck$12);
                    if (m20620invokeyxL6bBk == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                    m20620invokeyxL6bBk = ((kotlin.Result) obj).getCamera2StreamConfigurationMap();
                }
                m23439exceptionOrNullimpl = kotlin.Result.m23439exceptionOrNullimpl(m20620invokeyxL6bBk);
                if (m23439exceptionOrNullimpl != null) {
                    com.paypal.oslo.feature.verificationcapture.domain.model.LivenessResult livenessResult = (com.paypal.oslo.feature.verificationcapture.domain.model.LivenessResult) m20620invokeyxL6bBk;
                    if (livenessResult instanceof com.paypal.oslo.feature.verificationcapture.domain.model.LivenessResult.Success) {
                        com.paypal.oslo.feature.verificationcapture.domain.model.LivenessResult.Success success = (com.paypal.oslo.feature.verificationcapture.domain.model.LivenessResult.Success) livenessResult;
                        com.paypal.android.logger.Logger.i$default(com.paypal.oslo.feature.verificationcapture.ui.util.TempMaterial3CompatKt.getLog(), "Liveness check succeeded", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("session_id", success.getSessionId())), null, 4, null);
                        faceTecLivenessCaptureViewModel.processEvent(new com.paypal.oslo.feature.verificationcapture.ui.screens.facetecliveness.contract.FaceTecLivenessCaptureEvent.LivenessCheckSuccess(success.getSessionId(), success.getFaceScanData(), success.getAuditTrailImages()));
                    } else if (livenessResult instanceof com.paypal.oslo.feature.verificationcapture.domain.model.LivenessResult.Cancelled) {
                        com.paypal.android.logger.Logger.i$default(com.paypal.oslo.feature.verificationcapture.ui.util.TempMaterial3CompatKt.getLog(), "Liveness check cancelled by user", null, null, 6, null);
                        faceTecLivenessCaptureViewModel.processEvent(com.paypal.oslo.feature.verificationcapture.ui.screens.facetecliveness.contract.FaceTecLivenessCaptureEvent.LivenessCheckCancelled.INSTANCE);
                    } else if (livenessResult instanceof com.paypal.oslo.feature.verificationcapture.domain.model.LivenessResult.Timeout) {
                        com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.verificationcapture.ui.util.TempMaterial3CompatKt.getLog(), "Liveness check timed out", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("duration_ms", java.lang.String.valueOf(((com.paypal.oslo.feature.verificationcapture.domain.model.LivenessResult.Timeout) livenessResult).getDurationMs()))), null, 4, null);
                        faceTecLivenessCaptureViewModel.processEvent(com.paypal.oslo.feature.verificationcapture.ui.screens.facetecliveness.contract.FaceTecLivenessCaptureEvent.LivenessCheckTimeout.INSTANCE);
                    } else {
                        if (!(livenessResult instanceof com.paypal.oslo.feature.verificationcapture.domain.model.LivenessResult.Failure)) {
                            throw new kotlin.NoWhenBranchMatchedException();
                        }
                        com.paypal.oslo.feature.verificationcapture.domain.model.LivenessResult.Failure failure = (com.paypal.oslo.feature.verificationcapture.domain.model.LivenessResult.Failure) livenessResult;
                        com.paypal.android.logger.Logger.e$default(com.paypal.oslo.feature.verificationcapture.ui.util.TempMaterial3CompatKt.getLog(), "Liveness check failed", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("error", failure.getError().getMessage())), null, null, 12, null);
                        faceTecLivenessCaptureViewModel.processEvent(new com.paypal.oslo.feature.verificationcapture.ui.screens.facetecliveness.contract.FaceTecLivenessCaptureEvent.LivenessCheckError(failure.getError().getMessage()));
                    }
                } else {
                    com.paypal.oslo.feature.verificationcapture.ui.util.TempMaterial3CompatKt.getLog().e("Liveness check failed with exception", m23439exceptionOrNullimpl);
                    java.lang.String message = m23439exceptionOrNullimpl.getMessage();
                    if (message == null) {
                        message = com.paypal.oslo.feature.settings.closeaccount.data.repository.CloseAccountRepositoryImpl.UNKNOWN_ERROR;
                    }
                    faceTecLivenessCaptureViewModel.processEvent(new com.paypal.oslo.feature.verificationcapture.ui.screens.facetecliveness.contract.FaceTecLivenessCaptureEvent.LivenessCheckError(message));
                }
                return kotlin.Unit.INSTANCE;
            }
        }
        faceTecLivenessCaptureViewModel$performLivenessCheck$1 = new com.paypal.oslo.feature.verificationcapture.ui.screens.facetecliveness.viewmodel.FaceTecLivenessCaptureViewModel$performLivenessCheck$1(faceTecLivenessCaptureViewModel, continuation);
        com.paypal.oslo.feature.verificationcapture.ui.screens.facetecliveness.viewmodel.FaceTecLivenessCaptureViewModel$performLivenessCheck$1 faceTecLivenessCaptureViewModel$performLivenessCheck$122 = faceTecLivenessCaptureViewModel$performLivenessCheck$1;
        java.lang.Object obj2 = faceTecLivenessCaptureViewModel$performLivenessCheck$122.getHighSpeedVideoSizes;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = faceTecLivenessCaptureViewModel$performLivenessCheck$122.getHighSpeedVideoFpsRanges;
        if (i != 0) {
        }
        m23439exceptionOrNullimpl = kotlin.Result.m23439exceptionOrNullimpl(m20620invokeyxL6bBk);
        if (m23439exceptionOrNullimpl != null) {
        }
        return kotlin.Unit.INSTANCE;
    }

    public final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.verificationcapture.ui.screens.facetecliveness.contract.FaceTecLivenessCaptureUiState> getUiState() {
        return this.uiState;
    }

    public final kotlinx.coroutines.flow.Flow<com.paypal.oslo.feature.verificationcapture.ui.screens.facetecliveness.contract.FaceTecLivenessCaptureUiEffect> getUiEffect() {
        return this.uiEffect;
    }

    public final void processEvent(com.paypal.oslo.feature.verificationcapture.ui.screens.facetecliveness.contract.FaceTecLivenessCaptureEvent event) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
        this.getInputSizeshNQ4ISI.onEvent(event);
    }

    public final void setActivityContext(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        this.getHighResolutionOutputSizeshNQ4ISI = context;
    }

    public final void setWebFlowParameters(boolean isWebFlow, java.lang.String flowName, java.lang.String entityId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(flowName, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(entityId, "");
        this.getHighSpeedVideoSizes = isWebFlow;
        this.getHighSpeedVideoSizesFor = flowName;
        this.getInputFormats = entityId;
    }

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0082\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\t\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0012\u001a\u00020\u00028\u0007¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0014\u001a\u00020\u00028\u0007¢\u0006\u0006\n\u0004\b\u0013\u0010\u0011R\u0011\u0010\u0013\u001a\u00020\u00028\u0007¢\u0006\u0006\n\u0004\b\u0014\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/feature/verificationcapture/ui/screens/facetecliveness/viewmodel/FaceTecLivenessCaptureViewModel$SdkCredentials;", "", "", "p0", "p1", "p2", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "Camera2StreamConfigurationMap", "Ljava/lang/String;", "getHighSpeedVideoSizes", "getHighResolutionOutputSizeshNQ4ISI", "getHighSpeedVideoFpsRanges"}, k = 1, mv = {2, 3, 0}, xi = 48)
    static final /* data */ class SdkCredentials {

        /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
        final java.lang.String getHighSpeedVideoSizes;

        /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
        final java.lang.String getHighSpeedVideoFpsRanges;

        /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
        final java.lang.String getHighResolutionOutputSizeshNQ4ISI;

        public SdkCredentials(java.lang.String str, java.lang.String str2, java.lang.String str3) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
            this.getHighSpeedVideoSizes = str;
            this.getHighSpeedVideoFpsRanges = str2;
            this.getHighResolutionOutputSizeshNQ4ISI = str3;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.getHighSpeedVideoSizes;
            java.lang.String str2 = this.getHighSpeedVideoFpsRanges;
            java.lang.String str3 = this.getHighResolutionOutputSizeshNQ4ISI;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("SdkCredentials(getHighSpeedVideoSizes=");
            sb.append(str);
            sb.append(", getHighSpeedVideoFpsRanges=");
            sb.append(str2);
            sb.append(", getHighResolutionOutputSizeshNQ4ISI=");
            sb.append(str3);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (((this.getHighSpeedVideoSizes.hashCode() * 31) + this.getHighSpeedVideoFpsRanges.hashCode()) * 31) + this.getHighResolutionOutputSizeshNQ4ISI.hashCode();
        }

        public final boolean equals(java.lang.Object p0) {
            if (this == p0) {
                return true;
            }
            if (!(p0 instanceof com.paypal.oslo.feature.verificationcapture.ui.screens.facetecliveness.viewmodel.FaceTecLivenessCaptureViewModel.SdkCredentials)) {
                return false;
            }
            com.paypal.oslo.feature.verificationcapture.ui.screens.facetecliveness.viewmodel.FaceTecLivenessCaptureViewModel.SdkCredentials sdkCredentials = (com.paypal.oslo.feature.verificationcapture.ui.screens.facetecliveness.viewmodel.FaceTecLivenessCaptureViewModel.SdkCredentials) p0;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.getHighSpeedVideoSizes, sdkCredentials.getHighSpeedVideoSizes) && kotlin.jvm.internal.Intrinsics.areEqual(this.getHighSpeedVideoFpsRanges, sdkCredentials.getHighSpeedVideoFpsRanges) && kotlin.jvm.internal.Intrinsics.areEqual(this.getHighResolutionOutputSizeshNQ4ISI, sdkCredentials.getHighResolutionOutputSizeshNQ4ISI);
        }
    }
}
