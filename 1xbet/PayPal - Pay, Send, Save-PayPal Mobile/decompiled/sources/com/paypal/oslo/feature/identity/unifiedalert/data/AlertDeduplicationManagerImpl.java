package com.paypal.oslo.feature.identity.unifiedalert.data;

@javax.inject.Singleton
@kotlin.Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0096@¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010H\u0096@¢\u0006\u0004\b\u0011\u0010\u0012J(\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u0016H\u0096@¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0010H\u0096@¢\u0006\u0004\b\u001a\u0010\u0012J\u0010\u0010\u001c\u001a\u00020\u001bH\u0096@¢\u0006\u0004\b\u001c\u0010\u0012J\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0013H\u0080@¢\u0006\u0004\b\u001d\u0010\u0012R\u0014\u0010 \u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010\u001e\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R*\u0010&\u001a\u00020$2\u0006\u0010%\u001a\u00020$8\u0001@BX\u0080\u000e¢\u0006\u0012\n\u0004\b&\u0010'\u0012\u0004\b*\u0010+\u001a\u0004\b(\u0010)"}, d2 = {"Lcom/paypal/oslo/feature/identity/unifiedalert/data/AlertDeduplicationManagerImpl;", "Lcom/paypal/oslo/feature/identity/unifiedalert/domain/AlertDeduplicationManager;", "Lcom/paypal/oslo/feature/identity/unifiedalert/domain/repository/HandledAlertsRepository;", "handledAlertsRepository", "<init>", "(Lcom/paypal/oslo/feature/identity/unifiedalert/domain/repository/HandledAlertsRepository;)V", "Lcom/paypal/oslo/feature/identity/unifiedalert/domain/model/UnifiedAlertSource;", "source", "Lcom/paypal/oslo/feature/identity/unifiedalert/domain/TriggerAction;", "onTriggerReceived", "(Lcom/paypal/oslo/feature/identity/unifiedalert/domain/model/UnifiedAlertSource;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/paypal/oslo/feature/identity/unifiedalert/domain/model/UnifiedAlert;", "alert", "Lcom/paypal/oslo/feature/identity/unifiedalert/domain/FetchCompletedAction;", "onFetchCompleted", "(Lcom/paypal/oslo/feature/identity/unifiedalert/domain/model/UnifiedAlert;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "onFetchAborted", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "documentId", "userId", "", "expiresAtEpoch", "markHandled", "(Ljava/lang/String;Ljava/lang/String;JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onFlowCompleted", "", "isAlertPresenting", "currentActiveDocumentId$identity_prodRelease", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/identity/unifiedalert/domain/repository/HandledAlertsRepository;", "getHighSpeedVideoSizes", "Lkotlinx/coroutines/sync/Mutex;", "getHighSpeedVideoFpsRanges", "Lkotlinx/coroutines/sync/Mutex;", "Lcom/paypal/oslo/feature/identity/unifiedalert/data/AlertsFlowState;", "p0", "state", "Lcom/paypal/oslo/feature/identity/unifiedalert/data/AlertsFlowState;", "getState$identity_prodRelease", "()Lcom/paypal/oslo/feature/identity/unifiedalert/data/AlertsFlowState;", "getState$identity_prodRelease$annotations", "()V"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class AlertDeduplicationManagerImpl implements com.paypal.oslo.feature.identity.unifiedalert.domain.AlertDeduplicationManager {
    public static final int $stable = 8;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.identity.unifiedalert.domain.repository.HandledAlertsRepository getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final kotlinx.coroutines.sync.Mutex getHighResolutionOutputSizeshNQ4ISI;
    private com.paypal.oslo.feature.identity.unifiedalert.data.AlertsFlowState state;

    public static /* synthetic */ void getState$identity_prodRelease$annotations() {
    }

    @javax.inject.Inject
    public AlertDeduplicationManagerImpl(com.paypal.oslo.feature.identity.unifiedalert.domain.repository.HandledAlertsRepository handledAlertsRepository) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(handledAlertsRepository, "");
        this.getHighSpeedVideoSizes = handledAlertsRepository;
        this.getHighResolutionOutputSizeshNQ4ISI = kotlinx.coroutines.sync.MutexKt.Mutex$default(false, 1, null);
        this.state = com.paypal.oslo.feature.identity.unifiedalert.data.AlertsFlowState.Idle.INSTANCE;
    }

    /* renamed from: getState$identity_prodRelease, reason: from getter */
    public final com.paypal.oslo.feature.identity.unifiedalert.data.AlertsFlowState getState() {
        return this.state;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x005b A[Catch: all -> 0x00b9, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x00b9, blocks: (B:11:0x0054, B:14:0x005b, B:20:0x006d, B:22:0x0071, B:24:0x007c, B:25:0x0093, B:28:0x009c, B:29:0x00b3, B:30:0x00b8), top: B:10:0x0054 }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // com.paypal.oslo.feature.identity.unifiedalert.domain.AlertDeduplicationManager
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object onTriggerReceived(com.paypal.oslo.feature.identity.unifiedalert.domain.model.UnifiedAlertSource unifiedAlertSource, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.identity.unifiedalert.domain.TriggerAction> continuation) {
        com.paypal.oslo.feature.identity.unifiedalert.data.AlertDeduplicationManagerImpl$onTriggerReceived$1 alertDeduplicationManagerImpl$onTriggerReceived$1;
        int i;
        kotlinx.coroutines.sync.Mutex mutex;
        com.paypal.oslo.feature.identity.unifiedalert.data.AlertsFlowState alertsFlowState;
        com.paypal.oslo.feature.identity.unifiedalert.domain.TriggerAction.Fetch fetch;
        try {
            if (continuation instanceof com.paypal.oslo.feature.identity.unifiedalert.data.AlertDeduplicationManagerImpl$onTriggerReceived$1) {
                alertDeduplicationManagerImpl$onTriggerReceived$1 = (com.paypal.oslo.feature.identity.unifiedalert.data.AlertDeduplicationManagerImpl$onTriggerReceived$1) continuation;
                if ((alertDeduplicationManagerImpl$onTriggerReceived$1.getHighSpeedVideoFpsRangesFor & Integer.MIN_VALUE) != 0) {
                    alertDeduplicationManagerImpl$onTriggerReceived$1.getHighSpeedVideoFpsRangesFor -= 2147483648;
                    java.lang.Object obj = alertDeduplicationManagerImpl$onTriggerReceived$1.getHighResolutionOutputSizeshNQ4ISI;
                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = alertDeduplicationManagerImpl$onTriggerReceived$1.getHighSpeedVideoFpsRangesFor;
                    if (i != 0) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        mutex = this.getHighResolutionOutputSizeshNQ4ISI;
                        alertDeduplicationManagerImpl$onTriggerReceived$1.Camera2StreamConfigurationMap = unifiedAlertSource;
                        alertDeduplicationManagerImpl$onTriggerReceived$1.getHighSpeedVideoFpsRanges = mutex;
                        alertDeduplicationManagerImpl$onTriggerReceived$1.getHighSpeedVideoSizes = 0;
                        alertDeduplicationManagerImpl$onTriggerReceived$1.getHighSpeedVideoFpsRangesFor = 1;
                        if (mutex.lock(null, alertDeduplicationManagerImpl$onTriggerReceived$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        int i2 = alertDeduplicationManagerImpl$onTriggerReceived$1.getHighSpeedVideoSizes;
                        kotlinx.coroutines.sync.Mutex mutex2 = (kotlinx.coroutines.sync.Mutex) alertDeduplicationManagerImpl$onTriggerReceived$1.getHighSpeedVideoFpsRanges;
                        com.paypal.oslo.feature.identity.unifiedalert.domain.model.UnifiedAlertSource unifiedAlertSource2 = (com.paypal.oslo.feature.identity.unifiedalert.domain.model.UnifiedAlertSource) alertDeduplicationManagerImpl$onTriggerReceived$1.Camera2StreamConfigurationMap;
                        kotlin.ResultKt.throwOnFailure(obj);
                        mutex = mutex2;
                        unifiedAlertSource = unifiedAlertSource2;
                    }
                    alertsFlowState = this.state;
                    if (!(alertsFlowState instanceof com.paypal.oslo.feature.identity.unifiedalert.data.AlertsFlowState.Idle)) {
                        this.state = new com.paypal.oslo.feature.identity.unifiedalert.data.AlertsFlowState.Checking(unifiedAlertSource, null, 2, null);
                        fetch = com.paypal.oslo.feature.identity.unifiedalert.domain.TriggerAction.Fetch.INSTANCE;
                    } else if (alertsFlowState instanceof com.paypal.oslo.feature.identity.unifiedalert.data.AlertsFlowState.Checking) {
                        if (unifiedAlertSource == com.paypal.oslo.feature.identity.unifiedalert.domain.model.UnifiedAlertSource.DEEP_LINK && ((com.paypal.oslo.feature.identity.unifiedalert.data.AlertsFlowState.Checking) alertsFlowState).getSource() == com.paypal.oslo.feature.identity.unifiedalert.domain.model.UnifiedAlertSource.FOREGROUND) {
                            this.state = com.paypal.oslo.feature.identity.unifiedalert.data.AlertsFlowState.Checking.copy$default((com.paypal.oslo.feature.identity.unifiedalert.data.AlertsFlowState.Checking) alertsFlowState, com.paypal.oslo.feature.identity.unifiedalert.domain.model.UnifiedAlertSource.DEEP_LINK, null, 2, null);
                            com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.identity.LoggerKt.log, "PN priority upgrade: AF→DEEP_LINK while checking", null, null, 6, null);
                        }
                        fetch = com.paypal.oslo.feature.identity.unifiedalert.domain.TriggerAction.Skip.INSTANCE;
                    } else {
                        if (!(alertsFlowState instanceof com.paypal.oslo.feature.identity.unifiedalert.data.AlertsFlowState.Presenting)) {
                            throw new kotlin.NoWhenBranchMatchedException();
                        }
                        this.state = new com.paypal.oslo.feature.identity.unifiedalert.data.AlertsFlowState.Checking(unifiedAlertSource, ((com.paypal.oslo.feature.identity.unifiedalert.data.AlertsFlowState.Presenting) alertsFlowState).getDocumentId());
                        fetch = com.paypal.oslo.feature.identity.unifiedalert.domain.TriggerAction.Fetch.INSTANCE;
                    }
                    return fetch;
                }
            }
            alertsFlowState = this.state;
            if (!(alertsFlowState instanceof com.paypal.oslo.feature.identity.unifiedalert.data.AlertsFlowState.Idle)) {
            }
            return fetch;
        } finally {
            mutex.unlock(null);
        }
        alertDeduplicationManagerImpl$onTriggerReceived$1 = new com.paypal.oslo.feature.identity.unifiedalert.data.AlertDeduplicationManagerImpl$onTriggerReceived$1(this, continuation);
        java.lang.Object obj2 = alertDeduplicationManagerImpl$onTriggerReceived$1.getHighResolutionOutputSizeshNQ4ISI;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = alertDeduplicationManagerImpl$onTriggerReceived$1.getHighSpeedVideoFpsRangesFor;
        if (i != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0168 A[Catch: all -> 0x01fa, TryCatch #2 {all -> 0x01fa, blocks: (B:15:0x0162, B:17:0x0168, B:18:0x0183, B:21:0x018e, B:23:0x0196, B:25:0x019a, B:30:0x01b1, B:31:0x01bf, B:32:0x01ca, B:34:0x01d4, B:35:0x01e2, B:39:0x0155, B:44:0x0086, B:47:0x008c, B:50:0x0094, B:53:0x00a8, B:55:0x00c3, B:57:0x00cd, B:59:0x00d1, B:61:0x00e5, B:62:0x00f4), top: B:43:0x0086 }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0196 A[Catch: all -> 0x01fa, TryCatch #2 {all -> 0x01fa, blocks: (B:15:0x0162, B:17:0x0168, B:18:0x0183, B:21:0x018e, B:23:0x0196, B:25:0x019a, B:30:0x01b1, B:31:0x01bf, B:32:0x01ca, B:34:0x01d4, B:35:0x01e2, B:39:0x0155, B:44:0x0086, B:47:0x008c, B:50:0x0094, B:53:0x00a8, B:55:0x00c3, B:57:0x00cd, B:59:0x00d1, B:61:0x00e5, B:62:0x00f4), top: B:43:0x0086 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x01ca A[Catch: all -> 0x01fa, TryCatch #2 {all -> 0x01fa, blocks: (B:15:0x0162, B:17:0x0168, B:18:0x0183, B:21:0x018e, B:23:0x0196, B:25:0x019a, B:30:0x01b1, B:31:0x01bf, B:32:0x01ca, B:34:0x01d4, B:35:0x01e2, B:39:0x0155, B:44:0x0086, B:47:0x008c, B:50:0x0094, B:53:0x00a8, B:55:0x00c3, B:57:0x00cd, B:59:0x00d1, B:61:0x00e5, B:62:0x00f4), top: B:43:0x0086 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x008c A[Catch: all -> 0x01fa, TRY_ENTER, TRY_LEAVE, TryCatch #2 {all -> 0x01fa, blocks: (B:15:0x0162, B:17:0x0168, B:18:0x0183, B:21:0x018e, B:23:0x0196, B:25:0x019a, B:30:0x01b1, B:31:0x01bf, B:32:0x01ca, B:34:0x01d4, B:35:0x01e2, B:39:0x0155, B:44:0x0086, B:47:0x008c, B:50:0x0094, B:53:0x00a8, B:55:0x00c3, B:57:0x00cd, B:59:0x00d1, B:61:0x00e5, B:62:0x00f4), top: B:43:0x0086 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0094 A[Catch: all -> 0x01fa, TRY_ENTER, TryCatch #2 {all -> 0x01fa, blocks: (B:15:0x0162, B:17:0x0168, B:18:0x0183, B:21:0x018e, B:23:0x0196, B:25:0x019a, B:30:0x01b1, B:31:0x01bf, B:32:0x01ca, B:34:0x01d4, B:35:0x01e2, B:39:0x0155, B:44:0x0086, B:47:0x008c, B:50:0x0094, B:53:0x00a8, B:55:0x00c3, B:57:0x00cd, B:59:0x00d1, B:61:0x00e5, B:62:0x00f4), top: B:43:0x0086 }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00c3 A[Catch: all -> 0x01fa, TryCatch #2 {all -> 0x01fa, blocks: (B:15:0x0162, B:17:0x0168, B:18:0x0183, B:21:0x018e, B:23:0x0196, B:25:0x019a, B:30:0x01b1, B:31:0x01bf, B:32:0x01ca, B:34:0x01d4, B:35:0x01e2, B:39:0x0155, B:44:0x0086, B:47:0x008c, B:50:0x0094, B:53:0x00a8, B:55:0x00c3, B:57:0x00cd, B:59:0x00d1, B:61:0x00e5, B:62:0x00f4), top: B:43:0x0086 }] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    @Override // com.paypal.oslo.feature.identity.unifiedalert.domain.AlertDeduplicationManager
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object onFetchCompleted(com.paypal.oslo.feature.identity.unifiedalert.domain.model.UnifiedAlert unifiedAlert, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.identity.unifiedalert.domain.FetchCompletedAction> continuation) {
        com.paypal.oslo.feature.identity.unifiedalert.data.AlertDeduplicationManagerImpl$onFetchCompleted$1 alertDeduplicationManagerImpl$onFetchCompleted$1;
        int i;
        kotlinx.coroutines.sync.Mutex mutex;
        com.paypal.oslo.feature.identity.unifiedalert.domain.model.UnifiedAlert unifiedAlert2;
        int i2;
        com.paypal.oslo.feature.identity.unifiedalert.data.AlertsFlowState.Checking checking;
        com.paypal.oslo.feature.identity.unifiedalert.domain.model.UnifiedAlertSource source;
        java.lang.String previousDocumentId;
        com.paypal.oslo.feature.identity.unifiedalert.domain.model.UnifiedAlert unifiedAlert3;
        kotlinx.coroutines.sync.Mutex mutex2;
        com.paypal.oslo.feature.identity.unifiedalert.domain.model.UnifiedAlertSource unifiedAlertSource;
        java.lang.String str;
        com.paypal.oslo.feature.identity.unifiedalert.domain.FetchCompletedAction.None none;
        java.lang.Object m23436constructorimpl;
        java.lang.Throwable m23439exceptionOrNullimpl;
        try {
            if (continuation instanceof com.paypal.oslo.feature.identity.unifiedalert.data.AlertDeduplicationManagerImpl$onFetchCompleted$1) {
                alertDeduplicationManagerImpl$onFetchCompleted$1 = (com.paypal.oslo.feature.identity.unifiedalert.data.AlertDeduplicationManagerImpl$onFetchCompleted$1) continuation;
                if ((alertDeduplicationManagerImpl$onFetchCompleted$1.getInputFormats & Integer.MIN_VALUE) != 0) {
                    alertDeduplicationManagerImpl$onFetchCompleted$1.getInputFormats -= 2147483648;
                    com.paypal.oslo.feature.identity.unifiedalert.data.AlertDeduplicationManagerImpl$onFetchCompleted$1 alertDeduplicationManagerImpl$onFetchCompleted$12 = alertDeduplicationManagerImpl$onFetchCompleted$1;
                    java.lang.Object obj = alertDeduplicationManagerImpl$onFetchCompleted$12.getOutputStallDuration;
                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = alertDeduplicationManagerImpl$onFetchCompleted$12.getInputFormats;
                    if (i != 0) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        kotlinx.coroutines.sync.Mutex mutex3 = this.getHighResolutionOutputSizeshNQ4ISI;
                        alertDeduplicationManagerImpl$onFetchCompleted$12.getHighResolutionOutputSizeshNQ4ISI = unifiedAlert;
                        alertDeduplicationManagerImpl$onFetchCompleted$12.getHighSpeedVideoFpsRangesFor = mutex3;
                        alertDeduplicationManagerImpl$onFetchCompleted$12.getHighSpeedVideoSizes = 0;
                        alertDeduplicationManagerImpl$onFetchCompleted$12.getInputFormats = 1;
                        if (mutex3.lock(null, alertDeduplicationManagerImpl$onFetchCompleted$12) != coroutine_suspended) {
                            mutex = mutex3;
                            unifiedAlert2 = unifiedAlert;
                            i2 = 0;
                        }
                        return coroutine_suspended;
                    }
                    if (i != 1) {
                        if (i != 2) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        int i3 = alertDeduplicationManagerImpl$onFetchCompleted$12.Camera2StreamConfigurationMap;
                        int i4 = alertDeduplicationManagerImpl$onFetchCompleted$12.getHighSpeedVideoFpsRanges;
                        int i5 = alertDeduplicationManagerImpl$onFetchCompleted$12.getHighSpeedVideoSizes;
                        str = (java.lang.String) alertDeduplicationManagerImpl$onFetchCompleted$12.getInputSizeshNQ4ISI;
                        unifiedAlertSource = (com.paypal.oslo.feature.identity.unifiedalert.domain.model.UnifiedAlertSource) alertDeduplicationManagerImpl$onFetchCompleted$12.getOutputMinFrameDuration;
                        mutex2 = (kotlinx.coroutines.sync.Mutex) alertDeduplicationManagerImpl$onFetchCompleted$12.getHighSpeedVideoFpsRangesFor;
                        unifiedAlert3 = (com.paypal.oslo.feature.identity.unifiedalert.domain.model.UnifiedAlert) alertDeduplicationManagerImpl$onFetchCompleted$12.getHighResolutionOutputSizeshNQ4ISI;
                        try {
                            kotlin.ResultKt.throwOnFailure(obj);
                            m23436constructorimpl = kotlin.Result.m23436constructorimpl(kotlin.coroutines.jvm.internal.Boxing.boxBoolean(((java.lang.Boolean) obj).booleanValue()));
                            mutex = mutex2;
                        } catch (java.lang.Throwable th) {
                            th = th;
                            previousDocumentId = str;
                            source = unifiedAlertSource;
                            mutex = mutex2;
                            unifiedAlert2 = unifiedAlert3;
                            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                            m23436constructorimpl = kotlin.Result.m23436constructorimpl(kotlin.ResultKt.createFailure(th));
                            unifiedAlert3 = unifiedAlert2;
                            unifiedAlertSource = source;
                            str = previousDocumentId;
                            m23439exceptionOrNullimpl = kotlin.Result.m23439exceptionOrNullimpl(m23436constructorimpl);
                            if (m23439exceptionOrNullimpl != null) {
                            }
                            java.lang.Boolean boxBoolean = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(false);
                            if (kotlin.Result.m23441isFailureimpl(m23436constructorimpl)) {
                            }
                            if (((java.lang.Boolean) m23436constructorimpl).booleanValue()) {
                            }
                            return none;
                        }
                        m23439exceptionOrNullimpl = kotlin.Result.m23439exceptionOrNullimpl(m23436constructorimpl);
                        if (m23439exceptionOrNullimpl != null) {
                            com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.identity.LoggerKt.log, "Failed to check handled state for alert", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("error", m23439exceptionOrNullimpl.toString())), null, 4, null);
                        }
                        java.lang.Boolean boxBoolean2 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(false);
                        if (kotlin.Result.m23441isFailureimpl(m23436constructorimpl)) {
                            m23436constructorimpl = boxBoolean2;
                        }
                        if (((java.lang.Boolean) m23436constructorimpl).booleanValue()) {
                            if (kotlin.jvm.internal.Intrinsics.areEqual(unifiedAlert3.getDocumentId(), str)) {
                                this.state = new com.paypal.oslo.feature.identity.unifiedalert.data.AlertsFlowState.Presenting(str, unifiedAlertSource);
                                none = com.paypal.oslo.feature.identity.unifiedalert.domain.FetchCompletedAction.None.INSTANCE;
                            } else {
                                this.state = new com.paypal.oslo.feature.identity.unifiedalert.data.AlertsFlowState.Presenting(unifiedAlert3.getDocumentId(), unifiedAlertSource);
                                none = new com.paypal.oslo.feature.identity.unifiedalert.domain.FetchCompletedAction.ShowAlert(unifiedAlert3, unifiedAlertSource);
                            }
                        } else if (unifiedAlertSource == com.paypal.oslo.feature.identity.unifiedalert.domain.model.UnifiedAlertSource.DEEP_LINK) {
                            this.state = new com.paypal.oslo.feature.identity.unifiedalert.data.AlertsFlowState.Presenting(unifiedAlert3.getDocumentId(), unifiedAlertSource);
                            none = new com.paypal.oslo.feature.identity.unifiedalert.domain.FetchCompletedAction.ShowNoAlertScreen(unifiedAlertSource);
                        } else if (str != null) {
                            this.state = new com.paypal.oslo.feature.identity.unifiedalert.data.AlertsFlowState.Presenting(str, unifiedAlertSource);
                            none = com.paypal.oslo.feature.identity.unifiedalert.domain.FetchCompletedAction.None.INSTANCE;
                        } else {
                            this.state = com.paypal.oslo.feature.identity.unifiedalert.data.AlertsFlowState.Idle.INSTANCE;
                            none = com.paypal.oslo.feature.identity.unifiedalert.domain.FetchCompletedAction.None.INSTANCE;
                        }
                        return none;
                    }
                    i2 = alertDeduplicationManagerImpl$onFetchCompleted$12.getHighSpeedVideoSizes;
                    kotlinx.coroutines.sync.Mutex mutex4 = (kotlinx.coroutines.sync.Mutex) alertDeduplicationManagerImpl$onFetchCompleted$12.getHighSpeedVideoFpsRangesFor;
                    com.paypal.oslo.feature.identity.unifiedalert.domain.model.UnifiedAlert unifiedAlert4 = (com.paypal.oslo.feature.identity.unifiedalert.domain.model.UnifiedAlert) alertDeduplicationManagerImpl$onFetchCompleted$12.getHighResolutionOutputSizeshNQ4ISI;
                    kotlin.ResultKt.throwOnFailure(obj);
                    mutex = mutex4;
                    unifiedAlert2 = unifiedAlert4;
                    com.paypal.oslo.feature.identity.unifiedalert.data.AlertsFlowState alertsFlowState = this.state;
                    checking = !(alertsFlowState instanceof com.paypal.oslo.feature.identity.unifiedalert.data.AlertsFlowState.Checking) ? (com.paypal.oslo.feature.identity.unifiedalert.data.AlertsFlowState.Checking) alertsFlowState : null;
                    java.lang.String str2 = "";
                    if (checking != null) {
                        com.paypal.android.logger.Logger logger = com.paypal.oslo.feature.identity.LoggerKt.log;
                        java.lang.String simpleName = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(this.state.getClass()).getSimpleName();
                        if (simpleName != null) {
                            str2 = simpleName;
                        }
                        com.paypal.android.logger.Logger.i$default(logger, "onFetchCompleted called in unexpected state — ignoring", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("state_type", str2)), null, 4, null);
                        none = com.paypal.oslo.feature.identity.unifiedalert.domain.FetchCompletedAction.None.INSTANCE;
                    } else {
                        source = checking.getSource();
                        previousDocumentId = checking.getPreviousDocumentId();
                        if (unifiedAlert2 != null) {
                            try {
                                kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                                com.paypal.oslo.feature.identity.unifiedalert.data.AlertDeduplicationManagerImpl alertDeduplicationManagerImpl = this;
                                com.paypal.oslo.feature.identity.unifiedalert.domain.repository.HandledAlertsRepository handledAlertsRepository = this.getHighSpeedVideoSizes;
                                java.lang.String documentId = unifiedAlert2.getDocumentId();
                                java.lang.String userId = unifiedAlert2.getUserId();
                                long expiresAtEpoch = unifiedAlert2.getExpiresAtEpoch();
                                alertDeduplicationManagerImpl$onFetchCompleted$12.getHighResolutionOutputSizeshNQ4ISI = unifiedAlert2;
                                alertDeduplicationManagerImpl$onFetchCompleted$12.getHighSpeedVideoFpsRangesFor = mutex;
                                alertDeduplicationManagerImpl$onFetchCompleted$12.getOutputMinFrameDuration = source;
                                alertDeduplicationManagerImpl$onFetchCompleted$12.getOutputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(checking);
                                alertDeduplicationManagerImpl$onFetchCompleted$12.getInputSizeshNQ4ISI = previousDocumentId;
                                alertDeduplicationManagerImpl$onFetchCompleted$12.getHighSpeedVideoSizesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(this);
                                alertDeduplicationManagerImpl$onFetchCompleted$12.getHighSpeedVideoSizes = i2;
                                alertDeduplicationManagerImpl$onFetchCompleted$12.getHighSpeedVideoFpsRanges = 0;
                                alertDeduplicationManagerImpl$onFetchCompleted$12.Camera2StreamConfigurationMap = 0;
                                alertDeduplicationManagerImpl$onFetchCompleted$12.getInputFormats = 2;
                                obj = handledAlertsRepository.isHandled(documentId, userId, expiresAtEpoch, alertDeduplicationManagerImpl$onFetchCompleted$12);
                            } catch (java.lang.Throwable th2) {
                                th = th2;
                                kotlin.Result.Companion companion3 = kotlin.Result.INSTANCE;
                                m23436constructorimpl = kotlin.Result.m23436constructorimpl(kotlin.ResultKt.createFailure(th));
                                unifiedAlert3 = unifiedAlert2;
                                unifiedAlertSource = source;
                                str = previousDocumentId;
                                m23439exceptionOrNullimpl = kotlin.Result.m23439exceptionOrNullimpl(m23436constructorimpl);
                                if (m23439exceptionOrNullimpl != null) {
                                }
                                java.lang.Boolean boxBoolean22 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(false);
                                if (kotlin.Result.m23441isFailureimpl(m23436constructorimpl)) {
                                }
                                if (((java.lang.Boolean) m23436constructorimpl).booleanValue()) {
                                }
                                return none;
                            }
                            if (obj != coroutine_suspended) {
                                unifiedAlert3 = unifiedAlert2;
                                mutex2 = mutex;
                                unifiedAlertSource = source;
                                str = previousDocumentId;
                                m23436constructorimpl = kotlin.Result.m23436constructorimpl(kotlin.coroutines.jvm.internal.Boxing.boxBoolean(((java.lang.Boolean) obj).booleanValue()));
                                mutex = mutex2;
                                m23439exceptionOrNullimpl = kotlin.Result.m23439exceptionOrNullimpl(m23436constructorimpl);
                                if (m23439exceptionOrNullimpl != null) {
                                }
                                java.lang.Boolean boxBoolean222 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(false);
                                if (kotlin.Result.m23441isFailureimpl(m23436constructorimpl)) {
                                }
                                if (((java.lang.Boolean) m23436constructorimpl).booleanValue()) {
                                }
                            }
                            return coroutine_suspended;
                        }
                        if (source == com.paypal.oslo.feature.identity.unifiedalert.domain.model.UnifiedAlertSource.DEEP_LINK) {
                            this.state = new com.paypal.oslo.feature.identity.unifiedalert.data.AlertsFlowState.Presenting("", source);
                            none = new com.paypal.oslo.feature.identity.unifiedalert.domain.FetchCompletedAction.ShowNoAlertScreen(source);
                        } else if (previousDocumentId != null) {
                            this.state = new com.paypal.oslo.feature.identity.unifiedalert.data.AlertsFlowState.Presenting(previousDocumentId, source);
                            none = com.paypal.oslo.feature.identity.unifiedalert.domain.FetchCompletedAction.None.INSTANCE;
                        } else {
                            this.state = com.paypal.oslo.feature.identity.unifiedalert.data.AlertsFlowState.Idle.INSTANCE;
                            none = com.paypal.oslo.feature.identity.unifiedalert.domain.FetchCompletedAction.None.INSTANCE;
                        }
                    }
                    return none;
                }
            }
            com.paypal.oslo.feature.identity.unifiedalert.data.AlertsFlowState alertsFlowState2 = this.state;
            if (!(alertsFlowState2 instanceof com.paypal.oslo.feature.identity.unifiedalert.data.AlertsFlowState.Checking)) {
            }
            java.lang.String str22 = "";
            if (checking != null) {
            }
            return none;
        } finally {
            mutex.unlock(null);
        }
        alertDeduplicationManagerImpl$onFetchCompleted$1 = new com.paypal.oslo.feature.identity.unifiedalert.data.AlertDeduplicationManagerImpl$onFetchCompleted$1(this, continuation);
        com.paypal.oslo.feature.identity.unifiedalert.data.AlertDeduplicationManagerImpl$onFetchCompleted$1 alertDeduplicationManagerImpl$onFetchCompleted$122 = alertDeduplicationManagerImpl$onFetchCompleted$1;
        java.lang.Object obj2 = alertDeduplicationManagerImpl$onFetchCompleted$122.getOutputStallDuration;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = alertDeduplicationManagerImpl$onFetchCompleted$122.getInputFormats;
        if (i != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0053 A[Catch: all -> 0x007a, TryCatch #0 {all -> 0x007a, blocks: (B:11:0x004d, B:13:0x0053, B:15:0x0059, B:17:0x005f, B:18:0x0070, B:19:0x006b, B:20:0x0072), top: B:10:0x004d }] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0059 A[Catch: all -> 0x007a, TryCatch #0 {all -> 0x007a, blocks: (B:11:0x004d, B:13:0x0053, B:15:0x0059, B:17:0x005f, B:18:0x0070, B:19:0x006b, B:20:0x0072), top: B:10:0x004d }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // com.paypal.oslo.feature.identity.unifiedalert.domain.AlertDeduplicationManager
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object onFetchAborted(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        com.paypal.oslo.feature.identity.unifiedalert.data.AlertDeduplicationManagerImpl$onFetchAborted$1 alertDeduplicationManagerImpl$onFetchAborted$1;
        int i;
        kotlinx.coroutines.sync.Mutex mutex;
        com.paypal.oslo.feature.identity.unifiedalert.data.AlertsFlowState.Checking checking;
        com.paypal.oslo.feature.identity.unifiedalert.data.AlertsFlowState.Idle idle;
        try {
            if (continuation instanceof com.paypal.oslo.feature.identity.unifiedalert.data.AlertDeduplicationManagerImpl$onFetchAborted$1) {
                alertDeduplicationManagerImpl$onFetchAborted$1 = (com.paypal.oslo.feature.identity.unifiedalert.data.AlertDeduplicationManagerImpl$onFetchAborted$1) continuation;
                if ((alertDeduplicationManagerImpl$onFetchAborted$1.getHighSpeedVideoFpsRangesFor & Integer.MIN_VALUE) != 0) {
                    alertDeduplicationManagerImpl$onFetchAborted$1.getHighSpeedVideoFpsRangesFor -= 2147483648;
                    java.lang.Object obj = alertDeduplicationManagerImpl$onFetchAborted$1.Camera2StreamConfigurationMap;
                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = alertDeduplicationManagerImpl$onFetchAborted$1.getHighSpeedVideoFpsRangesFor;
                    if (i != 0) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        kotlinx.coroutines.sync.Mutex mutex2 = this.getHighResolutionOutputSizeshNQ4ISI;
                        alertDeduplicationManagerImpl$onFetchAborted$1.getHighSpeedVideoSizes = mutex2;
                        alertDeduplicationManagerImpl$onFetchAborted$1.getHighResolutionOutputSizeshNQ4ISI = 0;
                        alertDeduplicationManagerImpl$onFetchAborted$1.getHighSpeedVideoFpsRangesFor = 1;
                        if (mutex2.lock(null, alertDeduplicationManagerImpl$onFetchAborted$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        mutex = mutex2;
                    } else {
                        if (i != 1) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        int i2 = alertDeduplicationManagerImpl$onFetchAborted$1.getHighResolutionOutputSizeshNQ4ISI;
                        mutex = (kotlinx.coroutines.sync.Mutex) alertDeduplicationManagerImpl$onFetchAborted$1.getHighSpeedVideoSizes;
                        kotlin.ResultKt.throwOnFailure(obj);
                    }
                    com.paypal.oslo.feature.identity.unifiedalert.data.AlertsFlowState alertsFlowState = this.state;
                    checking = !(alertsFlowState instanceof com.paypal.oslo.feature.identity.unifiedalert.data.AlertsFlowState.Checking) ? (com.paypal.oslo.feature.identity.unifiedalert.data.AlertsFlowState.Checking) alertsFlowState : null;
                    if (checking != null) {
                        java.lang.String previousDocumentId = checking.getPreviousDocumentId();
                        if (previousDocumentId != null) {
                            idle = new com.paypal.oslo.feature.identity.unifiedalert.data.AlertsFlowState.Presenting(previousDocumentId, checking.getSource());
                        } else {
                            idle = com.paypal.oslo.feature.identity.unifiedalert.data.AlertsFlowState.Idle.INSTANCE;
                        }
                        this.state = idle;
                    }
                    kotlin.Unit unit = kotlin.Unit.INSTANCE;
                    mutex.unlock(null);
                    return kotlin.Unit.INSTANCE;
                }
            }
            com.paypal.oslo.feature.identity.unifiedalert.data.AlertsFlowState alertsFlowState2 = this.state;
            if (!(alertsFlowState2 instanceof com.paypal.oslo.feature.identity.unifiedalert.data.AlertsFlowState.Checking)) {
            }
            if (checking != null) {
            }
            kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
            mutex.unlock(null);
            return kotlin.Unit.INSTANCE;
        } catch (java.lang.Throwable th) {
            mutex.unlock(null);
            throw th;
        }
        alertDeduplicationManagerImpl$onFetchAborted$1 = new com.paypal.oslo.feature.identity.unifiedalert.data.AlertDeduplicationManagerImpl$onFetchAborted$1(this, continuation);
        java.lang.Object obj2 = alertDeduplicationManagerImpl$onFetchAborted$1.Camera2StreamConfigurationMap;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = alertDeduplicationManagerImpl$onFetchAborted$1.getHighSpeedVideoFpsRangesFor;
        if (i != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x00a7 A[Catch: all -> 0x0043, TRY_ENTER, TryCatch #0 {all -> 0x0043, blocks: (B:12:0x003e, B:13:0x00a1, B:16:0x00a7, B:18:0x00ad, B:19:0x00b3, B:21:0x00b9, B:22:0x00bf), top: B:11:0x003e }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00ad A[Catch: all -> 0x0043, TryCatch #0 {all -> 0x0043, blocks: (B:12:0x003e, B:13:0x00a1, B:16:0x00a7, B:18:0x00ad, B:19:0x00b3, B:21:0x00b9, B:22:0x00bf), top: B:11:0x003e }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00b9 A[Catch: all -> 0x0043, TryCatch #0 {all -> 0x0043, blocks: (B:12:0x003e, B:13:0x00a1, B:16:0x00a7, B:18:0x00ad, B:19:0x00b3, B:21:0x00b9, B:22:0x00bf), top: B:11:0x003e }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    @Override // com.paypal.oslo.feature.identity.unifiedalert.domain.AlertDeduplicationManager
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object markHandled(java.lang.String str, java.lang.String str2, long j, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        com.paypal.oslo.feature.identity.unifiedalert.data.AlertDeduplicationManagerImpl$markHandled$1 alertDeduplicationManagerImpl$markHandled$1;
        com.paypal.oslo.feature.identity.unifiedalert.data.AlertDeduplicationManagerImpl$markHandled$1 alertDeduplicationManagerImpl$markHandled$12;
        java.lang.Object coroutine_suspended;
        int i;
        java.lang.String str3;
        kotlinx.coroutines.sync.Mutex mutex;
        long j2;
        int i2;
        com.paypal.oslo.feature.identity.unifiedalert.domain.repository.HandledAlertsRepository handledAlertsRepository;
        java.lang.String str4;
        kotlinx.coroutines.sync.Mutex mutex2;
        com.paypal.oslo.feature.identity.unifiedalert.data.AlertsFlowState.Presenting presenting;
        try {
            if (continuation instanceof com.paypal.oslo.feature.identity.unifiedalert.data.AlertDeduplicationManagerImpl$markHandled$1) {
                alertDeduplicationManagerImpl$markHandled$1 = (com.paypal.oslo.feature.identity.unifiedalert.data.AlertDeduplicationManagerImpl$markHandled$1) continuation;
                if ((alertDeduplicationManagerImpl$markHandled$1.getInputSizeshNQ4ISI & Integer.MIN_VALUE) != 0) {
                    alertDeduplicationManagerImpl$markHandled$1.getInputSizeshNQ4ISI -= 2147483648;
                    alertDeduplicationManagerImpl$markHandled$12 = alertDeduplicationManagerImpl$markHandled$1;
                    java.lang.Object obj = alertDeduplicationManagerImpl$markHandled$12.getOutputFormats;
                    coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = alertDeduplicationManagerImpl$markHandled$12.getInputSizeshNQ4ISI;
                    if (i != 0) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        kotlinx.coroutines.sync.Mutex mutex3 = this.getHighResolutionOutputSizeshNQ4ISI;
                        alertDeduplicationManagerImpl$markHandled$12.getHighSpeedVideoSizes = str;
                        alertDeduplicationManagerImpl$markHandled$12.getHighSpeedVideoFpsRangesFor = str2;
                        alertDeduplicationManagerImpl$markHandled$12.getInputFormats = mutex3;
                        alertDeduplicationManagerImpl$markHandled$12.getHighResolutionOutputSizeshNQ4ISI = j;
                        alertDeduplicationManagerImpl$markHandled$12.Camera2StreamConfigurationMap = 0;
                        alertDeduplicationManagerImpl$markHandled$12.getInputSizeshNQ4ISI = 1;
                        if (mutex3.lock(null, alertDeduplicationManagerImpl$markHandled$12) != coroutine_suspended) {
                            str3 = str2;
                            mutex = mutex3;
                            j2 = j;
                            i2 = 0;
                        }
                        return coroutine_suspended;
                    }
                    if (i != 1) {
                        if (i != 2) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        int i3 = alertDeduplicationManagerImpl$markHandled$12.getHighSpeedVideoFpsRanges;
                        int i4 = alertDeduplicationManagerImpl$markHandled$12.Camera2StreamConfigurationMap;
                        long j3 = alertDeduplicationManagerImpl$markHandled$12.getHighResolutionOutputSizeshNQ4ISI;
                        mutex2 = (kotlinx.coroutines.sync.Mutex) alertDeduplicationManagerImpl$markHandled$12.getInputFormats;
                        str4 = (java.lang.String) alertDeduplicationManagerImpl$markHandled$12.getHighSpeedVideoSizes;
                        try {
                            kotlin.ResultKt.throwOnFailure(obj);
                            com.paypal.oslo.feature.identity.unifiedalert.data.AlertsFlowState alertsFlowState = this.state;
                            presenting = !(alertsFlowState instanceof com.paypal.oslo.feature.identity.unifiedalert.data.AlertsFlowState.Presenting) ? (com.paypal.oslo.feature.identity.unifiedalert.data.AlertsFlowState.Presenting) alertsFlowState : null;
                            if (kotlin.jvm.internal.Intrinsics.areEqual(presenting == null ? presenting.getDocumentId() : null, str4)) {
                                this.state = com.paypal.oslo.feature.identity.unifiedalert.data.AlertsFlowState.Idle.INSTANCE;
                            }
                            kotlin.Unit unit = kotlin.Unit.INSTANCE;
                            mutex2.unlock(null);
                            return kotlin.Unit.INSTANCE;
                        } catch (java.lang.Throwable th) {
                            mutex = mutex2;
                            th = th;
                            mutex.unlock(null);
                            throw th;
                        }
                    }
                    int i5 = alertDeduplicationManagerImpl$markHandled$12.Camera2StreamConfigurationMap;
                    long j4 = alertDeduplicationManagerImpl$markHandled$12.getHighResolutionOutputSizeshNQ4ISI;
                    mutex = (kotlinx.coroutines.sync.Mutex) alertDeduplicationManagerImpl$markHandled$12.getInputFormats;
                    java.lang.String str5 = (java.lang.String) alertDeduplicationManagerImpl$markHandled$12.getHighSpeedVideoFpsRangesFor;
                    java.lang.String str6 = (java.lang.String) alertDeduplicationManagerImpl$markHandled$12.getHighSpeedVideoSizes;
                    kotlin.ResultKt.throwOnFailure(obj);
                    j2 = j4;
                    i2 = i5;
                    str = str6;
                    str3 = str5;
                    handledAlertsRepository = this.getHighSpeedVideoSizes;
                    alertDeduplicationManagerImpl$markHandled$12.getHighSpeedVideoSizes = str;
                    alertDeduplicationManagerImpl$markHandled$12.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str3);
                    alertDeduplicationManagerImpl$markHandled$12.getInputFormats = mutex;
                    alertDeduplicationManagerImpl$markHandled$12.getHighResolutionOutputSizeshNQ4ISI = j2;
                    alertDeduplicationManagerImpl$markHandled$12.Camera2StreamConfigurationMap = i2;
                    alertDeduplicationManagerImpl$markHandled$12.getHighSpeedVideoFpsRanges = 0;
                    alertDeduplicationManagerImpl$markHandled$12.getInputSizeshNQ4ISI = 2;
                    if (handledAlertsRepository.addHandledAlert(str, str3, j2, alertDeduplicationManagerImpl$markHandled$12) != coroutine_suspended) {
                        kotlinx.coroutines.sync.Mutex mutex4 = mutex;
                        str4 = str;
                        mutex2 = mutex4;
                        com.paypal.oslo.feature.identity.unifiedalert.data.AlertsFlowState alertsFlowState2 = this.state;
                        if (!(alertsFlowState2 instanceof com.paypal.oslo.feature.identity.unifiedalert.data.AlertsFlowState.Presenting)) {
                        }
                        if (kotlin.jvm.internal.Intrinsics.areEqual(presenting == null ? presenting.getDocumentId() : null, str4)) {
                        }
                        kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
                        mutex2.unlock(null);
                        return kotlin.Unit.INSTANCE;
                    }
                    return coroutine_suspended;
                }
            }
            handledAlertsRepository = this.getHighSpeedVideoSizes;
            alertDeduplicationManagerImpl$markHandled$12.getHighSpeedVideoSizes = str;
            alertDeduplicationManagerImpl$markHandled$12.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str3);
            alertDeduplicationManagerImpl$markHandled$12.getInputFormats = mutex;
            alertDeduplicationManagerImpl$markHandled$12.getHighResolutionOutputSizeshNQ4ISI = j2;
            alertDeduplicationManagerImpl$markHandled$12.Camera2StreamConfigurationMap = i2;
            alertDeduplicationManagerImpl$markHandled$12.getHighSpeedVideoFpsRanges = 0;
            alertDeduplicationManagerImpl$markHandled$12.getInputSizeshNQ4ISI = 2;
            if (handledAlertsRepository.addHandledAlert(str, str3, j2, alertDeduplicationManagerImpl$markHandled$12) != coroutine_suspended) {
            }
            return coroutine_suspended;
        } catch (java.lang.Throwable th2) {
            th = th2;
            mutex.unlock(null);
            throw th;
        }
        alertDeduplicationManagerImpl$markHandled$1 = new com.paypal.oslo.feature.identity.unifiedalert.data.AlertDeduplicationManagerImpl$markHandled$1(this, continuation);
        alertDeduplicationManagerImpl$markHandled$12 = alertDeduplicationManagerImpl$markHandled$1;
        java.lang.Object obj2 = alertDeduplicationManagerImpl$markHandled$12.getOutputFormats;
        coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = alertDeduplicationManagerImpl$markHandled$12.getInputSizeshNQ4ISI;
        if (i != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0053 A[Catch: all -> 0x0061, TryCatch #0 {all -> 0x0061, blocks: (B:11:0x004d, B:13:0x0053, B:14:0x0059), top: B:10:0x004d }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // com.paypal.oslo.feature.identity.unifiedalert.domain.AlertDeduplicationManager
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object onFlowCompleted(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        com.paypal.oslo.feature.identity.unifiedalert.data.AlertDeduplicationManagerImpl$onFlowCompleted$1 alertDeduplicationManagerImpl$onFlowCompleted$1;
        int i;
        kotlinx.coroutines.sync.Mutex mutex;
        try {
            if (continuation instanceof com.paypal.oslo.feature.identity.unifiedalert.data.AlertDeduplicationManagerImpl$onFlowCompleted$1) {
                alertDeduplicationManagerImpl$onFlowCompleted$1 = (com.paypal.oslo.feature.identity.unifiedalert.data.AlertDeduplicationManagerImpl$onFlowCompleted$1) continuation;
                if ((alertDeduplicationManagerImpl$onFlowCompleted$1.Camera2StreamConfigurationMap & Integer.MIN_VALUE) != 0) {
                    alertDeduplicationManagerImpl$onFlowCompleted$1.Camera2StreamConfigurationMap -= 2147483648;
                    java.lang.Object obj = alertDeduplicationManagerImpl$onFlowCompleted$1.getHighSpeedVideoSizes;
                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = alertDeduplicationManagerImpl$onFlowCompleted$1.Camera2StreamConfigurationMap;
                    if (i != 0) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        kotlinx.coroutines.sync.Mutex mutex2 = this.getHighResolutionOutputSizeshNQ4ISI;
                        alertDeduplicationManagerImpl$onFlowCompleted$1.getHighSpeedVideoFpsRanges = mutex2;
                        alertDeduplicationManagerImpl$onFlowCompleted$1.getHighSpeedVideoFpsRangesFor = 0;
                        alertDeduplicationManagerImpl$onFlowCompleted$1.Camera2StreamConfigurationMap = 1;
                        if (mutex2.lock(null, alertDeduplicationManagerImpl$onFlowCompleted$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        mutex = mutex2;
                    } else {
                        if (i != 1) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        int i2 = alertDeduplicationManagerImpl$onFlowCompleted$1.getHighSpeedVideoFpsRangesFor;
                        mutex = (kotlinx.coroutines.sync.Mutex) alertDeduplicationManagerImpl$onFlowCompleted$1.getHighSpeedVideoFpsRanges;
                        kotlin.ResultKt.throwOnFailure(obj);
                    }
                    if (this.state instanceof com.paypal.oslo.feature.identity.unifiedalert.data.AlertsFlowState.Presenting) {
                        this.state = com.paypal.oslo.feature.identity.unifiedalert.data.AlertsFlowState.Idle.INSTANCE;
                    }
                    kotlin.Unit unit = kotlin.Unit.INSTANCE;
                    mutex.unlock(null);
                    return kotlin.Unit.INSTANCE;
                }
            }
            if (this.state instanceof com.paypal.oslo.feature.identity.unifiedalert.data.AlertsFlowState.Presenting) {
            }
            kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
            mutex.unlock(null);
            return kotlin.Unit.INSTANCE;
        } catch (java.lang.Throwable th) {
            mutex.unlock(null);
            throw th;
        }
        alertDeduplicationManagerImpl$onFlowCompleted$1 = new com.paypal.oslo.feature.identity.unifiedalert.data.AlertDeduplicationManagerImpl$onFlowCompleted$1(this, continuation);
        java.lang.Object obj2 = alertDeduplicationManagerImpl$onFlowCompleted$1.getHighSpeedVideoSizes;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = alertDeduplicationManagerImpl$onFlowCompleted$1.Camera2StreamConfigurationMap;
        if (i != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // com.paypal.oslo.feature.identity.unifiedalert.domain.AlertDeduplicationManager
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object isAlertPresenting(kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation) {
        com.paypal.oslo.feature.identity.unifiedalert.data.AlertDeduplicationManagerImpl$isAlertPresenting$1 alertDeduplicationManagerImpl$isAlertPresenting$1;
        int i;
        kotlinx.coroutines.sync.Mutex mutex;
        try {
            if (continuation instanceof com.paypal.oslo.feature.identity.unifiedalert.data.AlertDeduplicationManagerImpl$isAlertPresenting$1) {
                alertDeduplicationManagerImpl$isAlertPresenting$1 = (com.paypal.oslo.feature.identity.unifiedalert.data.AlertDeduplicationManagerImpl$isAlertPresenting$1) continuation;
                if ((alertDeduplicationManagerImpl$isAlertPresenting$1.getHighSpeedVideoFpsRangesFor & Integer.MIN_VALUE) != 0) {
                    alertDeduplicationManagerImpl$isAlertPresenting$1.getHighSpeedVideoFpsRangesFor -= 2147483648;
                    java.lang.Object obj = alertDeduplicationManagerImpl$isAlertPresenting$1.getHighSpeedVideoSizes;
                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = alertDeduplicationManagerImpl$isAlertPresenting$1.getHighSpeedVideoFpsRangesFor;
                    if (i != 0) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        kotlinx.coroutines.sync.Mutex mutex2 = this.getHighResolutionOutputSizeshNQ4ISI;
                        alertDeduplicationManagerImpl$isAlertPresenting$1.Camera2StreamConfigurationMap = mutex2;
                        alertDeduplicationManagerImpl$isAlertPresenting$1.getHighSpeedVideoFpsRanges = 0;
                        alertDeduplicationManagerImpl$isAlertPresenting$1.getHighSpeedVideoFpsRangesFor = 1;
                        if (mutex2.lock(null, alertDeduplicationManagerImpl$isAlertPresenting$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        mutex = mutex2;
                    } else {
                        if (i != 1) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        int i2 = alertDeduplicationManagerImpl$isAlertPresenting$1.getHighSpeedVideoFpsRanges;
                        mutex = (kotlinx.coroutines.sync.Mutex) alertDeduplicationManagerImpl$isAlertPresenting$1.Camera2StreamConfigurationMap;
                        kotlin.ResultKt.throwOnFailure(obj);
                    }
                    return kotlin.coroutines.jvm.internal.Boxing.boxBoolean(this.state instanceof com.paypal.oslo.feature.identity.unifiedalert.data.AlertsFlowState.Presenting);
                }
            }
            return kotlin.coroutines.jvm.internal.Boxing.boxBoolean(this.state instanceof com.paypal.oslo.feature.identity.unifiedalert.data.AlertsFlowState.Presenting);
        } finally {
            mutex.unlock(null);
        }
        alertDeduplicationManagerImpl$isAlertPresenting$1 = new com.paypal.oslo.feature.identity.unifiedalert.data.AlertDeduplicationManagerImpl$isAlertPresenting$1(this, continuation);
        java.lang.Object obj2 = alertDeduplicationManagerImpl$isAlertPresenting$1.getHighSpeedVideoSizes;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = alertDeduplicationManagerImpl$isAlertPresenting$1.getHighSpeedVideoFpsRangesFor;
        if (i != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0053 A[Catch: all -> 0x0063, TryCatch #0 {all -> 0x0063, blocks: (B:11:0x004d, B:13:0x0053, B:15:0x0059), top: B:10:0x004d }] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0059 A[Catch: all -> 0x0063, TRY_LEAVE, TryCatch #0 {all -> 0x0063, blocks: (B:11:0x004d, B:13:0x0053, B:15:0x0059), top: B:10:0x004d }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object currentActiveDocumentId$identity_prodRelease(kotlin.coroutines.Continuation<? super java.lang.String> continuation) {
        com.paypal.oslo.feature.identity.unifiedalert.data.AlertDeduplicationManagerImpl$currentActiveDocumentId$1 alertDeduplicationManagerImpl$currentActiveDocumentId$1;
        int i;
        kotlinx.coroutines.sync.Mutex mutex;
        try {
            if (continuation instanceof com.paypal.oslo.feature.identity.unifiedalert.data.AlertDeduplicationManagerImpl$currentActiveDocumentId$1) {
                alertDeduplicationManagerImpl$currentActiveDocumentId$1 = (com.paypal.oslo.feature.identity.unifiedalert.data.AlertDeduplicationManagerImpl$currentActiveDocumentId$1) continuation;
                if ((alertDeduplicationManagerImpl$currentActiveDocumentId$1.getHighResolutionOutputSizeshNQ4ISI & Integer.MIN_VALUE) != 0) {
                    alertDeduplicationManagerImpl$currentActiveDocumentId$1.getHighResolutionOutputSizeshNQ4ISI -= 2147483648;
                    java.lang.Object obj = alertDeduplicationManagerImpl$currentActiveDocumentId$1.getHighSpeedVideoFpsRanges;
                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = alertDeduplicationManagerImpl$currentActiveDocumentId$1.getHighResolutionOutputSizeshNQ4ISI;
                    if (i != 0) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        kotlinx.coroutines.sync.Mutex mutex2 = this.getHighResolutionOutputSizeshNQ4ISI;
                        alertDeduplicationManagerImpl$currentActiveDocumentId$1.getHighSpeedVideoSizes = mutex2;
                        alertDeduplicationManagerImpl$currentActiveDocumentId$1.getHighSpeedVideoFpsRangesFor = 0;
                        alertDeduplicationManagerImpl$currentActiveDocumentId$1.getHighResolutionOutputSizeshNQ4ISI = 1;
                        if (mutex2.lock(null, alertDeduplicationManagerImpl$currentActiveDocumentId$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        mutex = mutex2;
                    } else {
                        if (i != 1) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        int i2 = alertDeduplicationManagerImpl$currentActiveDocumentId$1.getHighSpeedVideoFpsRangesFor;
                        mutex = (kotlinx.coroutines.sync.Mutex) alertDeduplicationManagerImpl$currentActiveDocumentId$1.getHighSpeedVideoSizes;
                        kotlin.ResultKt.throwOnFailure(obj);
                    }
                    com.paypal.oslo.feature.identity.unifiedalert.data.AlertsFlowState alertsFlowState = this.state;
                    com.paypal.oslo.feature.identity.unifiedalert.data.AlertsFlowState.Presenting presenting = !(alertsFlowState instanceof com.paypal.oslo.feature.identity.unifiedalert.data.AlertsFlowState.Presenting) ? (com.paypal.oslo.feature.identity.unifiedalert.data.AlertsFlowState.Presenting) alertsFlowState : null;
                    return presenting == null ? presenting.getDocumentId() : null;
                }
            }
            com.paypal.oslo.feature.identity.unifiedalert.data.AlertsFlowState alertsFlowState2 = this.state;
            if (!(alertsFlowState2 instanceof com.paypal.oslo.feature.identity.unifiedalert.data.AlertsFlowState.Presenting)) {
            }
            return presenting == null ? presenting.getDocumentId() : null;
        } finally {
            mutex.unlock(null);
        }
        alertDeduplicationManagerImpl$currentActiveDocumentId$1 = new com.paypal.oslo.feature.identity.unifiedalert.data.AlertDeduplicationManagerImpl$currentActiveDocumentId$1(this, continuation);
        java.lang.Object obj2 = alertDeduplicationManagerImpl$currentActiveDocumentId$1.getHighSpeedVideoFpsRanges;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = alertDeduplicationManagerImpl$currentActiveDocumentId$1.getHighResolutionOutputSizeshNQ4ISI;
        if (i != 0) {
        }
    }
}
