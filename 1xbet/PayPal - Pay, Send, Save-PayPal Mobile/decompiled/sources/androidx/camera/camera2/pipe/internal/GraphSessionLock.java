package androidx.camera.camera2.pipe.internal;

@androidx.camera.camera2.pipe.config.CameraGraphScope
@kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004H\u0080@¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\u0007\u001a\u0004\u0018\u00010\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\bJL\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u0010\"\u0004\b\u0000\u0010\t2\u0006\u0010\u000b\u001a\u00020\n2'\u0010\u000f\u001a#\b\u0001\u0012\t\u0012\u00070\u0004¢\u0006\u0002\b\r\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u00010\fH\u0000¢\u0006\u0004\b\u0011\u0010\u0012JR\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0010\"\u0004\b\u0000\u0010\t2\u0006\u0010\u000b\u001a\u00020\n2-\u0010\u000f\u001a)\b\u0001\u0012\t\u0012\u00070\u0004¢\u0006\u0002\b\r\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00100\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u00010\fH\u0000¢\u0006\u0004\b\u0013\u0010\u0012JL\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u0010\"\u0004\b\u0000\u0010\t2\u0006\u0010\u0014\u001a\u00020\n2'\u0010\u0016\u001a#\b\u0001\u0012\u0004\u0012\u00020\n\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u00010\f¢\u0006\u0002\b\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0012J>\u0010\u0018\u001a\u00028\u0000\"\u0004\b\u0000\u0010\t*\u00020\u00042\"\u0010\u0014\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u00010\fH\u0082@¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c"}, d2 = {"Landroidx/camera/camera2/pipe/internal/GraphSessionLock;", "", "<init>", "()V", "Landroidx/camera/camera2/pipe/core/Token;", "acquireToken$camera_camera2_pipe", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "tryAcquireToken$camera_camera2_pipe", "()Landroidx/camera/camera2/pipe/core/Token;", "T", "Lkotlinx/coroutines/CoroutineScope;", com.paypal.oslo.feature.identity.connect.inboundconnect.utils.Constants.SCOPE_KEY, "Lkotlin/Function2;", "Lkotlin/ParameterName;", "Lkotlin/coroutines/Continuation;", "action", "Lkotlinx/coroutines/Deferred;", "withTokenIn$camera_camera2_pipe", "(Lkotlinx/coroutines/CoroutineScope;Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/Deferred;", "withTokenInAsync$camera_camera2_pipe", "p0", "Lkotlin/ExtensionFunctionType;", "p1", "getHighSpeedVideoFpsRangesFor", "Camera2StreamConfigurationMap", "(Landroidx/camera/camera2/pipe/core/Token;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlinx/coroutines/sync/Mutex;", "getHighSpeedVideoFpsRanges", "Lkotlinx/coroutines/sync/Mutex;"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class GraphSessionLock {
    private final kotlinx.coroutines.sync.Mutex getHighSpeedVideoFpsRanges = kotlinx.coroutines.sync.MutexKt.Mutex$default(false, 1, null);

    @javax.inject.Inject
    public GraphSessionLock() {
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object acquireToken$camera_camera2_pipe(kotlin.coroutines.Continuation<? super androidx.camera.camera2.pipe.core.Token> continuation) {
        androidx.camera.camera2.pipe.internal.GraphSessionLock$acquireToken$1 graphSessionLock$acquireToken$1;
        int i;
        kotlinx.coroutines.sync.Mutex mutex;
        if (continuation instanceof androidx.camera.camera2.pipe.internal.GraphSessionLock$acquireToken$1) {
            graphSessionLock$acquireToken$1 = (androidx.camera.camera2.pipe.internal.GraphSessionLock$acquireToken$1) continuation;
            if ((graphSessionLock$acquireToken$1.Camera2StreamConfigurationMap & Integer.MIN_VALUE) != 0) {
                graphSessionLock$acquireToken$1.Camera2StreamConfigurationMap -= 2147483648;
                java.lang.Object obj = graphSessionLock$acquireToken$1.getHighSpeedVideoFpsRanges;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = graphSessionLock$acquireToken$1.Camera2StreamConfigurationMap;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    kotlinx.coroutines.sync.Mutex mutex2 = this.getHighSpeedVideoFpsRanges;
                    graphSessionLock$acquireToken$1.getHighResolutionOutputSizeshNQ4ISI = mutex2;
                    graphSessionLock$acquireToken$1.Camera2StreamConfigurationMap = 1;
                    if (kotlinx.coroutines.sync.Mutex.DefaultImpls.lock$default(mutex2, null, graphSessionLock$acquireToken$1, 1, null) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    mutex = mutex2;
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    mutex = (kotlinx.coroutines.sync.Mutex) graphSessionLock$acquireToken$1.getHighResolutionOutputSizeshNQ4ISI;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                return new androidx.camera.camera2.pipe.core.MutexToken(mutex);
            }
        }
        graphSessionLock$acquireToken$1 = new androidx.camera.camera2.pipe.internal.GraphSessionLock$acquireToken$1(this, continuation);
        java.lang.Object obj2 = graphSessionLock$acquireToken$1.getHighSpeedVideoFpsRanges;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = graphSessionLock$acquireToken$1.Camera2StreamConfigurationMap;
        if (i != 0) {
        }
        return new androidx.camera.camera2.pipe.core.MutexToken(mutex);
    }

    public final androidx.camera.camera2.pipe.core.Token tryAcquireToken$camera_camera2_pipe() {
        return androidx.camera.camera2.pipe.core.MutexesKt.tryAcquireToken(this.getHighSpeedVideoFpsRanges);
    }

    public final <T> kotlinx.coroutines.Deferred<T> withTokenIn$camera_camera2_pipe(kotlinx.coroutines.CoroutineScope scope, kotlin.jvm.functions.Function2<? super androidx.camera.camera2.pipe.core.Token, ? super kotlin.coroutines.Continuation<? super T>, ? extends java.lang.Object> action) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(scope, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(action, "");
        return getHighSpeedVideoFpsRangesFor(scope, new androidx.camera.camera2.pipe.internal.GraphSessionLock$withTokenIn$1(this, action, null));
    }

    public final <T> kotlinx.coroutines.Deferred<T> withTokenInAsync$camera_camera2_pipe(kotlinx.coroutines.CoroutineScope scope, kotlin.jvm.functions.Function2<? super androidx.camera.camera2.pipe.core.Token, ? super kotlin.coroutines.Continuation<? super kotlinx.coroutines.Deferred<? extends T>>, ? extends java.lang.Object> action) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(scope, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(action, "");
        return getHighSpeedVideoFpsRangesFor(scope, new androidx.camera.camera2.pipe.internal.GraphSessionLock$withTokenInAsync$1(this, action, null));
    }

    private static <T> kotlinx.coroutines.Deferred<T> getHighSpeedVideoFpsRangesFor(kotlinx.coroutines.CoroutineScope p0, kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super T>, ? extends java.lang.Object> p1) {
        final kotlinx.coroutines.CompletableJob Job = kotlinx.coroutines.JobKt.Job((kotlinx.coroutines.Job) p0.getLocalContext().get(kotlinx.coroutines.Job.INSTANCE));
        kotlinx.coroutines.Deferred<T> async = kotlinx.coroutines.BuildersKt.async(p0, p0.getLocalContext().plus(Job), kotlinx.coroutines.CoroutineStart.UNDISPATCHED, new androidx.camera.camera2.pipe.internal.GraphSessionLock$asyncUndispatched$result$1(p1, null));
        async.invokeOnCompletion(new kotlin.jvm.functions.Function1() { // from class: androidx.camera.camera2.pipe.internal.GraphSessionLock$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return androidx.camera.camera2.pipe.internal.GraphSessionLock.m970$r8$lambda$Rh7Chtw743aTwAubUmFZvrz3kQ(kotlinx.coroutines.CompletableJob.this, (java.lang.Throwable) obj);
            }
        });
        return async;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final <T> java.lang.Object Camera2StreamConfigurationMap(androidx.camera.camera2.pipe.core.Token token, kotlin.jvm.functions.Function2<? super androidx.camera.camera2.pipe.core.Token, ? super kotlin.coroutines.Continuation<? super T>, ? extends java.lang.Object> function2, kotlin.coroutines.Continuation<? super T> continuation) {
        androidx.camera.camera2.pipe.internal.GraphSessionLock$use$1 graphSessionLock$use$1;
        int i;
        try {
            if (continuation instanceof androidx.camera.camera2.pipe.internal.GraphSessionLock$use$1) {
                graphSessionLock$use$1 = (androidx.camera.camera2.pipe.internal.GraphSessionLock$use$1) continuation;
                if ((graphSessionLock$use$1.getHighSpeedVideoFpsRangesFor & Integer.MIN_VALUE) != 0) {
                    graphSessionLock$use$1.getHighSpeedVideoFpsRangesFor -= 2147483648;
                    java.lang.Object obj = graphSessionLock$use$1.getHighSpeedVideoFpsRanges;
                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = graphSessionLock$use$1.getHighSpeedVideoFpsRangesFor;
                    if (i != 0) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        graphSessionLock$use$1.Camera2StreamConfigurationMap = token;
                        graphSessionLock$use$1.getHighSpeedVideoFpsRangesFor = 1;
                        obj = function2.invoke(token, graphSessionLock$use$1);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        token = (androidx.camera.camera2.pipe.core.Token) graphSessionLock$use$1.Camera2StreamConfigurationMap;
                        kotlin.ResultKt.throwOnFailure(obj);
                    }
                    return obj;
                }
            }
            if (i != 0) {
            }
            return obj;
        } finally {
            token.release();
        }
        graphSessionLock$use$1 = new androidx.camera.camera2.pipe.internal.GraphSessionLock$use$1(this, continuation);
        java.lang.Object obj2 = graphSessionLock$use$1.getHighSpeedVideoFpsRanges;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = graphSessionLock$use$1.getHighSpeedVideoFpsRangesFor;
    }

    /* renamed from: $r8$lambda$Rh7Chtw743aTwAubUmFZvrz-3kQ, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m970$r8$lambda$Rh7Chtw743aTwAubUmFZvrz3kQ(kotlinx.coroutines.CompletableJob completableJob, java.lang.Throwable th) {
        completableJob.complete();
        return kotlin.Unit.INSTANCE;
    }
}
