package com.paypal.oslo.feature.identity.passkey.management.enrollment.challenge.domain.model;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006"}, d2 = {"Lcom/paypal/oslo/feature/identity/passkey/management/enrollment/challenge/domain/model/PasskeyUserVerification;", "", "<init>", "(Ljava/lang/String;I)V", "REQUIRED", "PREFERRED", "DISCOURAGED"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class PasskeyUserVerification {
    public static final com.paypal.oslo.feature.identity.passkey.management.enrollment.challenge.domain.model.PasskeyUserVerification DISCOURAGED;
    public static final com.paypal.oslo.feature.identity.passkey.management.enrollment.challenge.domain.model.PasskeyUserVerification PREFERRED;
    public static final com.paypal.oslo.feature.identity.passkey.management.enrollment.challenge.domain.model.PasskeyUserVerification REQUIRED;
    private static final /* synthetic */ com.paypal.oslo.feature.identity.passkey.management.enrollment.challenge.domain.model.PasskeyUserVerification[] getHighResolutionOutputSizeshNQ4ISI;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoSizes;

    private PasskeyUserVerification(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.identity.passkey.management.enrollment.challenge.domain.model.PasskeyUserVerification passkeyUserVerification = new com.paypal.oslo.feature.identity.passkey.management.enrollment.challenge.domain.model.PasskeyUserVerification("REQUIRED", 0);
        REQUIRED = passkeyUserVerification;
        com.paypal.oslo.feature.identity.passkey.management.enrollment.challenge.domain.model.PasskeyUserVerification passkeyUserVerification2 = new com.paypal.oslo.feature.identity.passkey.management.enrollment.challenge.domain.model.PasskeyUserVerification("PREFERRED", 1);
        PREFERRED = passkeyUserVerification2;
        com.paypal.oslo.feature.identity.passkey.management.enrollment.challenge.domain.model.PasskeyUserVerification passkeyUserVerification3 = new com.paypal.oslo.feature.identity.passkey.management.enrollment.challenge.domain.model.PasskeyUserVerification("DISCOURAGED", 2);
        DISCOURAGED = passkeyUserVerification3;
        com.paypal.oslo.feature.identity.passkey.management.enrollment.challenge.domain.model.PasskeyUserVerification[] passkeyUserVerificationArr = {passkeyUserVerification, passkeyUserVerification2, passkeyUserVerification3};
        getHighResolutionOutputSizeshNQ4ISI = passkeyUserVerificationArr;
        getHighSpeedVideoSizes = kotlin.enums.EnumEntriesKt.enumEntries(passkeyUserVerificationArr);
    }

    public static com.paypal.oslo.feature.identity.passkey.management.enrollment.challenge.domain.model.PasskeyUserVerification[] values() {
        return (com.paypal.oslo.feature.identity.passkey.management.enrollment.challenge.domain.model.PasskeyUserVerification[]) getHighResolutionOutputSizeshNQ4ISI.clone();
    }

    public static com.paypal.oslo.feature.identity.passkey.management.enrollment.challenge.domain.model.PasskeyUserVerification valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.identity.passkey.management.enrollment.challenge.domain.model.PasskeyUserVerification) java.lang.Enum.valueOf(com.paypal.oslo.feature.identity.passkey.management.enrollment.challenge.domain.model.PasskeyUserVerification.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.identity.passkey.management.enrollment.challenge.domain.model.PasskeyUserVerification> getEntries() {
        return getHighSpeedVideoSizes;
    }
}
