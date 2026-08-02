package com.paypal.oslo.feature.identity.passwordrecovery.data;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a!\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0000j\u0002`\u0003H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a#\u0010\f\u001a\u00060\nj\u0002`\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0000¢\u0006\u0004\b\f\u0010\r"}, d2 = {"Lkotlin/Function1;", "Lcom/paypal/oslo/feature/identity/login/domain/model/LoginRequest;", "Lcom/paypal/oslo/feature/identity/login/data/BuilderResult;", "Lcom/paypal/oslo/feature/identity/login/data/InputBuilder;", "initiatePasswordRecoveryInputBuilder", "()Lkotlin/jvm/functions/Function1;", "Lcom/paypal/oslo/feature/identity/passwordrecovery/domain/model/CreatePasswordInput;", "createPasswordInput", "Lcom/paypal/oslo/feature/identity/shared/domain/model/AuthenticationConfig;", "config", "Lcom/paypal/oslo/api/graphql/schema/type/AuthenticateInput;", "Lcom/paypal/oslo/feature/identity/graphql/type/AuthenticateInput;", "buildCreatePasswordAuthInput", "(Lcom/paypal/oslo/feature/identity/passwordrecovery/domain/model/CreatePasswordInput;Lcom/paypal/oslo/feature/identity/shared/domain/model/AuthenticationConfig;)Lcom/paypal/oslo/api/graphql/schema/type/AuthenticateInput;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class PasswordRecoveryInputBuildersKt {
    public static final com.paypal.oslo.api.graphql.schema.type.AuthenticateInput buildCreatePasswordAuthInput(com.paypal.oslo.feature.identity.passwordrecovery.domain.model.CreatePasswordInput createPasswordInput, com.paypal.oslo.feature.identity.shared.domain.model.AuthenticationConfig authenticationConfig) {
        com.paypal.oslo.api.graphql.schema.type.AuthenticateInput createAuthInput;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(createPasswordInput, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(authenticationConfig, "");
        createAuthInput = com.paypal.oslo.feature.identity.login.data.InputBuildersKt.createAuthInput(authenticationConfig, com.paypal.oslo.api.graphql.schema.type.AuthenticationIntent.PASSWORD_RECOVERY, com.paypal.oslo.api.graphql.schema.type.AuthenticationGrantType.PUBLIC_CREDENTIAL, new com.paypal.oslo.api.graphql.schema.type.AuthenticationChallengeInput(com.paypal.oslo.api.graphql.schema.type.AuthenticationChallengeType.CHANGE_PASSWORD, null, null, null, null, null, null, null, null, null, null, null, null, com.apollographql.apollo.api.Optional.INSTANCE.present(new com.paypal.oslo.api.graphql.schema.type.ChangePasswordIdentityChallengeInput(createPasswordInput.getPublicCredential(), createPasswordInput.getNewPassword(), com.apollographql.apollo.api.Optional.INSTANCE.presentIfNotNull(createPasswordInput.getNonce()), com.apollographql.apollo.api.Optional.INSTANCE.presentIfNotNull(createPasswordInput.getPartialToken()))), null, 24574, null), (r13 & 16) != 0 ? null : null, (r13 & 32) != 0 ? null : null);
        return createAuthInput;
    }

    /* renamed from: $r8$lambda$8rB2JOYy59cqXAaa-lhOE9VvYu4, reason: not valid java name */
    public static /* synthetic */ com.paypal.oslo.feature.identity.login.data.BuilderResult m15287$r8$lambda$8rB2JOYy59cqXAaalhOE9VvYu4(com.paypal.oslo.feature.identity.login.domain.model.LoginRequest loginRequest) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(loginRequest, "");
        com.paypal.oslo.feature.identity.passwordrecovery.domain.model.InitiatePasswordRecoveryInput initiatePasswordRecoveryInput = loginRequest instanceof com.paypal.oslo.feature.identity.passwordrecovery.domain.model.InitiatePasswordRecoveryInput ? (com.paypal.oslo.feature.identity.passwordrecovery.domain.model.InitiatePasswordRecoveryInput) loginRequest : null;
        if (initiatePasswordRecoveryInput == null) {
            return null;
        }
        return new com.paypal.oslo.feature.identity.login.data.BuilderResult(com.paypal.oslo.api.graphql.schema.type.AuthenticationGrantType.PUBLIC_CREDENTIAL, new com.paypal.oslo.api.graphql.schema.type.AuthenticationChallengeInput(com.paypal.oslo.api.graphql.schema.type.AuthenticationChallengeType.PASSWORD_RECOVERY, null, null, null, null, null, null, null, null, com.apollographql.apollo.api.Optional.INSTANCE.present(new com.paypal.oslo.api.graphql.schema.type.AuthenticationCredentialChallengeInput(initiatePasswordRecoveryInput.getPublicCredential())), null, null, null, null, null, 32254, null));
    }

    public static final kotlin.jvm.functions.Function1<com.paypal.oslo.feature.identity.login.domain.model.LoginRequest, com.paypal.oslo.feature.identity.login.data.BuilderResult> initiatePasswordRecoveryInputBuilder() {
        return new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.identity.passwordrecovery.data.PasswordRecoveryInputBuildersKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.identity.passwordrecovery.data.PasswordRecoveryInputBuildersKt.m15287$r8$lambda$8rB2JOYy59cqXAaalhOE9VvYu4((com.paypal.oslo.feature.identity.login.domain.model.LoginRequest) obj);
            }
        };
    }
}
