package androidx.webkit.internal;

/* loaded from: classes7.dex */
public class SafeBrowsingResponseImpl extends androidx.webkit.SafeBrowsingResponseCompat {
    private org.chromium.support_lib_boundary.SafeBrowsingResponseBoundaryInterface getHighResolutionOutputSizeshNQ4ISI;
    private android.webkit.SafeBrowsingResponse getHighSpeedVideoSizes;

    public SafeBrowsingResponseImpl(java.lang.reflect.InvocationHandler invocationHandler) {
        this.getHighResolutionOutputSizeshNQ4ISI = (org.chromium.support_lib_boundary.SafeBrowsingResponseBoundaryInterface) org.chromium.support_lib_boundary.util.BoundaryInterfaceReflectionUtil.castToSuppLibClass(org.chromium.support_lib_boundary.SafeBrowsingResponseBoundaryInterface.class, invocationHandler);
    }

    public SafeBrowsingResponseImpl(android.webkit.SafeBrowsingResponse safeBrowsingResponse) {
        this.getHighSpeedVideoSizes = safeBrowsingResponse;
    }

    private android.webkit.SafeBrowsingResponse dG_() {
        if (this.getHighSpeedVideoSizes == null) {
            this.getHighSpeedVideoSizes = androidx.webkit.internal.WebViewGlueCommunicator.getCompatConverter().convertSafeBrowsingResponse(java.lang.reflect.Proxy.getInvocationHandler(this.getHighResolutionOutputSizeshNQ4ISI));
        }
        return this.getHighSpeedVideoSizes;
    }

    private org.chromium.support_lib_boundary.SafeBrowsingResponseBoundaryInterface getHighResolutionOutputSizeshNQ4ISI() {
        if (this.getHighResolutionOutputSizeshNQ4ISI == null) {
            this.getHighResolutionOutputSizeshNQ4ISI = (org.chromium.support_lib_boundary.SafeBrowsingResponseBoundaryInterface) org.chromium.support_lib_boundary.util.BoundaryInterfaceReflectionUtil.castToSuppLibClass(org.chromium.support_lib_boundary.SafeBrowsingResponseBoundaryInterface.class, androidx.webkit.internal.WebViewGlueCommunicator.getCompatConverter().convertSafeBrowsingResponse(this.getHighSpeedVideoSizes));
        }
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    @Override // androidx.webkit.SafeBrowsingResponseCompat
    public void showInterstitial(boolean z) {
        androidx.webkit.internal.ApiFeature.O_MR1 o_mr1 = androidx.webkit.internal.WebViewFeatureInternal.SAFE_BROWSING_RESPONSE_SHOW_INTERSTITIAL;
        if (o_mr1.isSupportedByFramework()) {
            androidx.webkit.internal.ApiHelperForOMR1.showInterstitial(dG_(), z);
        } else {
            if (o_mr1.isSupportedByWebView()) {
                getHighResolutionOutputSizeshNQ4ISI().showInterstitial(z);
                return;
            }
            throw androidx.webkit.internal.WebViewFeatureInternal.getUnsupportedOperationException();
        }
    }

    @Override // androidx.webkit.SafeBrowsingResponseCompat
    public void proceed(boolean z) {
        androidx.webkit.internal.ApiFeature.O_MR1 o_mr1 = androidx.webkit.internal.WebViewFeatureInternal.SAFE_BROWSING_RESPONSE_PROCEED;
        if (o_mr1.isSupportedByFramework()) {
            androidx.webkit.internal.ApiHelperForOMR1.proceed(dG_(), z);
        } else {
            if (o_mr1.isSupportedByWebView()) {
                getHighResolutionOutputSizeshNQ4ISI().proceed(z);
                return;
            }
            throw androidx.webkit.internal.WebViewFeatureInternal.getUnsupportedOperationException();
        }
    }

    @Override // androidx.webkit.SafeBrowsingResponseCompat
    public void backToSafety(boolean z) {
        androidx.webkit.internal.ApiFeature.O_MR1 o_mr1 = androidx.webkit.internal.WebViewFeatureInternal.SAFE_BROWSING_RESPONSE_BACK_TO_SAFETY;
        if (o_mr1.isSupportedByFramework()) {
            androidx.webkit.internal.ApiHelperForOMR1.backToSafety(dG_(), z);
        } else {
            if (o_mr1.isSupportedByWebView()) {
                getHighResolutionOutputSizeshNQ4ISI().backToSafety(z);
                return;
            }
            throw androidx.webkit.internal.WebViewFeatureInternal.getUnsupportedOperationException();
        }
    }
}
