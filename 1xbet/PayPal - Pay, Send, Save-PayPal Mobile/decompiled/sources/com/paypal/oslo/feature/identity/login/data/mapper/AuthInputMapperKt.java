package com.paypal.oslo.feature.identity.login.data.mapper;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0017\u0010\u0003\u001a\u00060\u0001j\u0002`\u0002*\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0005\u001a\u00020\u0000*\u00060\u0001j\u0002`\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0017\u0010\u0003\u001a\u00060\u0001j\u0002`\u0002*\u00020\u0007H\u0000¢\u0006\u0004\b\u0003\u0010\b\u001a\u0017\u0010\f\u001a\u00060\nj\u0002`\u000b*\u00020\tH\u0000¢\u0006\u0004\b\f\u0010\r"}, d2 = {"Lcom/paypal/oslo/feature/identity/login/domain/model/AuthIntent;", "Lcom/paypal/oslo/api/graphql/schema/type/AuthenticationIntent;", "Lcom/paypal/oslo/feature/identity/graphql/type/AuthenticationIntent;", "toAuthenticationIntent", "(Lcom/paypal/oslo/feature/identity/login/domain/model/AuthIntent;)Lcom/paypal/oslo/api/graphql/schema/type/AuthenticationIntent;", "toAuthIntent", "(Lcom/paypal/oslo/api/graphql/schema/type/AuthenticationIntent;)Lcom/paypal/oslo/feature/identity/login/domain/model/AuthIntent;", "Lcom/paypal/oslo/core/identity/domain/model/SessionTransferIntent;", "(Lcom/paypal/oslo/core/identity/domain/model/SessionTransferIntent;)Lcom/paypal/oslo/api/graphql/schema/type/AuthenticationIntent;", "Lcom/paypal/oslo/feature/identity/login/domain/model/GrantType;", "Lcom/paypal/oslo/api/graphql/schema/type/AuthenticationGrantType;", "Lcom/paypal/oslo/feature/identity/graphql/type/AuthenticationGrantType;", "toAuthenticationGrantType", "(Lcom/paypal/oslo/feature/identity/login/domain/model/GrantType;)Lcom/paypal/oslo/api/graphql/schema/type/AuthenticationGrantType;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class AuthInputMapperKt {
    public static final com.paypal.oslo.api.graphql.schema.type.AuthenticationIntent toAuthenticationIntent(com.paypal.oslo.feature.identity.login.domain.model.AuthIntent authIntent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(authIntent, "");
        int i = com.paypal.oslo.feature.identity.login.data.mapper.AuthInputMapperKt.WhenMappings.$EnumSwitchMapping$0[authIntent.ordinal()];
        if (i == 1) {
            return com.paypal.oslo.api.graphql.schema.type.AuthenticationIntent.LOGIN;
        }
        if (i == 2) {
            return com.paypal.oslo.api.graphql.schema.type.AuthenticationIntent.NATIVE_CHECKOUT;
        }
        if (i == 3) {
            return com.paypal.oslo.api.graphql.schema.type.AuthenticationIntent.LINK_ACCOUNT;
        }
        if (i == 4) {
            return com.paypal.oslo.api.graphql.schema.type.AuthenticationIntent.SWITCH_ACCOUNT;
        }
        if (i != 5) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return com.paypal.oslo.api.graphql.schema.type.AuthenticationIntent.PASSWORD_RECOVERY;
    }

    public static final com.paypal.oslo.feature.identity.login.domain.model.AuthIntent toAuthIntent(com.paypal.oslo.api.graphql.schema.type.AuthenticationIntent authenticationIntent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(authenticationIntent, "");
        int i = com.paypal.oslo.feature.identity.login.data.mapper.AuthInputMapperKt.WhenMappings.$EnumSwitchMapping$1[authenticationIntent.ordinal()];
        if (i == 1) {
            return com.paypal.oslo.feature.identity.login.domain.model.AuthIntent.LOGIN;
        }
        if (i == 2) {
            return com.paypal.oslo.feature.identity.login.domain.model.AuthIntent.NATIVE_CHECKOUT;
        }
        if (i == 3) {
            return com.paypal.oslo.feature.identity.login.domain.model.AuthIntent.LINK_ACCOUNT;
        }
        if (i == 4) {
            return com.paypal.oslo.feature.identity.login.domain.model.AuthIntent.SWITCH_ACCOUNT;
        }
        if (i == 5) {
            return com.paypal.oslo.feature.identity.login.domain.model.AuthIntent.PASSWORD_RECOVERY;
        }
        return com.paypal.oslo.feature.identity.login.domain.model.AuthIntent.LOGIN;
    }

    public static final com.paypal.oslo.api.graphql.schema.type.AuthenticationIntent toAuthenticationIntent(com.paypal.oslo.core.identity.domain.model.SessionTransferIntent sessionTransferIntent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sessionTransferIntent, "");
        if (com.paypal.oslo.feature.identity.login.data.mapper.AuthInputMapperKt.WhenMappings.$EnumSwitchMapping$2[sessionTransferIntent.ordinal()] == 1) {
            return com.paypal.oslo.api.graphql.schema.type.AuthenticationIntent.NATIVE_WEB_CHECKOUT;
        }
        return com.paypal.oslo.api.graphql.schema.type.AuthenticationIntent.LOGIN;
    }

    public static final com.paypal.oslo.api.graphql.schema.type.AuthenticationGrantType toAuthenticationGrantType(com.paypal.oslo.feature.identity.login.domain.model.GrantType grantType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(grantType, "");
        int i = com.paypal.oslo.feature.identity.login.data.mapper.AuthInputMapperKt.WhenMappings.$EnumSwitchMapping$3[grantType.ordinal()];
        if (i == 1) {
            return com.paypal.oslo.api.graphql.schema.type.AuthenticationGrantType.PASSWORD;
        }
        if (i != 2) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return com.paypal.oslo.api.graphql.schema.type.AuthenticationGrantType.PUBLIC_CREDENTIAL;
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;
        public static final /* synthetic */ int[] $EnumSwitchMapping$3;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.identity.login.domain.model.AuthIntent.values().length];
            try {
                iArr[com.paypal.oslo.feature.identity.login.domain.model.AuthIntent.LOGIN.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.identity.login.domain.model.AuthIntent.NATIVE_CHECKOUT.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.paypal.oslo.feature.identity.login.domain.model.AuthIntent.LINK_ACCOUNT.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[com.paypal.oslo.feature.identity.login.domain.model.AuthIntent.SWITCH_ACCOUNT.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr[com.paypal.oslo.feature.identity.login.domain.model.AuthIntent.PASSWORD_RECOVERY.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[com.paypal.oslo.api.graphql.schema.type.AuthenticationIntent.values().length];
            try {
                iArr2[com.paypal.oslo.api.graphql.schema.type.AuthenticationIntent.LOGIN.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                iArr2[com.paypal.oslo.api.graphql.schema.type.AuthenticationIntent.NATIVE_CHECKOUT.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            try {
                iArr2[com.paypal.oslo.api.graphql.schema.type.AuthenticationIntent.LINK_ACCOUNT.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
            try {
                iArr2[com.paypal.oslo.api.graphql.schema.type.AuthenticationIntent.SWITCH_ACCOUNT.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused9) {
            }
            try {
                iArr2[com.paypal.oslo.api.graphql.schema.type.AuthenticationIntent.PASSWORD_RECOVERY.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused10) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[com.paypal.oslo.core.identity.domain.model.SessionTransferIntent.values().length];
            try {
                iArr3[com.paypal.oslo.core.identity.domain.model.SessionTransferIntent.WEB_CHECKOUT_SINGLE_SIGN_ON.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused11) {
            }
            $EnumSwitchMapping$2 = iArr3;
            int[] iArr4 = new int[com.paypal.oslo.feature.identity.login.domain.model.GrantType.values().length];
            try {
                iArr4[com.paypal.oslo.feature.identity.login.domain.model.GrantType.PASSWORD.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused12) {
            }
            try {
                iArr4[com.paypal.oslo.feature.identity.login.domain.model.GrantType.PUBLIC_CREDENTIAL.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused13) {
            }
            $EnumSwitchMapping$3 = iArr4;
        }
    }
}
