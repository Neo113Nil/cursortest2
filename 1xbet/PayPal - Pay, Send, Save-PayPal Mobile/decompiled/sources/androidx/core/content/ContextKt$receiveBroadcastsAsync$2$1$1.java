package androidx.core.content;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.core.content.ContextKt$receiveBroadcastsAsync$2$1$1", f = "Context.kt", i = {}, l = {247}, m = "invokeSuspend", n = {}, s = {}, v = 1)
/* loaded from: classes7.dex */
final class ContextKt$receiveBroadcastsAsync$2$1$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ kotlin.jvm.functions.Function3<android.content.BroadcastReceiver.PendingResult, android.content.Intent, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> Camera2StreamConfigurationMap;
    final /* synthetic */ android.content.Intent getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ android.content.BroadcastReceiver.PendingResult getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    private /* synthetic */ java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRangesFor;
        try {
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                kotlinx.coroutines.CoroutineScopeKt.ensureActive((kotlinx.coroutines.CoroutineScope) this.getHighSpeedVideoSizes);
                kotlin.jvm.functions.Function3<android.content.BroadcastReceiver.PendingResult, android.content.Intent, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> function3 = this.Camera2StreamConfigurationMap;
                android.content.BroadcastReceiver.PendingResult pendingResult = this.getHighSpeedVideoFpsRanges;
                android.content.Intent intent = this.getHighResolutionOutputSizeshNQ4ISI;
                this.getHighSpeedVideoFpsRangesFor = 1;
                if (function3.invoke(pendingResult, intent, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
            }
            this.getHighSpeedVideoFpsRanges.finish();
            return kotlin.Unit.INSTANCE;
        } catch (java.lang.Throwable th) {
            this.getHighSpeedVideoFpsRanges.finish();
            throw th;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((androidx.core.content.ContextKt$receiveBroadcastsAsync$2$1$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        androidx.core.content.ContextKt$receiveBroadcastsAsync$2$1$1 contextKt$receiveBroadcastsAsync$2$1$1 = new androidx.core.content.ContextKt$receiveBroadcastsAsync$2$1$1(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRanges, this.getHighResolutionOutputSizeshNQ4ISI, continuation);
        contextKt$receiveBroadcastsAsync$2$1$1.getHighSpeedVideoSizes = obj;
        return contextKt$receiveBroadcastsAsync$2$1$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    ContextKt$receiveBroadcastsAsync$2$1$1(kotlin.jvm.functions.Function3<? super android.content.BroadcastReceiver.PendingResult, ? super android.content.Intent, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> function3, android.content.BroadcastReceiver.PendingResult pendingResult, android.content.Intent intent, kotlin.coroutines.Continuation<? super androidx.core.content.ContextKt$receiveBroadcastsAsync$2$1$1> continuation) {
        super(2, continuation);
        this.Camera2StreamConfigurationMap = function3;
        this.getHighSpeedVideoFpsRanges = pendingResult;
        this.getHighResolutionOutputSizeshNQ4ISI = intent;
    }
}
