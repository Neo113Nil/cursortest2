package com.paypal.oslo.feature.verificationcapture.ui.screens.documentcapture.viewmodel;

@kotlin.Metadata(d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B9\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0015\u001a\u00020\u0012¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0019\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ'\u0010!\u001a\u00020\u00122\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001d2\b\b\u0002\u0010 \u001a\u00020\u001f¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\u0012H\u0014¢\u0006\u0004\b#\u0010\u0016R\u0014\u0010&\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010)\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010,\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010.\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010-R\u0014\u00101\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0018\u00104\u001a\u0004\u0018\u0001028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u00103R\u0018\u00107\u001a\u0004\u0018\u0001058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00106R\u0016\u0010$\u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u00108R\u0016\u0010*\u001a\u0002098\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010:R\u0016\u0010/\u001a\u0002098\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u0010:R\u0016\u0010'\u001a\u0002098\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u0010:R&\u0010>\u001a\u0014\u0012\u0004\u0012\u00020<\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020=0;8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?R\u001d\u0010A\u001a\b\u0012\u0004\u0012\u00020<0@8\u0007¢\u0006\f\n\u0004\bA\u0010B\u001a\u0004\bC\u0010DR \u0010F\u001a\b\u0012\u0004\u0012\u00020=0E8\u0007X\u0087\u0004¢\u0006\f\n\u0004\bF\u0010G\u001a\u0004\bH\u0010I"}, d2 = {"Lcom/paypal/oslo/feature/verificationcapture/ui/screens/documentcapture/viewmodel/DocumentCaptureViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/paypal/oslo/feature/verificationcapture/domain/usecase/StartDocumentCaptureUseCase;", "startCaptureUseCase", "Lcom/paypal/oslo/feature/verificationcapture/domain/usecase/StopDocumentCaptureUseCase;", "stopCaptureUseCase", "Lcom/paypal/oslo/feature/verificationcapture/domain/usecase/SetScanViewUseCase;", "setScanViewUseCase", "Lcom/paypal/oslo/feature/verificationcapture/domain/usecase/GetCaptureResultUseCase;", "getCaptureResultUseCase", "Lcom/paypal/oslo/feature/verificationcapture/domain/usecase/SetFlashEnabledUseCase;", "setFlashEnabledUseCase", "Lcom/paypal/oslo/feature/verificationcapture/ui/screens/documentcapture/reducer/DocumentCaptureReducer;", "reducer", "<init>", "(Lcom/paypal/oslo/feature/verificationcapture/domain/usecase/StartDocumentCaptureUseCase;Lcom/paypal/oslo/feature/verificationcapture/domain/usecase/StopDocumentCaptureUseCase;Lcom/paypal/oslo/feature/verificationcapture/domain/usecase/SetScanViewUseCase;Lcom/paypal/oslo/feature/verificationcapture/domain/usecase/GetCaptureResultUseCase;Lcom/paypal/oslo/feature/verificationcapture/domain/usecase/SetFlashEnabledUseCase;Lcom/paypal/oslo/feature/verificationcapture/ui/screens/documentcapture/reducer/DocumentCaptureReducer;)V", "Lcom/paypal/oslo/feature/verificationcapture/ui/screens/documentcapture/contract/DocumentCaptureEvent;", "event", "", "processEvent", "(Lcom/paypal/oslo/feature/verificationcapture/ui/screens/documentcapture/contract/DocumentCaptureEvent;)V", "setRuntimePermissionGranted", "()V", "Lcom/daon/dmds/views/DaonDocumentScanView;", "scanView", "setScanView", "(Lcom/daon/dmds/views/DaonDocumentScanView;)V", "Lcom/paypal/oslo/feature/verificationcapture/domain/model/DocumentType;", "documentType", "Lcom/paypal/oslo/feature/verificationcapture/domain/model/DocumentSide;", "documentSide", "Lcom/paypal/oslo/feature/verificationcapture/domain/model/CaptureConfig;", "config", "initialize", "(Lcom/paypal/oslo/feature/verificationcapture/domain/model/DocumentType;Lcom/paypal/oslo/feature/verificationcapture/domain/model/DocumentSide;Lcom/paypal/oslo/feature/verificationcapture/domain/model/CaptureConfig;)V", "onCleared", "getInputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/verificationcapture/domain/usecase/StartDocumentCaptureUseCase;", "getHighSpeedVideoFpsRanges", "getOutputSizes", "Lcom/paypal/oslo/feature/verificationcapture/domain/usecase/StopDocumentCaptureUseCase;", "Camera2StreamConfigurationMap", "getHighSpeedVideoSizesFor", "Lcom/paypal/oslo/feature/verificationcapture/domain/usecase/SetScanViewUseCase;", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/feature/verificationcapture/domain/usecase/GetCaptureResultUseCase;", "getHighResolutionOutputSizeshNQ4ISI", "getOutputMinFrameDuration", "Lcom/paypal/oslo/feature/verificationcapture/domain/usecase/SetFlashEnabledUseCase;", "getHighSpeedVideoSizes", "Lkotlinx/coroutines/Job;", "Lkotlinx/coroutines/Job;", "getOutputFormats", "Landroid/os/CountDownTimer;", "Landroid/os/CountDownTimer;", "getInputFormats", "Lcom/paypal/oslo/feature/verificationcapture/domain/model/CaptureConfig;", "", "Z", "Lcom/paypal/oslo/core/mvi/MviStateStore;", "Lcom/paypal/oslo/feature/verificationcapture/ui/screens/documentcapture/contract/DocumentCaptureUiState;", "Lcom/paypal/oslo/feature/verificationcapture/ui/screens/documentcapture/contract/DocumentCaptureUiEffect;", "getOutputStallDurationlomOqCM", "Lcom/paypal/oslo/core/mvi/MviStateStore;", "Lkotlinx/coroutines/flow/StateFlow;", "uiState", "Lkotlinx/coroutines/flow/StateFlow;", "getUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "Lkotlinx/coroutines/flow/Flow;", "uiEffect", "Lkotlinx/coroutines/flow/Flow;", "getUiEffect", "()Lkotlinx/coroutines/flow/Flow;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class DocumentCaptureViewModel extends androidx.view.ViewModel {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private com.paypal.oslo.feature.verificationcapture.domain.model.CaptureConfig getInputSizeshNQ4ISI;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private boolean getHighSpeedVideoSizesFor;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.verificationcapture.domain.usecase.GetCaptureResultUseCase getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private kotlinx.coroutines.Job getOutputFormats;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private boolean getOutputSizes;

    /* renamed from: getHighSpeedVideoSizesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.verificationcapture.domain.usecase.SetScanViewUseCase getHighSpeedVideoFpsRangesFor;

    /* renamed from: getInputFormats, reason: from kotlin metadata */
    private boolean getOutputMinFrameDuration;

    /* renamed from: getInputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.verificationcapture.domain.usecase.StartDocumentCaptureUseCase getHighSpeedVideoFpsRanges;

    /* renamed from: getOutputFormats, reason: from kotlin metadata */
    private android.os.CountDownTimer getInputFormats;

    /* renamed from: getOutputMinFrameDuration, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.verificationcapture.domain.usecase.SetFlashEnabledUseCase getHighSpeedVideoSizes;

    /* renamed from: getOutputSizes, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.verificationcapture.domain.usecase.StopDocumentCaptureUseCase Camera2StreamConfigurationMap;
    private final com.paypal.oslo.core.mvi.MviStateStore<com.paypal.oslo.feature.verificationcapture.ui.screens.documentcapture.contract.DocumentCaptureUiState, com.paypal.oslo.feature.verificationcapture.ui.screens.documentcapture.contract.DocumentCaptureEvent, com.paypal.oslo.feature.verificationcapture.ui.screens.documentcapture.contract.DocumentCaptureUiEffect> getOutputStallDurationlomOqCM;
    private final kotlinx.coroutines.flow.Flow<com.paypal.oslo.feature.verificationcapture.ui.screens.documentcapture.contract.DocumentCaptureUiEffect> uiEffect;
    private final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.verificationcapture.ui.screens.documentcapture.contract.DocumentCaptureUiState> uiState;

    @javax.inject.Inject
    public DocumentCaptureViewModel(com.paypal.oslo.feature.verificationcapture.domain.usecase.StartDocumentCaptureUseCase startDocumentCaptureUseCase, com.paypal.oslo.feature.verificationcapture.domain.usecase.StopDocumentCaptureUseCase stopDocumentCaptureUseCase, com.paypal.oslo.feature.verificationcapture.domain.usecase.SetScanViewUseCase setScanViewUseCase, com.paypal.oslo.feature.verificationcapture.domain.usecase.GetCaptureResultUseCase getCaptureResultUseCase, com.paypal.oslo.feature.verificationcapture.domain.usecase.SetFlashEnabledUseCase setFlashEnabledUseCase, com.paypal.oslo.feature.verificationcapture.ui.screens.documentcapture.reducer.DocumentCaptureReducer documentCaptureReducer) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(startDocumentCaptureUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(stopDocumentCaptureUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(setScanViewUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getCaptureResultUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(setFlashEnabledUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(documentCaptureReducer, "");
        this.getHighSpeedVideoFpsRanges = startDocumentCaptureUseCase;
        this.Camera2StreamConfigurationMap = stopDocumentCaptureUseCase;
        this.getHighSpeedVideoFpsRangesFor = setScanViewUseCase;
        this.getHighResolutionOutputSizeshNQ4ISI = getCaptureResultUseCase;
        this.getHighSpeedVideoSizes = setFlashEnabledUseCase;
        this.getInputSizeshNQ4ISI = new com.paypal.oslo.feature.verificationcapture.domain.model.CaptureConfig(0, 0, false, 0, 0.0f, 0, false, null, 0, false, false, 2047, null);
        com.paypal.oslo.core.mvi.MviStateStore<com.paypal.oslo.feature.verificationcapture.ui.screens.documentcapture.contract.DocumentCaptureUiState, com.paypal.oslo.feature.verificationcapture.ui.screens.documentcapture.contract.DocumentCaptureEvent, com.paypal.oslo.feature.verificationcapture.ui.screens.documentcapture.contract.DocumentCaptureUiEffect> mviStateStore = new com.paypal.oslo.core.mvi.MviStateStore<>("DocumentCaptureViewModel.store", com.paypal.oslo.feature.verificationcapture.ui.screens.documentcapture.contract.DocumentCaptureUiState.Initial.INSTANCE, documentCaptureReducer, kotlin.collections.CollectionsKt.listOf(new com.paypal.oslo.core.mvi.MviStateStore.Middleware<com.paypal.oslo.feature.verificationcapture.ui.screens.documentcapture.contract.DocumentCaptureUiState, com.paypal.oslo.feature.verificationcapture.ui.screens.documentcapture.contract.DocumentCaptureEvent>() { // from class: com.paypal.oslo.feature.verificationcapture.ui.screens.documentcapture.viewmodel.DocumentCaptureViewModel$sideEffectsMiddleware$1
            @Override // com.paypal.oslo.core.mvi.MviStateStore.Middleware
            public final void invoke(com.paypal.oslo.core.mvi.MviStateStore.Middleware.Input<com.paypal.oslo.feature.verificationcapture.ui.screens.documentcapture.contract.DocumentCaptureUiState, com.paypal.oslo.feature.verificationcapture.ui.screens.documentcapture.contract.DocumentCaptureEvent> input) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
                com.paypal.oslo.feature.verificationcapture.ui.screens.documentcapture.contract.DocumentCaptureUiState second = input.getStates().getSecond();
                com.paypal.oslo.feature.verificationcapture.ui.screens.documentcapture.contract.DocumentCaptureEvent event = input.getEvent();
                if (event instanceof com.paypal.oslo.feature.verificationcapture.ui.screens.documentcapture.contract.DocumentCaptureEvent.StartCapture) {
                    com.paypal.oslo.feature.verificationcapture.ui.screens.documentcapture.viewmodel.DocumentCaptureViewModel.access$handleStartCapture(com.paypal.oslo.feature.verificationcapture.ui.screens.documentcapture.viewmodel.DocumentCaptureViewModel.this, input.getEventDispatcher(), second);
                    return;
                }
                if (event instanceof com.paypal.oslo.feature.verificationcapture.ui.screens.documentcapture.contract.DocumentCaptureEvent.RetakePhoto) {
                    com.paypal.oslo.feature.verificationcapture.ui.screens.documentcapture.viewmodel.DocumentCaptureViewModel.access$handleStartCapture(com.paypal.oslo.feature.verificationcapture.ui.screens.documentcapture.viewmodel.DocumentCaptureViewModel.this, input.getEventDispatcher(), second);
                    return;
                }
                if (event instanceof com.paypal.oslo.feature.verificationcapture.ui.screens.documentcapture.contract.DocumentCaptureEvent.ToggleFlash) {
                    com.paypal.oslo.feature.verificationcapture.ui.screens.documentcapture.viewmodel.DocumentCaptureViewModel.access$handleToggleFlash(com.paypal.oslo.feature.verificationcapture.ui.screens.documentcapture.viewmodel.DocumentCaptureViewModel.this, second);
                    return;
                }
                if (event instanceof com.paypal.oslo.feature.verificationcapture.ui.screens.documentcapture.contract.DocumentCaptureEvent.StopCapture) {
                    kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(r4), null, null, new com.paypal.oslo.feature.verificationcapture.ui.screens.documentcapture.viewmodel.DocumentCaptureViewModel$handleStopCapture$1(com.paypal.oslo.feature.verificationcapture.ui.screens.documentcapture.viewmodel.DocumentCaptureViewModel.this, null), 3, null);
                    com.paypal.oslo.feature.verificationcapture.ui.screens.documentcapture.viewmodel.DocumentCaptureViewModel.access$cancelTimers(com.paypal.oslo.feature.verificationcapture.ui.screens.documentcapture.viewmodel.DocumentCaptureViewModel.this);
                } else if ((event instanceof com.paypal.oslo.feature.verificationcapture.ui.screens.documentcapture.contract.DocumentCaptureEvent.CaptureCompleted) || (event instanceof com.paypal.oslo.feature.verificationcapture.ui.screens.documentcapture.contract.DocumentCaptureEvent.CaptureTimeout) || (event instanceof com.paypal.oslo.feature.verificationcapture.ui.screens.documentcapture.contract.DocumentCaptureEvent.CancelCapture)) {
                    com.paypal.oslo.feature.verificationcapture.ui.screens.documentcapture.viewmodel.DocumentCaptureViewModel.access$cancelTimers(com.paypal.oslo.feature.verificationcapture.ui.screens.documentcapture.viewmodel.DocumentCaptureViewModel.this);
                }
            }
        }), androidx.view.ViewModelKt.getViewModelScope(this));
        this.getOutputStallDurationlomOqCM = mviStateStore;
        this.uiState = mviStateStore.getUiState();
        this.uiEffect = mviStateStore.getUiEffect();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ java.lang.Object access$handleCaptureCompletion(com.paypal.oslo.feature.verificationcapture.ui.screens.documentcapture.viewmodel.DocumentCaptureViewModel documentCaptureViewModel, kotlin.jvm.functions.Function1 function1, kotlin.coroutines.Continuation continuation) {
        com.paypal.oslo.feature.verificationcapture.ui.screens.documentcapture.viewmodel.DocumentCaptureViewModel$handleCaptureCompletion$1 documentCaptureViewModel$handleCaptureCompletion$1;
        int i;
        com.paypal.oslo.feature.verificationcapture.domain.model.CaptureResult captureResult;
        if (continuation instanceof com.paypal.oslo.feature.verificationcapture.ui.screens.documentcapture.viewmodel.DocumentCaptureViewModel$handleCaptureCompletion$1) {
            documentCaptureViewModel$handleCaptureCompletion$1 = (com.paypal.oslo.feature.verificationcapture.ui.screens.documentcapture.viewmodel.DocumentCaptureViewModel$handleCaptureCompletion$1) continuation;
            if ((documentCaptureViewModel$handleCaptureCompletion$1.Camera2StreamConfigurationMap & Integer.MIN_VALUE) != 0) {
                documentCaptureViewModel$handleCaptureCompletion$1.Camera2StreamConfigurationMap -= 2147483648;
                java.lang.Object obj = documentCaptureViewModel$handleCaptureCompletion$1.getHighResolutionOutputSizeshNQ4ISI;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = documentCaptureViewModel$handleCaptureCompletion$1.Camera2StreamConfigurationMap;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.feature.verificationcapture.domain.usecase.GetCaptureResultUseCase getCaptureResultUseCase = documentCaptureViewModel.getHighResolutionOutputSizeshNQ4ISI;
                    documentCaptureViewModel$handleCaptureCompletion$1.getHighSpeedVideoFpsRanges = function1;
                    documentCaptureViewModel$handleCaptureCompletion$1.Camera2StreamConfigurationMap = 1;
                    obj = getCaptureResultUseCase.invoke(documentCaptureViewModel$handleCaptureCompletion$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    function1 = (kotlin.jvm.functions.Function1) documentCaptureViewModel$handleCaptureCompletion$1.getHighSpeedVideoFpsRanges;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                captureResult = (com.paypal.oslo.feature.verificationcapture.domain.model.CaptureResult) obj;
                if (captureResult == null) {
                    function1.invoke(new com.paypal.oslo.feature.verificationcapture.ui.screens.documentcapture.contract.DocumentCaptureEvent.CaptureCompleted(captureResult));
                } else {
                    function1.invoke(new com.paypal.oslo.feature.verificationcapture.ui.screens.documentcapture.contract.DocumentCaptureEvent.CaptureError(new com.paypal.oslo.feature.verificationcapture.ui.screens.documentcapture.contract.UiError("NO_RESULT", "Capture completed but no result available", true)));
                }
                return kotlin.Unit.INSTANCE;
            }
        }
        documentCaptureViewModel$handleCaptureCompletion$1 = new com.paypal.oslo.feature.verificationcapture.ui.screens.documentcapture.viewmodel.DocumentCaptureViewModel$handleCaptureCompletion$1(documentCaptureViewModel, continuation);
        java.lang.Object obj2 = documentCaptureViewModel$handleCaptureCompletion$1.getHighResolutionOutputSizeshNQ4ISI;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = documentCaptureViewModel$handleCaptureCompletion$1.Camera2StreamConfigurationMap;
        if (i != 0) {
        }
        captureResult = (com.paypal.oslo.feature.verificationcapture.domain.model.CaptureResult) obj2;
        if (captureResult == null) {
        }
        return kotlin.Unit.INSTANCE;
    }

    public final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.verificationcapture.ui.screens.documentcapture.contract.DocumentCaptureUiState> getUiState() {
        return this.uiState;
    }

    public final kotlinx.coroutines.flow.Flow<com.paypal.oslo.feature.verificationcapture.ui.screens.documentcapture.contract.DocumentCaptureUiEffect> getUiEffect() {
        return this.uiEffect;
    }

    public final void processEvent(com.paypal.oslo.feature.verificationcapture.ui.screens.documentcapture.contract.DocumentCaptureEvent event) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
        this.getOutputStallDurationlomOqCM.onEvent(event);
    }

    public final void setRuntimePermissionGranted() {
        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.verificationcapture.LoggerKt.log, "[DocumentCaptureVM] 🔐 Runtime permission granted - will wait for camera HAL", null, null, 6, null);
        this.getOutputSizes = true;
    }

    public final void setScanView(com.daon.dmds.views.DaonDocumentScanView scanView) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(scanView, "");
        kotlinx.coroutines.Job job = this.getOutputFormats;
        if (job != null) {
            kotlinx.coroutines.Job.DefaultImpls.cancel$default(job, (java.util.concurrent.CancellationException) null, 1, (java.lang.Object) null);
        }
        android.os.CountDownTimer countDownTimer = this.getInputFormats;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        this.getInputFormats = null;
        this.getHighSpeedVideoFpsRangesFor.invoke(scanView);
        this.getHighSpeedVideoSizesFor = true;
        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.verificationcapture.LoggerKt.log, "[DocumentCaptureVM] ✅ isScanViewReady set to TRUE", null, null, 6, null);
        if (this.getOutputMinFrameDuration) {
            com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.verificationcapture.LoggerKt.log, "[DocumentCaptureVM] 🔄 pendingStartCapture=true, triggering StartCapture immediately", null, null, 6, null);
            this.getOutputMinFrameDuration = false;
            processEvent(com.paypal.oslo.feature.verificationcapture.ui.screens.documentcapture.contract.DocumentCaptureEvent.StartCapture.INSTANCE);
            com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.verificationcapture.LoggerKt.log, "[DocumentCaptureVM] After StartCapture event", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("state", this.uiState.getValue().getName())), null, 4, null);
            return;
        }
        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.verificationcapture.LoggerKt.log, "[DocumentCaptureVM] ⚠️  pendingStartCapture=false, NOT triggering StartCapture", null, null, 6, null);
    }

    public static /* synthetic */ void initialize$default(com.paypal.oslo.feature.verificationcapture.ui.screens.documentcapture.viewmodel.DocumentCaptureViewModel documentCaptureViewModel, com.paypal.oslo.feature.verificationcapture.domain.model.DocumentType documentType, com.paypal.oslo.feature.verificationcapture.domain.model.DocumentSide documentSide, com.paypal.oslo.feature.verificationcapture.domain.model.CaptureConfig captureConfig, int i, java.lang.Object obj) {
        com.paypal.oslo.feature.verificationcapture.domain.model.DocumentType documentType2;
        com.paypal.oslo.feature.verificationcapture.domain.model.DocumentSide documentSide2;
        com.paypal.oslo.feature.verificationcapture.domain.model.CaptureConfig captureConfig2;
        if ((i & 4) != 0) {
            captureConfig2 = new com.paypal.oslo.feature.verificationcapture.domain.model.CaptureConfig(0, 0, false, 0, 0.0f, 0, false, null, 0, false, false, 2047, null);
            documentType2 = documentType;
            documentSide2 = documentSide;
        } else {
            documentType2 = documentType;
            documentSide2 = documentSide;
            captureConfig2 = captureConfig;
        }
        documentCaptureViewModel.initialize(documentType2, documentSide2, captureConfig2);
    }

    public final void initialize(com.paypal.oslo.feature.verificationcapture.domain.model.DocumentType documentType, com.paypal.oslo.feature.verificationcapture.domain.model.DocumentSide documentSide, com.paypal.oslo.feature.verificationcapture.domain.model.CaptureConfig config) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(documentType, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(documentSide, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(config, "");
        this.getHighSpeedVideoSizesFor = false;
        this.getOutputMinFrameDuration = false;
        kotlinx.coroutines.Job job = this.getOutputFormats;
        if (job != null) {
            kotlinx.coroutines.Job.DefaultImpls.cancel$default(job, (java.util.concurrent.CancellationException) null, 1, (java.lang.Object) null);
        }
        android.os.CountDownTimer countDownTimer = this.getInputFormats;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        this.getInputFormats = null;
        this.getInputSizeshNQ4ISI = config;
        processEvent(new com.paypal.oslo.feature.verificationcapture.ui.screens.documentcapture.contract.DocumentCaptureEvent.Initialize(documentType, documentSide, config));
        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.verificationcapture.LoggerKt.log, "[DocumentCaptureVM] After Initialize event", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("state", this.uiState.getValue().getName())), null, 4, null);
        if (config.getImmediateTimeout()) {
            com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.verificationcapture.LoggerKt.log, "[DocumentCaptureVM] immediateTimeout=true — returning timeout without starting camera", null, null, 6, null);
            processEvent(com.paypal.oslo.feature.verificationcapture.ui.screens.documentcapture.contract.DocumentCaptureEvent.CaptureTimeout.INSTANCE);
        } else {
            processEvent(com.paypal.oslo.feature.verificationcapture.ui.screens.documentcapture.contract.DocumentCaptureEvent.StartCapture.INSTANCE);
            com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.verificationcapture.LoggerKt.log, "[DocumentCaptureVM] After StartCapture event", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("state", this.uiState.getValue().getName())), null, 4, null);
        }
    }

    @Override // androidx.view.ViewModel
    public final void onCleared() {
        super.onCleared();
        android.os.CountDownTimer countDownTimer = this.getInputFormats;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        this.getInputFormats = null;
        kotlinx.coroutines.Job job = this.getOutputFormats;
        if (job != null) {
            kotlinx.coroutines.Job.DefaultImpls.cancel$default(job, (java.util.concurrent.CancellationException) null, 1, (java.lang.Object) null);
        }
    }

    public static final /* synthetic */ void access$cancelTimers(com.paypal.oslo.feature.verificationcapture.ui.screens.documentcapture.viewmodel.DocumentCaptureViewModel documentCaptureViewModel) {
        android.os.CountDownTimer countDownTimer = documentCaptureViewModel.getInputFormats;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        documentCaptureViewModel.getInputFormats = null;
    }

    public static final /* synthetic */ void access$handleCaptureException(com.paypal.oslo.feature.verificationcapture.ui.screens.documentcapture.viewmodel.DocumentCaptureViewModel documentCaptureViewModel, java.lang.Exception exc, kotlin.jvm.functions.Function1 function1) {
        if (exc instanceof java.util.concurrent.CancellationException) {
            return;
        }
        java.lang.String message = exc.getMessage();
        if (message == null) {
            message = com.paypal.oslo.feature.settings.closeaccount.data.repository.CloseAccountRepositoryImpl.UNKNOWN_ERROR;
        }
        function1.invoke(new com.paypal.oslo.feature.verificationcapture.ui.screens.documentcapture.contract.DocumentCaptureEvent.CaptureError(new com.paypal.oslo.feature.verificationcapture.ui.screens.documentcapture.contract.UiError("CAPTURE_EXCEPTION", message, true)));
    }

    public static final /* synthetic */ void access$handleStartCapture(com.paypal.oslo.feature.verificationcapture.ui.screens.documentcapture.viewmodel.DocumentCaptureViewModel documentCaptureViewModel, kotlin.jvm.functions.Function1 function1, com.paypal.oslo.feature.verificationcapture.ui.screens.documentcapture.contract.DocumentCaptureUiState documentCaptureUiState) {
        kotlinx.coroutines.Job launch$default;
        if (documentCaptureViewModel.getHighSpeedVideoSizesFor) {
            com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.verificationcapture.LoggerKt.log, "[DocumentCaptureVM] ✅ Scan view IS ready - proceeding with capture", null, null, 6, null);
            kotlinx.coroutines.Job job = documentCaptureViewModel.getOutputFormats;
            kotlin.Pair pair = null;
            if (job != null) {
                kotlinx.coroutines.Job.DefaultImpls.cancel$default(job, (java.util.concurrent.CancellationException) null, 1, (java.lang.Object) null);
            }
            if (documentCaptureUiState instanceof com.paypal.oslo.feature.verificationcapture.ui.screens.documentcapture.contract.DocumentCaptureUiState.Loading) {
                com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.verificationcapture.LoggerKt.log, "[DocumentCaptureVM] ⚠️  State is Loading - using UNKNOWN document type (this is a BUG!)", null, null, 6, null);
                pair = kotlin.TuplesKt.to(com.paypal.oslo.feature.verificationcapture.domain.model.DocumentType.UNKNOWN, com.paypal.oslo.feature.verificationcapture.domain.model.DocumentSide.FRONT);
            } else if (documentCaptureUiState instanceof com.paypal.oslo.feature.verificationcapture.ui.screens.documentcapture.contract.DocumentCaptureUiState.Capturing) {
                com.paypal.oslo.feature.verificationcapture.ui.screens.documentcapture.contract.DocumentCaptureUiState.Capturing capturing = (com.paypal.oslo.feature.verificationcapture.ui.screens.documentcapture.contract.DocumentCaptureUiState.Capturing) documentCaptureUiState;
                com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.verificationcapture.LoggerKt.log, "[DocumentCaptureVM] ✅ State is Capturing", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.paypal.oslo.feature.verificationcapture.telemetry.VerificationCaptureTelemetry.Attributes.DOCUMENT_TYPE, capturing.getDocumentType()), kotlin.TuplesKt.to(com.paypal.oslo.feature.verificationcapture.telemetry.VerificationCaptureTelemetry.Attributes.DOCUMENT_SIDE, capturing.getDocumentSide())), null, 4, null);
                pair = kotlin.TuplesKt.to(capturing.getDocumentType(), capturing.getDocumentSide());
            } else {
                com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.verificationcapture.LoggerKt.log, "[DocumentCaptureVM] ❌ State is neither Loading nor Capturing - aborting!", null, null, 6, null);
            }
            if (pair == null) {
                return;
            }
            launch$default = kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(documentCaptureViewModel), null, null, new com.paypal.oslo.feature.verificationcapture.ui.screens.documentcapture.viewmodel.DocumentCaptureViewModel$launchCaptureJob$1(documentCaptureViewModel, (com.paypal.oslo.feature.verificationcapture.domain.model.DocumentType) pair.getFirst(), (com.paypal.oslo.feature.verificationcapture.domain.model.DocumentSide) pair.getSecond(), function1, null), 3, null);
            documentCaptureViewModel.getOutputFormats = launch$default;
            return;
        }
        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.verificationcapture.LoggerKt.log, "[DocumentCaptureVM] ⚠️  Scan view NOT ready - marking pendingStartCapture=true", null, null, 6, null);
        documentCaptureViewModel.getOutputMinFrameDuration = true;
    }

    public static final /* synthetic */ void access$handleToggleFlash(com.paypal.oslo.feature.verificationcapture.ui.screens.documentcapture.viewmodel.DocumentCaptureViewModel documentCaptureViewModel, com.paypal.oslo.feature.verificationcapture.ui.screens.documentcapture.contract.DocumentCaptureUiState documentCaptureUiState) {
        if (documentCaptureUiState instanceof com.paypal.oslo.feature.verificationcapture.ui.screens.documentcapture.contract.DocumentCaptureUiState.Capturing) {
            kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(documentCaptureViewModel), null, null, new com.paypal.oslo.feature.verificationcapture.ui.screens.documentcapture.viewmodel.DocumentCaptureViewModel$handleToggleFlash$1(documentCaptureViewModel, documentCaptureUiState, null), 3, null);
        }
    }
}
