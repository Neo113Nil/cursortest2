package androidx.compose.animation;

/* compiled from: SingleValueAnimation.kt */
@kotlin.Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a$\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u0002ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\b\u001aH\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00022\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\r2\u0016\b\u0002\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000fH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u001aR\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00022\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\r2\b\b\u0002\u0010\u0013\u001a\u00020\u00142\u0016\b\u0002\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000fH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016\"\u0014\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0017"}, d2 = {"colorDefaultSpring", "Landroidx/compose/animation/core/SpringSpec;", "Landroidx/compose/ui/graphics/Color;", "Animatable", "Landroidx/compose/animation/core/Animatable;", "Landroidx/compose/animation/core/AnimationVector4D;", "initialValue", "Animatable-8_81llA", "(J)Landroidx/compose/animation/core/Animatable;", "animateColorAsState", "Landroidx/compose/runtime/State;", "targetValue", "animationSpec", "Landroidx/compose/animation/core/AnimationSpec;", "finishedListener", "Lkotlin/Function1;", "", "animateColorAsState-KTwxG1Y", "(JLandroidx/compose/animation/core/AnimationSpec;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;", "label", "", "animateColorAsState-euL9pac", "(JLandroidx/compose/animation/core/AnimationSpec;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;", "animation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SingleValueAnimationKt {
    private static final androidx.compose.animation.core.SpringSpec<androidx.compose.ui.graphics.Color> colorDefaultSpring = androidx.compose.animation.core.AnimationSpecKt.spring$default(0.0f, 0.0f, null, 7, null);

    /* renamed from: animateColorAsState-euL9pac, reason: not valid java name */
    public static final androidx.compose.runtime.State<androidx.compose.ui.graphics.Color> m105animateColorAsStateeuL9pac(long j, androidx.compose.animation.core.AnimationSpec<androidx.compose.ui.graphics.Color> animationSpec, java.lang.String str, kotlin.jvm.functions.Function1<? super androidx.compose.ui.graphics.Color, kotlin.Unit> function1, androidx.compose.runtime.Composer composer, int i, int i2) {
        composer.startReplaceableGroup(-451899108);
        androidx.compose.runtime.ComposerKt.sourceInformation(composer, "C(animateColorAsState)P(3:c#ui.graphics.Color!1,2)62@2847L96,65@2955L124:SingleValueAnimation.kt#xbi5r1");
        androidx.compose.animation.core.SpringSpec<androidx.compose.ui.graphics.Color> springSpec = (i2 & 2) != 0 ? colorDefaultSpring : animationSpec;
        java.lang.String str2 = (i2 & 4) != 0 ? "ColorAnimation" : str;
        kotlin.jvm.functions.Function1<? super androidx.compose.ui.graphics.Color, kotlin.Unit> function12 = (i2 & 8) != 0 ? null : function1;
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-451899108, i, -1, "androidx.compose.animation.animateColorAsState (SingleValueAnimation.kt:61)");
        }
        androidx.compose.ui.graphics.colorspace.ColorSpace m2117getColorSpaceimpl = androidx.compose.ui.graphics.Color.m2117getColorSpaceimpl(j);
        composer.startReplaceableGroup(1157296644);
        androidx.compose.runtime.ComposerKt.sourceInformation(composer, "CC(remember)P(1):Composables.kt#9igjgp");
        boolean changed = composer.changed(m2117getColorSpaceimpl);
        java.lang.Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue = (androidx.compose.animation.core.TwoWayConverter) androidx.compose.animation.ColorVectorConverterKt.getVectorConverter(androidx.compose.ui.graphics.Color.INSTANCE).invoke(androidx.compose.ui.graphics.Color.m2117getColorSpaceimpl(j));
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        int i3 = i << 6;
        androidx.compose.runtime.State<androidx.compose.ui.graphics.Color> animateValueAsState = androidx.compose.animation.core.AnimateAsStateKt.animateValueAsState(androidx.compose.ui.graphics.Color.m2103boximpl(j), (androidx.compose.animation.core.TwoWayConverter) rememberedValue, springSpec, null, str2, function12, composer, (i & 14) | 576 | (57344 & i3) | (i3 & 458752), 8);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return animateValueAsState;
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "animate*AsState APIs now have a new label parameter added.")
    /* renamed from: animateColorAsState-KTwxG1Y, reason: not valid java name */
    public static final /* synthetic */ androidx.compose.runtime.State m104animateColorAsStateKTwxG1Y(long j, androidx.compose.animation.core.AnimationSpec animationSpec, kotlin.jvm.functions.Function1 function1, androidx.compose.runtime.Composer composer, int i, int i2) {
        composer.startReplaceableGroup(-1942442407);
        androidx.compose.runtime.ComposerKt.sourceInformation(composer, "C(animateColorAsState)P(2:c#ui.graphics.Color)80@3400L98:SingleValueAnimation.kt#xbi5r1");
        if ((i2 & 2) != 0) {
            animationSpec = colorDefaultSpring;
        }
        androidx.compose.animation.core.AnimationSpec animationSpec2 = animationSpec;
        if ((i2 & 4) != 0) {
            function1 = null;
        }
        kotlin.jvm.functions.Function1 function12 = function1;
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-1942442407, i, -1, "androidx.compose.animation.animateColorAsState (SingleValueAnimation.kt:79)");
        }
        androidx.compose.runtime.State<androidx.compose.ui.graphics.Color> m105animateColorAsStateeuL9pac = m105animateColorAsStateeuL9pac(j, animationSpec2, null, function12, composer, (i & 14) | 64 | ((i << 3) & 7168), 4);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return m105animateColorAsStateeuL9pac;
    }

    /* renamed from: Animatable-8_81llA, reason: not valid java name */
    public static final androidx.compose.animation.core.Animatable<androidx.compose.ui.graphics.Color, androidx.compose.animation.core.AnimationVector4D> m103Animatable8_81llA(long j) {
        return new androidx.compose.animation.core.Animatable<>(androidx.compose.ui.graphics.Color.m2103boximpl(j), androidx.compose.animation.ColorVectorConverterKt.getVectorConverter(androidx.compose.ui.graphics.Color.INSTANCE).invoke(androidx.compose.ui.graphics.Color.m2117getColorSpaceimpl(j)), null, null, 12, null);
    }
}
