package androidx.compose.material;

/* compiled from: Slider.kt */
@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/input/pointer/PointerInputScope;"}, k = 3, mv = {1, 6, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.material.SliderKt$rangeSliderPressDragModifier$1", f = "Slider.kt", i = {}, l = {955}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes.dex */
final class SliderKt$rangeSliderPressDragModifier$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<androidx.compose.ui.input.pointer.PointerInputScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ androidx.compose.foundation.interaction.MutableInteractionSource $endInteractionSource;
    final /* synthetic */ androidx.compose.runtime.State<kotlin.jvm.functions.Function1<java.lang.Boolean, kotlin.Unit>> $gestureEndAction;
    final /* synthetic */ boolean $isRtl;
    final /* synthetic */ float $maxPx;
    final /* synthetic */ androidx.compose.runtime.State<kotlin.jvm.functions.Function2<java.lang.Boolean, java.lang.Float, kotlin.Unit>> $onDrag;
    final /* synthetic */ androidx.compose.runtime.State<java.lang.Float> $rawOffsetEnd;
    final /* synthetic */ androidx.compose.runtime.State<java.lang.Float> $rawOffsetStart;
    final /* synthetic */ androidx.compose.foundation.interaction.MutableInteractionSource $startInteractionSource;
    private /* synthetic */ java.lang.Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    SliderKt$rangeSliderPressDragModifier$1(androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource, androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource2, androidx.compose.runtime.State<java.lang.Float> state, androidx.compose.runtime.State<java.lang.Float> state2, androidx.compose.runtime.State<? extends kotlin.jvm.functions.Function2<? super java.lang.Boolean, ? super java.lang.Float, kotlin.Unit>> state3, boolean z, float f, androidx.compose.runtime.State<? extends kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit>> state4, kotlin.coroutines.Continuation<? super androidx.compose.material.SliderKt$rangeSliderPressDragModifier$1> continuation) {
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
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        androidx.compose.material.SliderKt$rangeSliderPressDragModifier$1 sliderKt$rangeSliderPressDragModifier$1 = new androidx.compose.material.SliderKt$rangeSliderPressDragModifier$1(this.$startInteractionSource, this.$endInteractionSource, this.$rawOffsetStart, this.$rawOffsetEnd, this.$onDrag, this.$isRtl, this.$maxPx, this.$gestureEndAction, continuation);
        sliderKt$rangeSliderPressDragModifier$1.L$0 = obj;
        return sliderKt$rangeSliderPressDragModifier$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(androidx.compose.ui.input.pointer.PointerInputScope pointerInputScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((androidx.compose.material.SliderKt$rangeSliderPressDragModifier$1) create(pointerInputScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            androidx.compose.ui.input.pointer.PointerInputScope pointerInputScope = (androidx.compose.ui.input.pointer.PointerInputScope) this.L$0;
            androidx.compose.material.RangeSliderLogic rangeSliderLogic = new androidx.compose.material.RangeSliderLogic(this.$startInteractionSource, this.$endInteractionSource, this.$rawOffsetStart, this.$rawOffsetEnd, this.$onDrag);
            this.label = 1;
            if (kotlinx.coroutines.CoroutineScopeKt.coroutineScope(new androidx.compose.material.SliderKt$rangeSliderPressDragModifier$1.AnonymousClass1(pointerInputScope, this.$isRtl, this.$maxPx, rangeSliderLogic, this.$rawOffsetStart, this.$gestureEndAction, this.$rawOffsetEnd, this.$onDrag, null), this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return kotlin.Unit.INSTANCE;
    }

    /* compiled from: Slider.kt */
    @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 6, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.material.SliderKt$rangeSliderPressDragModifier$1$1", f = "Slider.kt", i = {}, l = {956}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: androidx.compose.material.SliderKt$rangeSliderPressDragModifier$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        final /* synthetic */ androidx.compose.ui.input.pointer.PointerInputScope $$this$pointerInput;
        final /* synthetic */ androidx.compose.runtime.State<kotlin.jvm.functions.Function1<java.lang.Boolean, kotlin.Unit>> $gestureEndAction;
        final /* synthetic */ boolean $isRtl;
        final /* synthetic */ float $maxPx;
        final /* synthetic */ androidx.compose.runtime.State<kotlin.jvm.functions.Function2<java.lang.Boolean, java.lang.Float, kotlin.Unit>> $onDrag;
        final /* synthetic */ androidx.compose.material.RangeSliderLogic $rangeSliderLogic;
        final /* synthetic */ androidx.compose.runtime.State<java.lang.Float> $rawOffsetEnd;
        final /* synthetic */ androidx.compose.runtime.State<java.lang.Float> $rawOffsetStart;
        private /* synthetic */ java.lang.Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(androidx.compose.ui.input.pointer.PointerInputScope pointerInputScope, boolean z, float f, androidx.compose.material.RangeSliderLogic rangeSliderLogic, androidx.compose.runtime.State<java.lang.Float> state, androidx.compose.runtime.State<? extends kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit>> state2, androidx.compose.runtime.State<java.lang.Float> state3, androidx.compose.runtime.State<? extends kotlin.jvm.functions.Function2<? super java.lang.Boolean, ? super java.lang.Float, kotlin.Unit>> state4, kotlin.coroutines.Continuation<? super androidx.compose.material.SliderKt$rangeSliderPressDragModifier$1.AnonymousClass1> continuation) {
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
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            androidx.compose.material.SliderKt$rangeSliderPressDragModifier$1.AnonymousClass1 anonymousClass1 = new androidx.compose.material.SliderKt$rangeSliderPressDragModifier$1.AnonymousClass1(this.$$this$pointerInput, this.$isRtl, this.$maxPx, this.$rangeSliderLogic, this.$rawOffsetStart, this.$gestureEndAction, this.$rawOffsetEnd, this.$onDrag, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((androidx.compose.material.SliderKt$rangeSliderPressDragModifier$1.AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        /* compiled from: Slider.kt */
        @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/input/pointer/PointerInputScope;"}, k = 3, mv = {1, 6, 0}, xi = 48)
        @kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.material.SliderKt$rangeSliderPressDragModifier$1$1$1", f = "Slider.kt", i = {}, l = {957}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: androidx.compose.material.SliderKt$rangeSliderPressDragModifier$1$1$1, reason: invalid class name and collision with other inner class name */
        static final class C00501 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<androidx.compose.ui.input.pointer.PointerInputScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
            final /* synthetic */ kotlinx.coroutines.CoroutineScope $$this$coroutineScope;
            final /* synthetic */ androidx.compose.runtime.State<kotlin.jvm.functions.Function1<java.lang.Boolean, kotlin.Unit>> $gestureEndAction;
            final /* synthetic */ boolean $isRtl;
            final /* synthetic */ float $maxPx;
            final /* synthetic */ androidx.compose.runtime.State<kotlin.jvm.functions.Function2<java.lang.Boolean, java.lang.Float, kotlin.Unit>> $onDrag;
            final /* synthetic */ androidx.compose.material.RangeSliderLogic $rangeSliderLogic;
            final /* synthetic */ androidx.compose.runtime.State<java.lang.Float> $rawOffsetEnd;
            final /* synthetic */ androidx.compose.runtime.State<java.lang.Float> $rawOffsetStart;
            private /* synthetic */ java.lang.Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C00501(boolean z, float f, androidx.compose.material.RangeSliderLogic rangeSliderLogic, androidx.compose.runtime.State<java.lang.Float> state, kotlinx.coroutines.CoroutineScope coroutineScope, androidx.compose.runtime.State<? extends kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit>> state2, androidx.compose.runtime.State<java.lang.Float> state3, androidx.compose.runtime.State<? extends kotlin.jvm.functions.Function2<? super java.lang.Boolean, ? super java.lang.Float, kotlin.Unit>> state4, kotlin.coroutines.Continuation<? super androidx.compose.material.SliderKt$rangeSliderPressDragModifier$1.AnonymousClass1.C00501> continuation) {
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
            public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
                androidx.compose.material.SliderKt$rangeSliderPressDragModifier$1.AnonymousClass1.C00501 c00501 = new androidx.compose.material.SliderKt$rangeSliderPressDragModifier$1.AnonymousClass1.C00501(this.$isRtl, this.$maxPx, this.$rangeSliderLogic, this.$rawOffsetStart, this.$$this$coroutineScope, this.$gestureEndAction, this.$rawOffsetEnd, this.$onDrag, continuation);
                c00501.L$0 = obj;
                return c00501;
            }

            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(androidx.compose.ui.input.pointer.PointerInputScope pointerInputScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
                return ((androidx.compose.material.SliderKt$rangeSliderPressDragModifier$1.AnonymousClass1.C00501) create(pointerInputScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
            }

            /* compiled from: Slider.kt */
            @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;"}, k = 3, mv = {1, 6, 0}, xi = 48)
            @kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.material.SliderKt$rangeSliderPressDragModifier$1$1$1$1", f = "Slider.kt", i = {0, 1, 1, 1, 1, 1, 2, 2}, l = {958, 968, 987}, m = "invokeSuspend", n = {"$this$awaitPointerEventScope", "$this$awaitPointerEventScope", androidx.core.app.NotificationCompat.CATEGORY_EVENT, "interaction", "posX", "draggingStart", "interaction", "draggingStart"}, s = {"L$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$0", "L$1"})
            /* renamed from: androidx.compose.material.SliderKt$rangeSliderPressDragModifier$1$1$1$1, reason: invalid class name and collision with other inner class name */
            static final class C00511 extends kotlin.coroutines.jvm.internal.RestrictedSuspendLambda implements kotlin.jvm.functions.Function2<androidx.compose.ui.input.pointer.AwaitPointerEventScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
                final /* synthetic */ kotlinx.coroutines.CoroutineScope $$this$coroutineScope;
                final /* synthetic */ androidx.compose.runtime.State<kotlin.jvm.functions.Function1<java.lang.Boolean, kotlin.Unit>> $gestureEndAction;
                final /* synthetic */ boolean $isRtl;
                final /* synthetic */ float $maxPx;
                final /* synthetic */ androidx.compose.runtime.State<kotlin.jvm.functions.Function2<java.lang.Boolean, java.lang.Float, kotlin.Unit>> $onDrag;
                final /* synthetic */ androidx.compose.material.RangeSliderLogic $rangeSliderLogic;
                final /* synthetic */ androidx.compose.runtime.State<java.lang.Float> $rawOffsetEnd;
                final /* synthetic */ androidx.compose.runtime.State<java.lang.Float> $rawOffsetStart;
                private /* synthetic */ java.lang.Object L$0;
                java.lang.Object L$1;
                java.lang.Object L$2;
                java.lang.Object L$3;
                java.lang.Object L$4;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                C00511(boolean z, float f, androidx.compose.material.RangeSliderLogic rangeSliderLogic, androidx.compose.runtime.State<java.lang.Float> state, kotlinx.coroutines.CoroutineScope coroutineScope, androidx.compose.runtime.State<? extends kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit>> state2, androidx.compose.runtime.State<java.lang.Float> state3, androidx.compose.runtime.State<? extends kotlin.jvm.functions.Function2<? super java.lang.Boolean, ? super java.lang.Float, kotlin.Unit>> state4, kotlin.coroutines.Continuation<? super androidx.compose.material.SliderKt$rangeSliderPressDragModifier$1.AnonymousClass1.C00501.C00511> continuation) {
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
                public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
                    androidx.compose.material.SliderKt$rangeSliderPressDragModifier$1.AnonymousClass1.C00501.C00511 c00511 = new androidx.compose.material.SliderKt$rangeSliderPressDragModifier$1.AnonymousClass1.C00501.C00511(this.$isRtl, this.$maxPx, this.$rangeSliderLogic, this.$rawOffsetStart, this.$$this$coroutineScope, this.$gestureEndAction, this.$rawOffsetEnd, this.$onDrag, continuation);
                    c00511.L$0 = obj;
                    return c00511;
                }

                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(androidx.compose.ui.input.pointer.AwaitPointerEventScope awaitPointerEventScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
                    return ((androidx.compose.material.SliderKt$rangeSliderPressDragModifier$1.AnonymousClass1.C00501.C00511) create(awaitPointerEventScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
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
                public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                    androidx.compose.ui.input.pointer.AwaitPointerEventScope awaitPointerEventScope;
                    java.lang.Object awaitFirstDown;
                    java.lang.Object m1490awaitSlop8vUncbI;
                    androidx.compose.ui.input.pointer.AwaitPointerEventScope awaitPointerEventScope2;
                    androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange;
                    kotlin.jvm.internal.Ref.FloatRef floatRef;
                    androidx.compose.foundation.interaction.DragInteraction.Start start;
                    final kotlin.jvm.internal.Ref.BooleanRef booleanRef;
                    kotlin.Pair pair;
                    kotlin.jvm.internal.Ref.BooleanRef booleanRef2;
                    androidx.compose.foundation.interaction.DragInteraction.Start start2;
                    java.lang.Object m351horizontalDragjO51t88;
                    androidx.compose.foundation.interaction.DragInteraction.Cancel cancel;
                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i = this.label;
                    if (i == 0) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        awaitPointerEventScope = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) this.L$0;
                        this.L$0 = awaitPointerEventScope;
                        this.label = 1;
                        awaitFirstDown = androidx.compose.foundation.gestures.TapGestureDetectorKt.awaitFirstDown(awaitPointerEventScope, false, this);
                        if (awaitFirstDown == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                if (i == 3) {
                                    booleanRef2 = (kotlin.jvm.internal.Ref.BooleanRef) this.L$1;
                                    start2 = (androidx.compose.foundation.interaction.DragInteraction.Start) this.L$0;
                                    try {
                                        kotlin.ResultKt.throwOnFailure(obj);
                                        m351horizontalDragjO51t88 = obj;
                                        if (!((java.lang.Boolean) m351horizontalDragjO51t88).booleanValue()) {
                                            cancel = new androidx.compose.foundation.interaction.DragInteraction.Stop(start2);
                                        } else {
                                            cancel = new androidx.compose.foundation.interaction.DragInteraction.Cancel(start2);
                                        }
                                    } catch (java.util.concurrent.CancellationException unused) {
                                        cancel = new androidx.compose.foundation.interaction.DragInteraction.Cancel(start2);
                                        this.$gestureEndAction.getValue().invoke(kotlin.coroutines.jvm.internal.Boxing.boxBoolean(booleanRef2.element));
                                        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(this.$$this$coroutineScope, null, null, new androidx.compose.material.SliderKt$rangeSliderPressDragModifier$1.AnonymousClass1.C00501.C00511.AnonymousClass2(this.$rangeSliderLogic, booleanRef2, cancel, null), 3, null);
                                        return kotlin.Unit.INSTANCE;
                                    }
                                    this.$gestureEndAction.getValue().invoke(kotlin.coroutines.jvm.internal.Boxing.boxBoolean(booleanRef2.element));
                                    kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(this.$$this$coroutineScope, null, null, new androidx.compose.material.SliderKt$rangeSliderPressDragModifier$1.AnonymousClass1.C00501.C00511.AnonymousClass2(this.$rangeSliderLogic, booleanRef2, cancel, null), 3, null);
                                    return kotlin.Unit.INSTANCE;
                                }
                                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            booleanRef = (kotlin.jvm.internal.Ref.BooleanRef) this.L$4;
                            kotlin.jvm.internal.Ref.FloatRef floatRef2 = (kotlin.jvm.internal.Ref.FloatRef) this.L$3;
                            start = (androidx.compose.foundation.interaction.DragInteraction.Start) this.L$2;
                            androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange2 = (androidx.compose.ui.input.pointer.PointerInputChange) this.L$1;
                            androidx.compose.ui.input.pointer.AwaitPointerEventScope awaitPointerEventScope3 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) this.L$0;
                            kotlin.ResultKt.throwOnFailure(obj);
                            awaitPointerEventScope2 = awaitPointerEventScope3;
                            pointerInputChange = pointerInputChange2;
                            floatRef = floatRef2;
                            m1490awaitSlop8vUncbI = obj;
                            pair = (kotlin.Pair) m1490awaitSlop8vUncbI;
                            if (pair != null) {
                                androidx.compose.runtime.State<java.lang.Float> state = this.$rawOffsetEnd;
                                androidx.compose.runtime.State<java.lang.Float> state2 = this.$rawOffsetStart;
                                boolean z = this.$isRtl;
                                float m1359pointerSlopE8SPZFQ = androidx.compose.material.DragGestureDetectorCopyKt.m1359pointerSlopE8SPZFQ(awaitPointerEventScope2.getViewConfiguration(), pointerInputChange.getType());
                                if (java.lang.Math.abs(state.getValue().floatValue() - floatRef.element) < m1359pointerSlopE8SPZFQ && java.lang.Math.abs(state2.getValue().floatValue() - floatRef.element) < m1359pointerSlopE8SPZFQ) {
                                    float floatValue = ((java.lang.Number) pair.getSecond()).floatValue();
                                    booleanRef.element = !z ? floatValue >= 0.0f : floatValue < 0.0f;
                                    floatRef.element += androidx.compose.ui.geometry.Offset.m1871getXimpl(androidx.compose.ui.input.pointer.PointerEventKt.positionChange((androidx.compose.ui.input.pointer.PointerInputChange) pair.getFirst()));
                                }
                            }
                            this.$rangeSliderLogic.captureThumb(booleanRef.element, floatRef.element, start, this.$$this$coroutineScope);
                            try {
                                long id = pointerInputChange.getId();
                                final androidx.compose.runtime.State<kotlin.jvm.functions.Function2<java.lang.Boolean, java.lang.Float, kotlin.Unit>> state3 = this.$onDrag;
                                final boolean z2 = this.$isRtl;
                                this.L$0 = start;
                                this.L$1 = booleanRef;
                                this.L$2 = null;
                                this.L$3 = null;
                                this.L$4 = null;
                                this.label = 3;
                                m351horizontalDragjO51t88 = androidx.compose.foundation.gestures.DragGestureDetectorKt.m351horizontalDragjO51t88(awaitPointerEventScope2, id, new kotlin.jvm.functions.Function1<androidx.compose.ui.input.pointer.PointerInputChange, kotlin.Unit>() { // from class: androidx.compose.material.SliderKt$rangeSliderPressDragModifier$1$1$1$1$finishInteraction$success$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(1);
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange3) {
                                        invoke2(pointerInputChange3);
                                        return kotlin.Unit.INSTANCE;
                                    }

                                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2(androidx.compose.ui.input.pointer.PointerInputChange it) {
                                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
                                        float m1871getXimpl = androidx.compose.ui.geometry.Offset.m1871getXimpl(androidx.compose.ui.input.pointer.PointerEventKt.positionChange(it));
                                        kotlin.jvm.functions.Function2<java.lang.Boolean, java.lang.Float, kotlin.Unit> value = state3.getValue();
                                        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(booleanRef.element);
                                        if (z2) {
                                            m1871getXimpl = -m1871getXimpl;
                                        }
                                        value.invoke(valueOf, java.lang.Float.valueOf(m1871getXimpl));
                                    }
                                }, this);
                            } catch (java.util.concurrent.CancellationException unused2) {
                                booleanRef2 = booleanRef;
                                start2 = start;
                                cancel = new androidx.compose.foundation.interaction.DragInteraction.Cancel(start2);
                                this.$gestureEndAction.getValue().invoke(kotlin.coroutines.jvm.internal.Boxing.boxBoolean(booleanRef2.element));
                                kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(this.$$this$coroutineScope, null, null, new androidx.compose.material.SliderKt$rangeSliderPressDragModifier$1.AnonymousClass1.C00501.C00511.AnonymousClass2(this.$rangeSliderLogic, booleanRef2, cancel, null), 3, null);
                                return kotlin.Unit.INSTANCE;
                            }
                            if (m351horizontalDragjO51t88 != coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            booleanRef2 = booleanRef;
                            start2 = start;
                            if (!((java.lang.Boolean) m351horizontalDragjO51t88).booleanValue()) {
                            }
                            this.$gestureEndAction.getValue().invoke(kotlin.coroutines.jvm.internal.Boxing.boxBoolean(booleanRef2.element));
                            kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(this.$$this$coroutineScope, null, null, new androidx.compose.material.SliderKt$rangeSliderPressDragModifier$1.AnonymousClass1.C00501.C00511.AnonymousClass2(this.$rangeSliderLogic, booleanRef2, cancel, null), 3, null);
                            return kotlin.Unit.INSTANCE;
                        }
                        awaitPointerEventScope = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) this.L$0;
                        kotlin.ResultKt.throwOnFailure(obj);
                        awaitFirstDown = obj;
                    }
                    androidx.compose.ui.input.pointer.AwaitPointerEventScope awaitPointerEventScope4 = awaitPointerEventScope;
                    androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange3 = (androidx.compose.ui.input.pointer.PointerInputChange) awaitFirstDown;
                    androidx.compose.foundation.interaction.DragInteraction.Start start3 = new androidx.compose.foundation.interaction.DragInteraction.Start();
                    kotlin.jvm.internal.Ref.FloatRef floatRef3 = new kotlin.jvm.internal.Ref.FloatRef();
                    floatRef3.element = this.$isRtl ? this.$maxPx - androidx.compose.ui.geometry.Offset.m1871getXimpl(pointerInputChange3.getPosition()) : androidx.compose.ui.geometry.Offset.m1871getXimpl(pointerInputChange3.getPosition());
                    int compareOffsets = this.$rangeSliderLogic.compareOffsets(floatRef3.element);
                    kotlin.jvm.internal.Ref.BooleanRef booleanRef3 = new kotlin.jvm.internal.Ref.BooleanRef();
                    booleanRef3.element = compareOffsets == 0 ? this.$rawOffsetStart.getValue().floatValue() > floatRef3.element : compareOffsets < 0;
                    this.L$0 = awaitPointerEventScope4;
                    this.L$1 = pointerInputChange3;
                    this.L$2 = start3;
                    this.L$3 = floatRef3;
                    this.L$4 = booleanRef3;
                    this.label = 2;
                    m1490awaitSlop8vUncbI = androidx.compose.material.SliderKt.m1490awaitSlop8vUncbI(awaitPointerEventScope4, pointerInputChange3.getId(), pointerInputChange3.getType(), this);
                    if (m1490awaitSlop8vUncbI == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    awaitPointerEventScope2 = awaitPointerEventScope4;
                    pointerInputChange = pointerInputChange3;
                    floatRef = floatRef3;
                    start = start3;
                    booleanRef = booleanRef3;
                    pair = (kotlin.Pair) m1490awaitSlop8vUncbI;
                    if (pair != null) {
                    }
                    this.$rangeSliderLogic.captureThumb(booleanRef.element, floatRef.element, start, this.$$this$coroutineScope);
                    long id2 = pointerInputChange.getId();
                    final androidx.compose.runtime.State<? extends kotlin.jvm.functions.Function2<? super java.lang.Boolean, ? super java.lang.Float, kotlin.Unit>> state32 = this.$onDrag;
                    final boolean z22 = this.$isRtl;
                    this.L$0 = start;
                    this.L$1 = booleanRef;
                    this.L$2 = null;
                    this.L$3 = null;
                    this.L$4 = null;
                    this.label = 3;
                    m351horizontalDragjO51t88 = androidx.compose.foundation.gestures.DragGestureDetectorKt.m351horizontalDragjO51t88(awaitPointerEventScope2, id2, new kotlin.jvm.functions.Function1<androidx.compose.ui.input.pointer.PointerInputChange, kotlin.Unit>() { // from class: androidx.compose.material.SliderKt$rangeSliderPressDragModifier$1$1$1$1$finishInteraction$success$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange32) {
                            invoke2(pointerInputChange32);
                            return kotlin.Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(androidx.compose.ui.input.pointer.PointerInputChange it) {
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
                            float m1871getXimpl = androidx.compose.ui.geometry.Offset.m1871getXimpl(androidx.compose.ui.input.pointer.PointerEventKt.positionChange(it));
                            kotlin.jvm.functions.Function2<java.lang.Boolean, java.lang.Float, kotlin.Unit> value = state32.getValue();
                            java.lang.Boolean valueOf = java.lang.Boolean.valueOf(booleanRef.element);
                            if (z22) {
                                m1871getXimpl = -m1871getXimpl;
                            }
                            value.invoke(valueOf, java.lang.Float.valueOf(m1871getXimpl));
                        }
                    }, this);
                    if (m351horizontalDragjO51t88 != coroutine_suspended) {
                    }
                }

                /* compiled from: Slider.kt */
                @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 6, 0}, xi = 48)
                @kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.material.SliderKt$rangeSliderPressDragModifier$1$1$1$1$2", f = "Slider.kt", i = {}, l = {1004}, m = "invokeSuspend", n = {}, s = {})
                /* renamed from: androidx.compose.material.SliderKt$rangeSliderPressDragModifier$1$1$1$1$2, reason: invalid class name */
                static final class AnonymousClass2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
                    final /* synthetic */ kotlin.jvm.internal.Ref.BooleanRef $draggingStart;
                    final /* synthetic */ androidx.compose.foundation.interaction.DragInteraction $finishInteraction;
                    final /* synthetic */ androidx.compose.material.RangeSliderLogic $rangeSliderLogic;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    AnonymousClass2(androidx.compose.material.RangeSliderLogic rangeSliderLogic, kotlin.jvm.internal.Ref.BooleanRef booleanRef, androidx.compose.foundation.interaction.DragInteraction dragInteraction, kotlin.coroutines.Continuation<? super androidx.compose.material.SliderKt$rangeSliderPressDragModifier$1.AnonymousClass1.C00501.C00511.AnonymousClass2> continuation) {
                        super(2, continuation);
                        this.$rangeSliderLogic = rangeSliderLogic;
                        this.$draggingStart = booleanRef;
                        this.$finishInteraction = dragInteraction;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
                        return new androidx.compose.material.SliderKt$rangeSliderPressDragModifier$1.AnonymousClass1.C00501.C00511.AnonymousClass2(this.$rangeSliderLogic, this.$draggingStart, this.$finishInteraction, continuation);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
                        return ((androidx.compose.material.SliderKt$rangeSliderPressDragModifier$1.AnonymousClass1.C00501.C00511.AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        int i = this.label;
                        if (i == 0) {
                            kotlin.ResultKt.throwOnFailure(obj);
                            this.label = 1;
                            if (this.$rangeSliderLogic.activeInteraction(this.$draggingStart.element).emit(this.$finishInteraction, this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        } else {
                            if (i != 1) {
                                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            kotlin.ResultKt.throwOnFailure(obj);
                        }
                        return kotlin.Unit.INSTANCE;
                    }
                }
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    this.label = 1;
                    if (((androidx.compose.ui.input.pointer.PointerInputScope) this.L$0).awaitPointerEventScope(new androidx.compose.material.SliderKt$rangeSliderPressDragModifier$1.AnonymousClass1.C00501.C00511(this.$isRtl, this.$maxPx, this.$rangeSliderLogic, this.$rawOffsetStart, this.$$this$coroutineScope, this.$gestureEndAction, this.$rawOffsetEnd, this.$onDrag, null), this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                return kotlin.Unit.INSTANCE;
            }
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                kotlinx.coroutines.CoroutineScope coroutineScope = (kotlinx.coroutines.CoroutineScope) this.L$0;
                this.label = 1;
                if (androidx.compose.foundation.gestures.ForEachGestureKt.forEachGesture(this.$$this$pointerInput, new androidx.compose.material.SliderKt$rangeSliderPressDragModifier$1.AnonymousClass1.C00501(this.$isRtl, this.$maxPx, this.$rangeSliderLogic, this.$rawOffsetStart, coroutineScope, this.$gestureEndAction, this.$rawOffsetEnd, this.$onDrag, null), this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
            }
            return kotlin.Unit.INSTANCE;
        }
    }
}
