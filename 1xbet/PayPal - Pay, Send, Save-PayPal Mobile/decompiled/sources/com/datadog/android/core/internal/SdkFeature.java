package com.datadog.android.core.internal;

@kotlin.Metadata(d1 = {"\u0000Þ\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u0000 \u008a\u00012\u00020\u0001:\u0002\u008a\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000eH\u0000¢\u0006\u0004\b\u0011\u0010\u0010J'\u0010\u0017\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0016\u0018\u00010\u00152\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012H\u0000¢\u0006\u0004\b\u0017\u0010\u0018JG\u0010\u001d\u001a,\u0012\u0004\u0012\u00020\u0016\u0012 \u0012\u001e\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u000e0\u001a\u0012\u0004\u0012\u00020\u000e0\u001aj\u0002`\u001c\u0018\u00010\u00192\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u001d\u0010\"\u001a\u00020\u000e2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\u0013¢\u0006\u0004\b\"\u0010#J\r\u0010%\u001a\u00020$¢\u0006\u0004\b%\u0010&J\u0017\u0010)\u001a\u00020\u000e2\u0006\u0010(\u001a\u00020'H\u0016¢\u0006\u0004\b)\u0010*J\r\u0010+\u001a\u00020\u000e¢\u0006\u0004\b+\u0010\u0010J\u0019\u0010-\u001a\u00028\u0000\"\b\b\u0000\u0010,*\u00020\u0006H\u0016¢\u0006\u0004\b-\u0010.J6\u00101\u001a\u00020\u000e2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\u0017\u00100\u001a\u0013\u0012\t\u0012\u00070\u0016¢\u0006\u0002\b/\u0012\u0004\u0012\u00020\u000e0\u001aH\u0016¢\u0006\u0004\b1\u00102JS\u00104\u001a\u00020\u000e2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u001224\u00100\u001a0\u0012\u0004\u0012\u00020\u0016\u0012 \u0012\u001e\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u000e0\u001a\u0012\u0004\u0012\u00020\u000e0\u001aj\u0002`\u001c\u0012\u0004\u0012\u00020\u000e03H\u0016¢\u0006\u0004\b4\u00105R\u0014\u00108\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u001a\u0010\u0005\u001a\u00020\u00048\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u0005\u00109\u001a\u0004\b:\u0010;R\u001a\u0010\u0003\u001a\u00020\u00028\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u0003\u0010<\u001a\u0004\b=\u0010>R\"\u0010@\u001a\u00020?8\u0017@\u0017X\u0097\u000e¢\u0006\u0012\n\u0004\b@\u0010A\u001a\u0004\bB\u0010C\"\u0004\bD\u0010ER \u0010H\u001a\b\u0012\u0004\u0012\u00020G0F8\u0001X\u0081\u0004¢\u0006\f\n\u0004\bH\u0010I\u001a\u0004\bJ\u0010KR(\u0010M\u001a\u0010\u0012\u0004\u0012\u00020\u0013\u0012\u0006\u0012\u0004\u0018\u00010'0L8\u0001X\u0081\u0004¢\u0006\f\n\u0004\bM\u0010N\u001a\u0004\bO\u0010PR\u001a\u0010R\u001a\u00020Q8\u0001X\u0081\u0004¢\u0006\f\n\u0004\bR\u0010S\u001a\u0004\bT\u0010UR\"\u0010W\u001a\u00020V8\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\bW\u0010X\u001a\u0004\bY\u0010Z\"\u0004\b[\u0010\\R\u001a\u0010^\u001a\u00020]8\u0001X\u0081\u0004¢\u0006\f\n\u0004\b^\u0010_\u001a\u0004\b`\u0010aR\u001a\u0010\t\u001a\u00020\b8\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\t\u0010b\u001a\u0004\bc\u0010dR\"\u0010f\u001a\u00020e8\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\bf\u0010g\u001a\u0004\bh\u0010i\"\u0004\bj\u0010kR$\u0010m\u001a\u0004\u0018\u00010l8\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\bm\u0010n\u001a\u0004\bo\u0010p\"\u0004\bq\u0010rR\"\u0010t\u001a\u00020s8\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\bt\u0010u\u001a\u0004\bv\u0010w\"\u0004\bx\u0010yR#\u0010{\u001a\u00020z8\u0001@\u0001X\u0081\u000e¢\u0006\u0013\n\u0004\b{\u0010|\u001a\u0004\b}\u0010~\"\u0005\b\u007f\u0010\u0080\u0001R*\u0010\u0082\u0001\u001a\u00030\u0081\u00018\u0001@\u0001X\u0081\u000e¢\u0006\u0018\n\u0006\b\u0082\u0001\u0010\u0083\u0001\u001a\u0006\b\u0084\u0001\u0010\u0085\u0001\"\u0006\b\u0086\u0001\u0010\u0087\u0001R\u001c\u0010\u0007\u001a\u00020\u00068\u0001X\u0081\u0004¢\u0006\u000e\n\u0005\b\u0007\u0010\u0088\u0001\u001a\u0005\b\u0089\u0001\u0010."}, d2 = {"Lcom/datadog/android/core/internal/SdkFeature;", "Lcom/datadog/android/api/feature/FeatureScope;", "Lcom/datadog/android/core/internal/CoreFeature;", "coreFeature", "Lcom/datadog/android/core/internal/ContextProvider;", "contextProvider", "Lcom/datadog/android/api/feature/Feature;", "wrappedFeature", "Lcom/datadog/android/api/InternalLogger;", "internalLogger", "Lcom/datadog/android/internal/profiler/BenchmarkSdkUploads;", "benchmarkSdkUploads", "<init>", "(Lcom/datadog/android/core/internal/CoreFeature;Lcom/datadog/android/core/internal/ContextProvider;Lcom/datadog/android/api/feature/Feature;Lcom/datadog/android/api/InternalLogger;Lcom/datadog/android/internal/profiler/BenchmarkSdkUploads;)V", "", "clearAllData", "()V", "flushStoredData$dd_sdk_android_core_release", "", "", "withFeatureContexts", "Ljava/util/concurrent/Future;", "Lcom/datadog/android/api/context/DatadogContext;", "getContextFuture$dd_sdk_android_core_release", "(Ljava/util/Set;)Ljava/util/concurrent/Future;", "Lkotlin/Pair;", "Lkotlin/Function1;", "Lcom/datadog/android/api/storage/EventBatchWriter;", "Lcom/datadog/android/api/feature/EventWriteScope;", "getWriteContextSync", "(Ljava/util/Set;)Lkotlin/Pair;", "Landroid/content/Context;", "context", "instanceId", "initialize", "(Landroid/content/Context;Ljava/lang/String;)V", "", "isInitialized", "()Z", "", "event", "sendEvent", "(Ljava/lang/Object;)V", "stop", "T", "unwrap", "()Lcom/datadog/android/api/feature/Feature;", "Lkotlin/ParameterName;", com.sun.jna.Callback.METHOD_NAME, "withContext", "(Ljava/util/Set;Lkotlin/jvm/functions/Function1;)V", "Lkotlin/Function2;", "withWriteContext", "(Ljava/util/Set;Lkotlin/jvm/functions/Function2;)V", "getHighSpeedVideoFpsRanges", "Lcom/datadog/android/internal/profiler/BenchmarkSdkUploads;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/datadog/android/core/internal/ContextProvider;", "getContextProvider$dd_sdk_android_core_release", "()Lcom/datadog/android/core/internal/ContextProvider;", "Lcom/datadog/android/core/internal/CoreFeature;", "getCoreFeature$dd_sdk_android_core_release", "()Lcom/datadog/android/core/internal/CoreFeature;", "Lcom/datadog/android/api/storage/datastore/DataStoreHandler;", "dataStore", "Lcom/datadog/android/api/storage/datastore/DataStoreHandler;", "getDataStore", "()Lcom/datadog/android/api/storage/datastore/DataStoreHandler;", "setDataStore", "(Lcom/datadog/android/api/storage/datastore/DataStoreHandler;)V", "Ljava/util/concurrent/atomic/AtomicReference;", "Lcom/datadog/android/api/feature/FeatureEventReceiver;", "eventReceiver", "Ljava/util/concurrent/atomic/AtomicReference;", "getEventReceiver$dd_sdk_android_core_release", "()Ljava/util/concurrent/atomic/AtomicReference;", "", "featureContext", "Ljava/util/Map;", "getFeatureContext$dd_sdk_android_core_release", "()Ljava/util/Map;", "Ljava/util/concurrent/locks/ReadWriteLock;", "featureContextLock", "Ljava/util/concurrent/locks/ReadWriteLock;", "getFeatureContextLock$dd_sdk_android_core_release", "()Ljava/util/concurrent/locks/ReadWriteLock;", "Lcom/datadog/android/core/internal/persistence/file/FileOrchestrator;", "fileOrchestrator", "Lcom/datadog/android/core/internal/persistence/file/FileOrchestrator;", "getFileOrchestrator$dd_sdk_android_core_release", "()Lcom/datadog/android/core/internal/persistence/file/FileOrchestrator;", "setFileOrchestrator$dd_sdk_android_core_release", "(Lcom/datadog/android/core/internal/persistence/file/FileOrchestrator;)V", "Ljava/util/concurrent/atomic/AtomicBoolean;", "initialized", "Ljava/util/concurrent/atomic/AtomicBoolean;", "getInitialized$dd_sdk_android_core_release", "()Ljava/util/concurrent/atomic/AtomicBoolean;", "Lcom/datadog/android/api/InternalLogger;", "getInternalLogger$dd_sdk_android_core_release", "()Lcom/datadog/android/api/InternalLogger;", "Lcom/datadog/android/core/internal/metrics/MetricsDispatcher;", "metricsDispatcher", "Lcom/datadog/android/core/internal/metrics/MetricsDispatcher;", "getMetricsDispatcher$dd_sdk_android_core_release", "()Lcom/datadog/android/core/internal/metrics/MetricsDispatcher;", "setMetricsDispatcher$dd_sdk_android_core_release", "(Lcom/datadog/android/core/internal/metrics/MetricsDispatcher;)V", "Lcom/datadog/android/core/internal/lifecycle/ProcessLifecycleMonitor;", "processLifecycleMonitor", "Lcom/datadog/android/core/internal/lifecycle/ProcessLifecycleMonitor;", "getProcessLifecycleMonitor$dd_sdk_android_core_release", "()Lcom/datadog/android/core/internal/lifecycle/ProcessLifecycleMonitor;", "setProcessLifecycleMonitor$dd_sdk_android_core_release", "(Lcom/datadog/android/core/internal/lifecycle/ProcessLifecycleMonitor;)V", "Lcom/datadog/android/core/internal/persistence/Storage;", com.google.android.libraries.places.api.model.PlaceTypes.STORAGE, "Lcom/datadog/android/core/internal/persistence/Storage;", "getStorage$dd_sdk_android_core_release", "()Lcom/datadog/android/core/internal/persistence/Storage;", "setStorage$dd_sdk_android_core_release", "(Lcom/datadog/android/core/internal/persistence/Storage;)V", "Lcom/datadog/android/core/internal/data/upload/UploadScheduler;", "uploadScheduler", "Lcom/datadog/android/core/internal/data/upload/UploadScheduler;", "getUploadScheduler$dd_sdk_android_core_release", "()Lcom/datadog/android/core/internal/data/upload/UploadScheduler;", "setUploadScheduler$dd_sdk_android_core_release", "(Lcom/datadog/android/core/internal/data/upload/UploadScheduler;)V", "Lcom/datadog/android/core/internal/data/upload/DataUploader;", "uploader", "Lcom/datadog/android/core/internal/data/upload/DataUploader;", "getUploader$dd_sdk_android_core_release", "()Lcom/datadog/android/core/internal/data/upload/DataUploader;", "setUploader$dd_sdk_android_core_release", "(Lcom/datadog/android/core/internal/data/upload/DataUploader;)V", "Lcom/datadog/android/api/feature/Feature;", "getWrappedFeature$dd_sdk_android_core_release", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SdkFeature implements com.datadog.android.api.feature.FeatureScope {
    public static final java.lang.String BATCH_COUNT_METRIC_NAME = "android.benchmark.batch_count";
    public static final java.lang.String METER_NAME = "dd-sdk-android";
    public static final java.lang.String NO_EVENT_RECEIVER = "Feature \"%s\" has no event receiver registered, ignoring event.";
    public static final java.lang.String TRACK_NAME = "track";
    private final com.datadog.android.core.internal.ContextProvider contextProvider;
    private final com.datadog.android.core.internal.CoreFeature coreFeature;
    private com.datadog.android.api.storage.datastore.DataStoreHandler dataStore;
    private final java.util.concurrent.atomic.AtomicReference<com.datadog.android.api.feature.FeatureEventReceiver> eventReceiver;
    private final java.util.Map<java.lang.String, java.lang.Object> featureContext;
    private final java.util.concurrent.locks.ReadWriteLock featureContextLock;
    private com.datadog.android.core.internal.persistence.file.FileOrchestrator fileOrchestrator;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.datadog.android.internal.profiler.BenchmarkSdkUploads getHighResolutionOutputSizeshNQ4ISI;
    private final java.util.concurrent.atomic.AtomicBoolean initialized;
    private final com.datadog.android.api.InternalLogger internalLogger;
    private com.datadog.android.core.internal.metrics.MetricsDispatcher metricsDispatcher;
    private com.datadog.android.core.internal.lifecycle.ProcessLifecycleMonitor processLifecycleMonitor;
    private com.datadog.android.core.internal.persistence.Storage storage;
    private com.datadog.android.core.internal.data.upload.UploadScheduler uploadScheduler;
    private com.datadog.android.core.internal.data.upload.DataUploader uploader;
    private final com.datadog.android.api.feature.Feature wrappedFeature;

    public SdkFeature(com.datadog.android.core.internal.CoreFeature coreFeature, com.datadog.android.core.internal.ContextProvider contextProvider, com.datadog.android.api.feature.Feature feature, com.datadog.android.api.InternalLogger internalLogger, com.datadog.android.internal.profiler.BenchmarkSdkUploads benchmarkSdkUploads) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coreFeature, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contextProvider, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(feature, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(internalLogger, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(benchmarkSdkUploads, "");
        this.coreFeature = coreFeature;
        this.contextProvider = contextProvider;
        this.wrappedFeature = feature;
        this.internalLogger = internalLogger;
        this.getHighResolutionOutputSizeshNQ4ISI = benchmarkSdkUploads;
        this.dataStore = new com.datadog.android.core.internal.persistence.datastore.NoOpDataStoreHandler();
        this.initialized = new java.util.concurrent.atomic.AtomicBoolean(false);
        this.eventReceiver = new java.util.concurrent.atomic.AtomicReference<>(null);
        this.storage = new com.datadog.android.core.internal.persistence.NoOpStorage();
        this.uploader = new com.datadog.android.core.internal.data.upload.NoOpDataUploader();
        this.uploadScheduler = new com.datadog.android.core.internal.data.upload.NoOpUploadScheduler();
        this.fileOrchestrator = new com.datadog.android.core.internal.persistence.file.NoOpFileOrchestrator();
        this.metricsDispatcher = new com.datadog.android.core.internal.metrics.NoOpMetricsDispatcher();
        this.featureContextLock = new java.util.concurrent.locks.ReentrantReadWriteLock();
        this.featureContext = new java.util.LinkedHashMap();
    }

    /* renamed from: getCoreFeature$dd_sdk_android_core_release, reason: from getter */
    public final com.datadog.android.core.internal.CoreFeature getCoreFeature() {
        return this.coreFeature;
    }

    /* renamed from: getContextProvider$dd_sdk_android_core_release, reason: from getter */
    public final com.datadog.android.core.internal.ContextProvider getContextProvider() {
        return this.contextProvider;
    }

    /* renamed from: getWrappedFeature$dd_sdk_android_core_release, reason: from getter */
    public final com.datadog.android.api.feature.Feature getWrappedFeature() {
        return this.wrappedFeature;
    }

    /* renamed from: getInternalLogger$dd_sdk_android_core_release, reason: from getter */
    public final com.datadog.android.api.InternalLogger getInternalLogger() {
        return this.internalLogger;
    }

    public /* synthetic */ SdkFeature(com.datadog.android.core.internal.CoreFeature coreFeature, com.datadog.android.core.internal.ContextProvider contextProvider, com.datadog.android.api.feature.Feature feature, com.datadog.android.api.InternalLogger internalLogger, com.datadog.android.internal.profiler.BenchmarkSdkUploads benchmarkSdkUploads, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(coreFeature, contextProvider, feature, internalLogger, (i & 16) != 0 ? com.datadog.android.internal.profiler.GlobalBenchmark.INSTANCE.getBenchmarkSdkUploads() : benchmarkSdkUploads);
    }

    @Override // com.datadog.android.api.feature.FeatureScope
    public final com.datadog.android.api.storage.datastore.DataStoreHandler getDataStore() {
        return this.dataStore;
    }

    public final void setDataStore(com.datadog.android.api.storage.datastore.DataStoreHandler dataStoreHandler) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dataStoreHandler, "");
        this.dataStore = dataStoreHandler;
    }

    /* renamed from: getInitialized$dd_sdk_android_core_release, reason: from getter */
    public final java.util.concurrent.atomic.AtomicBoolean getInitialized() {
        return this.initialized;
    }

    public final java.util.concurrent.atomic.AtomicReference<com.datadog.android.api.feature.FeatureEventReceiver> getEventReceiver$dd_sdk_android_core_release() {
        return this.eventReceiver;
    }

    /* renamed from: getStorage$dd_sdk_android_core_release, reason: from getter */
    public final com.datadog.android.core.internal.persistence.Storage getStorage() {
        return this.storage;
    }

    public final void setStorage$dd_sdk_android_core_release(com.datadog.android.core.internal.persistence.Storage storage) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(storage, "");
        this.storage = storage;
    }

    /* renamed from: getUploader$dd_sdk_android_core_release, reason: from getter */
    public final com.datadog.android.core.internal.data.upload.DataUploader getUploader() {
        return this.uploader;
    }

    public final void setUploader$dd_sdk_android_core_release(com.datadog.android.core.internal.data.upload.DataUploader dataUploader) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dataUploader, "");
        this.uploader = dataUploader;
    }

    /* renamed from: getUploadScheduler$dd_sdk_android_core_release, reason: from getter */
    public final com.datadog.android.core.internal.data.upload.UploadScheduler getUploadScheduler() {
        return this.uploadScheduler;
    }

    public final void setUploadScheduler$dd_sdk_android_core_release(com.datadog.android.core.internal.data.upload.UploadScheduler uploadScheduler) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uploadScheduler, "");
        this.uploadScheduler = uploadScheduler;
    }

    /* renamed from: getFileOrchestrator$dd_sdk_android_core_release, reason: from getter */
    public final com.datadog.android.core.internal.persistence.file.FileOrchestrator getFileOrchestrator() {
        return this.fileOrchestrator;
    }

    public final void setFileOrchestrator$dd_sdk_android_core_release(com.datadog.android.core.internal.persistence.file.FileOrchestrator fileOrchestrator) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fileOrchestrator, "");
        this.fileOrchestrator = fileOrchestrator;
    }

    /* renamed from: getMetricsDispatcher$dd_sdk_android_core_release, reason: from getter */
    public final com.datadog.android.core.internal.metrics.MetricsDispatcher getMetricsDispatcher() {
        return this.metricsDispatcher;
    }

    public final void setMetricsDispatcher$dd_sdk_android_core_release(com.datadog.android.core.internal.metrics.MetricsDispatcher metricsDispatcher) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(metricsDispatcher, "");
        this.metricsDispatcher = metricsDispatcher;
    }

    /* renamed from: getProcessLifecycleMonitor$dd_sdk_android_core_release, reason: from getter */
    public final com.datadog.android.core.internal.lifecycle.ProcessLifecycleMonitor getProcessLifecycleMonitor() {
        return this.processLifecycleMonitor;
    }

    public final void setProcessLifecycleMonitor$dd_sdk_android_core_release(com.datadog.android.core.internal.lifecycle.ProcessLifecycleMonitor processLifecycleMonitor) {
        this.processLifecycleMonitor = processLifecycleMonitor;
    }

    /* renamed from: getFeatureContextLock$dd_sdk_android_core_release, reason: from getter */
    public final java.util.concurrent.locks.ReadWriteLock getFeatureContextLock() {
        return this.featureContextLock;
    }

    public final java.util.Map<java.lang.String, java.lang.Object> getFeatureContext$dd_sdk_android_core_release() {
        return this.featureContext;
    }

    public final void initialize(android.content.Context context, java.lang.String instanceId) {
        com.datadog.android.core.internal.persistence.AbstractStorage abstractStorage;
        com.datadog.android.core.internal.data.upload.NoOpUploadScheduler noOpUploadScheduler;
        com.datadog.android.core.internal.persistence.file.FilePersistenceConfig copy;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(instanceId, "");
        if (this.initialized.get()) {
            return;
        }
        com.datadog.android.api.feature.Feature feature = this.wrappedFeature;
        if (feature instanceof com.datadog.android.api.feature.StorageBackedFeature) {
            com.datadog.android.core.internal.configuration.DataUploadConfiguration dataUploadConfiguration = new com.datadog.android.core.internal.configuration.DataUploadConfiguration(this.coreFeature.getUploadFrequency(), this.coreFeature.getBatchProcessingLevel().getMaxBatchesPerUploadJob());
            com.datadog.android.core.internal.data.upload.DefaultUploadSchedulerStrategy customUploadSchedulerStrategy = this.coreFeature.getCustomUploadSchedulerStrategy();
            if (customUploadSchedulerStrategy == null) {
                customUploadSchedulerStrategy = new com.datadog.android.core.internal.data.upload.DefaultUploadSchedulerStrategy(dataUploadConfiguration);
            }
            com.datadog.android.core.configuration.UploadSchedulerStrategy uploadSchedulerStrategy = customUploadSchedulerStrategy;
            com.datadog.android.api.feature.StorageBackedFeature storageBackedFeature = (com.datadog.android.api.feature.StorageBackedFeature) this.wrappedFeature;
            com.datadog.android.core.persistence.PersistenceStrategy.Factory persistenceStrategyFactory = this.coreFeature.getPersistenceStrategyFactory();
            com.datadog.android.api.storage.FeatureStorageConfiguration storageConfiguration = storageBackedFeature.getStorageConfiguration();
            if (persistenceStrategyFactory != null) {
                abstractStorage = new com.datadog.android.core.internal.persistence.AbstractStorage(instanceId, storageBackedFeature.getName(), persistenceStrategyFactory, this.coreFeature.getPersistenceExecutorService$dd_sdk_android_core_release(), this.internalLogger, storageConfiguration, this.coreFeature.getTrackingConsentProvider());
            } else {
                copy = r20.copy((r28 & 1) != 0 ? r20.recentDelayMs : this.coreFeature.getBatchSize().getWindowDurationMs(), (r28 & 2) != 0 ? r20.maxBatchSize : storageConfiguration.getMaxBatchSize(), (r28 & 4) != 0 ? r20.maxItemSize : storageConfiguration.getMaxItemSize(), (r28 & 8) != 0 ? r20.maxItemsPerBatch : storageConfiguration.getMaxItemsPerBatch(), (r28 & 16) != 0 ? r20.oldFileThreshold : storageConfiguration.getOldBatchThreshold(), (r28 & 32) != 0 ? r20.maxDiskSpace : 0L, (r28 & 64) != 0 ? this.coreFeature.buildFilePersistenceConfig().cleanupFrequencyThreshold : 0L);
                com.datadog.android.core.internal.metrics.BatchMetricsDispatcher batchMetricsDispatcher = new com.datadog.android.core.internal.metrics.BatchMetricsDispatcher(this.wrappedFeature.getName(), dataUploadConfiguration, copy, this.internalLogger, this.coreFeature.getTimeProvider());
                if (context instanceof android.app.Application) {
                    com.datadog.android.core.internal.lifecycle.ProcessLifecycleMonitor processLifecycleMonitor = new com.datadog.android.core.internal.lifecycle.ProcessLifecycleMonitor(batchMetricsDispatcher);
                    this.processLifecycleMonitor = processLifecycleMonitor;
                    ((android.app.Application) context).registerActivityLifecycleCallbacks(processLifecycleMonitor);
                }
                this.metricsDispatcher = batchMetricsDispatcher;
                java.lang.String name2 = storageBackedFeature.getName();
                com.datadog.android.core.internal.persistence.file.advanced.FeatureFileOrchestrator featureFileOrchestrator = new com.datadog.android.core.internal.persistence.file.advanced.FeatureFileOrchestrator(this.coreFeature.getTrackingConsentProvider(), this.coreFeature.getStorageDir$dd_sdk_android_core_release(), name2, this.coreFeature.getPersistenceExecutorService$dd_sdk_android_core_release(), copy, this.internalLogger, this.metricsDispatcher, this.coreFeature.getTimeProvider());
                this.fileOrchestrator = featureFileOrchestrator;
                abstractStorage = new com.datadog.android.core.internal.persistence.ConsentAwareStorage(this.coreFeature.getPersistenceExecutorService$dd_sdk_android_core_release(), featureFileOrchestrator.getGrantedOrchestrator(), featureFileOrchestrator.getPendingOrchestrator(), com.datadog.android.core.internal.persistence.file.batch.BatchFileReaderWriter.INSTANCE.create(this.internalLogger, this.coreFeature.getLocalDataEncryption()), com.datadog.android.core.internal.persistence.file.FileReaderWriter.INSTANCE.create(this.internalLogger, this.coreFeature.getLocalDataEncryption()), new com.datadog.android.core.internal.persistence.file.FileMover(this.internalLogger), this.internalLogger, copy, this.metricsDispatcher, name2, null, 1024, null);
            }
            this.storage = abstractStorage;
            this.wrappedFeature.onInitialize(context);
            com.datadog.android.api.feature.StorageBackedFeature storageBackedFeature2 = (com.datadog.android.api.feature.StorageBackedFeature) this.wrappedFeature;
            int maxBatchesPerUploadJob$dd_sdk_android_core_release = dataUploadConfiguration.getMaxBatchesPerUploadJob$dd_sdk_android_core_release();
            if (this.coreFeature.getIsMainProcess()) {
                this.uploader = new com.datadog.android.core.internal.data.upload.DataOkHttpUploader(storageBackedFeature2.getRequestFactory(), this.internalLogger, this.coreFeature.getCallFactory$dd_sdk_android_core_release(), this.coreFeature.getSdkVersion(), this.coreFeature.getAndroidInfoProvider(), com.datadog.android.internal.profiler.GlobalBenchmark.INSTANCE.createExecutionTimer(this.wrappedFeature.getName(), this.coreFeature.getTimeProvider()));
                noOpUploadScheduler = new com.datadog.android.core.internal.data.upload.DataUploadScheduler(storageBackedFeature2.getName(), this.storage, this.uploader, this.contextProvider, this.coreFeature.getNetworkInfoProvider(), this.coreFeature.getSystemInfoProvider(), uploadSchedulerStrategy, maxBatchesPerUploadJob$dd_sdk_android_core_release, this.coreFeature.getUploadExecutorService$dd_sdk_android_core_release(), this.internalLogger);
            } else {
                noOpUploadScheduler = new com.datadog.android.core.internal.data.upload.NoOpUploadScheduler();
            }
            this.uploadScheduler = noOpUploadScheduler;
        } else {
            feature.onInitialize(context);
        }
        if (this.wrappedFeature instanceof com.datadog.android.privacy.TrackingConsentProviderCallback) {
            this.coreFeature.getTrackingConsentProvider().registerCallback((com.datadog.android.privacy.TrackingConsentProviderCallback) this.wrappedFeature);
        }
        com.datadog.android.core.internal.persistence.file.FileReaderWriter create = com.datadog.android.core.internal.persistence.file.FileReaderWriter.INSTANCE.create(this.internalLogger, this.coreFeature.getLocalDataEncryption());
        com.datadog.android.core.internal.persistence.datastore.DataStoreFileHelper dataStoreFileHelper = new com.datadog.android.core.internal.persistence.datastore.DataStoreFileHelper(this.internalLogger);
        java.lang.String name3 = this.wrappedFeature.getName();
        java.io.File storageDir$dd_sdk_android_core_release = this.coreFeature.getStorageDir$dd_sdk_android_core_release();
        setDataStore(new com.datadog.android.core.internal.persistence.datastore.DataStoreFileHandler(this.coreFeature.getPersistenceExecutorService$dd_sdk_android_core_release(), this.internalLogger, new com.datadog.android.core.internal.persistence.datastore.DatastoreFileReader(dataStoreFileHelper, name3, storageDir$dd_sdk_android_core_release, this.internalLogger, new com.datadog.android.core.internal.persistence.tlvformat.TLVBlockFileReader(this.internalLogger, create)), new com.datadog.android.core.internal.persistence.datastore.DatastoreFileWriter(dataStoreFileHelper, name3, storageDir$dd_sdk_android_core_release, this.internalLogger, create)));
        this.getHighResolutionOutputSizeshNQ4ISI.getMeter("dd-sdk-android").createObservableGauge(BATCH_COUNT_METRIC_NAME, kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("track", this.wrappedFeature.getName())), new kotlin.jvm.functions.Function0<java.lang.Double>() { // from class: com.datadog.android.core.internal.SdkFeature$createBatchCountBenchmark$1
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: getHighSpeedVideoSizes, reason: merged with bridge method [inline-methods] */
            public final java.lang.Double invoke() {
                return java.lang.Double.valueOf(com.datadog.android.core.internal.SdkFeature.this.getFileOrchestrator().getFlushableFiles().size());
            }

            {
                super(0);
            }
        });
        this.initialized.set(true);
        this.uploadScheduler.startScheduling();
    }

    public final boolean isInitialized() {
        return this.initialized.get();
    }

    public final void clearAllData() {
        this.storage.dropAll();
        getDataStore().clearAllData();
    }

    public final void stop() {
        if (this.initialized.get()) {
            this.wrappedFeature.onStop();
            if (this.wrappedFeature instanceof com.datadog.android.privacy.TrackingConsentProviderCallback) {
                this.coreFeature.getTrackingConsentProvider().unregisterCallback((com.datadog.android.privacy.TrackingConsentProviderCallback) this.wrappedFeature);
            }
            this.uploadScheduler.stopScheduling();
            this.uploadScheduler = new com.datadog.android.core.internal.data.upload.NoOpUploadScheduler();
            this.storage = new com.datadog.android.core.internal.persistence.NoOpStorage();
            setDataStore(new com.datadog.android.core.internal.persistence.datastore.NoOpDataStoreHandler());
            this.uploader = new com.datadog.android.core.internal.data.upload.NoOpDataUploader();
            this.fileOrchestrator = new com.datadog.android.core.internal.persistence.file.NoOpFileOrchestrator();
            this.metricsDispatcher = new com.datadog.android.core.internal.metrics.NoOpMetricsDispatcher();
            android.content.Context context = this.coreFeature.getContextRef$dd_sdk_android_core_release().get();
            android.app.Application application = context instanceof android.app.Application ? (android.app.Application) context : null;
            if (application != null) {
                application.unregisterActivityLifecycleCallbacks(this.processLifecycleMonitor);
            }
            this.processLifecycleMonitor = null;
            this.featureContext.clear();
            this.initialized.set(false);
        }
    }

    @Override // com.datadog.android.api.feature.FeatureScope
    public final void withWriteContext(final java.util.Set<java.lang.String> withFeatureContexts, final kotlin.jvm.functions.Function2<? super com.datadog.android.api.context.DatadogContext, ? super kotlin.jvm.functions.Function1<? super kotlin.jvm.functions.Function1<? super com.datadog.android.api.storage.EventBatchWriter, kotlin.Unit>, kotlin.Unit>, kotlin.Unit> callback) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(withFeatureContexts, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callback, "");
        com.datadog.android.core.internal.utils.ConcurrencyExtKt.executeSafe(this.coreFeature.getContextExecutorService$dd_sdk_android_core_release(), "withWriteContext-".concat(java.lang.String.valueOf(this.wrappedFeature.getName())), this.internalLogger, new java.lang.Runnable() { // from class: com.datadog.android.core.internal.SdkFeature$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                com.datadog.android.core.internal.SdkFeature.$r8$lambda$2UzgimND95g75na24_mVvKjHrsg(com.datadog.android.core.internal.SdkFeature.this, withFeatureContexts, callback);
            }
        });
    }

    @Override // com.datadog.android.api.feature.FeatureScope
    public final void withContext(final java.util.Set<java.lang.String> withFeatureContexts, final kotlin.jvm.functions.Function1<? super com.datadog.android.api.context.DatadogContext, kotlin.Unit> callback) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(withFeatureContexts, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callback, "");
        com.datadog.android.core.internal.utils.ConcurrencyExtKt.executeSafe(this.coreFeature.getContextExecutorService$dd_sdk_android_core_release(), "withContext-".concat(java.lang.String.valueOf(this.wrappedFeature.getName())), this.internalLogger, new java.lang.Runnable() { // from class: com.datadog.android.core.internal.SdkFeature$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                com.datadog.android.core.internal.SdkFeature.$r8$lambda$Z1efiWcFSnafDEB1bLUVw6cPYQQ(com.datadog.android.core.internal.SdkFeature.this, withFeatureContexts, callback);
            }
        });
    }

    public final java.util.concurrent.Future<com.datadog.android.api.context.DatadogContext> getContextFuture$dd_sdk_android_core_release(final java.util.Set<java.lang.String> withFeatureContexts) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(withFeatureContexts, "");
        return com.datadog.android.core.internal.utils.ConcurrencyExtKt.submitSafe(this.coreFeature.getContextExecutorService$dd_sdk_android_core_release(), "getContextFuture-".concat(java.lang.String.valueOf(this.wrappedFeature.getName())), this.internalLogger, new java.util.concurrent.Callable() { // from class: com.datadog.android.core.internal.SdkFeature$$ExternalSyntheticLambda2
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                return com.datadog.android.core.internal.SdkFeature.m10003$r8$lambda$EtCKfdWuJAJGz8AdK3xhgUDo(com.datadog.android.core.internal.SdkFeature.this, withFeatureContexts);
            }
        });
    }

    @Override // com.datadog.android.api.feature.FeatureScope
    public final kotlin.Pair<com.datadog.android.api.context.DatadogContext, kotlin.jvm.functions.Function1<kotlin.jvm.functions.Function1<? super com.datadog.android.api.storage.EventBatchWriter, kotlin.Unit>, kotlin.Unit>> getWriteContextSync(final java.util.Set<java.lang.String> withFeatureContexts) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(withFeatureContexts, "");
        java.lang.String concat = "getWriteContextSync-".concat(java.lang.String.valueOf(this.wrappedFeature.getName()));
        return (kotlin.Pair) com.datadog.android.core.internal.utils.ConcurrencyExtKt.getSafe(com.datadog.android.core.internal.utils.ConcurrencyExtKt.submitSafe(this.coreFeature.getContextExecutorService$dd_sdk_android_core_release(), concat, this.internalLogger, new java.util.concurrent.Callable() { // from class: com.datadog.android.core.internal.SdkFeature$$ExternalSyntheticLambda0
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                return com.datadog.android.core.internal.SdkFeature.$r8$lambda$np089ACxN9E2nIK4tYLQGPXQewI(com.datadog.android.core.internal.SdkFeature.this, withFeatureContexts);
            }
        }), concat, this.internalLogger);
    }

    @Override // com.datadog.android.api.feature.FeatureScope
    public final void sendEvent(java.lang.Object event) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
        com.datadog.android.api.feature.FeatureEventReceiver featureEventReceiver = this.eventReceiver.get();
        if (featureEventReceiver == null) {
            com.datadog.android.api.InternalLogger.DefaultImpls.log$default(this.internalLogger, com.datadog.android.api.InternalLogger.Level.INFO, com.datadog.android.api.InternalLogger.Target.USER, (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<java.lang.String>() { // from class: com.datadog.android.core.internal.SdkFeature$sendEvent$1
                @Override // kotlin.jvm.functions.Function0
                /* renamed from: getHighSpeedVideoFpsRangesFor, reason: merged with bridge method [inline-methods] */
                public final java.lang.String invoke() {
                    java.lang.String format = java.lang.String.format(java.util.Locale.US, com.datadog.android.core.internal.SdkFeature.NO_EVENT_RECEIVER, java.util.Arrays.copyOf(new java.lang.Object[]{com.datadog.android.core.internal.SdkFeature.this.getWrappedFeature().getName()}, 1));
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format, "");
                    return format;
                }

                {
                    super(0);
                }
            }, (java.lang.Throwable) null, false, (java.util.Map) null, 56, (java.lang.Object) null);
        } else {
            featureEventReceiver.onReceive(event);
        }
    }

    @Override // com.datadog.android.api.feature.FeatureScope
    public final <T extends com.datadog.android.api.feature.Feature> T unwrap() {
        T t = (T) this.wrappedFeature;
        kotlin.jvm.internal.Intrinsics.checkNotNull(t, "");
        return t;
    }

    public final void flushStoredData$dd_sdk_android_core_release() {
        new com.datadog.android.core.internal.data.upload.DataFlusher(this.contextProvider, this.fileOrchestrator, com.datadog.android.core.internal.persistence.file.batch.BatchFileReaderWriter.INSTANCE.create(this.internalLogger, this.coreFeature.getLocalDataEncryption()), com.datadog.android.core.internal.persistence.file.FileReaderWriter.INSTANCE.create(this.internalLogger, this.coreFeature.getLocalDataEncryption()), new com.datadog.android.core.internal.persistence.file.FileMover(this.internalLogger), this.internalLogger).flush(this.uploader);
    }

    public static /* synthetic */ void $r8$lambda$2UzgimND95g75na24_mVvKjHrsg(com.datadog.android.core.internal.SdkFeature sdkFeature, java.util.Set set, kotlin.jvm.functions.Function2 function2) {
        if (sdkFeature.coreFeature.getInitialized().get()) {
            com.datadog.android.api.context.DatadogContext context = sdkFeature.contextProvider.getContext(set);
            function2.invoke(context, sdkFeature.storage.getEventWriteScope(context));
        }
    }

    /* renamed from: $r8$lambda$Et-CKfdWuJ-AJGz8AdK3xhgU-Do, reason: not valid java name */
    public static /* synthetic */ com.datadog.android.api.context.DatadogContext m10003$r8$lambda$EtCKfdWuJAJGz8AdK3xhgUDo(com.datadog.android.core.internal.SdkFeature sdkFeature, java.util.Set set) {
        if (sdkFeature.coreFeature.getInitialized().get()) {
            return sdkFeature.contextProvider.getContext(set);
        }
        return null;
    }

    public static /* synthetic */ void $r8$lambda$Z1efiWcFSnafDEB1bLUVw6cPYQQ(com.datadog.android.core.internal.SdkFeature sdkFeature, java.util.Set set, kotlin.jvm.functions.Function1 function1) {
        if (sdkFeature.coreFeature.getInitialized().get()) {
            function1.invoke(sdkFeature.contextProvider.getContext(set));
        }
    }

    public static /* synthetic */ kotlin.Pair $r8$lambda$np089ACxN9E2nIK4tYLQGPXQewI(com.datadog.android.core.internal.SdkFeature sdkFeature, java.util.Set set) {
        if (!sdkFeature.coreFeature.getInitialized().get()) {
            return null;
        }
        com.datadog.android.api.context.DatadogContext context = sdkFeature.contextProvider.getContext(set);
        return kotlin.TuplesKt.to(context, sdkFeature.storage.getEventWriteScope(context));
    }
}
