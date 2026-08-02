package androidx.webkit.internal;

/* loaded from: classes7.dex */
public class WebViewProviderAdapter {
    final org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface getHighSpeedVideoFpsRanges;

    public WebViewProviderAdapter(org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface webViewProviderBoundaryInterface) {
        this.getHighSpeedVideoFpsRanges = webViewProviderBoundaryInterface;
    }

    public void insertVisualStateCallback(long j, androidx.webkit.WebViewCompat.VisualStateCallback visualStateCallback) {
        this.getHighSpeedVideoFpsRanges.insertVisualStateCallback(j, org.chromium.support_lib_boundary.util.BoundaryInterfaceReflectionUtil.createInvocationHandlerFor(new androidx.webkit.internal.VisualStateCallbackAdapter(visualStateCallback)));
    }

    public androidx.webkit.WebMessagePortCompat[] createWebMessageChannel() {
        java.lang.reflect.InvocationHandler[] createWebMessageChannel = this.getHighSpeedVideoFpsRanges.createWebMessageChannel();
        androidx.webkit.WebMessagePortCompat[] webMessagePortCompatArr = new androidx.webkit.WebMessagePortCompat[createWebMessageChannel.length];
        for (int i = 0; i < createWebMessageChannel.length; i++) {
            webMessagePortCompatArr[i] = new androidx.webkit.internal.WebMessagePortImpl(createWebMessageChannel[i]);
        }
        return webMessagePortCompatArr;
    }

    public void postWebMessage(androidx.webkit.WebMessageCompat webMessageCompat, android.net.Uri uri) {
        this.getHighSpeedVideoFpsRanges.postMessageToMainFrame(org.chromium.support_lib_boundary.util.BoundaryInterfaceReflectionUtil.createInvocationHandlerFor(new androidx.webkit.internal.WebMessageAdapter(webMessageCompat)), uri);
    }

    public void addWebMessageListener(java.lang.String str, java.lang.String[] strArr, androidx.webkit.WebViewCompat.WebMessageListener webMessageListener) {
        this.getHighSpeedVideoFpsRanges.addWebMessageListener(str, strArr, org.chromium.support_lib_boundary.util.BoundaryInterfaceReflectionUtil.createInvocationHandlerFor(new androidx.webkit.internal.WebMessageListenerAdapter(webMessageListener)));
    }

    public androidx.webkit.internal.ScriptHandlerImpl addDocumentStartJavaScript(java.lang.String str, java.lang.String[] strArr) {
        return androidx.webkit.internal.ScriptHandlerImpl.toScriptHandler(this.getHighSpeedVideoFpsRanges.addDocumentStartJavaScript(str, strArr));
    }

    public void removeWebMessageListener(java.lang.String str) {
        this.getHighSpeedVideoFpsRanges.removeWebMessageListener(str);
    }

    public android.webkit.WebViewClient getWebViewClient() {
        return this.getHighSpeedVideoFpsRanges.getWebViewClient();
    }

    public android.webkit.WebChromeClient getWebChromeClient() {
        return this.getHighSpeedVideoFpsRanges.getWebChromeClient();
    }

    public androidx.webkit.WebViewRenderProcess getWebViewRenderProcess() {
        return androidx.webkit.internal.WebViewRenderProcessImpl.forInvocationHandler(this.getHighSpeedVideoFpsRanges.getWebViewRenderer());
    }

    public androidx.webkit.WebViewRenderProcessClient getWebViewRenderProcessClient() {
        java.lang.reflect.InvocationHandler webViewRendererClient = this.getHighSpeedVideoFpsRanges.getWebViewRendererClient();
        if (webViewRendererClient == null) {
            return null;
        }
        return ((androidx.webkit.internal.WebViewRenderProcessClientAdapter) org.chromium.support_lib_boundary.util.BoundaryInterfaceReflectionUtil.getDelegateFromInvocationHandler(webViewRendererClient)).getWebViewRenderProcessClient();
    }

    public void setWebViewRenderProcessClient(java.util.concurrent.Executor executor, androidx.webkit.WebViewRenderProcessClient webViewRenderProcessClient) {
        this.getHighSpeedVideoFpsRanges.setWebViewRendererClient(webViewRenderProcessClient != null ? org.chromium.support_lib_boundary.util.BoundaryInterfaceReflectionUtil.createInvocationHandlerFor(new androidx.webkit.internal.WebViewRenderProcessClientAdapter(executor, webViewRenderProcessClient)) : null);
    }

    public void setProfileWithName(java.lang.String str) {
        this.getHighSpeedVideoFpsRanges.setProfile(str);
    }

    public androidx.webkit.Profile getProfile() {
        return new androidx.webkit.internal.ProfileImpl((org.chromium.support_lib_boundary.ProfileBoundaryInterface) org.chromium.support_lib_boundary.util.BoundaryInterfaceReflectionUtil.castToSuppLibClass(org.chromium.support_lib_boundary.ProfileBoundaryInterface.class, this.getHighSpeedVideoFpsRanges.getProfile()));
    }

    public boolean isAudioMuted() {
        return this.getHighSpeedVideoFpsRanges.isAudioMuted();
    }

    public void setAudioMuted(boolean z) {
        this.getHighSpeedVideoFpsRanges.setAudioMuted(z);
    }

    public void prerenderUrlAsync(java.lang.String str, android.os.CancellationSignal cancellationSignal, java.util.concurrent.Executor executor, final androidx.webkit.PrerenderOperationCallback prerenderOperationCallback) {
        this.getHighSpeedVideoFpsRanges.prerenderUrl(str, cancellationSignal, executor, new android.webkit.ValueCallback() { // from class: androidx.webkit.internal.WebViewProviderAdapter$$ExternalSyntheticLambda2
            @Override // android.webkit.ValueCallback
            public final void onReceiveValue(java.lang.Object obj) {
                androidx.webkit.PrerenderOperationCallback.this.onPrerenderActivated();
            }
        }, new android.webkit.ValueCallback() { // from class: androidx.webkit.internal.WebViewProviderAdapter$$ExternalSyntheticLambda3
            @Override // android.webkit.ValueCallback
            public final void onReceiveValue(java.lang.Object obj) {
                androidx.webkit.PrerenderOperationCallback.this.onError(new androidx.webkit.PrerenderException("Prerender operation failed", (java.lang.Throwable) obj));
            }
        });
    }

    public void prerenderUrlAsync(java.lang.String str, android.os.CancellationSignal cancellationSignal, java.util.concurrent.Executor executor, androidx.webkit.SpeculativeLoadingParameters speculativeLoadingParameters, final androidx.webkit.PrerenderOperationCallback prerenderOperationCallback) {
        this.getHighSpeedVideoFpsRanges.prerenderUrl(str, cancellationSignal, executor, org.chromium.support_lib_boundary.util.BoundaryInterfaceReflectionUtil.createInvocationHandlerFor(new androidx.webkit.internal.SpeculativeLoadingParametersAdapter(speculativeLoadingParameters)), new android.webkit.ValueCallback() { // from class: androidx.webkit.internal.WebViewProviderAdapter$$ExternalSyntheticLambda0
            @Override // android.webkit.ValueCallback
            public final void onReceiveValue(java.lang.Object obj) {
                androidx.webkit.PrerenderOperationCallback.this.onPrerenderActivated();
            }
        }, new android.webkit.ValueCallback() { // from class: androidx.webkit.internal.WebViewProviderAdapter$$ExternalSyntheticLambda1
            @Override // android.webkit.ValueCallback
            public final void onReceiveValue(java.lang.Object obj) {
                androidx.webkit.PrerenderOperationCallback.this.onError(new androidx.webkit.PrerenderException("Prerender operation failed", (java.lang.Throwable) obj));
            }
        });
    }

    public void saveState(android.os.Bundle bundle, int i, boolean z) {
        this.getHighSpeedVideoFpsRanges.saveState(bundle, i, z);
    }

    public void setWebNavigationClient(androidx.webkit.WebNavigationClient webNavigationClient) {
        this.getHighSpeedVideoFpsRanges.setWebViewNavigationClient(org.chromium.support_lib_boundary.util.BoundaryInterfaceReflectionUtil.createInvocationHandlerFor(new androidx.webkit.internal.WebNavigationClientAdapter(webNavigationClient)));
    }

    public androidx.webkit.WebNavigationClient getWebNavigationClient() {
        java.lang.reflect.InvocationHandler webViewNavigationClient = this.getHighSpeedVideoFpsRanges.getWebViewNavigationClient();
        if (webViewNavigationClient == null) {
            return null;
        }
        return ((androidx.webkit.internal.WebNavigationClientAdapter) org.chromium.support_lib_boundary.util.BoundaryInterfaceReflectionUtil.getDelegateFromInvocationHandler(webViewNavigationClient)).getWebNavigationClient();
    }

    public void addNavigationListener(java.util.concurrent.Executor executor, androidx.webkit.NavigationListener navigationListener) {
        this.getHighSpeedVideoFpsRanges.addWebViewNavigationListener(executor, org.chromium.support_lib_boundary.util.BoundaryInterfaceReflectionUtil.createInvocationHandlerFor(new androidx.webkit.internal.NavigationListenerAdapter(navigationListener)));
    }

    public void removeNavigationListener(androidx.webkit.NavigationListener navigationListener) {
        this.getHighSpeedVideoFpsRanges.removeWebViewNavigationListener(org.chromium.support_lib_boundary.util.BoundaryInterfaceReflectionUtil.createInvocationHandlerFor(new androidx.webkit.internal.NavigationListenerAdapter(navigationListener)));
    }
}
