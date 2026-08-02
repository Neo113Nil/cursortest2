package androidx.constraintlayout.compose;

@kotlin.Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u009a\u0001\u0010\u0017\u001a\u00020\n2\u000e\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00002\u000e\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00002\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00010\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u0010\u001a\u00020\u000f2\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0011\u0010\u0016\u001a\r\u0012\u0004\u0012\u00020\n0\u0011¢\u0006\u0002\b\u0015H\u0000¢\u0006\u0004\b\u0017\u0010\u0018"}, d2 = {"Landroidx/compose/runtime/MutableState;", "Landroidx/constraintlayout/compose/ConstraintSet;", com.adobe.marketing.mobile.internal.CoreConstants.EventDataKeys.Lifecycle.LIFECYCLE_START, "end", "Landroidx/compose/animation/core/AnimationSpec;", "", "animationSpec", "Lkotlinx/coroutines/channels/Channel;", "channel", "Landroidx/compose/runtime/State;", "", "contentTracker", "Landroidx/compose/ui/node/Ref;", "Landroidx/constraintlayout/compose/CompositionSource;", "compositionSource", "", "optimizationLevel", "Lkotlin/Function0;", "finishedAnimationListener", "Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/runtime/Composable;", "content", "LateMotionLayout", "(Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/animation/core/AnimationSpec;Lkotlinx/coroutines/channels/Channel;Landroidx/compose/runtime/State;Landroidx/compose/ui/node/Ref;ILkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class LateMotionLayoutKt {
    public static final void LateMotionLayout(final androidx.compose.runtime.MutableState<androidx.constraintlayout.compose.ConstraintSet> mutableState, final androidx.compose.runtime.MutableState<androidx.constraintlayout.compose.ConstraintSet> mutableState2, final androidx.compose.animation.core.AnimationSpec<java.lang.Float> animationSpec, final kotlinx.coroutines.channels.Channel<androidx.constraintlayout.compose.ConstraintSet> channel, final androidx.compose.runtime.State<kotlin.Unit> state, final androidx.compose.ui.node.Ref<androidx.constraintlayout.compose.CompositionSource> ref, final int i, final kotlin.jvm.functions.Function0<kotlin.Unit> function0, final androidx.compose.ui.Modifier modifier, final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function2, androidx.compose.runtime.Composer composer, final int i2) {
        int i3;
        androidx.compose.runtime.Composer composer2;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(688627412);
        if ((i2 & 6) == 0) {
            i3 = (startRestartGroup.changed(mutableState) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= startRestartGroup.changed(mutableState2) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= startRestartGroup.changedInstance(animationSpec) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= startRestartGroup.changedInstance(channel) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= startRestartGroup.changed(state) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= (i2 & 262144) == 0 ? startRestartGroup.changed(ref) : startRestartGroup.changedInstance(ref) ? 131072 : 65536;
        }
        if ((1572864 & i2) == 0) {
            i3 |= startRestartGroup.changed(i) ? 1048576 : 524288;
        }
        if ((i2 & 12582912) == 0) {
            i3 |= startRestartGroup.changedInstance(function0) ? 8388608 : 4194304;
        }
        if ((i2 & 100663296) == 0) {
            i3 |= startRestartGroup.changed(modifier) ? 67108864 : 33554432;
        }
        if ((i2 & 805306368) == 0) {
            i3 |= startRestartGroup.changedInstance(function2) ? 536870912 : 268435456;
        }
        if ((i3 & 306783379) != 306783378 || !startRestartGroup.getSkipping()) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(688627412, i3, -1, "androidx.constraintlayout.compose.LateMotionLayout (LateMotionLayout.kt:57)");
            }
            androidx.compose.ui.unit.Density density = (androidx.compose.ui.unit.Density) startRestartGroup.consume(androidx.compose.ui.platform.CompositionLocalsKt.getLocalDensity());
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new androidx.constraintlayout.compose.MotionMeasurer(density);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            final androidx.constraintlayout.compose.MotionMeasurer motionMeasurer = (androidx.constraintlayout.compose.MotionMeasurer) rememberedValue;
            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = androidx.compose.animation.core.AnimatableKt.Animatable$default(0.0f, 0.0f, 2, null);
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            androidx.compose.animation.core.Animatable animatable = (androidx.compose.animation.core.Animatable) rememberedValue2;
            java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = animatable.asState();
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            final androidx.compose.runtime.State state2 = (androidx.compose.runtime.State) rememberedValue3;
            java.lang.Object rememberedValue4 = startRestartGroup.rememberedValue();
            if (rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue4 = androidx.compose.runtime.SnapshotIntStateKt.mutableIntStateOf(1);
                startRestartGroup.updateRememberedValue(rememberedValue4);
            }
            androidx.compose.runtime.MutableIntState mutableIntState = (androidx.compose.runtime.MutableIntState) rememberedValue4;
            java.lang.Object rememberedValue5 = startRestartGroup.rememberedValue();
            if (rememberedValue5 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue5 = (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<androidx.constraintlayout.compose.ConstraintSet>() { // from class: androidx.constraintlayout.compose.LateMotionLayoutKt$LateMotionLayout$measurePolicy$1$1
                    @Override // kotlin.jvm.functions.Function0
                    /* renamed from: getHighSpeedVideoSizes, reason: merged with bridge method [inline-methods] */
                    public final androidx.constraintlayout.compose.ConstraintSet invoke() {
                        androidx.constraintlayout.compose.ConstraintSet value = mutableState.getValue();
                        kotlin.jvm.internal.Intrinsics.checkNotNull(value);
                        return value;
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue5);
            }
            final kotlin.jvm.functions.Function0 function02 = (kotlin.jvm.functions.Function0) rememberedValue5;
            java.lang.Object rememberedValue6 = startRestartGroup.rememberedValue();
            if (rememberedValue6 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue6 = (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<androidx.constraintlayout.compose.ConstraintSet>() { // from class: androidx.constraintlayout.compose.LateMotionLayoutKt$LateMotionLayout$measurePolicy$2$1
                    @Override // kotlin.jvm.functions.Function0
                    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: merged with bridge method [inline-methods] */
                    public final androidx.constraintlayout.compose.ConstraintSet invoke() {
                        androidx.constraintlayout.compose.ConstraintSet value = mutableState2.getValue();
                        kotlin.jvm.internal.Intrinsics.checkNotNull(value);
                        return value;
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue6);
            }
            final kotlin.jvm.functions.Function0 function03 = (kotlin.jvm.functions.Function0) rememberedValue6;
            int i4 = i3;
            androidx.compose.ui.layout.MeasurePolicy measurePolicy = new androidx.compose.ui.layout.MeasurePolicy() { // from class: androidx.constraintlayout.compose.LateMotionLayoutKt$lateMotionLayoutMeasurePolicy$1
                @Override // androidx.compose.ui.layout.MeasurePolicy
                /* renamed from: measure-3p2s80s */
                public final androidx.compose.ui.layout.MeasureResult mo1095measure3p2s80s(androidx.compose.ui.layout.MeasureScope measureScope, final java.util.List<? extends androidx.compose.ui.layout.Measurable> list, long j) {
                    final java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
                    state.getValue();
                    androidx.constraintlayout.compose.MotionMeasurer motionMeasurer2 = motionMeasurer;
                    androidx.compose.ui.unit.LayoutDirection layoutDirection = measureScope.getLayoutDirection();
                    androidx.constraintlayout.compose.ConstraintSet invoke = function02.invoke();
                    androidx.constraintlayout.compose.ConstraintSet invoke2 = function03.invoke();
                    androidx.constraintlayout.compose.TransitionImpl eMPTY$constraintlayout_compose_release = androidx.constraintlayout.compose.TransitionImpl.INSTANCE.getEMPTY$constraintlayout_compose_release();
                    int i5 = i;
                    float floatValue = state2.getValue().floatValue();
                    androidx.constraintlayout.compose.CompositionSource value = ref.getValue();
                    if (value == null) {
                        value = androidx.constraintlayout.compose.CompositionSource.Unknown;
                    }
                    long m9016performInterpolationMeasureLzAeyeM = motionMeasurer2.m9016performInterpolationMeasureLzAeyeM(j, layoutDirection, invoke, invoke2, eMPTY$constraintlayout_compose_release, list, linkedHashMap, i5, floatValue, value, null);
                    ref.setValue(androidx.constraintlayout.compose.CompositionSource.Unknown);
                    int m8772getWidthimpl = androidx.compose.ui.unit.IntSize.m8772getWidthimpl(m9016performInterpolationMeasureLzAeyeM);
                    int m8771getHeightimpl = androidx.compose.ui.unit.IntSize.m8771getHeightimpl(m9016performInterpolationMeasureLzAeyeM);
                    final androidx.constraintlayout.compose.MotionMeasurer motionMeasurer3 = motionMeasurer;
                    return androidx.compose.ui.layout.MeasureScope.layout$default(measureScope, m8772getWidthimpl, m8771getHeightimpl, null, new kotlin.jvm.functions.Function1<androidx.compose.ui.layout.Placeable.PlacementScope, kotlin.Unit>() { // from class: androidx.constraintlayout.compose.LateMotionLayoutKt$lateMotionLayoutMeasurePolicy$1.1
                        @Override // kotlin.jvm.functions.Function1
                        public final /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.layout.Placeable.PlacementScope placementScope) {
                            getHighSpeedVideoFpsRanges(placementScope);
                            return kotlin.Unit.INSTANCE;
                        }

                        public final void getHighSpeedVideoFpsRanges(androidx.compose.ui.layout.Placeable.PlacementScope placementScope) {
                            androidx.constraintlayout.compose.MotionMeasurer.this.performLayout(placementScope, list, linkedHashMap);
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(1);
                        }
                    }, 4, null);
                }
            };
            boolean changedInstance = startRestartGroup.changedInstance(motionMeasurer);
            java.lang.Object rememberedValue7 = startRestartGroup.rememberedValue();
            if (changedInstance || rememberedValue7 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue7 = (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<androidx.compose.ui.semantics.SemanticsPropertyReceiver, kotlin.Unit>() { // from class: androidx.constraintlayout.compose.LateMotionLayoutKt$LateMotionLayout$1$1
                    public final void getHighSpeedVideoSizes(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver) {
                        androidx.constraintlayout.compose.ToolingUtilsKt.setDesignInfoProvider(semanticsPropertyReceiver, androidx.constraintlayout.compose.MotionMeasurer.this);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver) {
                        getHighSpeedVideoSizes(semanticsPropertyReceiver);
                        return kotlin.Unit.INSTANCE;
                    }

                    {
                        super(1);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue7);
            }
            androidx.compose.ui.layout.LayoutKt.MultiMeasureLayout(androidx.compose.ui.semantics.SemanticsModifierKt.semantics$default(modifier, false, (kotlin.jvm.functions.Function1) rememberedValue7, 1, null), function2, measurePolicy, startRestartGroup, (i4 >> 24) & 112, 0);
            boolean changedInstance2 = startRestartGroup.changedInstance(channel);
            boolean z = (i4 & 14) == 4;
            boolean z2 = (i4 & 112) == 32;
            boolean z3 = (i4 & 458752) == 131072 || ((i4 & 262144) != 0 && startRestartGroup.changedInstance(ref));
            boolean changedInstance3 = startRestartGroup.changedInstance(animatable);
            boolean z4 = true;
            boolean changedInstance4 = startRestartGroup.changedInstance(animationSpec);
            if ((i4 & 29360128) != 8388608) {
                z4 = false;
            }
            androidx.constraintlayout.compose.LateMotionLayoutKt$LateMotionLayout$2$1 rememberedValue8 = startRestartGroup.rememberedValue();
            if (((changedInstance2 | z | z2 | z3 | changedInstance3 | changedInstance4) || z4) || rememberedValue8 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                composer2 = startRestartGroup;
                rememberedValue8 = new androidx.constraintlayout.compose.LateMotionLayoutKt$LateMotionLayout$2$1(channel, mutableIntState, mutableState, mutableState2, ref, animatable, animationSpec, function0, null);
                composer2.updateRememberedValue(rememberedValue8);
            } else {
                composer2 = startRestartGroup;
            }
            androidx.compose.runtime.EffectsKt.LaunchedEffect(channel, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue8, composer2, (i4 >> 9) & 14);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
            composer2 = startRestartGroup;
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.constraintlayout.compose.LateMotionLayoutKt$LateMotionLayout$3
                @Override // kotlin.jvm.functions.Function2
                public final /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer3, java.lang.Integer num) {
                    androidx.constraintlayout.compose.LateMotionLayoutKt.LateMotionLayout(mutableState, mutableState2, animationSpec, channel, state, ref, i, function0, modifier, function2, composer3, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
                    return kotlin.Unit.INSTANCE;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }
            });
        }
    }
}
