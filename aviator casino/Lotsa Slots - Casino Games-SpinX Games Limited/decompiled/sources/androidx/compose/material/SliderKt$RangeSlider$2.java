package androidx.compose.material;

/* compiled from: Slider.kt */
@kotlin.Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
final class SliderKt$RangeSlider$2 extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function3<androidx.compose.foundation.layout.BoxWithConstraintsScope, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ androidx.compose.material.SliderColors $colors;
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ androidx.compose.foundation.interaction.MutableInteractionSource $endInteractionSource;
    final /* synthetic */ kotlin.jvm.functions.Function0<kotlin.Unit> $onValueChangeFinished;
    final /* synthetic */ androidx.compose.runtime.State<kotlin.jvm.functions.Function1<kotlin.ranges.ClosedFloatingPointRange<java.lang.Float>, kotlin.Unit>> $onValueChangeState;
    final /* synthetic */ androidx.compose.foundation.interaction.MutableInteractionSource $startInteractionSource;
    final /* synthetic */ int $steps;
    final /* synthetic */ java.util.List<java.lang.Float> $tickFractions;
    final /* synthetic */ kotlin.ranges.ClosedFloatingPointRange<java.lang.Float> $valueRange;
    final /* synthetic */ kotlin.ranges.ClosedFloatingPointRange<java.lang.Float> $values;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    SliderKt$RangeSlider$2(kotlin.ranges.ClosedFloatingPointRange<java.lang.Float> closedFloatingPointRange, kotlin.ranges.ClosedFloatingPointRange<java.lang.Float> closedFloatingPointRange2, int i, androidx.compose.runtime.State<? extends kotlin.jvm.functions.Function1<? super kotlin.ranges.ClosedFloatingPointRange<java.lang.Float>, kotlin.Unit>> state, androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource, androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource2, boolean z, java.util.List<java.lang.Float> list, int i2, androidx.compose.material.SliderColors sliderColors, kotlin.jvm.functions.Function0<kotlin.Unit> function0) {
        super(3);
        this.$valueRange = closedFloatingPointRange;
        this.$values = closedFloatingPointRange2;
        this.$$dirty = i;
        this.$onValueChangeState = state;
        this.$startInteractionSource = mutableInteractionSource;
        this.$endInteractionSource = mutableInteractionSource2;
        this.$enabled = z;
        this.$tickFractions = list;
        this.$steps = i2;
        this.$colors = sliderColors;
        this.$onValueChangeFinished = function0;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.foundation.layout.BoxWithConstraintsScope boxWithConstraintsScope, androidx.compose.runtime.Composer composer, java.lang.Integer num) {
        invoke(boxWithConstraintsScope, composer, num.intValue());
        return kotlin.Unit.INSTANCE;
    }

    public final void invoke(androidx.compose.foundation.layout.BoxWithConstraintsScope BoxWithConstraints, androidx.compose.runtime.Composer composer, int i) {
        androidx.compose.ui.Modifier rangeSliderPressDragModifier;
        float calcFraction;
        float calcFraction2;
        androidx.compose.ui.Modifier sliderSemantics;
        androidx.compose.ui.Modifier sliderSemantics2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(BoxWithConstraints, "$this$BoxWithConstraints");
        androidx.compose.runtime.ComposerKt.sourceInformation(composer, "C306@13913L7,*311@14074L7,322@14502L56,323@14586L63,325@14659L165,332@14833L170,340@15025L24,341@15081L944,365@16095L809,365@16048L856,405@17826L63,413@18103L65,418@18258L340:Slider.kt#jmzs0o");
        if ((((i & 14) == 0 ? i | (composer.changed(BoxWithConstraints) ? 4 : 2) : i) & 91) != 18 || !composer.getSkipping()) {
            androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.unit.LayoutDirection> localLayoutDirection = androidx.compose.ui.platform.CompositionLocalsKt.getLocalLayoutDirection();
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "C:CompositionLocal.kt#9igjgp");
            java.lang.Object consume = composer.consume(localLayoutDirection);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer);
            boolean z = consume == androidx.compose.ui.unit.LayoutDirection.Rtl;
            float m4424getMaxWidthimpl = androidx.compose.ui.unit.Constraints.m4424getMaxWidthimpl(BoxWithConstraints.mo504getConstraintsmsEJaDk());
            final kotlin.jvm.internal.Ref.FloatRef floatRef = new kotlin.jvm.internal.Ref.FloatRef();
            final kotlin.jvm.internal.Ref.FloatRef floatRef2 = new kotlin.jvm.internal.Ref.FloatRef();
            androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.unit.Density> localDensity = androidx.compose.ui.platform.CompositionLocalsKt.getLocalDensity();
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "C:CompositionLocal.kt#9igjgp");
            java.lang.Object consume2 = composer.consume(localDensity);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer);
            androidx.compose.ui.unit.Density density = (androidx.compose.ui.unit.Density) consume2;
            floatRef.element = m4424getMaxWidthimpl - density.mo315toPx0680j_4(androidx.compose.material.SliderKt.getThumbRadius());
            floatRef2.element = density.mo315toPx0680j_4(androidx.compose.material.SliderKt.getThumbRadius());
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
            kotlin.ranges.ClosedFloatingPointRange<java.lang.Float> closedFloatingPointRange = this.$values;
            kotlin.ranges.ClosedFloatingPointRange<java.lang.Float> closedFloatingPointRange2 = this.$valueRange;
            composer.startReplaceableGroup(-492369756);
            androidx.compose.runtime.ComposerKt.sourceInformation(composer, "C(remember):Composables.kt#9igjgp");
            java.lang.Object rememberedValue = composer.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(java.lang.Float.valueOf(invoke$scaleToOffset(closedFloatingPointRange2, floatRef2, floatRef, closedFloatingPointRange.getStart().floatValue())), null, 2, null);
                composer.updateRememberedValue(rememberedValue);
            }
            composer.endReplaceableGroup();
            final androidx.compose.runtime.MutableState mutableState = (androidx.compose.runtime.MutableState) rememberedValue;
            kotlin.ranges.ClosedFloatingPointRange<java.lang.Float> closedFloatingPointRange3 = this.$values;
            kotlin.ranges.ClosedFloatingPointRange<java.lang.Float> closedFloatingPointRange4 = this.$valueRange;
            composer.startReplaceableGroup(-492369756);
            androidx.compose.runtime.ComposerKt.sourceInformation(composer, "C(remember):Composables.kt#9igjgp");
            java.lang.Object rememberedValue2 = composer.rememberedValue();
            if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(java.lang.Float.valueOf(invoke$scaleToOffset(closedFloatingPointRange4, floatRef2, floatRef, closedFloatingPointRange3.getEndInclusive().floatValue())), null, 2, null);
                composer.updateRememberedValue(rememberedValue2);
            }
            composer.endReplaceableGroup();
            final androidx.compose.runtime.MutableState mutableState2 = (androidx.compose.runtime.MutableState) rememberedValue2;
            androidx.compose.material.SliderKt.CorrectValueSideEffect(new androidx.compose.material.SliderKt$RangeSlider$2.AnonymousClass2(this.$valueRange, floatRef2, floatRef), this.$valueRange, kotlin.ranges.RangesKt.rangeTo(floatRef2.element, floatRef.element), mutableState, this.$values.getStart().floatValue(), composer, ((this.$$dirty >> 9) & 112) | 3072);
            androidx.compose.material.SliderKt.CorrectValueSideEffect(new androidx.compose.material.SliderKt$RangeSlider$2.AnonymousClass3(this.$valueRange, floatRef2, floatRef), this.$valueRange, kotlin.ranges.RangesKt.rangeTo(floatRef2.element, floatRef.element), mutableState2, this.$values.getEndInclusive().floatValue(), composer, ((this.$$dirty >> 9) & 112) | 3072);
            composer.startReplaceableGroup(773894976);
            androidx.compose.runtime.ComposerKt.sourceInformation(composer, "C(rememberCoroutineScope)475@19849L144:Effects.kt#9igjgp");
            composer.startReplaceableGroup(-492369756);
            androidx.compose.runtime.ComposerKt.sourceInformation(composer, "C(remember):Composables.kt#9igjgp");
            java.lang.Object rememberedValue3 = composer.rememberedValue();
            if (rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                java.lang.Object compositionScopedCoroutineScopeCanceller = new androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller(androidx.compose.runtime.EffectsKt.createCompositionCoroutineScope(kotlin.coroutines.EmptyCoroutineContext.INSTANCE, composer));
                composer.updateRememberedValue(compositionScopedCoroutineScopeCanceller);
                rememberedValue3 = compositionScopedCoroutineScopeCanceller;
            }
            composer.endReplaceableGroup();
            final kotlinx.coroutines.CoroutineScope coroutineScope = ((androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller) rememberedValue3).getCoroutineScope();
            composer.endReplaceableGroup();
            final java.util.List<java.lang.Float> list = this.$tickFractions;
            final kotlin.jvm.functions.Function0<kotlin.Unit> function0 = this.$onValueChangeFinished;
            final androidx.compose.runtime.State<kotlin.jvm.functions.Function1<kotlin.ranges.ClosedFloatingPointRange<java.lang.Float>, kotlin.Unit>> state = this.$onValueChangeState;
            final kotlin.ranges.ClosedFloatingPointRange<java.lang.Float> closedFloatingPointRange5 = this.$valueRange;
            androidx.compose.runtime.State rememberUpdatedState = androidx.compose.runtime.SnapshotStateKt.rememberUpdatedState(new kotlin.jvm.functions.Function1<java.lang.Boolean, kotlin.Unit>() { // from class: androidx.compose.material.SliderKt$RangeSlider$2$gestureEndAction$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ kotlin.Unit invoke(java.lang.Boolean bool) {
                    invoke(bool.booleanValue());
                    return kotlin.Unit.INSTANCE;
                }

                public final void invoke(boolean z2) {
                    float snapValueToTick;
                    float floatValue = (z2 ? mutableState : mutableState2).getValue().floatValue();
                    snapValueToTick = androidx.compose.material.SliderKt.snapValueToTick(floatValue, list, floatRef2.element, floatRef.element);
                    if (floatValue != snapValueToTick) {
                        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new androidx.compose.material.SliderKt$RangeSlider$2$gestureEndAction$1.AnonymousClass1(floatValue, snapValueToTick, function0, z2, mutableState, mutableState2, state, floatRef2, floatRef, closedFloatingPointRange5, null), 3, null);
                        return;
                    }
                    kotlin.jvm.functions.Function0<kotlin.Unit> function02 = function0;
                    if (function02 != null) {
                        function02.invoke();
                    }
                }

                /* compiled from: Slider.kt */
                @kotlin.Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
                @kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.material.SliderKt$RangeSlider$2$gestureEndAction$1$1", f = "Slider.kt", i = {}, l = {352}, m = "invokeSuspend", n = {}, s = {})
                /* renamed from: androidx.compose.material.SliderKt$RangeSlider$2$gestureEndAction$1$1, reason: invalid class name */
                static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
                    final /* synthetic */ float $current;
                    final /* synthetic */ boolean $isStart;
                    final /* synthetic */ kotlin.jvm.internal.Ref.FloatRef $maxPx;
                    final /* synthetic */ kotlin.jvm.internal.Ref.FloatRef $minPx;
                    final /* synthetic */ kotlin.jvm.functions.Function0<kotlin.Unit> $onValueChangeFinished;
                    final /* synthetic */ androidx.compose.runtime.State<kotlin.jvm.functions.Function1<kotlin.ranges.ClosedFloatingPointRange<java.lang.Float>, kotlin.Unit>> $onValueChangeState;
                    final /* synthetic */ androidx.compose.runtime.MutableState<java.lang.Float> $rawOffsetEnd;
                    final /* synthetic */ androidx.compose.runtime.MutableState<java.lang.Float> $rawOffsetStart;
                    final /* synthetic */ float $target;
                    final /* synthetic */ kotlin.ranges.ClosedFloatingPointRange<java.lang.Float> $valueRange;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    AnonymousClass1(float f, float f2, kotlin.jvm.functions.Function0<kotlin.Unit> function0, boolean z, androidx.compose.runtime.MutableState<java.lang.Float> mutableState, androidx.compose.runtime.MutableState<java.lang.Float> mutableState2, androidx.compose.runtime.State<? extends kotlin.jvm.functions.Function1<? super kotlin.ranges.ClosedFloatingPointRange<java.lang.Float>, kotlin.Unit>> state, kotlin.jvm.internal.Ref.FloatRef floatRef, kotlin.jvm.internal.Ref.FloatRef floatRef2, kotlin.ranges.ClosedFloatingPointRange<java.lang.Float> closedFloatingPointRange, kotlin.coroutines.Continuation<? super androidx.compose.material.SliderKt$RangeSlider$2$gestureEndAction$1.AnonymousClass1> continuation) {
                        super(2, continuation);
                        this.$current = f;
                        this.$target = f2;
                        this.$onValueChangeFinished = function0;
                        this.$isStart = z;
                        this.$rawOffsetStart = mutableState;
                        this.$rawOffsetEnd = mutableState2;
                        this.$onValueChangeState = state;
                        this.$minPx = floatRef;
                        this.$maxPx = floatRef2;
                        this.$valueRange = closedFloatingPointRange;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
                        return new androidx.compose.material.SliderKt$RangeSlider$2$gestureEndAction$1.AnonymousClass1(this.$current, this.$target, this.$onValueChangeFinished, this.$isStart, this.$rawOffsetStart, this.$rawOffsetEnd, this.$onValueChangeState, this.$minPx, this.$maxPx, this.$valueRange, continuation);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
                        return ((androidx.compose.material.SliderKt$RangeSlider$2$gestureEndAction$1.AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                        androidx.compose.animation.core.TweenSpec tweenSpec;
                        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        int i = this.label;
                        if (i == 0) {
                            kotlin.ResultKt.throwOnFailure(obj);
                            androidx.compose.animation.core.Animatable Animatable$default = androidx.compose.animation.core.AnimatableKt.Animatable$default(this.$current, 0.0f, 2, null);
                            java.lang.Float boxFloat = kotlin.coroutines.jvm.internal.Boxing.boxFloat(this.$target);
                            tweenSpec = androidx.compose.material.SliderKt.SliderToTickAnimation;
                            java.lang.Float boxFloat2 = kotlin.coroutines.jvm.internal.Boxing.boxFloat(0.0f);
                            final boolean z = this.$isStart;
                            final androidx.compose.runtime.MutableState<java.lang.Float> mutableState = this.$rawOffsetStart;
                            final androidx.compose.runtime.MutableState<java.lang.Float> mutableState2 = this.$rawOffsetEnd;
                            final androidx.compose.runtime.State<kotlin.jvm.functions.Function1<kotlin.ranges.ClosedFloatingPointRange<java.lang.Float>, kotlin.Unit>> state = this.$onValueChangeState;
                            final kotlin.jvm.internal.Ref.FloatRef floatRef = this.$minPx;
                            final kotlin.jvm.internal.Ref.FloatRef floatRef2 = this.$maxPx;
                            final kotlin.ranges.ClosedFloatingPointRange<java.lang.Float> closedFloatingPointRange = this.$valueRange;
                            this.label = 1;
                            if (Animatable$default.animateTo(boxFloat, tweenSpec, boxFloat2, new kotlin.jvm.functions.Function1<androidx.compose.animation.core.Animatable<java.lang.Float, androidx.compose.animation.core.AnimationVector1D>, kotlin.Unit>() { // from class: androidx.compose.material.SliderKt.RangeSlider.2.gestureEndAction.1.1.1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.animation.core.Animatable<java.lang.Float, androidx.compose.animation.core.AnimationVector1D> animatable) {
                                    invoke2(animatable);
                                    return kotlin.Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(androidx.compose.animation.core.Animatable<java.lang.Float, androidx.compose.animation.core.AnimationVector1D> animateTo) {
                                    kotlin.ranges.ClosedFloatingPointRange<java.lang.Float> invoke$scaleToUserValue;
                                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(animateTo, "$this$animateTo");
                                    (z ? mutableState : mutableState2).setValue(animateTo.getValue());
                                    kotlin.jvm.functions.Function1<kotlin.ranges.ClosedFloatingPointRange<java.lang.Float>, kotlin.Unit> value = state.getValue();
                                    invoke$scaleToUserValue = androidx.compose.material.SliderKt$RangeSlider$2.invoke$scaleToUserValue(floatRef, floatRef2, closedFloatingPointRange, kotlin.ranges.RangesKt.rangeTo(mutableState.getValue().floatValue(), mutableState2.getValue().floatValue()));
                                    value.invoke(invoke$scaleToUserValue);
                                }
                            }, this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        } else {
                            if (i != 1) {
                                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            kotlin.ResultKt.throwOnFailure(obj);
                        }
                        kotlin.jvm.functions.Function0<kotlin.Unit> function0 = this.$onValueChangeFinished;
                        if (function0 != null) {
                            function0.invoke();
                        }
                        return kotlin.Unit.INSTANCE;
                    }
                }
            }, composer, 0);
            java.lang.Object obj = this.$valueRange;
            java.lang.Object valueOf = java.lang.Float.valueOf(floatRef2.element);
            java.lang.Object valueOf2 = java.lang.Float.valueOf(floatRef.element);
            final kotlin.ranges.ClosedFloatingPointRange<java.lang.Float> closedFloatingPointRange6 = this.$values;
            final androidx.compose.runtime.State<kotlin.jvm.functions.Function1<kotlin.ranges.ClosedFloatingPointRange<java.lang.Float>, kotlin.Unit>> state2 = this.$onValueChangeState;
            java.lang.Object[] objArr = {mutableState, mutableState2, obj, valueOf, valueOf2, closedFloatingPointRange6, state2};
            final kotlin.ranges.ClosedFloatingPointRange<java.lang.Float> closedFloatingPointRange7 = this.$valueRange;
            composer.startReplaceableGroup(-568225417);
            androidx.compose.runtime.ComposerKt.sourceInformation(composer, "C(remember)P(1):Composables.kt#9igjgp");
            boolean z2 = false;
            for (int i2 = 0; i2 < 7; i2++) {
                z2 |= composer.changed(objArr[i2]);
            }
            java.lang.Object rememberedValue4 = composer.rememberedValue();
            if (z2 || rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue4 = (kotlin.jvm.functions.Function2) new kotlin.jvm.functions.Function2<java.lang.Boolean, java.lang.Float, kotlin.Unit>() { // from class: androidx.compose.material.SliderKt$RangeSlider$2$onDrag$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ kotlin.Unit invoke(java.lang.Boolean bool, java.lang.Float f) {
                        invoke(bool.booleanValue(), f.floatValue());
                        return kotlin.Unit.INSTANCE;
                    }

                    public final void invoke(boolean z3, float f) {
                        kotlin.ranges.ClosedFloatingPointRange<java.lang.Float> rangeTo;
                        kotlin.ranges.ClosedFloatingPointRange<java.lang.Float> invoke$scaleToUserValue;
                        if (z3) {
                            androidx.compose.runtime.MutableState<java.lang.Float> mutableState3 = mutableState;
                            mutableState3.setValue(java.lang.Float.valueOf(mutableState3.getValue().floatValue() + f));
                            mutableState2.setValue(java.lang.Float.valueOf(androidx.compose.material.SliderKt$RangeSlider$2.invoke$scaleToOffset(closedFloatingPointRange7, floatRef2, floatRef, closedFloatingPointRange6.getEndInclusive().floatValue())));
                            float floatValue = mutableState2.getValue().floatValue();
                            rangeTo = kotlin.ranges.RangesKt.rangeTo(kotlin.ranges.RangesKt.coerceIn(mutableState.getValue().floatValue(), floatRef2.element, floatValue), floatValue);
                        } else {
                            androidx.compose.runtime.MutableState<java.lang.Float> mutableState4 = mutableState2;
                            mutableState4.setValue(java.lang.Float.valueOf(mutableState4.getValue().floatValue() + f));
                            mutableState.setValue(java.lang.Float.valueOf(androidx.compose.material.SliderKt$RangeSlider$2.invoke$scaleToOffset(closedFloatingPointRange7, floatRef2, floatRef, closedFloatingPointRange6.getStart().floatValue())));
                            float floatValue2 = mutableState.getValue().floatValue();
                            rangeTo = kotlin.ranges.RangesKt.rangeTo(floatValue2, kotlin.ranges.RangesKt.coerceIn(mutableState2.getValue().floatValue(), floatValue2, floatRef.element));
                        }
                        kotlin.jvm.functions.Function1<kotlin.ranges.ClosedFloatingPointRange<java.lang.Float>, kotlin.Unit> value = state2.getValue();
                        invoke$scaleToUserValue = androidx.compose.material.SliderKt$RangeSlider$2.invoke$scaleToUserValue(floatRef2, floatRef, closedFloatingPointRange7, rangeTo);
                        value.invoke(invoke$scaleToUserValue);
                    }
                };
                composer.updateRememberedValue(rememberedValue4);
            }
            composer.endReplaceableGroup();
            rangeSliderPressDragModifier = androidx.compose.material.SliderKt.rangeSliderPressDragModifier(androidx.compose.ui.Modifier.INSTANCE, this.$startInteractionSource, this.$endInteractionSource, mutableState, mutableState2, this.$enabled, z, m4424getMaxWidthimpl, this.$valueRange, rememberUpdatedState, androidx.compose.runtime.SnapshotStateKt.rememberUpdatedState(rememberedValue4, composer, 0));
            final float coerceIn = kotlin.ranges.RangesKt.coerceIn(this.$values.getStart().floatValue(), this.$valueRange.getStart().floatValue(), this.$values.getEndInclusive().floatValue());
            final float coerceIn2 = kotlin.ranges.RangesKt.coerceIn(this.$values.getEndInclusive().floatValue(), this.$values.getStart().floatValue(), this.$valueRange.getEndInclusive().floatValue());
            calcFraction = androidx.compose.material.SliderKt.calcFraction(this.$valueRange.getStart().floatValue(), this.$valueRange.getEndInclusive().floatValue(), coerceIn);
            calcFraction2 = androidx.compose.material.SliderKt.calcFraction(this.$valueRange.getStart().floatValue(), this.$valueRange.getEndInclusive().floatValue(), coerceIn2);
            androidx.compose.ui.Modifier.Companion companion = androidx.compose.ui.Modifier.INSTANCE;
            java.util.List<java.lang.Float> list2 = this.$tickFractions;
            boolean z3 = this.$enabled;
            java.lang.Object obj2 = this.$onValueChangeState;
            java.lang.Object valueOf3 = java.lang.Float.valueOf(coerceIn2);
            final androidx.compose.runtime.State<kotlin.jvm.functions.Function1<kotlin.ranges.ClosedFloatingPointRange<java.lang.Float>, kotlin.Unit>> state3 = this.$onValueChangeState;
            composer.startReplaceableGroup(511388516);
            androidx.compose.runtime.ComposerKt.sourceInformation(composer, "C(remember)P(1,2):Composables.kt#9igjgp");
            boolean changed = composer.changed(obj2) | composer.changed(valueOf3);
            java.lang.Object rememberedValue5 = composer.rememberedValue();
            if (changed || rememberedValue5 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue5 = (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<java.lang.Float, kotlin.Unit>() { // from class: androidx.compose.material.SliderKt$RangeSlider$2$startThumbSemantics$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ kotlin.Unit invoke(java.lang.Float f) {
                        invoke(f.floatValue());
                        return kotlin.Unit.INSTANCE;
                    }

                    public final void invoke(float f) {
                        state3.getValue().invoke(kotlin.ranges.RangesKt.rangeTo(f, coerceIn2));
                    }
                };
                composer.updateRememberedValue(rememberedValue5);
            }
            composer.endReplaceableGroup();
            sliderSemantics = androidx.compose.material.SliderKt.sliderSemantics(companion, coerceIn, list2, z3, (kotlin.jvm.functions.Function1) rememberedValue5, kotlin.ranges.RangesKt.rangeTo(this.$valueRange.getStart().floatValue(), coerceIn2), this.$steps);
            androidx.compose.ui.Modifier.Companion companion2 = androidx.compose.ui.Modifier.INSTANCE;
            java.util.List<java.lang.Float> list3 = this.$tickFractions;
            boolean z4 = this.$enabled;
            java.lang.Object obj3 = this.$onValueChangeState;
            java.lang.Object valueOf4 = java.lang.Float.valueOf(coerceIn);
            final androidx.compose.runtime.State<kotlin.jvm.functions.Function1<kotlin.ranges.ClosedFloatingPointRange<java.lang.Float>, kotlin.Unit>> state4 = this.$onValueChangeState;
            composer.startReplaceableGroup(511388516);
            androidx.compose.runtime.ComposerKt.sourceInformation(composer, "C(remember)P(1,2):Composables.kt#9igjgp");
            boolean changed2 = composer.changed(obj3) | composer.changed(valueOf4);
            java.lang.Object rememberedValue6 = composer.rememberedValue();
            if (changed2 || rememberedValue6 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue6 = (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<java.lang.Float, kotlin.Unit>() { // from class: androidx.compose.material.SliderKt$RangeSlider$2$endThumbSemantics$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ kotlin.Unit invoke(java.lang.Float f) {
                        invoke(f.floatValue());
                        return kotlin.Unit.INSTANCE;
                    }

                    public final void invoke(float f) {
                        state4.getValue().invoke(kotlin.ranges.RangesKt.rangeTo(coerceIn, f));
                    }
                };
                composer.updateRememberedValue(rememberedValue6);
            }
            composer.endReplaceableGroup();
            sliderSemantics2 = androidx.compose.material.SliderKt.sliderSemantics(companion2, coerceIn2, list3, z4, (kotlin.jvm.functions.Function1) rememberedValue6, kotlin.ranges.RangesKt.rangeTo(coerceIn, this.$valueRange.getEndInclusive().floatValue()), this.$steps);
            boolean z5 = this.$enabled;
            java.util.List<java.lang.Float> list4 = this.$tickFractions;
            androidx.compose.material.SliderColors sliderColors = this.$colors;
            float f = floatRef.element - floatRef2.element;
            androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource = this.$startInteractionSource;
            androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource2 = this.$endInteractionSource;
            int i3 = this.$$dirty;
            androidx.compose.material.SliderKt.RangeSliderImpl(z5, calcFraction, calcFraction2, list4, sliderColors, f, mutableInteractionSource, mutableInteractionSource2, rangeSliderPressDragModifier, sliderSemantics, sliderSemantics2, composer, ((i3 >> 9) & 14) | 14159872 | ((i3 >> 9) & 57344), 0);
            return;
        }
        composer.skipToGroupEnd();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.ranges.ClosedFloatingPointRange<java.lang.Float> invoke$scaleToUserValue(kotlin.jvm.internal.Ref.FloatRef floatRef, kotlin.jvm.internal.Ref.FloatRef floatRef2, kotlin.ranges.ClosedFloatingPointRange<java.lang.Float> closedFloatingPointRange, kotlin.ranges.ClosedFloatingPointRange<java.lang.Float> closedFloatingPointRange2) {
        kotlin.ranges.ClosedFloatingPointRange<java.lang.Float> scale;
        scale = androidx.compose.material.SliderKt.scale(floatRef.element, floatRef2.element, (kotlin.ranges.ClosedFloatingPointRange<java.lang.Float>) closedFloatingPointRange2, closedFloatingPointRange.getStart().floatValue(), closedFloatingPointRange.getEndInclusive().floatValue());
        return scale;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float invoke$scaleToOffset(kotlin.ranges.ClosedFloatingPointRange<java.lang.Float> closedFloatingPointRange, kotlin.jvm.internal.Ref.FloatRef floatRef, kotlin.jvm.internal.Ref.FloatRef floatRef2, float f) {
        float scale;
        scale = androidx.compose.material.SliderKt.scale(closedFloatingPointRange.getStart().floatValue(), closedFloatingPointRange.getEndInclusive().floatValue(), f, floatRef.element, floatRef2.element);
        return scale;
    }

    /* compiled from: Slider.kt */
    @kotlin.Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    /* renamed from: androidx.compose.material.SliderKt$RangeSlider$2$2, reason: invalid class name */
    /* synthetic */ class AnonymousClass2 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function1<java.lang.Float, java.lang.Float> {
        final /* synthetic */ kotlin.jvm.internal.Ref.FloatRef $maxPx;
        final /* synthetic */ kotlin.jvm.internal.Ref.FloatRef $minPx;
        final /* synthetic */ kotlin.ranges.ClosedFloatingPointRange<java.lang.Float> $valueRange;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(kotlin.ranges.ClosedFloatingPointRange<java.lang.Float> closedFloatingPointRange, kotlin.jvm.internal.Ref.FloatRef floatRef, kotlin.jvm.internal.Ref.FloatRef floatRef2) {
            super(1, kotlin.jvm.internal.Intrinsics.Kotlin.class, "scaleToOffset", "invoke$scaleToOffset(Lkotlin/ranges/ClosedFloatingPointRange;Lkotlin/jvm/internal/Ref$FloatRef;Lkotlin/jvm/internal/Ref$FloatRef;F)F", 0);
            this.$valueRange = closedFloatingPointRange;
            this.$minPx = floatRef;
            this.$maxPx = floatRef2;
        }

        public final java.lang.Float invoke(float f) {
            return java.lang.Float.valueOf(androidx.compose.material.SliderKt$RangeSlider$2.invoke$scaleToOffset(this.$valueRange, this.$minPx, this.$maxPx, f));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ java.lang.Float invoke(java.lang.Float f) {
            return invoke(f.floatValue());
        }
    }

    /* compiled from: Slider.kt */
    @kotlin.Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    /* renamed from: androidx.compose.material.SliderKt$RangeSlider$2$3, reason: invalid class name */
    /* synthetic */ class AnonymousClass3 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function1<java.lang.Float, java.lang.Float> {
        final /* synthetic */ kotlin.jvm.internal.Ref.FloatRef $maxPx;
        final /* synthetic */ kotlin.jvm.internal.Ref.FloatRef $minPx;
        final /* synthetic */ kotlin.ranges.ClosedFloatingPointRange<java.lang.Float> $valueRange;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass3(kotlin.ranges.ClosedFloatingPointRange<java.lang.Float> closedFloatingPointRange, kotlin.jvm.internal.Ref.FloatRef floatRef, kotlin.jvm.internal.Ref.FloatRef floatRef2) {
            super(1, kotlin.jvm.internal.Intrinsics.Kotlin.class, "scaleToOffset", "invoke$scaleToOffset(Lkotlin/ranges/ClosedFloatingPointRange;Lkotlin/jvm/internal/Ref$FloatRef;Lkotlin/jvm/internal/Ref$FloatRef;F)F", 0);
            this.$valueRange = closedFloatingPointRange;
            this.$minPx = floatRef;
            this.$maxPx = floatRef2;
        }

        public final java.lang.Float invoke(float f) {
            return java.lang.Float.valueOf(androidx.compose.material.SliderKt$RangeSlider$2.invoke$scaleToOffset(this.$valueRange, this.$minPx, this.$maxPx, f));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ java.lang.Float invoke(java.lang.Float f) {
            return invoke(f.floatValue());
        }
    }
}
