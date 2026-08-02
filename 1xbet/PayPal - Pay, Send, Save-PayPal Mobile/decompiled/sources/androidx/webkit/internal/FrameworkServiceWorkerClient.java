package androidx.webkit.internal;

/* loaded from: classes7.dex */
public class FrameworkServiceWorkerClient extends android.webkit.ServiceWorkerClient {
    private final androidx.webkit.ServiceWorkerClientCompat getHighSpeedVideoFpsRangesFor;

    public FrameworkServiceWorkerClient(androidx.webkit.ServiceWorkerClientCompat serviceWorkerClientCompat) {
        this.getHighSpeedVideoFpsRangesFor = serviceWorkerClientCompat;
    }

    @Override // android.webkit.ServiceWorkerClient
    public android.webkit.WebResourceResponse shouldInterceptRequest(android.webkit.WebResourceRequest webResourceRequest) {
        return this.getHighSpeedVideoFpsRangesFor.shouldInterceptRequest(webResourceRequest);
    }
}
