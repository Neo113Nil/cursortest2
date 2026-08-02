package com.paypal.oslo.feature.identity.passkey.login.challenge.data;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a#\u0010\u0006\u001a\u00060\u0004j\u0002`\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/identity/passkey/login/challenge/domain/model/PasskeyLoginChallengeRequest;", "request", "Lcom/paypal/oslo/feature/identity/shared/domain/model/AuthenticationConfig;", "config", "Lcom/paypal/oslo/api/graphql/schema/type/AuthenticateInput;", "Lcom/paypal/oslo/feature/identity/graphql/type/AuthenticateInput;", "buildPasskeyLoginChallengeInput", "(Lcom/paypal/oslo/feature/identity/passkey/login/challenge/domain/model/PasskeyLoginChallengeRequest;Lcom/paypal/oslo/feature/identity/shared/domain/model/AuthenticationConfig;)Lcom/paypal/oslo/api/graphql/schema/type/AuthenticateInput;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class PasskeyLoginChallengeInputBuilderKt {
    public static final com.paypal.oslo.api.graphql.schema.type.AuthenticateInput buildPasskeyLoginChallengeInput(com.paypal.oslo.feature.identity.passkey.login.challenge.domain.model.PasskeyLoginChallengeRequest passkeyLoginChallengeRequest, com.paypal.oslo.feature.identity.shared.domain.model.AuthenticationConfig authenticationConfig) {
        com.apollographql.apollo.api.Optional.Absent absent;
        com.apollographql.apollo.api.Optional.Absent absent2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(passkeyLoginChallengeRequest, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(authenticationConfig, "");
        java.lang.String firstPartyClientId = authenticationConfig.getFirstPartyClientId();
        com.paypal.oslo.api.graphql.schema.type.AuthenticationIntent authenticationIntent = com.paypal.oslo.feature.identity.login.data.mapper.AuthInputMapperKt.toAuthenticationIntent(passkeyLoginChallengeRequest.getIntent());
        com.apollographql.apollo.api.Optional.Present present = com.apollographql.apollo.api.Optional.INSTANCE.present(com.paypal.oslo.api.graphql.schema.type.AuthenticationGrantType.PASSKEY);
        com.paypal.oslo.api.graphql.schema.type.AuthenticationChallengeType authenticationChallengeType = com.paypal.oslo.api.graphql.schema.type.AuthenticationChallengeType.PASSKEY_REQUEST_OPTION;
        com.apollographql.apollo.api.Optional.Companion companion = com.apollographql.apollo.api.Optional.INSTANCE;
        if (passkeyLoginChallengeRequest.getChallenge() != null) {
            absent = com.apollographql.apollo.api.Optional.INSTANCE.present(passkeyLoginChallengeRequest.getChallenge());
        } else {
            absent = com.apollographql.apollo.api.Optional.INSTANCE.absent();
        }
        if (passkeyLoginChallengeRequest.getPartyId() != null) {
            absent2 = com.apollographql.apollo.api.Optional.INSTANCE.present(passkeyLoginChallengeRequest.getPartyId());
        } else {
            absent2 = com.apollographql.apollo.api.Optional.INSTANCE.absent();
        }
        com.apollographql.apollo.api.Optional.Present present2 = companion.present(new com.paypal.oslo.api.graphql.schema.type.PasskeyCredentialRequestOptionAuthenticationInput(absent, absent2));
        return new com.paypal.oslo.api.graphql.schema.type.AuthenticateInput(authenticationIntent, firstPartyClientId, present, new com.paypal.oslo.api.graphql.schema.type.AuthenticationChallengeInput(authenticationChallengeType, null, null, null, null, null, null, null, null, null, present2, null, null, null, null, 31742, null), null, null, null, null, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_VALUE, null);
    }
}
