package com.paypal.oslo.feature.identity.login.data.mapper;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0000¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/identity/api/CheckoutInputData;", "Lcom/paypal/oslo/api/graphql/schema/type/CheckoutDataInput;", "toGraphQL", "(Lcom/paypal/oslo/feature/identity/api/CheckoutInputData;)Lcom/paypal/oslo/api/graphql/schema/type/CheckoutDataInput;", "Lcom/paypal/oslo/feature/identity/graphql/fragment/IdentityCheckoutDataFragment;", "Lcom/paypal/oslo/feature/identity/api/model/CheckoutData;", "toDomain", "(Lcom/paypal/oslo/feature/identity/graphql/fragment/IdentityCheckoutDataFragment;)Lcom/paypal/oslo/feature/identity/api/model/CheckoutData;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class CheckoutDataMapperKt {
    public static final com.paypal.oslo.api.graphql.schema.type.CheckoutDataInput toGraphQL(com.paypal.oslo.feature.identity.api.CheckoutInputData checkoutInputData) {
        com.paypal.oslo.api.graphql.schema.type.CheckoutTokenType checkoutTokenType;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(checkoutInputData, "");
        java.lang.String token = checkoutInputData.getToken();
        int i = com.paypal.oslo.feature.identity.login.data.mapper.CheckoutDataMapperKt.WhenMappings.$EnumSwitchMapping$0[checkoutInputData.getTokenType().ordinal()];
        if (i == 1) {
            checkoutTokenType = com.paypal.oslo.api.graphql.schema.type.CheckoutTokenType.BILLING_TOKEN;
        } else if (i == 2) {
            checkoutTokenType = com.paypal.oslo.api.graphql.schema.type.CheckoutTokenType.ORDER_ID;
        } else if (i == 3) {
            checkoutTokenType = com.paypal.oslo.api.graphql.schema.type.CheckoutTokenType.CHECKOUT_TOKEN;
        } else {
            if (i != 4) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            checkoutTokenType = com.paypal.oslo.api.graphql.schema.type.CheckoutTokenType.VAULT_ID;
        }
        return new com.paypal.oslo.api.graphql.schema.type.CheckoutDataInput(token, checkoutTokenType);
    }

    public static final com.paypal.oslo.feature.identity.api.model.CheckoutData toDomain(com.paypal.oslo.feature.identity.graphql.fragment.IdentityCheckoutDataFragment identityCheckoutDataFragment) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(identityCheckoutDataFragment, "");
        java.lang.Object cancelUrl = identityCheckoutDataFragment.getCheckoutPreferences().getCancelUrl();
        java.lang.String str = cancelUrl instanceof java.lang.String ? (java.lang.String) cancelUrl : null;
        java.lang.Object returnUrl = identityCheckoutDataFragment.getCheckoutPreferences().getReturnUrl();
        java.lang.String str2 = returnUrl instanceof java.lang.String ? (java.lang.String) returnUrl : null;
        java.lang.Object checkoutApprovalUrl = identityCheckoutDataFragment.getCheckoutPreferences().getCheckoutApprovalUrl();
        java.lang.String str3 = checkoutApprovalUrl instanceof java.lang.String ? (java.lang.String) checkoutApprovalUrl : null;
        java.lang.Object bridgeUrl = identityCheckoutDataFragment.getCheckoutPreferences().getBridgeUrl();
        return new com.paypal.oslo.feature.identity.api.model.CheckoutData(new com.paypal.oslo.feature.identity.api.model.CheckoutPreferences(str, str2, str3, bridgeUrl instanceof java.lang.String ? (java.lang.String) bridgeUrl : null, new com.paypal.oslo.feature.identity.api.model.AppSwitchPreferences(identityCheckoutDataFragment.getCheckoutPreferences().getAppSwitchPreferences().getReturnFlow(), identityCheckoutDataFragment.getCheckoutPreferences().getAppSwitchPreferences().getAppSwitchApiIntegrationChannel(), identityCheckoutDataFragment.getCheckoutPreferences().getAppSwitchPreferences().getBrowserName(), identityCheckoutDataFragment.getCheckoutPreferences().getAppSwitchPreferences().isWebView(), identityCheckoutDataFragment.getCheckoutPreferences().getAppSwitchPreferences().getFallbackUrlScheme())), identityCheckoutDataFragment.getNativeCheckOutData());
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.identity.api.CheckoutTokenType.values().length];
            try {
                iArr[com.paypal.oslo.feature.identity.api.CheckoutTokenType.BILLING_TOKEN.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.identity.api.CheckoutTokenType.ORDER_ID.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.paypal.oslo.feature.identity.api.CheckoutTokenType.CHECKOUT_TOKEN.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[com.paypal.oslo.feature.identity.api.CheckoutTokenType.VAULT_ID.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
