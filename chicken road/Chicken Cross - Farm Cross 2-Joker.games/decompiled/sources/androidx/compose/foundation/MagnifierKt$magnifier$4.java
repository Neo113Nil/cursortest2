package androidx.compose.foundation;

import android.view.View;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.layout.OnGloballyPositionedModifierKt;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertyKey;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DpSize;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;

/* compiled from: Magnifier.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "Landroidx/compose/ui/Modifier;", "invoke", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;"}, k = 3, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
final class MagnifierKt$magnifier$4 extends Lambda implements Function3<Modifier, Composer, Integer, Modifier> {
    final /* synthetic */ Function1<Density, Offset> $magnifierCenter;
    final /* synthetic */ Function1<DpSize, Unit> $onSizeChanged;
    final /* synthetic */ PlatformMagnifierFactory $platformMagnifierFactory;
    final /* synthetic */ Function1<Density, Offset> $sourceCenter;
    final /* synthetic */ MagnifierStyle $style;
    final /* synthetic */ float $zoom;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    MagnifierKt$magnifier$4(Function1<? super Density, Offset> function1, Function1<? super Density, Offset> function12, float f, Function1<? super DpSize, Unit> function13, PlatformMagnifierFactory platformMagnifierFactory, MagnifierStyle magnifierStyle) {
        super(3);
        this.$sourceCenter = function1;
        this.$magnifierCenter = function12;
        this.$zoom = f;
        this.$onSizeChanged = function13;
        this.$platformMagnifierFactory = platformMagnifierFactory;
        this.$style = magnifierStyle;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier, Composer composer, Integer num) {
        return invoke(modifier, composer, num.intValue());
    }

    public final Modifier invoke(Modifier composed, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(composed, "$this$composed");
        composer.startReplaceableGroup(-454877003);
        ComposerKt.sourceInformation(composer, "C273@11641L7,274@11680L7,275@11728L47,276@11807L34,277@11876L37,278@11937L26,279@11996L35,280@12062L331,290@12422L62,295@12614L107,307@13298L2602:Magnifier.kt#71ulvw");
        ProvidableCompositionLocal<View> localView = AndroidCompositionLocals_androidKt.getLocalView();
        ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "C:CompositionLocal.kt#9igjgp");
        Object consume = composer.consume(localView);
        ComposerKt.sourceInformationMarkerEnd(composer);
        View view = (View) consume;
        ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
        ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "C:CompositionLocal.kt#9igjgp");
        Object consume2 = composer.consume(localDensity);
        ComposerKt.sourceInformationMarkerEnd(composer);
        final Density density = (Density) consume2;
        composer.startReplaceableGroup(-492369756);
        ComposerKt.sourceInformation(composer, "C(remember):Composables.kt#9igjgp");
        Object rememberedValue = composer.rememberedValue();
        if (rememberedValue == Composer.INSTANCE.getEmpty()) {
            rememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Offset.m1381boximpl(Offset.INSTANCE.m1407getUnspecifiedF1C5BW0()), null, 2, null);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        final MutableState mutableState = (MutableState) rememberedValue;
        final State rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(this.$sourceCenter, composer, 0);
        State rememberUpdatedState2 = SnapshotStateKt.rememberUpdatedState(this.$magnifierCenter, composer, 0);
        State rememberUpdatedState3 = SnapshotStateKt.rememberUpdatedState(Float.valueOf(this.$zoom), composer, 0);
        State rememberUpdatedState4 = SnapshotStateKt.rememberUpdatedState(this.$onSizeChanged, composer, 0);
        composer.startReplaceableGroup(-492369756);
        ComposerKt.sourceInformation(composer, "C(remember):Composables.kt#9igjgp");
        Object rememberedValue2 = composer.rememberedValue();
        if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
            rememberedValue2 = SnapshotStateKt.derivedStateOf(new Function0<Offset>() { // from class: androidx.compose.foundation.MagnifierKt$magnifier$4$sourceCenterInRoot$2$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Offset invoke() {
                    return Offset.m1381boximpl(m238invokeF1C5BW0());
                }

                /* renamed from: invoke-F1C5BW0, reason: not valid java name */
                public final long m238invokeF1C5BW0() {
                    Function1 m232invoke$lambda3;
                    m232invoke$lambda3 = MagnifierKt$magnifier$4.m232invoke$lambda3(rememberUpdatedState);
                    long packedValue = ((Offset) m232invoke$lambda3.invoke(Density.this)).getPackedValue();
                    if (OffsetKt.m1411isSpecifiedk4lQ0M(MagnifierKt$magnifier$4.m229invoke$lambda1(mutableState)) && OffsetKt.m1411isSpecifiedk4lQ0M(packedValue)) {
                        return Offset.m1397plusMKHz9U(MagnifierKt$magnifier$4.m229invoke$lambda1(mutableState), packedValue);
                    }
                    return Offset.INSTANCE.m1407getUnspecifiedF1C5BW0();
                }
            });
            composer.updateRememberedValue(rememberedValue2);
        }
        composer.endReplaceableGroup();
        final State state = (State) rememberedValue2;
        composer.startReplaceableGroup(-492369756);
        ComposerKt.sourceInformation(composer, "C(remember):Composables.kt#9igjgp");
        Object rememberedValue3 = composer.rememberedValue();
        if (rememberedValue3 == Composer.INSTANCE.getEmpty()) {
            rememberedValue3 = SnapshotStateKt.derivedStateOf(new Function0<Boolean>() { // from class: androidx.compose.foundation.MagnifierKt$magnifier$4$isMagnifierShown$2$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlin.jvm.functions.Function0
                public final Boolean invoke() {
                    return Boolean.valueOf(OffsetKt.m1411isSpecifiedk4lQ0M(MagnifierKt$magnifier$4.m236invoke$lambda8(state)));
                }
            });
            composer.updateRememberedValue(rememberedValue3);
        }
        composer.endReplaceableGroup();
        State state2 = (State) rememberedValue3;
        composer.startReplaceableGroup(-492369756);
        ComposerKt.sourceInformation(composer, "C(remember):Composables.kt#9igjgp");
        Object rememberedValue4 = composer.rememberedValue();
        if (rememberedValue4 == Composer.INSTANCE.getEmpty()) {
            rememberedValue4 = SharedFlowKt.MutableSharedFlow$default(1, 0, BufferOverflow.DROP_OLDEST, 2, null);
            composer.updateRememberedValue(rememberedValue4);
        }
        composer.endReplaceableGroup();
        final MutableSharedFlow mutableSharedFlow = (MutableSharedFlow) rememberedValue4;
        Float valueOf = Float.valueOf(this.$platformMagnifierFactory.getCanUpdateZoom() ? 0.0f : this.$zoom);
        MagnifierStyle magnifierStyle = this.$style;
        EffectsKt.LaunchedEffect(new Object[]{view, density, valueOf, magnifierStyle, Boolean.valueOf(Intrinsics.areEqual(magnifierStyle, MagnifierStyle.INSTANCE.getTextDefault()))}, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) new AnonymousClass1(this.$platformMagnifierFactory, this.$style, view, density, this.$zoom, mutableSharedFlow, rememberUpdatedState4, state2, state, rememberUpdatedState2, mutableState, rememberUpdatedState3, null), composer, 8);
        Modifier semantics$default = SemanticsModifierKt.semantics$default(DrawModifierKt.drawBehind(OnGloballyPositionedModifierKt.onGloballyPositioned(composed, new Function1<LayoutCoordinates, Unit>() { // from class: androidx.compose.foundation.MagnifierKt$magnifier$4.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(LayoutCoordinates layoutCoordinates) {
                invoke2(layoutCoordinates);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(LayoutCoordinates it) {
                Intrinsics.checkNotNullParameter(it, "it");
                MagnifierKt$magnifier$4.m231invoke$lambda2(mutableState, LayoutCoordinatesKt.positionInRoot(it));
            }
        }), new Function1<DrawScope, Unit>() { // from class: androidx.compose.foundation.MagnifierKt$magnifier$4.3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
                invoke2(drawScope);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(DrawScope drawBehind) {
                Intrinsics.checkNotNullParameter(drawBehind, "$this$drawBehind");
                mutableSharedFlow.tryEmit(Unit.INSTANCE);
            }
        }), false, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.foundation.MagnifierKt$magnifier$4.4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                invoke2(semanticsPropertyReceiver);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(SemanticsPropertyReceiver semantics) {
                Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
                SemanticsPropertyKey<Function0<Offset>> magnifierPositionInRoot = MagnifierKt.getMagnifierPositionInRoot();
                final State<Offset> state3 = state;
                semantics.set(magnifierPositionInRoot, new Function0<Offset>() { // from class: androidx.compose.foundation.MagnifierKt.magnifier.4.4.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Offset invoke() {
                        return Offset.m1381boximpl(m237invokeF1C5BW0());
                    }

                    /* renamed from: invoke-F1C5BW0, reason: not valid java name */
                    public final long m237invokeF1C5BW0() {
                        return MagnifierKt$magnifier$4.m236invoke$lambda8(state3);
                    }
                });
            }
        }, 1, null);
        composer.endReplaceableGroup();
        return semantics$default;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: invoke$lambda-1, reason: not valid java name */
    public static final long m229invoke$lambda1(MutableState<Offset> mutableState) {
        return mutableState.getValue().getPackedValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: invoke$lambda-2, reason: not valid java name */
    public static final void m231invoke$lambda2(MutableState<Offset> mutableState, long j) {
        mutableState.setValue(Offset.m1381boximpl(j));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: invoke$lambda-3, reason: not valid java name */
    public static final Function1<Density, Offset> m232invoke$lambda3(State<? extends Function1<? super Density, Offset>> state) {
        return (Function1) state.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: invoke$lambda-4, reason: not valid java name */
    public static final Function1<Density, Offset> m233invoke$lambda4(State<? extends Function1<? super Density, Offset>> state) {
        return (Function1) state.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: invoke$lambda-5, reason: not valid java name */
    public static final float m234invoke$lambda5(State<Float> state) {
        return state.getValue().floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: invoke$lambda-6, reason: not valid java name */
    public static final Function1<DpSize, Unit> m235invoke$lambda6(State<? extends Function1<? super DpSize, Unit>> state) {
        return (Function1) state.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: invoke$lambda-8, reason: not valid java name */
    public static final long m236invoke$lambda8(State<Offset> state) {
        return state.getValue().getPackedValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: invoke$lambda-10, reason: not valid java name */
    public static final boolean m230invoke$lambda10(State<Boolean> state) {
        return state.getValue().booleanValue();
    }

    /* compiled from: Magnifier.kt */
    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.foundation.MagnifierKt$magnifier$4$1", f = "Magnifier.kt", i = {0}, l = {365}, m = "invokeSuspend", n = {"magnifier"}, s = {"L$0"})
    /* renamed from: androidx.compose.foundation.MagnifierKt$magnifier$4$1, reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ MutableState<Offset> $anchorPositionInRoot$delegate;
        final /* synthetic */ Density $density;
        final /* synthetic */ State<Boolean> $isMagnifierShown$delegate;
        final /* synthetic */ MutableSharedFlow<Unit> $onNeedsUpdate;
        final /* synthetic */ PlatformMagnifierFactory $platformMagnifierFactory;
        final /* synthetic */ State<Offset> $sourceCenterInRoot$delegate;
        final /* synthetic */ MagnifierStyle $style;
        final /* synthetic */ State<Function1<Density, Offset>> $updatedMagnifierCenter$delegate;
        final /* synthetic */ State<Function1<DpSize, Unit>> $updatedOnSizeChanged$delegate;
        final /* synthetic */ State<Float> $updatedZoom$delegate;
        final /* synthetic */ View $view;
        final /* synthetic */ float $zoom;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(PlatformMagnifierFactory platformMagnifierFactory, MagnifierStyle magnifierStyle, View view, Density density, float f, MutableSharedFlow<Unit> mutableSharedFlow, State<? extends Function1<? super DpSize, Unit>> state, State<Boolean> state2, State<Offset> state3, State<? extends Function1<? super Density, Offset>> state4, MutableState<Offset> mutableState, State<Float> state5, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$platformMagnifierFactory = platformMagnifierFactory;
            this.$style = magnifierStyle;
            this.$view = view;
            this.$density = density;
            this.$zoom = f;
            this.$onNeedsUpdate = mutableSharedFlow;
            this.$updatedOnSizeChanged$delegate = state;
            this.$isMagnifierShown$delegate = state2;
            this.$sourceCenterInRoot$delegate = state3;
            this.$updatedMagnifierCenter$delegate = state4;
            this.$anchorPositionInRoot$delegate = mutableState;
            this.$updatedZoom$delegate = state5;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$platformMagnifierFactory, this.$style, this.$view, this.$density, this.$zoom, this.$onNeedsUpdate, this.$updatedOnSizeChanged$delegate, this.$isMagnifierShown$delegate, this.$sourceCenterInRoot$delegate, this.$updatedMagnifierCenter$delegate, this.$anchorPositionInRoot$delegate, this.$updatedZoom$delegate, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: Magnifier.kt */
        @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
        @DebugMetadata(c = "androidx.compose.foundation.MagnifierKt$magnifier$4$1$1", f = "Magnifier.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: androidx.compose.foundation.MagnifierKt$magnifier$4$1$1, reason: invalid class name and collision with other inner class name */
        static final class C00041 extends SuspendLambda implements Function2<Unit, Continuation<? super Unit>, Object> {
            final /* synthetic */ PlatformMagnifier $magnifier;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C00041(PlatformMagnifier platformMagnifier, Continuation<? super C00041> continuation) {
                super(2, continuation);
                this.$magnifier = platformMagnifier;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C00041(this.$magnifier, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Unit unit, Continuation<? super Unit> continuation) {
                return ((C00041) create(unit, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                this.$magnifier.updateContent();
                return Unit.INSTANCE;
            }
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            PlatformMagnifier platformMagnifier;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                final PlatformMagnifier create = this.$platformMagnifierFactory.create(this.$style, this.$view, this.$density, this.$zoom);
                final Ref.LongRef longRef = new Ref.LongRef();
                long mo243getSizeYbymL2g = create.mo243getSizeYbymL2g();
                Density density = this.$density;
                Function1 m235invoke$lambda6 = MagnifierKt$magnifier$4.m235invoke$lambda6(this.$updatedOnSizeChanged$delegate);
                if (m235invoke$lambda6 != null) {
                    m235invoke$lambda6.invoke(DpSize.m3926boximpl(density.mo313toDpSizekrfVVM(IntSizeKt.m4010toSizeozmzZPI(mo243getSizeYbymL2g))));
                }
                longRef.element = mo243getSizeYbymL2g;
                FlowKt.launchIn(FlowKt.onEach(this.$onNeedsUpdate, new C00041(create, null)), coroutineScope);
                try {
                    final Density density2 = this.$density;
                    final State<Boolean> state = this.$isMagnifierShown$delegate;
                    final State<Offset> state2 = this.$sourceCenterInRoot$delegate;
                    final State<Function1<Density, Offset>> state3 = this.$updatedMagnifierCenter$delegate;
                    final MutableState<Offset> mutableState = this.$anchorPositionInRoot$delegate;
                    final State<Float> state4 = this.$updatedZoom$delegate;
                    final State<Function1<DpSize, Unit>> state5 = this.$updatedOnSizeChanged$delegate;
                    this.L$0 = create;
                    this.label = 1;
                    if (FlowKt.collect(SnapshotStateKt.snapshotFlow(new Function0<Unit>() { // from class: androidx.compose.foundation.MagnifierKt.magnifier.4.1.2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(0);
                        }

                        @Override // kotlin.jvm.functions.Function0
                        public /* bridge */ /* synthetic */ Unit invoke() {
                            invoke2();
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2() {
                            long m1407getUnspecifiedF1C5BW0;
                            if (MagnifierKt$magnifier$4.m230invoke$lambda10(state)) {
                                PlatformMagnifier platformMagnifier2 = PlatformMagnifier.this;
                                long m236invoke$lambda8 = MagnifierKt$magnifier$4.m236invoke$lambda8(state2);
                                Object invoke = MagnifierKt$magnifier$4.m233invoke$lambda4(state3).invoke(density2);
                                MutableState<Offset> mutableState2 = mutableState;
                                long packedValue = ((Offset) invoke).getPackedValue();
                                if (OffsetKt.m1411isSpecifiedk4lQ0M(packedValue)) {
                                    m1407getUnspecifiedF1C5BW0 = Offset.m1397plusMKHz9U(MagnifierKt$magnifier$4.m229invoke$lambda1(mutableState2), packedValue);
                                } else {
                                    m1407getUnspecifiedF1C5BW0 = Offset.INSTANCE.m1407getUnspecifiedF1C5BW0();
                                }
                                platformMagnifier2.mo244updateWko1d7g(m236invoke$lambda8, m1407getUnspecifiedF1C5BW0, MagnifierKt$magnifier$4.m234invoke$lambda5(state4));
                                long mo243getSizeYbymL2g2 = PlatformMagnifier.this.mo243getSizeYbymL2g();
                                Ref.LongRef longRef2 = longRef;
                                Density density3 = density2;
                                State<Function1<DpSize, Unit>> state6 = state5;
                                if (IntSize.m3998equalsimpl0(mo243getSizeYbymL2g2, longRef2.element)) {
                                    return;
                                }
                                longRef2.element = mo243getSizeYbymL2g2;
                                Function1 m235invoke$lambda62 = MagnifierKt$magnifier$4.m235invoke$lambda6(state6);
                                if (m235invoke$lambda62 != null) {
                                    m235invoke$lambda62.invoke(DpSize.m3926boximpl(density3.mo313toDpSizekrfVVM(IntSizeKt.m4010toSizeozmzZPI(mo243getSizeYbymL2g2))));
                                    return;
                                }
                                return;
                            }
                            PlatformMagnifier.this.dismiss();
                        }
                    }), this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    platformMagnifier = create;
                } catch (Throwable th) {
                    th = th;
                    platformMagnifier = create;
                    platformMagnifier.dismiss();
                    throw th;
                }
            } else if (i == 1) {
                platformMagnifier = (PlatformMagnifier) this.L$0;
                try {
                    ResultKt.throwOnFailure(obj);
                } catch (Throwable th2) {
                    th = th2;
                    platformMagnifier.dismiss();
                    throw th;
                }
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            platformMagnifier.dismiss();
            return Unit.INSTANCE;
        }
    }
}
