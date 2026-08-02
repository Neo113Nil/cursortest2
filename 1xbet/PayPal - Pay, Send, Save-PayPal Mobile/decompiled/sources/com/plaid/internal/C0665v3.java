package com.plaid.internal;

@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.plaid.internal.workflow.LinkWorkflowAnalytics$trackEvent$1", f = "LinkWorkflowAnalytics.kt", i = {}, l = {145}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: com.plaid.internal.v3, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C0665v3 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {

    /* renamed from: a, reason: collision with root package name */
    public int f6596a;
    public final /* synthetic */ com.plaid.internal.C0683x3 b;
    public final /* synthetic */ java.lang.String c;
    public final /* synthetic */ com.plaid.internal.core.protos.link.api.ClientEventOuterClass$ClientEvent d;

    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.plaid.internal.workflow.LinkWorkflowAnalytics$trackEvent$1$1", f = "LinkWorkflowAnalytics.kt", i = {0}, l = {150}, m = "invokeSuspend", n = {"request"}, s = {"L$0"})
    /* renamed from: com.plaid.internal.v3$a */
    public static final class a extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {

        /* renamed from: a, reason: collision with root package name */
        public com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowEventRequest f6597a;
        public int b;
        public final /* synthetic */ com.plaid.internal.C0683x3 c;
        public final /* synthetic */ java.lang.String d;
        public final /* synthetic */ com.plaid.internal.core.protos.link.api.ClientEventOuterClass$ClientEvent e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(com.plaid.internal.C0683x3 c0683x3, java.lang.String str, com.plaid.internal.core.protos.link.api.ClientEventOuterClass$ClientEvent clientEventOuterClass$ClientEvent, kotlin.coroutines.Continuation<? super com.plaid.internal.C0665v3.a> continuation) {
            super(2, continuation);
            this.c = c0683x3;
            this.d = str;
            this.e = clientEventOuterClass$ClientEvent;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            return new com.plaid.internal.C0665v3.a(this.c, this.d, this.e, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((com.plaid.internal.C0665v3.a) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            com.plaid.internal.i8 i8Var;
            com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowEventRequest workflow$LinkWorkflowEventRequest;
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.b;
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowEventRequest.a newBuilder = com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowEventRequest.newBuilder();
                java.lang.String str = this.d;
                com.plaid.internal.core.protos.link.api.ClientEventOuterClass$ClientEvent clientEventOuterClass$ClientEvent = this.e;
                newBuilder.a(str);
                newBuilder.a(clientEventOuterClass$ClientEvent).build();
                com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowEventRequest build = newBuilder.build();
                i8Var = this.c.f6622a;
                kotlin.jvm.internal.Intrinsics.checkNotNull(build);
                this.f6597a = build;
                this.b = 1;
                java.lang.Object a2 = i8Var.a(build, this);
                if (a2 == coroutine_suspended) {
                    return coroutine_suspended;
                }
                workflow$LinkWorkflowEventRequest = build;
                obj = a2;
            } else {
                if (i != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                workflow$LinkWorkflowEventRequest = this.f6597a;
                kotlin.ResultKt.throwOnFailure(obj);
            }
            if (((com.plaid.internal.AbstractC0550i4) obj) instanceof com.plaid.internal.AbstractC0550i4.c) {
                com.plaid.internal.C0452a6.a aVar = com.plaid.internal.C0452a6.f5996a;
                com.plaid.internal.C0452a6.a.a("Event sent: ".concat(java.lang.String.valueOf(workflow$LinkWorkflowEventRequest)), true);
            } else {
                com.plaid.internal.C0452a6.a.b(com.plaid.internal.C0452a6.f5996a, "Error sending event ".concat(java.lang.String.valueOf(workflow$LinkWorkflowEventRequest)));
            }
            return kotlin.Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0665v3(com.plaid.internal.C0683x3 c0683x3, java.lang.String str, com.plaid.internal.core.protos.link.api.ClientEventOuterClass$ClientEvent clientEventOuterClass$ClientEvent, kotlin.coroutines.Continuation<? super com.plaid.internal.C0665v3> continuation) {
        super(2, continuation);
        this.b = c0683x3;
        this.c = str;
        this.d = clientEventOuterClass$ClientEvent;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.plaid.internal.C0665v3(this.b, this.c, this.d, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.plaid.internal.C0665v3) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f6596a;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.plaid.internal.C0683x3 c0683x3 = this.b;
            kotlinx.coroutines.CoroutineDispatcher coroutineDispatcher = c0683x3.c;
            com.plaid.internal.C0665v3.a aVar = new com.plaid.internal.C0665v3.a(c0683x3, this.c, this.d, null);
            this.f6596a = 1;
            if (kotlinx.coroutines.BuildersKt.withContext(coroutineDispatcher, aVar, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return kotlin.Unit.INSTANCE;
    }
}
