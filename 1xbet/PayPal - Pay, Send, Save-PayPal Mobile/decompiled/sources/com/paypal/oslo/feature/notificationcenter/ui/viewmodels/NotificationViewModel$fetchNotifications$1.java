package com.paypal.oslo.feature.notificationcenter.ui.viewmodels;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.notificationcenter.ui.viewmodels.NotificationViewModel$fetchNotifications$1", f = "NotificationViewModel.kt", i = {}, l = {86}, m = "invokeSuspend", n = {}, nl = {87}, s = {}, v = 2)
/* loaded from: classes13.dex */
final class NotificationViewModel$fetchNotifications$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.feature.notificationcenter.ui.viewmodels.NotificationViewModel getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow;
        com.paypal.oslo.feature.notificationcenter.domain.usecase.GetNotificationsUseCase getNotificationsUseCase;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow2;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow3;
        com.paypal.oslo.feature.notificationcenter.ui.viewmodels.NotificationUIState.Error error;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow4;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoSizes;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            mutableStateFlow = this.getHighSpeedVideoFpsRanges.Camera2StreamConfigurationMap;
            mutableStateFlow.setValue(com.paypal.oslo.feature.notificationcenter.ui.viewmodels.NotificationUIState.Loading.INSTANCE);
            getNotificationsUseCase = this.getHighSpeedVideoFpsRanges.getHighSpeedVideoFpsRanges;
            this.getHighSpeedVideoSizes = 1;
            obj = getNotificationsUseCase.invoke(this);
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
        if (either instanceof arrow.core.Either.Left) {
            arrow.core.Either.Left left = (arrow.core.Either.Left) either;
            com.paypal.oslo.feature.notificationcenter.domain.model.NotificationError notificationError = (com.paypal.oslo.feature.notificationcenter.domain.model.NotificationError) left.getValue();
            if (notificationError instanceof com.paypal.oslo.feature.notificationcenter.domain.model.NotificationError.NetworkError) {
                java.lang.String message = ((com.paypal.oslo.feature.notificationcenter.domain.model.NotificationError.NetworkError) notificationError).getMessage();
                if (message == null) {
                    message = "Connection failed";
                }
                error = new com.paypal.oslo.feature.notificationcenter.ui.viewmodels.NotificationUIState.Error("Network error: ".concat(java.lang.String.valueOf(message)));
            } else if (notificationError instanceof com.paypal.oslo.feature.notificationcenter.domain.model.NotificationError.ParsingError) {
                java.lang.String message2 = ((com.paypal.oslo.feature.notificationcenter.domain.model.NotificationError.ParsingError) notificationError).getMessage();
                if (message2 == null) {
                    message2 = "Could not process notifications";
                }
                error = new com.paypal.oslo.feature.notificationcenter.ui.viewmodels.NotificationUIState.Error("Data error: ".concat(java.lang.String.valueOf(message2)));
            } else {
                error = new com.paypal.oslo.feature.notificationcenter.ui.viewmodels.NotificationUIState.Error("Unknown error: Something went wrong");
            }
            com.paypal.oslo.feature.notificationcenter.analytics.NotificationCenterAnalyticsTracker.INSTANCE.trackNotificationFetchFailed((com.paypal.oslo.feature.notificationcenter.domain.model.NotificationError) left.getValue());
            mutableStateFlow4 = this.getHighSpeedVideoFpsRanges.Camera2StreamConfigurationMap;
            mutableStateFlow4.setValue(error);
        } else {
            if (!(either instanceof arrow.core.Either.Right)) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            com.paypal.oslo.feature.notificationcenter.domain.model.NotificationData notificationData = (com.paypal.oslo.feature.notificationcenter.domain.model.NotificationData) ((arrow.core.Either.Right) either).getValue();
            if (notificationData.getNotifications().isEmpty()) {
                mutableStateFlow3 = this.getHighSpeedVideoFpsRanges.Camera2StreamConfigurationMap;
                mutableStateFlow3.setValue(com.paypal.oslo.feature.notificationcenter.ui.viewmodels.NotificationUIState.Empty.INSTANCE);
            } else {
                mutableStateFlow2 = this.getHighSpeedVideoFpsRanges.Camera2StreamConfigurationMap;
                mutableStateFlow2.setValue(new com.paypal.oslo.feature.notificationcenter.ui.viewmodels.NotificationUIState.Success(notificationData));
                com.paypal.oslo.feature.notificationcenter.ui.viewmodels.NotificationViewModel.updateNotificationsStatus$default(this.getHighSpeedVideoFpsRanges, notificationData.getNotifications(), com.paypal.oslo.feature.notificationcenter.domain.model.NotificationStatus.PRESENTED, (kotlin.jvm.functions.Function0) null, 4, (java.lang.Object) null);
            }
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.notificationcenter.ui.viewmodels.NotificationViewModel$fetchNotifications$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.notificationcenter.ui.viewmodels.NotificationViewModel$fetchNotifications$1(this.getHighSpeedVideoFpsRanges, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    NotificationViewModel$fetchNotifications$1(com.paypal.oslo.feature.notificationcenter.ui.viewmodels.NotificationViewModel notificationViewModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.notificationcenter.ui.viewmodels.NotificationViewModel$fetchNotifications$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRanges = notificationViewModel;
    }
}
