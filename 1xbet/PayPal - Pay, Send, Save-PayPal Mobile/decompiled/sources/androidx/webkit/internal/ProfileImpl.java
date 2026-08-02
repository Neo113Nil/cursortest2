package androidx.webkit.internal;

/* loaded from: classes7.dex */
public class ProfileImpl implements androidx.webkit.Profile {
    private final org.chromium.support_lib_boundary.ProfileBoundaryInterface Camera2StreamConfigurationMap;

    ProfileImpl(org.chromium.support_lib_boundary.ProfileBoundaryInterface profileBoundaryInterface) {
        this.Camera2StreamConfigurationMap = profileBoundaryInterface;
    }

    @Override // androidx.webkit.Profile
    public java.lang.String getName() {
        if (androidx.webkit.internal.WebViewFeatureInternal.MULTI_PROFILE.isSupportedByWebView()) {
            return this.Camera2StreamConfigurationMap.getName();
        }
        throw androidx.webkit.internal.WebViewFeatureInternal.getUnsupportedOperationException();
    }

    @Override // androidx.webkit.Profile
    public android.webkit.CookieManager getCookieManager() throws java.lang.IllegalStateException {
        if (androidx.webkit.internal.WebViewFeatureInternal.MULTI_PROFILE.isSupportedByWebView()) {
            return this.Camera2StreamConfigurationMap.getCookieManager();
        }
        throw androidx.webkit.internal.WebViewFeatureInternal.getUnsupportedOperationException();
    }

    @Override // androidx.webkit.Profile
    public android.webkit.WebStorage getWebStorage() throws java.lang.IllegalStateException {
        if (androidx.webkit.internal.WebViewFeatureInternal.MULTI_PROFILE.isSupportedByWebView()) {
            return this.Camera2StreamConfigurationMap.getWebStorage();
        }
        throw androidx.webkit.internal.WebViewFeatureInternal.getUnsupportedOperationException();
    }

    @Override // androidx.webkit.Profile
    public android.webkit.GeolocationPermissions getGeolocationPermissions() throws java.lang.IllegalStateException {
        if (androidx.webkit.internal.WebViewFeatureInternal.MULTI_PROFILE.isSupportedByWebView()) {
            return this.Camera2StreamConfigurationMap.getGeoLocationPermissions();
        }
        throw androidx.webkit.internal.WebViewFeatureInternal.getUnsupportedOperationException();
    }

    @Override // androidx.webkit.Profile
    public android.webkit.ServiceWorkerController getServiceWorkerController() throws java.lang.IllegalStateException {
        if (androidx.webkit.internal.WebViewFeatureInternal.MULTI_PROFILE.isSupportedByWebView()) {
            return this.Camera2StreamConfigurationMap.getServiceWorkerController();
        }
        throw androidx.webkit.internal.WebViewFeatureInternal.getUnsupportedOperationException();
    }

    @Override // androidx.webkit.Profile
    public void prefetchUrlAsync(java.lang.String str, android.os.CancellationSignal cancellationSignal, java.util.concurrent.Executor executor, androidx.webkit.SpeculativeLoadingParameters speculativeLoadingParameters, androidx.webkit.OutcomeReceiverCompat<java.lang.Void, androidx.webkit.PrefetchException> outcomeReceiverCompat) {
        if (androidx.webkit.internal.WebViewFeatureInternal.PROFILE_URL_PREFETCH.isSupportedByWebView()) {
            this.Camera2StreamConfigurationMap.prefetchUrl(str, cancellationSignal, executor, org.chromium.support_lib_boundary.util.BoundaryInterfaceReflectionUtil.createInvocationHandlerFor(new androidx.webkit.internal.SpeculativeLoadingParametersAdapter(speculativeLoadingParameters)), androidx.webkit.internal.PrefetchOperationCallbackAdapter.buildInvocationHandler(outcomeReceiverCompat));
            return;
        }
        throw androidx.webkit.internal.WebViewFeatureInternal.getUnsupportedOperationException();
    }

    @Override // androidx.webkit.Profile
    public void prefetchUrlAsync(java.lang.String str, android.os.CancellationSignal cancellationSignal, java.util.concurrent.Executor executor, androidx.webkit.OutcomeReceiverCompat<java.lang.Void, androidx.webkit.PrefetchException> outcomeReceiverCompat) {
        if (androidx.webkit.internal.WebViewFeatureInternal.PROFILE_URL_PREFETCH.isSupportedByWebView()) {
            this.Camera2StreamConfigurationMap.prefetchUrl(str, cancellationSignal, executor, androidx.webkit.internal.PrefetchOperationCallbackAdapter.buildInvocationHandler(outcomeReceiverCompat));
            return;
        }
        throw androidx.webkit.internal.WebViewFeatureInternal.getUnsupportedOperationException();
    }

    @Override // androidx.webkit.Profile
    public void clearPrefetchAsync(java.lang.String str, java.util.concurrent.Executor executor, androidx.webkit.OutcomeReceiverCompat<java.lang.Void, androidx.webkit.PrefetchException> outcomeReceiverCompat) {
        if (androidx.webkit.internal.WebViewFeatureInternal.PROFILE_URL_PREFETCH.isSupportedByWebView()) {
            this.Camera2StreamConfigurationMap.clearPrefetch(str, executor, androidx.webkit.internal.PrefetchOperationCallbackAdapter.buildInvocationHandler(outcomeReceiverCompat));
            return;
        }
        throw androidx.webkit.internal.WebViewFeatureInternal.getUnsupportedOperationException();
    }

    @Override // androidx.webkit.Profile
    public void setSpeculativeLoadingConfig(androidx.webkit.SpeculativeLoadingConfig speculativeLoadingConfig) {
        if (androidx.webkit.internal.WebViewFeatureInternal.SPECULATIVE_LOADING_CONFIG.isSupportedByWebView()) {
            this.Camera2StreamConfigurationMap.setSpeculativeLoadingConfig(org.chromium.support_lib_boundary.util.BoundaryInterfaceReflectionUtil.createInvocationHandlerFor(new androidx.webkit.internal.SpeculativeLoadingConfigAdapter(speculativeLoadingConfig)));
            return;
        }
        throw androidx.webkit.internal.WebViewFeatureInternal.getUnsupportedOperationException();
    }

    @Override // androidx.webkit.Profile
    public void warmUpRendererProcess() {
        if (androidx.webkit.internal.WebViewFeatureInternal.WARM_UP_RENDERER_PROCESS.isSupportedByWebView()) {
            this.Camera2StreamConfigurationMap.warmUpRendererProcess();
            return;
        }
        throw androidx.webkit.internal.WebViewFeatureInternal.getUnsupportedOperationException();
    }

    @Override // androidx.webkit.Profile
    public void setOriginMatchedHeader(java.lang.String str, java.lang.String str2, java.util.Set<java.lang.String> set) {
        if (androidx.webkit.internal.WebViewFeatureInternal.ORIGIN_MATCHED_HEADERS.isSupportedByWebView()) {
            this.Camera2StreamConfigurationMap.setOriginMatchedHeader(str, str2, set);
            return;
        }
        throw androidx.webkit.internal.WebViewFeatureInternal.getUnsupportedOperationException();
    }

    @Override // androidx.webkit.Profile
    public boolean hasOriginMatchedHeader(java.lang.String str) {
        if (androidx.webkit.internal.WebViewFeatureInternal.ORIGIN_MATCHED_HEADERS.isSupportedByWebView()) {
            return this.Camera2StreamConfigurationMap.hasOriginMatchedHeader(str);
        }
        throw androidx.webkit.internal.WebViewFeatureInternal.getUnsupportedOperationException();
    }

    @Override // androidx.webkit.Profile
    public void clearOriginMatchedHeader(java.lang.String str) {
        if (androidx.webkit.internal.WebViewFeatureInternal.ORIGIN_MATCHED_HEADERS.isSupportedByWebView()) {
            this.Camera2StreamConfigurationMap.clearOriginMatchedHeader(str);
            return;
        }
        throw androidx.webkit.internal.WebViewFeatureInternal.getUnsupportedOperationException();
    }

    @Override // androidx.webkit.Profile
    public void clearAllOriginMatchedHeaders() {
        if (androidx.webkit.internal.WebViewFeatureInternal.ORIGIN_MATCHED_HEADERS.isSupportedByWebView()) {
            this.Camera2StreamConfigurationMap.clearAllOriginMatchedHeaders();
            return;
        }
        throw androidx.webkit.internal.WebViewFeatureInternal.getUnsupportedOperationException();
    }

    @Override // androidx.webkit.Profile
    public void addCustomHeader(androidx.webkit.CustomHeader customHeader) {
        if (androidx.webkit.internal.WebViewFeatureInternal.CUSTOM_REQUEST_HEADERS.isSupportedByWebView()) {
            this.Camera2StreamConfigurationMap.addOriginMatchedHeader(customHeader.getName(), customHeader.getValue(), customHeader.getRules());
            return;
        }
        throw androidx.webkit.internal.WebViewFeatureInternal.getUnsupportedOperationException();
    }

    @Override // androidx.webkit.Profile
    public boolean hasCustomHeader(java.lang.String str) {
        if (androidx.webkit.internal.WebViewFeatureInternal.CUSTOM_REQUEST_HEADERS.isSupportedByWebView()) {
            return this.Camera2StreamConfigurationMap.hasOriginMatchedHeader(str);
        }
        throw androidx.webkit.internal.WebViewFeatureInternal.getUnsupportedOperationException();
    }

    @Override // androidx.webkit.Profile
    public java.util.Set<androidx.webkit.CustomHeader> getCustomHeaders() {
        if (androidx.webkit.internal.WebViewFeatureInternal.CUSTOM_REQUEST_HEADERS.isSupportedByWebView()) {
            return getHighSpeedVideoFpsRangesFor(null, null);
        }
        throw androidx.webkit.internal.WebViewFeatureInternal.getUnsupportedOperationException();
    }

    @Override // androidx.webkit.Profile
    public java.util.Set<androidx.webkit.CustomHeader> getCustomHeaders(java.lang.String str) {
        if (androidx.webkit.internal.WebViewFeatureInternal.CUSTOM_REQUEST_HEADERS.isSupportedByWebView()) {
            return getHighSpeedVideoFpsRangesFor(str, null);
        }
        throw androidx.webkit.internal.WebViewFeatureInternal.getUnsupportedOperationException();
    }

    @Override // androidx.webkit.Profile
    public java.util.Set<androidx.webkit.CustomHeader> getCustomHeaders(java.lang.String str, java.lang.String str2) {
        if (androidx.webkit.internal.WebViewFeatureInternal.CUSTOM_REQUEST_HEADERS.isSupportedByWebView()) {
            return getHighSpeedVideoFpsRangesFor(str, str2);
        }
        throw androidx.webkit.internal.WebViewFeatureInternal.getUnsupportedOperationException();
    }

    private java.util.Set<androidx.webkit.CustomHeader> getHighSpeedVideoFpsRangesFor(java.lang.String str, java.lang.String str2) {
        java.util.HashSet hashSet = new java.util.HashSet();
        java.util.Iterator<java.lang.reflect.InvocationHandler> it = this.Camera2StreamConfigurationMap.getOriginMatchedHeaders(str, str2).iterator();
        while (it.hasNext()) {
            org.chromium.support_lib_boundary.OriginMatchedHeaderBoundaryInterface originMatchedHeaderBoundaryInterface = (org.chromium.support_lib_boundary.OriginMatchedHeaderBoundaryInterface) org.chromium.support_lib_boundary.util.BoundaryInterfaceReflectionUtil.castToSuppLibClass(org.chromium.support_lib_boundary.OriginMatchedHeaderBoundaryInterface.class, it.next());
            hashSet.add(new androidx.webkit.CustomHeader(originMatchedHeaderBoundaryInterface.getName(), originMatchedHeaderBoundaryInterface.getValue(), originMatchedHeaderBoundaryInterface.getRules()));
        }
        return hashSet;
    }

    @Override // androidx.webkit.Profile
    public void clearCustomHeader(java.lang.String str) {
        if (androidx.webkit.internal.WebViewFeatureInternal.CUSTOM_REQUEST_HEADERS.isSupportedByWebView()) {
            this.Camera2StreamConfigurationMap.clearOriginMatchedHeader(str, null);
            return;
        }
        throw androidx.webkit.internal.WebViewFeatureInternal.getUnsupportedOperationException();
    }

    @Override // androidx.webkit.Profile
    public void clearCustomHeader(java.lang.String str, java.lang.String str2) {
        if (androidx.webkit.internal.WebViewFeatureInternal.CUSTOM_REQUEST_HEADERS.isSupportedByWebView()) {
            this.Camera2StreamConfigurationMap.clearOriginMatchedHeader(str, str2);
            return;
        }
        throw androidx.webkit.internal.WebViewFeatureInternal.getUnsupportedOperationException();
    }

    @Override // androidx.webkit.Profile
    public void clearAllCustomHeaders() {
        if (androidx.webkit.internal.WebViewFeatureInternal.CUSTOM_REQUEST_HEADERS.isSupportedByWebView()) {
            this.Camera2StreamConfigurationMap.clearAllOriginMatchedHeaders();
            return;
        }
        throw androidx.webkit.internal.WebViewFeatureInternal.getUnsupportedOperationException();
    }

    @Override // androidx.webkit.Profile
    public void preconnect(java.lang.String str) {
        if (androidx.webkit.internal.WebViewFeatureInternal.PRECONNECT.isSupportedByWebView()) {
            this.Camera2StreamConfigurationMap.preconnect(str);
            return;
        }
        throw androidx.webkit.internal.WebViewFeatureInternal.getUnsupportedOperationException();
    }

    @Override // androidx.webkit.Profile
    public void addQuicHints(java.util.Set<java.lang.String> set) {
        if (androidx.webkit.internal.WebViewFeatureInternal.ADD_QUIC_HINTS_V1.isSupportedByWebView()) {
            this.Camera2StreamConfigurationMap.addQuicHints(set);
            return;
        }
        throw androidx.webkit.internal.WebViewFeatureInternal.getUnsupportedOperationException();
    }
}
