package com.paypal.oslo.core.i18n.domain.model;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n"}, d2 = {"Lcom/paypal/oslo/core/i18n/domain/model/DurationUnit;", "", "<init>", "(Ljava/lang/String;I)V", "BEST_FIT", "YEAR", "MONTH", "DAY", "HOUR", "MINUTE", "SECOND"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class DurationUnit {
    public static final com.paypal.oslo.core.i18n.domain.model.DurationUnit BEST_FIT;
    public static final com.paypal.oslo.core.i18n.domain.model.DurationUnit DAY;
    public static final com.paypal.oslo.core.i18n.domain.model.DurationUnit HOUR;
    public static final com.paypal.oslo.core.i18n.domain.model.DurationUnit MINUTE;
    public static final com.paypal.oslo.core.i18n.domain.model.DurationUnit MONTH;
    public static final com.paypal.oslo.core.i18n.domain.model.DurationUnit SECOND;
    public static final com.paypal.oslo.core.i18n.domain.model.DurationUnit YEAR;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighResolutionOutputSizeshNQ4ISI;
    private static final /* synthetic */ com.paypal.oslo.core.i18n.domain.model.DurationUnit[] getHighSpeedVideoFpsRanges;

    private DurationUnit(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.core.i18n.domain.model.DurationUnit durationUnit = new com.paypal.oslo.core.i18n.domain.model.DurationUnit("BEST_FIT", 0);
        BEST_FIT = durationUnit;
        com.paypal.oslo.core.i18n.domain.model.DurationUnit durationUnit2 = new com.paypal.oslo.core.i18n.domain.model.DurationUnit("YEAR", 1);
        YEAR = durationUnit2;
        com.paypal.oslo.core.i18n.domain.model.DurationUnit durationUnit3 = new com.paypal.oslo.core.i18n.domain.model.DurationUnit("MONTH", 2);
        MONTH = durationUnit3;
        com.paypal.oslo.core.i18n.domain.model.DurationUnit durationUnit4 = new com.paypal.oslo.core.i18n.domain.model.DurationUnit("DAY", 3);
        DAY = durationUnit4;
        com.paypal.oslo.core.i18n.domain.model.DurationUnit durationUnit5 = new com.paypal.oslo.core.i18n.domain.model.DurationUnit("HOUR", 4);
        HOUR = durationUnit5;
        com.paypal.oslo.core.i18n.domain.model.DurationUnit durationUnit6 = new com.paypal.oslo.core.i18n.domain.model.DurationUnit("MINUTE", 5);
        MINUTE = durationUnit6;
        com.paypal.oslo.core.i18n.domain.model.DurationUnit durationUnit7 = new com.paypal.oslo.core.i18n.domain.model.DurationUnit("SECOND", 6);
        SECOND = durationUnit7;
        com.paypal.oslo.core.i18n.domain.model.DurationUnit[] durationUnitArr = {durationUnit, durationUnit2, durationUnit3, durationUnit4, durationUnit5, durationUnit6, durationUnit7};
        getHighSpeedVideoFpsRanges = durationUnitArr;
        getHighResolutionOutputSizeshNQ4ISI = kotlin.enums.EnumEntriesKt.enumEntries(durationUnitArr);
    }

    public static com.paypal.oslo.core.i18n.domain.model.DurationUnit[] values() {
        return (com.paypal.oslo.core.i18n.domain.model.DurationUnit[]) getHighSpeedVideoFpsRanges.clone();
    }

    public static com.paypal.oslo.core.i18n.domain.model.DurationUnit valueOf(java.lang.String str) {
        return (com.paypal.oslo.core.i18n.domain.model.DurationUnit) java.lang.Enum.valueOf(com.paypal.oslo.core.i18n.domain.model.DurationUnit.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.core.i18n.domain.model.DurationUnit> getEntries() {
        return getHighResolutionOutputSizeshNQ4ISI;
    }
}
