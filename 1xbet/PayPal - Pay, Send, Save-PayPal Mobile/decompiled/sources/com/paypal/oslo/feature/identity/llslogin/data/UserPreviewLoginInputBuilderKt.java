package com.paypal.oslo.feature.identity.llslogin.data;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a!\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0000j\u0002`\u0003H\u0000¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkotlin/Function1;", "Lcom/paypal/oslo/feature/identity/login/domain/model/LoginRequest;", "Lcom/paypal/oslo/feature/identity/login/data/BuilderResult;", "Lcom/paypal/oslo/feature/identity/login/data/InputBuilder;", "userPreviewLoginInputBuilder", "()Lkotlin/jvm/functions/Function1;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class UserPreviewLoginInputBuilderKt {
    public static /* synthetic */ com.paypal.oslo.feature.identity.login.data.BuilderResult $r8$lambda$UtaYoajlUdwd1AIMV23Z7iGisSg(com.paypal.oslo.feature.identity.login.domain.model.LoginRequest loginRequest) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(loginRequest, "");
        com.paypal.oslo.feature.identity.llslogin.domain.model.UserPreviewLoginRequest userPreviewLoginRequest = loginRequest instanceof com.paypal.oslo.feature.identity.llslogin.domain.model.UserPreviewLoginRequest ? (com.paypal.oslo.feature.identity.llslogin.domain.model.UserPreviewLoginRequest) loginRequest : null;
        if (userPreviewLoginRequest == null) {
            return null;
        }
        return new com.paypal.oslo.feature.identity.login.data.BuilderResult(com.paypal.oslo.api.graphql.schema.type.AuthenticationGrantType.USER_PREVIEW, new com.paypal.oslo.api.graphql.schema.type.AuthenticationChallengeInput(com.paypal.oslo.api.graphql.schema.type.AuthenticationChallengeType.USER_PREVIEW, null, null, null, com.apollographql.apollo.api.Optional.INSTANCE.present(new com.paypal.oslo.api.graphql.schema.type.UserPreviewAuthenticationInput(userPreviewLoginRequest.getNonce(), userPreviewLoginRequest.getRefreshToken(), userPreviewLoginRequest.getSignature())), null, null, null, null, null, null, null, null, null, null, 32750, null));
    }

    public static final kotlin.jvm.functions.Function1<com.paypal.oslo.feature.identity.login.domain.model.LoginRequest, com.paypal.oslo.feature.identity.login.data.BuilderResult> userPreviewLoginInputBuilder() {
        return new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.identity.llslogin.data.UserPreviewLoginInputBuilderKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.identity.llslogin.data.UserPreviewLoginInputBuilderKt.$r8$lambda$UtaYoajlUdwd1AIMV23Z7iGisSg((com.paypal.oslo.feature.identity.login.domain.model.LoginRequest) obj);
            }
        };
    }
}
