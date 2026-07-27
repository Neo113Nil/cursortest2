package com.onesignal.core.internal.operations.impl;

import f4.v;
import kotlin.jvm.internal.j;
import t4.InterfaceC1441l;

/* loaded from: classes.dex */
public final class OperationRepo$start$1 extends j implements InterfaceC1441l {
    final /* synthetic */ OperationRepo this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OperationRepo$start$1(OperationRepo operationRepo) {
        super(1);
        this.this$0 = operationRepo;
    }

    @Override // t4.InterfaceC1441l
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke(((Boolean) obj).booleanValue());
        return v.f5689a;
    }

    public final void invoke(boolean z) {
        this.this$0.onJwtConfigHydrated$com_onesignal_core(z);
    }
}
