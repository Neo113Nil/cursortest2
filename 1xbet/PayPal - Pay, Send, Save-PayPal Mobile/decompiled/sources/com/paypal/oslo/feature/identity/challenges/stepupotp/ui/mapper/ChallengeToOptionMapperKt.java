package com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mapper;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a+\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00022\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00000\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/Challenge;", "currentChallenge", "", "latestChallenges", "Lcom/paypal/oslo/feature/identity/challenges/stepupotp/ui/mapper/OptionData;", "mapChallengesToOptions", "(Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/Challenge;Ljava/util/List;)Ljava/util/List;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ChallengeToOptionMapperKt {
    public static final java.util.List<com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mapper.OptionData> mapChallengesToOptions(com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge challenge, java.util.List<? extends com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge> list) {
        java.util.List list2;
        java.lang.Object obj;
        java.lang.Object obj2;
        java.lang.Object obj3;
        java.lang.Object obj4;
        java.lang.Object obj5;
        java.lang.Object obj6;
        java.lang.Object obj7;
        java.lang.Object obj8;
        java.lang.Object obj9;
        java.lang.Object obj10;
        java.lang.Object obj11;
        java.lang.Object obj12;
        java.lang.Object obj13;
        java.lang.Object obj14;
        java.lang.Object obj15;
        java.lang.Object obj16;
        java.lang.Object obj17;
        java.lang.Object obj18;
        java.lang.Object obj19;
        java.lang.Object obj20;
        java.lang.Object obj21;
        java.lang.Object obj22;
        java.lang.Object obj23;
        java.lang.Object obj24;
        int i;
        int i2;
        int i3;
        int i4;
        java.util.List emptyList;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(challenge, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge challenge2 : list) {
            if (challenge2 instanceof com.paypal.oslo.feature.identity.shared.domain.model.challenge.SmsChallenge) {
                com.paypal.oslo.feature.identity.shared.domain.model.challenge.SmsChallenge smsChallenge = (com.paypal.oslo.feature.identity.shared.domain.model.challenge.SmsChallenge) challenge2;
                boolean z = challenge instanceof com.paypal.oslo.feature.identity.shared.domain.model.challenge.SmsChallenge;
                java.util.List createListBuilder = kotlin.collections.CollectionsKt.createListBuilder();
                if (!smsChallenge.getPhoneNumbers().isEmpty()) {
                    com.paypal.oslo.feature.identity.moreoptions.domain.model.OptionType optionType = z ? com.paypal.oslo.feature.identity.moreoptions.domain.model.OptionType.TEXT_NEW_CODE : com.paypal.oslo.feature.identity.moreoptions.domain.model.OptionType.TEXT_A_CODE;
                    if (z) {
                        i = com.paypal.oslo.feature.identity.R.string.feature_identity_more_options_text_new_code;
                    } else {
                        i = com.paypal.oslo.feature.identity.R.string.feature_identity_stepup_challenge_sms_password_context;
                    }
                    createListBuilder.add(new com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mapper.OptionData(optionType, i, z ? com.paypal.pds.core.Icon.Refresh.INSTANCE : com.paypal.pds.core.Icon.MessageText.INSTANCE, true));
                }
                if (z && smsChallenge.getPhoneNumbers().size() > 1) {
                    createListBuilder.add(new com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mapper.OptionData(com.paypal.oslo.feature.identity.moreoptions.domain.model.OptionType.USE_DIFFERENT_NUMBER, com.paypal.oslo.feature.identity.R.string.feature_identity_more_options_use_different_no, com.paypal.pds.core.Icon.MessageText.INSTANCE, true));
                }
                arrayList.addAll(kotlin.collections.CollectionsKt.build(createListBuilder));
            } else if (challenge2 instanceof com.paypal.oslo.feature.identity.shared.domain.model.challenge.WhatsAppChallenge) {
                com.paypal.oslo.feature.identity.shared.domain.model.challenge.WhatsAppChallenge whatsAppChallenge = (com.paypal.oslo.feature.identity.shared.domain.model.challenge.WhatsAppChallenge) challenge2;
                boolean z2 = challenge instanceof com.paypal.oslo.feature.identity.shared.domain.model.challenge.WhatsAppChallenge;
                java.util.List createListBuilder2 = kotlin.collections.CollectionsKt.createListBuilder();
                if (!whatsAppChallenge.getPhoneNumbers().isEmpty()) {
                    com.paypal.oslo.feature.identity.moreoptions.domain.model.OptionType optionType2 = com.paypal.oslo.feature.identity.moreoptions.domain.model.OptionType.SEND_WHATSAPP_CODE;
                    if (z2) {
                        i2 = com.paypal.oslo.feature.identity.R.string.feature_identity_more_options_send_new_code;
                    } else {
                        i2 = com.paypal.oslo.feature.identity.R.string.feature_identity_stepup_challenge_whatsapp;
                    }
                    createListBuilder2.add(new com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mapper.OptionData(optionType2, i2, com.paypal.pds.core.Icon.Refresh.INSTANCE, true));
                }
                if (z2 && whatsAppChallenge.getPhoneNumbers().size() > 1) {
                    createListBuilder2.add(new com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mapper.OptionData(com.paypal.oslo.feature.identity.moreoptions.domain.model.OptionType.USE_DIFFERENT_NUMBER, com.paypal.oslo.feature.identity.R.string.feature_identity_more_options_use_different_no, com.paypal.pds.core.Icon.SocialWhatsapp.INSTANCE, true));
                }
                arrayList.addAll(kotlin.collections.CollectionsKt.build(createListBuilder2));
            } else if (challenge2 instanceof com.paypal.oslo.feature.identity.shared.domain.model.challenge.PhoneCallChallenge) {
                com.paypal.oslo.feature.identity.shared.domain.model.challenge.PhoneCallChallenge phoneCallChallenge = (com.paypal.oslo.feature.identity.shared.domain.model.challenge.PhoneCallChallenge) challenge2;
                boolean z3 = challenge instanceof com.paypal.oslo.feature.identity.shared.domain.model.challenge.PhoneCallChallenge;
                java.util.List createListBuilder3 = kotlin.collections.CollectionsKt.createListBuilder();
                if (!phoneCallChallenge.getPhoneNumbers().isEmpty()) {
                    com.paypal.oslo.feature.identity.moreoptions.domain.model.OptionType optionType3 = com.paypal.oslo.feature.identity.moreoptions.domain.model.OptionType.IVR;
                    if (z3) {
                        i3 = com.paypal.oslo.feature.identity.R.string.feature_identity_more_options_call_new_code;
                    } else {
                        i3 = com.paypal.oslo.feature.identity.R.string.feature_identity_stepup_challenge_ivr_password_context;
                    }
                    createListBuilder3.add(new com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mapper.OptionData(optionType3, i3, z3 ? com.paypal.pds.core.Icon.Refresh.INSTANCE : com.paypal.pds.core.Icon.Phone.INSTANCE, true));
                }
                if (z3 && phoneCallChallenge.getPhoneNumbers().size() > 1) {
                    createListBuilder3.add(new com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mapper.OptionData(com.paypal.oslo.feature.identity.moreoptions.domain.model.OptionType.USE_DIFFERENT_NUMBER, com.paypal.oslo.feature.identity.R.string.feature_identity_more_options_use_different_no, com.paypal.pds.core.Icon.Phone.INSTANCE, true));
                }
                arrayList.addAll(kotlin.collections.CollectionsKt.build(createListBuilder3));
            } else if (challenge2 instanceof com.paypal.oslo.feature.identity.shared.domain.model.challenge.EmailChallenge) {
                com.paypal.oslo.feature.identity.shared.domain.model.challenge.EmailChallenge emailChallenge = (com.paypal.oslo.feature.identity.shared.domain.model.challenge.EmailChallenge) challenge2;
                boolean z4 = challenge instanceof com.paypal.oslo.feature.identity.shared.domain.model.challenge.EmailChallenge;
                java.util.List createListBuilder4 = kotlin.collections.CollectionsKt.createListBuilder();
                if (!emailChallenge.getEmails().isEmpty()) {
                    com.paypal.oslo.feature.identity.moreoptions.domain.model.OptionType optionType4 = com.paypal.oslo.feature.identity.moreoptions.domain.model.OptionType.EMAIL_CODE;
                    if (z4) {
                        i4 = com.paypal.oslo.feature.identity.R.string.feature_identity_more_options_email_new_code;
                    } else {
                        i4 = com.paypal.oslo.feature.identity.R.string.feature_identity_more_options_email_code;
                    }
                    createListBuilder4.add(new com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mapper.OptionData(optionType4, i4, z4 ? com.paypal.pds.core.Icon.Refresh.INSTANCE : com.paypal.pds.core.Icon.Envelope.INSTANCE, true));
                }
                if (z4 && emailChallenge.getEmails().size() > 1) {
                    createListBuilder4.add(new com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mapper.OptionData(com.paypal.oslo.feature.identity.moreoptions.domain.model.OptionType.USE_DIFFERENT_EMAIL, com.paypal.oslo.feature.identity.R.string.feature_identity_more_options_use_different_email, com.paypal.pds.core.Icon.Envelope.INSTANCE, true));
                }
                arrayList.addAll(kotlin.collections.CollectionsKt.build(createListBuilder4));
            } else if (!(challenge2 instanceof com.paypal.oslo.feature.identity.shared.domain.model.challenge.AuthenticatorAppChallenge)) {
                if (challenge2 instanceof com.paypal.oslo.feature.identity.shared.domain.model.challenge.SilentAuthChallenge) {
                    arrayList2.add(new com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mapper.OptionData(com.paypal.oslo.feature.identity.moreoptions.domain.model.OptionType.SILENT_AUTH, com.paypal.oslo.feature.identity.R.string.feature_identity_stepup_challenge_silent_auth, com.paypal.pds.core.Icon.FaceId.INSTANCE, true));
                } else if (challenge2 instanceof com.paypal.oslo.feature.identity.shared.domain.model.challenge.SecurityQuestionChallenge) {
                    if (!(challenge instanceof com.paypal.oslo.feature.identity.shared.domain.model.challenge.SecurityQuestionChallenge)) {
                        arrayList2.add(new com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mapper.OptionData(com.paypal.oslo.feature.identity.moreoptions.domain.model.OptionType.ANSWER_SECURITY_QUESTIONS, com.paypal.oslo.feature.identity.R.string.feature_identity_more_options_answer_security_questions, com.paypal.pds.core.Icon.NoticationList.INSTANCE, true));
                    }
                } else if (challenge2 instanceof com.paypal.oslo.feature.identity.shared.domain.model.challenge.CreditCardChallenge) {
                    com.paypal.oslo.feature.identity.shared.domain.model.challenge.CreditCardChallenge creditCardChallenge = (com.paypal.oslo.feature.identity.shared.domain.model.challenge.CreditCardChallenge) challenge2;
                    java.util.List createListBuilder5 = kotlin.collections.CollectionsKt.createListBuilder();
                    boolean z5 = challenge instanceof com.paypal.oslo.feature.identity.shared.domain.model.challenge.CreditCardChallenge;
                    if (!z5) {
                        createListBuilder5.add(new com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mapper.OptionData(com.paypal.oslo.feature.identity.moreoptions.domain.model.OptionType.VERIFY_CREDIT_CARD, com.paypal.oslo.feature.identity.R.string.feature_identity_stepup_challenge_credit_card, com.paypal.pds.core.Icon.Card.INSTANCE, true));
                    }
                    if (z5 && creditCardChallenge.getCards().size() > 1) {
                        createListBuilder5.add(new com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mapper.OptionData(com.paypal.oslo.feature.identity.moreoptions.domain.model.OptionType.USE_DIFFERENT_CARD, com.paypal.oslo.feature.identity.R.string.feature_identity_credit_card_use_different_card, com.paypal.pds.core.Icon.Card.INSTANCE, true));
                    }
                    arrayList2.addAll(kotlin.collections.CollectionsKt.build(createListBuilder5));
                }
            } else {
                if (!(challenge instanceof com.paypal.oslo.feature.identity.shared.domain.model.challenge.AuthenticatorAppChallenge)) {
                    emptyList = kotlin.collections.CollectionsKt.listOf(new com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mapper.OptionData(com.paypal.oslo.feature.identity.moreoptions.domain.model.OptionType.USE_AUTHENTICATOR_APP, com.paypal.oslo.feature.identity.R.string.feature_identity_more_options_use_authenticator_app, com.paypal.pds.core.Icon.Key.INSTANCE, true));
                } else {
                    emptyList = kotlin.collections.CollectionsKt.emptyList();
                }
                arrayList.addAll(emptyList);
            }
        }
        java.util.HashSet hashSet = new java.util.HashSet();
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        for (java.lang.Object obj25 : arrayList) {
            if (hashSet.add(((com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mapper.OptionData) obj25).getType())) {
                arrayList3.add(obj25);
            }
        }
        java.util.ArrayList arrayList4 = arrayList3;
        java.util.HashSet hashSet2 = new java.util.HashSet();
        java.util.ArrayList arrayList5 = new java.util.ArrayList();
        for (java.lang.Object obj26 : arrayList2) {
            if (hashSet2.add(((com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mapper.OptionData) obj26).getType())) {
                arrayList5.add(obj26);
            }
        }
        java.util.ArrayList arrayList6 = arrayList5;
        boolean z6 = challenge instanceof com.paypal.oslo.feature.identity.shared.domain.model.challenge.SmsChallenge;
        if (!z6) {
            if (!(challenge instanceof com.paypal.oslo.feature.identity.shared.domain.model.challenge.WhatsAppChallenge)) {
                if (!(challenge instanceof com.paypal.oslo.feature.identity.shared.domain.model.challenge.PhoneCallChallenge)) {
                    if (!(challenge instanceof com.paypal.oslo.feature.identity.shared.domain.model.challenge.EmailChallenge)) {
                        if (challenge instanceof com.paypal.oslo.feature.identity.shared.domain.model.challenge.AuthenticatorAppChallenge) {
                            java.util.ArrayList arrayList7 = arrayList4;
                            java.util.Iterator it = arrayList7.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    obj = null;
                                    break;
                                }
                                obj = it.next();
                                if (((com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mapper.OptionData) obj).getType() == com.paypal.oslo.feature.identity.moreoptions.domain.model.OptionType.TEXT_A_CODE) {
                                    break;
                                }
                            }
                            com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mapper.OptionData optionData = (com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mapper.OptionData) obj;
                            java.util.Iterator it2 = arrayList7.iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                    obj2 = null;
                                    break;
                                }
                                obj2 = it2.next();
                                if (((com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mapper.OptionData) obj2).getType() == com.paypal.oslo.feature.identity.moreoptions.domain.model.OptionType.SEND_WHATSAPP_CODE) {
                                    break;
                                }
                            }
                            com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mapper.OptionData optionData2 = (com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mapper.OptionData) obj2;
                            java.util.Iterator it3 = arrayList7.iterator();
                            while (true) {
                                if (!it3.hasNext()) {
                                    obj3 = null;
                                    break;
                                }
                                obj3 = it3.next();
                                if (((com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mapper.OptionData) obj3).getType() == com.paypal.oslo.feature.identity.moreoptions.domain.model.OptionType.IVR) {
                                    break;
                                }
                            }
                            com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mapper.OptionData optionData3 = (com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mapper.OptionData) obj3;
                            java.util.Iterator it4 = arrayList7.iterator();
                            while (true) {
                                if (!it4.hasNext()) {
                                    obj4 = null;
                                    break;
                                }
                                obj4 = it4.next();
                                if (((com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mapper.OptionData) obj4).getType() == com.paypal.oslo.feature.identity.moreoptions.domain.model.OptionType.EMAIL_CODE) {
                                    break;
                                }
                            }
                            com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mapper.OptionData optionData4 = (com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mapper.OptionData) obj4;
                            java.util.ArrayList arrayList8 = new java.util.ArrayList();
                            for (java.lang.Object obj27 : arrayList7) {
                                if (!kotlin.collections.SetsKt.setOf((java.lang.Object[]) new com.paypal.oslo.feature.identity.moreoptions.domain.model.OptionType[]{com.paypal.oslo.feature.identity.moreoptions.domain.model.OptionType.TEXT_A_CODE, com.paypal.oslo.feature.identity.moreoptions.domain.model.OptionType.SEND_WHATSAPP_CODE, com.paypal.oslo.feature.identity.moreoptions.domain.model.OptionType.IVR, com.paypal.oslo.feature.identity.moreoptions.domain.model.OptionType.EMAIL_CODE}).contains(((com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mapper.OptionData) obj27).getType())) {
                                    arrayList8.add(obj27);
                                }
                            }
                            java.util.ArrayList arrayList9 = arrayList8;
                            java.util.List createListBuilder6 = kotlin.collections.CollectionsKt.createListBuilder();
                            if (optionData != null) {
                                createListBuilder6.add(optionData);
                            }
                            if (optionData2 != null) {
                                createListBuilder6.add(optionData2);
                            }
                            if (optionData3 != null) {
                                createListBuilder6.add(optionData3);
                            }
                            if (optionData4 != null) {
                                createListBuilder6.add(optionData4);
                            }
                            createListBuilder6.addAll(arrayList9);
                            arrayList4 = kotlin.collections.CollectionsKt.build(createListBuilder6);
                        }
                        list2 = arrayList4;
                    } else {
                        java.util.ArrayList arrayList10 = arrayList4;
                        java.util.Iterator it5 = arrayList10.iterator();
                        while (true) {
                            if (!it5.hasNext()) {
                                obj5 = null;
                                break;
                            }
                            obj5 = it5.next();
                            if (((com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mapper.OptionData) obj5).getType() == com.paypal.oslo.feature.identity.moreoptions.domain.model.OptionType.EMAIL_CODE) {
                                break;
                            }
                        }
                        com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mapper.OptionData optionData5 = (com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mapper.OptionData) obj5;
                        java.util.Iterator it6 = arrayList10.iterator();
                        while (true) {
                            if (!it6.hasNext()) {
                                obj6 = null;
                                break;
                            }
                            obj6 = it6.next();
                            if (((com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mapper.OptionData) obj6).getType() == com.paypal.oslo.feature.identity.moreoptions.domain.model.OptionType.USE_DIFFERENT_EMAIL) {
                                break;
                            }
                        }
                        com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mapper.OptionData optionData6 = (com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mapper.OptionData) obj6;
                        java.util.Iterator it7 = arrayList10.iterator();
                        while (true) {
                            if (!it7.hasNext()) {
                                obj7 = null;
                                break;
                            }
                            obj7 = it7.next();
                            if (((com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mapper.OptionData) obj7).getType() == com.paypal.oslo.feature.identity.moreoptions.domain.model.OptionType.TEXT_A_CODE) {
                                break;
                            }
                        }
                        com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mapper.OptionData optionData7 = (com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mapper.OptionData) obj7;
                        java.util.Iterator it8 = arrayList10.iterator();
                        while (true) {
                            if (!it8.hasNext()) {
                                obj8 = null;
                                break;
                            }
                            obj8 = it8.next();
                            if (((com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mapper.OptionData) obj8).getType() == com.paypal.oslo.feature.identity.moreoptions.domain.model.OptionType.SEND_WHATSAPP_CODE) {
                                break;
                            }
                        }
                        com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mapper.OptionData optionData8 = (com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mapper.OptionData) obj8;
                        java.util.Iterator it9 = arrayList10.iterator();
                        while (true) {
                            if (!it9.hasNext()) {
                                obj9 = null;
                                break;
                            }
                            obj9 = it9.next();
                            if (((com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mapper.OptionData) obj9).getType() == com.paypal.oslo.feature.identity.moreoptions.domain.model.OptionType.IVR) {
                                break;
                            }
                        }
                        com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mapper.OptionData optionData9 = (com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mapper.OptionData) obj9;
                        java.util.ArrayList arrayList11 = new java.util.ArrayList();
                        for (java.lang.Object obj28 : arrayList10) {
                            if (!kotlin.collections.SetsKt.setOf((java.lang.Object[]) new com.paypal.oslo.feature.identity.moreoptions.domain.model.OptionType[]{com.paypal.oslo.feature.identity.moreoptions.domain.model.OptionType.EMAIL_CODE, com.paypal.oslo.feature.identity.moreoptions.domain.model.OptionType.USE_DIFFERENT_EMAIL, com.paypal.oslo.feature.identity.moreoptions.domain.model.OptionType.TEXT_A_CODE, com.paypal.oslo.feature.identity.moreoptions.domain.model.OptionType.SEND_WHATSAPP_CODE, com.paypal.oslo.feature.identity.moreoptions.domain.model.OptionType.IVR}).contains(((com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mapper.OptionData) obj28).getType())) {
                                arrayList11.add(obj28);
                            }
                        }
                        java.util.ArrayList arrayList12 = arrayList11;
                        java.util.List createListBuilder7 = kotlin.collections.CollectionsKt.createListBuilder();
                        if (optionData5 != null) {
                            createListBuilder7.add(optionData5);
                        }
                        if (optionData6 != null) {
                            createListBuilder7.add(optionData6);
                        }
                        if (optionData7 != null) {
                            createListBuilder7.add(optionData7);
                        }
                        if (optionData8 != null) {
                            createListBuilder7.add(optionData8);
                        }
                        if (optionData9 != null) {
                            createListBuilder7.add(optionData9);
                        }
                        createListBuilder7.addAll(arrayList12);
                        list2 = kotlin.collections.CollectionsKt.build(createListBuilder7);
                    }
                } else {
                    java.util.ArrayList arrayList13 = arrayList4;
                    java.util.Iterator it10 = arrayList13.iterator();
                    while (true) {
                        if (!it10.hasNext()) {
                            obj10 = null;
                            break;
                        }
                        obj10 = it10.next();
                        if (((com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mapper.OptionData) obj10).getType() == com.paypal.oslo.feature.identity.moreoptions.domain.model.OptionType.IVR) {
                            break;
                        }
                    }
                    com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mapper.OptionData optionData10 = (com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mapper.OptionData) obj10;
                    java.util.Iterator it11 = arrayList13.iterator();
                    while (true) {
                        if (!it11.hasNext()) {
                            obj11 = null;
                            break;
                        }
                        obj11 = it11.next();
                        if (((com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mapper.OptionData) obj11).getType() == com.paypal.oslo.feature.identity.moreoptions.domain.model.OptionType.USE_DIFFERENT_NUMBER) {
                            break;
                        }
                    }
                    com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mapper.OptionData optionData11 = (com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mapper.OptionData) obj11;
                    java.util.Iterator it12 = arrayList13.iterator();
                    while (true) {
                        if (!it12.hasNext()) {
                            obj12 = null;
                            break;
                        }
                        obj12 = it12.next();
                        if (((com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mapper.OptionData) obj12).getType() == com.paypal.oslo.feature.identity.moreoptions.domain.model.OptionType.TEXT_A_CODE) {
                            break;
                        }
                    }
                    com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mapper.OptionData optionData12 = (com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mapper.OptionData) obj12;
                    java.util.Iterator it13 = arrayList13.iterator();
                    while (true) {
                        if (!it13.hasNext()) {
                            obj13 = null;
                            break;
                        }
                        obj13 = it13.next();
                        if (((com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mapper.OptionData) obj13).getType() == com.paypal.oslo.feature.identity.moreoptions.domain.model.OptionType.EMAIL_CODE) {
                            break;
                        }
                    }
                    com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mapper.OptionData optionData13 = (com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mapper.OptionData) obj13;
                    java.util.Iterator it14 = arrayList13.iterator();
                    while (true) {
                        if (!it14.hasNext()) {
                            obj14 = null;
                            break;
                        }
                        obj14 = it14.next();
                        if (((com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mapper.OptionData) obj14).getType() == com.paypal.oslo.feature.identity.moreoptions.domain.model.OptionType.SEND_WHATSAPP_CODE) {
                            break;
                        }
                    }
                    com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mapper.OptionData optionData14 = (com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mapper.OptionData) obj14;
                    java.util.ArrayList arrayList14 = new java.util.ArrayList();
                    for (java.lang.Object obj29 : arrayList13) {
                        if (!kotlin.collections.SetsKt.setOf((java.lang.Object[]) new com.paypal.oslo.feature.identity.moreoptions.domain.model.OptionType[]{com.paypal.oslo.feature.identity.moreoptions.domain.model.OptionType.IVR, com.paypal.oslo.feature.identity.moreoptions.domain.model.OptionType.USE_DIFFERENT_NUMBER, com.paypal.oslo.feature.identity.moreoptions.domain.model.OptionType.TEXT_A_CODE, com.paypal.oslo.feature.identity.moreoptions.domain.model.OptionType.EMAIL_CODE, com.paypal.oslo.feature.identity.moreoptions.domain.model.OptionType.SEND_WHATSAPP_CODE}).contains(((com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mapper.OptionData) obj29).getType())) {
                            arrayList14.add(obj29);
                        }
                    }
                    java.util.ArrayList arrayList15 = arrayList14;
                    java.util.List createListBuilder8 = kotlin.collections.CollectionsKt.createListBuilder();
                    if (optionData10 != null) {
                        createListBuilder8.add(optionData10);
                    }
                    if (optionData11 != null) {
                        createListBuilder8.add(optionData11);
                    }
                    if (optionData12 != null) {
                        createListBuilder8.add(optionData12);
                    }
                    if (optionData13 != null) {
                        createListBuilder8.add(optionData13);
                    }
                    if (optionData14 != null) {
                        createListBuilder8.add(optionData14);
                    }
                    createListBuilder8.addAll(arrayList15);
                    list2 = kotlin.collections.CollectionsKt.build(createListBuilder8);
                }
            } else {
                java.util.ArrayList arrayList16 = arrayList4;
                java.util.Iterator it15 = arrayList16.iterator();
                while (true) {
                    if (!it15.hasNext()) {
                        obj15 = null;
                        break;
                    }
                    obj15 = it15.next();
                    if (((com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mapper.OptionData) obj15).getType() == com.paypal.oslo.feature.identity.moreoptions.domain.model.OptionType.SEND_WHATSAPP_CODE) {
                        break;
                    }
                }
                com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mapper.OptionData optionData15 = (com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mapper.OptionData) obj15;
                java.util.Iterator it16 = arrayList16.iterator();
                while (true) {
                    if (!it16.hasNext()) {
                        obj16 = null;
                        break;
                    }
                    obj16 = it16.next();
                    if (((com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mapper.OptionData) obj16).getType() == com.paypal.oslo.feature.identity.moreoptions.domain.model.OptionType.USE_DIFFERENT_NUMBER) {
                        break;
                    }
                }
                com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mapper.OptionData optionData16 = (com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mapper.OptionData) obj16;
                java.util.Iterator it17 = arrayList16.iterator();
                while (true) {
                    if (!it17.hasNext()) {
                        obj17 = null;
                        break;
                    }
                    obj17 = it17.next();
                    if (((com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mapper.OptionData) obj17).getType() == com.paypal.oslo.feature.identity.moreoptions.domain.model.OptionType.TEXT_A_CODE) {
                        break;
                    }
                }
                com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mapper.OptionData optionData17 = (com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mapper.OptionData) obj17;
                java.util.Iterator it18 = arrayList16.iterator();
                while (true) {
                    if (!it18.hasNext()) {
                        obj18 = null;
                        break;
                    }
                    obj18 = it18.next();
                    if (((com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mapper.OptionData) obj18).getType() == com.paypal.oslo.feature.identity.moreoptions.domain.model.OptionType.EMAIL_CODE) {
                        break;
                    }
                }
                com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mapper.OptionData optionData18 = (com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mapper.OptionData) obj18;
                java.util.Iterator it19 = arrayList16.iterator();
                while (true) {
                    if (!it19.hasNext()) {
                        obj19 = null;
                        break;
                    }
                    obj19 = it19.next();
                    if (((com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mapper.OptionData) obj19).getType() == com.paypal.oslo.feature.identity.moreoptions.domain.model.OptionType.IVR) {
                        break;
                    }
                }
                com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mapper.OptionData optionData19 = (com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mapper.OptionData) obj19;
                java.util.ArrayList arrayList17 = new java.util.ArrayList();
                for (java.lang.Object obj30 : arrayList16) {
                    if (!kotlin.collections.SetsKt.setOf((java.lang.Object[]) new com.paypal.oslo.feature.identity.moreoptions.domain.model.OptionType[]{com.paypal.oslo.feature.identity.moreoptions.domain.model.OptionType.SEND_WHATSAPP_CODE, com.paypal.oslo.feature.identity.moreoptions.domain.model.OptionType.USE_DIFFERENT_NUMBER, com.paypal.oslo.feature.identity.moreoptions.domain.model.OptionType.TEXT_A_CODE, com.paypal.oslo.feature.identity.moreoptions.domain.model.OptionType.EMAIL_CODE, com.paypal.oslo.feature.identity.moreoptions.domain.model.OptionType.IVR}).contains(((com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mapper.OptionData) obj30).getType())) {
                        arrayList17.add(obj30);
                    }
                }
                java.util.ArrayList arrayList18 = arrayList17;
                java.util.List createListBuilder9 = kotlin.collections.CollectionsKt.createListBuilder();
                if (optionData15 != null) {
                    createListBuilder9.add(optionData15);
                }
                if (optionData16 != null) {
                    createListBuilder9.add(optionData16);
                }
                if (optionData17 != null) {
                    createListBuilder9.add(optionData17);
                }
                if (optionData18 != null) {
                    createListBuilder9.add(optionData18);
                }
                if (optionData19 != null) {
                    createListBuilder9.add(optionData19);
                }
                createListBuilder9.addAll(arrayList18);
                list2 = kotlin.collections.CollectionsKt.build(createListBuilder9);
            }
        } else {
            java.util.ArrayList arrayList19 = arrayList4;
            java.util.Iterator it20 = arrayList19.iterator();
            while (true) {
                if (!it20.hasNext()) {
                    obj20 = null;
                    break;
                }
                obj20 = it20.next();
                if (((com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mapper.OptionData) obj20).getType() == com.paypal.oslo.feature.identity.moreoptions.domain.model.OptionType.TEXT_NEW_CODE) {
                    break;
                }
            }
            com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mapper.OptionData optionData20 = (com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mapper.OptionData) obj20;
            java.util.Iterator it21 = arrayList19.iterator();
            while (true) {
                if (!it21.hasNext()) {
                    obj21 = null;
                    break;
                }
                obj21 = it21.next();
                if (((com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mapper.OptionData) obj21).getType() == com.paypal.oslo.feature.identity.moreoptions.domain.model.OptionType.USE_DIFFERENT_NUMBER) {
                    break;
                }
            }
            com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mapper.OptionData optionData21 = (com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mapper.OptionData) obj21;
            java.util.Iterator it22 = arrayList19.iterator();
            while (true) {
                if (!it22.hasNext()) {
                    obj22 = null;
                    break;
                }
                obj22 = it22.next();
                if (((com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mapper.OptionData) obj22).getType() == com.paypal.oslo.feature.identity.moreoptions.domain.model.OptionType.EMAIL_CODE) {
                    break;
                }
            }
            com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mapper.OptionData optionData22 = (com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mapper.OptionData) obj22;
            java.util.Iterator it23 = arrayList19.iterator();
            while (true) {
                if (!it23.hasNext()) {
                    obj23 = null;
                    break;
                }
                obj23 = it23.next();
                if (((com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mapper.OptionData) obj23).getType() == com.paypal.oslo.feature.identity.moreoptions.domain.model.OptionType.SEND_WHATSAPP_CODE) {
                    break;
                }
            }
            com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mapper.OptionData optionData23 = (com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mapper.OptionData) obj23;
            java.util.Iterator it24 = arrayList19.iterator();
            while (true) {
                if (!it24.hasNext()) {
                    obj24 = null;
                    break;
                }
                obj24 = it24.next();
                if (((com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mapper.OptionData) obj24).getType() == com.paypal.oslo.feature.identity.moreoptions.domain.model.OptionType.IVR) {
                    break;
                }
            }
            com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mapper.OptionData optionData24 = (com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mapper.OptionData) obj24;
            java.util.ArrayList arrayList20 = new java.util.ArrayList();
            for (java.lang.Object obj31 : arrayList19) {
                if (!kotlin.collections.SetsKt.setOf((java.lang.Object[]) new com.paypal.oslo.feature.identity.moreoptions.domain.model.OptionType[]{com.paypal.oslo.feature.identity.moreoptions.domain.model.OptionType.TEXT_NEW_CODE, com.paypal.oslo.feature.identity.moreoptions.domain.model.OptionType.USE_DIFFERENT_NUMBER, com.paypal.oslo.feature.identity.moreoptions.domain.model.OptionType.EMAIL_CODE, com.paypal.oslo.feature.identity.moreoptions.domain.model.OptionType.SEND_WHATSAPP_CODE, com.paypal.oslo.feature.identity.moreoptions.domain.model.OptionType.IVR}).contains(((com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mapper.OptionData) obj31).getType())) {
                    arrayList20.add(obj31);
                }
            }
            java.util.ArrayList arrayList21 = arrayList20;
            java.util.List createListBuilder10 = kotlin.collections.CollectionsKt.createListBuilder();
            if (optionData20 != null) {
                createListBuilder10.add(optionData20);
            }
            if (optionData21 != null) {
                createListBuilder10.add(optionData21);
            }
            if (optionData22 != null) {
                createListBuilder10.add(optionData22);
            }
            if (optionData23 != null) {
                createListBuilder10.add(optionData23);
            }
            if (optionData24 != null) {
                createListBuilder10.add(optionData24);
            }
            createListBuilder10.addAll(arrayList21);
            list2 = kotlin.collections.CollectionsKt.build(createListBuilder10);
        }
        java.util.List<com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mapper.OptionData> plus = kotlin.collections.CollectionsKt.plus((java.util.Collection) list2, (java.lang.Iterable) arrayList6);
        if (!plus.isEmpty()) {
            return plus;
        }
        if (z6) {
            com.paypal.oslo.feature.identity.shared.domain.model.challenge.SmsChallenge smsChallenge2 = (com.paypal.oslo.feature.identity.shared.domain.model.challenge.SmsChallenge) challenge;
            java.util.List createListBuilder11 = kotlin.collections.CollectionsKt.createListBuilder();
            if (!smsChallenge2.getPhoneNumbers().isEmpty()) {
                createListBuilder11.add(new com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mapper.OptionData(com.paypal.oslo.feature.identity.moreoptions.domain.model.OptionType.TEXT_NEW_CODE, com.paypal.oslo.feature.identity.R.string.feature_identity_more_options_text_new_code, com.paypal.pds.core.Icon.Refresh.INSTANCE, true));
            }
            if (smsChallenge2.getPhoneNumbers().size() > 1) {
                createListBuilder11.add(new com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mapper.OptionData(com.paypal.oslo.feature.identity.moreoptions.domain.model.OptionType.USE_DIFFERENT_NUMBER, com.paypal.oslo.feature.identity.R.string.feature_identity_more_options_use_different_no, com.paypal.pds.core.Icon.MessageText.INSTANCE, true));
            }
            return kotlin.collections.CollectionsKt.build(createListBuilder11);
        }
        if (!(challenge instanceof com.paypal.oslo.feature.identity.shared.domain.model.challenge.WhatsAppChallenge)) {
            if (!(challenge instanceof com.paypal.oslo.feature.identity.shared.domain.model.challenge.PhoneCallChallenge)) {
                if (!(challenge instanceof com.paypal.oslo.feature.identity.shared.domain.model.challenge.EmailChallenge)) {
                    if (!(challenge instanceof com.paypal.oslo.feature.identity.shared.domain.model.challenge.SilentAuthChallenge)) {
                        if (!(challenge instanceof com.paypal.oslo.feature.identity.shared.domain.model.challenge.SecurityQuestionChallenge)) {
                            if (!(challenge instanceof com.paypal.oslo.feature.identity.shared.domain.model.challenge.CreditCardChallenge)) {
                                return kotlin.collections.CollectionsKt.emptyList();
                            }
                            java.util.List createListBuilder12 = kotlin.collections.CollectionsKt.createListBuilder();
                            createListBuilder12.add(new com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mapper.OptionData(com.paypal.oslo.feature.identity.moreoptions.domain.model.OptionType.VERIFY_CREDIT_CARD, com.paypal.oslo.feature.identity.R.string.feature_identity_stepup_challenge_credit_card, com.paypal.pds.core.Icon.Card.INSTANCE, true));
                            if (((com.paypal.oslo.feature.identity.shared.domain.model.challenge.CreditCardChallenge) challenge).getCards().size() > 1) {
                                createListBuilder12.add(new com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mapper.OptionData(com.paypal.oslo.feature.identity.moreoptions.domain.model.OptionType.USE_DIFFERENT_CARD, com.paypal.oslo.feature.identity.R.string.feature_identity_credit_card_use_different_card, com.paypal.pds.core.Icon.Card.INSTANCE, true));
                            }
                            return kotlin.collections.CollectionsKt.build(createListBuilder12);
                        }
                        return kotlin.collections.CollectionsKt.listOf(new com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mapper.OptionData(com.paypal.oslo.feature.identity.moreoptions.domain.model.OptionType.ANSWER_SECURITY_QUESTIONS, com.paypal.oslo.feature.identity.R.string.feature_identity_more_options_answer_security_questions, com.paypal.pds.core.Icon.NoticationList.INSTANCE, true));
                    }
                    return kotlin.collections.CollectionsKt.listOf(new com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mapper.OptionData(com.paypal.oslo.feature.identity.moreoptions.domain.model.OptionType.SILENT_AUTH, com.paypal.oslo.feature.identity.R.string.feature_identity_stepup_challenge_silent_auth, com.paypal.pds.core.Icon.FaceId.INSTANCE, true));
                }
                com.paypal.oslo.feature.identity.shared.domain.model.challenge.EmailChallenge emailChallenge2 = (com.paypal.oslo.feature.identity.shared.domain.model.challenge.EmailChallenge) challenge;
                java.util.List createListBuilder13 = kotlin.collections.CollectionsKt.createListBuilder();
                if (!emailChallenge2.getEmails().isEmpty()) {
                    createListBuilder13.add(new com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mapper.OptionData(com.paypal.oslo.feature.identity.moreoptions.domain.model.OptionType.EMAIL_CODE, com.paypal.oslo.feature.identity.R.string.feature_identity_more_options_email_new_code, com.paypal.pds.core.Icon.Refresh.INSTANCE, true));
                }
                if (emailChallenge2.getEmails().size() > 1) {
                    createListBuilder13.add(new com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mapper.OptionData(com.paypal.oslo.feature.identity.moreoptions.domain.model.OptionType.USE_DIFFERENT_EMAIL, com.paypal.oslo.feature.identity.R.string.feature_identity_more_options_use_different_email, com.paypal.pds.core.Icon.Envelope.INSTANCE, true));
                }
                return kotlin.collections.CollectionsKt.build(createListBuilder13);
            }
            com.paypal.oslo.feature.identity.shared.domain.model.challenge.PhoneCallChallenge phoneCallChallenge2 = (com.paypal.oslo.feature.identity.shared.domain.model.challenge.PhoneCallChallenge) challenge;
            java.util.List createListBuilder14 = kotlin.collections.CollectionsKt.createListBuilder();
            if (!phoneCallChallenge2.getPhoneNumbers().isEmpty()) {
                createListBuilder14.add(new com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mapper.OptionData(com.paypal.oslo.feature.identity.moreoptions.domain.model.OptionType.IVR, com.paypal.oslo.feature.identity.R.string.feature_identity_stepup_challenge_ivr_password_context, com.paypal.pds.core.Icon.Refresh.INSTANCE, true));
            }
            if (phoneCallChallenge2.getPhoneNumbers().size() > 1) {
                createListBuilder14.add(new com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mapper.OptionData(com.paypal.oslo.feature.identity.moreoptions.domain.model.OptionType.USE_DIFFERENT_NUMBER, com.paypal.oslo.feature.identity.R.string.feature_identity_more_options_use_different_no, com.paypal.pds.core.Icon.Phone.INSTANCE, true));
            }
            return kotlin.collections.CollectionsKt.build(createListBuilder14);
        }
        com.paypal.oslo.feature.identity.shared.domain.model.challenge.WhatsAppChallenge whatsAppChallenge2 = (com.paypal.oslo.feature.identity.shared.domain.model.challenge.WhatsAppChallenge) challenge;
        java.util.List createListBuilder15 = kotlin.collections.CollectionsKt.createListBuilder();
        if (!whatsAppChallenge2.getPhoneNumbers().isEmpty()) {
            createListBuilder15.add(new com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mapper.OptionData(com.paypal.oslo.feature.identity.moreoptions.domain.model.OptionType.SEND_WHATSAPP_CODE, com.paypal.oslo.feature.identity.R.string.feature_identity_stepup_challenge_whatsapp, com.paypal.pds.core.Icon.Refresh.INSTANCE, true));
        }
        if (whatsAppChallenge2.getPhoneNumbers().size() > 1) {
            createListBuilder15.add(new com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mapper.OptionData(com.paypal.oslo.feature.identity.moreoptions.domain.model.OptionType.USE_DIFFERENT_NUMBER, com.paypal.oslo.feature.identity.R.string.feature_identity_more_options_use_different_no, com.paypal.pds.core.Icon.SocialWhatsapp.INSTANCE, true));
        }
        return kotlin.collections.CollectionsKt.build(createListBuilder15);
    }
}
