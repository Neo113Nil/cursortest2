package com.paypal.oslo.feature.balance.ui.autoReload.frequency;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006"}, d2 = {"Lcom/paypal/oslo/feature/balance/ui/autoReload/frequency/FrequencyTypeUi;", "", "<init>", "(Ljava/lang/String;I)V", "WEEKLY", "BIWEEKLY", "MONTHLY"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class FrequencyTypeUi {
    public static final com.paypal.oslo.feature.balance.ui.autoReload.frequency.FrequencyTypeUi BIWEEKLY;
    public static final com.paypal.oslo.feature.balance.ui.autoReload.frequency.FrequencyTypeUi MONTHLY;
    public static final com.paypal.oslo.feature.balance.ui.autoReload.frequency.FrequencyTypeUi WEEKLY;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighResolutionOutputSizeshNQ4ISI;
    private static final /* synthetic */ com.paypal.oslo.feature.balance.ui.autoReload.frequency.FrequencyTypeUi[] getHighSpeedVideoSizes;

    private FrequencyTypeUi(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.balance.ui.autoReload.frequency.FrequencyTypeUi frequencyTypeUi = new com.paypal.oslo.feature.balance.ui.autoReload.frequency.FrequencyTypeUi("WEEKLY", 0);
        WEEKLY = frequencyTypeUi;
        com.paypal.oslo.feature.balance.ui.autoReload.frequency.FrequencyTypeUi frequencyTypeUi2 = new com.paypal.oslo.feature.balance.ui.autoReload.frequency.FrequencyTypeUi("BIWEEKLY", 1);
        BIWEEKLY = frequencyTypeUi2;
        com.paypal.oslo.feature.balance.ui.autoReload.frequency.FrequencyTypeUi frequencyTypeUi3 = new com.paypal.oslo.feature.balance.ui.autoReload.frequency.FrequencyTypeUi("MONTHLY", 2);
        MONTHLY = frequencyTypeUi3;
        com.paypal.oslo.feature.balance.ui.autoReload.frequency.FrequencyTypeUi[] frequencyTypeUiArr = {frequencyTypeUi, frequencyTypeUi2, frequencyTypeUi3};
        getHighSpeedVideoSizes = frequencyTypeUiArr;
        getHighResolutionOutputSizeshNQ4ISI = kotlin.enums.EnumEntriesKt.enumEntries(frequencyTypeUiArr);
    }

    public static com.paypal.oslo.feature.balance.ui.autoReload.frequency.FrequencyTypeUi[] values() {
        return (com.paypal.oslo.feature.balance.ui.autoReload.frequency.FrequencyTypeUi[]) getHighSpeedVideoSizes.clone();
    }

    public static com.paypal.oslo.feature.balance.ui.autoReload.frequency.FrequencyTypeUi valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.balance.ui.autoReload.frequency.FrequencyTypeUi) java.lang.Enum.valueOf(com.paypal.oslo.feature.balance.ui.autoReload.frequency.FrequencyTypeUi.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.balance.ui.autoReload.frequency.FrequencyTypeUi> getEntries() {
        return getHighResolutionOutputSizeshNQ4ISI;
    }
}
