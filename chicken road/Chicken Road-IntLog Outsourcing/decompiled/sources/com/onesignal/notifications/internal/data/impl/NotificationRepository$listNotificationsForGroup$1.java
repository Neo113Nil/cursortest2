package com.onesignal.notifications.internal.data.impl;

import k4.InterfaceC1218d;
import m4.AbstractC1295c;
import m4.e;

@e(c = "com.onesignal.notifications.internal.data.impl.NotificationRepository", f = "NotificationRepository.kt", l = {440}, m = "listNotificationsForGroup")
/* loaded from: classes.dex */
public final class NotificationRepository$listNotificationsForGroup$1 extends AbstractC1295c {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ NotificationRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NotificationRepository$listNotificationsForGroup$1(NotificationRepository notificationRepository, InterfaceC1218d interfaceC1218d) {
        super(interfaceC1218d);
        this.this$0 = notificationRepository;
    }

    @Override // m4.AbstractC1293a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.listNotificationsForGroup(null, this);
    }
}
