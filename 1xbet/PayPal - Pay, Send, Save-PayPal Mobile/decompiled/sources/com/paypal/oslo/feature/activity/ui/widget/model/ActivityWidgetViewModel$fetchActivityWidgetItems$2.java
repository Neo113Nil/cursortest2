package com.paypal.oslo.feature.activity.ui.widget.model;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.activity.ui.widget.model.ActivityWidgetViewModel$fetchActivityWidgetItems$2", f = "ActivityWidgetViewModel.kt", i = {0, 0, 0}, l = {137}, m = "invokeSuspend", n = {"$this$launch", "filterConfig", "inputQueryType"}, nl = {138}, s = {"L$0", "L$1", "L$2"}, v = 2)
/* loaded from: classes10.dex */
final class ActivityWidgetViewModel$fetchActivityWidgetItems$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    java.lang.Object Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.paypal.oslo.feature.activity.api.widget.configs.ActivityWidgetConfiguration getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    final /* synthetic */ com.paypal.oslo.feature.activity.ui.widget.model.ActivityWidgetViewModel getHighSpeedVideoSizesFor;
    private /* synthetic */ java.lang.Object getInputFormats;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow2;
        com.paypal.oslo.feature.activity.domain.usecase.widget.ActivityWidgetUseCase activityWidgetUseCase;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow3;
        java.lang.Object obj2;
        kotlinx.coroutines.CoroutineScope coroutineScope = (kotlinx.coroutines.CoroutineScope) this.getInputFormats;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighResolutionOutputSizeshNQ4ISI;
        try {
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                com.paypal.oslo.feature.activity.api.widget.configs.ActivityWidgetFiltersConfig filtersConfig = this.getHighSpeedVideoFpsRangesFor.getFiltersConfig();
                com.paypal.oslo.feature.activity.domain.usecase.ledger.mapper.ActivityLedgerUseCaseInputQueryType activityWidgetInputQueryType$activity_prodRelease = com.paypal.oslo.feature.activity.domain.usecase.widget.ActivityWidgetFiltersInputProvider.INSTANCE.getActivityWidgetInputQueryType$activity_prodRelease(filtersConfig);
                mutableStateFlow2 = this.getHighSpeedVideoSizesFor.Camera2StreamConfigurationMap;
                activityWidgetUseCase = this.getHighSpeedVideoSizesFor.getHighResolutionOutputSizeshNQ4ISI;
                this.getInputFormats = coroutineScope;
                this.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(filtersConfig);
                this.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(activityWidgetInputQueryType$activity_prodRelease);
                this.Camera2StreamConfigurationMap = mutableStateFlow2;
                this.getHighResolutionOutputSizeshNQ4ISI = 1;
                obj = activityWidgetUseCase.invoke(activityWidgetInputQueryType$activity_prodRelease, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
                mutableStateFlow3 = mutableStateFlow2;
            } else {
                if (i != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                mutableStateFlow3 = (kotlinx.coroutines.flow.MutableStateFlow) this.Camera2StreamConfigurationMap;
                kotlin.ResultKt.throwOnFailure(obj);
            }
            arrow.core.Either either = ((arrow.core.Ior) obj).toEither();
            com.paypal.oslo.feature.activity.ui.widget.model.ActivityWidgetViewModel activityWidgetViewModel = this.getHighSpeedVideoSizesFor;
            if (either instanceof arrow.core.Either.Right) {
                com.paypal.oslo.feature.activity.domain.base.result.ActivityNetworkSuccessResult activityNetworkSuccessResult = (com.paypal.oslo.feature.activity.domain.base.result.ActivityNetworkSuccessResult) ((arrow.core.Either.Right) either).getValue();
                activityWidgetViewModel.extractAndStoreActivityItems$activity_prodRelease(activityNetworkSuccessResult);
                obj2 = (com.paypal.oslo.feature.activity.domain.base.state.ActivityUiState) new com.paypal.oslo.feature.activity.domain.base.state.ActivityUiState.Success(activityNetworkSuccessResult);
            } else if (either instanceof arrow.core.Either.Left) {
                obj2 = (com.paypal.oslo.feature.activity.domain.base.state.ActivityUiState) new com.paypal.oslo.feature.activity.domain.base.state.ActivityUiState.Failure((com.paypal.oslo.feature.activity.domain.base.result.ActivityNetworkFailureResult) ((arrow.core.Either.Left) either).getValue());
            } else {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            mutableStateFlow3.setValue(obj2);
        } catch (java.util.concurrent.CancellationException e) {
            throw e;
        } catch (java.lang.Exception e2) {
            java.lang.String simpleName = e2.getClass().getSimpleName();
            com.paypal.android.logger.Logger logger = com.paypal.oslo.feature.activity.LoggerKt.log;
            kotlin.Pair[] pairArr = new kotlin.Pair[5];
            pairArr[0] = kotlin.TuplesKt.to(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.LogConstants.CLASS, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(coroutineScope.getClass()).getSimpleName());
            pairArr[1] = kotlin.TuplesKt.to(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.LogConstants.OPERATION, "fetchActivityWidgetItems");
            pairArr[2] = kotlin.TuplesKt.to(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.LogConstants.ERROR_TYPE, simpleName);
            java.lang.String message = e2.getMessage();
            if (message == null) {
                message = "";
            }
            pairArr[3] = kotlin.TuplesKt.to("error_message", message);
            pairArr[4] = kotlin.TuplesKt.to(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.LogConstants.STACK_TRACE, kotlin.ExceptionsKt.stackTraceToString(e2));
            com.paypal.android.logger.Logger.d$default(logger, com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.LogConstants.KEY_MESSAGE_EXCEPTION_FETCH_LEDGER_ITEMS, kotlin.collections.MapsKt.mapOf(pairArr), null, 4, null);
            mutableStateFlow = this.getHighSpeedVideoSizesFor.Camera2StreamConfigurationMap;
            java.lang.String message2 = e2.getMessage();
            if (message2 == null) {
                message2 = com.paypal.oslo.feature.settings.closeaccount.data.repository.CloseAccountRepositoryImpl.UNKNOWN_ERROR;
            }
            mutableStateFlow.setValue(new com.paypal.oslo.feature.activity.domain.base.state.ActivityUiState.Failure(new com.paypal.oslo.feature.activity.domain.base.result.ActivityNetworkFailureResult(null, com.paypal.oslo.feature.activity.domain.base.error.ActivityErrorUIModelKt.toErrorUIModel(new com.paypal.oslo.feature.activity.domain.base.error.ActivityGenericErrorActivityImpl(message2, null, 2, null)), 1, null)));
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.activity.ui.widget.model.ActivityWidgetViewModel$fetchActivityWidgetItems$2) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        com.paypal.oslo.feature.activity.ui.widget.model.ActivityWidgetViewModel$fetchActivityWidgetItems$2 activityWidgetViewModel$fetchActivityWidgetItems$2 = new com.paypal.oslo.feature.activity.ui.widget.model.ActivityWidgetViewModel$fetchActivityWidgetItems$2(this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoSizesFor, continuation);
        activityWidgetViewModel$fetchActivityWidgetItems$2.getInputFormats = obj;
        return activityWidgetViewModel$fetchActivityWidgetItems$2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ActivityWidgetViewModel$fetchActivityWidgetItems$2(com.paypal.oslo.feature.activity.api.widget.configs.ActivityWidgetConfiguration activityWidgetConfiguration, com.paypal.oslo.feature.activity.ui.widget.model.ActivityWidgetViewModel activityWidgetViewModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.activity.ui.widget.model.ActivityWidgetViewModel$fetchActivityWidgetItems$2> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRangesFor = activityWidgetConfiguration;
        this.getHighSpeedVideoSizesFor = activityWidgetViewModel;
    }
}
