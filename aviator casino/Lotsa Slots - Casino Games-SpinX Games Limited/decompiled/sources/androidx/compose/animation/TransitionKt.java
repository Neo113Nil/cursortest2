package androidx.compose.animation;

/* compiled from: Transition.kt */
@kotlin.Metadata(d1 = {"\u0000F\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a:\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007H\u0007ø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\u001aD\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u000bH\u0007ø\u0001\u0000¢\u0006\u0004\b\f\u0010\r\u001a\u0082\u0001\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001\"\u0004\b\u0000\u0010\u000e*\b\u0012\u0004\u0012\u0002H\u000e0\u000f2*\b\n\u0010\u0010\u001a$\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u000e0\u0012\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00130\u0011¢\u0006\u0002\b\u0014¢\u0006\u0002\b\u00152\b\b\u0002\u0010\n\u001a\u00020\u000b2&\u0010\u0016\u001a\"\u0012\u0013\u0012\u0011H\u000e¢\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(\u0019\u0012\u0004\u0012\u00020\u00020\u0011¢\u0006\u0002\b\u0014H\u0087\b¢\u0006\u0002\u0010\u001a\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001b"}, d2 = {"animateColor", "Landroidx/compose/runtime/State;", "Landroidx/compose/ui/graphics/Color;", "Landroidx/compose/animation/core/InfiniteTransition;", "initialValue", "targetValue", "animationSpec", "Landroidx/compose/animation/core/InfiniteRepeatableSpec;", "animateColor-RIQooxk", "(Landroidx/compose/animation/core/InfiniteTransition;JJLandroidx/compose/animation/core/InfiniteRepeatableSpec;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "label", "", "animateColor-DTcfvLk", "(Landroidx/compose/animation/core/InfiniteTransition;JJLandroidx/compose/animation/core/InfiniteRepeatableSpec;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;", androidx.exifinterface.media.ExifInterface.LATITUDE_SOUTH, "Landroidx/compose/animation/core/Transition;", "transitionSpec", "Lkotlin/Function1;", "Landroidx/compose/animation/core/Transition$Segment;", "Landroidx/compose/animation/core/FiniteAnimationSpec;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "targetValueByState", "Lkotlin/ParameterName;", "name", "state", "(Landroidx/compose/animation/core/Transition;Lkotlin/jvm/functions/Function3;Ljava/lang/String;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;", "animation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class TransitionKt {
    public static final <S> androidx.compose.runtime.State<androidx.compose.ui.graphics.Color> animateColor(androidx.compose.animation.core.Transition<S> transition, kotlin.jvm.functions.Function3<? super androidx.compose.animation.core.Transition.Segment<S>, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, ? extends androidx.compose.animation.core.FiniteAnimationSpec<androidx.compose.ui.graphics.Color>> function3, java.lang.String str, kotlin.jvm.functions.Function3<? super S, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, androidx.compose.ui.graphics.Color> function32, androidx.compose.runtime.Composer composer, int i, int i2) {
        composer.startReplaceableGroup(-1939694975);
        androidx.compose.runtime.ComposerKt.sourceInformation(composer, "CC(animateColor)P(2)68@3220L31,69@3287L70,73@3370L70:Transition.kt#xbi5r1");
        if ((i2 & 1) != 0) {
            function3 = new kotlin.jvm.functions.Function3<androidx.compose.animation.core.Transition.Segment<S>, androidx.compose.runtime.Composer, java.lang.Integer, androidx.compose.animation.core.SpringSpec<androidx.compose.ui.graphics.Color>>() { // from class: androidx.compose.animation.TransitionKt$animateColor$1
                public final androidx.compose.animation.core.SpringSpec<androidx.compose.ui.graphics.Color> invoke(androidx.compose.animation.core.Transition.Segment<S> segment, androidx.compose.runtime.Composer composer2, int i3) {
                    composer2.startReplaceableGroup(-1457805428);
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventStart(-1457805428, i3, -1, "androidx.compose.animation.animateColor.<anonymous> (Transition.kt:64)");
                    }
                    androidx.compose.animation.core.SpringSpec<androidx.compose.ui.graphics.Color> spring$default = androidx.compose.animation.core.AnimationSpecKt.spring$default(0.0f, 0.0f, null, 7, null);
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventEnd();
                    }
                    composer2.endReplaceableGroup();
                    return spring$default;
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ androidx.compose.animation.core.SpringSpec<androidx.compose.ui.graphics.Color> invoke(java.lang.Object obj, androidx.compose.runtime.Composer composer2, java.lang.Integer num) {
                    return invoke((androidx.compose.animation.core.Transition.Segment) obj, composer2, num.intValue());
                }
            };
        }
        if ((i2 & 2) != 0) {
            str = "ColorAnimation";
        }
        java.lang.String str2 = str;
        androidx.compose.ui.graphics.colorspace.ColorSpace m2117getColorSpaceimpl = androidx.compose.ui.graphics.Color.m2117getColorSpaceimpl(function32.invoke(transition.getTargetState(), composer, java.lang.Integer.valueOf((i >> 6) & 112)).m2123unboximpl());
        composer.startReplaceableGroup(1157296644);
        androidx.compose.runtime.ComposerKt.sourceInformation(composer, "CC(remember)P(1):Composables.kt#9igjgp");
        boolean changed = composer.changed(m2117getColorSpaceimpl);
        java.lang.Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue = (androidx.compose.animation.core.TwoWayConverter) androidx.compose.animation.ColorVectorConverterKt.getVectorConverter(androidx.compose.ui.graphics.Color.INSTANCE).invoke(m2117getColorSpaceimpl);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        int i3 = (i & 14) | 64;
        int i4 = i << 3;
        int i5 = i3 | (i4 & 896) | (i4 & 7168) | (i4 & 57344);
        composer.startReplaceableGroup(-142660079);
        androidx.compose.runtime.ComposerKt.sourceInformation(composer, "CC(animateValue)P(3,2)1082@42932L32,1083@42987L31,1084@43043L23,1086@43079L89:Transition.kt#pdpnli");
        int i6 = (i5 >> 9) & 112;
        androidx.compose.runtime.State<androidx.compose.ui.graphics.Color> createTransitionAnimation = androidx.compose.animation.core.TransitionKt.createTransitionAnimation(transition, function32.invoke(transition.getCurrentState(), composer, java.lang.Integer.valueOf(i6)), function32.invoke(transition.getTargetState(), composer, java.lang.Integer.valueOf(i6)), function3.invoke(transition.getSegment(), composer, java.lang.Integer.valueOf((i5 >> 3) & 112)), (androidx.compose.animation.core.TwoWayConverter) rememberedValue, str2, composer, (i5 & 14) | 32768 | ((i5 << 6) & 458752));
        composer.endReplaceableGroup();
        composer.endReplaceableGroup();
        return createTransitionAnimation;
    }

    /* renamed from: animateColor-DTcfvLk, reason: not valid java name */
    public static final androidx.compose.runtime.State<androidx.compose.ui.graphics.Color> m115animateColorDTcfvLk(androidx.compose.animation.core.InfiniteTransition infiniteTransition, long j, long j2, androidx.compose.animation.core.InfiniteRepeatableSpec<androidx.compose.ui.graphics.Color> infiniteRepeatableSpec, java.lang.String str, androidx.compose.runtime.Composer composer, int i, int i2) {
        composer.startReplaceableGroup(1901963533);
        androidx.compose.runtime.ComposerKt.sourceInformation(composer, "C(animateColor)P(1:c#ui.graphics.Color,3:c#ui.graphics.Color)102@4596L72,105@4680L72:Transition.kt#xbi5r1");
        java.lang.String str2 = (i2 & 8) != 0 ? "ColorAnimation" : str;
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(1901963533, i, -1, "androidx.compose.animation.animateColor (Transition.kt:101)");
        }
        composer.startReplaceableGroup(-492369756);
        androidx.compose.runtime.ComposerKt.sourceInformation(composer, "CC(remember):Composables.kt#9igjgp");
        java.lang.Object rememberedValue = composer.rememberedValue();
        if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue = (androidx.compose.animation.core.TwoWayConverter) androidx.compose.animation.ColorVectorConverterKt.getVectorConverter(androidx.compose.ui.graphics.Color.INSTANCE).invoke(androidx.compose.ui.graphics.Color.m2117getColorSpaceimpl(j2));
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        int i3 = i << 3;
        androidx.compose.runtime.State<androidx.compose.ui.graphics.Color> animateValue = androidx.compose.animation.core.InfiniteTransitionKt.animateValue(infiniteTransition, androidx.compose.ui.graphics.Color.m2103boximpl(j), androidx.compose.ui.graphics.Color.m2103boximpl(j2), (androidx.compose.animation.core.TwoWayConverter) rememberedValue, infiniteRepeatableSpec, str2, composer, androidx.compose.animation.core.InfiniteTransition.$stable | 4096 | (i & 14) | (i & 112) | (i & 896) | (androidx.compose.animation.core.InfiniteRepeatableSpec.$stable << 12) | (57344 & i3) | (i3 & 458752), 0);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return animateValue;
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "animateColor APIs now have a new label parameter added.")
    /* renamed from: animateColor-RIQooxk, reason: not valid java name */
    public static final /* synthetic */ androidx.compose.runtime.State m116animateColorRIQooxk(androidx.compose.animation.core.InfiniteTransition infiniteTransition, long j, long j2, androidx.compose.animation.core.InfiniteRepeatableSpec infiniteRepeatableSpec, androidx.compose.runtime.Composer composer, int i) {
        composer.startReplaceableGroup(1400583834);
        androidx.compose.runtime.ComposerKt.sourceInformation(composer, "C(animateColor)P(1:c#ui.graphics.Color,2:c#ui.graphics.Color)117@5040L143:Transition.kt#xbi5r1");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(1400583834, i, -1, "androidx.compose.animation.animateColor (Transition.kt:117)");
        }
        androidx.compose.runtime.State<androidx.compose.ui.graphics.Color> m115animateColorDTcfvLk = m115animateColorDTcfvLk(infiniteTransition, j, j2, infiniteRepeatableSpec, "ColorAnimation", composer, androidx.compose.animation.core.InfiniteTransition.$stable | 24576 | (i & 14) | (i & 112) | (i & 896) | (androidx.compose.animation.core.InfiniteRepeatableSpec.$stable << 9) | (i & 7168), 0);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return m115animateColorDTcfvLk;
    }
}
