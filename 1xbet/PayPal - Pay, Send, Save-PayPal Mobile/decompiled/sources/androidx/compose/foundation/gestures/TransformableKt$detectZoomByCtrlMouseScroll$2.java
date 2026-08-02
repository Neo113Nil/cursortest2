package androidx.compose.foundation.gestures;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.foundation.gestures.TransformableKt$detectZoomByCtrlMouseScroll$2", f = "Transformable.kt", i = {0, 1}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_USER_BRUSHSTROKE_VALUE, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CARD_DARK_APPEARANCE_VALUE}, m = "invokeSuspend", n = {"$this$awaitPointerEventScope", "$this$awaitPointerEventScope"}, s = {"L$0", "L$0"}, v = 1)
/* loaded from: classes6.dex */
final class TransformableKt$detectZoomByCtrlMouseScroll$2 extends kotlin.coroutines.jvm.internal.RestrictedSuspendLambda implements kotlin.jvm.functions.Function2<androidx.compose.ui.input.pointer.AwaitPointerEventScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    private /* synthetic */ java.lang.Object Camera2StreamConfigurationMap;
    final /* synthetic */ androidx.compose.foundation.gestures.ScrollConfig getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ kotlinx.coroutines.channels.Channel<androidx.compose.foundation.gestures.TransformEvent> getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ kotlin.coroutines.CoroutineContext getHighSpeedVideoSizes;

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0044, code lost:
    
        if (r13 != r0) goto L19;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0091 A[Catch: all -> 0x009f, TRY_LEAVE, TryCatch #0 {all -> 0x009f, blocks: (B:7:0x0012, B:8:0x008d, B:10:0x0091, B:11:0x0053, B:19:0x0037, B:21:0x0046, B:28:0x0023), top: B:2:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0096 A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0037 A[Catch: all -> 0x009f, TRY_ENTER, TryCatch #0 {all -> 0x009f, blocks: (B:7:0x0012, B:8:0x008d, B:10:0x0091, B:11:0x0053, B:19:0x0037, B:21:0x0046, B:28:0x0023), top: B:2:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a8  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x008a -> B:8:0x008d). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        androidx.compose.ui.input.pointer.AwaitPointerEventScope awaitPointerEventScope;
        long m5762unboximpl;
        androidx.compose.ui.geometry.Offset offset;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRangesFor;
        try {
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                awaitPointerEventScope = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) this.Camera2StreamConfigurationMap;
                if (!kotlinx.coroutines.JobKt.isActive(this.getHighSpeedVideoSizes)) {
                }
            } else if (i == 1) {
                awaitPointerEventScope = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) this.Camera2StreamConfigurationMap;
                kotlin.ResultKt.throwOnFailure(obj);
                m5762unboximpl = ((androidx.compose.ui.geometry.Offset) obj).m5762unboximpl();
                this.getHighSpeedVideoFpsRanges.mo9266trySendJP2dKIU(androidx.compose.foundation.gestures.TransformEvent.TransformStarted.INSTANCE);
                this.getHighSpeedVideoFpsRanges.mo9266trySendJP2dKIU(new androidx.compose.foundation.gestures.TransformEvent.TransformDelta((float) java.lang.Math.pow(2.0d, java.lang.Float.intBitsToFloat((int) (m5762unboximpl & 4294967295L)) / 545.0f), androidx.compose.ui.geometry.Offset.INSTANCE.m5768getZeroF1C5BW0(), 0.0f, null));
                this.Camera2StreamConfigurationMap = awaitPointerEventScope;
                this.getHighSpeedVideoFpsRangesFor = 2;
                obj = androidx.compose.foundation.gestures.TransformableKt.getHighSpeedVideoSizes(awaitPointerEventScope, this.getHighResolutionOutputSizeshNQ4ISI, this);
                if (obj == coroutine_suspended) {
                }
                offset = (androidx.compose.ui.geometry.Offset) obj;
                if (offset != null) {
                }
            } else {
                if (i != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                awaitPointerEventScope = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) this.Camera2StreamConfigurationMap;
                kotlin.ResultKt.throwOnFailure(obj);
                offset = (androidx.compose.ui.geometry.Offset) obj;
                if (offset != null) {
                    m5762unboximpl = offset.m5762unboximpl();
                    this.getHighSpeedVideoFpsRanges.mo9266trySendJP2dKIU(new androidx.compose.foundation.gestures.TransformEvent.TransformDelta((float) java.lang.Math.pow(2.0d, java.lang.Float.intBitsToFloat((int) (m5762unboximpl & 4294967295L)) / 545.0f), androidx.compose.ui.geometry.Offset.INSTANCE.m5768getZeroF1C5BW0(), 0.0f, null));
                    this.Camera2StreamConfigurationMap = awaitPointerEventScope;
                    this.getHighSpeedVideoFpsRangesFor = 2;
                    obj = androidx.compose.foundation.gestures.TransformableKt.getHighSpeedVideoSizes(awaitPointerEventScope, this.getHighResolutionOutputSizeshNQ4ISI, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    offset = (androidx.compose.ui.geometry.Offset) obj;
                    if (offset != null) {
                        if (!kotlinx.coroutines.JobKt.isActive(this.getHighSpeedVideoSizes)) {
                            this.Camera2StreamConfigurationMap = awaitPointerEventScope;
                            this.getHighSpeedVideoFpsRangesFor = 1;
                            obj = androidx.compose.foundation.gestures.TransformableKt.getHighSpeedVideoFpsRangesFor(awaitPointerEventScope, this.getHighResolutionOutputSizeshNQ4ISI, this);
                        } else {
                            return kotlin.Unit.INSTANCE;
                        }
                    }
                }
            }
        } finally {
            this.getHighSpeedVideoFpsRanges.mo9266trySendJP2dKIU(androidx.compose.foundation.gestures.TransformEvent.TransformStopped.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.jvm.functions.Function2
    /* renamed from: Camera2StreamConfigurationMap, reason: merged with bridge method [inline-methods] */
    public java.lang.Object invoke(androidx.compose.ui.input.pointer.AwaitPointerEventScope awaitPointerEventScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((androidx.compose.foundation.gestures.TransformableKt$detectZoomByCtrlMouseScroll$2) create(awaitPointerEventScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        androidx.compose.foundation.gestures.TransformableKt$detectZoomByCtrlMouseScroll$2 transformableKt$detectZoomByCtrlMouseScroll$2 = new androidx.compose.foundation.gestures.TransformableKt$detectZoomByCtrlMouseScroll$2(this.getHighSpeedVideoSizes, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRanges, continuation);
        transformableKt$detectZoomByCtrlMouseScroll$2.Camera2StreamConfigurationMap = obj;
        return transformableKt$detectZoomByCtrlMouseScroll$2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TransformableKt$detectZoomByCtrlMouseScroll$2(kotlin.coroutines.CoroutineContext coroutineContext, androidx.compose.foundation.gestures.ScrollConfig scrollConfig, kotlinx.coroutines.channels.Channel<androidx.compose.foundation.gestures.TransformEvent> channel, kotlin.coroutines.Continuation<? super androidx.compose.foundation.gestures.TransformableKt$detectZoomByCtrlMouseScroll$2> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoSizes = coroutineContext;
        this.getHighResolutionOutputSizeshNQ4ISI = scrollConfig;
        this.getHighSpeedVideoFpsRanges = channel;
    }
}
