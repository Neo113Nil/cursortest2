package com.paypal.oslo.feature.identity.passkey.management.enrollment.create.data;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0017\u0010\u0003\u001a\u00060\u0001j\u0002`\u0002*\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/paypal/oslo/feature/identity/passkey/management/enrollment/create/domain/model/PasskeyCreateRequest;", "Lcom/paypal/oslo/api/graphql/schema/type/CreatePasskeyInput;", "Lcom/paypal/oslo/feature/identity/graphql/type/CreatePasskeyInput;", "toData", "(Lcom/paypal/oslo/feature/identity/passkey/management/enrollment/create/domain/model/PasskeyCreateRequest;)Lcom/paypal/oslo/api/graphql/schema/type/CreatePasskeyInput;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class PasskeyCreateInputBuilderKt {
    public static final com.paypal.oslo.api.graphql.schema.type.CreatePasskeyInput toData(com.paypal.oslo.feature.identity.passkey.management.enrollment.create.domain.model.PasskeyCreateRequest passkeyCreateRequest) {
        com.paypal.oslo.api.graphql.schema.type.AuthenticationFlowVariant authenticationFlowVariant;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(passkeyCreateRequest, "");
        com.apollographql.apollo.api.Optional.Companion companion = com.apollographql.apollo.api.Optional.INSTANCE;
        int i = com.paypal.oslo.feature.identity.passkey.management.enrollment.create.data.PasskeyCreateInputBuilderKt.WhenMappings.$EnumSwitchMapping$0[passkeyCreateRequest.getPasskeyFlowVariant().ordinal()];
        if (i == 1) {
            authenticationFlowVariant = com.paypal.oslo.api.graphql.schema.type.AuthenticationFlowVariant.NATIVE_LOGIN;
        } else {
            if (i != 2) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            authenticationFlowVariant = com.paypal.oslo.api.graphql.schema.type.AuthenticationFlowVariant.APP_SETTINGS;
        }
        return new com.paypal.oslo.api.graphql.schema.type.CreatePasskeyInput(companion.present(authenticationFlowVariant), null, com.apollographql.apollo.api.Optional.INSTANCE.present(passkeyCreateRequest.getPasskeyCredentialId()), null, com.apollographql.apollo.api.Optional.INSTANCE.present(passkeyCreateRequest.getRawPasskeyCredentialId()), passkeyCreateRequest.getPasskey(), 10, null);
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.identity.passkey.management.enrollment.create.domain.model.PasskeyFlowVariant.values().length];
            try {
                iArr[com.paypal.oslo.feature.identity.passkey.management.enrollment.create.domain.model.PasskeyFlowVariant.NATIVE_LOGIN.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.identity.passkey.management.enrollment.create.domain.model.PasskeyFlowVariant.APP_SETTINGS.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
