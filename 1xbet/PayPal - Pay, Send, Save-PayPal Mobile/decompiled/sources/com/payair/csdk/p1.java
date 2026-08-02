package com.payair.csdk;

/* loaded from: classes10.dex */
public final class p1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public com.payair.logic.remote.repositories.HceRemoteRepositoryImpl f4298a;
    public java.lang.Object b;
    public com.payair.model.CardData c;
    public java.lang.String d;
    public /* synthetic */ java.lang.Object e;
    public final /* synthetic */ com.payair.logic.remote.repositories.HceRemoteRepositoryImpl f;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p1(com.payair.logic.remote.repositories.HceRemoteRepositoryImpl hceRemoteRepositoryImpl, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f = hceRemoteRepositoryImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.e = obj;
        this.g |= Integer.MIN_VALUE;
        return this.f.startTokenization((java.lang.String) null, (com.payair.model.CardData) null, (java.lang.String) null, this);
    }
}
