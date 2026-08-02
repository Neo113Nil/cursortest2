package androidx.camera.camera2.pipe.core;

/* JADX INFO: Add missing generic type declarations: [T] */
@kotlin.Metadata(d1 = {"\u0000\b\n\u0002\b\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "T", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.camera.camera2.pipe.core.Threads$runBlockingChecked$1", f = "Threads.kt", i = {}, l = {65}, m = "invokeSuspend", n = {}, s = {}, v = 1)
/* loaded from: classes6.dex */
final class Threads$runBlockingChecked$1<T> extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super T>, java.lang.Object> {
    int Camera2StreamConfigurationMap;
    final /* synthetic */ kotlin.jvm.functions.Function1<kotlin.coroutines.Continuation<? super T>, java.lang.Object> getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ androidx.camera.camera2.pipe.core.Threads getHighSpeedVideoFpsRanges;
    final /* synthetic */ long getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.Camera2StreamConfigurationMap;
        try {
            if (i != 0) {
                if (i != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
                return obj;
            }
            kotlin.ResultKt.throwOnFailure(obj);
            androidx.camera.camera2.pipe.core.Threads threads = this.getHighSpeedVideoFpsRanges;
            kotlinx.coroutines.Deferred access$runAsyncSupervised = androidx.camera.camera2.pipe.core.Threads.access$runAsyncSupervised(threads, threads.getBackgroundDispatcher(), this.getHighResolutionOutputSizeshNQ4ISI);
            this.Camera2StreamConfigurationMap = 1;
            java.lang.Object withTimeout = kotlinx.coroutines.TimeoutKt.withTimeout(this.getHighSpeedVideoFpsRangesFor, new androidx.camera.camera2.pipe.core.Threads$runBlockingChecked$1.AnonymousClass1(access$runAsyncSupervised, null), this);
            return withTimeout == coroutine_suspended ? coroutine_suspended : withTimeout;
        } catch (kotlinx.coroutines.TimeoutCancellationException unused) {
            androidx.camera.camera2.pipe.core.Log log = androidx.camera.camera2.pipe.core.Log.INSTANCE;
            kotlin.jvm.functions.Function1<kotlin.coroutines.Continuation<? super T>, java.lang.Object> function1 = this.getHighResolutionOutputSizeshNQ4ISI;
            if (log.getERROR_LOGGABLE()) {
                java.util.Objects.toString(function1);
            }
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Timed out after ");
            sb.append(this.getHighSpeedVideoFpsRangesFor);
            sb.append("ms running ");
            sb.append(this.getHighResolutionOutputSizeshNQ4ISI);
            sb.append('!');
            throw new java.lang.IllegalStateException(sb.toString());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\b\n\u0002\b\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "T", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.camera.camera2.pipe.core.Threads$runBlockingChecked$1$1", f = "Threads.kt", i = {}, l = {65}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    /* renamed from: androidx.camera.camera2.pipe.core.Threads$runBlockingChecked$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super T>, java.lang.Object> {
        int Camera2StreamConfigurationMap;
        final /* synthetic */ kotlinx.coroutines.Deferred<T> getHighSpeedVideoFpsRanges;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.Camera2StreamConfigurationMap;
            if (i != 0) {
                if (i != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
                return obj;
            }
            kotlin.ResultKt.throwOnFailure(obj);
            this.Camera2StreamConfigurationMap = 1;
            java.lang.Object await = this.getHighSpeedVideoFpsRanges.await(this);
            return await == coroutine_suspended ? coroutine_suspended : await;
        }

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, java.lang.Object obj) {
            return ((androidx.camera.camera2.pipe.core.Threads$runBlockingChecked$1.AnonymousClass1) create(coroutineScope, (kotlin.coroutines.Continuation) obj)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            return new androidx.camera.camera2.pipe.core.Threads$runBlockingChecked$1.AnonymousClass1(this.getHighSpeedVideoFpsRanges, continuation);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(kotlinx.coroutines.Deferred<? extends T> deferred, kotlin.coroutines.Continuation<? super androidx.camera.camera2.pipe.core.Threads$runBlockingChecked$1.AnonymousClass1> continuation) {
            super(2, continuation);
            this.getHighSpeedVideoFpsRanges = deferred;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, java.lang.Object obj) {
        return ((androidx.camera.camera2.pipe.core.Threads$runBlockingChecked$1) create(coroutineScope, (kotlin.coroutines.Continuation) obj)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new androidx.camera.camera2.pipe.core.Threads$runBlockingChecked$1(this.getHighSpeedVideoFpsRanges, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRangesFor, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    Threads$runBlockingChecked$1(androidx.camera.camera2.pipe.core.Threads threads, kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<? super T>, ? extends java.lang.Object> function1, long j, kotlin.coroutines.Continuation<? super androidx.camera.camera2.pipe.core.Threads$runBlockingChecked$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRanges = threads;
        this.getHighResolutionOutputSizeshNQ4ISI = function1;
        this.getHighSpeedVideoFpsRangesFor = j;
    }
}
