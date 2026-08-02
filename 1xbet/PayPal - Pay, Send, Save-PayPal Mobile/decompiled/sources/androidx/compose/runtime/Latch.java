package androidx.compose.runtime;

@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J$\u0010\u0007\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0086\b¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u0003J\r\u0010\u000b\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\u0003J\u0010\u0010\f\u001a\u00020\tH\u0086@¢\u0006\u0004\b\f\u0010\rR\u0018\u0010\u0011\u001a\u00060\u0001j\u0002`\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\"\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u00130\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\"\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u00130\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0015R\u0016\u0010\u0016\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0019R\u0011\u0010\u001a\u001a\u00020\u00188G¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b"}, d2 = {"Landroidx/compose/runtime/Latch;", "", "<init>", "()V", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.REACT_NATIVE, "Lkotlin/Function0;", "block", "withClosed", "(Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "", "closeLatch", "openLatch", "await", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/compose/runtime/platform/SynchronizedObject;", "getHighSpeedVideoFpsRanges", "Ljava/lang/Object;", "getHighSpeedVideoSizes", "", "Lkotlin/coroutines/Continuation;", "getHighSpeedVideoFpsRangesFor", "Ljava/util/List;", "getHighResolutionOutputSizeshNQ4ISI", "Camera2StreamConfigurationMap", "", "Z", "isOpen", "()Z"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class Latch {
    public static final int $stable = 8;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final java.lang.Object getHighSpeedVideoSizes = new java.lang.Object();

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private java.util.List<kotlin.coroutines.Continuation<kotlin.Unit>> getHighSpeedVideoFpsRanges = new java.util.ArrayList();

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private java.util.List<kotlin.coroutines.Continuation<kotlin.Unit>> Camera2StreamConfigurationMap = new java.util.ArrayList();

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private boolean getHighResolutionOutputSizeshNQ4ISI = true;

    public final boolean isOpen() {
        boolean z;
        synchronized (this.getHighSpeedVideoSizes) {
            z = this.getHighResolutionOutputSizeshNQ4ISI;
        }
        return z;
    }

    public final <R> R withClosed(kotlin.jvm.functions.Function0<? extends R> block) {
        closeLatch();
        try {
            return block.invoke();
        } finally {
            openLatch();
        }
    }

    public final void closeLatch() {
        synchronized (this.getHighSpeedVideoSizes) {
            this.getHighResolutionOutputSizeshNQ4ISI = false;
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
        }
    }

    public final void openLatch() {
        synchronized (this.getHighSpeedVideoSizes) {
            if (isOpen()) {
                return;
            }
            java.util.List<kotlin.coroutines.Continuation<kotlin.Unit>> list = this.getHighSpeedVideoFpsRanges;
            this.getHighSpeedVideoFpsRanges = this.Camera2StreamConfigurationMap;
            this.Camera2StreamConfigurationMap = list;
            this.getHighResolutionOutputSizeshNQ4ISI = true;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                kotlin.coroutines.Continuation<kotlin.Unit> continuation = list.get(i);
                kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                continuation.resumeWith(kotlin.Result.m23436constructorimpl(kotlin.Unit.INSTANCE));
            }
            list.clear();
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
        }
    }

    public final java.lang.Object await(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        if (isOpen()) {
            return kotlin.Unit.INSTANCE;
        }
        kotlinx.coroutines.CancellableContinuationImpl cancellableContinuationImpl = new kotlinx.coroutines.CancellableContinuationImpl(kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        final kotlinx.coroutines.CancellableContinuationImpl cancellableContinuationImpl2 = cancellableContinuationImpl;
        synchronized (this.getHighSpeedVideoSizes) {
            this.getHighSpeedVideoFpsRanges.add(cancellableContinuationImpl2);
        }
        cancellableContinuationImpl2.invokeOnCancellation(new kotlin.jvm.functions.Function1<java.lang.Throwable, kotlin.Unit>() { // from class: androidx.compose.runtime.Latch$await$2$2
            private void Camera2StreamConfigurationMap() {
                java.lang.Object obj = androidx.compose.runtime.Latch.this.getHighSpeedVideoSizes;
                androidx.compose.runtime.Latch latch = androidx.compose.runtime.Latch.this;
                kotlinx.coroutines.CancellableContinuation<kotlin.Unit> cancellableContinuation = cancellableContinuationImpl2;
                synchronized (obj) {
                    latch.getHighSpeedVideoFpsRanges.remove(cancellableContinuation);
                    kotlin.Unit unit = kotlin.Unit.INSTANCE;
                }
            }

            @Override // kotlin.jvm.functions.Function1
            public final /* synthetic */ kotlin.Unit invoke(java.lang.Throwable th) {
                Camera2StreamConfigurationMap();
                return kotlin.Unit.INSTANCE;
            }
        });
        java.lang.Object result = cancellableContinuationImpl.getResult();
        if (result == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? result : kotlin.Unit.INSTANCE;
    }
}
