package com.paypal.oslo.feature.identity.shared.domain.model.challenge;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0011\u0010\u0004\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0004\u0010\u0003\"\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/Challenge;", "", "isOtpChallenge", "(Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/Challenge;)Z", "hasNotifiedContact", "", "Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/ChallengeType;", "Camera2StreamConfigurationMap", "Ljava/util/Set;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ChallengeExtensionsKt {
    private static final java.util.Set<com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeType> Camera2StreamConfigurationMap = kotlin.collections.SetsKt.setOf((java.lang.Object[]) new com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeType[]{com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeType.SMS, com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeType.EMAIL, com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeType.IVR, com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeType.WHATSAPP});

    public static final boolean isOtpChallenge(com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge challenge) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(challenge, "");
        return Camera2StreamConfigurationMap.contains(challenge.getType());
    }

    public static final boolean hasNotifiedContact(com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge challenge) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(challenge, "");
        if (!(challenge instanceof com.paypal.oslo.feature.identity.shared.domain.model.challenge.SmsChallenge)) {
            if (!(challenge instanceof com.paypal.oslo.feature.identity.shared.domain.model.challenge.EmailChallenge)) {
                if (!(challenge instanceof com.paypal.oslo.feature.identity.shared.domain.model.challenge.PhoneCallChallenge)) {
                    if (!(challenge instanceof com.paypal.oslo.feature.identity.shared.domain.model.challenge.WhatsAppChallenge)) {
                        return challenge instanceof com.paypal.oslo.feature.identity.shared.domain.model.challenge.AuthenticatorAppChallenge;
                    }
                    java.util.List<com.paypal.oslo.feature.identity.shared.domain.model.challenge.PhoneNumber> phoneNumbers = ((com.paypal.oslo.feature.identity.shared.domain.model.challenge.WhatsAppChallenge) challenge).getPhoneNumbers();
                    if ((phoneNumbers instanceof java.util.Collection) && phoneNumbers.isEmpty()) {
                        return false;
                    }
                    java.util.Iterator<T> it = phoneNumbers.iterator();
                    while (it.hasNext()) {
                        if (((com.paypal.oslo.feature.identity.shared.domain.model.challenge.PhoneNumber) it.next()).getNotified()) {
                            return true;
                        }
                    }
                    return false;
                }
                java.util.List<com.paypal.oslo.feature.identity.shared.domain.model.challenge.PhoneNumber> phoneNumbers2 = ((com.paypal.oslo.feature.identity.shared.domain.model.challenge.PhoneCallChallenge) challenge).getPhoneNumbers();
                if ((phoneNumbers2 instanceof java.util.Collection) && phoneNumbers2.isEmpty()) {
                    return false;
                }
                java.util.Iterator<T> it2 = phoneNumbers2.iterator();
                while (it2.hasNext()) {
                    if (((com.paypal.oslo.feature.identity.shared.domain.model.challenge.PhoneNumber) it2.next()).getNotified()) {
                        return true;
                    }
                }
                return false;
            }
            java.util.List<com.paypal.oslo.feature.identity.shared.domain.model.challenge.EmailAddress> emails = ((com.paypal.oslo.feature.identity.shared.domain.model.challenge.EmailChallenge) challenge).getEmails();
            if ((emails instanceof java.util.Collection) && emails.isEmpty()) {
                return false;
            }
            java.util.Iterator<T> it3 = emails.iterator();
            while (it3.hasNext()) {
                if (((com.paypal.oslo.feature.identity.shared.domain.model.challenge.EmailAddress) it3.next()).getNotified()) {
                    return true;
                }
            }
            return false;
        }
        java.util.List<com.paypal.oslo.feature.identity.shared.domain.model.challenge.PhoneNumber> phoneNumbers3 = ((com.paypal.oslo.feature.identity.shared.domain.model.challenge.SmsChallenge) challenge).getPhoneNumbers();
        if ((phoneNumbers3 instanceof java.util.Collection) && phoneNumbers3.isEmpty()) {
            return false;
        }
        java.util.Iterator<T> it4 = phoneNumbers3.iterator();
        while (it4.hasNext()) {
            if (((com.paypal.oslo.feature.identity.shared.domain.model.challenge.PhoneNumber) it4.next()).getNotified()) {
                return true;
            }
        }
        return false;
    }
}
