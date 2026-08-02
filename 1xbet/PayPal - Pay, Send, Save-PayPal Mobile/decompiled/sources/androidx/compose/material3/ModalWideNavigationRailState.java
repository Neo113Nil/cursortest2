package androidx.compose.material3;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nH\u0096@¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\nH\u0096@¢\u0006\u0004\b\r\u0010\fJ\u0010\u0010\u000e\u001a\u00020\nH\u0096@¢\u0006\u0004\b\u000e\u0010\fJ\u0018\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000fH\u0096@¢\u0006\u0004\b\u0011\u0010\u0012J\u0018\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u0006H\u0080@¢\u0006\u0004\b\u0014\u0010\u0015J.\u0010\u0019\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u000f2\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0018\u001a\u00020\u0006H\u0082@¢\u0006\u0004\b\u0019\u0010\u001aR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0007¢\u0006\f\n\u0004\b\u0007\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR \u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u000f0\u001e8\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0014\u0010%\u001a\u00020\u000f8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b#\u0010$R\u0014\u0010\u0010\u001a\u00020\u000f8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b&\u0010$R\u0014\u0010(\u001a\u00020'8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b(\u0010)R\u0011\u0010,\u001a\u00020\u00068G¢\u0006\u0006\u001a\u0004\b*\u0010+"}, d2 = {"Landroidx/compose/material3/ModalWideNavigationRailState;", "Landroidx/compose/material3/WideNavigationRailState;", "state", "Landroidx/compose/ui/unit/Density;", "density", "Landroidx/compose/animation/core/AnimationSpec;", "", "animationSpec", "<init>", "(Landroidx/compose/material3/WideNavigationRailState;Landroidx/compose/ui/unit/Density;Landroidx/compose/animation/core/AnimationSpec;)V", "", "expand", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "collapse", "toggle", "Landroidx/compose/material3/WideNavigationRailValue;", "targetValue", "snapTo", "(Landroidx/compose/material3/WideNavigationRailValue;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "velocity", "settle$material3", "(FLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "p0", "p1", "p2", "getHighResolutionOutputSizeshNQ4ISI", "(Landroidx/compose/material3/WideNavigationRailValue;Landroidx/compose/animation/core/AnimationSpec;FLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/compose/animation/core/AnimationSpec;", "getAnimationSpec", "()Landroidx/compose/animation/core/AnimationSpec;", "Landroidx/compose/material3/internal/AnchoredDraggableState;", "anchoredDraggableState", "Landroidx/compose/material3/internal/AnchoredDraggableState;", "getAnchoredDraggableState$material3", "()Landroidx/compose/material3/internal/AnchoredDraggableState;", "getCurrentValue", "()Landroidx/compose/material3/WideNavigationRailValue;", "currentValue", "getTargetValue", "", "isAnimating", "()Z", "getCurrentOffset", "()F", "currentOffset"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ModalWideNavigationRailState implements androidx.compose.material3.WideNavigationRailState {
    public static final int $stable = 8;
    private final /* synthetic */ androidx.compose.material3.WideNavigationRailState Camera2StreamConfigurationMap;
    private final androidx.compose.material3.internal.AnchoredDraggableState<androidx.compose.material3.WideNavigationRailValue> anchoredDraggableState;
    private final androidx.compose.animation.core.AnimationSpec<java.lang.Float> animationSpec;

    public static /* synthetic */ float $r8$lambda$Y1YLbOLEbGscCneQ1gvqzKVzcSQ(float f) {
        return f * 0.5f;
    }

    public ModalWideNavigationRailState(androidx.compose.material3.WideNavigationRailState wideNavigationRailState, final androidx.compose.ui.unit.Density density, androidx.compose.animation.core.AnimationSpec<java.lang.Float> animationSpec) {
        this.Camera2StreamConfigurationMap = wideNavigationRailState;
        this.animationSpec = animationSpec;
        this.anchoredDraggableState = new androidx.compose.material3.internal.AnchoredDraggableState<>(wideNavigationRailState.getTargetValue(), new kotlin.jvm.functions.Function1() { // from class: androidx.compose.material3.ModalWideNavigationRailState$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Float.valueOf(androidx.compose.material3.ModalWideNavigationRailState.$r8$lambda$Y1YLbOLEbGscCneQ1gvqzKVzcSQ(((java.lang.Float) obj).floatValue()));
            }
        }, new kotlin.jvm.functions.Function0() { // from class: androidx.compose.material3.ModalWideNavigationRailState$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                float mo1418toPx0680j_4;
                mo1418toPx0680j_4 = androidx.compose.ui.unit.Density.this.mo1418toPx0680j_4(androidx.compose.ui.unit.Dp.m8601constructorimpl(400.0f));
                return java.lang.Float.valueOf(mo1418toPx0680j_4);
            }
        }, new kotlin.jvm.functions.Function0() { // from class: androidx.compose.material3.ModalWideNavigationRailState$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                androidx.compose.animation.core.AnimationSpec animationSpec2;
                animationSpec2 = androidx.compose.material3.ModalWideNavigationRailState.this.animationSpec;
                return animationSpec2;
            }
        }, null, 16, null);
    }

    public final androidx.compose.animation.core.AnimationSpec<java.lang.Float> getAnimationSpec() {
        return this.animationSpec;
    }

    public final androidx.compose.material3.internal.AnchoredDraggableState<androidx.compose.material3.WideNavigationRailValue> getAnchoredDraggableState$material3() {
        return this.anchoredDraggableState;
    }

    @Override // androidx.compose.material3.WideNavigationRailState
    public final androidx.compose.material3.WideNavigationRailValue getCurrentValue() {
        return this.anchoredDraggableState.getCurrentValue();
    }

    @Override // androidx.compose.material3.WideNavigationRailState
    public final androidx.compose.material3.WideNavigationRailValue getTargetValue() {
        return this.anchoredDraggableState.getTargetValue();
    }

    @Override // androidx.compose.material3.WideNavigationRailState
    public final boolean isAnimating() {
        return this.anchoredDraggableState.isAnimationRunning();
    }

    @Override // androidx.compose.material3.WideNavigationRailState
    public final java.lang.Object expand(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(androidx.compose.material3.WideNavigationRailValue.Expanded, this.animationSpec, this.anchoredDraggableState.getLastVelocity(), continuation);
        return highResolutionOutputSizeshNQ4ISI == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? highResolutionOutputSizeshNQ4ISI : kotlin.Unit.INSTANCE;
    }

    @Override // androidx.compose.material3.WideNavigationRailState
    public final java.lang.Object collapse(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(androidx.compose.material3.WideNavigationRailValue.Collapsed, this.animationSpec, this.anchoredDraggableState.getLastVelocity(), continuation);
        return highResolutionOutputSizeshNQ4ISI == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? highResolutionOutputSizeshNQ4ISI : kotlin.Unit.INSTANCE;
    }

    @Override // androidx.compose.material3.WideNavigationRailState
    public final java.lang.Object toggle(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(androidx.compose.material3.WideNavigationRailStateKt.not(getTargetValue()), this.animationSpec, this.anchoredDraggableState.getLastVelocity(), continuation);
        return highResolutionOutputSizeshNQ4ISI == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? highResolutionOutputSizeshNQ4ISI : kotlin.Unit.INSTANCE;
    }

    @Override // androidx.compose.material3.WideNavigationRailState
    public final java.lang.Object snapTo(androidx.compose.material3.WideNavigationRailValue wideNavigationRailValue, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object snapTo = androidx.compose.material3.internal.AnchoredDraggableKt.snapTo(this.anchoredDraggableState, wideNavigationRailValue, continuation);
        return snapTo == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? snapTo : kotlin.Unit.INSTANCE;
    }

    public final java.lang.Object settle$material3(float f, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object obj = this.anchoredDraggableState.settle(f, continuation);
        return obj == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? obj : kotlin.Unit.INSTANCE;
    }

    public final float getCurrentOffset() {
        return this.anchoredDraggableState.getOffset();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.lang.Object getHighResolutionOutputSizeshNQ4ISI(androidx.compose.material3.WideNavigationRailValue wideNavigationRailValue, androidx.compose.animation.core.AnimationSpec<java.lang.Float> animationSpec, float f, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object anchoredDrag$default = androidx.compose.material3.internal.AnchoredDraggableState.anchoredDrag$default(this.anchoredDraggableState, wideNavigationRailValue, null, new androidx.compose.material3.ModalWideNavigationRailState$animateTo$2(this, f, animationSpec, null), continuation, 2, null);
        return anchoredDrag$default == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? anchoredDrag$default : kotlin.Unit.INSTANCE;
    }
}
