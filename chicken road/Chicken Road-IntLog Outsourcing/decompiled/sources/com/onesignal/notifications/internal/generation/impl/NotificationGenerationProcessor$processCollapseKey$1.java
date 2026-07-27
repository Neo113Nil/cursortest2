package com.onesignal.notifications.internal.generation.impl;

import k4.InterfaceC1218d;
import m4.AbstractC1295c;
import m4.e;

@e(c = "com.onesignal.notifications.internal.generation.impl.NotificationGenerationProcessor", f = "NotificationGenerationProcessor.kt", l = {320}, m = "processCollapseKey")
/* loaded from: classes.dex */
public final class NotificationGenerationProcessor$processCollapseKey$1 extends AbstractC1295c {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ NotificationGenerationProcessor this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NotificationGenerationProcessor$processCollapseKey$1(NotificationGenerationProcessor notificationGenerationProcessor, InterfaceC1218d interfaceC1218d) {
        super(interfaceC1218d);
        this.this$0 = notificationGenerationProcessor;
    }

    @Override // m4.AbstractC1293a
    public final Object invokeSuspend(Object obj) {
        Object processCollapseKey;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        processCollapseKey = this.this$0.processCollapseKey(null, this);
        return processCollapseKey;
    }
}
