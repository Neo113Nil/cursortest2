package com.paypal.oslo.core.i18n.domain.model;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\f\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0006\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e"}, d2 = {"Lcom/paypal/oslo/core/i18n/domain/model/CurrencyScale;", "", "", "p0", "<init>", "(Ljava/lang/String;II)V", "scale", com.visa.cbp.getEncExpo.warmup, "getScale", "()I", "SCALE_ZERO", "SCALE_ONE", "SCALE_TWO", "SCALE_THREE", "SCALE_FOUR"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class CurrencyScale {
    public static final com.paypal.oslo.core.i18n.domain.model.CurrencyScale SCALE_FOUR;
    public static final com.paypal.oslo.core.i18n.domain.model.CurrencyScale SCALE_ONE;
    public static final com.paypal.oslo.core.i18n.domain.model.CurrencyScale SCALE_THREE;
    public static final com.paypal.oslo.core.i18n.domain.model.CurrencyScale SCALE_TWO;
    public static final com.paypal.oslo.core.i18n.domain.model.CurrencyScale SCALE_ZERO;
    private static final /* synthetic */ com.paypal.oslo.core.i18n.domain.model.CurrencyScale[] getHighSpeedVideoFpsRanges;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRangesFor;
    private final int scale;

    private CurrencyScale(java.lang.String str, int i, int i2) {
        this.scale = i2;
    }

    public final int getScale() {
        return this.scale;
    }

    static {
        com.paypal.oslo.core.i18n.domain.model.CurrencyScale currencyScale = new com.paypal.oslo.core.i18n.domain.model.CurrencyScale("SCALE_ZERO", 0, 0);
        SCALE_ZERO = currencyScale;
        com.paypal.oslo.core.i18n.domain.model.CurrencyScale currencyScale2 = new com.paypal.oslo.core.i18n.domain.model.CurrencyScale("SCALE_ONE", 1, 1);
        SCALE_ONE = currencyScale2;
        com.paypal.oslo.core.i18n.domain.model.CurrencyScale currencyScale3 = new com.paypal.oslo.core.i18n.domain.model.CurrencyScale("SCALE_TWO", 2, 2);
        SCALE_TWO = currencyScale3;
        com.paypal.oslo.core.i18n.domain.model.CurrencyScale currencyScale4 = new com.paypal.oslo.core.i18n.domain.model.CurrencyScale("SCALE_THREE", 3, 3);
        SCALE_THREE = currencyScale4;
        com.paypal.oslo.core.i18n.domain.model.CurrencyScale currencyScale5 = new com.paypal.oslo.core.i18n.domain.model.CurrencyScale("SCALE_FOUR", 4, 4);
        SCALE_FOUR = currencyScale5;
        com.paypal.oslo.core.i18n.domain.model.CurrencyScale[] currencyScaleArr = {currencyScale, currencyScale2, currencyScale3, currencyScale4, currencyScale5};
        getHighSpeedVideoFpsRanges = currencyScaleArr;
        getHighSpeedVideoFpsRangesFor = kotlin.enums.EnumEntriesKt.enumEntries(currencyScaleArr);
    }

    public static com.paypal.oslo.core.i18n.domain.model.CurrencyScale[] values() {
        return (com.paypal.oslo.core.i18n.domain.model.CurrencyScale[]) getHighSpeedVideoFpsRanges.clone();
    }

    public static com.paypal.oslo.core.i18n.domain.model.CurrencyScale valueOf(java.lang.String str) {
        return (com.paypal.oslo.core.i18n.domain.model.CurrencyScale) java.lang.Enum.valueOf(com.paypal.oslo.core.i18n.domain.model.CurrencyScale.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.core.i18n.domain.model.CurrencyScale> getEntries() {
        return getHighSpeedVideoFpsRangesFor;
    }
}
