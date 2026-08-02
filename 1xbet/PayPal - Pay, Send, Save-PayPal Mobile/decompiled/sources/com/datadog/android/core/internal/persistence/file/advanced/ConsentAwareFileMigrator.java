package com.datadog.android.core.internal.persistence.file.advanced;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\n\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ1\u0010\u0011\u001a\u00020\u00102\b\u0010\u000b\u001a\u0004\u0018\u00010\u00022\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0015\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0018\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001a\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019"}, d2 = {"Lcom/datadog/android/core/internal/persistence/file/advanced/ConsentAwareFileMigrator;", "Lcom/datadog/android/core/internal/persistence/file/advanced/DataMigrator;", "Lcom/datadog/android/privacy/TrackingConsent;", "Lcom/datadog/android/core/internal/persistence/file/FileMover;", "fileMover", "Lcom/datadog/android/api/InternalLogger;", "internalLogger", "Lcom/datadog/android/internal/time/TimeProvider;", "timeProvider", "<init>", "(Lcom/datadog/android/core/internal/persistence/file/FileMover;Lcom/datadog/android/api/InternalLogger;Lcom/datadog/android/internal/time/TimeProvider;)V", "previousState", "Lcom/datadog/android/core/internal/persistence/file/FileOrchestrator;", "previousFileOrchestrator", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.NEW_STATE_KEY, "newFileOrchestrator", "", "migrateData", "(Lcom/datadog/android/privacy/TrackingConsent;Lcom/datadog/android/core/internal/persistence/file/FileOrchestrator;Lcom/datadog/android/privacy/TrackingConsent;Lcom/datadog/android/core/internal/persistence/file/FileOrchestrator;)V", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/datadog/android/core/internal/persistence/file/FileMover;", "getHighSpeedVideoSizes", "getHighSpeedVideoFpsRanges", "Lcom/datadog/android/api/InternalLogger;", "getHighSpeedVideoFpsRangesFor", "Lcom/datadog/android/internal/time/TimeProvider;", "Camera2StreamConfigurationMap"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ConsentAwareFileMigrator implements com.datadog.android.core.internal.persistence.file.advanced.DataMigrator<com.datadog.android.privacy.TrackingConsent> {

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.datadog.android.core.internal.persistence.file.FileMover getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.datadog.android.api.InternalLogger getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.datadog.android.internal.time.TimeProvider Camera2StreamConfigurationMap;

    public ConsentAwareFileMigrator(com.datadog.android.core.internal.persistence.file.FileMover fileMover, com.datadog.android.api.InternalLogger internalLogger, com.datadog.android.internal.time.TimeProvider timeProvider) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fileMover, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(internalLogger, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(timeProvider, "");
        this.getHighSpeedVideoSizes = fileMover;
        this.getHighSpeedVideoFpsRangesFor = internalLogger;
        this.Camera2StreamConfigurationMap = timeProvider;
    }

    @Override // com.datadog.android.core.internal.persistence.file.advanced.DataMigrator
    public final void migrateData(final com.datadog.android.privacy.TrackingConsent previousState, com.datadog.android.core.internal.persistence.file.FileOrchestrator previousFileOrchestrator, final com.datadog.android.privacy.TrackingConsent newState, com.datadog.android.core.internal.persistence.file.FileOrchestrator newFileOrchestrator) {
        com.datadog.android.core.internal.persistence.file.advanced.WipeDataMigrationOperation wipeDataMigrationOperation;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(previousFileOrchestrator, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(newState, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(newFileOrchestrator, "");
        kotlin.Pair pair = kotlin.TuplesKt.to(previousState, newState);
        if (kotlin.jvm.internal.Intrinsics.areEqual(pair, kotlin.TuplesKt.to(null, com.datadog.android.privacy.TrackingConsent.PENDING)) || kotlin.jvm.internal.Intrinsics.areEqual(pair, kotlin.TuplesKt.to(null, com.datadog.android.privacy.TrackingConsent.GRANTED)) || kotlin.jvm.internal.Intrinsics.areEqual(pair, kotlin.TuplesKt.to(null, com.datadog.android.privacy.TrackingConsent.NOT_GRANTED)) || kotlin.jvm.internal.Intrinsics.areEqual(pair, kotlin.TuplesKt.to(com.datadog.android.privacy.TrackingConsent.PENDING, com.datadog.android.privacy.TrackingConsent.NOT_GRANTED))) {
            wipeDataMigrationOperation = new com.datadog.android.core.internal.persistence.file.advanced.WipeDataMigrationOperation(previousFileOrchestrator.getRootDir(), this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRangesFor, this.Camera2StreamConfigurationMap);
        } else if (kotlin.jvm.internal.Intrinsics.areEqual(pair, kotlin.TuplesKt.to(com.datadog.android.privacy.TrackingConsent.GRANTED, com.datadog.android.privacy.TrackingConsent.PENDING)) || kotlin.jvm.internal.Intrinsics.areEqual(pair, kotlin.TuplesKt.to(com.datadog.android.privacy.TrackingConsent.NOT_GRANTED, com.datadog.android.privacy.TrackingConsent.PENDING))) {
            wipeDataMigrationOperation = new com.datadog.android.core.internal.persistence.file.advanced.WipeDataMigrationOperation(newFileOrchestrator.getRootDir(), this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRangesFor, this.Camera2StreamConfigurationMap);
        } else if (kotlin.jvm.internal.Intrinsics.areEqual(pair, kotlin.TuplesKt.to(com.datadog.android.privacy.TrackingConsent.PENDING, com.datadog.android.privacy.TrackingConsent.GRANTED))) {
            wipeDataMigrationOperation = new com.datadog.android.core.internal.persistence.file.advanced.MoveDataMigrationOperation(previousFileOrchestrator.getRootDir(), newFileOrchestrator.getRootDir(), this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRangesFor, this.Camera2StreamConfigurationMap);
        } else {
            com.datadog.android.privacy.TrackingConsent trackingConsent = com.datadog.android.privacy.TrackingConsent.PENDING;
            if (!kotlin.jvm.internal.Intrinsics.areEqual(pair, kotlin.TuplesKt.to(trackingConsent, trackingConsent))) {
                com.datadog.android.privacy.TrackingConsent trackingConsent2 = com.datadog.android.privacy.TrackingConsent.GRANTED;
                if (!kotlin.jvm.internal.Intrinsics.areEqual(pair, kotlin.TuplesKt.to(trackingConsent2, trackingConsent2)) && !kotlin.jvm.internal.Intrinsics.areEqual(pair, kotlin.TuplesKt.to(com.datadog.android.privacy.TrackingConsent.GRANTED, com.datadog.android.privacy.TrackingConsent.NOT_GRANTED))) {
                    com.datadog.android.privacy.TrackingConsent trackingConsent3 = com.datadog.android.privacy.TrackingConsent.NOT_GRANTED;
                    if (!kotlin.jvm.internal.Intrinsics.areEqual(pair, kotlin.TuplesKt.to(trackingConsent3, trackingConsent3)) && !kotlin.jvm.internal.Intrinsics.areEqual(pair, kotlin.TuplesKt.to(com.datadog.android.privacy.TrackingConsent.NOT_GRANTED, com.datadog.android.privacy.TrackingConsent.GRANTED))) {
                        com.datadog.android.api.InternalLogger.DefaultImpls.log$default(this.getHighSpeedVideoFpsRangesFor, com.datadog.android.api.InternalLogger.Level.WARN, kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.datadog.android.api.InternalLogger.Target[]{com.datadog.android.api.InternalLogger.Target.MAINTAINER, com.datadog.android.api.InternalLogger.Target.TELEMETRY}), (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<java.lang.String>() { // from class: com.datadog.android.core.internal.persistence.file.advanced.ConsentAwareFileMigrator$resolveMigrationOperation$1
                            @Override // kotlin.jvm.functions.Function0
                            /* renamed from: getHighSpeedVideoFpsRangesFor, reason: merged with bridge method [inline-methods] */
                            public final java.lang.String invoke() {
                                com.datadog.android.privacy.TrackingConsent trackingConsent4 = com.datadog.android.privacy.TrackingConsent.this;
                                com.datadog.android.privacy.TrackingConsent trackingConsent5 = newState;
                                java.lang.StringBuilder sb = new java.lang.StringBuilder("Unexpected consent migration from ");
                                sb.append(trackingConsent4);
                                sb.append(" to ");
                                sb.append(trackingConsent5);
                                return sb.toString();
                            }

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }
                        }, (java.lang.Throwable) null, false, (java.util.Map) null, 56, (java.lang.Object) null);
                        wipeDataMigrationOperation = new com.datadog.android.core.internal.persistence.file.advanced.NoOpDataMigrationOperation();
                    }
                }
            }
            wipeDataMigrationOperation = new com.datadog.android.core.internal.persistence.file.advanced.NoOpDataMigrationOperation();
        }
        wipeDataMigrationOperation.run();
    }
}
