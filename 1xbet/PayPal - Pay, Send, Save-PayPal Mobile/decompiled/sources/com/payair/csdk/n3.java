package com.payair.csdk;

/* loaded from: classes4.dex */
public final class n3 extends kotlin.coroutines.jvm.internal.ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.Object f4290a;
    public java.lang.Object b;
    public /* synthetic */ java.lang.Object c;
    public final /* synthetic */ com.payair.logic.managers.TokenListManagerSuspendImpl d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n3(com.payair.logic.managers.TokenListManagerSuspendImpl tokenListManagerSuspendImpl, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.d = tokenListManagerSuspendImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return com.payair.logic.managers.TokenListManagerSuspendImpl.access$updateToken(this.d, null, this);
    }
}
