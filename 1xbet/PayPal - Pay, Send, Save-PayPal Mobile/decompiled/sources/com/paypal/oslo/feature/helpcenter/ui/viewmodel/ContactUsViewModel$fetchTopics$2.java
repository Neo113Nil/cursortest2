package com.paypal.oslo.feature.helpcenter.ui.viewmodel;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.helpcenter.ui.viewmodel.ContactUsViewModel$fetchTopics$2", f = "ContactUsViewModel.kt", i = {}, l = {91}, m = "invokeSuspend", n = {}, nl = {92}, s = {}, v = 2)
/* loaded from: classes12.dex */
final class ContactUsViewModel$fetchTopics$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.oslo.feature.helpcenter.ui.viewmodel.ContactUsViewModel getHighSpeedVideoFpsRanges;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow;
        com.paypal.oslo.feature.helpcenter.domain.usecase.FetchContactUsTopicsUseCase fetchContactUsTopicsUseCase;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow2;
        com.paypal.oslo.feature.helpcenter.ui.models.ScreenState success;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.Camera2StreamConfigurationMap;
        try {
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                fetchContactUsTopicsUseCase = this.getHighSpeedVideoFpsRanges.Camera2StreamConfigurationMap;
                this.Camera2StreamConfigurationMap = 1;
                obj = fetchContactUsTopicsUseCase.invoke(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
            }
            arrow.core.Ior ior = (arrow.core.Ior) obj;
            com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.helpcenter.LoggerKt.log, "Contact us topics result received", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("isBoth", kotlin.coroutines.jvm.internal.Boxing.boxBoolean(ior.isBoth()))), null, 4, null);
            mutableStateFlow2 = this.getHighSpeedVideoFpsRanges.getHighSpeedVideoSizes;
            if (ior instanceof arrow.core.Ior.Both) {
                com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.helpcenter.LoggerKt.log, "Partial success fetching contact topics", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.datadog.android.rum.internal.metric.slowframes.DefaultUISlownessMetricDispatcher.KEY_COUNT, kotlin.coroutines.jvm.internal.Boxing.boxInt(((java.util.List) ((arrow.core.Ior.Both) ior).getRightValue()).size()))), null, 4, null);
                success = new com.paypal.oslo.feature.helpcenter.ui.models.ScreenState.Success(((arrow.core.Ior.Both) ior).getRightValue());
            } else if (ior instanceof arrow.core.Ior.Left) {
                com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.helpcenter.LoggerKt.log, "Failed to fetch contact topics", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("errorMessage", ((com.paypal.oslo.feature.helpcenter.domain.models.HelpCenterDomainError) ((arrow.core.Ior.Left) ior).getValue()).getErrorMessage())), null, 4, null);
                success = new com.paypal.oslo.feature.helpcenter.ui.models.ScreenState.Failure(com.paypal.oslo.feature.helpcenter.ui.models.ErrorType.INSTANCE.from(((com.paypal.oslo.feature.helpcenter.domain.models.HelpCenterDomainError) ((arrow.core.Ior.Left) ior).getValue()).getCallError()), null, 2, null);
            } else {
                if (!(ior instanceof arrow.core.Ior.Right)) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                success = new com.paypal.oslo.feature.helpcenter.ui.models.ScreenState.Success(((arrow.core.Ior.Right) ior).getValue());
            }
            mutableStateFlow2.setValue(success);
        } catch (java.lang.Exception e) {
            com.paypal.oslo.feature.helpcenter.LoggerKt.log.e("Failed to fetch contact us topics", e);
            mutableStateFlow = this.getHighSpeedVideoFpsRanges.getHighSpeedVideoSizes;
            mutableStateFlow.setValue(new com.paypal.oslo.feature.helpcenter.ui.models.ScreenState.Failure(com.paypal.oslo.feature.helpcenter.ui.models.ErrorType.NETWORK_ERROR, null, 2, null));
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.helpcenter.ui.viewmodel.ContactUsViewModel$fetchTopics$2) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.helpcenter.ui.viewmodel.ContactUsViewModel$fetchTopics$2(this.getHighSpeedVideoFpsRanges, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ContactUsViewModel$fetchTopics$2(com.paypal.oslo.feature.helpcenter.ui.viewmodel.ContactUsViewModel contactUsViewModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.helpcenter.ui.viewmodel.ContactUsViewModel$fetchTopics$2> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRanges = contactUsViewModel;
    }
}
