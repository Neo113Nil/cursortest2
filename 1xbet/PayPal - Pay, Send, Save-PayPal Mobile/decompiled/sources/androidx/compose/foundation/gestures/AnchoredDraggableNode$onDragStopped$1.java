package androidx.compose.foundation.gestures;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.foundation.gestures.AnchoredDraggableNode$onDragStopped$1", f = "AnchoredDraggable.kt", i = {}, l = {436, 438}, m = "invokeSuspend", n = {}, s = {}, v = 1)
/* loaded from: classes6.dex */
final class AnchoredDraggableNode$onDragStopped$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ androidx.compose.foundation.gestures.DragEvent.DragStopped Camera2StreamConfigurationMap;
    final /* synthetic */ androidx.compose.foundation.gestures.AnchoredDraggableNode<T> getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0044, code lost:
    
        if (r8 == r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0069, code lost:
    
        if (r1.mo1265applyToFlingBMRW4eQ(r3, new androidx.compose.foundation.gestures.AnchoredDraggableNode$onDragStopped$1.AnonymousClass1(r7.getHighSpeedVideoFpsRangesFor, null), r7) == r0) goto L17;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        long Camera2StreamConfigurationMap;
        float highSpeedVideoFpsRangesFor;
        androidx.compose.foundation.OverscrollEffect overscrollEffect;
        androidx.compose.foundation.OverscrollEffect overscrollEffect2;
        long Camera2StreamConfigurationMap2;
        java.lang.Object highSpeedVideoFpsRanges;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoSizes;
        if (i != 0) {
            if (i == 1) {
                kotlin.ResultKt.throwOnFailure(obj);
                return kotlin.Unit.INSTANCE;
            }
            if (i != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
            return kotlin.Unit.INSTANCE;
        }
        kotlin.ResultKt.throwOnFailure(obj);
        androidx.compose.foundation.gestures.AnchoredDraggableNode<T> anchoredDraggableNode = this.getHighSpeedVideoFpsRangesFor;
        Camera2StreamConfigurationMap = anchoredDraggableNode.Camera2StreamConfigurationMap(this.Camera2StreamConfigurationMap.getVelocity());
        highSpeedVideoFpsRangesFor = anchoredDraggableNode.getHighSpeedVideoFpsRangesFor(Camera2StreamConfigurationMap);
        overscrollEffect = ((androidx.compose.foundation.gestures.AnchoredDraggableNode) this.getHighSpeedVideoFpsRangesFor).getHighSpeedVideoFpsRangesFor;
        if (overscrollEffect == null) {
            this.getHighSpeedVideoSizes = 1;
            highSpeedVideoFpsRanges = this.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoFpsRanges(highSpeedVideoFpsRangesFor, (kotlin.coroutines.Continuation<? super java.lang.Float>) this);
        } else {
            overscrollEffect2 = ((androidx.compose.foundation.gestures.AnchoredDraggableNode) this.getHighSpeedVideoFpsRangesFor).getHighSpeedVideoFpsRangesFor;
            kotlin.jvm.internal.Intrinsics.checkNotNull(overscrollEffect2);
            Camera2StreamConfigurationMap2 = this.getHighSpeedVideoFpsRangesFor.Camera2StreamConfigurationMap(highSpeedVideoFpsRangesFor);
            this.getHighSpeedVideoSizes = 2;
        }
        return coroutine_suspended;
    }

    @kotlin.Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", "Landroidx/compose/ui/unit/Velocity;", "availableVelocity"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.foundation.gestures.AnchoredDraggableNode$onDragStopped$1$1", f = "AnchoredDraggable.kt", i = {0}, l = {440}, m = "invokeSuspend", n = {"availableVelocity"}, s = {"J$0"}, v = 1)
    /* renamed from: androidx.compose.foundation.gestures.AnchoredDraggableNode$onDragStopped$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<androidx.compose.ui.unit.Velocity, kotlin.coroutines.Continuation<? super androidx.compose.ui.unit.Velocity>, java.lang.Object> {
        int Camera2StreamConfigurationMap;
        final /* synthetic */ androidx.compose.foundation.gestures.AnchoredDraggableNode<T> getHighSpeedVideoFpsRanges;
        /* synthetic */ long getHighSpeedVideoSizes;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            float highSpeedVideoFpsRangesFor;
            long j;
            androidx.compose.foundation.gestures.AnchoredDraggableState anchoredDraggableState;
            androidx.compose.foundation.gestures.AnchoredDraggableState anchoredDraggableState2;
            androidx.compose.foundation.gestures.AnchoredDraggableState anchoredDraggableState3;
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.Camera2StreamConfigurationMap;
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                long j2 = this.getHighSpeedVideoSizes;
                androidx.compose.foundation.gestures.AnchoredDraggableNode<T> anchoredDraggableNode = this.getHighSpeedVideoFpsRanges;
                highSpeedVideoFpsRangesFor = anchoredDraggableNode.getHighSpeedVideoFpsRangesFor(j2);
                this.getHighSpeedVideoSizes = j2;
                this.Camera2StreamConfigurationMap = 1;
                obj = anchoredDraggableNode.getHighSpeedVideoFpsRanges(highSpeedVideoFpsRangesFor, (kotlin.coroutines.Continuation<? super java.lang.Float>) this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
                j = j2;
            } else {
                if (i != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                j = this.getHighSpeedVideoSizes;
                kotlin.ResultKt.throwOnFailure(obj);
            }
            float floatValue = ((java.lang.Number) obj).floatValue();
            anchoredDraggableState = ((androidx.compose.foundation.gestures.AnchoredDraggableNode) this.getHighSpeedVideoFpsRanges).getHighSpeedVideoFpsRanges;
            float requireOffset = anchoredDraggableState.requireOffset();
            anchoredDraggableState2 = ((androidx.compose.foundation.gestures.AnchoredDraggableNode) this.getHighSpeedVideoFpsRanges).getHighSpeedVideoFpsRanges;
            float minPosition = anchoredDraggableState2.getAnchors().minPosition();
            anchoredDraggableState3 = ((androidx.compose.foundation.gestures.AnchoredDraggableNode) this.getHighSpeedVideoFpsRanges).getHighSpeedVideoFpsRanges;
            if (requireOffset >= anchoredDraggableState3.getAnchors().maxPosition() || requireOffset <= minPosition) {
                j = this.getHighSpeedVideoFpsRanges.Camera2StreamConfigurationMap(floatValue);
            }
            return androidx.compose.ui.unit.Velocity.m8830boximpl(j);
        }

        private java.lang.Object getHighSpeedVideoFpsRangesFor(long j, kotlin.coroutines.Continuation<? super androidx.compose.ui.unit.Velocity> continuation) {
            return ((androidx.compose.foundation.gestures.AnchoredDraggableNode$onDragStopped$1.AnonymousClass1) create(androidx.compose.ui.unit.Velocity.m8830boximpl(j), continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ java.lang.Object invoke(androidx.compose.ui.unit.Velocity velocity, kotlin.coroutines.Continuation<? super androidx.compose.ui.unit.Velocity> continuation) {
            return getHighSpeedVideoFpsRangesFor(velocity.getGetHighSpeedVideoSizes(), continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            androidx.compose.foundation.gestures.AnchoredDraggableNode$onDragStopped$1.AnonymousClass1 anonymousClass1 = new androidx.compose.foundation.gestures.AnchoredDraggableNode$onDragStopped$1.AnonymousClass1(this.getHighSpeedVideoFpsRanges, continuation);
            anonymousClass1.getHighSpeedVideoSizes = ((androidx.compose.ui.unit.Velocity) obj).getGetHighSpeedVideoSizes();
            return anonymousClass1;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(androidx.compose.foundation.gestures.AnchoredDraggableNode<T> anchoredDraggableNode, kotlin.coroutines.Continuation<? super androidx.compose.foundation.gestures.AnchoredDraggableNode$onDragStopped$1.AnonymousClass1> continuation) {
            super(2, continuation);
            this.getHighSpeedVideoFpsRanges = anchoredDraggableNode;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.jvm.functions.Function2
    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: merged with bridge method [inline-methods] */
    public java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((androidx.compose.foundation.gestures.AnchoredDraggableNode$onDragStopped$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new androidx.compose.foundation.gestures.AnchoredDraggableNode$onDragStopped$1(this.getHighSpeedVideoFpsRangesFor, this.Camera2StreamConfigurationMap, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AnchoredDraggableNode$onDragStopped$1(androidx.compose.foundation.gestures.AnchoredDraggableNode<T> anchoredDraggableNode, androidx.compose.foundation.gestures.DragEvent.DragStopped dragStopped, kotlin.coroutines.Continuation<? super androidx.compose.foundation.gestures.AnchoredDraggableNode$onDragStopped$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRangesFor = anchoredDraggableNode;
        this.Camera2StreamConfigurationMap = dragStopped;
    }
}
