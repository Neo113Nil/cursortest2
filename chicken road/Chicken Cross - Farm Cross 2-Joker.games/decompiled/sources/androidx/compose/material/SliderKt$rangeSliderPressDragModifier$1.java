package androidx.compose.material;

import androidx.compose.foundation.gestures.DragGestureDetectorKt;
import androidx.compose.foundation.gestures.ForEachGestureKt;
import androidx.compose.foundation.gestures.TapGestureDetectorKt;
import androidx.compose.foundation.interaction.DragInteraction;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.runtime.State;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerEventKt;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.core.app.NotificationCompat;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;

/* compiled from: Slider.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/input/pointer/PointerInputScope;"}, k = 3, mv = {1, 6, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.material.SliderKt$rangeSliderPressDragModifier$1", f = "Slider.kt", i = {}, l = {955}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes.dex */
final class SliderKt$rangeSliderPressDragModifier$1 extends SuspendLambda implements Function2<PointerInputScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ MutableInteractionSource $endInteractionSource;
    final /* synthetic */ State<Function1<Boolean, Unit>> $gestureEndAction;
    final /* synthetic */ boolean $isRtl;
    final /* synthetic */ float $maxPx;
    final /* synthetic */ State<Function2<Boolean, Float, Unit>> $onDrag;
    final /* synthetic */ State<Float> $rawOffsetEnd;
    final /* synthetic */ State<Float> $rawOffsetStart;
    final /* synthetic */ MutableInteractionSource $startInteractionSource;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    SliderKt$rangeSliderPressDragModifier$1(MutableInteractionSource mutableInteractionSource, MutableInteractionSource mutableInteractionSource2, State<Float> state, State<Float> state2, State<? extends Function2<? super Boolean, ? super Float, Unit>> state3, boolean z, float f, State<? extends Function1<? super Boolean, Unit>> state4, Continuation<? super SliderKt$rangeSliderPressDragModifier$1> continuation) {
        super(2, continuation);
        this.$startInteractionSource = mutableInteractionSource;
        this.$endInteractionSource = mutableInteractionSource2;
        this.$rawOffsetStart = state;
        this.$rawOffsetEnd = state2;
        this.$onDrag = state3;
        this.$isRtl = z;
        this.$maxPx = f;
        this.$gestureEndAction = state4;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        SliderKt$rangeSliderPressDragModifier$1 sliderKt$rangeSliderPressDragModifier$1 = new SliderKt$rangeSliderPressDragModifier$1(this.$startInteractionSource, this.$endInteractionSource, this.$rawOffsetStart, this.$rawOffsetEnd, this.$onDrag, this.$isRtl, this.$maxPx, this.$gestureEndAction, continuation);
        sliderKt$rangeSliderPressDragModifier$1.L$0 = obj;
        return sliderKt$rangeSliderPressDragModifier$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(PointerInputScope pointerInputScope, Continuation<? super Unit> continuation) {
        return ((SliderKt$rangeSliderPressDragModifier$1) create(pointerInputScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            PointerInputScope pointerInputScope = (PointerInputScope) this.L$0;
            RangeSliderLogic rangeSliderLogic = new RangeSliderLogic(this.$startInteractionSource, this.$endInteractionSource, this.$rawOffsetStart, this.$rawOffsetEnd, this.$onDrag);
            this.label = 1;
            if (CoroutineScopeKt.coroutineScope(new AnonymousClass1(pointerInputScope, this.$isRtl, this.$maxPx, rangeSliderLogic, this.$rawOffsetStart, this.$gestureEndAction, this.$rawOffsetEnd, this.$onDrag, null), this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }

    /* compiled from: Slider.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 6, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.material.SliderKt$rangeSliderPressDragModifier$1$1", f = "Slider.kt", i = {}, l = {956}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: androidx.compose.material.SliderKt$rangeSliderPressDragModifier$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ PointerInputScope $$this$pointerInput;
        final /* synthetic */ State<Function1<Boolean, Unit>> $gestureEndAction;
        final /* synthetic */ boolean $isRtl;
        final /* synthetic */ float $maxPx;
        final /* synthetic */ State<Function2<Boolean, Float, Unit>> $onDrag;
        final /* synthetic */ RangeSliderLogic $rangeSliderLogic;
        final /* synthetic */ State<Float> $rawOffsetEnd;
        final /* synthetic */ State<Float> $rawOffsetStart;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(PointerInputScope pointerInputScope, boolean z, float f, RangeSliderLogic rangeSliderLogic, State<Float> state, State<? extends Function1<? super Boolean, Unit>> state2, State<Float> state3, State<? extends Function2<? super Boolean, ? super Float, Unit>> state4, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$$this$pointerInput = pointerInputScope;
            this.$isRtl = z;
            this.$maxPx = f;
            this.$rangeSliderLogic = rangeSliderLogic;
            this.$rawOffsetStart = state;
            this.$gestureEndAction = state2;
            this.$rawOffsetEnd = state3;
            this.$onDrag = state4;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$$this$pointerInput, this.$isRtl, this.$maxPx, this.$rangeSliderLogic, this.$rawOffsetStart, this.$gestureEndAction, this.$rawOffsetEnd, this.$onDrag, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: Slider.kt */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/input/pointer/PointerInputScope;"}, k = 3, mv = {1, 6, 0}, xi = 48)
        @DebugMetadata(c = "androidx.compose.material.SliderKt$rangeSliderPressDragModifier$1$1$1", f = "Slider.kt", i = {}, l = {957}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: androidx.compose.material.SliderKt$rangeSliderPressDragModifier$1$1$1, reason: invalid class name and collision with other inner class name */
        static final class C00431 extends SuspendLambda implements Function2<PointerInputScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ CoroutineScope $$this$coroutineScope;
            final /* synthetic */ State<Function1<Boolean, Unit>> $gestureEndAction;
            final /* synthetic */ boolean $isRtl;
            final /* synthetic */ float $maxPx;
            final /* synthetic */ State<Function2<Boolean, Float, Unit>> $onDrag;
            final /* synthetic */ RangeSliderLogic $rangeSliderLogic;
            final /* synthetic */ State<Float> $rawOffsetEnd;
            final /* synthetic */ State<Float> $rawOffsetStart;
            private /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C00431(boolean z, float f, RangeSliderLogic rangeSliderLogic, State<Float> state, CoroutineScope coroutineScope, State<? extends Function1<? super Boolean, Unit>> state2, State<Float> state3, State<? extends Function2<? super Boolean, ? super Float, Unit>> state4, Continuation<? super C00431> continuation) {
                super(2, continuation);
                this.$isRtl = z;
                this.$maxPx = f;
                this.$rangeSliderLogic = rangeSliderLogic;
                this.$rawOffsetStart = state;
                this.$$this$coroutineScope = coroutineScope;
                this.$gestureEndAction = state2;
                this.$rawOffsetEnd = state3;
                this.$onDrag = state4;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C00431 c00431 = new C00431(this.$isRtl, this.$maxPx, this.$rangeSliderLogic, this.$rawOffsetStart, this.$$this$coroutineScope, this.$gestureEndAction, this.$rawOffsetEnd, this.$onDrag, continuation);
                c00431.L$0 = obj;
                return c00431;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(PointerInputScope pointerInputScope, Continuation<? super Unit> continuation) {
                return ((C00431) create(pointerInputScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: Slider.kt */
            @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;"}, k = 3, mv = {1, 6, 0}, xi = 48)
            @DebugMetadata(c = "androidx.compose.material.SliderKt$rangeSliderPressDragModifier$1$1$1$1", f = "Slider.kt", i = {0, 1, 1, 1, 1, 1, 2, 2}, l = {958, 968, 987}, m = "invokeSuspend", n = {"$this$awaitPointerEventScope", "$this$awaitPointerEventScope", NotificationCompat.CATEGORY_EVENT, "interaction", "posX", "draggingStart", "interaction", "draggingStart"}, s = {"L$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$0", "L$1"})
            /* renamed from: androidx.compose.material.SliderKt$rangeSliderPressDragModifier$1$1$1$1, reason: invalid class name and collision with other inner class name */
            static final class C00441 extends RestrictedSuspendLambda implements Function2<AwaitPointerEventScope, Continuation<? super Unit>, Object> {
                final /* synthetic */ CoroutineScope $$this$coroutineScope;
                final /* synthetic */ State<Function1<Boolean, Unit>> $gestureEndAction;
                final /* synthetic */ boolean $isRtl;
                final /* synthetic */ float $maxPx;
                final /* synthetic */ State<Function2<Boolean, Float, Unit>> $onDrag;
                final /* synthetic */ RangeSliderLogic $rangeSliderLogic;
                final /* synthetic */ State<Float> $rawOffsetEnd;
                final /* synthetic */ State<Float> $rawOffsetStart;
                private /* synthetic */ Object L$0;
                Object L$1;
                Object L$2;
                Object L$3;
                Object L$4;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                C00441(boolean z, float f, RangeSliderLogic rangeSliderLogic, State<Float> state, CoroutineScope coroutineScope, State<? extends Function1<? super Boolean, Unit>> state2, State<Float> state3, State<? extends Function2<? super Boolean, ? super Float, Unit>> state4, Continuation<? super C00441> continuation) {
                    super(2, continuation);
                    this.$isRtl = z;
                    this.$maxPx = f;
                    this.$rangeSliderLogic = rangeSliderLogic;
                    this.$rawOffsetStart = state;
                    this.$$this$coroutineScope = coroutineScope;
                    this.$gestureEndAction = state2;
                    this.$rawOffsetEnd = state3;
                    this.$onDrag = state4;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C00441 c00441 = new C00441(this.$isRtl, this.$maxPx, this.$rangeSliderLogic, this.$rawOffsetStart, this.$$this$coroutineScope, this.$gestureEndAction, this.$rawOffsetEnd, this.$onDrag, continuation);
                    c00441.L$0 = obj;
                    return c00441;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, Continuation<? super Unit> continuation) {
                    return ((C00441) create(awaitPointerEventScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* JADX WARN: Removed duplicated region for block: B:12:0x0188 A[Catch: CancellationException -> 0x019a, TryCatch #1 {CancellationException -> 0x019a, blocks: (B:8:0x001d, B:10:0x0180, B:12:0x0188, B:16:0x0190), top: B:7:0x001d }] */
                /* JADX WARN: Removed duplicated region for block: B:16:0x0190 A[Catch: CancellationException -> 0x019a, TRY_LEAVE, TryCatch #1 {CancellationException -> 0x019a, blocks: (B:8:0x001d, B:10:0x0180, B:12:0x0188, B:16:0x0190), top: B:7:0x001d }] */
                /* JADX WARN: Removed duplicated region for block: B:24:0x00e1  */
                /* JADX WARN: Removed duplicated region for block: B:41:0x017d A[RETURN] */
                /* JADX WARN: Removed duplicated region for block: B:42:0x017e  */
                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object invokeSuspend(Object obj) {
                    AwaitPointerEventScope awaitPointerEventScope;
                    Object awaitFirstDown;
                    Object m1151awaitSlop8vUncbI;
                    AwaitPointerEventScope awaitPointerEventScope2;
                    PointerInputChange pointerInputChange;
                    Ref.FloatRef floatRef;
                    DragInteraction.Start start;
                    final Ref.BooleanRef booleanRef;
                    Pair pair;
                    Ref.BooleanRef booleanRef2;
                    DragInteraction.Start start2;
                    Object m266horizontalDragjO51t88;
                    DragInteraction.Cancel cancel;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i = this.label;
                    if (i == 0) {
                        ResultKt.throwOnFailure(obj);
                        awaitPointerEventScope = (AwaitPointerEventScope) this.L$0;
                        this.L$0 = awaitPointerEventScope;
                        this.label = 1;
                        awaitFirstDown = TapGestureDetectorKt.awaitFirstDown(awaitPointerEventScope, false, this);
                        if (awaitFirstDown == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                if (i == 3) {
                                    booleanRef2 = (Ref.BooleanRef) this.L$1;
                                    start2 = (DragInteraction.Start) this.L$0;
                                    try {
                                        ResultKt.throwOnFailure(obj);
                                        m266horizontalDragjO51t88 = obj;
                                        if (!((Boolean) m266horizontalDragjO51t88).booleanValue()) {
                                            cancel = new DragInteraction.Stop(start2);
                                        } else {
                                            cancel = new DragInteraction.Cancel(start2);
                                        }
                                    } catch (CancellationException unused) {
                                        cancel = new DragInteraction.Cancel(start2);
                                        this.$gestureEndAction.getValue().invoke(Boxing.boxBoolean(booleanRef2.element));
                                        BuildersKt__Builders_commonKt.launch$default(this.$$this$coroutineScope, null, null, new AnonymousClass2(this.$rangeSliderLogic, booleanRef2, cancel, null), 3, null);
                                        return Unit.INSTANCE;
                                    }
                                    this.$gestureEndAction.getValue().invoke(Boxing.boxBoolean(booleanRef2.element));
                                    BuildersKt__Builders_commonKt.launch$default(this.$$this$coroutineScope, null, null, new AnonymousClass2(this.$rangeSliderLogic, booleanRef2, cancel, null), 3, null);
                                    return Unit.INSTANCE;
                                }
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            booleanRef = (Ref.BooleanRef) this.L$4;
                            Ref.FloatRef floatRef2 = (Ref.FloatRef) this.L$3;
                            start = (DragInteraction.Start) this.L$2;
                            PointerInputChange pointerInputChange2 = (PointerInputChange) this.L$1;
                            AwaitPointerEventScope awaitPointerEventScope3 = (AwaitPointerEventScope) this.L$0;
                            ResultKt.throwOnFailure(obj);
                            awaitPointerEventScope2 = awaitPointerEventScope3;
                            pointerInputChange = pointerInputChange2;
                            floatRef = floatRef2;
                            m1151awaitSlop8vUncbI = obj;
                            pair = (Pair) m1151awaitSlop8vUncbI;
                            if (pair != null) {
                                State<Float> state = this.$rawOffsetEnd;
                                State<Float> state2 = this.$rawOffsetStart;
                                boolean z = this.$isRtl;
                                float m1020pointerSlopE8SPZFQ = DragGestureDetectorCopyKt.m1020pointerSlopE8SPZFQ(awaitPointerEventScope2.getViewConfiguration(), pointerInputChange.getType());
                                if (Math.abs(state.getValue().floatValue() - floatRef.element) < m1020pointerSlopE8SPZFQ && Math.abs(state2.getValue().floatValue() - floatRef.element) < m1020pointerSlopE8SPZFQ) {
                                    float floatValue = ((Number) pair.getSecond()).floatValue();
                                    booleanRef.element = !z ? floatValue >= 0.0f : floatValue < 0.0f;
                                    floatRef.element += Offset.m1392getXimpl(PointerEventKt.positionChange((PointerInputChange) pair.getFirst()));
                                }
                            }
                            this.$rangeSliderLogic.captureThumb(booleanRef.element, floatRef.element, start, this.$$this$coroutineScope);
                            try {
                                long id = pointerInputChange.getId();
                                final State<Function2<Boolean, Float, Unit>> state3 = this.$onDrag;
                                final boolean z2 = this.$isRtl;
                                this.L$0 = start;
                                this.L$1 = booleanRef;
                                this.L$2 = null;
                                this.L$3 = null;
                                this.L$4 = null;
                                this.label = 3;
                                m266horizontalDragjO51t88 = DragGestureDetectorKt.m266horizontalDragjO51t88(awaitPointerEventScope2, id, new Function1<PointerInputChange, Unit>() { // from class: androidx.compose.material.SliderKt$rangeSliderPressDragModifier$1$1$1$1$finishInteraction$success$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(1);
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Unit invoke(PointerInputChange pointerInputChange3) {
                                        invoke2(pointerInputChange3);
                                        return Unit.INSTANCE;
                                    }

                                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2(PointerInputChange it) {
                                        Intrinsics.checkNotNullParameter(it, "it");
                                        float m1392getXimpl = Offset.m1392getXimpl(PointerEventKt.positionChange(it));
                                        Function2<Boolean, Float, Unit> value = state3.getValue();
                                        Boolean valueOf = Boolean.valueOf(booleanRef.element);
                                        if (z2) {
                                            m1392getXimpl = -m1392getXimpl;
                                        }
                                        value.invoke(valueOf, Float.valueOf(m1392getXimpl));
                                    }
                                }, this);
                            } catch (CancellationException unused2) {
                                booleanRef2 = booleanRef;
                                start2 = start;
                                cancel = new DragInteraction.Cancel(start2);
                                this.$gestureEndAction.getValue().invoke(Boxing.boxBoolean(booleanRef2.element));
                                BuildersKt__Builders_commonKt.launch$default(this.$$this$coroutineScope, null, null, new AnonymousClass2(this.$rangeSliderLogic, booleanRef2, cancel, null), 3, null);
                                return Unit.INSTANCE;
                            }
                            if (m266horizontalDragjO51t88 != coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            booleanRef2 = booleanRef;
                            start2 = start;
                            if (!((Boolean) m266horizontalDragjO51t88).booleanValue()) {
                            }
                            this.$gestureEndAction.getValue().invoke(Boxing.boxBoolean(booleanRef2.element));
                            BuildersKt__Builders_commonKt.launch$default(this.$$this$coroutineScope, null, null, new AnonymousClass2(this.$rangeSliderLogic, booleanRef2, cancel, null), 3, null);
                            return Unit.INSTANCE;
                        }
                        awaitPointerEventScope = (AwaitPointerEventScope) this.L$0;
                        ResultKt.throwOnFailure(obj);
                        awaitFirstDown = obj;
                    }
                    AwaitPointerEventScope awaitPointerEventScope4 = awaitPointerEventScope;
                    PointerInputChange pointerInputChange3 = (PointerInputChange) awaitFirstDown;
                    DragInteraction.Start start3 = new DragInteraction.Start();
                    Ref.FloatRef floatRef3 = new Ref.FloatRef();
                    floatRef3.element = this.$isRtl ? this.$maxPx - Offset.m1392getXimpl(pointerInputChange3.getPosition()) : Offset.m1392getXimpl(pointerInputChange3.getPosition());
                    int compareOffsets = this.$rangeSliderLogic.compareOffsets(floatRef3.element);
                    Ref.BooleanRef booleanRef3 = new Ref.BooleanRef();
                    booleanRef3.element = compareOffsets == 0 ? this.$rawOffsetStart.getValue().floatValue() > floatRef3.element : compareOffsets < 0;
                    this.L$0 = awaitPointerEventScope4;
                    this.L$1 = pointerInputChange3;
                    this.L$2 = start3;
                    this.L$3 = floatRef3;
                    this.L$4 = booleanRef3;
                    this.label = 2;
                    m1151awaitSlop8vUncbI = SliderKt.m1151awaitSlop8vUncbI(awaitPointerEventScope4, pointerInputChange3.getId(), pointerInputChange3.getType(), this);
                    if (m1151awaitSlop8vUncbI == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    awaitPointerEventScope2 = awaitPointerEventScope4;
                    pointerInputChange = pointerInputChange3;
                    floatRef = floatRef3;
                    start = start3;
                    booleanRef = booleanRef3;
                    pair = (Pair) m1151awaitSlop8vUncbI;
                    if (pair != null) {
                    }
                    this.$rangeSliderLogic.captureThumb(booleanRef.element, floatRef.element, start, this.$$this$coroutineScope);
                    long id2 = pointerInputChange.getId();
                    final State<? extends Function2<? super Boolean, ? super Float, Unit>> state32 = this.$onDrag;
                    final boolean z22 = this.$isRtl;
                    this.L$0 = start;
                    this.L$1 = booleanRef;
                    this.L$2 = null;
                    this.L$3 = null;
                    this.L$4 = null;
                    this.label = 3;
                    m266horizontalDragjO51t88 = DragGestureDetectorKt.m266horizontalDragjO51t88(awaitPointerEventScope2, id2, new Function1<PointerInputChange, Unit>() { // from class: androidx.compose.material.SliderKt$rangeSliderPressDragModifier$1$1$1$1$finishInteraction$success$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(PointerInputChange pointerInputChange32) {
                            invoke2(pointerInputChange32);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(PointerInputChange it) {
                            Intrinsics.checkNotNullParameter(it, "it");
                            float m1392getXimpl = Offset.m1392getXimpl(PointerEventKt.positionChange(it));
                            Function2<Boolean, Float, Unit> value = state32.getValue();
                            Boolean valueOf = Boolean.valueOf(booleanRef.element);
                            if (z22) {
                                m1392getXimpl = -m1392getXimpl;
                            }
                            value.invoke(valueOf, Float.valueOf(m1392getXimpl));
                        }
                    }, this);
                    if (m266horizontalDragjO51t88 != coroutine_suspended) {
                    }
                }

                /* compiled from: Slider.kt */
                @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 6, 0}, xi = 48)
                @DebugMetadata(c = "androidx.compose.material.SliderKt$rangeSliderPressDragModifier$1$1$1$1$2", f = "Slider.kt", i = {}, l = {1004}, m = "invokeSuspend", n = {}, s = {})
                /* renamed from: androidx.compose.material.SliderKt$rangeSliderPressDragModifier$1$1$1$1$2, reason: invalid class name */
                static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                    final /* synthetic */ Ref.BooleanRef $draggingStart;
                    final /* synthetic */ DragInteraction $finishInteraction;
                    final /* synthetic */ RangeSliderLogic $rangeSliderLogic;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    AnonymousClass2(RangeSliderLogic rangeSliderLogic, Ref.BooleanRef booleanRef, DragInteraction dragInteraction, Continuation<? super AnonymousClass2> continuation) {
                        super(2, continuation);
                        this.$rangeSliderLogic = rangeSliderLogic;
                        this.$draggingStart = booleanRef;
                        this.$finishInteraction = dragInteraction;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        return new AnonymousClass2(this.$rangeSliderLogic, this.$draggingStart, this.$finishInteraction, continuation);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                        return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        int i = this.label;
                        if (i == 0) {
                            ResultKt.throwOnFailure(obj);
                            this.label = 1;
                            if (this.$rangeSliderLogic.activeInteraction(this.$draggingStart.element).emit(this.$finishInteraction, this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        } else {
                            if (i != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ResultKt.throwOnFailure(obj);
                        }
                        return Unit.INSTANCE;
                    }
                }
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.label = 1;
                    if (((PointerInputScope) this.L$0).awaitPointerEventScope(new C00441(this.$isRtl, this.$maxPx, this.$rangeSliderLogic, this.$rawOffsetStart, this.$$this$coroutineScope, this.$gestureEndAction, this.$rawOffsetEnd, this.$onDrag, null), this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                this.label = 1;
                if (ForEachGestureKt.forEachGesture(this.$$this$pointerInput, new C00431(this.$isRtl, this.$maxPx, this.$rangeSliderLogic, this.$rawOffsetStart, coroutineScope, this.$gestureEndAction, this.$rawOffsetEnd, this.$onDrag, null), this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }
}
