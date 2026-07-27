package com.onesignal.common.consistency.impl;

import io.appmetrica.analytics.AppMetricaDefaultValues;
import k4.InterfaceC1218d;
import m4.AbstractC1295c;
import m4.e;

@e(c = "com.onesignal.common.consistency.impl.ConsistencyManager", f = "ConsistencyManager.kt", l = {AppMetricaDefaultValues.DEFAULT_MAX_REPORTS_COUNT_LOWER_BOUND}, m = "setRywData")
/* loaded from: classes.dex */
public final class ConsistencyManager$setRywData$1 extends AbstractC1295c {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ConsistencyManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConsistencyManager$setRywData$1(ConsistencyManager consistencyManager, InterfaceC1218d interfaceC1218d) {
        super(interfaceC1218d);
        this.this$0 = consistencyManager;
    }

    @Override // m4.AbstractC1293a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.setRywData(null, null, null, this);
    }
}
