package androidx.compose.foundation.gestures;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.foundation.gestures.MouseWheelScrollingLogic$startReceivingMouseWheelEvents$1", f = "MouseWheelScrollable.kt", i = {0, 1}, l = {135, 138}, m = "invokeSuspend", n = {"$this$launch", "$this$launch"}, s = {"L$0", "L$0"}, v = 1)
/* loaded from: classes6.dex */
final class MouseWheelScrollingLogic$startReceivingMouseWheelEvents$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    private /* synthetic */ java.lang.Object Camera2StreamConfigurationMap;
    int getHighSpeedVideoFpsRanges;
    final /* synthetic */ androidx.compose.foundation.gestures.MouseWheelScrollingLogic getHighSpeedVideoSizes;

    /* JADX WARN: Code restructure failed: missing block: B:15:0x007f, code lost:
    
        if (r13 != r0) goto L8;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0039 A[Catch: all -> 0x008a, TryCatch #0 {all -> 0x008a, blocks: (B:7:0x0013, B:9:0x002f, B:11:0x0039, B:14:0x004f, B:24:0x0024), top: B:2:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0082  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x007f -> B:8:0x0016). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.CoroutineScope coroutineScope;
        kotlinx.coroutines.CoroutineScope coroutineScope2;
        androidx.compose.ui.unit.Density density;
        float f;
        androidx.compose.ui.unit.Density density2;
        float f2;
        androidx.compose.foundation.gestures.ScrollingLogic scrollingLogic;
        java.lang.Object Camera2StreamConfigurationMap;
        kotlinx.coroutines.channels.Channel channel;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRanges;
        try {
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                coroutineScope = (kotlinx.coroutines.CoroutineScope) this.Camera2StreamConfigurationMap;
                if (!kotlinx.coroutines.JobKt.isActive(coroutineScope.getCoroutineContext())) {
                }
            } else {
                if (i != 1) {
                    if (i != 2) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    coroutineScope2 = (kotlinx.coroutines.CoroutineScope) this.Camera2StreamConfigurationMap;
                    kotlin.ResultKt.throwOnFailure(obj);
                    coroutineScope = coroutineScope2;
                    if (!kotlinx.coroutines.JobKt.isActive(coroutineScope.getCoroutineContext())) {
                        channel = this.getHighSpeedVideoSizes.getHighSpeedVideoFpsRangesFor;
                        this.Camera2StreamConfigurationMap = coroutineScope;
                        this.getHighSpeedVideoFpsRanges = 1;
                        java.lang.Object receive = channel.receive(this);
                        if (receive != coroutine_suspended) {
                            coroutineScope2 = coroutineScope;
                            obj = receive;
                            androidx.compose.foundation.gestures.MouseWheelScrollingLogic.MouseWheelScrollDelta mouseWheelScrollDelta = (androidx.compose.foundation.gestures.MouseWheelScrollingLogic.MouseWheelScrollDelta) obj;
                            density = this.getHighSpeedVideoSizes.Camera2StreamConfigurationMap;
                            f = androidx.compose.foundation.gestures.MouseWheelScrollableKt.getHighSpeedVideoFpsRanges;
                            float mo1418toPx0680j_4 = density.mo1418toPx0680j_4(f);
                            density2 = this.getHighSpeedVideoSizes.Camera2StreamConfigurationMap;
                            f2 = androidx.compose.foundation.gestures.MouseWheelScrollableKt.getHighSpeedVideoFpsRangesFor;
                            float mo1418toPx0680j_42 = density2.mo1418toPx0680j_4(f2);
                            androidx.compose.foundation.gestures.MouseWheelScrollingLogic mouseWheelScrollingLogic = this.getHighSpeedVideoSizes;
                            scrollingLogic = mouseWheelScrollingLogic.getHighSpeedVideoFpsRanges;
                            this.Camera2StreamConfigurationMap = coroutineScope2;
                            this.getHighSpeedVideoFpsRanges = 2;
                            Camera2StreamConfigurationMap = mouseWheelScrollingLogic.Camera2StreamConfigurationMap(scrollingLogic, mouseWheelScrollDelta, mo1418toPx0680j_4, mo1418toPx0680j_42, this);
                        }
                        return coroutine_suspended;
                    }
                    this.getHighSpeedVideoSizes.getHighSpeedVideoSizesFor = null;
                    return kotlin.Unit.INSTANCE;
                }
                coroutineScope2 = (kotlinx.coroutines.CoroutineScope) this.Camera2StreamConfigurationMap;
                kotlin.ResultKt.throwOnFailure(obj);
                androidx.compose.foundation.gestures.MouseWheelScrollingLogic.MouseWheelScrollDelta mouseWheelScrollDelta2 = (androidx.compose.foundation.gestures.MouseWheelScrollingLogic.MouseWheelScrollDelta) obj;
                density = this.getHighSpeedVideoSizes.Camera2StreamConfigurationMap;
                f = androidx.compose.foundation.gestures.MouseWheelScrollableKt.getHighSpeedVideoFpsRanges;
                float mo1418toPx0680j_43 = density.mo1418toPx0680j_4(f);
                density2 = this.getHighSpeedVideoSizes.Camera2StreamConfigurationMap;
                f2 = androidx.compose.foundation.gestures.MouseWheelScrollableKt.getHighSpeedVideoFpsRangesFor;
                float mo1418toPx0680j_422 = density2.mo1418toPx0680j_4(f2);
                androidx.compose.foundation.gestures.MouseWheelScrollingLogic mouseWheelScrollingLogic2 = this.getHighSpeedVideoSizes;
                scrollingLogic = mouseWheelScrollingLogic2.getHighSpeedVideoFpsRanges;
                this.Camera2StreamConfigurationMap = coroutineScope2;
                this.getHighSpeedVideoFpsRanges = 2;
                Camera2StreamConfigurationMap = mouseWheelScrollingLogic2.Camera2StreamConfigurationMap(scrollingLogic, mouseWheelScrollDelta2, mo1418toPx0680j_43, mo1418toPx0680j_422, this);
            }
        } catch (java.lang.Throwable th) {
            this.getHighSpeedVideoSizes.getHighSpeedVideoSizesFor = null;
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.jvm.functions.Function2
    /* renamed from: getHighSpeedVideoSizes, reason: merged with bridge method [inline-methods] */
    public java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((androidx.compose.foundation.gestures.MouseWheelScrollingLogic$startReceivingMouseWheelEvents$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        androidx.compose.foundation.gestures.MouseWheelScrollingLogic$startReceivingMouseWheelEvents$1 mouseWheelScrollingLogic$startReceivingMouseWheelEvents$1 = new androidx.compose.foundation.gestures.MouseWheelScrollingLogic$startReceivingMouseWheelEvents$1(this.getHighSpeedVideoSizes, continuation);
        mouseWheelScrollingLogic$startReceivingMouseWheelEvents$1.Camera2StreamConfigurationMap = obj;
        return mouseWheelScrollingLogic$startReceivingMouseWheelEvents$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MouseWheelScrollingLogic$startReceivingMouseWheelEvents$1(androidx.compose.foundation.gestures.MouseWheelScrollingLogic mouseWheelScrollingLogic, kotlin.coroutines.Continuation<? super androidx.compose.foundation.gestures.MouseWheelScrollingLogic$startReceivingMouseWheelEvents$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoSizes = mouseWheelScrollingLogic;
    }
}
