package com.datadog.android.core.persistence;

@kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001:\u0002\u001b\u001cJ\u0011\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\u0006\u0010\u0007J\u0011\u0010\t\u001a\u0004\u0018\u00010\bH&¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u0000H&¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u000eH&¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u000eH&¢\u0006\u0004\b\u0012\u0010\u0011J)\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0014\u001a\u00020\u00132\b\u0010\u0015\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0017\u001a\u00020\u0016H&¢\u0006\u0004\b\u0019\u0010\u001a"}, d2 = {"Lcom/datadog/android/core/persistence/PersistenceStrategy;", "", "", "currentMetadata", "()[B", "", "dropAll", "()V", "Lcom/datadog/android/core/persistence/PersistenceStrategy$Batch;", "lockAndReadNext", "()Lcom/datadog/android/core/persistence/PersistenceStrategy$Batch;", "targetStrategy", "migrateData", "(Lcom/datadog/android/core/persistence/PersistenceStrategy;)V", "", "batchId", "unlockAndDelete", "(Ljava/lang/String;)V", "unlockAndKeep", "Lcom/datadog/android/api/storage/RawBatchEvent;", "event", "batchMetadata", "Lcom/datadog/android/api/storage/EventType;", "eventType", "", "write", "(Lcom/datadog/android/api/storage/RawBatchEvent;[BLcom/datadog/android/api/storage/EventType;)Z", "Batch", "Factory"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface PersistenceStrategy {

    @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J'\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Lcom/datadog/android/core/persistence/PersistenceStrategy$Factory;", "", "", "identifier", "", "maxItemsPerBatch", "", "maxBatchSize", "Lcom/datadog/android/core/persistence/PersistenceStrategy;", "create", "(Ljava/lang/String;IJ)Lcom/datadog/android/core/persistence/PersistenceStrategy;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public interface Factory {
        com.datadog.android.core.persistence.PersistenceStrategy create(java.lang.String identifier, int maxItemsPerBatch, long maxBatchSize);
    }

    byte[] currentMetadata();

    void dropAll();

    com.datadog.android.core.persistence.PersistenceStrategy.Batch lockAndReadNext();

    void migrateData(com.datadog.android.core.persistence.PersistenceStrategy targetStrategy);

    void unlockAndDelete(java.lang.String batchId);

    void unlockAndKeep(java.lang.String batchId);

    boolean write(com.datadog.android.api.storage.RawBatchEvent event, byte[] batchMetadata, com.datadog.android.api.storage.EventType eventType);

    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0016\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J6\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001a\u0010\fR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\fR \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u001d\u001a\u0004\b\u001e\u0010\u0010R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001f\u001a\u0004\b \u0010\u000e"}, d2 = {"Lcom/datadog/android/core/persistence/PersistenceStrategy$Batch;", "", "", "batchId", "", "metadata", "", "Lcom/datadog/android/api/storage/RawBatchEvent;", "events", "<init>", "(Ljava/lang/String;[BLjava/util/List;)V", "component1", "()Ljava/lang/String;", "component2", "()[B", "component3", "()Ljava/util/List;", "copy", "(Ljava/lang/String;[BLjava/util/List;)Lcom/datadog/android/core/persistence/PersistenceStrategy$Batch;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getBatchId", "Ljava/util/List;", "getEvents", "[B", "getMetadata"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class Batch {
        private final java.lang.String batchId;
        private final java.util.List<com.datadog.android.api.storage.RawBatchEvent> events;
        private final byte[] metadata;

        public Batch(java.lang.String str, byte[] bArr, java.util.List<com.datadog.android.api.storage.RawBatchEvent> list) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            this.batchId = str;
            this.metadata = bArr;
            this.events = list;
        }

        public final java.lang.String getBatchId() {
            return this.batchId;
        }

        public final byte[] getMetadata() {
            return this.metadata;
        }

        public /* synthetic */ Batch(java.lang.String str, byte[] bArr, java.util.ArrayList arrayList, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? null : bArr, (i & 4) != 0 ? new java.util.ArrayList() : arrayList);
        }

        public final java.util.List<com.datadog.android.api.storage.RawBatchEvent> getEvents() {
            return this.events;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.batchId;
            java.lang.String arrays = java.util.Arrays.toString(this.metadata);
            java.util.List<com.datadog.android.api.storage.RawBatchEvent> list = this.events;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Batch(batchId=");
            sb.append(str);
            sb.append(", metadata=");
            sb.append(arrays);
            sb.append(", events=");
            sb.append(list);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.batchId.hashCode();
            byte[] bArr = this.metadata;
            return (((hashCode * 31) + (bArr == null ? 0 : java.util.Arrays.hashCode(bArr))) * 31) + this.events.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.datadog.android.core.persistence.PersistenceStrategy.Batch)) {
                return false;
            }
            com.datadog.android.core.persistence.PersistenceStrategy.Batch batch = (com.datadog.android.core.persistence.PersistenceStrategy.Batch) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.batchId, batch.batchId) && kotlin.jvm.internal.Intrinsics.areEqual(this.metadata, batch.metadata) && kotlin.jvm.internal.Intrinsics.areEqual(this.events, batch.events);
        }

        public final com.datadog.android.core.persistence.PersistenceStrategy.Batch copy(java.lang.String batchId, byte[] metadata, java.util.List<com.datadog.android.api.storage.RawBatchEvent> events) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(batchId, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(events, "");
            return new com.datadog.android.core.persistence.PersistenceStrategy.Batch(batchId, metadata, events);
        }

        public final java.util.List<com.datadog.android.api.storage.RawBatchEvent> component3() {
            return this.events;
        }

        /* renamed from: component2, reason: from getter */
        public final byte[] getMetadata() {
            return this.metadata;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getBatchId() {
            return this.batchId;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.datadog.android.core.persistence.PersistenceStrategy.Batch copy$default(com.datadog.android.core.persistence.PersistenceStrategy.Batch batch, java.lang.String str, byte[] bArr, java.util.List list, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = batch.batchId;
            }
            if ((i & 2) != 0) {
                bArr = batch.metadata;
            }
            if ((i & 4) != 0) {
                list = batch.events;
            }
            return batch.copy(str, bArr, list);
        }
    }
}
