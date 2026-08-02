package com.paypal.oslo.feature.identity.userverification.data.mapper;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0017\u0010\u0003\u001a\u00060\u0001j\u0002`\u0002*\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0000H\u0000¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/identity/userverification/domain/model/request/PublicCredential;", "Lcom/paypal/oslo/api/graphql/schema/type/AuthenticationCredentialChallengeInput;", "Lcom/paypal/oslo/feature/identity/graphql/type/AuthenticationCredentialChallengeInput;", "toGraphQLInput", "(Lcom/paypal/oslo/feature/identity/userverification/domain/model/request/PublicCredential;)Lcom/paypal/oslo/api/graphql/schema/type/AuthenticationCredentialChallengeInput;", "Lcom/paypal/oslo/feature/identity/login/domain/model/GrantType;", "toGrantType", "(Lcom/paypal/oslo/feature/identity/userverification/domain/model/request/PublicCredential;)Lcom/paypal/oslo/feature/identity/login/domain/model/GrantType;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class PublicCredentialMapperKt {
    public static final com.paypal.oslo.api.graphql.schema.type.AuthenticationCredentialChallengeInput toGraphQLInput(com.paypal.oslo.feature.identity.userverification.domain.model.request.PublicCredential publicCredential) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(publicCredential, "");
        if (publicCredential instanceof com.paypal.oslo.feature.identity.userverification.domain.model.request.PublicCredential.EmailCredential) {
            return new com.paypal.oslo.api.graphql.schema.type.AuthenticationCredentialChallengeInput(((com.paypal.oslo.feature.identity.userverification.domain.model.request.PublicCredential.EmailCredential) publicCredential).getEmail());
        }
        if (!(publicCredential instanceof com.paypal.oslo.feature.identity.userverification.domain.model.request.PublicCredential.PhoneCredential)) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        com.paypal.oslo.feature.identity.userverification.domain.model.request.PublicCredential.PhoneCredential phoneCredential = (com.paypal.oslo.feature.identity.userverification.domain.model.request.PublicCredential.PhoneCredential) publicCredential;
        java.lang.String countryCode = phoneCredential.getCountryCode();
        java.lang.String phoneNumber = phoneCredential.getPhoneNumber();
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(countryCode);
        sb.append(" ");
        sb.append(phoneNumber);
        return new com.paypal.oslo.api.graphql.schema.type.AuthenticationCredentialChallengeInput(sb.toString());
    }

    public static final com.paypal.oslo.feature.identity.login.domain.model.GrantType toGrantType(com.paypal.oslo.feature.identity.userverification.domain.model.request.PublicCredential publicCredential) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(publicCredential, "");
        return com.paypal.oslo.feature.identity.login.domain.model.GrantType.PUBLIC_CREDENTIAL;
    }
}
