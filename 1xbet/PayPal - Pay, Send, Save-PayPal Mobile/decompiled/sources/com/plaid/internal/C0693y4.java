package com.plaid.internal;

/* renamed from: com.plaid.internal.y4, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C0693y4 extends com.plaid.internal.G {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f6629a;
    public final /* synthetic */ com.plaid.internal.C0702z4 b;

    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.plaid.internal.workflow.webview.OutOfProcessWebviewViewModel$linkResultCallback$1$onNoResultFromChannel$1", f = "OutOfProcessWebviewViewModel.kt", i = {1}, l = {93, 95}, m = "invokeSuspend", n = {"it"}, s = {"L$1"})
    /* renamed from: com.plaid.internal.y4$a */
    public static final class a extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {

        /* renamed from: a, reason: collision with root package name */
        public com.plaid.internal.C0702z4 f6630a;
        public com.plaid.link.result.LinkResult b;
        public int c;
        public final /* synthetic */ com.plaid.internal.C0702z4 d;
        public final /* synthetic */ com.plaid.internal.C0693y4 e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(com.plaid.internal.C0702z4 c0702z4, com.plaid.internal.C0693y4 c0693y4, kotlin.coroutines.Continuation<? super com.plaid.internal.C0693y4.a> continuation) {
            super(2, continuation);
            this.d = c0702z4;
            this.e = c0693y4;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            return new com.plaid.internal.C0693y4.a(this.d, this.e, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return new com.plaid.internal.C0693y4.a(this.d, this.e, continuation).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:21:0x002d, code lost:
        
            if (r10 != r0) goto L12;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            com.plaid.internal.C0702z4 c0702z4;
            com.plaid.link.result.LinkResult linkResult;
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.c;
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                com.plaid.internal.C0702z4 c0702z42 = this.d;
                this.c = 1;
                obj = com.plaid.internal.C0702z4.b(c0702z42, this);
            } else {
                if (i != 1) {
                    if (i != 2) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    linkResult = this.b;
                    c0702z4 = this.f6630a;
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.plaid.internal.C0702z4.a(c0702z4, linkResult);
                    return kotlin.Unit.INSTANCE;
                }
                kotlin.ResultKt.throwOnFailure(obj);
            }
            com.plaid.link.result.LinkResult linkResult2 = (com.plaid.link.result.LinkResult) obj;
            if (linkResult2 == null) {
                com.plaid.internal.C0452a6.a aVar = com.plaid.internal.C0452a6.f5996a;
                com.plaid.internal.C0452a6.a.a("Link Exit -- no LinkResult from polling and no preCompletionResult.", true);
                com.plaid.internal.C0702z4.a(this.d, new com.plaid.link.result.LinkExit(null, new com.plaid.link.result.LinkExitMetadata(null, null, this.e.b(), null, null, 27, null)));
                return kotlin.Unit.INSTANCE;
            }
            c0702z4 = this.d;
            com.plaid.internal.C0452a6.a aVar2 = com.plaid.internal.C0452a6.f5996a;
            com.plaid.internal.C0452a6.a.a("The preCompletionResult is: ".concat(java.lang.String.valueOf(linkResult2)), true);
            com.plaid.internal.I7 b = c0702z4.b();
            this.f6630a = c0702z4;
            this.b = linkResult2;
            this.c = 2;
            if (b.b(this) != coroutine_suspended) {
                linkResult = linkResult2;
                com.plaid.internal.C0702z4.a(c0702z4, linkResult);
                return kotlin.Unit.INSTANCE;
            }
            return coroutine_suspended;
        }
    }

    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.plaid.internal.workflow.webview.OutOfProcessWebviewViewModel$linkResultCallback$1$onPreCompletionResult$1", f = "OutOfProcessWebviewViewModel.kt", i = {}, l = {74}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.plaid.internal.y4$b */
    public static final class b extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f6631a;
        public final /* synthetic */ com.plaid.internal.C0702z4 b;
        public final /* synthetic */ com.plaid.internal.core.protos.link.channel.Channel$Message.SDKResult c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(com.plaid.internal.C0702z4 c0702z4, com.plaid.internal.core.protos.link.channel.Channel$Message.SDKResult sDKResult, kotlin.coroutines.Continuation<? super com.plaid.internal.C0693y4.b> continuation) {
            super(2, continuation);
            this.b = c0702z4;
            this.c = sDKResult;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            return new com.plaid.internal.C0693y4.b(this.b, this.c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return new com.plaid.internal.C0693y4.b(this.b, this.c, continuation).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f6631a;
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                com.plaid.internal.C0702z4 c0702z4 = this.b;
                com.plaid.internal.core.protos.link.channel.Channel$Message.SDKResult sDKResult = this.c;
                this.f6631a = 1;
                com.plaid.internal.z8 z8Var = c0702z4.f;
                if (z8Var == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
                    z8Var = null;
                }
                java.lang.Object a2 = z8Var.a(sDKResult, this);
                if (a2 != kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    a2 = kotlin.Unit.INSTANCE;
                }
                if (a2 == coroutine_suspended) {
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

    public C0693y4(com.plaid.internal.C0702z4 c0702z4) {
        this.b = c0702z4;
    }

    @Override // com.plaid.internal.G
    public final void a(com.plaid.internal.core.protos.link.channel.Channel$Message.SDKResult sDKResult) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sDKResult, "");
        com.plaid.internal.C0452a6.a aVar = com.plaid.internal.C0452a6.f5996a;
        com.plaid.internal.C0452a6.a.a("Pre Completion Result: ".concat(java.lang.String.valueOf(sDKResult)), true);
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(this.b), null, null, new com.plaid.internal.C0693y4.b(this.b, sDKResult, null), 3, null);
    }

    public final java.lang.String b() {
        return this.f6629a;
    }

    @Override // com.plaid.internal.G
    public final void a(com.plaid.link.result.LinkResult linkResult) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(linkResult, "");
        com.plaid.internal.C0452a6.a aVar = com.plaid.internal.C0452a6.f5996a;
        com.plaid.internal.C0452a6.a.a("Link Result from polling: ".concat(java.lang.String.valueOf(linkResult)), true);
        com.plaid.internal.C0702z4.a(this.b, linkResult);
    }

    @Override // com.plaid.internal.G
    public final void a(com.plaid.link.event.LinkEvent linkEvent, com.plaid.internal.I2.d dVar) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(linkEvent, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dVar, "");
        com.plaid.internal.C0452a6.a aVar = com.plaid.internal.C0452a6.f5996a;
        com.plaid.internal.C0452a6.a.a("Link Event from polling: ".concat(java.lang.String.valueOf(linkEvent)), true);
        if (this.f6629a == null) {
            this.f6629a = linkEvent.getMetadata().getLinkSessionId();
        }
        kotlin.jvm.functions.Function2<com.plaid.link.event.LinkEvent, com.plaid.internal.I2, kotlin.Unit> linkEventListenerInternal$link_sdk_release = com.plaid.link.Plaid.INSTANCE.getLinkEventListenerInternal$link_sdk_release();
        if (linkEventListenerInternal$link_sdk_release != null) {
            linkEventListenerInternal$link_sdk_release.invoke(linkEvent, dVar);
        }
    }

    @Override // com.plaid.internal.G
    public final void a() {
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(this.b), null, null, new com.plaid.internal.C0693y4.a(this.b, this, null), 3, null);
    }
}
