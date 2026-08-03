package androidx.compose.material;

/* compiled from: Slider.kt */
@kotlin.Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
final class SliderKt$Slider$3 extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function3<androidx.compose.foundation.layout.BoxWithConstraintsScope, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ androidx.compose.material.SliderColors $colors;
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ androidx.compose.foundation.interaction.MutableInteractionSource $interactionSource;
    final /* synthetic */ kotlin.jvm.functions.Function0<kotlin.Unit> $onValueChangeFinished;
    final /* synthetic */ androidx.compose.runtime.State<kotlin.jvm.functions.Function1<java.lang.Float, kotlin.Unit>> $onValueChangeState;
    final /* synthetic */ java.util.List<java.lang.Float> $tickFractions;
    final /* synthetic */ float $value;
    final /* synthetic */ kotlin.ranges.ClosedFloatingPointRange<java.lang.Float> $valueRange;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    SliderKt$Slider$3(kotlin.ranges.ClosedFloatingPointRange<java.lang.Float> closedFloatingPointRange, int i, float f, androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource, boolean z, java.util.List<java.lang.Float> list, androidx.compose.material.SliderColors sliderColors, androidx.compose.runtime.State<? extends kotlin.jvm.functions.Function1<? super java.lang.Float, kotlin.Unit>> state, kotlin.jvm.functions.Function0<kotlin.Unit> function0) {
        super(3);
        this.$valueRange = closedFloatingPointRange;
        this.$$dirty = i;
        this.$value = f;
        this.$interactionSource = mutableInteractionSource;
        this.$enabled = z;
        this.$tickFractions = list;
        this.$colors = sliderColors;
        this.$onValueChangeState = state;
        this.$onValueChangeFinished = function0;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.foundation.layout.BoxWithConstraintsScope boxWithConstraintsScope, androidx.compose.runtime.Composer composer, java.lang.Integer num) {
        invoke(boxWithConstraintsScope, composer, num.intValue());
        return kotlin.Unit.INSTANCE;
    }

    public final void invoke(androidx.compose.foundation.layout.BoxWithConstraintsScope BoxWithConstraints, androidx.compose.runtime.Composer composer, int i) {
        int i2;
        androidx.compose.ui.Modifier sliderTapModifier;
        androidx.compose.ui.Modifier draggable;
        float calcFraction;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(BoxWithConstraints, "$this$BoxWithConstraints");
        androidx.compose.runtime.ComposerKt.sourceInformation(composer, "C167@8011L7,*172@8172L7,183@8586L24,184@8635L49,185@8711L31,187@8773L367,196@9150L83,198@9266L618,227@10378L55,234@10719L209:Slider.kt#jmzs0o");
        if ((i & 14) == 0) {
            i2 = i | (composer.changed(BoxWithConstraints) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i2 & 91) != 18 || !composer.getSkipping()) {
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
            floatRef.element = java.lang.Math.max(m4424getMaxWidthimpl - density.mo315toPx0680j_4(androidx.compose.material.SliderKt.getThumbRadius()), 0.0f);
            floatRef2.element = java.lang.Math.min(density.mo315toPx0680j_4(androidx.compose.material.SliderKt.getThumbRadius()), floatRef.element);
            composer.startReplaceableGroup(773894976);
            androidx.compose.runtime.ComposerKt.sourceInformation(composer, "C(rememberCoroutineScope)475@19849L144:Effects.kt#9igjgp");
            composer.startReplaceableGroup(-492369756);
            androidx.compose.runtime.ComposerKt.sourceInformation(composer, "C(remember):Composables.kt#9igjgp");
            java.lang.Object rememberedValue = composer.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                java.lang.Object compositionScopedCoroutineScopeCanceller = new androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller(androidx.compose.runtime.EffectsKt.createCompositionCoroutineScope(kotlin.coroutines.EmptyCoroutineContext.INSTANCE, composer));
                composer.updateRememberedValue(compositionScopedCoroutineScopeCanceller);
                rememberedValue = compositionScopedCoroutineScopeCanceller;
            }
            composer.endReplaceableGroup();
            final kotlinx.coroutines.CoroutineScope coroutineScope = ((androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller) rememberedValue).getCoroutineScope();
            composer.endReplaceableGroup();
            float f = this.$value;
            kotlin.ranges.ClosedFloatingPointRange<java.lang.Float> closedFloatingPointRange = this.$valueRange;
            composer.startReplaceableGroup(-492369756);
            androidx.compose.runtime.ComposerKt.sourceInformation(composer, "C(remember):Composables.kt#9igjgp");
            java.lang.Object rememberedValue2 = composer.rememberedValue();
            if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(java.lang.Float.valueOf(invoke$scaleToOffset(closedFloatingPointRange, floatRef2, floatRef, f)), null, 2, null);
                composer.updateRememberedValue(rememberedValue2);
            }
            composer.endReplaceableGroup();
            final androidx.compose.runtime.MutableState mutableState = (androidx.compose.runtime.MutableState) rememberedValue2;
            composer.startReplaceableGroup(-492369756);
            androidx.compose.runtime.ComposerKt.sourceInformation(composer, "C(remember):Composables.kt#9igjgp");
            java.lang.Object rememberedValue3 = composer.rememberedValue();
            if (rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(java.lang.Float.valueOf(0.0f), null, 2, null);
                composer.updateRememberedValue(rememberedValue3);
            }
            composer.endReplaceableGroup();
            final androidx.compose.runtime.MutableState mutableState2 = (androidx.compose.runtime.MutableState) rememberedValue3;
            java.lang.Object valueOf = java.lang.Float.valueOf(floatRef2.element);
            java.lang.Object valueOf2 = java.lang.Float.valueOf(floatRef.element);
            final kotlin.ranges.ClosedFloatingPointRange<java.lang.Float> closedFloatingPointRange2 = this.$valueRange;
            final androidx.compose.runtime.State<kotlin.jvm.functions.Function1<java.lang.Float, kotlin.Unit>> state = this.$onValueChangeState;
            composer.startReplaceableGroup(1618982084);
            androidx.compose.runtime.ComposerKt.sourceInformation(composer, "C(remember)P(1,2,3):Composables.kt#9igjgp");
            boolean changed = composer.changed(valueOf) | composer.changed(valueOf2) | composer.changed(closedFloatingPointRange2);
            java.lang.Object rememberedValue4 = composer.rememberedValue();
            if (changed || rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue4 = new androidx.compose.material.SliderDraggableState(new kotlin.jvm.functions.Function1<java.lang.Float, kotlin.Unit>() { // from class: androidx.compose.material.SliderKt$Slider$3$draggableState$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ kotlin.Unit invoke(java.lang.Float f2) {
                        invoke(f2.floatValue());
                        return kotlin.Unit.INSTANCE;
                    }

                    public final void invoke(float f2) {
                        float invoke$scaleToUserValue;
                        androidx.compose.runtime.MutableState<java.lang.Float> mutableState3 = mutableState;
                        mutableState3.setValue(java.lang.Float.valueOf(mutableState3.getValue().floatValue() + f2 + mutableState2.getValue().floatValue()));
                        mutableState2.setValue(java.lang.Float.valueOf(0.0f));
                        float coerceIn = kotlin.ranges.RangesKt.coerceIn(mutableState.getValue().floatValue(), floatRef2.element, floatRef.element);
                        kotlin.jvm.functions.Function1<java.lang.Float, kotlin.Unit> value = state.getValue();
                        invoke$scaleToUserValue = androidx.compose.material.SliderKt$Slider$3.invoke$scaleToUserValue(floatRef2, floatRef, closedFloatingPointRange2, coerceIn);
                        value.invoke(java.lang.Float.valueOf(invoke$scaleToUserValue));
                    }
                });
                composer.updateRememberedValue(rememberedValue4);
            }
            composer.endReplaceableGroup();
            final androidx.compose.material.SliderDraggableState sliderDraggableState = (androidx.compose.material.SliderDraggableState) rememberedValue4;
            androidx.compose.material.SliderKt$Slider$3.AnonymousClass2 anonymousClass2 = new androidx.compose.material.SliderKt$Slider$3.AnonymousClass2(this.$valueRange, floatRef2, floatRef);
            kotlin.ranges.ClosedFloatingPointRange<java.lang.Float> closedFloatingPointRange3 = this.$valueRange;
            kotlin.ranges.ClosedFloatingPointRange<java.lang.Float> rangeTo = kotlin.ranges.RangesKt.rangeTo(floatRef2.element, floatRef.element);
            float f2 = this.$value;
            int i3 = this.$$dirty;
            androidx.compose.material.SliderKt.CorrectValueSideEffect(anonymousClass2, closedFloatingPointRange3, rangeTo, mutableState, f2, composer, ((i3 >> 9) & 112) | 3072 | ((i3 << 12) & 57344));
            final java.util.List<java.lang.Float> list = this.$tickFractions;
            final kotlin.jvm.functions.Function0<kotlin.Unit> function0 = this.$onValueChangeFinished;
            androidx.compose.runtime.State rememberUpdatedState = androidx.compose.runtime.SnapshotStateKt.rememberUpdatedState(new kotlin.jvm.functions.Function1<java.lang.Float, kotlin.Unit>() { // from class: androidx.compose.material.SliderKt$Slider$3$gestureEndAction$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ kotlin.Unit invoke(java.lang.Float f3) {
                    invoke(f3.floatValue());
                    return kotlin.Unit.INSTANCE;
                }

                public final void invoke(float f3) {
                    float snapValueToTick;
                    kotlin.jvm.functions.Function0<kotlin.Unit> function02;
                    float floatValue = mutableState.getValue().floatValue();
                    snapValueToTick = androidx.compose.material.SliderKt.snapValueToTick(floatValue, list, floatRef2.element, floatRef.element);
                    if (floatValue != snapValueToTick) {
                        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new androidx.compose.material.SliderKt$Slider$3$gestureEndAction$1.AnonymousClass1(sliderDraggableState, floatValue, snapValueToTick, f3, function0, null), 3, null);
                    } else {
                        if (sliderDraggableState.isDragging() || (function02 = function0) == null) {
                            return;
                        }
                        function02.invoke();
                    }
                }

                /* compiled from: Slider.kt */
                @kotlin.Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
                @kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.material.SliderKt$Slider$3$gestureEndAction$1$1", f = "Slider.kt", i = {}, l = {204}, m = "invokeSuspend", n = {}, s = {})
                /* renamed from: androidx.compose.material.SliderKt$Slider$3$gestureEndAction$1$1, reason: invalid class name */
                static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
                    final /* synthetic */ float $current;
                    final /* synthetic */ androidx.compose.material.SliderDraggableState $draggableState;
                    final /* synthetic */ kotlin.jvm.functions.Function0<kotlin.Unit> $onValueChangeFinished;
                    final /* synthetic */ float $target;
                    final /* synthetic */ float $velocity;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    AnonymousClass1(androidx.compose.material.SliderDraggableState sliderDraggableState, float f, float f2, float f3, kotlin.jvm.functions.Function0<kotlin.Unit> function0, kotlin.coroutines.Continuation<? super androidx.compose.material.SliderKt$Slider$3$gestureEndAction$1.AnonymousClass1> continuation) {
                        super(2, continuation);
                        this.$draggableState = sliderDraggableState;
                        this.$current = f;
                        this.$target = f2;
                        this.$velocity = f3;
                        this.$onValueChangeFinished = function0;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
                        return new androidx.compose.material.SliderKt$Slider$3$gestureEndAction$1.AnonymousClass1(this.$draggableState, this.$current, this.$target, this.$velocity, this.$onValueChangeFinished, continuation);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
                        return ((androidx.compose.material.SliderKt$Slider$3$gestureEndAction$1.AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                        java.lang.Object animateToTarget;
                        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        int i = this.label;
                        if (i == 0) {
                            kotlin.ResultKt.throwOnFailure(obj);
                            this.label = 1;
                            animateToTarget = androidx.compose.material.SliderKt.animateToTarget(this.$draggableState, this.$current, this.$target, this.$velocity, this);
                            if (animateToTarget == coroutine_suspended) {
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
            androidx.compose.material.SliderDraggableState sliderDraggableState2 = sliderDraggableState;
            sliderTapModifier = androidx.compose.material.SliderKt.sliderTapModifier(androidx.compose.ui.Modifier.INSTANCE, sliderDraggableState2, this.$interactionSource, m4424getMaxWidthimpl, z, mutableState, rememberUpdatedState, mutableState2, this.$enabled);
            androidx.compose.ui.Modifier.Companion companion = androidx.compose.ui.Modifier.INSTANCE;
            androidx.compose.foundation.gestures.Orientation orientation = androidx.compose.foundation.gestures.Orientation.Horizontal;
            boolean isDragging = sliderDraggableState.isDragging();
            androidx.compose.ui.Modifier.Companion companion2 = companion;
            boolean z2 = this.$enabled;
            androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource = this.$interactionSource;
            composer.startReplaceableGroup(1157296644);
            androidx.compose.runtime.ComposerKt.sourceInformation(composer, "C(remember)P(1):Composables.kt#9igjgp");
            boolean changed2 = composer.changed(rememberUpdatedState);
            java.lang.Object rememberedValue5 = composer.rememberedValue();
            if (changed2 || rememberedValue5 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue5 = (kotlin.jvm.functions.Function3) new androidx.compose.material.SliderKt$Slider$3$drag$1$1(rememberUpdatedState, null);
                composer.updateRememberedValue(rememberedValue5);
            }
            composer.endReplaceableGroup();
            draggable = androidx.compose.foundation.gestures.DraggableKt.draggable(companion2, sliderDraggableState2, orientation, (r20 & 4) != 0 ? true : z2, (r20 & 8) != 0 ? null : mutableInteractionSource, (r20 & 16) != 0 ? false : isDragging, (r20 & 32) != 0 ? new androidx.compose.foundation.gestures.DraggableKt$draggable$1(null) : null, (r20 & 64) != 0 ? new androidx.compose.foundation.gestures.DraggableKt$draggable$2(null) : (kotlin.jvm.functions.Function3) rememberedValue5, (r20 & 128) != 0 ? false : z);
            calcFraction = androidx.compose.material.SliderKt.calcFraction(this.$valueRange.getStart().floatValue(), this.$valueRange.getEndInclusive().floatValue(), kotlin.ranges.RangesKt.coerceIn(this.$value, this.$valueRange.getStart().floatValue(), this.$valueRange.getEndInclusive().floatValue()));
            boolean z3 = this.$enabled;
            java.util.List<java.lang.Float> list2 = this.$tickFractions;
            androidx.compose.material.SliderColors sliderColors = this.$colors;
            float f3 = floatRef.element - floatRef2.element;
            androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource2 = this.$interactionSource;
            androidx.compose.ui.Modifier then = sliderTapModifier.then(draggable);
            int i4 = this.$$dirty;
            androidx.compose.material.SliderKt.SliderImpl(z3, calcFraction, list2, sliderColors, f3, mutableInteractionSource2, then, composer, ((i4 >> 9) & 14) | 512 | ((i4 >> 15) & 7168) | ((i4 >> 6) & 458752));
            return;
        }
        composer.skipToGroupEnd();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float invoke$scaleToUserValue(kotlin.jvm.internal.Ref.FloatRef floatRef, kotlin.jvm.internal.Ref.FloatRef floatRef2, kotlin.ranges.ClosedFloatingPointRange<java.lang.Float> closedFloatingPointRange, float f) {
        float scale;
        scale = androidx.compose.material.SliderKt.scale(floatRef.element, floatRef2.element, f, closedFloatingPointRange.getStart().floatValue(), closedFloatingPointRange.getEndInclusive().floatValue());
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
    /* renamed from: androidx.compose.material.SliderKt$Slider$3$2, reason: invalid class name */
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
            return java.lang.Float.valueOf(androidx.compose.material.SliderKt$Slider$3.invoke$scaleToOffset(this.$valueRange, this.$minPx, this.$maxPx, f));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ java.lang.Float invoke(java.lang.Float f) {
            return invoke(f.floatValue());
        }
    }
}
