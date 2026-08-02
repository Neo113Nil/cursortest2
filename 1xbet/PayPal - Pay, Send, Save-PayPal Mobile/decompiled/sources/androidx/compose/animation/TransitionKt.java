package androidx.compose.animation;

@kotlin.Metadata(d1 = {"\u0000F\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0082\u0001\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001\"\u0004\b\u0000\u0010\u0003*\b\u0012\u0004\u0012\u0002H\u00030\u00042*\b\n\u0010\u0005\u001a$\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00030\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\b0\u0006¢\u0006\u0002\b\t¢\u0006\u0002\b\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2&\u0010\r\u001a\"\u0012\u0013\u0012\u0011H\u0003¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u00020\u00020\u0006¢\u0006\u0002\b\tH\u0087\b¢\u0006\u0002\u0010\u0011\u001aA\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u00022\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00162\b\b\u0002\u0010\u000b\u001a\u00020\fH\u0007¢\u0006\u0004\b\u0017\u0010\u0018\u001a7\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u00022\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u0016H\u0007¢\u0006\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"animateColor", "Landroidx/compose/runtime/State;", "Landroidx/compose/ui/graphics/Color;", "S", "Landroidx/compose/animation/core/Transition;", "transitionSpec", "Lkotlin/Function1;", "Landroidx/compose/animation/core/Transition$Segment;", "Landroidx/compose/animation/core/FiniteAnimationSpec;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "label", "", "targetValueByState", "Lkotlin/ParameterName;", "name", "state", "(Landroidx/compose/animation/core/Transition;Lkotlin/jvm/functions/Function3;Ljava/lang/String;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;", "Landroidx/compose/animation/core/InfiniteTransition;", "initialValue", "targetValue", "animationSpec", "Landroidx/compose/animation/core/InfiniteRepeatableSpec;", "animateColor-DTcfvLk", "(Landroidx/compose/animation/core/InfiniteTransition;JJLandroidx/compose/animation/core/InfiniteRepeatableSpec;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;", "animateColor-RIQooxk", "(Landroidx/compose/animation/core/InfiniteTransition;JJLandroidx/compose/animation/core/InfiniteRepeatableSpec;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "animation"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class TransitionKt {
    public static final <S> androidx.compose.runtime.State<androidx.compose.ui.graphics.Color> animateColor(final androidx.compose.animation.core.Transition<S> transition, kotlin.jvm.functions.Function3<? super androidx.compose.animation.core.Transition.Segment<S>, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, ? extends androidx.compose.animation.core.FiniteAnimationSpec<androidx.compose.ui.graphics.Color>> function3, java.lang.String str, kotlin.jvm.functions.Function3<? super S, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, androidx.compose.ui.graphics.Color> function32, androidx.compose.runtime.Composer composer, int i, int i2) {
        java.lang.Object currentState;
        if ((i2 & 1) != 0) {
            function3 = new kotlin.jvm.functions.Function3<androidx.compose.animation.core.Transition.Segment<S>, androidx.compose.runtime.Composer, java.lang.Integer, androidx.compose.animation.core.SpringSpec<androidx.compose.ui.graphics.Color>>() { // from class: androidx.compose.animation.TransitionKt$animateColor$1
                @Override // kotlin.jvm.functions.Function3
                public final /* synthetic */ androidx.compose.animation.core.SpringSpec<androidx.compose.ui.graphics.Color> invoke(java.lang.Object obj, androidx.compose.runtime.Composer composer2, java.lang.Integer num) {
                    return invoke((androidx.compose.animation.core.Transition.Segment) obj, composer2, num.intValue());
                }

                public final androidx.compose.animation.core.SpringSpec<androidx.compose.ui.graphics.Color> invoke(androidx.compose.animation.core.Transition.Segment<S> segment, androidx.compose.runtime.Composer composer2, int i3) {
                    composer2.startReplaceGroup(-781456724);
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventStart(-781456724, i3, -1, "androidx.compose.animation.animateColor.<anonymous> (Transition.kt:62)");
                    }
                    androidx.compose.animation.core.SpringSpec<androidx.compose.ui.graphics.Color> spring$default = androidx.compose.animation.core.AnimationSpecKt.spring$default(0.0f, 0.0f, null, 7, null);
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventEnd();
                    }
                    composer2.endReplaceGroup();
                    return spring$default;
                }
            };
        }
        if ((i2 & 2) != 0) {
            str = "ColorAnimation";
        }
        java.lang.String str2 = str;
        androidx.compose.ui.graphics.colorspace.ColorSpace m6000getColorSpaceimpl = androidx.compose.ui.graphics.Color.m6000getColorSpaceimpl(function32.invoke(transition.getTargetState(), composer, java.lang.Integer.valueOf((i >> 6) & 112)).m6006unboximpl());
        boolean changed = composer.changed(m6000getColorSpaceimpl);
        java.lang.Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue = (androidx.compose.animation.core.TwoWayConverter) androidx.compose.animation.ColorVectorConverterKt.getVectorConverter(androidx.compose.ui.graphics.Color.INSTANCE).invoke(m6000getColorSpaceimpl);
            composer.updateRememberedValue(rememberedValue);
        }
        androidx.compose.animation.core.TwoWayConverter twoWayConverter = (androidx.compose.animation.core.TwoWayConverter) rememberedValue;
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
        androidx.compose.ui.graphics.Color invoke = function32.invoke(currentState, composer, java.lang.Integer.valueOf(i5));
        int i6 = i4 & 14;
        int i7 = i6 ^ 6;
        boolean z2 = (i7 > 4 && composer.changed(transition)) || (i4 & 6) == 4;
        java.lang.Object rememberedValue2 = composer.rememberedValue();
        if (z2 || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue2 = androidx.compose.runtime.SnapshotStateKt.derivedStateOf(new kotlin.jvm.functions.Function0<S>() { // from class: androidx.compose.animation.TransitionKt$animateColor$$inlined$animateValue$1
                @Override // kotlin.jvm.functions.Function0
                public final S invoke() {
                    return (S) androidx.compose.animation.core.Transition.this.getTargetState();
                }
            });
            composer.updateRememberedValue(rememberedValue2);
        }
        androidx.compose.ui.graphics.Color invoke2 = function32.invoke((java.lang.Object) ((androidx.compose.runtime.State) rememberedValue2).getValue(), composer, java.lang.Integer.valueOf(i5));
        boolean z3 = (i7 > 4 && composer.changed(transition)) || (i4 & 6) == 4;
        java.lang.Object rememberedValue3 = composer.rememberedValue();
        if (z3 || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue3 = androidx.compose.runtime.SnapshotStateKt.derivedStateOf(new kotlin.jvm.functions.Function0<androidx.compose.animation.core.Transition.Segment<S>>() { // from class: androidx.compose.animation.TransitionKt$animateColor$$inlined$animateValue$2
                @Override // kotlin.jvm.functions.Function0
                public final androidx.compose.animation.core.Transition.Segment<S> invoke() {
                    return androidx.compose.animation.core.Transition.this.getSegment();
                }
            });
            composer.updateRememberedValue(rememberedValue3);
        }
        return androidx.compose.animation.core.TransitionKt.createTransitionAnimation(transition, invoke, invoke2, function3.invoke((java.lang.Object) ((androidx.compose.runtime.State) rememberedValue3).getValue(), composer, java.lang.Integer.valueOf((i4 >> 3) & 112)), twoWayConverter, str2, composer, i6 | ((i4 << 6) & 458752));
    }

    /* renamed from: animateColor-DTcfvLk, reason: not valid java name */
    public static final androidx.compose.runtime.State<androidx.compose.ui.graphics.Color> m1165animateColorDTcfvLk(androidx.compose.animation.core.InfiniteTransition infiniteTransition, long j, long j2, androidx.compose.animation.core.InfiniteRepeatableSpec<androidx.compose.ui.graphics.Color> infiniteRepeatableSpec, java.lang.String str, androidx.compose.runtime.Composer composer, int i, int i2) {
        java.lang.String str2 = (i2 & 8) != 0 ? "ColorAnimation" : str;
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(1901963533, i, -1, "androidx.compose.animation.animateColor (Transition.kt:97)");
        }
        java.lang.Object rememberedValue = composer.rememberedValue();
        if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue = (androidx.compose.animation.core.TwoWayConverter) androidx.compose.animation.ColorVectorConverterKt.getVectorConverter(androidx.compose.ui.graphics.Color.INSTANCE).invoke(androidx.compose.ui.graphics.Color.m6000getColorSpaceimpl(j2));
            composer.updateRememberedValue(rememberedValue);
        }
        int i3 = i << 3;
        androidx.compose.runtime.State<androidx.compose.ui.graphics.Color> animateValue = androidx.compose.animation.core.InfiniteTransitionKt.animateValue(infiniteTransition, androidx.compose.ui.graphics.Color.m5986boximpl(j), androidx.compose.ui.graphics.Color.m5986boximpl(j2), (androidx.compose.animation.core.TwoWayConverter) rememberedValue, infiniteRepeatableSpec, str2, composer, (i & 896) | androidx.compose.animation.core.InfiniteTransition.$stable | (i & 14) | (i & 112) | (androidx.compose.animation.core.InfiniteRepeatableSpec.$stable << 12) | (57344 & i3) | (458752 & i3), 0);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return animateValue;
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "animateColor APIs now have a new label parameter added.")
    /* renamed from: animateColor-RIQooxk, reason: not valid java name */
    public static final /* synthetic */ androidx.compose.runtime.State m1166animateColorRIQooxk(androidx.compose.animation.core.InfiniteTransition infiniteTransition, long j, long j2, androidx.compose.animation.core.InfiniteRepeatableSpec infiniteRepeatableSpec, androidx.compose.runtime.Composer composer, int i) {
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(1400583834, i, -1, "androidx.compose.animation.animateColor (Transition.kt:112)");
        }
        androidx.compose.runtime.State<androidx.compose.ui.graphics.Color> m1165animateColorDTcfvLk = m1165animateColorDTcfvLk(infiniteTransition, j, j2, infiniteRepeatableSpec, "ColorAnimation", composer, androidx.compose.animation.core.InfiniteTransition.$stable | 24576 | (i & 14) | (i & 112) | (i & 896) | (androidx.compose.animation.core.InfiniteRepeatableSpec.$stable << 9) | (i & 7168), 0);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return m1165animateColorDTcfvLk;
    }
}
