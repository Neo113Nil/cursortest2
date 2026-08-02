package androidx.compose.foundation.layout;

@kotlin.Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B'\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0010H\u0082@¢\u0006\u0004\b\u000e\u0010\u0011J\u001f\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0004\u001a\u00020\u00122\u0006\u0010\u0006\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J'\u0010\u0019\u001a\u00020\u00122\u0006\u0010\u0004\u001a\u00020\u00122\u0006\u0010\u0006\u001a\u00020\u00122\u0006\u0010\b\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u0004\u001a\u00020\u00122\u0006\u0010\u0006\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0018\u0010 \u001a\u00020\u001d2\u0006\u0010\u0004\u001a\u00020\u001dH\u0096@¢\u0006\u0004\b\u001e\u0010\u001fJ \u0010#\u001a\u00020\u001d2\u0006\u0010\u0004\u001a\u00020\u001d2\u0006\u0010\u0006\u001a\u00020\u001dH\u0096@¢\u0006\u0004\b!\u0010\"J(\u0010\u000e\u001a\u00020\u001d2\u0006\u0010\u0004\u001a\u00020\u001d2\u0006\u0010\u0006\u001a\u00020\u001a2\u0006\u0010\b\u001a\u00020$H\u0082@¢\u0006\u0004\b\u000e\u0010%J\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0004\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u000e\u0010&J\u001f\u0010(\u001a\u00020\r2\u0006\u0010\u0004\u001a\u00020\u00102\u0006\u0010\u0006\u001a\u00020'H\u0016¢\u0006\u0004\b(\u0010)J\r\u0010\u001b\u001a\u00020\r¢\u0006\u0004\b\u001b\u0010\u000fJ\u0017\u0010*\u001a\u00020\r2\u0006\u0010\u0004\u001a\u00020\u0010H\u0016¢\u0006\u0004\b*\u0010+J\u0019\u0010,\u001a\u00020\r2\b\u0010\u0004\u001a\u0004\u0018\u00010\u0010H\u0016¢\u0006\u0004\b,\u0010+J\u000f\u0010-\u001a\u00020\rH\u0002¢\u0006\u0004\b-\u0010\u000fR\u0011\u0010\u001b\u001a\u00020\u00038\u0006¢\u0006\u0006\n\u0004\b.\u0010/R\u0011\u0010\u000e\u001a\u00020\u00058\u0006¢\u0006\u0006\n\u0004\b0\u00101R\u0011\u00104\u001a\u00020\u00078\u0006¢\u0006\u0006\n\u0004\b2\u00103R\u0011\u00105\u001a\u00020\t8\u0006¢\u0006\u0006\n\u0004\b5\u00106R\u0018\u0010-\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u00107R\u0016\u00108\u001a\u00020$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u00109R\u0014\u0010.\u001a\u00020:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u0010;R\u0016\u00102\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010=R\u0018\u0010<\u001a\u0004\u0018\u00010>8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010?R \u00100\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0018\u00010@8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010A"}, d2 = {"Landroidx/compose/foundation/layout/WindowInsetsNestedScrollConnection;", "Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "Landroid/view/WindowInsetsAnimationControlListener;", "Landroidx/compose/foundation/layout/AndroidWindowInsets;", "p0", "Landroid/view/View;", "p1", "Landroidx/compose/foundation/layout/SideCalculator;", "p2", "Landroidx/compose/ui/unit/Density;", "p3", "<init>", "(Landroidx/compose/foundation/layout/AndroidWindowInsets;Landroid/view/View;Landroidx/compose/foundation/layout/SideCalculator;Landroidx/compose/ui/unit/Density;)V", "", "getHighResolutionOutputSizeshNQ4ISI", "()V", "Landroid/view/WindowInsetsAnimationController;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/compose/ui/geometry/Offset;", "Landroidx/compose/ui/input/nestedscroll/NestedScrollSource;", "onPreScroll-OzD1aCk", "(JI)J", "onPreScroll", "onPostScroll-DzOQY0M", "(JJI)J", "onPostScroll", "", "Camera2StreamConfigurationMap", "(JF)J", "Landroidx/compose/ui/unit/Velocity;", "onPreFling-QWom1Mo", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onPreFling", "onPostFling-RZ2iAVY", "(JJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onPostFling", "", "(JFZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "(F)V", "", "onReady", "(Landroid/view/WindowInsetsAnimationController;I)V", "onFinished", "(Landroid/view/WindowInsetsAnimationController;)V", "onCancelled", "getHighSpeedVideoFpsRanges", "getOutputMinFrameDuration", "Landroidx/compose/foundation/layout/AndroidWindowInsets;", "getOutputFormats", "Landroid/view/View;", "getHighSpeedVideoSizesFor", "Landroidx/compose/foundation/layout/SideCalculator;", "getHighSpeedVideoFpsRangesFor", "getHighSpeedVideoSizes", "Landroidx/compose/ui/unit/Density;", "Landroid/view/WindowInsetsAnimationController;", "getInputFormats", "Z", "Landroid/os/CancellationSignal;", "Landroid/os/CancellationSignal;", "getInputSizeshNQ4ISI", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER, "Lkotlinx/coroutines/Job;", "Lkotlinx/coroutines/Job;", "Lkotlinx/coroutines/CancellableContinuation;", "Lkotlinx/coroutines/CancellableContinuation;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class WindowInsetsNestedScrollConnection implements androidx.compose.ui.input.nestedscroll.NestedScrollConnection, android.view.WindowInsetsAnimationControlListener {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private kotlinx.coroutines.CancellableContinuation<? super android.view.WindowInsetsAnimationController> getOutputFormats;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private kotlinx.coroutines.Job getInputSizeshNQ4ISI;
    private android.view.WindowInsetsAnimationController getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final android.os.CancellationSignal getOutputMinFrameDuration = new android.os.CancellationSignal();
    private final androidx.compose.ui.unit.Density getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoSizesFor, reason: from kotlin metadata */
    private final androidx.compose.foundation.layout.SideCalculator getHighSpeedVideoFpsRangesFor;
    private boolean getInputFormats;

    /* renamed from: getInputSizeshNQ4ISI, reason: from kotlin metadata */
    private float getHighSpeedVideoSizesFor;

    /* renamed from: getOutputFormats, reason: from kotlin metadata */
    private final android.view.View getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getOutputMinFrameDuration, reason: from kotlin metadata */
    private final androidx.compose.foundation.layout.AndroidWindowInsets Camera2StreamConfigurationMap;

    public WindowInsetsNestedScrollConnection(androidx.compose.foundation.layout.AndroidWindowInsets androidWindowInsets, android.view.View view, androidx.compose.foundation.layout.SideCalculator sideCalculator, androidx.compose.ui.unit.Density density) {
        this.Camera2StreamConfigurationMap = androidWindowInsets;
        this.getHighResolutionOutputSizeshNQ4ISI = view;
        this.getHighSpeedVideoFpsRangesFor = sideCalculator;
        this.getHighSpeedVideoSizes = density;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void getHighResolutionOutputSizeshNQ4ISI() {
        if (this.getInputFormats) {
            return;
        }
        this.getInputFormats = true;
        android.view.WindowInsetsController windowInsetsController = this.getHighResolutionOutputSizeshNQ4ISI.getWindowInsetsController();
        if (windowInsetsController != null) {
            windowInsetsController.controlWindowInsetsAnimation(this.Camera2StreamConfigurationMap.getGetHighSpeedVideoFpsRangesFor(), -1L, null, this.getOutputMinFrameDuration, this);
        }
    }

    private final java.lang.Object getHighResolutionOutputSizeshNQ4ISI(kotlin.coroutines.Continuation<? super android.view.WindowInsetsAnimationController> continuation) {
        java.lang.Object obj = this.getHighSpeedVideoFpsRanges;
        if (obj == null) {
            kotlinx.coroutines.CancellableContinuationImpl cancellableContinuationImpl = new kotlinx.coroutines.CancellableContinuationImpl(kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(continuation), 1);
            cancellableContinuationImpl.initCancellability();
            this.getOutputFormats = cancellableContinuationImpl;
            getHighResolutionOutputSizeshNQ4ISI();
            obj = cancellableContinuationImpl.getResult();
            if (obj == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(continuation);
            }
        }
        return obj;
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* renamed from: onPreScroll-OzD1aCk, reason: not valid java name */
    public final long mo1754onPreScrollOzD1aCk(long p0, int p1) {
        return Camera2StreamConfigurationMap(p0, this.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoFpsRanges(java.lang.Float.intBitsToFloat((int) (p0 >> 32)), java.lang.Float.intBitsToFloat((int) (4294967295L & p0))));
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* renamed from: onPostScroll-DzOQY0M */
    public final long mo1529onPostScrollDzOQY0M(long p0, long p1, int p2) {
        return Camera2StreamConfigurationMap(p1, this.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoSizes(java.lang.Float.intBitsToFloat((int) (p1 >> 32)), java.lang.Float.intBitsToFloat((int) (4294967295L & p1))));
    }

    private final long Camera2StreamConfigurationMap(long p0, float p1) {
        kotlinx.coroutines.Job job = this.getInputSizeshNQ4ISI;
        if (job != null) {
            job.cancel((java.util.concurrent.CancellationException) new androidx.compose.foundation.layout.WindowInsetsAnimationCancelledException());
            this.getInputSizeshNQ4ISI = null;
        }
        android.view.WindowInsetsAnimationController windowInsetsAnimationController = this.getHighSpeedVideoFpsRanges;
        if (p1 != 0.0f) {
            if (this.Camera2StreamConfigurationMap.isVisible() != (p1 > 0.0f) || windowInsetsAnimationController != null) {
                if (windowInsetsAnimationController == null) {
                    this.getHighSpeedVideoSizesFor = 0.0f;
                    getHighResolutionOutputSizeshNQ4ISI();
                    return this.getHighSpeedVideoFpsRangesFor.mo1721consumedOffsetsMKHz9U(p0);
                }
                int valueOf = this.getHighSpeedVideoFpsRangesFor.valueOf(windowInsetsAnimationController.getHiddenStateInsets());
                int valueOf2 = this.getHighSpeedVideoFpsRangesFor.valueOf(windowInsetsAnimationController.getShownStateInsets());
                android.graphics.Insets currentInsets = windowInsetsAnimationController.getCurrentInsets();
                int valueOf3 = this.getHighSpeedVideoFpsRangesFor.valueOf(currentInsets);
                if (valueOf3 == (p1 > 0.0f ? valueOf2 : valueOf)) {
                    this.getHighSpeedVideoSizesFor = 0.0f;
                    return androidx.compose.ui.geometry.Offset.INSTANCE.m5768getZeroF1C5BW0();
                }
                float f = valueOf3 + p1 + this.getHighSpeedVideoSizesFor;
                int coerceIn = kotlin.ranges.RangesKt.coerceIn(java.lang.Math.round(f), valueOf, valueOf2);
                this.getHighSpeedVideoSizesFor = f - java.lang.Math.round(f);
                if (coerceIn != valueOf3) {
                    windowInsetsAnimationController.setInsetsAndAlpha(this.getHighSpeedVideoFpsRangesFor.adjustInsets(currentInsets, coerceIn), 1.0f, 0.0f);
                }
                return this.getHighSpeedVideoFpsRangesFor.mo1721consumedOffsetsMKHz9U(p0);
            }
        }
        return androidx.compose.ui.geometry.Offset.INSTANCE.m5768getZeroF1C5BW0();
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* renamed from: onPreFling-QWom1Mo, reason: not valid java name */
    public final java.lang.Object mo1753onPreFlingQWom1Mo(long j, kotlin.coroutines.Continuation<? super androidx.compose.ui.unit.Velocity> continuation) {
        return getHighResolutionOutputSizeshNQ4ISI(j, this.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoFpsRanges(androidx.compose.ui.unit.Velocity.m8839getXimpl(j), androidx.compose.ui.unit.Velocity.m8840getYimpl(j)), false, continuation);
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* renamed from: onPostFling-RZ2iAVY */
    public final java.lang.Object mo1528onPostFlingRZ2iAVY(long j, long j2, kotlin.coroutines.Continuation<? super androidx.compose.ui.unit.Velocity> continuation) {
        return getHighResolutionOutputSizeshNQ4ISI(j2, this.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoSizes(androidx.compose.ui.unit.Velocity.m8839getXimpl(j2), androidx.compose.ui.unit.Velocity.m8840getYimpl(j2)), true, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getHighResolutionOutputSizeshNQ4ISI(long j, float f, boolean z, kotlin.coroutines.Continuation<? super androidx.compose.ui.unit.Velocity> continuation) {
        androidx.compose.foundation.layout.WindowInsetsNestedScrollConnection$fling$1 windowInsetsNestedScrollConnection$fling$1;
        int i;
        float f2;
        long j2;
        android.view.WindowInsetsAnimationController windowInsetsAnimationController;
        long j3;
        kotlin.jvm.internal.Ref.FloatRef floatRef;
        long j4;
        if (continuation instanceof androidx.compose.foundation.layout.WindowInsetsNestedScrollConnection$fling$1) {
            windowInsetsNestedScrollConnection$fling$1 = (androidx.compose.foundation.layout.WindowInsetsNestedScrollConnection$fling$1) continuation;
            if ((windowInsetsNestedScrollConnection$fling$1.getHighResolutionOutputSizeshNQ4ISI & Integer.MIN_VALUE) != 0) {
                windowInsetsNestedScrollConnection$fling$1.getHighResolutionOutputSizeshNQ4ISI -= 2147483648;
                androidx.compose.foundation.layout.WindowInsetsNestedScrollConnection$fling$1 windowInsetsNestedScrollConnection$fling$12 = windowInsetsNestedScrollConnection$fling$1;
                java.lang.Object obj = windowInsetsNestedScrollConnection$fling$12.getHighSpeedVideoSizes;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = windowInsetsNestedScrollConnection$fling$12.getHighResolutionOutputSizeshNQ4ISI;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    kotlinx.coroutines.Job job = this.getInputSizeshNQ4ISI;
                    if (job != null) {
                        job.cancel((java.util.concurrent.CancellationException) new androidx.compose.foundation.layout.WindowInsetsAnimationCancelledException());
                    }
                    this.getInputSizeshNQ4ISI = null;
                    this.getHighSpeedVideoSizesFor = 0.0f;
                    if ((f == 0.0f && !z) || (this.getHighSpeedVideoFpsRanges == null && this.Camera2StreamConfigurationMap.isVisible() == z)) {
                        return androidx.compose.ui.unit.Velocity.m8830boximpl(androidx.compose.ui.unit.Velocity.INSTANCE.m8850getZero9UxMQ8M());
                    }
                    windowInsetsNestedScrollConnection$fling$12.getHighSpeedVideoFpsRanges = j;
                    windowInsetsNestedScrollConnection$fling$12.Camera2StreamConfigurationMap = f;
                    windowInsetsNestedScrollConnection$fling$12.getHighResolutionOutputSizeshNQ4ISI = 1;
                    java.lang.Object highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(windowInsetsNestedScrollConnection$fling$12);
                    if (highResolutionOutputSizeshNQ4ISI != coroutine_suspended) {
                        f2 = f;
                        j2 = j;
                        obj = highResolutionOutputSizeshNQ4ISI;
                    }
                    return coroutine_suspended;
                }
                if (i != 1) {
                    if (i == 2) {
                        j3 = windowInsetsNestedScrollConnection$fling$12.getHighSpeedVideoFpsRanges;
                        floatRef = (kotlin.jvm.internal.Ref.FloatRef) windowInsetsNestedScrollConnection$fling$12.getHighSpeedVideoFpsRangesFor;
                        kotlin.ResultKt.throwOnFailure(obj);
                        return androidx.compose.ui.unit.Velocity.m8830boximpl(this.getHighSpeedVideoFpsRangesFor.mo1722consumedVelocityQWom1Mo(j3, floatRef.element));
                    }
                    if (i != 3) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    j4 = windowInsetsNestedScrollConnection$fling$12.getHighSpeedVideoFpsRanges;
                    kotlin.ResultKt.throwOnFailure(obj);
                    return androidx.compose.ui.unit.Velocity.m8830boximpl(this.getHighSpeedVideoFpsRangesFor.mo1722consumedVelocityQWom1Mo(j4, 0.0f));
                }
                float f3 = windowInsetsNestedScrollConnection$fling$12.Camera2StreamConfigurationMap;
                j2 = windowInsetsNestedScrollConnection$fling$12.getHighSpeedVideoFpsRanges;
                kotlin.ResultKt.throwOnFailure(obj);
                f2 = f3;
                windowInsetsAnimationController = (android.view.WindowInsetsAnimationController) obj;
                if (windowInsetsAnimationController != null) {
                    return androidx.compose.ui.unit.Velocity.m8830boximpl(androidx.compose.ui.unit.Velocity.INSTANCE.m8850getZero9UxMQ8M());
                }
                int valueOf = this.getHighSpeedVideoFpsRangesFor.valueOf(windowInsetsAnimationController.getHiddenStateInsets());
                int valueOf2 = this.getHighSpeedVideoFpsRangesFor.valueOf(windowInsetsAnimationController.getShownStateInsets());
                int valueOf3 = this.getHighSpeedVideoFpsRangesFor.valueOf(windowInsetsAnimationController.getCurrentInsets());
                if ((f2 <= 0.0f && valueOf3 == valueOf) || (f2 >= 0.0f && valueOf3 == valueOf2)) {
                    windowInsetsAnimationController.finish(valueOf3 == valueOf2);
                    this.getHighSpeedVideoFpsRanges = null;
                    return androidx.compose.ui.unit.Velocity.m8830boximpl(androidx.compose.ui.unit.Velocity.INSTANCE.m8850getZero9UxMQ8M());
                }
                androidx.compose.foundation.layout.SplineBasedFloatDecayAnimationSpec splineBasedFloatDecayAnimationSpec = new androidx.compose.foundation.layout.SplineBasedFloatDecayAnimationSpec(this.getHighSpeedVideoSizes);
                float highSpeedVideoFpsRangesFor = valueOf3 + splineBasedFloatDecayAnimationSpec.getHighSpeedVideoFpsRangesFor(f2);
                float f4 = valueOf;
                boolean z2 = (highSpeedVideoFpsRangesFor - f4) / ((float) (valueOf2 - valueOf)) > 0.5f;
                int i2 = z2 ? valueOf2 : valueOf;
                if (highSpeedVideoFpsRangesFor > valueOf2 || highSpeedVideoFpsRangesFor < f4) {
                    long j5 = j2;
                    kotlin.jvm.internal.Ref.FloatRef floatRef2 = new kotlin.jvm.internal.Ref.FloatRef();
                    androidx.compose.foundation.layout.WindowInsetsNestedScrollConnection$fling$2 windowInsetsNestedScrollConnection$fling$2 = new androidx.compose.foundation.layout.WindowInsetsNestedScrollConnection$fling$2(this, valueOf3, f2, splineBasedFloatDecayAnimationSpec, valueOf, valueOf2, floatRef2, windowInsetsAnimationController, z2, null);
                    windowInsetsNestedScrollConnection$fling$12.getHighSpeedVideoFpsRangesFor = floatRef2;
                    windowInsetsNestedScrollConnection$fling$12.getHighSpeedVideoFpsRanges = j5;
                    windowInsetsNestedScrollConnection$fling$12.getHighResolutionOutputSizeshNQ4ISI = 2;
                    if (kotlinx.coroutines.CoroutineScopeKt.coroutineScope(windowInsetsNestedScrollConnection$fling$2, windowInsetsNestedScrollConnection$fling$12) != coroutine_suspended) {
                        j3 = j5;
                        floatRef = floatRef2;
                        return androidx.compose.ui.unit.Velocity.m8830boximpl(this.getHighSpeedVideoFpsRangesFor.mo1722consumedVelocityQWom1Mo(j3, floatRef.element));
                    }
                } else {
                    long j6 = j2;
                    androidx.compose.foundation.layout.WindowInsetsNestedScrollConnection$fling$3 windowInsetsNestedScrollConnection$fling$3 = new androidx.compose.foundation.layout.WindowInsetsNestedScrollConnection$fling$3(this, valueOf3, i2, f2, windowInsetsAnimationController, z2, null);
                    windowInsetsNestedScrollConnection$fling$12.getHighSpeedVideoFpsRanges = j6;
                    windowInsetsNestedScrollConnection$fling$12.getHighResolutionOutputSizeshNQ4ISI = 3;
                    if (kotlinx.coroutines.CoroutineScopeKt.coroutineScope(windowInsetsNestedScrollConnection$fling$3, windowInsetsNestedScrollConnection$fling$12) != coroutine_suspended) {
                        j4 = j6;
                        return androidx.compose.ui.unit.Velocity.m8830boximpl(this.getHighSpeedVideoFpsRangesFor.mo1722consumedVelocityQWom1Mo(j4, 0.0f));
                    }
                }
                return coroutine_suspended;
            }
        }
        windowInsetsNestedScrollConnection$fling$1 = new androidx.compose.foundation.layout.WindowInsetsNestedScrollConnection$fling$1(this, continuation);
        androidx.compose.foundation.layout.WindowInsetsNestedScrollConnection$fling$1 windowInsetsNestedScrollConnection$fling$122 = windowInsetsNestedScrollConnection$fling$1;
        java.lang.Object obj2 = windowInsetsNestedScrollConnection$fling$122.getHighSpeedVideoSizes;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = windowInsetsNestedScrollConnection$fling$122.getHighResolutionOutputSizeshNQ4ISI;
        if (i != 0) {
        }
        windowInsetsAnimationController = (android.view.WindowInsetsAnimationController) obj2;
        if (windowInsetsAnimationController != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void getHighResolutionOutputSizeshNQ4ISI(float p0) {
        android.view.WindowInsetsAnimationController windowInsetsAnimationController = this.getHighSpeedVideoFpsRanges;
        if (windowInsetsAnimationController != null) {
            windowInsetsAnimationController.setInsetsAndAlpha(this.getHighSpeedVideoFpsRangesFor.adjustInsets(windowInsetsAnimationController.getCurrentInsets(), java.lang.Math.round(p0)), 1.0f, 0.0f);
        }
    }

    @Override // android.view.WindowInsetsAnimationControlListener
    public final void onReady(android.view.WindowInsetsAnimationController p0, int p1) {
        this.getHighSpeedVideoFpsRanges = p0;
        this.getInputFormats = false;
        kotlinx.coroutines.CancellableContinuation<? super android.view.WindowInsetsAnimationController> cancellableContinuation = this.getOutputFormats;
        if (cancellableContinuation != null) {
            cancellableContinuation.resume((kotlinx.coroutines.CancellableContinuation<? super android.view.WindowInsetsAnimationController>) p0, (kotlin.jvm.functions.Function3<? super java.lang.Throwable, ? super kotlinx.coroutines.CancellableContinuation<? super android.view.WindowInsetsAnimationController>, ? super kotlin.coroutines.CoroutineContext, kotlin.Unit>) new kotlin.jvm.functions.Function3() { // from class: androidx.compose.foundation.layout.WindowInsetsNestedScrollConnection$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function3
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                    kotlin.Unit highSpeedVideoSizes;
                    highSpeedVideoSizes = androidx.compose.foundation.layout.WindowInsetsNestedScrollConnection.getHighSpeedVideoSizes();
                    return highSpeedVideoSizes;
                }
            });
        }
        this.getOutputFormats = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit getHighSpeedVideoSizes() {
        return kotlin.Unit.INSTANCE;
    }

    public final void Camera2StreamConfigurationMap() {
        kotlinx.coroutines.CancellableContinuation<? super android.view.WindowInsetsAnimationController> cancellableContinuation = this.getOutputFormats;
        if (cancellableContinuation != null) {
            cancellableContinuation.resume((kotlinx.coroutines.CancellableContinuation<? super android.view.WindowInsetsAnimationController>) null, new kotlin.jvm.functions.Function3() { // from class: androidx.compose.foundation.layout.WindowInsetsNestedScrollConnection$dispose$1
                @Override // kotlin.jvm.functions.Function3
                public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                    return kotlin.Unit.INSTANCE;
                }
            });
        }
        kotlinx.coroutines.Job job = this.getInputSizeshNQ4ISI;
        if (job != null) {
            kotlinx.coroutines.Job.DefaultImpls.cancel$default(job, (java.util.concurrent.CancellationException) null, 1, (java.lang.Object) null);
        }
        android.view.WindowInsetsAnimationController windowInsetsAnimationController = this.getHighSpeedVideoFpsRanges;
        if (windowInsetsAnimationController != null) {
            windowInsetsAnimationController.finish(!kotlin.jvm.internal.Intrinsics.areEqual(windowInsetsAnimationController.getCurrentInsets(), windowInsetsAnimationController.getHiddenStateInsets()));
        }
    }

    @Override // android.view.WindowInsetsAnimationControlListener
    public final void onFinished(android.view.WindowInsetsAnimationController p0) {
        getHighSpeedVideoFpsRanges();
    }

    @Override // android.view.WindowInsetsAnimationControlListener
    public final void onCancelled(android.view.WindowInsetsAnimationController p0) {
        getHighSpeedVideoFpsRanges();
    }

    private final void getHighSpeedVideoFpsRanges() {
        android.view.WindowInsetsAnimationController windowInsetsAnimationController;
        android.view.WindowInsetsAnimationController windowInsetsAnimationController2 = this.getHighSpeedVideoFpsRanges;
        if (windowInsetsAnimationController2 != null && windowInsetsAnimationController2.isReady() && (windowInsetsAnimationController = this.getHighSpeedVideoFpsRanges) != null) {
            windowInsetsAnimationController.finish(this.Camera2StreamConfigurationMap.isVisible());
        }
        this.getHighSpeedVideoFpsRanges = null;
        kotlinx.coroutines.CancellableContinuation<? super android.view.WindowInsetsAnimationController> cancellableContinuation = this.getOutputFormats;
        if (cancellableContinuation != null) {
            cancellableContinuation.resume((kotlinx.coroutines.CancellableContinuation<? super android.view.WindowInsetsAnimationController>) null, new kotlin.jvm.functions.Function3() { // from class: androidx.compose.foundation.layout.WindowInsetsNestedScrollConnection$animationEnded$1
                @Override // kotlin.jvm.functions.Function3
                public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                    return kotlin.Unit.INSTANCE;
                }
            });
        }
        this.getOutputFormats = null;
        kotlinx.coroutines.Job job = this.getInputSizeshNQ4ISI;
        if (job != null) {
            job.cancel((java.util.concurrent.CancellationException) new androidx.compose.foundation.layout.WindowInsetsAnimationCancelledException());
        }
        this.getInputSizeshNQ4ISI = null;
        this.getHighSpeedVideoSizesFor = 0.0f;
        this.getInputFormats = false;
    }
}
