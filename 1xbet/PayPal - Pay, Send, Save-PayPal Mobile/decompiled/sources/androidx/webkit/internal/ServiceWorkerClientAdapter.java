package androidx.webkit.internal;

/* loaded from: classes7.dex */
public class ServiceWorkerClientAdapter implements org.chromium.support_lib_boundary.ServiceWorkerClientBoundaryInterface {
    private final androidx.webkit.ServiceWorkerClientCompat getHighResolutionOutputSizeshNQ4ISI;

    public ServiceWorkerClientAdapter(androidx.webkit.ServiceWorkerClientCompat serviceWorkerClientCompat) {
        this.getHighResolutionOutputSizeshNQ4ISI = serviceWorkerClientCompat;
    }

    @Override // org.chromium.support_lib_boundary.ServiceWorkerClientBoundaryInterface
    public android.webkit.WebResourceResponse shouldInterceptRequest(android.webkit.WebResourceRequest webResourceRequest) {
        return this.getHighResolutionOutputSizeshNQ4ISI.shouldInterceptRequest(webResourceRequest);
    }

    @Override // org.chromium.support_lib_boundary.FeatureFlagHolderBoundaryInterface
    public java.lang.String[] getSupportedFeatures() {
        return new java.lang.String[]{"SERVICE_WORKER_SHOULD_INTERCEPT_REQUEST"};
    }
}
