package com.paypal.oslo.feature.identity.passkey.login.challenge.data.mapper;

@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a-\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a\u0013\u0010\u0007\u001a\u00020\n*\u00020\tH\u0000¢\u0006\u0004\b\u0007\u0010\u000b\u001a\u0013\u0010\u0007\u001a\u00020\r*\u00020\fH\u0000¢\u0006\u0004\b\u0007\u0010\u000e\u001a\u0017\u0010\u0007\u001a\u0004\u0018\u00010\n*\u0004\u0018\u00010\u000fH\u0000¢\u0006\u0004\b\u0007\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/core/network/graphql/GraphQLData;", "Lcom/paypal/oslo/feature/identity/graphql/PasskeyLoginChallengeContextMutation$Data;", "", "encodedChallenge", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/identity/passkey/login/challenge/domain/model/PasskeyLoginChallengeError;", "Lcom/paypal/oslo/feature/identity/passkey/login/challenge/domain/model/PasskeyLoginChallengeResult;", "toDomain", "(Lcom/paypal/oslo/core/network/graphql/GraphQLData;Ljava/lang/String;)Larrow/core/Either;", "Lcom/paypal/oslo/feature/identity/graphql/PasskeyLoginChallengeContextMutation$OnPasskeyCredentialRequestOptionAuthenticationChallenge;", "Lcom/paypal/oslo/feature/identity/passkey/login/challenge/domain/model/PasskeyLoginCredentialChallenge;", "(Lcom/paypal/oslo/feature/identity/graphql/PasskeyLoginChallengeContextMutation$OnPasskeyCredentialRequestOptionAuthenticationChallenge;)Lcom/paypal/oslo/feature/identity/passkey/login/challenge/domain/model/PasskeyLoginCredentialChallenge;", "Lcom/paypal/oslo/feature/identity/graphql/PasskeyLoginChallengeContextMutation$AllowedCredential;", "Lcom/paypal/oslo/feature/identity/passkey/login/challenge/domain/model/PasskeyAllowedCredential;", "(Lcom/paypal/oslo/feature/identity/graphql/PasskeyLoginChallengeContextMutation$AllowedCredential;)Lcom/paypal/oslo/feature/identity/passkey/login/challenge/domain/model/PasskeyAllowedCredential;", "Lcom/paypal/oslo/feature/identity/graphql/PasskeyLoginChallengeContextMutation$OnAuthenticationChallengeResult;", "(Lcom/paypal/oslo/feature/identity/graphql/PasskeyLoginChallengeContextMutation$OnAuthenticationChallengeResult;)Lcom/paypal/oslo/feature/identity/passkey/login/challenge/domain/model/PasskeyLoginCredentialChallenge;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class PasskeyLoginChallengeResponseMapperKt {
    public static final arrow.core.Either<com.paypal.oslo.feature.identity.passkey.login.challenge.domain.model.PasskeyLoginChallengeError, com.paypal.oslo.feature.identity.passkey.login.challenge.domain.model.PasskeyLoginChallengeResult> toDomain(com.paypal.oslo.core.network.graphql.GraphQLData<com.paypal.oslo.feature.identity.graphql.PasskeyLoginChallengeContextMutation.Data> graphQLData, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(graphQLData, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        com.paypal.oslo.feature.identity.graphql.PasskeyLoginChallengeContextMutation.Data data = graphQLData.getData();
        com.paypal.oslo.feature.identity.graphql.PasskeyLoginChallengeContextMutation.Authenticate authenticate = data != null ? data.getAuthenticate() : null;
        if (authenticate == null) {
            return arrow.core.EitherKt.left(com.paypal.oslo.feature.identity.passkey.login.challenge.domain.model.PasskeyLoginChallengeError.MissingData.INSTANCE);
        }
        if (authenticate.getOnAuthenticationChallengeResult() == null) {
            return arrow.core.EitherKt.left(com.paypal.oslo.feature.identity.passkey.login.challenge.domain.model.PasskeyLoginChallengeError.MissingData.INSTANCE);
        }
        com.paypal.oslo.feature.identity.passkey.login.challenge.domain.model.PasskeyLoginCredentialChallenge domain = toDomain(authenticate.getOnAuthenticationChallengeResult());
        if (domain == null) {
            return arrow.core.EitherKt.left(com.paypal.oslo.feature.identity.passkey.login.challenge.domain.model.PasskeyLoginChallengeError.MissingData.INSTANCE);
        }
        return arrow.core.EitherKt.right(new com.paypal.oslo.feature.identity.passkey.login.challenge.domain.model.PasskeyLoginChallengeSuccess(domain, str));
    }

    public static final com.paypal.oslo.feature.identity.passkey.login.challenge.domain.model.PasskeyLoginCredentialChallenge toDomain(com.paypal.oslo.feature.identity.graphql.PasskeyLoginChallengeContextMutation.OnPasskeyCredentialRequestOptionAuthenticationChallenge onPasskeyCredentialRequestOptionAuthenticationChallenge) {
        com.paypal.oslo.feature.identity.passkey.login.challenge.domain.model.ChallengeType challengeType;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onPasskeyCredentialRequestOptionAuthenticationChallenge, "");
        java.lang.String contextId = onPasskeyCredentialRequestOptionAuthenticationChallenge.getContextId();
        switch (com.paypal.oslo.feature.identity.passkey.login.challenge.data.mapper.PasskeyLoginChallengeResponseMapperKt.WhenMappings.$EnumSwitchMapping$0[onPasskeyCredentialRequestOptionAuthenticationChallenge.getChallengeType().ordinal()]) {
            case 1:
                challengeType = com.paypal.oslo.feature.identity.passkey.login.challenge.domain.model.ChallengeType.PASSWORD;
                break;
            case 2:
                challengeType = com.paypal.oslo.feature.identity.passkey.login.challenge.domain.model.ChallengeType.ONE_TIME_PASSWORD;
                break;
            case 3:
                challengeType = com.paypal.oslo.feature.identity.passkey.login.challenge.domain.model.ChallengeType.PASSKEY;
                break;
            case 4:
                challengeType = com.paypal.oslo.feature.identity.passkey.login.challenge.domain.model.ChallengeType.ONE_TIME_PASSWORD_GENERATE_CODE;
                break;
            case 5:
                challengeType = com.paypal.oslo.feature.identity.passkey.login.challenge.domain.model.ChallengeType.BIOMETRIC;
                break;
            case 6:
                challengeType = com.paypal.oslo.feature.identity.passkey.login.challenge.domain.model.ChallengeType.USER_PREVIEW;
                break;
            case 7:
                challengeType = com.paypal.oslo.feature.identity.passkey.login.challenge.domain.model.ChallengeType.UNKNOWN;
                break;
            case 8:
                challengeType = com.paypal.oslo.feature.identity.passkey.login.challenge.domain.model.ChallengeType.VERIFY_CREDENTIAL;
                break;
            case 9:
                challengeType = com.paypal.oslo.feature.identity.passkey.login.challenge.domain.model.ChallengeType.PASSKEY_REQUEST_OPTION;
                break;
            case 10:
                challengeType = com.paypal.oslo.feature.identity.passkey.login.challenge.domain.model.ChallengeType.NOTIFY_STEP_UP;
                break;
            case 11:
                challengeType = com.paypal.oslo.feature.identity.passkey.login.challenge.domain.model.ChallengeType.VALIDATE_STEP_UP;
                break;
            case 12:
                challengeType = com.paypal.oslo.feature.identity.passkey.login.challenge.domain.model.ChallengeType.UNKNOWN;
                break;
            default:
                challengeType = com.paypal.oslo.feature.identity.passkey.login.challenge.domain.model.ChallengeType.UNKNOWN;
                break;
        }
        com.paypal.oslo.feature.identity.passkey.login.challenge.domain.model.ChallengeType challengeType2 = challengeType;
        java.lang.String challenge = onPasskeyCredentialRequestOptionAuthenticationChallenge.getChallenge();
        java.lang.String relyingPartyId = onPasskeyCredentialRequestOptionAuthenticationChallenge.getRelyingPartyId();
        java.util.List<com.paypal.oslo.feature.identity.graphql.PasskeyLoginChallengeContextMutation.AllowedCredential> allowedCredentials = onPasskeyCredentialRequestOptionAuthenticationChallenge.getAllowedCredentials();
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(allowedCredentials, 10));
        java.util.Iterator<T> it = allowedCredentials.iterator();
        while (it.hasNext()) {
            arrayList.add(toDomain((com.paypal.oslo.feature.identity.graphql.PasskeyLoginChallengeContextMutation.AllowedCredential) it.next()));
        }
        return new com.paypal.oslo.feature.identity.passkey.login.challenge.domain.model.PasskeyLoginCredentialChallenge(contextId, challengeType2, challenge, relyingPartyId, arrayList);
    }

    public static final com.paypal.oslo.feature.identity.passkey.login.challenge.domain.model.PasskeyAllowedCredential toDomain(com.paypal.oslo.feature.identity.graphql.PasskeyLoginChallengeContextMutation.AllowedCredential allowedCredential) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(allowedCredential, "");
        java.lang.String id = allowedCredential.getId();
        java.lang.String rawValue = allowedCredential.getType().getRawValue();
        java.util.List<com.paypal.oslo.api.graphql.schema.type.PasskeyAuthenticationTransport> transports = allowedCredential.getTransports();
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(transports, 10));
        java.util.Iterator<T> it = transports.iterator();
        while (it.hasNext()) {
            arrayList.add(((com.paypal.oslo.api.graphql.schema.type.PasskeyAuthenticationTransport) it.next()).getRawValue());
        }
        return new com.paypal.oslo.feature.identity.passkey.login.challenge.domain.model.PasskeyAllowedCredential(id, rawValue, arrayList);
    }

    public static final com.paypal.oslo.feature.identity.passkey.login.challenge.domain.model.PasskeyLoginCredentialChallenge toDomain(com.paypal.oslo.feature.identity.graphql.PasskeyLoginChallengeContextMutation.OnAuthenticationChallengeResult onAuthenticationChallengeResult) {
        java.util.List<com.paypal.oslo.feature.identity.graphql.PasskeyLoginChallengeContextMutation.Challenge> challenges;
        com.paypal.oslo.feature.identity.graphql.PasskeyLoginChallengeContextMutation.OnPasskeyCredentialRequestOptionAuthenticationChallenge onPasskeyCredentialRequestOptionAuthenticationChallenge;
        if (onAuthenticationChallengeResult != null && (challenges = onAuthenticationChallengeResult.getChallenges()) != null) {
            java.util.Iterator<T> it = challenges.iterator();
            while (true) {
                if (!it.hasNext()) {
                    onPasskeyCredentialRequestOptionAuthenticationChallenge = null;
                    break;
                }
                onPasskeyCredentialRequestOptionAuthenticationChallenge = ((com.paypal.oslo.feature.identity.graphql.PasskeyLoginChallengeContextMutation.Challenge) it.next()).getOnPasskeyCredentialRequestOptionAuthenticationChallenge();
                if (onPasskeyCredentialRequestOptionAuthenticationChallenge != null) {
                    break;
                }
            }
            if (onPasskeyCredentialRequestOptionAuthenticationChallenge != null) {
                return toDomain(onPasskeyCredentialRequestOptionAuthenticationChallenge);
            }
        }
        return null;
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.api.graphql.schema.type.AuthenticationChallengeType.values().length];
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.AuthenticationChallengeType.PASSWORD.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.AuthenticationChallengeType.ONE_TIME_PASSWORD.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.AuthenticationChallengeType.PASSKEY.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.AuthenticationChallengeType.ONE_TIME_PASSWORD_GENERATE_CODE.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.AuthenticationChallengeType.BIOMETRIC.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.AuthenticationChallengeType.USER_PREVIEW.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.AuthenticationChallengeType.SWITCH_PROFILE.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.AuthenticationChallengeType.VERIFY_CREDENTIAL.ordinal()] = 8;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.AuthenticationChallengeType.PASSKEY_REQUEST_OPTION.ordinal()] = 9;
            } catch (java.lang.NoSuchFieldError unused9) {
            }
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.AuthenticationChallengeType.NOTIFY_STEP_UP.ordinal()] = 10;
            } catch (java.lang.NoSuchFieldError unused10) {
            }
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.AuthenticationChallengeType.VALIDATE_STEP_UP.ordinal()] = 11;
            } catch (java.lang.NoSuchFieldError unused11) {
            }
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.AuthenticationChallengeType.UNKNOWN__.ordinal()] = 12;
            } catch (java.lang.NoSuchFieldError unused12) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
