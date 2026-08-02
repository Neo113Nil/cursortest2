package com.payair.csdk;

/* loaded from: classes10.dex */
public final class u3 extends kotlin.coroutines.jvm.internal.ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f4323a;
    public final /* synthetic */ com.payair.logic.remote.repositories.TokenRemoteRepositoryImpl b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u3(com.payair.logic.remote.repositories.TokenRemoteRepositoryImpl tokenRemoteRepositoryImpl, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.b = tokenRemoteRepositoryImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f4323a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.getTokensCardReference(null, null, this);
    }
}
