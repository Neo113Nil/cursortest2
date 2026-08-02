package androidx.compose.animation.core;

import androidx.compose.animation.core.InfiniteTransition.TransitionAnimationState;

@kotlin.Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\u001a\u0017\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u0007¢\u0006\u0002\u0010\u0004\u001ac\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00070\u0006\"\u0004\b\u0000\u0010\u0007\"\b\b\u0001\u0010\b*\u00020\t*\u00020\u00012\u0006\u0010\n\u001a\u0002H\u00072\u0006\u0010\u000b\u001a\u0002H\u00072\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u0002H\u0007\u0012\u0004\u0012\u0002H\b0\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u0002H\u00070\u000f2\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u0007¢\u0006\u0002\u0010\u0010\u001a?\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u0006*\u00020\u00012\u0006\u0010\n\u001a\u00020\u00122\u0006\u0010\u000b\u001a\u00020\u00122\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00120\u000f2\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u0007¢\u0006\u0002\u0010\u0013\u001a\r\u0010\u0000\u001a\u00020\u0001H\u0007¢\u0006\u0002\u0010\u0014\u001aY\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00070\u0006\"\u0004\b\u0000\u0010\u0007\"\b\b\u0001\u0010\b*\u00020\t*\u00020\u00012\u0006\u0010\n\u001a\u0002H\u00072\u0006\u0010\u000b\u001a\u0002H\u00072\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u0002H\u0007\u0012\u0004\u0012\u0002H\b0\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u0002H\u00070\u000fH\u0007¢\u0006\u0002\u0010\u0015\u001a5\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u0006*\u00020\u00012\u0006\u0010\n\u001a\u00020\u00122\u0006\u0010\u000b\u001a\u00020\u00122\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00120\u000fH\u0007¢\u0006\u0002\u0010\u0016¨\u0006\u0017"}, d2 = {"rememberInfiniteTransition", "Landroidx/compose/animation/core/InfiniteTransition;", "label", "", "(Ljava/lang/String;Landroidx/compose/runtime/Composer;II)Landroidx/compose/animation/core/InfiniteTransition;", "animateValue", "Landroidx/compose/runtime/State;", "T", "V", "Landroidx/compose/animation/core/AnimationVector;", "initialValue", "targetValue", "typeConverter", "Landroidx/compose/animation/core/TwoWayConverter;", "animationSpec", "Landroidx/compose/animation/core/InfiniteRepeatableSpec;", "(Landroidx/compose/animation/core/InfiniteTransition;Ljava/lang/Object;Ljava/lang/Object;Landroidx/compose/animation/core/TwoWayConverter;Landroidx/compose/animation/core/InfiniteRepeatableSpec;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;", "animateFloat", "", "(Landroidx/compose/animation/core/InfiniteTransition;FFLandroidx/compose/animation/core/InfiniteRepeatableSpec;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/animation/core/InfiniteTransition;", "(Landroidx/compose/animation/core/InfiniteTransition;Ljava/lang/Object;Ljava/lang/Object;Landroidx/compose/animation/core/TwoWayConverter;Landroidx/compose/animation/core/InfiniteRepeatableSpec;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "(Landroidx/compose/animation/core/InfiniteTransition;FFLandroidx/compose/animation/core/InfiniteRepeatableSpec;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "animation-core"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class InfiniteTransitionKt {
    public static final androidx.compose.animation.core.InfiniteTransition rememberInfiniteTransition(java.lang.String str, androidx.compose.runtime.Composer composer, int i, int i2) {
        if ((i2 & 1) != 0) {
            str = "InfiniteTransition";
        }
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(1013651573, i, -1, "androidx.compose.animation.core.rememberInfiniteTransition (InfiniteTransition.kt:44)");
        }
        java.lang.Object rememberedValue = composer.rememberedValue();
        if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue = new androidx.compose.animation.core.InfiniteTransition(str);
            composer.updateRememberedValue(rememberedValue);
        }
        androidx.compose.animation.core.InfiniteTransition infiniteTransition = (androidx.compose.animation.core.InfiniteTransition) rememberedValue;
        infiniteTransition.run$animation_core(composer, 0);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return infiniteTransition;
    }

    public static final <T, V extends androidx.compose.animation.core.AnimationVector> androidx.compose.runtime.State<T> animateValue(final androidx.compose.animation.core.InfiniteTransition infiniteTransition, final T t, final T t2, androidx.compose.animation.core.TwoWayConverter<T, V> twoWayConverter, final androidx.compose.animation.core.InfiniteRepeatableSpec<T> infiniteRepeatableSpec, java.lang.String str, androidx.compose.runtime.Composer composer, int i, int i2) {
        if ((i2 & 16) != 0) {
            str = "ValueAnimation";
        }
        java.lang.String str2 = str;
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-1062847727, i, -1, "androidx.compose.animation.core.animateValue (InfiniteTransition.kt:245)");
        }
        java.lang.Object rememberedValue = composer.rememberedValue();
        if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue = infiniteTransition.new TransitionAnimationState(t, t2, twoWayConverter, infiniteRepeatableSpec, str2);
            composer.updateRememberedValue(rememberedValue);
        }
        final androidx.compose.animation.core.InfiniteTransition.TransitionAnimationState transitionAnimationState = (androidx.compose.animation.core.InfiniteTransition.TransitionAnimationState) rememberedValue;
        boolean z = true;
        boolean z2 = (((i & 112) ^ 48) > 32 && composer.changedInstance(t)) || (i & 48) == 32;
        boolean z3 = (((i & 896) ^ 384) > 256 && composer.changedInstance(t2)) || (i & 384) == 256;
        if ((((57344 & i) ^ 24576) <= 16384 || !composer.changedInstance(infiniteRepeatableSpec)) && (i & 24576) != 16384) {
            z = false;
        }
        java.lang.Object rememberedValue2 = composer.rememberedValue();
        if ((z2 | z3 | z) || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: androidx.compose.animation.core.InfiniteTransitionKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    kotlin.Unit highSpeedVideoFpsRangesFor;
                    highSpeedVideoFpsRangesFor = androidx.compose.animation.core.InfiniteTransitionKt.getHighSpeedVideoFpsRangesFor(t, transitionAnimationState, t2, infiniteRepeatableSpec);
                    return highSpeedVideoFpsRangesFor;
                }
            };
            composer.updateRememberedValue(rememberedValue2);
        }
        androidx.compose.runtime.EffectsKt.SideEffect((kotlin.jvm.functions.Function0) rememberedValue2, composer, 0);
        boolean changedInstance = composer.changedInstance(infiniteTransition);
        java.lang.Object rememberedValue3 = composer.rememberedValue();
        if (changedInstance || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue3 = new kotlin.jvm.functions.Function1() { // from class: androidx.compose.animation.core.InfiniteTransitionKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    androidx.compose.runtime.DisposableEffectResult highSpeedVideoFpsRanges;
                    highSpeedVideoFpsRanges = androidx.compose.animation.core.InfiniteTransitionKt.getHighSpeedVideoFpsRanges(androidx.compose.animation.core.InfiniteTransition.this, transitionAnimationState);
                    return highSpeedVideoFpsRanges;
                }
            };
            composer.updateRememberedValue(rememberedValue3);
        }
        androidx.compose.runtime.EffectsKt.DisposableEffect(transitionAnimationState, (kotlin.jvm.functions.Function1<? super androidx.compose.runtime.DisposableEffectScope, ? extends androidx.compose.runtime.DisposableEffectResult>) rememberedValue3, composer, 6);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return transitionAnimationState;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit getHighSpeedVideoFpsRangesFor(java.lang.Object obj, androidx.compose.animation.core.InfiniteTransition.TransitionAnimationState transitionAnimationState, java.lang.Object obj2, androidx.compose.animation.core.InfiniteRepeatableSpec infiniteRepeatableSpec) {
        if (!kotlin.jvm.internal.Intrinsics.areEqual(obj, transitionAnimationState.getInitialValue$animation_core()) || !kotlin.jvm.internal.Intrinsics.areEqual(obj2, transitionAnimationState.getTargetValue$animation_core())) {
            transitionAnimationState.updateValues$animation_core(obj, obj2, infiniteRepeatableSpec);
        }
        return kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.runtime.DisposableEffectResult getHighSpeedVideoFpsRanges(final androidx.compose.animation.core.InfiniteTransition infiniteTransition, final androidx.compose.animation.core.InfiniteTransition.TransitionAnimationState transitionAnimationState) {
        infiniteTransition.addAnimation$animation_core(transitionAnimationState);
        return new androidx.compose.runtime.DisposableEffectResult() { // from class: androidx.compose.animation.core.InfiniteTransitionKt$animateValue$lambda$2$0$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public final void dispose() {
                androidx.compose.animation.core.InfiniteTransition.this.removeAnimation$animation_core(transitionAnimationState);
            }
        };
    }

    public static final androidx.compose.runtime.State<java.lang.Float> animateFloat(androidx.compose.animation.core.InfiniteTransition infiniteTransition, float f, float f2, androidx.compose.animation.core.InfiniteRepeatableSpec<java.lang.Float> infiniteRepeatableSpec, java.lang.String str, androidx.compose.runtime.Composer composer, int i, int i2) {
        java.lang.String str2 = (i2 & 8) != 0 ? "FloatAnimation" : str;
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-644770905, i, -1, "androidx.compose.animation.core.animateFloat (InfiniteTransition.kt:296)");
        }
        int i3 = i << 3;
        androidx.compose.runtime.State<java.lang.Float> animateValue = animateValue(infiniteTransition, java.lang.Float.valueOf(f), java.lang.Float.valueOf(f2), androidx.compose.animation.core.VectorConvertersKt.getVectorConverter(kotlin.jvm.internal.FloatCompanionObject.INSTANCE), infiniteRepeatableSpec, str2, composer, (i & org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants.IMAGE_RESOURCE_BLOCK_QUICK_MASK_INFO) | (57344 & i3) | (i3 & 458752), 0);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return animateValue;
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "rememberInfiniteTransition APIs now have a new label parameter added.")
    public static final /* synthetic */ androidx.compose.animation.core.InfiniteTransition rememberInfiniteTransition(androidx.compose.runtime.Composer composer, int i) {
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-840193660, i, -1, "androidx.compose.animation.core.rememberInfiniteTransition (InfiniteTransition.kt:303)");
        }
        androidx.compose.animation.core.InfiniteTransition rememberInfiniteTransition = rememberInfiniteTransition("InfiniteTransition", composer, 6, 0);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return rememberInfiniteTransition;
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "animateValue APIs now have a new label parameter added.")
    public static final /* synthetic */ androidx.compose.runtime.State animateValue(androidx.compose.animation.core.InfiniteTransition infiniteTransition, java.lang.Object obj, java.lang.Object obj2, androidx.compose.animation.core.TwoWayConverter twoWayConverter, androidx.compose.animation.core.InfiniteRepeatableSpec infiniteRepeatableSpec, androidx.compose.runtime.Composer composer, int i) {
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-1695411770, i, -1, "androidx.compose.animation.core.animateValue (InfiniteTransition.kt:317)");
        }
        int i2 = (i >> 3) & 8;
        androidx.compose.runtime.State animateValue = animateValue(infiniteTransition, obj, obj2, twoWayConverter, infiniteRepeatableSpec, "ValueAnimation", composer, (i2 << 6) | (i & 14) | androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE | (i2 << 3) | (i & 112) | (i & 896) | (i & 7168) | (i & 57344), 0);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return animateValue;
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "animateFloat APIs now have a new label parameter added.")
    public static final /* synthetic */ androidx.compose.runtime.State animateFloat(androidx.compose.animation.core.InfiniteTransition infiniteTransition, float f, float f2, androidx.compose.animation.core.InfiniteRepeatableSpec infiniteRepeatableSpec, androidx.compose.runtime.Composer composer, int i) {
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(469472752, i, -1, "androidx.compose.animation.core.animateFloat (InfiniteTransition.kt:336)");
        }
        androidx.compose.runtime.State<java.lang.Float> animateFloat = animateFloat(infiniteTransition, f, f2, infiniteRepeatableSpec, "FloatAnimation", composer, (i & 14) | 24576 | (i & 112) | (i & 896) | (i & 7168), 0);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return animateFloat;
    }
}
