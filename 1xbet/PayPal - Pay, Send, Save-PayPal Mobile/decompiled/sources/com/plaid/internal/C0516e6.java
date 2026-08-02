package com.plaid.internal;

@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.plaid.internal.workflow.preload.PreloadLinkController", f = "PreloadLinkController.kt", i = {0, 0}, l = {57, 65, 70, 72}, m = "maybePreloadLink", n = {"this", "onLoad"}, s = {"L$0", "L$1"})
/* renamed from: com.plaid.internal.e6, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C0516e6 extends kotlin.coroutines.jvm.internal.ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public com.plaid.internal.C0570k6 f6403a;
    public com.plaid.link.OnLoadCallback b;
    public /* synthetic */ java.lang.Object c;
    public final /* synthetic */ com.plaid.internal.C0570k6 d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0516e6(com.plaid.internal.C0570k6 c0570k6, kotlin.coroutines.jvm.internal.ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.d = c0570k6;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.a(null, this);
    }
}
