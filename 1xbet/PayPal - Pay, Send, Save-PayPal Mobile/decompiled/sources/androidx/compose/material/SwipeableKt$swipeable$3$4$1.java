package androidx.compose.material;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "velocity", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.material.SwipeableKt$swipeable$3$4$1", f = "Swipeable.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
/* loaded from: classes6.dex */
final class SwipeableKt$swipeable$3$4$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function3<kotlinx.coroutines.CoroutineScope, java.lang.Float, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ androidx.compose.material.SwipeableState<T> getHighSpeedVideoFpsRanges;
    private /* synthetic */ java.lang.Object getHighSpeedVideoFpsRangesFor;
    /* synthetic */ float getHighSpeedVideoSizes;

    @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.material.SwipeableKt$swipeable$3$4$1$1", f = "Swipeable.kt", i = {}, l = {androidx.constraintlayout.core.motion.utils.TypedValues.MotionType.TYPE_QUANTIZE_INTERPOLATOR_TYPE}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    /* renamed from: androidx.compose.material.SwipeableKt$swipeable$3$4$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        final /* synthetic */ androidx.compose.material.SwipeableState<T> getHighResolutionOutputSizeshNQ4ISI;
        final /* synthetic */ float getHighSpeedVideoFpsRangesFor;
        int getHighSpeedVideoSizes;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.getHighSpeedVideoSizes;
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                this.getHighSpeedVideoSizes = 1;
                if (this.getHighResolutionOutputSizeshNQ4ISI.performFling(this.getHighSpeedVideoFpsRangesFor, this) == coroutine_suspended) {
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

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.jvm.functions.Function2
        /* renamed from: getHighSpeedVideoFpsRanges, reason: merged with bridge method [inline-methods] */
        public java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((androidx.compose.material.SwipeableKt$swipeable$3$4$1.AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            return new androidx.compose.material.SwipeableKt$swipeable$3$4$1.AnonymousClass1(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRangesFor, continuation);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(androidx.compose.material.SwipeableState<T> swipeableState, float f, kotlin.coroutines.Continuation<? super androidx.compose.material.SwipeableKt$swipeable$3$4$1.AnonymousClass1> continuation) {
            super(2, continuation);
            this.getHighResolutionOutputSizeshNQ4ISI = swipeableState;
            this.getHighSpeedVideoFpsRangesFor = f;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.getHighResolutionOutputSizeshNQ4ISI != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default((kotlinx.coroutines.CoroutineScope) this.getHighSpeedVideoFpsRangesFor, null, null, new androidx.compose.material.SwipeableKt$swipeable$3$4$1.AnonymousClass1(this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoSizes, null), 3, null);
        return kotlin.Unit.INSTANCE;
    }

    private java.lang.Object getHighSpeedVideoFpsRangesFor(kotlinx.coroutines.CoroutineScope coroutineScope, float f, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        androidx.compose.material.SwipeableKt$swipeable$3$4$1 swipeableKt$swipeable$3$4$1 = new androidx.compose.material.SwipeableKt$swipeable$3$4$1(this.getHighSpeedVideoFpsRanges, continuation);
        swipeableKt$swipeable$3$4$1.getHighSpeedVideoFpsRangesFor = coroutineScope;
        swipeableKt$swipeable$3$4$1.getHighSpeedVideoSizes = f;
        return swipeableKt$swipeable$3$4$1.invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.jvm.functions.Function3
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, java.lang.Float f, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return getHighSpeedVideoFpsRangesFor(coroutineScope, f.floatValue(), continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SwipeableKt$swipeable$3$4$1(androidx.compose.material.SwipeableState<T> swipeableState, kotlin.coroutines.Continuation<? super androidx.compose.material.SwipeableKt$swipeable$3$4$1> continuation) {
        super(3, continuation);
        this.getHighSpeedVideoFpsRanges = swipeableState;
    }
}
