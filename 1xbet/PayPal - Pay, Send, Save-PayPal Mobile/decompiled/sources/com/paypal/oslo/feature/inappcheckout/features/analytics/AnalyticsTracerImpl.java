package com.paypal.oslo.feature.inappcheckout.features.analytics;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b.\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\bH\u0016¢\u0006\u0004\b\r\u0010\fJ\u000f\u0010\u000e\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000e\u0010\fJ\u000f\u0010\u000f\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000f\u0010\fJ\u000f\u0010\u0010\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0010\u0010\fJ\u000f\u0010\u0011\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0011\u0010\fJ\u000f\u0010\u0012\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0012\u0010\fJ\u001b\u0010\u0016\u001a\u00020\b2\n\u0010\u0015\u001a\u00060\u0013j\u0002`\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0018\u0010\fJ\u0019\u0010\u001b\u001a\u00020\b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001d\u0010\fJ\u000f\u0010\u001e\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001e\u0010\fJ\u000f\u0010\u001f\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001f\u0010\fJ\u000f\u0010 \u001a\u00020\bH\u0016¢\u0006\u0004\b \u0010\fJ\u000f\u0010!\u001a\u00020\bH\u0016¢\u0006\u0004\b!\u0010\fJ\u000f\u0010\"\u001a\u00020\bH\u0016¢\u0006\u0004\b\"\u0010\fJ\u000f\u0010#\u001a\u00020\bH\u0016¢\u0006\u0004\b#\u0010\fJ\u0019\u0010%\u001a\u00020\b2\b\u0010$\u001a\u0004\u0018\u00010\u0019H\u0016¢\u0006\u0004\b%\u0010\u001cJ\u0019\u0010&\u001a\u00020\b2\b\u0010$\u001a\u0004\u0018\u00010\u0019H\u0016¢\u0006\u0004\b&\u0010\u001cJ\u0019\u0010'\u001a\u00020\b2\b\u0010$\u001a\u0004\u0018\u00010\u0019H\u0016¢\u0006\u0004\b'\u0010\u001cJ\u0017\u0010)\u001a\u00020\b2\u0006\u0010(\u001a\u00020\u0019H\u0016¢\u0006\u0004\b)\u0010\u001cJ\u000f\u0010*\u001a\u00020\bH\u0016¢\u0006\u0004\b*\u0010\fJ\u0017\u0010+\u001a\u00020\b2\u0006\u0010(\u001a\u00020\u0019H\u0016¢\u0006\u0004\b+\u0010\u001cJ\u000f\u0010,\u001a\u00020\bH\u0016¢\u0006\u0004\b,\u0010\fJ\u000f\u0010-\u001a\u00020\bH\u0016¢\u0006\u0004\b-\u0010\fJ\u000f\u0010.\u001a\u00020\bH\u0016¢\u0006\u0004\b.\u0010\fJ\u000f\u0010/\u001a\u00020\bH\u0016¢\u0006\u0004\b/\u0010\fJ\u000f\u00100\u001a\u00020\bH\u0016¢\u0006\u0004\b0\u0010\fJ\u000f\u00101\u001a\u00020\bH\u0016¢\u0006\u0004\b1\u0010\fJ\u000f\u00102\u001a\u00020\bH\u0016¢\u0006\u0004\b2\u0010\fJ\u000f\u00103\u001a\u00020\bH\u0016¢\u0006\u0004\b3\u0010\fJ\u000f\u00104\u001a\u00020\bH\u0016¢\u0006\u0004\b4\u0010\fJ\u000f\u00105\u001a\u00020\bH\u0016¢\u0006\u0004\b5\u0010\fJ\u000f\u00106\u001a\u00020\bH\u0016¢\u0006\u0004\b6\u0010\fJ#\u00109\u001a\u00020\b2\b\u00107\u001a\u0004\u0018\u00010\u00192\b\u00108\u001a\u0004\u0018\u00010\u0019H\u0016¢\u0006\u0004\b9\u0010:J\u000f\u0010;\u001a\u00020\bH\u0016¢\u0006\u0004\b;\u0010\fJ\u0017\u0010=\u001a\u00020\b2\u0006\u0010<\u001a\u00020\u0019H\u0016¢\u0006\u0004\b=\u0010\u001cJ\u000f\u0010>\u001a\u00020\bH\u0016¢\u0006\u0004\b>\u0010\fJ\u000f\u0010?\u001a\u00020\bH\u0016¢\u0006\u0004\b?\u0010\fJ\u000f\u0010@\u001a\u00020\bH\u0016¢\u0006\u0004\b@\u0010\fJ)\u0010D\u001a\u00020\b2\u0006\u0010A\u001a\u00020\u00192\u0006\u0010B\u001a\u00020\u00192\b\u0010C\u001a\u0004\u0018\u00010\u0019H\u0016¢\u0006\u0004\bD\u0010ER\u0014\u0010F\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010G"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/features/analytics/AnalyticsTracerImpl;", "Lcom/paypal/oslo/feature/inappcheckout/features/analytics/AnalyticsTracer;", "Lcom/paypal/oslo/feature/inappcheckout/features/logger/CheckoutLogger;", "logger", "<init>", "(Lcom/paypal/oslo/feature/inappcheckout/features/logger/CheckoutLogger;)V", "Landroid/net/Uri;", "deeplinkUrl", "", "trackDeeplinkReceived", "(Landroid/net/Uri;)V", "trackGetTokenDetailsFailedRetryPageShown", "()V", "trackNonRecoverableErrorScreenShown", "trackClickRecoverableTryAgain", "trackClickErrorCancel", "trackUserClosedConsumerApp", "trackInitiatedAuthFlow", "trackCompleteAuthFlowSuccess", "Ljava/lang/Exception;", "Lkotlin/getHighResolutionOutputSizeshNQ4ISI;", "exception", "trackCompleteAuthFlowError", "(Ljava/lang/Exception;)V", "trackSuccessGetTokenDetailsCompleted", "", "exceptionMessage", "trackCheckoutPreferencesException", "(Ljava/lang/String;)V", "userCancelledWebCheckout", "trackUserCompletedWebCheckout", "trackReturnToMerchantAppInitiated", "trackConsumerAppBackgrounded", "trackConsumerAppForegrounded", "trackUserClickedBack", "trackAutoRedirectFlow", "deeplinkSource", "trackSwitchToAppSuccess", "trackUnableToDecodeToken", "trackWebCheckout", "error", "trackWebPageNotLoaded", "trackSavedCheckoutExperienceAsCancelled", "trackUnsavedCheckoutExperienceAsCancelled", "trackAppVersionGatingWebFallbackUnknown", "trackAppVersionGatingWebFallbackMuECS", "trackAppVersionGatingWebFallbackMuVA", "trackAppVersionGatingWebFallbackMuBilling", "trackAppVersionGatingWebFallbackNoMuECS", "trackAppVersionGatingWebFallbackNoMuVA", "trackAppVersionGatingWebFallbackNoMuBilling", "trackAppVersionGatingRedirectedToNative", "trackAppVersionGatingRedirectedToWebView", "trackButtonForwardPressed", "trackButtonBackwardPressed", "experimentID", "treatmentID", "trackElmoExperiment", "(Ljava/lang/String;Ljava/lang/String;)V", "trackOnFragmentDestroyed", "approvalUrl", "trackReadyToLoadApprovalURL", "trackHomeBackgroundTimeoutProceeded", "trackHomeBackgroundTimeoutSkipped", "trackInboundLinkResolved", "action", "returnUrl", "errorMessage", "trackOutboundLinkResolved", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/feature/inappcheckout/features/logger/CheckoutLogger;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class AnalyticsTracerImpl implements com.paypal.oslo.feature.inappcheckout.features.analytics.AnalyticsTracer {
    public static final int $stable = 8;
    private final com.paypal.oslo.feature.inappcheckout.features.logger.CheckoutLogger getHighSpeedVideoFpsRanges;

    public AnalyticsTracerImpl(com.paypal.oslo.feature.inappcheckout.features.logger.CheckoutLogger checkoutLogger) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(checkoutLogger, "");
        this.getHighSpeedVideoFpsRanges = checkoutLogger;
    }

    @Override // com.paypal.oslo.feature.inappcheckout.features.analytics.AnalyticsTracer
    public final void trackDeeplinkReceived(android.net.Uri deeplinkUrl) {
        com.paypal.oslo.feature.inappcheckout.features.logger.CheckoutLogger checkoutLogger = this.getHighSpeedVideoFpsRanges;
        com.paypal.oslo.feature.inappcheckout.features.analytics.domain.CheckoutAnalyticsImpressionEvent appswitch_deeplink_url_received = com.paypal.oslo.feature.inappcheckout.features.analytics.domain.CheckoutAnalyticsImpressionEvent.INSTANCE.getAPPSWITCH_DEEPLINK_URL_RECEIVED();
        com.paypal.oslo.feature.inappcheckout.domain.model.EventProperty[] eventPropertyArr = new com.paypal.oslo.feature.inappcheckout.domain.model.EventProperty[1];
        eventPropertyArr[0] = com.paypal.oslo.feature.inappcheckout.domain.model.EventPropertyKeyKt.with(com.paypal.oslo.feature.inappcheckout.domain.model.EventPropertyKey.DeeplinkUrl, deeplinkUrl != null ? deeplinkUrl.toString() : null);
        checkoutLogger.logAnalyticsEvent(appswitch_deeplink_url_received, eventPropertyArr);
    }

    @Override // com.paypal.oslo.feature.inappcheckout.features.analytics.AnalyticsTracer
    public final void trackGetTokenDetailsFailedRetryPageShown() {
        this.getHighSpeedVideoFpsRanges.logAnalyticsEvent(com.paypal.oslo.feature.inappcheckout.features.analytics.domain.CheckoutAnalyticsImpressionEvent.INSTANCE.getGET_TOKEN_FAILED_TRY_AGAIN_SHOWN(), new com.paypal.oslo.feature.inappcheckout.domain.model.EventProperty[0]);
    }

    @Override // com.paypal.oslo.feature.inappcheckout.features.analytics.AnalyticsTracer
    public final void trackNonRecoverableErrorScreenShown() {
        this.getHighSpeedVideoFpsRanges.logAnalyticsEvent(com.paypal.oslo.feature.inappcheckout.features.analytics.domain.CheckoutAnalyticsImpressionEvent.INSTANCE.getNON_RECOVERABLE_ERROR_SCREEN_SHOWN(), new com.paypal.oslo.feature.inappcheckout.domain.model.EventProperty[0]);
    }

    @Override // com.paypal.oslo.feature.inappcheckout.features.analytics.AnalyticsTracer
    public final void trackClickRecoverableTryAgain() {
        this.getHighSpeedVideoFpsRanges.logAnalyticsEvent(com.paypal.oslo.feature.inappcheckout.features.analytics.domain.CheckoutAnalyticsClickEvent.INSTANCE.getERROR_GET_TOKEN_FAILED_TRY_AGAIN_CLICKED(), new com.paypal.oslo.feature.inappcheckout.domain.model.EventProperty[0]);
    }

    @Override // com.paypal.oslo.feature.inappcheckout.features.analytics.AnalyticsTracer
    public final void trackClickErrorCancel() {
        this.getHighSpeedVideoFpsRanges.logAnalyticsEvent(com.paypal.oslo.feature.inappcheckout.features.analytics.domain.CheckoutAnalyticsClickEvent.INSTANCE.getERROR_GET_TOKEN_FAILED_CANCEL_CLICKED(), new com.paypal.oslo.feature.inappcheckout.domain.model.EventProperty[0]);
    }

    @Override // com.paypal.oslo.feature.inappcheckout.features.analytics.AnalyticsTracer
    public final void trackUserClosedConsumerApp() {
        this.getHighSpeedVideoFpsRanges.logAnalyticsEvent(com.paypal.oslo.feature.inappcheckout.features.analytics.domain.CheckoutAnalyticsImpressionEvent.INSTANCE.getUSER_CLOSED_CONSUMER_APP(), new com.paypal.oslo.feature.inappcheckout.domain.model.EventProperty[0]);
    }

    @Override // com.paypal.oslo.feature.inappcheckout.features.analytics.AnalyticsTracer
    public final void trackInitiatedAuthFlow() {
        this.getHighSpeedVideoFpsRanges.logAnalyticsEvent(com.paypal.oslo.feature.inappcheckout.features.analytics.domain.CheckoutAnalyticsImpressionEvent.INSTANCE.getCONSUMER_APP_AUTH_FLOW_INITIATED(), new com.paypal.oslo.feature.inappcheckout.domain.model.EventProperty[0]);
    }

    @Override // com.paypal.oslo.feature.inappcheckout.features.analytics.AnalyticsTracer
    public final void trackCompleteAuthFlowSuccess() {
        this.getHighSpeedVideoFpsRanges.logAnalyticsEvent(com.paypal.oslo.feature.inappcheckout.features.analytics.domain.CheckoutAnalyticsImpressionEvent.INSTANCE.getAUTH_CODE_EXCHANGE_COMPLETED(), com.paypal.oslo.feature.inappcheckout.domain.model.EventProperty.INSTANCE.getOUTCOME_SUCCESS());
    }

    @Override // com.paypal.oslo.feature.inappcheckout.features.analytics.AnalyticsTracer
    public final void trackCompleteAuthFlowError(java.lang.Exception exception) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(exception, "");
        java.lang.String message = exception.getMessage();
        if (message == null) {
            java.lang.String name2 = com.paypal.oslo.feature.inappcheckout.features.analytics.domain.CheckoutAnalyticsImpressionEvent.INSTANCE.getAUTH_CODE_EXCHANGE_COMPLETED().getName();
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Unknown ");
            sb.append(name2);
            sb.append(" error");
            message = sb.toString();
        }
        this.getHighSpeedVideoFpsRanges.logAnalyticsEvent(com.paypal.oslo.feature.inappcheckout.features.analytics.domain.CheckoutAnalyticsImpressionEvent.INSTANCE.getAUTH_CODE_EXCHANGE_COMPLETED(), com.paypal.oslo.feature.inappcheckout.domain.model.EventProperty.INSTANCE.getOUTCOME_FAILURE(), com.paypal.oslo.feature.inappcheckout.domain.model.EventPropertyKeyKt.with(com.paypal.oslo.feature.inappcheckout.domain.model.EventPropertyKey.ErrorDescription, message));
    }

    @Override // com.paypal.oslo.feature.inappcheckout.features.analytics.AnalyticsTracer
    public final void trackSuccessGetTokenDetailsCompleted() {
        this.getHighSpeedVideoFpsRanges.logAnalyticsEvent(com.paypal.oslo.feature.inappcheckout.features.analytics.domain.CheckoutAnalyticsImpressionEvent.INSTANCE.getGET_TOKEN_STATUS(), com.paypal.oslo.feature.inappcheckout.domain.model.EventProperty.INSTANCE.getOUTCOME_SUCCESS());
    }

    @Override // com.paypal.oslo.feature.inappcheckout.features.analytics.AnalyticsTracer
    public final void trackCheckoutPreferencesException(java.lang.String exceptionMessage) {
        com.paypal.oslo.feature.inappcheckout.features.logger.CheckoutLogger checkoutLogger = this.getHighSpeedVideoFpsRanges;
        com.paypal.oslo.feature.inappcheckout.features.analytics.domain.CheckoutAnalyticsImpressionEvent get_token_status = com.paypal.oslo.feature.inappcheckout.features.analytics.domain.CheckoutAnalyticsImpressionEvent.INSTANCE.getGET_TOKEN_STATUS();
        com.paypal.oslo.feature.inappcheckout.domain.model.EventProperty[] eventPropertyArr = new com.paypal.oslo.feature.inappcheckout.domain.model.EventProperty[2];
        eventPropertyArr[0] = com.paypal.oslo.feature.inappcheckout.domain.model.EventProperty.INSTANCE.getOUTCOME_FAILURE();
        com.paypal.oslo.feature.inappcheckout.domain.model.EventPropertyKey eventPropertyKey = com.paypal.oslo.feature.inappcheckout.domain.model.EventPropertyKey.ErrorDescription;
        if (exceptionMessage == null) {
            exceptionMessage = com.paypal.oslo.feature.settings.closeaccount.data.repository.CloseAccountRepositoryImpl.UNKNOWN_ERROR;
        }
        eventPropertyArr[1] = com.paypal.oslo.feature.inappcheckout.domain.model.EventPropertyKeyKt.with(eventPropertyKey, exceptionMessage);
        checkoutLogger.logAnalyticsEvent(get_token_status, eventPropertyArr);
    }

    @Override // com.paypal.oslo.feature.inappcheckout.features.analytics.AnalyticsTracer
    public final void userCancelledWebCheckout() {
        this.getHighSpeedVideoFpsRanges.logAnalyticsEvent(com.paypal.oslo.feature.inappcheckout.features.analytics.domain.CheckoutAnalyticsImpressionEvent.INSTANCE.getCONSUMER_APP_CANCEL_CLICKED_ON_RYP(), new com.paypal.oslo.feature.inappcheckout.domain.model.EventProperty[0]);
        com.paypal.oslo.feature.inappcheckout.features.logger.CheckoutLogger.trackFlowTransition$default(this.getHighSpeedVideoFpsRanges, com.paypal.oslo.core.telemetry.analytics.schema.context.operational.TransitionTypeCategory.APP_SWITCH_CHECKOUT_REDIRECT_START, com.paypal.oslo.feature.inappcheckout.analytics.InAppCheckoutAnalyticsConstants.Actions.CANCEL_REDIRECT, null, 4, null);
    }

    @Override // com.paypal.oslo.feature.inappcheckout.features.analytics.AnalyticsTracer
    public final void trackUserCompletedWebCheckout() {
        this.getHighSpeedVideoFpsRanges.logAnalyticsEvent(com.paypal.oslo.feature.inappcheckout.features.analytics.domain.CheckoutAnalyticsImpressionEvent.INSTANCE.getCONSUMER_APP_COMPLETE_XO(), new com.paypal.oslo.feature.inappcheckout.domain.model.EventProperty[0]);
    }

    @Override // com.paypal.oslo.feature.inappcheckout.features.analytics.AnalyticsTracer
    public final void trackReturnToMerchantAppInitiated() {
        this.getHighSpeedVideoFpsRanges.logAnalyticsEvent(com.paypal.oslo.feature.inappcheckout.features.analytics.domain.CheckoutAnalyticsImpressionEvent.INSTANCE.getREDIRECT_TO_MERCHANT_APP_INITIATED(), new com.paypal.oslo.feature.inappcheckout.domain.model.EventProperty[0]);
        com.paypal.oslo.feature.inappcheckout.features.logger.CheckoutLogger.trackFlowTransition$default(this.getHighSpeedVideoFpsRanges, com.paypal.oslo.core.telemetry.analytics.schema.context.operational.TransitionTypeCategory.APP_SWITCH_CHECKOUT_REDIRECT_START, com.paypal.oslo.feature.inappcheckout.analytics.InAppCheckoutAnalyticsConstants.Actions.RETURN_REDIRECT, null, 4, null);
    }

    @Override // com.paypal.oslo.feature.inappcheckout.features.analytics.AnalyticsTracer
    public final void trackConsumerAppBackgrounded() {
        this.getHighSpeedVideoFpsRanges.logAnalyticsEvent(com.paypal.oslo.feature.inappcheckout.features.analytics.domain.CheckoutAnalyticsImpressionEvent.INSTANCE.getCONSUMER_APP_BACKGROUNDED(), new com.paypal.oslo.feature.inappcheckout.domain.model.EventProperty[0]);
        com.paypal.oslo.feature.inappcheckout.features.logger.CheckoutLogger.trackFlowTransition$default(this.getHighSpeedVideoFpsRanges, com.paypal.oslo.core.telemetry.analytics.schema.context.operational.TransitionTypeCategory.APP_SWITCH_CHECKOUT_FOCUS_EXIT, com.paypal.oslo.feature.inappcheckout.analytics.InAppCheckoutAnalyticsConstants.Actions.FOCUS_EXIT_APP_BACKGROUNDED, null, 4, null);
    }

    @Override // com.paypal.oslo.feature.inappcheckout.features.analytics.AnalyticsTracer
    public final void trackConsumerAppForegrounded() {
        this.getHighSpeedVideoFpsRanges.logAnalyticsEvent(com.paypal.oslo.feature.inappcheckout.features.analytics.domain.CheckoutAnalyticsImpressionEvent.INSTANCE.getCONSUMER_APP_FOREGROUNDED(), new com.paypal.oslo.feature.inappcheckout.domain.model.EventProperty[0]);
    }

    @Override // com.paypal.oslo.feature.inappcheckout.features.analytics.AnalyticsTracer
    public final void trackUserClickedBack() {
        this.getHighSpeedVideoFpsRanges.logAnalyticsEvent(com.paypal.oslo.feature.inappcheckout.features.analytics.domain.CheckoutAnalyticsImpressionEvent.INSTANCE.getUSER_CLICK_BACK(), new com.paypal.oslo.feature.inappcheckout.domain.model.EventProperty[0]);
    }

    @Override // com.paypal.oslo.feature.inappcheckout.features.analytics.AnalyticsTracer
    public final void trackAutoRedirectFlow() {
        this.getHighSpeedVideoFpsRanges.logAnalyticsEvent(com.paypal.oslo.feature.inappcheckout.features.analytics.domain.CheckoutAnalyticsImpressionEvent.INSTANCE.getREDIRECT_TO_MERCHANT_INITIATED_AUTO(), new com.paypal.oslo.feature.inappcheckout.domain.model.EventProperty[0]);
    }

    @Override // com.paypal.oslo.feature.inappcheckout.features.analytics.AnalyticsTracer
    public final void trackSwitchToAppSuccess(java.lang.String deeplinkSource) {
        this.getHighSpeedVideoFpsRanges.logAnalyticsEvent(com.paypal.oslo.feature.inappcheckout.features.analytics.domain.CheckoutAnalyticsImpressionEvent.INSTANCE.getSWITCH_TO_CONSUMER_APP_SUCCESS(), com.paypal.oslo.feature.inappcheckout.domain.model.EventPropertyKeyKt.with(com.paypal.oslo.feature.inappcheckout.domain.model.EventPropertyKey.UniversalLinkSource, deeplinkSource));
        com.paypal.oslo.feature.inappcheckout.features.logger.CheckoutLogger.trackFlowTransition$default(this.getHighSpeedVideoFpsRanges, com.paypal.oslo.core.telemetry.analytics.schema.context.operational.TransitionTypeCategory.APP_SWITCH_CHECKOUT_START, com.paypal.oslo.feature.inappcheckout.analytics.InAppCheckoutAnalyticsConstants.Actions.SWITCH_TO_CONSUMER_APP_SUCCESS, null, 4, null);
    }

    @Override // com.paypal.oslo.feature.inappcheckout.features.analytics.AnalyticsTracer
    public final void trackUnableToDecodeToken(java.lang.String deeplinkSource) {
        this.getHighSpeedVideoFpsRanges.logAnalyticsEvent(com.paypal.oslo.feature.inappcheckout.features.analytics.domain.CheckoutAnalyticsImpressionEvent.INSTANCE.getSWITCH_TO_CONSUMER_APP_FAILURE(), com.paypal.oslo.feature.inappcheckout.domain.model.EventPropertyKeyKt.with(com.paypal.oslo.feature.inappcheckout.domain.model.EventPropertyKey.UniversalLinkSource, deeplinkSource), com.paypal.oslo.feature.inappcheckout.domain.model.EventProperty.INSTANCE.getFAILURE_UNABLE_TO_DECODE_TOKEN());
    }

    @Override // com.paypal.oslo.feature.inappcheckout.features.analytics.AnalyticsTracer
    public final void trackWebCheckout(java.lang.String deeplinkSource) {
        this.getHighSpeedVideoFpsRanges.logAnalyticsEvent(com.paypal.oslo.feature.inappcheckout.features.analytics.domain.CheckoutAnalyticsImpressionEvent.INSTANCE.getCONSUMER_APP_LAUNCH_XO(), com.paypal.oslo.feature.inappcheckout.domain.model.EventPropertyKeyKt.with(com.paypal.oslo.feature.inappcheckout.domain.model.EventPropertyKey.UniversalLinkSource, deeplinkSource));
    }

    @Override // com.paypal.oslo.feature.inappcheckout.features.analytics.AnalyticsTracer
    public final void trackWebPageNotLoaded(java.lang.String error) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(error, "");
        this.getHighSpeedVideoFpsRanges.logAnalyticsEvent(com.paypal.oslo.feature.inappcheckout.features.analytics.domain.CheckoutAnalyticsImpressionEvent.INSTANCE.getCONSUMER_APP_LAUNCH_XO_ERROR(), com.paypal.oslo.feature.inappcheckout.domain.model.EventPropertyKeyKt.with(com.paypal.oslo.feature.inappcheckout.domain.model.EventPropertyKey.ErrorDescription, error));
    }

    @Override // com.paypal.oslo.feature.inappcheckout.features.analytics.AnalyticsTracer
    public final void trackSavedCheckoutExperienceAsCancelled() {
        this.getHighSpeedVideoFpsRanges.logAnalyticsEvent(com.paypal.oslo.feature.inappcheckout.features.analytics.domain.CheckoutAnalyticsImpressionEvent.INSTANCE.getSAVE_CANCEL_CHECKOUT_EXPERIENCE(), com.paypal.oslo.feature.inappcheckout.domain.model.EventProperty.INSTANCE.getSAVE_CANCEL_CHECKOUT_EXPERIENCE_SUCCESS_REQUEST());
    }

    @Override // com.paypal.oslo.feature.inappcheckout.features.analytics.AnalyticsTracer
    public final void trackUnsavedCheckoutExperienceAsCancelled(java.lang.String error) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(error, "");
        this.getHighSpeedVideoFpsRanges.logAnalyticsEvent(com.paypal.oslo.feature.inappcheckout.features.analytics.domain.CheckoutAnalyticsImpressionEvent.INSTANCE.getSAVE_CANCEL_CHECKOUT_EXPERIENCE(), com.paypal.oslo.feature.inappcheckout.domain.model.EventProperty.INSTANCE.getSAVE_CANCEL_CHECKOUT_EXPERIENCE_FAILURE_REQUEST(), com.paypal.oslo.feature.inappcheckout.domain.model.EventPropertyKeyKt.with(com.paypal.oslo.feature.inappcheckout.domain.model.EventPropertyKey.ErrorDescription, error));
    }

    @Override // com.paypal.oslo.feature.inappcheckout.features.analytics.AnalyticsTracer
    public final void trackAppVersionGatingWebFallbackUnknown() {
        this.getHighSpeedVideoFpsRanges.logAnalyticsEvent(com.paypal.oslo.feature.inappcheckout.features.analytics.domain.CheckoutAnalyticsImpressionEvent.INSTANCE.getVERSION_GATING_WEB_FALLBACK_UNKNOWN(), new com.paypal.oslo.feature.inappcheckout.domain.model.EventProperty[0]);
    }

    @Override // com.paypal.oslo.feature.inappcheckout.features.analytics.AnalyticsTracer
    public final void trackAppVersionGatingWebFallbackMuECS() {
        this.getHighSpeedVideoFpsRanges.logAnalyticsEvent(com.paypal.oslo.feature.inappcheckout.features.analytics.domain.CheckoutAnalyticsImpressionEvent.INSTANCE.getVERSION_GATING_WEB_FALLBACK__MU_ECS(), new com.paypal.oslo.feature.inappcheckout.domain.model.EventProperty[0]);
    }

    @Override // com.paypal.oslo.feature.inappcheckout.features.analytics.AnalyticsTracer
    public final void trackAppVersionGatingWebFallbackMuVA() {
        this.getHighSpeedVideoFpsRanges.logAnalyticsEvent(com.paypal.oslo.feature.inappcheckout.features.analytics.domain.CheckoutAnalyticsImpressionEvent.INSTANCE.getVERSION_GATING_WEB_FALLBACK_MU_VA(), new com.paypal.oslo.feature.inappcheckout.domain.model.EventProperty[0]);
    }

    @Override // com.paypal.oslo.feature.inappcheckout.features.analytics.AnalyticsTracer
    public final void trackAppVersionGatingWebFallbackMuBilling() {
        this.getHighSpeedVideoFpsRanges.logAnalyticsEvent(com.paypal.oslo.feature.inappcheckout.features.analytics.domain.CheckoutAnalyticsImpressionEvent.INSTANCE.getVERSION_GATING_WEB_FALLBACK_MU_BILLING(), new com.paypal.oslo.feature.inappcheckout.domain.model.EventProperty[0]);
    }

    @Override // com.paypal.oslo.feature.inappcheckout.features.analytics.AnalyticsTracer
    public final void trackAppVersionGatingWebFallbackNoMuECS() {
        this.getHighSpeedVideoFpsRanges.logAnalyticsEvent(com.paypal.oslo.feature.inappcheckout.features.analytics.domain.CheckoutAnalyticsImpressionEvent.INSTANCE.getVERSION_GATING_WEB_FALLBACK_NO_MU_ECS(), new com.paypal.oslo.feature.inappcheckout.domain.model.EventProperty[0]);
    }

    @Override // com.paypal.oslo.feature.inappcheckout.features.analytics.AnalyticsTracer
    public final void trackAppVersionGatingWebFallbackNoMuVA() {
        this.getHighSpeedVideoFpsRanges.logAnalyticsEvent(com.paypal.oslo.feature.inappcheckout.features.analytics.domain.CheckoutAnalyticsImpressionEvent.INSTANCE.getVERSION_GATING_WEB_FALLBACK_NO_MU_VA(), new com.paypal.oslo.feature.inappcheckout.domain.model.EventProperty[0]);
    }

    @Override // com.paypal.oslo.feature.inappcheckout.features.analytics.AnalyticsTracer
    public final void trackAppVersionGatingWebFallbackNoMuBilling() {
        this.getHighSpeedVideoFpsRanges.logAnalyticsEvent(com.paypal.oslo.feature.inappcheckout.features.analytics.domain.CheckoutAnalyticsImpressionEvent.INSTANCE.getVERSION_GATING_WEB_FALLBACK_NO_MU_BILLING(), new com.paypal.oslo.feature.inappcheckout.domain.model.EventProperty[0]);
    }

    @Override // com.paypal.oslo.feature.inappcheckout.features.analytics.AnalyticsTracer
    public final void trackAppVersionGatingRedirectedToNative() {
        this.getHighSpeedVideoFpsRanges.logAnalyticsEvent(com.paypal.oslo.feature.inappcheckout.features.analytics.domain.CheckoutAnalyticsImpressionEvent.INSTANCE.getVERSION_GATING_NON_FALLBACK_NATIVE(), new com.paypal.oslo.feature.inappcheckout.domain.model.EventProperty[0]);
    }

    @Override // com.paypal.oslo.feature.inappcheckout.features.analytics.AnalyticsTracer
    public final void trackAppVersionGatingRedirectedToWebView() {
        this.getHighSpeedVideoFpsRanges.logAnalyticsEvent(com.paypal.oslo.feature.inappcheckout.features.analytics.domain.CheckoutAnalyticsImpressionEvent.INSTANCE.getVERSION_GATING_NON_FALLBACK_WEBVIEW(), new com.paypal.oslo.feature.inappcheckout.domain.model.EventProperty[0]);
    }

    @Override // com.paypal.oslo.feature.inappcheckout.features.analytics.AnalyticsTracer
    public final void trackButtonForwardPressed() {
        this.getHighSpeedVideoFpsRanges.logAnalyticsEvent(com.paypal.oslo.feature.inappcheckout.features.analytics.domain.CheckoutAnalyticsImpressionEvent.INSTANCE.getON_BUTTON_FORWARD_PRESSED(), new com.paypal.oslo.feature.inappcheckout.domain.model.EventProperty[0]);
    }

    @Override // com.paypal.oslo.feature.inappcheckout.features.analytics.AnalyticsTracer
    public final void trackButtonBackwardPressed() {
        this.getHighSpeedVideoFpsRanges.logAnalyticsEvent(com.paypal.oslo.feature.inappcheckout.features.analytics.domain.CheckoutAnalyticsImpressionEvent.INSTANCE.getON_BUTTON_BACKWARD_PRESSED(), new com.paypal.oslo.feature.inappcheckout.domain.model.EventProperty[0]);
    }

    @Override // com.paypal.oslo.feature.inappcheckout.features.analytics.AnalyticsTracer
    public final void trackElmoExperiment(java.lang.String experimentID, java.lang.String treatmentID) {
        this.getHighSpeedVideoFpsRanges.logAnalyticsEvent(com.paypal.oslo.feature.inappcheckout.features.analytics.domain.CheckoutAnalyticsImpressionEvent.INSTANCE.getAPP_SWITCH_ELMO_EXPERIMENT(), com.paypal.oslo.feature.inappcheckout.domain.model.EventPropertyKeyKt.with(com.paypal.oslo.feature.inappcheckout.domain.model.EventPropertyKey.ExperimentationExperience, experimentID), com.paypal.oslo.feature.inappcheckout.domain.model.EventPropertyKeyKt.with(com.paypal.oslo.feature.inappcheckout.domain.model.EventPropertyKey.ExperimentationTreatment, treatmentID));
    }

    @Override // com.paypal.oslo.feature.inappcheckout.features.analytics.AnalyticsTracer
    public final void trackOnFragmentDestroyed() {
        this.getHighSpeedVideoFpsRanges.logAnalyticsEvent(com.paypal.oslo.feature.inappcheckout.features.analytics.domain.CheckoutAnalyticsImpressionEvent.INSTANCE.getFRAGMENT_DESTROYED(), new com.paypal.oslo.feature.inappcheckout.domain.model.EventProperty[0]);
    }

    @Override // com.paypal.oslo.feature.inappcheckout.features.analytics.AnalyticsTracer
    public final void trackReadyToLoadApprovalURL(java.lang.String approvalUrl) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(approvalUrl, "");
        this.getHighSpeedVideoFpsRanges.logAnalyticsEvent(com.paypal.oslo.feature.inappcheckout.features.analytics.domain.CheckoutAnalyticsImpressionEvent.INSTANCE.getREADY_TO_LOAD_APPROVAL_URL(), com.paypal.oslo.feature.inappcheckout.domain.model.EventPropertyKeyKt.with(com.paypal.oslo.feature.inappcheckout.domain.model.EventPropertyKey.ApprovalUrl, approvalUrl));
    }

    @Override // com.paypal.oslo.feature.inappcheckout.features.analytics.AnalyticsTracer
    public final void trackHomeBackgroundTimeoutProceeded() {
        this.getHighSpeedVideoFpsRanges.logAnalyticsEvent(com.paypal.oslo.feature.inappcheckout.features.analytics.domain.CheckoutAnalyticsImpressionEvent.INSTANCE.getHOME_BACKGROUND_TIMEOUT(), com.paypal.oslo.feature.inappcheckout.domain.model.EventProperty.INSTANCE.getHOME_BACKGROUND_TIMEOUT_OUTCOME_PROCEEDED());
    }

    @Override // com.paypal.oslo.feature.inappcheckout.features.analytics.AnalyticsTracer
    public final void trackHomeBackgroundTimeoutSkipped() {
        this.getHighSpeedVideoFpsRanges.logAnalyticsEvent(com.paypal.oslo.feature.inappcheckout.features.analytics.domain.CheckoutAnalyticsImpressionEvent.INSTANCE.getHOME_BACKGROUND_TIMEOUT(), com.paypal.oslo.feature.inappcheckout.domain.model.EventProperty.INSTANCE.getHOME_BACKGROUND_TIMEOUT_OUTCOME_SKIPPED());
    }

    @Override // com.paypal.oslo.feature.inappcheckout.features.analytics.AnalyticsTracer
    public final void trackInboundLinkResolved() {
        this.getHighSpeedVideoFpsRanges.logAnalyticsEvent(com.paypal.oslo.feature.inappcheckout.features.analytics.domain.CheckoutAnalyticsImpressionEvent.INSTANCE.getINBOUND_LINK_RESOLVED(), new com.paypal.oslo.feature.inappcheckout.domain.model.EventProperty[0]);
    }

    @Override // com.paypal.oslo.feature.inappcheckout.features.analytics.AnalyticsTracer
    public final void trackOutboundLinkResolved(java.lang.String action, java.lang.String returnUrl, java.lang.String errorMessage) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(action, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(returnUrl, "");
        this.getHighSpeedVideoFpsRanges.logAnalyticsEvent(com.paypal.oslo.feature.inappcheckout.features.analytics.domain.CheckoutAnalyticsImpressionEvent.INSTANCE.getOUTBOUND_LINK_RESOLVED(), com.paypal.oslo.feature.inappcheckout.domain.model.EventPropertyKeyKt.with(com.paypal.oslo.feature.inappcheckout.domain.model.EventPropertyKey.ReturnUrl, returnUrl), com.paypal.oslo.feature.inappcheckout.domain.model.EventPropertyKeyKt.with(com.paypal.oslo.feature.inappcheckout.domain.model.EventPropertyKey.UserIntentAction, action), com.paypal.oslo.feature.inappcheckout.domain.model.EventPropertyKeyKt.with(com.paypal.oslo.feature.inappcheckout.domain.model.EventPropertyKey.ErrorDescription, errorMessage));
    }
}
