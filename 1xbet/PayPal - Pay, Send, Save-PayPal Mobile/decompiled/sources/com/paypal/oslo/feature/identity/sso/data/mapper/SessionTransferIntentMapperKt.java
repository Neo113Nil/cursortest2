package com.paypal.oslo.feature.identity.sso.data.mapper;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0017\u0010\u0003\u001a\u00060\u0001j\u0002`\u0002*\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/paypal/oslo/core/identity/domain/model/SessionTransferIntent;", "Lcom/paypal/oslo/api/graphql/schema/type/AccessTokenExchangeIntent;", "Lcom/paypal/oslo/feature/identity/graphql/type/AccessTokenExchangeIntent;", "toAccessTokenExchangeIntent", "(Lcom/paypal/oslo/core/identity/domain/model/SessionTransferIntent;)Lcom/paypal/oslo/api/graphql/schema/type/AccessTokenExchangeIntent;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class SessionTransferIntentMapperKt {
    public static final com.paypal.oslo.api.graphql.schema.type.AccessTokenExchangeIntent toAccessTokenExchangeIntent(com.paypal.oslo.core.identity.domain.model.SessionTransferIntent sessionTransferIntent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sessionTransferIntent, "");
        switch (com.paypal.oslo.feature.identity.sso.data.mapper.SessionTransferIntentMapperKt.WhenMappings.$EnumSwitchMapping$0[sessionTransferIntent.ordinal()]) {
            case 1:
                return com.paypal.oslo.api.graphql.schema.type.AccessTokenExchangeIntent.INTERAPP_SINGLE_SIGN_ON;
            case 2:
                return com.paypal.oslo.api.graphql.schema.type.AccessTokenExchangeIntent.WEB_SINGLE_SIGN_ON;
            case 3:
                return com.paypal.oslo.api.graphql.schema.type.AccessTokenExchangeIntent.WEB_CHECKOUT_SINGLE_SIGN_ON;
            case 4:
                return com.paypal.oslo.api.graphql.schema.type.AccessTokenExchangeIntent.XOOM_SINGLE_SIGN_ON;
            case 5:
                return com.paypal.oslo.api.graphql.schema.type.AccessTokenExchangeIntent.ZETTLE_SINGLE_SIGN_ON;
            case 6:
                return com.paypal.oslo.api.graphql.schema.type.AccessTokenExchangeIntent.CONNECT_SINGLE_SIGN_ON;
            default:
                throw new kotlin.NoWhenBranchMatchedException();
        }
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.core.identity.domain.model.SessionTransferIntent.values().length];
            try {
                iArr[com.paypal.oslo.core.identity.domain.model.SessionTransferIntent.INTERAPP_SINGLE_SIGN_ON.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.core.identity.domain.model.SessionTransferIntent.WEB_SINGLE_SIGN_ON.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.paypal.oslo.core.identity.domain.model.SessionTransferIntent.WEB_CHECKOUT_SINGLE_SIGN_ON.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[com.paypal.oslo.core.identity.domain.model.SessionTransferIntent.XOOM_SINGLE_SIGN_ON.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr[com.paypal.oslo.core.identity.domain.model.SessionTransferIntent.ZETTLE_SINGLE_SIGN_ON.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                iArr[com.paypal.oslo.core.identity.domain.model.SessionTransferIntent.CONNECT_SINGLE_SIGN_ON.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
