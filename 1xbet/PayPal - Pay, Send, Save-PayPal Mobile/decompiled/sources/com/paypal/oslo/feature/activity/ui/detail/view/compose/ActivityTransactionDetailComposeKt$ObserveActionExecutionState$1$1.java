package com.paypal.oslo.feature.activity.ui.detail.view.compose;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.activity.ui.detail.view.compose.ActivityTransactionDetailComposeKt$ObserveActionExecutionState$1$1", f = "ActivityTransactionDetailCompose.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
/* loaded from: classes10.dex */
final class ActivityTransactionDetailComposeKt$ObserveActionExecutionState$1$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ kotlin.jvm.functions.Function0<kotlin.Unit> Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.oslo.feature.activity.domain.common.models.ActivityActionModel getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ kotlin.jvm.functions.Function1<java.lang.Boolean, kotlin.Unit> getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.paypal.oslo.feature.activity.ui.common.model.states.ActionExecutionState getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ kotlin.jvm.functions.Function0<kotlin.Unit> getHighSpeedVideoSizes;
    int getInputFormats;
    final /* synthetic */ kotlin.jvm.functions.Function0<kotlin.Unit> getOutputMinFrameDuration;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.feature.activity.domain.common.models.ActivityActionsTransactionInfo activityActionsTransactionInfo;
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.getInputFormats != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        com.paypal.oslo.feature.activity.domain.common.models.ActivityActionModel activityActionModel = this.getHighResolutionOutputSizeshNQ4ISI;
        if ((activityActionModel != null ? activityActionModel.getType() : null) == com.paypal.oslo.api.graphql.schema.type.ActivityActionType.SHOW_P2P_BLOCK && (activityActionsTransactionInfo = this.getHighResolutionOutputSizeshNQ4ISI.getActivityActionsTransactionInfo()) != null && kotlin.jvm.internal.Intrinsics.areEqual(activityActionsTransactionInfo.isBlocked(), kotlin.coroutines.jvm.internal.Boxing.boxBoolean(true))) {
            com.paypal.oslo.feature.activity.ui.common.model.states.ActionExecutionState actionExecutionState = this.getHighSpeedVideoFpsRangesFor;
            if (actionExecutionState instanceof com.paypal.oslo.feature.activity.ui.common.model.states.ActionExecutionState.Loading) {
                this.getHighSpeedVideoFpsRanges.invoke(kotlin.coroutines.jvm.internal.Boxing.boxBoolean(true));
            } else if (actionExecutionState instanceof com.paypal.oslo.feature.activity.ui.common.model.states.ActionExecutionState.Success) {
                this.getHighSpeedVideoFpsRanges.invoke(kotlin.coroutines.jvm.internal.Boxing.boxBoolean(false));
                this.getOutputMinFrameDuration.invoke();
                this.getHighSpeedVideoSizes.invoke();
            } else if (actionExecutionState instanceof com.paypal.oslo.feature.activity.ui.common.model.states.ActionExecutionState.Error) {
                this.getHighSpeedVideoFpsRanges.invoke(kotlin.coroutines.jvm.internal.Boxing.boxBoolean(false));
                this.Camera2StreamConfigurationMap.invoke();
            } else {
                this.getHighSpeedVideoFpsRanges.invoke(kotlin.coroutines.jvm.internal.Boxing.boxBoolean(false));
            }
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.activity.ui.detail.view.compose.ActivityTransactionDetailComposeKt$ObserveActionExecutionState$1$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.activity.ui.detail.view.compose.ActivityTransactionDetailComposeKt$ObserveActionExecutionState$1$1(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoFpsRanges, this.getOutputMinFrameDuration, this.getHighSpeedVideoSizes, this.Camera2StreamConfigurationMap, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    ActivityTransactionDetailComposeKt$ObserveActionExecutionState$1$1(com.paypal.oslo.feature.activity.domain.common.models.ActivityActionModel activityActionModel, com.paypal.oslo.feature.activity.ui.common.model.states.ActionExecutionState actionExecutionState, kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> function1, kotlin.jvm.functions.Function0<kotlin.Unit> function0, kotlin.jvm.functions.Function0<kotlin.Unit> function02, kotlin.jvm.functions.Function0<kotlin.Unit> function03, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.activity.ui.detail.view.compose.ActivityTransactionDetailComposeKt$ObserveActionExecutionState$1$1> continuation) {
        super(2, continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = activityActionModel;
        this.getHighSpeedVideoFpsRangesFor = actionExecutionState;
        this.getHighSpeedVideoFpsRanges = function1;
        this.getOutputMinFrameDuration = function0;
        this.getHighSpeedVideoSizes = function02;
        this.Camera2StreamConfigurationMap = function03;
    }
}
