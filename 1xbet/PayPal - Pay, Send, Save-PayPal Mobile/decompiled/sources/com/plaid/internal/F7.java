package com.plaid.internal;

@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.plaid.internal.workflow.webview.WebviewFallbackAnalytics", f = "WebviewFallbackAnalytics.kt", i = {0}, l = {31}, m = "trackWebviewFallbackCancel$link_sdk_release", n = {"this"}, s = {"L$0"})
/* loaded from: classes16.dex */
public final class F7 extends kotlin.coroutines.jvm.internal.ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public com.plaid.internal.I7 f5790a;
    public /* synthetic */ java.lang.Object b;
    public final /* synthetic */ com.plaid.internal.I7 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public F7(com.plaid.internal.I7 i7, kotlin.coroutines.jvm.internal.ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.c = i7;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.a(this);
    }
}
