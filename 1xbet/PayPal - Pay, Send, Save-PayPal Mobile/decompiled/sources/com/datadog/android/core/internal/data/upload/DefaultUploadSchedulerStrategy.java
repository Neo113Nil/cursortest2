package com.datadog.android.core.internal.data.upload;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J3\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\b2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR \u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\r0\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0003\u001a\u00020\u00028\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/datadog/android/core/internal/data/upload/DefaultUploadSchedulerStrategy;", "Lcom/datadog/android/core/configuration/UploadSchedulerStrategy;", "Lcom/datadog/android/core/internal/configuration/DataUploadConfiguration;", "uploadConfiguration", "<init>", "(Lcom/datadog/android/core/internal/configuration/DataUploadConfiguration;)V", "", "featureName", "", "uploadAttempts", "lastStatusCode", "", com.datadog.android.rum.internal.RumFeature.EVENT_THROWABLE_PROPERTY, "", "getMsDelayUntilNextUpload", "(Ljava/lang/String;ILjava/lang/Integer;Ljava/lang/Throwable;)J", "Ljava/util/concurrent/ConcurrentHashMap;", "getHighSpeedVideoSizes", "Ljava/util/concurrent/ConcurrentHashMap;", "getHighSpeedVideoFpsRangesFor", "Lcom/datadog/android/core/internal/configuration/DataUploadConfiguration;", "getUploadConfiguration$dd_sdk_android_core_release", "()Lcom/datadog/android/core/internal/configuration/DataUploadConfiguration;", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class DefaultUploadSchedulerStrategy implements com.datadog.android.core.configuration.UploadSchedulerStrategy {
    public static final double INCREASE_PERCENT = 1.1d;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.Long> getHighSpeedVideoFpsRangesFor;
    private final com.datadog.android.core.internal.configuration.DataUploadConfiguration uploadConfiguration;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.datadog.android.core.internal.data.upload.DefaultUploadSchedulerStrategy.Companion INSTANCE = new com.datadog.android.core.internal.data.upload.DefaultUploadSchedulerStrategy.Companion(null);
    private static final long NETWORK_ERROR_DELAY_MS = java.util.concurrent.TimeUnit.MINUTES.toMillis(1);

    public DefaultUploadSchedulerStrategy(com.datadog.android.core.internal.configuration.DataUploadConfiguration dataUploadConfiguration) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dataUploadConfiguration, "");
        this.uploadConfiguration = dataUploadConfiguration;
        this.getHighSpeedVideoFpsRangesFor = new java.util.concurrent.ConcurrentHashMap<>();
    }

    /* renamed from: getUploadConfiguration$dd_sdk_android_core_release, reason: from getter */
    public final com.datadog.android.core.internal.configuration.DataUploadConfiguration getUploadConfiguration() {
        return this.uploadConfiguration;
    }

    @Override // com.datadog.android.core.configuration.UploadSchedulerStrategy
    public final long getMsDelayUntilNextUpload(java.lang.String featureName, int uploadAttempts, java.lang.Integer lastStatusCode, java.lang.Throwable throwable) {
        long min;
        java.lang.Long putIfAbsent;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(featureName, "");
        java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.Long> concurrentHashMap = this.getHighSpeedVideoFpsRangesFor;
        java.lang.Long l = concurrentHashMap.get(featureName);
        if (l == null && (putIfAbsent = concurrentHashMap.putIfAbsent(featureName, (l = java.lang.Long.valueOf(this.uploadConfiguration.getDefaultDelayMs())))) != null) {
            l = putIfAbsent;
        }
        java.lang.Long l2 = l;
        if (uploadAttempts > 0 && throwable == null && lastStatusCode != null && lastStatusCode.intValue() == 202) {
            min = this.uploadConfiguration.getMinDelayMs();
        } else {
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(l2, "");
            long roundToLong = kotlin.math.MathKt.roundToLong(l2.longValue() * 1.1d);
            if (throwable instanceof java.io.IOException) {
                min = NETWORK_ERROR_DELAY_MS;
            } else {
                min = java.lang.Math.min(this.uploadConfiguration.getMaxDelayMs(), roundToLong);
            }
        }
        this.getHighSpeedVideoFpsRangesFor.put(featureName, java.lang.Long.valueOf(min));
        return min;
    }

    @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u001a\u0010\b\u001a\u00020\u00078\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b"}, d2 = {"Lcom/datadog/android/core/internal/data/upload/DefaultUploadSchedulerStrategy$Companion;", "", "<init>", "()V", "", "INCREASE_PERCENT", "D", "", "NETWORK_ERROR_DELAY_MS", "J", "getNETWORK_ERROR_DELAY_MS$dd_sdk_android_core_release", "()J"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final long getNETWORK_ERROR_DELAY_MS$dd_sdk_android_core_release() {
            return com.datadog.android.core.internal.data.upload.DefaultUploadSchedulerStrategy.NETWORK_ERROR_DELAY_MS;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
