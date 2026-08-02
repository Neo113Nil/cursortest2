package com.paypal.oslo.feature.identity.challenges.stepupotp.ui;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\r\u0010\u000eJ#\u0010\u0011\u001a\u00020\u0006\"\b\b\u0000\u0010\u000f*\u00020\u0001*\b\u0012\u0004\u0012\u00028\u00000\u0010H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J#\u0010\u0014\u001a\u00020\u0013\"\b\b\u0000\u0010\u000f*\u00020\u0001*\b\u0012\u0004\u0012\u00028\u00000\u0010H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J%\u0010\u0016\u001a\u0004\u0018\u00010\u0013\"\b\b\u0000\u0010\u000f*\u00020\u0001*\b\u0012\u0004\u0012\u00028\u00000\u0010H\u0002¢\u0006\u0004\b\u0016\u0010\u0015J\u0015\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0019\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0019\u0010\u0018J\u0017\u0010\u001a\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u001a\u0010\u0018J\u0017\u0010\u001b\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u001b\u0010\u0018"}, d2 = {"Lcom/paypal/oslo/feature/identity/challenges/stepupotp/ui/StepupOtpContentProvider;", "", "<init>", "()V", "Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/Challenge;", com.google.android.gms.fido.u2f.api.common.ClientData.KEY_CHALLENGE, "", "isFromStepup", "isSwitchingChallenge", "Lcom/paypal/oslo/feature/identity/challenges/stepupotp/ui/OtpContent;", "getContent", "(Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/Challenge;ZZ)Lcom/paypal/oslo/feature/identity/challenges/stepupotp/ui/OtpContent;", "p0", "getHighResolutionOutputSizeshNQ4ISI", "(Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/Challenge;)Z", "T", "", "Camera2StreamConfigurationMap", "(Ljava/util/List;)Z", "", "getHighSpeedVideoFpsRanges", "(Ljava/util/List;)Ljava/lang/String;", "getHighSpeedVideoFpsRangesFor", "getDeliveryTarget", "(Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/Challenge;)Ljava/lang/String;", "getChallengeId", "getNonce", "getPartialToken"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class StepupOtpContentProvider {
    public static final int $stable = 0;

    @javax.inject.Inject
    public StepupOtpContentProvider() {
    }

    public static /* synthetic */ com.paypal.oslo.feature.identity.challenges.stepupotp.ui.OtpContent getContent$default(com.paypal.oslo.feature.identity.challenges.stepupotp.ui.StepupOtpContentProvider stepupOtpContentProvider, com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge challenge, boolean z, boolean z2, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        if ((i & 4) != 0) {
            z2 = false;
        }
        return stepupOtpContentProvider.getContent(challenge, z, z2);
    }

    public final com.paypal.oslo.feature.identity.challenges.stepupotp.ui.OtpContent getContent(com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge challenge, boolean isFromStepup, boolean isSwitchingChallenge) {
        java.lang.Object obj;
        java.lang.String maskedNumber;
        java.lang.String maskedNumber2;
        java.lang.Object obj2;
        java.lang.String maskedNumber3;
        java.lang.Object obj3;
        java.lang.String maskedEmail;
        java.lang.Object obj4;
        java.lang.String maskedNumber4;
        java.lang.String str = "";
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(challenge, "");
        if (challenge instanceof com.paypal.oslo.feature.identity.shared.domain.model.challenge.SmsChallenge) {
            boolean highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(challenge);
            int i = com.paypal.oslo.feature.identity.R.string.feature_identity_sms_verification_title_stepup;
            int i2 = com.paypal.oslo.feature.identity.R.string.feature_identity_sms_verification_title;
            int i3 = com.paypal.oslo.feature.identity.R.string.feature_identity_sms_verification_title_next;
            if (!isFromStepup) {
                i = (highResolutionOutputSizeshNQ4ISI || !isSwitchingChallenge) ? i2 : i3;
            }
            com.paypal.oslo.feature.identity.shared.domain.model.challenge.SmsChallenge smsChallenge = (com.paypal.oslo.feature.identity.shared.domain.model.challenge.SmsChallenge) challenge;
            java.util.Iterator<T> it = smsChallenge.getPhoneNumbers().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj4 = null;
                    break;
                }
                obj4 = it.next();
                if (((com.paypal.oslo.feature.identity.shared.domain.model.challenge.PhoneNumber) obj4).isSelected()) {
                    break;
                }
            }
            com.paypal.oslo.feature.identity.shared.domain.model.challenge.PhoneNumber phoneNumber = (com.paypal.oslo.feature.identity.shared.domain.model.challenge.PhoneNumber) obj4;
            if (phoneNumber == null || (maskedNumber4 = phoneNumber.getMaskedNumber()) == null) {
                com.paypal.oslo.feature.identity.shared.domain.model.challenge.PhoneNumber phoneNumber2 = (com.paypal.oslo.feature.identity.shared.domain.model.challenge.PhoneNumber) kotlin.collections.CollectionsKt.firstOrNull((java.util.List) smsChallenge.getPhoneNumbers());
                maskedNumber = phoneNumber2 != null ? phoneNumber2.getMaskedNumber() : null;
                if (maskedNumber != null) {
                    str = maskedNumber;
                }
            } else {
                str = maskedNumber4;
            }
            return new com.paypal.oslo.feature.identity.challenges.stepupotp.ui.OtpContent(i, str, com.paypal.oslo.feature.identity.R.string.feature_identity_sms_code_sent_to);
        }
        if (challenge instanceof com.paypal.oslo.feature.identity.shared.domain.model.challenge.EmailChallenge) {
            boolean highResolutionOutputSizeshNQ4ISI2 = getHighResolutionOutputSizeshNQ4ISI(challenge);
            int i4 = com.paypal.oslo.feature.identity.R.string.feature_identity_email_otp_verification_title_stepup;
            int i5 = com.paypal.oslo.feature.identity.R.string.feature_identity_email_otp_verification_title;
            int i6 = com.paypal.oslo.feature.identity.R.string.feature_identity_email_otp_verification_title_next;
            if (!isFromStepup) {
                i4 = (highResolutionOutputSizeshNQ4ISI2 || !isSwitchingChallenge) ? i5 : i6;
            }
            com.paypal.oslo.feature.identity.shared.domain.model.challenge.EmailChallenge emailChallenge = (com.paypal.oslo.feature.identity.shared.domain.model.challenge.EmailChallenge) challenge;
            java.util.Iterator<T> it2 = emailChallenge.getEmails().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    obj3 = null;
                    break;
                }
                obj3 = it2.next();
                if (((com.paypal.oslo.feature.identity.shared.domain.model.challenge.EmailAddress) obj3).isSelected()) {
                    break;
                }
            }
            com.paypal.oslo.feature.identity.shared.domain.model.challenge.EmailAddress emailAddress = (com.paypal.oslo.feature.identity.shared.domain.model.challenge.EmailAddress) obj3;
            if (emailAddress == null || (maskedEmail = emailAddress.getMaskedEmail()) == null) {
                com.paypal.oslo.feature.identity.shared.domain.model.challenge.EmailAddress emailAddress2 = (com.paypal.oslo.feature.identity.shared.domain.model.challenge.EmailAddress) kotlin.collections.CollectionsKt.firstOrNull((java.util.List) emailChallenge.getEmails());
                maskedNumber = emailAddress2 != null ? emailAddress2.getMaskedEmail() : null;
                if (maskedNumber != null) {
                    str = maskedNumber;
                }
            } else {
                str = maskedEmail;
            }
            return new com.paypal.oslo.feature.identity.challenges.stepupotp.ui.OtpContent(i4, str, com.paypal.oslo.feature.identity.R.string.feature_identity_email_otp_code_sent_to);
        }
        if (challenge instanceof com.paypal.oslo.feature.identity.shared.domain.model.challenge.WhatsAppChallenge) {
            boolean highResolutionOutputSizeshNQ4ISI3 = getHighResolutionOutputSizeshNQ4ISI(challenge);
            int i7 = com.paypal.oslo.feature.identity.R.string.feature_identity_whatsapp_otp_verification_title_stepup;
            int i8 = com.paypal.oslo.feature.identity.R.string.feature_identity_whatsapp_otp_verification_title;
            int i9 = com.paypal.oslo.feature.identity.R.string.feature_identity_whatsapp_otp_verification_title_next;
            if (!isFromStepup) {
                i7 = (highResolutionOutputSizeshNQ4ISI3 || !isSwitchingChallenge) ? i8 : i9;
            }
            com.paypal.oslo.feature.identity.shared.domain.model.challenge.WhatsAppChallenge whatsAppChallenge = (com.paypal.oslo.feature.identity.shared.domain.model.challenge.WhatsAppChallenge) challenge;
            java.util.Iterator<T> it3 = whatsAppChallenge.getPhoneNumbers().iterator();
            while (true) {
                if (!it3.hasNext()) {
                    obj2 = null;
                    break;
                }
                obj2 = it3.next();
                if (((com.paypal.oslo.feature.identity.shared.domain.model.challenge.PhoneNumber) obj2).isSelected()) {
                    break;
                }
            }
            com.paypal.oslo.feature.identity.shared.domain.model.challenge.PhoneNumber phoneNumber3 = (com.paypal.oslo.feature.identity.shared.domain.model.challenge.PhoneNumber) obj2;
            if (phoneNumber3 == null || (maskedNumber3 = phoneNumber3.getMaskedNumber()) == null) {
                com.paypal.oslo.feature.identity.shared.domain.model.challenge.PhoneNumber phoneNumber4 = (com.paypal.oslo.feature.identity.shared.domain.model.challenge.PhoneNumber) kotlin.collections.CollectionsKt.firstOrNull((java.util.List) whatsAppChallenge.getPhoneNumbers());
                maskedNumber = phoneNumber4 != null ? phoneNumber4.getMaskedNumber() : null;
                if (maskedNumber != null) {
                    str = maskedNumber;
                }
            } else {
                str = maskedNumber3;
            }
            return new com.paypal.oslo.feature.identity.challenges.stepupotp.ui.OtpContent(i7, str, com.paypal.oslo.feature.identity.R.string.feature_identity_whatsapp_otp_code_sent_to);
        }
        if (challenge instanceof com.paypal.oslo.feature.identity.shared.domain.model.challenge.PhoneCallChallenge) {
            boolean highResolutionOutputSizeshNQ4ISI4 = getHighResolutionOutputSizeshNQ4ISI(challenge);
            int i10 = com.paypal.oslo.feature.identity.R.string.feature_identity_ivr_otp_verification_title_stepup;
            int i11 = com.paypal.oslo.feature.identity.R.string.feature_identity_ivr_otp_verification_title;
            int i12 = com.paypal.oslo.feature.identity.R.string.feature_identity_ivr_otp_verification_title_next;
            if (!isFromStepup) {
                i10 = (highResolutionOutputSizeshNQ4ISI4 || !isSwitchingChallenge) ? i11 : i12;
            }
            com.paypal.oslo.feature.identity.shared.domain.model.challenge.PhoneCallChallenge phoneCallChallenge = (com.paypal.oslo.feature.identity.shared.domain.model.challenge.PhoneCallChallenge) challenge;
            java.util.Iterator<T> it4 = phoneCallChallenge.getPhoneNumbers().iterator();
            while (true) {
                if (!it4.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it4.next();
                if (((com.paypal.oslo.feature.identity.shared.domain.model.challenge.PhoneNumber) obj).isSelected()) {
                    break;
                }
            }
            com.paypal.oslo.feature.identity.shared.domain.model.challenge.PhoneNumber phoneNumber5 = (com.paypal.oslo.feature.identity.shared.domain.model.challenge.PhoneNumber) obj;
            if (phoneNumber5 == null || (maskedNumber2 = phoneNumber5.getMaskedNumber()) == null) {
                com.paypal.oslo.feature.identity.shared.domain.model.challenge.PhoneNumber phoneNumber6 = (com.paypal.oslo.feature.identity.shared.domain.model.challenge.PhoneNumber) kotlin.collections.CollectionsKt.firstOrNull((java.util.List) phoneCallChallenge.getPhoneNumbers());
                maskedNumber = phoneNumber6 != null ? phoneNumber6.getMaskedNumber() : null;
                if (maskedNumber != null) {
                    str = maskedNumber;
                }
            } else {
                str = maskedNumber2;
            }
            return new com.paypal.oslo.feature.identity.challenges.stepupotp.ui.OtpContent(i10, str, com.paypal.oslo.feature.identity.R.string.feature_identity_ivr_otp_code_sent_to);
        }
        if (challenge instanceof com.paypal.oslo.feature.identity.shared.domain.model.challenge.AuthenticatorAppChallenge) {
            boolean highResolutionOutputSizeshNQ4ISI5 = getHighResolutionOutputSizeshNQ4ISI(challenge);
            int i13 = com.paypal.oslo.feature.identity.R.string.feature_identity_authenticator_otp_verification_title_stepup;
            int i14 = com.paypal.oslo.feature.identity.R.string.feature_identity_authenticator_otp_verification_title;
            int i15 = com.paypal.oslo.feature.identity.R.string.feature_identity_authenticator_otp_verification_title_next;
            if (!isFromStepup) {
                i13 = (highResolutionOutputSizeshNQ4ISI5 || !isSwitchingChallenge) ? i14 : i15;
            }
            return new com.paypal.oslo.feature.identity.challenges.stepupotp.ui.OtpContent(i13, "", com.paypal.oslo.feature.identity.R.string.feature_identity_authenticator_otp_code_ready);
        }
        throw new java.lang.IllegalArgumentException("Unsupported challenge type: ".concat(java.lang.String.valueOf(challenge.getType())));
    }

    private static boolean getHighResolutionOutputSizeshNQ4ISI(com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge p0) {
        return p0 instanceof com.paypal.oslo.feature.identity.shared.domain.model.challenge.SmsChallenge ? Camera2StreamConfigurationMap(((com.paypal.oslo.feature.identity.shared.domain.model.challenge.SmsChallenge) p0).getPhoneNumbers()) : p0 instanceof com.paypal.oslo.feature.identity.shared.domain.model.challenge.WhatsAppChallenge ? Camera2StreamConfigurationMap(((com.paypal.oslo.feature.identity.shared.domain.model.challenge.WhatsAppChallenge) p0).getPhoneNumbers()) : p0 instanceof com.paypal.oslo.feature.identity.shared.domain.model.challenge.PhoneCallChallenge ? Camera2StreamConfigurationMap(((com.paypal.oslo.feature.identity.shared.domain.model.challenge.PhoneCallChallenge) p0).getPhoneNumbers()) : p0 instanceof com.paypal.oslo.feature.identity.shared.domain.model.challenge.EmailChallenge ? Camera2StreamConfigurationMap(((com.paypal.oslo.feature.identity.shared.domain.model.challenge.EmailChallenge) p0).getEmails()) : p0 instanceof com.paypal.oslo.feature.identity.shared.domain.model.challenge.AuthenticatorAppChallenge;
    }

    private static <T> boolean Camera2StreamConfigurationMap(java.util.List<? extends T> list) {
        T t;
        boolean isSelected;
        java.util.Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                t = (T) null;
                break;
            }
            t = it.next();
            if (t instanceof com.paypal.oslo.feature.identity.shared.domain.model.challenge.PhoneNumber) {
                isSelected = ((com.paypal.oslo.feature.identity.shared.domain.model.challenge.PhoneNumber) t).isSelected();
            } else if (t instanceof com.paypal.oslo.feature.identity.shared.domain.model.challenge.EmailAddress) {
                isSelected = ((com.paypal.oslo.feature.identity.shared.domain.model.challenge.EmailAddress) t).isSelected();
            } else {
                continue;
            }
            if (isSelected) {
                break;
            }
        }
        if (t instanceof com.paypal.oslo.feature.identity.shared.domain.model.challenge.PhoneNumber) {
            return ((com.paypal.oslo.feature.identity.shared.domain.model.challenge.PhoneNumber) t).getNotified();
        }
        if (t instanceof com.paypal.oslo.feature.identity.shared.domain.model.challenge.EmailAddress) {
            return ((com.paypal.oslo.feature.identity.shared.domain.model.challenge.EmailAddress) t).getNotified();
        }
        java.lang.Object firstOrNull = kotlin.collections.CollectionsKt.firstOrNull((java.util.List<? extends java.lang.Object>) list);
        if (firstOrNull == null) {
            return false;
        }
        if (firstOrNull instanceof com.paypal.oslo.feature.identity.shared.domain.model.challenge.PhoneNumber) {
            return ((com.paypal.oslo.feature.identity.shared.domain.model.challenge.PhoneNumber) firstOrNull).getNotified();
        }
        if (firstOrNull instanceof com.paypal.oslo.feature.identity.shared.domain.model.challenge.EmailAddress) {
            return ((com.paypal.oslo.feature.identity.shared.domain.model.challenge.EmailAddress) firstOrNull).getNotified();
        }
        return false;
    }

    private static <T> java.lang.String getHighSpeedVideoFpsRanges(java.util.List<? extends T> list) {
        java.lang.String str;
        T t;
        boolean isSelected;
        java.util.Iterator<T> it = list.iterator();
        while (true) {
            str = null;
            if (!it.hasNext()) {
                t = (T) null;
                break;
            }
            t = it.next();
            if (t instanceof com.paypal.oslo.feature.identity.shared.domain.model.challenge.PhoneNumber) {
                isSelected = ((com.paypal.oslo.feature.identity.shared.domain.model.challenge.PhoneNumber) t).isSelected();
            } else if (t instanceof com.paypal.oslo.feature.identity.shared.domain.model.challenge.EmailAddress) {
                isSelected = ((com.paypal.oslo.feature.identity.shared.domain.model.challenge.EmailAddress) t).isSelected();
            } else {
                continue;
            }
            if (isSelected) {
                break;
            }
        }
        if (t instanceof com.paypal.oslo.feature.identity.shared.domain.model.challenge.PhoneNumber) {
            return ((com.paypal.oslo.feature.identity.shared.domain.model.challenge.PhoneNumber) t).getMaskedNumber();
        }
        if (t instanceof com.paypal.oslo.feature.identity.shared.domain.model.challenge.EmailAddress) {
            return ((com.paypal.oslo.feature.identity.shared.domain.model.challenge.EmailAddress) t).getMaskedEmail();
        }
        java.lang.Object firstOrNull = kotlin.collections.CollectionsKt.firstOrNull((java.util.List<? extends java.lang.Object>) list);
        if (firstOrNull != null) {
            if (firstOrNull instanceof com.paypal.oslo.feature.identity.shared.domain.model.challenge.PhoneNumber) {
                str = ((com.paypal.oslo.feature.identity.shared.domain.model.challenge.PhoneNumber) firstOrNull).getMaskedNumber();
            } else {
                str = firstOrNull instanceof com.paypal.oslo.feature.identity.shared.domain.model.challenge.EmailAddress ? ((com.paypal.oslo.feature.identity.shared.domain.model.challenge.EmailAddress) firstOrNull).getMaskedEmail() : "";
            }
        }
        return str == null ? "" : str;
    }

    private static <T> java.lang.String getHighSpeedVideoFpsRangesFor(java.util.List<? extends T> list) {
        T t;
        boolean isSelected;
        java.util.Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                t = (T) null;
                break;
            }
            t = it.next();
            if (t instanceof com.paypal.oslo.feature.identity.shared.domain.model.challenge.PhoneNumber) {
                isSelected = ((com.paypal.oslo.feature.identity.shared.domain.model.challenge.PhoneNumber) t).isSelected();
            } else if (t instanceof com.paypal.oslo.feature.identity.shared.domain.model.challenge.EmailAddress) {
                isSelected = ((com.paypal.oslo.feature.identity.shared.domain.model.challenge.EmailAddress) t).isSelected();
            } else {
                continue;
            }
            if (isSelected) {
                break;
            }
        }
        if (t instanceof com.paypal.oslo.feature.identity.shared.domain.model.challenge.PhoneNumber) {
            return ((com.paypal.oslo.feature.identity.shared.domain.model.challenge.PhoneNumber) t).getId();
        }
        if (t instanceof com.paypal.oslo.feature.identity.shared.domain.model.challenge.EmailAddress) {
            return ((com.paypal.oslo.feature.identity.shared.domain.model.challenge.EmailAddress) t).getId();
        }
        java.lang.Object firstOrNull = kotlin.collections.CollectionsKt.firstOrNull((java.util.List<? extends java.lang.Object>) list);
        if (firstOrNull != null) {
            if (firstOrNull instanceof com.paypal.oslo.feature.identity.shared.domain.model.challenge.PhoneNumber) {
                return ((com.paypal.oslo.feature.identity.shared.domain.model.challenge.PhoneNumber) firstOrNull).getId();
            }
            if (firstOrNull instanceof com.paypal.oslo.feature.identity.shared.domain.model.challenge.EmailAddress) {
                return ((com.paypal.oslo.feature.identity.shared.domain.model.challenge.EmailAddress) firstOrNull).getId();
            }
        }
        return null;
    }

    public final java.lang.String getDeliveryTarget(com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge challenge) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(challenge, "");
        return challenge instanceof com.paypal.oslo.feature.identity.shared.domain.model.challenge.SmsChallenge ? getHighSpeedVideoFpsRanges(((com.paypal.oslo.feature.identity.shared.domain.model.challenge.SmsChallenge) challenge).getPhoneNumbers()) : challenge instanceof com.paypal.oslo.feature.identity.shared.domain.model.challenge.EmailChallenge ? getHighSpeedVideoFpsRanges(((com.paypal.oslo.feature.identity.shared.domain.model.challenge.EmailChallenge) challenge).getEmails()) : challenge instanceof com.paypal.oslo.feature.identity.shared.domain.model.challenge.WhatsAppChallenge ? getHighSpeedVideoFpsRanges(((com.paypal.oslo.feature.identity.shared.domain.model.challenge.WhatsAppChallenge) challenge).getPhoneNumbers()) : challenge instanceof com.paypal.oslo.feature.identity.shared.domain.model.challenge.PhoneCallChallenge ? getHighSpeedVideoFpsRanges(((com.paypal.oslo.feature.identity.shared.domain.model.challenge.PhoneCallChallenge) challenge).getPhoneNumbers()) : "";
    }

    public final java.lang.String getChallengeId(com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge challenge) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(challenge, "");
        if (challenge instanceof com.paypal.oslo.feature.identity.shared.domain.model.challenge.SmsChallenge) {
            return getHighSpeedVideoFpsRangesFor(((com.paypal.oslo.feature.identity.shared.domain.model.challenge.SmsChallenge) challenge).getPhoneNumbers());
        }
        if (challenge instanceof com.paypal.oslo.feature.identity.shared.domain.model.challenge.EmailChallenge) {
            return getHighSpeedVideoFpsRangesFor(((com.paypal.oslo.feature.identity.shared.domain.model.challenge.EmailChallenge) challenge).getEmails());
        }
        if (challenge instanceof com.paypal.oslo.feature.identity.shared.domain.model.challenge.WhatsAppChallenge) {
            return getHighSpeedVideoFpsRangesFor(((com.paypal.oslo.feature.identity.shared.domain.model.challenge.WhatsAppChallenge) challenge).getPhoneNumbers());
        }
        if (challenge instanceof com.paypal.oslo.feature.identity.shared.domain.model.challenge.PhoneCallChallenge) {
            return getHighSpeedVideoFpsRangesFor(((com.paypal.oslo.feature.identity.shared.domain.model.challenge.PhoneCallChallenge) challenge).getPhoneNumbers());
        }
        return null;
    }

    public final java.lang.String getNonce(com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge challenge) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(challenge, "");
        if (challenge instanceof com.paypal.oslo.feature.identity.shared.domain.model.challenge.SmsChallenge) {
            return ((com.paypal.oslo.feature.identity.shared.domain.model.challenge.SmsChallenge) challenge).getNonce();
        }
        if (challenge instanceof com.paypal.oslo.feature.identity.shared.domain.model.challenge.EmailChallenge) {
            return ((com.paypal.oslo.feature.identity.shared.domain.model.challenge.EmailChallenge) challenge).getNonce();
        }
        if (challenge instanceof com.paypal.oslo.feature.identity.shared.domain.model.challenge.WhatsAppChallenge) {
            return ((com.paypal.oslo.feature.identity.shared.domain.model.challenge.WhatsAppChallenge) challenge).getNonce();
        }
        if (challenge instanceof com.paypal.oslo.feature.identity.shared.domain.model.challenge.PhoneCallChallenge) {
            return ((com.paypal.oslo.feature.identity.shared.domain.model.challenge.PhoneCallChallenge) challenge).getNonce();
        }
        if (challenge instanceof com.paypal.oslo.feature.identity.shared.domain.model.challenge.AuthenticatorAppChallenge) {
            return ((com.paypal.oslo.feature.identity.shared.domain.model.challenge.AuthenticatorAppChallenge) challenge).getNonce();
        }
        return null;
    }

    public final java.lang.String getPartialToken(com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge challenge) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(challenge, "");
        if (challenge instanceof com.paypal.oslo.feature.identity.shared.domain.model.challenge.SmsChallenge) {
            return ((com.paypal.oslo.feature.identity.shared.domain.model.challenge.SmsChallenge) challenge).getPartialToken();
        }
        if (challenge instanceof com.paypal.oslo.feature.identity.shared.domain.model.challenge.EmailChallenge) {
            return ((com.paypal.oslo.feature.identity.shared.domain.model.challenge.EmailChallenge) challenge).getPartialToken();
        }
        if (challenge instanceof com.paypal.oslo.feature.identity.shared.domain.model.challenge.WhatsAppChallenge) {
            return ((com.paypal.oslo.feature.identity.shared.domain.model.challenge.WhatsAppChallenge) challenge).getPartialToken();
        }
        if (challenge instanceof com.paypal.oslo.feature.identity.shared.domain.model.challenge.PhoneCallChallenge) {
            return ((com.paypal.oslo.feature.identity.shared.domain.model.challenge.PhoneCallChallenge) challenge).getPartialToken();
        }
        if (challenge instanceof com.paypal.oslo.feature.identity.shared.domain.model.challenge.AuthenticatorAppChallenge) {
            return ((com.paypal.oslo.feature.identity.shared.domain.model.challenge.AuthenticatorAppChallenge) challenge).getPartialToken();
        }
        return null;
    }
}
