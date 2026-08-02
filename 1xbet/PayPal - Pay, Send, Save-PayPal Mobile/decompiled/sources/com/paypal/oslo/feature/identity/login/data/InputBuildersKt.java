package com.paypal.oslo.feature.identity.login.data;

@kotlin.Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001am\u0010\u0012\u001a\u00060\u0010j\u0002`\u00112\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u001e\u0010\b\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0000\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005j\u0002`\u00070\u00042\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0010\b\u0002\u0010\u000f\u001a\n\u0018\u00010\rj\u0004\u0018\u0001`\u000eH\u0000¢\u0006\u0004\b\u0012\u0010\u0013\u001a[\u0010\u001b\u001a\u00060\u0010j\u0002`\u00112\u0006\u0010\u0003\u001a\u00020\u00022\n\u0010\u0014\u001a\u00060\rj\u0002`\u000e2\u000e\u0010\u0017\u001a\n\u0018\u00010\u0015j\u0004\u0018\u0001`\u00162\n\u0010\u001a\u001a\u00060\u0018j\u0002`\u00192\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0000¢\u0006\u0004\b\u001b\u0010\u001c*(\b\u0000\u0010\u001d\"\u0010\u0012\u0004\u0012\u00020\u0000\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00052\u0010\u0012\u0004\u0012\u00020\u0000\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005"}, d2 = {"Lcom/paypal/oslo/feature/identity/login/domain/model/LoginRequest;", "request", "Lcom/paypal/oslo/feature/identity/shared/domain/model/AuthenticationConfig;", "config", "", "Lkotlin/Function1;", "Lcom/paypal/oslo/feature/identity/login/data/BuilderResult;", "Lcom/paypal/oslo/feature/identity/login/data/InputBuilder;", "builders", "", "primaryEmail", "Lcom/paypal/oslo/api/graphql/schema/type/CheckoutDataInput;", "checkoutDataInput", "Lcom/paypal/oslo/api/graphql/schema/type/AuthenticationIntent;", "Lcom/paypal/oslo/feature/identity/graphql/type/AuthenticationIntent;", "checkoutWebSSOIntent", "Lcom/paypal/oslo/api/graphql/schema/type/AuthenticateInput;", "Lcom/paypal/oslo/feature/identity/graphql/type/AuthenticateInput;", "buildAuthInput", "(Lcom/paypal/oslo/feature/identity/login/domain/model/LoginRequest;Lcom/paypal/oslo/feature/identity/shared/domain/model/AuthenticationConfig;Ljava/util/Set;Ljava/lang/String;Lcom/paypal/oslo/api/graphql/schema/type/CheckoutDataInput;Lcom/paypal/oslo/api/graphql/schema/type/AuthenticationIntent;)Lcom/paypal/oslo/api/graphql/schema/type/AuthenticateInput;", "intent", "Lcom/paypal/oslo/api/graphql/schema/type/AuthenticationGrantType;", "Lcom/paypal/oslo/feature/identity/graphql/type/AuthenticationGrantType;", "grantType", "Lcom/paypal/oslo/api/graphql/schema/type/AuthenticationChallengeInput;", "Lcom/paypal/oslo/feature/identity/graphql/type/AuthenticationChallengeInput;", "challengeInput", "createAuthInput", "(Lcom/paypal/oslo/feature/identity/shared/domain/model/AuthenticationConfig;Lcom/paypal/oslo/api/graphql/schema/type/AuthenticationIntent;Lcom/paypal/oslo/api/graphql/schema/type/AuthenticationGrantType;Lcom/paypal/oslo/api/graphql/schema/type/AuthenticationChallengeInput;Ljava/lang/String;Lcom/paypal/oslo/api/graphql/schema/type/CheckoutDataInput;)Lcom/paypal/oslo/api/graphql/schema/type/AuthenticateInput;", "InputBuilder"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class InputBuildersKt {
    public static final com.paypal.oslo.api.graphql.schema.type.AuthenticateInput buildAuthInput(com.paypal.oslo.feature.identity.login.domain.model.LoginRequest loginRequest, com.paypal.oslo.feature.identity.shared.domain.model.AuthenticationConfig authenticationConfig, java.util.Set<? extends kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.identity.login.domain.model.LoginRequest, com.paypal.oslo.feature.identity.login.data.BuilderResult>> set, java.lang.String str, com.paypal.oslo.api.graphql.schema.type.CheckoutDataInput checkoutDataInput, com.paypal.oslo.api.graphql.schema.type.AuthenticationIntent authenticationIntent) {
        com.paypal.oslo.feature.identity.login.data.BuilderResult builderResult;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(loginRequest, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(authenticationConfig, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(set, "");
        java.util.Iterator<T> it = set.iterator();
        while (true) {
            if (!it.hasNext()) {
                builderResult = null;
                break;
            }
            builderResult = (com.paypal.oslo.feature.identity.login.data.BuilderResult) ((kotlin.jvm.functions.Function1) it.next()).invoke(loginRequest);
            if (builderResult != null) {
                break;
            }
        }
        if (builderResult == null) {
            java.lang.String simpleName = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(loginRequest.getClass()).getSimpleName();
            int size = set.size();
            java.lang.String simpleName2 = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(loginRequest.getClass()).getSimpleName();
            java.lang.StringBuilder sb = new java.lang.StringBuilder("No InputBuilder found for request type '");
            sb.append(simpleName);
            sb.append("'. Registered builders: ");
            sb.append(size);
            sb.append(". This indicates a missing @IntoSet InputBuilder registration in DI. Solution: Create an InputBuilder for ");
            sb.append(simpleName2);
            sb.append(" and register it with @Provides @IntoSet in a Hilt module.");
            throw new java.lang.IllegalStateException(sb.toString().toString());
        }
        if (authenticationIntent == null) {
            authenticationIntent = com.paypal.oslo.feature.identity.login.data.mapper.AuthInputMapperKt.toAuthenticationIntent(loginRequest.getIntent());
        }
        return createAuthInput(authenticationConfig, authenticationIntent, builderResult.getGrantType(), builderResult.getChallengeInput(), str, checkoutDataInput);
    }

    public static final com.paypal.oslo.api.graphql.schema.type.AuthenticateInput createAuthInput(com.paypal.oslo.feature.identity.shared.domain.model.AuthenticationConfig authenticationConfig, com.paypal.oslo.api.graphql.schema.type.AuthenticationIntent authenticationIntent, com.paypal.oslo.api.graphql.schema.type.AuthenticationGrantType authenticationGrantType, com.paypal.oslo.api.graphql.schema.type.AuthenticationChallengeInput authenticationChallengeInput, java.lang.String str, com.paypal.oslo.api.graphql.schema.type.CheckoutDataInput checkoutDataInput) {
        com.apollographql.apollo.api.Optional optional;
        com.apollographql.apollo.api.Optional optional2;
        com.apollographql.apollo.api.Optional optional3;
        com.paypal.oslo.api.graphql.schema.type.AuthenticationIntent authenticationIntent2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(authenticationConfig, "");
        com.paypal.oslo.api.graphql.schema.type.AuthenticationIntent authenticationIntent3 = authenticationIntent;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(authenticationIntent3, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(authenticationChallengeInput, "");
        java.lang.String firstPartyClientId = authenticationConfig.getFirstPartyClientId();
        if (checkoutDataInput != null && (authenticationIntent2 = com.paypal.oslo.api.graphql.schema.type.AuthenticationIntent.ONE_SHOT_CHECKOUT) != null) {
            authenticationIntent3 = authenticationIntent2;
        }
        if (authenticationGrantType == null || (optional = com.apollographql.apollo.api.Optional.INSTANCE.present(authenticationGrantType)) == null) {
            optional = com.apollographql.apollo.api.Optional.Absent.INSTANCE;
        }
        com.apollographql.apollo.api.Optional optional4 = optional;
        if (str == null || (optional2 = com.apollographql.apollo.api.Optional.INSTANCE.present(str)) == null) {
            optional2 = com.apollographql.apollo.api.Optional.Absent.INSTANCE;
        }
        com.apollographql.apollo.api.Optional optional5 = optional2;
        if (checkoutDataInput == null || (optional3 = com.apollographql.apollo.api.Optional.INSTANCE.present(checkoutDataInput)) == null) {
            optional3 = com.apollographql.apollo.api.Optional.Absent.INSTANCE;
        }
        return new com.paypal.oslo.api.graphql.schema.type.AuthenticateInput(authenticationIntent3, firstPartyClientId, optional4, authenticationChallengeInput, optional5, optional3, null, null, 192, null);
    }
}
