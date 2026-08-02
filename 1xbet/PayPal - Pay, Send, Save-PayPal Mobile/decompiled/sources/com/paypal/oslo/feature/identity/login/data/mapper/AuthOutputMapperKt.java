package com.paypal.oslo.feature.identity.login.data.mapper;

@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001d\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/paypal/oslo/feature/identity/graphql/LoginUserMutation$OnAuthenticationChallengeResult;", "Lcom/paypal/oslo/feature/identity/login/domain/model/AuthIntent;", "authIntent", "Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/ChallengeResult;", "toChallengeResult", "(Lcom/paypal/oslo/feature/identity/graphql/LoginUserMutation$OnAuthenticationChallengeResult;Lcom/paypal/oslo/feature/identity/login/domain/model/AuthIntent;)Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/ChallengeResult;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class AuthOutputMapperKt {
    public static /* synthetic */ com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeResult toChallengeResult$default(com.paypal.oslo.feature.identity.graphql.LoginUserMutation.OnAuthenticationChallengeResult onAuthenticationChallengeResult, com.paypal.oslo.feature.identity.login.domain.model.AuthIntent authIntent, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            authIntent = com.paypal.oslo.feature.identity.login.domain.model.AuthIntent.LOGIN;
        }
        return toChallengeResult(onAuthenticationChallengeResult, authIntent);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v14, types: [com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge] */
    /* JADX WARN: Type inference failed for: r6v22, types: [com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge] */
    /* JADX WARN: Type inference failed for: r6v25, types: [com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge] */
    /* JADX WARN: Type inference failed for: r6v33, types: [com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge] */
    /* JADX WARN: Type inference failed for: r6v41, types: [com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge] */
    /* JADX WARN: Type inference failed for: r6v49, types: [com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge] */
    /* JADX WARN: Type inference failed for: r6v58, types: [com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge] */
    public static final com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeResult toChallengeResult(com.paypal.oslo.feature.identity.graphql.LoginUserMutation.OnAuthenticationChallengeResult onAuthenticationChallengeResult, com.paypal.oslo.feature.identity.login.domain.model.AuthIntent authIntent) {
        com.paypal.oslo.feature.identity.shared.domain.model.challenge.AuthenticationChallengeStatus.Validate validate;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onAuthenticationChallengeResult, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(authIntent, "");
        java.util.List<com.paypal.oslo.feature.identity.graphql.LoginUserMutation.Challenge> challenges = onAuthenticationChallengeResult.getChallenges();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = challenges.iterator();
        while (true) {
            com.paypal.oslo.feature.identity.shared.domain.model.challenge.AuthenticationChallengeStatus authenticationChallengeStatus = null;
            com.paypal.oslo.feature.identity.shared.domain.model.challenge.SilentAuthChallenge silentAuthChallenge = null;
            authenticationChallengeStatus = null;
            if (it.hasNext()) {
                com.paypal.oslo.feature.identity.graphql.LoginUserMutation.Challenge challenge = (com.paypal.oslo.feature.identity.graphql.LoginUserMutation.Challenge) it.next();
                if (challenge.getOnTextOneTimePasscodeIdentityChallenge() == null) {
                    if (challenge.getOnEmailOneTimePasscodeIdentityChallenge() == null) {
                        if (challenge.getOnWhatsappOneTimePasscodeIdentityChallenge() == null) {
                            if (challenge.getOnPhoneOneTimePasscodeIdentityChallenge() == null) {
                                if (challenge.getOnAuthenticatorAppIdentityChallenge() == null) {
                                    if (challenge.getOnSecurityQuestionIdentityChallenge() == null) {
                                        if (challenge.getOnCreditCardIdentityChallenge() == null) {
                                            if (challenge.getOnSilentAuthenticationIdentityChallenge() != null) {
                                                com.paypal.oslo.feature.identity.graphql.fragment.SilentAuthChallengeFragment silentAuthChallengeFragment = challenge.getOnSilentAuthenticationIdentityChallenge().getSilentAuthChallengeFragment();
                                                java.util.List<com.paypal.oslo.feature.identity.graphql.fragment.SilentAuthChallengeFragment.PhoneNumber> phoneNumbers = silentAuthChallengeFragment.getPhoneNumbers();
                                                java.util.ArrayList arrayList2 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(phoneNumbers, 10));
                                                for (com.paypal.oslo.feature.identity.graphql.fragment.SilentAuthChallengeFragment.PhoneNumber phoneNumber : phoneNumbers) {
                                                    java.lang.String challengeId = phoneNumber.getChallengeId();
                                                    java.lang.String maskedNumber = phoneNumber.getMaskedNumber();
                                                    java.lang.Boolean notified = phoneNumber.getNotified();
                                                    arrayList2.add(new com.paypal.oslo.feature.identity.shared.domain.model.challenge.PhoneNumber(challengeId, maskedNumber, notified != null ? notified.booleanValue() : false, false, false, phoneNumber.getEvaluateURL(), 24, (kotlin.jvm.internal.DefaultConstructorMarker) null));
                                                }
                                                java.util.ArrayList arrayList3 = arrayList2;
                                                com.paypal.oslo.feature.identity.shared.domain.model.challenge.PhoneNumber phoneNumber2 = (com.paypal.oslo.feature.identity.shared.domain.model.challenge.PhoneNumber) kotlin.collections.CollectionsKt.firstOrNull((java.util.List) arrayList3);
                                                java.lang.String evaluateURL = phoneNumber2 != null ? phoneNumber2.getEvaluateURL() : null;
                                                silentAuthChallenge = new com.paypal.oslo.feature.identity.shared.domain.model.challenge.SilentAuthChallenge(silentAuthChallengeFragment.getId(), com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeType.SILENT_AUTH, true, evaluateURL == null ? "" : evaluateURL, arrayList3, silentAuthChallengeFragment.getStepUpNonce(), silentAuthChallengeFragment.getStepUpPartialToken());
                                            }
                                        } else {
                                            com.paypal.oslo.feature.identity.graphql.fragment.CreditCardChallengeFragment creditCardChallengeFragment = challenge.getOnCreditCardIdentityChallenge().getCreditCardChallengeFragment();
                                            if (creditCardChallengeFragment.getCreditCards().isEmpty()) {
                                                throw new java.lang.IllegalArgumentException("No credit cards available for Credit card challenge".toString());
                                            }
                                            java.lang.String id = creditCardChallengeFragment.getId();
                                            com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeType challengeType = com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeType.CREDIT_CARD;
                                            java.util.List<com.paypal.oslo.feature.identity.graphql.fragment.CreditCardChallengeFragment.CreditCard> creditCards = creditCardChallengeFragment.getCreditCards();
                                            java.util.ArrayList arrayList4 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(creditCards, 10));
                                            for (com.paypal.oslo.feature.identity.graphql.fragment.CreditCardChallengeFragment.CreditCard creditCard : creditCards) {
                                                arrayList4.add(new com.paypal.oslo.feature.identity.shared.domain.model.challenge.CreditCard(creditCard.getChallengeId(), creditCard.getCardLast4Char().toString(), creditCard.getCardType(), false, 8, (kotlin.jvm.internal.DefaultConstructorMarker) null));
                                            }
                                            silentAuthChallenge = new com.paypal.oslo.feature.identity.shared.domain.model.challenge.CreditCardChallenge(id, challengeType, true, arrayList4, creditCardChallengeFragment.getStepUpNonce(), creditCardChallengeFragment.getStepUpPartialToken());
                                        }
                                    } else {
                                        com.paypal.oslo.feature.identity.graphql.fragment.SecurityQuestionChallengeFragment securityQuestionChallengeFragment = challenge.getOnSecurityQuestionIdentityChallenge().getSecurityQuestionChallengeFragment();
                                        if (securityQuestionChallengeFragment.getSecurityQuestions().isEmpty()) {
                                            throw new java.lang.IllegalArgumentException("No security questions available".toString());
                                        }
                                        java.lang.String id2 = securityQuestionChallengeFragment.getId();
                                        com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeType challengeType2 = com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeType.SECURITY_QUESTION;
                                        boolean isEmpty = securityQuestionChallengeFragment.getSecurityQuestions().isEmpty();
                                        java.util.List<com.paypal.oslo.feature.identity.graphql.fragment.SecurityQuestionChallengeFragment.SecurityQuestion> securityQuestions = securityQuestionChallengeFragment.getSecurityQuestions();
                                        java.util.ArrayList arrayList5 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(securityQuestions, 10));
                                        for (com.paypal.oslo.feature.identity.graphql.fragment.SecurityQuestionChallengeFragment.SecurityQuestion securityQuestion : securityQuestions) {
                                            arrayList5.add(new com.paypal.oslo.feature.identity.shared.domain.model.challenge.SecurityQuestion(securityQuestion.getChallengeId(), securityQuestion.getQuestion()));
                                        }
                                        silentAuthChallenge = new com.paypal.oslo.feature.identity.shared.domain.model.challenge.SecurityQuestionChallenge(id2, challengeType2, !isEmpty, arrayList5, securityQuestionChallengeFragment.getStepUpNonce(), securityQuestionChallengeFragment.getStepUpPartialToken());
                                    }
                                } else {
                                    com.paypal.oslo.feature.identity.graphql.fragment.AuthenticatorAppChallengeFragment authenticatorAppChallengeFragment = challenge.getOnAuthenticatorAppIdentityChallenge().getAuthenticatorAppChallengeFragment();
                                    silentAuthChallenge = new com.paypal.oslo.feature.identity.shared.domain.model.challenge.AuthenticatorAppChallenge(authenticatorAppChallengeFragment.getId(), com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeType.AUTHENTICATOR_APP, true, authenticatorAppChallengeFragment.getStepUpNonce(), authenticatorAppChallengeFragment.getStepUpPartialToken());
                                }
                            } else {
                                com.paypal.oslo.feature.identity.graphql.fragment.PhoneOtpChallengeFragment phoneOtpChallengeFragment = challenge.getOnPhoneOneTimePasscodeIdentityChallenge().getPhoneOtpChallengeFragment();
                                if (phoneOtpChallengeFragment.getPhoneNumbers().isEmpty()) {
                                    throw new java.lang.IllegalArgumentException("No phone numbers available for Phone challenge".toString());
                                }
                                java.lang.String id3 = phoneOtpChallengeFragment.getId();
                                com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeType challengeType3 = com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeType.IVR;
                                boolean isEmpty2 = phoneOtpChallengeFragment.getPhoneNumbers().isEmpty();
                                java.util.List<com.paypal.oslo.feature.identity.graphql.fragment.PhoneOtpChallengeFragment.PhoneNumber> phoneNumbers2 = phoneOtpChallengeFragment.getPhoneNumbers();
                                java.util.ArrayList arrayList6 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(phoneNumbers2, 10));
                                for (com.paypal.oslo.feature.identity.graphql.fragment.PhoneOtpChallengeFragment.PhoneNumber phoneNumber3 : phoneNumbers2) {
                                    java.lang.String challengeId2 = phoneNumber3.getChallengeId();
                                    java.lang.String maskedNumber2 = phoneNumber3.getMaskedNumber();
                                    java.lang.Boolean notified2 = phoneNumber3.getNotified();
                                    arrayList6.add(new com.paypal.oslo.feature.identity.shared.domain.model.challenge.PhoneNumber(challengeId2, maskedNumber2, notified2 != null ? notified2.booleanValue() : false, false, false, (java.lang.String) null, 56, (kotlin.jvm.internal.DefaultConstructorMarker) null));
                                }
                                silentAuthChallenge = new com.paypal.oslo.feature.identity.shared.domain.model.challenge.PhoneCallChallenge(id3, challengeType3, !isEmpty2, arrayList6, phoneOtpChallengeFragment.getStepUpNonce(), phoneOtpChallengeFragment.getStepUpPartialToken());
                            }
                        } else {
                            com.paypal.oslo.feature.identity.graphql.fragment.WhatsappOtpChallengeFragment whatsappOtpChallengeFragment = challenge.getOnWhatsappOneTimePasscodeIdentityChallenge().getWhatsappOtpChallengeFragment();
                            if (whatsappOtpChallengeFragment.getPhoneNumbers().isEmpty()) {
                                throw new java.lang.IllegalArgumentException("No phone numbers available for WhatsApp challenge".toString());
                            }
                            java.lang.String id4 = whatsappOtpChallengeFragment.getId();
                            com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeType challengeType4 = com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeType.WHATSAPP;
                            boolean isEmpty3 = whatsappOtpChallengeFragment.getPhoneNumbers().isEmpty();
                            java.util.List<com.paypal.oslo.feature.identity.graphql.fragment.WhatsappOtpChallengeFragment.PhoneNumber> phoneNumbers3 = whatsappOtpChallengeFragment.getPhoneNumbers();
                            java.util.ArrayList arrayList7 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(phoneNumbers3, 10));
                            for (com.paypal.oslo.feature.identity.graphql.fragment.WhatsappOtpChallengeFragment.PhoneNumber phoneNumber4 : phoneNumbers3) {
                                java.lang.String challengeId3 = phoneNumber4.getChallengeId();
                                java.lang.String maskedNumber3 = phoneNumber4.getMaskedNumber();
                                java.lang.Boolean notified3 = phoneNumber4.getNotified();
                                arrayList7.add(new com.paypal.oslo.feature.identity.shared.domain.model.challenge.PhoneNumber(challengeId3, maskedNumber3, notified3 != null ? notified3.booleanValue() : false, false, false, (java.lang.String) null, 56, (kotlin.jvm.internal.DefaultConstructorMarker) null));
                            }
                            silentAuthChallenge = new com.paypal.oslo.feature.identity.shared.domain.model.challenge.WhatsAppChallenge(id4, challengeType4, !isEmpty3, arrayList7, whatsappOtpChallengeFragment.getStepUpNonce(), whatsappOtpChallengeFragment.getStepUpPartialToken());
                        }
                    } else {
                        com.paypal.oslo.feature.identity.graphql.fragment.EmailOtpChallengeFragment emailOtpChallengeFragment = challenge.getOnEmailOneTimePasscodeIdentityChallenge().getEmailOtpChallengeFragment();
                        if (emailOtpChallengeFragment.getEmailAddresses().isEmpty()) {
                            throw new java.lang.IllegalArgumentException("No email addresses available for Email challenge".toString());
                        }
                        java.lang.String id5 = emailOtpChallengeFragment.getId();
                        com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeType challengeType5 = com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeType.EMAIL;
                        boolean isEmpty4 = emailOtpChallengeFragment.getEmailAddresses().isEmpty();
                        java.util.List<com.paypal.oslo.feature.identity.graphql.fragment.EmailOtpChallengeFragment.EmailAddress> emailAddresses = emailOtpChallengeFragment.getEmailAddresses();
                        java.util.ArrayList arrayList8 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(emailAddresses, 10));
                        for (com.paypal.oslo.feature.identity.graphql.fragment.EmailOtpChallengeFragment.EmailAddress emailAddress : emailAddresses) {
                            arrayList8.add(new com.paypal.oslo.feature.identity.shared.domain.model.challenge.EmailAddress(emailAddress.getChallengeId(), emailAddress.getMaskedEmail(), emailAddress.getNotified(), false, false, 24, (kotlin.jvm.internal.DefaultConstructorMarker) null));
                        }
                        silentAuthChallenge = new com.paypal.oslo.feature.identity.shared.domain.model.challenge.EmailChallenge(id5, challengeType5, !isEmpty4, arrayList8, emailOtpChallengeFragment.getStepUpNonce(), emailOtpChallengeFragment.getStepUpPartialToken());
                    }
                } else {
                    com.paypal.oslo.feature.identity.graphql.fragment.TextOtpChallengeFragment textOtpChallengeFragment = challenge.getOnTextOneTimePasscodeIdentityChallenge().getTextOtpChallengeFragment();
                    if (textOtpChallengeFragment.getPhoneNumbers().isEmpty()) {
                        throw new java.lang.IllegalArgumentException("No phone numbers available for SMS challenge".toString());
                    }
                    java.lang.String id6 = textOtpChallengeFragment.getId();
                    com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeType challengeType6 = com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeType.SMS;
                    boolean isEmpty5 = textOtpChallengeFragment.getPhoneNumbers().isEmpty();
                    java.util.List<com.paypal.oslo.feature.identity.graphql.fragment.TextOtpChallengeFragment.PhoneNumber> phoneNumbers4 = textOtpChallengeFragment.getPhoneNumbers();
                    java.util.ArrayList arrayList9 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(phoneNumbers4, 10));
                    for (com.paypal.oslo.feature.identity.graphql.fragment.TextOtpChallengeFragment.PhoneNumber phoneNumber5 : phoneNumbers4) {
                        java.lang.String challengeId4 = phoneNumber5.getChallengeId();
                        java.lang.String maskedNumber4 = phoneNumber5.getMaskedNumber();
                        java.lang.Boolean notified4 = phoneNumber5.getNotified();
                        arrayList9.add(new com.paypal.oslo.feature.identity.shared.domain.model.challenge.PhoneNumber(challengeId4, maskedNumber4, notified4 != null ? notified4.booleanValue() : false, false, false, (java.lang.String) null, 56, (kotlin.jvm.internal.DefaultConstructorMarker) null));
                    }
                    silentAuthChallenge = new com.paypal.oslo.feature.identity.shared.domain.model.challenge.SmsChallenge(id6, challengeType6, !isEmpty5, arrayList9, textOtpChallengeFragment.getStepUpNonce(), textOtpChallengeFragment.getStepUpPartialToken());
                }
                if (silentAuthChallenge != null) {
                    arrayList.add(silentAuthChallenge);
                }
            } else {
                java.util.ArrayList arrayList10 = arrayList;
                com.paypal.oslo.feature.identity.graphql.LoginUserMutation.Status status = onAuthenticationChallengeResult.getStatus();
                if (status != null) {
                    if (status.getOnNotifyStepUpIdentityChallengeResult() != null) {
                        validate = new com.paypal.oslo.feature.identity.shared.domain.model.challenge.AuthenticationChallengeStatus.Notify(com.paypal.oslo.feature.identity.challenges.shared.data.mapper.NotifyChallengeMappersKt.toDomain(onAuthenticationChallengeResult));
                    } else if (status.getOnValidateStepUpIdentityChallengeResult() != null) {
                        validate = new com.paypal.oslo.feature.identity.shared.domain.model.challenge.AuthenticationChallengeStatus.Validate(com.paypal.oslo.feature.identity.challenges.shared.data.mapper.ValidateChallengeMappersKt.toValidateDomain(onAuthenticationChallengeResult));
                    }
                    authenticationChallengeStatus = validate;
                }
                return new com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeResult(arrayList10, new com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeContext(com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeFlowType.LOGIN, com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengePriorityStrategy.INSTANCE.fromChallenges(arrayList10), authIntent), authenticationChallengeStatus, null, 8, null);
            }
        }
    }
}
