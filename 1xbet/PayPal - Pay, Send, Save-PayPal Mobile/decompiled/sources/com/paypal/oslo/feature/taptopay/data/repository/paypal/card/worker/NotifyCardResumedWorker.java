package com.paypal.oslo.feature.taptopay.data.repository.paypal.card.worker;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B5\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eH\u0096@¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0014\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0017\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/data/repository/paypal/card/worker/NotifyCardResumedWorker;", "Landroidx/work/CoroutineWorker;", "Landroid/content/Context;", "appContext", "Landroidx/work/WorkerParameters;", "workerParams", "Lcom/paypal/oslo/feature/taptopay/data/repository/paypal/card/notifier/CardResumedNotifier;", "cardResumedNotifier", "Lcom/paypal/oslo/feature/taptopay/data/repository/paypal/card/worker/ProcessNotifyResumeCardResultHandler;", "processNotifyResumeCardResultHandler", "Lkotlinx/coroutines/CoroutineDispatcher;", "dispatcher", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;Lcom/paypal/oslo/feature/taptopay/data/repository/paypal/card/notifier/CardResumedNotifier;Lcom/paypal/oslo/feature/taptopay/data/repository/paypal/card/worker/ProcessNotifyResumeCardResultHandler;Lkotlinx/coroutines/CoroutineDispatcher;)V", "Landroidx/work/ListenableWorker$Result;", "doWork", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/feature/taptopay/data/repository/paypal/card/notifier/CardResumedNotifier;", "getHighResolutionOutputSizeshNQ4ISI", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/feature/taptopay/data/repository/paypal/card/worker/ProcessNotifyResumeCardResultHandler;", "Lkotlinx/coroutines/CoroutineDispatcher;", "getHighSpeedVideoSizes"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class NotifyCardResumedWorker extends androidx.work.CoroutineWorker {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.taptopay.data.repository.paypal.card.notifier.CardResumedNotifier getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final kotlinx.coroutines.CoroutineDispatcher getHighSpeedVideoSizes;
    private final com.paypal.oslo.feature.taptopay.data.repository.paypal.card.worker.ProcessNotifyResumeCardResultHandler getHighSpeedVideoFpsRanges;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @dagger.assisted.AssistedInject
    public NotifyCardResumedWorker(@dagger.assisted.Assisted android.content.Context context, @dagger.assisted.Assisted androidx.work.WorkerParameters workerParameters, com.paypal.oslo.feature.taptopay.data.repository.paypal.card.notifier.CardResumedNotifier cardResumedNotifier, com.paypal.oslo.feature.taptopay.data.repository.paypal.card.worker.ProcessNotifyResumeCardResultHandler processNotifyResumeCardResultHandler, kotlinx.coroutines.CoroutineDispatcher coroutineDispatcher) {
        super(context, workerParameters);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(workerParameters, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cardResumedNotifier, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(processNotifyResumeCardResultHandler, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.getHighResolutionOutputSizeshNQ4ISI = cardResumedNotifier;
        this.getHighSpeedVideoFpsRanges = processNotifyResumeCardResultHandler;
        this.getHighSpeedVideoSizes = coroutineDispatcher;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // androidx.work.CoroutineWorker
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object doWork(kotlin.coroutines.Continuation<? super androidx.work.ListenableWorker.Result> continuation) {
        com.paypal.oslo.feature.taptopay.data.repository.paypal.card.worker.NotifyCardResumedWorker$doWork$1 notifyCardResumedWorker$doWork$1;
        int i;
        if (continuation instanceof com.paypal.oslo.feature.taptopay.data.repository.paypal.card.worker.NotifyCardResumedWorker$doWork$1) {
            notifyCardResumedWorker$doWork$1 = (com.paypal.oslo.feature.taptopay.data.repository.paypal.card.worker.NotifyCardResumedWorker$doWork$1) continuation;
            if ((notifyCardResumedWorker$doWork$1.getHighSpeedVideoFpsRanges & Integer.MIN_VALUE) != 0) {
                notifyCardResumedWorker$doWork$1.getHighSpeedVideoFpsRanges -= 2147483648;
                java.lang.Object obj = notifyCardResumedWorker$doWork$1.getHighSpeedVideoFpsRangesFor;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = notifyCardResumedWorker$doWork$1.getHighSpeedVideoFpsRanges;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "Starting notify resume card worker", null, null, 6, null);
                    kotlinx.coroutines.CoroutineDispatcher coroutineDispatcher = this.getHighSpeedVideoSizes;
                    com.paypal.oslo.feature.taptopay.data.repository.paypal.card.worker.NotifyCardResumedWorker$doWork$2 notifyCardResumedWorker$doWork$2 = new com.paypal.oslo.feature.taptopay.data.repository.paypal.card.worker.NotifyCardResumedWorker$doWork$2(this, null);
                    notifyCardResumedWorker$doWork$1.getHighSpeedVideoFpsRanges = 1;
                    obj = kotlinx.coroutines.BuildersKt.withContext(coroutineDispatcher, notifyCardResumedWorker$doWork$2, notifyCardResumedWorker$doWork$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj, "");
                return obj;
            }
        }
        notifyCardResumedWorker$doWork$1 = new com.paypal.oslo.feature.taptopay.data.repository.paypal.card.worker.NotifyCardResumedWorker$doWork$1(this, continuation);
        java.lang.Object obj2 = notifyCardResumedWorker$doWork$1.getHighSpeedVideoFpsRangesFor;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = notifyCardResumedWorker$doWork$1.getHighSpeedVideoFpsRanges;
        if (i != 0) {
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj2, "");
        return obj2;
    }
}
