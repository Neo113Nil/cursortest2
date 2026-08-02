package com.payair.csdk;

/* loaded from: classes10.dex */
public final class z2 extends kotlin.coroutines.jvm.internal.ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.Object f4344a;
    public java.lang.Object b;
    public java.lang.Object c;
    public com.payair.model.TokenDetails d;
    public /* synthetic */ java.lang.Object e;
    public final /* synthetic */ com.payair.logic.managers.TokenImpl f;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z2(com.payair.logic.managers.TokenImpl tokenImpl, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f = tokenImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.e = obj;
        this.g |= Integer.MIN_VALUE;
        return this.f.getTokenDetails(null, this);
    }
}
