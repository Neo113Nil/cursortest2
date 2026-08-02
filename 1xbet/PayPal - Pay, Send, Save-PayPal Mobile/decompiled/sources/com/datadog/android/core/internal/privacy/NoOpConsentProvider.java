package com.datadog.android.core.internal.privacy;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000f\u0010\u0003J\u0017\u0010\u0010\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0010\u0010\u000b"}, d2 = {"Lcom/datadog/android/core/internal/privacy/NoOpConsentProvider;", "Lcom/datadog/android/core/internal/privacy/ConsentProvider;", "<init>", "()V", "Lcom/datadog/android/privacy/TrackingConsent;", "getConsent", "()Lcom/datadog/android/privacy/TrackingConsent;", "Lcom/datadog/android/privacy/TrackingConsentProviderCallback;", com.sun.jna.Callback.METHOD_NAME, "", "registerCallback", "(Lcom/datadog/android/privacy/TrackingConsentProviderCallback;)V", com.datadog.android.core.internal.metrics.BatchMetricsDispatcher.TRACKING_CONSENT_KEY, "setConsent", "(Lcom/datadog/android/privacy/TrackingConsent;)V", "unregisterAllCallbacks", "unregisterCallback"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class NoOpConsentProvider implements com.datadog.android.core.internal.privacy.ConsentProvider {
    @Override // com.datadog.android.core.internal.privacy.ConsentProvider
    public final void unregisterAllCallbacks() {
    }

    @Override // com.datadog.android.core.internal.privacy.ConsentProvider
    public final com.datadog.android.privacy.TrackingConsent getConsent() {
        return com.datadog.android.privacy.TrackingConsent.GRANTED;
    }

    @Override // com.datadog.android.core.internal.privacy.ConsentProvider
    public final void unregisterCallback(com.datadog.android.privacy.TrackingConsentProviderCallback callback) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callback, "");
    }

    @Override // com.datadog.android.core.internal.privacy.ConsentProvider
    public final void setConsent(com.datadog.android.privacy.TrackingConsent consent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(consent, "");
    }

    @Override // com.datadog.android.core.internal.privacy.ConsentProvider
    public final void registerCallback(com.datadog.android.privacy.TrackingConsentProviderCallback callback) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callback, "");
    }
}
