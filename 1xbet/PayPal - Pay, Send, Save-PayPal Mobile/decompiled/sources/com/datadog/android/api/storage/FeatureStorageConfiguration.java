package com.datadog.android.api.storage;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\b\u0018\u0000  2\u00020\u0001:\u0001 B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000bJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000bJ8\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0016\u0010\rJ\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0006\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b\u001b\u0010\u000bR\u001a\u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001c\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001d\u001a\u0004\b\u001e\u0010\rR\u001a\u0010\u0007\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001a\u001a\u0004\b\u001f\u0010\u000b"}, d2 = {"Lcom/datadog/android/api/storage/FeatureStorageConfiguration;", "", "", "maxItemSize", "", "maxItemsPerBatch", "maxBatchSize", "oldBatchThreshold", "<init>", "(JIJJ)V", "component1", "()J", "component2", "()I", "component3", "component4", "copy", "(JIJJ)Lcom/datadog/android/api/storage/FeatureStorageConfiguration;", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "", "toString", "()Ljava/lang/String;", "J", "getMaxBatchSize", "getMaxItemSize", com.visa.cbp.getEncExpo.warmup, "getMaxItemsPerBatch", "getOldBatchThreshold", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class FeatureStorageConfiguration {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.datadog.android.api.storage.FeatureStorageConfiguration.Companion INSTANCE = new com.datadog.android.api.storage.FeatureStorageConfiguration.Companion(null);
    private static final com.datadog.android.api.storage.FeatureStorageConfiguration DEFAULT = new com.datadog.android.api.storage.FeatureStorageConfiguration(com.datadog.android.core.internal.persistence.file.FilePersistenceConfig.MAX_ITEM_SIZE, 500, 4194304, com.datadog.android.core.internal.persistence.file.FilePersistenceConfig.OLD_FILE_THRESHOLD);
    private final long maxBatchSize;
    private final long maxItemSize;
    private final int maxItemsPerBatch;
    private final long oldBatchThreshold;

    public FeatureStorageConfiguration(long j, int i, long j2, long j3) {
        this.maxItemSize = j;
        this.maxItemsPerBatch = i;
        this.maxBatchSize = j2;
        this.oldBatchThreshold = j3;
    }

    public final long getMaxItemSize() {
        return this.maxItemSize;
    }

    public final int getMaxItemsPerBatch() {
        return this.maxItemsPerBatch;
    }

    public final long getMaxBatchSize() {
        return this.maxBatchSize;
    }

    public final long getOldBatchThreshold() {
        return this.oldBatchThreshold;
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/datadog/android/api/storage/FeatureStorageConfiguration$Companion;", "", "<init>", "()V", "Lcom/datadog/android/api/storage/FeatureStorageConfiguration;", "DEFAULT", "Lcom/datadog/android/api/storage/FeatureStorageConfiguration;", "getDEFAULT", "()Lcom/datadog/android/api/storage/FeatureStorageConfiguration;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final com.datadog.android.api.storage.FeatureStorageConfiguration getDEFAULT() {
            return com.datadog.android.api.storage.FeatureStorageConfiguration.DEFAULT;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final java.lang.String toString() {
        long j = this.maxItemSize;
        int i = this.maxItemsPerBatch;
        long j2 = this.maxBatchSize;
        long j3 = this.oldBatchThreshold;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("FeatureStorageConfiguration(maxItemSize=");
        sb.append(j);
        sb.append(", maxItemsPerBatch=");
        sb.append(i);
        sb.append(", maxBatchSize=");
        sb.append(j2);
        sb.append(", oldBatchThreshold=");
        sb.append(j3);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((((java.lang.Long.hashCode(this.maxItemSize) * 31) + java.lang.Integer.hashCode(this.maxItemsPerBatch)) * 31) + java.lang.Long.hashCode(this.maxBatchSize)) * 31) + java.lang.Long.hashCode(this.oldBatchThreshold);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.datadog.android.api.storage.FeatureStorageConfiguration)) {
            return false;
        }
        com.datadog.android.api.storage.FeatureStorageConfiguration featureStorageConfiguration = (com.datadog.android.api.storage.FeatureStorageConfiguration) other;
        return this.maxItemSize == featureStorageConfiguration.maxItemSize && this.maxItemsPerBatch == featureStorageConfiguration.maxItemsPerBatch && this.maxBatchSize == featureStorageConfiguration.maxBatchSize && this.oldBatchThreshold == featureStorageConfiguration.oldBatchThreshold;
    }

    public final com.datadog.android.api.storage.FeatureStorageConfiguration copy(long maxItemSize, int maxItemsPerBatch, long maxBatchSize, long oldBatchThreshold) {
        return new com.datadog.android.api.storage.FeatureStorageConfiguration(maxItemSize, maxItemsPerBatch, maxBatchSize, oldBatchThreshold);
    }

    /* renamed from: component4, reason: from getter */
    public final long getOldBatchThreshold() {
        return this.oldBatchThreshold;
    }

    /* renamed from: component3, reason: from getter */
    public final long getMaxBatchSize() {
        return this.maxBatchSize;
    }

    /* renamed from: component2, reason: from getter */
    public final int getMaxItemsPerBatch() {
        return this.maxItemsPerBatch;
    }

    /* renamed from: component1, reason: from getter */
    public final long getMaxItemSize() {
        return this.maxItemSize;
    }
}
