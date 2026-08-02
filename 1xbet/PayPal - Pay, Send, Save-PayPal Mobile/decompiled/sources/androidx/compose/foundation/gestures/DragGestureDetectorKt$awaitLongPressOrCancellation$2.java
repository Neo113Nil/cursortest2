package androidx.compose.foundation.gestures;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitLongPressOrCancellation$2", f = "DragGestureDetector.kt", i = {0, 0, 1, 1, 1}, l = {org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants.IMAGE_RESOURCE_BLOCK_LAYERS_GROUP_INFO, 1048}, m = "invokeSuspend", n = {"$this$withTimeout", "finished", "$this$withTimeout", "event", "finished"}, s = {"L$0", "I$0", "L$0", "L$1", "I$0"}, v = 1)
/* loaded from: classes6.dex */
final class DragGestureDetectorKt$awaitLongPressOrCancellation$2 extends kotlin.coroutines.jvm.internal.RestrictedSuspendLambda implements kotlin.jvm.functions.Function2<androidx.compose.ui.input.pointer.AwaitPointerEventScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ kotlin.jvm.internal.Ref.ObjectRef<androidx.compose.ui.input.pointer.PointerInputChange> Camera2StreamConfigurationMap;
    final /* synthetic */ kotlin.jvm.internal.Ref.ObjectRef<androidx.compose.ui.input.pointer.PointerInputChange> getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ kotlin.jvm.internal.Ref.BooleanRef getHighSpeedVideoSizes;
    int getHighSpeedVideoSizesFor;
    private /* synthetic */ java.lang.Object getInputFormats;

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0052, code lost:
    
        if (r8 != r1) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00a0, code lost:
    
        r2 = r6 ? 1 : 0;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00e5 A[EDGE_INSN: B:69:0x00e5->B:13:0x00e5 BREAK  A[LOOP:0: B:7:0x00d2->B:10:0x00e2], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x00d4  */
    /* JADX WARN: Type inference failed for: r11v6 */
    /* JADX WARN: Type inference failed for: r11v8, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v10, types: [T] */
    /* JADX WARN: Type inference failed for: r9v11, types: [T, androidx.compose.ui.input.pointer.PointerInputChange] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:44:0x00c1 -> B:6:0x00c4). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        androidx.compose.ui.input.pointer.AwaitPointerEventScope awaitPointerEventScope;
        int i;
        java.lang.Object obj2;
        java.lang.Object awaitPointerEvent;
        androidx.compose.ui.input.pointer.AwaitPointerEventScope awaitPointerEventScope2;
        androidx.compose.ui.input.pointer.PointerEvent pointerEvent;
        int size;
        int i2;
        T t;
        androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = this.getHighSpeedVideoSizesFor;
        java.lang.Object obj3 = null;
        boolean z = true;
        z = true;
        z = true;
        if (i3 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            awaitPointerEventScope = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) this.getInputFormats;
            i = 0;
            if (i != 0) {
            }
        } else {
            if (i3 == 1) {
                i = this.getHighSpeedVideoFpsRanges;
                awaitPointerEventScope = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) this.getInputFormats;
                kotlin.ResultKt.throwOnFailure(obj);
                obj2 = obj;
                androidx.compose.ui.input.pointer.PointerEvent pointerEvent2 = (androidx.compose.ui.input.pointer.PointerEvent) obj2;
                java.util.List<androidx.compose.ui.input.pointer.PointerInputChange> changes = pointerEvent2.getChanges();
                int size2 = changes.size();
                int i4 = 0;
                while (true) {
                    if (i4 >= size2) {
                        i = z ? 1 : 0;
                        break;
                    }
                    if (!androidx.compose.ui.input.pointer.PointerEventKt.changedToUpIgnoreConsumed(changes.get(i4))) {
                        break;
                    }
                    i4++;
                }
                java.util.List<androidx.compose.ui.input.pointer.PointerInputChange> changes2 = pointerEvent2.getChanges();
                int size3 = changes2.size();
                for (int i5 = 0; i5 < size3; i5++) {
                    androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange2 = changes2.get(i5);
                    if (pointerInputChange2.isConsumed() || androidx.compose.ui.input.pointer.PointerEventKt.m7177isOutOfBoundsjwHxaWs(pointerInputChange2, awaitPointerEventScope.mo7142getSizeYbymL2g(), awaitPointerEventScope.mo7141getExtendedTouchPaddingNHjbRc())) {
                        break;
                    }
                }
                if (androidx.compose.foundation.gestures.TapGestureDetector_androidKt.isDeepPress(pointerEvent2)) {
                    this.getHighSpeedVideoSizes.element = z;
                    i = z ? 1 : 0;
                }
                this.getInputFormats = awaitPointerEventScope;
                this.getHighSpeedVideoFpsRangesFor = pointerEvent2;
                this.getHighSpeedVideoFpsRanges = i;
                this.getHighSpeedVideoSizesFor = 2;
                awaitPointerEvent = awaitPointerEventScope.awaitPointerEvent(androidx.compose.ui.input.pointer.PointerEventPass.Final, this);
                if (awaitPointerEvent != coroutine_suspended) {
                    awaitPointerEventScope2 = awaitPointerEventScope;
                    pointerEvent = pointerEvent2;
                    java.util.List<androidx.compose.ui.input.pointer.PointerInputChange> changes3 = ((androidx.compose.ui.input.pointer.PointerEvent) awaitPointerEvent).getChanges();
                    size = changes3.size();
                    i2 = 0;
                    while (true) {
                        if (i2 >= size) {
                        }
                        i2++;
                    }
                    if (!androidx.compose.foundation.gestures.DragGestureDetectorKt.getHighSpeedVideoFpsRanges(pointerEvent, this.Camera2StreamConfigurationMap.element.getId())) {
                    }
                    awaitPointerEventScope = awaitPointerEventScope2;
                    obj3 = null;
                    z = true;
                    if (i != 0) {
                    }
                }
                return coroutine_suspended;
            }
            if (i3 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i = this.getHighSpeedVideoFpsRanges;
            pointerEvent = (androidx.compose.ui.input.pointer.PointerEvent) this.getHighSpeedVideoFpsRangesFor;
            awaitPointerEventScope2 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) this.getInputFormats;
            kotlin.ResultKt.throwOnFailure(obj);
            awaitPointerEvent = obj;
            java.util.List<androidx.compose.ui.input.pointer.PointerInputChange> changes32 = ((androidx.compose.ui.input.pointer.PointerEvent) awaitPointerEvent).getChanges();
            size = changes32.size();
            i2 = 0;
            while (true) {
                if (i2 >= size) {
                    break;
                }
                if (changes32.get(i2).isConsumed()) {
                    i = z ? 1 : 0;
                    break;
                }
                i2++;
            }
            if (!androidx.compose.foundation.gestures.DragGestureDetectorKt.getHighSpeedVideoFpsRanges(pointerEvent, this.Camera2StreamConfigurationMap.element.getId())) {
                java.util.List<androidx.compose.ui.input.pointer.PointerInputChange> changes4 = pointerEvent.getChanges();
                int size4 = changes4.size();
                int i6 = 0;
                while (true) {
                    if (i6 >= size4) {
                        pointerInputChange = null;
                        break;
                    }
                    pointerInputChange = changes4.get(i6);
                    if (pointerInputChange.getPressed()) {
                        break;
                    }
                    i6++;
                }
                androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange3 = pointerInputChange;
                if (pointerInputChange3 != 0) {
                    this.Camera2StreamConfigurationMap.element = pointerInputChange3;
                    this.getHighResolutionOutputSizeshNQ4ISI.element = this.Camera2StreamConfigurationMap.element;
                } else {
                    i = z ? 1 : 0;
                    awaitPointerEventScope = awaitPointerEventScope2;
                    obj3 = null;
                    if (i != 0) {
                        this.getInputFormats = awaitPointerEventScope;
                        this.getHighSpeedVideoFpsRangesFor = obj3;
                        this.getHighSpeedVideoFpsRanges = i;
                        this.getHighSpeedVideoSizesFor = z ? 1 : 0;
                        obj2 = awaitPointerEventScope.awaitPointerEvent(androidx.compose.ui.input.pointer.PointerEventPass.Main, this);
                    } else {
                        return kotlin.Unit.INSTANCE;
                    }
                }
            } else {
                kotlin.jvm.internal.Ref.ObjectRef<androidx.compose.ui.input.pointer.PointerInputChange> objectRef = this.getHighResolutionOutputSizeshNQ4ISI;
                java.util.List<androidx.compose.ui.input.pointer.PointerInputChange> changes5 = pointerEvent.getChanges();
                kotlin.jvm.internal.Ref.ObjectRef<androidx.compose.ui.input.pointer.PointerInputChange> objectRef2 = this.Camera2StreamConfigurationMap;
                int size5 = changes5.size();
                int i7 = 0;
                while (true) {
                    if (i7 >= size5) {
                        t = 0;
                        break;
                    }
                    t = changes5.get(i7);
                    kotlin.jvm.internal.Ref.ObjectRef<androidx.compose.ui.input.pointer.PointerInputChange> objectRef3 = objectRef2;
                    if (androidx.compose.ui.input.pointer.PointerId.m7213equalsimpl0(((androidx.compose.ui.input.pointer.PointerInputChange) t).getId(), objectRef2.element.getId())) {
                        break;
                    }
                    i7++;
                    objectRef2 = objectRef3;
                }
                objectRef.element = t;
            }
            awaitPointerEventScope = awaitPointerEventScope2;
            obj3 = null;
            z = true;
            if (i != 0) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.jvm.functions.Function2
    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: merged with bridge method [inline-methods] */
    public java.lang.Object invoke(androidx.compose.ui.input.pointer.AwaitPointerEventScope awaitPointerEventScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitLongPressOrCancellation$2) create(awaitPointerEventScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitLongPressOrCancellation$2 dragGestureDetectorKt$awaitLongPressOrCancellation$2 = new androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitLongPressOrCancellation$2(this.getHighSpeedVideoSizes, this.Camera2StreamConfigurationMap, this.getHighResolutionOutputSizeshNQ4ISI, continuation);
        dragGestureDetectorKt$awaitLongPressOrCancellation$2.getInputFormats = obj;
        return dragGestureDetectorKt$awaitLongPressOrCancellation$2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DragGestureDetectorKt$awaitLongPressOrCancellation$2(kotlin.jvm.internal.Ref.BooleanRef booleanRef, kotlin.jvm.internal.Ref.ObjectRef<androidx.compose.ui.input.pointer.PointerInputChange> objectRef, kotlin.jvm.internal.Ref.ObjectRef<androidx.compose.ui.input.pointer.PointerInputChange> objectRef2, kotlin.coroutines.Continuation<? super androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitLongPressOrCancellation$2> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoSizes = booleanRef;
        this.Camera2StreamConfigurationMap = objectRef;
        this.getHighResolutionOutputSizeshNQ4ISI = objectRef2;
    }
}
