package androidx.compose.material;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.BoxWithConstraintsScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.ranges.ClosedFloatingPointRange;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: Slider.kt */
@Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
final class SliderKt$RangeSlider$2 extends Lambda implements Function3<BoxWithConstraintsScope, Composer, Integer, Unit> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ SliderColors $colors;
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ MutableInteractionSource $endInteractionSource;
    final /* synthetic */ Function0<Unit> $onValueChangeFinished;
    final /* synthetic */ State<Function1<ClosedFloatingPointRange<Float>, Unit>> $onValueChangeState;
    final /* synthetic */ MutableInteractionSource $startInteractionSource;
    final /* synthetic */ int $steps;
    final /* synthetic */ List<Float> $tickFractions;
    final /* synthetic */ ClosedFloatingPointRange<Float> $valueRange;
    final /* synthetic */ ClosedFloatingPointRange<Float> $values;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    SliderKt$RangeSlider$2(ClosedFloatingPointRange<Float> closedFloatingPointRange, ClosedFloatingPointRange<Float> closedFloatingPointRange2, int i, State<? extends Function1<? super ClosedFloatingPointRange<Float>, Unit>> state, MutableInteractionSource mutableInteractionSource, MutableInteractionSource mutableInteractionSource2, boolean z, List<Float> list, int i2, SliderColors sliderColors, Function0<Unit> function0) {
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
    public /* bridge */ /* synthetic */ Unit invoke(BoxWithConstraintsScope boxWithConstraintsScope, Composer composer, Integer num) {
        invoke(boxWithConstraintsScope, composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(BoxWithConstraintsScope BoxWithConstraints, Composer composer, int i) {
        Modifier rangeSliderPressDragModifier;
        float calcFraction;
        float calcFraction2;
        Modifier sliderSemantics;
        Modifier sliderSemantics2;
        Intrinsics.checkNotNullParameter(BoxWithConstraints, "$this$BoxWithConstraints");
        ComposerKt.sourceInformation(composer, "C306@13913L7,*311@14074L7,322@14502L56,323@14586L63,325@14659L165,332@14833L170,340@15025L24,341@15081L944,365@16095L809,365@16048L856,405@17826L63,413@18103L65,418@18258L340:Slider.kt#jmzs0o");
        if ((((i & 14) == 0 ? i | (composer.changed(BoxWithConstraints) ? 4 : 2) : i) & 91) != 18 || !composer.getSkipping()) {
            ProvidableCompositionLocal<LayoutDirection> localLayoutDirection = CompositionLocalsKt.getLocalLayoutDirection();
            ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "C:CompositionLocal.kt#9igjgp");
            Object consume = composer.consume(localLayoutDirection);
            ComposerKt.sourceInformationMarkerEnd(composer);
            boolean z = consume == LayoutDirection.Rtl;
            float m3796getMaxWidthimpl = Constraints.m3796getMaxWidthimpl(BoxWithConstraints.getConstraints());
            final Ref.FloatRef floatRef = new Ref.FloatRef();
            final Ref.FloatRef floatRef2 = new Ref.FloatRef();
            ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
            ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "C:CompositionLocal.kt#9igjgp");
            Object consume2 = composer.consume(localDensity);
            ComposerKt.sourceInformationMarkerEnd(composer);
            Density density = (Density) consume2;
            floatRef.element = m3796getMaxWidthimpl - density.mo315toPx0680j_4(SliderKt.getThumbRadius());
            floatRef2.element = density.mo315toPx0680j_4(SliderKt.getThumbRadius());
            Unit unit = Unit.INSTANCE;
            ClosedFloatingPointRange<Float> closedFloatingPointRange = this.$values;
            ClosedFloatingPointRange<Float> closedFloatingPointRange2 = this.$valueRange;
            composer.startReplaceableGroup(-492369756);
            ComposerKt.sourceInformation(composer, "C(remember):Composables.kt#9igjgp");
            Object rememberedValue = composer.rememberedValue();
            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Float.valueOf(invoke$scaleToOffset(closedFloatingPointRange2, floatRef2, floatRef, closedFloatingPointRange.getStart().floatValue())), null, 2, null);
                composer.updateRememberedValue(rememberedValue);
            }
            composer.endReplaceableGroup();
            final MutableState mutableState = (MutableState) rememberedValue;
            ClosedFloatingPointRange<Float> closedFloatingPointRange3 = this.$values;
            ClosedFloatingPointRange<Float> closedFloatingPointRange4 = this.$valueRange;
            composer.startReplaceableGroup(-492369756);
            ComposerKt.sourceInformation(composer, "C(remember):Composables.kt#9igjgp");
            Object rememberedValue2 = composer.rememberedValue();
            if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Float.valueOf(invoke$scaleToOffset(closedFloatingPointRange4, floatRef2, floatRef, closedFloatingPointRange3.getEndInclusive().floatValue())), null, 2, null);
                composer.updateRememberedValue(rememberedValue2);
            }
            composer.endReplaceableGroup();
            final MutableState mutableState2 = (MutableState) rememberedValue2;
            SliderKt.CorrectValueSideEffect(new AnonymousClass2(this.$valueRange, floatRef2, floatRef), this.$valueRange, RangesKt.rangeTo(floatRef2.element, floatRef.element), mutableState, this.$values.getStart().floatValue(), composer, ((this.$$dirty >> 9) & 112) | 3072);
            SliderKt.CorrectValueSideEffect(new AnonymousClass3(this.$valueRange, floatRef2, floatRef), this.$valueRange, RangesKt.rangeTo(floatRef2.element, floatRef.element), mutableState2, this.$values.getEndInclusive().floatValue(), composer, ((this.$$dirty >> 9) & 112) | 3072);
            composer.startReplaceableGroup(773894976);
            ComposerKt.sourceInformation(composer, "C(rememberCoroutineScope)475@19849L144:Effects.kt#9igjgp");
            composer.startReplaceableGroup(-492369756);
            ComposerKt.sourceInformation(composer, "C(remember):Composables.kt#9igjgp");
            Object rememberedValue3 = composer.rememberedValue();
            if (rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composer));
                composer.updateRememberedValue(compositionScopedCoroutineScopeCanceller);
                rememberedValue3 = compositionScopedCoroutineScopeCanceller;
            }
            composer.endReplaceableGroup();
            final CoroutineScope coroutineScope = ((CompositionScopedCoroutineScopeCanceller) rememberedValue3).getCoroutineScope();
            composer.endReplaceableGroup();
            final List<Float> list = this.$tickFractions;
            final Function0<Unit> function0 = this.$onValueChangeFinished;
            final State<Function1<ClosedFloatingPointRange<Float>, Unit>> state = this.$onValueChangeState;
            final ClosedFloatingPointRange<Float> closedFloatingPointRange5 = this.$valueRange;
            State rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(new Function1<Boolean, Unit>() { // from class: androidx.compose.material.SliderKt$RangeSlider$2$gestureEndAction$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
                    invoke(bool.booleanValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(boolean z2) {
                    float snapValueToTick;
                    float floatValue = (z2 ? mutableState : mutableState2).getValue().floatValue();
                    snapValueToTick = SliderKt.snapValueToTick(floatValue, list, floatRef2.element, floatRef.element);
                    if (floatValue != snapValueToTick) {
                        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass1(floatValue, snapValueToTick, function0, z2, mutableState, mutableState2, state, floatRef2, floatRef, closedFloatingPointRange5, null), 3, null);
                        return;
                    }
                    Function0<Unit> function02 = function0;
                    if (function02 != null) {
                        function02.invoke();
                    }
                }

                /* compiled from: Slider.kt */
                @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
                @DebugMetadata(c = "androidx.compose.material.SliderKt$RangeSlider$2$gestureEndAction$1$1", f = "Slider.kt", i = {}, l = {352}, m = "invokeSuspend", n = {}, s = {})
                /* renamed from: androidx.compose.material.SliderKt$RangeSlider$2$gestureEndAction$1$1, reason: invalid class name */
                static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                    final /* synthetic */ float $current;
                    final /* synthetic */ boolean $isStart;
                    final /* synthetic */ Ref.FloatRef $maxPx;
                    final /* synthetic */ Ref.FloatRef $minPx;
                    final /* synthetic */ Function0<Unit> $onValueChangeFinished;
                    final /* synthetic */ State<Function1<ClosedFloatingPointRange<Float>, Unit>> $onValueChangeState;
                    final /* synthetic */ MutableState<Float> $rawOffsetEnd;
                    final /* synthetic */ MutableState<Float> $rawOffsetStart;
                    final /* synthetic */ float $target;
                    final /* synthetic */ ClosedFloatingPointRange<Float> $valueRange;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    AnonymousClass1(float f, float f2, Function0<Unit> function0, boolean z, MutableState<Float> mutableState, MutableState<Float> mutableState2, State<? extends Function1<? super ClosedFloatingPointRange<Float>, Unit>> state, Ref.FloatRef floatRef, Ref.FloatRef floatRef2, ClosedFloatingPointRange<Float> closedFloatingPointRange, Continuation<? super AnonymousClass1> continuation) {
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
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        return new AnonymousClass1(this.$current, this.$target, this.$onValueChangeFinished, this.$isStart, this.$rawOffsetStart, this.$rawOffsetEnd, this.$onValueChangeState, this.$minPx, this.$maxPx, this.$valueRange, continuation);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                        return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        TweenSpec tweenSpec;
                        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        int i = this.label;
                        if (i == 0) {
                            ResultKt.throwOnFailure(obj);
                            Animatable Animatable$default = AnimatableKt.Animatable$default(this.$current, 0.0f, 2, null);
                            Float boxFloat = Boxing.boxFloat(this.$target);
                            tweenSpec = SliderKt.SliderToTickAnimation;
                            Float boxFloat2 = Boxing.boxFloat(0.0f);
                            final boolean z = this.$isStart;
                            final MutableState<Float> mutableState = this.$rawOffsetStart;
                            final MutableState<Float> mutableState2 = this.$rawOffsetEnd;
                            final State<Function1<ClosedFloatingPointRange<Float>, Unit>> state = this.$onValueChangeState;
                            final Ref.FloatRef floatRef = this.$minPx;
                            final Ref.FloatRef floatRef2 = this.$maxPx;
                            final ClosedFloatingPointRange<Float> closedFloatingPointRange = this.$valueRange;
                            this.label = 1;
                            if (Animatable$default.animateTo(boxFloat, tweenSpec, boxFloat2, new Function1<Animatable<Float, AnimationVector1D>, Unit>() { // from class: androidx.compose.material.SliderKt.RangeSlider.2.gestureEndAction.1.1.1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(Animatable<Float, AnimationVector1D> animatable) {
                                    invoke2(animatable);
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(Animatable<Float, AnimationVector1D> animateTo) {
                                    ClosedFloatingPointRange<Float> invoke$scaleToUserValue;
                                    Intrinsics.checkNotNullParameter(animateTo, "$this$animateTo");
                                    (z ? mutableState : mutableState2).setValue(animateTo.getValue());
                                    Function1<ClosedFloatingPointRange<Float>, Unit> value = state.getValue();
                                    invoke$scaleToUserValue = SliderKt$RangeSlider$2.invoke$scaleToUserValue(floatRef, floatRef2, closedFloatingPointRange, RangesKt.rangeTo(mutableState.getValue().floatValue(), mutableState2.getValue().floatValue()));
                                    value.invoke(invoke$scaleToUserValue);
                                }
                            }, this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        } else {
                            if (i != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ResultKt.throwOnFailure(obj);
                        }
                        Function0<Unit> function0 = this.$onValueChangeFinished;
                        if (function0 != null) {
                            function0.invoke();
                        }
                        return Unit.INSTANCE;
                    }
                }
            }, composer, 0);
            ClosedFloatingPointRange<Float> closedFloatingPointRange6 = this.$valueRange;
            Float valueOf = Float.valueOf(floatRef2.element);
            Float valueOf2 = Float.valueOf(floatRef.element);
            final ClosedFloatingPointRange<Float> closedFloatingPointRange7 = this.$values;
            final State<Function1<ClosedFloatingPointRange<Float>, Unit>> state2 = this.$onValueChangeState;
            Object[] objArr = {mutableState, mutableState2, closedFloatingPointRange6, valueOf, valueOf2, closedFloatingPointRange7, state2};
            final ClosedFloatingPointRange<Float> closedFloatingPointRange8 = this.$valueRange;
            composer.startReplaceableGroup(-568225417);
            ComposerKt.sourceInformation(composer, "C(remember)P(1):Composables.kt#9igjgp");
            boolean z2 = false;
            for (int i2 = 0; i2 < 7; i2++) {
                z2 |= composer.changed(objArr[i2]);
            }
            Object rememberedValue4 = composer.rememberedValue();
            if (z2 || rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                rememberedValue4 = (Function2) new Function2<Boolean, Float, Unit>() { // from class: androidx.compose.material.SliderKt$RangeSlider$2$onDrag$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Boolean bool, Float f) {
                        invoke(bool.booleanValue(), f.floatValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(boolean z3, float f) {
                        ClosedFloatingPointRange<Float> rangeTo;
                        ClosedFloatingPointRange<Float> invoke$scaleToUserValue;
                        if (z3) {
                            MutableState<Float> mutableState3 = mutableState;
                            mutableState3.setValue(Float.valueOf(mutableState3.getValue().floatValue() + f));
                            mutableState2.setValue(Float.valueOf(SliderKt$RangeSlider$2.invoke$scaleToOffset(closedFloatingPointRange8, floatRef2, floatRef, closedFloatingPointRange7.getEndInclusive().floatValue())));
                            float floatValue = mutableState2.getValue().floatValue();
                            rangeTo = RangesKt.rangeTo(RangesKt.coerceIn(mutableState.getValue().floatValue(), floatRef2.element, floatValue), floatValue);
                        } else {
                            MutableState<Float> mutableState4 = mutableState2;
                            mutableState4.setValue(Float.valueOf(mutableState4.getValue().floatValue() + f));
                            mutableState.setValue(Float.valueOf(SliderKt$RangeSlider$2.invoke$scaleToOffset(closedFloatingPointRange8, floatRef2, floatRef, closedFloatingPointRange7.getStart().floatValue())));
                            float floatValue2 = mutableState.getValue().floatValue();
                            rangeTo = RangesKt.rangeTo(floatValue2, RangesKt.coerceIn(mutableState2.getValue().floatValue(), floatValue2, floatRef.element));
                        }
                        Function1<ClosedFloatingPointRange<Float>, Unit> value = state2.getValue();
                        invoke$scaleToUserValue = SliderKt$RangeSlider$2.invoke$scaleToUserValue(floatRef2, floatRef, closedFloatingPointRange8, rangeTo);
                        value.invoke(invoke$scaleToUserValue);
                    }
                };
                composer.updateRememberedValue(rememberedValue4);
            }
            composer.endReplaceableGroup();
            rangeSliderPressDragModifier = SliderKt.rangeSliderPressDragModifier(Modifier.INSTANCE, this.$startInteractionSource, this.$endInteractionSource, mutableState, mutableState2, this.$enabled, z, m3796getMaxWidthimpl, this.$valueRange, rememberUpdatedState, SnapshotStateKt.rememberUpdatedState(rememberedValue4, composer, 0));
            final float coerceIn = RangesKt.coerceIn(this.$values.getStart().floatValue(), this.$valueRange.getStart().floatValue(), this.$values.getEndInclusive().floatValue());
            final float coerceIn2 = RangesKt.coerceIn(this.$values.getEndInclusive().floatValue(), this.$values.getStart().floatValue(), this.$valueRange.getEndInclusive().floatValue());
            calcFraction = SliderKt.calcFraction(this.$valueRange.getStart().floatValue(), this.$valueRange.getEndInclusive().floatValue(), coerceIn);
            calcFraction2 = SliderKt.calcFraction(this.$valueRange.getStart().floatValue(), this.$valueRange.getEndInclusive().floatValue(), coerceIn2);
            Modifier.Companion companion = Modifier.INSTANCE;
            List<Float> list2 = this.$tickFractions;
            boolean z3 = this.$enabled;
            State<Function1<ClosedFloatingPointRange<Float>, Unit>> state3 = this.$onValueChangeState;
            Float valueOf3 = Float.valueOf(coerceIn2);
            final State<Function1<ClosedFloatingPointRange<Float>, Unit>> state4 = this.$onValueChangeState;
            composer.startReplaceableGroup(511388516);
            ComposerKt.sourceInformation(composer, "C(remember)P(1,2):Composables.kt#9igjgp");
            boolean changed = composer.changed(state3) | composer.changed(valueOf3);
            Object rememberedValue5 = composer.rememberedValue();
            if (changed || rememberedValue5 == Composer.INSTANCE.getEmpty()) {
                rememberedValue5 = (Function1) new Function1<Float, Unit>() { // from class: androidx.compose.material.SliderKt$RangeSlider$2$startThumbSemantics$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(Float f) {
                        invoke(f.floatValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(float f) {
                        state4.getValue().invoke(RangesKt.rangeTo(f, coerceIn2));
                    }
                };
                composer.updateRememberedValue(rememberedValue5);
            }
            composer.endReplaceableGroup();
            sliderSemantics = SliderKt.sliderSemantics(companion, coerceIn, list2, z3, (Function1) rememberedValue5, RangesKt.rangeTo(this.$valueRange.getStart().floatValue(), coerceIn2), this.$steps);
            Modifier.Companion companion2 = Modifier.INSTANCE;
            List<Float> list3 = this.$tickFractions;
            boolean z4 = this.$enabled;
            State<Function1<ClosedFloatingPointRange<Float>, Unit>> state5 = this.$onValueChangeState;
            Float valueOf4 = Float.valueOf(coerceIn);
            final State<Function1<ClosedFloatingPointRange<Float>, Unit>> state6 = this.$onValueChangeState;
            composer.startReplaceableGroup(511388516);
            ComposerKt.sourceInformation(composer, "C(remember)P(1,2):Composables.kt#9igjgp");
            boolean changed2 = composer.changed(state5) | composer.changed(valueOf4);
            Object rememberedValue6 = composer.rememberedValue();
            if (changed2 || rememberedValue6 == Composer.INSTANCE.getEmpty()) {
                rememberedValue6 = (Function1) new Function1<Float, Unit>() { // from class: androidx.compose.material.SliderKt$RangeSlider$2$endThumbSemantics$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(Float f) {
                        invoke(f.floatValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(float f) {
                        state6.getValue().invoke(RangesKt.rangeTo(coerceIn, f));
                    }
                };
                composer.updateRememberedValue(rememberedValue6);
            }
            composer.endReplaceableGroup();
            sliderSemantics2 = SliderKt.sliderSemantics(companion2, coerceIn2, list3, z4, (Function1) rememberedValue6, RangesKt.rangeTo(coerceIn, this.$valueRange.getEndInclusive().floatValue()), this.$steps);
            boolean z5 = this.$enabled;
            List<Float> list4 = this.$tickFractions;
            SliderColors sliderColors = this.$colors;
            float f = floatRef.element - floatRef2.element;
            MutableInteractionSource mutableInteractionSource = this.$startInteractionSource;
            MutableInteractionSource mutableInteractionSource2 = this.$endInteractionSource;
            int i3 = this.$$dirty;
            SliderKt.RangeSliderImpl(z5, calcFraction, calcFraction2, list4, sliderColors, f, mutableInteractionSource, mutableInteractionSource2, rangeSliderPressDragModifier, sliderSemantics, sliderSemantics2, composer, ((i3 >> 9) & 14) | 14159872 | ((i3 >> 9) & 57344), 0);
            return;
        }
        composer.skipToGroupEnd();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ClosedFloatingPointRange<Float> invoke$scaleToUserValue(Ref.FloatRef floatRef, Ref.FloatRef floatRef2, ClosedFloatingPointRange<Float> closedFloatingPointRange, ClosedFloatingPointRange<Float> closedFloatingPointRange2) {
        ClosedFloatingPointRange<Float> scale;
        scale = SliderKt.scale(floatRef.element, floatRef2.element, (ClosedFloatingPointRange<Float>) closedFloatingPointRange2, closedFloatingPointRange.getStart().floatValue(), closedFloatingPointRange.getEndInclusive().floatValue());
        return scale;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float invoke$scaleToOffset(ClosedFloatingPointRange<Float> closedFloatingPointRange, Ref.FloatRef floatRef, Ref.FloatRef floatRef2, float f) {
        float scale;
        scale = SliderKt.scale(closedFloatingPointRange.getStart().floatValue(), closedFloatingPointRange.getEndInclusive().floatValue(), f, floatRef.element, floatRef2.element);
        return scale;
    }

    /* compiled from: Slider.kt */
    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    /* renamed from: androidx.compose.material.SliderKt$RangeSlider$2$2, reason: invalid class name */
    /* synthetic */ class AnonymousClass2 extends FunctionReferenceImpl implements Function1<Float, Float> {
        final /* synthetic */ Ref.FloatRef $maxPx;
        final /* synthetic */ Ref.FloatRef $minPx;
        final /* synthetic */ ClosedFloatingPointRange<Float> $valueRange;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(ClosedFloatingPointRange<Float> closedFloatingPointRange, Ref.FloatRef floatRef, Ref.FloatRef floatRef2) {
            super(1, Intrinsics.Kotlin.class, "scaleToOffset", "invoke$scaleToOffset(Lkotlin/ranges/ClosedFloatingPointRange;Lkotlin/jvm/internal/Ref$FloatRef;Lkotlin/jvm/internal/Ref$FloatRef;F)F", 0);
            this.$valueRange = closedFloatingPointRange;
            this.$minPx = floatRef;
            this.$maxPx = floatRef2;
        }

        public final Float invoke(float f) {
            return Float.valueOf(SliderKt$RangeSlider$2.invoke$scaleToOffset(this.$valueRange, this.$minPx, this.$maxPx, f));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Float invoke(Float f) {
            return invoke(f.floatValue());
        }
    }

    /* compiled from: Slider.kt */
    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    /* renamed from: androidx.compose.material.SliderKt$RangeSlider$2$3, reason: invalid class name */
    /* synthetic */ class AnonymousClass3 extends FunctionReferenceImpl implements Function1<Float, Float> {
        final /* synthetic */ Ref.FloatRef $maxPx;
        final /* synthetic */ Ref.FloatRef $minPx;
        final /* synthetic */ ClosedFloatingPointRange<Float> $valueRange;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass3(ClosedFloatingPointRange<Float> closedFloatingPointRange, Ref.FloatRef floatRef, Ref.FloatRef floatRef2) {
            super(1, Intrinsics.Kotlin.class, "scaleToOffset", "invoke$scaleToOffset(Lkotlin/ranges/ClosedFloatingPointRange;Lkotlin/jvm/internal/Ref$FloatRef;Lkotlin/jvm/internal/Ref$FloatRef;F)F", 0);
            this.$valueRange = closedFloatingPointRange;
            this.$minPx = floatRef;
            this.$maxPx = floatRef2;
        }

        public final Float invoke(float f) {
            return Float.valueOf(SliderKt$RangeSlider$2.invoke$scaleToOffset(this.$valueRange, this.$minPx, this.$maxPx, f));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Float invoke(Float f) {
            return invoke(f.floatValue());
        }
    }
}
