package com.payair.csdk;

/* loaded from: classes10.dex */
public final class a3 extends kotlin.coroutines.jvm.internal.ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public com.payair.model.Response.Success f4228a;
    public /* synthetic */ java.lang.Object b;
    public final /* synthetic */ com.payair.logic.managers.TokenImpl c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a3(com.payair.logic.managers.TokenImpl tokenImpl, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.c = tokenImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.send3dsAuthenticationValue(null, null, this);
    }
}
