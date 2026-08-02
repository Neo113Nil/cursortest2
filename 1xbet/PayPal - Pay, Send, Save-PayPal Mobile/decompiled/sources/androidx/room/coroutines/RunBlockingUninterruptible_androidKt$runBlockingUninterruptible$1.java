package androidx.room.coroutines;

/* JADX INFO: Add missing generic type declarations: [T] */
@kotlin.Metadata(d1 = {"\u0000\b\n\u0002\b\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "T", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.room.coroutines.RunBlockingUninterruptible_androidKt$runBlockingUninterruptible$1", f = "RunBlockingUninterruptible.android.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class RunBlockingUninterruptible_androidKt$runBlockingUninterruptible$1<T> extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super T>, java.lang.Object> {
    private /* synthetic */ java.lang.Object Camera2StreamConfigurationMap;
    final /* synthetic */ kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super T>, java.lang.Object> getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.getHighSpeedVideoSizes != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        kotlin.coroutines.CoroutineContext.Element element = ((kotlinx.coroutines.CoroutineScope) this.Camera2StreamConfigurationMap).getCoroutineContext().get(kotlin.coroutines.ContinuationInterceptor.INSTANCE);
        kotlin.jvm.internal.Intrinsics.checkNotNull(element);
        kotlin.coroutines.ContinuationInterceptor continuationInterceptor = (kotlin.coroutines.ContinuationInterceptor) element;
        kotlinx.coroutines.CompletableDeferred CompletableDeferred$default = kotlinx.coroutines.CompletableDeferredKt.CompletableDeferred$default(null, 1, null);
        kotlinx.coroutines.BuildersKt.launch(kotlinx.coroutines.GlobalScope.INSTANCE, continuationInterceptor, kotlinx.coroutines.CoroutineStart.UNDISPATCHED, new androidx.room.coroutines.RunBlockingUninterruptible_androidKt$runBlockingUninterruptible$1.AnonymousClass1(CompletableDeferred$default, this.getHighSpeedVideoFpsRangesFor, null));
        while (!CompletableDeferred$default.isCompleted()) {
            try {
                return kotlinx.coroutines.BuildersKt.runBlocking(continuationInterceptor, new androidx.room.coroutines.RunBlockingUninterruptible_androidKt$runBlockingUninterruptible$1.AnonymousClass2(CompletableDeferred$default, null));
            } catch (java.lang.InterruptedException unused) {
            }
        }
        return CompletableDeferred$default.getCompleted();
    }

    @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.room.coroutines.RunBlockingUninterruptible_androidKt$runBlockingUninterruptible$1$1", f = "RunBlockingUninterruptible.android.kt", i = {}, l = {52}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: androidx.room.coroutines.RunBlockingUninterruptible_androidKt$runBlockingUninterruptible$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        private /* synthetic */ java.lang.Object Camera2StreamConfigurationMap;
        final /* synthetic */ kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super T>, java.lang.Object> getHighResolutionOutputSizeshNQ4ISI;
        int getHighSpeedVideoFpsRanges;
        final /* synthetic */ kotlinx.coroutines.CompletableDeferred<T> getHighSpeedVideoSizes;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            kotlinx.coroutines.CompletableDeferred<T> completableDeferred;
            kotlinx.coroutines.CompletableDeferred<T> completableDeferred2;
            java.lang.Object m23436constructorimpl;
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.getHighSpeedVideoFpsRanges;
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                kotlinx.coroutines.CoroutineScope coroutineScope = (kotlinx.coroutines.CoroutineScope) this.Camera2StreamConfigurationMap;
                completableDeferred = this.getHighSpeedVideoSizes;
                kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super T>, java.lang.Object> function2 = this.getHighResolutionOutputSizeshNQ4ISI;
                try {
                    kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                    this.Camera2StreamConfigurationMap = completableDeferred;
                    this.getHighSpeedVideoFpsRanges = 1;
                    obj = function2.invoke(coroutineScope, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    completableDeferred2 = completableDeferred;
                } catch (java.lang.Throwable th) {
                    th = th;
                    kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                    m23436constructorimpl = kotlin.Result.m23436constructorimpl(kotlin.ResultKt.createFailure(th));
                    completableDeferred2 = completableDeferred;
                    kotlinx.coroutines.CompletableDeferredKt.completeWith(completableDeferred2, m23436constructorimpl);
                    return kotlin.Unit.INSTANCE;
                }
            } else {
                if (i != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                completableDeferred2 = (kotlinx.coroutines.CompletableDeferred) this.Camera2StreamConfigurationMap;
                try {
                    kotlin.ResultKt.throwOnFailure(obj);
                } catch (java.lang.Throwable th2) {
                    th = th2;
                    completableDeferred = completableDeferred2;
                    kotlin.Result.Companion companion22 = kotlin.Result.INSTANCE;
                    m23436constructorimpl = kotlin.Result.m23436constructorimpl(kotlin.ResultKt.createFailure(th));
                    completableDeferred2 = completableDeferred;
                    kotlinx.coroutines.CompletableDeferredKt.completeWith(completableDeferred2, m23436constructorimpl);
                    return kotlin.Unit.INSTANCE;
                }
            }
            m23436constructorimpl = kotlin.Result.m23436constructorimpl(obj);
            kotlinx.coroutines.CompletableDeferredKt.completeWith(completableDeferred2, m23436constructorimpl);
            return kotlin.Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((androidx.room.coroutines.RunBlockingUninterruptible_androidKt$runBlockingUninterruptible$1.AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            androidx.room.coroutines.RunBlockingUninterruptible_androidKt$runBlockingUninterruptible$1.AnonymousClass1 anonymousClass1 = new androidx.room.coroutines.RunBlockingUninterruptible_androidKt$runBlockingUninterruptible$1.AnonymousClass1(this.getHighSpeedVideoSizes, this.getHighResolutionOutputSizeshNQ4ISI, continuation);
            anonymousClass1.Camera2StreamConfigurationMap = obj;
            return anonymousClass1;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(kotlinx.coroutines.CompletableDeferred<T> completableDeferred, kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super T>, ? extends java.lang.Object> function2, kotlin.coroutines.Continuation<? super androidx.room.coroutines.RunBlockingUninterruptible_androidKt$runBlockingUninterruptible$1.AnonymousClass1> continuation) {
            super(2, continuation);
            this.getHighSpeedVideoSizes = completableDeferred;
            this.getHighResolutionOutputSizeshNQ4ISI = function2;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\b\n\u0002\b\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "T", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.room.coroutines.RunBlockingUninterruptible_androidKt$runBlockingUninterruptible$1$2", f = "RunBlockingUninterruptible.android.kt", i = {}, l = {58}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: androidx.room.coroutines.RunBlockingUninterruptible_androidKt$runBlockingUninterruptible$1$2, reason: invalid class name */
    static final class AnonymousClass2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super T>, java.lang.Object> {
        final /* synthetic */ kotlinx.coroutines.CompletableDeferred<T> getHighSpeedVideoFpsRanges;
        int getHighSpeedVideoFpsRangesFor;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.getHighSpeedVideoFpsRangesFor;
            if (i != 0) {
                if (i != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
                return obj;
            }
            kotlin.ResultKt.throwOnFailure(obj);
            this.getHighSpeedVideoFpsRangesFor = 1;
            java.lang.Object await = this.getHighSpeedVideoFpsRanges.await(this);
            return await == coroutine_suspended ? coroutine_suspended : await;
        }

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, java.lang.Object obj) {
            return ((androidx.room.coroutines.RunBlockingUninterruptible_androidKt$runBlockingUninterruptible$1.AnonymousClass2) create(coroutineScope, (kotlin.coroutines.Continuation) obj)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            return new androidx.room.coroutines.RunBlockingUninterruptible_androidKt$runBlockingUninterruptible$1.AnonymousClass2(this.getHighSpeedVideoFpsRanges, continuation);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(kotlinx.coroutines.CompletableDeferred<T> completableDeferred, kotlin.coroutines.Continuation<? super androidx.room.coroutines.RunBlockingUninterruptible_androidKt$runBlockingUninterruptible$1.AnonymousClass2> continuation) {
            super(2, continuation);
            this.getHighSpeedVideoFpsRanges = completableDeferred;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, java.lang.Object obj) {
        return ((androidx.room.coroutines.RunBlockingUninterruptible_androidKt$runBlockingUninterruptible$1) create(coroutineScope, (kotlin.coroutines.Continuation) obj)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        androidx.room.coroutines.RunBlockingUninterruptible_androidKt$runBlockingUninterruptible$1 runBlockingUninterruptible_androidKt$runBlockingUninterruptible$1 = new androidx.room.coroutines.RunBlockingUninterruptible_androidKt$runBlockingUninterruptible$1(this.getHighSpeedVideoFpsRangesFor, continuation);
        runBlockingUninterruptible_androidKt$runBlockingUninterruptible$1.Camera2StreamConfigurationMap = obj;
        return runBlockingUninterruptible_androidKt$runBlockingUninterruptible$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    RunBlockingUninterruptible_androidKt$runBlockingUninterruptible$1(kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super T>, ? extends java.lang.Object> function2, kotlin.coroutines.Continuation<? super androidx.room.coroutines.RunBlockingUninterruptible_androidKt$runBlockingUninterruptible$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRangesFor = function2;
    }
}
