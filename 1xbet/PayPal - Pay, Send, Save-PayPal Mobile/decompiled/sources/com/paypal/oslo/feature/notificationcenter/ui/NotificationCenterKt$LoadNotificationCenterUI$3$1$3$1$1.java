package com.paypal.oslo.feature.notificationcenter.ui;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.notificationcenter.ui.NotificationCenterKt$LoadNotificationCenterUI$3$1$3$1$1", f = "NotificationCenter.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
/* loaded from: classes13.dex */
final class NotificationCenterKt$LoadNotificationCenterUI$3$1$3$1$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ java.util.List<com.paypal.oslo.feature.notificationcenter.domain.model.Notification> Camera2StreamConfigurationMap;
    final /* synthetic */ androidx.compose.runtime.MutableState<java.lang.Boolean> getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        boolean booleanValue;
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.getHighSpeedVideoFpsRangesFor != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        if (!this.Camera2StreamConfigurationMap.isEmpty()) {
            booleanValue = ((java.lang.Boolean) this.getHighSpeedVideoFpsRanges.getValue()).booleanValue();
            if (!booleanValue) {
                this.getHighSpeedVideoFpsRanges.setValue(java.lang.Boolean.valueOf(true));
                com.paypal.oslo.feature.notificationcenter.analytics.NotificationCenterAnalyticsTracker.INSTANCE.trackNotificationListItemsLoaded(this.Camera2StreamConfigurationMap);
            }
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.notificationcenter.ui.NotificationCenterKt$LoadNotificationCenterUI$3$1$3$1$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.notificationcenter.ui.NotificationCenterKt$LoadNotificationCenterUI$3$1$3$1$1(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRanges, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    NotificationCenterKt$LoadNotificationCenterUI$3$1$3$1$1(java.util.List<com.paypal.oslo.feature.notificationcenter.domain.model.Notification> list, androidx.compose.runtime.MutableState<java.lang.Boolean> mutableState, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.notificationcenter.ui.NotificationCenterKt$LoadNotificationCenterUI$3$1$3$1$1> continuation) {
        super(2, continuation);
        this.Camera2StreamConfigurationMap = list;
        this.getHighSpeedVideoFpsRanges = mutableState;
    }
}
