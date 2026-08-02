package com.plaid.internal;

@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.plaid.internal.workflow.LinkStateReducer", f = "LinkStateReducer.kt", i = {0, 0, 0, 0}, l = {132, 147, 161}, m = "callWorkflowStart", n = {"this", "workflowId", "linkOpenId", "oauthNonce"}, s = {"L$0", "L$1", "L$2", "L$3"})
/* loaded from: classes16.dex */
public final class P2 extends kotlin.coroutines.jvm.internal.ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public com.plaid.internal.Y2 f5877a;
    public java.lang.String b;
    public java.lang.String c;
    public java.lang.String d;
    public /* synthetic */ java.lang.Object e;
    public final /* synthetic */ com.plaid.internal.Y2 f;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public P2(com.plaid.internal.Y2 y2, kotlin.coroutines.jvm.internal.ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f = y2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.e = obj;
        this.g |= Integer.MIN_VALUE;
        return this.f.a((com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartRequest) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, this);
    }
}
