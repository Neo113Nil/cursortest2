package com.paypal.oslo.feature.identity.passwordlogin.data;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a!\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0000j\u0002`\u0003H\u0000¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkotlin/Function1;", "Lcom/paypal/oslo/feature/identity/login/domain/model/LoginRequest;", "Lcom/paypal/oslo/feature/identity/login/data/BuilderResult;", "Lcom/paypal/oslo/feature/identity/login/data/InputBuilder;", "passwordLoginInputBuilder", "()Lkotlin/jvm/functions/Function1;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class PasswordLoginInputBuilderKt {
    public static /* synthetic */ com.paypal.oslo.feature.identity.login.data.BuilderResult $r8$lambda$EFIG4XEzYi_mPMFUBf8BAInpRJU(com.paypal.oslo.feature.identity.login.domain.model.LoginRequest loginRequest) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(loginRequest, "");
        com.paypal.oslo.feature.identity.passwordlogin.domain.model.PasswordLoginRequest passwordLoginRequest = loginRequest instanceof com.paypal.oslo.feature.identity.passwordlogin.domain.model.PasswordLoginRequest ? (com.paypal.oslo.feature.identity.passwordlogin.domain.model.PasswordLoginRequest) loginRequest : null;
        if (passwordLoginRequest == null) {
            return null;
        }
        return new com.paypal.oslo.feature.identity.login.data.BuilderResult(com.paypal.oslo.api.graphql.schema.type.AuthenticationGrantType.PASSWORD, new com.paypal.oslo.api.graphql.schema.type.AuthenticationChallengeInput(com.paypal.oslo.api.graphql.schema.type.AuthenticationChallengeType.PASSWORD, null, com.apollographql.apollo.api.Optional.INSTANCE.present(new com.paypal.oslo.api.graphql.schema.type.PasswordAuthenticationInput(passwordLoginRequest.getEmail(), passwordLoginRequest.getPassword())), null, null, null, null, null, null, null, null, null, null, null, null, 32762, null));
    }

    public static final kotlin.jvm.functions.Function1<com.paypal.oslo.feature.identity.login.domain.model.LoginRequest, com.paypal.oslo.feature.identity.login.data.BuilderResult> passwordLoginInputBuilder() {
        return new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.identity.passwordlogin.data.PasswordLoginInputBuilderKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.identity.passwordlogin.data.PasswordLoginInputBuilderKt.$r8$lambda$EFIG4XEzYi_mPMFUBf8BAInpRJU((com.paypal.oslo.feature.identity.login.domain.model.LoginRequest) obj);
            }
        };
    }
}
