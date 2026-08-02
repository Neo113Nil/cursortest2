package androidx.webkit.internal;

/* loaded from: classes7.dex */
public class ServiceWorkerControllerImpl extends androidx.webkit.ServiceWorkerControllerCompat {
    private final androidx.webkit.ServiceWorkerWebSettingsCompat getHighResolutionOutputSizeshNQ4ISI;
    private android.webkit.ServiceWorkerController getHighSpeedVideoFpsRangesFor;
    private org.chromium.support_lib_boundary.ServiceWorkerControllerBoundaryInterface getHighSpeedVideoSizes;

    public ServiceWorkerControllerImpl() {
        androidx.webkit.internal.ApiFeature.N n = androidx.webkit.internal.WebViewFeatureInternal.SERVICE_WORKER_BASIC_USAGE;
        if (n.isSupportedByFramework()) {
            android.webkit.ServiceWorkerController serviceWorkerControllerInstance = androidx.webkit.internal.ApiHelperForN.getServiceWorkerControllerInstance();
            this.getHighSpeedVideoFpsRangesFor = serviceWorkerControllerInstance;
            this.getHighSpeedVideoSizes = null;
            if (serviceWorkerControllerInstance == null) {
                this.getHighSpeedVideoFpsRangesFor = androidx.webkit.internal.ApiHelperForN.getServiceWorkerControllerInstance();
            }
            this.getHighResolutionOutputSizeshNQ4ISI = androidx.webkit.internal.ApiHelperForN.getServiceWorkerWebSettingsImpl(this.getHighSpeedVideoFpsRangesFor);
            return;
        }
        if (n.isSupportedByWebView()) {
            this.getHighSpeedVideoFpsRangesFor = null;
            org.chromium.support_lib_boundary.ServiceWorkerControllerBoundaryInterface serviceWorkerController = androidx.webkit.internal.WebViewGlueCommunicator.getFactory().getServiceWorkerController();
            this.getHighSpeedVideoSizes = serviceWorkerController;
            this.getHighResolutionOutputSizeshNQ4ISI = new androidx.webkit.internal.ServiceWorkerWebSettingsImpl(serviceWorkerController.getServiceWorkerWebSettings());
            return;
        }
        throw androidx.webkit.internal.WebViewFeatureInternal.getUnsupportedOperationException();
    }

    @Override // androidx.webkit.ServiceWorkerControllerCompat
    public androidx.webkit.ServiceWorkerWebSettingsCompat getServiceWorkerWebSettings() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    @Override // androidx.webkit.ServiceWorkerControllerCompat
    public void setServiceWorkerClient(androidx.webkit.ServiceWorkerClientCompat serviceWorkerClientCompat) {
        androidx.webkit.internal.ApiFeature.N n = androidx.webkit.internal.WebViewFeatureInternal.SERVICE_WORKER_BASIC_USAGE;
        if (n.isSupportedByFramework()) {
            if (serviceWorkerClientCompat == null) {
                if (this.getHighSpeedVideoFpsRangesFor == null) {
                    this.getHighSpeedVideoFpsRangesFor = androidx.webkit.internal.ApiHelperForN.getServiceWorkerControllerInstance();
                }
                androidx.webkit.internal.ApiHelperForN.setServiceWorkerClient(this.getHighSpeedVideoFpsRangesFor, null);
                return;
            } else {
                if (this.getHighSpeedVideoFpsRangesFor == null) {
                    this.getHighSpeedVideoFpsRangesFor = androidx.webkit.internal.ApiHelperForN.getServiceWorkerControllerInstance();
                }
                androidx.webkit.internal.ApiHelperForN.setServiceWorkerClientCompat(this.getHighSpeedVideoFpsRangesFor, serviceWorkerClientCompat);
                return;
            }
        }
        if (!n.isSupportedByWebView()) {
            throw androidx.webkit.internal.WebViewFeatureInternal.getUnsupportedOperationException();
        }
        if (serviceWorkerClientCompat == null) {
            if (this.getHighSpeedVideoSizes == null) {
                this.getHighSpeedVideoSizes = androidx.webkit.internal.WebViewGlueCommunicator.getFactory().getServiceWorkerController();
            }
            this.getHighSpeedVideoSizes.setServiceWorkerClient(null);
        } else {
            if (this.getHighSpeedVideoSizes == null) {
                this.getHighSpeedVideoSizes = androidx.webkit.internal.WebViewGlueCommunicator.getFactory().getServiceWorkerController();
            }
            this.getHighSpeedVideoSizes.setServiceWorkerClient(org.chromium.support_lib_boundary.util.BoundaryInterfaceReflectionUtil.createInvocationHandlerFor(new androidx.webkit.internal.ServiceWorkerClientAdapter(serviceWorkerClientCompat)));
        }
    }
}
