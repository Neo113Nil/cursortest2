package androidx.compose.foundation.gestures;

@kotlin.Metadata(d1 = {"\u0000®\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001ac\u0010\u000f\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00042\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010\u001ao\u0010\u000f\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00042\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\u0011\u001a\u00020\u00042\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0007¢\u0006\u0004\b\u000f\u0010\u0012\u001a[\u0010\u000f\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00042\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0013\u001ag\u0010\u000f\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00042\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\u0011\u001a\u00020\u00042\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0007¢\u0006\u0004\b\u000f\u0010\u0014\u001aD\u0010\u001b\u001a\u00020\u0019\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00152\"\u0010\u001a\u001a\u001e\u0012\t\u0012\u00078\u0000¢\u0006\u0002\b\u0017\u0012\t\u0012\u00070\u0018¢\u0006\u0002\b\u0017\u0012\u0004\u0012\u00020\u00190\u0016H\u0086\b¢\u0006\u0004\b\u001b\u0010\u001c\u001a<\u0010\"\u001a\b\u0012\u0004\u0012\u00028\u00000\u0015\"\b\b\u0000\u0010\u0000*\u00020\u001d2\u001d\u0010!\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u001f\u0012\u0004\u0012\u00020\u00190\u001e¢\u0006\u0002\b ¢\u0006\u0004\b\"\u0010#\u001a\u0081\u0001\u0010-\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010$\u001a\u00028\u00002\u0017\u0010%\u001a\u0013\u0012\t\u0012\u00070\u0018¢\u0006\u0002\b\u0017\u0012\u0004\u0012\u00020\u00180\u001e2\f\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00180&2\f\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00180(2\f\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00180*2\u0019\b\u0002\u0010,\u001a\u0013\u0012\t\u0012\u00078\u0000¢\u0006\u0002\b\u0017\u0012\u0004\u0012\u00020\u00040\u001eH\u0007¢\u0006\u0004\b-\u0010.\u001a\u008f\u0001\u0010-\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010$\u001a\u00028\u00002\f\u0010/\u001a\b\u0012\u0004\u0012\u00028\u00000\u00152\u0017\u0010%\u001a\u0013\u0012\t\u0012\u00070\u0018¢\u0006\u0002\b\u0017\u0012\u0004\u0012\u00020\u00180\u001e2\f\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00180&2\f\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00180(2\f\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00180*2\u0019\b\u0002\u0010,\u001a\u0013\u0012\t\u0012\u00078\u0000¢\u0006\u0002\b\u0017\u0012\u0004\u0012\u00020\u00040\u001eH\u0007¢\u0006\u0004\b-\u00100\u001a(\u00102\u001a\u00020\u0019\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u00101\u001a\u00028\u0000H\u0086@¢\u0006\u0004\b2\u00103\u001aT\u0010:\u001a\u00020\u0019\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u00104\u001a\u00020\u00182\u0006\u00106\u001a\u0002052\f\u00107\u001a\b\u0012\u0004\u0012\u00028\u00000\u00152\u0006\u00108\u001a\u00028\u00002\f\u00109\u001a\b\u0012\u0004\u0012\u00020\u00180(H\u0082@¢\u0006\u0004\b:\u0010;\u001a8\u0010=\u001a\u00020\u0019\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u00101\u001a\u00028\u00002\u000e\b\u0002\u0010<\u001a\b\u0012\u0004\u0012\u00020\u00180(H\u0086@¢\u0006\u0004\b=\u0010>\u001aP\u0010@\u001a\u00020\u0018\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u00101\u001a\u00028\u00002\u0006\u0010?\u001a\u00020\u00182\u000e\b\u0002\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00180(2\u000e\b\u0002\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00180*H\u0086@¢\u0006\u0004\b@\u0010A\u001aV\u0010B\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00152\u0006\u00104\u001a\u00020\u00182\u0006\u00106\u001a\u00020\u00182\u0017\u00107\u001a\u0013\u0012\t\u0012\u00070\u0018¢\u0006\u0002\b\u0017\u0012\u0004\u0012\u00020\u00180\u001e2\f\u00108\u001a\b\u0012\u0004\u0012\u00020\u00180&H\u0002¢\u0006\u0004\bB\u0010C\u001a\u001b\u0010B\u001a\u00020\u0018*\u00020\u00182\u0006\u00104\u001a\u00020\u0018H\u0002¢\u0006\u0004\bB\u0010D\u001aH\u0010B\u001a\u00020\u0019\"\u0004\b\u0000\u0010E2\f\u00104\u001a\b\u0012\u0004\u0012\u00028\u00000&2\"\u00106\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190F\u0012\u0006\u0012\u0004\u0018\u00010\u001d0\u0016H\u0082@¢\u0006\u0004\bB\u0010G\u001a\u001b\u0010B\u001a\b\u0012\u0004\u0012\u00028\u00000H\"\u0004\b\u0000\u0010\u0000H\u0002¢\u0006\u0004\bB\u0010I\u001aR\u0010M\u001a\u00020L\"\u0004\b\u0000\u0010\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010K\u001a\u00020J2\u0017\u0010%\u001a\u0013\u0012\t\u0012\u00070\u0018¢\u0006\u0002\b\u0017\u0012\u0004\u0012\u00020\u00180\u001e2\f\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00180(H\u0000¢\u0006\u0004\bM\u0010N\u001aJ\u0010P\u001a\u00020O\"\u0004\b\u0000\u0010\u00002\f\u00104\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0017\u00106\u001a\u0013\u0012\t\u0012\u00070\u0018¢\u0006\u0002\b\u0017\u0012\u0004\u0012\u00020\u00180\u001e2\f\u00107\u001a\b\u0012\u0004\u0012\u00020\u00180&H\u0002¢\u0006\u0004\bP\u0010Q\" \u0010T\u001a\u000e\u0012\u0004\u0012\u00020R\u0012\u0004\u0012\u00020\u00040\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010S\" \u0010:\u001a\u000e\u0012\u0004\u0012\u00020U\u0012\u0004\u0012\u00020\u00180\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bV\u0010S\"\u001a\u0010X\u001a\u00020W8\u0001X\u0080\u0004¢\u0006\f\n\u0004\bX\u0010Y\u001a\u0004\bZ\u0010[\"\u001a\u0010P\u001a\b\u0012\u0004\u0012\u00020\u00180*8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b:\u0010\\"}, d2 = {"T", "Landroidx/compose/ui/Modifier;", "Landroidx/compose/foundation/gestures/AnchoredDraggableState;", "state", "", "reverseDirection", "Landroidx/compose/foundation/gestures/Orientation;", "orientation", "enabled", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "interactionSource", "Landroidx/compose/foundation/OverscrollEffect;", "overscrollEffect", "Landroidx/compose/foundation/gestures/FlingBehavior;", "flingBehavior", "anchoredDraggable", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/gestures/AnchoredDraggableState;ZLandroidx/compose/foundation/gestures/Orientation;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/foundation/OverscrollEffect;Landroidx/compose/foundation/gestures/FlingBehavior;)Landroidx/compose/ui/Modifier;", "startDragImmediately", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/gestures/AnchoredDraggableState;ZLandroidx/compose/foundation/gestures/Orientation;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/foundation/OverscrollEffect;ZLandroidx/compose/foundation/gestures/FlingBehavior;)Landroidx/compose/ui/Modifier;", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/gestures/AnchoredDraggableState;Landroidx/compose/foundation/gestures/Orientation;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/foundation/OverscrollEffect;Landroidx/compose/foundation/gestures/FlingBehavior;)Landroidx/compose/ui/Modifier;", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/gestures/AnchoredDraggableState;Landroidx/compose/foundation/gestures/Orientation;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/foundation/OverscrollEffect;ZLandroidx/compose/foundation/gestures/FlingBehavior;)Landroidx/compose/ui/Modifier;", "Landroidx/compose/foundation/gestures/DraggableAnchors;", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "", "", "block", "forEach", "(Landroidx/compose/foundation/gestures/DraggableAnchors;Lkotlin/jvm/functions/Function2;)V", "", "Lkotlin/Function1;", "Landroidx/compose/foundation/gestures/DraggableAnchorsConfig;", "Lkotlin/ExtensionFunctionType;", "builder", "DraggableAnchors", "(Lkotlin/jvm/functions/Function1;)Landroidx/compose/foundation/gestures/DraggableAnchors;", "initialValue", "positionalThreshold", "Lkotlin/Function0;", "velocityThreshold", "Landroidx/compose/animation/core/AnimationSpec;", "snapAnimationSpec", "Landroidx/compose/animation/core/DecayAnimationSpec;", "decayAnimationSpec", "confirmValueChange", "AnchoredDraggableState", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/animation/core/AnimationSpec;Landroidx/compose/animation/core/DecayAnimationSpec;Lkotlin/jvm/functions/Function1;)Landroidx/compose/foundation/gestures/AnchoredDraggableState;", "anchors", "(Ljava/lang/Object;Landroidx/compose/foundation/gestures/DraggableAnchors;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/animation/core/AnimationSpec;Landroidx/compose/animation/core/DecayAnimationSpec;Lkotlin/jvm/functions/Function1;)Landroidx/compose/foundation/gestures/AnchoredDraggableState;", "targetValue", "snapTo", "(Landroidx/compose/foundation/gestures/AnchoredDraggableState;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "p0", "Landroidx/compose/foundation/gestures/AnchoredDragScope;", "p1", "p2", "p3", "p4", "getHighSpeedVideoSizes", "(Landroidx/compose/foundation/gestures/AnchoredDraggableState;FLandroidx/compose/foundation/gestures/AnchoredDragScope;Landroidx/compose/foundation/gestures/DraggableAnchors;Ljava/lang/Object;Landroidx/compose/animation/core/AnimationSpec;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "animationSpec", "animateTo", "(Landroidx/compose/foundation/gestures/AnchoredDraggableState;Ljava/lang/Object;Landroidx/compose/animation/core/AnimationSpec;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "velocity", "animateToWithDecay", "(Landroidx/compose/foundation/gestures/AnchoredDraggableState;Ljava/lang/Object;FLandroidx/compose/animation/core/AnimationSpec;Landroidx/compose/animation/core/DecayAnimationSpec;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighSpeedVideoFpsRangesFor", "(Landroidx/compose/foundation/gestures/DraggableAnchors;FFLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "(FF)F", com.visa.cbp.getEncExpo.warmup, "Lkotlin/coroutines/Continuation;", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/compose/foundation/gestures/DefaultDraggableAnchors;", "()Landroidx/compose/foundation/gestures/DefaultDraggableAnchors;", "Landroidx/compose/ui/unit/Density;", "density", "Landroidx/compose/foundation/gestures/TargetedFlingBehavior;", "anchoredDraggableFlingBehavior", "(Landroidx/compose/foundation/gestures/AnchoredDraggableState;Landroidx/compose/ui/unit/Density;Lkotlin/jvm/functions/Function1;Landroidx/compose/animation/core/AnimationSpec;)Landroidx/compose/foundation/gestures/TargetedFlingBehavior;", "Landroidx/compose/foundation/gestures/snapping/SnapLayoutInfoProvider;", "getHighResolutionOutputSizeshNQ4ISI", "(Landroidx/compose/foundation/gestures/AnchoredDraggableState;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)Landroidx/compose/foundation/gestures/snapping/SnapLayoutInfoProvider;", "Landroidx/compose/ui/input/pointer/PointerType;", "Lkotlin/jvm/functions/Function1;", "Camera2StreamConfigurationMap", "", "getHighSpeedVideoFpsRanges", "Landroidx/compose/ui/unit/Dp;", "AnchoredDraggableMinFlingVelocity", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER, "getAnchoredDraggableMinFlingVelocity", "()F", "Landroidx/compose/animation/core/DecayAnimationSpec;"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AnchoredDraggableKt {
    private static final kotlin.jvm.functions.Function1<androidx.compose.ui.input.pointer.PointerType, java.lang.Boolean> getHighSpeedVideoFpsRangesFor = new kotlin.jvm.functions.Function1() { // from class: androidx.compose.foundation.gestures.AnchoredDraggableKt$$ExternalSyntheticLambda3
        @Override // kotlin.jvm.functions.Function1
        public final java.lang.Object invoke(java.lang.Object obj) {
            return java.lang.Boolean.valueOf(androidx.compose.foundation.gestures.AnchoredDraggableKt.$r8$lambda$DNWwT3CRpJaej5NQwRTkIwN3eOU((androidx.compose.ui.input.pointer.PointerType) obj));
        }
    };
    private static final kotlin.jvm.functions.Function1<java.lang.Integer, java.lang.Float> getHighSpeedVideoFpsRanges = new kotlin.jvm.functions.Function1() { // from class: androidx.compose.foundation.gestures.AnchoredDraggableKt$$ExternalSyntheticLambda4
        @Override // kotlin.jvm.functions.Function1
        public final java.lang.Object invoke(java.lang.Object obj) {
            return java.lang.Float.valueOf(androidx.compose.foundation.gestures.AnchoredDraggableKt.$r8$lambda$AWknUZ6PVCkBQzJgRIl4VvKA7Rs(((java.lang.Integer) obj).intValue()));
        }
    };
    private static final float AnchoredDraggableMinFlingVelocity = androidx.compose.ui.unit.Dp.m8601constructorimpl(125.0f);
    private static final androidx.compose.animation.core.DecayAnimationSpec<java.lang.Float> getHighSpeedVideoSizes = androidx.compose.animation.core.DecayAnimationSpecKt.generateDecayAnimationSpec(new androidx.compose.animation.core.FloatDecayAnimationSpec() { // from class: androidx.compose.foundation.gestures.AnchoredDraggableKt$NoOpDecayAnimationSpec$1
        private final float absVelocityThreshold;

        @Override // androidx.compose.animation.core.FloatDecayAnimationSpec
        public final long getDurationNanos(float initialValue, float initialVelocity) {
            return 0L;
        }

        @Override // androidx.compose.animation.core.FloatDecayAnimationSpec
        public final float getTargetValue(float initialValue, float initialVelocity) {
            return 0.0f;
        }

        @Override // androidx.compose.animation.core.FloatDecayAnimationSpec
        public final float getValueFromNanos(long playTimeNanos, float initialValue, float initialVelocity) {
            return 0.0f;
        }

        @Override // androidx.compose.animation.core.FloatDecayAnimationSpec
        public final float getVelocityFromNanos(long playTimeNanos, float initialValue, float initialVelocity) {
            return 0.0f;
        }

        @Override // androidx.compose.animation.core.FloatDecayAnimationSpec
        public final float getAbsVelocityThreshold() {
            return this.absVelocityThreshold;
        }
    });

    public static /* synthetic */ float $r8$lambda$AWknUZ6PVCkBQzJgRIl4VvKA7Rs(int i) {
        return Float.NaN;
    }

    public static /* synthetic */ boolean $r8$lambda$DNWwT3CRpJaej5NQwRTkIwN3eOU(androidx.compose.ui.input.pointer.PointerType pointerType) {
        return true;
    }

    public static /* synthetic */ boolean $r8$lambda$SyNEHB4d22ap4A8VDebElLHlrQk(java.lang.Object obj) {
        return true;
    }

    /* renamed from: $r8$lambda$v28GEaNcFlm3gj8wnJ-duVQCklA, reason: not valid java name */
    public static /* synthetic */ boolean m1425$r8$lambda$v28GEaNcFlm3gj8wnJduVQCklA(java.lang.Object obj) {
        return true;
    }

    public static final <T> androidx.compose.ui.Modifier anchoredDraggable(androidx.compose.ui.Modifier modifier, androidx.compose.foundation.gestures.AnchoredDraggableState<T> anchoredDraggableState, boolean z, androidx.compose.foundation.gestures.Orientation orientation, boolean z2, androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource, androidx.compose.foundation.OverscrollEffect overscrollEffect, androidx.compose.foundation.gestures.FlingBehavior flingBehavior) {
        return modifier.then(new androidx.compose.foundation.gestures.AnchoredDraggableElement(anchoredDraggableState, orientation, z2, java.lang.Boolean.valueOf(z), mutableInteractionSource, null, overscrollEffect, flingBehavior, 32, null));
    }

    @kotlin.Deprecated(message = "startDragImmediately has been removed without replacement. Modifier.anchoredDraggable sets startDragImmediately to true by default when animations are running.")
    public static final <T> androidx.compose.ui.Modifier anchoredDraggable(androidx.compose.ui.Modifier modifier, androidx.compose.foundation.gestures.AnchoredDraggableState<T> anchoredDraggableState, boolean z, androidx.compose.foundation.gestures.Orientation orientation, boolean z2, androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource, androidx.compose.foundation.OverscrollEffect overscrollEffect, boolean z3, androidx.compose.foundation.gestures.FlingBehavior flingBehavior) {
        return modifier.then(new androidx.compose.foundation.gestures.AnchoredDraggableElement(anchoredDraggableState, orientation, z2, java.lang.Boolean.valueOf(z), mutableInteractionSource, java.lang.Boolean.valueOf(z3), overscrollEffect, flingBehavior));
    }

    public static /* synthetic */ androidx.compose.ui.Modifier anchoredDraggable$default(androidx.compose.ui.Modifier modifier, androidx.compose.foundation.gestures.AnchoredDraggableState anchoredDraggableState, androidx.compose.foundation.gestures.Orientation orientation, boolean z, androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource, androidx.compose.foundation.OverscrollEffect overscrollEffect, androidx.compose.foundation.gestures.FlingBehavior flingBehavior, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            z = true;
        }
        return anchoredDraggable(modifier, anchoredDraggableState, orientation, z, (i & 8) != 0 ? null : mutableInteractionSource, (i & 16) != 0 ? null : overscrollEffect, (i & 32) != 0 ? null : flingBehavior);
    }

    public static final <T> androidx.compose.ui.Modifier anchoredDraggable(androidx.compose.ui.Modifier modifier, androidx.compose.foundation.gestures.AnchoredDraggableState<T> anchoredDraggableState, androidx.compose.foundation.gestures.Orientation orientation, boolean z, androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource, androidx.compose.foundation.OverscrollEffect overscrollEffect, androidx.compose.foundation.gestures.FlingBehavior flingBehavior) {
        return modifier.then(new androidx.compose.foundation.gestures.AnchoredDraggableElement(anchoredDraggableState, orientation, z, null, mutableInteractionSource, null, overscrollEffect, flingBehavior, 32, null));
    }

    @kotlin.Deprecated(message = "startDragImmediately has been removed without replacement. Modifier.anchoredDraggable sets startDragImmediately to true by default when animations are running.")
    public static final <T> androidx.compose.ui.Modifier anchoredDraggable(androidx.compose.ui.Modifier modifier, androidx.compose.foundation.gestures.AnchoredDraggableState<T> anchoredDraggableState, androidx.compose.foundation.gestures.Orientation orientation, boolean z, androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource, androidx.compose.foundation.OverscrollEffect overscrollEffect, boolean z2, androidx.compose.foundation.gestures.FlingBehavior flingBehavior) {
        return modifier.then(new androidx.compose.foundation.gestures.AnchoredDraggableElement(anchoredDraggableState, orientation, z, null, mutableInteractionSource, java.lang.Boolean.valueOf(z2), overscrollEffect, flingBehavior));
    }

    public static final <T> void forEach(androidx.compose.foundation.gestures.DraggableAnchors<T> draggableAnchors, kotlin.jvm.functions.Function2<? super T, ? super java.lang.Float, kotlin.Unit> function2) {
        int getHighResolutionOutputSizeshNQ4ISI = draggableAnchors.getGetHighResolutionOutputSizeshNQ4ISI();
        for (int i = 0; i < getHighResolutionOutputSizeshNQ4ISI; i++) {
            T anchorAt = draggableAnchors.anchorAt(i);
            if (anchorAt == null) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("There was no key at index ");
                sb.append(i);
                sb.append(". Please report a bug.");
                throw new java.lang.IllegalArgumentException(sb.toString().toString());
            }
            function2.invoke(anchorAt, java.lang.Float.valueOf(draggableAnchors.positionAt(i)));
        }
    }

    public static final <T> androidx.compose.foundation.gestures.DraggableAnchors<T> DraggableAnchors(kotlin.jvm.functions.Function1<? super androidx.compose.foundation.gestures.DraggableAnchorsConfig<T>, kotlin.Unit> function1) {
        androidx.compose.foundation.gestures.DraggableAnchorsConfig draggableAnchorsConfig = new androidx.compose.foundation.gestures.DraggableAnchorsConfig();
        function1.invoke(draggableAnchorsConfig);
        return new androidx.compose.foundation.gestures.DefaultDraggableAnchors(draggableAnchorsConfig.buildKeys$foundation(), draggableAnchorsConfig.buildPositions$foundation());
    }

    public static /* synthetic */ androidx.compose.foundation.gestures.AnchoredDraggableState AnchoredDraggableState$default(java.lang.Object obj, kotlin.jvm.functions.Function1 function1, kotlin.jvm.functions.Function0 function0, androidx.compose.animation.core.AnimationSpec animationSpec, androidx.compose.animation.core.DecayAnimationSpec decayAnimationSpec, kotlin.jvm.functions.Function1 function12, int i, java.lang.Object obj2) {
        if ((i & 32) != 0) {
            function12 = new kotlin.jvm.functions.Function1() { // from class: androidx.compose.foundation.gestures.AnchoredDraggableKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj3) {
                    return java.lang.Boolean.valueOf(androidx.compose.foundation.gestures.AnchoredDraggableKt.m1425$r8$lambda$v28GEaNcFlm3gj8wnJduVQCklA(obj3));
                }
            };
        }
        return AnchoredDraggableState(obj, function1, function0, animationSpec, decayAnimationSpec, function12);
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.WARNING, message = "This constructor of AnchoredDraggableState has been deprecated. Please pass thresholds and animation specs to AnchoredDraggableDefaults.flingBehavior(..) instead, which can be passed to Modifier.anchoredDraggable.")
    public static final <T> androidx.compose.foundation.gestures.AnchoredDraggableState<T> AnchoredDraggableState(T t, kotlin.jvm.functions.Function1<? super java.lang.Float, java.lang.Float> function1, kotlin.jvm.functions.Function0<java.lang.Float> function0, androidx.compose.animation.core.AnimationSpec<java.lang.Float> animationSpec, androidx.compose.animation.core.DecayAnimationSpec<java.lang.Float> decayAnimationSpec, kotlin.jvm.functions.Function1<? super T, java.lang.Boolean> function12) {
        androidx.compose.foundation.gestures.AnchoredDraggableState<T> anchoredDraggableState = new androidx.compose.foundation.gestures.AnchoredDraggableState<>(t, function12);
        anchoredDraggableState.setPositionalThreshold$foundation(function1);
        anchoredDraggableState.setVelocityThreshold$foundation(function0);
        anchoredDraggableState.setSnapAnimationSpec$foundation(animationSpec);
        anchoredDraggableState.setDecayAnimationSpec$foundation(decayAnimationSpec);
        return anchoredDraggableState;
    }

    public static /* synthetic */ androidx.compose.foundation.gestures.AnchoredDraggableState AnchoredDraggableState$default(java.lang.Object obj, androidx.compose.foundation.gestures.DraggableAnchors draggableAnchors, kotlin.jvm.functions.Function1 function1, kotlin.jvm.functions.Function0 function0, androidx.compose.animation.core.AnimationSpec animationSpec, androidx.compose.animation.core.DecayAnimationSpec decayAnimationSpec, kotlin.jvm.functions.Function1 function12, int i, java.lang.Object obj2) {
        if ((i & 64) != 0) {
            function12 = new kotlin.jvm.functions.Function1() { // from class: androidx.compose.foundation.gestures.AnchoredDraggableKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj3) {
                    return java.lang.Boolean.valueOf(androidx.compose.foundation.gestures.AnchoredDraggableKt.$r8$lambda$SyNEHB4d22ap4A8VDebElLHlrQk(obj3));
                }
            };
        }
        return AnchoredDraggableState(obj, draggableAnchors, function1, function0, animationSpec, decayAnimationSpec, function12);
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.WARNING, message = "This constructor of AnchoredDraggableState has been deprecated. Please pass thresholds and animation specs to AnchoredDraggableDefaults.flingBehavior(..) instead, which can be passed to Modifier.anchoredDraggable.")
    public static final <T> androidx.compose.foundation.gestures.AnchoredDraggableState<T> AnchoredDraggableState(T t, androidx.compose.foundation.gestures.DraggableAnchors<T> draggableAnchors, kotlin.jvm.functions.Function1<? super java.lang.Float, java.lang.Float> function1, kotlin.jvm.functions.Function0<java.lang.Float> function0, androidx.compose.animation.core.AnimationSpec<java.lang.Float> animationSpec, androidx.compose.animation.core.DecayAnimationSpec<java.lang.Float> decayAnimationSpec, kotlin.jvm.functions.Function1<? super T, java.lang.Boolean> function12) {
        androidx.compose.foundation.gestures.AnchoredDraggableState<T> anchoredDraggableState = new androidx.compose.foundation.gestures.AnchoredDraggableState<>(t, draggableAnchors, function12);
        anchoredDraggableState.setPositionalThreshold$foundation(function1);
        anchoredDraggableState.setVelocityThreshold$foundation(function0);
        anchoredDraggableState.setSnapAnimationSpec$foundation(animationSpec);
        anchoredDraggableState.setDecayAnimationSpec$foundation(decayAnimationSpec);
        return anchoredDraggableState;
    }

    public static final <T> java.lang.Object snapTo(androidx.compose.foundation.gestures.AnchoredDraggableState<T> anchoredDraggableState, T t, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object anchoredDrag$default = androidx.compose.foundation.gestures.AnchoredDraggableState.anchoredDrag$default(anchoredDraggableState, t, null, new androidx.compose.foundation.gestures.AnchoredDraggableKt$snapTo$2(null), continuation, 2, null);
        return anchoredDrag$default == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? anchoredDrag$default : kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> java.lang.Object getHighSpeedVideoSizes(androidx.compose.foundation.gestures.AnchoredDraggableState<T> anchoredDraggableState, float f, final androidx.compose.foundation.gestures.AnchoredDragScope anchoredDragScope, androidx.compose.foundation.gestures.DraggableAnchors<T> draggableAnchors, T t, androidx.compose.animation.core.AnimationSpec<java.lang.Float> animationSpec, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object animate;
        float positionOf = draggableAnchors.positionOf(t);
        final kotlin.jvm.internal.Ref.FloatRef floatRef = new kotlin.jvm.internal.Ref.FloatRef();
        floatRef.element = java.lang.Float.isNaN(anchoredDraggableState.getOffset()) ? 0.0f : anchoredDraggableState.getOffset();
        return (java.lang.Float.isNaN(positionOf) || floatRef.element == positionOf || (animate = androidx.compose.animation.core.SuspendAnimationKt.animate(floatRef.element, positionOf, f, animationSpec, new kotlin.jvm.functions.Function2() { // from class: androidx.compose.foundation.gestures.AnchoredDraggableKt$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                kotlin.Unit highSpeedVideoFpsRanges;
                highSpeedVideoFpsRanges = androidx.compose.foundation.gestures.AnchoredDraggableKt.getHighSpeedVideoFpsRanges(androidx.compose.foundation.gestures.AnchoredDragScope.this, floatRef, ((java.lang.Float) obj).floatValue(), ((java.lang.Float) obj2).floatValue());
                return highSpeedVideoFpsRanges;
            }
        }, continuation)) != kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) ? kotlin.Unit.INSTANCE : animate;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit getHighSpeedVideoFpsRanges(androidx.compose.foundation.gestures.AnchoredDragScope anchoredDragScope, kotlin.jvm.internal.Ref.FloatRef floatRef, float f, float f2) {
        anchoredDragScope.dragTo(f, f2);
        floatRef.element = f;
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ java.lang.Object animateTo$default(androidx.compose.foundation.gestures.AnchoredDraggableState anchoredDraggableState, java.lang.Object obj, androidx.compose.animation.core.AnimationSpec animationSpec, kotlin.coroutines.Continuation continuation, int i, java.lang.Object obj2) {
        if ((i & 2) != 0) {
            if (anchoredDraggableState.getUsePreModifierChangeBehavior$foundation()) {
                animationSpec = anchoredDraggableState.getSnapAnimationSpec();
            } else {
                animationSpec = androidx.compose.foundation.gestures.AnchoredDraggableDefaults.INSTANCE.getSnapAnimationSpec();
            }
        }
        return animateTo(anchoredDraggableState, obj, animationSpec, continuation);
    }

    public static final <T> java.lang.Object animateTo(androidx.compose.foundation.gestures.AnchoredDraggableState<T> anchoredDraggableState, T t, androidx.compose.animation.core.AnimationSpec<java.lang.Float> animationSpec, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object anchoredDrag$default = androidx.compose.foundation.gestures.AnchoredDraggableState.anchoredDrag$default(anchoredDraggableState, t, null, new androidx.compose.foundation.gestures.AnchoredDraggableKt$animateTo$4(anchoredDraggableState, animationSpec, null), continuation, 2, null);
        return anchoredDrag$default == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? anchoredDrag$default : kotlin.Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <T> java.lang.Object animateToWithDecay(androidx.compose.foundation.gestures.AnchoredDraggableState<T> anchoredDraggableState, T t, float f, androidx.compose.animation.core.AnimationSpec<java.lang.Float> animationSpec, androidx.compose.animation.core.DecayAnimationSpec<java.lang.Float> decayAnimationSpec, kotlin.coroutines.Continuation<? super java.lang.Float> continuation) {
        androidx.compose.foundation.gestures.AnchoredDraggableKt$animateToWithDecay$1 anchoredDraggableKt$animateToWithDecay$1;
        int i;
        kotlin.jvm.internal.Ref.FloatRef floatRef;
        float f2;
        if (continuation instanceof androidx.compose.foundation.gestures.AnchoredDraggableKt$animateToWithDecay$1) {
            anchoredDraggableKt$animateToWithDecay$1 = (androidx.compose.foundation.gestures.AnchoredDraggableKt$animateToWithDecay$1) continuation;
            if ((anchoredDraggableKt$animateToWithDecay$1.Camera2StreamConfigurationMap & Integer.MIN_VALUE) != 0) {
                anchoredDraggableKt$animateToWithDecay$1.Camera2StreamConfigurationMap -= 2147483648;
                androidx.compose.foundation.gestures.AnchoredDraggableKt$animateToWithDecay$1 anchoredDraggableKt$animateToWithDecay$12 = anchoredDraggableKt$animateToWithDecay$1;
                java.lang.Object obj = anchoredDraggableKt$animateToWithDecay$12.getHighSpeedVideoFpsRangesFor;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = anchoredDraggableKt$animateToWithDecay$12.Camera2StreamConfigurationMap;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    kotlin.jvm.internal.Ref.FloatRef floatRef2 = new kotlin.jvm.internal.Ref.FloatRef();
                    floatRef2.element = f;
                    androidx.compose.foundation.gestures.AnchoredDraggableKt$animateToWithDecay$2 anchoredDraggableKt$animateToWithDecay$2 = new androidx.compose.foundation.gestures.AnchoredDraggableKt$animateToWithDecay$2(anchoredDraggableState, f, animationSpec, floatRef2, decayAnimationSpec, null);
                    anchoredDraggableKt$animateToWithDecay$12.getHighResolutionOutputSizeshNQ4ISI = floatRef2;
                    anchoredDraggableKt$animateToWithDecay$12.getHighSpeedVideoFpsRanges = f;
                    anchoredDraggableKt$animateToWithDecay$12.Camera2StreamConfigurationMap = 1;
                    if (androidx.compose.foundation.gestures.AnchoredDraggableState.anchoredDrag$default(anchoredDraggableState, t, null, anchoredDraggableKt$animateToWithDecay$2, anchoredDraggableKt$animateToWithDecay$12, 2, null) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    floatRef = floatRef2;
                    f2 = f;
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    f2 = anchoredDraggableKt$animateToWithDecay$12.getHighSpeedVideoFpsRanges;
                    floatRef = (kotlin.jvm.internal.Ref.FloatRef) anchoredDraggableKt$animateToWithDecay$12.getHighResolutionOutputSizeshNQ4ISI;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                return kotlin.coroutines.jvm.internal.Boxing.boxFloat(f2 - floatRef.element);
            }
        }
        anchoredDraggableKt$animateToWithDecay$1 = new androidx.compose.foundation.gestures.AnchoredDraggableKt$animateToWithDecay$1(continuation);
        androidx.compose.foundation.gestures.AnchoredDraggableKt$animateToWithDecay$1 anchoredDraggableKt$animateToWithDecay$122 = anchoredDraggableKt$animateToWithDecay$1;
        java.lang.Object obj2 = anchoredDraggableKt$animateToWithDecay$122.getHighSpeedVideoFpsRangesFor;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = anchoredDraggableKt$animateToWithDecay$122.Camera2StreamConfigurationMap;
        if (i != 0) {
        }
        return kotlin.coroutines.jvm.internal.Boxing.boxFloat(f2 - floatRef.element);
    }

    public static /* synthetic */ java.lang.Object animateToWithDecay$default(androidx.compose.foundation.gestures.AnchoredDraggableState anchoredDraggableState, java.lang.Object obj, float f, androidx.compose.animation.core.AnimationSpec animationSpec, androidx.compose.animation.core.DecayAnimationSpec decayAnimationSpec, kotlin.coroutines.Continuation continuation, int i, java.lang.Object obj2) {
        if ((i & 4) != 0) {
            if (anchoredDraggableState.getUsePreModifierChangeBehavior$foundation()) {
                animationSpec = anchoredDraggableState.getSnapAnimationSpec();
            } else {
                animationSpec = androidx.compose.foundation.gestures.AnchoredDraggableDefaults.INSTANCE.getSnapAnimationSpec();
            }
        }
        androidx.compose.animation.core.AnimationSpec animationSpec2 = animationSpec;
        if ((i & 8) != 0) {
            if (anchoredDraggableState.getUsePreModifierChangeBehavior$foundation()) {
                decayAnimationSpec = anchoredDraggableState.getDecayAnimationSpec();
            } else {
                decayAnimationSpec = androidx.compose.foundation.gestures.AnchoredDraggableDefaults.INSTANCE.getDecayAnimationSpec();
            }
        }
        return animateToWithDecay(anchoredDraggableState, obj, f, animationSpec2, decayAnimationSpec, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> T getHighSpeedVideoFpsRangesFor(androidx.compose.foundation.gestures.DraggableAnchors<T> draggableAnchors, float f, float f2, kotlin.jvm.functions.Function1<? super java.lang.Float, java.lang.Float> function1, kotlin.jvm.functions.Function0<java.lang.Float> function0) {
        if (java.lang.Float.isNaN(f)) {
            throw new java.lang.IllegalArgumentException("The offset provided to computeTarget must not be NaN.".toString());
        }
        boolean z = java.lang.Math.abs(f2) > 0.0f;
        boolean z2 = z && f2 > 0.0f;
        if (!z) {
            T closestAnchor = draggableAnchors.closestAnchor(f);
            kotlin.jvm.internal.Intrinsics.checkNotNull(closestAnchor);
            return closestAnchor;
        }
        if (java.lang.Math.abs(f2) >= java.lang.Math.abs(function0.invoke().floatValue())) {
            T closestAnchor2 = draggableAnchors.closestAnchor(f, z2);
            kotlin.jvm.internal.Intrinsics.checkNotNull(closestAnchor2);
            return closestAnchor2;
        }
        T closestAnchor3 = draggableAnchors.closestAnchor(f, false);
        kotlin.jvm.internal.Intrinsics.checkNotNull(closestAnchor3);
        float positionOf = draggableAnchors.positionOf(closestAnchor3);
        T closestAnchor4 = draggableAnchors.closestAnchor(f, true);
        kotlin.jvm.internal.Intrinsics.checkNotNull(closestAnchor4);
        float positionOf2 = draggableAnchors.positionOf(closestAnchor4);
        float abs = java.lang.Math.abs(function1.invoke(java.lang.Float.valueOf(java.lang.Math.abs(positionOf - positionOf2))).floatValue());
        if (!z2) {
            positionOf = positionOf2;
        }
        return (java.lang.Math.abs(positionOf - f) < abs ? !z2 : z2) ? closestAnchor4 : closestAnchor3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float getHighSpeedVideoFpsRangesFor(float f, float f2) {
        if (f2 == 0.0f) {
            return 0.0f;
        }
        return f2 > 0.0f ? kotlin.ranges.RangesKt.coerceAtMost(f, f2) : kotlin.ranges.RangesKt.coerceAtLeast(f, f2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(2:3|(7:5|6|7|(1:(1:10)(2:16|17))(3:18|19|(1:21))|11|12|13))|23|6|7|(0)(0)|11|12|13) */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <I> java.lang.Object getHighSpeedVideoFpsRangesFor(kotlin.jvm.functions.Function0<? extends I> function0, kotlin.jvm.functions.Function2<? super I, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> function2, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        androidx.compose.foundation.gestures.AnchoredDraggableKt$restartable$1 anchoredDraggableKt$restartable$1;
        int i;
        if (continuation instanceof androidx.compose.foundation.gestures.AnchoredDraggableKt$restartable$1) {
            anchoredDraggableKt$restartable$1 = (androidx.compose.foundation.gestures.AnchoredDraggableKt$restartable$1) continuation;
            if ((anchoredDraggableKt$restartable$1.getHighSpeedVideoFpsRangesFor & Integer.MIN_VALUE) != 0) {
                anchoredDraggableKt$restartable$1.getHighSpeedVideoFpsRangesFor -= 2147483648;
                java.lang.Object obj = anchoredDraggableKt$restartable$1.getHighSpeedVideoFpsRanges;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = anchoredDraggableKt$restartable$1.getHighSpeedVideoFpsRangesFor;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    androidx.compose.foundation.gestures.AnchoredDraggableKt$restartable$2 anchoredDraggableKt$restartable$2 = new androidx.compose.foundation.gestures.AnchoredDraggableKt$restartable$2(function0, function2, null);
                    anchoredDraggableKt$restartable$1.getHighSpeedVideoFpsRangesFor = 1;
                    if (kotlinx.coroutines.CoroutineScopeKt.coroutineScope(anchoredDraggableKt$restartable$2, anchoredDraggableKt$restartable$1) == coroutine_suspended) {
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
        }
        anchoredDraggableKt$restartable$1 = new androidx.compose.foundation.gestures.AnchoredDraggableKt$restartable$1(continuation);
        java.lang.Object obj2 = anchoredDraggableKt$restartable$1.getHighSpeedVideoFpsRanges;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = anchoredDraggableKt$restartable$1.getHighSpeedVideoFpsRangesFor;
        if (i != 0) {
        }
        return kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> androidx.compose.foundation.gestures.DefaultDraggableAnchors<T> getHighSpeedVideoFpsRangesFor() {
        return new androidx.compose.foundation.gestures.DefaultDraggableAnchors<>(kotlin.collections.CollectionsKt.emptyList(), new float[0]);
    }

    public static final float getAnchoredDraggableMinFlingVelocity() {
        return AnchoredDraggableMinFlingVelocity;
    }

    public static final <T> androidx.compose.foundation.gestures.TargetedFlingBehavior anchoredDraggableFlingBehavior(androidx.compose.foundation.gestures.AnchoredDraggableState<T> anchoredDraggableState, final androidx.compose.ui.unit.Density density, kotlin.jvm.functions.Function1<? super java.lang.Float, java.lang.Float> function1, androidx.compose.animation.core.AnimationSpec<java.lang.Float> animationSpec) {
        return androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt.snapFlingBehavior(getHighResolutionOutputSizeshNQ4ISI(anchoredDraggableState, function1, new kotlin.jvm.functions.Function0() { // from class: androidx.compose.foundation.gestures.AnchoredDraggableKt$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                float Camera2StreamConfigurationMap;
                Camera2StreamConfigurationMap = androidx.compose.foundation.gestures.AnchoredDraggableKt.Camera2StreamConfigurationMap(androidx.compose.ui.unit.Density.this);
                return java.lang.Float.valueOf(Camera2StreamConfigurationMap);
            }
        }), getHighSpeedVideoSizes, animationSpec);
    }

    private static final <T> androidx.compose.foundation.gestures.snapping.SnapLayoutInfoProvider getHighResolutionOutputSizeshNQ4ISI(final androidx.compose.foundation.gestures.AnchoredDraggableState<T> anchoredDraggableState, final kotlin.jvm.functions.Function1<? super java.lang.Float, java.lang.Float> function1, final kotlin.jvm.functions.Function0<java.lang.Float> function0) {
        return new androidx.compose.foundation.gestures.snapping.SnapLayoutInfoProvider() { // from class: androidx.compose.foundation.gestures.AnchoredDraggableKt$AnchoredDraggableLayoutInfoProvider$1
            @Override // androidx.compose.foundation.gestures.snapping.SnapLayoutInfoProvider
            public final float calculateApproachOffset(float velocity, float decayOffset) {
                return 0.0f;
            }

            @Override // androidx.compose.foundation.gestures.snapping.SnapLayoutInfoProvider
            public final float calculateSnapOffset(float velocity) {
                float requireOffset = anchoredDraggableState.requireOffset();
                java.lang.Object highSpeedVideoFpsRangesFor = androidx.compose.foundation.gestures.AnchoredDraggableKt.getHighSpeedVideoFpsRangesFor(anchoredDraggableState.getAnchors(), requireOffset, velocity, function1, function0);
                if (!((java.lang.Boolean) anchoredDraggableState.getConfirmValueChange$foundation().invoke(highSpeedVideoFpsRangesFor)).booleanValue()) {
                    highSpeedVideoFpsRangesFor = anchoredDraggableState.getSettledValue();
                }
                return anchoredDraggableState.getAnchors().positionOf(highSpeedVideoFpsRangesFor) - requireOffset;
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float Camera2StreamConfigurationMap(androidx.compose.ui.unit.Density density) {
        return density.mo1418toPx0680j_4(androidx.compose.ui.unit.Dp.m8601constructorimpl(125.0f));
    }
}
