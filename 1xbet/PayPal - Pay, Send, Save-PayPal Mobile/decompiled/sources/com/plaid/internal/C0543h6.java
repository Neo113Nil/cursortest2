package com.plaid.internal;

@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.plaid.internal.workflow.preload.PreloadLinkController$preloadWebview$2", f = "PreloadLinkController.kt", i = {}, l = {101}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: com.plaid.internal.h6, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C0543h6 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {

    /* renamed from: a, reason: collision with root package name */
    public int f6430a;
    public /* synthetic */ java.lang.Object b;
    public final /* synthetic */ com.plaid.internal.C0570k6 c;
    public final /* synthetic */ java.lang.String d;
    public final /* synthetic */ com.plaid.link.OnLoadCallback e;

    /* renamed from: com.plaid.internal.h6$a */
    public static final class a extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function0<kotlin.Unit> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ com.plaid.link.OnLoadCallback f6431a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(com.plaid.link.OnLoadCallback onLoadCallback) {
            super(0);
            this.f6431a = onLoadCallback;
        }

        @Override // kotlin.jvm.functions.Function0
        public final kotlin.Unit invoke() {
            com.plaid.link.OnLoadCallback onLoadCallback = this.f6431a;
            if (onLoadCallback != null) {
                onLoadCallback.onLoad();
            }
            return kotlin.Unit.INSTANCE;
        }
    }

    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.plaid.internal.workflow.preload.PreloadLinkController$preloadWebview$2$2", f = "PreloadLinkController.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.plaid.internal.h6$b */
    public static final class b extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ com.plaid.internal.C0570k6 f6432a;
        public final /* synthetic */ com.plaid.internal.P5 b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(com.plaid.internal.C0570k6 c0570k6, com.plaid.internal.P5 p5, kotlin.coroutines.Continuation<? super com.plaid.internal.C0543h6.b> continuation) {
            super(2, continuation);
            this.f6432a = c0570k6;
            this.b = p5;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            return new com.plaid.internal.C0543h6.b(this.f6432a, this.b, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return new com.plaid.internal.C0543h6.b(this.f6432a, this.b, continuation).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            kotlin.ResultKt.throwOnFailure(obj);
            com.plaid.link.SubmissionData submissionData = this.f6432a.g;
            if (submissionData == null) {
                return null;
            }
            this.b.a(submissionData.getPhoneNumber(), submissionData.getDateOfBirth(), submissionData.getParams());
            return kotlin.Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0543h6(com.plaid.internal.C0570k6 c0570k6, java.lang.String str, com.plaid.link.OnLoadCallback onLoadCallback, kotlin.coroutines.Continuation<? super com.plaid.internal.C0543h6> continuation) {
        super(2, continuation);
        this.c = c0570k6;
        this.d = str;
        this.e = onLoadCallback;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        com.plaid.internal.C0543h6 c0543h6 = new com.plaid.internal.C0543h6(this.c, this.d, this.e, continuation);
        c0543h6.b = obj;
        return c0543h6;
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.plaid.internal.C0543h6) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f6430a;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.CoroutineScope coroutineScope = (kotlinx.coroutines.CoroutineScope) this.b;
            if (!kotlinx.coroutines.JobKt.isActive(coroutineScope.getCoroutineContext())) {
                return kotlin.Unit.INSTANCE;
            }
            com.plaid.internal.P5 b2 = this.c.c.b();
            if (!kotlinx.coroutines.JobKt.isActive(coroutineScope.getCoroutineContext())) {
                return kotlin.Unit.INSTANCE;
            }
            com.plaid.internal.C0570k6 c0570k6 = this.c;
            com.plaid.internal.C0588m6 c0588m6 = c0570k6.e;
            com.plaid.internal.L7 l7 = c0570k6.f;
            java.lang.String str = this.d;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(c0588m6, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            com.plaid.internal.C0505d4 c0505d4 = b2.f5879a;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(c0588m6, "");
            c0505d4.f6392a = c0588m6;
            b2.loadUrl(str);
            b2.a(new com.plaid.internal.C0543h6.a(this.e));
            kotlinx.coroutines.CoroutineDispatcher io2 = kotlinx.coroutines.Dispatchers.getIO();
            com.plaid.internal.C0543h6.b bVar = new com.plaid.internal.C0543h6.b(this.c, b2, null);
            this.f6430a = 1;
            if (kotlinx.coroutines.BuildersKt.withContext(io2, bVar, this) == coroutine_suspended) {
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
