package com.datadog.android.core.internal.persistence;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\u0003J\u0011\u0010\n\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\f\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\f\u0010\b"}, d2 = {"Lcom/datadog/android/core/internal/persistence/NoOpDataReader;", "Lcom/datadog/android/core/internal/persistence/DataReader;", "<init>", "()V", "Lcom/datadog/android/core/internal/persistence/Batch;", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", com.datadog.trace.bootstrap.instrumentation.api.SamplerConstants.DROP, "(Lcom/datadog/android/core/internal/persistence/Batch;)V", "dropAll", "lockAndReadNext", "()Lcom/datadog/android/core/internal/persistence/Batch;", "release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class NoOpDataReader implements com.datadog.android.core.internal.persistence.DataReader {
    @Override // com.datadog.android.core.internal.persistence.DataReader
    public final void dropAll() {
    }

    @Override // com.datadog.android.core.internal.persistence.DataReader
    public final com.datadog.android.core.internal.persistence.Batch lockAndReadNext() {
        return null;
    }

    @Override // com.datadog.android.core.internal.persistence.DataReader
    public final void release(com.datadog.android.core.internal.persistence.Batch data) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
    }

    @Override // com.datadog.android.core.internal.persistence.DataReader
    public final void drop(com.datadog.android.core.internal.persistence.Batch data) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
    }
}
