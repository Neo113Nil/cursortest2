package com.moloco.sdk.internal.error.crash;

/* loaded from: classes5.dex */
public final class b implements com.moloco.sdk.internal.error.crash.a {
    public static final int c = 8;

    /* renamed from: a, reason: collision with root package name */
    public final com.moloco.sdk.internal.error.crash.c f6958a;
    public java.lang.Thread.UncaughtExceptionHandler b;

    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.moloco.sdk.internal.error.crash.CrashDetectorServiceImpl$register$2", f = "CrashDetectorService.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f6959a;

        public a(kotlin.coroutines.Continuation<? super com.moloco.sdk.internal.error.crash.b.a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((com.moloco.sdk.internal.error.crash.b.a) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            return com.moloco.sdk.internal.error.crash.b.this.new a(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f6959a != 0) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            if (com.moloco.sdk.internal.error.crash.b.this.b == null) {
                com.moloco.sdk.internal.error.crash.b.this.b = java.lang.Thread.getDefaultUncaughtExceptionHandler();
                final com.moloco.sdk.internal.error.crash.b bVar = com.moloco.sdk.internal.error.crash.b.this;
                java.lang.Thread.setDefaultUncaughtExceptionHandler(new java.lang.Thread.UncaughtExceptionHandler() { // from class: com.moloco.sdk.internal.error.crash.b$a$$ExternalSyntheticLambda0
                    @Override // java.lang.Thread.UncaughtExceptionHandler
                    public final void uncaughtException(java.lang.Thread thread, java.lang.Throwable th) {
                        com.moloco.sdk.internal.error.crash.b.a.a(com.moloco.sdk.internal.error.crash.b.this, thread, th);
                    }
                });
            }
            return kotlin.Unit.INSTANCE;
        }

        public static final void a(com.moloco.sdk.internal.error.crash.b bVar, java.lang.Thread thread, java.lang.Throwable th) {
            com.moloco.sdk.internal.error.crash.c cVar = bVar.f6958a;
            kotlin.jvm.internal.Intrinsics.checkNotNull(th);
            cVar.a(th);
            java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler = bVar.b;
            if (uncaughtExceptionHandler != null) {
                uncaughtExceptionHandler.uncaughtException(thread, th);
            } else {
                java.lang.System.exit(2);
                throw new java.lang.RuntimeException("System.exit returned normally, while it was supposed to halt JVM.");
            }
        }
    }

    public b(com.moloco.sdk.internal.error.crash.c crashHandler) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(crashHandler, "crashHandler");
        this.f6958a = crashHandler;
    }

    @Override // com.moloco.sdk.internal.error.crash.a
    public java.lang.Object a(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object withContext = kotlinx.coroutines.BuildersKt.withContext(com.moloco.sdk.internal.scheduling.b.a().getMain(), new com.moloco.sdk.internal.error.crash.b.a(null), continuation);
        return withContext == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? withContext : kotlin.Unit.INSTANCE;
    }
}
