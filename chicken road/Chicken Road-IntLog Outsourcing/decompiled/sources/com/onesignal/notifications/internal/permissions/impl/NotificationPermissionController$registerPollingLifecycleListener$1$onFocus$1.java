package com.onesignal.notifications.internal.permissions.impl;

import com.onesignal.common.threading.Waiter;
import com.onesignal.core.internal.config.ConfigModelStore;
import f4.v;
import kotlin.jvm.internal.j;
import t4.InterfaceC1430a;

/* loaded from: classes.dex */
public final class NotificationPermissionController$registerPollingLifecycleListener$1$onFocus$1 extends j implements InterfaceC1430a {
    final /* synthetic */ NotificationPermissionController this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NotificationPermissionController$registerPollingLifecycleListener$1$onFocus$1(NotificationPermissionController notificationPermissionController) {
        super(0);
        this.this$0 = notificationPermissionController;
    }

    @Override // t4.InterfaceC1430a
    public /* bridge */ /* synthetic */ Object invoke() {
        m31invoke();
        return v.f5689a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m31invoke() {
        ConfigModelStore configModelStore;
        Waiter waiter;
        NotificationPermissionController notificationPermissionController = this.this$0;
        configModelStore = notificationPermissionController._configModelStore;
        notificationPermissionController.pollingWaitInterval = configModelStore.getModel().getForegroundFetchNotificationPermissionInterval();
        waiter = this.this$0.pollingWaiter;
        waiter.wake();
    }
}
