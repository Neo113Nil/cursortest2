package com.onesignal.notifications.internal.lifecycle.impl;

import k4.InterfaceC1218d;
import m4.AbstractC1295c;
import m4.e;

@e(c = "com.onesignal.notifications.internal.lifecycle.impl.NotificationLifecycleService", f = "NotificationLifecycleService.kt", l = {183}, m = "notificationOpened")
/* loaded from: classes.dex */
public final class NotificationLifecycleService$notificationOpened$1 extends AbstractC1295c {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ NotificationLifecycleService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NotificationLifecycleService$notificationOpened$1(NotificationLifecycleService notificationLifecycleService, InterfaceC1218d interfaceC1218d) {
        super(interfaceC1218d);
        this.this$0 = notificationLifecycleService;
    }

    @Override // m4.AbstractC1293a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.notificationOpened(null, null, this);
    }
}
