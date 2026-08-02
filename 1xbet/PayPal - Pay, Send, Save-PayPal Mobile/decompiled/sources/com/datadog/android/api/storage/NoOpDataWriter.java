package com.datadog.android.api.storage;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J'\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00028\u00002\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/datadog/android/api/storage/NoOpDataWriter;", "T", "Lcom/datadog/android/api/storage/DataWriter;", "<init>", "()V", "Lcom/datadog/android/api/storage/EventBatchWriter;", "writer", "element", "Lcom/datadog/android/api/storage/EventType;", "eventType", "", "write", "(Lcom/datadog/android/api/storage/EventBatchWriter;Ljava/lang/Object;Lcom/datadog/android/api/storage/EventType;)Z"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class NoOpDataWriter<T> implements com.datadog.android.api.storage.DataWriter<T> {
    @Override // com.datadog.android.api.storage.DataWriter
    public final boolean write(com.datadog.android.api.storage.EventBatchWriter writer, T element, com.datadog.android.api.storage.EventType eventType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eventType, "");
        return false;
    }
}
