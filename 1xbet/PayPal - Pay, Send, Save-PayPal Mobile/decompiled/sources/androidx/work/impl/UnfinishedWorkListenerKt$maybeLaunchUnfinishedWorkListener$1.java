package androidx.work.impl;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\t\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00010\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", com.datadog.android.rum.internal.RumFeature.EVENT_THROWABLE_PROPERTY, "", "attempt", ""}, k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.work.impl.UnfinishedWorkListenerKt$maybeLaunchUnfinishedWorkListener$1", f = "UnfinishedWorkListener.kt", i = {}, l = {59}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class UnfinishedWorkListenerKt$maybeLaunchUnfinishedWorkListener$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function4<kotlinx.coroutines.flow.FlowCollector<? super java.lang.Boolean>, java.lang.Throwable, java.lang.Long, kotlin.coroutines.Continuation<? super java.lang.Boolean>, java.lang.Object> {
    /* synthetic */ java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    /* synthetic */ long getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.String str;
        long j;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoSizes;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            java.lang.Throwable th = (java.lang.Throwable) this.getHighResolutionOutputSizeshNQ4ISI;
            long j2 = this.getHighSpeedVideoFpsRangesFor;
            androidx.work.Logger logger = androidx.work.Logger.get();
            str = androidx.work.impl.UnfinishedWorkListenerKt.getHighSpeedVideoFpsRangesFor;
            logger.error(str, "Cannot check for unfinished work", th);
            j = androidx.work.impl.UnfinishedWorkListenerKt.getHighSpeedVideoFpsRanges;
            this.getHighSpeedVideoSizes = 1;
            if (kotlinx.coroutines.DelayKt.delay(java.lang.Math.min(j2 * 30000, j), this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return kotlin.coroutines.jvm.internal.Boxing.boxBoolean(true);
    }

    @Override // kotlin.jvm.functions.Function4
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.flow.FlowCollector<? super java.lang.Boolean> flowCollector, java.lang.Throwable th, java.lang.Long l, kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation) {
        long longValue = l.longValue();
        androidx.work.impl.UnfinishedWorkListenerKt$maybeLaunchUnfinishedWorkListener$1 unfinishedWorkListenerKt$maybeLaunchUnfinishedWorkListener$1 = new androidx.work.impl.UnfinishedWorkListenerKt$maybeLaunchUnfinishedWorkListener$1(continuation);
        unfinishedWorkListenerKt$maybeLaunchUnfinishedWorkListener$1.getHighResolutionOutputSizeshNQ4ISI = th;
        unfinishedWorkListenerKt$maybeLaunchUnfinishedWorkListener$1.getHighSpeedVideoFpsRangesFor = longValue;
        return unfinishedWorkListenerKt$maybeLaunchUnfinishedWorkListener$1.invokeSuspend(kotlin.Unit.INSTANCE);
    }

    UnfinishedWorkListenerKt$maybeLaunchUnfinishedWorkListener$1(kotlin.coroutines.Continuation<? super androidx.work.impl.UnfinishedWorkListenerKt$maybeLaunchUnfinishedWorkListener$1> continuation) {
        super(4, continuation);
    }
}
