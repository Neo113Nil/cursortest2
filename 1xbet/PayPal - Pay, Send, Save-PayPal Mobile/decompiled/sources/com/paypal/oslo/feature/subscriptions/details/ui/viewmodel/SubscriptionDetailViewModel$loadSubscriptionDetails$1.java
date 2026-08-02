package com.paypal.oslo.feature.subscriptions.details.ui.viewmodel;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.subscriptions.details.ui.viewmodel.SubscriptionDetailViewModel$loadSubscriptionDetails$1", f = "SubscriptionDetailViewModel.kt", i = {1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2}, l = {81, 88, 92}, m = "invokeSuspend", n = {"result", "this_$iv", "subscriptionDetails", "$i$f$fold", "$i$a$-fold-SubscriptionDetailViewModel$loadSubscriptionDetails$1$2", "result", "this_$iv", "callError", "subscriptionDetails", "$i$f$fold", "$i$a$-fold-SubscriptionDetailViewModel$loadSubscriptionDetails$1$3"}, nl = {82, 89, 93}, s = {"L$0", "L$1", "L$2", "I$0", "I$1", "L$0", "L$1", "L$2", "L$3", "I$0", "I$1"}, v = 2)
/* loaded from: classes15.dex */
final class SubscriptionDetailViewModel$loadSubscriptionDetails$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    java.lang.Object Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    final /* synthetic */ java.lang.String getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;
    java.lang.Object getHighSpeedVideoSizesFor;
    java.lang.Object getInputFormats;
    final /* synthetic */ com.paypal.oslo.feature.subscriptions.details.ui.viewmodel.SubscriptionDetailViewModel getInputSizeshNQ4ISI;
    int getOutputFormats;
    java.lang.Object getOutputMinFrameDuration;

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0070, code lost:
    
        if (r13 != r0) goto L14;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow;
        com.paypal.oslo.feature.subscriptions.details.domain.usecase.GetConsumerAgreementUseCase getConsumerAgreementUseCase;
        com.paypal.oslo.feature.subscriptions.api.domain.AgreementType agreementType;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow2;
        com.paypal.oslo.feature.subscriptions.shared.domain.FormatHelper formatHelper;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow3;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow4;
        com.paypal.oslo.feature.subscriptions.shared.domain.FormatHelper formatHelper2;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow5;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow6;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getOutputFormats;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            mutableStateFlow = this.getInputSizeshNQ4ISI.getHighSpeedVideoFpsRangesFor;
            mutableStateFlow.setValue(com.paypal.oslo.feature.subscriptions.details.ui.viewmodel.SubscriptionDetailUiState.Loading.INSTANCE);
            getConsumerAgreementUseCase = this.getInputSizeshNQ4ISI.getHighResolutionOutputSizeshNQ4ISI;
            java.lang.String str = this.getHighSpeedVideoFpsRangesFor;
            agreementType = this.getInputSizeshNQ4ISI.Camera2StreamConfigurationMap;
            this.getOutputFormats = 1;
            obj = getConsumerAgreementUseCase.invoke(str, agreementType, this);
        } else {
            if (i != 1) {
                if (i == 2) {
                    mutableStateFlow5 = (kotlinx.coroutines.flow.MutableStateFlow) this.getInputFormats;
                    kotlin.ResultKt.throwOnFailure(obj);
                    mutableStateFlow5.setValue(new com.paypal.oslo.feature.subscriptions.details.ui.viewmodel.SubscriptionDetailUiState.Success((com.paypal.oslo.feature.subscriptions.details.ui.model.SubscriptionDetailsUiModel) obj));
                    return kotlin.Unit.INSTANCE;
                }
                if (i != 3) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                mutableStateFlow3 = (kotlinx.coroutines.flow.MutableStateFlow) this.getHighSpeedVideoSizesFor;
                kotlin.ResultKt.throwOnFailure(obj);
                mutableStateFlow3.setValue(new com.paypal.oslo.feature.subscriptions.details.ui.viewmodel.SubscriptionDetailUiState.Success((com.paypal.oslo.feature.subscriptions.details.ui.model.SubscriptionDetailsUiModel) obj));
                return kotlin.Unit.INSTANCE;
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        arrow.core.Ior ior = (arrow.core.Ior) obj;
        com.paypal.oslo.feature.subscriptions.details.ui.viewmodel.SubscriptionDetailViewModel subscriptionDetailViewModel = this.getInputSizeshNQ4ISI;
        if (ior instanceof arrow.core.Ior.Left) {
            com.paypal.oslo.feature.subscriptions.shared.domain.error.SubscriptionsError subscriptionsError = (com.paypal.oslo.feature.subscriptions.shared.domain.error.SubscriptionsError) ((arrow.core.Ior.Left) ior).getValue();
            mutableStateFlow6 = subscriptionDetailViewModel.getHighSpeedVideoFpsRangesFor;
            mutableStateFlow6.setValue(new com.paypal.oslo.feature.subscriptions.details.ui.viewmodel.SubscriptionDetailUiState.Error(subscriptionsError.toErrorContext()));
            return kotlin.Unit.INSTANCE;
        }
        if (ior instanceof arrow.core.Ior.Right) {
            com.paypal.oslo.feature.subscriptions.details.domain.model.SubscriptionDetails subscriptionDetails = (com.paypal.oslo.feature.subscriptions.details.domain.model.SubscriptionDetails) ((arrow.core.Ior.Right) ior).getValue();
            com.paypal.android.logger.Logger.i$default(com.paypal.oslo.feature.subscriptions.LoggerKt.log, "Successfully loaded subscription details", null, null, 6, null);
            mutableStateFlow4 = subscriptionDetailViewModel.getHighSpeedVideoFpsRangesFor;
            formatHelper2 = subscriptionDetailViewModel.getHighSpeedVideoFpsRanges;
            this.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(ior);
            this.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(ior);
            this.getOutputMinFrameDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(subscriptionDetails);
            this.getInputFormats = mutableStateFlow4;
            this.getHighSpeedVideoFpsRanges = 0;
            this.getHighSpeedVideoSizes = 0;
            this.getOutputFormats = 2;
            obj = com.paypal.oslo.feature.subscriptions.details.ui.model.SubscriptionDetailsUiModelKt.toUiModel(subscriptionDetails, formatHelper2, this);
            if (obj != coroutine_suspended) {
                mutableStateFlow5 = mutableStateFlow4;
                mutableStateFlow5.setValue(new com.paypal.oslo.feature.subscriptions.details.ui.viewmodel.SubscriptionDetailUiState.Success((com.paypal.oslo.feature.subscriptions.details.ui.model.SubscriptionDetailsUiModel) obj));
                return kotlin.Unit.INSTANCE;
            }
        } else if (ior instanceof arrow.core.Ior.Both) {
            arrow.core.Ior.Both both = (arrow.core.Ior.Both) ior;
            java.lang.Object leftValue = both.getLeftValue();
            com.paypal.oslo.feature.subscriptions.details.domain.model.SubscriptionDetails subscriptionDetails2 = (com.paypal.oslo.feature.subscriptions.details.domain.model.SubscriptionDetails) both.getRightValue();
            com.paypal.oslo.feature.subscriptions.shared.domain.error.SubscriptionsError subscriptionsError2 = (com.paypal.oslo.feature.subscriptions.shared.domain.error.SubscriptionsError) leftValue;
            com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.subscriptions.LoggerKt.log, "Loaded partial subscription details", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("callError", subscriptionsError2.toString())), null, 4, null);
            mutableStateFlow2 = subscriptionDetailViewModel.getHighSpeedVideoFpsRangesFor;
            formatHelper = subscriptionDetailViewModel.getHighSpeedVideoFpsRanges;
            this.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(ior);
            this.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(ior);
            this.getOutputMinFrameDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(subscriptionsError2);
            this.getInputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(subscriptionDetails2);
            this.getHighSpeedVideoSizesFor = mutableStateFlow2;
            this.getHighSpeedVideoFpsRanges = 0;
            this.getHighSpeedVideoSizes = 0;
            this.getOutputFormats = 3;
            obj = com.paypal.oslo.feature.subscriptions.details.ui.model.SubscriptionDetailsUiModelKt.toUiModel(subscriptionDetails2, formatHelper, this);
            if (obj != coroutine_suspended) {
                mutableStateFlow3 = mutableStateFlow2;
                mutableStateFlow3.setValue(new com.paypal.oslo.feature.subscriptions.details.ui.viewmodel.SubscriptionDetailUiState.Success((com.paypal.oslo.feature.subscriptions.details.ui.model.SubscriptionDetailsUiModel) obj));
                return kotlin.Unit.INSTANCE;
            }
        } else {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return coroutine_suspended;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.subscriptions.details.ui.viewmodel.SubscriptionDetailViewModel$loadSubscriptionDetails$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.subscriptions.details.ui.viewmodel.SubscriptionDetailViewModel$loadSubscriptionDetails$1(this.getInputSizeshNQ4ISI, this.getHighSpeedVideoFpsRangesFor, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SubscriptionDetailViewModel$loadSubscriptionDetails$1(com.paypal.oslo.feature.subscriptions.details.ui.viewmodel.SubscriptionDetailViewModel subscriptionDetailViewModel, java.lang.String str, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.subscriptions.details.ui.viewmodel.SubscriptionDetailViewModel$loadSubscriptionDetails$1> continuation) {
        super(2, continuation);
        this.getInputSizeshNQ4ISI = subscriptionDetailViewModel;
        this.getHighSpeedVideoFpsRangesFor = str;
    }
}
