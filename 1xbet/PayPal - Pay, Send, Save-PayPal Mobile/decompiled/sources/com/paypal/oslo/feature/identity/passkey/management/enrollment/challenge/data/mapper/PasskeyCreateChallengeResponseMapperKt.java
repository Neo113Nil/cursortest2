package com.paypal.oslo.feature.identity.passkey.management.enrollment.challenge.data.mapper;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a%\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0000¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/core/network/graphql/GraphQLData;", "Lcom/paypal/oslo/feature/identity/graphql/PasskeyCreateChallengeContextMutation$Data;", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/identity/passkey/management/enrollment/challenge/domain/model/PasskeyCreateChallengeError;", "Lcom/paypal/oslo/feature/identity/passkey/management/enrollment/challenge/domain/model/PasskeyEnrollmentOptionResult;", "toDomain", "(Lcom/paypal/oslo/core/network/graphql/GraphQLData;)Larrow/core/Either;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class PasskeyCreateChallengeResponseMapperKt {
    public static final arrow.core.Either<com.paypal.oslo.feature.identity.passkey.management.enrollment.challenge.domain.model.PasskeyCreateChallengeError, com.paypal.oslo.feature.identity.passkey.management.enrollment.challenge.domain.model.PasskeyEnrollmentOptionResult> toDomain(com.paypal.oslo.core.network.graphql.GraphQLData<com.paypal.oslo.feature.identity.graphql.PasskeyCreateChallengeContextMutation.Data> graphQLData) {
        com.paypal.oslo.feature.identity.passkey.management.enrollment.challenge.domain.model.PasskeyUserVerification passkeyUserVerification;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(graphQLData, "");
        com.paypal.oslo.feature.identity.graphql.PasskeyCreateChallengeContextMutation.Data data = graphQLData.getData();
        com.paypal.oslo.feature.identity.passkey.management.enrollment.challenge.domain.model.PasskeyUserVerification passkeyUserVerification2 = null;
        com.paypal.oslo.feature.identity.graphql.PasskeyCreateChallengeContextMutation.CreatePasskeyRegistrationOption createPasskeyRegistrationOption = data != null ? data.getCreatePasskeyRegistrationOption() : null;
        if (createPasskeyRegistrationOption == null) {
            return arrow.core.EitherKt.left(new com.paypal.oslo.feature.identity.passkey.management.enrollment.challenge.domain.model.PasskeyCreateChallengeError.InvalidResponseError(null, 1, null));
        }
        try {
            java.lang.String id = createPasskeyRegistrationOption.getRelyingParty().getId();
            java.lang.String name2 = createPasskeyRegistrationOption.getRelyingParty().getName();
            if (name2 == null) {
                name2 = "";
            }
            com.paypal.oslo.feature.identity.passkey.management.enrollment.challenge.domain.model.PasskeyRelyingParty passkeyRelyingParty = new com.paypal.oslo.feature.identity.passkey.management.enrollment.challenge.domain.model.PasskeyRelyingParty(id, name2);
            java.util.List<com.paypal.oslo.feature.identity.graphql.PasskeyCreateChallengeContextMutation.PublicKeyCredentialParam> publicKeyCredentialParams = createPasskeyRegistrationOption.getPublicKeyCredentialParams();
            java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(publicKeyCredentialParams, 10));
            for (com.paypal.oslo.feature.identity.graphql.PasskeyCreateChallengeContextMutation.PublicKeyCredentialParam publicKeyCredentialParam : publicKeyCredentialParams) {
                arrayList.add(new com.paypal.oslo.feature.identity.passkey.management.enrollment.challenge.domain.model.PublicKeyCredentialParameter(publicKeyCredentialParam.getType().getRawValue(), publicKeyCredentialParam.getAlgorithm()));
            }
            java.util.ArrayList arrayList2 = arrayList;
            java.lang.String id2 = createPasskeyRegistrationOption.getUser().getId();
            java.lang.String displayName = createPasskeyRegistrationOption.getUser().getDisplayName();
            com.paypal.oslo.feature.identity.passkey.management.enrollment.challenge.domain.model.PasskeyUser passkeyUser = new com.paypal.oslo.feature.identity.passkey.management.enrollment.challenge.domain.model.PasskeyUser(id2, displayName != null ? displayName : "");
            java.util.List<com.paypal.oslo.feature.identity.graphql.PasskeyCreateChallengeContextMutation.ExcludeCredential> excludeCredentials = createPasskeyRegistrationOption.getExcludeCredentials();
            java.util.ArrayList arrayList3 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(excludeCredentials, 10));
            for (com.paypal.oslo.feature.identity.graphql.PasskeyCreateChallengeContextMutation.ExcludeCredential excludeCredential : excludeCredentials) {
                arrayList3.add(new com.paypal.oslo.feature.identity.passkey.management.enrollment.challenge.domain.model.ExcludedCredential(excludeCredential.getId(), excludeCredential.getType().getRawValue()));
            }
            java.util.ArrayList arrayList4 = arrayList3;
            com.paypal.oslo.api.graphql.schema.type.PasskeyUserVerification userVerification = createPasskeyRegistrationOption.getUserVerification();
            if (userVerification != null) {
                int i = com.paypal.oslo.feature.identity.passkey.management.enrollment.challenge.data.mapper.PasskeyCreateChallengeResponseMapperKt.WhenMappings.$EnumSwitchMapping$0[userVerification.ordinal()];
                if (i == 1) {
                    passkeyUserVerification = com.paypal.oslo.feature.identity.passkey.management.enrollment.challenge.domain.model.PasskeyUserVerification.REQUIRED;
                } else if (i == 2) {
                    passkeyUserVerification = com.paypal.oslo.feature.identity.passkey.management.enrollment.challenge.domain.model.PasskeyUserVerification.PREFERRED;
                } else if (i == 3) {
                    passkeyUserVerification = com.paypal.oslo.feature.identity.passkey.management.enrollment.challenge.domain.model.PasskeyUserVerification.DISCOURAGED;
                } else {
                    if (i != 4) {
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    passkeyUserVerification = com.paypal.oslo.feature.identity.passkey.management.enrollment.challenge.domain.model.PasskeyUserVerification.PREFERRED;
                }
                passkeyUserVerification2 = passkeyUserVerification;
            }
            return arrow.core.EitherKt.right(new com.paypal.oslo.feature.identity.passkey.management.enrollment.challenge.domain.model.PasskeyCreateChallengeSuccess(new com.paypal.oslo.feature.identity.passkey.management.enrollment.challenge.domain.model.PasskeyCreateChallenge(createPasskeyRegistrationOption.getChallenge(), passkeyRelyingParty, arrayList2, passkeyUser, arrayList4, passkeyUserVerification2)));
        } catch (java.lang.IllegalArgumentException e) {
            java.lang.IllegalArgumentException illegalArgumentException = e;
            com.paypal.oslo.feature.identity.LoggerKt.log.e("Failed to map passkey enrollment option response - invalid argument", illegalArgumentException);
            return arrow.core.EitherKt.left(new com.paypal.oslo.feature.identity.passkey.management.enrollment.challenge.domain.model.PasskeyCreateChallengeError.InvalidResponseError(illegalArgumentException));
        } catch (java.lang.IllegalStateException e2) {
            java.lang.IllegalStateException illegalStateException = e2;
            com.paypal.oslo.feature.identity.LoggerKt.log.e("Failed to map passkey enrollment option response - invalid state", illegalStateException);
            return arrow.core.EitherKt.left(new com.paypal.oslo.feature.identity.passkey.management.enrollment.challenge.domain.model.PasskeyCreateChallengeError.InvalidResponseError(illegalStateException));
        }
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.api.graphql.schema.type.PasskeyUserVerification.values().length];
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.PasskeyUserVerification.REQUIRED.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.PasskeyUserVerification.PREFERRED.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.PasskeyUserVerification.DISCOURAGED.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.PasskeyUserVerification.UNKNOWN__.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
