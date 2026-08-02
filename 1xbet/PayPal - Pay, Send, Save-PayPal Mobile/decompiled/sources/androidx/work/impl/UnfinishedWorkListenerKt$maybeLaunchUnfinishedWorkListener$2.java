package androidx.work.impl;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "hasUnfinishedWork", ""}, k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.work.impl.UnfinishedWorkListenerKt$maybeLaunchUnfinishedWorkListener$2", f = "UnfinishedWorkListener.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class UnfinishedWorkListenerKt$maybeLaunchUnfinishedWorkListener$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<java.lang.Boolean, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    /* synthetic */ boolean getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ android.content.Context getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.getHighSpeedVideoSizes != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        androidx.work.impl.utils.PackageManagerHelper.setComponentEnabled(this.getHighSpeedVideoFpsRangesFor, androidx.work.impl.background.systemalarm.RescheduleReceiver.class, this.getHighResolutionOutputSizeshNQ4ISI);
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(java.lang.Boolean bool, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((androidx.work.impl.UnfinishedWorkListenerKt$maybeLaunchUnfinishedWorkListener$2) create(java.lang.Boolean.valueOf(bool.booleanValue()), continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        androidx.work.impl.UnfinishedWorkListenerKt$maybeLaunchUnfinishedWorkListener$2 unfinishedWorkListenerKt$maybeLaunchUnfinishedWorkListener$2 = new androidx.work.impl.UnfinishedWorkListenerKt$maybeLaunchUnfinishedWorkListener$2(this.getHighSpeedVideoFpsRangesFor, continuation);
        unfinishedWorkListenerKt$maybeLaunchUnfinishedWorkListener$2.getHighResolutionOutputSizeshNQ4ISI = ((java.lang.Boolean) obj).booleanValue();
        return unfinishedWorkListenerKt$maybeLaunchUnfinishedWorkListener$2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    UnfinishedWorkListenerKt$maybeLaunchUnfinishedWorkListener$2(android.content.Context context, kotlin.coroutines.Continuation<? super androidx.work.impl.UnfinishedWorkListenerKt$maybeLaunchUnfinishedWorkListener$2> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRangesFor = context;
    }
}
