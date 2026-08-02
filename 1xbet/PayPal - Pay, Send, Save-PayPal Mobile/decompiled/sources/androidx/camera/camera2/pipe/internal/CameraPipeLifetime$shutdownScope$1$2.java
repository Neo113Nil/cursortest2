package androidx.camera.camera2.pipe.internal;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.camera.camera2.pipe.internal.CameraPipeLifetime$shutdownScope$1$2", f = "CameraPipeLifetime.kt", i = {}, l = {119}, m = "invokeSuspend", n = {}, s = {}, v = 1)
/* loaded from: classes6.dex */
final class CameraPipeLifetime$shutdownScope$1$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ androidx.camera.camera2.pipe.internal.CameraPipeLifetime getHighSpeedVideoFpsRangesFor;

    @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.camera.camera2.pipe.internal.CameraPipeLifetime$shutdownScope$1$2$1", f = "CameraPipeLifetime.kt", i = {}, l = {121}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    /* renamed from: androidx.camera.camera2.pipe.internal.CameraPipeLifetime$shutdownScope$1$2$1, reason: invalid class name */
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        final /* synthetic */ androidx.camera.camera2.pipe.internal.CameraPipeLifetime Camera2StreamConfigurationMap;
        int getHighSpeedVideoFpsRangesFor;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            kotlinx.coroutines.Job job;
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.getHighSpeedVideoFpsRangesFor;
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                androidx.camera.camera2.pipe.core.Log.INSTANCE.getDEBUG_LOGGABLE();
                job = this.Camera2StreamConfigurationMap.Camera2StreamConfigurationMap;
                this.getHighSpeedVideoFpsRangesFor = 1;
                if (kotlinx.coroutines.JobKt.cancelAndJoin(job, this) == coroutine_suspended) {
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

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((androidx.camera.camera2.pipe.internal.CameraPipeLifetime$shutdownScope$1$2.AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            return new androidx.camera.camera2.pipe.internal.CameraPipeLifetime$shutdownScope$1$2.AnonymousClass1(this.Camera2StreamConfigurationMap, continuation);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(androidx.camera.camera2.pipe.internal.CameraPipeLifetime cameraPipeLifetime, kotlin.coroutines.Continuation<? super androidx.camera.camera2.pipe.internal.CameraPipeLifetime$shutdownScope$1$2.AnonymousClass1> continuation) {
            super(2, continuation);
            this.Camera2StreamConfigurationMap = cameraPipeLifetime;
        }
    }

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
        java.lang.Object withTimeoutOrNull = kotlinx.coroutines.TimeoutKt.withTimeoutOrNull(3000L, new androidx.camera.camera2.pipe.internal.CameraPipeLifetime$shutdownScope$1$2.AnonymousClass1(this.getHighSpeedVideoFpsRangesFor, null), this);
        return withTimeoutOrNull == coroutine_suspended ? coroutine_suspended : withTimeoutOrNull;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((androidx.camera.camera2.pipe.internal.CameraPipeLifetime$shutdownScope$1$2) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new androidx.camera.camera2.pipe.internal.CameraPipeLifetime$shutdownScope$1$2(this.getHighSpeedVideoFpsRangesFor, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CameraPipeLifetime$shutdownScope$1$2(androidx.camera.camera2.pipe.internal.CameraPipeLifetime cameraPipeLifetime, kotlin.coroutines.Continuation<? super androidx.camera.camera2.pipe.internal.CameraPipeLifetime$shutdownScope$1$2> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRangesFor = cameraPipeLifetime;
    }
}
