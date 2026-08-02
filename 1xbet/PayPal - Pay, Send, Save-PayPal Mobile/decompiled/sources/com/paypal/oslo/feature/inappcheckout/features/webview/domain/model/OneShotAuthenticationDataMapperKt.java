package com.paypal.oslo.feature.inappcheckout.features.webview.domain.model;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0000¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/identity/api/model/CheckoutAuthenticationSuccessData;", "Lcom/paypal/oslo/feature/inappcheckout/features/webview/domain/model/OneShotAuthenticationData;", "toOneShotAuthenticationData", "(Lcom/paypal/oslo/feature/identity/api/model/CheckoutAuthenticationSuccessData;)Lcom/paypal/oslo/feature/inappcheckout/features/webview/domain/model/OneShotAuthenticationData;", "Lcom/paypal/oslo/api/graphql/schema/type/AppSwitchAPIIntegrationChannel;", "Lcom/paypal/oslo/feature/inappcheckout/features/merchantUpgrade/MerchantIntegration$ApiIntegration;", "toApiIntegration", "(Lcom/paypal/oslo/api/graphql/schema/type/AppSwitchAPIIntegrationChannel;)Lcom/paypal/oslo/feature/inappcheckout/features/merchantUpgrade/MerchantIntegration$ApiIntegration;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class OneShotAuthenticationDataMapperKt {
    public static final com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.OneShotAuthenticationData toOneShotAuthenticationData(com.paypal.oslo.feature.identity.api.model.CheckoutAuthenticationSuccessData checkoutAuthenticationSuccessData) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(checkoutAuthenticationSuccessData, "");
        com.paypal.oslo.feature.identity.api.model.CheckoutData checkoutData = checkoutAuthenticationSuccessData.getCheckoutData();
        if (checkoutData == null) {
            throw new java.lang.IllegalStateException("CheckoutData is null in CheckoutAuthenticationSuccessData".toString());
        }
        com.paypal.oslo.feature.identity.api.model.CheckoutPreferences checkoutPreferences = checkoutData.getCheckoutPreferences();
        java.lang.String cancelUrl = checkoutPreferences.getCancelUrl();
        if (cancelUrl == null) {
            cancelUrl = "";
        }
        java.lang.String returnUrl = checkoutPreferences.getReturnUrl();
        if (returnUrl == null) {
            returnUrl = "";
        }
        java.lang.String checkoutApprovalUrl = checkoutPreferences.getCheckoutApprovalUrl();
        com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.CheckoutURLs checkoutURLs = new com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.CheckoutURLs(cancelUrl, returnUrl, checkoutApprovalUrl != null ? checkoutApprovalUrl : "", checkoutPreferences.getBridgeUrl());
        com.paypal.oslo.api.graphql.schema.type.AppSwitchAPIIntegrationChannel appSwitchApiIntegrationChannel = checkoutPreferences.getAppSwitchPreferences().getAppSwitchApiIntegrationChannel();
        return new com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.OneShotAuthenticationData(checkoutAuthenticationSuccessData.getAuthCode(), new com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.CheckoutPreferences(checkoutURLs, appSwitchApiIntegrationChannel != null ? toApiIntegration(appSwitchApiIntegrationChannel) : null, null));
    }

    public static final com.paypal.oslo.feature.inappcheckout.features.merchantUpgrade.MerchantIntegration.ApiIntegration toApiIntegration(com.paypal.oslo.api.graphql.schema.type.AppSwitchAPIIntegrationChannel appSwitchAPIIntegrationChannel) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appSwitchAPIIntegrationChannel, "");
        int i = com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.OneShotAuthenticationDataMapperKt.WhenMappings.$EnumSwitchMapping$0[appSwitchAPIIntegrationChannel.ordinal()];
        if (i == 1) {
            return com.paypal.oslo.feature.inappcheckout.features.merchantUpgrade.MerchantIntegration.ApiIntegration.NativeApp.INSTANCE;
        }
        if (i == 2) {
            return com.paypal.oslo.feature.inappcheckout.features.merchantUpgrade.MerchantIntegration.ApiIntegration.WebApp.INSTANCE;
        }
        if (i != 3) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return com.paypal.oslo.feature.inappcheckout.features.merchantUpgrade.MerchantIntegration.ApiIntegration.NativeApp.INSTANCE;
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.api.graphql.schema.type.AppSwitchAPIIntegrationChannel.values().length];
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.AppSwitchAPIIntegrationChannel.NATIVE_APP.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.AppSwitchAPIIntegrationChannel.MOBILE_WEB.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.AppSwitchAPIIntegrationChannel.UNKNOWN__.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
