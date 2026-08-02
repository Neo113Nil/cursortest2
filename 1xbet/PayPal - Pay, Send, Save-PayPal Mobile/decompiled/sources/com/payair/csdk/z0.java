package com.payair.csdk;

/* loaded from: classes10.dex */
public final class z0 extends kotlin.coroutines.jvm.internal.ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public com.payair.logic.remote.repositories.HceRemoteRepositoryImpl f4342a;
    public java.lang.String b;
    public java.lang.String c;
    public java.lang.String d;
    public long e;
    public /* synthetic */ java.lang.Object f;
    public final /* synthetic */ com.payair.logic.remote.repositories.HceRemoteRepositoryImpl g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0(com.payair.logic.remote.repositories.HceRemoteRepositoryImpl hceRemoteRepositoryImpl, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.g = hceRemoteRepositoryImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f = obj;
        this.h |= Integer.MIN_VALUE;
        return this.g.completeTokenization(null, null, 0L, null, this);
    }
}
