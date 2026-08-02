package com.datadog.android.core.internal.configuration;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\r\b\u0080\b\u0018\u0000 #2\u00020\u0001:\u0001#B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÀ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÀ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u000bJ\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0017\u001a\u00020\u00168\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0003\u001a\u00020\u00028\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001d\u001a\u0004\b\u001e\u0010\u000bR\u001a\u0010\u001f\u001a\u00020\u00168\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u001f\u0010\u0018\u001a\u0004\b \u0010\u001aR\u001a\u0010!\u001a\u00020\u00168\u0001X\u0081\u0004¢\u0006\f\n\u0004\b!\u0010\u0018\u001a\u0004\b\"\u0010\u001a"}, d2 = {"Lcom/datadog/android/core/internal/configuration/DataUploadConfiguration;", "", "Lcom/datadog/android/core/configuration/UploadFrequency;", "frequency", "", "maxBatchesPerUploadJob", "<init>", "(Lcom/datadog/android/core/configuration/UploadFrequency;I)V", "component1$dd_sdk_android_core_release", "()Lcom/datadog/android/core/configuration/UploadFrequency;", "component2$dd_sdk_android_core_release", "()I", "copy", "(Lcom/datadog/android/core/configuration/UploadFrequency;I)Lcom/datadog/android/core/internal/configuration/DataUploadConfiguration;", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "", "toString", "()Ljava/lang/String;", "", "defaultDelayMs", "J", "getDefaultDelayMs$dd_sdk_android_core_release", "()J", "Lcom/datadog/android/core/configuration/UploadFrequency;", "getFrequency$dd_sdk_android_core_release", com.visa.cbp.getEncExpo.warmup, "getMaxBatchesPerUploadJob$dd_sdk_android_core_release", "maxDelayMs", "getMaxDelayMs$dd_sdk_android_core_release", "minDelayMs", "getMinDelayMs$dd_sdk_android_core_release", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class DataUploadConfiguration {
    public static final int DEFAULT_DELAY_FACTOR = 5;
    public static final int MAX_DELAY_FACTOR = 10;
    public static final int MIN_DELAY_FACTOR = 1;
    private final long defaultDelayMs;
    private final com.datadog.android.core.configuration.UploadFrequency frequency;
    private final int maxBatchesPerUploadJob;
    private final long maxDelayMs;
    private final long minDelayMs;

    public DataUploadConfiguration(com.datadog.android.core.configuration.UploadFrequency uploadFrequency, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uploadFrequency, "");
        this.frequency = uploadFrequency;
        this.maxBatchesPerUploadJob = i;
        this.minDelayMs = uploadFrequency.getBaseStepMs();
        this.maxDelayMs = uploadFrequency.getBaseStepMs() * 10;
        this.defaultDelayMs = uploadFrequency.getBaseStepMs() * 5;
    }

    public final com.datadog.android.core.configuration.UploadFrequency getFrequency$dd_sdk_android_core_release() {
        return this.frequency;
    }

    public final int getMaxBatchesPerUploadJob$dd_sdk_android_core_release() {
        return this.maxBatchesPerUploadJob;
    }

    /* renamed from: getMinDelayMs$dd_sdk_android_core_release, reason: from getter */
    public final long getMinDelayMs() {
        return this.minDelayMs;
    }

    /* renamed from: getMaxDelayMs$dd_sdk_android_core_release, reason: from getter */
    public final long getMaxDelayMs() {
        return this.maxDelayMs;
    }

    /* renamed from: getDefaultDelayMs$dd_sdk_android_core_release, reason: from getter */
    public final long getDefaultDelayMs() {
        return this.defaultDelayMs;
    }

    public final java.lang.String toString() {
        com.datadog.android.core.configuration.UploadFrequency uploadFrequency = this.frequency;
        int i = this.maxBatchesPerUploadJob;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("DataUploadConfiguration(frequency=");
        sb.append(uploadFrequency);
        sb.append(", maxBatchesPerUploadJob=");
        sb.append(i);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (this.frequency.hashCode() * 31) + java.lang.Integer.hashCode(this.maxBatchesPerUploadJob);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.datadog.android.core.internal.configuration.DataUploadConfiguration)) {
            return false;
        }
        com.datadog.android.core.internal.configuration.DataUploadConfiguration dataUploadConfiguration = (com.datadog.android.core.internal.configuration.DataUploadConfiguration) other;
        return this.frequency == dataUploadConfiguration.frequency && this.maxBatchesPerUploadJob == dataUploadConfiguration.maxBatchesPerUploadJob;
    }

    public final com.datadog.android.core.internal.configuration.DataUploadConfiguration copy(com.datadog.android.core.configuration.UploadFrequency frequency, int maxBatchesPerUploadJob) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(frequency, "");
        return new com.datadog.android.core.internal.configuration.DataUploadConfiguration(frequency, maxBatchesPerUploadJob);
    }

    /* renamed from: component2$dd_sdk_android_core_release, reason: from getter */
    public final int getMaxBatchesPerUploadJob() {
        return this.maxBatchesPerUploadJob;
    }

    /* renamed from: component1$dd_sdk_android_core_release, reason: from getter */
    public final com.datadog.android.core.configuration.UploadFrequency getFrequency() {
        return this.frequency;
    }

    public static /* synthetic */ com.datadog.android.core.internal.configuration.DataUploadConfiguration copy$default(com.datadog.android.core.internal.configuration.DataUploadConfiguration dataUploadConfiguration, com.datadog.android.core.configuration.UploadFrequency uploadFrequency, int i, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            uploadFrequency = dataUploadConfiguration.frequency;
        }
        if ((i2 & 2) != 0) {
            i = dataUploadConfiguration.maxBatchesPerUploadJob;
        }
        return dataUploadConfiguration.copy(uploadFrequency, i);
    }
}
