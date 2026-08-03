package androidx.compose.foundation.gestures;

/* compiled from: TransformGestureDetector.kt */
@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.foundation.gestures.TransformGestureDetectorKt$detectTransformGestures$2", f = "TransformGestureDetector.kt", i = {0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1}, l = {59, 61}, m = "invokeSuspend", n = {"$this$awaitEachGesture", "rotation", "zoom", "pan", "pastTouchSlop", "touchSlop", "lockedToPanZoom", "$this$awaitEachGesture", "rotation", "zoom", "pan", "pastTouchSlop", "touchSlop", "lockedToPanZoom"}, s = {"L$0", "F$0", "F$1", "J$0", "I$0", "F$2", "I$1", "L$0", "F$0", "F$1", "J$0", "I$0", "F$2", "I$1"})
/* loaded from: classes.dex */
final class TransformGestureDetectorKt$detectTransformGestures$2 extends kotlin.coroutines.jvm.internal.RestrictedSuspendLambda implements kotlin.jvm.functions.Function2<androidx.compose.ui.input.pointer.AwaitPointerEventScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ kotlin.jvm.functions.Function4<androidx.compose.ui.geometry.Offset, androidx.compose.ui.geometry.Offset, java.lang.Float, java.lang.Float, kotlin.Unit> $onGesture;
    final /* synthetic */ boolean $panZoomLock;
    float F$0;
    float F$1;
    float F$2;
    int I$0;
    int I$1;
    long J$0;
    private /* synthetic */ java.lang.Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    TransformGestureDetectorKt$detectTransformGestures$2(boolean z, kotlin.jvm.functions.Function4<? super androidx.compose.ui.geometry.Offset, ? super androidx.compose.ui.geometry.Offset, ? super java.lang.Float, ? super java.lang.Float, kotlin.Unit> function4, kotlin.coroutines.Continuation<? super androidx.compose.foundation.gestures.TransformGestureDetectorKt$detectTransformGestures$2> continuation) {
        super(2, continuation);
        this.$panZoomLock = z;
        this.$onGesture = function4;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        androidx.compose.foundation.gestures.TransformGestureDetectorKt$detectTransformGestures$2 transformGestureDetectorKt$detectTransformGestures$2 = new androidx.compose.foundation.gestures.TransformGestureDetectorKt$detectTransformGestures$2(this.$panZoomLock, this.$onGesture, continuation);
        transformGestureDetectorKt$detectTransformGestures$2.L$0 = obj;
        return transformGestureDetectorKt$detectTransformGestures$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(androidx.compose.ui.input.pointer.AwaitPointerEventScope awaitPointerEventScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((androidx.compose.foundation.gestures.TransformGestureDetectorKt$detectTransformGestures$2) create(awaitPointerEventScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x013d, code lost:
    
        if (androidx.compose.ui.geometry.Offset.m1868equalsimpl0(r7, androidx.compose.ui.geometry.Offset.INSTANCE.m1887getZeroF1C5BW0()) == false) goto L54;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c3 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x00b2  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:44:0x00a2 -> B:6:0x00a5). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        androidx.compose.ui.input.pointer.AwaitPointerEventScope awaitPointerEventScope;
        float f;
        long j;
        int i;
        int i2;
        float f2;
        float f3;
        java.lang.Object awaitPointerEvent$default;
        int size;
        int i3;
        boolean z;
        java.lang.Object obj2;
        float f4;
        int i4;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i5 = this.label;
        int i6 = 2;
        boolean z2 = false;
        int i7 = 1;
        if (i5 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            awaitPointerEventScope = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) this.L$0;
            long m1887getZeroF1C5BW0 = androidx.compose.ui.geometry.Offset.INSTANCE.m1887getZeroF1C5BW0();
            float touchSlop = awaitPointerEventScope.getViewConfiguration().getTouchSlop();
            this.L$0 = awaitPointerEventScope;
            this.F$0 = 0.0f;
            this.F$1 = 1.0f;
            this.J$0 = m1887getZeroF1C5BW0;
            this.I$0 = 0;
            this.F$2 = touchSlop;
            this.I$1 = 0;
            this.label = 1;
            if (androidx.compose.foundation.gestures.TapGestureDetectorKt.awaitFirstDown$default(awaitPointerEventScope, false, null, this, 2, null) == coroutine_suspended) {
                return coroutine_suspended;
            }
            f = touchSlop;
            j = m1887getZeroF1C5BW0;
            i = 0;
            i2 = 0;
            f2 = 1.0f;
            f3 = 0.0f;
        } else {
            if (i5 != 1) {
                if (i5 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i = this.I$1;
                f = this.F$2;
                i2 = this.I$0;
                j = this.J$0;
                f2 = this.F$1;
                f3 = this.F$0;
                awaitPointerEventScope = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) this.L$0;
                kotlin.ResultKt.throwOnFailure(obj);
                awaitPointerEvent$default = obj;
                androidx.compose.ui.input.pointer.PointerEvent pointerEvent = (androidx.compose.ui.input.pointer.PointerEvent) awaitPointerEvent$default;
                java.util.List<androidx.compose.ui.input.pointer.PointerInputChange> changes = pointerEvent.getChanges();
                size = changes.size();
                i3 = 0;
                while (true) {
                    if (i3 >= size) {
                        z = false;
                        break;
                    }
                    if (changes.get(i3).isConsumed()) {
                        z = true;
                        break;
                    }
                    i3++;
                }
                if (z) {
                    float calculateZoom = androidx.compose.foundation.gestures.TransformGestureDetectorKt.calculateZoom(pointerEvent);
                    float calculateRotation = androidx.compose.foundation.gestures.TransformGestureDetectorKt.calculateRotation(pointerEvent);
                    f4 = f;
                    long calculatePan = androidx.compose.foundation.gestures.TransformGestureDetectorKt.calculatePan(pointerEvent);
                    if (i2 == 0) {
                        f2 *= calculateZoom;
                        f3 += calculateRotation;
                        j = androidx.compose.ui.geometry.Offset.m1876plusMKHz9U(j, calculatePan);
                        float calculateCentroidSize = androidx.compose.foundation.gestures.TransformGestureDetectorKt.calculateCentroidSize(pointerEvent, z2);
                        obj2 = coroutine_suspended;
                        float abs = java.lang.Math.abs(1 - f2) * calculateCentroidSize;
                        float abs2 = java.lang.Math.abs(((3.1415927f * f3) * calculateCentroidSize) / 180.0f);
                        float m1869getDistanceimpl = androidx.compose.ui.geometry.Offset.m1869getDistanceimpl(j);
                        if (abs > f4 || abs2 > f4 || m1869getDistanceimpl > f4) {
                            i = (!this.$panZoomLock || abs2 >= f4) ? 0 : 1;
                            i2 = 1;
                        }
                    } else {
                        obj2 = coroutine_suspended;
                    }
                    if (i2 != 0) {
                        long calculateCentroid = androidx.compose.foundation.gestures.TransformGestureDetectorKt.calculateCentroid(pointerEvent, false);
                        if (i != 0) {
                            calculateRotation = 0.0f;
                        }
                        if (calculateRotation != 0.0f) {
                            i4 = i;
                        } else if (calculateZoom == 1.0f) {
                            i4 = i;
                        } else {
                            i4 = i;
                        }
                        this.$onGesture.invoke(androidx.compose.ui.geometry.Offset.m1860boximpl(calculateCentroid), androidx.compose.ui.geometry.Offset.m1860boximpl(calculatePan), kotlin.coroutines.jvm.internal.Boxing.boxFloat(calculateZoom), kotlin.coroutines.jvm.internal.Boxing.boxFloat(calculateRotation));
                        java.util.List<androidx.compose.ui.input.pointer.PointerInputChange> changes2 = pointerEvent.getChanges();
                        int size2 = changes2.size();
                        for (int i8 = 0; i8 < size2; i8++) {
                            androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange = changes2.get(i8);
                            if (androidx.compose.ui.input.pointer.PointerEventKt.positionChanged(pointerInputChange)) {
                                pointerInputChange.consume();
                            }
                        }
                    } else {
                        i4 = i;
                    }
                    i = i4;
                } else {
                    obj2 = coroutine_suspended;
                    f4 = f;
                }
                if (!z) {
                    java.util.List<androidx.compose.ui.input.pointer.PointerInputChange> changes3 = pointerEvent.getChanges();
                    int size3 = changes3.size();
                    for (int i9 = 0; i9 < size3; i9++) {
                        if (changes3.get(i9).getPressed()) {
                            f = f4;
                            coroutine_suspended = obj2;
                            i6 = 2;
                            z2 = false;
                            i7 = 1;
                        }
                    }
                }
                return kotlin.Unit.INSTANCE;
            }
            i = this.I$1;
            f = this.F$2;
            i2 = this.I$0;
            j = this.J$0;
            f2 = this.F$1;
            f3 = this.F$0;
            awaitPointerEventScope = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) this.L$0;
            kotlin.ResultKt.throwOnFailure(obj);
        }
        this.L$0 = awaitPointerEventScope;
        this.F$0 = f3;
        this.F$1 = f2;
        this.J$0 = j;
        this.I$0 = i2;
        this.F$2 = f;
        this.I$1 = i;
        this.label = i6;
        awaitPointerEvent$default = androidx.compose.ui.input.pointer.AwaitPointerEventScope.CC.awaitPointerEvent$default(awaitPointerEventScope, null, this, i7, null);
        if (awaitPointerEvent$default == coroutine_suspended) {
            return coroutine_suspended;
        }
        androidx.compose.ui.input.pointer.PointerEvent pointerEvent2 = (androidx.compose.ui.input.pointer.PointerEvent) awaitPointerEvent$default;
        java.util.List<androidx.compose.ui.input.pointer.PointerInputChange> changes4 = pointerEvent2.getChanges();
        size = changes4.size();
        i3 = 0;
        while (true) {
            if (i3 >= size) {
            }
            i3++;
        }
        if (z) {
        }
        if (!z) {
        }
        return kotlin.Unit.INSTANCE;
    }
}
