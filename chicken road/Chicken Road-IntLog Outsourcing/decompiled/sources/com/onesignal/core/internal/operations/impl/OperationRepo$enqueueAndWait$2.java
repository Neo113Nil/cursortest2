package com.onesignal.core.internal.operations.impl;

import D4.InterfaceC0022w;
import com.onesignal.common.threading.WaiterWithValue;
import com.onesignal.core.internal.operations.Operation;
import com.onesignal.core.internal.operations.impl.OperationRepo;
import e5.g;
import f4.v;
import k4.InterfaceC1218d;
import l4.EnumC1260a;
import m4.e;
import m4.h;
import t4.InterfaceC1445p;

@e(c = "com.onesignal.core.internal.operations.impl.OperationRepo$enqueueAndWait$2", f = "OperationRepo.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class OperationRepo$enqueueAndWait$2 extends h implements InterfaceC1445p {
    final /* synthetic */ boolean $flush;
    final /* synthetic */ Operation $operation;
    final /* synthetic */ WaiterWithValue<Boolean> $waiter;
    int label;
    final /* synthetic */ OperationRepo this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OperationRepo$enqueueAndWait$2(OperationRepo operationRepo, Operation operation, WaiterWithValue<Boolean> waiterWithValue, boolean z, InterfaceC1218d interfaceC1218d) {
        super(2, interfaceC1218d);
        this.this$0 = operationRepo;
        this.$operation = operation;
        this.$waiter = waiterWithValue;
        this.$flush = z;
    }

    @Override // m4.AbstractC1293a
    public final InterfaceC1218d create(Object obj, InterfaceC1218d interfaceC1218d) {
        return new OperationRepo$enqueueAndWait$2(this.this$0, this.$operation, this.$waiter, this.$flush, interfaceC1218d);
    }

    @Override // t4.InterfaceC1445p
    public final Object invoke(InterfaceC0022w interfaceC0022w, InterfaceC1218d interfaceC1218d) {
        return ((OperationRepo$enqueueAndWait$2) create(interfaceC0022w, interfaceC1218d)).invokeSuspend(v.f5689a);
    }

    @Override // m4.AbstractC1293a
    public final Object invokeSuspend(Object obj) {
        int i2;
        EnumC1260a enumC1260a = EnumC1260a.f11058a;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        g.y(obj);
        OperationRepo operationRepo = this.this$0;
        Operation operation = this.$operation;
        WaiterWithValue<Boolean> waiterWithValue = this.$waiter;
        i2 = operationRepo.enqueueIntoBucket;
        OperationRepo.internalEnqueue$default(operationRepo, new OperationRepo.OperationQueueItem(operation, waiterWithValue, i2, 0, 8, null), this.$flush, true, null, 8, null);
        return v.f5689a;
    }
}
