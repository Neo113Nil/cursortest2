package androidx.compose.foundation.layout;

/* compiled from: WindowInsetsConnection.android.kt */
@kotlin.Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0006\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B%\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\u0010\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u0019H\u0002J\b\u0010#\u001a\u00020!H\u0002J\u0006\u0010$\u001a\u00020!J+\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020&2\u0006\u0010(\u001a\u00020\u00192\u0006\u0010)\u001a\u00020\u0017H\u0082@ø\u0001\u0000¢\u0006\u0004\b*\u0010+J\u0010\u0010,\u001a\u0004\u0018\u00010\rH\u0082@¢\u0006\u0002\u0010-J\u0012\u0010.\u001a\u00020!2\b\u0010/\u001a\u0004\u0018\u00010\rH\u0016J\u0010\u00100\u001a\u00020!2\u0006\u0010/\u001a\u00020\rH\u0016J#\u00101\u001a\u00020&2\u0006\u00102\u001a\u00020&2\u0006\u0010'\u001a\u00020&H\u0096@ø\u0001\u0000¢\u0006\u0004\b3\u00104J*\u00105\u001a\u0002062\u0006\u00102\u001a\u0002062\u0006\u0010'\u001a\u0002062\u0006\u00107\u001a\u000208H\u0016ø\u0001\u0000¢\u0006\u0004\b9\u0010:J\u001b\u0010;\u001a\u00020&2\u0006\u0010'\u001a\u00020&H\u0096@ø\u0001\u0000¢\u0006\u0004\b<\u0010=J\"\u0010>\u001a\u0002062\u0006\u0010'\u001a\u0002062\u0006\u00107\u001a\u000208H\u0016ø\u0001\u0000¢\u0006\u0004\b?\u0010@J\u0018\u0010A\u001a\u00020!2\u0006\u0010/\u001a\u00020\r2\u0006\u0010B\u001a\u00020CH\u0016J\b\u0010D\u001a\u00020!H\u0002J\"\u0010E\u001a\u0002062\u0006\u0010'\u001a\u0002062\u0006\u0010F\u001a\u00020\u0019H\u0002ø\u0001\u0000¢\u0006\u0004\bG\u0010HR\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\u0012\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\r\u0018\u00010\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001f\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006I"}, d2 = {"Landroidx/compose/foundation/layout/WindowInsetsNestedScrollConnection;", "Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "Landroid/view/WindowInsetsAnimationControlListener;", "windowInsets", "Landroidx/compose/foundation/layout/AndroidWindowInsets;", com.facebook.appevents.internal.ViewHierarchyConstants.VIEW_KEY, "Landroid/view/View;", "sideCalculator", "Landroidx/compose/foundation/layout/SideCalculator;", "density", "Landroidx/compose/ui/unit/Density;", "(Landroidx/compose/foundation/layout/AndroidWindowInsets;Landroid/view/View;Landroidx/compose/foundation/layout/SideCalculator;Landroidx/compose/ui/unit/Density;)V", "animationController", "Landroid/view/WindowInsetsAnimationController;", "animationJob", "Lkotlinx/coroutines/Job;", "cancellationSignal", "Landroid/os/CancellationSignal;", "continuation", "Lkotlinx/coroutines/CancellableContinuation;", "getDensity", "()Landroidx/compose/ui/unit/Density;", "isControllerRequested", "", "partialConsumption", "", "getSideCalculator", "()Landroidx/compose/foundation/layout/SideCalculator;", "getView", "()Landroid/view/View;", "getWindowInsets", "()Landroidx/compose/foundation/layout/AndroidWindowInsets;", "adjustInsets", "", "inset", "animationEnded", "dispose", "fling", "Landroidx/compose/ui/unit/Velocity;", "available", "flingAmount", "towardShown", "fling-huYlsQE", "(JFZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAnimationController", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onCancelled", "controller", "onFinished", "onPostFling", "consumed", "onPostFling-RZ2iAVY", "(JJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onPostScroll", "Landroidx/compose/ui/geometry/Offset;", "source", "Landroidx/compose/ui/input/nestedscroll/NestedScrollSource;", "onPostScroll-DzOQY0M", "(JJI)J", "onPreFling", "onPreFling-QWom1Mo", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onPreScroll", "onPreScroll-OzD1aCk", "(JI)J", "onReady", "types", "", "requestAnimationController", com.helpshift.proactive.InAppViewConstants.SCROLL, "scrollAmount", "scroll-8S9VItk", "(JF)J", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class WindowInsetsNestedScrollConnection implements androidx.compose.ui.input.nestedscroll.NestedScrollConnection, android.view.WindowInsetsAnimationControlListener {
    private android.view.WindowInsetsAnimationController animationController;
    private kotlinx.coroutines.Job animationJob;
    private final android.os.CancellationSignal cancellationSignal = new android.os.CancellationSignal();
    private kotlinx.coroutines.CancellableContinuation<? super android.view.WindowInsetsAnimationController> continuation;
    private final androidx.compose.ui.unit.Density density;
    private boolean isControllerRequested;
    private float partialConsumption;
    private final androidx.compose.foundation.layout.SideCalculator sideCalculator;
    private final android.view.View view;
    private final androidx.compose.foundation.layout.AndroidWindowInsets windowInsets;

    public WindowInsetsNestedScrollConnection(androidx.compose.foundation.layout.AndroidWindowInsets androidWindowInsets, android.view.View view, androidx.compose.foundation.layout.SideCalculator sideCalculator, androidx.compose.ui.unit.Density density) {
        this.windowInsets = androidWindowInsets;
        this.view = view;
        this.sideCalculator = sideCalculator;
        this.density = density;
    }

    public final androidx.compose.foundation.layout.AndroidWindowInsets getWindowInsets() {
        return this.windowInsets;
    }

    public final android.view.View getView() {
        return this.view;
    }

    public final androidx.compose.foundation.layout.SideCalculator getSideCalculator() {
        return this.sideCalculator;
    }

    public final androidx.compose.ui.unit.Density getDensity() {
        return this.density;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void requestAnimationController() {
        if (this.isControllerRequested) {
            return;
        }
        this.isControllerRequested = true;
        android.view.WindowInsetsController windowInsetsController = this.view.getWindowInsetsController();
        if (windowInsetsController != null) {
            windowInsetsController.controlWindowInsetsAnimation(this.windowInsets.getType(), -1L, null, this.cancellationSignal, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.lang.Object getAnimationController(kotlin.coroutines.Continuation<? super android.view.WindowInsetsAnimationController> continuation) {
        java.lang.Object obj = this.animationController;
        if (obj == null) {
            kotlinx.coroutines.CancellableContinuationImpl cancellableContinuationImpl = new kotlinx.coroutines.CancellableContinuationImpl(kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(continuation), 1);
            cancellableContinuationImpl.initCancellability();
            this.continuation = cancellableContinuationImpl;
            requestAnimationController();
            obj = cancellableContinuationImpl.getResult();
            if (obj == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(continuation);
            }
        }
        return obj;
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* renamed from: onPreScroll-OzD1aCk */
    public long mo404onPreScrollOzD1aCk(long available, int source) {
        return m646scroll8S9VItk(available, this.sideCalculator.hideMotion(androidx.compose.ui.geometry.Offset.m1871getXimpl(available), androidx.compose.ui.geometry.Offset.m1872getYimpl(available)));
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* renamed from: onPostScroll-DzOQY0M */
    public long mo402onPostScrollDzOQY0M(long consumed, long available, int source) {
        return m646scroll8S9VItk(available, this.sideCalculator.showMotion(androidx.compose.ui.geometry.Offset.m1871getXimpl(available), androidx.compose.ui.geometry.Offset.m1872getYimpl(available)));
    }

    /* renamed from: scroll-8S9VItk, reason: not valid java name */
    private final long m646scroll8S9VItk(long available, float scrollAmount) {
        kotlinx.coroutines.Job job = this.animationJob;
        if (job != null) {
            job.cancel((java.util.concurrent.CancellationException) new androidx.compose.foundation.layout.WindowInsetsAnimationCancelledException());
            this.animationJob = null;
        }
        android.view.WindowInsetsAnimationController windowInsetsAnimationController = this.animationController;
        if (scrollAmount != 0.0f) {
            if (this.windowInsets.isVisible() != (scrollAmount > 0.0f) || windowInsetsAnimationController != null) {
                if (windowInsetsAnimationController == null) {
                    this.partialConsumption = 0.0f;
                    requestAnimationController();
                    return this.sideCalculator.mo598consumedOffsetsMKHz9U(available);
                }
                int valueOf = this.sideCalculator.valueOf(windowInsetsAnimationController.getHiddenStateInsets());
                int valueOf2 = this.sideCalculator.valueOf(windowInsetsAnimationController.getShownStateInsets());
                android.graphics.Insets currentInsets = windowInsetsAnimationController.getCurrentInsets();
                int valueOf3 = this.sideCalculator.valueOf(currentInsets);
                if (valueOf3 == (scrollAmount > 0.0f ? valueOf2 : valueOf)) {
                    this.partialConsumption = 0.0f;
                    return androidx.compose.ui.geometry.Offset.INSTANCE.m1887getZeroF1C5BW0();
                }
                float f = valueOf3 + scrollAmount + this.partialConsumption;
                int coerceIn = kotlin.ranges.RangesKt.coerceIn(kotlin.math.MathKt.roundToInt(f), valueOf, valueOf2);
                this.partialConsumption = f - kotlin.math.MathKt.roundToInt(f);
                if (coerceIn != valueOf3) {
                    windowInsetsAnimationController.setInsetsAndAlpha(this.sideCalculator.adjustInsets(currentInsets, coerceIn), 1.0f, 0.0f);
                }
                return this.sideCalculator.mo598consumedOffsetsMKHz9U(available);
            }
        }
        return androidx.compose.ui.geometry.Offset.INSTANCE.m1887getZeroF1C5BW0();
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* renamed from: onPreFling-QWom1Mo */
    public java.lang.Object mo403onPreFlingQWom1Mo(long j, kotlin.coroutines.Continuation<? super androidx.compose.ui.unit.Velocity> continuation) {
        return m645flinghuYlsQE(j, this.sideCalculator.hideMotion(androidx.compose.ui.unit.Velocity.m4717getXimpl(j), androidx.compose.ui.unit.Velocity.m4718getYimpl(j)), false, continuation);
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* renamed from: onPostFling-RZ2iAVY */
    public java.lang.Object mo401onPostFlingRZ2iAVY(long j, long j2, kotlin.coroutines.Continuation<? super androidx.compose.ui.unit.Velocity> continuation) {
        return m645flinghuYlsQE(j2, this.sideCalculator.showMotion(androidx.compose.ui.unit.Velocity.m4717getXimpl(j2), androidx.compose.ui.unit.Velocity.m4718getYimpl(j2)), true, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0030  */
    /* renamed from: fling-huYlsQE, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object m645flinghuYlsQE(long j, float f, boolean z, kotlin.coroutines.Continuation<? super androidx.compose.ui.unit.Velocity> continuation) {
        androidx.compose.foundation.layout.WindowInsetsNestedScrollConnection$fling$1 windowInsetsNestedScrollConnection$fling$1;
        int i;
        long j2;
        androidx.compose.foundation.layout.WindowInsetsNestedScrollConnection windowInsetsNestedScrollConnection;
        android.view.WindowInsetsAnimationController windowInsetsAnimationController;
        androidx.compose.foundation.layout.WindowInsetsNestedScrollConnection windowInsetsNestedScrollConnection2;
        kotlin.jvm.internal.Ref.FloatRef floatRef;
        long j3;
        androidx.compose.foundation.layout.WindowInsetsNestedScrollConnection windowInsetsNestedScrollConnection3;
        long j4;
        float f2 = f;
        if (continuation instanceof androidx.compose.foundation.layout.WindowInsetsNestedScrollConnection$fling$1) {
            windowInsetsNestedScrollConnection$fling$1 = (androidx.compose.foundation.layout.WindowInsetsNestedScrollConnection$fling$1) continuation;
            if ((windowInsetsNestedScrollConnection$fling$1.label & Integer.MIN_VALUE) != 0) {
                windowInsetsNestedScrollConnection$fling$1.label -= Integer.MIN_VALUE;
                java.lang.Object obj = windowInsetsNestedScrollConnection$fling$1.result;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = windowInsetsNestedScrollConnection$fling$1.label;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    kotlinx.coroutines.Job job = this.animationJob;
                    if (job != null) {
                        job.cancel((java.util.concurrent.CancellationException) new androidx.compose.foundation.layout.WindowInsetsAnimationCancelledException());
                    }
                    this.animationJob = null;
                    this.partialConsumption = 0.0f;
                    if ((f2 == 0.0f && !z) || (this.animationController == null && this.windowInsets.isVisible() == z)) {
                        return androidx.compose.ui.unit.Velocity.m4708boximpl(androidx.compose.ui.unit.Velocity.INSTANCE.m4728getZero9UxMQ8M());
                    }
                    windowInsetsNestedScrollConnection$fling$1.L$0 = this;
                    windowInsetsNestedScrollConnection$fling$1.J$0 = j;
                    windowInsetsNestedScrollConnection$fling$1.F$0 = f2;
                    windowInsetsNestedScrollConnection$fling$1.label = 1;
                    java.lang.Object animationController = getAnimationController(windowInsetsNestedScrollConnection$fling$1);
                    if (animationController == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    j2 = j;
                    obj = animationController;
                    windowInsetsNestedScrollConnection = this;
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            j3 = windowInsetsNestedScrollConnection$fling$1.J$0;
                            floatRef = (kotlin.jvm.internal.Ref.FloatRef) windowInsetsNestedScrollConnection$fling$1.L$1;
                            windowInsetsNestedScrollConnection2 = (androidx.compose.foundation.layout.WindowInsetsNestedScrollConnection) windowInsetsNestedScrollConnection$fling$1.L$0;
                            kotlin.ResultKt.throwOnFailure(obj);
                            return androidx.compose.ui.unit.Velocity.m4708boximpl(windowInsetsNestedScrollConnection2.sideCalculator.mo599consumedVelocityQWom1Mo(j3, floatRef.element));
                        }
                        if (i != 3) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        j4 = windowInsetsNestedScrollConnection$fling$1.J$0;
                        windowInsetsNestedScrollConnection3 = (androidx.compose.foundation.layout.WindowInsetsNestedScrollConnection) windowInsetsNestedScrollConnection$fling$1.L$0;
                        kotlin.ResultKt.throwOnFailure(obj);
                        return androidx.compose.ui.unit.Velocity.m4708boximpl(windowInsetsNestedScrollConnection3.sideCalculator.mo599consumedVelocityQWom1Mo(j4, 0.0f));
                    }
                    f2 = windowInsetsNestedScrollConnection$fling$1.F$0;
                    j2 = windowInsetsNestedScrollConnection$fling$1.J$0;
                    windowInsetsNestedScrollConnection = (androidx.compose.foundation.layout.WindowInsetsNestedScrollConnection) windowInsetsNestedScrollConnection$fling$1.L$0;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                windowInsetsAnimationController = (android.view.WindowInsetsAnimationController) obj;
                if (windowInsetsAnimationController != null) {
                    return androidx.compose.ui.unit.Velocity.m4708boximpl(androidx.compose.ui.unit.Velocity.INSTANCE.m4728getZero9UxMQ8M());
                }
                int valueOf = windowInsetsNestedScrollConnection.sideCalculator.valueOf(windowInsetsAnimationController.getHiddenStateInsets());
                int valueOf2 = windowInsetsNestedScrollConnection.sideCalculator.valueOf(windowInsetsAnimationController.getShownStateInsets());
                int valueOf3 = windowInsetsNestedScrollConnection.sideCalculator.valueOf(windowInsetsAnimationController.getCurrentInsets());
                if ((f2 <= 0.0f && valueOf3 == valueOf) || (f2 >= 0.0f && valueOf3 == valueOf2)) {
                    windowInsetsAnimationController.finish(valueOf3 == valueOf2);
                    windowInsetsNestedScrollConnection.animationController = null;
                    return androidx.compose.ui.unit.Velocity.m4708boximpl(androidx.compose.ui.unit.Velocity.INSTANCE.m4728getZero9UxMQ8M());
                }
                androidx.compose.foundation.layout.SplineBasedFloatDecayAnimationSpec splineBasedFloatDecayAnimationSpec = new androidx.compose.foundation.layout.SplineBasedFloatDecayAnimationSpec(windowInsetsNestedScrollConnection.density);
                float flingDistance = valueOf3 + splineBasedFloatDecayAnimationSpec.flingDistance(f2);
                float f3 = valueOf;
                boolean z2 = (flingDistance - f3) / ((float) (valueOf2 - valueOf)) > 0.5f;
                int i2 = z2 ? valueOf2 : valueOf;
                if (flingDistance > valueOf2 || flingDistance < f3) {
                    kotlin.jvm.internal.Ref.FloatRef floatRef2 = new kotlin.jvm.internal.Ref.FloatRef();
                    androidx.compose.foundation.layout.WindowInsetsNestedScrollConnection$fling$2 windowInsetsNestedScrollConnection$fling$2 = new androidx.compose.foundation.layout.WindowInsetsNestedScrollConnection$fling$2(windowInsetsNestedScrollConnection, valueOf3, f2, splineBasedFloatDecayAnimationSpec, valueOf, valueOf2, floatRef2, windowInsetsAnimationController, z2, null);
                    windowInsetsNestedScrollConnection$fling$1.L$0 = windowInsetsNestedScrollConnection;
                    windowInsetsNestedScrollConnection$fling$1.L$1 = floatRef2;
                    windowInsetsNestedScrollConnection$fling$1.J$0 = j2;
                    windowInsetsNestedScrollConnection$fling$1.label = 2;
                    if (kotlinx.coroutines.CoroutineScopeKt.coroutineScope(windowInsetsNestedScrollConnection$fling$2, windowInsetsNestedScrollConnection$fling$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    windowInsetsNestedScrollConnection2 = windowInsetsNestedScrollConnection;
                    floatRef = floatRef2;
                    j3 = j2;
                    return androidx.compose.ui.unit.Velocity.m4708boximpl(windowInsetsNestedScrollConnection2.sideCalculator.mo599consumedVelocityQWom1Mo(j3, floatRef.element));
                }
                androidx.compose.foundation.layout.WindowInsetsNestedScrollConnection$fling$3 windowInsetsNestedScrollConnection$fling$3 = new androidx.compose.foundation.layout.WindowInsetsNestedScrollConnection$fling$3(windowInsetsNestedScrollConnection, valueOf3, i2, f2, windowInsetsAnimationController, z2, null);
                windowInsetsNestedScrollConnection$fling$1.L$0 = windowInsetsNestedScrollConnection;
                windowInsetsNestedScrollConnection$fling$1.J$0 = j2;
                windowInsetsNestedScrollConnection$fling$1.label = 3;
                if (kotlinx.coroutines.CoroutineScopeKt.coroutineScope(windowInsetsNestedScrollConnection$fling$3, windowInsetsNestedScrollConnection$fling$1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                windowInsetsNestedScrollConnection3 = windowInsetsNestedScrollConnection;
                j4 = j2;
                return androidx.compose.ui.unit.Velocity.m4708boximpl(windowInsetsNestedScrollConnection3.sideCalculator.mo599consumedVelocityQWom1Mo(j4, 0.0f));
            }
        }
        windowInsetsNestedScrollConnection$fling$1 = new androidx.compose.foundation.layout.WindowInsetsNestedScrollConnection$fling$1(this, continuation);
        java.lang.Object obj2 = windowInsetsNestedScrollConnection$fling$1.result;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = windowInsetsNestedScrollConnection$fling$1.label;
        if (i != 0) {
        }
        windowInsetsAnimationController = (android.view.WindowInsetsAnimationController) obj2;
        if (windowInsetsAnimationController != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void adjustInsets(float inset) {
        android.view.WindowInsetsAnimationController windowInsetsAnimationController = this.animationController;
        if (windowInsetsAnimationController != null) {
            windowInsetsAnimationController.setInsetsAndAlpha(this.sideCalculator.adjustInsets(windowInsetsAnimationController.getCurrentInsets(), kotlin.math.MathKt.roundToInt(inset)), 1.0f, 0.0f);
        }
    }

    @Override // android.view.WindowInsetsAnimationControlListener
    public void onReady(android.view.WindowInsetsAnimationController controller, int types) {
        this.animationController = controller;
        this.isControllerRequested = false;
        kotlinx.coroutines.CancellableContinuation<? super android.view.WindowInsetsAnimationController> cancellableContinuation = this.continuation;
        if (cancellableContinuation != null) {
            cancellableContinuation.resume((kotlinx.coroutines.CancellableContinuation<? super android.view.WindowInsetsAnimationController>) controller, (kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit>) new kotlin.jvm.functions.Function1<java.lang.Throwable, kotlin.Unit>() { // from class: androidx.compose.foundation.layout.WindowInsetsNestedScrollConnection$onReady$1
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(java.lang.Throwable th) {
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ kotlin.Unit invoke(java.lang.Throwable th) {
                    invoke2(th);
                    return kotlin.Unit.INSTANCE;
                }
            });
        }
        this.continuation = null;
    }

    public final void dispose() {
        kotlinx.coroutines.CancellableContinuation<? super android.view.WindowInsetsAnimationController> cancellableContinuation = this.continuation;
        if (cancellableContinuation != null) {
            cancellableContinuation.resume((kotlinx.coroutines.CancellableContinuation<? super android.view.WindowInsetsAnimationController>) null, new kotlin.jvm.functions.Function1<java.lang.Throwable, kotlin.Unit>() { // from class: androidx.compose.foundation.layout.WindowInsetsNestedScrollConnection$dispose$1
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(java.lang.Throwable th) {
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ kotlin.Unit invoke(java.lang.Throwable th) {
                    invoke2(th);
                    return kotlin.Unit.INSTANCE;
                }
            });
        }
        kotlinx.coroutines.Job job = this.animationJob;
        if (job != null) {
            kotlinx.coroutines.Job.DefaultImpls.cancel$default(job, (java.util.concurrent.CancellationException) null, 1, (java.lang.Object) null);
        }
        android.view.WindowInsetsAnimationController windowInsetsAnimationController = this.animationController;
        if (windowInsetsAnimationController != null) {
            windowInsetsAnimationController.finish(!kotlin.jvm.internal.Intrinsics.areEqual(windowInsetsAnimationController.getCurrentInsets(), windowInsetsAnimationController.getHiddenStateInsets()));
        }
    }

    @Override // android.view.WindowInsetsAnimationControlListener
    public void onFinished(android.view.WindowInsetsAnimationController controller) {
        animationEnded();
    }

    @Override // android.view.WindowInsetsAnimationControlListener
    public void onCancelled(android.view.WindowInsetsAnimationController controller) {
        animationEnded();
    }

    private final void animationEnded() {
        android.view.WindowInsetsAnimationController windowInsetsAnimationController;
        android.view.WindowInsetsAnimationController windowInsetsAnimationController2 = this.animationController;
        if (windowInsetsAnimationController2 != null && windowInsetsAnimationController2.isReady() && (windowInsetsAnimationController = this.animationController) != null) {
            windowInsetsAnimationController.finish(this.windowInsets.isVisible());
        }
        this.animationController = null;
        kotlinx.coroutines.CancellableContinuation<? super android.view.WindowInsetsAnimationController> cancellableContinuation = this.continuation;
        if (cancellableContinuation != null) {
            cancellableContinuation.resume((kotlinx.coroutines.CancellableContinuation<? super android.view.WindowInsetsAnimationController>) null, new kotlin.jvm.functions.Function1<java.lang.Throwable, kotlin.Unit>() { // from class: androidx.compose.foundation.layout.WindowInsetsNestedScrollConnection$animationEnded$1
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(java.lang.Throwable th) {
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ kotlin.Unit invoke(java.lang.Throwable th) {
                    invoke2(th);
                    return kotlin.Unit.INSTANCE;
                }
            });
        }
        this.continuation = null;
        kotlinx.coroutines.Job job = this.animationJob;
        if (job != null) {
            job.cancel((java.util.concurrent.CancellationException) new androidx.compose.foundation.layout.WindowInsetsAnimationCancelledException());
        }
        this.animationJob = null;
        this.partialConsumption = 0.0f;
        this.isControllerRequested = false;
    }
}
