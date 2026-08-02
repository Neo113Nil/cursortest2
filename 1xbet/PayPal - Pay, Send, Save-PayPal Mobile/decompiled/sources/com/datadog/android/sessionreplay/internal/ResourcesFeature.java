package com.datadog.android.sessionreplay.internal;

@kotlin.Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 +2\u00020\u0001:\u0001+B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eR\"\u0010\u0010\u001a\u00020\u000f8\u0001@\u0001X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0017\u001a\u00020\u00168\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001b\u001a\u00020\u00048\u0017X\u0097D¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001a\u0010 \u001a\u00020\u001f8\u0017X\u0097\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0014\u0010$\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u001a\u0010'\u001a\u00020&8\u0017X\u0097\u0004¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*"}, d2 = {"Lcom/datadog/android/sessionreplay/internal/ResourcesFeature;", "Lcom/datadog/android/api/feature/StorageBackedFeature;", "Lcom/datadog/android/api/feature/FeatureSdkCore;", "sdkCore", "", "customEndpointUrl", "<init>", "(Lcom/datadog/android/api/feature/FeatureSdkCore;Ljava/lang/String;)V", "Landroid/content/Context;", "appContext", "", "onInitialize", "(Landroid/content/Context;)V", "onStop", "()V", "Lcom/datadog/android/sessionreplay/internal/storage/ResourcesWriter;", "dataWriter", "Lcom/datadog/android/sessionreplay/internal/storage/ResourcesWriter;", "getDataWriter$dd_sdk_android_session_replay_release", "()Lcom/datadog/android/sessionreplay/internal/storage/ResourcesWriter;", "setDataWriter$dd_sdk_android_session_replay_release", "(Lcom/datadog/android/sessionreplay/internal/storage/ResourcesWriter;)V", "Ljava/util/concurrent/atomic/AtomicBoolean;", "initialized", "Ljava/util/concurrent/atomic/AtomicBoolean;", "getInitialized$dd_sdk_android_session_replay_release", "()Ljava/util/concurrent/atomic/AtomicBoolean;", "name", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "Lcom/datadog/android/api/net/RequestFactory;", "requestFactory", "Lcom/datadog/android/api/net/RequestFactory;", "getRequestFactory", "()Lcom/datadog/android/api/net/RequestFactory;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/datadog/android/api/feature/FeatureSdkCore;", "Lcom/datadog/android/api/storage/FeatureStorageConfiguration;", "storageConfiguration", "Lcom/datadog/android/api/storage/FeatureStorageConfiguration;", "getStorageConfiguration", "()Lcom/datadog/android/api/storage/FeatureStorageConfiguration;", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class ResourcesFeature implements com.datadog.android.api.feature.StorageBackedFeature {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.datadog.android.sessionreplay.internal.ResourcesFeature.Companion INSTANCE = new com.datadog.android.sessionreplay.internal.ResourcesFeature.Companion(null);
    private static final com.datadog.android.api.storage.FeatureStorageConfiguration STORAGE_CONFIGURATION;
    private com.datadog.android.sessionreplay.internal.storage.ResourcesWriter dataWriter;
    private final com.datadog.android.api.feature.FeatureSdkCore getHighResolutionOutputSizeshNQ4ISI;
    private final java.util.concurrent.atomic.AtomicBoolean initialized;
    private final java.lang.String name;
    private final com.datadog.android.api.net.RequestFactory requestFactory;
    private final com.datadog.android.api.storage.FeatureStorageConfiguration storageConfiguration;

    public ResourcesFeature(com.datadog.android.api.feature.FeatureSdkCore featureSdkCore, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(featureSdkCore, "");
        this.getHighResolutionOutputSizeshNQ4ISI = featureSdkCore;
        this.dataWriter = new com.datadog.android.sessionreplay.internal.storage.NoOpResourcesWriter();
        this.initialized = new java.util.concurrent.atomic.AtomicBoolean(false);
        this.name = "session-replay-resources";
        this.requestFactory = new com.datadog.android.sessionreplay.internal.net.ResourcesRequestFactory(str, featureSdkCore.getInternalLogger(), null, 4, null);
        this.storageConfiguration = STORAGE_CONFIGURATION;
    }

    /* renamed from: getDataWriter$dd_sdk_android_session_replay_release, reason: from getter */
    public final com.datadog.android.sessionreplay.internal.storage.ResourcesWriter getDataWriter() {
        return this.dataWriter;
    }

    public final void setDataWriter$dd_sdk_android_session_replay_release(com.datadog.android.sessionreplay.internal.storage.ResourcesWriter resourcesWriter) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(resourcesWriter, "");
        this.dataWriter = resourcesWriter;
    }

    /* renamed from: getInitialized$dd_sdk_android_session_replay_release, reason: from getter */
    public final java.util.concurrent.atomic.AtomicBoolean getInitialized() {
        return this.initialized;
    }

    @Override // com.datadog.android.api.feature.Feature
    public final java.lang.String getName() {
        return this.name;
    }

    @Override // com.datadog.android.api.feature.StorageBackedFeature
    public final com.datadog.android.api.net.RequestFactory getRequestFactory() {
        return this.requestFactory;
    }

    @Override // com.datadog.android.api.feature.Feature
    public final void onInitialize(android.content.Context appContext) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appContext, "");
        this.dataWriter = new com.datadog.android.sessionreplay.internal.storage.SessionReplayResourcesWriter(this.getHighResolutionOutputSizeshNQ4ISI);
        this.initialized.set(true);
    }

    @Override // com.datadog.android.api.feature.StorageBackedFeature
    public final com.datadog.android.api.storage.FeatureStorageConfiguration getStorageConfiguration() {
        return this.storageConfiguration;
    }

    @Override // com.datadog.android.api.feature.Feature
    public final void onStop() {
        this.dataWriter = new com.datadog.android.sessionreplay.internal.storage.NoOpResourcesWriter();
        this.initialized.set(false);
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0005\u001a\u00020\u00048\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/datadog/android/sessionreplay/internal/ResourcesFeature$Companion;", "", "<init>", "()V", "Lcom/datadog/android/api/storage/FeatureStorageConfiguration;", "STORAGE_CONFIGURATION", "Lcom/datadog/android/api/storage/FeatureStorageConfiguration;", "getSTORAGE_CONFIGURATION$dd_sdk_android_session_replay_release", "()Lcom/datadog/android/api/storage/FeatureStorageConfiguration;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final com.datadog.android.api.storage.FeatureStorageConfiguration getSTORAGE_CONFIGURATION$dd_sdk_android_session_replay_release() {
            return com.datadog.android.sessionreplay.internal.ResourcesFeature.STORAGE_CONFIGURATION;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        com.datadog.android.api.storage.FeatureStorageConfiguration copy;
        copy = r1.copy((r16 & 1) != 0 ? r1.maxItemSize : 10485760L, (r16 & 2) != 0 ? r1.maxItemsPerBatch : 0, (r16 & 4) != 0 ? r1.maxBatchSize : 10485760L, (r16 & 8) != 0 ? com.datadog.android.api.storage.FeatureStorageConfiguration.INSTANCE.getDEFAULT().oldBatchThreshold : 0L);
        STORAGE_CONFIGURATION = copy;
    }
}
