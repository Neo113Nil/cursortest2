package com.paypal.oslo.feature.inappcheckout.features.analytics;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b,\b`\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0004H&¢\u0006\u0004\b\t\u0010\bJ\u000f\u0010\n\u001a\u00020\u0004H&¢\u0006\u0004\b\n\u0010\bJ\u000f\u0010\u000b\u001a\u00020\u0004H&¢\u0006\u0004\b\u000b\u0010\bJ\u000f\u0010\f\u001a\u00020\u0004H&¢\u0006\u0004\b\f\u0010\bJ\u000f\u0010\r\u001a\u00020\u0004H&¢\u0006\u0004\b\r\u0010\bJ\u001b\u0010\u0011\u001a\u00020\u00042\n\u0010\u0010\u001a\u00060\u000ej\u0002`\u000fH&¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0004H&¢\u0006\u0004\b\u0013\u0010\bJ\u000f\u0010\u0014\u001a\u00020\u0004H&¢\u0006\u0004\b\u0014\u0010\bJ\u0019\u0010\u0017\u001a\u00020\u00042\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H&¢\u0006\u0004\b\u0017\u0010\u0018J\u0019\u0010\u001a\u001a\u00020\u00042\b\u0010\u0019\u001a\u0004\u0018\u00010\u0015H&¢\u0006\u0004\b\u001a\u0010\u0018J\u0017\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u0015H&¢\u0006\u0004\b\u001c\u0010\u0018J\u000f\u0010\u001d\u001a\u00020\u0004H&¢\u0006\u0004\b\u001d\u0010\bJ\u000f\u0010\u001e\u001a\u00020\u0004H&¢\u0006\u0004\b\u001e\u0010\bJ\u000f\u0010\u001f\u001a\u00020\u0004H&¢\u0006\u0004\b\u001f\u0010\bJ\u000f\u0010 \u001a\u00020\u0004H&¢\u0006\u0004\b \u0010\bJ\u000f\u0010!\u001a\u00020\u0004H&¢\u0006\u0004\b!\u0010\bJ\u000f\u0010\"\u001a\u00020\u0004H&¢\u0006\u0004\b\"\u0010\bJ\u000f\u0010#\u001a\u00020\u0004H&¢\u0006\u0004\b#\u0010\bJ\u0019\u0010$\u001a\u00020\u00042\b\u0010\u0019\u001a\u0004\u0018\u00010\u0015H&¢\u0006\u0004\b$\u0010\u0018J\u0019\u0010%\u001a\u00020\u00042\b\u0010\u0019\u001a\u0004\u0018\u00010\u0015H&¢\u0006\u0004\b%\u0010\u0018J\u000f\u0010&\u001a\u00020\u0004H&¢\u0006\u0004\b&\u0010\bJ\u0017\u0010'\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u0015H&¢\u0006\u0004\b'\u0010\u0018J\u000f\u0010(\u001a\u00020\u0004H&¢\u0006\u0004\b(\u0010\bJ\u000f\u0010)\u001a\u00020\u0004H&¢\u0006\u0004\b)\u0010\bJ\u000f\u0010*\u001a\u00020\u0004H&¢\u0006\u0004\b*\u0010\bJ\u000f\u0010+\u001a\u00020\u0004H&¢\u0006\u0004\b+\u0010\bJ\u000f\u0010,\u001a\u00020\u0004H&¢\u0006\u0004\b,\u0010\bJ\u000f\u0010-\u001a\u00020\u0004H&¢\u0006\u0004\b-\u0010\bJ\u000f\u0010.\u001a\u00020\u0004H&¢\u0006\u0004\b.\u0010\bJ\u000f\u0010/\u001a\u00020\u0004H&¢\u0006\u0004\b/\u0010\bJ\u000f\u00100\u001a\u00020\u0004H&¢\u0006\u0004\b0\u0010\bJ\u000f\u00101\u001a\u00020\u0004H&¢\u0006\u0004\b1\u0010\bJ\u000f\u00102\u001a\u00020\u0004H&¢\u0006\u0004\b2\u0010\bJ#\u00105\u001a\u00020\u00042\b\u00103\u001a\u0004\u0018\u00010\u00152\b\u00104\u001a\u0004\u0018\u00010\u0015H&¢\u0006\u0004\b5\u00106J\u000f\u00107\u001a\u00020\u0004H&¢\u0006\u0004\b7\u0010\bJ\u0017\u00109\u001a\u00020\u00042\u0006\u00108\u001a\u00020\u0015H&¢\u0006\u0004\b9\u0010\u0018J\u000f\u0010:\u001a\u00020\u0004H&¢\u0006\u0004\b:\u0010\bJ\u000f\u0010;\u001a\u00020\u0004H&¢\u0006\u0004\b;\u0010\bJ\u000f\u0010<\u001a\u00020\u0004H&¢\u0006\u0004\b<\u0010\bJ+\u0010@\u001a\u00020\u00042\u0006\u0010=\u001a\u00020\u00152\u0006\u0010>\u001a\u00020\u00152\n\b\u0002\u0010?\u001a\u0004\u0018\u00010\u0015H&¢\u0006\u0004\b@\u0010AÀ\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/features/analytics/AnalyticsTracer;", "", "Landroid/net/Uri;", "deeplinkUrl", "", "trackDeeplinkReceived", "(Landroid/net/Uri;)V", "trackGetTokenDetailsFailedRetryPageShown", "()V", "trackNonRecoverableErrorScreenShown", "trackClickRecoverableTryAgain", "trackClickErrorCancel", "trackUserClosedConsumerApp", "trackInitiatedAuthFlow", "Ljava/lang/Exception;", "Lkotlin/getHighResolutionOutputSizeshNQ4ISI;", "exception", "trackCompleteAuthFlowError", "(Ljava/lang/Exception;)V", "trackCompleteAuthFlowSuccess", "trackSuccessGetTokenDetailsCompleted", "", "exceptionMessage", "trackCheckoutPreferencesException", "(Ljava/lang/String;)V", "deeplinkSource", "trackWebCheckout", "error", "trackWebPageNotLoaded", "userCancelledWebCheckout", "trackUserCompletedWebCheckout", "trackReturnToMerchantAppInitiated", "trackConsumerAppBackgrounded", "trackConsumerAppForegrounded", "trackUserClickedBack", "trackAutoRedirectFlow", "trackSwitchToAppSuccess", "trackUnableToDecodeToken", "trackSavedCheckoutExperienceAsCancelled", "trackUnsavedCheckoutExperienceAsCancelled", "trackAppVersionGatingWebFallbackUnknown", "trackAppVersionGatingWebFallbackMuECS", "trackAppVersionGatingWebFallbackMuVA", "trackAppVersionGatingWebFallbackMuBilling", "trackAppVersionGatingWebFallbackNoMuECS", "trackAppVersionGatingWebFallbackNoMuVA", "trackAppVersionGatingWebFallbackNoMuBilling", "trackAppVersionGatingRedirectedToNative", "trackAppVersionGatingRedirectedToWebView", "trackButtonForwardPressed", "trackButtonBackwardPressed", "experimentID", "treatmentID", "trackElmoExperiment", "(Ljava/lang/String;Ljava/lang/String;)V", "trackOnFragmentDestroyed", "approvalUrl", "trackReadyToLoadApprovalURL", "trackHomeBackgroundTimeoutProceeded", "trackHomeBackgroundTimeoutSkipped", "trackInboundLinkResolved", "action", "returnUrl", "errorMessage", "trackOutboundLinkResolved", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface AnalyticsTracer {
    void trackAppVersionGatingRedirectedToNative();

    void trackAppVersionGatingRedirectedToWebView();

    void trackAppVersionGatingWebFallbackMuBilling();

    void trackAppVersionGatingWebFallbackMuECS();

    void trackAppVersionGatingWebFallbackMuVA();

    void trackAppVersionGatingWebFallbackNoMuBilling();

    void trackAppVersionGatingWebFallbackNoMuECS();

    void trackAppVersionGatingWebFallbackNoMuVA();

    void trackAppVersionGatingWebFallbackUnknown();

    void trackAutoRedirectFlow();

    void trackButtonBackwardPressed();

    void trackButtonForwardPressed();

    void trackCheckoutPreferencesException(java.lang.String exceptionMessage);

    void trackClickErrorCancel();

    void trackClickRecoverableTryAgain();

    void trackCompleteAuthFlowError(java.lang.Exception exception);

    void trackCompleteAuthFlowSuccess();

    void trackConsumerAppBackgrounded();

    void trackConsumerAppForegrounded();

    void trackDeeplinkReceived(android.net.Uri deeplinkUrl);

    void trackElmoExperiment(java.lang.String experimentID, java.lang.String treatmentID);

    void trackGetTokenDetailsFailedRetryPageShown();

    void trackHomeBackgroundTimeoutProceeded();

    void trackHomeBackgroundTimeoutSkipped();

    void trackInboundLinkResolved();

    void trackInitiatedAuthFlow();

    void trackNonRecoverableErrorScreenShown();

    void trackOnFragmentDestroyed();

    void trackOutboundLinkResolved(java.lang.String action, java.lang.String returnUrl, java.lang.String errorMessage);

    void trackReadyToLoadApprovalURL(java.lang.String approvalUrl);

    void trackReturnToMerchantAppInitiated();

    void trackSavedCheckoutExperienceAsCancelled();

    void trackSuccessGetTokenDetailsCompleted();

    void trackSwitchToAppSuccess(java.lang.String deeplinkSource);

    void trackUnableToDecodeToken(java.lang.String deeplinkSource);

    void trackUnsavedCheckoutExperienceAsCancelled(java.lang.String error);

    void trackUserClickedBack();

    void trackUserClosedConsumerApp();

    void trackUserCompletedWebCheckout();

    void trackWebCheckout(java.lang.String deeplinkSource);

    void trackWebPageNotLoaded(java.lang.String error);

    void userCancelledWebCheckout();

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes13.dex */
    public static final class DefaultImpls {
    }

    static /* synthetic */ void trackOutboundLinkResolved$default(com.paypal.oslo.feature.inappcheckout.features.analytics.AnalyticsTracer analyticsTracer, java.lang.String str, java.lang.String str2, java.lang.String str3, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: trackOutboundLinkResolved");
        }
        if ((i & 4) != 0) {
            str3 = null;
        }
        analyticsTracer.trackOutboundLinkResolved(str, str2, str3);
    }
}
