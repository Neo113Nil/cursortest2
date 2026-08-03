package androidx.compose.foundation.lazy.layout;

/* compiled from: LazyAnimateScroll.kt */
@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Landroidx/compose/foundation/gestures/ScrollScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.foundation.lazy.layout.LazyAnimateScrollKt$animateScrollToItem$2", f = "LazyAnimateScroll.kt", i = {0, 0, 0, 0, 0, 0, 0, 0, 1}, l = {182, 280}, m = "invokeSuspend", n = {"$this$scroll", "loop", "anim", "loops", "targetDistancePx", "boundDistancePx", "minDistancePx", "forward", "$this$scroll"}, s = {"L$0", "L$1", "L$2", "L$3", "F$0", "F$1", "F$2", "I$0", "L$0"})
/* loaded from: classes.dex */
final class LazyAnimateScrollKt$animateScrollToItem$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<androidx.compose.foundation.gestures.ScrollScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ androidx.compose.ui.unit.Density $density;
    final /* synthetic */ int $index;
    final /* synthetic */ int $numOfItemsForTeleport;
    final /* synthetic */ int $scrollOffset;
    final /* synthetic */ androidx.compose.foundation.lazy.layout.LazyLayoutAnimateScrollScope $this_animateScrollToItem;
    float F$0;
    float F$1;
    float F$2;
    int I$0;
    private /* synthetic */ java.lang.Object L$0;
    java.lang.Object L$1;
    java.lang.Object L$2;
    java.lang.Object L$3;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    LazyAnimateScrollKt$animateScrollToItem$2(int i, androidx.compose.ui.unit.Density density, androidx.compose.foundation.lazy.layout.LazyLayoutAnimateScrollScope lazyLayoutAnimateScrollScope, int i2, int i3, kotlin.coroutines.Continuation<? super androidx.compose.foundation.lazy.layout.LazyAnimateScrollKt$animateScrollToItem$2> continuation) {
        super(2, continuation);
        this.$index = i;
        this.$density = density;
        this.$this_animateScrollToItem = lazyLayoutAnimateScrollScope;
        this.$scrollOffset = i2;
        this.$numOfItemsForTeleport = i3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        androidx.compose.foundation.lazy.layout.LazyAnimateScrollKt$animateScrollToItem$2 lazyAnimateScrollKt$animateScrollToItem$2 = new androidx.compose.foundation.lazy.layout.LazyAnimateScrollKt$animateScrollToItem$2(this.$index, this.$density, this.$this_animateScrollToItem, this.$scrollOffset, this.$numOfItemsForTeleport, continuation);
        lazyAnimateScrollKt$animateScrollToItem$2.L$0 = obj;
        return lazyAnimateScrollKt$animateScrollToItem$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(androidx.compose.foundation.gestures.ScrollScope scrollScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((androidx.compose.foundation.lazy.layout.LazyAnimateScrollKt$animateScrollToItem$2) create(scrollScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00c9 A[Catch: ItemFoundInScroll -> 0x01b6, TryCatch #0 {ItemFoundInScroll -> 0x01b6, blocks: (B:20:0x00c5, B:22:0x00c9, B:24:0x00d1, B:30:0x00f5, B:33:0x0135, B:36:0x0142), top: B:19:0x00c5 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00e3 A[Catch: ItemFoundInScroll -> 0x01ac, TRY_ENTER, TRY_LEAVE, TryCatch #2 {ItemFoundInScroll -> 0x01ac, blocks: (B:17:0x01a1, B:27:0x00e3), top: B:16:0x01a1 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x019b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0230 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00f0  */
    /* JADX WARN: Type inference failed for: r12v1, types: [T, androidx.compose.animation.core.AnimationState] */
    /* JADX WARN: Type inference failed for: r8v15, types: [T, androidx.compose.animation.core.AnimationState] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:45:0x019c -> B:16:0x01a1). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        androidx.compose.foundation.lazy.layout.ItemFoundInScroll itemFoundInScroll;
        final androidx.compose.foundation.gestures.ScrollScope scrollScope;
        float f;
        float mo315toPx0680j_4;
        float f2;
        float mo315toPx0680j_42;
        float f3;
        float mo315toPx0680j_43;
        kotlin.jvm.internal.Ref.BooleanRef booleanRef;
        kotlin.jvm.internal.Ref.ObjectRef objectRef;
        kotlin.jvm.internal.Ref.IntRef intRef;
        float f4;
        float f5;
        int i;
        kotlin.jvm.internal.Ref.ObjectRef objectRef2;
        kotlin.jvm.internal.Ref.BooleanRef booleanRef2;
        androidx.compose.foundation.gestures.ScrollScope scrollScope2;
        float f6;
        androidx.compose.animation.core.AnimationState copy$default;
        final float itemOffset;
        final kotlin.jvm.internal.Ref.FloatRef floatRef;
        java.lang.Float boxFloat;
        boolean z;
        androidx.compose.foundation.gestures.ScrollScope scrollScope3;
        float f7;
        boolean z2;
        final androidx.compose.foundation.gestures.ScrollScope scrollScope4;
        final kotlin.jvm.internal.Ref.BooleanRef booleanRef3;
        final kotlin.jvm.internal.Ref.ObjectRef objectRef3;
        float f8;
        final float f9;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = this.label;
        float f10 = 0.0f;
        if (i2 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            androidx.compose.foundation.gestures.ScrollScope scrollScope5 = (androidx.compose.foundation.gestures.ScrollScope) this.L$0;
            int i3 = this.$index;
            if (!(((float) i3) >= 0.0f)) {
                throw new java.lang.IllegalArgumentException(("Index should be non-negative (" + i3 + ')').toString());
            }
            try {
                androidx.compose.ui.unit.Density density = this.$density;
                f = androidx.compose.foundation.lazy.layout.LazyAnimateScrollKt.TargetDistance;
                mo315toPx0680j_4 = density.mo315toPx0680j_4(f);
                androidx.compose.ui.unit.Density density2 = this.$density;
                f2 = androidx.compose.foundation.lazy.layout.LazyAnimateScrollKt.BoundDistance;
                mo315toPx0680j_42 = density2.mo315toPx0680j_4(f2);
                androidx.compose.ui.unit.Density density3 = this.$density;
                f3 = androidx.compose.foundation.lazy.layout.LazyAnimateScrollKt.MinimumDistance;
                mo315toPx0680j_43 = density3.mo315toPx0680j_4(f3);
                booleanRef = new kotlin.jvm.internal.Ref.BooleanRef();
                booleanRef.element = true;
                objectRef = new kotlin.jvm.internal.Ref.ObjectRef();
                objectRef.element = androidx.compose.animation.core.AnimationStateKt.AnimationState$default(0.0f, 0.0f, 0L, 0L, false, 30, null);
            } catch (androidx.compose.foundation.lazy.layout.ItemFoundInScroll e) {
                itemFoundInScroll = e;
                scrollScope = scrollScope5;
            }
            if (androidx.compose.foundation.lazy.layout.LazyAnimateScrollKt.isItemVisible(this.$this_animateScrollToItem, this.$index)) {
                throw new androidx.compose.foundation.lazy.layout.ItemFoundInScroll(this.$this_animateScrollToItem.getVisibleItemScrollOffset(this.$index), (androidx.compose.animation.core.AnimationState) objectRef.element);
            }
            int i4 = this.$index > this.$this_animateScrollToItem.getFirstVisibleItemIndex() ? 1 : 0;
            intRef = new kotlin.jvm.internal.Ref.IntRef();
            intRef.element = 1;
            f4 = mo315toPx0680j_4;
            f5 = mo315toPx0680j_42;
            i = i4;
            objectRef2 = objectRef;
            booleanRef2 = booleanRef;
            scrollScope2 = scrollScope5;
            f6 = mo315toPx0680j_43;
            if (booleanRef2.element) {
            }
            return kotlin.Unit.INSTANCE;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            scrollScope = (androidx.compose.foundation.gestures.ScrollScope) this.L$0;
            kotlin.ResultKt.throwOnFailure(obj);
            this.$this_animateScrollToItem.snapToItem(scrollScope, this.$index, this.$scrollOffset);
            return kotlin.Unit.INSTANCE;
        }
        i = this.I$0;
        f6 = this.F$2;
        float f11 = this.F$1;
        float f12 = this.F$0;
        kotlin.jvm.internal.Ref.IntRef intRef2 = (kotlin.jvm.internal.Ref.IntRef) this.L$3;
        kotlin.jvm.internal.Ref.ObjectRef objectRef4 = (kotlin.jvm.internal.Ref.ObjectRef) this.L$2;
        kotlin.jvm.internal.Ref.BooleanRef booleanRef4 = (kotlin.jvm.internal.Ref.BooleanRef) this.L$1;
        androidx.compose.foundation.gestures.ScrollScope scrollScope6 = (androidx.compose.foundation.gestures.ScrollScope) this.L$0;
        try {
            kotlin.ResultKt.throwOnFailure(obj);
            f5 = f11;
            f4 = f12;
            intRef = intRef2;
            scrollScope2 = scrollScope6;
            objectRef2 = objectRef4;
            booleanRef2 = booleanRef4;
            try {
                try {
                    intRef.element++;
                    if (booleanRef2.element && this.$this_animateScrollToItem.getItemCount() > 0) {
                        try {
                            try {
                                float calculateDistanceTo = this.$this_animateScrollToItem.calculateDistanceTo(this.$index, this.$scrollOffset);
                                if (java.lang.Math.abs(calculateDistanceTo) >= f4) {
                                    f7 = i != 0 ? f4 : -f4;
                                } else {
                                    f7 = java.lang.Math.max(java.lang.Math.abs(calculateDistanceTo), f6);
                                    if (i == 0) {
                                        f7 = -f7;
                                    }
                                }
                                objectRef2.element = androidx.compose.animation.core.AnimationStateKt.copy$default((androidx.compose.animation.core.AnimationState) objectRef2.element, 0.0f, 0.0f, 0L, 0L, false, 30, (java.lang.Object) null);
                                final kotlin.jvm.internal.Ref.FloatRef floatRef2 = new kotlin.jvm.internal.Ref.FloatRef();
                                androidx.compose.animation.core.AnimationState animationState = (androidx.compose.animation.core.AnimationState) objectRef2.element;
                                java.lang.Float boxFloat2 = kotlin.coroutines.jvm.internal.Boxing.boxFloat(f7);
                                boolean z3 = ((java.lang.Number) ((androidx.compose.animation.core.AnimationState) objectRef2.element).getVelocity()).floatValue() == f10;
                                final androidx.compose.foundation.lazy.layout.LazyLayoutAnimateScrollScope lazyLayoutAnimateScrollScope = this.$this_animateScrollToItem;
                                final int i5 = this.$index;
                                z2 = i == 0;
                                final int i6 = this.$numOfItemsForTeleport;
                                final int i7 = this.$scrollOffset;
                                kotlin.jvm.functions.Function1<androidx.compose.animation.core.AnimationScope<java.lang.Float, androidx.compose.animation.core.AnimationVector1D>, kotlin.Unit> function1 = new kotlin.jvm.functions.Function1<androidx.compose.animation.core.AnimationScope<java.lang.Float, androidx.compose.animation.core.AnimationVector1D>, kotlin.Unit>() { // from class: androidx.compose.foundation.lazy.layout.LazyAnimateScrollKt$animateScrollToItem$2.3
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(1);
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.animation.core.AnimationScope<java.lang.Float, androidx.compose.animation.core.AnimationVector1D> animationScope) {
                                        invoke2(animationScope);
                                        return kotlin.Unit.INSTANCE;
                                    }

                                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2(androidx.compose.animation.core.AnimationScope<java.lang.Float, androidx.compose.animation.core.AnimationVector1D> animationScope) {
                                        float coerceAtLeast;
                                        if (!androidx.compose.foundation.lazy.layout.LazyAnimateScrollKt.isItemVisible(androidx.compose.foundation.lazy.layout.LazyLayoutAnimateScrollScope.this, i5)) {
                                            if (r3 > 0.0f) {
                                                coerceAtLeast = kotlin.ranges.RangesKt.coerceAtMost(animationScope.getValue().floatValue(), r3);
                                            } else {
                                                coerceAtLeast = kotlin.ranges.RangesKt.coerceAtLeast(animationScope.getValue().floatValue(), r3);
                                            }
                                            float f13 = coerceAtLeast - floatRef2.element;
                                            float scrollBy = scrollScope4.scrollBy(f13);
                                            if (!androidx.compose.foundation.lazy.layout.LazyAnimateScrollKt.isItemVisible(androidx.compose.foundation.lazy.layout.LazyLayoutAnimateScrollScope.this, i5) && !androidx.compose.foundation.lazy.layout.LazyAnimateScrollKt$animateScrollToItem$2.invokeSuspend$isOvershot(r7, androidx.compose.foundation.lazy.layout.LazyLayoutAnimateScrollScope.this, i5, i7)) {
                                                if (f13 != scrollBy) {
                                                    animationScope.cancelAnimation();
                                                    booleanRef3.element = false;
                                                    return;
                                                }
                                                floatRef2.element += f13;
                                                if (r7) {
                                                    if (animationScope.getValue().floatValue() > f9) {
                                                        animationScope.cancelAnimation();
                                                    }
                                                } else if (animationScope.getValue().floatValue() < (-f9)) {
                                                    animationScope.cancelAnimation();
                                                }
                                                if (r7) {
                                                    if (r9.element >= 2) {
                                                        int lastVisibleItemIndex = i5 - androidx.compose.foundation.lazy.layout.LazyLayoutAnimateScrollScope.this.getLastVisibleItemIndex();
                                                        int i8 = i6;
                                                        if (lastVisibleItemIndex > i8) {
                                                            androidx.compose.foundation.lazy.layout.LazyLayoutAnimateScrollScope.this.snapToItem(scrollScope4, i5 - i8, 0);
                                                        }
                                                    }
                                                } else if (r9.element >= 2) {
                                                    int firstVisibleItemIndex = androidx.compose.foundation.lazy.layout.LazyLayoutAnimateScrollScope.this.getFirstVisibleItemIndex();
                                                    int i9 = i5;
                                                    int i10 = firstVisibleItemIndex - i9;
                                                    int i11 = i6;
                                                    if (i10 > i11) {
                                                        androidx.compose.foundation.lazy.layout.LazyLayoutAnimateScrollScope.this.snapToItem(scrollScope4, i9 + i11, 0);
                                                    }
                                                }
                                            }
                                        }
                                        if (androidx.compose.foundation.lazy.layout.LazyAnimateScrollKt$animateScrollToItem$2.invokeSuspend$isOvershot(r7, androidx.compose.foundation.lazy.layout.LazyLayoutAnimateScrollScope.this, i5, i7)) {
                                            androidx.compose.foundation.lazy.layout.LazyLayoutAnimateScrollScope.this.snapToItem(scrollScope4, i5, i7);
                                            booleanRef3.element = false;
                                            animationScope.cancelAnimation();
                                            return;
                                        }
                                        if (androidx.compose.foundation.lazy.layout.LazyAnimateScrollKt.isItemVisible(androidx.compose.foundation.lazy.layout.LazyLayoutAnimateScrollScope.this, i5)) {
                                            throw new androidx.compose.foundation.lazy.layout.ItemFoundInScroll(androidx.compose.foundation.lazy.layout.LazyLayoutAnimateScrollScope.this.getVisibleItemScrollOffset(i5), objectRef3.element);
                                        }
                                    }
                                };
                                androidx.compose.foundation.lazy.layout.LazyAnimateScrollKt$animateScrollToItem$2 lazyAnimateScrollKt$animateScrollToItem$2 = this;
                                this.L$0 = scrollScope3;
                                this.L$1 = booleanRef3;
                                this.L$2 = objectRef3;
                                intRef = r32;
                                this.L$3 = intRef;
                                this.F$0 = f8;
                                this.F$1 = f9;
                                this.F$2 = f6;
                                this.I$0 = i;
                                this.label = 1;
                                if (androidx.compose.animation.core.SuspendAnimationKt.animateTo$default(animationState, boxFloat2, null, z3, function1, lazyAnimateScrollKt$animateScrollToItem$2, 2, null) != coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                objectRef2 = objectRef3;
                                f4 = f8;
                                f5 = f9;
                                booleanRef2 = booleanRef3;
                                scrollScope2 = scrollScope3;
                                intRef.element++;
                                f10 = 0.0f;
                                if (booleanRef2.element) {
                                    float calculateDistanceTo2 = this.$this_animateScrollToItem.calculateDistanceTo(this.$index, this.$scrollOffset);
                                    if (java.lang.Math.abs(calculateDistanceTo2) >= f4) {
                                    }
                                    objectRef2.element = androidx.compose.animation.core.AnimationStateKt.copy$default((androidx.compose.animation.core.AnimationState) objectRef2.element, 0.0f, 0.0f, 0L, 0L, false, 30, (java.lang.Object) null);
                                    final kotlin.jvm.internal.Ref.FloatRef floatRef22 = new kotlin.jvm.internal.Ref.FloatRef();
                                    androidx.compose.animation.core.AnimationState animationState2 = (androidx.compose.animation.core.AnimationState) objectRef2.element;
                                    java.lang.Float boxFloat22 = kotlin.coroutines.jvm.internal.Boxing.boxFloat(f7);
                                    if (((java.lang.Number) ((androidx.compose.animation.core.AnimationState) objectRef2.element).getVelocity()).floatValue() == f10) {
                                    }
                                    final androidx.compose.foundation.lazy.layout.LazyLayoutAnimateScrollScope lazyLayoutAnimateScrollScope2 = this.$this_animateScrollToItem;
                                    final int i52 = this.$index;
                                    if (i == 0) {
                                    }
                                    final int i62 = this.$numOfItemsForTeleport;
                                    final int i72 = this.$scrollOffset;
                                    scrollScope4 = scrollScope2;
                                    booleanRef3 = booleanRef2;
                                    final float f13 = f7;
                                    objectRef3 = objectRef2;
                                    final kotlin.jvm.internal.Ref.IntRef intRef3 = intRef;
                                    f8 = f4;
                                    f9 = f5;
                                    final boolean z4 = z2;
                                    kotlin.jvm.functions.Function1<androidx.compose.animation.core.AnimationScope<java.lang.Float, androidx.compose.animation.core.AnimationVector1D>, kotlin.Unit> function12 = new kotlin.jvm.functions.Function1<androidx.compose.animation.core.AnimationScope<java.lang.Float, androidx.compose.animation.core.AnimationVector1D>, kotlin.Unit>() { // from class: androidx.compose.foundation.lazy.layout.LazyAnimateScrollKt$animateScrollToItem$2.3
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(1);
                                        }

                                        @Override // kotlin.jvm.functions.Function1
                                        public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.animation.core.AnimationScope<java.lang.Float, androidx.compose.animation.core.AnimationVector1D> animationScope) {
                                            invoke2(animationScope);
                                            return kotlin.Unit.INSTANCE;
                                        }

                                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                        public final void invoke2(androidx.compose.animation.core.AnimationScope<java.lang.Float, androidx.compose.animation.core.AnimationVector1D> animationScope) {
                                            float coerceAtLeast;
                                            if (!androidx.compose.foundation.lazy.layout.LazyAnimateScrollKt.isItemVisible(androidx.compose.foundation.lazy.layout.LazyLayoutAnimateScrollScope.this, i52)) {
                                                if (f13 > 0.0f) {
                                                    coerceAtLeast = kotlin.ranges.RangesKt.coerceAtMost(animationScope.getValue().floatValue(), f13);
                                                } else {
                                                    coerceAtLeast = kotlin.ranges.RangesKt.coerceAtLeast(animationScope.getValue().floatValue(), f13);
                                                }
                                                float f132 = coerceAtLeast - floatRef22.element;
                                                float scrollBy = scrollScope4.scrollBy(f132);
                                                if (!androidx.compose.foundation.lazy.layout.LazyAnimateScrollKt.isItemVisible(androidx.compose.foundation.lazy.layout.LazyLayoutAnimateScrollScope.this, i52) && !androidx.compose.foundation.lazy.layout.LazyAnimateScrollKt$animateScrollToItem$2.invokeSuspend$isOvershot(z4, androidx.compose.foundation.lazy.layout.LazyLayoutAnimateScrollScope.this, i52, i72)) {
                                                    if (f132 != scrollBy) {
                                                        animationScope.cancelAnimation();
                                                        booleanRef3.element = false;
                                                        return;
                                                    }
                                                    floatRef22.element += f132;
                                                    if (z4) {
                                                        if (animationScope.getValue().floatValue() > f9) {
                                                            animationScope.cancelAnimation();
                                                        }
                                                    } else if (animationScope.getValue().floatValue() < (-f9)) {
                                                        animationScope.cancelAnimation();
                                                    }
                                                    if (z4) {
                                                        if (intRef3.element >= 2) {
                                                            int lastVisibleItemIndex = i52 - androidx.compose.foundation.lazy.layout.LazyLayoutAnimateScrollScope.this.getLastVisibleItemIndex();
                                                            int i8 = i62;
                                                            if (lastVisibleItemIndex > i8) {
                                                                androidx.compose.foundation.lazy.layout.LazyLayoutAnimateScrollScope.this.snapToItem(scrollScope4, i52 - i8, 0);
                                                            }
                                                        }
                                                    } else if (intRef3.element >= 2) {
                                                        int firstVisibleItemIndex = androidx.compose.foundation.lazy.layout.LazyLayoutAnimateScrollScope.this.getFirstVisibleItemIndex();
                                                        int i9 = i52;
                                                        int i10 = firstVisibleItemIndex - i9;
                                                        int i11 = i62;
                                                        if (i10 > i11) {
                                                            androidx.compose.foundation.lazy.layout.LazyLayoutAnimateScrollScope.this.snapToItem(scrollScope4, i9 + i11, 0);
                                                        }
                                                    }
                                                }
                                            }
                                            if (androidx.compose.foundation.lazy.layout.LazyAnimateScrollKt$animateScrollToItem$2.invokeSuspend$isOvershot(z4, androidx.compose.foundation.lazy.layout.LazyLayoutAnimateScrollScope.this, i52, i72)) {
                                                androidx.compose.foundation.lazy.layout.LazyLayoutAnimateScrollScope.this.snapToItem(scrollScope4, i52, i72);
                                                booleanRef3.element = false;
                                                animationScope.cancelAnimation();
                                                return;
                                            }
                                            if (androidx.compose.foundation.lazy.layout.LazyAnimateScrollKt.isItemVisible(androidx.compose.foundation.lazy.layout.LazyLayoutAnimateScrollScope.this, i52)) {
                                                throw new androidx.compose.foundation.lazy.layout.ItemFoundInScroll(androidx.compose.foundation.lazy.layout.LazyLayoutAnimateScrollScope.this.getVisibleItemScrollOffset(i52), objectRef3.element);
                                            }
                                        }
                                    };
                                    androidx.compose.foundation.lazy.layout.LazyAnimateScrollKt$animateScrollToItem$2 lazyAnimateScrollKt$animateScrollToItem$22 = this;
                                    scrollScope3 = scrollScope4;
                                    this.L$0 = scrollScope3;
                                    this.L$1 = booleanRef3;
                                    this.L$2 = objectRef3;
                                    intRef = intRef3;
                                    this.L$3 = intRef;
                                    this.F$0 = f8;
                                    this.F$1 = f9;
                                    this.F$2 = f6;
                                    this.I$0 = i;
                                    this.label = 1;
                                    if (androidx.compose.animation.core.SuspendAnimationKt.animateTo$default(animationState2, boxFloat22, null, z3, function12, lazyAnimateScrollKt$animateScrollToItem$22, 2, null) != coroutine_suspended) {
                                    }
                                }
                            } catch (androidx.compose.foundation.lazy.layout.ItemFoundInScroll e2) {
                                e = e2;
                                scrollScope3 = scrollScope4;
                            }
                            scrollScope4 = scrollScope2;
                            booleanRef3 = booleanRef2;
                            final float f132 = f7;
                            objectRef3 = objectRef2;
                            final kotlin.jvm.internal.Ref.IntRef intRef32 = intRef;
                            f8 = f4;
                            f9 = f5;
                            final boolean z42 = z2;
                        } catch (androidx.compose.foundation.lazy.layout.ItemFoundInScroll e3) {
                            e = e3;
                            androidx.compose.foundation.gestures.ScrollScope scrollScope7 = scrollScope3;
                            itemFoundInScroll = e;
                            scrollScope = scrollScope7;
                            copy$default = androidx.compose.animation.core.AnimationStateKt.copy$default((androidx.compose.animation.core.AnimationState) itemFoundInScroll.getPreviousAnimation(), 0.0f, 0.0f, 0L, 0L, false, 30, (java.lang.Object) null);
                            itemOffset = itemFoundInScroll.getItemOffset() + this.$scrollOffset;
                            floatRef = new kotlin.jvm.internal.Ref.FloatRef();
                            boxFloat = kotlin.coroutines.jvm.internal.Boxing.boxFloat(itemOffset);
                            if (((java.lang.Number) copy$default.getVelocity()).floatValue() != 0.0f) {
                            }
                            this.L$0 = scrollScope;
                            this.L$1 = null;
                            this.L$2 = null;
                            this.L$3 = null;
                            this.label = 2;
                            if (androidx.compose.animation.core.SuspendAnimationKt.animateTo$default(copy$default, boxFloat, null, !z, new kotlin.jvm.functions.Function1<androidx.compose.animation.core.AnimationScope<java.lang.Float, androidx.compose.animation.core.AnimationVector1D>, kotlin.Unit>() { // from class: androidx.compose.foundation.lazy.layout.LazyAnimateScrollKt$animateScrollToItem$2.5
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.animation.core.AnimationScope<java.lang.Float, androidx.compose.animation.core.AnimationVector1D> animationScope) {
                                    invoke2(animationScope);
                                    return kotlin.Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(androidx.compose.animation.core.AnimationScope<java.lang.Float, androidx.compose.animation.core.AnimationVector1D> animationScope) {
                                    float f14 = itemOffset;
                                    float f15 = 0.0f;
                                    if (f14 > 0.0f) {
                                        f15 = kotlin.ranges.RangesKt.coerceAtMost(animationScope.getValue().floatValue(), itemOffset);
                                    } else if (f14 < 0.0f) {
                                        f15 = kotlin.ranges.RangesKt.coerceAtLeast(animationScope.getValue().floatValue(), itemOffset);
                                    }
                                    float f16 = f15 - floatRef.element;
                                    if (f16 != scrollScope.scrollBy(f16) || f15 != animationScope.getValue().floatValue()) {
                                        animationScope.cancelAnimation();
                                    }
                                    floatRef.element += f16;
                                }
                            }, this, 2, null) == coroutine_suspended) {
                            }
                            this.$this_animateScrollToItem.snapToItem(scrollScope, this.$index, this.$scrollOffset);
                            return kotlin.Unit.INSTANCE;
                        }
                        scrollScope3 = scrollScope4;
                    }
                } catch (androidx.compose.foundation.lazy.layout.ItemFoundInScroll e4) {
                    e = e4;
                    scrollScope3 = scrollScope2;
                }
                f10 = 0.0f;
            } catch (androidx.compose.foundation.lazy.layout.ItemFoundInScroll e5) {
                itemFoundInScroll = e5;
                scrollScope = scrollScope2;
            }
        } catch (androidx.compose.foundation.lazy.layout.ItemFoundInScroll e6) {
            itemFoundInScroll = e6;
            scrollScope = scrollScope6;
        }
        return kotlin.Unit.INSTANCE;
        copy$default = androidx.compose.animation.core.AnimationStateKt.copy$default((androidx.compose.animation.core.AnimationState) itemFoundInScroll.getPreviousAnimation(), 0.0f, 0.0f, 0L, 0L, false, 30, (java.lang.Object) null);
        itemOffset = itemFoundInScroll.getItemOffset() + this.$scrollOffset;
        floatRef = new kotlin.jvm.internal.Ref.FloatRef();
        boxFloat = kotlin.coroutines.jvm.internal.Boxing.boxFloat(itemOffset);
        z = ((java.lang.Number) copy$default.getVelocity()).floatValue() != 0.0f;
        this.L$0 = scrollScope;
        this.L$1 = null;
        this.L$2 = null;
        this.L$3 = null;
        this.label = 2;
        if (androidx.compose.animation.core.SuspendAnimationKt.animateTo$default(copy$default, boxFloat, null, !z, new kotlin.jvm.functions.Function1<androidx.compose.animation.core.AnimationScope<java.lang.Float, androidx.compose.animation.core.AnimationVector1D>, kotlin.Unit>() { // from class: androidx.compose.foundation.lazy.layout.LazyAnimateScrollKt$animateScrollToItem$2.5
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.animation.core.AnimationScope<java.lang.Float, androidx.compose.animation.core.AnimationVector1D> animationScope) {
                invoke2(animationScope);
                return kotlin.Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(androidx.compose.animation.core.AnimationScope<java.lang.Float, androidx.compose.animation.core.AnimationVector1D> animationScope) {
                float f14 = itemOffset;
                float f15 = 0.0f;
                if (f14 > 0.0f) {
                    f15 = kotlin.ranges.RangesKt.coerceAtMost(animationScope.getValue().floatValue(), itemOffset);
                } else if (f14 < 0.0f) {
                    f15 = kotlin.ranges.RangesKt.coerceAtLeast(animationScope.getValue().floatValue(), itemOffset);
                }
                float f16 = f15 - floatRef.element;
                if (f16 != scrollScope.scrollBy(f16) || f15 != animationScope.getValue().floatValue()) {
                    animationScope.cancelAnimation();
                }
                floatRef.element += f16;
            }
        }, this, 2, null) == coroutine_suspended) {
            return coroutine_suspended;
        }
        this.$this_animateScrollToItem.snapToItem(scrollScope, this.$index, this.$scrollOffset);
        return kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean invokeSuspend$isOvershot(boolean z, androidx.compose.foundation.lazy.layout.LazyLayoutAnimateScrollScope lazyLayoutAnimateScrollScope, int i, int i2) {
        if (z) {
            if (lazyLayoutAnimateScrollScope.getFirstVisibleItemIndex() <= i && (lazyLayoutAnimateScrollScope.getFirstVisibleItemIndex() != i || lazyLayoutAnimateScrollScope.getFirstVisibleItemScrollOffset() <= i2)) {
                return false;
            }
        } else if (lazyLayoutAnimateScrollScope.getFirstVisibleItemIndex() >= i && (lazyLayoutAnimateScrollScope.getFirstVisibleItemIndex() != i || lazyLayoutAnimateScrollScope.getFirstVisibleItemScrollOffset() >= i2)) {
            return false;
        }
        return true;
    }
}
