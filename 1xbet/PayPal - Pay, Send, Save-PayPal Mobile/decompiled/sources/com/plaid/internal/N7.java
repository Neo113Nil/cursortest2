package com.plaid.internal;

@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.plaid.internal.workflow.di.WebviewFallbackUriStore", f = "WebviewFallbackUriStore.kt", i = {0, 1}, l = {20, 24}, m = "readWebviewFallbackUri", n = {"this", "uri"}, s = {"L$0", "L$0"})
/* loaded from: classes16.dex */
public final class N7 extends kotlin.coroutines.jvm.internal.ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.Object f5865a;
    public /* synthetic */ java.lang.Object b;
    public final /* synthetic */ com.plaid.internal.O7 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public N7(com.plaid.internal.O7 o7, kotlin.coroutines.jvm.internal.ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.c = o7;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.a(this);
    }
}
