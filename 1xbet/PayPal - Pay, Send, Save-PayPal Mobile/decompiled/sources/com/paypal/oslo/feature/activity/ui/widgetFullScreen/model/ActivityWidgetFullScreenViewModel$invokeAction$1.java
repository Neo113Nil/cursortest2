package com.paypal.oslo.feature.activity.ui.widgetFullScreen.model;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.activity.ui.widgetFullScreen.model.ActivityWidgetFullScreenViewModel$invokeAction$1", f = "ActivityWidgetFullScreenViewModel.kt", i = {}, l = {161}, m = "invokeSuspend", n = {}, nl = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SUPPORT_VALUE}, s = {}, v = 2)
/* loaded from: classes10.dex */
final class ActivityWidgetFullScreenViewModel$invokeAction$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.feature.activity.ui.widgetFullScreen.model.ActivityWidgetFullScreenViewModel Camera2StreamConfigurationMap;
    int getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.paypal.oslo.feature.activity.domain.common.models.ActivityActionModel getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.feature.activity.domain.usecase.widgetFullScreen.ActivityWidgetLandingActionsUseCase activityWidgetLandingActionsUseCase;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRanges;
        try {
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                activityWidgetLandingActionsUseCase = this.Camera2StreamConfigurationMap.getHighSpeedVideoSizes;
                this.getHighSpeedVideoFpsRanges = 1;
                if (activityWidgetLandingActionsUseCase.invoke(this.getHighSpeedVideoFpsRangesFor, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
            }
        } catch (java.util.concurrent.CancellationException e) {
            throw e;
        } catch (java.lang.Exception e2) {
            com.paypal.oslo.feature.activity.domain.base.utils.logs.ActivityActionsLogUtils.INSTANCE.logActivityActionException$activity_prodRelease("invokeAction", e2);
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.activity.ui.widgetFullScreen.model.ActivityWidgetFullScreenViewModel$invokeAction$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.activity.ui.widgetFullScreen.model.ActivityWidgetFullScreenViewModel$invokeAction$1(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRangesFor, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ActivityWidgetFullScreenViewModel$invokeAction$1(com.paypal.oslo.feature.activity.ui.widgetFullScreen.model.ActivityWidgetFullScreenViewModel activityWidgetFullScreenViewModel, com.paypal.oslo.feature.activity.domain.common.models.ActivityActionModel activityActionModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.activity.ui.widgetFullScreen.model.ActivityWidgetFullScreenViewModel$invokeAction$1> continuation) {
        super(2, continuation);
        this.Camera2StreamConfigurationMap = activityWidgetFullScreenViewModel;
        this.getHighSpeedVideoFpsRangesFor = activityActionModel;
    }
}
