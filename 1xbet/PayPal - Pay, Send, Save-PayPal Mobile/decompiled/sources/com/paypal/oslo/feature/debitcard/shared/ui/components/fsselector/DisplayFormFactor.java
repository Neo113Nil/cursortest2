package com.paypal.oslo.feature.debitcard.shared.ui.components.fsselector;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/shared/ui/components/fsselector/DisplayFormFactor;", "", "<init>", "(Ljava/lang/String;I)V", "BOTTOM_SHEET", "FULL_SCREEN"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class DisplayFormFactor {
    public static final com.paypal.oslo.feature.debitcard.shared.ui.components.fsselector.DisplayFormFactor BOTTOM_SHEET;
    public static final com.paypal.oslo.feature.debitcard.shared.ui.components.fsselector.DisplayFormFactor FULL_SCREEN;
    private static final /* synthetic */ com.paypal.oslo.feature.debitcard.shared.ui.components.fsselector.DisplayFormFactor[] getHighResolutionOutputSizeshNQ4ISI;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRanges;

    private DisplayFormFactor(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.debitcard.shared.ui.components.fsselector.DisplayFormFactor displayFormFactor = new com.paypal.oslo.feature.debitcard.shared.ui.components.fsselector.DisplayFormFactor("BOTTOM_SHEET", 0);
        BOTTOM_SHEET = displayFormFactor;
        com.paypal.oslo.feature.debitcard.shared.ui.components.fsselector.DisplayFormFactor displayFormFactor2 = new com.paypal.oslo.feature.debitcard.shared.ui.components.fsselector.DisplayFormFactor("FULL_SCREEN", 1);
        FULL_SCREEN = displayFormFactor2;
        com.paypal.oslo.feature.debitcard.shared.ui.components.fsselector.DisplayFormFactor[] displayFormFactorArr = {displayFormFactor, displayFormFactor2};
        getHighResolutionOutputSizeshNQ4ISI = displayFormFactorArr;
        getHighSpeedVideoFpsRanges = kotlin.enums.EnumEntriesKt.enumEntries(displayFormFactorArr);
    }

    public static com.paypal.oslo.feature.debitcard.shared.ui.components.fsselector.DisplayFormFactor[] values() {
        return (com.paypal.oslo.feature.debitcard.shared.ui.components.fsselector.DisplayFormFactor[]) getHighResolutionOutputSizeshNQ4ISI.clone();
    }

    public static com.paypal.oslo.feature.debitcard.shared.ui.components.fsselector.DisplayFormFactor valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.debitcard.shared.ui.components.fsselector.DisplayFormFactor) java.lang.Enum.valueOf(com.paypal.oslo.feature.debitcard.shared.ui.components.fsselector.DisplayFormFactor.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.debitcard.shared.ui.components.fsselector.DisplayFormFactor> getEntries() {
        return getHighSpeedVideoFpsRanges;
    }
}
