package com.plaid.internal;

@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.plaid.internal.workflow.LinkStateReducer", f = "LinkStateReducer.kt", i = {0, 0, 0, 2, 2, 2, 2, 2}, l = {346, 351, 358, 385}, m = "previous", n = {"this", "state", "currentPaneId", "this", "state", "currentPaneId", "backstack", "lastPaneId"}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$3", "L$4"})
/* loaded from: classes16.dex */
public final class V2 extends kotlin.coroutines.jvm.internal.ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public com.plaid.internal.Y2 f5950a;
    public com.plaid.internal.N2 b;
    public com.plaid.internal.r8 c;
    public java.util.List d;
    public com.plaid.internal.r8 e;
    public /* synthetic */ java.lang.Object f;
    public final /* synthetic */ com.plaid.internal.Y2 g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public V2(com.plaid.internal.Y2 y2, kotlin.coroutines.jvm.internal.ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.g = y2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f = obj;
        this.h |= Integer.MIN_VALUE;
        return this.g.b(null, this);
    }
}
