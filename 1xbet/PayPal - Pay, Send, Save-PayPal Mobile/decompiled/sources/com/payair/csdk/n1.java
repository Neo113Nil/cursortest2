package com.payair.csdk;

/* loaded from: classes10.dex */
public final class n1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public com.payair.logic.remote.repositories.HceRemoteRepositoryImpl f4288a;
    public java.lang.String b;
    public java.lang.String c;
    public java.lang.String d;
    public java.lang.String e;
    public com.payair.model.CardScheme f;
    public /* synthetic */ java.lang.Object g;
    public final /* synthetic */ com.payair.logic.remote.repositories.HceRemoteRepositoryImpl h;
    public int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n1(com.payair.logic.remote.repositories.HceRemoteRepositoryImpl hceRemoteRepositoryImpl, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.h = hceRemoteRepositoryImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object a2;
        this.g = obj;
        this.i |= Integer.MIN_VALUE;
        a2 = this.h.a(null, null, null, null, null, this);
        return a2;
    }
}
