package com.paypal.oslo.feature.notificationcenter.ui.viewmodels;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.notificationcenter.ui.viewmodels.NotificationViewModel$updateNotificationsStatus$1", f = "NotificationViewModel.kt", i = {}, l = {183}, m = "invokeSuspend", n = {}, nl = {185}, s = {}, v = 2)
/* loaded from: classes13.dex */
final class NotificationViewModel$updateNotificationsStatus$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ kotlin.jvm.functions.Function0<kotlin.Unit> Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ java.util.List<com.paypal.oslo.feature.notificationcenter.domain.model.Notification> getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.paypal.oslo.feature.notificationcenter.ui.viewmodels.NotificationViewModel getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ com.paypal.oslo.feature.notificationcenter.domain.model.NotificationStatus getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow;
        com.paypal.oslo.feature.notificationcenter.domain.usecase.UpdateNotificationsTrackingStatusUseCase updateNotificationsTrackingStatusUseCase;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow2;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow3;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow4;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighResolutionOutputSizeshNQ4ISI;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            if (this.getHighSpeedVideoSizes == com.paypal.oslo.feature.notificationcenter.domain.model.NotificationStatus.CLICKED || this.getHighSpeedVideoSizes == com.paypal.oslo.feature.notificationcenter.domain.model.NotificationStatus.DISMISSED) {
                mutableStateFlow = this.getHighSpeedVideoFpsRangesFor.getOutputMinFrameDuration;
                mutableStateFlow.setValue(kotlin.coroutines.jvm.internal.Boxing.boxBoolean(true));
            }
            updateNotificationsTrackingStatusUseCase = this.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoSizes;
            this.getHighResolutionOutputSizeshNQ4ISI = 1;
            obj = updateNotificationsTrackingStatusUseCase.invoke(this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoSizes, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        arrow.core.Either either = (arrow.core.Either) obj;
        if (this.getHighSpeedVideoSizes == com.paypal.oslo.feature.notificationcenter.domain.model.NotificationStatus.CLICKED || this.getHighSpeedVideoSizes == com.paypal.oslo.feature.notificationcenter.domain.model.NotificationStatus.DISMISSED) {
            mutableStateFlow2 = this.getHighSpeedVideoFpsRangesFor.getOutputMinFrameDuration;
            mutableStateFlow2.setValue(kotlin.coroutines.jvm.internal.Boxing.boxBoolean(false));
        }
        if (either instanceof arrow.core.Either.Left) {
            boolean z = ((arrow.core.Either.Left) either).getValue() instanceof com.paypal.oslo.feature.notificationcenter.domain.model.NotificationError.NoInternetError;
            mutableStateFlow4 = this.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoFpsRangesFor;
            mutableStateFlow4.setValue(com.paypal.oslo.feature.notificationcenter.ui.viewmodels.NotificationViewModel.access$getNotificationErrorMessage(this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoSizes, z));
            com.paypal.oslo.feature.notificationcenter.analytics.NotificationCenterAnalyticsTracker.INSTANCE.trackNotificationStatusUpdateFailed(this.getHighSpeedVideoSizes, z);
        } else {
            if (!(either instanceof arrow.core.Either.Right)) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            arrow.core.Either.Right right = (arrow.core.Either.Right) either;
            if (!((com.paypal.oslo.feature.notificationcenter.domain.model.UpdateNotificationsTrackingStatus) right.getValue()).getSuccess()) {
                mutableStateFlow3 = this.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoFpsRangesFor;
                mutableStateFlow3.setValue(com.paypal.oslo.feature.notificationcenter.ui.viewmodels.NotificationViewModel.access$getNotificationErrorMessage(this.getHighSpeedVideoFpsRangesFor, ((com.paypal.oslo.feature.notificationcenter.domain.model.UpdateNotificationsTrackingStatus) right.getValue()).getStatus(), false));
            } else {
                kotlin.jvm.functions.Function0<kotlin.Unit> function0 = this.Camera2StreamConfigurationMap;
                if (function0 != null) {
                    function0.invoke();
                }
            }
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.notificationcenter.ui.viewmodels.NotificationViewModel$updateNotificationsStatus$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.notificationcenter.ui.viewmodels.NotificationViewModel$updateNotificationsStatus$1(this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoFpsRanges, this.Camera2StreamConfigurationMap, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    NotificationViewModel$updateNotificationsStatus$1(com.paypal.oslo.feature.notificationcenter.domain.model.NotificationStatus notificationStatus, com.paypal.oslo.feature.notificationcenter.ui.viewmodels.NotificationViewModel notificationViewModel, java.util.List<com.paypal.oslo.feature.notificationcenter.domain.model.Notification> list, kotlin.jvm.functions.Function0<kotlin.Unit> function0, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.notificationcenter.ui.viewmodels.NotificationViewModel$updateNotificationsStatus$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoSizes = notificationStatus;
        this.getHighSpeedVideoFpsRangesFor = notificationViewModel;
        this.getHighSpeedVideoFpsRanges = list;
        this.Camera2StreamConfigurationMap = function0;
    }
}
