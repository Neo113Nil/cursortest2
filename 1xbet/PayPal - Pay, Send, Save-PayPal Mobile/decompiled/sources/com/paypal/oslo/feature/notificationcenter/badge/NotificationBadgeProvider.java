package com.paypal.oslo.feature.notificationcenter.badge;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u000b\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR \u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/feature/notificationcenter/badge/NotificationBadgeProvider;", "Lcom/paypal/oslo/core/navigation/ui/NavigationBadgeProvider;", "Lcom/paypal/oslo/feature/notificationcenter/badge/api/NotificationBadgeManager;", "manager", "<init>", "(Lcom/paypal/oslo/feature/notificationcenter/badge/api/NotificationBadgeManager;)V", "", com.paypal.oslo.feature.publicprofile.analytics.PublicProfileAnalyticsConstants.ACTION_REFRESH, "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/feature/notificationcenter/badge/api/NotificationBadgeManager;", "Camera2StreamConfigurationMap", "Lkotlinx/coroutines/flow/StateFlow;", "", "badgeCount", "Lkotlinx/coroutines/flow/StateFlow;", "getBadgeCount", "()Lkotlinx/coroutines/flow/StateFlow;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class NotificationBadgeProvider implements com.paypal.oslo.core.navigation.ui.NavigationBadgeProvider {
    public static final int $stable = 8;
    private final kotlinx.coroutines.flow.StateFlow<java.lang.Integer> badgeCount;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.notificationcenter.badge.api.NotificationBadgeManager Camera2StreamConfigurationMap;

    @javax.inject.Inject
    public NotificationBadgeProvider(com.paypal.oslo.feature.notificationcenter.badge.api.NotificationBadgeManager notificationBadgeManager) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(notificationBadgeManager, "");
        this.Camera2StreamConfigurationMap = notificationBadgeManager;
        this.badgeCount = notificationBadgeManager.getUnreadCount();
    }

    @Override // com.paypal.oslo.core.navigation.ui.NavigationBadgeProvider
    public final kotlinx.coroutines.flow.StateFlow<java.lang.Integer> getBadgeCount() {
        return this.badgeCount;
    }

    @Override // com.paypal.oslo.core.navigation.ui.NavigationBadgeProvider
    public final java.lang.Object refresh(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object refreshBadgeCount = this.Camera2StreamConfigurationMap.refreshBadgeCount(continuation);
        return refreshBadgeCount == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? refreshBadgeCount : kotlin.Unit.INSTANCE;
    }
}
