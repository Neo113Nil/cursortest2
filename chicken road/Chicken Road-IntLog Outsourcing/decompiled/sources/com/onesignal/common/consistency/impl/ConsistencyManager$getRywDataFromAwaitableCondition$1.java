package com.onesignal.common.consistency.impl;

import io.appmetrica.analytics.AppMetricaDefaultValues;
import k4.InterfaceC1218d;
import m4.AbstractC1295c;
import m4.e;

@e(c = "com.onesignal.common.consistency.impl.ConsistencyManager", f = "ConsistencyManager.kt", l = {AppMetricaDefaultValues.DEFAULT_MAX_REPORTS_COUNT_LOWER_BOUND}, m = "getRywDataFromAwaitableCondition")
/* loaded from: classes.dex */
public final class ConsistencyManager$getRywDataFromAwaitableCondition$1 extends AbstractC1295c {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ConsistencyManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConsistencyManager$getRywDataFromAwaitableCondition$1(ConsistencyManager consistencyManager, InterfaceC1218d interfaceC1218d) {
        super(interfaceC1218d);
        this.this$0 = consistencyManager;
    }

    @Override // m4.AbstractC1293a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.getRywDataFromAwaitableCondition(null, this);
    }
}
