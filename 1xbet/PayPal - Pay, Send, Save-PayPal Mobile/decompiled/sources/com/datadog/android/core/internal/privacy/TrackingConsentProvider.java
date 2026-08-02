package com.datadog.android.core.internal.privacy;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u0005J\u000f\u0010\u000e\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0010\u0010\fR\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\b0\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0016\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015"}, d2 = {"Lcom/datadog/android/core/internal/privacy/TrackingConsentProvider;", "Lcom/datadog/android/core/internal/privacy/ConsentProvider;", "Lcom/datadog/android/privacy/TrackingConsent;", com.datadog.android.core.internal.metrics.BatchMetricsDispatcher.TRACKING_CONSENT_KEY, "<init>", "(Lcom/datadog/android/privacy/TrackingConsent;)V", "getConsent", "()Lcom/datadog/android/privacy/TrackingConsent;", "Lcom/datadog/android/privacy/TrackingConsentProviderCallback;", com.sun.jna.Callback.METHOD_NAME, "", "registerCallback", "(Lcom/datadog/android/privacy/TrackingConsentProviderCallback;)V", "setConsent", "unregisterAllCallbacks", "()V", "unregisterCallback", "Ljava/util/LinkedList;", "getHighSpeedVideoFpsRangesFor", "Ljava/util/LinkedList;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/datadog/android/privacy/TrackingConsent;", "getHighSpeedVideoFpsRanges"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class TrackingConsentProvider implements com.datadog.android.core.internal.privacy.ConsentProvider {

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private volatile com.datadog.android.privacy.TrackingConsent getHighSpeedVideoFpsRanges;
    private final java.util.LinkedList<com.datadog.android.privacy.TrackingConsentProviderCallback> getHighSpeedVideoFpsRangesFor;

    public TrackingConsentProvider(com.datadog.android.privacy.TrackingConsent trackingConsent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(trackingConsent, "");
        this.getHighSpeedVideoFpsRangesFor = new java.util.LinkedList<>();
        this.getHighSpeedVideoFpsRanges = trackingConsent;
    }

    @Override // com.datadog.android.core.internal.privacy.ConsentProvider
    /* renamed from: getConsent, reason: from getter */
    public final com.datadog.android.privacy.TrackingConsent getGetHighSpeedVideoFpsRanges() {
        return this.getHighSpeedVideoFpsRanges;
    }

    @Override // com.datadog.android.core.internal.privacy.ConsentProvider
    public final void setConsent(com.datadog.android.privacy.TrackingConsent consent) {
        synchronized (this) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(consent, "");
            if (consent == this.getHighSpeedVideoFpsRanges) {
                return;
            }
            com.datadog.android.privacy.TrackingConsent trackingConsent = this.getHighSpeedVideoFpsRanges;
            this.getHighSpeedVideoFpsRanges = consent;
            java.util.Iterator<T> it = this.getHighSpeedVideoFpsRangesFor.iterator();
            while (it.hasNext()) {
                ((com.datadog.android.privacy.TrackingConsentProviderCallback) it.next()).onConsentUpdated(trackingConsent, consent);
            }
        }
    }

    @Override // com.datadog.android.core.internal.privacy.ConsentProvider
    public final void registerCallback(com.datadog.android.privacy.TrackingConsentProviderCallback callback) {
        synchronized (this) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callback, "");
            this.getHighSpeedVideoFpsRangesFor.add(callback);
        }
    }

    @Override // com.datadog.android.core.internal.privacy.ConsentProvider
    public final void unregisterCallback(com.datadog.android.privacy.TrackingConsentProviderCallback callback) {
        synchronized (this) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callback, "");
            this.getHighSpeedVideoFpsRangesFor.remove(callback);
        }
    }

    @Override // com.datadog.android.core.internal.privacy.ConsentProvider
    public final void unregisterAllCallbacks() {
        synchronized (this) {
            this.getHighSpeedVideoFpsRangesFor.clear();
        }
    }
}
