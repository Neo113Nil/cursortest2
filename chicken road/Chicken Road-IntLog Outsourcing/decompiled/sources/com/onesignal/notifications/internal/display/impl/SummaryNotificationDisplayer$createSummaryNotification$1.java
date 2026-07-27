package com.onesignal.notifications.internal.display.impl;

import io.appmetrica.analytics.BuildConfig;
import k4.InterfaceC1218d;
import m4.AbstractC1295c;
import m4.e;

@e(c = "com.onesignal.notifications.internal.display.impl.SummaryNotificationDisplayer", f = "SummaryNotificationDisplayer.kt", l = {111, BuildConfig.API_LEVEL, 119}, m = "createSummaryNotification")
/* loaded from: classes.dex */
public final class SummaryNotificationDisplayer$createSummaryNotification$1 extends AbstractC1295c {
    int I$0;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    Object L$7;
    Object L$8;
    boolean Z$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ SummaryNotificationDisplayer this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SummaryNotificationDisplayer$createSummaryNotification$1(SummaryNotificationDisplayer summaryNotificationDisplayer, InterfaceC1218d interfaceC1218d) {
        super(interfaceC1218d);
        this.this$0 = summaryNotificationDisplayer;
    }

    @Override // m4.AbstractC1293a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.createSummaryNotification(null, null, 0, this);
    }
}
