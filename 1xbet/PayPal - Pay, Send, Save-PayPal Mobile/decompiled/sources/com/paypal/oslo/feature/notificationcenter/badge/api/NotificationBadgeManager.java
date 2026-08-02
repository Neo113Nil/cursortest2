package com.paypal.oslo.feature.notificationcenter.badge.api;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H¦@¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002H¦@¢\u0006\u0004\b\t\u0010\u0004J\u000f\u0010\n\u001a\u00020\u0002H&¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\f8'X¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eÀ\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/notificationcenter/badge/api/NotificationBadgeManager;", "", "", "refreshBadgeCount", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", com.datadog.android.rum.internal.metric.slowframes.DefaultUISlownessMetricDispatcher.KEY_COUNT, "updateCount", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "clearCount", "onNotificationCenterClosed", "()V", "Lkotlinx/coroutines/flow/StateFlow;", "getUnreadCount", "()Lkotlinx/coroutines/flow/StateFlow;", "unreadCount"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface NotificationBadgeManager {
    java.lang.Object clearCount(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);

    kotlinx.coroutines.flow.StateFlow<java.lang.Integer> getUnreadCount();

    void onNotificationCenterClosed();

    java.lang.Object refreshBadgeCount(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);

    java.lang.Object updateCount(int i, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
}
