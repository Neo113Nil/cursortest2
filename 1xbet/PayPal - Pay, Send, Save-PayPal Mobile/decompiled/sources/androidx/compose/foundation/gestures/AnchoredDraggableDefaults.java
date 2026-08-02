package androidx.compose.foundation.gestures;

@kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JV\u0010\u0011\u001a\u00020\u0012\"\u0004\b\u0000\u0010\u00132\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u0002H\u00130\u00152#\b\u0002\u0010\u0016\u001a\u001d\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(\u0019\u0012\u0004\u0012\u00020\u00060\n2\u000e\b\u0002\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0007¢\u0006\u0002\u0010\u001bR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001d\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\n¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001c"}, d2 = {"Landroidx/compose/foundation/gestures/AnchoredDraggableDefaults;", "", "<init>", "()V", "SnapAnimationSpec", "Landroidx/compose/animation/core/AnimationSpec;", "", "getSnapAnimationSpec", "()Landroidx/compose/animation/core/AnimationSpec;", "PositionalThreshold", "Lkotlin/Function1;", "getPositionalThreshold", "()Lkotlin/jvm/functions/Function1;", "DecayAnimationSpec", "Landroidx/compose/animation/core/DecayAnimationSpec;", "getDecayAnimationSpec", "()Landroidx/compose/animation/core/DecayAnimationSpec;", "flingBehavior", "Landroidx/compose/foundation/gestures/TargetedFlingBehavior;", "T", "state", "Landroidx/compose/foundation/gestures/AnchoredDraggableState;", "positionalThreshold", "Lkotlin/ParameterName;", "name", "totalDistance", "animationSpec", "(Landroidx/compose/foundation/gestures/AnchoredDraggableState;Lkotlin/jvm/functions/Function1;Landroidx/compose/animation/core/AnimationSpec;Landroidx/compose/runtime/Composer;II)Landroidx/compose/foundation/gestures/TargetedFlingBehavior;", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AnchoredDraggableDefaults {
    public static final androidx.compose.foundation.gestures.AnchoredDraggableDefaults INSTANCE = new androidx.compose.foundation.gestures.AnchoredDraggableDefaults();
    private static final androidx.compose.animation.core.AnimationSpec<java.lang.Float> Camera2StreamConfigurationMap = androidx.compose.animation.core.AnimationSpecKt.tween$default(0, 0, null, 7, null);
    private static final kotlin.jvm.functions.Function1<java.lang.Float, java.lang.Float> getHighSpeedVideoFpsRanges = new kotlin.jvm.functions.Function1() { // from class: androidx.compose.foundation.gestures.AnchoredDraggableDefaults$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function1
        public final java.lang.Object invoke(java.lang.Object obj) {
            float highSpeedVideoFpsRanges;
            highSpeedVideoFpsRanges = androidx.compose.foundation.gestures.AnchoredDraggableDefaults.getHighSpeedVideoFpsRanges(((java.lang.Float) obj).floatValue());
            return java.lang.Float.valueOf(highSpeedVideoFpsRanges);
        }
    };
    private static final androidx.compose.animation.core.DecayAnimationSpec<java.lang.Float> getHighSpeedVideoFpsRangesFor = androidx.compose.animation.core.DecayAnimationSpecKt.exponentialDecay$default(0.0f, 0.0f, 3, null);
    public static final int $stable = 8;

    /* JADX INFO: Access modifiers changed from: private */
    public static final float getHighSpeedVideoFpsRanges(float f) {
        return f / 2.0f;
    }

    private AnchoredDraggableDefaults() {
    }

    public final androidx.compose.animation.core.AnimationSpec<java.lang.Float> getSnapAnimationSpec() {
        return Camera2StreamConfigurationMap;
    }

    public final kotlin.jvm.functions.Function1<java.lang.Float, java.lang.Float> getPositionalThreshold() {
        return getHighSpeedVideoFpsRanges;
    }

    public final androidx.compose.animation.core.DecayAnimationSpec<java.lang.Float> getDecayAnimationSpec() {
        return getHighSpeedVideoFpsRangesFor;
    }

    public final <T> androidx.compose.foundation.gestures.TargetedFlingBehavior flingBehavior(androidx.compose.foundation.gestures.AnchoredDraggableState<T> anchoredDraggableState, kotlin.jvm.functions.Function1<? super java.lang.Float, java.lang.Float> function1, androidx.compose.animation.core.AnimationSpec<java.lang.Float> animationSpec, androidx.compose.runtime.Composer composer, int i, int i2) {
        if ((i2 & 2) != 0) {
            function1 = getHighSpeedVideoFpsRanges;
        }
        if ((i2 & 4) != 0) {
            animationSpec = Camera2StreamConfigurationMap;
        }
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-952742024, i, -1, "androidx.compose.foundation.gestures.AnchoredDraggableDefaults.flingBehavior (AnchoredDraggable.kt:1523)");
        }
        androidx.compose.ui.unit.Density density = (androidx.compose.ui.unit.Density) composer.consume(androidx.compose.ui.platform.CompositionLocalsKt.getLocalDensity());
        boolean changed = composer.changed(density);
        boolean z = true;
        boolean z2 = (((i & 14) ^ 6) > 4 && composer.changed(anchoredDraggableState)) || (i & 6) == 4;
        if ((((i & 112) ^ 48) <= 32 || !composer.changed(function1)) && (i & 48) != 32) {
            z = false;
        }
        boolean changed2 = composer.changed(animationSpec);
        java.lang.Object rememberedValue = composer.rememberedValue();
        if ((changed2 | z2 | changed | z) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue = androidx.compose.foundation.gestures.AnchoredDraggableKt.anchoredDraggableFlingBehavior(anchoredDraggableState, density, function1, animationSpec);
            composer.updateRememberedValue(rememberedValue);
        }
        androidx.compose.foundation.gestures.TargetedFlingBehavior targetedFlingBehavior = (androidx.compose.foundation.gestures.TargetedFlingBehavior) rememberedValue;
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return targetedFlingBehavior;
    }
}
