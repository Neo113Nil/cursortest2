package com.payair.csdk;

/* loaded from: classes10.dex */
public final class s3 extends kotlin.coroutines.jvm.internal.ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f4313a;
    public final /* synthetic */ com.payair.logic.remote.repositories.TokenRemoteRepositoryImpl b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s3(com.payair.logic.remote.repositories.TokenRemoteRepositoryImpl tokenRemoteRepositoryImpl, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.b = tokenRemoteRepositoryImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f4313a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.getTokenList(null, null, this);
    }
}
