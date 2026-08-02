package com.payair.csdk;

/* loaded from: classes4.dex */
public final class h3 extends kotlin.coroutines.jvm.internal.ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f4260a;
    public final /* synthetic */ com.payair.logic.managers.TokenListManagerSuspendImpl b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h3(com.payair.logic.managers.TokenListManagerSuspendImpl tokenListManagerSuspendImpl, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.b = tokenListManagerSuspendImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object a2;
        this.f4260a = obj;
        this.c |= Integer.MIN_VALUE;
        a2 = this.b.a((java.lang.String) null, this);
        return a2;
    }
}
