package androidx.camera.camera2.pipe.core;

/* JADX INFO: Add missing generic type declarations: [T] */
@kotlin.Metadata(d1 = {"\u0000\b\n\u0002\b\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u0001H\u0001\"\u0004\b\u0000\u0010\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "T", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.camera.camera2.pipe.core.Threads$runBlockingCheckedOrNull$1", f = "Threads.kt", i = {}, l = {85}, m = "invokeSuspend", n = {}, s = {}, v = 1)
/* loaded from: classes6.dex */
final class Threads$runBlockingCheckedOrNull$1<T> extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super T>, java.lang.Object> {
    final /* synthetic */ androidx.camera.camera2.pipe.core.Threads Camera2StreamConfigurationMap;
    final /* synthetic */ long getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ kotlin.jvm.functions.Function1<kotlin.coroutines.Continuation<? super T>, java.lang.Object> getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoSizes;
        if (i != 0) {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            return obj;
        }
        kotlin.ResultKt.throwOnFailure(obj);
        androidx.camera.camera2.pipe.core.Threads threads = this.Camera2StreamConfigurationMap;
        kotlinx.coroutines.Deferred access$runAsyncSupervised = androidx.camera.camera2.pipe.core.Threads.access$runAsyncSupervised(threads, threads.getBackgroundDispatcher(), this.getHighSpeedVideoFpsRanges);
        this.getHighSpeedVideoSizes = 1;
        java.lang.Object withTimeoutOrNull = kotlinx.coroutines.TimeoutKt.withTimeoutOrNull(this.getHighResolutionOutputSizeshNQ4ISI, new androidx.camera.camera2.pipe.core.Threads$runBlockingCheckedOrNull$1.AnonymousClass1(access$runAsyncSupervised, null), this);
        return withTimeoutOrNull == coroutine_suspended ? coroutine_suspended : withTimeoutOrNull;
    }

    @kotlin.Metadata(d1 = {"\u0000\b\n\u0002\b\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "T", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.camera.camera2.pipe.core.Threads$runBlockingCheckedOrNull$1$1", f = "Threads.kt", i = {}, l = {85}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    /* renamed from: androidx.camera.camera2.pipe.core.Threads$runBlockingCheckedOrNull$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super T>, java.lang.Object> {
        final /* synthetic */ kotlinx.coroutines.Deferred<T> Camera2StreamConfigurationMap;
        int getHighResolutionOutputSizeshNQ4ISI;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.getHighResolutionOutputSizeshNQ4ISI;
            if (i != 0) {
                if (i != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
                return obj;
            }
            kotlin.ResultKt.throwOnFailure(obj);
            this.getHighResolutionOutputSizeshNQ4ISI = 1;
            java.lang.Object await = this.Camera2StreamConfigurationMap.await(this);
            return await == coroutine_suspended ? coroutine_suspended : await;
        }

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, java.lang.Object obj) {
            return ((androidx.camera.camera2.pipe.core.Threads$runBlockingCheckedOrNull$1.AnonymousClass1) create(coroutineScope, (kotlin.coroutines.Continuation) obj)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            return new androidx.camera.camera2.pipe.core.Threads$runBlockingCheckedOrNull$1.AnonymousClass1(this.Camera2StreamConfigurationMap, continuation);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(kotlinx.coroutines.Deferred<? extends T> deferred, kotlin.coroutines.Continuation<? super androidx.camera.camera2.pipe.core.Threads$runBlockingCheckedOrNull$1.AnonymousClass1> continuation) {
            super(2, continuation);
            this.Camera2StreamConfigurationMap = deferred;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, java.lang.Object obj) {
        return ((androidx.camera.camera2.pipe.core.Threads$runBlockingCheckedOrNull$1) create(coroutineScope, (kotlin.coroutines.Continuation) obj)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new androidx.camera.camera2.pipe.core.Threads$runBlockingCheckedOrNull$1(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRanges, this.getHighResolutionOutputSizeshNQ4ISI, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    Threads$runBlockingCheckedOrNull$1(androidx.camera.camera2.pipe.core.Threads threads, kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<? super T>, ? extends java.lang.Object> function1, long j, kotlin.coroutines.Continuation<? super androidx.camera.camera2.pipe.core.Threads$runBlockingCheckedOrNull$1> continuation) {
        super(2, continuation);
        this.Camera2StreamConfigurationMap = threads;
        this.getHighSpeedVideoFpsRanges = function1;
        this.getHighResolutionOutputSizeshNQ4ISI = j;
    }
}
