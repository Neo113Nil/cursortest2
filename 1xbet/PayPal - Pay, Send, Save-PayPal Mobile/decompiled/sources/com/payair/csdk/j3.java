package com.payair.csdk;

/* loaded from: classes4.dex */
public final class j3 extends kotlin.coroutines.jvm.internal.ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public com.payair.logic.managers.TokenListManagerSuspendImpl f4270a;
    public java.util.List b;
    public java.util.Iterator c;
    public /* synthetic */ java.lang.Object d;
    public final /* synthetic */ com.payair.logic.managers.TokenListManagerSuspendImpl e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j3(com.payair.logic.managers.TokenListManagerSuspendImpl tokenListManagerSuspendImpl, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.e = tokenListManagerSuspendImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.refreshTokens$core_release((java.util.List<java.lang.String>) null, this);
    }
}
