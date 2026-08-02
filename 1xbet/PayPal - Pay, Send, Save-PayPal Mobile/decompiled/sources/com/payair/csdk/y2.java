package com.payair.csdk;

/* loaded from: classes10.dex */
public final class y2 extends kotlin.coroutines.jvm.internal.ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.Object f4339a;
    public java.lang.String b;
    public com.payair.model.Response.Success c;
    public /* synthetic */ java.lang.Object d;
    public final /* synthetic */ com.payair.logic.managers.TokenImpl e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y2(com.payair.logic.managers.TokenImpl tokenImpl, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.e = tokenImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.getAuthenticationMethods(null, this);
    }
}
