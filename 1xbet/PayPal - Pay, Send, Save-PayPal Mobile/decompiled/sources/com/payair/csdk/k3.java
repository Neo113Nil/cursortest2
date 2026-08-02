package com.payair.csdk;

/* loaded from: classes4.dex */
public final class k3 extends kotlin.coroutines.jvm.internal.ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public com.payair.logic.managers.TokenListManagerSuspendImpl f4275a;
    public java.util.List b;
    public /* synthetic */ java.lang.Object c;
    public final /* synthetic */ com.payair.logic.managers.TokenListManagerSuspendImpl d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k3(com.payair.logic.managers.TokenListManagerSuspendImpl tokenListManagerSuspendImpl, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.d = tokenListManagerSuspendImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object a2;
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        a2 = this.d.a((java.util.List) null, this);
        return a2;
    }
}
