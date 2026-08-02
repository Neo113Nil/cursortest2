package com.datadog.android.rum.internal;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0096\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0010\u0010\u0011"}, d2 = {"Lcom/datadog/android/rum/internal/NoOpRumSessionListener;", "Lcom/datadog/android/rum/RumSessionListener;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "sessionId", "isDiscarded", "", "onSessionStarted", "(Ljava/lang/String;Z)V"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class NoOpRumSessionListener implements com.datadog.android.rum.RumSessionListener {
    public final int hashCode() {
        return 0;
    }

    public final boolean equals(java.lang.Object other) {
        return other != null && (other instanceof com.datadog.android.rum.internal.NoOpRumSessionListener);
    }

    @Override // com.datadog.android.rum.RumSessionListener
    public final void onSessionStarted(java.lang.String sessionId, boolean isDiscarded) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sessionId, "");
    }
}
