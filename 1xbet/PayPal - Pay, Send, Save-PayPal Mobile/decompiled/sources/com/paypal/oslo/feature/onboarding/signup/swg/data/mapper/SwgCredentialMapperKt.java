package com.paypal.oslo.feature.onboarding.signup.swg.data.mapper;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a#\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002*\u00060\u0000j\u0002`\u0001H\u0002¢\u0006\u0004\b\u0005\u0010\u0006*\n\u0010\u0007\"\u00020\u00002\u00020\u0000"}, d2 = {"Lcom/paypal/oslo/feature/onboarding/graphql/CheckGoogleTokenQuery$PublicCredentialMetadataByToken;", "Lcom/paypal/oslo/feature/onboarding/signup/swg/data/mapper/CheckGoogleTokenResponse;", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/onboarding/errorstruct/domain/model/ApiCallError;", "Lcom/paypal/oslo/feature/onboarding/signup/swg/domain/model/SwgCheckResult;", "Camera2StreamConfigurationMap", "(Lcom/paypal/oslo/feature/onboarding/graphql/CheckGoogleTokenQuery$PublicCredentialMetadataByToken;)Larrow/core/Either;", "CheckGoogleTokenResponse"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class SwgCredentialMapperKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final arrow.core.Either<com.paypal.oslo.feature.onboarding.errorstruct.domain.model.ApiCallError, com.paypal.oslo.feature.onboarding.signup.swg.domain.model.SwgCheckResult> Camera2StreamConfigurationMap(com.paypal.oslo.feature.onboarding.graphql.CheckGoogleTokenQuery.PublicCredentialMetadataByToken publicCredentialMetadataByToken) {
        com.paypal.oslo.feature.onboarding.signup.email.domain.model.OnboardingEmailStatus onboardingEmailStatus;
        com.paypal.oslo.feature.onboarding.graphql.CheckGoogleTokenQuery.Name name2;
        java.lang.String surname;
        com.paypal.oslo.feature.onboarding.graphql.CheckGoogleTokenQuery.Name name3;
        java.lang.String givenName;
        com.paypal.oslo.feature.onboarding.graphql.CheckGoogleTokenQuery.Challenge challenge;
        com.paypal.oslo.api.graphql.shared.fragment.AuthenticationChallengeFragment authenticationChallengeFragment;
        arrow.core.raise.DefaultRaise defaultRaise = new arrow.core.raise.DefaultRaise(false);
        try {
            arrow.core.raise.DefaultRaise defaultRaise2 = defaultRaise;
            boolean z = publicCredentialMetadataByToken.getActor() != null;
            com.paypal.oslo.feature.onboarding.graphql.CheckGoogleTokenQuery.Actor actor = publicCredentialMetadataByToken.getActor();
            java.util.ArrayList arrayList = null;
            java.lang.String correlationId = (actor == null || (challenge = actor.getChallenge()) == null || (authenticationChallengeFragment = challenge.getAuthenticationChallengeFragment()) == null) ? null : authenticationChallengeFragment.getCorrelationId();
            com.paypal.oslo.feature.onboarding.graphql.CheckGoogleTokenQuery.TokenDetails tokenDetails = publicCredentialMetadataByToken.getTokenDetails();
            java.lang.Object email = tokenDetails != null ? tokenDetails.getEmail() : null;
            java.lang.String str = email instanceof java.lang.String ? (java.lang.String) email : null;
            java.lang.String m15922constructorimpl = str != null ? com.paypal.oslo.feature.onboarding.api.signup.domain.model.Email.m15922constructorimpl(str) : null;
            com.paypal.oslo.feature.onboarding.graphql.CheckGoogleTokenQuery.TokenDetails tokenDetails2 = publicCredentialMetadataByToken.getTokenDetails();
            java.lang.String m15931constructorimpl = (tokenDetails2 == null || (name3 = tokenDetails2.getName()) == null || (givenName = name3.getGivenName()) == null) ? null : com.paypal.oslo.feature.onboarding.api.signup.domain.model.FirstName.m15931constructorimpl(givenName);
            com.paypal.oslo.feature.onboarding.graphql.CheckGoogleTokenQuery.TokenDetails tokenDetails3 = publicCredentialMetadataByToken.getTokenDetails();
            java.lang.String m15970constructorimpl = (tokenDetails3 == null || (name2 = tokenDetails3.getName()) == null || (surname = name2.getSurname()) == null) ? null : com.paypal.oslo.feature.onboarding.api.signup.domain.model.LastName.m15970constructorimpl(surname);
            com.paypal.oslo.feature.onboarding.graphql.CheckGoogleTokenQuery.TokenDetails tokenDetails4 = publicCredentialMetadataByToken.getTokenDetails();
            java.lang.Object profilePicture = tokenDetails4 != null ? tokenDetails4.getProfilePicture() : null;
            java.lang.String str2 = profilePicture instanceof java.lang.String ? (java.lang.String) profilePicture : null;
            java.lang.String m15988constructorimpl = str2 != null ? com.paypal.oslo.feature.onboarding.api.signup.domain.model.ProfileUrl.m15988constructorimpl(str2) : null;
            com.paypal.oslo.feature.onboarding.graphql.CheckGoogleTokenQuery.OnboardingEmailStatus onboardingEmailStatus2 = publicCredentialMetadataByToken.getOnboardingEmailStatus();
            if (onboardingEmailStatus2 != null) {
                com.paypal.oslo.feature.onboarding.signup.email.domain.model.EmailValidity mapValidityToDomain = com.paypal.oslo.feature.onboarding.signup.data.mapper.EmailValidationMapperKt.mapValidityToDomain(onboardingEmailStatus2.getValidity());
                java.util.List<java.lang.Object> suggestions = onboardingEmailStatus2.getSuggestions();
                if (suggestions != null) {
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    for (java.lang.Object obj : suggestions) {
                        if (obj instanceof java.lang.String) {
                            arrayList2.add(obj);
                        }
                    }
                    java.util.ArrayList arrayList3 = arrayList2;
                    java.util.ArrayList arrayList4 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(arrayList3, 10));
                    java.util.Iterator it = arrayList3.iterator();
                    while (it.hasNext()) {
                        arrayList4.add(com.paypal.oslo.feature.onboarding.api.signup.domain.model.Email.m15921boximpl(com.paypal.oslo.feature.onboarding.api.signup.domain.model.Email.m15922constructorimpl((java.lang.String) it.next())));
                    }
                    arrayList = arrayList4;
                }
                if (arrayList == null) {
                    arrayList = kotlin.collections.CollectionsKt.emptyList();
                }
                onboardingEmailStatus = new com.paypal.oslo.feature.onboarding.signup.email.domain.model.OnboardingEmailStatus(mapValidityToDomain, arrayList);
            } else {
                onboardingEmailStatus = null;
            }
            com.paypal.oslo.feature.onboarding.signup.swg.domain.model.SwgCheckResult swgCheckResult = new com.paypal.oslo.feature.onboarding.signup.swg.domain.model.SwgCheckResult(m15922constructorimpl, m15931constructorimpl, m15970constructorimpl, m15988constructorimpl, z, correlationId, onboardingEmailStatus, null);
            defaultRaise.complete();
            return new arrow.core.Either.Right(swgCheckResult);
        } catch (arrow.core.raise.RaiseCancellationException e) {
            defaultRaise.complete();
            return new arrow.core.Either.Left(arrow.core.raise.RaiseKt.raisedOrRethrow(e, defaultRaise));
        } catch (java.lang.Throwable th) {
            defaultRaise.complete();
            throw arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th);
        }
    }
}
