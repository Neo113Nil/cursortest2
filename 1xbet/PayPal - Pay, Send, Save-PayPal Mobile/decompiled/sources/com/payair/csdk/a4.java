package com.payair.csdk;

/* loaded from: classes4.dex */
public final class a4 extends kotlin.coroutines.jvm.internal.ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f4229a;
    public final /* synthetic */ com.payair.logic.remote.repositories.UserRemoteRepositoryImpl b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a4(com.payair.logic.remote.repositories.UserRemoteRepositoryImpl userRemoteRepositoryImpl, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.b = userRemoteRepositoryImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f4229a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.getAssetAsync(null, null, this);
    }
}
