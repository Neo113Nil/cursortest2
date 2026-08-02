package com.plaid.internal;

@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.plaid.internal.workflow.LinkStateReducer$next$networkResponse$1", f = "LinkStateReducer.kt", i = {}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_USER_BRUSHSTROKE_VALUE}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes16.dex */
public final class U2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function1<kotlin.coroutines.Continuation<? super com.plaid.internal.AbstractC0550i4<? extends com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowNextResponse, ? extends java.lang.Object>>, java.lang.Object> {

    /* renamed from: a, reason: collision with root package name */
    public int f5934a;
    public final /* synthetic */ com.plaid.internal.Y2 b;
    public final /* synthetic */ com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowNextRequest c;

    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.plaid.internal.workflow.LinkStateReducer$next$networkResponse$1$1", f = "LinkStateReducer.kt", i = {}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_ACCOUNT_BRUSHSTROKE_VALUE}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super com.plaid.internal.AbstractC0550i4<? extends com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowNextResponse, ? extends java.lang.Object>>, java.lang.Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f5935a;
        public final /* synthetic */ com.plaid.internal.Y2 b;
        public final /* synthetic */ com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowNextRequest c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(com.plaid.internal.Y2 y2, com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowNextRequest workflow$LinkWorkflowNextRequest, kotlin.coroutines.Continuation<? super com.plaid.internal.U2.a> continuation) {
            super(2, continuation);
            this.b = y2;
            this.c = workflow$LinkWorkflowNextRequest;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            return new com.plaid.internal.U2.a(this.b, this.c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super com.plaid.internal.AbstractC0550i4<? extends com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowNextResponse, ? extends java.lang.Object>> continuation) {
            return new com.plaid.internal.U2.a(this.b, this.c, continuation).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f5935a;
            if (i != 0) {
                if (i != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
                return obj;
            }
            kotlin.ResultKt.throwOnFailure(obj);
            com.plaid.internal.i8 i8Var = this.b.f5979a;
            com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowNextRequest workflow$LinkWorkflowNextRequest = this.c;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(workflow$LinkWorkflowNextRequest, "");
            this.f5935a = 1;
            java.lang.Object a2 = i8Var.a(workflow$LinkWorkflowNextRequest, this);
            return a2 == coroutine_suspended ? coroutine_suspended : a2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public U2(com.plaid.internal.Y2 y2, com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowNextRequest workflow$LinkWorkflowNextRequest, kotlin.coroutines.Continuation<? super com.plaid.internal.U2> continuation) {
        super(1, continuation);
        this.b = y2;
        this.c = workflow$LinkWorkflowNextRequest;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(kotlin.coroutines.Continuation<?> continuation) {
        return new com.plaid.internal.U2(this.b, this.c, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final java.lang.Object invoke(kotlin.coroutines.Continuation<? super com.plaid.internal.AbstractC0550i4<? extends com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowNextResponse, ? extends java.lang.Object>> continuation) {
        return new com.plaid.internal.U2(this.b, this.c, continuation).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f5934a;
        if (i != 0) {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            return obj;
        }
        kotlin.ResultKt.throwOnFailure(obj);
        kotlinx.coroutines.CoroutineDispatcher io2 = kotlinx.coroutines.Dispatchers.getIO();
        com.plaid.internal.U2.a aVar = new com.plaid.internal.U2.a(this.b, this.c, null);
        this.f5934a = 1;
        java.lang.Object withContext = kotlinx.coroutines.BuildersKt.withContext(io2, aVar, this);
        return withContext == coroutine_suspended ? coroutine_suspended : withContext;
    }
}
