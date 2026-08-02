package androidx.compose.ui.input.pointer;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$onPointerEvent$1", f = "SuspendingPointerInputFilter.kt", i = {}, l = {718, com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.FaceCaptureManager.IDEAL_CAPTURE_HEIGHT}, m = "invokeSuspend", n = {}, s = {}, v = 1)
/* loaded from: classes.dex */
final class SuspendingPointerInputModifierNodeImpl$onPointerEvent$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl Camera2StreamConfigurationMap;
    int getHighSpeedVideoSizes;

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0037, code lost:
    
        if (r5.invoke(r1, r4) == r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x004c, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x004a, code lost:
    
        if (r5.invoke(r1, r4) == r0) goto L17;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlin.jvm.functions.Function2 function2;
        kotlin.jvm.functions.Function2 function22;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoSizes;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            function2 = this.Camera2StreamConfigurationMap.getHighResolutionOutputSizeshNQ4ISI;
            if (function2 != null) {
                function22 = this.Camera2StreamConfigurationMap.getHighResolutionOutputSizeshNQ4ISI;
                kotlin.jvm.internal.Intrinsics.checkNotNull(function22);
                androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl suspendingPointerInputModifierNodeImpl = this.Camera2StreamConfigurationMap;
                this.getHighSpeedVideoSizes = 1;
            } else {
                androidx.compose.ui.input.pointer.PointerInputEventHandler getHighSpeedVideoFpsRangesFor = this.Camera2StreamConfigurationMap.getGetHighSpeedVideoFpsRangesFor();
                androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl suspendingPointerInputModifierNodeImpl2 = this.Camera2StreamConfigurationMap;
                this.getHighSpeedVideoSizes = 2;
            }
        } else {
            if (i != 1 && i != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$onPointerEvent$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$onPointerEvent$1(this.Camera2StreamConfigurationMap, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SuspendingPointerInputModifierNodeImpl$onPointerEvent$1(androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl suspendingPointerInputModifierNodeImpl, kotlin.coroutines.Continuation<? super androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$onPointerEvent$1> continuation) {
        super(2, continuation);
        this.Camera2StreamConfigurationMap = suspendingPointerInputModifierNodeImpl;
    }
}
