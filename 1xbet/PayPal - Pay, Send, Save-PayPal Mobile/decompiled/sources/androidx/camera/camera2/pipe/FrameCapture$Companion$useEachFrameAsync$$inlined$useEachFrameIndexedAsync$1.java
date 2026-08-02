package androidx.camera.camera2.pipe;

/* JADX INFO: Add missing generic type declarations: [R] */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001*\u00020\u0002H\n¨\u0006\u0004"}, d2 = {"<anonymous>", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.REACT_NATIVE, "Lkotlinx/coroutines/CoroutineScope;", "androidx/camera/camera2/pipe/core/AutoCloseables$useEachIndexedAsync$deferred$1", "androidx/camera/camera2/pipe/FrameCapture$Companion$useEachFrameIndexedAsync$$inlined$useEachIndexedAsync$1"}, k = 3, mv = {2, 1, 0}, xi = 176)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.camera.camera2.pipe.FrameCapture$Companion$useEachFrameAsync$$inlined$useEachFrameIndexedAsync$1", f = "Frame.kt", i = {0}, l = {103, 107}, m = "invokeSuspend", n = {"it"}, s = {"L$1"}, v = 1)
/* loaded from: classes6.dex */
public final class FrameCapture$Companion$useEachFrameAsync$$inlined$useEachFrameIndexedAsync$1<R> extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super R>, java.lang.Object> {
    final /* synthetic */ int Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    final /* synthetic */ kotlin.jvm.functions.Function3 getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ java.lang.AutoCloseable getHighSpeedVideoSizes;
    int getHighSpeedVideoSizesFor;
    java.lang.Object getOutputMinFrameDuration;

    public final java.lang.Object invokeSuspend$$forInline(java.lang.Object obj) {
        java.lang.AutoCloseable autoCloseable = this.getHighSpeedVideoSizes;
        int i = this.Camera2StreamConfigurationMap;
        try {
            kotlinx.coroutines.YieldKt.yield(this);
            java.lang.Object coroutineScope = kotlinx.coroutines.CoroutineScopeKt.coroutineScope(new androidx.camera.camera2.pipe.FrameCapture$Companion$useEachFrameAsync$$inlined$useEachFrameIndexedAsync$1.AnonymousClass1(i, autoCloseable, null, this.getHighSpeedVideoFpsRangesFor), this);
            kotlin.jdk7.AutoCloseableKt.closeFinally(autoCloseable, null);
            return coroutineScope;
        } finally {
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001*\u00020\u0002H\n¨\u0006\u0004"}, d2 = {"<anonymous>", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.REACT_NATIVE, "Lkotlinx/coroutines/CoroutineScope;", "androidx/camera/camera2/pipe/core/AutoCloseables$useEachIndexedAsync$deferred$1$1$1", "androidx/camera/camera2/pipe/FrameCapture$Companion$useEachFrameIndexedAsync$$inlined$useEachIndexedAsync$1$1"}, k = 3, mv = {2, 1, 0}, xi = 176)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.camera.camera2.pipe.FrameCapture$Companion$useEachFrameAsync$$inlined$useEachFrameIndexedAsync$1$1", f = "Frame.kt", i = {0, 0, 0}, l = {108, 111}, m = "invokeSuspend", n = {"capture", "$this$useEachFrameIndexedAsync_u24lambda_u240", "idx"}, s = {"L$0", "L$1", "I$0"}, v = 1)
    /* renamed from: androidx.camera.camera2.pipe.FrameCapture$Companion$useEachFrameAsync$$inlined$useEachFrameIndexedAsync$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super R>, java.lang.Object> {
        java.lang.Object Camera2StreamConfigurationMap;
        int getHighResolutionOutputSizeshNQ4ISI;
        final /* synthetic */ kotlin.jvm.functions.Function3 getHighSpeedVideoFpsRanges;
        final /* synthetic */ int getHighSpeedVideoFpsRangesFor;
        final /* synthetic */ java.lang.AutoCloseable getHighSpeedVideoSizes;
        private /* synthetic */ java.lang.Object getInputFormats;
        int getOutputFormats;

        public final java.lang.Object invokeSuspend$$forInline(java.lang.Object obj) {
            kotlinx.coroutines.CoroutineScope coroutineScope = (kotlinx.coroutines.CoroutineScope) this.getInputFormats;
            androidx.camera.camera2.pipe.FrameCapture frameCapture = (androidx.camera.camera2.pipe.FrameCapture) this.getHighSpeedVideoSizes;
            java.lang.AutoCloseable autoCloseable = (java.lang.AutoCloseable) frameCapture.awaitFrame(this);
            try {
                frameCapture.close();
                androidx.camera.camera2.pipe.FrameCapture$Companion$useEachFrameAsync$$inlined$useEachFrameIndexedAsync$1.AnonymousClass1 anonymousClass1 = this;
                java.lang.Object invoke = this.getHighSpeedVideoFpsRanges.invoke(coroutineScope, (androidx.camera.camera2.pipe.Frame) autoCloseable, this);
                kotlin.jdk7.AutoCloseableKt.closeFinally(autoCloseable, null);
                return invoke;
            } finally {
            }
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            kotlinx.coroutines.CoroutineScope coroutineScope;
            androidx.camera.camera2.pipe.FrameCapture frameCapture;
            java.lang.AutoCloseable autoCloseable;
            java.lang.AutoCloseable autoCloseable2;
            java.lang.Throwable th;
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.getOutputFormats;
            try {
                if (i == 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    coroutineScope = (kotlinx.coroutines.CoroutineScope) this.getInputFormats;
                    int i2 = this.getHighSpeedVideoFpsRangesFor;
                    androidx.camera.camera2.pipe.FrameCapture frameCapture2 = (androidx.camera.camera2.pipe.FrameCapture) this.getHighSpeedVideoSizes;
                    this.getInputFormats = frameCapture2;
                    this.Camera2StreamConfigurationMap = coroutineScope;
                    this.getHighResolutionOutputSizeshNQ4ISI = i2;
                    this.getOutputFormats = 1;
                    obj = frameCapture2.awaitFrame(this);
                    if (obj != coroutine_suspended) {
                        frameCapture = frameCapture2;
                    }
                    return coroutine_suspended;
                }
                if (i != 1) {
                    if (i != 2) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    autoCloseable2 = (java.lang.AutoCloseable) this.getInputFormats;
                    try {
                        kotlin.ResultKt.throwOnFailure(obj);
                        kotlin.jdk7.AutoCloseableKt.closeFinally(autoCloseable2, null);
                        return obj;
                    } catch (java.lang.Throwable th2) {
                        th = th2;
                        try {
                            throw th;
                        } catch (java.lang.Throwable th3) {
                            kotlin.jdk7.AutoCloseableKt.closeFinally(autoCloseable2, th);
                            throw th3;
                        }
                    }
                }
                coroutineScope = (kotlinx.coroutines.CoroutineScope) this.Camera2StreamConfigurationMap;
                frameCapture = (androidx.camera.camera2.pipe.FrameCapture) this.getInputFormats;
                kotlin.ResultKt.throwOnFailure(obj);
                frameCapture.close();
                androidx.camera.camera2.pipe.FrameCapture$Companion$useEachFrameAsync$$inlined$useEachFrameIndexedAsync$1.AnonymousClass1 anonymousClass1 = this;
                kotlin.jvm.functions.Function3 function3 = this.getHighSpeedVideoFpsRanges;
                this.getInputFormats = autoCloseable;
                this.Camera2StreamConfigurationMap = null;
                this.getOutputFormats = 2;
                java.lang.Object invoke = function3.invoke(coroutineScope, (androidx.camera.camera2.pipe.Frame) autoCloseable, this);
                if (invoke != coroutine_suspended) {
                    autoCloseable2 = autoCloseable;
                    obj = invoke;
                    kotlin.jdk7.AutoCloseableKt.closeFinally(autoCloseable2, null);
                    return obj;
                }
                return coroutine_suspended;
            } catch (java.lang.Throwable th4) {
                autoCloseable2 = autoCloseable;
                th = th4;
                throw th;
            }
            autoCloseable = (java.lang.AutoCloseable) obj;
        }

        @Override // kotlin.jvm.functions.Function2
        public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super R> continuation) {
            return ((androidx.camera.camera2.pipe.FrameCapture$Companion$useEachFrameAsync$$inlined$useEachFrameIndexedAsync$1.AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            androidx.camera.camera2.pipe.FrameCapture$Companion$useEachFrameAsync$$inlined$useEachFrameIndexedAsync$1.AnonymousClass1 anonymousClass1 = new androidx.camera.camera2.pipe.FrameCapture$Companion$useEachFrameAsync$$inlined$useEachFrameIndexedAsync$1.AnonymousClass1(this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoSizes, continuation, this.getHighSpeedVideoFpsRanges);
            anonymousClass1.getInputFormats = obj;
            return anonymousClass1;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(int i, java.lang.AutoCloseable autoCloseable, kotlin.coroutines.Continuation continuation, kotlin.jvm.functions.Function3 function3) {
            super(2, continuation);
            this.getHighSpeedVideoFpsRangesFor = i;
            this.getHighSpeedVideoSizes = autoCloseable;
            this.getHighSpeedVideoFpsRanges = function3;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.AutoCloseable autoCloseable;
        int i;
        java.lang.AutoCloseable autoCloseable2;
        java.lang.AutoCloseable autoCloseable3;
        java.lang.Throwable th;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = this.getHighSpeedVideoSizesFor;
        if (i2 != 0) {
            if (i2 == 1) {
                i = this.getHighResolutionOutputSizeshNQ4ISI;
                autoCloseable2 = (java.lang.AutoCloseable) this.getOutputMinFrameDuration;
                java.lang.AutoCloseable autoCloseable4 = (java.lang.AutoCloseable) this.getHighSpeedVideoFpsRanges;
                try {
                    kotlin.ResultKt.throwOnFailure(obj);
                    autoCloseable = autoCloseable4;
                } catch (java.lang.Throwable th2) {
                    th = th2;
                    autoCloseable3 = autoCloseable4;
                }
            } else {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                autoCloseable3 = (java.lang.AutoCloseable) this.getHighSpeedVideoFpsRanges;
                try {
                    kotlin.ResultKt.throwOnFailure(obj);
                    kotlin.jdk7.AutoCloseableKt.closeFinally(autoCloseable3, null);
                    return obj;
                } catch (java.lang.Throwable th3) {
                    th = th3;
                }
            }
            try {
                throw th;
            } catch (java.lang.Throwable th4) {
                kotlin.jdk7.AutoCloseableKt.closeFinally(autoCloseable3, th);
                throw th4;
            }
        }
        kotlin.ResultKt.throwOnFailure(obj);
        autoCloseable = this.getHighSpeedVideoSizes;
        i = this.Camera2StreamConfigurationMap;
        try {
            this.getHighSpeedVideoFpsRanges = autoCloseable;
            this.getOutputMinFrameDuration = autoCloseable;
            this.getHighResolutionOutputSizeshNQ4ISI = i;
            this.getHighSpeedVideoSizesFor = 1;
            if (kotlinx.coroutines.YieldKt.yield(this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            autoCloseable2 = autoCloseable;
        } catch (java.lang.Throwable th5) {
            autoCloseable3 = autoCloseable;
            th = th5;
        }
        androidx.camera.camera2.pipe.FrameCapture$Companion$useEachFrameAsync$$inlined$useEachFrameIndexedAsync$1.AnonymousClass1 anonymousClass1 = new androidx.camera.camera2.pipe.FrameCapture$Companion$useEachFrameAsync$$inlined$useEachFrameIndexedAsync$1.AnonymousClass1(i, autoCloseable2, null, this.getHighSpeedVideoFpsRangesFor);
        this.getHighSpeedVideoFpsRanges = autoCloseable;
        this.getOutputMinFrameDuration = null;
        this.getHighSpeedVideoSizesFor = 2;
        java.lang.Object coroutineScope = kotlinx.coroutines.CoroutineScopeKt.coroutineScope(anonymousClass1, this);
        if (coroutineScope != coroutine_suspended) {
            autoCloseable3 = autoCloseable;
            obj = coroutineScope;
            kotlin.jdk7.AutoCloseableKt.closeFinally(autoCloseable3, null);
            return obj;
        }
        return coroutine_suspended;
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super R> continuation) {
        return ((androidx.camera.camera2.pipe.FrameCapture$Companion$useEachFrameAsync$$inlined$useEachFrameIndexedAsync$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new androidx.camera.camera2.pipe.FrameCapture$Companion$useEachFrameAsync$$inlined$useEachFrameIndexedAsync$1(this.getHighSpeedVideoSizes, this.Camera2StreamConfigurationMap, continuation, this.getHighSpeedVideoFpsRangesFor);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FrameCapture$Companion$useEachFrameAsync$$inlined$useEachFrameIndexedAsync$1(java.lang.AutoCloseable autoCloseable, int i, kotlin.coroutines.Continuation continuation, kotlin.jvm.functions.Function3 function3) {
        super(2, continuation);
        this.getHighSpeedVideoSizes = autoCloseable;
        this.Camera2StreamConfigurationMap = i;
        this.getHighSpeedVideoFpsRangesFor = function3;
    }
}
