package androidx.compose.ui.scrollcapture;

@kotlin.Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001:\u00016B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ%\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000f\u001a\u00020\u000e2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J'\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ5\u0010\u001d\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u001b\u001a\u00020\u00112\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ \u0010!\u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020\u00162\u0006\u0010 \u001a\u00020\u0004H\u0082@¢\u0006\u0004\b!\u0010\"J\u0017\u0010#\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0018H\u0016¢\u0006\u0004\b#\u0010$R\u0014\u0010%\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010)\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010,\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010-\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u0010*\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010/R\u0014\u0010'\u001a\u0002008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0016\u00105\u001a\u0002038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u00104"}, d2 = {"Landroidx/compose/ui/scrollcapture/ComposeScrollCaptureCallback;", "Landroid/view/ScrollCaptureCallback;", "Landroidx/compose/ui/semantics/SemanticsNode;", "node", "Landroidx/compose/ui/unit/IntRect;", "viewportBoundsInWindow", "Lkotlinx/coroutines/CoroutineScope;", "coroutineScope", "Landroidx/compose/ui/scrollcapture/ComposeScrollCaptureCallback$ScrollCaptureSessionListener;", com.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Landroid/view/View;", "composeView", "<init>", "(Landroidx/compose/ui/semantics/SemanticsNode;Landroidx/compose/ui/unit/IntRect;Lkotlinx/coroutines/CoroutineScope;Landroidx/compose/ui/scrollcapture/ComposeScrollCaptureCallback$ScrollCaptureSessionListener;Landroid/view/View;)V", "Landroid/os/CancellationSignal;", com.datadog.android.ndk.internal.NdkCrashLog.SIGNAL_KEY_NAME, "Ljava/util/function/Consumer;", "Landroid/graphics/Rect;", "onReady", "", "onScrollCaptureSearch", "(Landroid/os/CancellationSignal;Ljava/util/function/Consumer;)V", "Landroid/view/ScrollCaptureSession;", "session", "Ljava/lang/Runnable;", "onScrollCaptureStart", "(Landroid/view/ScrollCaptureSession;Landroid/os/CancellationSignal;Ljava/lang/Runnable;)V", "captureArea", "onComplete", "onScrollCaptureImageRequest", "(Landroid/view/ScrollCaptureSession;Landroid/os/CancellationSignal;Landroid/graphics/Rect;Ljava/util/function/Consumer;)V", "p0", "p1", "aW_", "(Landroid/view/ScrollCaptureSession;Landroidx/compose/ui/unit/IntRect;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onScrollCaptureEnd", "(Ljava/lang/Runnable;)V", "getHighSpeedVideoFpsRangesFor", "Landroidx/compose/ui/semantics/SemanticsNode;", "getInputFormats", "Landroidx/compose/ui/unit/IntRect;", "getHighSpeedVideoSizes", "Camera2StreamConfigurationMap", "Landroidx/compose/ui/scrollcapture/ComposeScrollCaptureCallback$ScrollCaptureSessionListener;", "getHighResolutionOutputSizeshNQ4ISI", "getHighSpeedVideoFpsRanges", "Landroid/view/View;", "Lkotlinx/coroutines/CoroutineScope;", "Landroidx/compose/ui/scrollcapture/RelativeScroller;", "getInputSizeshNQ4ISI", "Landroidx/compose/ui/scrollcapture/RelativeScroller;", "", com.visa.cbp.getEncExpo.warmup, "getOutputFormats", "ScrollCaptureSessionListener"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ComposeScrollCaptureCallback implements android.view.ScrollCaptureCallback {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final androidx.compose.ui.scrollcapture.ComposeScrollCaptureCallback.ScrollCaptureSessionListener getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private int getOutputFormats;
    private final android.view.View getHighSpeedVideoFpsRanges;
    private final androidx.compose.ui.semantics.SemanticsNode getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final kotlinx.coroutines.CoroutineScope Camera2StreamConfigurationMap;

    /* renamed from: getInputFormats, reason: from kotlin metadata */
    private final androidx.compose.ui.unit.IntRect getHighSpeedVideoSizes;

    /* renamed from: getInputSizeshNQ4ISI, reason: from kotlin metadata */
    private final androidx.compose.ui.scrollcapture.RelativeScroller getInputFormats;

    @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0004ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Landroidx/compose/ui/scrollcapture/ComposeScrollCaptureCallback$ScrollCaptureSessionListener;", "", "", "onSessionStarted", "()V", "onSessionEnded"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface ScrollCaptureSessionListener {
        void onSessionEnded();

        void onSessionStarted();
    }

    public ComposeScrollCaptureCallback(androidx.compose.ui.semantics.SemanticsNode semanticsNode, androidx.compose.ui.unit.IntRect intRect, kotlinx.coroutines.CoroutineScope coroutineScope, androidx.compose.ui.scrollcapture.ComposeScrollCaptureCallback.ScrollCaptureSessionListener scrollCaptureSessionListener, android.view.View view) {
        this.getHighSpeedVideoFpsRangesFor = semanticsNode;
        this.getHighSpeedVideoSizes = intRect;
        this.getHighResolutionOutputSizeshNQ4ISI = scrollCaptureSessionListener;
        this.getHighSpeedVideoFpsRanges = view;
        this.Camera2StreamConfigurationMap = kotlinx.coroutines.CoroutineScopeKt.plus(coroutineScope, androidx.compose.ui.scrollcapture.DisableAnimationMotionDurationScale.INSTANCE);
        this.getInputFormats = new androidx.compose.ui.scrollcapture.RelativeScroller(intRect.getHeight(), new androidx.compose.ui.scrollcapture.ComposeScrollCaptureCallback$scrollTracker$1(this, null));
    }

    @Override // android.view.ScrollCaptureCallback
    public final void onScrollCaptureSearch(android.os.CancellationSignal signal, java.util.function.Consumer<android.graphics.Rect> onReady) {
        onReady.accept(androidx.compose.ui.graphics.RectHelper_androidKt.toAndroidRect(this.getHighSpeedVideoSizes));
    }

    @Override // android.view.ScrollCaptureCallback
    public final void onScrollCaptureStart(android.view.ScrollCaptureSession session, android.os.CancellationSignal signal, java.lang.Runnable onReady) {
        this.getInputFormats.getHighSpeedVideoFpsRangesFor = 0.0f;
        this.getOutputFormats = 0;
        this.getHighResolutionOutputSizeshNQ4ISI.onSessionStarted();
        onReady.run();
    }

    @Override // android.view.ScrollCaptureCallback
    public final void onScrollCaptureImageRequest(android.view.ScrollCaptureSession session, android.os.CancellationSignal signal, android.graphics.Rect captureArea, java.util.function.Consumer<android.graphics.Rect> onComplete) {
        androidx.compose.ui.scrollcapture.ComposeScrollCaptureCallback_androidKt.access$launchWithCancellationSignal(this.Camera2StreamConfigurationMap, signal, new androidx.compose.ui.scrollcapture.ComposeScrollCaptureCallback$onScrollCaptureImageRequest$1(this, session, captureArea, onComplete, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00b4, code lost:
    
        if (r4 != r1) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0139, code lost:
    
        if (r4 == r1) goto L67;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object aW_(android.view.ScrollCaptureSession scrollCaptureSession, androidx.compose.ui.unit.IntRect intRect, kotlin.coroutines.Continuation<? super androidx.compose.ui.unit.IntRect> continuation) {
        androidx.compose.ui.scrollcapture.ComposeScrollCaptureCallback$onScrollCaptureImageRequest$2 composeScrollCaptureCallback$onScrollCaptureImageRequest$2;
        java.lang.Object coroutine_suspended;
        int i;
        int top;
        int bottom;
        java.lang.Object Camera2StreamConfigurationMap;
        java.lang.Object Camera2StreamConfigurationMap2;
        androidx.compose.ui.scrollcapture.ComposeScrollCaptureCallback$onScrollCaptureImageRequest$3 composeScrollCaptureCallback$onScrollCaptureImageRequest$3;
        android.view.ScrollCaptureSession scrollCaptureSession2;
        androidx.compose.ui.unit.IntRect intRect2;
        int i2;
        int i3;
        int coerceIn;
        int coerceIn2;
        if (continuation instanceof androidx.compose.ui.scrollcapture.ComposeScrollCaptureCallback$onScrollCaptureImageRequest$2) {
            composeScrollCaptureCallback$onScrollCaptureImageRequest$2 = (androidx.compose.ui.scrollcapture.ComposeScrollCaptureCallback$onScrollCaptureImageRequest$2) continuation;
            if ((composeScrollCaptureCallback$onScrollCaptureImageRequest$2.getHighSpeedVideoFpsRanges & Integer.MIN_VALUE) != 0) {
                composeScrollCaptureCallback$onScrollCaptureImageRequest$2.getHighSpeedVideoFpsRanges -= 2147483648;
                java.lang.Object obj = composeScrollCaptureCallback$onScrollCaptureImageRequest$2.getOutputFormats;
                coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = composeScrollCaptureCallback$onScrollCaptureImageRequest$2.getHighSpeedVideoFpsRanges;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    top = intRect.getTop();
                    bottom = intRect.getBottom();
                    if (androidx.compose.ui.ComposeUiFlags.isScrollCaptureCenteringEnabled) {
                        androidx.compose.ui.scrollcapture.RelativeScroller relativeScroller = this.getInputFormats;
                        composeScrollCaptureCallback$onScrollCaptureImageRequest$2.getHighSpeedVideoSizes = scrollCaptureSession;
                        composeScrollCaptureCallback$onScrollCaptureImageRequest$2.getHighResolutionOutputSizeshNQ4ISI = intRect;
                        composeScrollCaptureCallback$onScrollCaptureImageRequest$2.getHighSpeedVideoFpsRangesFor = top;
                        composeScrollCaptureCallback$onScrollCaptureImageRequest$2.Camera2StreamConfigurationMap = bottom;
                        composeScrollCaptureCallback$onScrollCaptureImageRequest$2.getHighSpeedVideoFpsRanges = 1;
                        if (top > bottom) {
                            java.lang.StringBuilder sb = new java.lang.StringBuilder("Expected min=");
                            sb.append(top);
                            sb.append(" ≤ max=");
                            sb.append(bottom);
                            throw new java.lang.IllegalArgumentException(sb.toString().toString());
                        }
                        int i4 = bottom - top;
                        int i5 = relativeScroller.Camera2StreamConfigurationMap;
                        if (i4 > i5) {
                            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Expected range (");
                            sb2.append(i4);
                            sb2.append(") to be ≤ viewportSize=");
                            sb2.append(relativeScroller.Camera2StreamConfigurationMap);
                            throw new java.lang.IllegalArgumentException(sb2.toString().toString());
                        }
                        float f = top;
                        float f2 = relativeScroller.getHighSpeedVideoFpsRangesFor;
                        if (f >= f2 && bottom <= f2 + i5) {
                            Camera2StreamConfigurationMap2 = kotlin.Unit.INSTANCE;
                        } else {
                            Camera2StreamConfigurationMap2 = relativeScroller.Camera2StreamConfigurationMap((((i4 / 2) + top) - (i5 / 2)) - relativeScroller.getHighSpeedVideoFpsRangesFor, composeScrollCaptureCallback$onScrollCaptureImageRequest$2);
                            if (Camera2StreamConfigurationMap2 != kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                                Camera2StreamConfigurationMap2 = kotlin.Unit.INSTANCE;
                            }
                            if (Camera2StreamConfigurationMap2 != kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                                Camera2StreamConfigurationMap2 = kotlin.Unit.INSTANCE;
                            }
                        }
                    } else {
                        androidx.compose.ui.scrollcapture.RelativeScroller relativeScroller2 = this.getInputFormats;
                        composeScrollCaptureCallback$onScrollCaptureImageRequest$2.getHighSpeedVideoSizes = scrollCaptureSession;
                        composeScrollCaptureCallback$onScrollCaptureImageRequest$2.getHighResolutionOutputSizeshNQ4ISI = intRect;
                        composeScrollCaptureCallback$onScrollCaptureImageRequest$2.getHighSpeedVideoFpsRangesFor = top;
                        composeScrollCaptureCallback$onScrollCaptureImageRequest$2.Camera2StreamConfigurationMap = bottom;
                        composeScrollCaptureCallback$onScrollCaptureImageRequest$2.getHighSpeedVideoFpsRanges = 2;
                        if (top > bottom) {
                            java.lang.StringBuilder sb3 = new java.lang.StringBuilder("Expected min=");
                            sb3.append(top);
                            sb3.append(" ≤ max=");
                            sb3.append(bottom);
                            throw new java.lang.IllegalArgumentException(sb3.toString().toString());
                        }
                        int i6 = bottom - top;
                        int i7 = relativeScroller2.Camera2StreamConfigurationMap;
                        if (i6 > i7) {
                            java.lang.StringBuilder sb4 = new java.lang.StringBuilder("Expected range (");
                            sb4.append(i6);
                            sb4.append(") to be ≤ viewportSize=");
                            sb4.append(relativeScroller2.Camera2StreamConfigurationMap);
                            throw new java.lang.IllegalArgumentException(sb4.toString().toString());
                        }
                        float f3 = top;
                        float f4 = relativeScroller2.getHighSpeedVideoFpsRangesFor;
                        if (f3 >= f4 && bottom <= i7 + f4) {
                            Camera2StreamConfigurationMap = kotlin.Unit.INSTANCE;
                        } else {
                            Camera2StreamConfigurationMap = relativeScroller2.Camera2StreamConfigurationMap((f3 >= f4 ? bottom - i7 : top) - relativeScroller2.getHighSpeedVideoFpsRangesFor, composeScrollCaptureCallback$onScrollCaptureImageRequest$2);
                            if (Camera2StreamConfigurationMap != kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                                Camera2StreamConfigurationMap = kotlin.Unit.INSTANCE;
                            }
                            if (Camera2StreamConfigurationMap != kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                                Camera2StreamConfigurationMap = kotlin.Unit.INSTANCE;
                            }
                        }
                    }
                    androidx.compose.ui.scrollcapture.RelativeScroller relativeScroller3 = this.getInputFormats;
                    coerceIn = kotlin.ranges.RangesKt.coerceIn(i2 - kotlin.math.MathKt.roundToInt(relativeScroller3.getHighSpeedVideoFpsRangesFor), 0, relativeScroller3.Camera2StreamConfigurationMap);
                    androidx.compose.ui.scrollcapture.RelativeScroller relativeScroller4 = this.getInputFormats;
                    coerceIn2 = kotlin.ranges.RangesKt.coerceIn(i3 - kotlin.math.MathKt.roundToInt(relativeScroller4.getHighSpeedVideoFpsRangesFor), 0, relativeScroller4.Camera2StreamConfigurationMap);
                    androidx.compose.ui.unit.IntRect copy$default = androidx.compose.ui.unit.IntRect.copy$default(intRect2, 0, coerceIn, 0, coerceIn2, 5, null);
                    if (coerceIn == coerceIn2) {
                    }
                } else {
                    if (i != 1 && i != 2) {
                        if (i != 3) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        i3 = composeScrollCaptureCallback$onScrollCaptureImageRequest$2.Camera2StreamConfigurationMap;
                        i2 = composeScrollCaptureCallback$onScrollCaptureImageRequest$2.getHighSpeedVideoFpsRangesFor;
                        intRect2 = (androidx.compose.ui.unit.IntRect) composeScrollCaptureCallback$onScrollCaptureImageRequest$2.getHighResolutionOutputSizeshNQ4ISI;
                        scrollCaptureSession2 = (android.view.ScrollCaptureSession) composeScrollCaptureCallback$onScrollCaptureImageRequest$2.getHighSpeedVideoSizes;
                        kotlin.ResultKt.throwOnFailure(obj);
                        androidx.compose.ui.scrollcapture.RelativeScroller relativeScroller32 = this.getInputFormats;
                        coerceIn = kotlin.ranges.RangesKt.coerceIn(i2 - kotlin.math.MathKt.roundToInt(relativeScroller32.getHighSpeedVideoFpsRangesFor), 0, relativeScroller32.Camera2StreamConfigurationMap);
                        androidx.compose.ui.scrollcapture.RelativeScroller relativeScroller42 = this.getInputFormats;
                        coerceIn2 = kotlin.ranges.RangesKt.coerceIn(i3 - kotlin.math.MathKt.roundToInt(relativeScroller42.getHighSpeedVideoFpsRangesFor), 0, relativeScroller42.Camera2StreamConfigurationMap);
                        androidx.compose.ui.unit.IntRect copy$default2 = androidx.compose.ui.unit.IntRect.copy$default(intRect2, 0, coerceIn, 0, coerceIn2, 5, null);
                        if (coerceIn == coerceIn2) {
                            return androidx.compose.ui.unit.IntRect.INSTANCE.getZero();
                        }
                        android.graphics.Canvas lockHardwareCanvas = scrollCaptureSession2.getSurface().lockHardwareCanvas();
                        try {
                            lockHardwareCanvas.save();
                            lockHardwareCanvas.translate(-copy$default2.getLeft(), -copy$default2.getTop());
                            lockHardwareCanvas.translate(-this.getHighSpeedVideoSizes.getLeft(), -this.getHighSpeedVideoSizes.getTop());
                            this.getHighSpeedVideoFpsRanges.getRootView().draw(lockHardwareCanvas);
                            scrollCaptureSession2.getSurface().unlockCanvasAndPost(lockHardwareCanvas);
                            return copy$default2.translate(0, kotlin.math.MathKt.roundToInt(this.getInputFormats.getHighSpeedVideoFpsRangesFor));
                        } catch (java.lang.Throwable th) {
                            scrollCaptureSession2.getSurface().unlockCanvasAndPost(lockHardwareCanvas);
                            throw th;
                        }
                    }
                    int i8 = composeScrollCaptureCallback$onScrollCaptureImageRequest$2.Camera2StreamConfigurationMap;
                    int i9 = composeScrollCaptureCallback$onScrollCaptureImageRequest$2.getHighSpeedVideoFpsRangesFor;
                    androidx.compose.ui.unit.IntRect intRect3 = (androidx.compose.ui.unit.IntRect) composeScrollCaptureCallback$onScrollCaptureImageRequest$2.getHighResolutionOutputSizeshNQ4ISI;
                    android.view.ScrollCaptureSession scrollCaptureSession3 = (android.view.ScrollCaptureSession) composeScrollCaptureCallback$onScrollCaptureImageRequest$2.getHighSpeedVideoSizes;
                    kotlin.ResultKt.throwOnFailure(obj);
                    top = i9;
                    intRect = intRect3;
                    bottom = i8;
                    scrollCaptureSession = scrollCaptureSession3;
                }
                composeScrollCaptureCallback$onScrollCaptureImageRequest$3 = new kotlin.jvm.functions.Function1<java.lang.Long, kotlin.Unit>() { // from class: androidx.compose.ui.scrollcapture.ComposeScrollCaptureCallback$onScrollCaptureImageRequest$3
                    public final void getHighResolutionOutputSizeshNQ4ISI(long j) {
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final /* synthetic */ kotlin.Unit invoke(java.lang.Long l) {
                        getHighResolutionOutputSizeshNQ4ISI(l.longValue());
                        return kotlin.Unit.INSTANCE;
                    }
                };
                composeScrollCaptureCallback$onScrollCaptureImageRequest$2.getHighSpeedVideoSizes = scrollCaptureSession;
                composeScrollCaptureCallback$onScrollCaptureImageRequest$2.getHighResolutionOutputSizeshNQ4ISI = intRect;
                composeScrollCaptureCallback$onScrollCaptureImageRequest$2.getHighSpeedVideoFpsRangesFor = top;
                composeScrollCaptureCallback$onScrollCaptureImageRequest$2.Camera2StreamConfigurationMap = bottom;
                composeScrollCaptureCallback$onScrollCaptureImageRequest$2.getHighSpeedVideoFpsRanges = 3;
                if (androidx.compose.runtime.MonotonicFrameClockKt.withFrameNanos(composeScrollCaptureCallback$onScrollCaptureImageRequest$3, composeScrollCaptureCallback$onScrollCaptureImageRequest$2) != coroutine_suspended) {
                    scrollCaptureSession2 = scrollCaptureSession;
                    intRect2 = intRect;
                    i2 = top;
                    i3 = bottom;
                    androidx.compose.ui.scrollcapture.RelativeScroller relativeScroller322 = this.getInputFormats;
                    coerceIn = kotlin.ranges.RangesKt.coerceIn(i2 - kotlin.math.MathKt.roundToInt(relativeScroller322.getHighSpeedVideoFpsRangesFor), 0, relativeScroller322.Camera2StreamConfigurationMap);
                    androidx.compose.ui.scrollcapture.RelativeScroller relativeScroller422 = this.getInputFormats;
                    coerceIn2 = kotlin.ranges.RangesKt.coerceIn(i3 - kotlin.math.MathKt.roundToInt(relativeScroller422.getHighSpeedVideoFpsRangesFor), 0, relativeScroller422.Camera2StreamConfigurationMap);
                    androidx.compose.ui.unit.IntRect copy$default22 = androidx.compose.ui.unit.IntRect.copy$default(intRect2, 0, coerceIn, 0, coerceIn2, 5, null);
                    if (coerceIn == coerceIn2) {
                    }
                }
                return coroutine_suspended;
            }
        }
        composeScrollCaptureCallback$onScrollCaptureImageRequest$2 = new androidx.compose.ui.scrollcapture.ComposeScrollCaptureCallback$onScrollCaptureImageRequest$2(this, continuation);
        java.lang.Object obj2 = composeScrollCaptureCallback$onScrollCaptureImageRequest$2.getOutputFormats;
        coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = composeScrollCaptureCallback$onScrollCaptureImageRequest$2.getHighSpeedVideoFpsRanges;
        if (i != 0) {
        }
        composeScrollCaptureCallback$onScrollCaptureImageRequest$3 = new kotlin.jvm.functions.Function1<java.lang.Long, kotlin.Unit>() { // from class: androidx.compose.ui.scrollcapture.ComposeScrollCaptureCallback$onScrollCaptureImageRequest$3
            public final void getHighResolutionOutputSizeshNQ4ISI(long j) {
            }

            @Override // kotlin.jvm.functions.Function1
            public final /* synthetic */ kotlin.Unit invoke(java.lang.Long l) {
                getHighResolutionOutputSizeshNQ4ISI(l.longValue());
                return kotlin.Unit.INSTANCE;
            }
        };
        composeScrollCaptureCallback$onScrollCaptureImageRequest$2.getHighSpeedVideoSizes = scrollCaptureSession;
        composeScrollCaptureCallback$onScrollCaptureImageRequest$2.getHighResolutionOutputSizeshNQ4ISI = intRect;
        composeScrollCaptureCallback$onScrollCaptureImageRequest$2.getHighSpeedVideoFpsRangesFor = top;
        composeScrollCaptureCallback$onScrollCaptureImageRequest$2.Camera2StreamConfigurationMap = bottom;
        composeScrollCaptureCallback$onScrollCaptureImageRequest$2.getHighSpeedVideoFpsRanges = 3;
        if (androidx.compose.runtime.MonotonicFrameClockKt.withFrameNanos(composeScrollCaptureCallback$onScrollCaptureImageRequest$3, composeScrollCaptureCallback$onScrollCaptureImageRequest$2) != coroutine_suspended) {
        }
        return coroutine_suspended;
    }

    @Override // android.view.ScrollCaptureCallback
    public final void onScrollCaptureEnd(java.lang.Runnable onReady) {
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(this.Camera2StreamConfigurationMap, kotlinx.coroutines.NonCancellable.INSTANCE, null, new androidx.compose.ui.scrollcapture.ComposeScrollCaptureCallback$onScrollCaptureEnd$1(this, onReady, null), 2, null);
    }
}
