package com.plaid.internal;

@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.plaid.internal.workflow.LinkStateReducer", f = "LinkStateReducer.kt", i = {0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1}, l = {489, 491}, m = "handleSuccess", n = {"this", "linkOpenId", "workflowId", "continuationToken", "oauthNonce", "nextPane", "additionalPanes", "backstack", "requestId", "this", "linkOpenId", "workflowId", "continuationToken", "oauthNonce", "nextPane", "additionalPanes", "backstack", "requestId"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8"})
/* loaded from: classes16.dex */
public final class S2 extends kotlin.coroutines.jvm.internal.ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public com.plaid.internal.Y2 f5917a;
    public java.lang.String b;
    public java.lang.String c;
    public java.lang.String d;
    public java.lang.String e;
    public com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneRendering f;
    public java.util.List g;
    public java.util.List h;
    public java.lang.String i;
    public java.util.Iterator j;
    public /* synthetic */ java.lang.Object k;
    public final /* synthetic */ com.plaid.internal.Y2 l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public S2(com.plaid.internal.Y2 y2, kotlin.coroutines.jvm.internal.ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.l = y2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.a(null, null, null, null, null, null, null, null, this);
    }
}
