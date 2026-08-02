package com.paypal.oslo.feature.identity.stepup.data.mapper;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \n2\u00020\u0001:\u0001\nB\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\b\u0010\t"}, d2 = {"Lcom/paypal/oslo/feature/identity/stepup/data/mapper/StepupChallengeMapper;", "", "<init>", "()V", "", "Lcom/paypal/oslo/feature/identity/graphql/StepUpIdentityChallengesQuery$StepUpIdentityChallenge;", "challenges", "Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/Challenge;", "mapToChallenges", "(Ljava/util/List;)Ljava/util/List;", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class StepupChallengeMapper {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.identity.stepup.data.mapper.StepupChallengeMapper.Companion INSTANCE = new com.paypal.oslo.feature.identity.stepup.data.mapper.StepupChallengeMapper.Companion(null);

    @javax.inject.Inject
    public StepupChallengeMapper() {
    }

    public final java.util.List<com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge> mapToChallenges(java.util.List<com.paypal.oslo.feature.identity.graphql.StepUpIdentityChallengesQuery.StepUpIdentityChallenge> challenges) {
        com.paypal.oslo.feature.identity.shared.domain.model.challenge.WebViewChallenge webViewChallenge;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(challenges, "");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (com.paypal.oslo.feature.identity.graphql.StepUpIdentityChallengesQuery.StepUpIdentityChallenge stepUpIdentityChallenge : challenges) {
            if (stepUpIdentityChallenge.getOnTextOneTimePasscodeIdentityChallenge() != null) {
                com.paypal.oslo.feature.identity.graphql.StepUpIdentityChallengesQuery.OnTextOneTimePasscodeIdentityChallenge onTextOneTimePasscodeIdentityChallenge = stepUpIdentityChallenge.getOnTextOneTimePasscodeIdentityChallenge();
                java.lang.String id = onTextOneTimePasscodeIdentityChallenge.getId();
                java.lang.String str = id == null ? "" : id;
                com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeType challengeType = com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeType.SMS;
                java.util.List<com.paypal.oslo.feature.identity.graphql.StepUpIdentityChallengesQuery.PhoneNumber> phoneNumbers = onTextOneTimePasscodeIdentityChallenge.getPhoneNumbers();
                java.util.ArrayList arrayList2 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(phoneNumbers, 10));
                for (com.paypal.oslo.feature.identity.graphql.StepUpIdentityChallengesQuery.PhoneNumber phoneNumber : phoneNumbers) {
                    java.lang.String challengeId = phoneNumber.getChallengeId();
                    java.lang.String str2 = challengeId == null ? "" : challengeId;
                    java.lang.String maskedNumber = phoneNumber.getMaskedNumber();
                    java.lang.String str3 = maskedNumber == null ? "" : maskedNumber;
                    java.lang.Boolean notified = phoneNumber.getNotified();
                    arrayList2.add(new com.paypal.oslo.feature.identity.shared.domain.model.challenge.PhoneNumber(str2, str3, notified != null ? notified.booleanValue() : false, false, false, (java.lang.String) null, 40, (kotlin.jvm.internal.DefaultConstructorMarker) null));
                }
                webViewChallenge = new com.paypal.oslo.feature.identity.shared.domain.model.challenge.SmsChallenge(str, challengeType, true, arrayList2, onTextOneTimePasscodeIdentityChallenge.getNonce(), onTextOneTimePasscodeIdentityChallenge.getPartialToken());
            } else if (stepUpIdentityChallenge.getOnEmailOneTimePasscodeIdentityChallenge() != null) {
                com.paypal.oslo.feature.identity.graphql.StepUpIdentityChallengesQuery.OnEmailOneTimePasscodeIdentityChallenge onEmailOneTimePasscodeIdentityChallenge = stepUpIdentityChallenge.getOnEmailOneTimePasscodeIdentityChallenge();
                java.lang.String id2 = onEmailOneTimePasscodeIdentityChallenge.getId();
                java.lang.String str4 = id2 == null ? "" : id2;
                com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeType challengeType2 = com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeType.EMAIL;
                java.util.List<com.paypal.oslo.feature.identity.graphql.StepUpIdentityChallengesQuery.EmailAddress> emailAddresses = onEmailOneTimePasscodeIdentityChallenge.getEmailAddresses();
                java.util.ArrayList arrayList3 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(emailAddresses, 10));
                for (com.paypal.oslo.feature.identity.graphql.StepUpIdentityChallengesQuery.EmailAddress emailAddress : emailAddresses) {
                    java.lang.String challengeId2 = emailAddress.getChallengeId();
                    java.lang.String str5 = challengeId2 == null ? "" : challengeId2;
                    java.lang.String maskedEmail = emailAddress.getMaskedEmail();
                    arrayList3.add(new com.paypal.oslo.feature.identity.shared.domain.model.challenge.EmailAddress(str5, maskedEmail == null ? "" : maskedEmail, emailAddress.getNotified(), false, false, 8, (kotlin.jvm.internal.DefaultConstructorMarker) null));
                }
                webViewChallenge = new com.paypal.oslo.feature.identity.shared.domain.model.challenge.EmailChallenge(str4, challengeType2, true, arrayList3, onEmailOneTimePasscodeIdentityChallenge.getNonce(), onEmailOneTimePasscodeIdentityChallenge.getPartialToken());
            } else if (stepUpIdentityChallenge.getOnWhatsappOneTimePasscodeIdentityChallenge() != null) {
                com.paypal.oslo.feature.identity.graphql.StepUpIdentityChallengesQuery.OnWhatsappOneTimePasscodeIdentityChallenge onWhatsappOneTimePasscodeIdentityChallenge = stepUpIdentityChallenge.getOnWhatsappOneTimePasscodeIdentityChallenge();
                java.lang.String id3 = onWhatsappOneTimePasscodeIdentityChallenge.getId();
                java.lang.String str6 = id3 == null ? "" : id3;
                com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeType challengeType3 = com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeType.WHATSAPP;
                java.util.List<com.paypal.oslo.feature.identity.graphql.StepUpIdentityChallengesQuery.PhoneNumber1> phoneNumbers2 = onWhatsappOneTimePasscodeIdentityChallenge.getPhoneNumbers();
                java.util.ArrayList arrayList4 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(phoneNumbers2, 10));
                for (com.paypal.oslo.feature.identity.graphql.StepUpIdentityChallengesQuery.PhoneNumber1 phoneNumber1 : phoneNumbers2) {
                    java.lang.String challengeId3 = phoneNumber1.getChallengeId();
                    java.lang.String str7 = challengeId3 == null ? "" : challengeId3;
                    java.lang.String maskedNumber2 = phoneNumber1.getMaskedNumber();
                    java.lang.String str8 = maskedNumber2 == null ? "" : maskedNumber2;
                    java.lang.Boolean notified2 = phoneNumber1.getNotified();
                    arrayList4.add(new com.paypal.oslo.feature.identity.shared.domain.model.challenge.PhoneNumber(str7, str8, notified2 != null ? notified2.booleanValue() : false, false, false, (java.lang.String) null, 40, (kotlin.jvm.internal.DefaultConstructorMarker) null));
                }
                webViewChallenge = new com.paypal.oslo.feature.identity.shared.domain.model.challenge.WhatsAppChallenge(str6, challengeType3, true, arrayList4, onWhatsappOneTimePasscodeIdentityChallenge.getNonce(), onWhatsappOneTimePasscodeIdentityChallenge.getPartialToken());
            } else if (stepUpIdentityChallenge.getOnPhoneOneTimePasscodeIdentityChallenge() != null) {
                com.paypal.oslo.feature.identity.graphql.StepUpIdentityChallengesQuery.OnPhoneOneTimePasscodeIdentityChallenge onPhoneOneTimePasscodeIdentityChallenge = stepUpIdentityChallenge.getOnPhoneOneTimePasscodeIdentityChallenge();
                java.lang.String id4 = onPhoneOneTimePasscodeIdentityChallenge.getId();
                java.lang.String str9 = id4 == null ? "" : id4;
                com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeType challengeType4 = com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeType.IVR;
                java.util.List<com.paypal.oslo.feature.identity.graphql.StepUpIdentityChallengesQuery.PhoneNumber2> phoneNumbers3 = onPhoneOneTimePasscodeIdentityChallenge.getPhoneNumbers();
                java.util.ArrayList arrayList5 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(phoneNumbers3, 10));
                for (com.paypal.oslo.feature.identity.graphql.StepUpIdentityChallengesQuery.PhoneNumber2 phoneNumber2 : phoneNumbers3) {
                    java.lang.String challengeId4 = phoneNumber2.getChallengeId();
                    java.lang.String str10 = challengeId4 == null ? "" : challengeId4;
                    java.lang.String maskedNumber3 = phoneNumber2.getMaskedNumber();
                    java.lang.String str11 = maskedNumber3 == null ? "" : maskedNumber3;
                    java.lang.Boolean notified3 = phoneNumber2.getNotified();
                    arrayList5.add(new com.paypal.oslo.feature.identity.shared.domain.model.challenge.PhoneNumber(str10, str11, notified3 != null ? notified3.booleanValue() : false, false, false, (java.lang.String) null, 40, (kotlin.jvm.internal.DefaultConstructorMarker) null));
                }
                webViewChallenge = new com.paypal.oslo.feature.identity.shared.domain.model.challenge.PhoneCallChallenge(str9, challengeType4, true, arrayList5, onPhoneOneTimePasscodeIdentityChallenge.getNonce(), onPhoneOneTimePasscodeIdentityChallenge.getPartialToken());
            } else if (stepUpIdentityChallenge.getOnSecurityQuestionIdentityChallenge() != null) {
                com.paypal.oslo.feature.identity.graphql.StepUpIdentityChallengesQuery.OnSecurityQuestionIdentityChallenge onSecurityQuestionIdentityChallenge = stepUpIdentityChallenge.getOnSecurityQuestionIdentityChallenge();
                java.lang.String id5 = onSecurityQuestionIdentityChallenge.getId();
                java.lang.String str12 = id5 == null ? "" : id5;
                com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeType challengeType5 = com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeType.SECURITY_QUESTION;
                java.util.List<com.paypal.oslo.feature.identity.graphql.StepUpIdentityChallengesQuery.SecurityQuestion> securityQuestions = onSecurityQuestionIdentityChallenge.getSecurityQuestions();
                java.util.ArrayList arrayList6 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(securityQuestions, 10));
                for (com.paypal.oslo.feature.identity.graphql.StepUpIdentityChallengesQuery.SecurityQuestion securityQuestion : securityQuestions) {
                    java.lang.String challengeId5 = securityQuestion.getChallengeId();
                    if (challengeId5 == null) {
                        challengeId5 = "";
                    }
                    java.lang.String question = securityQuestion.getQuestion();
                    if (question == null) {
                        question = "";
                    }
                    arrayList6.add(new com.paypal.oslo.feature.identity.shared.domain.model.challenge.SecurityQuestion(challengeId5, question));
                }
                webViewChallenge = new com.paypal.oslo.feature.identity.shared.domain.model.challenge.SecurityQuestionChallenge(str12, challengeType5, true, arrayList6, onSecurityQuestionIdentityChallenge.getNonce(), onSecurityQuestionIdentityChallenge.getPartialToken());
            } else if (stepUpIdentityChallenge.getOnAuthenticatorAppIdentityChallenge() != null) {
                com.paypal.oslo.feature.identity.graphql.StepUpIdentityChallengesQuery.OnAuthenticatorAppIdentityChallenge onAuthenticatorAppIdentityChallenge = stepUpIdentityChallenge.getOnAuthenticatorAppIdentityChallenge();
                java.lang.String id6 = onAuthenticatorAppIdentityChallenge.getId();
                webViewChallenge = new com.paypal.oslo.feature.identity.shared.domain.model.challenge.AuthenticatorAppChallenge(id6 == null ? "" : id6, com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeType.AUTHENTICATOR_APP, true, onAuthenticatorAppIdentityChallenge.getNonce(), onAuthenticatorAppIdentityChallenge.getPartialToken());
            } else if (stepUpIdentityChallenge.getOnSilentAuthenticationIdentityChallenge() != null) {
                com.paypal.oslo.feature.identity.graphql.StepUpIdentityChallengesQuery.OnSilentAuthenticationIdentityChallenge onSilentAuthenticationIdentityChallenge = stepUpIdentityChallenge.getOnSilentAuthenticationIdentityChallenge();
                java.util.List<com.paypal.oslo.feature.identity.graphql.StepUpIdentityChallengesQuery.PhoneNumber3> phoneNumbers4 = onSilentAuthenticationIdentityChallenge.getPhoneNumbers();
                java.util.ArrayList arrayList7 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(phoneNumbers4, 10));
                for (com.paypal.oslo.feature.identity.graphql.StepUpIdentityChallengesQuery.PhoneNumber3 phoneNumber3 : phoneNumbers4) {
                    java.lang.String challengeId6 = phoneNumber3.getChallengeId();
                    java.lang.String str13 = challengeId6 == null ? "" : challengeId6;
                    java.lang.String maskedNumber4 = phoneNumber3.getMaskedNumber();
                    java.lang.String str14 = maskedNumber4 == null ? "" : maskedNumber4;
                    java.lang.Boolean notified4 = phoneNumber3.getNotified();
                    arrayList7.add(new com.paypal.oslo.feature.identity.shared.domain.model.challenge.PhoneNumber(str13, str14, notified4 != null ? notified4.booleanValue() : false, false, false, phoneNumber3.getEvaluateURL(), 8, (kotlin.jvm.internal.DefaultConstructorMarker) null));
                }
                java.util.ArrayList arrayList8 = arrayList7;
                java.lang.String id7 = onSilentAuthenticationIdentityChallenge.getId();
                java.lang.String str15 = id7 == null ? "" : id7;
                com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeType challengeType6 = com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeType.SILENT_AUTH;
                com.paypal.oslo.feature.identity.shared.domain.model.challenge.PhoneNumber phoneNumber4 = (com.paypal.oslo.feature.identity.shared.domain.model.challenge.PhoneNumber) kotlin.collections.CollectionsKt.firstOrNull((java.util.List) arrayList8);
                java.lang.String evaluateURL = phoneNumber4 != null ? phoneNumber4.getEvaluateURL() : null;
                webViewChallenge = new com.paypal.oslo.feature.identity.shared.domain.model.challenge.SilentAuthChallenge(str15, challengeType6, true, evaluateURL == null ? "" : evaluateURL, arrayList8, onSilentAuthenticationIdentityChallenge.getNonce(), onSilentAuthenticationIdentityChallenge.getPartialToken());
            } else if (stepUpIdentityChallenge.getOnWebViewIdentityChallenge() != null) {
                com.paypal.oslo.feature.identity.graphql.StepUpIdentityChallengesQuery.OnWebViewIdentityChallenge onWebViewIdentityChallenge = stepUpIdentityChallenge.getOnWebViewIdentityChallenge();
                java.lang.String id8 = onWebViewIdentityChallenge.getId();
                java.lang.String str16 = id8 == null ? "" : id8;
                com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeType challengeType7 = com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeType.WEBVIEW;
                java.lang.String obj = onWebViewIdentityChallenge.getWebChallengeUrl().toString();
                java.lang.String returnUri = onWebViewIdentityChallenge.getReturnUri();
                java.lang.String str17 = returnUri == null ? "" : returnUri;
                java.lang.String returnUriParam = onWebViewIdentityChallenge.getReturnUriParam();
                java.lang.String str18 = returnUriParam == null ? "" : returnUriParam;
                java.lang.String stepUpContextId = onWebViewIdentityChallenge.getStepUpContextId();
                webViewChallenge = new com.paypal.oslo.feature.identity.shared.domain.model.challenge.WebViewChallenge(str16, challengeType7, true, obj, str17, str18, stepUpContextId == null ? "" : stepUpContextId, onWebViewIdentityChallenge.getFlowName(), onWebViewIdentityChallenge.getFlowContext());
            } else {
                webViewChallenge = null;
            }
            if (webViewChallenge != null) {
                arrayList.add(webViewChallenge);
            }
        }
        return arrayList;
    }

    @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/identity/stepup/data/mapper/StepupChallengeMapper$Companion;", "", "<init>", "()V", "Lcom/paypal/oslo/core/identity/stepup/StepupChallengeInput;", "input", "Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/ChallengeResult;", "mapToChallengeResult", "(Lcom/paypal/oslo/core/identity/stepup/StepupChallengeInput;)Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/ChallengeResult;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeResult mapToChallengeResult(com.paypal.oslo.core.identity.stepup.StepupChallengeInput input) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
            return new com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeResult(kotlin.collections.CollectionsKt.emptyList(), new com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeContext(com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeFlowType.TRANSACTION, com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengePriorityStrategy.Default, (com.paypal.oslo.feature.identity.login.domain.model.AuthIntent) null, 4, (kotlin.jvm.internal.DefaultConstructorMarker) null), null, new com.paypal.oslo.feature.identity.shared.domain.model.challenge.TransactionChallengeContext(input.getStepUpContextId(), input.getFlowName(), input.getFlowContext(), input.getFlowContextId()));
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
