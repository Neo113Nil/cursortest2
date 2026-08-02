package com.payair.csdk;

/* loaded from: classes10.dex */
public final class h2 extends kotlin.coroutines.jvm.internal.ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.Object f4259a;
    public /* synthetic */ java.lang.Object b;
    public final /* synthetic */ com.payair.logic.managers.SetupManagerImpl c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h2(com.payair.logic.managers.SetupManagerImpl setupManagerImpl, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.c = setupManagerImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object a2;
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        a2 = this.c.a(null, null, null, this);
        return a2;
    }
}
