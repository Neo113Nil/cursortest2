package com.payair.csdk;

/* loaded from: classes10.dex */
public final class g1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.Object f4253a;
    public com.payair.model.StartTokenizeData b;
    public /* synthetic */ java.lang.Object c;
    public final /* synthetic */ com.payair.logic.remote.repositories.HceRemoteRepositoryImpl d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g1(com.payair.logic.remote.repositories.HceRemoteRepositoryImpl hceRemoteRepositoryImpl, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.d = hceRemoteRepositoryImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object a2;
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        a2 = this.d.a((com.payair.model.Response) null, this);
        return a2;
    }
}
