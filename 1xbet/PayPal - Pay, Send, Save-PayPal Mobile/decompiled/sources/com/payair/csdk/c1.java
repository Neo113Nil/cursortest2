package com.payair.csdk;

/* loaded from: classes10.dex */
public final class c1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public com.payair.model.CompleteTokenizeData f4237a;
    public /* synthetic */ java.lang.Object b;
    public final /* synthetic */ com.payair.logic.remote.repositories.HceRemoteRepositoryImpl c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c1(com.payair.logic.remote.repositories.HceRemoteRepositoryImpl hceRemoteRepositoryImpl, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.c = hceRemoteRepositoryImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object a2;
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        a2 = this.c.a(0L, null, null, this);
        return a2;
    }
}
