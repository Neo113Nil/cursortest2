package com.onesignal.core.internal.operations.impl;

import D4.InterfaceC0022w;
import com.onesignal.common.threading.WaiterWithValue;
import e5.g;
import f4.v;
import k4.InterfaceC1218d;
import kotlin.jvm.internal.s;
import l4.EnumC1260a;
import m4.e;
import m4.h;
import t4.InterfaceC1445p;

@e(c = "com.onesignal.core.internal.operations.impl.OperationRepo$waitForNewOperationAndExecutionInterval$waitedTheFullTime$1", f = "OperationRepo.kt", l = {359}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class OperationRepo$waitForNewOperationAndExecutionInterval$waitedTheFullTime$1 extends h implements InterfaceC1445p {
    final /* synthetic */ s $wakeMessage;
    Object L$0;
    int label;
    final /* synthetic */ OperationRepo this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OperationRepo$waitForNewOperationAndExecutionInterval$waitedTheFullTime$1(s sVar, OperationRepo operationRepo, InterfaceC1218d interfaceC1218d) {
        super(2, interfaceC1218d);
        this.$wakeMessage = sVar;
        this.this$0 = operationRepo;
    }

    @Override // m4.AbstractC1293a
    public final InterfaceC1218d create(Object obj, InterfaceC1218d interfaceC1218d) {
        return new OperationRepo$waitForNewOperationAndExecutionInterval$waitedTheFullTime$1(this.$wakeMessage, this.this$0, interfaceC1218d);
    }

    @Override // t4.InterfaceC1445p
    public final Object invoke(InterfaceC0022w interfaceC0022w, InterfaceC1218d interfaceC1218d) {
        return ((OperationRepo$waitForNewOperationAndExecutionInterval$waitedTheFullTime$1) create(interfaceC0022w, interfaceC1218d)).invokeSuspend(v.f5689a);
    }

    @Override // m4.AbstractC1293a
    public final Object invokeSuspend(Object obj) {
        WaiterWithValue waiterWithValue;
        s sVar;
        EnumC1260a enumC1260a = EnumC1260a.f11058a;
        int i2 = this.label;
        if (i2 == 0) {
            g.y(obj);
            s sVar2 = this.$wakeMessage;
            waiterWithValue = this.this$0.waiter;
            this.L$0 = sVar2;
            this.label = 1;
            Object waitForWake = waiterWithValue.waitForWake(this);
            if (waitForWake == enumC1260a) {
                return enumC1260a;
            }
            sVar = sVar2;
            obj = waitForWake;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            sVar = (s) this.L$0;
            g.y(obj);
        }
        sVar.f10741a = obj;
        return v.f5689a;
    }
}
