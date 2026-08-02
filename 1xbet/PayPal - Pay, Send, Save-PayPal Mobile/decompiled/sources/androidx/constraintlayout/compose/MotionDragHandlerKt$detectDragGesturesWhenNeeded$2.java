package androidx.constraintlayout.compose;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.constraintlayout.compose.MotionDragHandlerKt$detectDragGesturesWhenNeeded$2", f = "MotionDragHandler.kt", i = {0, 1, 1, 1}, l = {166, 174, 183}, m = "invokeSuspend", n = {"$this$awaitEachGesture", "$this$awaitEachGesture", com.datadog.android.rum.internal.instrumentation.gestures.GesturesListener.SCROLL_DIRECTION_DOWN, "overSlop"}, s = {"L$0", "L$0", "L$1", "L$2"})
/* loaded from: classes6.dex */
final class MotionDragHandlerKt$detectDragGesturesWhenNeeded$2 extends kotlin.coroutines.jvm.internal.RestrictedSuspendLambda implements kotlin.jvm.functions.Function2<androidx.compose.ui.input.pointer.AwaitPointerEventScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ kotlin.jvm.functions.Function0<kotlin.Unit> Camera2StreamConfigurationMap;
    final /* synthetic */ kotlin.jvm.functions.Function2<androidx.compose.ui.input.pointer.PointerInputChange, androidx.compose.ui.geometry.Offset, kotlin.Unit> getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ kotlin.jvm.functions.Function1<androidx.compose.ui.geometry.Offset, kotlin.Unit> getHighSpeedVideoFpsRanges;
    final /* synthetic */ kotlin.jvm.functions.Function0<kotlin.Unit> getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ kotlin.jvm.functions.Function1<androidx.compose.ui.geometry.Offset, java.lang.Boolean> getHighSpeedVideoSizes;
    private /* synthetic */ java.lang.Object getHighSpeedVideoSizesFor;
    int getInputSizeshNQ4ISI;
    java.lang.Object getOutputFormats;
    java.lang.Object getOutputMinFrameDuration;

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0095, code lost:
    
        if (r12 == r0) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00f1, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00d8, code lost:
    
        if (r12 == r0) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x004e, code lost:
    
        if (r12 != r0) goto L14;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0095 -> B:17:0x0097). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        androidx.compose.ui.input.pointer.AwaitPointerEventScope awaitPointerEventScope;
        androidx.compose.ui.input.pointer.AwaitPointerEventScope awaitPointerEventScope2;
        final kotlin.jvm.internal.Ref.LongRef longRef;
        androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getInputSizeshNQ4ISI;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            awaitPointerEventScope = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) this.getHighSpeedVideoSizesFor;
            this.getHighSpeedVideoSizesFor = awaitPointerEventScope;
            this.getInputSizeshNQ4ISI = 1;
            obj = androidx.compose.foundation.gestures.TapGestureDetectorKt.awaitFirstDown$default(awaitPointerEventScope, true, null, this, 2, null);
        } else if (i == 1) {
            awaitPointerEventScope = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) this.getHighSpeedVideoSizesFor;
            kotlin.ResultKt.throwOnFailure(obj);
        } else {
            if (i != 2) {
                if (i != 3) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
                if (!((java.lang.Boolean) obj).booleanValue()) {
                    this.getHighSpeedVideoFpsRangesFor.invoke();
                } else {
                    this.Camera2StreamConfigurationMap.invoke();
                }
                return kotlin.Unit.INSTANCE;
            }
            longRef = (kotlin.jvm.internal.Ref.LongRef) this.getOutputMinFrameDuration;
            pointerInputChange = (androidx.compose.ui.input.pointer.PointerInputChange) this.getOutputFormats;
            awaitPointerEventScope2 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) this.getHighSpeedVideoSizesFor;
            kotlin.ResultKt.throwOnFailure(obj);
            androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange2 = (androidx.compose.ui.input.pointer.PointerInputChange) obj;
            if (pointerInputChange2 == null || pointerInputChange2.isConsumed()) {
                if (pointerInputChange2 != null) {
                    this.getHighSpeedVideoFpsRanges.invoke(androidx.compose.ui.geometry.Offset.m5741boximpl(pointerInputChange2.getPosition()));
                    this.getHighResolutionOutputSizeshNQ4ISI.invoke(pointerInputChange2, androidx.compose.ui.geometry.Offset.m5741boximpl(longRef.element));
                    long id = pointerInputChange2.getId();
                    final kotlin.jvm.functions.Function2<androidx.compose.ui.input.pointer.PointerInputChange, androidx.compose.ui.geometry.Offset, kotlin.Unit> function2 = this.getHighResolutionOutputSizeshNQ4ISI;
                    this.getHighSpeedVideoSizesFor = null;
                    this.getOutputFormats = null;
                    this.getOutputMinFrameDuration = null;
                    this.getInputSizeshNQ4ISI = 3;
                    obj = androidx.compose.foundation.gestures.DragGestureDetectorKt.m1467dragjO51t88(awaitPointerEventScope2, id, new kotlin.jvm.functions.Function1<androidx.compose.ui.input.pointer.PointerInputChange, kotlin.Unit>() { // from class: androidx.constraintlayout.compose.MotionDragHandlerKt$detectDragGesturesWhenNeeded$2.2
                        @Override // kotlin.jvm.functions.Function1
                        public final /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange3) {
                            getHighSpeedVideoSizes(pointerInputChange3);
                            return kotlin.Unit.INSTANCE;
                        }

                        public final void getHighSpeedVideoSizes(androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange3) {
                            function2.invoke(pointerInputChange3, androidx.compose.ui.geometry.Offset.m5741boximpl(androidx.compose.ui.input.pointer.PointerEventKt.positionChange(pointerInputChange3)));
                            pointerInputChange3.consume();
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(1);
                        }
                    }, this);
                }
                return kotlin.Unit.INSTANCE;
            }
            this.getHighSpeedVideoSizesFor = awaitPointerEventScope2;
            this.getOutputFormats = pointerInputChange;
            this.getOutputMinFrameDuration = longRef;
            this.getInputSizeshNQ4ISI = 2;
            obj = androidx.compose.foundation.gestures.DragGestureDetectorKt.m1462awaitTouchSlopOrCancellationjO51t88(awaitPointerEventScope2, pointerInputChange.getId(), new kotlin.jvm.functions.Function2<androidx.compose.ui.input.pointer.PointerInputChange, androidx.compose.ui.geometry.Offset, kotlin.Unit>() { // from class: androidx.constraintlayout.compose.MotionDragHandlerKt$detectDragGesturesWhenNeeded$2.1
                @Override // kotlin.jvm.functions.Function2
                public final /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange3, androidx.compose.ui.geometry.Offset offset) {
                    getHighSpeedVideoFpsRanges(pointerInputChange3, offset.m5762unboximpl());
                    return kotlin.Unit.INSTANCE;
                }

                public final void getHighSpeedVideoFpsRanges(androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange3, long j) {
                    pointerInputChange3.consume();
                    kotlin.jvm.internal.Ref.LongRef.this.element = j;
                }

                {
                    super(2);
                }
            }, this);
        }
        androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange3 = (androidx.compose.ui.input.pointer.PointerInputChange) obj;
        if (!this.getHighSpeedVideoSizes.invoke(androidx.compose.ui.geometry.Offset.m5741boximpl(pointerInputChange3.getPosition())).booleanValue()) {
            return kotlin.Unit.INSTANCE;
        }
        kotlin.jvm.internal.Ref.LongRef longRef2 = new kotlin.jvm.internal.Ref.LongRef();
        longRef2.element = androidx.compose.ui.geometry.Offset.INSTANCE.m5768getZeroF1C5BW0();
        awaitPointerEventScope2 = awaitPointerEventScope;
        longRef = longRef2;
        pointerInputChange = pointerInputChange3;
        this.getHighSpeedVideoSizesFor = awaitPointerEventScope2;
        this.getOutputFormats = pointerInputChange;
        this.getOutputMinFrameDuration = longRef;
        this.getInputSizeshNQ4ISI = 2;
        obj = androidx.compose.foundation.gestures.DragGestureDetectorKt.m1462awaitTouchSlopOrCancellationjO51t88(awaitPointerEventScope2, pointerInputChange.getId(), new kotlin.jvm.functions.Function2<androidx.compose.ui.input.pointer.PointerInputChange, androidx.compose.ui.geometry.Offset, kotlin.Unit>() { // from class: androidx.constraintlayout.compose.MotionDragHandlerKt$detectDragGesturesWhenNeeded$2.1
            @Override // kotlin.jvm.functions.Function2
            public final /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange32, androidx.compose.ui.geometry.Offset offset) {
                getHighSpeedVideoFpsRanges(pointerInputChange32, offset.m5762unboximpl());
                return kotlin.Unit.INSTANCE;
            }

            public final void getHighSpeedVideoFpsRanges(androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange32, long j) {
                pointerInputChange32.consume();
                kotlin.jvm.internal.Ref.LongRef.this.element = j;
            }

            {
                super(2);
            }
        }, this);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(androidx.compose.ui.input.pointer.AwaitPointerEventScope awaitPointerEventScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((androidx.constraintlayout.compose.MotionDragHandlerKt$detectDragGesturesWhenNeeded$2) create(awaitPointerEventScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        androidx.constraintlayout.compose.MotionDragHandlerKt$detectDragGesturesWhenNeeded$2 motionDragHandlerKt$detectDragGesturesWhenNeeded$2 = new androidx.constraintlayout.compose.MotionDragHandlerKt$detectDragGesturesWhenNeeded$2(this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRanges, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRangesFor, this.Camera2StreamConfigurationMap, continuation);
        motionDragHandlerKt$detectDragGesturesWhenNeeded$2.getHighSpeedVideoSizesFor = obj;
        return motionDragHandlerKt$detectDragGesturesWhenNeeded$2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    MotionDragHandlerKt$detectDragGesturesWhenNeeded$2(kotlin.jvm.functions.Function1<? super androidx.compose.ui.geometry.Offset, java.lang.Boolean> function1, kotlin.jvm.functions.Function1<? super androidx.compose.ui.geometry.Offset, kotlin.Unit> function12, kotlin.jvm.functions.Function2<? super androidx.compose.ui.input.pointer.PointerInputChange, ? super androidx.compose.ui.geometry.Offset, kotlin.Unit> function2, kotlin.jvm.functions.Function0<kotlin.Unit> function0, kotlin.jvm.functions.Function0<kotlin.Unit> function02, kotlin.coroutines.Continuation<? super androidx.constraintlayout.compose.MotionDragHandlerKt$detectDragGesturesWhenNeeded$2> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoSizes = function1;
        this.getHighSpeedVideoFpsRanges = function12;
        this.getHighResolutionOutputSizeshNQ4ISI = function2;
        this.getHighSpeedVideoFpsRangesFor = function0;
        this.Camera2StreamConfigurationMap = function02;
    }
}
