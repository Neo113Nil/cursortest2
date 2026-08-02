package com.paypal.oslo.feature.inappcheckout.features.javascript;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u000f\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\r\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R*\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u00118\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R*\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u00118\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0013\u001a\u0004\b\u0019\u0010\u0015\"\u0004\b\u001a\u0010\u0017"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/features/javascript/InAppCheckoutJsInterface;", "", "Lkotlinx/coroutines/CoroutineScope;", "coroutineScope", "Lcom/paypal/oslo/feature/inappcheckout/features/logger/CheckoutLogger;", "logger", "<init>", "(Lkotlinx/coroutines/CoroutineScope;Lcom/paypal/oslo/feature/inappcheckout/features/logger/CheckoutLogger;)V", "", "event", "", "postCustomerInteractionEvent", "(Ljava/lang/String;)V", "getHighResolutionOutputSizeshNQ4ISI", "Lkotlinx/coroutines/CoroutineScope;", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/feature/inappcheckout/features/logger/CheckoutLogger;", "Lkotlin/Function0;", "onRypPageRenderedCallback", "Lkotlin/jvm/functions/Function0;", "getOnRypPageRenderedCallback", "()Lkotlin/jvm/functions/Function0;", "setOnRypPageRenderedCallback", "(Lkotlin/jvm/functions/Function0;)V", "onReturnButtonClickedCallback", "getOnReturnButtonClickedCallback", "setOnReturnButtonClickedCallback"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class InAppCheckoutJsInterface {
    public static final int $stable = 8;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final kotlinx.coroutines.CoroutineScope getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.inappcheckout.features.logger.CheckoutLogger getHighResolutionOutputSizeshNQ4ISI;
    private kotlin.jvm.functions.Function0<kotlin.Unit> onReturnButtonClickedCallback;
    private kotlin.jvm.functions.Function0<kotlin.Unit> onRypPageRenderedCallback;

    public InAppCheckoutJsInterface(kotlinx.coroutines.CoroutineScope coroutineScope, com.paypal.oslo.feature.inappcheckout.features.logger.CheckoutLogger checkoutLogger) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineScope, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(checkoutLogger, "");
        this.getHighSpeedVideoFpsRanges = coroutineScope;
        this.getHighResolutionOutputSizeshNQ4ISI = checkoutLogger;
    }

    public final kotlin.jvm.functions.Function0<kotlin.Unit> getOnRypPageRenderedCallback() {
        return this.onRypPageRenderedCallback;
    }

    public final void setOnRypPageRenderedCallback(kotlin.jvm.functions.Function0<kotlin.Unit> function0) {
        this.onRypPageRenderedCallback = function0;
    }

    public final kotlin.jvm.functions.Function0<kotlin.Unit> getOnReturnButtonClickedCallback() {
        return this.onReturnButtonClickedCallback;
    }

    public final void setOnReturnButtonClickedCallback(kotlin.jvm.functions.Function0<kotlin.Unit> function0) {
        this.onReturnButtonClickedCallback = function0;
    }

    @android.webkit.JavascriptInterface
    public final void postCustomerInteractionEvent(java.lang.String event) {
        java.lang.Object obj;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
        try {
            java.lang.String optString = new org.json.JSONObject(event).optString(com.paypal.oslo.feature.inappcheckout.features.javascript.MutationObserverConstants.EVENT_TYPE_KEY);
            java.util.Iterator<E> it = com.paypal.oslo.feature.inappcheckout.features.javascript.WebViewMessageEventType.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                } else {
                    obj = it.next();
                    if (kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.feature.inappcheckout.features.javascript.WebViewMessageEventType) obj).getType(), optString)) {
                        break;
                    }
                }
            }
            com.paypal.oslo.feature.inappcheckout.features.javascript.WebViewMessageEventType webViewMessageEventType = (com.paypal.oslo.feature.inappcheckout.features.javascript.WebViewMessageEventType) obj;
            int i = webViewMessageEventType == null ? -1 : com.paypal.oslo.feature.inappcheckout.features.javascript.InAppCheckoutJsInterface.WhenMappings.$EnumSwitchMapping$0[webViewMessageEventType.ordinal()];
            if (i == -1) {
                com.paypal.oslo.feature.inappcheckout.features.logger.CheckoutLogger.w$default(this.getHighResolutionOutputSizeshNQ4ISI, com.paypal.android.logger.categories.App.Validation.INSTANCE, "Unknown event type received from WebView", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("eventType", optString)), null, 8, null);
                return;
            }
            if (i == 1 || i == 2) {
                com.paypal.oslo.feature.inappcheckout.features.logger.CheckoutLogger.logAnalyticsEvent$default(this.getHighResolutionOutputSizeshNQ4ISI, com.paypal.oslo.feature.inappcheckout.domain.util.LoggerMessages.MOD_XO_USER_LANDED_ON_AGREEMENT_PAGE, com.paypal.android.logger.categories.UI.Interaction.INSTANCE, null, 4, null);
                kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(this.getHighSpeedVideoFpsRanges, null, null, new com.paypal.oslo.feature.inappcheckout.features.javascript.InAppCheckoutJsInterface$postCustomerInteractionEvent$1(this, null), 3, null);
            } else {
                if (i == 3) {
                    com.paypal.oslo.feature.inappcheckout.features.logger.CheckoutLogger.logAnalyticsEvent$default(this.getHighResolutionOutputSizeshNQ4ISI, com.paypal.oslo.feature.inappcheckout.domain.util.LoggerMessages.MOD_XO_USER_CLICKS_AGREE_AND_CONTINUE, com.paypal.android.logger.categories.UI.Interaction.INSTANCE, null, 4, null);
                    return;
                }
                if (i == 4) {
                    com.paypal.oslo.feature.inappcheckout.features.logger.CheckoutLogger.logAnalyticsEvent$default(this.getHighResolutionOutputSizeshNQ4ISI, com.paypal.oslo.feature.inappcheckout.domain.util.LoggerMessages.MOD_XO_USER_CLICKS_PAY_BUTTON, com.paypal.android.logger.categories.UI.Interaction.INSTANCE, null, 4, null);
                } else {
                    if (i != 5) {
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    com.paypal.oslo.feature.inappcheckout.features.logger.CheckoutLogger.logAnalyticsEvent$default(this.getHighResolutionOutputSizeshNQ4ISI, com.paypal.oslo.feature.inappcheckout.domain.util.LoggerMessages.MOD_XO_USER_CLICKS_RETURN_TO_MERCHANT, com.paypal.android.logger.categories.UI.Interaction.INSTANCE, null, 4, null);
                    kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(this.getHighSpeedVideoFpsRanges, null, null, new com.paypal.oslo.feature.inappcheckout.features.javascript.InAppCheckoutJsInterface$postCustomerInteractionEvent$2(this, null), 3, null);
                }
            }
        } catch (org.json.JSONException e) {
            com.paypal.oslo.feature.inappcheckout.features.logger.CheckoutLogger checkoutLogger = this.getHighResolutionOutputSizeshNQ4ISI;
            com.paypal.android.logger.categories.UI.Error error = com.paypal.android.logger.categories.UI.Error.INSTANCE;
            kotlin.Pair[] pairArr = new kotlin.Pair[2];
            pairArr[0] = kotlin.TuplesKt.to("event", event);
            java.lang.String message = e.getMessage();
            if (message == null) {
                message = com.paypal.oslo.feature.settings.closeaccount.data.repository.CloseAccountRepositoryImpl.UNKNOWN_ERROR;
            }
            pairArr[1] = kotlin.TuplesKt.to("error", message);
            com.paypal.oslo.feature.inappcheckout.features.logger.CheckoutLogger.e$default(checkoutLogger, error, "Failed to process customer interaction event from WebView", kotlin.collections.MapsKt.mapOf(pairArr), null, e, 8, null);
        }
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.inappcheckout.features.javascript.WebViewMessageEventType.values().length];
            try {
                iArr[com.paypal.oslo.feature.inappcheckout.features.javascript.WebViewMessageEventType.CONTINUE_BUTTON_READY.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.inappcheckout.features.javascript.WebViewMessageEventType.PAY_BUTTON_READY.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.paypal.oslo.feature.inappcheckout.features.javascript.WebViewMessageEventType.CONTINUE_BUTTON_CLICKED.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[com.paypal.oslo.feature.inappcheckout.features.javascript.WebViewMessageEventType.PAY_BUTTON_CLICKED.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr[com.paypal.oslo.feature.inappcheckout.features.javascript.WebViewMessageEventType.RETURN_BUTTON_CLICKED.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
