package androidx.compose.foundation.gestures;

@kotlin.Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.foundation.gestures.AnchoredDraggableState$anchoredDrag$4", f = "AnchoredDraggable.kt", i = {}, l = {1175}, m = "invokeSuspend", n = {}, s = {}, v = 1)
/* loaded from: classes6.dex */
final class AnchoredDraggableState$anchoredDrag$4 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function1<kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int Camera2StreamConfigurationMap;
    final /* synthetic */ androidx.compose.foundation.gestures.AnchoredDraggableState<T> getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ T getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ kotlin.jvm.functions.Function4<androidx.compose.foundation.gestures.AnchoredDragScope, androidx.compose.foundation.gestures.DraggableAnchors<T>, T, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object highSpeedVideoFpsRangesFor;
        androidx.compose.foundation.gestures.AnchoredDraggableState$anchoredDragScope$1 anchoredDraggableState$anchoredDragScope$1;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.Camera2StreamConfigurationMap;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRangesFor(this.getHighSpeedVideoFpsRangesFor);
            final androidx.compose.foundation.gestures.AnchoredDraggableState<T> anchoredDraggableState = this.getHighResolutionOutputSizeshNQ4ISI;
            this.Camera2StreamConfigurationMap = 1;
            highSpeedVideoFpsRangesFor = androidx.compose.foundation.gestures.AnchoredDraggableKt.getHighSpeedVideoFpsRangesFor(new kotlin.jvm.functions.Function0() { // from class: androidx.compose.foundation.gestures.AnchoredDraggableState$anchoredDrag$4$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    kotlin.Pair highSpeedVideoFpsRangesFor2;
                    highSpeedVideoFpsRangesFor2 = androidx.compose.foundation.gestures.AnchoredDraggableState$anchoredDrag$4.getHighSpeedVideoFpsRangesFor(androidx.compose.foundation.gestures.AnchoredDraggableState.this);
                    return highSpeedVideoFpsRangesFor2;
                }
            }, new androidx.compose.foundation.gestures.AnchoredDraggableState$anchoredDrag$4.AnonymousClass2(this.getHighSpeedVideoSizes, this.getHighResolutionOutputSizeshNQ4ISI, null), this);
            if (highSpeedVideoFpsRangesFor == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        if (((java.lang.Boolean) this.getHighResolutionOutputSizeshNQ4ISI.getConfirmValueChange$foundation().invoke(this.getHighSpeedVideoFpsRangesFor)).booleanValue()) {
            float positionOf = this.getHighResolutionOutputSizeshNQ4ISI.getAnchors().positionOf(this.getHighSpeedVideoFpsRangesFor);
            anchoredDraggableState$anchoredDragScope$1 = ((androidx.compose.foundation.gestures.AnchoredDraggableState) this.getHighResolutionOutputSizeshNQ4ISI).getHighSpeedVideoFpsRangesFor;
            anchoredDraggableState$anchoredDragScope$1.dragTo(positionOf, this.getHighResolutionOutputSizeshNQ4ISI.getLastVelocity());
            this.getHighResolutionOutputSizeshNQ4ISI.setSettledValue(this.getHighSpeedVideoFpsRangesFor);
            this.getHighResolutionOutputSizeshNQ4ISI.setCurrentValue(this.getHighSpeedVideoFpsRangesFor);
        }
        return kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @kotlin.Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0018\u0010\u0003\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u0005\u0012\u0004\u0012\u0002H\u00020\u0004H\n"}, d2 = {"<anonymous>", "", "T", "<destruct>", "Lkotlin/Pair;", "Landroidx/compose/foundation/gestures/DraggableAnchors;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.foundation.gestures.AnchoredDraggableState$anchoredDrag$4$2", f = "AnchoredDraggable.kt", i = {}, l = {1177}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    /* renamed from: androidx.compose.foundation.gestures.AnchoredDraggableState$anchoredDrag$4$2, reason: invalid class name */
    static final class AnonymousClass2<T> extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlin.Pair<? extends androidx.compose.foundation.gestures.DraggableAnchors<T>, ? extends T>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        final /* synthetic */ kotlin.jvm.functions.Function4<androidx.compose.foundation.gestures.AnchoredDragScope, androidx.compose.foundation.gestures.DraggableAnchors<T>, T, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> Camera2StreamConfigurationMap;
        /* synthetic */ java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
        final /* synthetic */ androidx.compose.foundation.gestures.AnchoredDraggableState<T> getHighSpeedVideoFpsRanges;
        int getHighSpeedVideoSizes;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            androidx.compose.foundation.gestures.AnchoredDraggableState$anchoredDragScope$1 anchoredDraggableState$anchoredDragScope$1;
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.getHighSpeedVideoSizes;
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                kotlin.Pair pair = (kotlin.Pair) this.getHighResolutionOutputSizeshNQ4ISI;
                androidx.compose.foundation.gestures.DraggableAnchors draggableAnchors = (androidx.compose.foundation.gestures.DraggableAnchors) pair.component1();
                java.lang.Object component2 = pair.component2();
                kotlin.jvm.functions.Function4<androidx.compose.foundation.gestures.AnchoredDragScope, androidx.compose.foundation.gestures.DraggableAnchors<T>, T, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> function4 = this.Camera2StreamConfigurationMap;
                anchoredDraggableState$anchoredDragScope$1 = ((androidx.compose.foundation.gestures.AnchoredDraggableState) this.getHighSpeedVideoFpsRanges).getHighSpeedVideoFpsRangesFor;
                this.getHighSpeedVideoSizes = 1;
                if (function4.invoke(anchoredDraggableState$anchoredDragScope$1, draggableAnchors, component2, this) == coroutine_suspended) {
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
        /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: merged with bridge method [inline-methods] */
        public java.lang.Object invoke(kotlin.Pair<? extends androidx.compose.foundation.gestures.DraggableAnchors<T>, ? extends T> pair, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((androidx.compose.foundation.gestures.AnchoredDraggableState$anchoredDrag$4.AnonymousClass2) create(pair, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            androidx.compose.foundation.gestures.AnchoredDraggableState$anchoredDrag$4.AnonymousClass2 anonymousClass2 = new androidx.compose.foundation.gestures.AnchoredDraggableState$anchoredDrag$4.AnonymousClass2(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRanges, continuation);
            anonymousClass2.getHighResolutionOutputSizeshNQ4ISI = obj;
            return anonymousClass2;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass2(kotlin.jvm.functions.Function4<? super androidx.compose.foundation.gestures.AnchoredDragScope, ? super androidx.compose.foundation.gestures.DraggableAnchors<T>, ? super T, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> function4, androidx.compose.foundation.gestures.AnchoredDraggableState<T> anchoredDraggableState, kotlin.coroutines.Continuation<? super androidx.compose.foundation.gestures.AnchoredDraggableState$anchoredDrag$4.AnonymousClass2> continuation) {
            super(2, continuation);
            this.Camera2StreamConfigurationMap = function4;
            this.getHighSpeedVideoFpsRanges = anchoredDraggableState;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Pair getHighSpeedVideoFpsRangesFor(androidx.compose.foundation.gestures.AnchoredDraggableState anchoredDraggableState) {
        return kotlin.TuplesKt.to(anchoredDraggableState.getAnchors(), anchoredDraggableState.getTargetValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.jvm.functions.Function1
    /* renamed from: getHighSpeedVideoSizes, reason: merged with bridge method [inline-methods] */
    public java.lang.Object invoke(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((androidx.compose.foundation.gestures.AnchoredDraggableState$anchoredDrag$4) create(continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(kotlin.coroutines.Continuation<?> continuation) {
        return new androidx.compose.foundation.gestures.AnchoredDraggableState$anchoredDrag$4(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoSizes, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    AnchoredDraggableState$anchoredDrag$4(androidx.compose.foundation.gestures.AnchoredDraggableState<T> anchoredDraggableState, T t, kotlin.jvm.functions.Function4<? super androidx.compose.foundation.gestures.AnchoredDragScope, ? super androidx.compose.foundation.gestures.DraggableAnchors<T>, ? super T, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> function4, kotlin.coroutines.Continuation<? super androidx.compose.foundation.gestures.AnchoredDraggableState$anchoredDrag$4> continuation) {
        super(1, continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = anchoredDraggableState;
        this.getHighSpeedVideoFpsRangesFor = t;
        this.getHighSpeedVideoSizes = function4;
    }
}
