package com.paypal.oslo.feature.p2p.ui.review.viewmodels;

@kotlin.Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u000f\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\r\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R&\u0010\u0019\u001a\u0014\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00170\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0018R\u001d\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00160\u001a8\u0007¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR \u0010 \u001a\b\u0012\u0004\u0012\u00020\u00170\u001f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u001c\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010%0$8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010&R\"\u0010'\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010%0\u001a8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b'\u0010\u001c\u001a\u0004\b(\u0010\u001e"}, d2 = {"Lcom/paypal/oslo/feature/p2p/ui/review/viewmodels/NoteViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/paypal/oslo/feature/p2p/domain/usecase/UpdateNoteUseCase;", "updateNoteUseCase", "Lcom/paypal/oslo/feature/p2p/domain/usecase/GetPaymentTransferAttemptUseCase;", "getPaymentTransferAttemptUseCase", "<init>", "(Lcom/paypal/oslo/feature/p2p/domain/usecase/UpdateNoteUseCase;Lcom/paypal/oslo/feature/p2p/domain/usecase/GetPaymentTransferAttemptUseCase;)V", "Lcom/paypal/oslo/feature/p2p/ui/review/events/NoteEvent;", "event", "", "processEvent", "(Lcom/paypal/oslo/feature/p2p/ui/review/events/NoteEvent;)V", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/feature/p2p/domain/usecase/UpdateNoteUseCase;", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/feature/p2p/domain/usecase/GetPaymentTransferAttemptUseCase;", "Lcom/paypal/oslo/feature/p2p/ui/review/viewmodels/NoteViewModel$sideEffectsMiddleware$1;", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/feature/p2p/ui/review/viewmodels/NoteViewModel$sideEffectsMiddleware$1;", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/core/mvi/MviStateStore;", "Lcom/paypal/oslo/feature/p2p/ui/review/state/NoteUiState;", "Lcom/paypal/oslo/feature/p2p/ui/review/effects/NoteEffect;", "Lcom/paypal/oslo/core/mvi/MviStateStore;", "getHighResolutionOutputSizeshNQ4ISI", "Lkotlinx/coroutines/flow/StateFlow;", "uiState", "Lkotlinx/coroutines/flow/StateFlow;", "getUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "Lkotlinx/coroutines/flow/Flow;", "uiEffect", "Lkotlinx/coroutines/flow/Flow;", "getUiEffect", "()Lkotlinx/coroutines/flow/Flow;", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/paypal/oslo/feature/p2p/domain/model/FundingOptions;", "Lkotlinx/coroutines/flow/MutableStateFlow;", "noteFundingOptions", "getNoteFundingOptions"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class NoteViewModel extends androidx.view.ViewModel {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.p2p.ui.review.viewmodels.NoteViewModel$sideEffectsMiddleware$1 getHighSpeedVideoFpsRanges;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.p2p.domain.model.FundingOptions> Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.core.mvi.MviStateStore<com.paypal.oslo.feature.p2p.ui.review.state.NoteUiState, com.paypal.oslo.feature.p2p.ui.review.events.NoteEvent, com.paypal.oslo.feature.p2p.ui.review.effects.NoteEffect> getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.p2p.domain.usecase.UpdateNoteUseCase getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.p2p.domain.usecase.GetPaymentTransferAttemptUseCase getHighSpeedVideoFpsRangesFor;
    private final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.p2p.domain.model.FundingOptions> noteFundingOptions;
    private final kotlinx.coroutines.flow.Flow<com.paypal.oslo.feature.p2p.ui.review.effects.NoteEffect> uiEffect;
    private final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.p2p.ui.review.state.NoteUiState> uiState;

    /* JADX WARN: Type inference failed for: r1v1, types: [com.paypal.oslo.feature.p2p.ui.review.viewmodels.NoteViewModel$sideEffectsMiddleware$1, java.lang.Object] */
    @javax.inject.Inject
    public NoteViewModel(com.paypal.oslo.feature.p2p.domain.usecase.UpdateNoteUseCase updateNoteUseCase, com.paypal.oslo.feature.p2p.domain.usecase.GetPaymentTransferAttemptUseCase getPaymentTransferAttemptUseCase) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(updateNoteUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getPaymentTransferAttemptUseCase, "");
        this.getHighSpeedVideoSizes = updateNoteUseCase;
        this.getHighSpeedVideoFpsRangesFor = getPaymentTransferAttemptUseCase;
        ?? r1 = new com.paypal.oslo.core.mvi.MviStateStore.Middleware<com.paypal.oslo.feature.p2p.ui.review.state.NoteUiState, com.paypal.oslo.feature.p2p.ui.review.events.NoteEvent>() { // from class: com.paypal.oslo.feature.p2p.ui.review.viewmodels.NoteViewModel$sideEffectsMiddleware$1
            @Override // com.paypal.oslo.core.mvi.MviStateStore.Middleware
            public final void invoke(com.paypal.oslo.core.mvi.MviStateStore.Middleware.Input<com.paypal.oslo.feature.p2p.ui.review.state.NoteUiState, com.paypal.oslo.feature.p2p.ui.review.events.NoteEvent> input) {
                kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
                com.paypal.oslo.feature.p2p.ui.review.events.NoteEvent event = input.getEvent();
                if ((event instanceof com.paypal.oslo.feature.p2p.ui.review.events.NoteEvent.MemoUpdated) || (event instanceof com.paypal.oslo.feature.p2p.ui.review.events.NoteEvent.ThemeSelected) || (event instanceof com.paypal.oslo.feature.p2p.ui.review.events.NoteEvent.GifSelected)) {
                    return;
                }
                if (event instanceof com.paypal.oslo.feature.p2p.ui.review.events.NoteEvent.NoteDoneClicked) {
                    com.paypal.oslo.feature.p2p.ui.review.viewmodels.NoteViewModel.access$handleNoteUpdate(com.paypal.oslo.feature.p2p.ui.review.viewmodels.NoteViewModel.this, input.getEventDispatcher(), input.getStates().getSecond());
                    return;
                }
                if ((event instanceof com.paypal.oslo.feature.p2p.ui.review.events.NoteEvent.PaymentIdInitialized) || (event instanceof com.paypal.oslo.feature.p2p.ui.review.events.NoteEvent.ResetForNewFlow) || kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.p2p.ui.review.events.NoteEvent.UpdateNoteFailed.INSTANCE) || kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.p2p.ui.review.events.NoteEvent.UpdateNoteSuccess.INSTANCE) || kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.p2p.ui.review.events.NoteEvent.AddNoteClicked.INSTANCE)) {
                    return;
                }
                if (kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.p2p.ui.review.events.NoteEvent.NoteCancelled.INSTANCE)) {
                    com.paypal.oslo.feature.p2p.ui.review.viewmodels.NoteViewModel.access$handleNoteCancelled(com.paypal.oslo.feature.p2p.ui.review.viewmodels.NoteViewModel.this, input.getStates().getFirst());
                } else {
                    if (kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.p2p.ui.review.events.NoteEvent.ClearFundingOptions.INSTANCE)) {
                        mutableStateFlow = com.paypal.oslo.feature.p2p.ui.review.viewmodels.NoteViewModel.this.Camera2StreamConfigurationMap;
                        mutableStateFlow.setValue(null);
                        return;
                    }
                    throw new kotlin.NoWhenBranchMatchedException();
                }
            }
        };
        this.getHighSpeedVideoFpsRanges = r1;
        com.paypal.oslo.feature.p2p.ui.review.state.NoteUiState noteUiState = new com.paypal.oslo.feature.p2p.ui.review.state.NoteUiState(null, null, false, null, null, 0, null, null, null, 511, null);
        com.paypal.oslo.feature.p2p.ui.review.reducers.NoteEventReducer noteEventReducer = com.paypal.oslo.feature.p2p.ui.review.reducers.NoteEventReducer.INSTANCE;
        java.util.List listOf = kotlin.collections.CollectionsKt.listOf(r1);
        com.paypal.oslo.feature.p2p.ui.review.viewmodels.NoteViewModel noteViewModel = this;
        com.paypal.oslo.core.mvi.MviStateStore<com.paypal.oslo.feature.p2p.ui.review.state.NoteUiState, com.paypal.oslo.feature.p2p.ui.review.events.NoteEvent, com.paypal.oslo.feature.p2p.ui.review.effects.NoteEffect> mviStateStore = new com.paypal.oslo.core.mvi.MviStateStore<>("NoteViewModel.store", noteUiState, noteEventReducer, listOf, androidx.view.ViewModelKt.getViewModelScope(noteViewModel));
        this.getHighResolutionOutputSizeshNQ4ISI = mviStateStore;
        this.uiState = mviStateStore.getUiState();
        this.uiEffect = mviStateStore.getUiEffect();
        kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.p2p.domain.model.FundingOptions> MutableStateFlow = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(null);
        this.Camera2StreamConfigurationMap = MutableStateFlow;
        this.noteFundingOptions = kotlinx.coroutines.flow.FlowKt.asStateFlow(MutableStateFlow);
        com.paypal.android.logger.Logger.i$default(com.paypal.oslo.feature.p2p.LoggerKt.log, com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Events.ADD_NOTE_SCREEN_APPEARED, kotlin.collections.MapsKt.emptyMap(), null, 4, null);
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(noteViewModel), null, null, new com.paypal.oslo.feature.p2p.ui.review.viewmodels.NoteViewModel$observePaymentTransferAttempt$1(this, null), 3, null);
    }

    public final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.p2p.ui.review.state.NoteUiState> getUiState() {
        return this.uiState;
    }

    public final kotlinx.coroutines.flow.Flow<com.paypal.oslo.feature.p2p.ui.review.effects.NoteEffect> getUiEffect() {
        return this.uiEffect;
    }

    public final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.p2p.domain.model.FundingOptions> getNoteFundingOptions() {
        return this.noteFundingOptions;
    }

    public final void processEvent(com.paypal.oslo.feature.p2p.ui.review.events.NoteEvent event) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
        if (event instanceof com.paypal.oslo.feature.p2p.ui.review.events.NoteEvent.AddNoteClicked) {
            com.paypal.android.logger.Logger logger = com.paypal.oslo.feature.p2p.LoggerKt.log;
            java.lang.String paymentTransferAttemptId = this.uiState.getValue().getPaymentTransferAttemptId();
            com.paypal.android.logger.Logger.i$default(logger, com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Events.USER_TAPPED_ADD_NOTE_BUTTON, kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("attemptId", paymentTransferAttemptId != null ? paymentTransferAttemptId : "")), null, 4, null);
        }
        this.getHighResolutionOutputSizeshNQ4ISI.onEvent(event);
    }

    public static final /* synthetic */ void access$handleNoteCancelled(com.paypal.oslo.feature.p2p.ui.review.viewmodels.NoteViewModel noteViewModel, com.paypal.oslo.feature.p2p.ui.review.state.NoteUiState noteUiState) {
        java.lang.String memo;
        com.paypal.android.logger.Logger logger = com.paypal.oslo.feature.p2p.LoggerKt.log;
        kotlin.Pair[] pairArr = new kotlin.Pair[3];
        java.lang.String paymentTransferAttemptId = noteUiState.getPaymentTransferAttemptId();
        if (paymentTransferAttemptId == null) {
            paymentTransferAttemptId = "";
        }
        int i = 0;
        pairArr[0] = kotlin.TuplesKt.to("attemptId", paymentTransferAttemptId);
        com.paypal.oslo.feature.p2p.domain.model.NoteDetails enteredNoteDetails = noteUiState.getEnteredNoteDetails();
        pairArr[1] = kotlin.TuplesKt.to("hasNote", java.lang.String.valueOf((enteredNoteDetails != null ? enteredNoteDetails.getMemo() : null) != null));
        com.paypal.oslo.feature.p2p.domain.model.NoteDetails enteredNoteDetails2 = noteUiState.getEnteredNoteDetails();
        if (enteredNoteDetails2 != null && (memo = enteredNoteDetails2.getMemo()) != null) {
            i = memo.length();
        }
        pairArr[2] = kotlin.TuplesKt.to("noteLength", java.lang.String.valueOf(i));
        com.paypal.android.logger.Logger.i$default(logger, com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Events.USER_CANCELLED_NOTE_EDIT, kotlin.collections.MapsKt.mapOf(pairArr), null, 4, null);
    }

    public static final /* synthetic */ void access$handleNoteUpdate(com.paypal.oslo.feature.p2p.ui.review.viewmodels.NoteViewModel noteViewModel, kotlin.jvm.functions.Function1 function1, com.paypal.oslo.feature.p2p.ui.review.state.NoteUiState noteUiState) {
        java.lang.String paymentTransferAttemptId = noteUiState.getPaymentTransferAttemptId();
        if (paymentTransferAttemptId == null) {
            function1.invoke(com.paypal.oslo.feature.p2p.ui.review.events.NoteEvent.UpdateNoteFailed.INSTANCE);
            return;
        }
        com.paypal.oslo.feature.p2p.domain.model.NoteDetails enteredNoteDetails = noteUiState.getEnteredNoteDetails();
        java.lang.String memo = enteredNoteDetails != null ? enteredNoteDetails.getMemo() : null;
        if (memo != null && !kotlin.text.StringsKt.isBlank(memo)) {
            kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(noteViewModel), null, null, new com.paypal.oslo.feature.p2p.ui.review.viewmodels.NoteViewModel$handleNoteUpdate$1(noteViewModel, paymentTransferAttemptId, enteredNoteDetails, function1, null), 3, null);
        } else {
            function1.invoke(com.paypal.oslo.feature.p2p.ui.review.events.NoteEvent.NoteCancelled.INSTANCE);
            function1.invoke(com.paypal.oslo.feature.p2p.ui.review.events.NoteEvent.UpdateNoteSuccess.INSTANCE);
        }
    }

    public static final /* synthetic */ void access$logNoteUpdateFailed(com.paypal.oslo.feature.p2p.ui.review.viewmodels.NoteViewModel noteViewModel, java.lang.String str, com.paypal.oslo.feature.p2p.domain.model.NoteDetails noteDetails, java.lang.Object obj) {
        java.lang.String memo;
        com.paypal.android.logger.Logger logger = com.paypal.oslo.feature.p2p.LoggerKt.log;
        kotlin.Pair[] pairArr = new kotlin.Pair[4];
        int i = 0;
        pairArr[0] = kotlin.TuplesKt.to("attemptId", str);
        java.lang.String simpleName = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(obj.getClass()).getSimpleName();
        if (simpleName == null) {
            simpleName = "";
        }
        pairArr[1] = kotlin.TuplesKt.to("errorType", simpleName);
        pairArr[2] = kotlin.TuplesKt.to("hasNote", java.lang.String.valueOf((noteDetails != null ? noteDetails.getMemo() : null) != null));
        if (noteDetails != null && (memo = noteDetails.getMemo()) != null) {
            i = memo.length();
        }
        pairArr[3] = kotlin.TuplesKt.to("noteLength", java.lang.String.valueOf(i));
        com.paypal.android.logger.Logger.e$default(logger, com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Events.FAILED_TO_ADD_NOTE, kotlin.collections.MapsKt.mapOf(pairArr), null, obj instanceof java.lang.Throwable ? (java.lang.Throwable) obj : null, 4, null);
    }

    public static final /* synthetic */ void access$logNoteUpdateSuccess(com.paypal.oslo.feature.p2p.ui.review.viewmodels.NoteViewModel noteViewModel, java.lang.String str, com.paypal.oslo.feature.p2p.domain.model.NoteDetails noteDetails) {
        java.lang.String memo;
        com.paypal.android.logger.Logger logger = com.paypal.oslo.feature.p2p.LoggerKt.log;
        kotlin.Pair[] pairArr = new kotlin.Pair[3];
        int i = 0;
        pairArr[0] = kotlin.TuplesKt.to("attemptId", str);
        pairArr[1] = kotlin.TuplesKt.to("hasNote", java.lang.String.valueOf((noteDetails != null ? noteDetails.getMemo() : null) != null));
        if (noteDetails != null && (memo = noteDetails.getMemo()) != null) {
            i = memo.length();
        }
        pairArr[2] = kotlin.TuplesKt.to("noteLength", java.lang.String.valueOf(i));
        com.paypal.android.logger.Logger.i$default(logger, com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Events.NOTE_ADDED_SUCCESSFULLY, kotlin.collections.MapsKt.mapOf(pairArr), null, 4, null);
    }
}
