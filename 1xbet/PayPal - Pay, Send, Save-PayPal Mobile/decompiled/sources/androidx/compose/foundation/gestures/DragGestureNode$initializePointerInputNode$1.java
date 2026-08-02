package androidx.compose.foundation.gestures;

@kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class DragGestureNode$initializePointerInputNode$1 implements androidx.compose.ui.input.pointer.PointerInputEventHandler {
    final /* synthetic */ androidx.compose.foundation.gestures.DragGestureNode getHighSpeedVideoFpsRanges;

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final java.lang.Object invoke(final androidx.compose.ui.input.pointer.PointerInputScope pointerInputScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        final androidx.compose.ui.input.pointer.util.VelocityTracker velocityTracker = new androidx.compose.ui.input.pointer.util.VelocityTracker();
        final kotlin.jvm.internal.Ref.LongRef longRef = new kotlin.jvm.internal.Ref.LongRef();
        longRef.element = androidx.compose.ui.layout.LayoutCoordinatesKt.positionOnScreen(androidx.compose.ui.node.DelegatableNodeKt.requireLayoutCoordinates(this.getHighSpeedVideoFpsRanges));
        final androidx.compose.foundation.gestures.DragGestureNode dragGestureNode = this.getHighSpeedVideoFpsRanges;
        kotlin.jvm.functions.Function3 function3 = new kotlin.jvm.functions.Function3() { // from class: androidx.compose.foundation.gestures.DragGestureNode$initializePointerInputNode$1$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                kotlin.Unit highSpeedVideoFpsRanges;
                highSpeedVideoFpsRanges = androidx.compose.foundation.gestures.DragGestureNode$initializePointerInputNode$1.getHighSpeedVideoFpsRanges(androidx.compose.foundation.gestures.DragGestureNode.this, velocityTracker, (androidx.compose.ui.input.pointer.PointerInputChange) obj, (androidx.compose.ui.input.pointer.PointerInputChange) obj2, (androidx.compose.ui.geometry.Offset) obj3);
                return highSpeedVideoFpsRanges;
            }
        };
        final androidx.compose.foundation.gestures.DragGestureNode dragGestureNode2 = this.getHighSpeedVideoFpsRanges;
        kotlin.jvm.functions.Function1 function1 = new kotlin.jvm.functions.Function1() { // from class: androidx.compose.foundation.gestures.DragGestureNode$initializePointerInputNode$1$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                kotlin.Unit highSpeedVideoSizes;
                highSpeedVideoSizes = androidx.compose.foundation.gestures.DragGestureNode$initializePointerInputNode$1.getHighSpeedVideoSizes(androidx.compose.ui.input.pointer.util.VelocityTracker.this, pointerInputScope, dragGestureNode2, (androidx.compose.ui.input.pointer.PointerInputChange) obj);
                return highSpeedVideoSizes;
            }
        };
        final androidx.compose.foundation.gestures.DragGestureNode dragGestureNode3 = this.getHighSpeedVideoFpsRanges;
        kotlin.jvm.functions.Function0 function0 = new kotlin.jvm.functions.Function0() { // from class: androidx.compose.foundation.gestures.DragGestureNode$initializePointerInputNode$1$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                kotlin.Unit Camera2StreamConfigurationMap;
                Camera2StreamConfigurationMap = androidx.compose.foundation.gestures.DragGestureNode$initializePointerInputNode$1.Camera2StreamConfigurationMap(androidx.compose.foundation.gestures.DragGestureNode.this);
                return Camera2StreamConfigurationMap;
            }
        };
        final androidx.compose.foundation.gestures.DragGestureNode dragGestureNode4 = this.getHighSpeedVideoFpsRanges;
        kotlin.jvm.functions.Function0 function02 = new kotlin.jvm.functions.Function0() { // from class: androidx.compose.foundation.gestures.DragGestureNode$initializePointerInputNode$1$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                boolean highResolutionOutputSizeshNQ4ISI;
                highResolutionOutputSizeshNQ4ISI = androidx.compose.foundation.gestures.DragGestureNode$initializePointerInputNode$1.getHighResolutionOutputSizeshNQ4ISI(androidx.compose.foundation.gestures.DragGestureNode.this);
                return java.lang.Boolean.valueOf(highResolutionOutputSizeshNQ4ISI);
            }
        };
        final androidx.compose.foundation.gestures.DragGestureNode dragGestureNode5 = this.getHighSpeedVideoFpsRanges;
        java.lang.Object coroutineScope = kotlinx.coroutines.CoroutineScopeKt.coroutineScope(new androidx.compose.foundation.gestures.DragGestureNode$initializePointerInputNode$1.AnonymousClass1(pointerInputScope, this.getHighSpeedVideoFpsRanges, function3, function1, function0, function02, new kotlin.jvm.functions.Function2() { // from class: androidx.compose.foundation.gestures.DragGestureNode$initializePointerInputNode$1$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                kotlin.Unit highSpeedVideoSizes;
                highSpeedVideoSizes = androidx.compose.foundation.gestures.DragGestureNode$initializePointerInputNode$1.getHighSpeedVideoSizes(androidx.compose.foundation.gestures.DragGestureNode.this, longRef, velocityTracker, (androidx.compose.ui.input.pointer.PointerInputChange) obj, (androidx.compose.ui.geometry.Offset) obj2);
                return highSpeedVideoSizes;
            }
        }, null), continuation);
        return coroutineScope == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? coroutineScope : kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit getHighSpeedVideoFpsRanges(androidx.compose.foundation.gestures.DragGestureNode dragGestureNode, androidx.compose.ui.input.pointer.util.VelocityTracker velocityTracker, androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange, androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange2, androidx.compose.ui.geometry.Offset offset) {
        kotlinx.coroutines.channels.Channel channel;
        dragGestureNode.getOutputFormats = androidx.compose.ui.geometry.Offset.INSTANCE.m5768getZeroF1C5BW0();
        if (dragGestureNode.getCanDrag().invoke(androidx.compose.ui.input.pointer.PointerType.m7297boximpl(pointerInputChange.getType())).booleanValue()) {
            if (!dragGestureNode.getIsListeningForEvents()) {
                dragGestureNode.getOutputSizeshNQ4ISI();
            }
            androidx.compose.ui.input.pointer.util.VelocityTrackerKt.addPointerInputChange(velocityTracker, pointerInputChange);
            long m5756minusMKHz9U = androidx.compose.ui.geometry.Offset.m5756minusMKHz9U(pointerInputChange2.getPosition(), offset.m5762unboximpl());
            channel = dragGestureNode.getInputSizeshNQ4ISI;
            if (channel != null) {
                kotlinx.coroutines.channels.ChannelResult.m24079boximpl(channel.mo9266trySendJP2dKIU(new androidx.compose.foundation.gestures.DragEvent.DragStarted(m5756minusMKHz9U, null)));
            }
        }
        return kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit getHighSpeedVideoSizes(androidx.compose.ui.input.pointer.util.VelocityTracker velocityTracker, androidx.compose.ui.input.pointer.PointerInputScope pointerInputScope, androidx.compose.foundation.gestures.DragGestureNode dragGestureNode, androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange) {
        kotlinx.coroutines.channels.Channel channel;
        androidx.compose.ui.input.pointer.util.VelocityTrackerKt.addPointerInputChange(velocityTracker, pointerInputChange);
        float maximumFlingVelocity = pointerInputScope.getViewConfiguration().getMaximumFlingVelocity();
        long m7332calculateVelocityAH228Gc = velocityTracker.m7332calculateVelocityAH228Gc(androidx.compose.ui.unit.VelocityKt.Velocity(maximumFlingVelocity, maximumFlingVelocity));
        velocityTracker.resetTracking();
        channel = dragGestureNode.getInputSizeshNQ4ISI;
        if (channel != null) {
            kotlinx.coroutines.channels.ChannelResult.m24079boximpl(channel.mo9266trySendJP2dKIU(new androidx.compose.foundation.gestures.DragEvent.DragStopped(androidx.compose.foundation.gestures.DraggableKt.m1474toValidVelocityTH1AsA0(m7332calculateVelocityAH228Gc), false, null)));
        }
        return kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit Camera2StreamConfigurationMap(androidx.compose.foundation.gestures.DragGestureNode dragGestureNode) {
        kotlinx.coroutines.channels.Channel channel;
        channel = dragGestureNode.getInputSizeshNQ4ISI;
        if (channel != null) {
            kotlinx.coroutines.channels.ChannelResult.m24079boximpl(channel.mo9266trySendJP2dKIU(androidx.compose.foundation.gestures.DragEvent.DragCancelled.INSTANCE));
        }
        return kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean getHighResolutionOutputSizeshNQ4ISI(androidx.compose.foundation.gestures.DragGestureNode dragGestureNode) {
        return !dragGestureNode.getGetHighResolutionOutputSizeshNQ4ISI();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit getHighSpeedVideoSizes(androidx.compose.foundation.gestures.DragGestureNode dragGestureNode, kotlin.jvm.internal.Ref.LongRef longRef, androidx.compose.ui.input.pointer.util.VelocityTracker velocityTracker, androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange, androidx.compose.ui.geometry.Offset offset) {
        long j;
        kotlinx.coroutines.channels.Channel channel;
        long j2;
        long positionOnScreen = androidx.compose.ui.layout.LayoutCoordinatesKt.positionOnScreen(androidx.compose.ui.node.DelegatableNodeKt.requireLayoutCoordinates(dragGestureNode));
        if (!androidx.compose.ui.geometry.Offset.m5749equalsimpl0(positionOnScreen, longRef.element)) {
            long m5756minusMKHz9U = androidx.compose.ui.geometry.Offset.m5756minusMKHz9U(positionOnScreen, longRef.element);
            j2 = dragGestureNode.getOutputFormats;
            dragGestureNode.getOutputFormats = androidx.compose.ui.geometry.Offset.m5757plusMKHz9U(j2, m5756minusMKHz9U);
        }
        longRef.element = positionOnScreen;
        j = dragGestureNode.getOutputFormats;
        androidx.compose.ui.input.pointer.util.VelocityTrackerKt.m7333addPointerInputChange0AR0LA0(velocityTracker, pointerInputChange, j);
        channel = dragGestureNode.getInputSizeshNQ4ISI;
        if (channel != null) {
            kotlinx.coroutines.channels.ChannelResult.m24079boximpl(channel.mo9266trySendJP2dKIU(new androidx.compose.foundation.gestures.DragEvent.DragDelta(offset.m5762unboximpl(), false, null)));
        }
        return kotlin.Unit.INSTANCE;
    }

    @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.foundation.gestures.DragGestureNode$initializePointerInputNode$1$1", f = "Draggable.kt", i = {0}, l = {624}, m = "invokeSuspend", n = {"$this$coroutineScope"}, s = {"L$0"}, v = 1)
    /* renamed from: androidx.compose.foundation.gestures.DragGestureNode$initializePointerInputNode$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        final /* synthetic */ kotlin.jvm.functions.Function0<kotlin.Unit> Camera2StreamConfigurationMap;
        final /* synthetic */ kotlin.jvm.functions.Function2<androidx.compose.ui.input.pointer.PointerInputChange, androidx.compose.ui.geometry.Offset, kotlin.Unit> getHighResolutionOutputSizeshNQ4ISI;
        final /* synthetic */ kotlin.jvm.functions.Function1<androidx.compose.ui.input.pointer.PointerInputChange, kotlin.Unit> getHighSpeedVideoFpsRanges;
        final /* synthetic */ kotlin.jvm.functions.Function3<androidx.compose.ui.input.pointer.PointerInputChange, androidx.compose.ui.input.pointer.PointerInputChange, androidx.compose.ui.geometry.Offset, kotlin.Unit> getHighSpeedVideoFpsRangesFor;
        final /* synthetic */ kotlin.jvm.functions.Function0<java.lang.Boolean> getHighSpeedVideoSizes;
        final /* synthetic */ androidx.compose.ui.input.pointer.PointerInputScope getHighSpeedVideoSizesFor;
        int getInputFormats;
        private /* synthetic */ java.lang.Object getInputSizeshNQ4ISI;
        final /* synthetic */ androidx.compose.foundation.gestures.DragGestureNode getOutputFormats;

        /* JADX WARN: Removed duplicated region for block: B:14:0x0050  */
        /* JADX WARN: Removed duplicated region for block: B:17:0x0062  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            kotlinx.coroutines.CoroutineScope coroutineScope;
            java.util.concurrent.CancellationException e;
            kotlinx.coroutines.channels.Channel channel;
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.getInputFormats;
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                kotlinx.coroutines.CoroutineScope coroutineScope2 = (kotlinx.coroutines.CoroutineScope) this.getInputSizeshNQ4ISI;
                try {
                    this.getInputSizeshNQ4ISI = coroutineScope2;
                    this.getInputFormats = 1;
                    if (androidx.compose.foundation.gestures.DragGestureDetectorKt.detectDragGestures(this.getHighSpeedVideoSizesFor, this.getOutputFormats.getOrientationLock(), this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoFpsRanges, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoSizes, this.getHighResolutionOutputSizeshNQ4ISI, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } catch (java.util.concurrent.CancellationException e2) {
                    coroutineScope = coroutineScope2;
                    e = e2;
                    channel = this.getOutputFormats.getInputSizeshNQ4ISI;
                    if (channel != null) {
                    }
                    if (!kotlinx.coroutines.CoroutineScopeKt.isActive(coroutineScope)) {
                    }
                    return kotlin.Unit.INSTANCE;
                }
            } else {
                if (i != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                coroutineScope = (kotlinx.coroutines.CoroutineScope) this.getInputSizeshNQ4ISI;
                try {
                    kotlin.ResultKt.throwOnFailure(obj);
                } catch (java.util.concurrent.CancellationException e3) {
                    e = e3;
                    channel = this.getOutputFormats.getInputSizeshNQ4ISI;
                    if (channel != null) {
                        kotlinx.coroutines.channels.ChannelResult.m24079boximpl(channel.mo9266trySendJP2dKIU(androidx.compose.foundation.gestures.DragEvent.DragCancelled.INSTANCE));
                    }
                    if (!kotlinx.coroutines.CoroutineScopeKt.isActive(coroutineScope)) {
                        throw e;
                    }
                    return kotlin.Unit.INSTANCE;
                }
            }
            return kotlin.Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.jvm.functions.Function2
        /* renamed from: Camera2StreamConfigurationMap, reason: merged with bridge method [inline-methods] */
        public java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((androidx.compose.foundation.gestures.DragGestureNode$initializePointerInputNode$1.AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            androidx.compose.foundation.gestures.DragGestureNode$initializePointerInputNode$1.AnonymousClass1 anonymousClass1 = new androidx.compose.foundation.gestures.DragGestureNode$initializePointerInputNode$1.AnonymousClass1(this.getHighSpeedVideoSizesFor, this.getOutputFormats, this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoFpsRanges, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoSizes, this.getHighResolutionOutputSizeshNQ4ISI, continuation);
            anonymousClass1.getInputSizeshNQ4ISI = obj;
            return anonymousClass1;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(androidx.compose.ui.input.pointer.PointerInputScope pointerInputScope, androidx.compose.foundation.gestures.DragGestureNode dragGestureNode, kotlin.jvm.functions.Function3<? super androidx.compose.ui.input.pointer.PointerInputChange, ? super androidx.compose.ui.input.pointer.PointerInputChange, ? super androidx.compose.ui.geometry.Offset, kotlin.Unit> function3, kotlin.jvm.functions.Function1<? super androidx.compose.ui.input.pointer.PointerInputChange, kotlin.Unit> function1, kotlin.jvm.functions.Function0<kotlin.Unit> function0, kotlin.jvm.functions.Function0<java.lang.Boolean> function02, kotlin.jvm.functions.Function2<? super androidx.compose.ui.input.pointer.PointerInputChange, ? super androidx.compose.ui.geometry.Offset, kotlin.Unit> function2, kotlin.coroutines.Continuation<? super androidx.compose.foundation.gestures.DragGestureNode$initializePointerInputNode$1.AnonymousClass1> continuation) {
            super(2, continuation);
            this.getHighSpeedVideoSizesFor = pointerInputScope;
            this.getOutputFormats = dragGestureNode;
            this.getHighSpeedVideoFpsRangesFor = function3;
            this.getHighSpeedVideoFpsRanges = function1;
            this.Camera2StreamConfigurationMap = function0;
            this.getHighSpeedVideoSizes = function02;
            this.getHighResolutionOutputSizeshNQ4ISI = function2;
        }
    }

    DragGestureNode$initializePointerInputNode$1(androidx.compose.foundation.gestures.DragGestureNode dragGestureNode) {
        this.getHighSpeedVideoFpsRanges = dragGestureNode;
    }
}
