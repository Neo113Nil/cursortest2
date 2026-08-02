package androidx.compose.material;

@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0010\u0018\u0000 .2\u00020\u0001:\u0001.B=\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0014\b\u0002\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012H\u0086@¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0012H\u0086@¢\u0006\u0004\b\u0015\u0010\u0014J\r\u0010\u0016\u001a\u00020\u0007¢\u0006\u0004\b\u0016\u0010\u0017J\"\u0010\u001a\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u00022\b\b\u0002\u0010\u0019\u001a\u00020\u0007H\u0080@¢\u0006\u0004\b\u001a\u0010\u001bJ\u0018\u0010\u001c\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u0002H\u0080@¢\u0006\u0004\b\u001c\u0010\u001dR \u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00020\u001e8\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0011\u0010%\u001a\u00020\u00028G¢\u0006\u0006\u001a\u0004\b#\u0010$R\u0011\u0010'\u001a\u00020\u00028G¢\u0006\u0006\u001a\u0004\b&\u0010$R\u0011\u0010(\u001a\u00020\n8G¢\u0006\u0006\u001a\u0004\b(\u0010)R\u0011\u0010*\u001a\u00020\n8G¢\u0006\u0006\u001a\u0004\b*\u0010)R\u001a\u0010\u0010\u001a\u00020\u00078GX\u0087\u0004¢\u0006\f\u0012\u0004\b,\u0010-\u001a\u0004\b+\u0010\u0017"}, d2 = {"Landroidx/compose/material/BottomSheetState;", "", "Landroidx/compose/material/BottomSheetValue;", "initialValue", "Landroidx/compose/ui/unit/Density;", "density", "Landroidx/compose/animation/core/AnimationSpec;", "", "animationSpec", "Lkotlin/Function1;", "", "confirmValueChange", "<init>", "(Landroidx/compose/material/BottomSheetValue;Landroidx/compose/ui/unit/Density;Landroidx/compose/animation/core/AnimationSpec;Lkotlin/jvm/functions/Function1;)V", "from", androidx.constraintlayout.core.motion.utils.TypedValues.TransitionType.S_TO, "progress", "(Landroidx/compose/material/BottomSheetValue;Landroidx/compose/material/BottomSheetValue;)F", "", "expand", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "collapse", "requireOffset", "()F", androidx.constraintlayout.core.motion.utils.TypedValues.AttributesType.S_TARGET, "velocity", "animateTo$material", "(Landroidx/compose/material/BottomSheetValue;FLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "snapTo$material", "(Landroidx/compose/material/BottomSheetValue;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/compose/material/AnchoredDraggableState;", "anchoredDraggableState", "Landroidx/compose/material/AnchoredDraggableState;", "getAnchoredDraggableState$material", "()Landroidx/compose/material/AnchoredDraggableState;", "getCurrentValue", "()Landroidx/compose/material/BottomSheetValue;", "currentValue", "getTargetValue", "targetValue", com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.IS_EXPANDED, "()Z", "isCollapsed", "getProgress", "getProgress$annotations", "()V", "Companion"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class BottomSheetState {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.compose.material.BottomSheetState.Companion INSTANCE = new androidx.compose.material.BottomSheetState.Companion(null);
    private final androidx.compose.material.AnchoredDraggableState<androidx.compose.material.BottomSheetValue> anchoredDraggableState;

    /* renamed from: $r8$lambda$nZsV7ir1-OQph8OyrKw7cRrLpXE, reason: not valid java name */
    public static /* synthetic */ boolean m2521$r8$lambda$nZsV7ir1OQph8OyrKw7cRrLpXE(androidx.compose.material.BottomSheetValue bottomSheetValue) {
        return true;
    }

    @kotlin.Deprecated(message = "Please use the progress function to query progress explicitly between targets.", replaceWith = @kotlin.ReplaceWith(expression = "progress(from = , to = )", imports = {}))
    public static /* synthetic */ void getProgress$annotations() {
    }

    public BottomSheetState(androidx.compose.material.BottomSheetValue bottomSheetValue, final androidx.compose.ui.unit.Density density, androidx.compose.animation.core.AnimationSpec<java.lang.Float> animationSpec, kotlin.jvm.functions.Function1<? super androidx.compose.material.BottomSheetValue, java.lang.Boolean> function1) {
        this.anchoredDraggableState = new androidx.compose.material.AnchoredDraggableState<>(bottomSheetValue, new kotlin.jvm.functions.Function1() { // from class: androidx.compose.material.BottomSheetState$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Float.valueOf(androidx.compose.material.BottomSheetState.$r8$lambda$0t995DqyYuA7Dj6C5DjefCoprz4(androidx.compose.ui.unit.Density.this, ((java.lang.Float) obj).floatValue()));
            }
        }, new kotlin.jvm.functions.Function0() { // from class: androidx.compose.material.BottomSheetState$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return java.lang.Float.valueOf(androidx.compose.material.BottomSheetState.$r8$lambda$nHEMZEWhOtXIFI1euzB__h0gOto(androidx.compose.ui.unit.Density.this));
            }
        }, animationSpec, function1);
    }

    public /* synthetic */ BottomSheetState(androidx.compose.material.BottomSheetValue bottomSheetValue, androidx.compose.ui.unit.Density density, androidx.compose.animation.core.AnimationSpec animationSpec, kotlin.jvm.functions.Function1 function1, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(bottomSheetValue, density, (i & 4) != 0 ? androidx.compose.material.BottomSheetScaffoldDefaults.INSTANCE.getAnimationSpec() : animationSpec, (i & 8) != 0 ? new kotlin.jvm.functions.Function1() { // from class: androidx.compose.material.BottomSheetState$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Boolean.valueOf(androidx.compose.material.BottomSheetState.m2521$r8$lambda$nZsV7ir1OQph8OyrKw7cRrLpXE((androidx.compose.material.BottomSheetValue) obj));
            }
        } : function1);
    }

    public final androidx.compose.material.AnchoredDraggableState<androidx.compose.material.BottomSheetValue> getAnchoredDraggableState$material() {
        return this.anchoredDraggableState;
    }

    public final androidx.compose.material.BottomSheetValue getCurrentValue() {
        return this.anchoredDraggableState.getCurrentValue();
    }

    public final androidx.compose.material.BottomSheetValue getTargetValue() {
        return this.anchoredDraggableState.getTargetValue();
    }

    public final boolean isExpanded() {
        return this.anchoredDraggableState.getCurrentValue() == androidx.compose.material.BottomSheetValue.Expanded;
    }

    public final boolean isCollapsed() {
        return this.anchoredDraggableState.getCurrentValue() == androidx.compose.material.BottomSheetValue.Collapsed;
    }

    public final float getProgress() {
        return this.anchoredDraggableState.getProgress();
    }

    public final float progress(androidx.compose.material.BottomSheetValue from, androidx.compose.material.BottomSheetValue to) {
        float positionOf = this.anchoredDraggableState.getAnchors().positionOf(from);
        float positionOf2 = this.anchoredDraggableState.getAnchors().positionOf(to);
        float coerceIn = (kotlin.ranges.RangesKt.coerceIn(this.anchoredDraggableState.getOffset(), java.lang.Math.min(positionOf, positionOf2), java.lang.Math.max(positionOf, positionOf2)) - positionOf) / (positionOf2 - positionOf);
        if (java.lang.Float.isNaN(coerceIn)) {
            return 1.0f;
        }
        return java.lang.Math.abs(coerceIn);
    }

    public final java.lang.Object expand(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        androidx.compose.material.BottomSheetValue bottomSheetValue;
        if (this.anchoredDraggableState.getAnchors().hasAnchorFor(androidx.compose.material.BottomSheetValue.Expanded)) {
            bottomSheetValue = androidx.compose.material.BottomSheetValue.Expanded;
        } else {
            bottomSheetValue = androidx.compose.material.BottomSheetValue.Collapsed;
        }
        java.lang.Object animateTo$default = androidx.compose.material.AnchoredDraggableKt.animateTo$default(this.anchoredDraggableState, bottomSheetValue, 0.0f, continuation, 2, null);
        return animateTo$default == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? animateTo$default : kotlin.Unit.INSTANCE;
    }

    public final java.lang.Object collapse(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object animateTo$default = androidx.compose.material.AnchoredDraggableKt.animateTo$default(this.anchoredDraggableState, androidx.compose.material.BottomSheetValue.Collapsed, 0.0f, continuation, 2, null);
        return animateTo$default == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? animateTo$default : kotlin.Unit.INSTANCE;
    }

    public final float requireOffset() {
        return this.anchoredDraggableState.requireOffset();
    }

    public static /* synthetic */ java.lang.Object animateTo$material$default(androidx.compose.material.BottomSheetState bottomSheetState, androidx.compose.material.BottomSheetValue bottomSheetValue, float f, kotlin.coroutines.Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            f = bottomSheetState.anchoredDraggableState.getLastVelocity();
        }
        return bottomSheetState.animateTo$material(bottomSheetValue, f, continuation);
    }

    public final java.lang.Object animateTo$material(androidx.compose.material.BottomSheetValue bottomSheetValue, float f, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object animateTo = androidx.compose.material.AnchoredDraggableKt.animateTo(this.anchoredDraggableState, bottomSheetValue, f, continuation);
        return animateTo == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? animateTo : kotlin.Unit.INSTANCE;
    }

    public final java.lang.Object snapTo$material(androidx.compose.material.BottomSheetValue bottomSheetValue, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object snapTo = androidx.compose.material.AnchoredDraggableKt.snapTo(this.anchoredDraggableState, bottomSheetValue, continuation);
        return snapTo == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? snapTo : kotlin.Unit.INSTANCE;
    }

    @kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JA\u0010\u000f\u001a\f\u0012\u0004\u0012\u00020\u000e\u0012\u0002\b\u00030\r2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00072\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000f\u0010\u0010"}, d2 = {"Landroidx/compose/material/BottomSheetState$Companion;", "", "<init>", "()V", "Landroidx/compose/animation/core/AnimationSpec;", "", "animationSpec", "Lkotlin/Function1;", "Landroidx/compose/material/BottomSheetValue;", "", "confirmStateChange", "Landroidx/compose/ui/unit/Density;", "density", "Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/material/BottomSheetState;", "Saver", "(Landroidx/compose/animation/core/AnimationSpec;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/unit/Density;)Landroidx/compose/runtime/saveable/Saver;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final androidx.compose.runtime.saveable.Saver<androidx.compose.material.BottomSheetState, ?> Saver(final androidx.compose.animation.core.AnimationSpec<java.lang.Float> animationSpec, final kotlin.jvm.functions.Function1<? super androidx.compose.material.BottomSheetValue, java.lang.Boolean> confirmStateChange, final androidx.compose.ui.unit.Density density) {
            return androidx.compose.runtime.saveable.SaverKt.Saver(new kotlin.jvm.functions.Function2() { // from class: androidx.compose.material.BottomSheetState$Companion$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    androidx.compose.material.BottomSheetValue currentValue;
                    currentValue = ((androidx.compose.material.BottomSheetState) obj2).getAnchoredDraggableState$material().getCurrentValue();
                    return currentValue;
                }
            }, new kotlin.jvm.functions.Function1() { // from class: androidx.compose.material.BottomSheetState$Companion$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return androidx.compose.material.BottomSheetState.Companion.$r8$lambda$sWURz6JVjlBv6mb7KzV2Idoax9A(androidx.compose.ui.unit.Density.this, animationSpec, confirmStateChange, (androidx.compose.material.BottomSheetValue) obj);
                }
            });
        }

        public static /* synthetic */ androidx.compose.material.BottomSheetState $r8$lambda$sWURz6JVjlBv6mb7KzV2Idoax9A(androidx.compose.ui.unit.Density density, androidx.compose.animation.core.AnimationSpec animationSpec, kotlin.jvm.functions.Function1 function1, androidx.compose.material.BottomSheetValue bottomSheetValue) {
            return new androidx.compose.material.BottomSheetState(bottomSheetValue, density, animationSpec, function1);
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static /* synthetic */ float $r8$lambda$0t995DqyYuA7Dj6C5DjefCoprz4(androidx.compose.ui.unit.Density density, float f) {
        float f2;
        f2 = androidx.compose.material.BottomSheetScaffoldKt.Camera2StreamConfigurationMap;
        return density.mo1418toPx0680j_4(f2);
    }

    public static /* synthetic */ float $r8$lambda$nHEMZEWhOtXIFI1euzB__h0gOto(androidx.compose.ui.unit.Density density) {
        float f;
        f = androidx.compose.material.BottomSheetScaffoldKt.getHighSpeedVideoFpsRanges;
        return density.mo1418toPx0680j_4(f);
    }
}
