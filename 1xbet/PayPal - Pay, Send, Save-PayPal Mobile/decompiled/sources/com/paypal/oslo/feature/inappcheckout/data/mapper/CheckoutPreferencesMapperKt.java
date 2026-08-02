package com.paypal.oslo.feature.inappcheckout.data.mapper;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0015\u0010\t\u001a\u0004\u0018\u00010\b*\u00020\u0004H\u0000¢\u0006\u0004\b\t\u0010\n\u001a\u0013\u0010\r\u001a\u00020\f*\u00020\u000bH\u0000¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/type/ExternalAppSwitchAPIIntegrationChannel;", "Lcom/paypal/oslo/feature/inappcheckout/features/merchantUpgrade/MerchantIntegration$ApiIntegration;", "toApiIntegration", "(Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/type/ExternalAppSwitchAPIIntegrationChannel;)Lcom/paypal/oslo/feature/inappcheckout/features/merchantUpgrade/MerchantIntegration$ApiIntegration;", "Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/GetCheckoutPreferencesQuery$OnExternalCheckoutPreferencesSuccessResponse;", "Lcom/paypal/oslo/feature/inappcheckout/features/webview/domain/model/CheckoutURLs;", "toCheckoutURLs", "(Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/GetCheckoutPreferencesQuery$OnExternalCheckoutPreferencesSuccessResponse;)Lcom/paypal/oslo/feature/inappcheckout/features/webview/domain/model/CheckoutURLs;", "Lcom/paypal/oslo/feature/inappcheckout/domain/model/MerchantDetails;", "toMerchantDetails", "(Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/GetCheckoutPreferencesQuery$OnExternalCheckoutPreferencesSuccessResponse;)Lcom/paypal/oslo/feature/inappcheckout/domain/model/MerchantDetails;", "Lcom/paypal/oslo/feature/inappcheckout/features/webview/domain/model/ExternalTokenType;", "Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/type/ExternalTokenType;", "toGraphQLTokenType", "(Lcom/paypal/oslo/feature/inappcheckout/features/webview/domain/model/ExternalTokenType;)Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/type/ExternalTokenType;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class CheckoutPreferencesMapperKt {
    public static final com.paypal.oslo.feature.inappcheckout.features.merchantUpgrade.MerchantIntegration.ApiIntegration toApiIntegration(com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalAppSwitchAPIIntegrationChannel externalAppSwitchAPIIntegrationChannel) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(externalAppSwitchAPIIntegrationChannel, "");
        int i = com.paypal.oslo.feature.inappcheckout.data.mapper.CheckoutPreferencesMapperKt.WhenMappings.$EnumSwitchMapping$0[externalAppSwitchAPIIntegrationChannel.ordinal()];
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

    public static final com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.CheckoutURLs toCheckoutURLs(com.paypal.oslo.feature.inappcheckout.graphql.checkout.GetCheckoutPreferencesQuery.OnExternalCheckoutPreferencesSuccessResponse onExternalCheckoutPreferencesSuccessResponse) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onExternalCheckoutPreferencesSuccessResponse, "");
        java.lang.String cancelUrl = onExternalCheckoutPreferencesSuccessResponse.getCancelUrl();
        if (cancelUrl == null) {
            cancelUrl = "";
        }
        java.lang.String returnUrl = onExternalCheckoutPreferencesSuccessResponse.getReturnUrl();
        if (returnUrl == null) {
            returnUrl = "";
        }
        java.lang.String checkoutApprovalUrl = onExternalCheckoutPreferencesSuccessResponse.getCheckoutApprovalUrl();
        return new com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.CheckoutURLs(cancelUrl, returnUrl, checkoutApprovalUrl != null ? checkoutApprovalUrl : "", onExternalCheckoutPreferencesSuccessResponse.getBridgeUrl());
    }

    public static final com.paypal.oslo.feature.inappcheckout.domain.model.MerchantDetails toMerchantDetails(com.paypal.oslo.feature.inappcheckout.graphql.checkout.GetCheckoutPreferencesQuery.OnExternalCheckoutPreferencesSuccessResponse onExternalCheckoutPreferencesSuccessResponse) {
        java.lang.String name2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onExternalCheckoutPreferencesSuccessResponse, "");
        com.paypal.oslo.feature.inappcheckout.graphql.checkout.GetCheckoutPreferencesQuery.MerchantDetails merchantDetails = onExternalCheckoutPreferencesSuccessResponse.getMerchantDetails();
        if (merchantDetails == null || (name2 = merchantDetails.getName()) == null) {
            return null;
        }
        return new com.paypal.oslo.feature.inappcheckout.domain.model.MerchantDetails(name2, null, null, 6, null);
    }

    public static final com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalTokenType toGraphQLTokenType(com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.ExternalTokenType externalTokenType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(externalTokenType, "");
        int i = com.paypal.oslo.feature.inappcheckout.data.mapper.CheckoutPreferencesMapperKt.WhenMappings.$EnumSwitchMapping$1[externalTokenType.ordinal()];
        if (i == 1) {
            return com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalTokenType.ORDER_ID;
        }
        if (i == 2) {
            return com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalTokenType.VAULT_ID;
        }
        if (i == 3) {
            return com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalTokenType.CHECKOUT_TOKEN;
        }
        if (i == 4) {
            return com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalTokenType.BILLING_TOKEN;
        }
        if (i != 5) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalTokenType.UNKNOWN__;
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalAppSwitchAPIIntegrationChannel.values().length];
            try {
                iArr[com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalAppSwitchAPIIntegrationChannel.NATIVE_APP.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalAppSwitchAPIIntegrationChannel.MOBILE_WEB.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalAppSwitchAPIIntegrationChannel.UNKNOWN__.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.ExternalTokenType.values().length];
            try {
                iArr2[com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.ExternalTokenType.ORDER_ID.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr2[com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.ExternalTokenType.VAULT_ID.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                iArr2[com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.ExternalTokenType.CHECKOUT_TOKEN.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                iArr2[com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.ExternalTokenType.BILLING_TOKEN.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            try {
                iArr2[com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.ExternalTokenType.UNKNOWN.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }
}
