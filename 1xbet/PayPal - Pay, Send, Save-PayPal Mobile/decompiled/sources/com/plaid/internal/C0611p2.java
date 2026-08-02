package com.plaid.internal;

@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.plaid.internal.workflow.LinkController", f = "LinkController.kt", i = {0, 1}, l = {56, 56, 58}, m = "previous", n = {"this", "this"}, s = {"L$0", "L$0"})
/* renamed from: com.plaid.internal.p2, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C0611p2 extends kotlin.coroutines.jvm.internal.ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public com.plaid.internal.C0646t2 f6528a;
    public com.plaid.internal.Y2 b;
    public /* synthetic */ java.lang.Object c;
    public final /* synthetic */ com.plaid.internal.C0646t2 d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0611p2(com.plaid.internal.C0646t2 c0646t2, kotlin.coroutines.jvm.internal.ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.d = c0646t2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.a(this);
    }
}
