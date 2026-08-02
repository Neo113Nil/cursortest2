package androidx.compose.foundation.gestures;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$waitForLongPress$2", f = "TapGestureDetector.kt", i = {0, 1}, l = {386, 409}, m = "invokeSuspend", n = {"$this$withTimeout", "$this$withTimeout"}, s = {"L$0", "L$0"}, v = 1)
/* loaded from: classes.dex */
final class TapGestureDetectorKt$waitForLongPress$2 extends kotlin.coroutines.jvm.internal.RestrictedSuspendLambda implements kotlin.jvm.functions.Function2<androidx.compose.ui.input.pointer.AwaitPointerEventScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    private /* synthetic */ java.lang.Object Camera2StreamConfigurationMap;
    final /* synthetic */ androidx.compose.ui.input.pointer.PointerEventPass getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ kotlin.jvm.internal.Ref.ObjectRef<androidx.compose.foundation.gestures.LongPressResult> getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoSizes;

    /* JADX WARN: Code restructure failed: missing block: B:12:0x00c9, code lost:
    
        r13.getHighSpeedVideoFpsRanges.element = androidx.compose.foundation.gestures.LongPressResult.Canceled.INSTANCE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0061, code lost:
    
        if (androidx.compose.foundation.gestures.TapGestureDetector_androidKt.isDeepPress(r14) == false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0063, code lost:
    
        r13.getHighSpeedVideoFpsRanges.element = androidx.compose.foundation.gestures.LongPressResult.Success.INSTANCE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x006b, code lost:
    
        r14 = r14.getChanges();
        r5 = r14.size();
        r6 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0077, code lost:
    
        if (r6 >= r5) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0079, code lost:
    
        r7 = r14.get(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0083, code lost:
    
        if (r7.isConsumed() != false) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0091, code lost:
    
        if (androidx.compose.ui.input.pointer.PointerEventKt.m7177isOutOfBoundsjwHxaWs(r7, r1.mo7142getSizeYbymL2g(), r1.mo7141getExtendedTouchPaddingNHjbRc()) != false) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0093, code lost:
    
        r6 = r6 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0096, code lost:
    
        r13.getHighSpeedVideoFpsRanges.element = androidx.compose.foundation.gestures.LongPressResult.Canceled.INSTANCE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x009d, code lost:
    
        r13.Camera2StreamConfigurationMap = r1;
        r13.getHighSpeedVideoSizes = 2;
        r14 = r1.awaitPointerEvent(androidx.compose.ui.input.pointer.PointerEventPass.Final, r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00aa, code lost:
    
        if (r14 != r0) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00da A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v2, types: [T, androidx.compose.foundation.gestures.LongPressResult$Canceled] */
    /* JADX WARN: Type inference failed for: r0v3, types: [T, androidx.compose.foundation.gestures.LongPressResult$Success] */
    /* JADX WARN: Type inference failed for: r0v4, types: [T, androidx.compose.foundation.gestures.LongPressResult$Canceled] */
    /* JADX WARN: Type inference failed for: r1v2, types: [T, androidx.compose.foundation.gestures.LongPressResult$Released] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x00aa -> B:6:0x00ad). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        androidx.compose.ui.input.pointer.AwaitPointerEventScope awaitPointerEventScope;
        androidx.compose.ui.input.pointer.AwaitPointerEventScope awaitPointerEventScope2;
        int size;
        int i;
        java.lang.Object awaitPointerEvent;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = this.getHighSpeedVideoSizes;
        if (i2 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            awaitPointerEventScope = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) this.Camera2StreamConfigurationMap;
            this.Camera2StreamConfigurationMap = awaitPointerEventScope;
            this.getHighSpeedVideoSizes = 1;
            awaitPointerEvent = awaitPointerEventScope.awaitPointerEvent(this.getHighResolutionOutputSizeshNQ4ISI, this);
            if (awaitPointerEvent != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        if (i2 == 1) {
            awaitPointerEventScope2 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) this.Camera2StreamConfigurationMap;
            kotlin.ResultKt.throwOnFailure(obj);
            androidx.compose.ui.input.pointer.PointerEvent pointerEvent = (androidx.compose.ui.input.pointer.PointerEvent) obj;
            java.util.List<androidx.compose.ui.input.pointer.PointerInputChange> changes = pointerEvent.getChanges();
            size = changes.size();
            i = 0;
            while (true) {
                if (i < size) {
                }
                i++;
            }
            return kotlin.Unit.INSTANCE;
        }
        if (i2 != 2) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        awaitPointerEventScope2 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) this.Camera2StreamConfigurationMap;
        kotlin.ResultKt.throwOnFailure(obj);
        java.util.List<androidx.compose.ui.input.pointer.PointerInputChange> changes2 = ((androidx.compose.ui.input.pointer.PointerEvent) obj).getChanges();
        int size2 = changes2.size();
        for (int i3 = 0; i3 < size2; i3++) {
            if (changes2.get(i3).isConsumed()) {
                break;
            }
        }
        awaitPointerEventScope = awaitPointerEventScope2;
        this.Camera2StreamConfigurationMap = awaitPointerEventScope;
        this.getHighSpeedVideoSizes = 1;
        awaitPointerEvent = awaitPointerEventScope.awaitPointerEvent(this.getHighResolutionOutputSizeshNQ4ISI, this);
        if (awaitPointerEvent != coroutine_suspended) {
            awaitPointerEventScope2 = awaitPointerEventScope;
            obj = awaitPointerEvent;
            androidx.compose.ui.input.pointer.PointerEvent pointerEvent2 = (androidx.compose.ui.input.pointer.PointerEvent) obj;
            java.util.List<androidx.compose.ui.input.pointer.PointerInputChange> changes3 = pointerEvent2.getChanges();
            size = changes3.size();
            i = 0;
            while (true) {
                if (i < size) {
                    if (!androidx.compose.ui.input.pointer.PointerEventKt.changedToUp(changes3.get(i))) {
                        break;
                    }
                    i++;
                } else {
                    this.getHighSpeedVideoFpsRanges.element = new androidx.compose.foundation.gestures.LongPressResult.Released(pointerEvent2.getChanges().get(0));
                    break;
                }
            }
            return kotlin.Unit.INSTANCE;
        }
        return coroutine_suspended;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.jvm.functions.Function2
    /* renamed from: getHighSpeedVideoFpsRanges, reason: merged with bridge method [inline-methods] */
    public java.lang.Object invoke(androidx.compose.ui.input.pointer.AwaitPointerEventScope awaitPointerEventScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((androidx.compose.foundation.gestures.TapGestureDetectorKt$waitForLongPress$2) create(awaitPointerEventScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        androidx.compose.foundation.gestures.TapGestureDetectorKt$waitForLongPress$2 tapGestureDetectorKt$waitForLongPress$2 = new androidx.compose.foundation.gestures.TapGestureDetectorKt$waitForLongPress$2(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRanges, continuation);
        tapGestureDetectorKt$waitForLongPress$2.Camera2StreamConfigurationMap = obj;
        return tapGestureDetectorKt$waitForLongPress$2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TapGestureDetectorKt$waitForLongPress$2(androidx.compose.ui.input.pointer.PointerEventPass pointerEventPass, kotlin.jvm.internal.Ref.ObjectRef<androidx.compose.foundation.gestures.LongPressResult> objectRef, kotlin.coroutines.Continuation<? super androidx.compose.foundation.gestures.TapGestureDetectorKt$waitForLongPress$2> continuation) {
        super(2, continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = pointerEventPass;
        this.getHighSpeedVideoFpsRanges = objectRef;
    }
}
