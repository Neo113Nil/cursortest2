package com.moloco.sdk.internal.utils;

/* loaded from: classes5.dex */
public final class a {

    /* JADX INFO: Add missing generic type declarations: [T] */
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.moloco.sdk.internal.utils.CoroutineUtilsKt$withReentrantLock$2", f = "CoroutineUtils.kt", i = {0, 1}, l = {54, 37}, m = "invokeSuspend", n = {"$this$withLock_u24default$iv", "$this$withLock_u24default$iv"}, s = {"L$0", "L$0"})
    /* renamed from: com.moloco.sdk.internal.utils.a$a, reason: collision with other inner class name */
    public static final class C0210a<T> extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super T>, java.lang.Object> {

        /* renamed from: a, reason: collision with root package name */
        public java.lang.Object f7332a;
        public java.lang.Object b;
        public int c;
        public final /* synthetic */ kotlinx.coroutines.sync.Mutex d;
        public final /* synthetic */ kotlin.jvm.functions.Function1<kotlin.coroutines.Continuation<? super T>, java.lang.Object> e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C0210a(kotlinx.coroutines.sync.Mutex mutex, kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<? super T>, ? extends java.lang.Object> function1, kotlin.coroutines.Continuation<? super com.moloco.sdk.internal.utils.a.C0210a> continuation) {
            super(2, continuation);
            this.d = mutex;
            this.e = function1;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super T> continuation) {
            return ((com.moloco.sdk.internal.utils.a.C0210a) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            return new com.moloco.sdk.internal.utils.a.C0210a(this.d, this.e, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            kotlinx.coroutines.sync.Mutex mutex;
            kotlin.jvm.functions.Function1<kotlin.coroutines.Continuation<? super T>, java.lang.Object> function1;
            kotlinx.coroutines.sync.Mutex mutex2;
            java.lang.Throwable th;
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.c;
            try {
                if (i == 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    mutex = this.d;
                    function1 = this.e;
                    this.f7332a = mutex;
                    this.b = function1;
                    this.c = 1;
                    if (mutex.lock(null, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        mutex2 = (kotlinx.coroutines.sync.Mutex) this.f7332a;
                        try {
                            kotlin.ResultKt.throwOnFailure(obj);
                            mutex2.unlock(null);
                            return obj;
                        } catch (java.lang.Throwable th2) {
                            th = th2;
                            mutex2.unlock(null);
                            throw th;
                        }
                    }
                    function1 = (kotlin.jvm.functions.Function1) this.b;
                    kotlinx.coroutines.sync.Mutex mutex3 = (kotlinx.coroutines.sync.Mutex) this.f7332a;
                    kotlin.ResultKt.throwOnFailure(obj);
                    mutex = mutex3;
                }
                this.f7332a = mutex;
                this.b = null;
                this.c = 2;
                java.lang.Object invoke = function1.invoke(this);
                if (invoke == coroutine_suspended) {
                    return coroutine_suspended;
                }
                mutex2 = mutex;
                obj = invoke;
                mutex2.unlock(null);
                return obj;
            } catch (java.lang.Throwable th3) {
                mutex2 = mutex;
                th = th3;
                mutex2.unlock(null);
                throw th;
            }
        }
    }

    public static /* synthetic */ void a(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.CoroutineContext context, kotlinx.coroutines.CoroutineStart start, kotlin.jvm.functions.Function2 block, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            context = kotlin.coroutines.EmptyCoroutineContext.INSTANCE;
        }
        if ((i & 2) != 0) {
            start = kotlinx.coroutines.CoroutineStart.DEFAULT;
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineScope, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(start, "start");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(block, "block");
        kotlinx.coroutines.BuildersKt.launch(coroutineScope, context, start, block);
    }

    public static final void a(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.CoroutineContext context, kotlinx.coroutines.CoroutineStart start, kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> block) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineScope, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(start, "start");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(block, "block");
        kotlinx.coroutines.BuildersKt.launch(coroutineScope, context, start, block);
    }

    public static final <T> java.lang.Object a(kotlinx.coroutines.sync.Mutex mutex, kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<? super T>, ? extends java.lang.Object> function1, kotlin.coroutines.Continuation<? super T> continuation) {
        com.moloco.sdk.internal.utils.d dVar = new com.moloco.sdk.internal.utils.d(mutex);
        return continuation.getContext().get(dVar) != null ? function1.invoke(continuation) : kotlinx.coroutines.BuildersKt.withContext(new com.moloco.sdk.internal.utils.c(dVar), new com.moloco.sdk.internal.utils.a.C0210a(mutex, function1, null), continuation);
    }
}
