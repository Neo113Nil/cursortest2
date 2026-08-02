package com.plaid.internal;

@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.plaid.internal.workflow.LinkController", f = "LinkController.kt", i = {0, 0, 1, 1, 1, 2}, l = {65, 68, 70, 72}, m = "resume", n = {"this", "result", "this", "result", "currentState", "this"}, s = {"L$0", "L$1", "L$0", "L$1", "L$2", "L$0"})
/* renamed from: com.plaid.internal.q2, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C0620q2 extends kotlin.coroutines.jvm.internal.ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public com.plaid.internal.C0646t2 f6543a;
    public com.plaid.internal.D6 b;
    public com.plaid.internal.N2 c;
    public /* synthetic */ java.lang.Object d;
    public final /* synthetic */ com.plaid.internal.C0646t2 e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0620q2(com.plaid.internal.C0646t2 c0646t2, kotlin.coroutines.jvm.internal.ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.e = c0646t2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.a((com.plaid.internal.D6) null, this);
    }
}
