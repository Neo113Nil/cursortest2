package com.paypal.oslo.feature.onboarding.signup.email.domain.model;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006"}, d2 = {"Lcom/paypal/oslo/feature/onboarding/signup/email/domain/model/EmailValidity;", "", "<init>", "(Ljava/lang/String;I)V", "VALID", "INVALID", "BLOCKED"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class EmailValidity {
    public static final com.paypal.oslo.feature.onboarding.signup.email.domain.model.EmailValidity BLOCKED;
    public static final com.paypal.oslo.feature.onboarding.signup.email.domain.model.EmailValidity INVALID;
    public static final com.paypal.oslo.feature.onboarding.signup.email.domain.model.EmailValidity VALID;
    private static final /* synthetic */ com.paypal.oslo.feature.onboarding.signup.email.domain.model.EmailValidity[] getHighSpeedVideoFpsRanges;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoSizes;

    private EmailValidity(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.onboarding.signup.email.domain.model.EmailValidity emailValidity = new com.paypal.oslo.feature.onboarding.signup.email.domain.model.EmailValidity("VALID", 0);
        VALID = emailValidity;
        com.paypal.oslo.feature.onboarding.signup.email.domain.model.EmailValidity emailValidity2 = new com.paypal.oslo.feature.onboarding.signup.email.domain.model.EmailValidity("INVALID", 1);
        INVALID = emailValidity2;
        com.paypal.oslo.feature.onboarding.signup.email.domain.model.EmailValidity emailValidity3 = new com.paypal.oslo.feature.onboarding.signup.email.domain.model.EmailValidity("BLOCKED", 2);
        BLOCKED = emailValidity3;
        com.paypal.oslo.feature.onboarding.signup.email.domain.model.EmailValidity[] emailValidityArr = {emailValidity, emailValidity2, emailValidity3};
        getHighSpeedVideoFpsRanges = emailValidityArr;
        getHighSpeedVideoSizes = kotlin.enums.EnumEntriesKt.enumEntries(emailValidityArr);
    }

    public static com.paypal.oslo.feature.onboarding.signup.email.domain.model.EmailValidity[] values() {
        return (com.paypal.oslo.feature.onboarding.signup.email.domain.model.EmailValidity[]) getHighSpeedVideoFpsRanges.clone();
    }

    public static com.paypal.oslo.feature.onboarding.signup.email.domain.model.EmailValidity valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.onboarding.signup.email.domain.model.EmailValidity) java.lang.Enum.valueOf(com.paypal.oslo.feature.onboarding.signup.email.domain.model.EmailValidity.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.onboarding.signup.email.domain.model.EmailValidity> getEntries() {
        return getHighSpeedVideoSizes;
    }
}
