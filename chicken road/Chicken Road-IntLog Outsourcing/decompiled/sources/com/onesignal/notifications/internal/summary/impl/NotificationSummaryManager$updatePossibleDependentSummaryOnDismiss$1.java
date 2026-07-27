package com.onesignal.notifications.internal.summary.impl;

import io.appmetrica.analytics.impl.C0793l9;
import k4.InterfaceC1218d;
import m4.AbstractC1295c;
import m4.e;

@e(c = "com.onesignal.notifications.internal.summary.impl.NotificationSummaryManager", f = "NotificationSummaryManager.kt", l = {C0793l9.f8684F, 28}, m = "updatePossibleDependentSummaryOnDismiss")
/* loaded from: classes.dex */
public final class NotificationSummaryManager$updatePossibleDependentSummaryOnDismiss$1 extends AbstractC1295c {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ NotificationSummaryManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NotificationSummaryManager$updatePossibleDependentSummaryOnDismiss$1(NotificationSummaryManager notificationSummaryManager, InterfaceC1218d interfaceC1218d) {
        super(interfaceC1218d);
        this.this$0 = notificationSummaryManager;
    }

    @Override // m4.AbstractC1293a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.updatePossibleDependentSummaryOnDismiss(0, this);
    }
}
