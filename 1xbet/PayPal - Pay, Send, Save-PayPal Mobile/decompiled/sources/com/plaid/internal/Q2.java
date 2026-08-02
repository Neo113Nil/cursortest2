package com.plaid.internal;

@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.plaid.internal.workflow.LinkStateReducer$callWorkflowStart$networkResponse$1", f = "LinkStateReducer.kt", i = {}, l = {132}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes16.dex */
public final class Q2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super com.plaid.internal.AbstractC0550i4<? extends com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartResponse, ? extends java.lang.Object>>, java.lang.Object> {

    /* renamed from: a, reason: collision with root package name */
    public int f5898a;
    public final /* synthetic */ com.plaid.internal.Y2 b;
    public final /* synthetic */ com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartRequest c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Q2(com.plaid.internal.Y2 y2, com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartRequest workflow$LinkWorkflowStartRequest, kotlin.coroutines.Continuation<? super com.plaid.internal.Q2> continuation) {
        super(2, continuation);
        this.b = y2;
        this.c = workflow$LinkWorkflowStartRequest;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.plaid.internal.Q2(this.b, this.c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super com.plaid.internal.AbstractC0550i4<? extends com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartResponse, ? extends java.lang.Object>> continuation) {
        return new com.plaid.internal.Q2(this.b, this.c, continuation).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f5898a;
        if (i != 0) {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            return obj;
        }
        kotlin.ResultKt.throwOnFailure(obj);
        com.plaid.internal.i8 i8Var = this.b.f5979a;
        com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartRequest workflow$LinkWorkflowStartRequest = this.c;
        this.f5898a = 1;
        java.lang.Object a2 = i8Var.a(workflow$LinkWorkflowStartRequest, this);
        return a2 == coroutine_suspended ? coroutine_suspended : a2;
    }
}
