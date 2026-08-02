package com.plaid.internal;

@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.plaid.internal.workflow.webview.OutOfProcessWebviewViewModel", f = "OutOfProcessWebviewViewModel.kt", i = {}, l = {107}, m = "getUrlUri", n = {}, s = {})
/* renamed from: com.plaid.internal.x4, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C0684x4 extends kotlin.coroutines.jvm.internal.ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f6623a;
    public final /* synthetic */ com.plaid.internal.C0702z4 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0684x4(com.plaid.internal.C0702z4 c0702z4, kotlin.coroutines.jvm.internal.ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.b = c0702z4;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f6623a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.a(this);
    }
}
