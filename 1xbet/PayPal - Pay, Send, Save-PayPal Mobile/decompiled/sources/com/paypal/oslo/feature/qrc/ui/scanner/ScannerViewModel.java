package com.paypal.oslo.feature.qrc.ui.scanner;

@kotlin.Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001BA\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0017\u001a\u00020\u0014¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0014H\u0014¢\u0006\u0004\b\u0019\u0010\u0018R\u0014\u0010\u001c\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001f\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\"\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010%\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010#\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0017\u0010\r\u001a\u00020\f8\u0007¢\u0006\f\n\u0004\b\r\u0010(\u001a\u0004\b)\u0010*R\u001a\u0010\u000f\u001a\u00020\u000e8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010+\u001a\u0004\b,\u0010-R&\u00103\u001a\u0014\u0012\u0004\u0012\u00020/\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u0002000.8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b1\u00102R \u00105\u001a\b\u0012\u0004\u0012\u00020/048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108R \u0010:\u001a\b\u0012\u0004\u0012\u000200098\u0007X\u0087\u0004¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=R\u0018\u00101\u001a\u0004\u0018\u00010>8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b3\u0010?R\u0018\u0010\u001d\u001a\u0004\u0018\u00010@8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b%\u0010AR\u0018\u0010 \u001a\u0004\u0018\u00010B8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\"\u0010CR\u0018\u0010\u001a\u001a\u0004\u0018\u00010B8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010CR\u0018\u0010D\u001a\u0004\u0018\u00010@8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010A"}, d2 = {"Lcom/paypal/oslo/feature/qrc/ui/scanner/ScannerViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/paypal/oslo/feature/qrc/ui/scanner/ScannerReducer;", "reducer", "Lcom/paypal/oslo/feature/qrc/domain/usecase/ScanQrCodeUseCase;", "scanQrCodeUseCase", "Lcom/paypal/oslo/feature/qrc/domain/usecase/PollQrcSessionUseCase;", "pollQrcSessionUseCase", "Lcom/paypal/oslo/feature/qrc/domain/scanner/LocationMatcher;", "locationMatcher", "Lcom/paypal/oslo/core/userstore/UserStore;", "userStore", "Lcom/paypal/oslo/feature/qrc/domain/scanner/ImageQrScanner;", "imageQrScanner", "Lcom/paypal/oslo/feature/qrc/domain/scanner/CameraProvider;", "cameraProvider", "<init>", "(Lcom/paypal/oslo/feature/qrc/ui/scanner/ScannerReducer;Lcom/paypal/oslo/feature/qrc/domain/usecase/ScanQrCodeUseCase;Lcom/paypal/oslo/feature/qrc/domain/usecase/PollQrcSessionUseCase;Lcom/paypal/oslo/feature/qrc/domain/scanner/LocationMatcher;Lcom/paypal/oslo/core/userstore/UserStore;Lcom/paypal/oslo/feature/qrc/domain/scanner/ImageQrScanner;Lcom/paypal/oslo/feature/qrc/domain/scanner/CameraProvider;)V", "Lcom/paypal/oslo/feature/qrc/ui/scanner/ScannerEvent;", "event", "", "handleIntent", "(Lcom/paypal/oslo/feature/qrc/ui/scanner/ScannerEvent;)V", "stopPolling", "()V", "onCleared", "getHighSpeedVideoSizesFor", "Lcom/paypal/oslo/feature/qrc/ui/scanner/ScannerReducer;", "getHighSpeedVideoSizes", "getOutputFormats", "Lcom/paypal/oslo/feature/qrc/domain/usecase/ScanQrCodeUseCase;", "getHighSpeedVideoFpsRanges", "getInputFormats", "Lcom/paypal/oslo/feature/qrc/domain/usecase/PollQrcSessionUseCase;", "getHighSpeedVideoFpsRangesFor", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/feature/qrc/domain/scanner/LocationMatcher;", "getHighResolutionOutputSizeshNQ4ISI", "getOutputMinFrameDurationlomOqCM", "Lcom/paypal/oslo/core/userstore/UserStore;", "Lcom/paypal/oslo/feature/qrc/domain/scanner/ImageQrScanner;", "getImageQrScanner", "()Lcom/paypal/oslo/feature/qrc/domain/scanner/ImageQrScanner;", "Lcom/paypal/oslo/feature/qrc/domain/scanner/CameraProvider;", "getCameraProvider", "()Lcom/paypal/oslo/feature/qrc/domain/scanner/CameraProvider;", "Lcom/paypal/oslo/core/mvi/MviStateStore;", "Lcom/paypal/oslo/feature/qrc/ui/scanner/ScannerUiState;", "Lcom/paypal/oslo/feature/qrc/ui/scanner/ScannerUiEffect;", "getOutputMinFrameDuration", "Lcom/paypal/oslo/core/mvi/MviStateStore;", "getInputSizeshNQ4ISI", "Lkotlinx/coroutines/flow/StateFlow;", "uiState", "Lkotlinx/coroutines/flow/StateFlow;", "getUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "Lkotlinx/coroutines/flow/Flow;", "uiEffect", "Lkotlinx/coroutines/flow/Flow;", "getUiEffect", "()Lkotlinx/coroutines/flow/Flow;", "Lkotlinx/coroutines/Job;", "Lkotlinx/coroutines/Job;", "", "Ljava/lang/String;", "", "Ljava/lang/Double;", "getOutputSizes"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class ScannerViewModel extends androidx.view.ViewModel {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.qrc.domain.scanner.LocationMatcher getHighResolutionOutputSizeshNQ4ISI;
    private final com.paypal.oslo.feature.qrc.domain.scanner.CameraProvider cameraProvider;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private java.lang.String getOutputFormats;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private java.lang.Double getHighSpeedVideoSizesFor;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private java.lang.Double getInputFormats;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private java.lang.String getOutputSizes;

    /* renamed from: getHighSpeedVideoSizesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.qrc.ui.scanner.ScannerReducer getHighSpeedVideoSizes;

    /* renamed from: getInputFormats, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.qrc.domain.usecase.PollQrcSessionUseCase getHighSpeedVideoFpsRangesFor;

    /* renamed from: getInputSizeshNQ4ISI, reason: from kotlin metadata */
    private kotlinx.coroutines.Job getOutputMinFrameDuration;

    /* renamed from: getOutputFormats, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.qrc.domain.usecase.ScanQrCodeUseCase getHighSpeedVideoFpsRanges;

    /* renamed from: getOutputMinFrameDuration, reason: from kotlin metadata */
    private final com.paypal.oslo.core.mvi.MviStateStore<com.paypal.oslo.feature.qrc.ui.scanner.ScannerUiState, com.paypal.oslo.feature.qrc.ui.scanner.ScannerEvent, com.paypal.oslo.feature.qrc.ui.scanner.ScannerUiEffect> getInputSizeshNQ4ISI;

    /* renamed from: getOutputMinFrameDurationlomOqCM, reason: from kotlin metadata */
    private final com.paypal.oslo.core.userstore.UserStore Camera2StreamConfigurationMap;
    private final com.paypal.oslo.feature.qrc.domain.scanner.ImageQrScanner imageQrScanner;
    private final kotlinx.coroutines.flow.Flow<com.paypal.oslo.feature.qrc.ui.scanner.ScannerUiEffect> uiEffect;
    private final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.qrc.ui.scanner.ScannerUiState> uiState;

    @javax.inject.Inject
    public ScannerViewModel(com.paypal.oslo.feature.qrc.ui.scanner.ScannerReducer scannerReducer, com.paypal.oslo.feature.qrc.domain.usecase.ScanQrCodeUseCase scanQrCodeUseCase, com.paypal.oslo.feature.qrc.domain.usecase.PollQrcSessionUseCase pollQrcSessionUseCase, com.paypal.oslo.feature.qrc.domain.scanner.LocationMatcher locationMatcher, com.paypal.oslo.core.userstore.UserStore userStore, com.paypal.oslo.feature.qrc.domain.scanner.ImageQrScanner imageQrScanner, com.paypal.oslo.feature.qrc.domain.scanner.CameraProvider cameraProvider) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(scannerReducer, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(scanQrCodeUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pollQrcSessionUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(locationMatcher, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userStore, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(imageQrScanner, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cameraProvider, "");
        this.getHighSpeedVideoSizes = scannerReducer;
        this.getHighSpeedVideoFpsRanges = scanQrCodeUseCase;
        this.getHighSpeedVideoFpsRangesFor = pollQrcSessionUseCase;
        this.getHighResolutionOutputSizeshNQ4ISI = locationMatcher;
        this.Camera2StreamConfigurationMap = userStore;
        this.imageQrScanner = imageQrScanner;
        this.cameraProvider = cameraProvider;
        com.paypal.oslo.core.mvi.MviStateStore<com.paypal.oslo.feature.qrc.ui.scanner.ScannerUiState, com.paypal.oslo.feature.qrc.ui.scanner.ScannerEvent, com.paypal.oslo.feature.qrc.ui.scanner.ScannerUiEffect> mviStateStore = new com.paypal.oslo.core.mvi.MviStateStore<>("ScannerViewModel.store", com.paypal.oslo.feature.qrc.ui.scanner.ScannerUiState.Initial.INSTANCE, scannerReducer, kotlin.collections.CollectionsKt.listOf(new com.paypal.oslo.core.mvi.MviStateStore.Middleware<com.paypal.oslo.feature.qrc.ui.scanner.ScannerUiState, com.paypal.oslo.feature.qrc.ui.scanner.ScannerEvent>() { // from class: com.paypal.oslo.feature.qrc.ui.scanner.ScannerViewModel$sideEffectsMiddleware$1
            /* JADX WARN: Code restructure failed: missing block: B:13:0x0042, code lost:
            
                r3 = r2.Camera2StreamConfigurationMap.getOutputFormats;
             */
            @Override // com.paypal.oslo.core.mvi.MviStateStore.Middleware
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final void invoke(com.paypal.oslo.core.mvi.MviStateStore.Middleware.Input<com.paypal.oslo.feature.qrc.ui.scanner.ScannerUiState, com.paypal.oslo.feature.qrc.ui.scanner.ScannerEvent> input) {
                java.lang.String str;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
                com.paypal.oslo.feature.qrc.ui.scanner.ScannerUiState component2 = input.getStates().component2();
                com.paypal.oslo.feature.qrc.ui.scanner.ScannerEvent event = input.getEvent();
                if (event instanceof com.paypal.oslo.feature.qrc.ui.scanner.ScannerEvent.QRCodeScanned) {
                    if (component2.isAPILoading()) {
                        com.paypal.oslo.feature.qrc.ui.scanner.ScannerEvent.QRCodeScanned qRCodeScanned = (com.paypal.oslo.feature.qrc.ui.scanner.ScannerEvent.QRCodeScanned) event;
                        com.paypal.oslo.feature.qrc.ui.scanner.ScannerViewModel.this.getOutputFormats = qRCodeScanned.getQrCode();
                        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(r0), null, null, new com.paypal.oslo.feature.qrc.ui.scanner.ScannerViewModel$scanQrCode$1(qRCodeScanned.getQrCode(), com.paypal.oslo.feature.qrc.ui.scanner.ScannerViewModel.this, null), 3, null);
                        return;
                    }
                    return;
                }
                if (kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.qrc.ui.scanner.ScannerEvent.EnrollmentCompleted.INSTANCE)) {
                    if (!component2.isAPILoading() || str == null) {
                        return;
                    }
                    kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(r0), null, null, new com.paypal.oslo.feature.qrc.ui.scanner.ScannerViewModel$scanQrCode$1(str, com.paypal.oslo.feature.qrc.ui.scanner.ScannerViewModel.this, null), 3, null);
                    return;
                }
                if (event instanceof com.paypal.oslo.feature.qrc.ui.scanner.ScannerEvent.PollForQrcSession) {
                    if (component2.isAPILoading()) {
                        com.paypal.oslo.feature.qrc.ui.scanner.ScannerViewModel.access$startPollingForQrcSession(com.paypal.oslo.feature.qrc.ui.scanner.ScannerViewModel.this, ((com.paypal.oslo.feature.qrc.ui.scanner.ScannerEvent.PollForQrcSession) event).getPollingSessionInfo());
                    }
                } else if (event instanceof com.paypal.oslo.feature.qrc.ui.scanner.ScannerEvent.LocationPermissionGranted) {
                    kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(r0), null, null, new com.paypal.oslo.feature.qrc.ui.scanner.ScannerViewModel$processLocationPermissionGranted$1(com.paypal.oslo.feature.qrc.ui.scanner.ScannerViewModel.this, (com.paypal.oslo.feature.qrc.ui.scanner.ScannerEvent.LocationPermissionGranted) event, null), 3, null);
                }
            }
        }), androidx.view.ViewModelKt.getViewModelScope(this));
        this.getInputSizeshNQ4ISI = mviStateStore;
        this.uiState = mviStateStore.getUiState();
        this.uiEffect = mviStateStore.getUiEffect();
    }

    public final com.paypal.oslo.feature.qrc.domain.scanner.ImageQrScanner getImageQrScanner() {
        return this.imageQrScanner;
    }

    public final com.paypal.oslo.feature.qrc.domain.scanner.CameraProvider getCameraProvider() {
        return this.cameraProvider;
    }

    public final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.qrc.ui.scanner.ScannerUiState> getUiState() {
        return this.uiState;
    }

    public final kotlinx.coroutines.flow.Flow<com.paypal.oslo.feature.qrc.ui.scanner.ScannerUiEffect> getUiEffect() {
        return this.uiEffect;
    }

    public final void handleIntent(com.paypal.oslo.feature.qrc.ui.scanner.ScannerEvent event) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
        this.getInputSizeshNQ4ISI.onEvent(event);
    }

    public final void stopPolling() {
        kotlinx.coroutines.Job job = this.getOutputMinFrameDuration;
        if (job != null) {
            kotlinx.coroutines.Job.DefaultImpls.cancel$default(job, (java.util.concurrent.CancellationException) null, 1, (java.lang.Object) null);
        }
        this.getOutputMinFrameDuration = null;
    }

    @Override // androidx.view.ViewModel
    public final void onCleared() {
        super.onCleared();
        stopPolling();
    }

    public static final /* synthetic */ void access$handlePollingError(com.paypal.oslo.feature.qrc.ui.scanner.ScannerViewModel scannerViewModel, com.paypal.oslo.feature.qrc.domain.session.QrcSessionResultAction.Error error) {
        if (kotlin.jvm.internal.Intrinsics.areEqual(error, com.paypal.oslo.feature.qrc.domain.session.QrcSessionResultAction.Error.GenericError.INSTANCE)) {
            scannerViewModel.handleIntent(new com.paypal.oslo.feature.qrc.ui.scanner.ScannerEvent.ShowValidationError("Something went wrong"));
            return;
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(error, com.paypal.oslo.feature.qrc.domain.session.QrcSessionResultAction.Error.NoInternetError.INSTANCE)) {
            scannerViewModel.handleIntent(new com.paypal.oslo.feature.qrc.ui.scanner.ScannerEvent.ShowValidationError(com.paypal.oslo.feature.qrc.ui.utils.Constants.INTERNET_ERROR));
            return;
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(error, com.paypal.oslo.feature.qrc.domain.session.QrcSessionResultAction.Error.UnSupportedResultAction.INSTANCE)) {
            scannerViewModel.handleIntent(new com.paypal.oslo.feature.qrc.ui.scanner.ScannerEvent.ShowValidationError(com.paypal.oslo.feature.qrc.ui.utils.Constants.UNSUPPORTED_QRC_ERROR));
            return;
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(error, com.paypal.oslo.feature.qrc.domain.session.QrcSessionResultAction.Error.TimeoutError.INSTANCE)) {
            scannerViewModel.handleIntent(new com.paypal.oslo.feature.qrc.ui.scanner.ScannerEvent.ShowValidationError(com.paypal.oslo.feature.qrc.ui.utils.Constants.TIME_OUT_ERROR));
            return;
        }
        if (!(error instanceof com.paypal.oslo.feature.qrc.domain.session.QrcSessionResultAction.Error.ValidationError)) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        com.paypal.oslo.feature.qrc.domain.session.QrcSessionResultAction.Error.ValidationError validationError = (com.paypal.oslo.feature.qrc.domain.session.QrcSessionResultAction.Error.ValidationError) error;
        if (validationError.getIssue() == com.paypal.oslo.feature.qrc.domain.model.session.QrcSessionErrorIssue.COUNTRY_CODE_MISMATCH) {
            scannerViewModel.handleIntent(com.paypal.oslo.feature.qrc.ui.scanner.ScannerEvent.ShowCountryCodeMismatch.INSTANCE);
        } else {
            scannerViewModel.handleIntent(new com.paypal.oslo.feature.qrc.ui.scanner.ScannerEvent.ShowValidationError(validationError.getReason()));
        }
    }

    public static final /* synthetic */ com.paypal.oslo.feature.qrc.ui.scanner.ScannerEvent access$handleSessionResultAction(com.paypal.oslo.feature.qrc.ui.scanner.ScannerViewModel scannerViewModel, com.paypal.oslo.feature.qrc.domain.session.QrcSessionResultAction.Action action) {
        if (action instanceof com.paypal.oslo.feature.qrc.domain.session.QrcSessionResultAction.Action.PollForQrcSessionAction) {
            return new com.paypal.oslo.feature.qrc.ui.scanner.ScannerEvent.PollForQrcSession(((com.paypal.oslo.feature.qrc.domain.session.QrcSessionResultAction.Action.PollForQrcSessionAction) action).getPollingSessionInfo());
        }
        if (action instanceof com.paypal.oslo.feature.qrc.domain.session.QrcSessionResultAction.Action.ProcessPaymentAction) {
            return new com.paypal.oslo.feature.qrc.ui.scanner.ScannerEvent.QrCodeValidForPayment(((com.paypal.oslo.feature.qrc.domain.session.QrcSessionResultAction.Action.ProcessPaymentAction) action).getQrcPaymentAmountNavArgs());
        }
        if (action instanceof com.paypal.oslo.feature.qrc.domain.session.QrcSessionResultAction.Action.LaunchEnrolmentFlow) {
            return new com.paypal.oslo.feature.qrc.ui.scanner.ScannerEvent.EnrollmentRequired(((com.paypal.oslo.feature.qrc.domain.session.QrcSessionResultAction.Action.LaunchEnrolmentFlow) action).getNavArgs());
        }
        if (!kotlin.jvm.internal.Intrinsics.areEqual(action, com.paypal.oslo.feature.qrc.domain.session.QrcSessionResultAction.Action.Redirect.INSTANCE)) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return new com.paypal.oslo.feature.qrc.ui.scanner.ScannerEvent.ShowValidationError(null);
    }

    public static final /* synthetic */ void access$startPollingForQrcSession(com.paypal.oslo.feature.qrc.ui.scanner.ScannerViewModel scannerViewModel, com.paypal.oslo.feature.qrc.domain.model.session.PollingSessionInfo pollingSessionInfo) {
        kotlinx.coroutines.Job launch$default;
        kotlinx.coroutines.Job job = scannerViewModel.getOutputMinFrameDuration;
        if (job == null || !job.isActive()) {
            launch$default = kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(scannerViewModel), null, null, new com.paypal.oslo.feature.qrc.ui.scanner.ScannerViewModel$startPollingForQrcSession$1(scannerViewModel, pollingSessionInfo, null), 3, null);
            scannerViewModel.getOutputMinFrameDuration = launch$default;
        }
    }
}
