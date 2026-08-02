package com.paypal.oslo.feature.bnplservicing.ui.makepayment;

@kotlin.Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001:\u0001;BE\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0019\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001c\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001aR\u0014\u0010\u001f\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\u001b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\u001d\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010!R\u001a\u0010\u000e\u001a\u00020\r8\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u000e\u0010\"\u001a\u0004\b#\u0010$R&\u0010*\u001a\u0014\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020'0%8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b(\u0010)R \u0010,\u001a\b\u0012\u0004\u0012\u00020&0+8\u0001X\u0081\u0004¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R \u00101\u001a\b\u0012\u0004\u0012\u00020'008\u0001X\u0081\u0004¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104R\u001a\u00106\u001a\u0002058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b6\u0010\u001a\u001a\u0004\b7\u00108R\u001a\u00109\u001a\u0002058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b9\u0010\u001a\u001a\u0004\b:\u00108"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/ui/makepayment/MakeAPaymentViewModel;", "Landroidx/lifecycle/ViewModel;", "", "creditAccountId", "source", "Lcom/paypal/oslo/feature/bnplservicing/domain/usecase/GetMakeAPaymentOverviewUseCase;", "getOverview", "Lcom/paypal/oslo/feature/bnplservicing/domain/usecase/PostMakeAPaymentUseCase;", "postMakeAPayment", "Lcom/paypal/oslo/feature/bnplservicing/ui/makepayment/MakeAPaymentMapper;", "mapper", "Lcom/paypal/oslo/feature/bnplservicing/ui/makepayment/MakeAPaymentReducer;", "reducer", "Lcom/paypal/oslo/feature/bnplservicing/ui/BnplServicingSessionStorage;", "sessionStorage", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/bnplservicing/domain/usecase/GetMakeAPaymentOverviewUseCase;Lcom/paypal/oslo/feature/bnplservicing/domain/usecase/PostMakeAPaymentUseCase;Lcom/paypal/oslo/feature/bnplservicing/ui/makepayment/MakeAPaymentMapper;Lcom/paypal/oslo/feature/bnplservicing/ui/makepayment/MakeAPaymentReducer;Lcom/paypal/oslo/feature/bnplservicing/ui/BnplServicingSessionStorage;)V", "Lcom/paypal/oslo/feature/bnplservicing/ui/makepayment/MakeAPaymentEvent;", "event", "", "processEvent$bnpl_servicing_prodRelease", "(Lcom/paypal/oslo/feature/bnplservicing/ui/makepayment/MakeAPaymentEvent;)V", "screenName", "logScreenEvent$bnpl_servicing_prodRelease", "(Ljava/lang/String;)V", "getHighSpeedVideoFpsRangesFor", "Ljava/lang/String;", "Camera2StreamConfigurationMap", "getHighSpeedVideoFpsRanges", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/feature/bnplservicing/domain/usecase/GetMakeAPaymentOverviewUseCase;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/bnplservicing/domain/usecase/PostMakeAPaymentUseCase;", "Lcom/paypal/oslo/feature/bnplservicing/ui/makepayment/MakeAPaymentMapper;", "Lcom/paypal/oslo/feature/bnplservicing/ui/BnplServicingSessionStorage;", "getSessionStorage$bnpl_servicing_prodRelease", "()Lcom/paypal/oslo/feature/bnplservicing/ui/BnplServicingSessionStorage;", "Lcom/paypal/oslo/core/mvi/MviStateStore;", "Lcom/paypal/oslo/feature/bnplservicing/ui/makepayment/MakeAPaymentUiState;", "Lcom/paypal/oslo/feature/bnplservicing/ui/makepayment/MakeAPaymentUiEffect;", "getOutputMinFrameDuration", "Lcom/paypal/oslo/core/mvi/MviStateStore;", "getOutputFormats", "Lkotlinx/coroutines/flow/StateFlow;", "uiState", "Lkotlinx/coroutines/flow/StateFlow;", "getUiState$bnpl_servicing_prodRelease", "()Lkotlinx/coroutines/flow/StateFlow;", "Lkotlinx/coroutines/flow/Flow;", "uiEffect", "Lkotlinx/coroutines/flow/Flow;", "getUiEffect$bnpl_servicing_prodRelease", "()Lkotlinx/coroutines/flow/Flow;", "Lcom/paypal/oslo/core/navigation/result/NavResultRequestId;", "addCardNavResultRequestId", "getAddCardNavResultRequestId-QDVFmTU", "()Ljava/lang/String;", "addBankNavResultRequestId", "getAddBankNavResultRequestId-QDVFmTU", "Factory"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class MakeAPaymentViewModel extends androidx.view.ViewModel {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final java.lang.String getHighSpeedVideoFpsRanges;
    private final java.lang.String addBankNavResultRequestId;
    private final java.lang.String addCardNavResultRequestId;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.bnplservicing.domain.usecase.PostMakeAPaymentUseCase Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentMapper getHighSpeedVideoSizes;
    private final java.lang.String getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.bnplservicing.domain.usecase.GetMakeAPaymentOverviewUseCase getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getOutputMinFrameDuration, reason: from kotlin metadata */
    private final com.paypal.oslo.core.mvi.MviStateStore<com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentUiState, com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentEvent, com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentUiEffect> getOutputFormats;
    private final com.paypal.oslo.feature.bnplservicing.ui.BnplServicingSessionStorage sessionStorage;
    private final kotlinx.coroutines.flow.Flow<com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentUiEffect> uiEffect;
    private final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentUiState> uiState;

    @dagger.assisted.AssistedFactory
    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J#\u0010\u0006\u001a\u00020\u00052\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u0002H&¢\u0006\u0004\b\u0006\u0010\u0007À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/ui/makepayment/MakeAPaymentViewModel$Factory;", "", "", "creditAccountId", "source", "Lcom/paypal/oslo/feature/bnplservicing/ui/makepayment/MakeAPaymentViewModel;", "create", "(Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/bnplservicing/ui/makepayment/MakeAPaymentViewModel;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public interface Factory {
        com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentViewModel create(@dagger.assisted.Assisted("creditAccountId") java.lang.String creditAccountId, @dagger.assisted.Assisted("source") java.lang.String source);
    }

    @dagger.assisted.AssistedInject
    public MakeAPaymentViewModel(@dagger.assisted.Assisted("creditAccountId") java.lang.String str, @dagger.assisted.Assisted("source") java.lang.String str2, com.paypal.oslo.feature.bnplservicing.domain.usecase.GetMakeAPaymentOverviewUseCase getMakeAPaymentOverviewUseCase, com.paypal.oslo.feature.bnplservicing.domain.usecase.PostMakeAPaymentUseCase postMakeAPaymentUseCase, com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentMapper makeAPaymentMapper, com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentReducer makeAPaymentReducer, com.paypal.oslo.feature.bnplservicing.ui.BnplServicingSessionStorage bnplServicingSessionStorage) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getMakeAPaymentOverviewUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(postMakeAPaymentUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(makeAPaymentMapper, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(makeAPaymentReducer, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bnplServicingSessionStorage, "");
        this.getHighSpeedVideoFpsRangesFor = str;
        this.getHighSpeedVideoFpsRanges = str2;
        this.getHighResolutionOutputSizeshNQ4ISI = getMakeAPaymentOverviewUseCase;
        this.Camera2StreamConfigurationMap = postMakeAPaymentUseCase;
        this.getHighSpeedVideoSizes = makeAPaymentMapper;
        this.sessionStorage = bnplServicingSessionStorage;
        com.paypal.oslo.core.mvi.MviStateStore<com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentUiState, com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentEvent, com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentUiEffect> mviStateStore = new com.paypal.oslo.core.mvi.MviStateStore<>("MakeAPaymentViewModel.store", com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentUiState.Loading.INSTANCE, makeAPaymentReducer, kotlin.collections.CollectionsKt.listOf(new com.paypal.oslo.core.mvi.MviStateStore.Middleware<com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentUiState, com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentEvent>() { // from class: com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentViewModel$sideEffectsMiddleware$1
            @Override // com.paypal.oslo.core.mvi.MviStateStore.Middleware
            public final void invoke(com.paypal.oslo.core.mvi.MviStateStore.Middleware.Input<com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentUiState, com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentEvent> input) {
                java.lang.String str3;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
                com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentUiState second = input.getStates().getSecond();
                com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentEvent event = input.getEvent();
                if (event instanceof com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentEvent.LoadData) {
                    com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentViewModel makeAPaymentViewModel = com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentViewModel.this;
                    str3 = makeAPaymentViewModel.getHighSpeedVideoFpsRangesFor;
                    kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(makeAPaymentViewModel), null, null, new com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentViewModel$loadData$1(str3, makeAPaymentViewModel, null), 3, null);
                } else if ((event instanceof com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentEvent.ConfirmAndPayPressed) && (second instanceof com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentUiState.Success)) {
                    com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentUiState.Success success = (com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentUiState.Success) second;
                    if (success.getUiModel().getProcessingMakeAPayment()) {
                        com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentViewModel.access$postMakeAPayment(com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentViewModel.this, success.getUiModel());
                    }
                }
            }
        }), androidx.view.ViewModelKt.getViewModelScope(this));
        this.getOutputFormats = mviStateStore;
        this.uiState = mviStateStore.getUiState();
        this.uiEffect = mviStateStore.getUiEffect();
        this.addCardNavResultRequestId = com.paypal.oslo.core.navigation.result.NavResultRequestId.INSTANCE.m11594generateQDVFmTU();
        this.addBankNavResultRequestId = com.paypal.oslo.core.navigation.result.NavResultRequestId.INSTANCE.m11594generateQDVFmTU();
        processEvent$bnpl_servicing_prodRelease(com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentEvent.LoadData.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ java.lang.Object access$onSuccess(com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentViewModel makeAPaymentViewModel, java.lang.Object obj, java.lang.String str, kotlin.coroutines.Continuation continuation) {
        com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentViewModel$onSuccess$1 makeAPaymentViewModel$onSuccess$1;
        int i;
        com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentUiModel makeAPaymentUiModel;
        if (continuation instanceof com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentViewModel$onSuccess$1) {
            makeAPaymentViewModel$onSuccess$1 = (com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentViewModel$onSuccess$1) continuation;
            if ((makeAPaymentViewModel$onSuccess$1.getHighResolutionOutputSizeshNQ4ISI & Integer.MIN_VALUE) != 0) {
                makeAPaymentViewModel$onSuccess$1.getHighResolutionOutputSizeshNQ4ISI -= 2147483648;
                java.lang.Object obj2 = makeAPaymentViewModel$onSuccess$1.getHighSpeedVideoFpsRangesFor;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = makeAPaymentViewModel$onSuccess$1.getHighResolutionOutputSizeshNQ4ISI;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj2);
                    com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentMapper makeAPaymentMapper = makeAPaymentViewModel.getHighSpeedVideoSizes;
                    com.paypal.oslo.feature.bnplservicing.domain.model.makeapayment.MakeAPaymentOverview makeAPaymentOverview = obj instanceof com.paypal.oslo.feature.bnplservicing.domain.model.makeapayment.MakeAPaymentOverview ? (com.paypal.oslo.feature.bnplservicing.domain.model.makeapayment.MakeAPaymentOverview) obj : null;
                    makeAPaymentViewModel$onSuccess$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(obj);
                    makeAPaymentViewModel$onSuccess$1.Camera2StreamConfigurationMap = str;
                    makeAPaymentViewModel$onSuccess$1.getHighResolutionOutputSizeshNQ4ISI = 1;
                    obj2 = makeAPaymentMapper.toMakeAPaymentUiModel(makeAPaymentOverview, makeAPaymentViewModel$onSuccess$1);
                    if (obj2 == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    str = (java.lang.String) makeAPaymentViewModel$onSuccess$1.Camera2StreamConfigurationMap;
                    java.lang.Object obj3 = makeAPaymentViewModel$onSuccess$1.getHighSpeedVideoSizes;
                    kotlin.ResultKt.throwOnFailure(obj2);
                }
                makeAPaymentUiModel = (com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentUiModel) obj2;
                if (makeAPaymentUiModel != null) {
                    return new com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentEvent.ShowErrorScreen(str);
                }
                return new com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentEvent.DataLoaded(str, makeAPaymentUiModel);
            }
        }
        makeAPaymentViewModel$onSuccess$1 = new com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentViewModel$onSuccess$1(makeAPaymentViewModel, continuation);
        java.lang.Object obj22 = makeAPaymentViewModel$onSuccess$1.getHighSpeedVideoFpsRangesFor;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = makeAPaymentViewModel$onSuccess$1.getHighResolutionOutputSizeshNQ4ISI;
        if (i != 0) {
        }
        makeAPaymentUiModel = (com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentUiModel) obj22;
        if (makeAPaymentUiModel != null) {
        }
    }

    /* renamed from: getSessionStorage$bnpl_servicing_prodRelease, reason: from getter */
    public final com.paypal.oslo.feature.bnplservicing.ui.BnplServicingSessionStorage getSessionStorage() {
        return this.sessionStorage;
    }

    public final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentUiState> getUiState$bnpl_servicing_prodRelease() {
        return this.uiState;
    }

    public final kotlinx.coroutines.flow.Flow<com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentUiEffect> getUiEffect$bnpl_servicing_prodRelease() {
        return this.uiEffect;
    }

    /* renamed from: getAddCardNavResultRequestId-QDVFmTU, reason: not valid java name and from getter */
    public final java.lang.String getAddCardNavResultRequestId() {
        return this.addCardNavResultRequestId;
    }

    /* renamed from: getAddBankNavResultRequestId-QDVFmTU, reason: not valid java name and from getter */
    public final java.lang.String getAddBankNavResultRequestId() {
        return this.addBankNavResultRequestId;
    }

    public final void processEvent$bnpl_servicing_prodRelease(com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentEvent event) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
        this.getOutputFormats.onEvent(event);
    }

    public final void logScreenEvent$bnpl_servicing_prodRelease(java.lang.String screenName) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(screenName, "");
        com.paypal.oslo.feature.bnplservicing.logger.BnplServLoggerUtilsKt.logBnplServScreenEvent(com.paypal.oslo.feature.bnplservicing.LoggerKt.log, com.paypal.oslo.feature.bnplservicing.ui.BnplServicingSessionStorage.getScreenEventAttributes$default(this.sessionStorage, false, 1, null), screenName);
    }

    public static final /* synthetic */ void access$postMakeAPayment(com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentViewModel makeAPaymentViewModel, com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentUiModel makeAPaymentUiModel) {
        com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.FundingInstrument currentFundingInstrument;
        com.paypal.oslo.feature.bnplservicing.domain.model.common.Money rawAmount = makeAPaymentUiModel.getRawAmount();
        if (rawAmount != null) {
            com.paypal.oslo.feature.bnplservicing.domain.model.common.Money money = rawAmount.getValue().length() <= 0 ? null : rawAmount;
            if (money == null || (currentFundingInstrument = makeAPaymentUiModel.getCurrentFundingInstrument()) == null) {
                return;
            }
            kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(makeAPaymentViewModel), null, null, new com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentViewModel$postMakeAPayment$1(makeAPaymentViewModel, new com.paypal.oslo.feature.bnplservicing.domain.model.makeapayment.input.MakeAPaymentInput(money, makeAPaymentUiModel.getCreditProductIdentifier(), makeAPaymentUiModel.getCreditAccountId(), makeAPaymentUiModel.isAutopayEnabled(), currentFundingInstrument), null), 3, null);
        }
    }
}
