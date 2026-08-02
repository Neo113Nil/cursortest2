package androidx.webkit.internal;

/* loaded from: classes7.dex */
public class WebViewStartUpCallbackAdapter implements org.chromium.support_lib_boundary.WebViewStartUpCallbackBoundaryInterface {
    private final androidx.webkit.WebViewCompat.WebViewStartUpCallback Camera2StreamConfigurationMap;

    public WebViewStartUpCallbackAdapter(androidx.webkit.WebViewCompat.WebViewStartUpCallback webViewStartUpCallback) {
        this.Camera2StreamConfigurationMap = webViewStartUpCallback;
    }

    @Override // org.chromium.support_lib_boundary.WebViewStartUpCallbackBoundaryInterface
    public void onSuccess(java.lang.reflect.InvocationHandler invocationHandler) {
        org.chromium.support_lib_boundary.WebViewStartUpResultBoundaryInterface webViewStartUpResultBoundaryInterface = (org.chromium.support_lib_boundary.WebViewStartUpResultBoundaryInterface) java.util.Objects.requireNonNull((org.chromium.support_lib_boundary.WebViewStartUpResultBoundaryInterface) org.chromium.support_lib_boundary.util.BoundaryInterfaceReflectionUtil.castToSuppLibClass(org.chromium.support_lib_boundary.WebViewStartUpResultBoundaryInterface.class, invocationHandler));
        this.Camera2StreamConfigurationMap.onSuccess(new androidx.webkit.WebViewStartUpResult(Camera2StreamConfigurationMap(webViewStartUpResultBoundaryInterface.getBlockingStartUpLocations()), androidx.webkit.internal.WebViewFeatureInternal.ASYNC_WEBVIEW_STARTUP_ASYNC_STARTUP_LOCATIONS.isSupportedByWebView() ? Camera2StreamConfigurationMap(webViewStartUpResultBoundaryInterface.getAsyncStartUpLocations()) : null, webViewStartUpResultBoundaryInterface) { // from class: androidx.webkit.internal.WebViewStartUpCallbackAdapter.1
            final /* synthetic */ org.chromium.support_lib_boundary.WebViewStartUpResultBoundaryInterface Camera2StreamConfigurationMap;
            final /* synthetic */ java.util.List getHighResolutionOutputSizeshNQ4ISI;
            private final java.util.List<androidx.webkit.StartUpLocation> getHighSpeedVideoFpsRanges;
            final /* synthetic */ java.util.List getHighSpeedVideoFpsRangesFor;
            private final java.util.List<androidx.webkit.StartUpLocation> getOutputMinFrameDuration;

            {
                this.getHighSpeedVideoFpsRangesFor = r2;
                this.getHighResolutionOutputSizeshNQ4ISI = r3;
                this.Camera2StreamConfigurationMap = webViewStartUpResultBoundaryInterface;
                this.getOutputMinFrameDuration = r2;
                this.getHighSpeedVideoFpsRanges = r3;
            }

            @Override // androidx.webkit.WebViewStartUpResult
            public java.lang.Long getTotalTimeInUiThreadMillis() {
                return this.Camera2StreamConfigurationMap.getTotalTimeInUiThreadMillis();
            }

            @Override // androidx.webkit.WebViewStartUpResult
            public java.lang.Long getMaxTimePerTaskInUiThreadMillis() {
                return this.Camera2StreamConfigurationMap.getMaxTimePerTaskInUiThreadMillis();
            }

            @Override // androidx.webkit.WebViewStartUpResult
            public java.util.List<androidx.webkit.StartUpLocation> getUiThreadBlockingStartUpLocations() {
                return this.getOutputMinFrameDuration;
            }

            @Override // androidx.webkit.WebViewStartUpResult
            public java.util.List<androidx.webkit.StartUpLocation> getNonUiThreadBlockingStartUpLocations() {
                return this.getHighSpeedVideoFpsRanges;
            }
        });
    }

    static class StartUpLocationImpl implements androidx.webkit.StartUpLocation {
        private final java.lang.Throwable getHighSpeedVideoFpsRanges;

        StartUpLocationImpl(java.lang.Throwable th) {
            this.getHighSpeedVideoFpsRanges = th;
        }

        @Override // androidx.webkit.StartUpLocation
        public java.lang.String getStackInformation() {
            java.io.StringWriter stringWriter = new java.io.StringWriter();
            this.getHighSpeedVideoFpsRanges.printStackTrace(new java.io.PrintWriter(stringWriter));
            return stringWriter.toString();
        }
    }

    private static java.util.List<androidx.webkit.StartUpLocation> Camera2StreamConfigurationMap(java.util.List<java.lang.Throwable> list) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator<java.lang.Throwable> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new androidx.webkit.internal.WebViewStartUpCallbackAdapter.StartUpLocationImpl(it.next()));
        }
        return arrayList;
    }
}
