package com.payair.csdk;

/* loaded from: classes4.dex */
public final class f3 extends kotlin.coroutines.jvm.internal.ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public com.payair.logic.managers.TokenListManagerSuspendImpl f4250a;
    public /* synthetic */ java.lang.Object b;
    public final /* synthetic */ com.payair.logic.managers.TokenListManagerSuspendImpl c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f3(com.payair.logic.managers.TokenListManagerSuspendImpl tokenListManagerSuspendImpl, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.c = tokenListManagerSuspendImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.getAllTokensWithDetails(false, this);
    }
}
