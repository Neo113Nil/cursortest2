package com.paypal.oslo.feature.notificationcenter.badge.data.repository;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.notificationcenter.badge.data.repository.NotificationBadgeRepositoryImpl", f = "NotificationBadgeRepositoryImpl.kt", i = {}, l = {36}, m = "getBadgeCount", n = {}, nl = {37}, s = {}, v = 2)
/* loaded from: classes5.dex */
final class NotificationBadgeRepositoryImpl$getBadgeCount$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    /* synthetic */ java.lang.Object Camera2StreamConfigurationMap;
    int getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ com.paypal.oslo.feature.notificationcenter.badge.data.repository.NotificationBadgeRepositoryImpl getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.Camera2StreamConfigurationMap = obj;
        this.getHighSpeedVideoFpsRangesFor |= Integer.MIN_VALUE;
        return this.getHighSpeedVideoSizes.getBadgeCount(this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    NotificationBadgeRepositoryImpl$getBadgeCount$1(com.paypal.oslo.feature.notificationcenter.badge.data.repository.NotificationBadgeRepositoryImpl notificationBadgeRepositoryImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.notificationcenter.badge.data.repository.NotificationBadgeRepositoryImpl$getBadgeCount$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoSizes = notificationBadgeRepositoryImpl;
    }
}
