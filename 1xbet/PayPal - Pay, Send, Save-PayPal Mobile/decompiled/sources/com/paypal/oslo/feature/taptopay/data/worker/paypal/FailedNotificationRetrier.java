package com.paypal.oslo.feature.taptopay.data.worker.paypal;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0012\b\u0000\u0018\u00002\u00020\u0001BA\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012H\u0086B¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u001a\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0018\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u001bR\u0014\u0010\u001c\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001f\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001eR\u0014\u0010!\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010$\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/data/worker/paypal/FailedNotificationRetrier;", "", "Lcom/paypal/oslo/feature/taptopay/data/worker/paypal/BackgroundSyncWorkerScheduler;", "workerScheduler", "Lkotlinx/coroutines/CoroutineDispatcher;", "dispatcher", "Lcom/paypal/oslo/feature/taptopay/data/repository/paypal/card/worker/store/AddCardStore;", "addCardStore", "Lcom/paypal/oslo/feature/taptopay/data/repository/paypal/card/worker/store/DeleteCardStore;", "deleteCardStore", "Lcom/paypal/oslo/feature/taptopay/data/repository/paypal/card/worker/store/ResumeCardStore;", "resumeCardStore", "Lcom/paypal/oslo/feature/taptopay/data/repository/paypal/card/worker/store/SuspendCardStore;", "suspendCardStore", "Lcom/paypal/oslo/feature/taptopay/data/repository/paypal/card/worker/store/UpdateCardStore;", "updateCardStore", "<init>", "(Lcom/paypal/oslo/feature/taptopay/data/worker/paypal/BackgroundSyncWorkerScheduler;Lkotlinx/coroutines/CoroutineDispatcher;Lcom/paypal/oslo/feature/taptopay/data/repository/paypal/card/worker/store/AddCardStore;Lcom/paypal/oslo/feature/taptopay/data/repository/paypal/card/worker/store/DeleteCardStore;Lcom/paypal/oslo/feature/taptopay/data/repository/paypal/card/worker/store/ResumeCardStore;Lcom/paypal/oslo/feature/taptopay/data/repository/paypal/card/worker/store/SuspendCardStore;Lcom/paypal/oslo/feature/taptopay/data/repository/paypal/card/worker/store/UpdateCardStore;)V", "", "invoke", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getOutputFormats", "Lcom/paypal/oslo/feature/taptopay/data/worker/paypal/BackgroundSyncWorkerScheduler;", "getHighSpeedVideoSizes", "Camera2StreamConfigurationMap", "Lkotlinx/coroutines/CoroutineDispatcher;", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/feature/taptopay/data/repository/paypal/card/worker/store/AddCardStore;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/taptopay/data/repository/paypal/card/worker/store/DeleteCardStore;", "Lcom/paypal/oslo/feature/taptopay/data/repository/paypal/card/worker/store/ResumeCardStore;", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/feature/taptopay/data/repository/paypal/card/worker/store/SuspendCardStore;", "getInputFormats", "getOutputMinFrameDuration", "Lcom/paypal/oslo/feature/taptopay/data/repository/paypal/card/worker/store/UpdateCardStore;", "getInputSizeshNQ4ISI"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class FailedNotificationRetrier {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final kotlinx.coroutines.CoroutineDispatcher getHighSpeedVideoFpsRanges;
    private final com.paypal.oslo.feature.taptopay.data.repository.paypal.card.worker.store.DeleteCardStore getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.taptopay.data.repository.paypal.card.worker.store.ResumeCardStore getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.taptopay.data.repository.paypal.card.worker.store.SuspendCardStore getInputFormats;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.taptopay.data.repository.paypal.card.worker.store.AddCardStore Camera2StreamConfigurationMap;

    /* renamed from: getOutputFormats, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.taptopay.data.worker.paypal.BackgroundSyncWorkerScheduler getHighSpeedVideoSizes;

    /* renamed from: getOutputMinFrameDuration, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.taptopay.data.repository.paypal.card.worker.store.UpdateCardStore getInputSizeshNQ4ISI;

    @javax.inject.Inject
    public FailedNotificationRetrier(com.paypal.oslo.feature.taptopay.data.worker.paypal.BackgroundSyncWorkerScheduler backgroundSyncWorkerScheduler, kotlinx.coroutines.CoroutineDispatcher coroutineDispatcher, com.paypal.oslo.feature.taptopay.data.repository.paypal.card.worker.store.AddCardStore addCardStore, com.paypal.oslo.feature.taptopay.data.repository.paypal.card.worker.store.DeleteCardStore deleteCardStore, com.paypal.oslo.feature.taptopay.data.repository.paypal.card.worker.store.ResumeCardStore resumeCardStore, com.paypal.oslo.feature.taptopay.data.repository.paypal.card.worker.store.SuspendCardStore suspendCardStore, com.paypal.oslo.feature.taptopay.data.repository.paypal.card.worker.store.UpdateCardStore updateCardStore) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(backgroundSyncWorkerScheduler, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(addCardStore, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deleteCardStore, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(resumeCardStore, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(suspendCardStore, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(updateCardStore, "");
        this.getHighSpeedVideoSizes = backgroundSyncWorkerScheduler;
        this.getHighSpeedVideoFpsRanges = coroutineDispatcher;
        this.Camera2StreamConfigurationMap = addCardStore;
        this.getHighResolutionOutputSizeshNQ4ISI = deleteCardStore;
        this.getHighSpeedVideoFpsRangesFor = resumeCardStore;
        this.getInputFormats = suspendCardStore;
        this.getInputSizeshNQ4ISI = updateCardStore;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ java.lang.Object access$retryAddCardNotifications(com.paypal.oslo.feature.taptopay.data.worker.paypal.FailedNotificationRetrier failedNotificationRetrier, kotlin.coroutines.Continuation continuation) {
        com.paypal.oslo.feature.taptopay.data.worker.paypal.FailedNotificationRetrier$retryAddCardNotifications$1 failedNotificationRetrier$retryAddCardNotifications$1;
        int i;
        if (continuation instanceof com.paypal.oslo.feature.taptopay.data.worker.paypal.FailedNotificationRetrier$retryAddCardNotifications$1) {
            failedNotificationRetrier$retryAddCardNotifications$1 = (com.paypal.oslo.feature.taptopay.data.worker.paypal.FailedNotificationRetrier$retryAddCardNotifications$1) continuation;
            if ((failedNotificationRetrier$retryAddCardNotifications$1.getHighResolutionOutputSizeshNQ4ISI & Integer.MIN_VALUE) != 0) {
                failedNotificationRetrier$retryAddCardNotifications$1.getHighResolutionOutputSizeshNQ4ISI -= 2147483648;
                java.lang.Object obj = failedNotificationRetrier$retryAddCardNotifications$1.getHighSpeedVideoFpsRanges;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = failedNotificationRetrier$retryAddCardNotifications$1.getHighResolutionOutputSizeshNQ4ISI;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.feature.taptopay.data.repository.paypal.card.worker.store.AddCardStore addCardStore = failedNotificationRetrier.Camera2StreamConfigurationMap;
                    failedNotificationRetrier$retryAddCardNotifications$1.getHighResolutionOutputSizeshNQ4ISI = 1;
                    obj = addCardStore.read(true, failedNotificationRetrier$retryAddCardNotifications$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                for (com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardIdGroup cardIdGroup : (java.lang.Iterable) obj) {
                    com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "Triggering notify add worker", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("cardIdGroup", cardIdGroup)), null, 4, null);
                    com.paypal.oslo.feature.taptopay.data.worker.paypal.BackgroundSyncWorkerScheduler backgroundSyncWorkerScheduler = failedNotificationRetrier.getHighSpeedVideoSizes;
                    androidx.work.Data workData = com.paypal.oslo.feature.taptopay.data.repository.paypal.card.worker.ExtensionsKt.toWorkData(cardIdGroup);
                    com.paypal.android.logger.Logger.i$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "New worker enqueue request received", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("worker", "NotifyCardAddedWorker")), null, 4, null);
                    androidx.work.OneTimeWorkRequest.Builder builder = new androidx.work.OneTimeWorkRequest.Builder((java.lang.Class<? extends androidx.work.ListenableWorker>) com.paypal.oslo.feature.taptopay.data.repository.paypal.card.worker.NotifyCardAddedWorker.class);
                    if (workData != null) {
                        builder.setInputData(workData);
                    }
                    builder.addTag(com.paypal.oslo.feature.taptopay.data.worker.paypal.BackgroundSyncWorkerScheduler.TAG_BACKGROUND_SYNC_WORK);
                    builder.setConstraints(backgroundSyncWorkerScheduler.getHighSpeedVideoSizes);
                    builder.setBackoffCriteria(androidx.work.BackoffPolicy.EXPONENTIAL, 30L, java.util.concurrent.TimeUnit.SECONDS);
                    backgroundSyncWorkerScheduler.getHighSpeedVideoFpsRanges.enqueue(builder.build());
                }
                return kotlin.Unit.INSTANCE;
            }
        }
        failedNotificationRetrier$retryAddCardNotifications$1 = new com.paypal.oslo.feature.taptopay.data.worker.paypal.FailedNotificationRetrier$retryAddCardNotifications$1(failedNotificationRetrier, continuation);
        java.lang.Object obj2 = failedNotificationRetrier$retryAddCardNotifications$1.getHighSpeedVideoFpsRanges;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = failedNotificationRetrier$retryAddCardNotifications$1.getHighResolutionOutputSizeshNQ4ISI;
        if (i != 0) {
        }
        while (r9.hasNext()) {
        }
        return kotlin.Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ java.lang.Object access$retryDeleteCardNotifications(com.paypal.oslo.feature.taptopay.data.worker.paypal.FailedNotificationRetrier failedNotificationRetrier, kotlin.coroutines.Continuation continuation) {
        com.paypal.oslo.feature.taptopay.data.worker.paypal.FailedNotificationRetrier$retryDeleteCardNotifications$1 failedNotificationRetrier$retryDeleteCardNotifications$1;
        int i;
        if (continuation instanceof com.paypal.oslo.feature.taptopay.data.worker.paypal.FailedNotificationRetrier$retryDeleteCardNotifications$1) {
            failedNotificationRetrier$retryDeleteCardNotifications$1 = (com.paypal.oslo.feature.taptopay.data.worker.paypal.FailedNotificationRetrier$retryDeleteCardNotifications$1) continuation;
            if ((failedNotificationRetrier$retryDeleteCardNotifications$1.getHighSpeedVideoSizes & Integer.MIN_VALUE) != 0) {
                failedNotificationRetrier$retryDeleteCardNotifications$1.getHighSpeedVideoSizes -= 2147483648;
                java.lang.Object obj = failedNotificationRetrier$retryDeleteCardNotifications$1.getHighSpeedVideoFpsRangesFor;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = failedNotificationRetrier$retryDeleteCardNotifications$1.getHighSpeedVideoSizes;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.feature.taptopay.data.repository.paypal.card.worker.store.DeleteCardStore deleteCardStore = failedNotificationRetrier.getHighResolutionOutputSizeshNQ4ISI;
                    failedNotificationRetrier$retryDeleteCardNotifications$1.getHighSpeedVideoSizes = 1;
                    obj = deleteCardStore.read(true, failedNotificationRetrier$retryDeleteCardNotifications$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                for (com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardId.DeviceWalletServiceCardId deviceWalletServiceCardId : (java.lang.Iterable) obj) {
                    com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "Triggering notify delete worker", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("deviceWalletServiceId", deviceWalletServiceCardId)), null, 4, null);
                    com.paypal.oslo.feature.taptopay.data.worker.paypal.BackgroundSyncWorkerScheduler backgroundSyncWorkerScheduler = failedNotificationRetrier.getHighSpeedVideoSizes;
                    androidx.work.Data workData = com.paypal.oslo.feature.taptopay.data.repository.paypal.card.worker.ExtensionsKt.toWorkData(deviceWalletServiceCardId);
                    com.paypal.android.logger.Logger.i$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "New worker enqueue request received", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("worker", "NotifyCardDeletedWorker")), null, 4, null);
                    androidx.work.OneTimeWorkRequest.Builder builder = new androidx.work.OneTimeWorkRequest.Builder((java.lang.Class<? extends androidx.work.ListenableWorker>) com.paypal.oslo.feature.taptopay.data.repository.paypal.card.worker.NotifyCardDeletedWorker.class);
                    if (workData != null) {
                        builder.setInputData(workData);
                    }
                    builder.addTag(com.paypal.oslo.feature.taptopay.data.worker.paypal.BackgroundSyncWorkerScheduler.TAG_BACKGROUND_SYNC_WORK);
                    builder.setConstraints(backgroundSyncWorkerScheduler.getHighSpeedVideoSizes);
                    builder.setBackoffCriteria(androidx.work.BackoffPolicy.EXPONENTIAL, 30L, java.util.concurrent.TimeUnit.SECONDS);
                    backgroundSyncWorkerScheduler.getHighSpeedVideoFpsRanges.enqueue(builder.build());
                }
                return kotlin.Unit.INSTANCE;
            }
        }
        failedNotificationRetrier$retryDeleteCardNotifications$1 = new com.paypal.oslo.feature.taptopay.data.worker.paypal.FailedNotificationRetrier$retryDeleteCardNotifications$1(failedNotificationRetrier, continuation);
        java.lang.Object obj2 = failedNotificationRetrier$retryDeleteCardNotifications$1.getHighSpeedVideoFpsRangesFor;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = failedNotificationRetrier$retryDeleteCardNotifications$1.getHighSpeedVideoSizes;
        if (i != 0) {
        }
        while (r9.hasNext()) {
        }
        return kotlin.Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ java.lang.Object access$retryResumeCardNotifications(com.paypal.oslo.feature.taptopay.data.worker.paypal.FailedNotificationRetrier failedNotificationRetrier, kotlin.coroutines.Continuation continuation) {
        com.paypal.oslo.feature.taptopay.data.worker.paypal.FailedNotificationRetrier$retryResumeCardNotifications$1 failedNotificationRetrier$retryResumeCardNotifications$1;
        int i;
        if (continuation instanceof com.paypal.oslo.feature.taptopay.data.worker.paypal.FailedNotificationRetrier$retryResumeCardNotifications$1) {
            failedNotificationRetrier$retryResumeCardNotifications$1 = (com.paypal.oslo.feature.taptopay.data.worker.paypal.FailedNotificationRetrier$retryResumeCardNotifications$1) continuation;
            if ((failedNotificationRetrier$retryResumeCardNotifications$1.getHighSpeedVideoFpsRanges & Integer.MIN_VALUE) != 0) {
                failedNotificationRetrier$retryResumeCardNotifications$1.getHighSpeedVideoFpsRanges -= 2147483648;
                java.lang.Object obj = failedNotificationRetrier$retryResumeCardNotifications$1.Camera2StreamConfigurationMap;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = failedNotificationRetrier$retryResumeCardNotifications$1.getHighSpeedVideoFpsRanges;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.feature.taptopay.data.repository.paypal.card.worker.store.ResumeCardStore resumeCardStore = failedNotificationRetrier.getHighSpeedVideoFpsRangesFor;
                    failedNotificationRetrier$retryResumeCardNotifications$1.getHighSpeedVideoFpsRanges = 1;
                    obj = resumeCardStore.read(true, failedNotificationRetrier$retryResumeCardNotifications$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                for (com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardId.DeviceWalletServiceCardId deviceWalletServiceCardId : (java.lang.Iterable) obj) {
                    com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "Triggering notify resume worker", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("deviceWalletServiceId", deviceWalletServiceCardId)), null, 4, null);
                    com.paypal.oslo.feature.taptopay.data.worker.paypal.BackgroundSyncWorkerScheduler backgroundSyncWorkerScheduler = failedNotificationRetrier.getHighSpeedVideoSizes;
                    androidx.work.Data workData = com.paypal.oslo.feature.taptopay.data.repository.paypal.card.worker.ExtensionsKt.toWorkData(deviceWalletServiceCardId);
                    com.paypal.android.logger.Logger.i$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "New worker enqueue request received", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("worker", "NotifyCardResumedWorker")), null, 4, null);
                    androidx.work.OneTimeWorkRequest.Builder builder = new androidx.work.OneTimeWorkRequest.Builder((java.lang.Class<? extends androidx.work.ListenableWorker>) com.paypal.oslo.feature.taptopay.data.repository.paypal.card.worker.NotifyCardResumedWorker.class);
                    if (workData != null) {
                        builder.setInputData(workData);
                    }
                    builder.addTag(com.paypal.oslo.feature.taptopay.data.worker.paypal.BackgroundSyncWorkerScheduler.TAG_BACKGROUND_SYNC_WORK);
                    builder.setConstraints(backgroundSyncWorkerScheduler.getHighSpeedVideoSizes);
                    builder.setBackoffCriteria(androidx.work.BackoffPolicy.EXPONENTIAL, 30L, java.util.concurrent.TimeUnit.SECONDS);
                    backgroundSyncWorkerScheduler.getHighSpeedVideoFpsRanges.enqueue(builder.build());
                }
                return kotlin.Unit.INSTANCE;
            }
        }
        failedNotificationRetrier$retryResumeCardNotifications$1 = new com.paypal.oslo.feature.taptopay.data.worker.paypal.FailedNotificationRetrier$retryResumeCardNotifications$1(failedNotificationRetrier, continuation);
        java.lang.Object obj2 = failedNotificationRetrier$retryResumeCardNotifications$1.Camera2StreamConfigurationMap;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = failedNotificationRetrier$retryResumeCardNotifications$1.getHighSpeedVideoFpsRanges;
        if (i != 0) {
        }
        while (r9.hasNext()) {
        }
        return kotlin.Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ java.lang.Object access$retrySuspendCardNotifications(com.paypal.oslo.feature.taptopay.data.worker.paypal.FailedNotificationRetrier failedNotificationRetrier, kotlin.coroutines.Continuation continuation) {
        com.paypal.oslo.feature.taptopay.data.worker.paypal.FailedNotificationRetrier$retrySuspendCardNotifications$1 failedNotificationRetrier$retrySuspendCardNotifications$1;
        int i;
        if (continuation instanceof com.paypal.oslo.feature.taptopay.data.worker.paypal.FailedNotificationRetrier$retrySuspendCardNotifications$1) {
            failedNotificationRetrier$retrySuspendCardNotifications$1 = (com.paypal.oslo.feature.taptopay.data.worker.paypal.FailedNotificationRetrier$retrySuspendCardNotifications$1) continuation;
            if ((failedNotificationRetrier$retrySuspendCardNotifications$1.getHighSpeedVideoSizes & Integer.MIN_VALUE) != 0) {
                failedNotificationRetrier$retrySuspendCardNotifications$1.getHighSpeedVideoSizes -= 2147483648;
                java.lang.Object obj = failedNotificationRetrier$retrySuspendCardNotifications$1.getHighSpeedVideoFpsRanges;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = failedNotificationRetrier$retrySuspendCardNotifications$1.getHighSpeedVideoSizes;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.feature.taptopay.data.repository.paypal.card.worker.store.SuspendCardStore suspendCardStore = failedNotificationRetrier.getInputFormats;
                    failedNotificationRetrier$retrySuspendCardNotifications$1.getHighSpeedVideoSizes = 1;
                    obj = suspendCardStore.read(true, failedNotificationRetrier$retrySuspendCardNotifications$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                for (com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardId.DeviceWalletServiceCardId deviceWalletServiceCardId : (java.lang.Iterable) obj) {
                    com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "Triggering notify suspend worker", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("deviceWalletServiceId", deviceWalletServiceCardId)), null, 4, null);
                    com.paypal.oslo.feature.taptopay.data.worker.paypal.BackgroundSyncWorkerScheduler backgroundSyncWorkerScheduler = failedNotificationRetrier.getHighSpeedVideoSizes;
                    androidx.work.Data workData = com.paypal.oslo.feature.taptopay.data.repository.paypal.card.worker.ExtensionsKt.toWorkData(deviceWalletServiceCardId);
                    com.paypal.android.logger.Logger.i$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "New worker enqueue request received", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("worker", "NotifyCardSuspendedWorker")), null, 4, null);
                    androidx.work.OneTimeWorkRequest.Builder builder = new androidx.work.OneTimeWorkRequest.Builder((java.lang.Class<? extends androidx.work.ListenableWorker>) com.paypal.oslo.feature.taptopay.data.repository.paypal.card.worker.NotifyCardSuspendedWorker.class);
                    if (workData != null) {
                        builder.setInputData(workData);
                    }
                    builder.addTag(com.paypal.oslo.feature.taptopay.data.worker.paypal.BackgroundSyncWorkerScheduler.TAG_BACKGROUND_SYNC_WORK);
                    builder.setConstraints(backgroundSyncWorkerScheduler.getHighSpeedVideoSizes);
                    builder.setBackoffCriteria(androidx.work.BackoffPolicy.EXPONENTIAL, 30L, java.util.concurrent.TimeUnit.SECONDS);
                    backgroundSyncWorkerScheduler.getHighSpeedVideoFpsRanges.enqueue(builder.build());
                }
                return kotlin.Unit.INSTANCE;
            }
        }
        failedNotificationRetrier$retrySuspendCardNotifications$1 = new com.paypal.oslo.feature.taptopay.data.worker.paypal.FailedNotificationRetrier$retrySuspendCardNotifications$1(failedNotificationRetrier, continuation);
        java.lang.Object obj2 = failedNotificationRetrier$retrySuspendCardNotifications$1.getHighSpeedVideoFpsRanges;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = failedNotificationRetrier$retrySuspendCardNotifications$1.getHighSpeedVideoSizes;
        if (i != 0) {
        }
        while (r9.hasNext()) {
        }
        return kotlin.Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ java.lang.Object access$retryUpdateCardNotifications(com.paypal.oslo.feature.taptopay.data.worker.paypal.FailedNotificationRetrier failedNotificationRetrier, kotlin.coroutines.Continuation continuation) {
        com.paypal.oslo.feature.taptopay.data.worker.paypal.FailedNotificationRetrier$retryUpdateCardNotifications$1 failedNotificationRetrier$retryUpdateCardNotifications$1;
        int i;
        if (continuation instanceof com.paypal.oslo.feature.taptopay.data.worker.paypal.FailedNotificationRetrier$retryUpdateCardNotifications$1) {
            failedNotificationRetrier$retryUpdateCardNotifications$1 = (com.paypal.oslo.feature.taptopay.data.worker.paypal.FailedNotificationRetrier$retryUpdateCardNotifications$1) continuation;
            if ((failedNotificationRetrier$retryUpdateCardNotifications$1.getHighSpeedVideoFpsRangesFor & Integer.MIN_VALUE) != 0) {
                failedNotificationRetrier$retryUpdateCardNotifications$1.getHighSpeedVideoFpsRangesFor -= 2147483648;
                java.lang.Object obj = failedNotificationRetrier$retryUpdateCardNotifications$1.getHighResolutionOutputSizeshNQ4ISI;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = failedNotificationRetrier$retryUpdateCardNotifications$1.getHighSpeedVideoFpsRangesFor;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.feature.taptopay.data.repository.paypal.card.worker.store.UpdateCardStore updateCardStore = failedNotificationRetrier.getInputSizeshNQ4ISI;
                    failedNotificationRetrier$retryUpdateCardNotifications$1.getHighSpeedVideoFpsRangesFor = 1;
                    obj = updateCardStore.read(true, failedNotificationRetrier$retryUpdateCardNotifications$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                for (com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalDigitizedCard payPalDigitizedCard : (java.lang.Iterable) obj) {
                    com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "Triggering notify update worker", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("deviceWalletServiceCardId", payPalDigitizedCard.getDeviceWalletServiceCardId().getId()), kotlin.TuplesKt.to("last4", payPalDigitizedCard.getDigitizedCard().getLast4()), kotlin.TuplesKt.to("last4dpan", payPalDigitizedCard.getDigitizedCard().getLast4dpan()), kotlin.TuplesKt.to("expiry", payPalDigitizedCard.getDigitizedCard().getExpiry())), null, 4, null);
                    com.paypal.oslo.feature.taptopay.data.worker.paypal.BackgroundSyncWorkerScheduler backgroundSyncWorkerScheduler = failedNotificationRetrier.getHighSpeedVideoSizes;
                    androidx.work.Data workData = com.paypal.oslo.feature.taptopay.data.repository.paypal.card.worker.ExtensionsKt.toWorkData(payPalDigitizedCard);
                    com.paypal.android.logger.Logger.i$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "New worker enqueue request received", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("worker", "NotifyCardUpdatedWorker")), null, 4, null);
                    androidx.work.OneTimeWorkRequest.Builder builder = new androidx.work.OneTimeWorkRequest.Builder((java.lang.Class<? extends androidx.work.ListenableWorker>) com.paypal.oslo.feature.taptopay.data.repository.paypal.card.worker.NotifyCardUpdatedWorker.class);
                    if (workData != null) {
                        builder.setInputData(workData);
                    }
                    builder.addTag(com.paypal.oslo.feature.taptopay.data.worker.paypal.BackgroundSyncWorkerScheduler.TAG_BACKGROUND_SYNC_WORK);
                    builder.setConstraints(backgroundSyncWorkerScheduler.getHighSpeedVideoSizes);
                    builder.setBackoffCriteria(androidx.work.BackoffPolicy.EXPONENTIAL, 30L, java.util.concurrent.TimeUnit.SECONDS);
                    backgroundSyncWorkerScheduler.getHighSpeedVideoFpsRanges.enqueue(builder.build());
                }
                return kotlin.Unit.INSTANCE;
            }
        }
        failedNotificationRetrier$retryUpdateCardNotifications$1 = new com.paypal.oslo.feature.taptopay.data.worker.paypal.FailedNotificationRetrier$retryUpdateCardNotifications$1(failedNotificationRetrier, continuation);
        java.lang.Object obj2 = failedNotificationRetrier$retryUpdateCardNotifications$1.getHighResolutionOutputSizeshNQ4ISI;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = failedNotificationRetrier$retryUpdateCardNotifications$1.getHighSpeedVideoFpsRangesFor;
        if (i != 0) {
        }
        while (r11.hasNext()) {
        }
        return kotlin.Unit.INSTANCE;
    }

    public final java.lang.Object invoke(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "Starting FailedNotificationRetrier", null, null, 6, null);
        java.lang.Object withContext = kotlinx.coroutines.BuildersKt.withContext(this.getHighSpeedVideoFpsRanges, new com.paypal.oslo.feature.taptopay.data.worker.paypal.FailedNotificationRetrier$invoke$2(this, null), continuation);
        return withContext == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? withContext : kotlin.Unit.INSTANCE;
    }
}
