package com.plaid.internal;

@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.plaid.internal.views.EmbeddedUrlService", f = "EmbeddedUrlService.kt", i = {}, l = {35}, m = "fetchEmbeddedUrlFromWorkflowStart-gIAlu-s$link_sdk_release", n = {}, s = {})
/* loaded from: classes16.dex */
public final class O0 extends kotlin.coroutines.jvm.internal.ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f5867a;
    public final /* synthetic */ com.plaid.internal.P0 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public O0(com.plaid.internal.P0 p0, kotlin.coroutines.jvm.internal.ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.b = p0;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f5867a = obj;
        this.c |= Integer.MIN_VALUE;
        java.lang.Object a2 = this.b.a(null, this);
        return a2 == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? a2 : kotlin.Result.m23435boximpl(a2);
    }
}
