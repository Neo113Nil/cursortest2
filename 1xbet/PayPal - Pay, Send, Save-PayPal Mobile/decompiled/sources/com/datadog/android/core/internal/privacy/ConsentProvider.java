package com.datadog.android.core.internal.privacy;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\b`\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0002H&¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0007H&¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\u000f\u0010\t"}, d2 = {"Lcom/datadog/android/core/internal/privacy/ConsentProvider;", "", "Lcom/datadog/android/privacy/TrackingConsent;", "getConsent", "()Lcom/datadog/android/privacy/TrackingConsent;", "Lcom/datadog/android/privacy/TrackingConsentProviderCallback;", com.sun.jna.Callback.METHOD_NAME, "", "registerCallback", "(Lcom/datadog/android/privacy/TrackingConsentProviderCallback;)V", com.datadog.android.core.internal.metrics.BatchMetricsDispatcher.TRACKING_CONSENT_KEY, "setConsent", "(Lcom/datadog/android/privacy/TrackingConsent;)V", "unregisterAllCallbacks", "()V", "unregisterCallback"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface ConsentProvider {
    com.datadog.android.privacy.TrackingConsent getConsent();

    void registerCallback(com.datadog.android.privacy.TrackingConsentProviderCallback callback);

    void setConsent(com.datadog.android.privacy.TrackingConsent consent);

    void unregisterAllCallbacks();

    void unregisterCallback(com.datadog.android.privacy.TrackingConsentProviderCallback callback);
}
