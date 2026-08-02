package com.datadog.android.privacy;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H&¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/datadog/android/privacy/TrackingConsentProviderCallback;", "", "Lcom/datadog/android/privacy/TrackingConsent;", "previousConsent", "newConsent", "", "onConsentUpdated", "(Lcom/datadog/android/privacy/TrackingConsent;Lcom/datadog/android/privacy/TrackingConsent;)V"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface TrackingConsentProviderCallback {
    void onConsentUpdated(com.datadog.android.privacy.TrackingConsent previousConsent, com.datadog.android.privacy.TrackingConsent newConsent);
}
