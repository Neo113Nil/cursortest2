package androidx.compose.animation.core;

import androidx.compose.animation.core.Transition.DeferredAnimation;
import androidx.compose.animation.core.Transition.TransitionAnimationState;

/* compiled from: Transition.kt */
@kotlin.Metadata(d1 = {"\u0000\u008e\u0001\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a3\u0010\u0002\u001a\b\u0012\u0004\u0012\u0002H\u00040\u0003\"\u0004\b\u0000\u0010\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00040\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0007¢\u0006\u0002\u0010\t\u001a-\u0010\n\u001a\b\u0012\u0004\u0012\u0002H\u00040\u0003\"\u0004\b\u0000\u0010\u00042\u0006\u0010\u000b\u001a\u0002H\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0007¢\u0006\u0002\u0010\f\u001a3\u0010\n\u001a\b\u0012\u0004\u0012\u0002H\u00040\u0003\"\u0004\b\u0000\u0010\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00040\r2\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0007¢\u0006\u0002\u0010\u000e\u001a\u0082\u0001\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010\"\u0004\b\u0000\u0010\u0012*\b\u0012\u0004\u0012\u0002H\u00120\u00032*\b\n\u0010\u0013\u001a$\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00120\u0015\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00160\u0014¢\u0006\u0002\b\u0017¢\u0006\u0002\b\u00182\b\b\u0002\u0010\u0007\u001a\u00020\b2&\u0010\u0019\u001a\"\u0012\u0013\u0012\u0011H\u0012¢\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\u001c\u0012\u0004\u0012\u00020\u00110\u0014¢\u0006\u0002\b\u0017H\u0087\b¢\u0006\u0002\u0010\u001d\u001a\u0082\u0001\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001f0\u0010\"\u0004\b\u0000\u0010\u0012*\b\u0012\u0004\u0012\u0002H\u00120\u00032*\b\n\u0010\u0013\u001a$\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00120\u0015\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001f0\u00160\u0014¢\u0006\u0002\b\u0017¢\u0006\u0002\b\u00182\b\b\u0002\u0010\u0007\u001a\u00020\b2&\u0010\u0019\u001a\"\u0012\u0013\u0012\u0011H\u0012¢\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\u001c\u0012\u0004\u0012\u00020\u001f0\u0014¢\u0006\u0002\b\u0017H\u0087\b¢\u0006\u0002\u0010\u001d\u001a\u0082\u0001\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00010\u0010\"\u0004\b\u0000\u0010\u0012*\b\u0012\u0004\u0012\u0002H\u00120\u00032*\b\n\u0010\u0013\u001a$\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00120\u0015\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u00160\u0014¢\u0006\u0002\b\u0017¢\u0006\u0002\b\u00182\b\b\u0002\u0010\u0007\u001a\u00020\b2&\u0010\u0019\u001a\"\u0012\u0013\u0012\u0011H\u0012¢\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\u001c\u0012\u0004\u0012\u00020\u00010\u0014¢\u0006\u0002\b\u0017H\u0087\b¢\u0006\u0002\u0010\u001d\u001a\u0082\u0001\u0010!\u001a\b\u0012\u0004\u0012\u00020\"0\u0010\"\u0004\b\u0000\u0010\u0012*\b\u0012\u0004\u0012\u0002H\u00120\u00032*\b\n\u0010\u0013\u001a$\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00120\u0015\u0012\n\u0012\b\u0012\u0004\u0012\u00020\"0\u00160\u0014¢\u0006\u0002\b\u0017¢\u0006\u0002\b\u00182\b\b\u0002\u0010\u0007\u001a\u00020\b2&\u0010\u0019\u001a\"\u0012\u0013\u0012\u0011H\u0012¢\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\u001c\u0012\u0004\u0012\u00020\"0\u0014¢\u0006\u0002\b\u0017H\u0087\b¢\u0006\u0002\u0010\u001d\u001a\u0082\u0001\u0010#\u001a\b\u0012\u0004\u0012\u00020$0\u0010\"\u0004\b\u0000\u0010\u0012*\b\u0012\u0004\u0012\u0002H\u00120\u00032*\b\n\u0010\u0013\u001a$\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00120\u0015\u0012\n\u0012\b\u0012\u0004\u0012\u00020$0\u00160\u0014¢\u0006\u0002\b\u0017¢\u0006\u0002\b\u00182\b\b\u0002\u0010\u0007\u001a\u00020\b2&\u0010\u0019\u001a\"\u0012\u0013\u0012\u0011H\u0012¢\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\u001c\u0012\u0004\u0012\u00020$0\u0014¢\u0006\u0002\b\u0017H\u0087\b¢\u0006\u0002\u0010\u001d\u001a\u0082\u0001\u0010%\u001a\b\u0012\u0004\u0012\u00020&0\u0010\"\u0004\b\u0000\u0010\u0012*\b\u0012\u0004\u0012\u0002H\u00120\u00032*\b\n\u0010\u0013\u001a$\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00120\u0015\u0012\n\u0012\b\u0012\u0004\u0012\u00020&0\u00160\u0014¢\u0006\u0002\b\u0017¢\u0006\u0002\b\u00182\b\b\u0002\u0010\u0007\u001a\u00020\b2&\u0010\u0019\u001a\"\u0012\u0013\u0012\u0011H\u0012¢\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\u001c\u0012\u0004\u0012\u00020&0\u0014¢\u0006\u0002\b\u0017H\u0087\b¢\u0006\u0002\u0010\u001d\u001a\u0082\u0001\u0010'\u001a\b\u0012\u0004\u0012\u00020(0\u0010\"\u0004\b\u0000\u0010\u0012*\b\u0012\u0004\u0012\u0002H\u00120\u00032*\b\n\u0010\u0013\u001a$\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00120\u0015\u0012\n\u0012\b\u0012\u0004\u0012\u00020(0\u00160\u0014¢\u0006\u0002\b\u0017¢\u0006\u0002\b\u00182\b\b\u0002\u0010\u0007\u001a\u00020\b2&\u0010\u0019\u001a\"\u0012\u0013\u0012\u0011H\u0012¢\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\u001c\u0012\u0004\u0012\u00020(0\u0014¢\u0006\u0002\b\u0017H\u0087\b¢\u0006\u0002\u0010\u001d\u001a\u0082\u0001\u0010)\u001a\b\u0012\u0004\u0012\u00020*0\u0010\"\u0004\b\u0000\u0010\u0012*\b\u0012\u0004\u0012\u0002H\u00120\u00032*\b\n\u0010\u0013\u001a$\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00120\u0015\u0012\n\u0012\b\u0012\u0004\u0012\u00020*0\u00160\u0014¢\u0006\u0002\b\u0017¢\u0006\u0002\b\u00182\b\b\u0002\u0010\u0007\u001a\u00020\b2&\u0010\u0019\u001a\"\u0012\u0013\u0012\u0011H\u0012¢\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\u001c\u0012\u0004\u0012\u00020*0\u0014¢\u0006\u0002\b\u0017H\u0087\b¢\u0006\u0002\u0010\u001d\u001a¦\u0001\u0010+\u001a\b\u0012\u0004\u0012\u0002H\u00040\u0010\"\u0004\b\u0000\u0010\u0012\"\u0004\b\u0001\u0010\u0004\"\b\b\u0002\u0010,*\u00020-*\b\u0012\u0004\u0012\u0002H\u00120\u00032\u0012\u0010.\u001a\u000e\u0012\u0004\u0012\u0002H\u0004\u0012\u0004\u0012\u0002H,0/2*\b\n\u0010\u0013\u001a$\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00120\u0015\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00040\u00160\u0014¢\u0006\u0002\b\u0017¢\u0006\u0002\b\u00182\b\b\u0002\u0010\u0007\u001a\u00020\b2&\u0010\u0019\u001a\"\u0012\u0013\u0012\u0011H\u0012¢\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\u001c\u0012\u0004\u0012\u0002H\u00040\u0014¢\u0006\u0002\b\u0017H\u0087\b¢\u0006\u0002\u00100\u001a\\\u00101\u001a\b\u0012\u0004\u0012\u0002H\u00040\u0003\"\u0004\b\u0000\u0010\u0012\"\u0004\b\u0001\u0010\u0004*\b\u0012\u0004\u0012\u0002H\u00120\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2&\u00102\u001a\"\u0012\u0013\u0012\u0011H\u0012¢\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(3\u0012\u0004\u0012\u0002H\u00040\u0014¢\u0006\u0002\b\u0017H\u0087\b¢\u0006\u0002\u00104\u001aA\u00105\u001a\b\u0012\u0004\u0012\u0002H\u00040\u0003\"\u0004\b\u0000\u0010\u0012\"\u0004\b\u0001\u0010\u0004*\b\u0012\u0004\u0012\u0002H\u00120\u00032\u0006\u00106\u001a\u0002H\u00042\u0006\u0010\u000b\u001a\u0002H\u00042\u0006\u00107\u001a\u00020\bH\u0001¢\u0006\u0002\u00108\u001aa\u00109\u001a\u0018\u0012\u0004\u0012\u0002H\u0004\u0012\u0004\u0012\u0002H,0:R\b\u0012\u0004\u0012\u0002H\u00120\u0003\"\u0004\b\u0000\u0010\u0012\"\u0004\b\u0001\u0010\u0004\"\b\b\u0002\u0010,*\u00020-*\b\u0012\u0004\u0012\u0002H\u00120\u00032\u0012\u0010.\u001a\u000e\u0012\u0004\u0012\u0002H\u0004\u0012\u0004\u0012\u0002H,0/2\b\b\u0002\u0010\u0007\u001a\u00020\bH\u0007¢\u0006\u0002\u0010;\u001am\u0010<\u001a\b\u0012\u0004\u0012\u0002H\u00040\u0010\"\u0004\b\u0000\u0010\u0012\"\u0004\b\u0001\u0010\u0004\"\b\b\u0002\u0010,*\u00020-*\b\u0012\u0004\u0012\u0002H\u00120\u00032\u0006\u0010=\u001a\u0002H\u00042\u0006\u0010>\u001a\u0002H\u00042\f\u0010?\u001a\b\u0012\u0004\u0012\u0002H\u00040\u00162\u0012\u0010.\u001a\u000e\u0012\u0004\u0012\u0002H\u0004\u0012\u0004\u0012\u0002H,0/2\u0006\u0010\u0007\u001a\u00020\bH\u0001¢\u0006\u0002\u0010@\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000¨\u0006A"}, d2 = {"AnimationDebugDurationScale", "", "rememberTransition", "Landroidx/compose/animation/core/Transition;", "T", "transitionState", "Landroidx/compose/animation/core/TransitionState;", "label", "", "(Landroidx/compose/animation/core/TransitionState;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)Landroidx/compose/animation/core/Transition;", "updateTransition", "targetState", "(Ljava/lang/Object;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)Landroidx/compose/animation/core/Transition;", "Landroidx/compose/animation/core/MutableTransitionState;", "(Landroidx/compose/animation/core/MutableTransitionState;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)Landroidx/compose/animation/core/Transition;", "animateDp", "Landroidx/compose/runtime/State;", "Landroidx/compose/ui/unit/Dp;", androidx.exifinterface.media.ExifInterface.LATITUDE_SOUTH, "transitionSpec", "Lkotlin/Function1;", "Landroidx/compose/animation/core/Transition$Segment;", "Landroidx/compose/animation/core/FiniteAnimationSpec;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "targetValueByState", "Lkotlin/ParameterName;", "name", "state", "(Landroidx/compose/animation/core/Transition;Lkotlin/jvm/functions/Function3;Ljava/lang/String;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;", "animateFloat", "", "animateInt", "animateIntOffset", "Landroidx/compose/ui/unit/IntOffset;", "animateIntSize", "Landroidx/compose/ui/unit/IntSize;", "animateOffset", "Landroidx/compose/ui/geometry/Offset;", "animateRect", "Landroidx/compose/ui/geometry/Rect;", "animateSize", "Landroidx/compose/ui/geometry/Size;", "animateValue", androidx.exifinterface.media.ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "Landroidx/compose/animation/core/AnimationVector;", "typeConverter", "Landroidx/compose/animation/core/TwoWayConverter;", "(Landroidx/compose/animation/core/Transition;Landroidx/compose/animation/core/TwoWayConverter;Lkotlin/jvm/functions/Function3;Ljava/lang/String;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;", "createChildTransition", "transformToChildState", "parentState", "(Landroidx/compose/animation/core/Transition;Ljava/lang/String;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)Landroidx/compose/animation/core/Transition;", "createChildTransitionInternal", "initialState", "childLabel", "(Landroidx/compose/animation/core/Transition;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;Landroidx/compose/runtime/Composer;I)Landroidx/compose/animation/core/Transition;", "createDeferredAnimation", "Landroidx/compose/animation/core/Transition$DeferredAnimation;", "(Landroidx/compose/animation/core/Transition;Landroidx/compose/animation/core/TwoWayConverter;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)Landroidx/compose/animation/core/Transition$DeferredAnimation;", "createTransitionAnimation", "initialValue", "targetValue", "animationSpec", "(Landroidx/compose/animation/core/Transition;Ljava/lang/Object;Ljava/lang/Object;Landroidx/compose/animation/core/FiniteAnimationSpec;Landroidx/compose/animation/core/TwoWayConverter;Ljava/lang/String;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "animation-core_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class TransitionKt {
    public static final int AnimationDebugDurationScale = 1;

    public static final <T> androidx.compose.animation.core.Transition<T> updateTransition(T t, java.lang.String str, androidx.compose.runtime.Composer composer, int i, int i2) {
        composer.startReplaceableGroup(2029166765);
        androidx.compose.runtime.ComposerKt.sourceInformation(composer, "C(updateTransition)P(1)74@3063L51,75@3130L22,76@3157L224:Transition.kt#pdpnli");
        if ((i2 & 2) != 0) {
            str = null;
        }
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(2029166765, i, -1, "androidx.compose.animation.core.updateTransition (Transition.kt:73)");
        }
        composer.startReplaceableGroup(-492369756);
        androidx.compose.runtime.ComposerKt.sourceInformation(composer, "CC(remember):Composables.kt#9igjgp");
        java.lang.Object rememberedValue = composer.rememberedValue();
        if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue = new androidx.compose.animation.core.Transition(t, str);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        final androidx.compose.animation.core.Transition<T> transition = (androidx.compose.animation.core.Transition) rememberedValue;
        transition.animateTo$animation_core_release(t, composer, (i & 8) | 48 | (i & 14));
        composer.startReplaceableGroup(1951093734);
        boolean changed = composer.changed(transition);
        java.lang.Object rememberedValue2 = composer.rememberedValue();
        if (changed || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue2 = (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<androidx.compose.runtime.DisposableEffectScope, androidx.compose.runtime.DisposableEffectResult>() { // from class: androidx.compose.animation.core.TransitionKt$updateTransition$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public final androidx.compose.runtime.DisposableEffectResult invoke(androidx.compose.runtime.DisposableEffectScope disposableEffectScope) {
                    final androidx.compose.animation.core.Transition<T> transition2 = transition;
                    return new androidx.compose.runtime.DisposableEffectResult() { // from class: androidx.compose.animation.core.TransitionKt$updateTransition$1$1$invoke$$inlined$onDispose$1
                        @Override // androidx.compose.runtime.DisposableEffectResult
                        public void dispose() {
                            androidx.compose.animation.core.Transition.this.onTransitionEnd$animation_core_release();
                        }
                    };
                }
            };
            composer.updateRememberedValue(rememberedValue2);
        }
        composer.endReplaceableGroup();
        androidx.compose.runtime.EffectsKt.DisposableEffect(transition, (kotlin.jvm.functions.Function1<? super androidx.compose.runtime.DisposableEffectScope, ? extends androidx.compose.runtime.DisposableEffectResult>) rememberedValue2, composer, 6);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return transition;
    }

    public static final <T> androidx.compose.animation.core.Transition<T> rememberTransition(androidx.compose.animation.core.TransitionState<T> transitionState, java.lang.String str, androidx.compose.runtime.Composer composer, int i, int i2) {
        composer.startReplaceableGroup(1643203617);
        androidx.compose.runtime.ComposerKt.sourceInformation(composer, "C(rememberTransition)P(1)317@12686L94,320@12796L38,321@12839L224:Transition.kt#pdpnli");
        if ((i2 & 2) != 0) {
            str = null;
        }
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(1643203617, i, -1, "androidx.compose.animation.core.rememberTransition (Transition.kt:316)");
        }
        composer.startReplaceableGroup(1157296644);
        androidx.compose.runtime.ComposerKt.sourceInformation(composer, "CC(remember)P(1):Composables.kt#9igjgp");
        boolean changed = composer.changed(transitionState);
        java.lang.Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue = new androidx.compose.animation.core.Transition((androidx.compose.animation.core.TransitionState) transitionState, str);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        final androidx.compose.animation.core.Transition<T> transition = (androidx.compose.animation.core.Transition) rememberedValue;
        transition.animateTo$animation_core_release(transitionState.getTargetState(), composer, 0);
        composer.startReplaceableGroup(1951103416);
        boolean changed2 = composer.changed(transition);
        java.lang.Object rememberedValue2 = composer.rememberedValue();
        if (changed2 || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue2 = (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<androidx.compose.runtime.DisposableEffectScope, androidx.compose.runtime.DisposableEffectResult>() { // from class: androidx.compose.animation.core.TransitionKt$rememberTransition$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public final androidx.compose.runtime.DisposableEffectResult invoke(androidx.compose.runtime.DisposableEffectScope disposableEffectScope) {
                    final androidx.compose.animation.core.Transition<T> transition2 = transition;
                    return new androidx.compose.runtime.DisposableEffectResult() { // from class: androidx.compose.animation.core.TransitionKt$rememberTransition$1$1$invoke$$inlined$onDispose$1
                        @Override // androidx.compose.runtime.DisposableEffectResult
                        public void dispose() {
                            androidx.compose.animation.core.Transition.this.onTransitionEnd$animation_core_release();
                        }
                    };
                }
            };
            composer.updateRememberedValue(rememberedValue2);
        }
        composer.endReplaceableGroup();
        androidx.compose.runtime.EffectsKt.DisposableEffect(transition, (kotlin.jvm.functions.Function1<? super androidx.compose.runtime.DisposableEffectScope, ? extends androidx.compose.runtime.DisposableEffectResult>) rememberedValue2, composer, 0);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return transition;
    }

    public static final <T> androidx.compose.animation.core.Transition<T> updateTransition(androidx.compose.animation.core.MutableTransitionState<T> mutableTransitionState, java.lang.String str, androidx.compose.runtime.Composer composer, int i, int i2) {
        composer.startReplaceableGroup(882913843);
        androidx.compose.runtime.ComposerKt.sourceInformation(composer, "C(updateTransition)P(1)357@14430L32:Transition.kt#pdpnli");
        if ((i2 & 2) != 0) {
            str = null;
        }
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(882913843, i, -1, "androidx.compose.animation.core.updateTransition (Transition.kt:355)");
        }
        androidx.compose.animation.core.Transition<T> rememberTransition = rememberTransition(mutableTransitionState, str, composer, (i & 112) | (i & 14), 0);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return rememberTransition;
    }

    public static final <S, T, V extends androidx.compose.animation.core.AnimationVector> androidx.compose.animation.core.Transition<S>.DeferredAnimation<T, V> createDeferredAnimation(final androidx.compose.animation.core.Transition<S> transition, androidx.compose.animation.core.TwoWayConverter<T, V> twoWayConverter, java.lang.String str, androidx.compose.runtime.Composer composer, int i, int i2) {
        composer.startReplaceableGroup(-1714122528);
        androidx.compose.runtime.ComposerKt.sourceInformation(composer, "C(createDeferredAnimation)P(1)977@38433L58,978@38496L102:Transition.kt#pdpnli");
        if ((i2 & 2) != 0) {
            str = "DeferredAnimation";
        }
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-1714122528, i, -1, "androidx.compose.animation.core.createDeferredAnimation (Transition.kt:976)");
        }
        composer.startReplaceableGroup(1157296644);
        androidx.compose.runtime.ComposerKt.sourceInformation(composer, "CC(remember)P(1):Composables.kt#9igjgp");
        boolean changed = composer.changed(transition);
        java.lang.Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue = transition.new DeferredAnimation(twoWayConverter, str);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        final androidx.compose.animation.core.Transition<S>.DeferredAnimation<T, V> deferredAnimation = (androidx.compose.animation.core.Transition.DeferredAnimation) rememberedValue;
        androidx.compose.runtime.EffectsKt.DisposableEffect(deferredAnimation, new kotlin.jvm.functions.Function1<androidx.compose.runtime.DisposableEffectScope, androidx.compose.runtime.DisposableEffectResult>() { // from class: androidx.compose.animation.core.TransitionKt$createDeferredAnimation$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final androidx.compose.runtime.DisposableEffectResult invoke(androidx.compose.runtime.DisposableEffectScope disposableEffectScope) {
                final androidx.compose.animation.core.Transition<S> transition2 = transition;
                final androidx.compose.animation.core.Transition<S>.DeferredAnimation<T, V> deferredAnimation2 = deferredAnimation;
                return new androidx.compose.runtime.DisposableEffectResult() { // from class: androidx.compose.animation.core.TransitionKt$createDeferredAnimation$1$invoke$$inlined$onDispose$1
                    @Override // androidx.compose.runtime.DisposableEffectResult
                    public void dispose() {
                        androidx.compose.animation.core.Transition.this.removeAnimation$animation_core_release(deferredAnimation2);
                    }
                };
            }
        }, composer, 0);
        if (transition.isSeeking()) {
            deferredAnimation.setupSeeking$animation_core_release();
        }
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return deferredAnimation;
    }

    public static final <S, T> androidx.compose.animation.core.Transition<T> createChildTransition(androidx.compose.animation.core.Transition<S> transition, java.lang.String str, kotlin.jvm.functions.Function3<? super S, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, ? extends T> function3, androidx.compose.runtime.Composer composer, int i, int i2) {
        composer.startReplaceableGroup(1215497572);
        androidx.compose.runtime.ComposerKt.sourceInformation(composer, "CC(createChildTransition)1010@39937L36,1011@39997L74,1012@40094L39,1013@40145L63:Transition.kt#pdpnli");
        if ((i2 & 1) != 0) {
            str = "ChildTransition";
        }
        java.lang.String str2 = str;
        int i3 = i & 14;
        composer.startReplaceableGroup(1157296644);
        androidx.compose.runtime.ComposerKt.sourceInformation(composer, "CC(remember)P(1):Composables.kt#9igjgp");
        boolean changed = composer.changed(transition);
        java.lang.Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue = transition.getCurrentState();
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        if (transition.isSeeking()) {
            rememberedValue = transition.getCurrentState();
        }
        int i4 = (i >> 3) & 112;
        androidx.compose.animation.core.Transition<T> createChildTransitionInternal = createChildTransitionInternal(transition, function3.invoke(rememberedValue, composer, java.lang.Integer.valueOf(i4)), function3.invoke(transition.getTargetState(), composer, java.lang.Integer.valueOf(i4)), str2, composer, i3 | ((i << 6) & 7168));
        composer.endReplaceableGroup();
        return createChildTransitionInternal;
    }

    public static final <S, T> androidx.compose.animation.core.Transition<T> createChildTransitionInternal(final androidx.compose.animation.core.Transition<S> transition, T t, T t2, java.lang.String str, androidx.compose.runtime.Composer composer, int i) {
        composer.startReplaceableGroup(-198307638);
        androidx.compose.runtime.ComposerKt.sourceInformation(composer, "C(createChildTransitionInternal)P(1,2)1023@40408L110,1027@40524L141,1041@40887L25:Transition.kt#pdpnli");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-198307638, i, -1, "androidx.compose.animation.core.createChildTransitionInternal (Transition.kt:1022)");
        }
        composer.startReplaceableGroup(1157296644);
        androidx.compose.runtime.ComposerKt.sourceInformation(composer, "CC(remember)P(1):Composables.kt#9igjgp");
        boolean changed = composer.changed(transition);
        java.lang.Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue = new androidx.compose.animation.core.Transition(new androidx.compose.animation.core.MutableTransitionState(t), transition.getLabel() + " > " + str);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        final androidx.compose.animation.core.Transition<T> transition2 = (androidx.compose.animation.core.Transition) rememberedValue;
        composer.startReplaceableGroup(1951131101);
        boolean changed2 = composer.changed(transition) | composer.changed(transition2);
        java.lang.Object rememberedValue2 = composer.rememberedValue();
        if (changed2 || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue2 = (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<androidx.compose.runtime.DisposableEffectScope, androidx.compose.runtime.DisposableEffectResult>() { // from class: androidx.compose.animation.core.TransitionKt$createChildTransitionInternal$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public final androidx.compose.runtime.DisposableEffectResult invoke(androidx.compose.runtime.DisposableEffectScope disposableEffectScope) {
                    transition.addTransition$animation_core_release(transition2);
                    final androidx.compose.animation.core.Transition<S> transition3 = transition;
                    final androidx.compose.animation.core.Transition<T> transition4 = transition2;
                    return new androidx.compose.runtime.DisposableEffectResult() { // from class: androidx.compose.animation.core.TransitionKt$createChildTransitionInternal$1$1$invoke$$inlined$onDispose$1
                        @Override // androidx.compose.runtime.DisposableEffectResult
                        public void dispose() {
                            androidx.compose.animation.core.Transition.this.removeTransition$animation_core_release(transition4);
                        }
                    };
                }
            };
            composer.updateRememberedValue(rememberedValue2);
        }
        composer.endReplaceableGroup();
        androidx.compose.runtime.EffectsKt.DisposableEffect(transition2, (kotlin.jvm.functions.Function1<? super androidx.compose.runtime.DisposableEffectScope, ? extends androidx.compose.runtime.DisposableEffectResult>) rememberedValue2, composer, 0);
        if (transition.isSeeking()) {
            transition2.seek(t, t2, transition.getLastSeekedTimeNanos());
        } else {
            transition2.updateTarget$animation_core_release(t2, composer, ((i >> 3) & 8) | ((i >> 6) & 14));
            transition2.setSeeking$animation_core_release(false);
        }
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return transition2;
    }

    public static final <S, T, V extends androidx.compose.animation.core.AnimationVector> androidx.compose.runtime.State<T> animateValue(androidx.compose.animation.core.Transition<S> transition, androidx.compose.animation.core.TwoWayConverter<T, V> twoWayConverter, kotlin.jvm.functions.Function3<? super androidx.compose.animation.core.Transition.Segment<S>, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, ? extends androidx.compose.animation.core.FiniteAnimationSpec<T>> function3, java.lang.String str, kotlin.jvm.functions.Function3<? super S, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, ? extends T> function32, androidx.compose.runtime.Composer composer, int i, int i2) {
        composer.startReplaceableGroup(-142660079);
        androidx.compose.runtime.ComposerKt.sourceInformation(composer, "CC(animateValue)P(3,2)1082@42932L32,1083@42987L31,1084@43043L23,1086@43079L89:Transition.kt#pdpnli");
        if ((i2 & 2) != 0) {
            function3 = new kotlin.jvm.functions.Function3<androidx.compose.animation.core.Transition.Segment<S>, androidx.compose.runtime.Composer, java.lang.Integer, androidx.compose.animation.core.SpringSpec<T>>() { // from class: androidx.compose.animation.core.TransitionKt$animateValue$1
                public final androidx.compose.animation.core.SpringSpec<T> invoke(androidx.compose.animation.core.Transition.Segment<S> segment, androidx.compose.runtime.Composer composer2, int i3) {
                    composer2.startReplaceableGroup(-895531546);
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventStart(-895531546, i3, -1, "androidx.compose.animation.core.animateValue.<anonymous> (Transition.kt:1077)");
                    }
                    androidx.compose.animation.core.SpringSpec<T> spring$default = androidx.compose.animation.core.AnimationSpecKt.spring$default(0.0f, 0.0f, null, 7, null);
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventEnd();
                    }
                    composer2.endReplaceableGroup();
                    return spring$default;
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj, androidx.compose.runtime.Composer composer2, java.lang.Integer num) {
                    return invoke((androidx.compose.animation.core.Transition.Segment) obj, composer2, num.intValue());
                }
            };
        }
        if ((i2 & 4) != 0) {
            str = "ValueAnimation";
        }
        int i3 = (i >> 9) & 112;
        androidx.compose.runtime.State<T> createTransitionAnimation = createTransitionAnimation(transition, function32.invoke(transition.getCurrentState(), composer, java.lang.Integer.valueOf(i3)), function32.invoke(transition.getTargetState(), composer, java.lang.Integer.valueOf(i3)), function3.invoke(transition.getSegment(), composer, java.lang.Integer.valueOf((i >> 3) & 112)), twoWayConverter, str, composer, (i & 14) | (57344 & (i << 9)) | ((i << 6) & 458752));
        composer.endReplaceableGroup();
        return createTransitionAnimation;
    }

    public static final <S, T, V extends androidx.compose.animation.core.AnimationVector> androidx.compose.runtime.State<T> createTransitionAnimation(final androidx.compose.animation.core.Transition<S> transition, T t, T t2, androidx.compose.animation.core.FiniteAnimationSpec<T> finiteAnimationSpec, androidx.compose.animation.core.TwoWayConverter<T, V> twoWayConverter, java.lang.String str, androidx.compose.runtime.Composer composer, int i) {
        composer.startReplaceableGroup(-304821198);
        androidx.compose.runtime.ComposerKt.sourceInformation(composer, "C(createTransitionAnimation)P(1,3!1,4)1098@43468L499,1121@44313L166:Transition.kt#pdpnli");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-304821198, i, -1, "androidx.compose.animation.core.createTransitionAnimation (Transition.kt:1097)");
        }
        composer.startReplaceableGroup(1157296644);
        androidx.compose.runtime.ComposerKt.sourceInformation(composer, "CC(remember)P(1):Composables.kt#9igjgp");
        boolean changed = composer.changed(transition);
        java.lang.Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue = transition.new TransitionAnimationState(t, androidx.compose.animation.core.AnimationStateKt.createZeroVectorFrom(twoWayConverter, t2), twoWayConverter, str);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        final androidx.compose.animation.core.Transition.TransitionAnimationState transitionAnimationState = (androidx.compose.animation.core.Transition.TransitionAnimationState) rememberedValue;
        if (transition.isSeeking()) {
            transitionAnimationState.updateInitialAndTargetValue$animation_core_release(t, t2, finiteAnimationSpec);
        } else {
            transitionAnimationState.updateTargetValue$animation_core_release(t2, finiteAnimationSpec);
        }
        composer.startReplaceableGroup(1951134899);
        boolean changed2 = composer.changed(transition) | composer.changed(transitionAnimationState);
        java.lang.Object rememberedValue2 = composer.rememberedValue();
        if (changed2 || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue2 = (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<androidx.compose.runtime.DisposableEffectScope, androidx.compose.runtime.DisposableEffectResult>() { // from class: androidx.compose.animation.core.TransitionKt$createTransitionAnimation$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public final androidx.compose.runtime.DisposableEffectResult invoke(androidx.compose.runtime.DisposableEffectScope disposableEffectScope) {
                    transition.addAnimation$animation_core_release(transitionAnimationState);
                    final androidx.compose.animation.core.Transition<S> transition2 = transition;
                    final androidx.compose.animation.core.Transition<S>.TransitionAnimationState<T, V> transitionAnimationState2 = transitionAnimationState;
                    return new androidx.compose.runtime.DisposableEffectResult() { // from class: androidx.compose.animation.core.TransitionKt$createTransitionAnimation$1$1$invoke$$inlined$onDispose$1
                        @Override // androidx.compose.runtime.DisposableEffectResult
                        public void dispose() {
                            androidx.compose.animation.core.Transition.this.removeAnimation$animation_core_release(transitionAnimationState2);
                        }
                    };
                }
            };
            composer.updateRememberedValue(rememberedValue2);
        }
        composer.endReplaceableGroup();
        androidx.compose.runtime.EffectsKt.DisposableEffect(transitionAnimationState, (kotlin.jvm.functions.Function1<? super androidx.compose.runtime.DisposableEffectScope, ? extends androidx.compose.runtime.DisposableEffectResult>) rememberedValue2, composer, 0);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return transitionAnimationState;
    }

    public static final <S> androidx.compose.runtime.State<java.lang.Float> animateFloat(androidx.compose.animation.core.Transition<S> transition, kotlin.jvm.functions.Function3<? super androidx.compose.animation.core.Transition.Segment<S>, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, ? extends androidx.compose.animation.core.FiniteAnimationSpec<java.lang.Float>> function3, java.lang.String str, kotlin.jvm.functions.Function3<? super S, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, java.lang.Float> function32, androidx.compose.runtime.Composer composer, int i, int i2) {
        composer.startReplaceableGroup(-1338768149);
        androidx.compose.runtime.ComposerKt.sourceInformation(composer, "CC(animateFloat)P(2)1165@46369L78:Transition.kt#pdpnli");
        if ((i2 & 1) != 0) {
            function3 = new kotlin.jvm.functions.Function3<androidx.compose.animation.core.Transition.Segment<S>, androidx.compose.runtime.Composer, java.lang.Integer, androidx.compose.animation.core.SpringSpec<java.lang.Float>>() { // from class: androidx.compose.animation.core.TransitionKt$animateFloat$1
                public final androidx.compose.animation.core.SpringSpec<java.lang.Float> invoke(androidx.compose.animation.core.Transition.Segment<S> segment, androidx.compose.runtime.Composer composer2, int i3) {
                    composer2.startReplaceableGroup(-522164544);
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventStart(-522164544, i3, -1, "androidx.compose.animation.core.animateFloat.<anonymous> (Transition.kt:1161)");
                    }
                    androidx.compose.animation.core.SpringSpec<java.lang.Float> spring$default = androidx.compose.animation.core.AnimationSpecKt.spring$default(0.0f, 0.0f, null, 7, null);
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventEnd();
                    }
                    composer2.endReplaceableGroup();
                    return spring$default;
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ androidx.compose.animation.core.SpringSpec<java.lang.Float> invoke(java.lang.Object obj, androidx.compose.runtime.Composer composer2, java.lang.Integer num) {
                    return invoke((androidx.compose.animation.core.Transition.Segment) obj, composer2, num.intValue());
                }
            };
        }
        if ((i2 & 2) != 0) {
            str = "FloatAnimation";
        }
        java.lang.String str2 = str;
        androidx.compose.animation.core.TwoWayConverter<java.lang.Float, androidx.compose.animation.core.AnimationVector1D> vectorConverter = androidx.compose.animation.core.VectorConvertersKt.getVectorConverter(kotlin.jvm.internal.FloatCompanionObject.INSTANCE);
        int i3 = i & 14;
        int i4 = i << 3;
        int i5 = i3 | (i4 & 896) | (i4 & 7168) | (i4 & 57344);
        composer.startReplaceableGroup(-142660079);
        androidx.compose.runtime.ComposerKt.sourceInformation(composer, "CC(animateValue)P(3,2)1082@42932L32,1083@42987L31,1084@43043L23,1086@43079L89:Transition.kt#pdpnli");
        int i6 = (i5 >> 9) & 112;
        androidx.compose.runtime.State<java.lang.Float> createTransitionAnimation = createTransitionAnimation(transition, function32.invoke(transition.getCurrentState(), composer, java.lang.Integer.valueOf(i6)), function32.invoke(transition.getTargetState(), composer, java.lang.Integer.valueOf(i6)), function3.invoke(transition.getSegment(), composer, java.lang.Integer.valueOf((i5 >> 3) & 112)), vectorConverter, str2, composer, (i5 & 14) | ((i5 << 6) & 458752));
        composer.endReplaceableGroup();
        composer.endReplaceableGroup();
        return createTransitionAnimation;
    }

    public static final <S> androidx.compose.runtime.State<androidx.compose.ui.unit.Dp> animateDp(androidx.compose.animation.core.Transition<S> transition, kotlin.jvm.functions.Function3<? super androidx.compose.animation.core.Transition.Segment<S>, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, ? extends androidx.compose.animation.core.FiniteAnimationSpec<androidx.compose.ui.unit.Dp>> function3, java.lang.String str, kotlin.jvm.functions.Function3<? super S, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, androidx.compose.ui.unit.Dp> function32, androidx.compose.runtime.Composer composer, int i, int i2) {
        composer.startReplaceableGroup(184732935);
        androidx.compose.runtime.ComposerKt.sourceInformation(composer, "CC(animateDp)P(2)1196@48083L75:Transition.kt#pdpnli");
        if ((i2 & 1) != 0) {
            function3 = new kotlin.jvm.functions.Function3<androidx.compose.animation.core.Transition.Segment<S>, androidx.compose.runtime.Composer, java.lang.Integer, androidx.compose.animation.core.SpringSpec<androidx.compose.ui.unit.Dp>>() { // from class: androidx.compose.animation.core.TransitionKt$animateDp$1
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ androidx.compose.animation.core.SpringSpec<androidx.compose.ui.unit.Dp> invoke(java.lang.Object obj, androidx.compose.runtime.Composer composer2, java.lang.Integer num) {
                    return invoke((androidx.compose.animation.core.Transition.Segment) obj, composer2, num.intValue());
                }

                public final androidx.compose.animation.core.SpringSpec<androidx.compose.ui.unit.Dp> invoke(androidx.compose.animation.core.Transition.Segment<S> segment, androidx.compose.runtime.Composer composer2, int i3) {
                    composer2.startReplaceableGroup(-575880366);
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventStart(-575880366, i3, -1, "androidx.compose.animation.core.animateDp.<anonymous> (Transition.kt:1191)");
                    }
                    androidx.compose.animation.core.SpringSpec<androidx.compose.ui.unit.Dp> spring$default = androidx.compose.animation.core.AnimationSpecKt.spring$default(0.0f, 0.0f, androidx.compose.ui.unit.Dp.m4476boximpl(androidx.compose.animation.core.VisibilityThresholdsKt.getVisibilityThreshold(androidx.compose.ui.unit.Dp.INSTANCE)), 3, null);
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventEnd();
                    }
                    composer2.endReplaceableGroup();
                    return spring$default;
                }
            };
        }
        if ((i2 & 2) != 0) {
            str = "DpAnimation";
        }
        java.lang.String str2 = str;
        androidx.compose.animation.core.TwoWayConverter<androidx.compose.ui.unit.Dp, androidx.compose.animation.core.AnimationVector1D> vectorConverter = androidx.compose.animation.core.VectorConvertersKt.getVectorConverter(androidx.compose.ui.unit.Dp.INSTANCE);
        int i3 = i & 14;
        int i4 = i << 3;
        int i5 = i3 | (i4 & 896) | (i4 & 7168) | (i4 & 57344);
        composer.startReplaceableGroup(-142660079);
        androidx.compose.runtime.ComposerKt.sourceInformation(composer, "CC(animateValue)P(3,2)1082@42932L32,1083@42987L31,1084@43043L23,1086@43079L89:Transition.kt#pdpnli");
        int i6 = (i5 >> 9) & 112;
        androidx.compose.runtime.State<androidx.compose.ui.unit.Dp> createTransitionAnimation = createTransitionAnimation(transition, function32.invoke(transition.getCurrentState(), composer, java.lang.Integer.valueOf(i6)), function32.invoke(transition.getTargetState(), composer, java.lang.Integer.valueOf(i6)), function3.invoke(transition.getSegment(), composer, java.lang.Integer.valueOf((i5 >> 3) & 112)), vectorConverter, str2, composer, (i5 & 14) | ((i5 << 6) & 458752));
        composer.endReplaceableGroup();
        composer.endReplaceableGroup();
        return createTransitionAnimation;
    }

    public static final <S> androidx.compose.runtime.State<androidx.compose.ui.geometry.Offset> animateOffset(androidx.compose.animation.core.Transition<S> transition, kotlin.jvm.functions.Function3<? super androidx.compose.animation.core.Transition.Segment<S>, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, ? extends androidx.compose.animation.core.FiniteAnimationSpec<androidx.compose.ui.geometry.Offset>> function3, java.lang.String str, kotlin.jvm.functions.Function3<? super S, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, androidx.compose.ui.geometry.Offset> function32, androidx.compose.runtime.Composer composer, int i, int i2) {
        composer.startReplaceableGroup(2078477582);
        androidx.compose.runtime.ComposerKt.sourceInformation(composer, "CC(animateOffset)P(2)1227@49823L79:Transition.kt#pdpnli");
        if ((i2 & 1) != 0) {
            function3 = new kotlin.jvm.functions.Function3<androidx.compose.animation.core.Transition.Segment<S>, androidx.compose.runtime.Composer, java.lang.Integer, androidx.compose.animation.core.SpringSpec<androidx.compose.ui.geometry.Offset>>() { // from class: androidx.compose.animation.core.TransitionKt$animateOffset$1
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ androidx.compose.animation.core.SpringSpec<androidx.compose.ui.geometry.Offset> invoke(java.lang.Object obj, androidx.compose.runtime.Composer composer2, java.lang.Integer num) {
                    return invoke((androidx.compose.animation.core.Transition.Segment) obj, composer2, num.intValue());
                }

                public final androidx.compose.animation.core.SpringSpec<androidx.compose.ui.geometry.Offset> invoke(androidx.compose.animation.core.Transition.Segment<S> segment, androidx.compose.runtime.Composer composer2, int i3) {
                    composer2.startReplaceableGroup(1623385561);
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventStart(1623385561, i3, -1, "androidx.compose.animation.core.animateOffset.<anonymous> (Transition.kt:1222)");
                    }
                    androidx.compose.animation.core.SpringSpec<androidx.compose.ui.geometry.Offset> spring$default = androidx.compose.animation.core.AnimationSpecKt.spring$default(0.0f, 0.0f, androidx.compose.ui.geometry.Offset.m1860boximpl(androidx.compose.animation.core.VisibilityThresholdsKt.getVisibilityThreshold(androidx.compose.ui.geometry.Offset.INSTANCE)), 3, null);
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventEnd();
                    }
                    composer2.endReplaceableGroup();
                    return spring$default;
                }
            };
        }
        if ((i2 & 2) != 0) {
            str = "OffsetAnimation";
        }
        java.lang.String str2 = str;
        androidx.compose.animation.core.TwoWayConverter<androidx.compose.ui.geometry.Offset, androidx.compose.animation.core.AnimationVector2D> vectorConverter = androidx.compose.animation.core.VectorConvertersKt.getVectorConverter(androidx.compose.ui.geometry.Offset.INSTANCE);
        int i3 = i & 14;
        int i4 = i << 3;
        int i5 = i3 | (i4 & 896) | (i4 & 7168) | (i4 & 57344);
        composer.startReplaceableGroup(-142660079);
        androidx.compose.runtime.ComposerKt.sourceInformation(composer, "CC(animateValue)P(3,2)1082@42932L32,1083@42987L31,1084@43043L23,1086@43079L89:Transition.kt#pdpnli");
        int i6 = (i5 >> 9) & 112;
        androidx.compose.runtime.State<androidx.compose.ui.geometry.Offset> createTransitionAnimation = createTransitionAnimation(transition, function32.invoke(transition.getCurrentState(), composer, java.lang.Integer.valueOf(i6)), function32.invoke(transition.getTargetState(), composer, java.lang.Integer.valueOf(i6)), function3.invoke(transition.getSegment(), composer, java.lang.Integer.valueOf((i5 >> 3) & 112)), vectorConverter, str2, composer, (i5 & 14) | ((i5 << 6) & 458752));
        composer.endReplaceableGroup();
        composer.endReplaceableGroup();
        return createTransitionAnimation;
    }

    public static final <S> androidx.compose.runtime.State<androidx.compose.ui.geometry.Size> animateSize(androidx.compose.animation.core.Transition<S> transition, kotlin.jvm.functions.Function3<? super androidx.compose.animation.core.Transition.Segment<S>, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, ? extends androidx.compose.animation.core.FiniteAnimationSpec<androidx.compose.ui.geometry.Size>> function3, java.lang.String str, kotlin.jvm.functions.Function3<? super S, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, androidx.compose.ui.geometry.Size> function32, androidx.compose.runtime.Composer composer, int i, int i2) {
        composer.startReplaceableGroup(-802210820);
        androidx.compose.runtime.ComposerKt.sourceInformation(composer, "CC(animateSize)P(2)1258@51552L77:Transition.kt#pdpnli");
        if ((i2 & 1) != 0) {
            function3 = new kotlin.jvm.functions.Function3<androidx.compose.animation.core.Transition.Segment<S>, androidx.compose.runtime.Composer, java.lang.Integer, androidx.compose.animation.core.SpringSpec<androidx.compose.ui.geometry.Size>>() { // from class: androidx.compose.animation.core.TransitionKt$animateSize$1
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ androidx.compose.animation.core.SpringSpec<androidx.compose.ui.geometry.Size> invoke(java.lang.Object obj, androidx.compose.runtime.Composer composer2, java.lang.Integer num) {
                    return invoke((androidx.compose.animation.core.Transition.Segment) obj, composer2, num.intValue());
                }

                public final androidx.compose.animation.core.SpringSpec<androidx.compose.ui.geometry.Size> invoke(androidx.compose.animation.core.Transition.Segment<S> segment, androidx.compose.runtime.Composer composer2, int i3) {
                    composer2.startReplaceableGroup(-1607152761);
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventStart(-1607152761, i3, -1, "androidx.compose.animation.core.animateSize.<anonymous> (Transition.kt:1253)");
                    }
                    androidx.compose.animation.core.SpringSpec<androidx.compose.ui.geometry.Size> spring$default = androidx.compose.animation.core.AnimationSpecKt.spring$default(0.0f, 0.0f, androidx.compose.ui.geometry.Size.m1928boximpl(androidx.compose.animation.core.VisibilityThresholdsKt.getVisibilityThreshold(androidx.compose.ui.geometry.Size.INSTANCE)), 3, null);
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventEnd();
                    }
                    composer2.endReplaceableGroup();
                    return spring$default;
                }
            };
        }
        if ((i2 & 2) != 0) {
            str = "SizeAnimation";
        }
        java.lang.String str2 = str;
        androidx.compose.animation.core.TwoWayConverter<androidx.compose.ui.geometry.Size, androidx.compose.animation.core.AnimationVector2D> vectorConverter = androidx.compose.animation.core.VectorConvertersKt.getVectorConverter(androidx.compose.ui.geometry.Size.INSTANCE);
        int i3 = i & 14;
        int i4 = i << 3;
        int i5 = i3 | (i4 & 896) | (i4 & 7168) | (i4 & 57344);
        composer.startReplaceableGroup(-142660079);
        androidx.compose.runtime.ComposerKt.sourceInformation(composer, "CC(animateValue)P(3,2)1082@42932L32,1083@42987L31,1084@43043L23,1086@43079L89:Transition.kt#pdpnli");
        int i6 = (i5 >> 9) & 112;
        androidx.compose.runtime.State<androidx.compose.ui.geometry.Size> createTransitionAnimation = createTransitionAnimation(transition, function32.invoke(transition.getCurrentState(), composer, java.lang.Integer.valueOf(i6)), function32.invoke(transition.getTargetState(), composer, java.lang.Integer.valueOf(i6)), function3.invoke(transition.getSegment(), composer, java.lang.Integer.valueOf((i5 >> 3) & 112)), vectorConverter, str2, composer, (i5 & 14) | ((i5 << 6) & 458752));
        composer.endReplaceableGroup();
        composer.endReplaceableGroup();
        return createTransitionAnimation;
    }

    public static final <S> androidx.compose.runtime.State<androidx.compose.ui.unit.IntOffset> animateIntOffset(androidx.compose.animation.core.Transition<S> transition, kotlin.jvm.functions.Function3<? super androidx.compose.animation.core.Transition.Segment<S>, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, ? extends androidx.compose.animation.core.FiniteAnimationSpec<androidx.compose.ui.unit.IntOffset>> function3, java.lang.String str, kotlin.jvm.functions.Function3<? super S, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, androidx.compose.ui.unit.IntOffset> function32, androidx.compose.runtime.Composer composer, int i, int i2) {
        composer.startReplaceableGroup(776131825);
        androidx.compose.runtime.ComposerKt.sourceInformation(composer, "CC(animateIntOffset)P(2)1289@53300L82:Transition.kt#pdpnli");
        if ((i2 & 1) != 0) {
            function3 = new kotlin.jvm.functions.Function3<androidx.compose.animation.core.Transition.Segment<S>, androidx.compose.runtime.Composer, java.lang.Integer, androidx.compose.animation.core.SpringSpec<androidx.compose.ui.unit.IntOffset>>() { // from class: androidx.compose.animation.core.TransitionKt$animateIntOffset$1
                public final androidx.compose.animation.core.SpringSpec<androidx.compose.ui.unit.IntOffset> invoke(androidx.compose.animation.core.Transition.Segment<S> segment, androidx.compose.runtime.Composer composer2, int i3) {
                    composer2.startReplaceableGroup(-1953479610);
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventStart(-1953479610, i3, -1, "androidx.compose.animation.core.animateIntOffset.<anonymous> (Transition.kt:1285)");
                    }
                    androidx.compose.animation.core.SpringSpec<androidx.compose.ui.unit.IntOffset> spring$default = androidx.compose.animation.core.AnimationSpecKt.spring$default(0.0f, 0.0f, androidx.compose.ui.unit.IntOffset.m4601boximpl(androidx.compose.ui.unit.IntOffsetKt.IntOffset(1, 1)), 3, null);
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventEnd();
                    }
                    composer2.endReplaceableGroup();
                    return spring$default;
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ androidx.compose.animation.core.SpringSpec<androidx.compose.ui.unit.IntOffset> invoke(java.lang.Object obj, androidx.compose.runtime.Composer composer2, java.lang.Integer num) {
                    return invoke((androidx.compose.animation.core.Transition.Segment) obj, composer2, num.intValue());
                }
            };
        }
        if ((i2 & 2) != 0) {
            str = "IntOffsetAnimation";
        }
        java.lang.String str2 = str;
        androidx.compose.animation.core.TwoWayConverter<androidx.compose.ui.unit.IntOffset, androidx.compose.animation.core.AnimationVector2D> vectorConverter = androidx.compose.animation.core.VectorConvertersKt.getVectorConverter(androidx.compose.ui.unit.IntOffset.INSTANCE);
        int i3 = i & 14;
        int i4 = i << 3;
        int i5 = i3 | (i4 & 896) | (i4 & 7168) | (i4 & 57344);
        composer.startReplaceableGroup(-142660079);
        androidx.compose.runtime.ComposerKt.sourceInformation(composer, "CC(animateValue)P(3,2)1082@42932L32,1083@42987L31,1084@43043L23,1086@43079L89:Transition.kt#pdpnli");
        int i6 = (i5 >> 9) & 112;
        androidx.compose.runtime.State<androidx.compose.ui.unit.IntOffset> createTransitionAnimation = createTransitionAnimation(transition, function32.invoke(transition.getCurrentState(), composer, java.lang.Integer.valueOf(i6)), function32.invoke(transition.getTargetState(), composer, java.lang.Integer.valueOf(i6)), function3.invoke(transition.getSegment(), composer, java.lang.Integer.valueOf((i5 >> 3) & 112)), vectorConverter, str2, composer, (i5 & 14) | ((i5 << 6) & 458752));
        composer.endReplaceableGroup();
        composer.endReplaceableGroup();
        return createTransitionAnimation;
    }

    public static final <S> androidx.compose.runtime.State<java.lang.Integer> animateInt(androidx.compose.animation.core.Transition<S> transition, kotlin.jvm.functions.Function3<? super androidx.compose.animation.core.Transition.Segment<S>, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, ? extends androidx.compose.animation.core.FiniteAnimationSpec<java.lang.Integer>> function3, java.lang.String str, kotlin.jvm.functions.Function3<? super S, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, java.lang.Integer> function32, androidx.compose.runtime.Composer composer, int i, int i2) {
        composer.startReplaceableGroup(1318902782);
        androidx.compose.runtime.ComposerKt.sourceInformation(composer, "CC(animateInt)P(2)1320@55003L76:Transition.kt#pdpnli");
        if ((i2 & 1) != 0) {
            function3 = new kotlin.jvm.functions.Function3<androidx.compose.animation.core.Transition.Segment<S>, androidx.compose.runtime.Composer, java.lang.Integer, androidx.compose.animation.core.SpringSpec<java.lang.Integer>>() { // from class: androidx.compose.animation.core.TransitionKt$animateInt$1
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ androidx.compose.animation.core.SpringSpec<java.lang.Integer> invoke(java.lang.Object obj, androidx.compose.runtime.Composer composer2, java.lang.Integer num) {
                    return invoke((androidx.compose.animation.core.Transition.Segment) obj, composer2, num.intValue());
                }

                public final androidx.compose.animation.core.SpringSpec<java.lang.Integer> invoke(androidx.compose.animation.core.Transition.Segment<S> segment, androidx.compose.runtime.Composer composer2, int i3) {
                    composer2.startReplaceableGroup(-785273069);
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventStart(-785273069, i3, -1, "androidx.compose.animation.core.animateInt.<anonymous> (Transition.kt:1315)");
                    }
                    androidx.compose.animation.core.SpringSpec<java.lang.Integer> spring$default = androidx.compose.animation.core.AnimationSpecKt.spring$default(0.0f, 0.0f, 1, 3, null);
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventEnd();
                    }
                    composer2.endReplaceableGroup();
                    return spring$default;
                }
            };
        }
        if ((i2 & 2) != 0) {
            str = "IntAnimation";
        }
        java.lang.String str2 = str;
        androidx.compose.animation.core.TwoWayConverter<java.lang.Integer, androidx.compose.animation.core.AnimationVector1D> vectorConverter = androidx.compose.animation.core.VectorConvertersKt.getVectorConverter(kotlin.jvm.internal.IntCompanionObject.INSTANCE);
        int i3 = i & 14;
        int i4 = i << 3;
        int i5 = i3 | (i4 & 896) | (i4 & 7168) | (i4 & 57344);
        composer.startReplaceableGroup(-142660079);
        androidx.compose.runtime.ComposerKt.sourceInformation(composer, "CC(animateValue)P(3,2)1082@42932L32,1083@42987L31,1084@43043L23,1086@43079L89:Transition.kt#pdpnli");
        int i6 = (i5 >> 9) & 112;
        androidx.compose.runtime.State<java.lang.Integer> createTransitionAnimation = createTransitionAnimation(transition, function32.invoke(transition.getCurrentState(), composer, java.lang.Integer.valueOf(i6)), function32.invoke(transition.getTargetState(), composer, java.lang.Integer.valueOf(i6)), function3.invoke(transition.getSegment(), composer, java.lang.Integer.valueOf((i5 >> 3) & 112)), vectorConverter, str2, composer, (i5 & 14) | ((i5 << 6) & 458752));
        composer.endReplaceableGroup();
        composer.endReplaceableGroup();
        return createTransitionAnimation;
    }

    public static final <S> androidx.compose.runtime.State<androidx.compose.ui.unit.IntSize> animateIntSize(androidx.compose.animation.core.Transition<S> transition, kotlin.jvm.functions.Function3<? super androidx.compose.animation.core.Transition.Segment<S>, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, ? extends androidx.compose.animation.core.FiniteAnimationSpec<androidx.compose.ui.unit.IntSize>> function3, java.lang.String str, kotlin.jvm.functions.Function3<? super S, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, androidx.compose.ui.unit.IntSize> function32, androidx.compose.runtime.Composer composer, int i, int i2) {
        composer.startReplaceableGroup(-2104123233);
        androidx.compose.runtime.ComposerKt.sourceInformation(composer, "CC(animateIntSize)P(2)1350@56732L80:Transition.kt#pdpnli");
        if ((i2 & 1) != 0) {
            function3 = new kotlin.jvm.functions.Function3<androidx.compose.animation.core.Transition.Segment<S>, androidx.compose.runtime.Composer, java.lang.Integer, androidx.compose.animation.core.SpringSpec<androidx.compose.ui.unit.IntSize>>() { // from class: androidx.compose.animation.core.TransitionKt$animateIntSize$1
                public final androidx.compose.animation.core.SpringSpec<androidx.compose.ui.unit.IntSize> invoke(androidx.compose.animation.core.Transition.Segment<S> segment, androidx.compose.runtime.Composer composer2, int i3) {
                    composer2.startReplaceableGroup(967893300);
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventStart(967893300, i3, -1, "androidx.compose.animation.core.animateIntSize.<anonymous> (Transition.kt:1346)");
                    }
                    androidx.compose.animation.core.SpringSpec<androidx.compose.ui.unit.IntSize> spring$default = androidx.compose.animation.core.AnimationSpecKt.spring$default(0.0f, 0.0f, androidx.compose.ui.unit.IntSize.m4644boximpl(androidx.compose.ui.unit.IntSizeKt.IntSize(1, 1)), 3, null);
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventEnd();
                    }
                    composer2.endReplaceableGroup();
                    return spring$default;
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ androidx.compose.animation.core.SpringSpec<androidx.compose.ui.unit.IntSize> invoke(java.lang.Object obj, androidx.compose.runtime.Composer composer2, java.lang.Integer num) {
                    return invoke((androidx.compose.animation.core.Transition.Segment) obj, composer2, num.intValue());
                }
            };
        }
        if ((i2 & 2) != 0) {
            str = "IntSizeAnimation";
        }
        java.lang.String str2 = str;
        androidx.compose.animation.core.TwoWayConverter<androidx.compose.ui.unit.IntSize, androidx.compose.animation.core.AnimationVector2D> vectorConverter = androidx.compose.animation.core.VectorConvertersKt.getVectorConverter(androidx.compose.ui.unit.IntSize.INSTANCE);
        int i3 = i & 14;
        int i4 = i << 3;
        int i5 = i3 | (i4 & 896) | (i4 & 7168) | (i4 & 57344);
        composer.startReplaceableGroup(-142660079);
        androidx.compose.runtime.ComposerKt.sourceInformation(composer, "CC(animateValue)P(3,2)1082@42932L32,1083@42987L31,1084@43043L23,1086@43079L89:Transition.kt#pdpnli");
        int i6 = (i5 >> 9) & 112;
        androidx.compose.runtime.State<androidx.compose.ui.unit.IntSize> createTransitionAnimation = createTransitionAnimation(transition, function32.invoke(transition.getCurrentState(), composer, java.lang.Integer.valueOf(i6)), function32.invoke(transition.getTargetState(), composer, java.lang.Integer.valueOf(i6)), function3.invoke(transition.getSegment(), composer, java.lang.Integer.valueOf((i5 >> 3) & 112)), vectorConverter, str2, composer, (i5 & 14) | ((i5 << 6) & 458752));
        composer.endReplaceableGroup();
        composer.endReplaceableGroup();
        return createTransitionAnimation;
    }

    public static final <S> androidx.compose.runtime.State<androidx.compose.ui.geometry.Rect> animateRect(androidx.compose.animation.core.Transition<S> transition, kotlin.jvm.functions.Function3<? super androidx.compose.animation.core.Transition.Segment<S>, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, ? extends androidx.compose.animation.core.FiniteAnimationSpec<androidx.compose.ui.geometry.Rect>> function3, java.lang.String str, kotlin.jvm.functions.Function3<? super S, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, androidx.compose.ui.geometry.Rect> function32, androidx.compose.runtime.Composer composer, int i, int i2) {
        composer.startReplaceableGroup(1496278239);
        androidx.compose.runtime.ComposerKt.sourceInformation(composer, "CC(animateRect)P(2)1380@58458L77:Transition.kt#pdpnli");
        if ((i2 & 1) != 0) {
            function3 = new kotlin.jvm.functions.Function3<androidx.compose.animation.core.Transition.Segment<S>, androidx.compose.runtime.Composer, java.lang.Integer, androidx.compose.animation.core.SpringSpec<androidx.compose.ui.geometry.Rect>>() { // from class: androidx.compose.animation.core.TransitionKt$animateRect$1
                public final androidx.compose.animation.core.SpringSpec<androidx.compose.ui.geometry.Rect> invoke(androidx.compose.animation.core.Transition.Segment<S> segment, androidx.compose.runtime.Composer composer2, int i3) {
                    composer2.startReplaceableGroup(691336298);
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventStart(691336298, i3, -1, "androidx.compose.animation.core.animateRect.<anonymous> (Transition.kt:1376)");
                    }
                    androidx.compose.animation.core.SpringSpec<androidx.compose.ui.geometry.Rect> spring$default = androidx.compose.animation.core.AnimationSpecKt.spring$default(0.0f, 0.0f, androidx.compose.animation.core.VisibilityThresholdsKt.getVisibilityThreshold(androidx.compose.ui.geometry.Rect.INSTANCE), 3, null);
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventEnd();
                    }
                    composer2.endReplaceableGroup();
                    return spring$default;
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ androidx.compose.animation.core.SpringSpec<androidx.compose.ui.geometry.Rect> invoke(java.lang.Object obj, androidx.compose.runtime.Composer composer2, java.lang.Integer num) {
                    return invoke((androidx.compose.animation.core.Transition.Segment) obj, composer2, num.intValue());
                }
            };
        }
        if ((i2 & 2) != 0) {
            str = "RectAnimation";
        }
        java.lang.String str2 = str;
        androidx.compose.animation.core.TwoWayConverter<androidx.compose.ui.geometry.Rect, androidx.compose.animation.core.AnimationVector4D> vectorConverter = androidx.compose.animation.core.VectorConvertersKt.getVectorConverter(androidx.compose.ui.geometry.Rect.INSTANCE);
        int i3 = i & 14;
        int i4 = i << 3;
        int i5 = i3 | (i4 & 896) | (i4 & 7168) | (i4 & 57344);
        composer.startReplaceableGroup(-142660079);
        androidx.compose.runtime.ComposerKt.sourceInformation(composer, "CC(animateValue)P(3,2)1082@42932L32,1083@42987L31,1084@43043L23,1086@43079L89:Transition.kt#pdpnli");
        int i6 = (i5 >> 9) & 112;
        androidx.compose.runtime.State<androidx.compose.ui.geometry.Rect> createTransitionAnimation = createTransitionAnimation(transition, function32.invoke(transition.getCurrentState(), composer, java.lang.Integer.valueOf(i6)), function32.invoke(transition.getTargetState(), composer, java.lang.Integer.valueOf(i6)), function3.invoke(transition.getSegment(), composer, java.lang.Integer.valueOf((i5 >> 3) & 112)), vectorConverter, str2, composer, (i5 & 14) | ((i5 << 6) & 458752));
        composer.endReplaceableGroup();
        composer.endReplaceableGroup();
        return createTransitionAnimation;
    }
}
