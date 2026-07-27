package com.onesignal.notifications.internal.restoration.impl;

import com.onesignal.notifications.internal.restoration.impl.NotificationRestoreWorkManager;
import k4.InterfaceC1218d;
import m4.AbstractC1295c;
import m4.e;

@e(c = "com.onesignal.notifications.internal.restoration.impl.NotificationRestoreWorkManager$NotificationRestoreWorker", f = "NotificationRestoreWorkManager.kt", l = {53, 65}, m = "doWork")
/* loaded from: classes.dex */
public final class NotificationRestoreWorkManager$NotificationRestoreWorker$doWork$1 extends AbstractC1295c {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ NotificationRestoreWorkManager.NotificationRestoreWorker this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NotificationRestoreWorkManager$NotificationRestoreWorker$doWork$1(NotificationRestoreWorkManager.NotificationRestoreWorker notificationRestoreWorker, InterfaceC1218d interfaceC1218d) {
        super(interfaceC1218d);
        this.this$0 = notificationRestoreWorker;
    }

    @Override // m4.AbstractC1293a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.doWork(this);
    }
}
