package com.paypal.oslo.feature.identity.challenges.shared.data.mapper;

@kotlin.Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0004H\u0000¢\u0006\u0004\b\u0002\u0010\u0005\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0006H\u0000¢\u0006\u0004\b\u0002\u0010\u0007\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\bH\u0000¢\u0006\u0004\b\u0002\u0010\t\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\nH\u0000¢\u0006\u0004\b\u0002\u0010\u000b\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\fH\u0000¢\u0006\u0004\b\u0002\u0010\r\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u000eH\u0000¢\u0006\u0004\b\u0002\u0010\u000f\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0010H\u0000¢\u0006\u0004\b\u0002\u0010\u0011\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0012H\u0000¢\u0006\u0004\b\u0002\u0010\u0013\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0014H\u0000¢\u0006\u0004\b\u0002\u0010\u0015\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0016H\u0000¢\u0006\u0004\b\u0002\u0010\u0017\u001a\u001f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00010\u0018*\b\u0012\u0004\u0012\u00020\u00190\u0018H\u0000¢\u0006\u0004\b\u001a\u0010\u001b"}, d2 = {"Lcom/paypal/oslo/feature/identity/graphql/fragment/TextOtpChallengeFragment;", "Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/Challenge;", "toDomainChallenge", "(Lcom/paypal/oslo/feature/identity/graphql/fragment/TextOtpChallengeFragment;)Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/Challenge;", "Lcom/paypal/oslo/feature/identity/graphql/fragment/EmailOtpChallengeFragment;", "(Lcom/paypal/oslo/feature/identity/graphql/fragment/EmailOtpChallengeFragment;)Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/Challenge;", "Lcom/paypal/oslo/feature/identity/graphql/fragment/WhatsappOtpChallengeFragment;", "(Lcom/paypal/oslo/feature/identity/graphql/fragment/WhatsappOtpChallengeFragment;)Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/Challenge;", "Lcom/paypal/oslo/feature/identity/graphql/fragment/PhoneOtpChallengeFragment;", "(Lcom/paypal/oslo/feature/identity/graphql/fragment/PhoneOtpChallengeFragment;)Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/Challenge;", "Lcom/paypal/oslo/feature/identity/graphql/fragment/AuthenticatorAppChallengeFragment;", "(Lcom/paypal/oslo/feature/identity/graphql/fragment/AuthenticatorAppChallengeFragment;)Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/Challenge;", "Lcom/paypal/oslo/feature/identity/graphql/LoginUserMutation$OnAuthenticatorAppIdentityChallenge;", "(Lcom/paypal/oslo/feature/identity/graphql/LoginUserMutation$OnAuthenticatorAppIdentityChallenge;)Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/Challenge;", "Lcom/paypal/oslo/feature/identity/graphql/fragment/SecurityQuestionChallengeFragment;", "(Lcom/paypal/oslo/feature/identity/graphql/fragment/SecurityQuestionChallengeFragment;)Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/Challenge;", "Lcom/paypal/oslo/feature/identity/graphql/fragment/CreditCardChallengeFragment;", "(Lcom/paypal/oslo/feature/identity/graphql/fragment/CreditCardChallengeFragment;)Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/Challenge;", "Lcom/paypal/oslo/feature/identity/graphql/fragment/SilentAuthChallengeFragment;", "(Lcom/paypal/oslo/feature/identity/graphql/fragment/SilentAuthChallengeFragment;)Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/Challenge;", "Lcom/paypal/oslo/feature/identity/graphql/ValidateStepUpIdentityChallengeMutation$OnSkipChangePasswordAndLoginIdentityChallenge;", "(Lcom/paypal/oslo/feature/identity/graphql/ValidateStepUpIdentityChallengeMutation$OnSkipChangePasswordAndLoginIdentityChallenge;)Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/Challenge;", "Lcom/paypal/oslo/feature/identity/graphql/ValidateStepUpIdentityChallengeMutation$OnChangePasswordIdentityChallenge;", "(Lcom/paypal/oslo/feature/identity/graphql/ValidateStepUpIdentityChallengeMutation$OnChangePasswordIdentityChallenge;)Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/Challenge;", "", "Lcom/paypal/oslo/feature/identity/graphql/LoginUserMutation$Challenge;", "toDomainChallenges", "(Ljava/util/List;)Ljava/util/List;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class AuthenticationChallengeMappersKt {
    public static final com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge toDomainChallenge(com.paypal.oslo.feature.identity.graphql.fragment.TextOtpChallengeFragment textOtpChallengeFragment) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(textOtpChallengeFragment, "");
        java.lang.String id = textOtpChallengeFragment.getId();
        com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeType domain = com.paypal.oslo.feature.identity.challenges.shared.data.mapper.ChallengeStatusMappersKt.toDomain(textOtpChallengeFragment.getChallengeMethod());
        java.util.List<com.paypal.oslo.feature.identity.graphql.fragment.TextOtpChallengeFragment.PhoneNumber> phoneNumbers = textOtpChallengeFragment.getPhoneNumbers();
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(phoneNumbers, 10));
        for (com.paypal.oslo.feature.identity.graphql.fragment.TextOtpChallengeFragment.PhoneNumber phoneNumber : phoneNumbers) {
            kotlin.Triple triple = new kotlin.Triple(phoneNumber.getChallengeId(), phoneNumber.getMaskedNumber(), phoneNumber.getNotified());
            java.lang.String str = (java.lang.String) triple.component1();
            java.lang.String str2 = (java.lang.String) triple.component2();
            java.lang.Boolean bool = (java.lang.Boolean) triple.component3();
            arrayList.add(new com.paypal.oslo.feature.identity.shared.domain.model.challenge.PhoneNumber(str, str2, bool != null ? bool.booleanValue() : false, false, false, (java.lang.String) null, 56, (kotlin.jvm.internal.DefaultConstructorMarker) null));
        }
        return new com.paypal.oslo.feature.identity.shared.domain.model.challenge.SmsChallenge(id, domain, true, arrayList, textOtpChallengeFragment.getStepUpNonce(), textOtpChallengeFragment.getStepUpPartialToken());
    }

    public static final com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge toDomainChallenge(com.paypal.oslo.feature.identity.graphql.fragment.EmailOtpChallengeFragment emailOtpChallengeFragment) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(emailOtpChallengeFragment, "");
        java.lang.String id = emailOtpChallengeFragment.getId();
        com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeType domain = com.paypal.oslo.feature.identity.challenges.shared.data.mapper.ChallengeStatusMappersKt.toDomain(emailOtpChallengeFragment.getChallengeMethod());
        java.util.List<com.paypal.oslo.feature.identity.graphql.fragment.EmailOtpChallengeFragment.EmailAddress> emailAddresses = emailOtpChallengeFragment.getEmailAddresses();
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(emailAddresses, 10));
        for (com.paypal.oslo.feature.identity.graphql.fragment.EmailOtpChallengeFragment.EmailAddress emailAddress : emailAddresses) {
            kotlin.Triple triple = new kotlin.Triple(emailAddress.getChallengeId(), emailAddress.getMaskedEmail(), java.lang.Boolean.valueOf(emailAddress.getNotified()));
            java.lang.String str = (java.lang.String) triple.component1();
            java.lang.String str2 = (java.lang.String) triple.component2();
            java.lang.Boolean bool = (java.lang.Boolean) triple.component3();
            arrayList.add(new com.paypal.oslo.feature.identity.shared.domain.model.challenge.EmailAddress(str, str2, bool != null ? bool.booleanValue() : false, false, false, 24, (kotlin.jvm.internal.DefaultConstructorMarker) null));
        }
        return new com.paypal.oslo.feature.identity.shared.domain.model.challenge.EmailChallenge(id, domain, true, arrayList, emailOtpChallengeFragment.getStepUpNonce(), emailOtpChallengeFragment.getStepUpPartialToken());
    }

    public static final com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge toDomainChallenge(com.paypal.oslo.feature.identity.graphql.fragment.WhatsappOtpChallengeFragment whatsappOtpChallengeFragment) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(whatsappOtpChallengeFragment, "");
        java.lang.String id = whatsappOtpChallengeFragment.getId();
        com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeType domain = com.paypal.oslo.feature.identity.challenges.shared.data.mapper.ChallengeStatusMappersKt.toDomain(whatsappOtpChallengeFragment.getChallengeMethod());
        java.util.List<com.paypal.oslo.feature.identity.graphql.fragment.WhatsappOtpChallengeFragment.PhoneNumber> phoneNumbers = whatsappOtpChallengeFragment.getPhoneNumbers();
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(phoneNumbers, 10));
        for (com.paypal.oslo.feature.identity.graphql.fragment.WhatsappOtpChallengeFragment.PhoneNumber phoneNumber : phoneNumbers) {
            kotlin.Triple triple = new kotlin.Triple(phoneNumber.getChallengeId(), phoneNumber.getMaskedNumber(), phoneNumber.getNotified());
            java.lang.String str = (java.lang.String) triple.component1();
            java.lang.String str2 = (java.lang.String) triple.component2();
            java.lang.Boolean bool = (java.lang.Boolean) triple.component3();
            arrayList.add(new com.paypal.oslo.feature.identity.shared.domain.model.challenge.PhoneNumber(str, str2, bool != null ? bool.booleanValue() : false, false, false, (java.lang.String) null, 56, (kotlin.jvm.internal.DefaultConstructorMarker) null));
        }
        return new com.paypal.oslo.feature.identity.shared.domain.model.challenge.WhatsAppChallenge(id, domain, true, arrayList, whatsappOtpChallengeFragment.getStepUpNonce(), whatsappOtpChallengeFragment.getStepUpPartialToken());
    }

    public static final com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge toDomainChallenge(com.paypal.oslo.feature.identity.graphql.fragment.PhoneOtpChallengeFragment phoneOtpChallengeFragment) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(phoneOtpChallengeFragment, "");
        java.lang.String id = phoneOtpChallengeFragment.getId();
        com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeType domain = com.paypal.oslo.feature.identity.challenges.shared.data.mapper.ChallengeStatusMappersKt.toDomain(phoneOtpChallengeFragment.getChallengeMethod());
        java.util.List<com.paypal.oslo.feature.identity.graphql.fragment.PhoneOtpChallengeFragment.PhoneNumber> phoneNumbers = phoneOtpChallengeFragment.getPhoneNumbers();
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(phoneNumbers, 10));
        for (com.paypal.oslo.feature.identity.graphql.fragment.PhoneOtpChallengeFragment.PhoneNumber phoneNumber : phoneNumbers) {
            kotlin.Triple triple = new kotlin.Triple(phoneNumber.getChallengeId(), phoneNumber.getMaskedNumber(), phoneNumber.getNotified());
            java.lang.String str = (java.lang.String) triple.component1();
            java.lang.String str2 = (java.lang.String) triple.component2();
            java.lang.Boolean bool = (java.lang.Boolean) triple.component3();
            arrayList.add(new com.paypal.oslo.feature.identity.shared.domain.model.challenge.PhoneNumber(str, str2, bool != null ? bool.booleanValue() : false, false, false, (java.lang.String) null, 56, (kotlin.jvm.internal.DefaultConstructorMarker) null));
        }
        return new com.paypal.oslo.feature.identity.shared.domain.model.challenge.PhoneCallChallenge(id, domain, true, arrayList, phoneOtpChallengeFragment.getStepUpNonce(), phoneOtpChallengeFragment.getStepUpPartialToken());
    }

    public static final com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge toDomainChallenge(com.paypal.oslo.feature.identity.graphql.fragment.AuthenticatorAppChallengeFragment authenticatorAppChallengeFragment) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(authenticatorAppChallengeFragment, "");
        return new com.paypal.oslo.feature.identity.shared.domain.model.challenge.AuthenticatorAppChallenge(authenticatorAppChallengeFragment.getId(), com.paypal.oslo.feature.identity.challenges.shared.data.mapper.ChallengeStatusMappersKt.toDomain(authenticatorAppChallengeFragment.getChallengeMethod()), true, authenticatorAppChallengeFragment.getStepUpNonce(), authenticatorAppChallengeFragment.getStepUpPartialToken());
    }

    public static final com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge toDomainChallenge(com.paypal.oslo.feature.identity.graphql.LoginUserMutation.OnAuthenticatorAppIdentityChallenge onAuthenticatorAppIdentityChallenge) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onAuthenticatorAppIdentityChallenge, "");
        return toDomainChallenge(onAuthenticatorAppIdentityChallenge.getAuthenticatorAppChallengeFragment());
    }

    public static final com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge toDomainChallenge(com.paypal.oslo.feature.identity.graphql.fragment.SecurityQuestionChallengeFragment securityQuestionChallengeFragment) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(securityQuestionChallengeFragment, "");
        com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeType domain = com.paypal.oslo.feature.identity.challenges.shared.data.mapper.ChallengeStatusMappersKt.toDomain(securityQuestionChallengeFragment.getChallengeMethod());
        java.util.List<com.paypal.oslo.feature.identity.graphql.fragment.SecurityQuestionChallengeFragment.SecurityQuestion> securityQuestions = securityQuestionChallengeFragment.getSecurityQuestions();
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(securityQuestions, 10));
        for (com.paypal.oslo.feature.identity.graphql.fragment.SecurityQuestionChallengeFragment.SecurityQuestion securityQuestion : securityQuestions) {
            arrayList.add(new com.paypal.oslo.feature.identity.shared.domain.model.challenge.SecurityQuestion(securityQuestion.getChallengeId(), securityQuestion.getQuestion()));
        }
        return new com.paypal.oslo.feature.identity.shared.domain.model.challenge.SecurityQuestionChallenge(securityQuestionChallengeFragment.getId(), domain, true, arrayList, securityQuestionChallengeFragment.getStepUpNonce(), securityQuestionChallengeFragment.getStepUpPartialToken());
    }

    public static final com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge toDomainChallenge(com.paypal.oslo.feature.identity.graphql.fragment.CreditCardChallengeFragment creditCardChallengeFragment) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(creditCardChallengeFragment, "");
        com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeType domain = com.paypal.oslo.feature.identity.challenges.shared.data.mapper.ChallengeStatusMappersKt.toDomain(creditCardChallengeFragment.getChallengeMethod());
        java.util.List<com.paypal.oslo.feature.identity.graphql.fragment.CreditCardChallengeFragment.CreditCard> creditCards = creditCardChallengeFragment.getCreditCards();
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(creditCards, 10));
        for (com.paypal.oslo.feature.identity.graphql.fragment.CreditCardChallengeFragment.CreditCard creditCard : creditCards) {
            arrayList.add(new com.paypal.oslo.feature.identity.shared.domain.model.challenge.CreditCard(creditCard.getChallengeId(), creditCard.getCardLast4Char().toString(), creditCard.getCardType(), false, 8, (kotlin.jvm.internal.DefaultConstructorMarker) null));
        }
        return new com.paypal.oslo.feature.identity.shared.domain.model.challenge.CreditCardChallenge(creditCardChallengeFragment.getId(), domain, true, arrayList, creditCardChallengeFragment.getStepUpNonce(), creditCardChallengeFragment.getStepUpPartialToken());
    }

    public static final com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge toDomainChallenge(com.paypal.oslo.feature.identity.graphql.fragment.SilentAuthChallengeFragment silentAuthChallengeFragment) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(silentAuthChallengeFragment, "");
        java.util.List<com.paypal.oslo.feature.identity.graphql.fragment.SilentAuthChallengeFragment.PhoneNumber> phoneNumbers = silentAuthChallengeFragment.getPhoneNumbers();
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(phoneNumbers, 10));
        for (com.paypal.oslo.feature.identity.graphql.fragment.SilentAuthChallengeFragment.PhoneNumber phoneNumber : phoneNumbers) {
            java.lang.String challengeId = phoneNumber.getChallengeId();
            java.lang.String maskedNumber = phoneNumber.getMaskedNumber();
            java.lang.Boolean notified = phoneNumber.getNotified();
            arrayList.add(new com.paypal.oslo.feature.identity.shared.domain.model.challenge.PhoneNumber(challengeId, maskedNumber, notified != null ? notified.booleanValue() : false, false, false, phoneNumber.getEvaluateURL(), 24, (kotlin.jvm.internal.DefaultConstructorMarker) null));
        }
        java.util.ArrayList arrayList2 = arrayList;
        com.paypal.oslo.feature.identity.shared.domain.model.challenge.PhoneNumber phoneNumber2 = (com.paypal.oslo.feature.identity.shared.domain.model.challenge.PhoneNumber) kotlin.collections.CollectionsKt.firstOrNull((java.util.List) arrayList2);
        java.lang.String evaluateURL = phoneNumber2 != null ? phoneNumber2.getEvaluateURL() : null;
        return new com.paypal.oslo.feature.identity.shared.domain.model.challenge.SilentAuthChallenge(silentAuthChallengeFragment.getId(), com.paypal.oslo.feature.identity.challenges.shared.data.mapper.ChallengeStatusMappersKt.toDomain(silentAuthChallengeFragment.getChallengeMethod()), true, evaluateURL == null ? "" : evaluateURL, arrayList2, silentAuthChallengeFragment.getStepUpNonce(), silentAuthChallengeFragment.getStepUpPartialToken());
    }

    public static final com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge toDomainChallenge(com.paypal.oslo.feature.identity.graphql.ValidateStepUpIdentityChallengeMutation.OnSkipChangePasswordAndLoginIdentityChallenge onSkipChangePasswordAndLoginIdentityChallenge) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onSkipChangePasswordAndLoginIdentityChallenge, "");
        return new com.paypal.oslo.feature.identity.shared.domain.model.challenge.SkipChangePasswordAndLoginChallenge(onSkipChangePasswordAndLoginIdentityChallenge.getId(), com.paypal.oslo.feature.identity.challenges.shared.data.mapper.ChallengeStatusMappersKt.toDomain(onSkipChangePasswordAndLoginIdentityChallenge.getChallengeMethod()), true, onSkipChangePasswordAndLoginIdentityChallenge.getValidationToken(), onSkipChangePasswordAndLoginIdentityChallenge.getNonce(), onSkipChangePasswordAndLoginIdentityChallenge.getPartialToken());
    }

    public static final com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge toDomainChallenge(com.paypal.oslo.feature.identity.graphql.ValidateStepUpIdentityChallengeMutation.OnChangePasswordIdentityChallenge onChangePasswordIdentityChallenge) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onChangePasswordIdentityChallenge, "");
        return new com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChangePasswordChallenge(onChangePasswordIdentityChallenge.getId(), com.paypal.oslo.feature.identity.challenges.shared.data.mapper.ChallengeStatusMappersKt.toDomain(onChangePasswordIdentityChallenge.getChallengeMethod()), true, onChangePasswordIdentityChallenge.getNonce(), onChangePasswordIdentityChallenge.getPartialToken());
    }

    public static final java.util.List<com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge> toDomainChallenges(java.util.List<com.paypal.oslo.feature.identity.graphql.LoginUserMutation.Challenge> list) {
        com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge domainChallenge;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (com.paypal.oslo.feature.identity.graphql.LoginUserMutation.Challenge challenge : list) {
            if (challenge.getOnTextOneTimePasscodeIdentityChallenge() != null) {
                domainChallenge = toDomainChallenge(challenge.getOnTextOneTimePasscodeIdentityChallenge().getTextOtpChallengeFragment());
            } else if (challenge.getOnEmailOneTimePasscodeIdentityChallenge() != null) {
                domainChallenge = toDomainChallenge(challenge.getOnEmailOneTimePasscodeIdentityChallenge().getEmailOtpChallengeFragment());
            } else if (challenge.getOnWhatsappOneTimePasscodeIdentityChallenge() != null) {
                domainChallenge = toDomainChallenge(challenge.getOnWhatsappOneTimePasscodeIdentityChallenge().getWhatsappOtpChallengeFragment());
            } else if (challenge.getOnPhoneOneTimePasscodeIdentityChallenge() != null) {
                domainChallenge = toDomainChallenge(challenge.getOnPhoneOneTimePasscodeIdentityChallenge().getPhoneOtpChallengeFragment());
            } else if (challenge.getOnAuthenticatorAppIdentityChallenge() != null) {
                domainChallenge = toDomainChallenge(challenge.getOnAuthenticatorAppIdentityChallenge().getAuthenticatorAppChallengeFragment());
            } else if (challenge.getOnSecurityQuestionIdentityChallenge() != null) {
                domainChallenge = toDomainChallenge(challenge.getOnSecurityQuestionIdentityChallenge().getSecurityQuestionChallengeFragment());
            } else if (challenge.getOnCreditCardIdentityChallenge() != null) {
                domainChallenge = toDomainChallenge(challenge.getOnCreditCardIdentityChallenge().getCreditCardChallengeFragment());
            } else {
                domainChallenge = challenge.getOnSilentAuthenticationIdentityChallenge() != null ? toDomainChallenge(challenge.getOnSilentAuthenticationIdentityChallenge().getSilentAuthChallengeFragment()) : null;
            }
            if (domainChallenge != null) {
                arrayList.add(domainChallenge);
            }
        }
        return arrayList;
    }
}
