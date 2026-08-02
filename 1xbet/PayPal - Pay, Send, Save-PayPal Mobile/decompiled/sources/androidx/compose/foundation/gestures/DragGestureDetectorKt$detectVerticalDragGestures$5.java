package androidx.compose.foundation.gestures;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.foundation.gestures.DragGestureDetectorKt$detectVerticalDragGestures$5", f = "DragGestureDetector.kt", i = {0, 1, 1}, l = {com.gemalto.mfs.mwsdk.provisioning.model.KnownCpsErrorCodes.ENROLLMENT_MOBILE_WALLET_ALREADY_ENROLLED, 536, 544}, m = "invokeSuspend", n = {"$this$awaitEachGesture", "$this$awaitEachGesture", "overSlop"}, s = {"L$0", "L$0", "L$1"}, v = 1)
/* loaded from: classes6.dex */
final class DragGestureDetectorKt$detectVerticalDragGestures$5 extends kotlin.coroutines.jvm.internal.RestrictedSuspendLambda implements kotlin.jvm.functions.Function2<androidx.compose.ui.input.pointer.AwaitPointerEventScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    java.lang.Object Camera2StreamConfigurationMap;
    final /* synthetic */ kotlin.jvm.functions.Function1<androidx.compose.ui.geometry.Offset, kotlin.Unit> getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ kotlin.jvm.functions.Function2<androidx.compose.ui.input.pointer.PointerInputChange, java.lang.Float, kotlin.Unit> getHighSpeedVideoFpsRanges;
    final /* synthetic */ kotlin.jvm.functions.Function0<kotlin.Unit> getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ kotlin.jvm.functions.Function0<kotlin.Unit> getHighSpeedVideoSizes;
    int getHighSpeedVideoSizesFor;
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
        int i = this.getHighSpeedVideoSizesFor;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            androidx.compose.ui.input.pointer.AwaitPointerEventScope awaitPointerEventScope3 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) this.getOutputMinFrameDuration;
            this.getOutputMinFrameDuration = awaitPointerEventScope3;
            this.getHighSpeedVideoSizesFor = 1;
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
                    this.getHighSpeedVideoFpsRangesFor.invoke();
                } else {
                    this.getHighSpeedVideoSizes.invoke();
                }
                return kotlin.Unit.INSTANCE;
            }
            floatRef = (kotlin.jvm.internal.Ref.FloatRef) this.Camera2StreamConfigurationMap;
            awaitPointerEventScope2 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) this.getOutputMinFrameDuration;
            kotlin.ResultKt.throwOnFailure(obj);
            pointerInputChange = (androidx.compose.ui.input.pointer.PointerInputChange) obj;
            if (pointerInputChange != null) {
                this.getHighResolutionOutputSizeshNQ4ISI.invoke(androidx.compose.ui.geometry.Offset.m5741boximpl(pointerInputChange.getPosition()));
                this.getHighSpeedVideoFpsRanges.invoke(pointerInputChange, kotlin.coroutines.jvm.internal.Boxing.boxFloat(floatRef.element));
                long id = pointerInputChange.getId();
                final kotlin.jvm.functions.Function2<androidx.compose.ui.input.pointer.PointerInputChange, java.lang.Float, kotlin.Unit> function2 = this.getHighSpeedVideoFpsRanges;
                this.getOutputMinFrameDuration = null;
                this.Camera2StreamConfigurationMap = null;
                this.getHighSpeedVideoSizesFor = 3;
                obj = androidx.compose.foundation.gestures.DragGestureDetectorKt.m1470verticalDragjO51t88(awaitPointerEventScope2, id, new kotlin.jvm.functions.Function1() { // from class: androidx.compose.foundation.gestures.DragGestureDetectorKt$detectVerticalDragGestures$5$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        kotlin.Unit Camera2StreamConfigurationMap;
                        Camera2StreamConfigurationMap = androidx.compose.foundation.gestures.DragGestureDetectorKt$detectVerticalDragGestures$5.Camera2StreamConfigurationMap(kotlin.jvm.functions.Function2.this, (androidx.compose.ui.input.pointer.PointerInputChange) obj2);
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
        this.Camera2StreamConfigurationMap = floatRef2;
        this.getHighSpeedVideoSizesFor = 2;
        obj = androidx.compose.foundation.gestures.DragGestureDetectorKt.m1464awaitVerticalPointerSlopOrCancellationgDDlDlE(awaitPointerEventScope, pointerInputChange2.getId(), pointerInputChange2.getType(), new kotlin.jvm.functions.Function2() { // from class: androidx.compose.foundation.gestures.DragGestureDetectorKt$detectVerticalDragGestures$5$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3) {
                kotlin.Unit highSpeedVideoFpsRanges;
                highSpeedVideoFpsRanges = androidx.compose.foundation.gestures.DragGestureDetectorKt$detectVerticalDragGestures$5.getHighSpeedVideoFpsRanges(kotlin.jvm.internal.Ref.FloatRef.this, (androidx.compose.ui.input.pointer.PointerInputChange) obj2, ((java.lang.Float) obj3).floatValue());
                return highSpeedVideoFpsRanges;
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
    public static final kotlin.Unit getHighSpeedVideoFpsRanges(kotlin.jvm.internal.Ref.FloatRef floatRef, androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange, float f) {
        pointerInputChange.consume();
        floatRef.element = f;
        return kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit Camera2StreamConfigurationMap(kotlin.jvm.functions.Function2 function2, androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange) {
        function2.invoke(pointerInputChange, java.lang.Float.valueOf(java.lang.Float.intBitsToFloat((int) (androidx.compose.ui.input.pointer.PointerEventKt.positionChange(pointerInputChange) & 4294967295L))));
        pointerInputChange.consume();
        return kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.jvm.functions.Function2
    /* renamed from: Camera2StreamConfigurationMap, reason: merged with bridge method [inline-methods] */
    public java.lang.Object invoke(androidx.compose.ui.input.pointer.AwaitPointerEventScope awaitPointerEventScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((androidx.compose.foundation.gestures.DragGestureDetectorKt$detectVerticalDragGestures$5) create(awaitPointerEventScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        androidx.compose.foundation.gestures.DragGestureDetectorKt$detectVerticalDragGestures$5 dragGestureDetectorKt$detectVerticalDragGestures$5 = new androidx.compose.foundation.gestures.DragGestureDetectorKt$detectVerticalDragGestures$5(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoSizes, continuation);
        dragGestureDetectorKt$detectVerticalDragGestures$5.getOutputMinFrameDuration = obj;
        return dragGestureDetectorKt$detectVerticalDragGestures$5;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    DragGestureDetectorKt$detectVerticalDragGestures$5(kotlin.jvm.functions.Function1<? super androidx.compose.ui.geometry.Offset, kotlin.Unit> function1, kotlin.jvm.functions.Function2<? super androidx.compose.ui.input.pointer.PointerInputChange, ? super java.lang.Float, kotlin.Unit> function2, kotlin.jvm.functions.Function0<kotlin.Unit> function0, kotlin.jvm.functions.Function0<kotlin.Unit> function02, kotlin.coroutines.Continuation<? super androidx.compose.foundation.gestures.DragGestureDetectorKt$detectVerticalDragGestures$5> continuation) {
        super(2, continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = function1;
        this.getHighSpeedVideoFpsRanges = function2;
        this.getHighSpeedVideoFpsRangesFor = function0;
        this.getHighSpeedVideoSizes = function02;
    }
}
