package androidx.compose.foundation;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.foundation.CombinedClickableNode$onClickKeyUpEvent$2", f = "Clickable.kt", i = {0, 0}, l = {1194, 1198}, m = "invokeSuspend", n = {"minTime", com.datadog.trace.bootstrap.instrumentation.api.InstrumentationTags.TIMEOUT}, s = {"J$0", "J$1"}, v = 1)
/* loaded from: classes6.dex */
final class CombinedClickableNode$onClickKeyUpEvent$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int Camera2StreamConfigurationMap;
    final /* synthetic */ long getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ androidx.compose.foundation.CombinedClickableNode getHighSpeedVideoFpsRanges;
    long getHighSpeedVideoFpsRangesFor;
    long getHighSpeedVideoSizes;

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0069, code lost:
    
        if (kotlinx.coroutines.DelayKt.delay(r4 - r6, r10) == r0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0078, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x004a, code lost:
    
        if (kotlinx.coroutines.DelayKt.delay(r6, r10) != r0) goto L12;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        long doubleTapMinTimeMillis;
        long doubleTapTimeoutMillis;
        androidx.collection.MutableLongObjectMap mutableLongObjectMap;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.Camera2StreamConfigurationMap;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            androidx.compose.ui.platform.ViewConfiguration viewConfiguration = (androidx.compose.ui.platform.ViewConfiguration) androidx.compose.ui.node.CompositionLocalConsumerModifierNodeKt.currentValueOf(this.getHighSpeedVideoFpsRanges, androidx.compose.ui.platform.CompositionLocalsKt.getLocalViewConfiguration());
            doubleTapMinTimeMillis = viewConfiguration.getDoubleTapMinTimeMillis();
            doubleTapTimeoutMillis = viewConfiguration.getDoubleTapTimeoutMillis();
            this.getHighSpeedVideoSizes = doubleTapMinTimeMillis;
            this.getHighSpeedVideoFpsRangesFor = doubleTapTimeoutMillis;
            this.Camera2StreamConfigurationMap = 1;
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
                this.getHighSpeedVideoFpsRanges.getOnClick().invoke();
                return kotlin.Unit.INSTANCE;
            }
            doubleTapTimeoutMillis = this.getHighSpeedVideoFpsRangesFor;
            doubleTapMinTimeMillis = this.getHighSpeedVideoSizes;
            kotlin.ResultKt.throwOnFailure(obj);
        }
        mutableLongObjectMap = this.getHighSpeedVideoFpsRanges.getOutputFormats;
        androidx.compose.foundation.CombinedClickableNode.DoubleKeyClickState doubleKeyClickState = (androidx.compose.foundation.CombinedClickableNode.DoubleKeyClickState) mutableLongObjectMap.get(this.getHighResolutionOutputSizeshNQ4ISI);
        if (doubleKeyClickState != null) {
            doubleKeyClickState.setDoubleTapMinTimeMillisElapsed(true);
        }
        this.Camera2StreamConfigurationMap = 2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((androidx.compose.foundation.CombinedClickableNode$onClickKeyUpEvent$2) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new androidx.compose.foundation.CombinedClickableNode$onClickKeyUpEvent$2(this.getHighSpeedVideoFpsRanges, this.getHighResolutionOutputSizeshNQ4ISI, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CombinedClickableNode$onClickKeyUpEvent$2(androidx.compose.foundation.CombinedClickableNode combinedClickableNode, long j, kotlin.coroutines.Continuation<? super androidx.compose.foundation.CombinedClickableNode$onClickKeyUpEvent$2> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRanges = combinedClickableNode;
        this.getHighResolutionOutputSizeshNQ4ISI = j;
    }
}
