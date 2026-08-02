package com.datadog.android.core.persistence;

@kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0011\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\u0003J\u0011\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u0001H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0013\u0010\u0012J)\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0015\u001a\u00020\u00142\b\u0010\u0016\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u001a\u0010\u001b"}, d2 = {"Lcom/datadog/android/core/persistence/NoOpPersistenceStrategy;", "Lcom/datadog/android/core/persistence/PersistenceStrategy;", "<init>", "()V", "", "currentMetadata", "()[B", "", "dropAll", "Lcom/datadog/android/core/persistence/PersistenceStrategy$Batch;", "lockAndReadNext", "()Lcom/datadog/android/core/persistence/PersistenceStrategy$Batch;", "targetStrategy", "migrateData", "(Lcom/datadog/android/core/persistence/PersistenceStrategy;)V", "", "batchId", "unlockAndDelete", "(Ljava/lang/String;)V", "unlockAndKeep", "Lcom/datadog/android/api/storage/RawBatchEvent;", "event", "batchMetadata", "Lcom/datadog/android/api/storage/EventType;", "eventType", "", "write", "(Lcom/datadog/android/api/storage/RawBatchEvent;[BLcom/datadog/android/api/storage/EventType;)Z"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class NoOpPersistenceStrategy implements com.datadog.android.core.persistence.PersistenceStrategy {
    @Override // com.datadog.android.core.persistence.PersistenceStrategy
    public final byte[] currentMetadata() {
        return null;
    }

    @Override // com.datadog.android.core.persistence.PersistenceStrategy
    public final void dropAll() {
    }

    @Override // com.datadog.android.core.persistence.PersistenceStrategy
    public final com.datadog.android.core.persistence.PersistenceStrategy.Batch lockAndReadNext() {
        return null;
    }

    @Override // com.datadog.android.core.persistence.PersistenceStrategy
    public final boolean write(com.datadog.android.api.storage.RawBatchEvent event, byte[] batchMetadata, com.datadog.android.api.storage.EventType eventType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eventType, "");
        return false;
    }

    @Override // com.datadog.android.core.persistence.PersistenceStrategy
    public final void unlockAndKeep(java.lang.String batchId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(batchId, "");
    }

    @Override // com.datadog.android.core.persistence.PersistenceStrategy
    public final void unlockAndDelete(java.lang.String batchId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(batchId, "");
    }

    @Override // com.datadog.android.core.persistence.PersistenceStrategy
    public final void migrateData(com.datadog.android.core.persistence.PersistenceStrategy targetStrategy) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(targetStrategy, "");
    }
}
