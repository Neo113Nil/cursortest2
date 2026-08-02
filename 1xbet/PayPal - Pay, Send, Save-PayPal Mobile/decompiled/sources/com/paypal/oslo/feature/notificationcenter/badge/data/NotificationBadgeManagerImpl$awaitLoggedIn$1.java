package com.paypal.oslo.feature.notificationcenter.badge.data;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.notificationcenter.badge.data.NotificationBadgeManagerImpl", f = "NotificationBadgeManagerImpl.kt", i = {}, l = {96}, m = "awaitLoggedIn", n = {}, nl = {99}, s = {}, v = 2)
/* loaded from: classes5.dex */
final class NotificationBadgeManagerImpl$awaitLoggedIn$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    final /* synthetic */ com.paypal.oslo.feature.notificationcenter.badge.data.NotificationBadgeManagerImpl getHighResolutionOutputSizeshNQ4ISI;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoFpsRangesFor = obj;
        this.getHighSpeedVideoSizes |= Integer.MIN_VALUE;
        return com.paypal.oslo.feature.notificationcenter.badge.data.NotificationBadgeManagerImpl.access$awaitLoggedIn(this.getHighResolutionOutputSizeshNQ4ISI, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    NotificationBadgeManagerImpl$awaitLoggedIn$1(com.paypal.oslo.feature.notificationcenter.badge.data.NotificationBadgeManagerImpl notificationBadgeManagerImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.notificationcenter.badge.data.NotificationBadgeManagerImpl$awaitLoggedIn$1> continuation) {
        super(continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = notificationBadgeManagerImpl;
    }
}
