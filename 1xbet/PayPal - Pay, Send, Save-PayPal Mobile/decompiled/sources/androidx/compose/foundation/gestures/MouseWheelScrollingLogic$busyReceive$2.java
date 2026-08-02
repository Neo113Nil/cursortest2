package androidx.compose.foundation.gestures;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Landroidx/compose/foundation/gestures/MouseWheelScrollingLogic$MouseWheelScrollDelta;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.foundation.gestures.MouseWheelScrollingLogic$busyReceive$2", f = "MouseWheelScrollable.kt", i = {0}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_ARROW_UP_VALUE}, m = "invokeSuspend", n = {"job"}, s = {"L$0"}, v = 1)
/* loaded from: classes6.dex */
final class MouseWheelScrollingLogic$busyReceive$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super androidx.compose.foundation.gestures.MouseWheelScrollingLogic.MouseWheelScrollDelta>, java.lang.Object> {
    final /* synthetic */ kotlinx.coroutines.channels.Channel<androidx.compose.foundation.gestures.MouseWheelScrollingLogic.MouseWheelScrollDelta> Camera2StreamConfigurationMap;
    private /* synthetic */ java.lang.Object getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.Job launch$default;
        kotlinx.coroutines.Job job;
        java.lang.Throwable th;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRangesFor;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            launch$default = kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default((kotlinx.coroutines.CoroutineScope) this.getHighSpeedVideoFpsRanges, null, null, new androidx.compose.foundation.gestures.MouseWheelScrollingLogic$busyReceive$2$job$1(null), 3, null);
            try {
                this.getHighSpeedVideoFpsRanges = launch$default;
                this.getHighSpeedVideoFpsRangesFor = 1;
                java.lang.Object receive = this.Camera2StreamConfigurationMap.receive(this);
                if (receive == coroutine_suspended) {
                    return coroutine_suspended;
                }
                job = launch$default;
                obj = receive;
            } catch (java.lang.Throwable th2) {
                job = launch$default;
                th = th2;
                kotlinx.coroutines.Job.DefaultImpls.cancel$default(job, (java.util.concurrent.CancellationException) null, 1, (java.lang.Object) null);
                throw th;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            job = (kotlinx.coroutines.Job) this.getHighSpeedVideoFpsRanges;
            try {
                kotlin.ResultKt.throwOnFailure(obj);
            } catch (java.lang.Throwable th3) {
                th = th3;
                kotlinx.coroutines.Job.DefaultImpls.cancel$default(job, (java.util.concurrent.CancellationException) null, 1, (java.lang.Object) null);
                throw th;
            }
        }
        androidx.compose.foundation.gestures.MouseWheelScrollingLogic.MouseWheelScrollDelta mouseWheelScrollDelta = (androidx.compose.foundation.gestures.MouseWheelScrollingLogic.MouseWheelScrollDelta) obj;
        kotlinx.coroutines.Job.DefaultImpls.cancel$default(job, (java.util.concurrent.CancellationException) null, 1, (java.lang.Object) null);
        return mouseWheelScrollDelta;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.jvm.functions.Function2
    /* renamed from: getHighSpeedVideoSizes, reason: merged with bridge method [inline-methods] */
    public java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super androidx.compose.foundation.gestures.MouseWheelScrollingLogic.MouseWheelScrollDelta> continuation) {
        return ((androidx.compose.foundation.gestures.MouseWheelScrollingLogic$busyReceive$2) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        androidx.compose.foundation.gestures.MouseWheelScrollingLogic$busyReceive$2 mouseWheelScrollingLogic$busyReceive$2 = new androidx.compose.foundation.gestures.MouseWheelScrollingLogic$busyReceive$2(this.Camera2StreamConfigurationMap, continuation);
        mouseWheelScrollingLogic$busyReceive$2.getHighSpeedVideoFpsRanges = obj;
        return mouseWheelScrollingLogic$busyReceive$2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MouseWheelScrollingLogic$busyReceive$2(kotlinx.coroutines.channels.Channel<androidx.compose.foundation.gestures.MouseWheelScrollingLogic.MouseWheelScrollDelta> channel, kotlin.coroutines.Continuation<? super androidx.compose.foundation.gestures.MouseWheelScrollingLogic$busyReceive$2> continuation) {
        super(2, continuation);
        this.Camera2StreamConfigurationMap = channel;
    }
}
