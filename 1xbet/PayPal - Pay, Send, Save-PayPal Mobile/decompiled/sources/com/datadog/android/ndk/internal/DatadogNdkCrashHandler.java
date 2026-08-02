package com.datadog.android.ndk.internal;

@kotlin.Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b \b\u0000\u0018\u0000 52\u00020\u0001:\u00015BM\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u000e\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0019\u0010\u0014R\u0014\u0010\u001c\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001d\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR$\u0010\u001f\u001a\u0004\u0018\u00010\b8\u0001@\u0001X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R$\u0010%\u001a\u0004\u0018\u00010\r8\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\u001c\u0010,\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\f8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010+R\u001a\u0010\u000f\u001a\u00020\u00078\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u000f\u0010-\u001a\u0004\b.\u0010/R\u001a\u00100\u001a\u00020\u00028\u0001X\u0081\u0004¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R \u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00068\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b,\u00104"}, d2 = {"Lcom/datadog/android/ndk/internal/DatadogNdkCrashHandler;", "Lcom/datadog/android/ndk/internal/NdkCrashHandler;", "Ljava/io/File;", "storageDir", "Ljava/util/concurrent/ExecutorService;", "dataPersistenceExecutorService", "Lcom/datadog/android/core/internal/persistence/Deserializer;", "", "Lcom/datadog/android/ndk/internal/NdkCrashLog;", "ndkCrashLogDeserializer", "Lcom/datadog/android/api/InternalLogger;", "internalLogger", "Lkotlin/Function0;", "Lcom/google/gson/JsonObject;", "lastRumViewEventProvider", "nativeCrashSourceType", "<init>", "(Ljava/io/File;Ljava/util/concurrent/ExecutorService;Lcom/datadog/android/core/internal/persistence/Deserializer;Lcom/datadog/android/api/InternalLogger;Lkotlin/jvm/functions/Function0;Ljava/lang/String;)V", "", "getHighSpeedVideoFpsRangesFor", "()V", "Lcom/datadog/android/api/feature/FeatureSdkCore;", "sdkCore", "handleNdkCrash", "(Lcom/datadog/android/api/feature/FeatureSdkCore;)V", "prepareData", "getHighSpeedVideoSizes", "Ljava/util/concurrent/ExecutorService;", "getHighResolutionOutputSizeshNQ4ISI", "getHighSpeedVideoFpsRanges", "Lcom/datadog/android/api/InternalLogger;", "lastNdkCrashLog", "Lcom/datadog/android/ndk/internal/NdkCrashLog;", "getLastNdkCrashLog$dd_sdk_android_core_release", "()Lcom/datadog/android/ndk/internal/NdkCrashLog;", "setLastNdkCrashLog$dd_sdk_android_core_release", "(Lcom/datadog/android/ndk/internal/NdkCrashLog;)V", "lastRumViewEvent", "Lcom/google/gson/JsonObject;", "getLastRumViewEvent$dd_sdk_android_core_release", "()Lcom/google/gson/JsonObject;", "setLastRumViewEvent$dd_sdk_android_core_release", "(Lcom/google/gson/JsonObject;)V", "Lkotlin/jvm/functions/Function0;", "Camera2StreamConfigurationMap", "Ljava/lang/String;", "getNativeCrashSourceType$dd_sdk_android_core_release", "()Ljava/lang/String;", "ndkCrashDataDirectory", "Ljava/io/File;", "getNdkCrashDataDirectory$dd_sdk_android_core_release", "()Ljava/io/File;", "Lcom/datadog/android/core/internal/persistence/Deserializer;", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class DatadogNdkCrashHandler implements com.datadog.android.ndk.internal.NdkCrashHandler {
    public static final java.lang.String CRASH_DATA_FILE_NAME = "crash_log";

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.datadog.android.ndk.internal.DatadogNdkCrashHandler.Companion INSTANCE = new com.datadog.android.ndk.internal.DatadogNdkCrashHandler.Companion(null);
    public static final java.lang.String ERROR_READ_NDK_DIR = "Error while trying to read the NDK crash directory";
    public static final java.lang.String INFO_RUM_FEATURE_NOT_REGISTERED = "RUM feature is not registered, won't report NDK crash info as RUM error.";
    public static final java.lang.String LOG_CRASH_MSG = "NDK crash detected with signal: %s";
    public static final java.lang.String NDK_CRASH_REPORTS_FOLDER_NAME = "ndk_crash_reports_v2";
    public static final java.lang.String NETWORK_INFO_FILE_NAME = "network_information";
    public static final java.lang.String USER_INFO_FILE_NAME = "user_information";

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.datadog.android.core.internal.persistence.Deserializer<java.lang.String, com.datadog.android.ndk.internal.NdkCrashLog> getHighSpeedVideoSizes;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final kotlin.jvm.functions.Function0<com.google.gson.JsonObject> Camera2StreamConfigurationMap;
    private final com.datadog.android.api.InternalLogger getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final java.util.concurrent.ExecutorService getHighResolutionOutputSizeshNQ4ISI;
    private com.datadog.android.ndk.internal.NdkCrashLog lastNdkCrashLog;
    private com.google.gson.JsonObject lastRumViewEvent;
    private final java.lang.String nativeCrashSourceType;
    private final java.io.File ndkCrashDataDirectory;

    public DatadogNdkCrashHandler(java.io.File file, java.util.concurrent.ExecutorService executorService, com.datadog.android.core.internal.persistence.Deserializer<java.lang.String, com.datadog.android.ndk.internal.NdkCrashLog> deserializer, com.datadog.android.api.InternalLogger internalLogger, kotlin.jvm.functions.Function0<com.google.gson.JsonObject> function0, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(file, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(executorService, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deserializer, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(internalLogger, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.getHighResolutionOutputSizeshNQ4ISI = executorService;
        this.getHighSpeedVideoSizes = deserializer;
        this.getHighSpeedVideoFpsRanges = internalLogger;
        this.Camera2StreamConfigurationMap = function0;
        this.nativeCrashSourceType = str;
        this.ndkCrashDataDirectory = com.datadog.android.ndk.internal.DatadogNdkCrashHandler.Companion.access$getNdkGrantedDir(INSTANCE, file);
    }

    public /* synthetic */ DatadogNdkCrashHandler(java.io.File file, java.util.concurrent.ExecutorService executorService, com.datadog.android.core.internal.persistence.Deserializer deserializer, com.datadog.android.api.InternalLogger internalLogger, kotlin.jvm.functions.Function0 function0, java.lang.String str, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(file, executorService, deserializer, internalLogger, function0, (i & 32) != 0 ? "ndk" : str);
    }

    /* renamed from: getNativeCrashSourceType$dd_sdk_android_core_release, reason: from getter */
    public final java.lang.String getNativeCrashSourceType() {
        return this.nativeCrashSourceType;
    }

    /* renamed from: getNdkCrashDataDirectory$dd_sdk_android_core_release, reason: from getter */
    public final java.io.File getNdkCrashDataDirectory() {
        return this.ndkCrashDataDirectory;
    }

    /* renamed from: getLastRumViewEvent$dd_sdk_android_core_release, reason: from getter */
    public final com.google.gson.JsonObject getLastRumViewEvent() {
        return this.lastRumViewEvent;
    }

    public final void setLastRumViewEvent$dd_sdk_android_core_release(com.google.gson.JsonObject jsonObject) {
        this.lastRumViewEvent = jsonObject;
    }

    /* renamed from: getLastNdkCrashLog$dd_sdk_android_core_release, reason: from getter */
    public final com.datadog.android.ndk.internal.NdkCrashLog getLastNdkCrashLog() {
        return this.lastNdkCrashLog;
    }

    public final void setLastNdkCrashLog$dd_sdk_android_core_release(com.datadog.android.ndk.internal.NdkCrashLog ndkCrashLog) {
        this.lastNdkCrashLog = ndkCrashLog;
    }

    @Override // com.datadog.android.ndk.internal.NdkCrashHandler
    public final void prepareData() {
        com.datadog.android.core.internal.utils.ConcurrencyExtKt.executeSafe(this.getHighResolutionOutputSizeshNQ4ISI, "NDK crash check", this.getHighSpeedVideoFpsRanges, new java.lang.Runnable() { // from class: com.datadog.android.ndk.internal.DatadogNdkCrashHandler$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                com.datadog.android.ndk.internal.DatadogNdkCrashHandler.$r8$lambda$XRBsg64kIwYPsWaTP5IlHv_gTlE(com.datadog.android.ndk.internal.DatadogNdkCrashHandler.this);
            }
        });
    }

    @Override // com.datadog.android.ndk.internal.NdkCrashHandler
    public final void handleNdkCrash(final com.datadog.android.api.feature.FeatureSdkCore sdkCore) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sdkCore, "");
        com.datadog.android.core.internal.utils.ConcurrencyExtKt.executeSafe(this.getHighResolutionOutputSizeshNQ4ISI, "NDK crash report ", this.getHighSpeedVideoFpsRanges, new java.lang.Runnable() { // from class: com.datadog.android.ndk.internal.DatadogNdkCrashHandler$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                com.datadog.android.ndk.internal.DatadogNdkCrashHandler.m10014$r8$lambda$QW4EKU9x_f3xuDLxdqMlTiXMZQ(com.datadog.android.ndk.internal.DatadogNdkCrashHandler.this, sdkCore);
            }
        });
    }

    private final void getHighSpeedVideoFpsRangesFor() {
        if (com.datadog.android.core.internal.persistence.file.FileExtKt.existsSafe(this.ndkCrashDataDirectory, this.getHighSpeedVideoFpsRanges)) {
            try {
                java.io.File[] listFilesSafe = com.datadog.android.core.internal.persistence.file.FileExtKt.listFilesSafe(this.ndkCrashDataDirectory, this.getHighSpeedVideoFpsRanges);
                if (listFilesSafe != null) {
                    for (java.io.File file : listFilesSafe) {
                        kotlin.io.FilesKt.deleteRecursively(file);
                    }
                }
            } catch (java.lang.Throwable th) {
                com.datadog.android.api.InternalLogger.DefaultImpls.log$default(this.getHighSpeedVideoFpsRanges, com.datadog.android.api.InternalLogger.Level.ERROR, kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.datadog.android.api.InternalLogger.Target[]{com.datadog.android.api.InternalLogger.Target.MAINTAINER, com.datadog.android.api.InternalLogger.Target.TELEMETRY}), (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<java.lang.String>() { // from class: com.datadog.android.ndk.internal.DatadogNdkCrashHandler$clearCrashLog$2
                    @Override // kotlin.jvm.functions.Function0
                    /* renamed from: Camera2StreamConfigurationMap, reason: merged with bridge method [inline-methods] */
                    public final java.lang.String invoke() {
                        return "Unable to clear the NDK crash report file: ".concat(java.lang.String.valueOf(com.datadog.android.ndk.internal.DatadogNdkCrashHandler.this.getNdkCrashDataDirectory().getAbsolutePath()));
                    }

                    {
                        super(0);
                    }
                }, th, false, (java.util.Map) null, 48, (java.lang.Object) null);
            }
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\b\u0010\u0007J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\t\u0010\u0007J\u0017\u0010\n\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\n\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u000b\u0010\u0007R\u0014\u0010\r\u001a\u00020\f8\u0000X\u0080T¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\f8\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u000f\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\f8\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0010\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\f8\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0011\u0010\u000eR\u0014\u0010\u0012\u001a\u00020\f8\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0012\u0010\u000eR\u0014\u0010\u0013\u001a\u00020\f8\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0013\u0010\u000eR\u0014\u0010\u0014\u001a\u00020\f8\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0014\u0010\u000e"}, d2 = {"Lcom/datadog/android/ndk/internal/DatadogNdkCrashHandler$Companion;", "", "<init>", "()V", "Ljava/io/File;", "storageDir", "getGrantedNetworkInfoFile$dd_sdk_android_core_release", "(Ljava/io/File;)Ljava/io/File;", "getGrantedUserInfoFile$dd_sdk_android_core_release", "getLastViewEventFile$dd_sdk_android_core_release", "getPendingNetworkInfoFile$dd_sdk_android_core_release", "getPendingUserInfoFile$dd_sdk_android_core_release", "", "CRASH_DATA_FILE_NAME", "Ljava/lang/String;", "ERROR_READ_NDK_DIR", "INFO_RUM_FEATURE_NOT_REGISTERED", "LOG_CRASH_MSG", "NDK_CRASH_REPORTS_FOLDER_NAME", "NETWORK_INFO_FILE_NAME", "USER_INFO_FILE_NAME"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @kotlin.Deprecated(message = "We will still process this path to check file from the old SDK versions, but don't use it anymore for writing.")
        public final java.io.File getLastViewEventFile$dd_sdk_android_core_release(java.io.File storageDir) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(storageDir, "");
            return new java.io.File(new java.io.File(storageDir, com.datadog.android.ndk.internal.DatadogNdkCrashHandler.NDK_CRASH_REPORTS_FOLDER_NAME), com.datadog.android.core.internal.CoreFeature.LAST_RUM_VIEW_EVENT_FILE_NAME);
        }

        public final java.io.File getPendingNetworkInfoFile$dd_sdk_android_core_release(java.io.File storageDir) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(storageDir, "");
            return new java.io.File(new java.io.File(storageDir, "ndk_crash_reports_intermediary_v2"), com.datadog.android.ndk.internal.DatadogNdkCrashHandler.NETWORK_INFO_FILE_NAME);
        }

        public final java.io.File getGrantedNetworkInfoFile$dd_sdk_android_core_release(java.io.File storageDir) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(storageDir, "");
            return new java.io.File(new java.io.File(storageDir, com.datadog.android.ndk.internal.DatadogNdkCrashHandler.NDK_CRASH_REPORTS_FOLDER_NAME), com.datadog.android.ndk.internal.DatadogNdkCrashHandler.NETWORK_INFO_FILE_NAME);
        }

        public final java.io.File getPendingUserInfoFile$dd_sdk_android_core_release(java.io.File storageDir) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(storageDir, "");
            return new java.io.File(new java.io.File(storageDir, "ndk_crash_reports_intermediary_v2"), com.datadog.android.ndk.internal.DatadogNdkCrashHandler.USER_INFO_FILE_NAME);
        }

        public final java.io.File getGrantedUserInfoFile$dd_sdk_android_core_release(java.io.File storageDir) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(storageDir, "");
            return new java.io.File(new java.io.File(storageDir, com.datadog.android.ndk.internal.DatadogNdkCrashHandler.NDK_CRASH_REPORTS_FOLDER_NAME), com.datadog.android.ndk.internal.DatadogNdkCrashHandler.USER_INFO_FILE_NAME);
        }

        public static final /* synthetic */ java.io.File access$getNdkGrantedDir(com.datadog.android.ndk.internal.DatadogNdkCrashHandler.Companion companion, java.io.File file) {
            return new java.io.File(file, com.datadog.android.ndk.internal.DatadogNdkCrashHandler.NDK_CRASH_REPORTS_FOLDER_NAME);
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: $r8$lambda$QW-4EKU9x_f3xuDLxdqMlTiXMZQ, reason: not valid java name */
    public static /* synthetic */ void m10014$r8$lambda$QW4EKU9x_f3xuDLxdqMlTiXMZQ(com.datadog.android.ndk.internal.DatadogNdkCrashHandler datadogNdkCrashHandler, com.datadog.android.api.feature.FeatureSdkCore featureSdkCore) {
        com.datadog.android.ndk.internal.NdkCrashLog ndkCrashLog = datadogNdkCrashHandler.lastNdkCrashLog;
        if (ndkCrashLog != null) {
            com.google.gson.JsonObject jsonObject = datadogNdkCrashHandler.lastRumViewEvent;
            if (ndkCrashLog != null) {
                java.lang.String format = java.lang.String.format(java.util.Locale.US, LOG_CRASH_MSG, java.util.Arrays.copyOf(new java.lang.Object[]{ndkCrashLog.getSignalName()}, 1));
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format, "");
                if (jsonObject != null) {
                    com.datadog.android.api.feature.FeatureScope feature = featureSdkCore.getFeature("rum");
                    if (feature != null) {
                        feature.sendEvent(kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("type", com.datadog.android.rum.internal.RumFeature.NDK_CRASH_BUS_MESSAGE_TYPE), kotlin.TuplesKt.to("sourceType", datadogNdkCrashHandler.nativeCrashSourceType), kotlin.TuplesKt.to("timestamp", java.lang.Long.valueOf(ndkCrashLog.getTimestamp())), kotlin.TuplesKt.to("timeSinceAppStartMs", ndkCrashLog.getTimeSinceAppStartMs()), kotlin.TuplesKt.to("signalName", ndkCrashLog.getSignalName()), kotlin.TuplesKt.to("stacktrace", ndkCrashLog.getStacktrace()), kotlin.TuplesKt.to("message", format), kotlin.TuplesKt.to("lastViewEvent", jsonObject)));
                    } else {
                        com.datadog.android.api.InternalLogger.DefaultImpls.log$default(datadogNdkCrashHandler.getHighSpeedVideoFpsRanges, com.datadog.android.api.InternalLogger.Level.INFO, com.datadog.android.api.InternalLogger.Target.USER, (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<java.lang.String>() { // from class: com.datadog.android.ndk.internal.DatadogNdkCrashHandler$sendCrashRumEvent$1
                            @Override // kotlin.jvm.functions.Function0
                            /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: merged with bridge method [inline-methods] */
                            public final java.lang.String invoke() {
                                return "RUM feature is not registered, won't report NDK crash info as RUM error.";
                            }
                        }, (java.lang.Throwable) null, false, (java.util.Map) null, 56, (java.lang.Object) null);
                    }
                }
            }
            datadogNdkCrashHandler.lastRumViewEvent = null;
            datadogNdkCrashHandler.lastNdkCrashLog = null;
        }
    }

    public static /* synthetic */ void $r8$lambda$XRBsg64kIwYPsWaTP5IlHv_gTlE(com.datadog.android.ndk.internal.DatadogNdkCrashHandler datadogNdkCrashHandler) {
        if (com.datadog.android.core.internal.persistence.file.FileExtKt.existsSafe(datadogNdkCrashHandler.ndkCrashDataDirectory, datadogNdkCrashHandler.getHighSpeedVideoFpsRanges)) {
            try {
                datadogNdkCrashHandler.lastRumViewEvent = datadogNdkCrashHandler.Camera2StreamConfigurationMap.invoke();
                java.io.File[] listFilesSafe = com.datadog.android.core.internal.persistence.file.FileExtKt.listFilesSafe(datadogNdkCrashHandler.ndkCrashDataDirectory, datadogNdkCrashHandler.getHighSpeedVideoFpsRanges);
                if (listFilesSafe != null) {
                    for (java.io.File file : listFilesSafe) {
                        if (kotlin.jvm.internal.Intrinsics.areEqual(file.getName(), CRASH_DATA_FILE_NAME)) {
                            java.lang.String readTextSafe$default = com.datadog.android.core.internal.persistence.file.FileExtKt.readTextSafe$default(file, null, datadogNdkCrashHandler.getHighSpeedVideoFpsRanges, 1, null);
                            datadogNdkCrashHandler.lastNdkCrashLog = readTextSafe$default != null ? datadogNdkCrashHandler.getHighSpeedVideoSizes.deserialize(readTextSafe$default) : null;
                        }
                    }
                }
            } catch (java.lang.SecurityException e) {
                com.datadog.android.api.InternalLogger.DefaultImpls.log$default(datadogNdkCrashHandler.getHighSpeedVideoFpsRanges, com.datadog.android.api.InternalLogger.Level.ERROR, kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.datadog.android.api.InternalLogger.Target[]{com.datadog.android.api.InternalLogger.Target.MAINTAINER, com.datadog.android.api.InternalLogger.Target.TELEMETRY}), (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<java.lang.String>() { // from class: com.datadog.android.ndk.internal.DatadogNdkCrashHandler$readCrashData$2
                    @Override // kotlin.jvm.functions.Function0
                    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: merged with bridge method [inline-methods] */
                    public final java.lang.String invoke() {
                        return com.datadog.android.ndk.internal.DatadogNdkCrashHandler.ERROR_READ_NDK_DIR;
                    }
                }, (java.lang.Throwable) e, false, (java.util.Map) null, 48, (java.lang.Object) null);
            } finally {
                datadogNdkCrashHandler.getHighSpeedVideoFpsRangesFor();
            }
        }
    }
}
