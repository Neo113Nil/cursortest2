package com.paypal.oslo.feature.moneymovement.api.amount.component.herocurrencysection;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005"}, d2 = {"Lcom/paypal/oslo/feature/moneymovement/api/amount/component/herocurrencysection/HeroCurrencySectionMode;", "", "<init>", "(Ljava/lang/String;I)V", "STANDARD", "CROSS_BORDER"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class HeroCurrencySectionMode {
    public static final com.paypal.oslo.feature.moneymovement.api.amount.component.herocurrencysection.HeroCurrencySectionMode CROSS_BORDER;
    public static final com.paypal.oslo.feature.moneymovement.api.amount.component.herocurrencysection.HeroCurrencySectionMode STANDARD;
    private static final /* synthetic */ com.paypal.oslo.feature.moneymovement.api.amount.component.herocurrencysection.HeroCurrencySectionMode[] getHighSpeedVideoFpsRanges;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRangesFor;

    private HeroCurrencySectionMode(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.moneymovement.api.amount.component.herocurrencysection.HeroCurrencySectionMode heroCurrencySectionMode = new com.paypal.oslo.feature.moneymovement.api.amount.component.herocurrencysection.HeroCurrencySectionMode("STANDARD", 0);
        STANDARD = heroCurrencySectionMode;
        com.paypal.oslo.feature.moneymovement.api.amount.component.herocurrencysection.HeroCurrencySectionMode heroCurrencySectionMode2 = new com.paypal.oslo.feature.moneymovement.api.amount.component.herocurrencysection.HeroCurrencySectionMode("CROSS_BORDER", 1);
        CROSS_BORDER = heroCurrencySectionMode2;
        com.paypal.oslo.feature.moneymovement.api.amount.component.herocurrencysection.HeroCurrencySectionMode[] heroCurrencySectionModeArr = {heroCurrencySectionMode, heroCurrencySectionMode2};
        getHighSpeedVideoFpsRanges = heroCurrencySectionModeArr;
        getHighSpeedVideoFpsRangesFor = kotlin.enums.EnumEntriesKt.enumEntries(heroCurrencySectionModeArr);
    }

    public static com.paypal.oslo.feature.moneymovement.api.amount.component.herocurrencysection.HeroCurrencySectionMode[] values() {
        return (com.paypal.oslo.feature.moneymovement.api.amount.component.herocurrencysection.HeroCurrencySectionMode[]) getHighSpeedVideoFpsRanges.clone();
    }

    public static com.paypal.oslo.feature.moneymovement.api.amount.component.herocurrencysection.HeroCurrencySectionMode valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.moneymovement.api.amount.component.herocurrencysection.HeroCurrencySectionMode) java.lang.Enum.valueOf(com.paypal.oslo.feature.moneymovement.api.amount.component.herocurrencysection.HeroCurrencySectionMode.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.moneymovement.api.amount.component.herocurrencysection.HeroCurrencySectionMode> getEntries() {
        return getHighSpeedVideoFpsRangesFor;
    }
}
