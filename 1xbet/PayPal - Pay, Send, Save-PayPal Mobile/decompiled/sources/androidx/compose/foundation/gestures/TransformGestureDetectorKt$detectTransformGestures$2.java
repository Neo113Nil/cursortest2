package androidx.compose.foundation.gestures;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.foundation.gestures.TransformGestureDetectorKt$detectTransformGestures$2", f = "TransformGestureDetector.kt", i = {0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1}, l = {60, 62}, m = "invokeSuspend", n = {"$this$awaitEachGesture", androidx.constraintlayout.motion.widget.Key.ROTATION, "zoom", "pan", "pastTouchSlop", "touchSlop", "lockedToPanZoom", "$this$awaitEachGesture", androidx.constraintlayout.motion.widget.Key.ROTATION, "zoom", "pan", "pastTouchSlop", "touchSlop", "lockedToPanZoom"}, s = {"L$0", "F$0", "F$1", "J$0", "I$0", "F$2", "I$1", "L$0", "F$0", "F$1", "J$0", "I$0", "F$2", "I$1"}, v = 1)
/* loaded from: classes6.dex */
final class TransformGestureDetectorKt$detectTransformGestures$2 extends kotlin.coroutines.jvm.internal.RestrictedSuspendLambda implements kotlin.jvm.functions.Function2<androidx.compose.ui.input.pointer.AwaitPointerEventScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ kotlin.jvm.functions.Function4<androidx.compose.ui.geometry.Offset, androidx.compose.ui.geometry.Offset, java.lang.Float, java.lang.Float, kotlin.Unit> Camera2StreamConfigurationMap;
    final /* synthetic */ boolean getHighResolutionOutputSizeshNQ4ISI;
    float getHighSpeedVideoFpsRanges;
    float getHighSpeedVideoFpsRangesFor;
    float getHighSpeedVideoSizes;
    int getHighSpeedVideoSizesFor;
    int getInputFormats;
    int getInputSizeshNQ4ISI;
    private /* synthetic */ java.lang.Object getOutputFormats;
    long getOutputMinFrameDuration;

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0109, code lost:
    
        if (r22 > r8) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0138, code lost:
    
        if (androidx.compose.ui.geometry.Offset.m5749equalsimpl0(r4, androidx.compose.ui.geometry.Offset.INSTANCE.m5768getZeroF1C5BW0()) == false) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00a0, code lost:
    
        if (r3 == r1) goto L16;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v15, types: [int] */
    /* JADX WARN: Type inference failed for: r2v21 */
    /* JADX WARN: Type inference failed for: r2v22 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [int] */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v2, types: [int] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:50:0x00a0 -> B:6:0x00a3). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        float f;
        float f2;
        int i;
        long j;
        float f3;
        androidx.compose.ui.input.pointer.AwaitPointerEventScope awaitPointerEventScope;
        ?? r2;
        java.lang.Object awaitPointerEvent$default;
        boolean z;
        boolean z2;
        char c;
        boolean z3;
        float f4;
        boolean z4;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = this.getInputSizeshNQ4ISI;
        int i3 = 2;
        char c2 = 0;
        int i4 = 1;
        boolean z5 = false;
        if (i2 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            androidx.compose.ui.input.pointer.AwaitPointerEventScope awaitPointerEventScope2 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) this.getOutputFormats;
            long m5768getZeroF1C5BW0 = androidx.compose.ui.geometry.Offset.INSTANCE.m5768getZeroF1C5BW0();
            float touchSlop = awaitPointerEventScope2.getViewConfiguration().getTouchSlop();
            this.getOutputFormats = awaitPointerEventScope2;
            this.getHighSpeedVideoSizes = 0.0f;
            this.getHighSpeedVideoFpsRanges = 1.0f;
            this.getOutputMinFrameDuration = m5768getZeroF1C5BW0;
            this.getInputFormats = 0;
            this.getHighSpeedVideoFpsRangesFor = touchSlop;
            this.getHighSpeedVideoSizesFor = 0;
            this.getInputSizeshNQ4ISI = 1;
            if (androidx.compose.foundation.gestures.TapGestureDetectorKt.awaitFirstDown$default(awaitPointerEventScope2, false, null, this, 2, null) != coroutine_suspended) {
                f = 1.0f;
                f2 = 0.0f;
                i = 0;
                j = m5768getZeroF1C5BW0;
                f3 = touchSlop;
                awaitPointerEventScope = awaitPointerEventScope2;
                r2 = 0;
            }
            return coroutine_suspended;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ?? r22 = this.getHighSpeedVideoSizesFor;
            f3 = this.getHighSpeedVideoFpsRangesFor;
            i = this.getInputFormats;
            j = this.getOutputMinFrameDuration;
            f = this.getHighSpeedVideoFpsRanges;
            f2 = this.getHighSpeedVideoSizes;
            awaitPointerEventScope = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) this.getOutputFormats;
            kotlin.ResultKt.throwOnFailure(obj);
            awaitPointerEvent$default = obj;
            z = r22;
            androidx.compose.ui.input.pointer.PointerEvent pointerEvent = (androidx.compose.ui.input.pointer.PointerEvent) awaitPointerEvent$default;
            java.util.List<androidx.compose.ui.input.pointer.PointerInputChange> changes = pointerEvent.getChanges();
            int size = changes.size();
            ?? r5 = z5;
            while (true) {
                if (r5 >= size) {
                    z2 = z5;
                    break;
                }
                if (changes.get(r5).isConsumed()) {
                    z2 = true;
                    break;
                }
                r5++;
            }
            if (z2) {
                c = c2;
                z3 = z2;
                f4 = f3;
                z4 = false;
            } else {
                float calculateZoom = androidx.compose.foundation.gestures.TransformGestureDetectorKt.calculateZoom(pointerEvent);
                float calculateRotation = androidx.compose.foundation.gestures.TransformGestureDetectorKt.calculateRotation(pointerEvent);
                z3 = z2;
                long calculatePan = androidx.compose.foundation.gestures.TransformGestureDetectorKt.calculatePan(pointerEvent);
                z = z;
                if (i == 0) {
                    f *= calculateZoom;
                    f2 += calculateRotation;
                    j = androidx.compose.ui.geometry.Offset.m5757plusMKHz9U(j, calculatePan);
                    float calculateCentroidSize = androidx.compose.foundation.gestures.TransformGestureDetectorKt.calculateCentroidSize(pointerEvent, z5);
                    float abs = java.lang.Math.abs(1.0f - f);
                    float abs2 = java.lang.Math.abs(((3.1415927f * f2) * calculateCentroidSize) / 180.0f);
                    float m5750getDistanceimpl = androidx.compose.ui.geometry.Offset.m5750getDistanceimpl(j);
                    if (abs * calculateCentroidSize <= f3 && abs2 <= f3) {
                        z = z;
                    }
                    i = 1;
                    z = (!this.getHighResolutionOutputSizeshNQ4ISI || abs2 >= f3) ? z5 : true;
                }
                if (i != 0) {
                    long calculateCentroid = androidx.compose.foundation.gestures.TransformGestureDetectorKt.calculateCentroid(pointerEvent, z5);
                    if (z) {
                        calculateRotation = 0.0f;
                    }
                    z4 = false;
                    if (calculateRotation == 0.0f) {
                        c = 0;
                        if (calculateZoom == 1.0f) {
                            f4 = f3;
                        } else {
                            f4 = f3;
                        }
                    } else {
                        f4 = f3;
                        c = 0;
                    }
                    this.Camera2StreamConfigurationMap.invoke(androidx.compose.ui.geometry.Offset.m5741boximpl(calculateCentroid), androidx.compose.ui.geometry.Offset.m5741boximpl(calculatePan), kotlin.coroutines.jvm.internal.Boxing.boxFloat(calculateZoom), kotlin.coroutines.jvm.internal.Boxing.boxFloat(calculateRotation));
                    java.util.List<androidx.compose.ui.input.pointer.PointerInputChange> changes2 = pointerEvent.getChanges();
                    int size2 = changes2.size();
                    for (int i5 = 0; i5 < size2; i5++) {
                        androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange = changes2.get(i5);
                        if (androidx.compose.ui.input.pointer.PointerEventKt.positionChanged(pointerInputChange)) {
                            pointerInputChange.consume();
                        }
                    }
                } else {
                    f4 = f3;
                    z4 = false;
                    c = 0;
                }
            }
            if (!z3) {
                java.util.List<androidx.compose.ui.input.pointer.PointerInputChange> changes3 = pointerEvent.getChanges();
                int size3 = changes3.size();
                for (int i6 = 0; i6 < size3; i6++) {
                    if (changes3.get(i6).getPressed()) {
                        c2 = c;
                        f3 = f4;
                        i3 = 2;
                        i4 = 1;
                        z5 = false;
                        r2 = z;
                    }
                }
            }
            return kotlin.Unit.INSTANCE;
        }
        int i7 = this.getHighSpeedVideoSizesFor;
        f3 = this.getHighSpeedVideoFpsRangesFor;
        i = this.getInputFormats;
        j = this.getOutputMinFrameDuration;
        f = this.getHighSpeedVideoFpsRanges;
        f2 = this.getHighSpeedVideoSizes;
        awaitPointerEventScope = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) this.getOutputFormats;
        kotlin.ResultKt.throwOnFailure(obj);
        r2 = i7;
        this.getOutputFormats = awaitPointerEventScope;
        this.getHighSpeedVideoSizes = f2;
        this.getHighSpeedVideoFpsRanges = f;
        this.getOutputMinFrameDuration = j;
        this.getInputFormats = i;
        this.getHighSpeedVideoFpsRangesFor = f3;
        this.getHighSpeedVideoSizesFor = r2;
        this.getInputSizeshNQ4ISI = i3;
        awaitPointerEvent$default = androidx.compose.ui.input.pointer.AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope, null, this, i4, null);
        z = r2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.jvm.functions.Function2
    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: merged with bridge method [inline-methods] */
    public java.lang.Object invoke(androidx.compose.ui.input.pointer.AwaitPointerEventScope awaitPointerEventScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((androidx.compose.foundation.gestures.TransformGestureDetectorKt$detectTransformGestures$2) create(awaitPointerEventScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        androidx.compose.foundation.gestures.TransformGestureDetectorKt$detectTransformGestures$2 transformGestureDetectorKt$detectTransformGestures$2 = new androidx.compose.foundation.gestures.TransformGestureDetectorKt$detectTransformGestures$2(this.getHighResolutionOutputSizeshNQ4ISI, this.Camera2StreamConfigurationMap, continuation);
        transformGestureDetectorKt$detectTransformGestures$2.getOutputFormats = obj;
        return transformGestureDetectorKt$detectTransformGestures$2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    TransformGestureDetectorKt$detectTransformGestures$2(boolean z, kotlin.jvm.functions.Function4<? super androidx.compose.ui.geometry.Offset, ? super androidx.compose.ui.geometry.Offset, ? super java.lang.Float, ? super java.lang.Float, kotlin.Unit> function4, kotlin.coroutines.Continuation<? super androidx.compose.foundation.gestures.TransformGestureDetectorKt$detectTransformGestures$2> continuation) {
        super(2, continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = z;
        this.Camera2StreamConfigurationMap = function4;
    }
}
