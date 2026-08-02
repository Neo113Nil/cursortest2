package com.datadog.android.core.internal.persistence;

@kotlin.Metadata(d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002BA\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J'\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ3\u0010\"\u001a\u001e\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\u00180\u001f\u0012\u0004\u0012\u00020\u00180\u001fj\u0002`!2\u0006\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\"\u0010#J\u001f\u0010'\u001a\u00020\u00182\u0006\u0010%\u001a\u00020$2\u0006\u0010&\u001a\u00020$H\u0016¢\u0006\u0004\b'\u0010(J\u0011\u0010*\u001a\u0004\u0018\u00010)H\u0016¢\u0006\u0004\b*\u0010+R\u0014\u0010.\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u00101\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0015\u00104\u001a\u0002028CX\u0082\u0084\u0002¢\u0006\u0006\n\u0004\b.\u00103R\u0014\u0010/\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00105R\u0014\u0010,\u001a\u0002028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00106R\u0015\u00108\u001a\u0002028CX\u0082\u0084\u0002¢\u0006\u0006\n\u0004\b7\u00103R\u001a\u0010\u0007\u001a\u00020\u00068\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u0007\u00109\u001a\u0004\b:\u0010;R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u0004\u00100\u001a\u0004\b<\u0010=R\u001a\u0010\r\u001a\u00020\f8\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\r\u0010>\u001a\u0004\b?\u0010@R\u0014\u0010D\u001a\u00020A8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bB\u0010C"}, d2 = {"Lcom/datadog/android/core/internal/persistence/AbstractStorage;", "Lcom/datadog/android/core/internal/persistence/Storage;", "Lcom/datadog/android/privacy/TrackingConsentProviderCallback;", "", "sdkCoreId", "featureName", "Lcom/datadog/android/core/persistence/PersistenceStrategy$Factory;", "persistenceStrategyFactory", "Ljava/util/concurrent/ExecutorService;", "executorService", "Lcom/datadog/android/api/InternalLogger;", "internalLogger", "Lcom/datadog/android/api/storage/FeatureStorageConfiguration;", "storageConfiguration", "Lcom/datadog/android/core/internal/privacy/ConsentProvider;", "consentProvider", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/datadog/android/core/persistence/PersistenceStrategy$Factory;Ljava/util/concurrent/ExecutorService;Lcom/datadog/android/api/InternalLogger;Lcom/datadog/android/api/storage/FeatureStorageConfiguration;Lcom/datadog/android/core/internal/privacy/ConsentProvider;)V", "Lcom/datadog/android/core/internal/persistence/BatchId;", "batchId", "Lcom/datadog/android/core/internal/metrics/RemovalReason;", "removalReason", "", "deleteBatch", "", "confirmBatchRead", "(Lcom/datadog/android/core/internal/persistence/BatchId;Lcom/datadog/android/core/internal/metrics/RemovalReason;Z)V", "dropAll", "()V", "Lcom/datadog/android/api/context/DatadogContext;", "datadogContext", "Lkotlin/Function1;", "Lcom/datadog/android/api/storage/EventBatchWriter;", "Lcom/datadog/android/api/feature/EventWriteScope;", "getEventWriteScope", "(Lcom/datadog/android/api/context/DatadogContext;)Lkotlin/jvm/functions/Function1;", "Lcom/datadog/android/privacy/TrackingConsent;", "previousConsent", "newConsent", "onConsentUpdated", "(Lcom/datadog/android/privacy/TrackingConsent;Lcom/datadog/android/privacy/TrackingConsent;)V", "Lcom/datadog/android/core/internal/persistence/BatchData;", "readNextBatch", "()Lcom/datadog/android/core/internal/persistence/BatchData;", "getHighResolutionOutputSizeshNQ4ISI", "Ljava/util/concurrent/ExecutorService;", "getHighSpeedVideoFpsRanges", "Camera2StreamConfigurationMap", "Ljava/lang/String;", "getHighSpeedVideoSizes", "Lcom/datadog/android/core/persistence/PersistenceStrategy;", "Lkotlin/Lazy;", "getHighSpeedVideoFpsRangesFor", "Lcom/datadog/android/api/InternalLogger;", "Lcom/datadog/android/core/persistence/PersistenceStrategy;", "getHighSpeedVideoSizesFor", "getOutputFormats", "Lcom/datadog/android/core/persistence/PersistenceStrategy$Factory;", "getPersistenceStrategyFactory$dd_sdk_android_core_release", "()Lcom/datadog/android/core/persistence/PersistenceStrategy$Factory;", "getSdkCoreId$dd_sdk_android_core_release", "()Ljava/lang/String;", "Lcom/datadog/android/api/storage/FeatureStorageConfiguration;", "getStorageConfiguration$dd_sdk_android_core_release", "()Lcom/datadog/android/api/storage/FeatureStorageConfiguration;", "", "getOutputMinFrameDuration", "Ljava/lang/Object;", "getInputFormats"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class AbstractStorage implements com.datadog.android.core.internal.persistence.Storage, com.datadog.android.privacy.TrackingConsentProviderCallback {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final java.lang.String getHighSpeedVideoSizes;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final java.util.concurrent.ExecutorService getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final kotlin.Lazy getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.datadog.android.core.persistence.PersistenceStrategy getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.datadog.android.api.InternalLogger Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoSizesFor, reason: from kotlin metadata */
    private final kotlin.Lazy getOutputFormats;

    /* renamed from: getOutputMinFrameDuration, reason: from kotlin metadata */
    private final java.lang.Object getInputFormats;
    private final com.datadog.android.core.persistence.PersistenceStrategy.Factory persistenceStrategyFactory;
    private final java.lang.String sdkCoreId;
    private final com.datadog.android.api.storage.FeatureStorageConfiguration storageConfiguration;

    public AbstractStorage(java.lang.String str, java.lang.String str2, com.datadog.android.core.persistence.PersistenceStrategy.Factory factory, java.util.concurrent.ExecutorService executorService, com.datadog.android.api.InternalLogger internalLogger, com.datadog.android.api.storage.FeatureStorageConfiguration featureStorageConfiguration, com.datadog.android.core.internal.privacy.ConsentProvider consentProvider) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(factory, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(executorService, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(internalLogger, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(featureStorageConfiguration, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(consentProvider, "");
        this.sdkCoreId = str;
        this.getHighSpeedVideoSizes = str2;
        this.persistenceStrategyFactory = factory;
        this.getHighSpeedVideoFpsRanges = executorService;
        this.Camera2StreamConfigurationMap = internalLogger;
        this.storageConfiguration = featureStorageConfiguration;
        this.getHighSpeedVideoFpsRangesFor = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<com.datadog.android.core.persistence.PersistenceStrategy>() { // from class: com.datadog.android.core.internal.persistence.AbstractStorage$grantedPersistenceStrategy$2
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: getHighSpeedVideoFpsRanges, reason: merged with bridge method [inline-methods] */
            public final com.datadog.android.core.persistence.PersistenceStrategy invoke() {
                java.lang.String str3;
                com.datadog.android.core.persistence.PersistenceStrategy.Factory persistenceStrategyFactory = com.datadog.android.core.internal.persistence.AbstractStorage.this.getPersistenceStrategyFactory();
                java.lang.String sdkCoreId = com.datadog.android.core.internal.persistence.AbstractStorage.this.getSdkCoreId();
                str3 = com.datadog.android.core.internal.persistence.AbstractStorage.this.getHighSpeedVideoSizes;
                com.datadog.android.privacy.TrackingConsent trackingConsent = com.datadog.android.privacy.TrackingConsent.GRANTED;
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append(sdkCoreId);
                sb.append(androidx.view.exceptions.publickeycredential.DomExceptionUtils.SEPARATOR);
                sb.append(str3);
                sb.append(androidx.view.exceptions.publickeycredential.DomExceptionUtils.SEPARATOR);
                sb.append(trackingConsent);
                return persistenceStrategyFactory.create(sb.toString(), com.datadog.android.core.internal.persistence.AbstractStorage.this.getStorageConfiguration().getMaxItemsPerBatch(), com.datadog.android.core.internal.persistence.AbstractStorage.this.getStorageConfiguration().getMaxBatchSize());
            }

            {
                super(0);
            }
        });
        this.getOutputFormats = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<com.datadog.android.core.persistence.PersistenceStrategy>() { // from class: com.datadog.android.core.internal.persistence.AbstractStorage$pendingPersistenceStrategy$2
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: getHighSpeedVideoFpsRanges, reason: merged with bridge method [inline-methods] */
            public final com.datadog.android.core.persistence.PersistenceStrategy invoke() {
                java.lang.String str3;
                com.datadog.android.core.persistence.PersistenceStrategy.Factory persistenceStrategyFactory = com.datadog.android.core.internal.persistence.AbstractStorage.this.getPersistenceStrategyFactory();
                java.lang.String sdkCoreId = com.datadog.android.core.internal.persistence.AbstractStorage.this.getSdkCoreId();
                str3 = com.datadog.android.core.internal.persistence.AbstractStorage.this.getHighSpeedVideoSizes;
                com.datadog.android.privacy.TrackingConsent trackingConsent = com.datadog.android.privacy.TrackingConsent.PENDING;
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append(sdkCoreId);
                sb.append(androidx.view.exceptions.publickeycredential.DomExceptionUtils.SEPARATOR);
                sb.append(str3);
                sb.append(androidx.view.exceptions.publickeycredential.DomExceptionUtils.SEPARATOR);
                sb.append(trackingConsent);
                return persistenceStrategyFactory.create(sb.toString(), com.datadog.android.core.internal.persistence.AbstractStorage.this.getStorageConfiguration().getMaxItemsPerBatch(), com.datadog.android.core.internal.persistence.AbstractStorage.this.getStorageConfiguration().getMaxBatchSize());
            }

            {
                super(0);
            }
        });
        this.getInputFormats = new java.lang.Object();
        this.getHighResolutionOutputSizeshNQ4ISI = new com.datadog.android.core.persistence.NoOpPersistenceStrategy();
        consentProvider.registerCallback(this);
    }

    /* renamed from: getSdkCoreId$dd_sdk_android_core_release, reason: from getter */
    public final java.lang.String getSdkCoreId() {
        return this.sdkCoreId;
    }

    /* renamed from: getPersistenceStrategyFactory$dd_sdk_android_core_release, reason: from getter */
    public final com.datadog.android.core.persistence.PersistenceStrategy.Factory getPersistenceStrategyFactory() {
        return this.persistenceStrategyFactory;
    }

    /* renamed from: getStorageConfiguration$dd_sdk_android_core_release, reason: from getter */
    public final com.datadog.android.api.storage.FeatureStorageConfiguration getStorageConfiguration() {
        return this.storageConfiguration;
    }

    @Override // com.datadog.android.core.internal.persistence.Storage
    public final void dropAll() {
        com.datadog.android.core.internal.utils.ConcurrencyExtKt.executeSafe(this.getHighSpeedVideoFpsRanges, "Data drop", this.Camera2StreamConfigurationMap, new java.lang.Runnable() { // from class: com.datadog.android.core.internal.persistence.AbstractStorage$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                com.datadog.android.core.internal.persistence.AbstractStorage.$r8$lambda$yrBrJtXzzuP0Hyhkrike7D1KSZQ(com.datadog.android.core.internal.persistence.AbstractStorage.this);
            }
        });
    }

    @Override // com.datadog.android.privacy.TrackingConsentProviderCallback
    public final void onConsentUpdated(final com.datadog.android.privacy.TrackingConsent previousConsent, final com.datadog.android.privacy.TrackingConsent newConsent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(previousConsent, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(newConsent, "");
        com.datadog.android.core.internal.utils.ConcurrencyExtKt.executeSafe(this.getHighSpeedVideoFpsRanges, "Data migration", this.Camera2StreamConfigurationMap, new java.lang.Runnable() { // from class: com.datadog.android.core.internal.persistence.AbstractStorage$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                com.datadog.android.core.internal.persistence.AbstractStorage.m10006$r8$lambda$wIaR50CtTykh7bDKRETlC9nPTk(com.datadog.android.privacy.TrackingConsent.this, newConsent, this);
            }
        });
    }

    /* renamed from: $r8$lambda$wIaR50CtTykh-7bDKRETlC9nPTk, reason: not valid java name */
    public static /* synthetic */ void m10006$r8$lambda$wIaR50CtTykh7bDKRETlC9nPTk(com.datadog.android.privacy.TrackingConsent trackingConsent, com.datadog.android.privacy.TrackingConsent trackingConsent2, com.datadog.android.core.internal.persistence.AbstractStorage abstractStorage) {
        if (trackingConsent == com.datadog.android.privacy.TrackingConsent.PENDING) {
            int i = com.datadog.android.core.internal.persistence.AbstractStorage.WhenMappings.$EnumSwitchMapping$0[trackingConsent2.ordinal()];
            if (i == 1) {
                ((com.datadog.android.core.persistence.PersistenceStrategy) abstractStorage.getOutputFormats.getValue()).migrateData((com.datadog.android.core.persistence.PersistenceStrategy) abstractStorage.getHighSpeedVideoFpsRangesFor.getValue());
            } else if (i == 3) {
                ((com.datadog.android.core.persistence.PersistenceStrategy) abstractStorage.getOutputFormats.getValue()).dropAll();
            }
        }
    }

    public static /* synthetic */ void $r8$lambda$yrBrJtXzzuP0Hyhkrike7D1KSZQ(com.datadog.android.core.internal.persistence.AbstractStorage abstractStorage) {
        ((com.datadog.android.core.persistence.PersistenceStrategy) abstractStorage.getHighSpeedVideoFpsRangesFor.getValue()).dropAll();
        ((com.datadog.android.core.persistence.PersistenceStrategy) abstractStorage.getOutputFormats.getValue()).dropAll();
    }

    @Override // com.datadog.android.core.internal.persistence.Storage
    public final void confirmBatchRead(com.datadog.android.core.internal.persistence.BatchId batchId, com.datadog.android.core.internal.metrics.RemovalReason removalReason, boolean deleteBatch) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(batchId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(removalReason, "");
        if (deleteBatch) {
            ((com.datadog.android.core.persistence.PersistenceStrategy) this.getHighSpeedVideoFpsRangesFor.getValue()).unlockAndDelete(batchId.getId());
        } else {
            ((com.datadog.android.core.persistence.PersistenceStrategy) this.getHighSpeedVideoFpsRangesFor.getValue()).unlockAndKeep(batchId.getId());
        }
    }

    @Override // com.datadog.android.core.internal.persistence.Storage
    public final kotlin.jvm.functions.Function1<kotlin.jvm.functions.Function1<? super com.datadog.android.api.storage.EventBatchWriter, kotlin.Unit>, kotlin.Unit> getEventWriteScope(com.datadog.android.api.context.DatadogContext datadogContext) {
        final com.datadog.android.core.persistence.PersistenceStrategy persistenceStrategy;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(datadogContext, "");
        int i = com.datadog.android.core.internal.persistence.AbstractStorage.WhenMappings.$EnumSwitchMapping$0[datadogContext.getTrackingConsent().ordinal()];
        if (i == 1) {
            persistenceStrategy = (com.datadog.android.core.persistence.PersistenceStrategy) this.getHighSpeedVideoFpsRangesFor.getValue();
        } else if (i == 2) {
            persistenceStrategy = (com.datadog.android.core.persistence.PersistenceStrategy) this.getOutputFormats.getValue();
        } else {
            if (i != 3) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            persistenceStrategy = this.getHighResolutionOutputSizeshNQ4ISI;
        }
        return new com.datadog.android.core.internal.persistence.AsyncEventWriteScope(this.getHighSpeedVideoFpsRanges, new com.datadog.android.api.storage.EventBatchWriter() { // from class: com.datadog.android.core.internal.persistence.AbstractStorage$getEventWriteScope$writer$1
            @Override // com.datadog.android.api.storage.EventBatchWriter
            public final byte[] currentMetadata() {
                return com.datadog.android.core.persistence.PersistenceStrategy.this.currentMetadata();
            }

            @Override // com.datadog.android.api.storage.EventBatchWriter
            public final boolean write(com.datadog.android.api.storage.RawBatchEvent event, byte[] batchMetadata, com.datadog.android.api.storage.EventType eventType) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eventType, "");
                return com.datadog.android.core.persistence.PersistenceStrategy.this.write(event, batchMetadata, eventType);
            }
        }, this.getInputFormats, this.getHighSpeedVideoSizes, this.Camera2StreamConfigurationMap);
    }

    @Override // com.datadog.android.core.internal.persistence.Storage
    public final com.datadog.android.core.internal.persistence.BatchData readNextBatch() {
        com.datadog.android.core.persistence.PersistenceStrategy.Batch lockAndReadNext = ((com.datadog.android.core.persistence.PersistenceStrategy) this.getHighSpeedVideoFpsRangesFor.getValue()).lockAndReadNext();
        if (lockAndReadNext != null) {
            return new com.datadog.android.core.internal.persistence.BatchData(new com.datadog.android.core.internal.persistence.BatchId(lockAndReadNext.getBatchId()), lockAndReadNext.getEvents(), lockAndReadNext.getMetadata());
        }
        return null;
    }

    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.datadog.android.privacy.TrackingConsent.values().length];
            try {
                iArr[com.datadog.android.privacy.TrackingConsent.GRANTED.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.datadog.android.privacy.TrackingConsent.PENDING.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.datadog.android.privacy.TrackingConsent.NOT_GRANTED.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
