package com.datadog.android.sessionreplay.internal.recorder;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/datadog/android/sessionreplay/internal/recorder/NoOpTimeBank;", "Lcom/datadog/android/sessionreplay/internal/recorder/TimeBank;", "<init>", "()V", "", "executionTime", "", "consume", "(J)V", "timestamp", "", "updateAndCheck", "(J)Z"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class NoOpTimeBank implements com.datadog.android.sessionreplay.internal.recorder.TimeBank {
    @Override // com.datadog.android.sessionreplay.internal.recorder.TimeBank
    public final void consume(long executionTime) {
    }

    @Override // com.datadog.android.sessionreplay.internal.recorder.TimeBank
    public final boolean updateAndCheck(long timestamp) {
        return false;
    }
}
