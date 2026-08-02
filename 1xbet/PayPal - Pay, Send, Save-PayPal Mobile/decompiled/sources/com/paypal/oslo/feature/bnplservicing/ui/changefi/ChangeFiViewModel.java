package com.paypal.oslo.feature.bnplservicing.ui.changefi;

@kotlin.Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0010\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u00019B;\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0015\u001a\u00020\u0012¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001c\u001a\u00020\u00068\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001e\u001a\u00020\b8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001a\u001a\u00020\n8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010!\u001a\u00020\f8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u001c\u0010%\u001a\b\u0012\u0004\u0012\u00020$0#8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b%\u0010&R\u0018\u0010)\u001a\u0004\u0018\u00010'8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010(R&\u0010-\u001a\u0014\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020,0*8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b-\u0010.R \u00100\u001a\b\u0012\u0004\u0012\u00020+0/8\u0001X\u0081\u0004¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R \u00105\u001a\b\u0012\u0004\u0012\u00020,048\u0001X\u0081\u0004¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/ui/changefi/ChangeFiViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/paypal/oslo/feature/bnplservicing/ui/changefi/ChangeFiArgs;", "args", "Lcom/paypal/oslo/feature/bnplservicing/ui/changefi/ChangeFiReducer;", "reducer", "Lcom/paypal/oslo/feature/bnplservicing/domain/usecase/autopay/GetAutoPaySetupOverviewUseCase;", "getAutopayOverviewUseCase", "Lcom/paypal/oslo/feature/bnplservicing/domain/usecase/GetMakeAPaymentEligibleFiUseCase;", "getMakeAPaymentEligibleFiUseCase", "Lcom/paypal/oslo/feature/bnplservicing/domain/usecase/autopay/UpdateAutopayUseCase;", "updateAutopayUseCase", "Lcom/paypal/oslo/feature/bnplservicing/ui/changefi/ChangeFiMapper;", "mapper", "<init>", "(Lcom/paypal/oslo/feature/bnplservicing/ui/changefi/ChangeFiArgs;Lcom/paypal/oslo/feature/bnplservicing/ui/changefi/ChangeFiReducer;Lcom/paypal/oslo/feature/bnplservicing/domain/usecase/autopay/GetAutoPaySetupOverviewUseCase;Lcom/paypal/oslo/feature/bnplservicing/domain/usecase/GetMakeAPaymentEligibleFiUseCase;Lcom/paypal/oslo/feature/bnplservicing/domain/usecase/autopay/UpdateAutopayUseCase;Lcom/paypal/oslo/feature/bnplservicing/ui/changefi/ChangeFiMapper;)V", "Lcom/paypal/oslo/feature/bnplservicing/ui/changefi/ChangeFiEvent;", "event", "", "processEvent", "(Lcom/paypal/oslo/feature/bnplservicing/ui/changefi/ChangeFiEvent;)V", "clear", "()V", "Lcom/paypal/oslo/feature/bnplservicing/ui/changefi/ChangeFiArgs;", "getArgs", "()Lcom/paypal/oslo/feature/bnplservicing/ui/changefi/ChangeFiArgs;", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/feature/bnplservicing/domain/usecase/autopay/GetAutoPaySetupOverviewUseCase;", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/feature/bnplservicing/domain/usecase/GetMakeAPaymentEligibleFiUseCase;", "getHighSpeedVideoSizes", "getInputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/bnplservicing/domain/usecase/autopay/UpdateAutopayUseCase;", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/feature/bnplservicing/ui/changefi/ChangeFiMapper;", "", "", "getHighResolutionOutputSizeshNQ4ISI", "Ljava/util/List;", "Lkotlinx/coroutines/Job;", "Lkotlinx/coroutines/Job;", "getInputFormats", "Lcom/paypal/oslo/core/mvi/MviStateStore;", "Lcom/paypal/oslo/feature/bnplservicing/ui/changefi/ChangeFiUiState;", "Lcom/paypal/oslo/feature/bnplservicing/ui/changefi/ChangeFiUiEffect;", "getOutputMinFrameDuration", "Lcom/paypal/oslo/core/mvi/MviStateStore;", "Lkotlinx/coroutines/flow/StateFlow;", "uiState", "Lkotlinx/coroutines/flow/StateFlow;", "getUiState$bnpl_servicing_prodRelease", "()Lkotlinx/coroutines/flow/StateFlow;", "Lkotlinx/coroutines/flow/Flow;", "uiEffect", "Lkotlinx/coroutines/flow/Flow;", "getUiEffect$bnpl_servicing_prodRelease", "()Lkotlinx/coroutines/flow/Flow;", "Factory"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ChangeFiViewModel extends androidx.view.ViewModel {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.bnplservicing.domain.usecase.autopay.GetAutoPaySetupOverviewUseCase getHighSpeedVideoFpsRangesFor;
    private final com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiArgs args;
    private java.util.List<java.lang.String> getHighResolutionOutputSizeshNQ4ISI;
    private final com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiMapper getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.bnplservicing.domain.usecase.GetMakeAPaymentEligibleFiUseCase getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private kotlinx.coroutines.Job getInputFormats;

    /* renamed from: getInputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.bnplservicing.domain.usecase.autopay.UpdateAutopayUseCase Camera2StreamConfigurationMap;
    private final com.paypal.oslo.core.mvi.MviStateStore<com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiUiState, com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiEvent, com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiUiEffect> getOutputMinFrameDuration;
    private final kotlinx.coroutines.flow.Flow<com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiUiEffect> uiEffect;
    private final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiUiState> uiState;

    @dagger.assisted.AssistedFactory
    @kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/ui/changefi/ChangeFiViewModel$Factory;", "", "Lcom/paypal/oslo/feature/bnplservicing/ui/changefi/ChangeFiArgs;", "args", "Lcom/paypal/oslo/feature/bnplservicing/ui/changefi/ChangeFiViewModel;", "create", "(Lcom/paypal/oslo/feature/bnplservicing/ui/changefi/ChangeFiArgs;)Lcom/paypal/oslo/feature/bnplservicing/ui/changefi/ChangeFiViewModel;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public interface Factory {
        com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiViewModel create(@dagger.assisted.Assisted("args") com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiArgs args);
    }

    @dagger.assisted.AssistedInject
    public ChangeFiViewModel(@dagger.assisted.Assisted("args") com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiArgs changeFiArgs, com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiReducer changeFiReducer, com.paypal.oslo.feature.bnplservicing.domain.usecase.autopay.GetAutoPaySetupOverviewUseCase getAutoPaySetupOverviewUseCase, com.paypal.oslo.feature.bnplservicing.domain.usecase.GetMakeAPaymentEligibleFiUseCase getMakeAPaymentEligibleFiUseCase, com.paypal.oslo.feature.bnplservicing.domain.usecase.autopay.UpdateAutopayUseCase updateAutopayUseCase, com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiMapper changeFiMapper) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(changeFiArgs, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(changeFiReducer, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getAutoPaySetupOverviewUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getMakeAPaymentEligibleFiUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(updateAutopayUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(changeFiMapper, "");
        this.args = changeFiArgs;
        this.getHighSpeedVideoFpsRangesFor = getAutoPaySetupOverviewUseCase;
        this.getHighSpeedVideoSizes = getMakeAPaymentEligibleFiUseCase;
        this.Camera2StreamConfigurationMap = updateAutopayUseCase;
        this.getHighSpeedVideoFpsRanges = changeFiMapper;
        this.getHighResolutionOutputSizeshNQ4ISI = kotlin.collections.CollectionsKt.emptyList();
        com.paypal.oslo.core.mvi.MviStateStore<com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiUiState, com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiEvent, com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiUiEffect> mviStateStore = new com.paypal.oslo.core.mvi.MviStateStore<>("ChangeFiViewModel.store", com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiUiState.Reset.INSTANCE, changeFiReducer, kotlin.collections.CollectionsKt.listOf(new com.paypal.oslo.core.mvi.MviStateStore.Middleware<com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiUiState, com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiEvent>() { // from class: com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiViewModel$sideEffectHandler$1
            @Override // com.paypal.oslo.core.mvi.MviStateStore.Middleware
            public final void invoke(com.paypal.oslo.core.mvi.MviStateStore.Middleware.Input<com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiUiState, com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiEvent> input) {
                com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiMapper changeFiMapper2;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
                com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiEvent event = input.getEvent();
                if (event instanceof com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiEvent.OnLoadData) {
                    com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiEvent.OnLoadData onLoadData = (com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiEvent.OnLoadData) event;
                    com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiViewModel.access$fetchFundingInstruments(com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiViewModel.this, onLoadData.getCreditAccountId(), onLoadData.getCpi());
                    return;
                }
                if (event instanceof com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiEvent.OnConfirmClicked) {
                    kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(r0), null, null, new com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiViewModel$updateAutopay$1(com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiViewModel.this, (com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiEvent.OnConfirmClicked) event, null), 3, null);
                    return;
                }
                if (event instanceof com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiEvent.OnRefreshWithNewFi) {
                    com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiEvent.OnRefreshWithNewFi onRefreshWithNewFi = (com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiEvent.OnRefreshWithNewFi) event;
                    com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiViewModel.this.getHighResolutionOutputSizeshNQ4ISI = onRefreshWithNewFi.getNewFiIds();
                    com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiViewModel.access$fetchFundingInstruments(com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiViewModel.this, onRefreshWithNewFi.getCreditAccountId(), onRefreshWithNewFi.getCpi());
                    return;
                }
                if (event instanceof com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiEvent.OnUpdateFiSuccess) {
                    changeFiMapper2 = com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiViewModel.this.getHighSpeedVideoFpsRanges;
                    com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiEvent.OnUpdateFiSuccess onUpdateFiSuccess = (com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiEvent.OnUpdateFiSuccess) event;
                    com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiViewModel.this.processEvent(new com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiEvent.ShowUpdatePaymentSuccess(changeFiMapper2.toUpdatePaymentSuccessUiModel(onUpdateFiSuccess.getFundingInstrument().getFundingInstrument(), onUpdateFiSuccess.getFlowType())));
                }
            }
        }), androidx.view.ViewModelKt.getViewModelScope(this));
        this.getOutputMinFrameDuration = mviStateStore;
        this.uiState = mviStateStore.getUiState();
        this.uiEffect = mviStateStore.getUiEffect();
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x00c4, code lost:
    
        if (r11 == r0) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00f7, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0076, code lost:
    
        if (r11 != r0) goto L18;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ java.lang.Object access$fetchAutopayFundingInstruments(com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiViewModel changeFiViewModel, java.lang.String str, com.paypal.oslo.feature.bnplservicing.domain.model.common.CreditProductIdentifier creditProductIdentifier, kotlin.coroutines.Continuation continuation) {
        com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiViewModel$fetchAutopayFundingInstruments$1 changeFiViewModel$fetchAutopayFundingInstruments$1;
        int i;
        com.paypal.oslo.feature.bnplservicing.domain.model.UseCaseResult useCaseResult;
        if (continuation instanceof com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiViewModel$fetchAutopayFundingInstruments$1) {
            changeFiViewModel$fetchAutopayFundingInstruments$1 = (com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiViewModel$fetchAutopayFundingInstruments$1) continuation;
            if ((changeFiViewModel$fetchAutopayFundingInstruments$1.getHighSpeedVideoSizesFor & Integer.MIN_VALUE) != 0) {
                changeFiViewModel$fetchAutopayFundingInstruments$1.getHighSpeedVideoSizesFor -= 2147483648;
                com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiViewModel$fetchAutopayFundingInstruments$1 changeFiViewModel$fetchAutopayFundingInstruments$12 = changeFiViewModel$fetchAutopayFundingInstruments$1;
                java.lang.Object obj = changeFiViewModel$fetchAutopayFundingInstruments$12.getInputFormats;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = changeFiViewModel$fetchAutopayFundingInstruments$12.getHighSpeedVideoSizesFor;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.feature.bnplservicing.domain.usecase.autopay.GetAutoPaySetupOverviewUseCase getAutoPaySetupOverviewUseCase = changeFiViewModel.getHighSpeedVideoFpsRangesFor;
                    com.paypal.oslo.feature.bnplservicing.domain.model.autopay.input.AutoPaySetupOverviewInput autoPaySetupOverviewInput = new com.paypal.oslo.feature.bnplservicing.domain.model.autopay.input.AutoPaySetupOverviewInput(str, creditProductIdentifier, com.paypal.oslo.feature.bnplservicing.domain.model.common.FlowSpecifier.SELF_SERVICING);
                    changeFiViewModel$fetchAutopayFundingInstruments$12.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str);
                    changeFiViewModel$fetchAutopayFundingInstruments$12.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(creditProductIdentifier);
                    changeFiViewModel$fetchAutopayFundingInstruments$12.getHighSpeedVideoSizesFor = 1;
                    obj = getAutoPaySetupOverviewUseCase.invoke2(autoPaySetupOverviewInput, (kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.bnplservicing.domain.model.UseCaseResult<?>>) changeFiViewModel$fetchAutopayFundingInstruments$12);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.ResultKt.throwOnFailure(obj);
                        changeFiViewModel.processEvent(new com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiEvent.OnDataLoaded((com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiHalfSheetUiModel) obj));
                        return kotlin.Unit.INSTANCE;
                    }
                    creditProductIdentifier = (com.paypal.oslo.feature.bnplservicing.domain.model.common.CreditProductIdentifier) changeFiViewModel$fetchAutopayFundingInstruments$12.getHighResolutionOutputSizeshNQ4ISI;
                    str = (java.lang.String) changeFiViewModel$fetchAutopayFundingInstruments$12.Camera2StreamConfigurationMap;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                useCaseResult = (com.paypal.oslo.feature.bnplservicing.domain.model.UseCaseResult) obj;
                if (!(useCaseResult instanceof com.paypal.oslo.feature.bnplservicing.domain.model.UseCaseResult.Success)) {
                    T data = ((com.paypal.oslo.feature.bnplservicing.domain.model.UseCaseResult.Success) useCaseResult).getData();
                    kotlin.jvm.internal.Intrinsics.checkNotNull(data, "");
                    com.paypal.oslo.feature.bnplservicing.domain.model.autopay.AutoPaySetupOverview autoPaySetupOverview = (com.paypal.oslo.feature.bnplservicing.domain.model.autopay.AutoPaySetupOverview) data;
                    java.util.List<java.lang.String> list = changeFiViewModel.getHighResolutionOutputSizeshNQ4ISI;
                    changeFiViewModel.getHighResolutionOutputSizeshNQ4ISI = kotlin.collections.CollectionsKt.emptyList();
                    com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiMapper changeFiMapper = changeFiViewModel.getHighSpeedVideoFpsRanges;
                    com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiArgs changeFiArgs = changeFiViewModel.args;
                    java.lang.String selectedFundingInstrumentId = changeFiArgs.getSelectedFundingInstrumentId();
                    changeFiViewModel$fetchAutopayFundingInstruments$12.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str);
                    changeFiViewModel$fetchAutopayFundingInstruments$12.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(creditProductIdentifier);
                    changeFiViewModel$fetchAutopayFundingInstruments$12.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(useCaseResult);
                    changeFiViewModel$fetchAutopayFundingInstruments$12.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(autoPaySetupOverview);
                    changeFiViewModel$fetchAutopayFundingInstruments$12.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(list);
                    changeFiViewModel$fetchAutopayFundingInstruments$12.getHighSpeedVideoSizesFor = 2;
                    obj = changeFiMapper.toChangeFiUiModel(autoPaySetupOverview, changeFiArgs, selectedFundingInstrumentId, list, changeFiViewModel$fetchAutopayFundingInstruments$12);
                } else {
                    if (useCaseResult instanceof com.paypal.oslo.feature.bnplservicing.domain.model.UseCaseResult.Error) {
                        changeFiViewModel.processEvent(new com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiEvent.OnLoadFiError(((com.paypal.oslo.feature.bnplservicing.domain.model.UseCaseResult.Error) useCaseResult).getCorrelationId(), changeFiViewModel.args.getCreditAccountId(), changeFiViewModel.args.getCreditProductIdentifier()));
                    }
                    return kotlin.Unit.INSTANCE;
                }
            }
        }
        changeFiViewModel$fetchAutopayFundingInstruments$1 = new com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiViewModel$fetchAutopayFundingInstruments$1(changeFiViewModel, continuation);
        com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiViewModel$fetchAutopayFundingInstruments$1 changeFiViewModel$fetchAutopayFundingInstruments$122 = changeFiViewModel$fetchAutopayFundingInstruments$1;
        java.lang.Object obj2 = changeFiViewModel$fetchAutopayFundingInstruments$122.getInputFormats;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = changeFiViewModel$fetchAutopayFundingInstruments$122.getHighSpeedVideoSizesFor;
        if (i != 0) {
        }
        useCaseResult = (com.paypal.oslo.feature.bnplservicing.domain.model.UseCaseResult) obj2;
        if (!(useCaseResult instanceof com.paypal.oslo.feature.bnplservicing.domain.model.UseCaseResult.Success)) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x00b3, code lost:
    
        if (r10 == r0) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00e6, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x006b, code lost:
    
        if (r10 != r0) goto L18;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ java.lang.Object access$fetchMakeAPaymentFundingInstruments(com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiViewModel changeFiViewModel, java.lang.String str, kotlin.coroutines.Continuation continuation) {
        com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiViewModel$fetchMakeAPaymentFundingInstruments$1 changeFiViewModel$fetchMakeAPaymentFundingInstruments$1;
        int i;
        com.paypal.oslo.feature.bnplservicing.domain.model.UseCaseResult useCaseResult;
        if (continuation instanceof com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiViewModel$fetchMakeAPaymentFundingInstruments$1) {
            changeFiViewModel$fetchMakeAPaymentFundingInstruments$1 = (com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiViewModel$fetchMakeAPaymentFundingInstruments$1) continuation;
            if ((changeFiViewModel$fetchMakeAPaymentFundingInstruments$1.Camera2StreamConfigurationMap & Integer.MIN_VALUE) != 0) {
                changeFiViewModel$fetchMakeAPaymentFundingInstruments$1.Camera2StreamConfigurationMap -= 2147483648;
                com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiViewModel$fetchMakeAPaymentFundingInstruments$1 changeFiViewModel$fetchMakeAPaymentFundingInstruments$12 = changeFiViewModel$fetchMakeAPaymentFundingInstruments$1;
                java.lang.Object obj = changeFiViewModel$fetchMakeAPaymentFundingInstruments$12.getInputFormats;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = changeFiViewModel$fetchMakeAPaymentFundingInstruments$12.Camera2StreamConfigurationMap;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.feature.bnplservicing.domain.usecase.GetMakeAPaymentEligibleFiUseCase getMakeAPaymentEligibleFiUseCase = changeFiViewModel.getHighSpeedVideoSizes;
                    com.paypal.oslo.feature.bnplservicing.domain.model.makeapayment.input.MakeAPaymentEligibleFiInput makeAPaymentEligibleFiInput = new com.paypal.oslo.feature.bnplservicing.domain.model.makeapayment.input.MakeAPaymentEligibleFiInput(str, changeFiViewModel.args.getCreditProductIdentifier());
                    changeFiViewModel$fetchMakeAPaymentFundingInstruments$12.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str);
                    changeFiViewModel$fetchMakeAPaymentFundingInstruments$12.Camera2StreamConfigurationMap = 1;
                    obj = getMakeAPaymentEligibleFiUseCase.invoke2(makeAPaymentEligibleFiInput, (kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.bnplservicing.domain.model.UseCaseResult<?>>) changeFiViewModel$fetchMakeAPaymentFundingInstruments$12);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.ResultKt.throwOnFailure(obj);
                        changeFiViewModel.processEvent(new com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiEvent.OnDataLoaded((com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiHalfSheetUiModel) obj));
                        return kotlin.Unit.INSTANCE;
                    }
                    str = (java.lang.String) changeFiViewModel$fetchMakeAPaymentFundingInstruments$12.getHighSpeedVideoSizes;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                useCaseResult = (com.paypal.oslo.feature.bnplservicing.domain.model.UseCaseResult) obj;
                if (!(useCaseResult instanceof com.paypal.oslo.feature.bnplservicing.domain.model.UseCaseResult.Success)) {
                    T data = ((com.paypal.oslo.feature.bnplservicing.domain.model.UseCaseResult.Success) useCaseResult).getData();
                    kotlin.jvm.internal.Intrinsics.checkNotNull(data, "");
                    com.paypal.oslo.feature.bnplservicing.domain.model.makeapayment.MakeAPaymentEligibleFi makeAPaymentEligibleFi = (com.paypal.oslo.feature.bnplservicing.domain.model.makeapayment.MakeAPaymentEligibleFi) data;
                    java.util.List<java.lang.String> list = changeFiViewModel.getHighResolutionOutputSizeshNQ4ISI;
                    changeFiViewModel.getHighResolutionOutputSizeshNQ4ISI = kotlin.collections.CollectionsKt.emptyList();
                    com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiMapper changeFiMapper = changeFiViewModel.getHighSpeedVideoFpsRanges;
                    com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiArgs changeFiArgs = changeFiViewModel.args;
                    java.lang.String selectedFundingInstrumentId = changeFiArgs.getSelectedFundingInstrumentId();
                    changeFiViewModel$fetchMakeAPaymentFundingInstruments$12.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str);
                    changeFiViewModel$fetchMakeAPaymentFundingInstruments$12.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(useCaseResult);
                    changeFiViewModel$fetchMakeAPaymentFundingInstruments$12.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(makeAPaymentEligibleFi);
                    changeFiViewModel$fetchMakeAPaymentFundingInstruments$12.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(list);
                    changeFiViewModel$fetchMakeAPaymentFundingInstruments$12.Camera2StreamConfigurationMap = 2;
                    obj = changeFiMapper.toChangeFiUiModel(makeAPaymentEligibleFi, changeFiArgs, selectedFundingInstrumentId, list, changeFiViewModel$fetchMakeAPaymentFundingInstruments$12);
                } else {
                    if (useCaseResult instanceof com.paypal.oslo.feature.bnplservicing.domain.model.UseCaseResult.Error) {
                        changeFiViewModel.processEvent(new com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiEvent.OnLoadFiError(((com.paypal.oslo.feature.bnplservicing.domain.model.UseCaseResult.Error) useCaseResult).getCorrelationId(), changeFiViewModel.args.getCreditAccountId(), changeFiViewModel.args.getCreditProductIdentifier()));
                    }
                    return kotlin.Unit.INSTANCE;
                }
            }
        }
        changeFiViewModel$fetchMakeAPaymentFundingInstruments$1 = new com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiViewModel$fetchMakeAPaymentFundingInstruments$1(changeFiViewModel, continuation);
        com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiViewModel$fetchMakeAPaymentFundingInstruments$1 changeFiViewModel$fetchMakeAPaymentFundingInstruments$122 = changeFiViewModel$fetchMakeAPaymentFundingInstruments$1;
        java.lang.Object obj2 = changeFiViewModel$fetchMakeAPaymentFundingInstruments$122.getInputFormats;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = changeFiViewModel$fetchMakeAPaymentFundingInstruments$122.Camera2StreamConfigurationMap;
        if (i != 0) {
        }
        useCaseResult = (com.paypal.oslo.feature.bnplservicing.domain.model.UseCaseResult) obj2;
        if (!(useCaseResult instanceof com.paypal.oslo.feature.bnplservicing.domain.model.UseCaseResult.Success)) {
        }
    }

    public final com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiArgs getArgs() {
        return this.args;
    }

    public final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiUiState> getUiState$bnpl_servicing_prodRelease() {
        return this.uiState;
    }

    public final kotlinx.coroutines.flow.Flow<com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiUiEffect> getUiEffect$bnpl_servicing_prodRelease() {
        return this.uiEffect;
    }

    public final void processEvent(com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiEvent event) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
        this.getOutputMinFrameDuration.onEvent(event);
    }

    public final void clear() {
        processEvent(com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiEvent.OnReset.INSTANCE);
    }

    public static final /* synthetic */ void access$fetchFundingInstruments(com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiViewModel changeFiViewModel, java.lang.String str, com.paypal.oslo.feature.bnplservicing.domain.model.common.CreditProductIdentifier creditProductIdentifier) {
        kotlinx.coroutines.Job launch$default;
        kotlinx.coroutines.Job job = changeFiViewModel.getInputFormats;
        if (job != null) {
            kotlinx.coroutines.Job.DefaultImpls.cancel$default(job, (java.util.concurrent.CancellationException) null, 1, (java.lang.Object) null);
        }
        launch$default = kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(changeFiViewModel), null, null, new com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiViewModel$fetchFundingInstruments$1(changeFiViewModel, str, creditProductIdentifier, null), 3, null);
        changeFiViewModel.getInputFormats = launch$default;
    }
}
