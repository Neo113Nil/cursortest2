package com.zettle.sdk.core.workers;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0000\u0018\u0000 \u00132\u00020\u00012\u00020\u0002:\u0001\u0013B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0013\u0010\n\u001a\u00020\tH\u0096@ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u0012\u001a\u00020\u000f8WX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011\u0082\u0002\u0004\n\u0002\b\u0019"}, d2 = {"Lcom/zettle/sdk/core/workers/AnalyticsWorker;", "Landroidx/work/CoroutineWorker;", "Lcom/zettle/sdk/core/log/Loggable;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "workerParams", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "Landroidx/work/ListenableWorker$Result;", "doWork", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighSpeedVideoFpsRangesFor", "Landroid/content/Context;", "getHighSpeedVideoSizes", "", "getLogTag", "()Ljava/lang/String;", "logTag", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class AnalyticsWorker extends androidx.work.CoroutineWorker implements com.zettle.sdk.core.log.Loggable {
    public static final java.lang.String ANALYTICS_WORKER_TAG = "zettle.worker.analytics";
    public static final java.lang.String DEBUG_KEY = "zettle.analytics.debug";
    public static final long TIMEOUT = 60000;
    private final /* synthetic */ com.zettle.sdk.core.log.Loggable getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final android.content.Context getHighSpeedVideoSizes;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnalyticsWorker(android.content.Context context, androidx.work.WorkerParameters workerParameters) {
        super(context, workerParameters);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(workerParameters, "");
        this.getHighSpeedVideoSizes = context;
        this.getHighSpeedVideoFpsRanges = com.zettle.sdk.core.log.LogKt.loggable$default("AnalyticsWorker", null, 2, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // androidx.work.CoroutineWorker
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object doWork(kotlin.coroutines.Continuation<? super androidx.work.ListenableWorker.Result> continuation) {
        com.zettle.sdk.core.workers.AnalyticsWorker$doWork$1 analyticsWorker$doWork$1;
        int i;
        com.zettle.sdk.commons.state.StateObserver<com.zettle.sdk.analytics.AnalyticsManager.State> stateObserver;
        com.zettle.sdk.analytics.AnalyticsManager analyticsManager;
        boolean booleanValue;
        if (continuation instanceof com.zettle.sdk.core.workers.AnalyticsWorker$doWork$1) {
            analyticsWorker$doWork$1 = (com.zettle.sdk.core.workers.AnalyticsWorker$doWork$1) continuation;
            if ((analyticsWorker$doWork$1.getHighSpeedVideoFpsRanges & Integer.MIN_VALUE) != 0) {
                analyticsWorker$doWork$1.getHighSpeedVideoFpsRanges -= 2147483648;
                java.lang.Object obj = analyticsWorker$doWork$1.getHighSpeedVideoFpsRangesFor;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = analyticsWorker$doWork$1.getHighSpeedVideoFpsRanges;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.zettle.sdk.core.log.LogKt.log(this, "Send pending analytics");
                    final com.zettle.sdk.analytics.AnalyticsManager companion = com.zettle.sdk.analytics.AnalyticsManager.INSTANCE.getInstance(this.getHighSpeedVideoSizes, getInputData().getBoolean(DEBUG_KEY, false));
                    final kotlin.jvm.internal.Ref.BooleanRef booleanRef = new kotlin.jvm.internal.Ref.BooleanRef();
                    final kotlinx.coroutines.CompletableDeferred CompletableDeferred$default = kotlinx.coroutines.CompletableDeferredKt.CompletableDeferred$default(null, 1, null);
                    com.zettle.sdk.commons.state.StateObserver<com.zettle.sdk.analytics.AnalyticsManager.State> stateObserver2 = new com.zettle.sdk.commons.state.StateObserver<com.zettle.sdk.analytics.AnalyticsManager.State>() { // from class: com.zettle.sdk.core.workers.AnalyticsWorker$doWork$$inlined$stateObserver$1
                        @Override // com.zettle.sdk.commons.state.StateObserver
                        public final void onNext(com.zettle.sdk.analytics.AnalyticsManager.State state) {
                            boolean z = state instanceof com.zettle.sdk.analytics.AnalyticsManager.State.Ready;
                            if (z && !kotlin.jvm.internal.Ref.BooleanRef.this.element) {
                                companion.startDispatching();
                            }
                            if (z && kotlin.jvm.internal.Ref.BooleanRef.this.element) {
                                CompletableDeferred$default.complete(java.lang.Boolean.TRUE);
                            }
                            kotlin.jvm.internal.Ref.BooleanRef.this.element = true;
                        }
                    };
                    com.zettle.sdk.core.workers.AnalyticsWorker$doWork$result$1 analyticsWorker$doWork$result$1 = new com.zettle.sdk.core.workers.AnalyticsWorker$doWork$result$1(companion, stateObserver2, CompletableDeferred$default, this, null);
                    analyticsWorker$doWork$1.getHighResolutionOutputSizeshNQ4ISI = companion;
                    analyticsWorker$doWork$1.getHighSpeedVideoSizes = stateObserver2;
                    analyticsWorker$doWork$1.getHighSpeedVideoFpsRanges = 1;
                    java.lang.Object withTimeoutOrNull = kotlinx.coroutines.TimeoutKt.withTimeoutOrNull(60000L, analyticsWorker$doWork$result$1, analyticsWorker$doWork$1);
                    if (withTimeoutOrNull == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    stateObserver = stateObserver2;
                    analyticsManager = companion;
                    obj = withTimeoutOrNull;
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    stateObserver = (com.zettle.sdk.commons.state.StateObserver) analyticsWorker$doWork$1.getHighSpeedVideoSizes;
                    analyticsManager = (com.zettle.sdk.analytics.AnalyticsManager) analyticsWorker$doWork$1.getHighResolutionOutputSizeshNQ4ISI;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                java.lang.Boolean bool = (java.lang.Boolean) obj;
                booleanValue = bool != null ? bool.booleanValue() : false;
                analyticsManager.getState().removeObserver(stateObserver);
                if (!booleanValue) {
                    androidx.work.ListenableWorker.Result success = androidx.work.ListenableWorker.Result.success();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(success, "");
                    return success;
                }
                androidx.work.ListenableWorker.Result retry = androidx.work.ListenableWorker.Result.retry();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(retry, "");
                return retry;
            }
        }
        analyticsWorker$doWork$1 = new com.zettle.sdk.core.workers.AnalyticsWorker$doWork$1(this, continuation);
        java.lang.Object obj2 = analyticsWorker$doWork$1.getHighSpeedVideoFpsRangesFor;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = analyticsWorker$doWork$1.getHighSpeedVideoFpsRanges;
        if (i != 0) {
        }
        java.lang.Boolean bool2 = (java.lang.Boolean) obj2;
        if (bool2 != null) {
        }
        analyticsManager.getState().removeObserver(stateObserver);
        if (!booleanValue) {
        }
    }

    @Override // com.zettle.sdk.core.log.Loggable
    /* renamed from: getLogTag */
    public final java.lang.String getGetHighSpeedVideoFpsRangesFor() {
        return this.getHighSpeedVideoFpsRanges.getGetHighSpeedVideoFpsRangesFor();
    }
}
