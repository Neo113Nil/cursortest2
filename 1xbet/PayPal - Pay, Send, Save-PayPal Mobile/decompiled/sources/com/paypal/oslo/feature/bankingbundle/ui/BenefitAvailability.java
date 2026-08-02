package com.paypal.oslo.feature.bankingbundle.ui;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006"}, d2 = {"Lcom/paypal/oslo/feature/bankingbundle/ui/BenefitAvailability;", "", "<init>", "(Ljava/lang/String;I)V", "AVAILABLE", "NOT_AVAILABLE", "COMING_SOON"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class BenefitAvailability {
    public static final com.paypal.oslo.feature.bankingbundle.ui.BenefitAvailability AVAILABLE;
    public static final com.paypal.oslo.feature.bankingbundle.ui.BenefitAvailability COMING_SOON;
    public static final com.paypal.oslo.feature.bankingbundle.ui.BenefitAvailability NOT_AVAILABLE;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighResolutionOutputSizeshNQ4ISI;
    private static final /* synthetic */ com.paypal.oslo.feature.bankingbundle.ui.BenefitAvailability[] getHighSpeedVideoFpsRangesFor;

    private BenefitAvailability(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.bankingbundle.ui.BenefitAvailability benefitAvailability = new com.paypal.oslo.feature.bankingbundle.ui.BenefitAvailability("AVAILABLE", 0);
        AVAILABLE = benefitAvailability;
        com.paypal.oslo.feature.bankingbundle.ui.BenefitAvailability benefitAvailability2 = new com.paypal.oslo.feature.bankingbundle.ui.BenefitAvailability("NOT_AVAILABLE", 1);
        NOT_AVAILABLE = benefitAvailability2;
        com.paypal.oslo.feature.bankingbundle.ui.BenefitAvailability benefitAvailability3 = new com.paypal.oslo.feature.bankingbundle.ui.BenefitAvailability("COMING_SOON", 2);
        COMING_SOON = benefitAvailability3;
        com.paypal.oslo.feature.bankingbundle.ui.BenefitAvailability[] benefitAvailabilityArr = {benefitAvailability, benefitAvailability2, benefitAvailability3};
        getHighSpeedVideoFpsRangesFor = benefitAvailabilityArr;
        getHighResolutionOutputSizeshNQ4ISI = kotlin.enums.EnumEntriesKt.enumEntries(benefitAvailabilityArr);
    }

    public static com.paypal.oslo.feature.bankingbundle.ui.BenefitAvailability[] values() {
        return (com.paypal.oslo.feature.bankingbundle.ui.BenefitAvailability[]) getHighSpeedVideoFpsRangesFor.clone();
    }

    public static com.paypal.oslo.feature.bankingbundle.ui.BenefitAvailability valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.bankingbundle.ui.BenefitAvailability) java.lang.Enum.valueOf(com.paypal.oslo.feature.bankingbundle.ui.BenefitAvailability.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.bankingbundle.ui.BenefitAvailability> getEntries() {
        return getHighResolutionOutputSizeshNQ4ISI;
    }
}
