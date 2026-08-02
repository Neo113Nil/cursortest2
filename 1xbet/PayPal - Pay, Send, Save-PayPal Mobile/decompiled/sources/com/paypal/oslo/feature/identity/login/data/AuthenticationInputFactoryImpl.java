package com.paypal.oslo.feature.identity.login.data;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\r\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/identity/login/data/AuthenticationInputFactoryImpl;", "Lcom/paypal/oslo/feature/identity/api/AuthenticationInputFactory;", "Lcom/paypal/oslo/feature/identity/shared/domain/model/AuthenticationConfig;", "authenticationConfig", "<init>", "(Lcom/paypal/oslo/feature/identity/shared/domain/model/AuthenticationConfig;)V", "Lcom/paypal/oslo/feature/identity/api/model/AuthenticateCredential;", "authenticateCredential", "Lcom/paypal/oslo/api/graphql/schema/type/AuthenticateInput;", "create", "(Lcom/paypal/oslo/feature/identity/api/model/AuthenticateCredential;)Lcom/paypal/oslo/api/graphql/schema/type/AuthenticateInput;", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/feature/identity/shared/domain/model/AuthenticationConfig;", "getHighSpeedVideoFpsRanges"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class AuthenticationInputFactoryImpl implements com.paypal.oslo.feature.identity.api.AuthenticationInputFactory {
    public static final int $stable = 0;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.identity.shared.domain.model.AuthenticationConfig getHighSpeedVideoFpsRanges;

    @javax.inject.Inject
    public AuthenticationInputFactoryImpl(com.paypal.oslo.feature.identity.shared.domain.model.AuthenticationConfig authenticationConfig) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(authenticationConfig, "");
        this.getHighSpeedVideoFpsRanges = authenticationConfig;
    }

    @Override // com.paypal.oslo.feature.identity.api.AuthenticationInputFactory
    public final com.paypal.oslo.api.graphql.schema.type.AuthenticateInput create(com.paypal.oslo.feature.identity.api.model.AuthenticateCredential authenticateCredential) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(authenticateCredential, "");
        if (!(authenticateCredential instanceof com.paypal.oslo.feature.identity.api.model.PasswordCredential)) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        java.lang.String firstPartyClientId = this.getHighSpeedVideoFpsRanges.getFirstPartyClientId();
        com.apollographql.apollo.api.Optional.Present present = com.apollographql.apollo.api.Optional.INSTANCE.present(com.paypal.oslo.api.graphql.schema.type.AuthenticationGrantType.PUBLIC_CREDENTIAL);
        com.paypal.oslo.feature.identity.api.model.PasswordCredential passwordCredential = (com.paypal.oslo.feature.identity.api.model.PasswordCredential) authenticateCredential;
        return new com.paypal.oslo.api.graphql.schema.type.AuthenticateInput(com.paypal.oslo.api.graphql.schema.type.AuthenticationIntent.LOGIN, firstPartyClientId, present, new com.paypal.oslo.api.graphql.schema.type.AuthenticationChallengeInput(com.paypal.oslo.api.graphql.schema.type.AuthenticationChallengeType.PASSWORD, null, com.apollographql.apollo.api.Optional.INSTANCE.present(new com.paypal.oslo.api.graphql.schema.type.PasswordAuthenticationInput(passwordCredential.getUsername(), passwordCredential.getPassword())), null, null, null, null, null, null, null, null, null, null, null, null, 32762, null), null, null, null, null, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_VALUE, null);
    }
}
