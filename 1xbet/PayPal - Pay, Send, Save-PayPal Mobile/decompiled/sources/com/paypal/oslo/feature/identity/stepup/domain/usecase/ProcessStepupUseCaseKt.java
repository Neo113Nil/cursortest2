package com.paypal.oslo.feature.identity.stepup.domain.usecase;

@kotlin.Metadata(d1 = {"\u0000\u0000"}, d2 = {}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ProcessStepupUseCaseKt {
    public static final /* synthetic */ com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge access$findNotifiedOtpChallenge(java.util.List list) {
        java.lang.Object obj;
        java.util.Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge challenge = (com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge) obj;
            if (com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeExtensionsKt.isOtpChallenge(challenge) && com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeExtensionsKt.hasNotifiedContact(challenge)) {
                break;
            }
        }
        return (com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge) obj;
    }
}
