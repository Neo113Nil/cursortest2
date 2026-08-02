package androidx.compose.animation;

@kotlin.Metadata(d1 = {"\u00008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aO\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\n\u0018\u00010\tH\u0007¢\u0006\u0004\b\u000b\u0010\f\u001aE\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u00052\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\n\u0018\u00010\tH\u0007¢\u0006\u0004\b\r\u0010\u000e\u001a#\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00130\u00122\u0006\u0010\u0014\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0015\u0010\u0016\"\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"animateColorAsState", "Landroidx/compose/runtime/State;", "Landroidx/compose/ui/graphics/Color;", "targetValue", "animationSpec", "Landroidx/compose/animation/core/AnimationSpec;", "label", "", "finishedListener", "Lkotlin/Function1;", "", "animateColorAsState-euL9pac", "(JLandroidx/compose/animation/core/AnimationSpec;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;", "animateColorAsState-KTwxG1Y", "(JLandroidx/compose/animation/core/AnimationSpec;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;", "colorDefaultSpring", "Landroidx/compose/animation/core/SpringSpec;", "Animatable", "Landroidx/compose/animation/core/Animatable;", "Landroidx/compose/animation/core/AnimationVector4D;", "initialValue", "Animatable-8_81llA", "(J)Landroidx/compose/animation/core/Animatable;", "animation"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SingleValueAnimationKt {
    private static final androidx.compose.animation.core.SpringSpec<androidx.compose.ui.graphics.Color> getHighResolutionOutputSizeshNQ4ISI = androidx.compose.animation.core.AnimationSpecKt.spring$default(0.0f, 0.0f, null, 7, null);

    /* renamed from: animateColorAsState-euL9pac, reason: not valid java name */
    public static final androidx.compose.runtime.State<androidx.compose.ui.graphics.Color> m1150animateColorAsStateeuL9pac(long j, androidx.compose.animation.core.AnimationSpec<androidx.compose.ui.graphics.Color> animationSpec, java.lang.String str, kotlin.jvm.functions.Function1<? super androidx.compose.ui.graphics.Color, kotlin.Unit> function1, androidx.compose.runtime.Composer composer, int i, int i2) {
        androidx.compose.animation.core.AnimationSpec<androidx.compose.ui.graphics.Color> animationSpec2 = (i2 & 2) != 0 ? getHighResolutionOutputSizeshNQ4ISI : animationSpec;
        java.lang.String str2 = (i2 & 4) != 0 ? "ColorAnimation" : str;
        kotlin.jvm.functions.Function1<? super androidx.compose.ui.graphics.Color, kotlin.Unit> function12 = (i2 & 8) != 0 ? null : function1;
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-451899108, i, -1, "androidx.compose.animation.animateColorAsState (SingleValueAnimation.kt:61)");
        }
        boolean changed = composer.changed(androidx.compose.ui.graphics.Color.m6000getColorSpaceimpl(j));
        java.lang.Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue = (androidx.compose.animation.core.TwoWayConverter) androidx.compose.animation.ColorVectorConverterKt.getVectorConverter(androidx.compose.ui.graphics.Color.INSTANCE).invoke(androidx.compose.ui.graphics.Color.m6000getColorSpaceimpl(j));
            composer.updateRememberedValue(rememberedValue);
        }
        int i3 = i << 6;
        androidx.compose.runtime.State<androidx.compose.ui.graphics.Color> animateValueAsState = androidx.compose.animation.core.AnimateAsStateKt.animateValueAsState(androidx.compose.ui.graphics.Color.m5986boximpl(j), (androidx.compose.animation.core.TwoWayConverter) rememberedValue, animationSpec2, null, str2, function12, composer, (i3 & 458752) | ((i << 3) & 896) | (i & 14) | (57344 & i3), 8);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return animateValueAsState;
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "animate*AsState APIs now have a new label parameter added.")
    /* renamed from: animateColorAsState-KTwxG1Y, reason: not valid java name */
    public static final /* synthetic */ androidx.compose.runtime.State m1149animateColorAsStateKTwxG1Y(long j, androidx.compose.animation.core.AnimationSpec animationSpec, kotlin.jvm.functions.Function1 function1, androidx.compose.runtime.Composer composer, int i, int i2) {
        if ((i2 & 2) != 0) {
            animationSpec = getHighResolutionOutputSizeshNQ4ISI;
        }
        androidx.compose.animation.core.AnimationSpec animationSpec2 = animationSpec;
        if ((i2 & 4) != 0) {
            function1 = null;
        }
        kotlin.jvm.functions.Function1 function12 = function1;
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-1942442407, i, -1, "androidx.compose.animation.animateColorAsState (SingleValueAnimation.kt:82)");
        }
        androidx.compose.runtime.State<androidx.compose.ui.graphics.Color> m1150animateColorAsStateeuL9pac = m1150animateColorAsStateeuL9pac(j, animationSpec2, null, function12, composer, (i & 126) | ((i << 3) & 7168), 4);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return m1150animateColorAsStateeuL9pac;
    }

    /* renamed from: Animatable-8_81llA, reason: not valid java name */
    public static final androidx.compose.animation.core.Animatable<androidx.compose.ui.graphics.Color, androidx.compose.animation.core.AnimationVector4D> m1148Animatable8_81llA(long j) {
        return new androidx.compose.animation.core.Animatable<>(androidx.compose.ui.graphics.Color.m5986boximpl(j), androidx.compose.animation.ColorVectorConverterKt.getVectorConverter(androidx.compose.ui.graphics.Color.INSTANCE).invoke(androidx.compose.ui.graphics.Color.m6000getColorSpaceimpl(j)), null, null, 12, null);
    }
}
