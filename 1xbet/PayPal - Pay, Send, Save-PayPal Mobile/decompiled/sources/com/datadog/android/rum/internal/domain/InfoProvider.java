package com.datadog.android.rum.internal.domain;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b`\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00028\u0000H&¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/datadog/android/rum/internal/domain/InfoProvider;", "Lcom/datadog/android/rum/internal/domain/InfoData;", "T", "", "", "cleanup", "()V", "getState", "()Lcom/datadog/android/rum/internal/domain/InfoData;"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public interface InfoProvider<T extends com.datadog.android.rum.internal.domain.InfoData> {
    void cleanup();

    T getState();
}
