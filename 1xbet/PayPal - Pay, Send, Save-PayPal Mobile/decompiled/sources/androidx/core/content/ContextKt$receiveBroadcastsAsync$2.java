package androidx.core.content;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0001\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.core.content.ContextKt$receiveBroadcastsAsync$2", f = "Context.kt", i = {}, l = {238}, m = "invokeSuspend", n = {}, s = {}, v = 1)
/* loaded from: classes7.dex */
final class ContextKt$receiveBroadcastsAsync$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<?>, java.lang.Object> {
    final /* synthetic */ int Camera2StreamConfigurationMap;
    final /* synthetic */ kotlin.jvm.functions.Function3<android.content.BroadcastReceiver.PendingResult, android.content.Intent, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ android.content.IntentFilter getHighSpeedVideoFpsRanges;
    final /* synthetic */ java.lang.String getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ android.os.Handler getHighSpeedVideoSizes;
    int getInputFormats;
    private /* synthetic */ java.lang.Object getInputSizeshNQ4ISI;
    final /* synthetic */ android.content.Context getOutputFormats;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getInputFormats;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            final kotlinx.coroutines.CoroutineScope coroutineScope = (kotlinx.coroutines.CoroutineScope) this.getInputSizeshNQ4ISI;
            android.content.Context context = this.getOutputFormats;
            android.content.IntentFilter intentFilter = this.getHighSpeedVideoFpsRanges;
            int i2 = this.Camera2StreamConfigurationMap;
            java.lang.String str = this.getHighSpeedVideoFpsRangesFor;
            android.os.Handler handler = this.getHighSpeedVideoSizes;
            final kotlin.jvm.functions.Function3<android.content.BroadcastReceiver.PendingResult, android.content.Intent, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> function3 = this.getHighResolutionOutputSizeshNQ4ISI;
            this.getInputFormats = 1;
            if (androidx.core.content.ContextKt.receiveBroadcasts(context, intentFilter, i2, str, handler, new kotlin.jvm.functions.Function2() { // from class: androidx.core.content.ContextKt$receiveBroadcastsAsync$2$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3) {
                    return androidx.core.content.ContextKt$receiveBroadcastsAsync$2.getHighSpeedVideoFpsRanges(kotlinx.coroutines.CoroutineScope.this, function3, (android.content.BroadcastReceiver) obj2, (android.content.Intent) obj3);
                }
            }, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        throw new kotlin.KotlinNothingValueException();
    }

    public static /* synthetic */ kotlin.Unit getHighSpeedVideoFpsRanges(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.jvm.functions.Function3 function3, android.content.BroadcastReceiver broadcastReceiver, android.content.Intent intent) {
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, kotlinx.coroutines.CoroutineStart.ATOMIC, new androidx.core.content.ContextKt$receiveBroadcastsAsync$2$1$1(function3, broadcastReceiver.goAsync(), intent, null), 1, null);
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<?> continuation) {
        return ((androidx.core.content.ContextKt$receiveBroadcastsAsync$2) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        androidx.core.content.ContextKt$receiveBroadcastsAsync$2 contextKt$receiveBroadcastsAsync$2 = new androidx.core.content.ContextKt$receiveBroadcastsAsync$2(this.getOutputFormats, this.getHighSpeedVideoFpsRanges, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoSizes, this.getHighResolutionOutputSizeshNQ4ISI, continuation);
        contextKt$receiveBroadcastsAsync$2.getInputSizeshNQ4ISI = obj;
        return contextKt$receiveBroadcastsAsync$2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    ContextKt$receiveBroadcastsAsync$2(android.content.Context context, android.content.IntentFilter intentFilter, int i, java.lang.String str, android.os.Handler handler, kotlin.jvm.functions.Function3<? super android.content.BroadcastReceiver.PendingResult, ? super android.content.Intent, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> function3, kotlin.coroutines.Continuation<? super androidx.core.content.ContextKt$receiveBroadcastsAsync$2> continuation) {
        super(2, continuation);
        this.getOutputFormats = context;
        this.getHighSpeedVideoFpsRanges = intentFilter;
        this.Camera2StreamConfigurationMap = i;
        this.getHighSpeedVideoFpsRangesFor = str;
        this.getHighSpeedVideoSizes = handler;
        this.getHighResolutionOutputSizeshNQ4ISI = function3;
    }
}
