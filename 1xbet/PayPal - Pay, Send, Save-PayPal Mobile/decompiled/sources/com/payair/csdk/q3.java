package com.payair.csdk;

/* loaded from: classes4.dex */
public final class q3 extends kotlin.coroutines.jvm.internal.ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public com.payair.logic.remote.repositories.TokenRemoteRepositoryImpl f4304a;
    public /* synthetic */ java.lang.Object b;
    public final /* synthetic */ com.payair.logic.remote.repositories.TokenRemoteRepositoryImpl c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q3(com.payair.logic.remote.repositories.TokenRemoteRepositoryImpl tokenRemoteRepositoryImpl, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.c = tokenRemoteRepositoryImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.getTokenDetailsAsync(null, null, this);
    }
}
