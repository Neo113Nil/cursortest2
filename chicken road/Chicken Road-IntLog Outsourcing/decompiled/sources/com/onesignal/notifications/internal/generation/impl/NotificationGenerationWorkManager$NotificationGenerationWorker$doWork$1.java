package com.onesignal.notifications.internal.generation.impl;

import com.onesignal.notifications.internal.generation.impl.NotificationGenerationWorkManager;
import k4.InterfaceC1218d;
import m4.AbstractC1295c;
import m4.e;

@e(c = "com.onesignal.notifications.internal.generation.impl.NotificationGenerationWorkManager$NotificationGenerationWorker", f = "NotificationGenerationWorkManager.kt", l = {66, 87}, m = "doWork")
/* loaded from: classes.dex */
public final class NotificationGenerationWorkManager$NotificationGenerationWorker$doWork$1 extends AbstractC1295c {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ NotificationGenerationWorkManager.NotificationGenerationWorker this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NotificationGenerationWorkManager$NotificationGenerationWorker$doWork$1(NotificationGenerationWorkManager.NotificationGenerationWorker notificationGenerationWorker, InterfaceC1218d interfaceC1218d) {
        super(interfaceC1218d);
        this.this$0 = notificationGenerationWorker;
    }

    @Override // m4.AbstractC1293a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.doWork(this);
    }
}
