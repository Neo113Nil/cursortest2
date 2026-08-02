package androidx.compose.material;

@kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0017\u0018\u0000 12\u00020\u0001:\u00011B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tH\u0086@¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\tH\u0086@¢\u0006\u0004\b\f\u0010\u000bJ&\u0010\u0011\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u00022\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0087@¢\u0006\u0004\b\u0011\u0010\u0012J\u0018\u0010\u0013\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u0002H\u0086@¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u000fH\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u0018\u0010\u0019R \u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00020\u001a8\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\u001f\u001a\u00020\u00058G¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u0011\u0010!\u001a\u00020\u00058G¢\u0006\u0006\u001a\u0004\b!\u0010 R\u0011\u0010$\u001a\u00020\u00028G¢\u0006\u0006\u001a\u0004\b\"\u0010#R\u0011\u0010%\u001a\u00020\u00058G¢\u0006\u0006\u001a\u0004\b%\u0010 R\u0017\u0010\r\u001a\u00020\u00028G¢\u0006\f\u0012\u0004\b'\u0010(\u001a\u0004\b&\u0010#R\u0017\u0010+\u001a\u00020\u000f8G¢\u0006\f\u0012\u0004\b*\u0010(\u001a\u0004\b)\u0010\u0016R$\u0010,\u001a\u0004\u0018\u00010\u00178\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\b,\u0010-\u001a\u0004\b.\u0010\u0019\"\u0004\b/\u00100"}, d2 = {"Landroidx/compose/material/DrawerState;", "", "Landroidx/compose/material/DrawerValue;", "initialValue", "Lkotlin/Function1;", "", "confirmStateChange", "<init>", "(Landroidx/compose/material/DrawerValue;Lkotlin/jvm/functions/Function1;)V", "", "open", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "close", "targetValue", "Landroidx/compose/animation/core/AnimationSpec;", "", "anim", "animateTo", "(Landroidx/compose/material/DrawerValue;Landroidx/compose/animation/core/AnimationSpec;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "snapTo", "(Landroidx/compose/material/DrawerValue;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "requireOffset$material", "()F", "Landroidx/compose/ui/unit/Density;", "getHighResolutionOutputSizeshNQ4ISI", "()Landroidx/compose/ui/unit/Density;", "Landroidx/compose/material/AnchoredDraggableState;", "anchoredDraggableState", "Landroidx/compose/material/AnchoredDraggableState;", "getAnchoredDraggableState$material", "()Landroidx/compose/material/AnchoredDraggableState;", "isOpen", "()Z", "isClosed", "getCurrentValue", "()Landroidx/compose/material/DrawerValue;", "currentValue", "isAnimationRunning", "getTargetValue", "getTargetValue$annotations", "()V", "getOffset", "getOffset$annotations", "offset", "density", "Landroidx/compose/ui/unit/Density;", "getDensity$material", "setDensity$material", "(Landroidx/compose/ui/unit/Density;)V", "Companion"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class DrawerState {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.compose.material.DrawerState.Companion INSTANCE = new androidx.compose.material.DrawerState.Companion(null);
    private final androidx.compose.material.AnchoredDraggableState<androidx.compose.material.DrawerValue> anchoredDraggableState;
    private androidx.compose.ui.unit.Density density;

    public static /* synthetic */ boolean $r8$lambda$_ZlKZbbDXUBuK065uMMrF04REk8(androidx.compose.material.DrawerValue drawerValue) {
        return true;
    }

    public static /* synthetic */ void getOffset$annotations() {
    }

    public static /* synthetic */ void getTargetValue$annotations() {
    }

    public DrawerState(androidx.compose.material.DrawerValue drawerValue, kotlin.jvm.functions.Function1<? super androidx.compose.material.DrawerValue, java.lang.Boolean> function1) {
        androidx.compose.animation.core.TweenSpec tweenSpec;
        tweenSpec = androidx.compose.material.DrawerKt.getHighSpeedVideoSizes;
        this.anchoredDraggableState = new androidx.compose.material.AnchoredDraggableState<>(drawerValue, new kotlin.jvm.functions.Function1() { // from class: androidx.compose.material.DrawerState$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                float Camera2StreamConfigurationMap;
                androidx.compose.material.DrawerState drawerState = androidx.compose.material.DrawerState.this;
                ((java.lang.Float) obj).floatValue();
                Camera2StreamConfigurationMap = androidx.compose.material.DrawerState.Camera2StreamConfigurationMap(drawerState);
                return java.lang.Float.valueOf(Camera2StreamConfigurationMap);
            }
        }, new kotlin.jvm.functions.Function0() { // from class: androidx.compose.material.DrawerState$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                float highResolutionOutputSizeshNQ4ISI;
                highResolutionOutputSizeshNQ4ISI = androidx.compose.material.DrawerState.getHighResolutionOutputSizeshNQ4ISI(androidx.compose.material.DrawerState.this);
                return java.lang.Float.valueOf(highResolutionOutputSizeshNQ4ISI);
            }
        }, tweenSpec, function1);
    }

    public /* synthetic */ DrawerState(androidx.compose.material.DrawerValue drawerValue, kotlin.jvm.functions.Function1 function1, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(drawerValue, (i & 2) != 0 ? new kotlin.jvm.functions.Function1() { // from class: androidx.compose.material.DrawerState$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Boolean.valueOf(androidx.compose.material.DrawerState.$r8$lambda$_ZlKZbbDXUBuK065uMMrF04REk8((androidx.compose.material.DrawerValue) obj));
            }
        } : function1);
    }

    public final androidx.compose.material.AnchoredDraggableState<androidx.compose.material.DrawerValue> getAnchoredDraggableState$material() {
        return this.anchoredDraggableState;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float Camera2StreamConfigurationMap(androidx.compose.material.DrawerState drawerState) {
        float f;
        androidx.compose.ui.unit.Density highResolutionOutputSizeshNQ4ISI = drawerState.getHighResolutionOutputSizeshNQ4ISI();
        f = androidx.compose.material.DrawerKt.getHighSpeedVideoFpsRanges;
        return highResolutionOutputSizeshNQ4ISI.mo1418toPx0680j_4(f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float getHighResolutionOutputSizeshNQ4ISI(androidx.compose.material.DrawerState drawerState) {
        float f;
        androidx.compose.ui.unit.Density highResolutionOutputSizeshNQ4ISI = drawerState.getHighResolutionOutputSizeshNQ4ISI();
        f = androidx.compose.material.DrawerKt.getHighResolutionOutputSizeshNQ4ISI;
        return highResolutionOutputSizeshNQ4ISI.mo1418toPx0680j_4(f);
    }

    public final boolean isOpen() {
        return getCurrentValue() == androidx.compose.material.DrawerValue.Open;
    }

    public final boolean isClosed() {
        return getCurrentValue() == androidx.compose.material.DrawerValue.Closed;
    }

    public final androidx.compose.material.DrawerValue getCurrentValue() {
        return this.anchoredDraggableState.getCurrentValue();
    }

    public final boolean isAnimationRunning() {
        return this.anchoredDraggableState.isAnimationRunning();
    }

    public final java.lang.Object open(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object animateTo$default = androidx.compose.material.AnchoredDraggableKt.animateTo$default(this.anchoredDraggableState, androidx.compose.material.DrawerValue.Open, 0.0f, continuation, 2, null);
        return animateTo$default == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? animateTo$default : kotlin.Unit.INSTANCE;
    }

    public final java.lang.Object close(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object animateTo$default = androidx.compose.material.AnchoredDraggableKt.animateTo$default(this.anchoredDraggableState, androidx.compose.material.DrawerValue.Closed, 0.0f, continuation, 2, null);
        return animateTo$default == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? animateTo$default : kotlin.Unit.INSTANCE;
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "This method has been replaced by the open and close methods. The animation spec is now an implementation detail of ModalDrawer.")
    public final java.lang.Object animateTo(androidx.compose.material.DrawerValue drawerValue, androidx.compose.animation.core.AnimationSpec<java.lang.Float> animationSpec, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object animateTo$default = androidx.compose.material.AnchoredDraggableKt.animateTo$default(this.anchoredDraggableState, drawerValue, 0.0f, continuation, 2, null);
        return animateTo$default == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? animateTo$default : kotlin.Unit.INSTANCE;
    }

    public final java.lang.Object snapTo(androidx.compose.material.DrawerValue drawerValue, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object snapTo = androidx.compose.material.AnchoredDraggableKt.snapTo(this.anchoredDraggableState, drawerValue, continuation);
        return snapTo == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? snapTo : kotlin.Unit.INSTANCE;
    }

    public final androidx.compose.material.DrawerValue getTargetValue() {
        return this.anchoredDraggableState.getTargetValue();
    }

    public final float getOffset() {
        return this.anchoredDraggableState.getOffset();
    }

    public final float requireOffset$material() {
        return this.anchoredDraggableState.requireOffset();
    }

    /* renamed from: getDensity$material, reason: from getter */
    public final androidx.compose.ui.unit.Density getDensity() {
        return this.density;
    }

    public final void setDensity$material(androidx.compose.ui.unit.Density density) {
        this.density = density;
    }

    private final androidx.compose.ui.unit.Density getHighResolutionOutputSizeshNQ4ISI() {
        androidx.compose.ui.unit.Density density = this.density;
        if (density != null) {
            return density;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("The density on DrawerState (");
        sb.append(this);
        sb.append(") was not set. Did you use DrawerState with the Drawer composable?");
        throw new java.lang.IllegalArgumentException(sb.toString().toString());
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J-\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00050\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"Landroidx/compose/material/DrawerState$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Landroidx/compose/material/DrawerValue;", "", "confirmStateChange", "Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/material/DrawerState;", "Saver", "(Lkotlin/jvm/functions/Function1;)Landroidx/compose/runtime/saveable/Saver;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final androidx.compose.runtime.saveable.Saver<androidx.compose.material.DrawerState, androidx.compose.material.DrawerValue> Saver(final kotlin.jvm.functions.Function1<? super androidx.compose.material.DrawerValue, java.lang.Boolean> confirmStateChange) {
            return androidx.compose.runtime.saveable.SaverKt.Saver(new kotlin.jvm.functions.Function2() { // from class: androidx.compose.material.DrawerState$Companion$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    androidx.compose.material.DrawerValue currentValue;
                    currentValue = ((androidx.compose.material.DrawerState) obj2).getCurrentValue();
                    return currentValue;
                }
            }, new kotlin.jvm.functions.Function1() { // from class: androidx.compose.material.DrawerState$Companion$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return androidx.compose.material.DrawerState.Companion.$r8$lambda$40OrqYKjahsKGQadlZdM1b82sRU(kotlin.jvm.functions.Function1.this, (androidx.compose.material.DrawerValue) obj);
                }
            });
        }

        public static /* synthetic */ androidx.compose.material.DrawerState $r8$lambda$40OrqYKjahsKGQadlZdM1b82sRU(kotlin.jvm.functions.Function1 function1, androidx.compose.material.DrawerValue drawerValue) {
            return new androidx.compose.material.DrawerState(drawerValue, function1);
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
