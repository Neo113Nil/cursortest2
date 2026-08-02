package com.paypal.oslo.feature.identity.passkey.management.enrollment.challenge.data;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/identity/passkey/management/enrollment/challenge/domain/model/PasskeyCreateChallengeRequest;", "Lcom/paypal/oslo/api/graphql/schema/type/CreatePasskeyRegistrationOptionInput;", "toData", "(Lcom/paypal/oslo/feature/identity/passkey/management/enrollment/challenge/domain/model/PasskeyCreateChallengeRequest;)Lcom/paypal/oslo/api/graphql/schema/type/CreatePasskeyRegistrationOptionInput;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class PasskeyCreateChallengeInputBuilderKt {
    public static final com.paypal.oslo.api.graphql.schema.type.CreatePasskeyRegistrationOptionInput toData(com.paypal.oslo.feature.identity.passkey.management.enrollment.challenge.domain.model.PasskeyCreateChallengeRequest passkeyCreateChallengeRequest) {
        com.paypal.oslo.api.graphql.schema.type.AuthenticationFlowVariant authenticationFlowVariant;
        com.apollographql.apollo.api.Optional optional;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(passkeyCreateChallengeRequest, "");
        int i = com.paypal.oslo.feature.identity.passkey.management.enrollment.challenge.data.PasskeyCreateChallengeInputBuilderKt.WhenMappings.$EnumSwitchMapping$0[passkeyCreateChallengeRequest.getPasskeyFlowVariant().ordinal()];
        if (i == 1) {
            authenticationFlowVariant = com.paypal.oslo.api.graphql.schema.type.AuthenticationFlowVariant.NATIVE_LOGIN;
        } else {
            if (i != 2) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            authenticationFlowVariant = com.paypal.oslo.api.graphql.schema.type.AuthenticationFlowVariant.APP_SETTINGS;
        }
        java.lang.String publicCredential = passkeyCreateChallengeRequest.getPublicCredential();
        if (publicCredential == null || (optional = com.apollographql.apollo.api.Optional.INSTANCE.present(publicCredential)) == null) {
            optional = com.apollographql.apollo.api.Optional.Absent.INSTANCE;
        }
        return new com.paypal.oslo.api.graphql.schema.type.CreatePasskeyRegistrationOptionInput(optional, authenticationFlowVariant);
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
