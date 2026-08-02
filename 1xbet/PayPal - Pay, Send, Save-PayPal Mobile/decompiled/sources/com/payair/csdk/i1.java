package com.payair.csdk;

/* loaded from: classes10.dex */
public final class i1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f4263a;
    public final /* synthetic */ com.payair.logic.remote.repositories.HceRemoteRepositoryImpl b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i1(com.payair.logic.remote.repositories.HceRemoteRepositoryImpl hceRemoteRepositoryImpl, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.b = hceRemoteRepositoryImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object a2;
        this.f4263a = obj;
        this.c |= Integer.MIN_VALUE;
        a2 = this.b.a(null, null, this);
        return a2;
    }
}
