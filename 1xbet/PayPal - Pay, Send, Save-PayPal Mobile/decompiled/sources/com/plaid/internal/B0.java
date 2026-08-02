package com.plaid.internal;

@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.plaid.internal.workflow.DestinationFactory", f = "DestinationFactory.kt", i = {0, 0, 0}, l = {63}, m = "create", n = {"this", "state", "paneId"}, s = {"L$0", "L$1", "L$2"})
/* loaded from: classes16.dex */
public final class B0 extends kotlin.coroutines.jvm.internal.ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public com.plaid.internal.A0 f5755a;
    public com.plaid.internal.N2 b;
    public com.plaid.internal.r8 c;
    public /* synthetic */ java.lang.Object d;
    public final /* synthetic */ com.plaid.internal.A0 e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B0(com.plaid.internal.A0 a0, kotlin.coroutines.jvm.internal.ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.e = a0;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.a((com.plaid.internal.N2) null, this);
    }
}
