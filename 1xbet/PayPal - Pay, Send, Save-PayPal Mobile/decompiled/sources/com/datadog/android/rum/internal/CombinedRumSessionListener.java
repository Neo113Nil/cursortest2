package com.datadog.android.rum.internal;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bR\u001c\u0010\r\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/datadog/android/rum/internal/CombinedRumSessionListener;", "Lcom/datadog/android/rum/RumSessionListener;", "listeners", "<init>", "([Lcom/datadog/android/rum/RumSessionListener;)V", "", "sessionId", "", "isDiscarded", "", "onSessionStarted", "(Ljava/lang/String;Z)V", "", "Camera2StreamConfigurationMap", "[Lcom/datadog/android/rum/RumSessionListener;"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class CombinedRumSessionListener implements com.datadog.android.rum.RumSessionListener {
    private final com.datadog.android.rum.RumSessionListener[] Camera2StreamConfigurationMap;

    public CombinedRumSessionListener(com.datadog.android.rum.RumSessionListener... rumSessionListenerArr) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rumSessionListenerArr, "");
        this.Camera2StreamConfigurationMap = rumSessionListenerArr;
    }

    @Override // com.datadog.android.rum.RumSessionListener
    public final void onSessionStarted(java.lang.String sessionId, boolean isDiscarded) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sessionId, "");
        for (com.datadog.android.rum.RumSessionListener rumSessionListener : this.Camera2StreamConfigurationMap) {
            rumSessionListener.onSessionStarted(sessionId, isDiscarded);
        }
    }
}
