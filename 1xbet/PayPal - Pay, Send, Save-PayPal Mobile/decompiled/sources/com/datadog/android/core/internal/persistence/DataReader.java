package com.datadog.android.core.internal.persistence;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\b`\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\bJ\u0011\u0010\t\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u000b\u0010\u0006"}, d2 = {"Lcom/datadog/android/core/internal/persistence/DataReader;", "", "Lcom/datadog/android/core/internal/persistence/Batch;", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", com.datadog.trace.bootstrap.instrumentation.api.SamplerConstants.DROP, "(Lcom/datadog/android/core/internal/persistence/Batch;)V", "dropAll", "()V", "lockAndReadNext", "()Lcom/datadog/android/core/internal/persistence/Batch;", "release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface DataReader {
    void drop(com.datadog.android.core.internal.persistence.Batch data);

    void dropAll();

    com.datadog.android.core.internal.persistence.Batch lockAndReadNext();

    void release(com.datadog.android.core.internal.persistence.Batch data);
}
