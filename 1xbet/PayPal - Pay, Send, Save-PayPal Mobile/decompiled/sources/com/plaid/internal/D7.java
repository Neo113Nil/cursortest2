package com.plaid.internal;

@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.plaid.internal.workflow.di.WebviewBackgroundTransparencyStore", f = "WebviewBackgroundTransparencyStore.kt", i = {}, l = {27}, m = "readWebviewBackgroundTransparencyState", n = {}, s = {})
/* loaded from: classes16.dex */
public final class D7 extends kotlin.coroutines.jvm.internal.ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f5773a;
    public final /* synthetic */ com.plaid.internal.E7 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D7(com.plaid.internal.E7 e7, kotlin.coroutines.jvm.internal.ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.b = e7;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f5773a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.a(this);
    }
}
