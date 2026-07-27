package com.onesignal.core.internal.operations.impl;

import k4.InterfaceC1218d;
import m4.AbstractC1295c;
import m4.e;

@e(c = "com.onesignal.core.internal.operations.impl.OperationRepo", f = "OperationRepo.kt", l = {374, 469, 471}, m = "executeOperations$com_onesignal_core")
/* loaded from: classes.dex */
public final class OperationRepo$executeOperations$1 extends AbstractC1295c {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ OperationRepo this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OperationRepo$executeOperations$1(OperationRepo operationRepo, InterfaceC1218d interfaceC1218d) {
        super(interfaceC1218d);
        this.this$0 = operationRepo;
    }

    @Override // m4.AbstractC1293a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.executeOperations$com_onesignal_core(null, this);
    }
}
