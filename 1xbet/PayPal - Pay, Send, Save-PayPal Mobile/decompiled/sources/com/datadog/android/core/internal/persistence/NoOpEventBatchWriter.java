package com.datadog.android.core.internal.persistence;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0011\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J)\u0010\r\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u00072\b\u0010\t\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/datadog/android/core/internal/persistence/NoOpEventBatchWriter;", "Lcom/datadog/android/api/storage/EventBatchWriter;", "<init>", "()V", "", "currentMetadata", "()[B", "Lcom/datadog/android/api/storage/RawBatchEvent;", "event", "batchMetadata", "Lcom/datadog/android/api/storage/EventType;", "eventType", "", "write", "(Lcom/datadog/android/api/storage/RawBatchEvent;[BLcom/datadog/android/api/storage/EventType;)Z"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class NoOpEventBatchWriter implements com.datadog.android.api.storage.EventBatchWriter {
    @Override // com.datadog.android.api.storage.EventBatchWriter
    public final byte[] currentMetadata() {
        return null;
    }

    @Override // com.datadog.android.api.storage.EventBatchWriter
    public final boolean write(com.datadog.android.api.storage.RawBatchEvent event, byte[] batchMetadata, com.datadog.android.api.storage.EventType eventType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eventType, "");
        return true;
    }
}
