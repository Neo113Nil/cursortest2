package com.paypal.oslo.feature.onboarding.signup.domain.model;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005"}, d2 = {"Lcom/paypal/oslo/feature/onboarding/signup/domain/model/ConfirmationStatus;", "", "<init>", "(Ljava/lang/String;I)V", "INITIATED", "CONFIRMED"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ConfirmationStatus {
    public static final com.paypal.oslo.feature.onboarding.signup.domain.model.ConfirmationStatus CONFIRMED;
    public static final com.paypal.oslo.feature.onboarding.signup.domain.model.ConfirmationStatus INITIATED;
    private static final /* synthetic */ com.paypal.oslo.feature.onboarding.signup.domain.model.ConfirmationStatus[] getHighSpeedVideoFpsRanges;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRangesFor;

    private ConfirmationStatus(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.onboarding.signup.domain.model.ConfirmationStatus confirmationStatus = new com.paypal.oslo.feature.onboarding.signup.domain.model.ConfirmationStatus("INITIATED", 0);
        INITIATED = confirmationStatus;
        com.paypal.oslo.feature.onboarding.signup.domain.model.ConfirmationStatus confirmationStatus2 = new com.paypal.oslo.feature.onboarding.signup.domain.model.ConfirmationStatus("CONFIRMED", 1);
        CONFIRMED = confirmationStatus2;
        com.paypal.oslo.feature.onboarding.signup.domain.model.ConfirmationStatus[] confirmationStatusArr = {confirmationStatus, confirmationStatus2};
        getHighSpeedVideoFpsRanges = confirmationStatusArr;
        getHighSpeedVideoFpsRangesFor = kotlin.enums.EnumEntriesKt.enumEntries(confirmationStatusArr);
    }

    public static com.paypal.oslo.feature.onboarding.signup.domain.model.ConfirmationStatus[] values() {
        return (com.paypal.oslo.feature.onboarding.signup.domain.model.ConfirmationStatus[]) getHighSpeedVideoFpsRanges.clone();
    }

    public static com.paypal.oslo.feature.onboarding.signup.domain.model.ConfirmationStatus valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.onboarding.signup.domain.model.ConfirmationStatus) java.lang.Enum.valueOf(com.paypal.oslo.feature.onboarding.signup.domain.model.ConfirmationStatus.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.onboarding.signup.domain.model.ConfirmationStatus> getEntries() {
        return getHighSpeedVideoFpsRangesFor;
    }
}
