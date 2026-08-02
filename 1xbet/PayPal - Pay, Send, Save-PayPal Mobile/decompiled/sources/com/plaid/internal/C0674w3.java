package com.plaid.internal;

@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.plaid.internal.workflow.LinkWorkflowAnalytics$trackEvents$1", f = "LinkWorkflowAnalytics.kt", i = {}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: com.plaid.internal.w3, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C0674w3 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {

    /* renamed from: a, reason: collision with root package name */
    public int f6607a;
    public final /* synthetic */ com.plaid.internal.C0683x3 b;
    public final /* synthetic */ com.plaid.internal.core.protos.link.api.ClientEventOuterClass$ClientEvent.a c;
    public final /* synthetic */ java.lang.String d;

    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.plaid.internal.workflow.LinkWorkflowAnalytics$trackEvents$1$1", f = "LinkWorkflowAnalytics.kt", i = {}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_HEADER_CARD_COLLECT_VALUE, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_INCOME_PAYROLL_URL_VALUE}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.plaid.internal.w3$a */
    public static final class a extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f6608a;
        public final /* synthetic */ com.plaid.internal.C0683x3 b;
        public final /* synthetic */ com.plaid.internal.core.protos.link.api.ClientEventOuterClass$ClientEvent.a c;
        public final /* synthetic */ java.lang.String d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(com.plaid.internal.C0683x3 c0683x3, com.plaid.internal.core.protos.link.api.ClientEventOuterClass$ClientEvent.a aVar, java.lang.String str, kotlin.coroutines.Continuation<? super com.plaid.internal.C0674w3.a> continuation) {
            super(2, continuation);
            this.b = c0683x3;
            this.c = aVar;
            this.d = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            return new com.plaid.internal.C0674w3.a(this.b, this.c, this.d, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((com.plaid.internal.C0674w3.a) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x0048, code lost:
        
            if (com.plaid.internal.C0683x3.a(r6, r5) == r0) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x0055, code lost:
        
            return r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x003e, code lost:
        
            if (r6.a(r1, r5) != r0) goto L12;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f6608a;
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                com.plaid.internal.A3 a3 = this.b.b;
                com.plaid.internal.core.protos.link.api.ClientEventOuterClass$ClientEvent build = this.c.a(this.d).build();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(build, "");
                this.f6608a = 1;
            } else {
                if (i != 1) {
                    if (i != 2) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.plaid.internal.C0452a6.a aVar = com.plaid.internal.C0452a6.f5996a;
                    com.plaid.internal.C0452a6.a.a("events send", true);
                    return kotlin.Unit.INSTANCE;
                }
                kotlin.ResultKt.throwOnFailure(obj);
            }
            com.plaid.internal.C0683x3 c0683x3 = this.b;
            this.f6608a = 2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0674w3(com.plaid.internal.C0683x3 c0683x3, com.plaid.internal.core.protos.link.api.ClientEventOuterClass$ClientEvent.a aVar, java.lang.String str, kotlin.coroutines.Continuation<? super com.plaid.internal.C0674w3> continuation) {
        super(2, continuation);
        this.b = c0683x3;
        this.c = aVar;
        this.d = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.plaid.internal.C0674w3(this.b, this.c, this.d, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.plaid.internal.C0674w3) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f6607a;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.plaid.internal.C0683x3 c0683x3 = this.b;
            kotlinx.coroutines.CoroutineDispatcher coroutineDispatcher = c0683x3.c;
            com.plaid.internal.C0674w3.a aVar = new com.plaid.internal.C0674w3.a(c0683x3, this.c, this.d, null);
            this.f6607a = 1;
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
