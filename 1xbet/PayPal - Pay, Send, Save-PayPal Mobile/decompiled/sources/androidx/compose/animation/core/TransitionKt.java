package androidx.compose.animation.core;

import androidx.compose.animation.core.Transition.DeferredAnimation;
import androidx.compose.animation.core.Transition.TransitionAnimationState;

@kotlin.Metadata(d1 = {"\u0000®\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a-\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u0002H\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0007¢\u0006\u0002\u0010\u0006\u001a3\u0010\u0013\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u00022\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u0002H\u00020\u00152\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0007¢\u0006\u0002\u0010\u0016\u001a3\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u00022\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u0002H\u00020\u00172\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0007¢\u0006\u0002\u0010\u0018\u001aa\u0010\u001f\u001a\u0018\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H!0 R\b\u0012\u0004\u0012\u0002H\"0\u0001\"\u0004\b\u0000\u0010\"\"\u0004\b\u0001\u0010\u0002\"\b\b\u0002\u0010!*\u00020#*\b\u0012\u0004\u0012\u0002H\"0\u00012\u0012\u0010$\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H!0%2\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0007¢\u0006\u0002\u0010&\u001a\\\u0010'\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\"\"\u0004\b\u0001\u0010\u0002*\b\u0012\u0004\u0012\u0002H\"0\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00052&\u0010(\u001a\"\u0012\u0013\u0012\u0011H\"¢\u0006\f\b)\u0012\b\b*\u0012\u0004\b\b(+\u0012\u0004\u0012\u0002H\u00020\n¢\u0006\u0002\b,H\u0087\b¢\u0006\u0002\u0010-\u001aA\u0010.\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\"\"\u0004\b\u0001\u0010\u0002*\b\u0012\u0004\u0012\u0002H\"0\u00012\u0006\u0010/\u001a\u0002H\u00022\u0006\u0010\u0003\u001a\u0002H\u00022\u0006\u00100\u001a\u00020\u0005H\u0001¢\u0006\u0002\u00101\u001a¦\u0001\u00102\u001a\b\u0012\u0004\u0012\u0002H\u000203\"\u0004\b\u0000\u0010\"\"\u0004\b\u0001\u0010\u0002\"\b\b\u0002\u0010!*\u00020#*\b\u0012\u0004\u0012\u0002H\"0\u00012\u0012\u0010$\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H!0%2*\b\n\u00104\u001a$\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\"05\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u0002060\n¢\u0006\u0002\b,¢\u0006\u0002\b72\b\b\u0002\u0010\u0004\u001a\u00020\u00052&\u00108\u001a\"\u0012\u0013\u0012\u0011H\"¢\u0006\f\b)\u0012\b\b*\u0012\u0004\b\b(9\u0012\u0004\u0012\u0002H\u00020\n¢\u0006\u0002\b,H\u0087\b¢\u0006\u0002\u0010:\u001am\u0010;\u001a\b\u0012\u0004\u0012\u0002H\u000203\"\u0004\b\u0000\u0010\"\"\u0004\b\u0001\u0010\u0002\"\b\b\u0002\u0010!*\u00020#*\b\u0012\u0004\u0012\u0002H\"0\u00012\u0006\u0010<\u001a\u0002H\u00022\u0006\u0010=\u001a\u0002H\u00022\f\u0010>\u001a\b\u0012\u0004\u0012\u0002H\u0002062\u0012\u0010$\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H!0%2\u0006\u0010\u0004\u001a\u00020\u0005H\u0001¢\u0006\u0002\u0010?\u001ai\u0010@\u001a\u00020\f\"\u0004\b\u0000\u0010\"\"\u0004\b\u0001\u0010\u0002\"\b\b\u0002\u0010!*\u00020#*\b\u0012\u0004\u0012\u0002H\"0\u00012\u001c\u0010A\u001a\u0018\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H!0BR\b\u0012\u0004\u0012\u0002H\"0\u00012\u0006\u0010<\u001a\u0002H\u00022\u0006\u0010=\u001a\u0002H\u00022\f\u0010>\u001a\b\u0012\u0004\u0012\u0002H\u000206H\u0003¢\u0006\u0002\u0010C\u001a\u0082\u0001\u0010D\u001a\b\u0012\u0004\u0012\u00020\u001a03\"\u0004\b\u0000\u0010\"*\b\u0012\u0004\u0012\u0002H\"0\u00012*\b\n\u00104\u001a$\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\"05\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a060\n¢\u0006\u0002\b,¢\u0006\u0002\b72\b\b\u0002\u0010\u0004\u001a\u00020\u00052&\u00108\u001a\"\u0012\u0013\u0012\u0011H\"¢\u0006\f\b)\u0012\b\b*\u0012\u0004\b\b(9\u0012\u0004\u0012\u00020\u001a0\n¢\u0006\u0002\b,H\u0087\b¢\u0006\u0002\u0010E\u001a\u0082\u0001\u0010F\u001a\b\u0012\u0004\u0012\u00020G03\"\u0004\b\u0000\u0010\"*\b\u0012\u0004\u0012\u0002H\"0\u00012*\b\n\u00104\u001a$\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\"05\u0012\n\u0012\b\u0012\u0004\u0012\u00020G060\n¢\u0006\u0002\b,¢\u0006\u0002\b72\b\b\u0002\u0010\u0004\u001a\u00020\u00052&\u00108\u001a\"\u0012\u0013\u0012\u0011H\"¢\u0006\f\b)\u0012\b\b*\u0012\u0004\b\b(9\u0012\u0004\u0012\u00020G0\n¢\u0006\u0002\b,H\u0087\b¢\u0006\u0002\u0010E\u001a\u0082\u0001\u0010H\u001a\b\u0012\u0004\u0012\u00020I03\"\u0004\b\u0000\u0010\"*\b\u0012\u0004\u0012\u0002H\"0\u00012*\b\n\u00104\u001a$\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\"05\u0012\n\u0012\b\u0012\u0004\u0012\u00020I060\n¢\u0006\u0002\b,¢\u0006\u0002\b72\b\b\u0002\u0010\u0004\u001a\u00020\u00052&\u00108\u001a\"\u0012\u0013\u0012\u0011H\"¢\u0006\f\b)\u0012\b\b*\u0012\u0004\b\b(9\u0012\u0004\u0012\u00020I0\n¢\u0006\u0002\b,H\u0087\b¢\u0006\u0002\u0010E\u001a\u0082\u0001\u0010J\u001a\b\u0012\u0004\u0012\u00020K03\"\u0004\b\u0000\u0010\"*\b\u0012\u0004\u0012\u0002H\"0\u00012*\b\n\u00104\u001a$\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\"05\u0012\n\u0012\b\u0012\u0004\u0012\u00020K060\n¢\u0006\u0002\b,¢\u0006\u0002\b72\b\b\u0002\u0010\u0004\u001a\u00020\u00052&\u00108\u001a\"\u0012\u0013\u0012\u0011H\"¢\u0006\f\b)\u0012\b\b*\u0012\u0004\b\b(9\u0012\u0004\u0012\u00020K0\n¢\u0006\u0002\b,H\u0087\b¢\u0006\u0002\u0010E\u001a\u0082\u0001\u0010L\u001a\b\u0012\u0004\u0012\u00020M03\"\u0004\b\u0000\u0010\"*\b\u0012\u0004\u0012\u0002H\"0\u00012*\b\n\u00104\u001a$\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\"05\u0012\n\u0012\b\u0012\u0004\u0012\u00020M060\n¢\u0006\u0002\b,¢\u0006\u0002\b72\b\b\u0002\u0010\u0004\u001a\u00020\u00052&\u00108\u001a\"\u0012\u0013\u0012\u0011H\"¢\u0006\f\b)\u0012\b\b*\u0012\u0004\b\b(9\u0012\u0004\u0012\u00020M0\n¢\u0006\u0002\b,H\u0087\b¢\u0006\u0002\u0010E\u001a\u0082\u0001\u0010N\u001a\b\u0012\u0004\u0012\u00020\b03\"\u0004\b\u0000\u0010\"*\b\u0012\u0004\u0012\u0002H\"0\u00012*\b\n\u00104\u001a$\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\"05\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b060\n¢\u0006\u0002\b,¢\u0006\u0002\b72\b\b\u0002\u0010\u0004\u001a\u00020\u00052&\u00108\u001a\"\u0012\u0013\u0012\u0011H\"¢\u0006\f\b)\u0012\b\b*\u0012\u0004\b\b(9\u0012\u0004\u0012\u00020\b0\n¢\u0006\u0002\b,H\u0087\b¢\u0006\u0002\u0010E\u001a\u0082\u0001\u0010O\u001a\b\u0012\u0004\u0012\u00020P03\"\u0004\b\u0000\u0010\"*\b\u0012\u0004\u0012\u0002H\"0\u00012*\b\n\u00104\u001a$\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\"05\u0012\n\u0012\b\u0012\u0004\u0012\u00020P060\n¢\u0006\u0002\b,¢\u0006\u0002\b72\b\b\u0002\u0010\u0004\u001a\u00020\u00052&\u00108\u001a\"\u0012\u0013\u0012\u0011H\"¢\u0006\f\b)\u0012\b\b*\u0012\u0004\b\b(9\u0012\u0004\u0012\u00020P0\n¢\u0006\u0002\b,H\u0087\b¢\u0006\u0002\u0010E\u001a\u0082\u0001\u0010Q\u001a\b\u0012\u0004\u0012\u00020R03\"\u0004\b\u0000\u0010\"*\b\u0012\u0004\u0012\u0002H\"0\u00012*\b\n\u00104\u001a$\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\"05\u0012\n\u0012\b\u0012\u0004\u0012\u00020R060\n¢\u0006\u0002\b,¢\u0006\u0002\b72\b\b\u0002\u0010\u0004\u001a\u00020\u00052&\u00108\u001a\"\u0012\u0013\u0012\u0011H\"¢\u0006\f\b)\u0012\b\b*\u0012\u0004\b\b(9\u0012\u0004\u0012\u00020R0\n¢\u0006\u0002\b,H\u0087\b¢\u0006\u0002\u0010E\"\u000e\u0010\u0007\u001a\u00020\bX\u0080T¢\u0006\u0002\n\u0000\"\u001e\u0010\t\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000b\u0012\u0004\u0012\u00020\f0\nX\u0082\u0004¢\u0006\u0002\n\u0000\"\u001b\u0010\r\u001a\u00020\u000e8@X\u0080\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u000f\u0010\u0010\"\u000e\u0010\u0019\u001a\u00020\u001aX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u001b\u001a\u00020\u001aX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u001c\u001a\u00020\u001aX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u001d\u001a\u00020\u001aX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u001e\u001a\u00020\u001aX\u0082T¢\u0006\u0002\n\u0000¨\u0006S"}, d2 = {"updateTransition", "Landroidx/compose/animation/core/Transition;", "T", "targetState", "label", "", "(Ljava/lang/Object;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)Landroidx/compose/animation/core/Transition;", "AnimationDebugDurationScale", "", "SeekableTransitionStateTotalDurationChanged", "Lkotlin/Function1;", "Landroidx/compose/animation/core/SeekableTransitionState;", "", "SeekableStateObserver", "Landroidx/compose/runtime/snapshots/SnapshotStateObserver;", "getSeekableStateObserver", "()Landroidx/compose/runtime/snapshots/SnapshotStateObserver;", "SeekableStateObserver$delegate", "Lkotlin/Lazy;", "rememberTransition", "transitionState", "Landroidx/compose/animation/core/TransitionState;", "(Landroidx/compose/animation/core/TransitionState;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)Landroidx/compose/animation/core/Transition;", "Landroidx/compose/animation/core/MutableTransitionState;", "(Landroidx/compose/animation/core/MutableTransitionState;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)Landroidx/compose/animation/core/Transition;", "NoReset", "", "ResetNoSnap", "ResetAnimationSnap", "ResetAnimationSnapCurrent", "ResetAnimationSnapTarget", "createDeferredAnimation", "Landroidx/compose/animation/core/Transition$DeferredAnimation;", "V", "S", "Landroidx/compose/animation/core/AnimationVector;", "typeConverter", "Landroidx/compose/animation/core/TwoWayConverter;", "(Landroidx/compose/animation/core/Transition;Landroidx/compose/animation/core/TwoWayConverter;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)Landroidx/compose/animation/core/Transition$DeferredAnimation;", "createChildTransition", "transformToChildState", "Lkotlin/ParameterName;", "name", "parentState", "Landroidx/compose/runtime/Composable;", "(Landroidx/compose/animation/core/Transition;Ljava/lang/String;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)Landroidx/compose/animation/core/Transition;", "createChildTransitionInternal", "initialState", "childLabel", "(Landroidx/compose/animation/core/Transition;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;Landroidx/compose/runtime/Composer;I)Landroidx/compose/animation/core/Transition;", "animateValue", "Landroidx/compose/runtime/State;", "transitionSpec", "Landroidx/compose/animation/core/Transition$Segment;", "Landroidx/compose/animation/core/FiniteAnimationSpec;", "Lkotlin/ExtensionFunctionType;", "targetValueByState", "state", "(Landroidx/compose/animation/core/Transition;Landroidx/compose/animation/core/TwoWayConverter;Lkotlin/jvm/functions/Function3;Ljava/lang/String;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;", "createTransitionAnimation", "initialValue", "targetValue", "animationSpec", "(Landroidx/compose/animation/core/Transition;Ljava/lang/Object;Ljava/lang/Object;Landroidx/compose/animation/core/FiniteAnimationSpec;Landroidx/compose/animation/core/TwoWayConverter;Ljava/lang/String;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "UpdateInitialAndTargetValues", "transitionAnimation", "Landroidx/compose/animation/core/Transition$TransitionAnimationState;", "(Landroidx/compose/animation/core/Transition;Landroidx/compose/animation/core/Transition$TransitionAnimationState;Ljava/lang/Object;Ljava/lang/Object;Landroidx/compose/animation/core/FiniteAnimationSpec;Landroidx/compose/runtime/Composer;I)V", "animateFloat", "(Landroidx/compose/animation/core/Transition;Lkotlin/jvm/functions/Function3;Ljava/lang/String;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;", "animateDp", "Landroidx/compose/ui/unit/Dp;", "animateOffset", "Landroidx/compose/ui/geometry/Offset;", "animateSize", "Landroidx/compose/ui/geometry/Size;", "animateIntOffset", "Landroidx/compose/ui/unit/IntOffset;", "animateInt", "animateIntSize", "Landroidx/compose/ui/unit/IntSize;", "animateRect", "Landroidx/compose/ui/geometry/Rect;", "animation-core"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class TransitionKt {
    public static final int AnimationDebugDurationScale = 1;
    private static final kotlin.jvm.functions.Function1<androidx.compose.animation.core.SeekableTransitionState<?>, kotlin.Unit> getHighSpeedVideoFpsRanges = new kotlin.jvm.functions.Function1() { // from class: androidx.compose.animation.core.TransitionKt$$ExternalSyntheticLambda3
        @Override // kotlin.jvm.functions.Function1
        public final java.lang.Object invoke(java.lang.Object obj) {
            kotlin.Unit highSpeedVideoSizes;
            highSpeedVideoSizes = androidx.compose.animation.core.TransitionKt.getHighSpeedVideoSizes((androidx.compose.animation.core.SeekableTransitionState) obj);
            return highSpeedVideoSizes;
        }
    };
    private static final kotlin.Lazy Camera2StreamConfigurationMap = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.NONE, new kotlin.jvm.functions.Function0() { // from class: androidx.compose.animation.core.TransitionKt$$ExternalSyntheticLambda4
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            androidx.compose.runtime.snapshots.SnapshotStateObserver highSpeedVideoSizes;
            highSpeedVideoSizes = androidx.compose.animation.core.TransitionKt.getHighSpeedVideoSizes();
            return highSpeedVideoSizes;
        }
    });

    public static final <T> androidx.compose.animation.core.Transition<T> updateTransition(T t, java.lang.String str, androidx.compose.runtime.Composer composer, int i, int i2) {
        if ((i2 & 2) != 0) {
            str = null;
        }
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(2029166765, i, -1, "androidx.compose.animation.core.updateTransition (Transition.kt:87)");
        }
        java.lang.Object rememberedValue = composer.rememberedValue();
        if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue = new androidx.compose.animation.core.Transition(t, str);
            composer.updateRememberedValue(rememberedValue);
        }
        final androidx.compose.animation.core.Transition<T> transition = (androidx.compose.animation.core.Transition) rememberedValue;
        transition.animateTo$animation_core(t, composer, (i & 8) | 48 | (i & 14));
        java.lang.Object rememberedValue2 = composer.rememberedValue();
        if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue2 = new kotlin.jvm.functions.Function1() { // from class: androidx.compose.animation.core.TransitionKt$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    androidx.compose.runtime.DisposableEffectResult highSpeedVideoFpsRangesFor;
                    highSpeedVideoFpsRangesFor = androidx.compose.animation.core.TransitionKt.getHighSpeedVideoFpsRangesFor(androidx.compose.animation.core.Transition.this);
                    return highSpeedVideoFpsRangesFor;
                }
            };
            composer.updateRememberedValue(rememberedValue2);
        }
        androidx.compose.runtime.EffectsKt.DisposableEffect(transition, (kotlin.jvm.functions.Function1<? super androidx.compose.runtime.DisposableEffectScope, ? extends androidx.compose.runtime.DisposableEffectResult>) rememberedValue2, composer, 54);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return transition;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit getHighSpeedVideoSizes(androidx.compose.animation.core.SeekableTransitionState seekableTransitionState) {
        seekableTransitionState.onTotalDurationChanged$animation_core();
        return kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit Camera2StreamConfigurationMap(kotlin.jvm.functions.Function0 function0) {
        function0.invoke();
        return kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.runtime.snapshots.SnapshotStateObserver getHighSpeedVideoSizes() {
        androidx.compose.runtime.snapshots.SnapshotStateObserver snapshotStateObserver = new androidx.compose.runtime.snapshots.SnapshotStateObserver(new kotlin.jvm.functions.Function1() { // from class: androidx.compose.animation.core.TransitionKt$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                kotlin.Unit Camera2StreamConfigurationMap2;
                Camera2StreamConfigurationMap2 = androidx.compose.animation.core.TransitionKt.Camera2StreamConfigurationMap((kotlin.jvm.functions.Function0) obj);
                return Camera2StreamConfigurationMap2;
            }
        });
        snapshotStateObserver.start();
        return snapshotStateObserver;
    }

    public static final androidx.compose.runtime.snapshots.SnapshotStateObserver getSeekableStateObserver() {
        return (androidx.compose.runtime.snapshots.SnapshotStateObserver) Camera2StreamConfigurationMap.getValue();
    }

    public static final <T> androidx.compose.animation.core.Transition<T> rememberTransition(androidx.compose.animation.core.TransitionState<T> transitionState, java.lang.String str, androidx.compose.runtime.Composer composer, int i, int i2) {
        if ((i2 & 2) != 0) {
            str = null;
        }
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(1643203617, i, -1, "androidx.compose.animation.core.rememberTransition (Transition.kt:804)");
        }
        int i3 = (i & 14) ^ 6;
        boolean z = true;
        boolean z2 = (i3 > 4 && composer.changed(transitionState)) || (i & 6) == 4;
        java.lang.Object rememberedValue = composer.rememberedValue();
        if (z2 || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            androidx.compose.runtime.snapshots.Snapshot.Companion companion = androidx.compose.runtime.snapshots.Snapshot.INSTANCE;
            androidx.compose.runtime.snapshots.Snapshot currentThreadSnapshot = companion.getCurrentThreadSnapshot();
            kotlin.jvm.functions.Function1<java.lang.Object, kotlin.Unit> readObserver = currentThreadSnapshot != null ? currentThreadSnapshot.getReadObserver() : null;
            androidx.compose.runtime.snapshots.Snapshot makeCurrentNonObservable = companion.makeCurrentNonObservable(currentThreadSnapshot);
            try {
                java.lang.Object transition = new androidx.compose.animation.core.Transition((androidx.compose.animation.core.TransitionState) transitionState, str);
                companion.restoreNonObservable(currentThreadSnapshot, makeCurrentNonObservable, readObserver);
                composer.updateRememberedValue(transition);
                rememberedValue = transition;
            } catch (java.lang.Throwable th) {
                companion.restoreNonObservable(currentThreadSnapshot, makeCurrentNonObservable, readObserver);
                throw th;
            }
        }
        final androidx.compose.animation.core.Transition<T> transition2 = (androidx.compose.animation.core.Transition) rememberedValue;
        if (transitionState instanceof androidx.compose.animation.core.SeekableTransitionState) {
            composer.startReplaceGroup(-1357607479);
            androidx.compose.animation.core.SeekableTransitionState seekableTransitionState = (androidx.compose.animation.core.SeekableTransitionState) transitionState;
            S currentState = seekableTransitionState.getCurrentState();
            S targetState = seekableTransitionState.getTargetState();
            if ((i3 <= 4 || !composer.changed(transitionState)) && (i & 6) != 4) {
                z = false;
            }
            java.lang.Object rememberedValue2 = composer.rememberedValue();
            if (z || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = (kotlin.jvm.functions.Function2) new androidx.compose.animation.core.TransitionKt$rememberTransition$1$1(transitionState, null);
                composer.updateRememberedValue(rememberedValue2);
            }
            androidx.compose.runtime.EffectsKt.LaunchedEffect(currentState, targetState, (kotlin.jvm.functions.Function2) rememberedValue2, composer, 0);
            composer.endReplaceGroup();
        } else {
            composer.startReplaceGroup(-1357145920);
            transition2.animateTo$animation_core(transitionState.getTargetState(), composer, 0);
            composer.endReplaceGroup();
        }
        boolean changed = composer.changed(transition2);
        java.lang.Object rememberedValue3 = composer.rememberedValue();
        if (changed || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue3 = new kotlin.jvm.functions.Function1() { // from class: androidx.compose.animation.core.TransitionKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    androidx.compose.runtime.DisposableEffectResult Camera2StreamConfigurationMap2;
                    Camera2StreamConfigurationMap2 = androidx.compose.animation.core.TransitionKt.Camera2StreamConfigurationMap(androidx.compose.animation.core.Transition.this);
                    return Camera2StreamConfigurationMap2;
                }
            };
            composer.updateRememberedValue(rememberedValue3);
        }
        androidx.compose.runtime.EffectsKt.DisposableEffect(transition2, (kotlin.jvm.functions.Function1<? super androidx.compose.runtime.DisposableEffectScope, ? extends androidx.compose.runtime.DisposableEffectResult>) rememberedValue3, composer, 0);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return transition2;
    }

    @kotlin.Deprecated(message = "Use rememberTransition() instead", replaceWith = @kotlin.ReplaceWith(expression = "rememberTransition(transitionState, label)", imports = {}))
    public static final <T> androidx.compose.animation.core.Transition<T> updateTransition(androidx.compose.animation.core.MutableTransitionState<T> mutableTransitionState, java.lang.String str, androidx.compose.runtime.Composer composer, int i, int i2) {
        if ((i2 & 2) != 0) {
            str = null;
        }
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(882913843, i, -1, "androidx.compose.animation.core.updateTransition (Transition.kt:863)");
        }
        androidx.compose.animation.core.Transition<T> rememberTransition = rememberTransition(mutableTransitionState, str, composer, i & 126, 0);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return rememberTransition;
    }

    public static final <S, T, V extends androidx.compose.animation.core.AnimationVector> androidx.compose.animation.core.Transition<S>.DeferredAnimation<T, V> createDeferredAnimation(final androidx.compose.animation.core.Transition<S> transition, androidx.compose.animation.core.TwoWayConverter<T, V> twoWayConverter, java.lang.String str, androidx.compose.runtime.Composer composer, int i, int i2) {
        if ((i2 & 2) != 0) {
            str = "DeferredAnimation";
        }
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-1714122528, i, -1, "androidx.compose.animation.core.createDeferredAnimation (Transition.kt:1738)");
        }
        int i3 = (i & 14) ^ 6;
        boolean z = true;
        boolean z2 = (i3 > 4 && composer.changed(transition)) || (i & 6) == 4;
        java.lang.Object rememberedValue = composer.rememberedValue();
        if (z2 || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue = transition.new DeferredAnimation(twoWayConverter, str);
            composer.updateRememberedValue(rememberedValue);
        }
        final androidx.compose.animation.core.Transition<S>.DeferredAnimation<T, V> deferredAnimation = (androidx.compose.animation.core.Transition.DeferredAnimation) rememberedValue;
        if ((i3 <= 4 || !composer.changed(transition)) && (i & 6) != 4) {
            z = false;
        }
        boolean changedInstance = composer.changedInstance(deferredAnimation);
        java.lang.Object rememberedValue2 = composer.rememberedValue();
        if ((changedInstance | z) || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue2 = new kotlin.jvm.functions.Function1() { // from class: androidx.compose.animation.core.TransitionKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    androidx.compose.runtime.DisposableEffectResult highResolutionOutputSizeshNQ4ISI;
                    highResolutionOutputSizeshNQ4ISI = androidx.compose.animation.core.TransitionKt.getHighResolutionOutputSizeshNQ4ISI(androidx.compose.animation.core.Transition.this, deferredAnimation);
                    return highResolutionOutputSizeshNQ4ISI;
                }
            };
            composer.updateRememberedValue(rememberedValue2);
        }
        androidx.compose.runtime.EffectsKt.DisposableEffect(deferredAnimation, (kotlin.jvm.functions.Function1<? super androidx.compose.runtime.DisposableEffectScope, ? extends androidx.compose.runtime.DisposableEffectResult>) rememberedValue2, composer, 0);
        if (transition.isSeeking()) {
            deferredAnimation.setupSeeking$animation_core();
        }
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return deferredAnimation;
    }

    public static final <S, T> androidx.compose.animation.core.Transition<T> createChildTransition(androidx.compose.animation.core.Transition<S> transition, java.lang.String str, kotlin.jvm.functions.Function3<? super S, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, ? extends T> function3, androidx.compose.runtime.Composer composer, int i, int i2) {
        boolean z = true;
        if ((i2 & 1) != 0) {
            str = "ChildTransition";
        }
        java.lang.String str2 = str;
        int i3 = i & 14;
        if (((i3 ^ 6) <= 4 || !composer.changed(transition)) && (i & 6) != 4) {
            z = false;
        }
        java.lang.Object rememberedValue = composer.rememberedValue();
        if (z || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue = transition.getCurrentState();
            composer.updateRememberedValue(rememberedValue);
        }
        if (transition.isSeeking()) {
            rememberedValue = transition.getCurrentState();
        }
        int i4 = (i >> 3) & 112;
        return createChildTransitionInternal(transition, function3.invoke(rememberedValue, composer, java.lang.Integer.valueOf(i4)), function3.invoke(transition.getTargetState(), composer, java.lang.Integer.valueOf(i4)), str2, composer, i3 | ((i << 6) & 7168));
    }

    public static final <S, T> androidx.compose.animation.core.Transition<T> createChildTransitionInternal(final androidx.compose.animation.core.Transition<S> transition, T t, T t2, java.lang.String str, androidx.compose.runtime.Composer composer, int i) {
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-198307638, i, -1, "androidx.compose.animation.core.createChildTransitionInternal (Transition.kt:1780)");
        }
        int i2 = (i & 14) ^ 6;
        boolean z = true;
        boolean z2 = (i2 > 4 && composer.changed(transition)) || (i & 6) == 4;
        java.lang.Object rememberedValue = composer.rememberedValue();
        if (z2 || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            androidx.compose.animation.core.MutableTransitionState mutableTransitionState = new androidx.compose.animation.core.MutableTransitionState(t);
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(transition.getGetHighSpeedVideoFpsRanges());
            sb.append(" > ");
            sb.append(str);
            rememberedValue = new androidx.compose.animation.core.Transition(mutableTransitionState, transition, sb.toString());
            composer.updateRememberedValue(rememberedValue);
        }
        final androidx.compose.animation.core.Transition<T> transition2 = (androidx.compose.animation.core.Transition) rememberedValue;
        if ((i2 <= 4 || !composer.changed(transition)) && (i & 6) != 4) {
            z = false;
        }
        boolean changed = composer.changed(transition2);
        java.lang.Object rememberedValue2 = composer.rememberedValue();
        if ((changed | z) || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue2 = new kotlin.jvm.functions.Function1() { // from class: androidx.compose.animation.core.TransitionKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    androidx.compose.runtime.DisposableEffectResult highResolutionOutputSizeshNQ4ISI;
                    highResolutionOutputSizeshNQ4ISI = androidx.compose.animation.core.TransitionKt.getHighResolutionOutputSizeshNQ4ISI(androidx.compose.animation.core.Transition.this, transition2);
                    return highResolutionOutputSizeshNQ4ISI;
                }
            };
            composer.updateRememberedValue(rememberedValue2);
        }
        androidx.compose.runtime.EffectsKt.DisposableEffect(transition2, (kotlin.jvm.functions.Function1<? super androidx.compose.runtime.DisposableEffectScope, ? extends androidx.compose.runtime.DisposableEffectResult>) rememberedValue2, composer, 0);
        if (transition.isSeeking()) {
            transition2.seek(t, t2, transition.getGetHighSpeedVideoSizesFor());
        } else {
            transition2.updateTarget$animation_core(t2);
            transition2.setSeeking$animation_core(false);
        }
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return transition2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.runtime.DisposableEffectResult getHighResolutionOutputSizeshNQ4ISI(final androidx.compose.animation.core.Transition transition, final androidx.compose.animation.core.Transition transition2) {
        transition.addTransition$animation_core(transition2);
        return new androidx.compose.runtime.DisposableEffectResult() { // from class: androidx.compose.animation.core.TransitionKt$createChildTransitionInternal$lambda$1$0$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public final void dispose() {
                androidx.compose.animation.core.Transition.this.removeTransition$animation_core(transition2);
            }
        };
    }

    public static final <S, T, V extends androidx.compose.animation.core.AnimationVector> androidx.compose.runtime.State<T> animateValue(androidx.compose.animation.core.Transition<S> transition, androidx.compose.animation.core.TwoWayConverter<T, V> twoWayConverter, kotlin.jvm.functions.Function3<? super androidx.compose.animation.core.Transition.Segment<S>, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, ? extends androidx.compose.animation.core.FiniteAnimationSpec<T>> function3, java.lang.String str, kotlin.jvm.functions.Function3<? super S, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, ? extends T> function32, androidx.compose.runtime.Composer composer, int i, int i2) {
        java.lang.Object currentState;
        androidx.compose.animation.core.TransitionKt$animateValue$1 transitionKt$animateValue$1 = (i2 & 2) != 0 ? new kotlin.jvm.functions.Function3<androidx.compose.animation.core.Transition.Segment<S>, androidx.compose.runtime.Composer, java.lang.Integer, androidx.compose.animation.core.SpringSpec<T>>() { // from class: androidx.compose.animation.core.TransitionKt$animateValue$1
            @Override // kotlin.jvm.functions.Function3
            public final /* synthetic */ java.lang.Object invoke(java.lang.Object obj, androidx.compose.runtime.Composer composer2, java.lang.Integer num) {
                return invoke((androidx.compose.animation.core.Transition.Segment) obj, composer2, num.intValue());
            }

            public final androidx.compose.animation.core.SpringSpec<T> invoke(androidx.compose.animation.core.Transition.Segment<S> segment, androidx.compose.runtime.Composer composer2, int i3) {
                composer2.startReplaceGroup(-2137771706);
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(-2137771706, i3, -1, "androidx.compose.animation.core.animateValue.<anonymous> (Transition.kt:1834)");
                }
                androidx.compose.animation.core.SpringSpec<T> spring$default = androidx.compose.animation.core.AnimationSpecKt.spring$default(0.0f, 0.0f, null, 7, null);
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
                composer2.endReplaceGroup();
                return spring$default;
            }
        } : function3;
        java.lang.String str2 = (i2 & 4) != 0 ? "ValueAnimation" : str;
        if (!transition.isSeeking()) {
            composer.startReplaceGroup(1666573488);
            boolean z = (((i & 14) ^ 6) > 4 && composer.changed(transition)) || (i & 6) == 4;
            currentState = composer.rememberedValue();
            if (z || currentState == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                androidx.compose.runtime.snapshots.Snapshot.Companion companion = androidx.compose.runtime.snapshots.Snapshot.INSTANCE;
                androidx.compose.runtime.snapshots.Snapshot currentThreadSnapshot = companion.getCurrentThreadSnapshot();
                kotlin.jvm.functions.Function1<java.lang.Object, kotlin.Unit> readObserver = currentThreadSnapshot != null ? currentThreadSnapshot.getReadObserver() : null;
                androidx.compose.runtime.snapshots.Snapshot makeCurrentNonObservable = companion.makeCurrentNonObservable(currentThreadSnapshot);
                try {
                    S currentState2 = transition.getCurrentState();
                    companion.restoreNonObservable(currentThreadSnapshot, makeCurrentNonObservable, readObserver);
                    composer.updateRememberedValue(currentState2);
                    currentState = currentState2;
                } catch (java.lang.Throwable th) {
                    companion.restoreNonObservable(currentThreadSnapshot, makeCurrentNonObservable, readObserver);
                    throw th;
                }
            }
            composer.endReplaceGroup();
        } else {
            composer.startReplaceGroup(1666827533);
            composer.endReplaceGroup();
            currentState = transition.getCurrentState();
        }
        int i3 = (i >> 9) & 112;
        T invoke = function32.invoke(currentState, composer, java.lang.Integer.valueOf(i3));
        int i4 = i & 14;
        int i5 = i4 ^ 6;
        boolean z2 = (i5 > 4 && composer.changed(transition)) || (i & 6) == 4;
        java.lang.Object rememberedValue = composer.rememberedValue();
        if (z2 || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue = androidx.compose.runtime.SnapshotStateKt.derivedStateOf(new androidx.compose.animation.core.TransitionKt$animateValue$targetValue$1$1(transition));
            composer.updateRememberedValue(rememberedValue);
        }
        T invoke2 = function32.invoke((java.lang.Object) ((androidx.compose.runtime.State) rememberedValue).getValue(), composer, java.lang.Integer.valueOf(i3));
        boolean z3 = (i5 > 4 && composer.changed(transition)) || (i & 6) == 4;
        java.lang.Object rememberedValue2 = composer.rememberedValue();
        if (z3 || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue2 = androidx.compose.runtime.SnapshotStateKt.derivedStateOf(new androidx.compose.animation.core.TransitionKt$animateValue$animationSpec$1$1(transition));
            composer.updateRememberedValue(rememberedValue2);
        }
        return createTransitionAnimation(transition, invoke, invoke2, transitionKt$animateValue$1.invoke((java.lang.Object) ((androidx.compose.runtime.State) rememberedValue2).getValue(), composer, java.lang.Integer.valueOf((i >> 3) & 112)), twoWayConverter, str2, composer, (57344 & (i << 9)) | i4 | (458752 & (i << 6)));
    }

    public static final <S, T, V extends androidx.compose.animation.core.AnimationVector> androidx.compose.runtime.State<T> createTransitionAnimation(final androidx.compose.animation.core.Transition<S> transition, T t, T t2, androidx.compose.animation.core.FiniteAnimationSpec<T> finiteAnimationSpec, androidx.compose.animation.core.TwoWayConverter<T, V> twoWayConverter, java.lang.String str, androidx.compose.runtime.Composer composer, int i) {
        androidx.compose.runtime.snapshots.Snapshot snapshot;
        kotlin.jvm.functions.Function1<java.lang.Object, kotlin.Unit> function1;
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-304821198, i, -1, "androidx.compose.animation.core.createTransitionAnimation (Transition.kt:1869)");
        }
        int i2 = i & 14;
        int i3 = i2 ^ 6;
        boolean z = (i3 > 4 && composer.changed(transition)) || (i & 6) == 4;
        java.lang.Object rememberedValue = composer.rememberedValue();
        if (z || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            androidx.compose.runtime.snapshots.Snapshot.Companion companion = androidx.compose.runtime.snapshots.Snapshot.INSTANCE;
            androidx.compose.runtime.snapshots.Snapshot currentThreadSnapshot = companion.getCurrentThreadSnapshot();
            kotlin.jvm.functions.Function1<java.lang.Object, kotlin.Unit> readObserver = currentThreadSnapshot != null ? currentThreadSnapshot.getReadObserver() : null;
            androidx.compose.runtime.snapshots.Snapshot makeCurrentNonObservable = companion.makeCurrentNonObservable(currentThreadSnapshot);
            try {
                snapshot = makeCurrentNonObservable;
                function1 = readObserver;
                try {
                    java.lang.Object transitionAnimationState = transition.new TransitionAnimationState(t, androidx.compose.animation.core.AnimationStateKt.createZeroVectorFrom(twoWayConverter, t2), twoWayConverter, str);
                    companion.restoreNonObservable(currentThreadSnapshot, snapshot, function1);
                    composer.updateRememberedValue(transitionAnimationState);
                    rememberedValue = transitionAnimationState;
                } catch (java.lang.Throwable th) {
                    th = th;
                    companion.restoreNonObservable(currentThreadSnapshot, snapshot, function1);
                    throw th;
                }
            } catch (java.lang.Throwable th2) {
                th = th2;
                snapshot = makeCurrentNonObservable;
                function1 = readObserver;
            }
        }
        final androidx.compose.animation.core.Transition.TransitionAnimationState transitionAnimationState2 = (androidx.compose.animation.core.Transition.TransitionAnimationState) rememberedValue;
        int i4 = (i >> 3) & 8;
        int i5 = i << 3;
        getHighResolutionOutputSizeshNQ4ISI(transition, transitionAnimationState2, t, t2, finiteAnimationSpec, composer, (i4 << 6) | i2 | (i5 & 896) | (i4 << 9) | (i5 & 7168) | (i5 & 57344));
        boolean z2 = (i3 > 4 && composer.changed(transition)) || (i & 6) == 4;
        boolean changed = composer.changed(transitionAnimationState2);
        java.lang.Object rememberedValue2 = composer.rememberedValue();
        if ((changed | z2) || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue2 = new kotlin.jvm.functions.Function1() { // from class: androidx.compose.animation.core.TransitionKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    androidx.compose.runtime.DisposableEffectResult highSpeedVideoFpsRanges;
                    highSpeedVideoFpsRanges = androidx.compose.animation.core.TransitionKt.getHighSpeedVideoFpsRanges(androidx.compose.animation.core.Transition.this, transitionAnimationState2);
                    return highSpeedVideoFpsRanges;
                }
            };
            composer.updateRememberedValue(rememberedValue2);
        }
        androidx.compose.runtime.EffectsKt.DisposableEffect(transitionAnimationState2, (kotlin.jvm.functions.Function1<? super androidx.compose.runtime.DisposableEffectScope, ? extends androidx.compose.runtime.DisposableEffectResult>) rememberedValue2, composer, 0);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return transitionAnimationState2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.runtime.DisposableEffectResult getHighSpeedVideoFpsRanges(final androidx.compose.animation.core.Transition transition, final androidx.compose.animation.core.Transition.TransitionAnimationState transitionAnimationState) {
        transition.addAnimation$animation_core(transitionAnimationState);
        return new androidx.compose.runtime.DisposableEffectResult() { // from class: androidx.compose.animation.core.TransitionKt$createTransitionAnimation$lambda$1$0$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public final void dispose() {
                androidx.compose.animation.core.Transition.this.removeAnimation$animation_core(transitionAnimationState);
            }
        };
    }

    private static final <S, T, V extends androidx.compose.animation.core.AnimationVector> void getHighResolutionOutputSizeshNQ4ISI(final androidx.compose.animation.core.Transition<S> transition, final androidx.compose.animation.core.Transition<S>.TransitionAnimationState<T, V> transitionAnimationState, final T t, final T t2, final androidx.compose.animation.core.FiniteAnimationSpec<T> finiteAnimationSpec, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(867041821);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(transition) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changed(transitionAnimationState) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= (i & 512) == 0 ? startRestartGroup.changed(t) : startRestartGroup.changedInstance(t) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= (i & 4096) == 0 ? startRestartGroup.changed(t2) : startRestartGroup.changedInstance(t2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= (32768 & i) == 0 ? startRestartGroup.changed(finiteAnimationSpec) : startRestartGroup.changedInstance(finiteAnimationSpec) ? 16384 : 8192;
        }
        if (!startRestartGroup.shouldExecute((i2 & 9363) != 9362, i2 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(867041821, i2, -1, "androidx.compose.animation.core.UpdateInitialAndTargetValues (Transition.kt:1907)");
            }
            if (transition.isSeeking()) {
                transitionAnimationState.updateInitialAndTargetValue$animation_core(t, t2, finiteAnimationSpec);
            } else {
                transitionAnimationState.updateTargetValue$animation_core(t2, finiteAnimationSpec);
            }
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: androidx.compose.animation.core.TransitionKt$$ExternalSyntheticLambda8
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    kotlin.Unit highSpeedVideoFpsRanges;
                    ((java.lang.Integer) obj2).intValue();
                    highSpeedVideoFpsRanges = androidx.compose.animation.core.TransitionKt.getHighSpeedVideoFpsRanges(androidx.compose.animation.core.Transition.this, transitionAnimationState, t, t2, finiteAnimationSpec, i, (androidx.compose.runtime.Composer) obj);
                    return highSpeedVideoFpsRanges;
                }
            });
        }
    }

    public static final <S> androidx.compose.runtime.State<java.lang.Float> animateFloat(androidx.compose.animation.core.Transition<S> transition, kotlin.jvm.functions.Function3<? super androidx.compose.animation.core.Transition.Segment<S>, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, ? extends androidx.compose.animation.core.FiniteAnimationSpec<java.lang.Float>> function3, java.lang.String str, kotlin.jvm.functions.Function3<? super S, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, java.lang.Float> function32, androidx.compose.runtime.Composer composer, int i, int i2) {
        java.lang.Object currentState;
        if ((i2 & 1) != 0) {
            function3 = new kotlin.jvm.functions.Function3<androidx.compose.animation.core.Transition.Segment<S>, androidx.compose.runtime.Composer, java.lang.Integer, androidx.compose.animation.core.SpringSpec<java.lang.Float>>() { // from class: androidx.compose.animation.core.TransitionKt$animateFloat$1
                @Override // kotlin.jvm.functions.Function3
                public final /* synthetic */ androidx.compose.animation.core.SpringSpec<java.lang.Float> invoke(java.lang.Object obj, androidx.compose.runtime.Composer composer2, java.lang.Integer num) {
                    return invoke((androidx.compose.animation.core.Transition.Segment) obj, composer2, num.intValue());
                }

                public final androidx.compose.animation.core.SpringSpec<java.lang.Float> invoke(androidx.compose.animation.core.Transition.Segment<S> segment, androidx.compose.runtime.Composer composer2, int i3) {
                    composer2.startReplaceGroup(-985243360);
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventStart(-985243360, i3, -1, "androidx.compose.animation.core.animateFloat.<anonymous> (Transition.kt:1947)");
                    }
                    androidx.compose.animation.core.SpringSpec<java.lang.Float> spring$default = androidx.compose.animation.core.AnimationSpecKt.spring$default(0.0f, 0.0f, null, 7, null);
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventEnd();
                    }
                    composer2.endReplaceGroup();
                    return spring$default;
                }
            };
        }
        if ((i2 & 2) != 0) {
            str = "FloatAnimation";
        }
        java.lang.String str2 = str;
        androidx.compose.animation.core.TwoWayConverter<java.lang.Float, androidx.compose.animation.core.AnimationVector1D> vectorConverter = androidx.compose.animation.core.VectorConvertersKt.getVectorConverter(kotlin.jvm.internal.FloatCompanionObject.INSTANCE);
        int i3 = i << 3;
        int i4 = (i3 & 57344) | (i & 14) | (i3 & 896) | (i3 & 7168);
        if (!transition.isSeeking()) {
            composer.startReplaceGroup(1666573488);
            boolean z = (((i4 & 14) ^ 6) > 4 && composer.changed(transition)) || (i4 & 6) == 4;
            currentState = composer.rememberedValue();
            if (z || currentState == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                androidx.compose.runtime.snapshots.Snapshot.Companion companion = androidx.compose.runtime.snapshots.Snapshot.INSTANCE;
                androidx.compose.runtime.snapshots.Snapshot currentThreadSnapshot = companion.getCurrentThreadSnapshot();
                kotlin.jvm.functions.Function1<java.lang.Object, kotlin.Unit> readObserver = currentThreadSnapshot != null ? currentThreadSnapshot.getReadObserver() : null;
                androidx.compose.runtime.snapshots.Snapshot makeCurrentNonObservable = companion.makeCurrentNonObservable(currentThreadSnapshot);
                try {
                    S currentState2 = transition.getCurrentState();
                    companion.restoreNonObservable(currentThreadSnapshot, makeCurrentNonObservable, readObserver);
                    composer.updateRememberedValue(currentState2);
                    currentState = currentState2;
                } catch (java.lang.Throwable th) {
                    companion.restoreNonObservable(currentThreadSnapshot, makeCurrentNonObservable, readObserver);
                    throw th;
                }
            }
            composer.endReplaceGroup();
        } else {
            composer.startReplaceGroup(1666827533);
            composer.endReplaceGroup();
            currentState = transition.getCurrentState();
        }
        int i5 = (i4 >> 9) & 112;
        java.lang.Float invoke = function32.invoke(currentState, composer, java.lang.Integer.valueOf(i5));
        int i6 = i4 & 14;
        int i7 = i6 ^ 6;
        boolean z2 = (i7 > 4 && composer.changed(transition)) || (i4 & 6) == 4;
        java.lang.Object rememberedValue = composer.rememberedValue();
        if (z2 || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue = androidx.compose.runtime.SnapshotStateKt.derivedStateOf(new androidx.compose.animation.core.TransitionKt$animateValue$targetValue$1$1(transition));
            composer.updateRememberedValue(rememberedValue);
        }
        java.lang.Float invoke2 = function32.invoke((java.lang.Object) ((androidx.compose.runtime.State) rememberedValue).getValue(), composer, java.lang.Integer.valueOf(i5));
        boolean z3 = (i7 > 4 && composer.changed(transition)) || (i4 & 6) == 4;
        java.lang.Object rememberedValue2 = composer.rememberedValue();
        if (z3 || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue2 = androidx.compose.runtime.SnapshotStateKt.derivedStateOf(new androidx.compose.animation.core.TransitionKt$animateValue$animationSpec$1$1(transition));
            composer.updateRememberedValue(rememberedValue2);
        }
        return createTransitionAnimation(transition, invoke, invoke2, function3.invoke((java.lang.Object) ((androidx.compose.runtime.State) rememberedValue2).getValue(), composer, java.lang.Integer.valueOf((i4 >> 3) & 112)), vectorConverter, str2, composer, i6 | ((i4 << 6) & 458752));
    }

    public static final <S> androidx.compose.runtime.State<androidx.compose.ui.unit.Dp> animateDp(androidx.compose.animation.core.Transition<S> transition, kotlin.jvm.functions.Function3<? super androidx.compose.animation.core.Transition.Segment<S>, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, ? extends androidx.compose.animation.core.FiniteAnimationSpec<androidx.compose.ui.unit.Dp>> function3, java.lang.String str, kotlin.jvm.functions.Function3<? super S, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, androidx.compose.ui.unit.Dp> function32, androidx.compose.runtime.Composer composer, int i, int i2) {
        java.lang.Object currentState;
        if ((i2 & 1) != 0) {
            function3 = new kotlin.jvm.functions.Function3<androidx.compose.animation.core.Transition.Segment<S>, androidx.compose.runtime.Composer, java.lang.Integer, androidx.compose.animation.core.SpringSpec<androidx.compose.ui.unit.Dp>>() { // from class: androidx.compose.animation.core.TransitionKt$animateDp$1
                @Override // kotlin.jvm.functions.Function3
                public final /* synthetic */ androidx.compose.animation.core.SpringSpec<androidx.compose.ui.unit.Dp> invoke(java.lang.Object obj, androidx.compose.runtime.Composer composer2, java.lang.Integer num) {
                    return invoke((androidx.compose.animation.core.Transition.Segment) obj, composer2, num.intValue());
                }

                public final androidx.compose.animation.core.SpringSpec<androidx.compose.ui.unit.Dp> invoke(androidx.compose.animation.core.Transition.Segment<S> segment, androidx.compose.runtime.Composer composer2, int i3) {
                    composer2.startReplaceGroup(-1953972046);
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventStart(-1953972046, i3, -1, "androidx.compose.animation.core.animateDp.<anonymous> (Transition.kt:1977)");
                    }
                    androidx.compose.animation.core.SpringSpec<androidx.compose.ui.unit.Dp> spring$default = androidx.compose.animation.core.AnimationSpecKt.spring$default(0.0f, 0.0f, androidx.compose.ui.unit.Dp.m8599boximpl(androidx.compose.animation.core.VisibilityThresholdsKt.getVisibilityThreshold(androidx.compose.ui.unit.Dp.INSTANCE)), 3, null);
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventEnd();
                    }
                    composer2.endReplaceGroup();
                    return spring$default;
                }
            };
        }
        if ((i2 & 2) != 0) {
            str = "DpAnimation";
        }
        java.lang.String str2 = str;
        androidx.compose.animation.core.TwoWayConverter<androidx.compose.ui.unit.Dp, androidx.compose.animation.core.AnimationVector1D> vectorConverter = androidx.compose.animation.core.VectorConvertersKt.getVectorConverter(androidx.compose.ui.unit.Dp.INSTANCE);
        int i3 = i << 3;
        int i4 = (i3 & 57344) | (i & 14) | (i3 & 896) | (i3 & 7168);
        if (!transition.isSeeking()) {
            composer.startReplaceGroup(1666573488);
            boolean z = (((i4 & 14) ^ 6) > 4 && composer.changed(transition)) || (i4 & 6) == 4;
            currentState = composer.rememberedValue();
            if (z || currentState == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                androidx.compose.runtime.snapshots.Snapshot.Companion companion = androidx.compose.runtime.snapshots.Snapshot.INSTANCE;
                androidx.compose.runtime.snapshots.Snapshot currentThreadSnapshot = companion.getCurrentThreadSnapshot();
                kotlin.jvm.functions.Function1<java.lang.Object, kotlin.Unit> readObserver = currentThreadSnapshot != null ? currentThreadSnapshot.getReadObserver() : null;
                androidx.compose.runtime.snapshots.Snapshot makeCurrentNonObservable = companion.makeCurrentNonObservable(currentThreadSnapshot);
                try {
                    S currentState2 = transition.getCurrentState();
                    companion.restoreNonObservable(currentThreadSnapshot, makeCurrentNonObservable, readObserver);
                    composer.updateRememberedValue(currentState2);
                    currentState = currentState2;
                } catch (java.lang.Throwable th) {
                    companion.restoreNonObservable(currentThreadSnapshot, makeCurrentNonObservable, readObserver);
                    throw th;
                }
            }
            composer.endReplaceGroup();
        } else {
            composer.startReplaceGroup(1666827533);
            composer.endReplaceGroup();
            currentState = transition.getCurrentState();
        }
        int i5 = (i4 >> 9) & 112;
        androidx.compose.ui.unit.Dp invoke = function32.invoke(currentState, composer, java.lang.Integer.valueOf(i5));
        int i6 = i4 & 14;
        int i7 = i6 ^ 6;
        boolean z2 = (i7 > 4 && composer.changed(transition)) || (i4 & 6) == 4;
        java.lang.Object rememberedValue = composer.rememberedValue();
        if (z2 || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue = androidx.compose.runtime.SnapshotStateKt.derivedStateOf(new androidx.compose.animation.core.TransitionKt$animateValue$targetValue$1$1(transition));
            composer.updateRememberedValue(rememberedValue);
        }
        androidx.compose.ui.unit.Dp invoke2 = function32.invoke((java.lang.Object) ((androidx.compose.runtime.State) rememberedValue).getValue(), composer, java.lang.Integer.valueOf(i5));
        boolean z3 = (i7 > 4 && composer.changed(transition)) || (i4 & 6) == 4;
        java.lang.Object rememberedValue2 = composer.rememberedValue();
        if (z3 || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue2 = androidx.compose.runtime.SnapshotStateKt.derivedStateOf(new androidx.compose.animation.core.TransitionKt$animateValue$animationSpec$1$1(transition));
            composer.updateRememberedValue(rememberedValue2);
        }
        return createTransitionAnimation(transition, invoke, invoke2, function3.invoke((java.lang.Object) ((androidx.compose.runtime.State) rememberedValue2).getValue(), composer, java.lang.Integer.valueOf((i4 >> 3) & 112)), vectorConverter, str2, composer, i6 | ((i4 << 6) & 458752));
    }

    public static final <S> androidx.compose.runtime.State<androidx.compose.ui.geometry.Offset> animateOffset(androidx.compose.animation.core.Transition<S> transition, kotlin.jvm.functions.Function3<? super androidx.compose.animation.core.Transition.Segment<S>, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, ? extends androidx.compose.animation.core.FiniteAnimationSpec<androidx.compose.ui.geometry.Offset>> function3, java.lang.String str, kotlin.jvm.functions.Function3<? super S, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, androidx.compose.ui.geometry.Offset> function32, androidx.compose.runtime.Composer composer, int i, int i2) {
        java.lang.Object currentState;
        if ((i2 & 1) != 0) {
            function3 = new kotlin.jvm.functions.Function3<androidx.compose.animation.core.Transition.Segment<S>, androidx.compose.runtime.Composer, java.lang.Integer, androidx.compose.animation.core.SpringSpec<androidx.compose.ui.geometry.Offset>>() { // from class: androidx.compose.animation.core.TransitionKt$animateOffset$1
                @Override // kotlin.jvm.functions.Function3
                public final /* synthetic */ androidx.compose.animation.core.SpringSpec<androidx.compose.ui.geometry.Offset> invoke(java.lang.Object obj, androidx.compose.runtime.Composer composer2, java.lang.Integer num) {
                    return invoke((androidx.compose.animation.core.Transition.Segment) obj, composer2, num.intValue());
                }

                public final androidx.compose.animation.core.SpringSpec<androidx.compose.ui.geometry.Offset> invoke(androidx.compose.animation.core.Transition.Segment<S> segment, androidx.compose.runtime.Composer composer2, int i3) {
                    composer2.startReplaceGroup(-1662821959);
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventStart(-1662821959, i3, -1, "androidx.compose.animation.core.animateOffset.<anonymous> (Transition.kt:2007)");
                    }
                    androidx.compose.animation.core.SpringSpec<androidx.compose.ui.geometry.Offset> spring$default = androidx.compose.animation.core.AnimationSpecKt.spring$default(0.0f, 0.0f, androidx.compose.ui.geometry.Offset.m5741boximpl(androidx.compose.animation.core.VisibilityThresholdsKt.getVisibilityThreshold(androidx.compose.ui.geometry.Offset.INSTANCE)), 3, null);
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventEnd();
                    }
                    composer2.endReplaceGroup();
                    return spring$default;
                }
            };
        }
        if ((i2 & 2) != 0) {
            str = "OffsetAnimation";
        }
        java.lang.String str2 = str;
        androidx.compose.animation.core.TwoWayConverter<androidx.compose.ui.geometry.Offset, androidx.compose.animation.core.AnimationVector2D> vectorConverter = androidx.compose.animation.core.VectorConvertersKt.getVectorConverter(androidx.compose.ui.geometry.Offset.INSTANCE);
        int i3 = i << 3;
        int i4 = (i3 & 57344) | (i & 14) | (i3 & 896) | (i3 & 7168);
        if (!transition.isSeeking()) {
            composer.startReplaceGroup(1666573488);
            boolean z = (((i4 & 14) ^ 6) > 4 && composer.changed(transition)) || (i4 & 6) == 4;
            currentState = composer.rememberedValue();
            if (z || currentState == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                androidx.compose.runtime.snapshots.Snapshot.Companion companion = androidx.compose.runtime.snapshots.Snapshot.INSTANCE;
                androidx.compose.runtime.snapshots.Snapshot currentThreadSnapshot = companion.getCurrentThreadSnapshot();
                kotlin.jvm.functions.Function1<java.lang.Object, kotlin.Unit> readObserver = currentThreadSnapshot != null ? currentThreadSnapshot.getReadObserver() : null;
                androidx.compose.runtime.snapshots.Snapshot makeCurrentNonObservable = companion.makeCurrentNonObservable(currentThreadSnapshot);
                try {
                    S currentState2 = transition.getCurrentState();
                    companion.restoreNonObservable(currentThreadSnapshot, makeCurrentNonObservable, readObserver);
                    composer.updateRememberedValue(currentState2);
                    currentState = currentState2;
                } catch (java.lang.Throwable th) {
                    companion.restoreNonObservable(currentThreadSnapshot, makeCurrentNonObservable, readObserver);
                    throw th;
                }
            }
            composer.endReplaceGroup();
        } else {
            composer.startReplaceGroup(1666827533);
            composer.endReplaceGroup();
            currentState = transition.getCurrentState();
        }
        int i5 = (i4 >> 9) & 112;
        androidx.compose.ui.geometry.Offset invoke = function32.invoke(currentState, composer, java.lang.Integer.valueOf(i5));
        int i6 = i4 & 14;
        int i7 = i6 ^ 6;
        boolean z2 = (i7 > 4 && composer.changed(transition)) || (i4 & 6) == 4;
        java.lang.Object rememberedValue = composer.rememberedValue();
        if (z2 || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue = androidx.compose.runtime.SnapshotStateKt.derivedStateOf(new androidx.compose.animation.core.TransitionKt$animateValue$targetValue$1$1(transition));
            composer.updateRememberedValue(rememberedValue);
        }
        androidx.compose.ui.geometry.Offset invoke2 = function32.invoke((java.lang.Object) ((androidx.compose.runtime.State) rememberedValue).getValue(), composer, java.lang.Integer.valueOf(i5));
        boolean z3 = (i7 > 4 && composer.changed(transition)) || (i4 & 6) == 4;
        java.lang.Object rememberedValue2 = composer.rememberedValue();
        if (z3 || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue2 = androidx.compose.runtime.SnapshotStateKt.derivedStateOf(new androidx.compose.animation.core.TransitionKt$animateValue$animationSpec$1$1(transition));
            composer.updateRememberedValue(rememberedValue2);
        }
        return createTransitionAnimation(transition, invoke, invoke2, function3.invoke((java.lang.Object) ((androidx.compose.runtime.State) rememberedValue2).getValue(), composer, java.lang.Integer.valueOf((i4 >> 3) & 112)), vectorConverter, str2, composer, i6 | ((i4 << 6) & 458752));
    }

    public static final <S> androidx.compose.runtime.State<androidx.compose.ui.geometry.Size> animateSize(androidx.compose.animation.core.Transition<S> transition, kotlin.jvm.functions.Function3<? super androidx.compose.animation.core.Transition.Segment<S>, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, ? extends androidx.compose.animation.core.FiniteAnimationSpec<androidx.compose.ui.geometry.Size>> function3, java.lang.String str, kotlin.jvm.functions.Function3<? super S, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, androidx.compose.ui.geometry.Size> function32, androidx.compose.runtime.Composer composer, int i, int i2) {
        java.lang.Object currentState;
        if ((i2 & 1) != 0) {
            function3 = new kotlin.jvm.functions.Function3<androidx.compose.animation.core.Transition.Segment<S>, androidx.compose.runtime.Composer, java.lang.Integer, androidx.compose.animation.core.SpringSpec<androidx.compose.ui.geometry.Size>>() { // from class: androidx.compose.animation.core.TransitionKt$animateSize$1
                @Override // kotlin.jvm.functions.Function3
                public final /* synthetic */ androidx.compose.animation.core.SpringSpec<androidx.compose.ui.geometry.Size> invoke(java.lang.Object obj, androidx.compose.runtime.Composer composer2, java.lang.Integer num) {
                    return invoke((androidx.compose.animation.core.Transition.Segment) obj, composer2, num.intValue());
                }

                public final androidx.compose.animation.core.SpringSpec<androidx.compose.ui.geometry.Size> invoke(androidx.compose.animation.core.Transition.Segment<S> segment, androidx.compose.runtime.Composer composer2, int i3) {
                    composer2.startReplaceGroup(493329511);
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventStart(493329511, i3, -1, "androidx.compose.animation.core.animateSize.<anonymous> (Transition.kt:2037)");
                    }
                    androidx.compose.animation.core.SpringSpec<androidx.compose.ui.geometry.Size> spring$default = androidx.compose.animation.core.AnimationSpecKt.spring$default(0.0f, 0.0f, androidx.compose.ui.geometry.Size.m5809boximpl(androidx.compose.animation.core.VisibilityThresholdsKt.getVisibilityThreshold(androidx.compose.ui.geometry.Size.INSTANCE)), 3, null);
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventEnd();
                    }
                    composer2.endReplaceGroup();
                    return spring$default;
                }
            };
        }
        if ((i2 & 2) != 0) {
            str = "SizeAnimation";
        }
        java.lang.String str2 = str;
        androidx.compose.animation.core.TwoWayConverter<androidx.compose.ui.geometry.Size, androidx.compose.animation.core.AnimationVector2D> vectorConverter = androidx.compose.animation.core.VectorConvertersKt.getVectorConverter(androidx.compose.ui.geometry.Size.INSTANCE);
        int i3 = i << 3;
        int i4 = (i3 & 57344) | (i & 14) | (i3 & 896) | (i3 & 7168);
        if (!transition.isSeeking()) {
            composer.startReplaceGroup(1666573488);
            boolean z = (((i4 & 14) ^ 6) > 4 && composer.changed(transition)) || (i4 & 6) == 4;
            currentState = composer.rememberedValue();
            if (z || currentState == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                androidx.compose.runtime.snapshots.Snapshot.Companion companion = androidx.compose.runtime.snapshots.Snapshot.INSTANCE;
                androidx.compose.runtime.snapshots.Snapshot currentThreadSnapshot = companion.getCurrentThreadSnapshot();
                kotlin.jvm.functions.Function1<java.lang.Object, kotlin.Unit> readObserver = currentThreadSnapshot != null ? currentThreadSnapshot.getReadObserver() : null;
                androidx.compose.runtime.snapshots.Snapshot makeCurrentNonObservable = companion.makeCurrentNonObservable(currentThreadSnapshot);
                try {
                    S currentState2 = transition.getCurrentState();
                    companion.restoreNonObservable(currentThreadSnapshot, makeCurrentNonObservable, readObserver);
                    composer.updateRememberedValue(currentState2);
                    currentState = currentState2;
                } catch (java.lang.Throwable th) {
                    companion.restoreNonObservable(currentThreadSnapshot, makeCurrentNonObservable, readObserver);
                    throw th;
                }
            }
            composer.endReplaceGroup();
        } else {
            composer.startReplaceGroup(1666827533);
            composer.endReplaceGroup();
            currentState = transition.getCurrentState();
        }
        int i5 = (i4 >> 9) & 112;
        androidx.compose.ui.geometry.Size invoke = function32.invoke(currentState, composer, java.lang.Integer.valueOf(i5));
        int i6 = i4 & 14;
        int i7 = i6 ^ 6;
        boolean z2 = (i7 > 4 && composer.changed(transition)) || (i4 & 6) == 4;
        java.lang.Object rememberedValue = composer.rememberedValue();
        if (z2 || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue = androidx.compose.runtime.SnapshotStateKt.derivedStateOf(new androidx.compose.animation.core.TransitionKt$animateValue$targetValue$1$1(transition));
            composer.updateRememberedValue(rememberedValue);
        }
        androidx.compose.ui.geometry.Size invoke2 = function32.invoke((java.lang.Object) ((androidx.compose.runtime.State) rememberedValue).getValue(), composer, java.lang.Integer.valueOf(i5));
        boolean z3 = (i7 > 4 && composer.changed(transition)) || (i4 & 6) == 4;
        java.lang.Object rememberedValue2 = composer.rememberedValue();
        if (z3 || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue2 = androidx.compose.runtime.SnapshotStateKt.derivedStateOf(new androidx.compose.animation.core.TransitionKt$animateValue$animationSpec$1$1(transition));
            composer.updateRememberedValue(rememberedValue2);
        }
        return createTransitionAnimation(transition, invoke, invoke2, function3.invoke((java.lang.Object) ((androidx.compose.runtime.State) rememberedValue2).getValue(), composer, java.lang.Integer.valueOf((i4 >> 3) & 112)), vectorConverter, str2, composer, i6 | ((i4 << 6) & 458752));
    }

    public static final <S> androidx.compose.runtime.State<androidx.compose.ui.unit.IntOffset> animateIntOffset(androidx.compose.animation.core.Transition<S> transition, kotlin.jvm.functions.Function3<? super androidx.compose.animation.core.Transition.Segment<S>, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, ? extends androidx.compose.animation.core.FiniteAnimationSpec<androidx.compose.ui.unit.IntOffset>> function3, java.lang.String str, kotlin.jvm.functions.Function3<? super S, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, androidx.compose.ui.unit.IntOffset> function32, androidx.compose.runtime.Composer composer, int i, int i2) {
        java.lang.Object currentState;
        if ((i2 & 1) != 0) {
            function3 = new kotlin.jvm.functions.Function3<androidx.compose.animation.core.Transition.Segment<S>, androidx.compose.runtime.Composer, java.lang.Integer, androidx.compose.animation.core.SpringSpec<androidx.compose.ui.unit.IntOffset>>() { // from class: androidx.compose.animation.core.TransitionKt$animateIntOffset$1
                @Override // kotlin.jvm.functions.Function3
                public final /* synthetic */ androidx.compose.animation.core.SpringSpec<androidx.compose.ui.unit.IntOffset> invoke(java.lang.Object obj, androidx.compose.runtime.Composer composer2, java.lang.Integer num) {
                    return invoke((androidx.compose.animation.core.Transition.Segment) obj, composer2, num.intValue());
                }

                public final androidx.compose.animation.core.SpringSpec<androidx.compose.ui.unit.IntOffset> invoke(androidx.compose.animation.core.Transition.Segment<S> segment, androidx.compose.runtime.Composer composer2, int i3) {
                    composer2.startReplaceGroup(-428458074);
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventStart(-428458074, i3, -1, "androidx.compose.animation.core.animateIntOffset.<anonymous> (Transition.kt:2070)");
                    }
                    androidx.compose.animation.core.SpringSpec<androidx.compose.ui.unit.IntOffset> spring$default = androidx.compose.animation.core.AnimationSpecKt.spring$default(0.0f, 0.0f, androidx.compose.ui.unit.IntOffset.m8720boximpl(androidx.compose.ui.unit.IntOffset.m8723constructorimpl(androidx.compose.ui.geometry.InlineClassHelperKt.Uint64Low32)), 3, null);
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventEnd();
                    }
                    composer2.endReplaceGroup();
                    return spring$default;
                }
            };
        }
        if ((i2 & 2) != 0) {
            str = "IntOffsetAnimation";
        }
        java.lang.String str2 = str;
        androidx.compose.animation.core.TwoWayConverter<androidx.compose.ui.unit.IntOffset, androidx.compose.animation.core.AnimationVector2D> vectorConverter = androidx.compose.animation.core.VectorConvertersKt.getVectorConverter(androidx.compose.ui.unit.IntOffset.INSTANCE);
        int i3 = i << 3;
        int i4 = (i3 & 57344) | (i & 14) | (i3 & 896) | (i3 & 7168);
        if (!transition.isSeeking()) {
            composer.startReplaceGroup(1666573488);
            boolean z = (((i4 & 14) ^ 6) > 4 && composer.changed(transition)) || (i4 & 6) == 4;
            currentState = composer.rememberedValue();
            if (z || currentState == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                androidx.compose.runtime.snapshots.Snapshot.Companion companion = androidx.compose.runtime.snapshots.Snapshot.INSTANCE;
                androidx.compose.runtime.snapshots.Snapshot currentThreadSnapshot = companion.getCurrentThreadSnapshot();
                kotlin.jvm.functions.Function1<java.lang.Object, kotlin.Unit> readObserver = currentThreadSnapshot != null ? currentThreadSnapshot.getReadObserver() : null;
                androidx.compose.runtime.snapshots.Snapshot makeCurrentNonObservable = companion.makeCurrentNonObservable(currentThreadSnapshot);
                try {
                    S currentState2 = transition.getCurrentState();
                    companion.restoreNonObservable(currentThreadSnapshot, makeCurrentNonObservable, readObserver);
                    composer.updateRememberedValue(currentState2);
                    currentState = currentState2;
                } catch (java.lang.Throwable th) {
                    companion.restoreNonObservable(currentThreadSnapshot, makeCurrentNonObservable, readObserver);
                    throw th;
                }
            }
            composer.endReplaceGroup();
        } else {
            composer.startReplaceGroup(1666827533);
            composer.endReplaceGroup();
            currentState = transition.getCurrentState();
        }
        int i5 = (i4 >> 9) & 112;
        androidx.compose.ui.unit.IntOffset invoke = function32.invoke(currentState, composer, java.lang.Integer.valueOf(i5));
        int i6 = i4 & 14;
        int i7 = i6 ^ 6;
        boolean z2 = (i7 > 4 && composer.changed(transition)) || (i4 & 6) == 4;
        java.lang.Object rememberedValue = composer.rememberedValue();
        if (z2 || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue = androidx.compose.runtime.SnapshotStateKt.derivedStateOf(new androidx.compose.animation.core.TransitionKt$animateValue$targetValue$1$1(transition));
            composer.updateRememberedValue(rememberedValue);
        }
        androidx.compose.ui.unit.IntOffset invoke2 = function32.invoke((java.lang.Object) ((androidx.compose.runtime.State) rememberedValue).getValue(), composer, java.lang.Integer.valueOf(i5));
        boolean z3 = (i7 > 4 && composer.changed(transition)) || (i4 & 6) == 4;
        java.lang.Object rememberedValue2 = composer.rememberedValue();
        if (z3 || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue2 = androidx.compose.runtime.SnapshotStateKt.derivedStateOf(new androidx.compose.animation.core.TransitionKt$animateValue$animationSpec$1$1(transition));
            composer.updateRememberedValue(rememberedValue2);
        }
        return createTransitionAnimation(transition, invoke, invoke2, function3.invoke((java.lang.Object) ((androidx.compose.runtime.State) rememberedValue2).getValue(), composer, java.lang.Integer.valueOf((i4 >> 3) & 112)), vectorConverter, str2, composer, i6 | ((i4 << 6) & 458752));
    }

    public static final <S> androidx.compose.runtime.State<java.lang.Integer> animateInt(androidx.compose.animation.core.Transition<S> transition, kotlin.jvm.functions.Function3<? super androidx.compose.animation.core.Transition.Segment<S>, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, ? extends androidx.compose.animation.core.FiniteAnimationSpec<java.lang.Integer>> function3, java.lang.String str, kotlin.jvm.functions.Function3<? super S, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, java.lang.Integer> function32, androidx.compose.runtime.Composer composer, int i, int i2) {
        java.lang.Object currentState;
        if ((i2 & 1) != 0) {
            function3 = new kotlin.jvm.functions.Function3<androidx.compose.animation.core.Transition.Segment<S>, androidx.compose.runtime.Composer, java.lang.Integer, androidx.compose.animation.core.SpringSpec<java.lang.Integer>>() { // from class: androidx.compose.animation.core.TransitionKt$animateInt$1
                @Override // kotlin.jvm.functions.Function3
                public final /* synthetic */ androidx.compose.animation.core.SpringSpec<java.lang.Integer> invoke(java.lang.Object obj, androidx.compose.runtime.Composer composer2, java.lang.Integer num) {
                    return invoke((androidx.compose.animation.core.Transition.Segment) obj, composer2, num.intValue());
                }

                public final androidx.compose.animation.core.SpringSpec<java.lang.Integer> invoke(androidx.compose.animation.core.Transition.Segment<S> segment, androidx.compose.runtime.Composer composer2, int i3) {
                    composer2.startReplaceGroup(2109424115);
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventStart(2109424115, i3, -1, "androidx.compose.animation.core.animateInt.<anonymous> (Transition.kt:2101)");
                    }
                    androidx.compose.animation.core.SpringSpec<java.lang.Integer> spring$default = androidx.compose.animation.core.AnimationSpecKt.spring$default(0.0f, 0.0f, 1, 3, null);
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventEnd();
                    }
                    composer2.endReplaceGroup();
                    return spring$default;
                }
            };
        }
        if ((i2 & 2) != 0) {
            str = "IntAnimation";
        }
        java.lang.String str2 = str;
        androidx.compose.animation.core.TwoWayConverter<java.lang.Integer, androidx.compose.animation.core.AnimationVector1D> vectorConverter = androidx.compose.animation.core.VectorConvertersKt.getVectorConverter(kotlin.jvm.internal.IntCompanionObject.INSTANCE);
        int i3 = i << 3;
        int i4 = (i3 & 57344) | (i & 14) | (i3 & 896) | (i3 & 7168);
        if (!transition.isSeeking()) {
            composer.startReplaceGroup(1666573488);
            boolean z = (((i4 & 14) ^ 6) > 4 && composer.changed(transition)) || (i4 & 6) == 4;
            currentState = composer.rememberedValue();
            if (z || currentState == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                androidx.compose.runtime.snapshots.Snapshot.Companion companion = androidx.compose.runtime.snapshots.Snapshot.INSTANCE;
                androidx.compose.runtime.snapshots.Snapshot currentThreadSnapshot = companion.getCurrentThreadSnapshot();
                kotlin.jvm.functions.Function1<java.lang.Object, kotlin.Unit> readObserver = currentThreadSnapshot != null ? currentThreadSnapshot.getReadObserver() : null;
                androidx.compose.runtime.snapshots.Snapshot makeCurrentNonObservable = companion.makeCurrentNonObservable(currentThreadSnapshot);
                try {
                    S currentState2 = transition.getCurrentState();
                    companion.restoreNonObservable(currentThreadSnapshot, makeCurrentNonObservable, readObserver);
                    composer.updateRememberedValue(currentState2);
                    currentState = currentState2;
                } catch (java.lang.Throwable th) {
                    companion.restoreNonObservable(currentThreadSnapshot, makeCurrentNonObservable, readObserver);
                    throw th;
                }
            }
            composer.endReplaceGroup();
        } else {
            composer.startReplaceGroup(1666827533);
            composer.endReplaceGroup();
            currentState = transition.getCurrentState();
        }
        int i5 = (i4 >> 9) & 112;
        java.lang.Integer invoke = function32.invoke(currentState, composer, java.lang.Integer.valueOf(i5));
        int i6 = i4 & 14;
        int i7 = i6 ^ 6;
        boolean z2 = (i7 > 4 && composer.changed(transition)) || (i4 & 6) == 4;
        java.lang.Object rememberedValue = composer.rememberedValue();
        if (z2 || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue = androidx.compose.runtime.SnapshotStateKt.derivedStateOf(new androidx.compose.animation.core.TransitionKt$animateValue$targetValue$1$1(transition));
            composer.updateRememberedValue(rememberedValue);
        }
        java.lang.Integer invoke2 = function32.invoke((java.lang.Object) ((androidx.compose.runtime.State) rememberedValue).getValue(), composer, java.lang.Integer.valueOf(i5));
        boolean z3 = (i7 > 4 && composer.changed(transition)) || (i4 & 6) == 4;
        java.lang.Object rememberedValue2 = composer.rememberedValue();
        if (z3 || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue2 = androidx.compose.runtime.SnapshotStateKt.derivedStateOf(new androidx.compose.animation.core.TransitionKt$animateValue$animationSpec$1$1(transition));
            composer.updateRememberedValue(rememberedValue2);
        }
        return createTransitionAnimation(transition, invoke, invoke2, function3.invoke((java.lang.Object) ((androidx.compose.runtime.State) rememberedValue2).getValue(), composer, java.lang.Integer.valueOf((i4 >> 3) & 112)), vectorConverter, str2, composer, i6 | ((i4 << 6) & 458752));
    }

    public static final <S> androidx.compose.runtime.State<androidx.compose.ui.unit.IntSize> animateIntSize(androidx.compose.animation.core.Transition<S> transition, kotlin.jvm.functions.Function3<? super androidx.compose.animation.core.Transition.Segment<S>, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, ? extends androidx.compose.animation.core.FiniteAnimationSpec<androidx.compose.ui.unit.IntSize>> function3, java.lang.String str, kotlin.jvm.functions.Function3<? super S, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, androidx.compose.ui.unit.IntSize> function32, androidx.compose.runtime.Composer composer, int i, int i2) {
        java.lang.Object currentState;
        if ((i2 & 1) != 0) {
            function3 = new kotlin.jvm.functions.Function3<androidx.compose.animation.core.Transition.Segment<S>, androidx.compose.runtime.Composer, java.lang.Integer, androidx.compose.animation.core.SpringSpec<androidx.compose.ui.unit.IntSize>>() { // from class: androidx.compose.animation.core.TransitionKt$animateIntSize$1
                @Override // kotlin.jvm.functions.Function3
                public final /* synthetic */ androidx.compose.animation.core.SpringSpec<androidx.compose.ui.unit.IntSize> invoke(java.lang.Object obj, androidx.compose.runtime.Composer composer2, java.lang.Integer num) {
                    return invoke((androidx.compose.animation.core.Transition.Segment) obj, composer2, num.intValue());
                }

                public final androidx.compose.animation.core.SpringSpec<androidx.compose.ui.unit.IntSize> invoke(androidx.compose.animation.core.Transition.Segment<S> segment, androidx.compose.runtime.Composer composer2, int i3) {
                    composer2.startReplaceGroup(811932052);
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventStart(811932052, i3, -1, "androidx.compose.animation.core.animateIntSize.<anonymous> (Transition.kt:2132)");
                    }
                    androidx.compose.animation.core.SpringSpec<androidx.compose.ui.unit.IntSize> spring$default = androidx.compose.animation.core.AnimationSpecKt.spring$default(0.0f, 0.0f, androidx.compose.ui.unit.IntSize.m8764boximpl(androidx.compose.ui.unit.IntSize.m8767constructorimpl(androidx.compose.ui.geometry.InlineClassHelperKt.Uint64Low32)), 3, null);
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventEnd();
                    }
                    composer2.endReplaceGroup();
                    return spring$default;
                }
            };
        }
        if ((i2 & 2) != 0) {
            str = "IntSizeAnimation";
        }
        java.lang.String str2 = str;
        androidx.compose.animation.core.TwoWayConverter<androidx.compose.ui.unit.IntSize, androidx.compose.animation.core.AnimationVector2D> vectorConverter = androidx.compose.animation.core.VectorConvertersKt.getVectorConverter(androidx.compose.ui.unit.IntSize.INSTANCE);
        int i3 = i << 3;
        int i4 = (i3 & 57344) | (i & 14) | (i3 & 896) | (i3 & 7168);
        if (!transition.isSeeking()) {
            composer.startReplaceGroup(1666573488);
            boolean z = (((i4 & 14) ^ 6) > 4 && composer.changed(transition)) || (i4 & 6) == 4;
            currentState = composer.rememberedValue();
            if (z || currentState == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                androidx.compose.runtime.snapshots.Snapshot.Companion companion = androidx.compose.runtime.snapshots.Snapshot.INSTANCE;
                androidx.compose.runtime.snapshots.Snapshot currentThreadSnapshot = companion.getCurrentThreadSnapshot();
                kotlin.jvm.functions.Function1<java.lang.Object, kotlin.Unit> readObserver = currentThreadSnapshot != null ? currentThreadSnapshot.getReadObserver() : null;
                androidx.compose.runtime.snapshots.Snapshot makeCurrentNonObservable = companion.makeCurrentNonObservable(currentThreadSnapshot);
                try {
                    S currentState2 = transition.getCurrentState();
                    companion.restoreNonObservable(currentThreadSnapshot, makeCurrentNonObservable, readObserver);
                    composer.updateRememberedValue(currentState2);
                    currentState = currentState2;
                } catch (java.lang.Throwable th) {
                    companion.restoreNonObservable(currentThreadSnapshot, makeCurrentNonObservable, readObserver);
                    throw th;
                }
            }
            composer.endReplaceGroup();
        } else {
            composer.startReplaceGroup(1666827533);
            composer.endReplaceGroup();
            currentState = transition.getCurrentState();
        }
        int i5 = (i4 >> 9) & 112;
        androidx.compose.ui.unit.IntSize invoke = function32.invoke(currentState, composer, java.lang.Integer.valueOf(i5));
        int i6 = i4 & 14;
        int i7 = i6 ^ 6;
        boolean z2 = (i7 > 4 && composer.changed(transition)) || (i4 & 6) == 4;
        java.lang.Object rememberedValue = composer.rememberedValue();
        if (z2 || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue = androidx.compose.runtime.SnapshotStateKt.derivedStateOf(new androidx.compose.animation.core.TransitionKt$animateValue$targetValue$1$1(transition));
            composer.updateRememberedValue(rememberedValue);
        }
        androidx.compose.ui.unit.IntSize invoke2 = function32.invoke((java.lang.Object) ((androidx.compose.runtime.State) rememberedValue).getValue(), composer, java.lang.Integer.valueOf(i5));
        boolean z3 = (i7 > 4 && composer.changed(transition)) || (i4 & 6) == 4;
        java.lang.Object rememberedValue2 = composer.rememberedValue();
        if (z3 || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue2 = androidx.compose.runtime.SnapshotStateKt.derivedStateOf(new androidx.compose.animation.core.TransitionKt$animateValue$animationSpec$1$1(transition));
            composer.updateRememberedValue(rememberedValue2);
        }
        return createTransitionAnimation(transition, invoke, invoke2, function3.invoke((java.lang.Object) ((androidx.compose.runtime.State) rememberedValue2).getValue(), composer, java.lang.Integer.valueOf((i4 >> 3) & 112)), vectorConverter, str2, composer, i6 | ((i4 << 6) & 458752));
    }

    public static final <S> androidx.compose.runtime.State<androidx.compose.ui.geometry.Rect> animateRect(androidx.compose.animation.core.Transition<S> transition, kotlin.jvm.functions.Function3<? super androidx.compose.animation.core.Transition.Segment<S>, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, ? extends androidx.compose.animation.core.FiniteAnimationSpec<androidx.compose.ui.geometry.Rect>> function3, java.lang.String str, kotlin.jvm.functions.Function3<? super S, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, androidx.compose.ui.geometry.Rect> function32, androidx.compose.runtime.Composer composer, int i, int i2) {
        java.lang.Object currentState;
        if ((i2 & 1) != 0) {
            function3 = new kotlin.jvm.functions.Function3<androidx.compose.animation.core.Transition.Segment<S>, androidx.compose.runtime.Composer, java.lang.Integer, androidx.compose.animation.core.SpringSpec<androidx.compose.ui.geometry.Rect>>() { // from class: androidx.compose.animation.core.TransitionKt$animateRect$1
                @Override // kotlin.jvm.functions.Function3
                public final /* synthetic */ androidx.compose.animation.core.SpringSpec<androidx.compose.ui.geometry.Rect> invoke(java.lang.Object obj, androidx.compose.runtime.Composer composer2, java.lang.Integer num) {
                    return invoke((androidx.compose.animation.core.Transition.Segment) obj, composer2, num.intValue());
                }

                public final androidx.compose.animation.core.SpringSpec<androidx.compose.ui.geometry.Rect> invoke(androidx.compose.animation.core.Transition.Segment<S> segment, androidx.compose.runtime.Composer composer2, int i3) {
                    composer2.startReplaceGroup(946173386);
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventStart(946173386, i3, -1, "androidx.compose.animation.core.animateRect.<anonymous> (Transition.kt:2162)");
                    }
                    androidx.compose.animation.core.SpringSpec<androidx.compose.ui.geometry.Rect> spring$default = androidx.compose.animation.core.AnimationSpecKt.spring$default(0.0f, 0.0f, androidx.compose.animation.core.VisibilityThresholdsKt.getVisibilityThreshold(androidx.compose.ui.geometry.Rect.INSTANCE), 3, null);
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventEnd();
                    }
                    composer2.endReplaceGroup();
                    return spring$default;
                }
            };
        }
        if ((i2 & 2) != 0) {
            str = "RectAnimation";
        }
        java.lang.String str2 = str;
        androidx.compose.animation.core.TwoWayConverter<androidx.compose.ui.geometry.Rect, androidx.compose.animation.core.AnimationVector4D> vectorConverter = androidx.compose.animation.core.VectorConvertersKt.getVectorConverter(androidx.compose.ui.geometry.Rect.INSTANCE);
        int i3 = i << 3;
        int i4 = (i3 & 57344) | (i & 14) | (i3 & 896) | (i3 & 7168);
        if (!transition.isSeeking()) {
            composer.startReplaceGroup(1666573488);
            boolean z = (((i4 & 14) ^ 6) > 4 && composer.changed(transition)) || (i4 & 6) == 4;
            currentState = composer.rememberedValue();
            if (z || currentState == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                androidx.compose.runtime.snapshots.Snapshot.Companion companion = androidx.compose.runtime.snapshots.Snapshot.INSTANCE;
                androidx.compose.runtime.snapshots.Snapshot currentThreadSnapshot = companion.getCurrentThreadSnapshot();
                kotlin.jvm.functions.Function1<java.lang.Object, kotlin.Unit> readObserver = currentThreadSnapshot != null ? currentThreadSnapshot.getReadObserver() : null;
                androidx.compose.runtime.snapshots.Snapshot makeCurrentNonObservable = companion.makeCurrentNonObservable(currentThreadSnapshot);
                try {
                    S currentState2 = transition.getCurrentState();
                    companion.restoreNonObservable(currentThreadSnapshot, makeCurrentNonObservable, readObserver);
                    composer.updateRememberedValue(currentState2);
                    currentState = currentState2;
                } catch (java.lang.Throwable th) {
                    companion.restoreNonObservable(currentThreadSnapshot, makeCurrentNonObservable, readObserver);
                    throw th;
                }
            }
            composer.endReplaceGroup();
        } else {
            composer.startReplaceGroup(1666827533);
            composer.endReplaceGroup();
            currentState = transition.getCurrentState();
        }
        int i5 = (i4 >> 9) & 112;
        androidx.compose.ui.geometry.Rect invoke = function32.invoke(currentState, composer, java.lang.Integer.valueOf(i5));
        int i6 = i4 & 14;
        int i7 = i6 ^ 6;
        boolean z2 = (i7 > 4 && composer.changed(transition)) || (i4 & 6) == 4;
        java.lang.Object rememberedValue = composer.rememberedValue();
        if (z2 || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue = androidx.compose.runtime.SnapshotStateKt.derivedStateOf(new androidx.compose.animation.core.TransitionKt$animateValue$targetValue$1$1(transition));
            composer.updateRememberedValue(rememberedValue);
        }
        androidx.compose.ui.geometry.Rect invoke2 = function32.invoke((java.lang.Object) ((androidx.compose.runtime.State) rememberedValue).getValue(), composer, java.lang.Integer.valueOf(i5));
        boolean z3 = (i7 > 4 && composer.changed(transition)) || (i4 & 6) == 4;
        java.lang.Object rememberedValue2 = composer.rememberedValue();
        if (z3 || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue2 = androidx.compose.runtime.SnapshotStateKt.derivedStateOf(new androidx.compose.animation.core.TransitionKt$animateValue$animationSpec$1$1(transition));
            composer.updateRememberedValue(rememberedValue2);
        }
        return createTransitionAnimation(transition, invoke, invoke2, function3.invoke((java.lang.Object) ((androidx.compose.runtime.State) rememberedValue2).getValue(), composer, java.lang.Integer.valueOf((i4 >> 3) & 112)), vectorConverter, str2, composer, i6 | ((i4 << 6) & 458752));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.runtime.DisposableEffectResult getHighSpeedVideoFpsRangesFor(final androidx.compose.animation.core.Transition transition) {
        return new androidx.compose.runtime.DisposableEffectResult() { // from class: androidx.compose.animation.core.TransitionKt$updateTransition$lambda$1$0$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public final void dispose() {
                androidx.compose.animation.core.Transition.this.onDisposed$animation_core();
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.runtime.DisposableEffectResult Camera2StreamConfigurationMap(final androidx.compose.animation.core.Transition transition) {
        return new androidx.compose.runtime.DisposableEffectResult() { // from class: androidx.compose.animation.core.TransitionKt$rememberTransition$lambda$2$0$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public final void dispose() {
                androidx.compose.animation.core.Transition.this.onDisposed$animation_core();
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.runtime.DisposableEffectResult getHighResolutionOutputSizeshNQ4ISI(final androidx.compose.animation.core.Transition transition, final androidx.compose.animation.core.Transition.DeferredAnimation deferredAnimation) {
        return new androidx.compose.runtime.DisposableEffectResult() { // from class: androidx.compose.animation.core.TransitionKt$createDeferredAnimation$lambda$1$0$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public final void dispose() {
                androidx.compose.animation.core.Transition.this.removeAnimation$animation_core(deferredAnimation);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit getHighSpeedVideoFpsRanges(androidx.compose.animation.core.Transition transition, androidx.compose.animation.core.Transition.TransitionAnimationState transitionAnimationState, java.lang.Object obj, java.lang.Object obj2, androidx.compose.animation.core.FiniteAnimationSpec finiteAnimationSpec, int i, androidx.compose.runtime.Composer composer) {
        getHighResolutionOutputSizeshNQ4ISI(transition, transitionAnimationState, obj, obj2, finiteAnimationSpec, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }
}
