package androidx.compose.foundation.gestures;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Landroidx/compose/ui/input/pointer/PointerInputChange;", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$awaitSecondDown$2", f = "TapGestureDetector.kt", i = {0, 0}, l = {227}, m = "invokeSuspend", n = {"$this$withTimeoutOrNull", "minUptime"}, s = {"L$0", "J$0"}, v = 1)
/* loaded from: classes.dex */
final class TapGestureDetectorKt$awaitSecondDown$2 extends kotlin.coroutines.jvm.internal.RestrictedSuspendLambda implements kotlin.jvm.functions.Function2<androidx.compose.ui.input.pointer.AwaitPointerEventScope, kotlin.coroutines.Continuation<? super androidx.compose.ui.input.pointer.PointerInputChange>, java.lang.Object> {
    int Camera2StreamConfigurationMap;
    long getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ androidx.compose.ui.input.pointer.PointerInputChange getHighSpeedVideoFpsRanges;
    private /* synthetic */ java.lang.Object getHighSpeedVideoSizes;

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0053 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0048 A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:8:0x0046 -> B:5:0x0049). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r11.Camera2StreamConfigurationMap
            r2 = 1
            if (r1 == 0) goto L1d
            if (r1 != r2) goto L15
            long r3 = r11.getHighResolutionOutputSizeshNQ4ISI
            java.lang.Object r1 = r11.getHighSpeedVideoSizes
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r1 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r1
            kotlin.ResultKt.throwOnFailure(r12)
            goto L49
        L15:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L1d:
            kotlin.ResultKt.throwOnFailure(r12)
            java.lang.Object r12 = r11.getHighSpeedVideoSizes
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r12 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r12
            androidx.compose.ui.input.pointer.PointerInputChange r1 = r11.getHighSpeedVideoFpsRanges
            long r3 = r1.getUptimeMillis()
            androidx.compose.ui.platform.ViewConfiguration r1 = r12.getViewConfiguration()
            long r5 = r1.getDoubleTapMinTimeMillis()
            long r3 = r3 + r5
            r1 = r12
        L34:
            r8 = r11
            kotlin.coroutines.Continuation r8 = (kotlin.coroutines.Continuation) r8
            r11.getHighSpeedVideoSizes = r1
            r11.getHighResolutionOutputSizeshNQ4ISI = r3
            r11.Camera2StreamConfigurationMap = r2
            r6 = 0
            r7 = 0
            r9 = 3
            r10 = 0
            r5 = r1
            java.lang.Object r12 = androidx.compose.foundation.gestures.TapGestureDetectorKt.awaitFirstDown$default(r5, r6, r7, r8, r9, r10)
            if (r12 != r0) goto L49
            return r0
        L49:
            androidx.compose.ui.input.pointer.PointerInputChange r12 = (androidx.compose.ui.input.pointer.PointerInputChange) r12
            long r5 = r12.getUptimeMillis()
            int r5 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r5 < 0) goto L34
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.TapGestureDetectorKt$awaitSecondDown$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.jvm.functions.Function2
    /* renamed from: getHighSpeedVideoSizes, reason: merged with bridge method [inline-methods] */
    public java.lang.Object invoke(androidx.compose.ui.input.pointer.AwaitPointerEventScope awaitPointerEventScope, kotlin.coroutines.Continuation<? super androidx.compose.ui.input.pointer.PointerInputChange> continuation) {
        return ((androidx.compose.foundation.gestures.TapGestureDetectorKt$awaitSecondDown$2) create(awaitPointerEventScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        androidx.compose.foundation.gestures.TapGestureDetectorKt$awaitSecondDown$2 tapGestureDetectorKt$awaitSecondDown$2 = new androidx.compose.foundation.gestures.TapGestureDetectorKt$awaitSecondDown$2(this.getHighSpeedVideoFpsRanges, continuation);
        tapGestureDetectorKt$awaitSecondDown$2.getHighSpeedVideoSizes = obj;
        return tapGestureDetectorKt$awaitSecondDown$2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TapGestureDetectorKt$awaitSecondDown$2(androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange, kotlin.coroutines.Continuation<? super androidx.compose.foundation.gestures.TapGestureDetectorKt$awaitSecondDown$2> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRanges = pointerInputChange;
    }
}
