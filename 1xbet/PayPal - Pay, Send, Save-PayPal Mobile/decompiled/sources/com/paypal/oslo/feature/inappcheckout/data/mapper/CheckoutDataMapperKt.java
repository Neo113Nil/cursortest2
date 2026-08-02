package com.paypal.oslo.feature.inappcheckout.data.mapper;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/features/webview/domain/model/ExternalTokenType;", "Lcom/paypal/oslo/feature/identity/api/CheckoutTokenType;", "toCheckoutTokenType", "(Lcom/paypal/oslo/feature/inappcheckout/features/webview/domain/model/ExternalTokenType;)Lcom/paypal/oslo/feature/identity/api/CheckoutTokenType;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class CheckoutDataMapperKt {
    public static final com.paypal.oslo.feature.identity.api.CheckoutTokenType toCheckoutTokenType(com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.ExternalTokenType externalTokenType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(externalTokenType, "");
        int i = com.paypal.oslo.feature.inappcheckout.data.mapper.CheckoutDataMapperKt.WhenMappings.$EnumSwitchMapping$0[externalTokenType.ordinal()];
        if (i == 1) {
            return com.paypal.oslo.feature.identity.api.CheckoutTokenType.BILLING_TOKEN;
        }
        if (i == 2) {
            return com.paypal.oslo.feature.identity.api.CheckoutTokenType.CHECKOUT_TOKEN;
        }
        if (i == 3) {
            return com.paypal.oslo.feature.identity.api.CheckoutTokenType.VAULT_ID;
        }
        if (i == 4) {
            return com.paypal.oslo.feature.identity.api.CheckoutTokenType.ORDER_ID;
        }
        if (i != 5) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return com.paypal.oslo.feature.identity.api.CheckoutTokenType.BILLING_TOKEN;
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.ExternalTokenType.values().length];
            try {
                iArr[com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.ExternalTokenType.BILLING_TOKEN.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.ExternalTokenType.CHECKOUT_TOKEN.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.ExternalTokenType.VAULT_ID.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.ExternalTokenType.ORDER_ID.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr[com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.ExternalTokenType.UNKNOWN.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
