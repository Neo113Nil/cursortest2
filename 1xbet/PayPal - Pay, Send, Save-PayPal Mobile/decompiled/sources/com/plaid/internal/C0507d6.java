package com.plaid.internal;

@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.plaid.internal.workflow.preload.PreloadLinkController", f = "PreloadLinkController.kt", i = {0}, l = {113}, m = "getResult", n = {"this"}, s = {"L$0"})
/* renamed from: com.plaid.internal.d6, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C0507d6 extends kotlin.coroutines.jvm.internal.ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public com.plaid.internal.C0570k6 f6394a;
    public /* synthetic */ java.lang.Object b;
    public final /* synthetic */ com.plaid.internal.C0570k6 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0507d6(com.plaid.internal.C0570k6 c0570k6, kotlin.coroutines.jvm.internal.ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.c = c0570k6;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.a(this);
    }
}
