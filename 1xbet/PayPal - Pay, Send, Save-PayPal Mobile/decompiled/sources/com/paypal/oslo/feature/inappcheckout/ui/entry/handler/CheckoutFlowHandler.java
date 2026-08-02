package com.paypal.oslo.feature.inappcheckout.ui.entry.handler;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001:\u0001\u001aB\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0011\u0010\t\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\u000e\u001a\u00020\r2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0014\u001a\u00020\u0010¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\t\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0019\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0018"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/ui/entry/handler/CheckoutFlowHandler;", "", "Lcom/paypal/oslo/feature/inappcheckout/features/session/AppSwitchSession;", "session", "Lcom/paypal/oslo/feature/inappcheckout/features/statsig/dynamicConfiguration/DynamicConfigurationManager;", "dynamicConfigurationManager", "<init>", "(Lcom/paypal/oslo/feature/inappcheckout/features/session/AppSwitchSession;Lcom/paypal/oslo/feature/inappcheckout/features/statsig/dynamicConfiguration/DynamicConfigurationManager;)V", "", "getHighSpeedVideoFpsRangesFor", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/inappcheckout/features/webview/domain/model/OneShotAuthenticationResult;", "result", "Lcom/paypal/oslo/feature/inappcheckout/ui/entry/handler/CheckoutFlowHandler$Outcome;", "evaluate", "(Lcom/paypal/oslo/feature/inappcheckout/features/webview/domain/model/OneShotAuthenticationResult;)Lcom/paypal/oslo/feature/inappcheckout/ui/entry/handler/CheckoutFlowHandler$Outcome;", "", "p0", "getHighSpeedVideoSizes", "(Z)Lcom/paypal/oslo/feature/inappcheckout/ui/entry/handler/CheckoutFlowHandler$Outcome;", "isAllFlowsDisallowedByVersionGating", "()Z", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/feature/inappcheckout/features/session/AppSwitchSession;", "Lcom/paypal/oslo/feature/inappcheckout/features/statsig/dynamicConfiguration/DynamicConfigurationManager;", "getHighResolutionOutputSizeshNQ4ISI", "Outcome"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class CheckoutFlowHandler {
    public static final int $stable = 0;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.inappcheckout.features.session.AppSwitchSession getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.inappcheckout.features.statsig.dynamicConfiguration.DynamicConfigurationManager getHighResolutionOutputSizeshNQ4ISI;

    @javax.inject.Inject
    public CheckoutFlowHandler(com.paypal.oslo.feature.inappcheckout.features.session.AppSwitchSession appSwitchSession, com.paypal.oslo.feature.inappcheckout.features.statsig.dynamicConfiguration.DynamicConfigurationManager dynamicConfigurationManager) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appSwitchSession, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dynamicConfigurationManager, "");
        this.getHighSpeedVideoFpsRangesFor = appSwitchSession;
        this.getHighResolutionOutputSizeshNQ4ISI = dynamicConfigurationManager;
    }

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/ui/entry/handler/CheckoutFlowHandler$Outcome;", "", "Native", "WebView", "Fallback", "Lcom/paypal/oslo/feature/inappcheckout/ui/entry/handler/CheckoutFlowHandler$Outcome$Fallback;", "Lcom/paypal/oslo/feature/inappcheckout/ui/entry/handler/CheckoutFlowHandler$Outcome$Native;", "Lcom/paypal/oslo/feature/inappcheckout/ui/entry/handler/CheckoutFlowHandler$Outcome$WebView;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public interface Outcome {

        @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/ui/entry/handler/CheckoutFlowHandler$Outcome$Native;", "Lcom/paypal/oslo/feature/inappcheckout/ui/entry/handler/CheckoutFlowHandler$Outcome;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class Native implements com.paypal.oslo.feature.inappcheckout.ui.entry.handler.CheckoutFlowHandler.Outcome {
            public static final int $stable = 0;
            public static final com.paypal.oslo.feature.inappcheckout.ui.entry.handler.CheckoutFlowHandler.Outcome.Native INSTANCE = new com.paypal.oslo.feature.inappcheckout.ui.entry.handler.CheckoutFlowHandler.Outcome.Native();

            public final int hashCode() {
                return -2083429688;
            }

            private Native() {
            }

            public final java.lang.String toString() {
                return "Native";
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.paypal.oslo.feature.inappcheckout.ui.entry.handler.CheckoutFlowHandler.Outcome.Native)) {
                    return false;
                }
                return true;
            }
        }

        @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/ui/entry/handler/CheckoutFlowHandler$Outcome$WebView;", "Lcom/paypal/oslo/feature/inappcheckout/ui/entry/handler/CheckoutFlowHandler$Outcome;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class WebView implements com.paypal.oslo.feature.inappcheckout.ui.entry.handler.CheckoutFlowHandler.Outcome {
            public static final int $stable = 0;
            public static final com.paypal.oslo.feature.inappcheckout.ui.entry.handler.CheckoutFlowHandler.Outcome.WebView INSTANCE = new com.paypal.oslo.feature.inappcheckout.ui.entry.handler.CheckoutFlowHandler.Outcome.WebView();

            public final int hashCode() {
                return -666897528;
            }

            private WebView() {
            }

            public final java.lang.String toString() {
                return "WebView";
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.paypal.oslo.feature.inappcheckout.ui.entry.handler.CheckoutFlowHandler.Outcome.WebView)) {
                    return false;
                }
                return true;
            }
        }

        @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/ui/entry/handler/CheckoutFlowHandler$Outcome$Fallback;", "Lcom/paypal/oslo/feature/inappcheckout/ui/entry/handler/CheckoutFlowHandler$Outcome;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class Fallback implements com.paypal.oslo.feature.inappcheckout.ui.entry.handler.CheckoutFlowHandler.Outcome {
            public static final int $stable = 0;
            public static final com.paypal.oslo.feature.inappcheckout.ui.entry.handler.CheckoutFlowHandler.Outcome.Fallback INSTANCE = new com.paypal.oslo.feature.inappcheckout.ui.entry.handler.CheckoutFlowHandler.Outcome.Fallback();

            public final int hashCode() {
                return -2005610157;
            }

            private Fallback() {
            }

            public final java.lang.String toString() {
                return "Fallback";
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.paypal.oslo.feature.inappcheckout.ui.entry.handler.CheckoutFlowHandler.Outcome.Fallback)) {
                    return false;
                }
                return true;
            }
        }
    }

    private final java.lang.String getHighSpeedVideoFpsRangesFor() {
        com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.CheckoutToken checkoutToken = this.getHighSpeedVideoFpsRangesFor.getCheckoutToken();
        if (checkoutToken != null && checkoutToken.isBAToken()) {
            return "billing";
        }
        com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.CheckoutToken checkoutToken2 = this.getHighSpeedVideoFpsRangesFor.getCheckoutToken();
        if (checkoutToken2 != null && checkoutToken2.isECToken()) {
            return "onetime";
        }
        com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.CheckoutToken checkoutToken3 = this.getHighSpeedVideoFpsRangesFor.getCheckoutToken();
        if (checkoutToken3 == null || !checkoutToken3.isVaultSetupToken()) {
            return null;
        }
        return "vaulting";
    }

    public static /* synthetic */ com.paypal.oslo.feature.inappcheckout.ui.entry.handler.CheckoutFlowHandler.Outcome evaluate$default(com.paypal.oslo.feature.inappcheckout.ui.entry.handler.CheckoutFlowHandler checkoutFlowHandler, com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.OneShotAuthenticationResult oneShotAuthenticationResult, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            oneShotAuthenticationResult = null;
        }
        return checkoutFlowHandler.evaluate(oneShotAuthenticationResult);
    }

    public final com.paypal.oslo.feature.inappcheckout.ui.entry.handler.CheckoutFlowHandler.Outcome evaluate(com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.OneShotAuthenticationResult result) {
        if (result == null) {
            return getHighSpeedVideoSizes(false);
        }
        return result.isNativeFlow() ? getHighSpeedVideoSizes(true) : result.isWebFlow() ? getHighSpeedVideoSizes(false) : com.paypal.oslo.feature.inappcheckout.ui.entry.handler.CheckoutFlowHandler.Outcome.Fallback.INSTANCE;
    }

    private final com.paypal.oslo.feature.inappcheckout.ui.entry.handler.CheckoutFlowHandler.Outcome getHighSpeedVideoSizes(boolean p0) {
        java.lang.String str;
        com.paypal.oslo.feature.inappcheckout.ui.entry.handler.CheckoutFlowHandler.Outcome outcome = p0 ? com.paypal.oslo.feature.inappcheckout.ui.entry.handler.CheckoutFlowHandler.Outcome.Native.INSTANCE : com.paypal.oslo.feature.inappcheckout.ui.entry.handler.CheckoutFlowHandler.Outcome.WebView.INSTANCE;
        java.lang.String str2 = p0 ? "native" : "web";
        java.lang.String highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor();
        if (this.getHighSpeedVideoFpsRangesFor.isMerchantUpgradePath()) {
            str = "merchantUpgrade";
        } else {
            str = this.getHighSpeedVideoFpsRangesFor.isNoMerchantUpgradePath() ? "noMerchantUpgrade" : null;
        }
        return (highSpeedVideoFpsRangesFor == null || str == null || this.getHighResolutionOutputSizeshNQ4ISI.isFlowAllowed(str2, str, highSpeedVideoFpsRangesFor)) ? outcome : com.paypal.oslo.feature.inappcheckout.ui.entry.handler.CheckoutFlowHandler.Outcome.Fallback.INSTANCE;
    }

    public final boolean isAllFlowsDisallowedByVersionGating() {
        java.lang.String str;
        java.lang.String highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor();
        if (this.getHighSpeedVideoFpsRangesFor.isMerchantUpgradePath()) {
            str = "merchantUpgrade";
        } else {
            str = this.getHighSpeedVideoFpsRangesFor.isNoMerchantUpgradePath() ? "noMerchantUpgrade" : null;
        }
        if (highSpeedVideoFpsRangesFor == null || str == null) {
            return false;
        }
        return this.getHighResolutionOutputSizeshNQ4ISI.isAllFlowsDisallowed(str, highSpeedVideoFpsRangesFor);
    }
}
