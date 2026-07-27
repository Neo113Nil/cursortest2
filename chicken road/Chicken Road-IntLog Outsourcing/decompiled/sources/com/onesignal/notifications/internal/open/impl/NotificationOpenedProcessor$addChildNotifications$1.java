package com.onesignal.notifications.internal.open.impl;

import k4.InterfaceC1218d;
import m4.AbstractC1295c;
import m4.e;

@e(c = "com.onesignal.notifications.internal.open.impl.NotificationOpenedProcessor", f = "NotificationOpenedProcessor.kt", l = {179}, m = "addChildNotifications")
/* loaded from: classes.dex */
public final class NotificationOpenedProcessor$addChildNotifications$1 extends AbstractC1295c {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ NotificationOpenedProcessor this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NotificationOpenedProcessor$addChildNotifications$1(NotificationOpenedProcessor notificationOpenedProcessor, InterfaceC1218d interfaceC1218d) {
        super(interfaceC1218d);
        this.this$0 = notificationOpenedProcessor;
    }

    @Override // m4.AbstractC1293a
    public final Object invokeSuspend(Object obj) {
        Object addChildNotifications;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        addChildNotifications = this.this$0.addChildNotifications(null, null, this);
        return addChildNotifications;
    }
}
