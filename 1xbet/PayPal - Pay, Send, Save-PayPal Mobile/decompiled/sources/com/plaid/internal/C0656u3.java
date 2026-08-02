package com.plaid.internal;

@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.plaid.internal.workflow.LinkWorkflowAnalytics", f = "LinkWorkflowAnalytics.kt", i = {0, 1, 1, 2}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_SWITCH_IDENTITY_DARK_APPEARANCE_VALUE, 185, 187}, m = "sendAllAnalyticsEventsToServer", n = {"this", "this", "it", "this"}, s = {"L$0", "L$0", "L$2", "L$0"})
/* renamed from: com.plaid.internal.u3, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C0656u3 extends kotlin.coroutines.jvm.internal.ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public com.plaid.internal.C0683x3 f6588a;
    public java.util.Iterator b;
    public com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowEventRequest c;
    public /* synthetic */ java.lang.Object d;
    public final /* synthetic */ com.plaid.internal.C0683x3 e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0656u3(com.plaid.internal.C0683x3 c0683x3, kotlin.coroutines.jvm.internal.ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.e = c0683x3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return com.plaid.internal.C0683x3.a(this.e, this);
    }
}
