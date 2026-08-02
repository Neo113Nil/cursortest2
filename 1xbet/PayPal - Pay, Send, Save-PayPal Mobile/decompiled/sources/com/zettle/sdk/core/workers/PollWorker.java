package com.zettle.sdk.core.workers;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0000\u0018\u0000 \u00102\u00020\u00012\u00020\u0002:\u0001\u0010B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0013\u0010\n\u001a\u00020\tH\u0096@ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u000f\u001a\u00020\f8WX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e\u0082\u0002\u0004\n\u0002\b\u0019"}, d2 = {"Lcom/zettle/sdk/core/workers/PollWorker;", "Landroidx/work/CoroutineWorker;", "Lcom/zettle/sdk/core/log/Loggable;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "workerParams", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "Landroidx/work/ListenableWorker$Result;", "doWork", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "getLogTag", "()Ljava/lang/String;", "logTag", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class PollWorker extends androidx.work.CoroutineWorker implements com.zettle.sdk.core.log.Loggable {
    public static final java.lang.String POOL_WORKER_TAG = "zettle.worker.poll";
    private final /* synthetic */ com.zettle.sdk.core.log.Loggable Camera2StreamConfigurationMap;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PollWorker(android.content.Context context, androidx.work.WorkerParameters workerParameters) {
        super(context, workerParameters);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(workerParameters, "");
        this.Camera2StreamConfigurationMap = com.zettle.sdk.core.log.LogKt.loggable$default("PeriodicWorker", null, 2, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // androidx.work.CoroutineWorker
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object doWork(kotlin.coroutines.Continuation<? super androidx.work.ListenableWorker.Result> continuation) {
        com.zettle.sdk.core.workers.PollWorker$doWork$1 pollWorker$doWork$1;
        int i;
        if (continuation instanceof com.zettle.sdk.core.workers.PollWorker$doWork$1) {
            pollWorker$doWork$1 = (com.zettle.sdk.core.workers.PollWorker$doWork$1) continuation;
            if ((pollWorker$doWork$1.getHighSpeedVideoSizes & Integer.MIN_VALUE) != 0) {
                pollWorker$doWork$1.getHighSpeedVideoSizes -= 2147483648;
                java.lang.Object obj = pollWorker$doWork$1.getHighResolutionOutputSizeshNQ4ISI;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = pollWorker$doWork$1.getHighSpeedVideoSizes;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.zettle.sdk.core.log.LogKt.log(this, "Refreshing auth");
                    com.zettle.sdk.ZettleSDKImpl zettleSDKImpl = com.zettle.sdk.ZettleSDKImpl.INSTANCE;
                    pollWorker$doWork$1.getHighSpeedVideoSizes = 1;
                    if (zettleSDKImpl.refresh$core_publicRelease(pollWorker$doWork$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                androidx.work.ListenableWorker.Result success = androidx.work.ListenableWorker.Result.success();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(success, "");
                return success;
            }
        }
        pollWorker$doWork$1 = new com.zettle.sdk.core.workers.PollWorker$doWork$1(this, continuation);
        java.lang.Object obj2 = pollWorker$doWork$1.getHighResolutionOutputSizeshNQ4ISI;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = pollWorker$doWork$1.getHighSpeedVideoSizes;
        if (i != 0) {
        }
        androidx.work.ListenableWorker.Result success2 = androidx.work.ListenableWorker.Result.success();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(success2, "");
        return success2;
    }

    @Override // com.zettle.sdk.core.log.Loggable
    /* renamed from: getLogTag */
    public final java.lang.String getGetHighSpeedVideoFpsRangesFor() {
        return this.Camera2StreamConfigurationMap.getGetHighSpeedVideoFpsRangesFor();
    }
}
