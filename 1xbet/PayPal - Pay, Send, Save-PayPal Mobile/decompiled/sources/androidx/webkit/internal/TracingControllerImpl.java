package androidx.webkit.internal;

/* loaded from: classes7.dex */
public class TracingControllerImpl extends androidx.webkit.TracingController {
    private org.chromium.support_lib_boundary.TracingControllerBoundaryInterface getHighSpeedVideoFpsRanges;
    private android.webkit.TracingController getHighSpeedVideoFpsRangesFor;

    public TracingControllerImpl() {
        androidx.webkit.internal.ApiFeature.P p = androidx.webkit.internal.WebViewFeatureInternal.TRACING_CONTROLLER_BASIC_USAGE;
        if (p.isSupportedByFramework()) {
            this.getHighSpeedVideoFpsRangesFor = androidx.webkit.internal.ApiHelperForP.getTracingControllerInstance();
            this.getHighSpeedVideoFpsRanges = null;
        } else {
            if (p.isSupportedByWebView()) {
                this.getHighSpeedVideoFpsRangesFor = null;
                this.getHighSpeedVideoFpsRanges = androidx.webkit.internal.WebViewGlueCommunicator.getFactory().getTracingController();
                return;
            }
            throw androidx.webkit.internal.WebViewFeatureInternal.getUnsupportedOperationException();
        }
    }

    @Override // androidx.webkit.TracingController
    public boolean isTracing() {
        androidx.webkit.internal.ApiFeature.P p = androidx.webkit.internal.WebViewFeatureInternal.TRACING_CONTROLLER_BASIC_USAGE;
        if (!p.isSupportedByFramework()) {
            if (!p.isSupportedByWebView()) {
                throw androidx.webkit.internal.WebViewFeatureInternal.getUnsupportedOperationException();
            }
            if (this.getHighSpeedVideoFpsRanges == null) {
                this.getHighSpeedVideoFpsRanges = androidx.webkit.internal.WebViewGlueCommunicator.getFactory().getTracingController();
            }
            return this.getHighSpeedVideoFpsRanges.isTracing();
        }
        if (this.getHighSpeedVideoFpsRangesFor == null) {
            this.getHighSpeedVideoFpsRangesFor = androidx.webkit.internal.ApiHelperForP.getTracingControllerInstance();
        }
        return androidx.webkit.internal.ApiHelperForP.isTracing(this.getHighSpeedVideoFpsRangesFor);
    }

    @Override // androidx.webkit.TracingController
    public void start(androidx.webkit.TracingConfig tracingConfig) {
        if (tracingConfig == null) {
            throw new java.lang.IllegalArgumentException("Tracing config must be non null");
        }
        androidx.webkit.internal.ApiFeature.P p = androidx.webkit.internal.WebViewFeatureInternal.TRACING_CONTROLLER_BASIC_USAGE;
        if (!p.isSupportedByFramework()) {
            if (!p.isSupportedByWebView()) {
                throw androidx.webkit.internal.WebViewFeatureInternal.getUnsupportedOperationException();
            }
            if (this.getHighSpeedVideoFpsRanges == null) {
                this.getHighSpeedVideoFpsRanges = androidx.webkit.internal.WebViewGlueCommunicator.getFactory().getTracingController();
            }
            this.getHighSpeedVideoFpsRanges.start(tracingConfig.getPredefinedCategories(), tracingConfig.getCustomIncludedCategories(), tracingConfig.getTracingMode());
            return;
        }
        if (this.getHighSpeedVideoFpsRangesFor == null) {
            this.getHighSpeedVideoFpsRangesFor = androidx.webkit.internal.ApiHelperForP.getTracingControllerInstance();
        }
        androidx.webkit.internal.ApiHelperForP.start(this.getHighSpeedVideoFpsRangesFor, tracingConfig);
    }

    @Override // androidx.webkit.TracingController
    public boolean stop(java.io.OutputStream outputStream, java.util.concurrent.Executor executor) {
        androidx.webkit.internal.ApiFeature.P p = androidx.webkit.internal.WebViewFeatureInternal.TRACING_CONTROLLER_BASIC_USAGE;
        if (!p.isSupportedByFramework()) {
            if (!p.isSupportedByWebView()) {
                throw androidx.webkit.internal.WebViewFeatureInternal.getUnsupportedOperationException();
            }
            if (this.getHighSpeedVideoFpsRanges == null) {
                this.getHighSpeedVideoFpsRanges = androidx.webkit.internal.WebViewGlueCommunicator.getFactory().getTracingController();
            }
            return this.getHighSpeedVideoFpsRanges.stop(outputStream, executor);
        }
        if (this.getHighSpeedVideoFpsRangesFor == null) {
            this.getHighSpeedVideoFpsRangesFor = androidx.webkit.internal.ApiHelperForP.getTracingControllerInstance();
        }
        return androidx.webkit.internal.ApiHelperForP.stop(this.getHighSpeedVideoFpsRangesFor, outputStream, executor);
    }
}
