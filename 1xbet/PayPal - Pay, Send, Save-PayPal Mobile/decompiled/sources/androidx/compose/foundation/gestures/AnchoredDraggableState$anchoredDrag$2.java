package androidx.compose.foundation.gestures;

@kotlin.Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.foundation.gestures.AnchoredDraggableState$anchoredDrag$2", f = "AnchoredDraggable.kt", i = {}, l = {1128}, m = "invokeSuspend", n = {}, s = {}, v = 1)
/* loaded from: classes6.dex */
final class AnchoredDraggableState$anchoredDrag$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function1<kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ kotlin.jvm.functions.Function3<androidx.compose.foundation.gestures.AnchoredDragScope, androidx.compose.foundation.gestures.DraggableAnchors<T>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ androidx.compose.foundation.gestures.AnchoredDraggableState<T> getHighSpeedVideoSizes;

    /* JADX INFO: Add missing generic type declarations: [T] */
    @kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0004H\n"}, d2 = {"<anonymous>", "", "T", "latestAnchors", "Landroidx/compose/foundation/gestures/DraggableAnchors;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.foundation.gestures.AnchoredDraggableState$anchoredDrag$2$2", f = "AnchoredDraggable.kt", i = {}, l = {1129}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    /* renamed from: androidx.compose.foundation.gestures.AnchoredDraggableState$anchoredDrag$2$2, reason: invalid class name */
    static final class AnonymousClass2<T> extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<androidx.compose.foundation.gestures.DraggableAnchors<T>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        /* synthetic */ java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
        final /* synthetic */ kotlin.jvm.functions.Function3<androidx.compose.foundation.gestures.AnchoredDragScope, androidx.compose.foundation.gestures.DraggableAnchors<T>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> getHighSpeedVideoFpsRanges;
        final /* synthetic */ androidx.compose.foundation.gestures.AnchoredDraggableState<T> getHighSpeedVideoFpsRangesFor;
        int getHighSpeedVideoSizes;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            androidx.compose.foundation.gestures.AnchoredDraggableState$anchoredDragScope$1 anchoredDraggableState$anchoredDragScope$1;
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.getHighSpeedVideoSizes;
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                androidx.compose.foundation.gestures.DraggableAnchors<T> draggableAnchors = (androidx.compose.foundation.gestures.DraggableAnchors) this.getHighResolutionOutputSizeshNQ4ISI;
                kotlin.jvm.functions.Function3<androidx.compose.foundation.gestures.AnchoredDragScope, androidx.compose.foundation.gestures.DraggableAnchors<T>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> function3 = this.getHighSpeedVideoFpsRanges;
                anchoredDraggableState$anchoredDragScope$1 = ((androidx.compose.foundation.gestures.AnchoredDraggableState) this.getHighSpeedVideoFpsRangesFor).getHighSpeedVideoFpsRangesFor;
                this.getHighSpeedVideoSizes = 1;
                if (function3.invoke(anchoredDraggableState$anchoredDragScope$1, draggableAnchors, this) == coroutine_suspended) {
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
        /* renamed from: Camera2StreamConfigurationMap, reason: merged with bridge method [inline-methods] */
        public java.lang.Object invoke(androidx.compose.foundation.gestures.DraggableAnchors<T> draggableAnchors, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((androidx.compose.foundation.gestures.AnchoredDraggableState$anchoredDrag$2.AnonymousClass2) create(draggableAnchors, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            androidx.compose.foundation.gestures.AnchoredDraggableState$anchoredDrag$2.AnonymousClass2 anonymousClass2 = new androidx.compose.foundation.gestures.AnchoredDraggableState$anchoredDrag$2.AnonymousClass2(this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoFpsRangesFor, continuation);
            anonymousClass2.getHighResolutionOutputSizeshNQ4ISI = obj;
            return anonymousClass2;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass2(kotlin.jvm.functions.Function3<? super androidx.compose.foundation.gestures.AnchoredDragScope, ? super androidx.compose.foundation.gestures.DraggableAnchors<T>, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> function3, androidx.compose.foundation.gestures.AnchoredDraggableState<T> anchoredDraggableState, kotlin.coroutines.Continuation<? super androidx.compose.foundation.gestures.AnchoredDraggableState$anchoredDrag$2.AnonymousClass2> continuation) {
            super(2, continuation);
            this.getHighSpeedVideoFpsRanges = function3;
            this.getHighSpeedVideoFpsRangesFor = anchoredDraggableState;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object highSpeedVideoFpsRangesFor;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighResolutionOutputSizeshNQ4ISI;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            final androidx.compose.foundation.gestures.AnchoredDraggableState<T> anchoredDraggableState = this.getHighSpeedVideoSizes;
            this.getHighResolutionOutputSizeshNQ4ISI = 1;
            highSpeedVideoFpsRangesFor = androidx.compose.foundation.gestures.AnchoredDraggableKt.getHighSpeedVideoFpsRangesFor(new kotlin.jvm.functions.Function0() { // from class: androidx.compose.foundation.gestures.AnchoredDraggableState$anchoredDrag$2$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    androidx.compose.foundation.gestures.DraggableAnchors highResolutionOutputSizeshNQ4ISI;
                    highResolutionOutputSizeshNQ4ISI = androidx.compose.foundation.gestures.AnchoredDraggableState$anchoredDrag$2.getHighResolutionOutputSizeshNQ4ISI(androidx.compose.foundation.gestures.AnchoredDraggableState.this);
                    return highResolutionOutputSizeshNQ4ISI;
                }
            }, new androidx.compose.foundation.gestures.AnchoredDraggableState$anchoredDrag$2.AnonymousClass2(this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoSizes, null), this);
            if (highSpeedVideoFpsRangesFor == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        java.lang.Object closestAnchor = this.getHighSpeedVideoSizes.getAnchors().closestAnchor(this.getHighSpeedVideoSizes.getOffset());
        if (closestAnchor != null) {
            if (java.lang.Math.abs(this.getHighSpeedVideoSizes.getOffset() - this.getHighSpeedVideoSizes.getAnchors().positionOf(closestAnchor)) < 0.5f && ((java.lang.Boolean) this.getHighSpeedVideoSizes.getConfirmValueChange$foundation().invoke(closestAnchor)).booleanValue()) {
                this.getHighSpeedVideoSizes.setSettledValue(closestAnchor);
                this.getHighSpeedVideoSizes.setCurrentValue(closestAnchor);
            }
        }
        return kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.foundation.gestures.DraggableAnchors getHighResolutionOutputSizeshNQ4ISI(androidx.compose.foundation.gestures.AnchoredDraggableState anchoredDraggableState) {
        return anchoredDraggableState.getAnchors();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.jvm.functions.Function1
    /* renamed from: getHighSpeedVideoSizes, reason: merged with bridge method [inline-methods] */
    public java.lang.Object invoke(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((androidx.compose.foundation.gestures.AnchoredDraggableState$anchoredDrag$2) create(continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(kotlin.coroutines.Continuation<?> continuation) {
        return new androidx.compose.foundation.gestures.AnchoredDraggableState$anchoredDrag$2(this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRangesFor, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    AnchoredDraggableState$anchoredDrag$2(androidx.compose.foundation.gestures.AnchoredDraggableState<T> anchoredDraggableState, kotlin.jvm.functions.Function3<? super androidx.compose.foundation.gestures.AnchoredDragScope, ? super androidx.compose.foundation.gestures.DraggableAnchors<T>, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> function3, kotlin.coroutines.Continuation<? super androidx.compose.foundation.gestures.AnchoredDraggableState$anchoredDrag$2> continuation) {
        super(1, continuation);
        this.getHighSpeedVideoSizes = anchoredDraggableState;
        this.getHighSpeedVideoFpsRangesFor = function3;
    }
}
