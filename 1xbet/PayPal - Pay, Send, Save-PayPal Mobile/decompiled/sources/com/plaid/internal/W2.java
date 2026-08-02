package com.plaid.internal;

@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.plaid.internal.workflow.LinkStateReducer", f = "LinkStateReducer.kt", i = {1, 1}, l = {439, 456}, m = "resume", n = {"this", "currentState"}, s = {"L$0", "L$1"})
/* loaded from: classes16.dex */
public final class W2 extends kotlin.coroutines.jvm.internal.ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public com.plaid.internal.Y2 f5961a;
    public com.plaid.internal.N2 b;
    public /* synthetic */ java.lang.Object c;
    public final /* synthetic */ com.plaid.internal.Y2 d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public W2(com.plaid.internal.Y2 y2, kotlin.coroutines.jvm.internal.ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.d = y2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.a((com.plaid.internal.N2) null, (com.plaid.internal.D6) null, this);
    }
}
