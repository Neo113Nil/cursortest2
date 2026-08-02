package androidx.camera.camera2.pipe;

/* JADX INFO: Add missing generic type declarations: [R] */
@kotlin.Metadata(d1 = {"\u0000\n\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001*\u00020\u0002H\n¨\u0006\u0003"}, d2 = {"<anonymous>", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.REACT_NATIVE, "Lkotlinx/coroutines/CoroutineScope;", "androidx/camera/camera2/pipe/core/AutoCloseables$useEachIndexedAsync$deferred$1"}, k = 3, mv = {2, 1, 0}, xi = 176)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.camera.camera2.pipe.FrameCapture$Companion$useEachFrameIndexedAsync$$inlined$useEachIndexedAsync$1", f = "Frame.kt", i = {0}, l = {103, 107}, m = "invokeSuspend", n = {"it"}, s = {"L$1"}, v = 1)
/* loaded from: classes6.dex */
public final class FrameCapture$Companion$useEachFrameIndexedAsync$$inlined$useEachIndexedAsync$1<R> extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super R>, java.lang.Object> {
    final /* synthetic */ kotlin.jvm.functions.Function4 Camera2StreamConfigurationMap;
    final /* synthetic */ int getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ java.lang.AutoCloseable getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    int getInputFormats;
    java.lang.Object getOutputMinFrameDuration;

    public final java.lang.Object invokeSuspend$$forInline(java.lang.Object obj) {
        java.lang.AutoCloseable autoCloseable = this.getHighSpeedVideoFpsRanges;
        int i = this.getHighResolutionOutputSizeshNQ4ISI;
        try {
            kotlinx.coroutines.YieldKt.yield(this);
            java.lang.Object coroutineScope = kotlinx.coroutines.CoroutineScopeKt.coroutineScope(new androidx.camera.camera2.pipe.FrameCapture$Companion$useEachFrameIndexedAsync$$inlined$useEachIndexedAsync$1.AnonymousClass1(i, autoCloseable, null, this.Camera2StreamConfigurationMap), this);
            kotlin.jdk7.AutoCloseableKt.closeFinally(autoCloseable, null);
            return coroutineScope;
        } finally {
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\n\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001*\u00020\u0002H\n¨\u0006\u0003"}, d2 = {"<anonymous>", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.REACT_NATIVE, "Lkotlinx/coroutines/CoroutineScope;", "androidx/camera/camera2/pipe/core/AutoCloseables$useEachIndexedAsync$deferred$1$1$1"}, k = 3, mv = {2, 1, 0}, xi = 176)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.camera.camera2.pipe.FrameCapture$Companion$useEachFrameIndexedAsync$$inlined$useEachIndexedAsync$1$1", f = "Frame.kt", i = {0, 0, 0}, l = {108, 110}, m = "invokeSuspend", n = {"capture", "$this$useEachFrameIndexedAsync_u24lambda_u240", "idx"}, s = {"L$0", "L$1", "I$0"}, v = 1)
    /* renamed from: androidx.camera.camera2.pipe.FrameCapture$Companion$useEachFrameIndexedAsync$$inlined$useEachIndexedAsync$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super R>, java.lang.Object> {
        final /* synthetic */ int Camera2StreamConfigurationMap;
        final /* synthetic */ kotlin.jvm.functions.Function4 getHighResolutionOutputSizeshNQ4ISI;
        int getHighSpeedVideoFpsRanges;
        final /* synthetic */ java.lang.AutoCloseable getHighSpeedVideoFpsRangesFor;
        java.lang.Object getHighSpeedVideoSizes;
        private /* synthetic */ java.lang.Object getOutputFormats;
        int getOutputMinFrameDuration;

        public final java.lang.Object invokeSuspend$$forInline(java.lang.Object obj) {
            kotlinx.coroutines.CoroutineScope coroutineScope = (kotlinx.coroutines.CoroutineScope) this.getOutputFormats;
            int i = this.Camera2StreamConfigurationMap;
            androidx.camera.camera2.pipe.FrameCapture frameCapture = (androidx.camera.camera2.pipe.FrameCapture) this.getHighSpeedVideoFpsRangesFor;
            java.lang.AutoCloseable autoCloseable = (java.lang.AutoCloseable) frameCapture.awaitFrame(this);
            try {
                frameCapture.close();
                java.lang.Object invoke = this.getHighResolutionOutputSizeshNQ4ISI.invoke(coroutineScope, java.lang.Integer.valueOf(i), (androidx.camera.camera2.pipe.Frame) autoCloseable, this);
                kotlin.jdk7.AutoCloseableKt.closeFinally(autoCloseable, null);
                return invoke;
            } finally {
            }
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            int i;
            androidx.camera.camera2.pipe.FrameCapture frameCapture;
            kotlinx.coroutines.CoroutineScope coroutineScope;
            java.lang.AutoCloseable autoCloseable;
            java.lang.AutoCloseable autoCloseable2;
            java.lang.Throwable th;
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.getOutputMinFrameDuration;
            try {
                if (i2 == 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    kotlinx.coroutines.CoroutineScope coroutineScope2 = (kotlinx.coroutines.CoroutineScope) this.getOutputFormats;
                    i = this.Camera2StreamConfigurationMap;
                    frameCapture = (androidx.camera.camera2.pipe.FrameCapture) this.getHighSpeedVideoFpsRangesFor;
                    this.getOutputFormats = frameCapture;
                    this.getHighSpeedVideoSizes = coroutineScope2;
                    this.getHighSpeedVideoFpsRanges = i;
                    this.getOutputMinFrameDuration = 1;
                    java.lang.Object awaitFrame = frameCapture.awaitFrame(this);
                    if (awaitFrame != coroutine_suspended) {
                        coroutineScope = coroutineScope2;
                        obj = awaitFrame;
                    }
                    return coroutine_suspended;
                }
                if (i2 != 1) {
                    if (i2 != 2) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    autoCloseable2 = (java.lang.AutoCloseable) this.getOutputFormats;
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
                i = this.getHighSpeedVideoFpsRanges;
                coroutineScope = (kotlinx.coroutines.CoroutineScope) this.getHighSpeedVideoSizes;
                frameCapture = (androidx.camera.camera2.pipe.FrameCapture) this.getOutputFormats;
                kotlin.ResultKt.throwOnFailure(obj);
                frameCapture.close();
                kotlin.jvm.functions.Function4 function4 = this.getHighResolutionOutputSizeshNQ4ISI;
                java.lang.Integer boxInt = kotlin.coroutines.jvm.internal.Boxing.boxInt(i);
                this.getOutputFormats = autoCloseable;
                this.getHighSpeedVideoSizes = null;
                this.getOutputMinFrameDuration = 2;
                java.lang.Object invoke = function4.invoke(coroutineScope, boxInt, (androidx.camera.camera2.pipe.Frame) autoCloseable, this);
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
            return ((androidx.camera.camera2.pipe.FrameCapture$Companion$useEachFrameIndexedAsync$$inlined$useEachIndexedAsync$1.AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            androidx.camera.camera2.pipe.FrameCapture$Companion$useEachFrameIndexedAsync$$inlined$useEachIndexedAsync$1.AnonymousClass1 anonymousClass1 = new androidx.camera.camera2.pipe.FrameCapture$Companion$useEachFrameIndexedAsync$$inlined$useEachIndexedAsync$1.AnonymousClass1(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRangesFor, continuation, this.getHighResolutionOutputSizeshNQ4ISI);
            anonymousClass1.getOutputFormats = obj;
            return anonymousClass1;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(int i, java.lang.AutoCloseable autoCloseable, kotlin.coroutines.Continuation continuation, kotlin.jvm.functions.Function4 function4) {
            super(2, continuation);
            this.Camera2StreamConfigurationMap = i;
            this.getHighSpeedVideoFpsRangesFor = autoCloseable;
            this.getHighResolutionOutputSizeshNQ4ISI = function4;
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
        int i2 = this.getInputFormats;
        if (i2 != 0) {
            if (i2 == 1) {
                i = this.getHighSpeedVideoFpsRangesFor;
                autoCloseable2 = (java.lang.AutoCloseable) this.getOutputMinFrameDuration;
                java.lang.AutoCloseable autoCloseable4 = (java.lang.AutoCloseable) this.getHighSpeedVideoSizes;
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
                autoCloseable3 = (java.lang.AutoCloseable) this.getHighSpeedVideoSizes;
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
        autoCloseable = this.getHighSpeedVideoFpsRanges;
        i = this.getHighResolutionOutputSizeshNQ4ISI;
        try {
            this.getHighSpeedVideoSizes = autoCloseable;
            this.getOutputMinFrameDuration = autoCloseable;
            this.getHighSpeedVideoFpsRangesFor = i;
            this.getInputFormats = 1;
            if (kotlinx.coroutines.YieldKt.yield(this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            autoCloseable2 = autoCloseable;
        } catch (java.lang.Throwable th5) {
            autoCloseable3 = autoCloseable;
            th = th5;
        }
        androidx.camera.camera2.pipe.FrameCapture$Companion$useEachFrameIndexedAsync$$inlined$useEachIndexedAsync$1.AnonymousClass1 anonymousClass1 = new androidx.camera.camera2.pipe.FrameCapture$Companion$useEachFrameIndexedAsync$$inlined$useEachIndexedAsync$1.AnonymousClass1(i, autoCloseable2, null, this.Camera2StreamConfigurationMap);
        this.getHighSpeedVideoSizes = autoCloseable;
        this.getOutputMinFrameDuration = null;
        this.getInputFormats = 2;
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
        return ((androidx.camera.camera2.pipe.FrameCapture$Companion$useEachFrameIndexedAsync$$inlined$useEachIndexedAsync$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new androidx.camera.camera2.pipe.FrameCapture$Companion$useEachFrameIndexedAsync$$inlined$useEachIndexedAsync$1(this.getHighSpeedVideoFpsRanges, this.getHighResolutionOutputSizeshNQ4ISI, continuation, this.Camera2StreamConfigurationMap);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FrameCapture$Companion$useEachFrameIndexedAsync$$inlined$useEachIndexedAsync$1(java.lang.AutoCloseable autoCloseable, int i, kotlin.coroutines.Continuation continuation, kotlin.jvm.functions.Function4 function4) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRanges = autoCloseable;
        this.getHighResolutionOutputSizeshNQ4ISI = i;
        this.Camera2StreamConfigurationMap = function4;
    }
}
