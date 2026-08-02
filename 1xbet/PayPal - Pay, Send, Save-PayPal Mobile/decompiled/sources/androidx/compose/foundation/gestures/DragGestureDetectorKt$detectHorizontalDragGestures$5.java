package androidx.compose.foundation.gestures;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.foundation.gestures.DragGestureDetectorKt$detectHorizontalDragGestures$5", f = "DragGestureDetector.kt", i = {0, 1, 1}, l = {702, androidx.constraintlayout.core.motion.utils.TypedValues.TransitionType.TYPE_INTERPOLATOR, 713}, m = "invokeSuspend", n = {"$this$awaitEachGesture", "$this$awaitEachGesture", "overSlop"}, s = {"L$0", "L$0", "L$1"}, v = 1)
/* loaded from: classes6.dex */
final class DragGestureDetectorKt$detectHorizontalDragGestures$5 extends kotlin.coroutines.jvm.internal.RestrictedSuspendLambda implements kotlin.jvm.functions.Function2<androidx.compose.ui.input.pointer.AwaitPointerEventScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ kotlin.jvm.functions.Function0<kotlin.Unit> Camera2StreamConfigurationMap;
    final /* synthetic */ kotlin.jvm.functions.Function2<androidx.compose.ui.input.pointer.PointerInputChange, java.lang.Float, kotlin.Unit> getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ kotlin.jvm.functions.Function0<kotlin.Unit> getHighSpeedVideoFpsRanges;
    final /* synthetic */ kotlin.jvm.functions.Function1<androidx.compose.ui.geometry.Offset, kotlin.Unit> getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    int getOutputFormats;
    private /* synthetic */ java.lang.Object getOutputMinFrameDuration;

    /* JADX WARN: Code restructure failed: missing block: B:20:0x00a9, code lost:
    
        if (r13 == r0) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0078  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        androidx.compose.ui.input.pointer.AwaitPointerEventScope awaitPointerEventScope;
        androidx.compose.ui.input.pointer.AwaitPointerEventScope awaitPointerEventScope2;
        kotlin.jvm.internal.Ref.FloatRef floatRef;
        androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getOutputFormats;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            androidx.compose.ui.input.pointer.AwaitPointerEventScope awaitPointerEventScope3 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) this.getOutputMinFrameDuration;
            this.getOutputMinFrameDuration = awaitPointerEventScope3;
            this.getOutputFormats = 1;
            java.lang.Object awaitFirstDown$default = androidx.compose.foundation.gestures.TapGestureDetectorKt.awaitFirstDown$default(awaitPointerEventScope3, false, null, this, 2, null);
            if (awaitFirstDown$default != coroutine_suspended) {
                awaitPointerEventScope = awaitPointerEventScope3;
                obj = awaitFirstDown$default;
            }
            return coroutine_suspended;
        }
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
                if (((java.lang.Boolean) obj).booleanValue()) {
                    this.Camera2StreamConfigurationMap.invoke();
                } else {
                    this.getHighSpeedVideoFpsRanges.invoke();
                }
                return kotlin.Unit.INSTANCE;
            }
            floatRef = (kotlin.jvm.internal.Ref.FloatRef) this.getHighSpeedVideoSizes;
            awaitPointerEventScope2 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) this.getOutputMinFrameDuration;
            kotlin.ResultKt.throwOnFailure(obj);
            pointerInputChange = (androidx.compose.ui.input.pointer.PointerInputChange) obj;
            if (pointerInputChange != null) {
                this.getHighSpeedVideoFpsRangesFor.invoke(androidx.compose.ui.geometry.Offset.m5741boximpl(pointerInputChange.getPosition()));
                this.getHighResolutionOutputSizeshNQ4ISI.invoke(pointerInputChange, kotlin.coroutines.jvm.internal.Boxing.boxFloat(floatRef.element));
                long id = pointerInputChange.getId();
                final kotlin.jvm.functions.Function2<androidx.compose.ui.input.pointer.PointerInputChange, java.lang.Float, kotlin.Unit> function2 = this.getHighResolutionOutputSizeshNQ4ISI;
                this.getOutputMinFrameDuration = null;
                this.getHighSpeedVideoSizes = null;
                this.getOutputFormats = 3;
                obj = androidx.compose.foundation.gestures.DragGestureDetectorKt.m1468horizontalDragjO51t88(awaitPointerEventScope2, id, new kotlin.jvm.functions.Function1() { // from class: androidx.compose.foundation.gestures.DragGestureDetectorKt$detectHorizontalDragGestures$5$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        kotlin.Unit Camera2StreamConfigurationMap;
                        Camera2StreamConfigurationMap = androidx.compose.foundation.gestures.DragGestureDetectorKt$detectHorizontalDragGestures$5.Camera2StreamConfigurationMap(kotlin.jvm.functions.Function2.this, (androidx.compose.ui.input.pointer.PointerInputChange) obj2);
                        return Camera2StreamConfigurationMap;
                    }
                }, this);
            }
            return kotlin.Unit.INSTANCE;
        }
        awaitPointerEventScope = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) this.getOutputMinFrameDuration;
        kotlin.ResultKt.throwOnFailure(obj);
        androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange2 = (androidx.compose.ui.input.pointer.PointerInputChange) obj;
        final kotlin.jvm.internal.Ref.FloatRef floatRef2 = new kotlin.jvm.internal.Ref.FloatRef();
        this.getOutputMinFrameDuration = awaitPointerEventScope;
        this.getHighSpeedVideoSizes = floatRef2;
        this.getOutputFormats = 2;
        obj = androidx.compose.foundation.gestures.DragGestureDetectorKt.m1457awaitHorizontalPointerSlopOrCancellationgDDlDlE(awaitPointerEventScope, pointerInputChange2.getId(), pointerInputChange2.getType(), new kotlin.jvm.functions.Function2() { // from class: androidx.compose.foundation.gestures.DragGestureDetectorKt$detectHorizontalDragGestures$5$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3) {
                kotlin.Unit highSpeedVideoFpsRangesFor;
                highSpeedVideoFpsRangesFor = androidx.compose.foundation.gestures.DragGestureDetectorKt$detectHorizontalDragGestures$5.getHighSpeedVideoFpsRangesFor(kotlin.jvm.internal.Ref.FloatRef.this, (androidx.compose.ui.input.pointer.PointerInputChange) obj2, ((java.lang.Float) obj3).floatValue());
                return highSpeedVideoFpsRangesFor;
            }
        }, this);
        if (obj != coroutine_suspended) {
            awaitPointerEventScope2 = awaitPointerEventScope;
            floatRef = floatRef2;
            pointerInputChange = (androidx.compose.ui.input.pointer.PointerInputChange) obj;
            if (pointerInputChange != null) {
            }
            return kotlin.Unit.INSTANCE;
        }
        return coroutine_suspended;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit getHighSpeedVideoFpsRangesFor(kotlin.jvm.internal.Ref.FloatRef floatRef, androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange, float f) {
        pointerInputChange.consume();
        floatRef.element = f;
        return kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit Camera2StreamConfigurationMap(kotlin.jvm.functions.Function2 function2, androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange) {
        function2.invoke(pointerInputChange, java.lang.Float.valueOf(java.lang.Float.intBitsToFloat((int) (androidx.compose.ui.input.pointer.PointerEventKt.positionChange(pointerInputChange) >> 32))));
        pointerInputChange.consume();
        return kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.jvm.functions.Function2
    /* renamed from: Camera2StreamConfigurationMap, reason: merged with bridge method [inline-methods] */
    public java.lang.Object invoke(androidx.compose.ui.input.pointer.AwaitPointerEventScope awaitPointerEventScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((androidx.compose.foundation.gestures.DragGestureDetectorKt$detectHorizontalDragGestures$5) create(awaitPointerEventScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        androidx.compose.foundation.gestures.DragGestureDetectorKt$detectHorizontalDragGestures$5 dragGestureDetectorKt$detectHorizontalDragGestures$5 = new androidx.compose.foundation.gestures.DragGestureDetectorKt$detectHorizontalDragGestures$5(this.getHighSpeedVideoFpsRangesFor, this.getHighResolutionOutputSizeshNQ4ISI, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRanges, continuation);
        dragGestureDetectorKt$detectHorizontalDragGestures$5.getOutputMinFrameDuration = obj;
        return dragGestureDetectorKt$detectHorizontalDragGestures$5;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    DragGestureDetectorKt$detectHorizontalDragGestures$5(kotlin.jvm.functions.Function1<? super androidx.compose.ui.geometry.Offset, kotlin.Unit> function1, kotlin.jvm.functions.Function2<? super androidx.compose.ui.input.pointer.PointerInputChange, ? super java.lang.Float, kotlin.Unit> function2, kotlin.jvm.functions.Function0<kotlin.Unit> function0, kotlin.jvm.functions.Function0<kotlin.Unit> function02, kotlin.coroutines.Continuation<? super androidx.compose.foundation.gestures.DragGestureDetectorKt$detectHorizontalDragGestures$5> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRangesFor = function1;
        this.getHighResolutionOutputSizeshNQ4ISI = function2;
        this.Camera2StreamConfigurationMap = function0;
        this.getHighSpeedVideoFpsRanges = function02;
    }
}
