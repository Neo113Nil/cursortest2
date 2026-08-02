package androidx.camera.camera2.pipe.core;

/* JADX INFO: Add missing generic type declarations: [R] */
@kotlin.Metadata(d1 = {"\u0000\n\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001*\u00020\u0002H\n¨\u0006\u0003"}, d2 = {"<anonymous>", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.REACT_NATIVE, "Lkotlinx/coroutines/CoroutineScope;", "androidx/camera/camera2/pipe/core/AutoCloseables$useEachIndexedAsync$deferred$1"}, k = 3, mv = {2, 1, 0}, xi = 176)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.camera.camera2.pipe.core.AutoCloseables$useEachAsync$$inlined$useEachIndexedAsync$1", f = "AutoCloseables.kt", i = {0}, l = {103, 107}, m = "invokeSuspend", n = {"it"}, s = {"L$1"}, v = 1)
/* loaded from: classes6.dex */
public final class AutoCloseables$useEachAsync$$inlined$useEachIndexedAsync$1<R> extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super R>, java.lang.Object> {
    final /* synthetic */ java.lang.AutoCloseable Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ kotlin.jvm.functions.Function3 getHighSpeedVideoFpsRanges;
    final /* synthetic */ int getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    int getHighSpeedVideoSizesFor;
    java.lang.Object getInputSizeshNQ4ISI;

    @kotlin.Metadata(d1 = {"\u0000\n\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001*\u00020\u0002H\n¨\u0006\u0003"}, d2 = {"<anonymous>", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.REACT_NATIVE, "Lkotlinx/coroutines/CoroutineScope;", "androidx/camera/camera2/pipe/core/AutoCloseables$useEachIndexedAsync$deferred$1$1$1"}, k = 3, mv = {2, 1, 0}, xi = 176)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.camera.camera2.pipe.core.AutoCloseables$useEachAsync$$inlined$useEachIndexedAsync$1$1", f = "AutoCloseables.kt", i = {}, l = {108}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    /* renamed from: androidx.camera.camera2.pipe.core.AutoCloseables$useEachAsync$$inlined$useEachIndexedAsync$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super R>, java.lang.Object> {
        final /* synthetic */ int Camera2StreamConfigurationMap;
        private /* synthetic */ java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
        final /* synthetic */ java.lang.AutoCloseable getHighSpeedVideoFpsRanges;
        int getHighSpeedVideoFpsRangesFor;
        final /* synthetic */ kotlin.jvm.functions.Function3 getHighSpeedVideoSizes;

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
            kotlinx.coroutines.CoroutineScope coroutineScope = (kotlinx.coroutines.CoroutineScope) this.getHighResolutionOutputSizeshNQ4ISI;
            java.lang.AutoCloseable autoCloseable = this.getHighSpeedVideoFpsRanges;
            kotlin.jvm.functions.Function3 function3 = this.getHighSpeedVideoSizes;
            this.getHighSpeedVideoFpsRangesFor = 1;
            java.lang.Object invoke = function3.invoke(coroutineScope, autoCloseable, this);
            return invoke == coroutine_suspended ? coroutine_suspended : invoke;
        }

        public final java.lang.Object invokeSuspend$$forInline(java.lang.Object obj) {
            return this.getHighSpeedVideoSizes.invoke((kotlinx.coroutines.CoroutineScope) this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRanges, this);
        }

        @Override // kotlin.jvm.functions.Function2
        public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super R> continuation) {
            return ((androidx.camera.camera2.pipe.core.AutoCloseables$useEachAsync$$inlined$useEachIndexedAsync$1.AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            androidx.camera.camera2.pipe.core.AutoCloseables$useEachAsync$$inlined$useEachIndexedAsync$1.AnonymousClass1 anonymousClass1 = new androidx.camera.camera2.pipe.core.AutoCloseables$useEachAsync$$inlined$useEachIndexedAsync$1.AnonymousClass1(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRanges, continuation, this.getHighSpeedVideoSizes);
            anonymousClass1.getHighResolutionOutputSizeshNQ4ISI = obj;
            return anonymousClass1;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(int i, java.lang.AutoCloseable autoCloseable, kotlin.coroutines.Continuation continuation, kotlin.jvm.functions.Function3 function3) {
            super(2, continuation);
            this.Camera2StreamConfigurationMap = i;
            this.getHighSpeedVideoFpsRanges = autoCloseable;
            this.getHighSpeedVideoSizes = function3;
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
                autoCloseable2 = (java.lang.AutoCloseable) this.getInputSizeshNQ4ISI;
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
        autoCloseable = this.Camera2StreamConfigurationMap;
        i = this.getHighSpeedVideoFpsRangesFor;
        try {
            this.getHighSpeedVideoSizes = autoCloseable;
            this.getInputSizeshNQ4ISI = autoCloseable;
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
        androidx.camera.camera2.pipe.core.AutoCloseables$useEachAsync$$inlined$useEachIndexedAsync$1.AnonymousClass1 anonymousClass1 = new androidx.camera.camera2.pipe.core.AutoCloseables$useEachAsync$$inlined$useEachIndexedAsync$1.AnonymousClass1(i, autoCloseable2, null, this.getHighSpeedVideoFpsRanges);
        this.getHighSpeedVideoSizes = autoCloseable;
        this.getInputSizeshNQ4ISI = null;
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

    public final java.lang.Object invokeSuspend$$forInline(java.lang.Object obj) {
        java.lang.AutoCloseable autoCloseable = this.Camera2StreamConfigurationMap;
        int i = this.getHighSpeedVideoFpsRangesFor;
        try {
            kotlinx.coroutines.YieldKt.yield(this);
            java.lang.Object coroutineScope = kotlinx.coroutines.CoroutineScopeKt.coroutineScope(new androidx.camera.camera2.pipe.core.AutoCloseables$useEachAsync$$inlined$useEachIndexedAsync$1.AnonymousClass1(i, autoCloseable, null, this.getHighSpeedVideoFpsRanges), this);
            kotlin.jdk7.AutoCloseableKt.closeFinally(autoCloseable, null);
            return coroutineScope;
        } finally {
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super R> continuation) {
        return ((androidx.camera.camera2.pipe.core.AutoCloseables$useEachAsync$$inlined$useEachIndexedAsync$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new androidx.camera.camera2.pipe.core.AutoCloseables$useEachAsync$$inlined$useEachIndexedAsync$1(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRangesFor, continuation, this.getHighSpeedVideoFpsRanges);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AutoCloseables$useEachAsync$$inlined$useEachIndexedAsync$1(java.lang.AutoCloseable autoCloseable, int i, kotlin.coroutines.Continuation continuation, kotlin.jvm.functions.Function3 function3) {
        super(2, continuation);
        this.Camera2StreamConfigurationMap = autoCloseable;
        this.getHighSpeedVideoFpsRangesFor = i;
        this.getHighSpeedVideoFpsRanges = function3;
    }
}
