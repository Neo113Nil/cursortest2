package androidx.compose.foundation.gestures;

@kotlin.Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002BW\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0016\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0017\u0010\u0015J\u0019\u0010\u0018\u001a\u00020\u00132\b\u0010\u0004\u001a\u0004\u0018\u00010\u000fH\u0002¢\u0006\u0004\b\u0018\u0010\u0019JE\u0010 \u001a\u00020\u001323\u0010\u0004\u001a/\b\u0001\u0012\u0015\u0012\u0013\u0012\t\u0012\u00070\u001c¢\u0006\u0002\b\u001d\u0012\u0004\u0012\u00020\u00130\u001b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u001e\u0012\u0006\u0012\u0004\u0018\u00010\u001f0\u001aH\u0096@¢\u0006\u0004\b \u0010!J\u0017\u0010%\u001a\u00020\u00132\u0006\u0010\u0004\u001a\u00020\"H\u0016¢\u0006\u0004\b#\u0010$J\u0017\u0010'\u001a\u00020\u00132\u0006\u0010\u0004\u001a\u00020&H\u0016¢\u0006\u0004\b'\u0010(J\u0018\u0010\u0018\u001a\u00020)2\u0006\u0010\u0004\u001a\u00020)H\u0082@¢\u0006\u0004\b\u0018\u0010*J\u000f\u0010+\u001a\u00020\u0007H\u0016¢\u0006\u0004\b+\u0010,J]\u0010\u0017\u001a\u00020\u00132\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\b\u0010\t\u001a\u0004\u0018\u00010\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u00072\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0017\u0010\u0012J\u0013\u0010\u0017\u001a\u00020\"*\u00020)H\u0002¢\u0006\u0004\b\u0017\u0010-J\u0013\u0010/\u001a\u00020.*\u00020)H\u0002¢\u0006\u0004\b/\u0010-J\u0013\u0010\u0017\u001a\u00020)*\u00020.H\u0002¢\u0006\u0004\b\u0017\u00100J\u0013\u00101\u001a\u00020)*\u00020\"H\u0002¢\u0006\u0004\b1\u00100J\u0013\u0010/\u001a\u00020.*\u00020.H\u0002¢\u0006\u0004\b/\u00102J\u0013\u00103\u001a\u00020\"*\u00020\"H\u0002¢\u0006\u0004\b3\u00102R\u001c\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00105R\u0016\u00101\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00106R\u0018\u0010/\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00108R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u00109R\u0018\u00103\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u00108R\u0018\u00107\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010;R\"\u00104\u001a\u00020\u000f8\u0007@\u0007X\u0086.¢\u0006\u0012\n\u0004\b3\u0010;\u001a\u0004\b\u0018\u0010<\"\u0004\b3\u0010\u0019R\u0018\u0010?\u001a\u0004\u0018\u00010=8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b/\u0010>R\u0014\u0010@\u001a\u00020\u00078CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b1\u0010,"}, d2 = {"Landroidx/compose/foundation/gestures/AnchoredDraggableNode;", "T", "Landroidx/compose/foundation/gestures/DragGestureNode;", "Landroidx/compose/foundation/gestures/AnchoredDraggableState;", "p0", "Landroidx/compose/foundation/gestures/Orientation;", "p1", "", "p2", "p3", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "p4", "Landroidx/compose/foundation/OverscrollEffect;", "p5", "p6", "Landroidx/compose/foundation/gestures/FlingBehavior;", "p7", "<init>", "(Landroidx/compose/foundation/gestures/AnchoredDraggableState;Landroidx/compose/foundation/gestures/Orientation;ZLjava/lang/Boolean;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/foundation/OverscrollEffect;Ljava/lang/Boolean;Landroidx/compose/foundation/gestures/FlingBehavior;)V", "", "onAttach", "()V", "onDensityChange", "getHighSpeedVideoFpsRangesFor", "getHighSpeedVideoFpsRanges", "(Landroidx/compose/foundation/gestures/FlingBehavior;)V", "Lkotlin/Function2;", "Lkotlin/Function1;", "Landroidx/compose/foundation/gestures/DragEvent$DragDelta;", "Lkotlin/ParameterName;", "Lkotlin/coroutines/Continuation;", "", "drag", "(Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/compose/ui/geometry/Offset;", "onDragStarted-k-4lQ0M", "(J)V", "onDragStarted", "Landroidx/compose/foundation/gestures/DragEvent$DragStopped;", "onDragStopped", "(Landroidx/compose/foundation/gestures/DragEvent$DragStopped;)V", "", "(FLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "startDragImmediately", "()Z", "(F)J", "Landroidx/compose/ui/unit/Velocity;", "Camera2StreamConfigurationMap", "(J)F", "getHighResolutionOutputSizeshNQ4ISI", "(J)J", "getHighSpeedVideoSizes", "getOutputFormats", "Landroidx/compose/foundation/gestures/AnchoredDraggableState;", "Landroidx/compose/foundation/gestures/Orientation;", "getHighSpeedVideoSizesFor", "Ljava/lang/Boolean;", "Landroidx/compose/foundation/OverscrollEffect;", "getOutputMinFrameDuration", "Landroidx/compose/foundation/gestures/FlingBehavior;", "()Landroidx/compose/foundation/gestures/FlingBehavior;", "Landroidx/compose/ui/unit/Density;", "Landroidx/compose/ui/unit/Density;", "getInputSizeshNQ4ISI", "getInputFormats"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class AnchoredDraggableNode<T> extends androidx.compose.foundation.gestures.DragGestureNode {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private androidx.compose.ui.unit.Density getInputSizeshNQ4ISI;
    private androidx.compose.foundation.gestures.Orientation getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private androidx.compose.foundation.gestures.FlingBehavior getHighSpeedVideoSizesFor;
    private androidx.compose.foundation.OverscrollEffect getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    public androidx.compose.foundation.gestures.FlingBehavior getOutputFormats;

    /* renamed from: getHighSpeedVideoSizesFor, reason: from kotlin metadata */
    private java.lang.Boolean Camera2StreamConfigurationMap;

    /* renamed from: getOutputFormats, reason: from kotlin metadata */
    private androidx.compose.foundation.gestures.AnchoredDraggableState<T> getHighSpeedVideoFpsRanges;

    /* renamed from: getOutputMinFrameDuration, reason: from kotlin metadata */
    private java.lang.Boolean getHighSpeedVideoSizes;

    @Override // androidx.compose.foundation.gestures.DragGestureNode
    /* renamed from: onDragStarted-k-4lQ0M, reason: not valid java name */
    public final void mo1426onDragStartedk4lQ0M(long p0) {
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public AnchoredDraggableNode(androidx.compose.foundation.gestures.AnchoredDraggableState<T> anchoredDraggableState, androidx.compose.foundation.gestures.Orientation orientation, boolean z, java.lang.Boolean bool, androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource, androidx.compose.foundation.OverscrollEffect overscrollEffect, java.lang.Boolean bool2, androidx.compose.foundation.gestures.FlingBehavior flingBehavior) {
        super(r0, z, mutableInteractionSource, orientation);
        kotlin.jvm.functions.Function1 function1;
        function1 = androidx.compose.foundation.gestures.AnchoredDraggableKt.getHighSpeedVideoFpsRangesFor;
        this.getHighSpeedVideoFpsRanges = anchoredDraggableState;
        this.getHighResolutionOutputSizeshNQ4ISI = orientation;
        this.Camera2StreamConfigurationMap = bool;
        this.getHighSpeedVideoFpsRangesFor = overscrollEffect;
        this.getHighSpeedVideoSizes = bool2;
        this.getHighSpeedVideoSizesFor = flingBehavior;
    }

    private void getHighSpeedVideoSizes(androidx.compose.foundation.gestures.FlingBehavior flingBehavior) {
        this.getOutputFormats = flingBehavior;
    }

    public final androidx.compose.foundation.gestures.FlingBehavior getHighSpeedVideoFpsRanges() {
        androidx.compose.foundation.gestures.FlingBehavior flingBehavior = this.getOutputFormats;
        if (flingBehavior != null) {
            return flingBehavior;
        }
        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
        return null;
    }

    private final boolean getHighResolutionOutputSizeshNQ4ISI() {
        java.lang.Boolean bool = this.Camera2StreamConfigurationMap;
        if (bool == null) {
            return androidx.compose.ui.node.DelegatableNodeKt.requireLayoutDirection(this) == androidx.compose.ui.unit.LayoutDirection.Rtl && this.getHighResolutionOutputSizeshNQ4ISI == androidx.compose.foundation.gestures.Orientation.Horizontal;
        }
        kotlin.jvm.internal.Intrinsics.checkNotNull(bool);
        return bool.booleanValue();
    }

    @Override // androidx.compose.ui.Modifier.Node
    public final void onAttach() {
        getHighSpeedVideoFpsRanges(this.getHighSpeedVideoSizesFor);
    }

    @Override // androidx.compose.ui.node.DelegatableNode, androidx.compose.ui.node.PointerInputModifierNode
    public final void onDensityChange() {
        onCancelPointerInput();
        if (getIsAttached()) {
            getHighSpeedVideoFpsRangesFor();
        }
    }

    private final void getHighSpeedVideoFpsRangesFor() {
        androidx.compose.ui.unit.Density requireDensity = androidx.compose.ui.node.DelegatableNodeKt.requireDensity(this);
        androidx.compose.ui.unit.Density density = this.getInputSizeshNQ4ISI;
        if (density == null || !kotlin.jvm.internal.Intrinsics.areEqual(density, requireDensity)) {
            this.getInputSizeshNQ4ISI = requireDensity;
            getHighSpeedVideoFpsRanges(this.getHighSpeedVideoSizesFor);
        }
    }

    private final void getHighSpeedVideoFpsRanges(androidx.compose.foundation.gestures.FlingBehavior p0) {
        if (p0 == null) {
            androidx.compose.animation.core.AnimationSpec<java.lang.Float> snapAnimationSpec = androidx.compose.foundation.gestures.AnchoredDraggableDefaults.INSTANCE.getSnapAnimationSpec();
            kotlin.jvm.functions.Function1<java.lang.Float, java.lang.Float> positionalThreshold = androidx.compose.foundation.gestures.AnchoredDraggableDefaults.INSTANCE.getPositionalThreshold();
            androidx.compose.ui.unit.Density requireDensity = androidx.compose.ui.node.DelegatableNodeKt.requireDensity(this);
            this.getInputSizeshNQ4ISI = requireDensity;
            p0 = androidx.compose.foundation.gestures.AnchoredDraggableKt.anchoredDraggableFlingBehavior(this.getHighSpeedVideoFpsRanges, requireDensity, positionalThreshold, snapAnimationSpec);
        }
        getHighSpeedVideoSizes(p0);
    }

    @Override // androidx.compose.foundation.gestures.DragGestureNode
    public final java.lang.Object drag(kotlin.jvm.functions.Function2<? super kotlin.jvm.functions.Function1<? super androidx.compose.foundation.gestures.DragEvent.DragDelta, kotlin.Unit>, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> function2, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object anchoredDrag$default = androidx.compose.foundation.gestures.AnchoredDraggableState.anchoredDrag$default(this.getHighSpeedVideoFpsRanges, null, new androidx.compose.foundation.gestures.AnchoredDraggableNode$drag$2(function2, this, null), continuation, 1, null);
        return anchoredDrag$default == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? anchoredDrag$default : kotlin.Unit.INSTANCE;
    }

    @Override // androidx.compose.foundation.gestures.DragGestureNode
    public final void onDragStopped(androidx.compose.foundation.gestures.DragEvent.DragStopped p0) {
        if (getIsAttached()) {
            kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(getCoroutineScope(), null, null, new androidx.compose.foundation.gestures.AnchoredDraggableNode$onDragStopped$1(this, p0, null), 3, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getHighSpeedVideoFpsRanges(float f, kotlin.coroutines.Continuation<? super java.lang.Float> continuation) {
        androidx.compose.foundation.gestures.AnchoredDraggableNode$fling$1 anchoredDraggableNode$fling$1;
        int i;
        kotlin.jvm.internal.Ref.FloatRef floatRef;
        if (continuation instanceof androidx.compose.foundation.gestures.AnchoredDraggableNode$fling$1) {
            anchoredDraggableNode$fling$1 = (androidx.compose.foundation.gestures.AnchoredDraggableNode$fling$1) continuation;
            if ((anchoredDraggableNode$fling$1.getHighResolutionOutputSizeshNQ4ISI & Integer.MIN_VALUE) != 0) {
                anchoredDraggableNode$fling$1.getHighResolutionOutputSizeshNQ4ISI -= 2147483648;
                androidx.compose.foundation.gestures.AnchoredDraggableNode$fling$1 anchoredDraggableNode$fling$12 = anchoredDraggableNode$fling$1;
                java.lang.Object obj = anchoredDraggableNode$fling$12.getHighSpeedVideoFpsRangesFor;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = anchoredDraggableNode$fling$12.getHighResolutionOutputSizeshNQ4ISI;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    if (this.getHighSpeedVideoFpsRanges.getUsePreModifierChangeBehavior$foundation()) {
                        androidx.compose.foundation.gestures.AnchoredDraggableState<T> anchoredDraggableState = this.getHighSpeedVideoFpsRanges;
                        anchoredDraggableNode$fling$12.getHighResolutionOutputSizeshNQ4ISI = 1;
                        java.lang.Object obj2 = anchoredDraggableState.settle(f, anchoredDraggableNode$fling$12);
                        if (obj2 != coroutine_suspended) {
                            return obj2;
                        }
                    } else {
                        kotlin.jvm.internal.Ref.FloatRef floatRef2 = new kotlin.jvm.internal.Ref.FloatRef();
                        floatRef2.element = f;
                        androidx.compose.foundation.gestures.AnchoredDraggableState<T> anchoredDraggableState2 = this.getHighSpeedVideoFpsRanges;
                        androidx.compose.foundation.gestures.AnchoredDraggableNode$fling$2 anchoredDraggableNode$fling$2 = new androidx.compose.foundation.gestures.AnchoredDraggableNode$fling$2(this, floatRef2, f, null);
                        anchoredDraggableNode$fling$12.Camera2StreamConfigurationMap = floatRef2;
                        anchoredDraggableNode$fling$12.getHighResolutionOutputSizeshNQ4ISI = 2;
                        if (androidx.compose.foundation.gestures.AnchoredDraggableState.anchoredDrag$default(anchoredDraggableState2, null, anchoredDraggableNode$fling$2, anchoredDraggableNode$fling$12, 1, null) != coroutine_suspended) {
                            floatRef = floatRef2;
                        }
                    }
                    return coroutine_suspended;
                }
                if (i == 1) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    return obj;
                }
                if (i != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                floatRef = (kotlin.jvm.internal.Ref.FloatRef) anchoredDraggableNode$fling$12.Camera2StreamConfigurationMap;
                kotlin.ResultKt.throwOnFailure(obj);
                return kotlin.coroutines.jvm.internal.Boxing.boxFloat(floatRef.element);
            }
        }
        anchoredDraggableNode$fling$1 = new androidx.compose.foundation.gestures.AnchoredDraggableNode$fling$1(this, continuation);
        androidx.compose.foundation.gestures.AnchoredDraggableNode$fling$1 anchoredDraggableNode$fling$122 = anchoredDraggableNode$fling$1;
        java.lang.Object obj3 = anchoredDraggableNode$fling$122.getHighSpeedVideoFpsRangesFor;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = anchoredDraggableNode$fling$122.getHighResolutionOutputSizeshNQ4ISI;
        if (i != 0) {
        }
        return kotlin.coroutines.jvm.internal.Boxing.boxFloat(floatRef.element);
    }

    @Override // androidx.compose.foundation.gestures.DragGestureNode
    public final boolean startDragImmediately() {
        java.lang.Boolean bool = this.getHighSpeedVideoSizes;
        return bool != null ? bool.booleanValue() : this.getHighSpeedVideoFpsRanges.isAnimationRunning();
    }

    public final void getHighSpeedVideoFpsRangesFor(androidx.compose.foundation.gestures.AnchoredDraggableState<T> p0, androidx.compose.foundation.gestures.Orientation p1, boolean p2, java.lang.Boolean p3, androidx.compose.foundation.interaction.MutableInteractionSource p4, androidx.compose.foundation.OverscrollEffect p5, java.lang.Boolean p6, androidx.compose.foundation.gestures.FlingBehavior p7) {
        boolean z;
        this.getHighSpeedVideoSizesFor = p7;
        boolean z2 = true;
        if (kotlin.jvm.internal.Intrinsics.areEqual(this.getHighSpeedVideoFpsRanges, p0)) {
            z = false;
        } else {
            this.getHighSpeedVideoFpsRanges = p0;
            getHighSpeedVideoFpsRanges(p7);
            z = true;
        }
        if (this.getHighResolutionOutputSizeshNQ4ISI != p1) {
            this.getHighResolutionOutputSizeshNQ4ISI = p1;
            z = true;
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(this.Camera2StreamConfigurationMap, p3)) {
            z2 = z;
        } else {
            this.Camera2StreamConfigurationMap = p3;
        }
        this.getHighSpeedVideoSizes = p6;
        this.getHighSpeedVideoFpsRangesFor = p5;
        androidx.compose.foundation.gestures.DragGestureNode.update$default(this, null, p2, p4, p1, z2, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long getHighSpeedVideoFpsRangesFor(float f) {
        float f2 = this.getHighResolutionOutputSizeshNQ4ISI == androidx.compose.foundation.gestures.Orientation.Horizontal ? f : 0.0f;
        if (this.getHighResolutionOutputSizeshNQ4ISI != androidx.compose.foundation.gestures.Orientation.Vertical) {
            f = 0.0f;
        }
        return androidx.compose.ui.geometry.Offset.m5744constructorimpl((java.lang.Float.floatToRawIntBits(f2) << 32) | (java.lang.Float.floatToRawIntBits(f) & 4294967295L));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long Camera2StreamConfigurationMap(float f) {
        float f2 = this.getHighResolutionOutputSizeshNQ4ISI == androidx.compose.foundation.gestures.Orientation.Horizontal ? f : 0.0f;
        if (this.getHighResolutionOutputSizeshNQ4ISI != androidx.compose.foundation.gestures.Orientation.Vertical) {
            f = 0.0f;
        }
        return androidx.compose.ui.unit.VelocityKt.Velocity(f2, f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final float getHighSpeedVideoFpsRangesFor(long j) {
        return this.getHighResolutionOutputSizeshNQ4ISI == androidx.compose.foundation.gestures.Orientation.Vertical ? androidx.compose.ui.unit.Velocity.m8840getYimpl(j) : androidx.compose.ui.unit.Velocity.m8839getXimpl(j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final float getHighResolutionOutputSizeshNQ4ISI(long j) {
        return java.lang.Float.intBitsToFloat((int) (this.getHighResolutionOutputSizeshNQ4ISI == androidx.compose.foundation.gestures.Orientation.Vertical ? j & 4294967295L : j >> 32));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long Camera2StreamConfigurationMap(long j) {
        return androidx.compose.ui.unit.Velocity.m8845timesadjELrA(j, getHighResolutionOutputSizeshNQ4ISI() ? -1.0f : 1.0f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long getHighSpeedVideoSizes(long j) {
        return androidx.compose.ui.geometry.Offset.m5759timestuRUvjQ(j, getHighResolutionOutputSizeshNQ4ISI() ? -1.0f : 1.0f);
    }
}
