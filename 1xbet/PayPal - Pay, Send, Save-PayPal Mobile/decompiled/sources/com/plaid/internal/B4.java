package com.plaid.internal;

@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.plaid.internal.workflow.webview.OutOfProcessWebviewViewModel", f = "OutOfProcessWebviewViewModel.kt", i = {0, 1}, l = {125, 127}, m = "readPendingResult", n = {"this", "linkResult"}, s = {"L$0", "L$0"})
/* loaded from: classes16.dex */
public final class B4 extends kotlin.coroutines.jvm.internal.ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.Object f5757a;
    public /* synthetic */ java.lang.Object b;
    public final /* synthetic */ com.plaid.internal.C0702z4 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B4(com.plaid.internal.C0702z4 c0702z4, kotlin.coroutines.jvm.internal.ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.c = c0702z4;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return com.plaid.internal.C0702z4.b(this.c, this);
    }
}
