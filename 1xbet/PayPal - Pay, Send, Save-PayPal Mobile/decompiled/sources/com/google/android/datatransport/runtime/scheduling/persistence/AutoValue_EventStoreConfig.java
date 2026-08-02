package com.google.android.datatransport.runtime.scheduling.persistence;

/* loaded from: classes3.dex */
final class AutoValue_EventStoreConfig extends com.google.android.datatransport.runtime.scheduling.persistence.EventStoreConfig {
    private final int criticalSectionEnterTimeoutMs;
    private final long eventCleanUpAge;
    private final int loadBatchSize;
    private final int maxBlobByteSizePerRow;
    private final long maxStorageSizeInBytes;

    private AutoValue_EventStoreConfig(long j, int i, int i2, long j2, int i3) {
        this.maxStorageSizeInBytes = j;
        this.loadBatchSize = i;
        this.criticalSectionEnterTimeoutMs = i2;
        this.eventCleanUpAge = j2;
        this.maxBlobByteSizePerRow = i3;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.EventStoreConfig
    final long getMaxStorageSizeInBytes() {
        return this.maxStorageSizeInBytes;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.EventStoreConfig
    final int getLoadBatchSize() {
        return this.loadBatchSize;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.EventStoreConfig
    final int getCriticalSectionEnterTimeoutMs() {
        return this.criticalSectionEnterTimeoutMs;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.EventStoreConfig
    final long getEventCleanUpAge() {
        return this.eventCleanUpAge;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.EventStoreConfig
    final int getMaxBlobByteSizePerRow() {
        return this.maxBlobByteSizePerRow;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("EventStoreConfig{maxStorageSizeInBytes=");
        sb.append(this.maxStorageSizeInBytes);
        sb.append(", loadBatchSize=");
        sb.append(this.loadBatchSize);
        sb.append(", criticalSectionEnterTimeoutMs=");
        sb.append(this.criticalSectionEnterTimeoutMs);
        sb.append(", eventCleanUpAge=");
        sb.append(this.eventCleanUpAge);
        sb.append(", maxBlobByteSizePerRow=");
        sb.append(this.maxBlobByteSizePerRow);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.google.android.datatransport.runtime.scheduling.persistence.EventStoreConfig)) {
            return false;
        }
        com.google.android.datatransport.runtime.scheduling.persistence.EventStoreConfig eventStoreConfig = (com.google.android.datatransport.runtime.scheduling.persistence.EventStoreConfig) obj;
        return this.maxStorageSizeInBytes == eventStoreConfig.getMaxStorageSizeInBytes() && this.loadBatchSize == eventStoreConfig.getLoadBatchSize() && this.criticalSectionEnterTimeoutMs == eventStoreConfig.getCriticalSectionEnterTimeoutMs() && this.eventCleanUpAge == eventStoreConfig.getEventCleanUpAge() && this.maxBlobByteSizePerRow == eventStoreConfig.getMaxBlobByteSizePerRow();
    }

    public final int hashCode() {
        long j = this.maxStorageSizeInBytes;
        int i = this.loadBatchSize;
        int i2 = this.criticalSectionEnterTimeoutMs;
        long j2 = this.eventCleanUpAge;
        return ((((((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ i) * 1000003) ^ i2) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ this.maxBlobByteSizePerRow;
    }

    static final class Builder extends com.google.android.datatransport.runtime.scheduling.persistence.EventStoreConfig.Builder {
        private java.lang.Integer criticalSectionEnterTimeoutMs;
        private java.lang.Long eventCleanUpAge;
        private java.lang.Integer loadBatchSize;
        private java.lang.Integer maxBlobByteSizePerRow;
        private java.lang.Long maxStorageSizeInBytes;

        Builder() {
        }

        @Override // com.google.android.datatransport.runtime.scheduling.persistence.EventStoreConfig.Builder
        final com.google.android.datatransport.runtime.scheduling.persistence.EventStoreConfig.Builder setMaxStorageSizeInBytes(long j) {
            this.maxStorageSizeInBytes = java.lang.Long.valueOf(j);
            return this;
        }

        @Override // com.google.android.datatransport.runtime.scheduling.persistence.EventStoreConfig.Builder
        final com.google.android.datatransport.runtime.scheduling.persistence.EventStoreConfig.Builder setLoadBatchSize(int i) {
            this.loadBatchSize = java.lang.Integer.valueOf(i);
            return this;
        }

        @Override // com.google.android.datatransport.runtime.scheduling.persistence.EventStoreConfig.Builder
        final com.google.android.datatransport.runtime.scheduling.persistence.EventStoreConfig.Builder setCriticalSectionEnterTimeoutMs(int i) {
            this.criticalSectionEnterTimeoutMs = java.lang.Integer.valueOf(i);
            return this;
        }

        @Override // com.google.android.datatransport.runtime.scheduling.persistence.EventStoreConfig.Builder
        final com.google.android.datatransport.runtime.scheduling.persistence.EventStoreConfig.Builder setEventCleanUpAge(long j) {
            this.eventCleanUpAge = java.lang.Long.valueOf(j);
            return this;
        }

        @Override // com.google.android.datatransport.runtime.scheduling.persistence.EventStoreConfig.Builder
        final com.google.android.datatransport.runtime.scheduling.persistence.EventStoreConfig.Builder setMaxBlobByteSizePerRow(int i) {
            this.maxBlobByteSizePerRow = java.lang.Integer.valueOf(i);
            return this;
        }

        @Override // com.google.android.datatransport.runtime.scheduling.persistence.EventStoreConfig.Builder
        final com.google.android.datatransport.runtime.scheduling.persistence.EventStoreConfig build() {
            java.lang.String str;
            if (this.maxStorageSizeInBytes != null) {
                str = "";
            } else {
                str = " maxStorageSizeInBytes";
            }
            if (this.loadBatchSize == null) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append(str);
                sb.append(" loadBatchSize");
                str = sb.toString();
            }
            if (this.criticalSectionEnterTimeoutMs == null) {
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                sb2.append(str);
                sb2.append(" criticalSectionEnterTimeoutMs");
                str = sb2.toString();
            }
            if (this.eventCleanUpAge == null) {
                java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
                sb3.append(str);
                sb3.append(" eventCleanUpAge");
                str = sb3.toString();
            }
            if (this.maxBlobByteSizePerRow == null) {
                java.lang.StringBuilder sb4 = new java.lang.StringBuilder();
                sb4.append(str);
                sb4.append(" maxBlobByteSizePerRow");
                str = sb4.toString();
            }
            if (!str.isEmpty()) {
                throw new java.lang.IllegalStateException("Missing required properties:".concat(java.lang.String.valueOf(str)));
            }
            return new com.google.android.datatransport.runtime.scheduling.persistence.AutoValue_EventStoreConfig(this.maxStorageSizeInBytes.longValue(), this.loadBatchSize.intValue(), this.criticalSectionEnterTimeoutMs.intValue(), this.eventCleanUpAge.longValue(), this.maxBlobByteSizePerRow.intValue());
        }
    }
}
