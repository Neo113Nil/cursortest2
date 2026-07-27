package com.onesignal.notifications.internal.permissions.impl;

import k4.InterfaceC1218d;
import m4.AbstractC1295c;
import m4.e;

@e(c = "com.onesignal.notifications.internal.permissions.impl.NotificationPermissionController", f = "NotificationPermissionController.kt", l = {117}, m = "pollForPermission")
/* loaded from: classes.dex */
public final class NotificationPermissionController$pollForPermission$1 extends AbstractC1295c {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ NotificationPermissionController this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NotificationPermissionController$pollForPermission$1(NotificationPermissionController notificationPermissionController, InterfaceC1218d interfaceC1218d) {
        super(interfaceC1218d);
        this.this$0 = notificationPermissionController;
    }

    @Override // m4.AbstractC1293a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.pollForPermission(this);
    }
}
