package com.paypal.oslo.feature.inappcheckout.domain.util;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u000e\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\f\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\t8\u0007¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0006R\u0014\u0010\u000f\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0006R\u0014\u0010\u0010\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0006R\u0014\u0010\u0011\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0006R\u0014\u0010\u0012\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0006R\u0014\u0010\u0013\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0006R\u0014\u0010\u0014\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0006R\u0014\u0010\u0015\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0006R\u0014\u0010\u0016\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0006R\u0014\u0010\u0017\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0006R\u0014\u0010\u0019\u001a\u00020\u00188\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001b\u001a\u00020\u00188\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u001b\u0010\u001aR\u0014\u0010\u001c\u001a\u00020\u00188\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u001c\u0010\u001aR \u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00040\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u000b\u001a\u0004\b\u001e\u0010\rR\u0014\u0010\u001f\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u001f\u0010\u0006R\u0014\u0010!\u001a\u00020 8\u0006X\u0087T¢\u0006\u0006\n\u0004\b!\u0010\""}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/domain/util/CardConstants;", "", "<init>", "()V", "", "MAX_CARD_DIGITS", com.visa.cbp.getEncExpo.warmup, "MIN_CARD_NUMBER_LENGTH", "MAX_CARD_NUMBER_LENGTH", "", "DEFAULT_CARD_GROUPING", "Ljava/util/List;", "getDEFAULT_CARD_GROUPING", "()Ljava/util/List;", "MIN_NAME_LENGTH", "MAX_NAME_LENGTH", "EXPIRATION_DATE_PART_INDEX_MONTH", "EXPIRATION_DATE_PART_INDEX_YEAR", "EXPIRATION_DATE_LENGTH_MMYY", "EXPIRATION_DATE_MONTH_LENGTH", "CENTURY_DIVISOR", "MAX_MONTH_VALUE", "MIN_CVV_LENGTH", "MAX_CVV_LENGTH", "", "REGEX_NUMERIC", "Ljava/lang/String;", "REGEX_EXPIRY_MONTH", "REGEX_EXPIRY_YEAR", "CARD_BRAND_FETCH_TRIGGERS", "getCARD_BRAND_FETCH_TRIGGERS", "MIN_DIGITS_FOR_BRAND_DETECTION", "", "MASK_CHAR", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.CORDOVA}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class CardConstants {
    public static final int CENTURY_DIVISOR = 100;
    public static final int EXPIRATION_DATE_LENGTH_MMYY = 4;
    public static final int EXPIRATION_DATE_MONTH_LENGTH = 2;
    public static final int EXPIRATION_DATE_PART_INDEX_MONTH = 0;
    public static final int EXPIRATION_DATE_PART_INDEX_YEAR = 1;
    public static final char MASK_CHAR = 8226;
    public static final int MAX_CARD_DIGITS = 19;
    public static final int MAX_CARD_NUMBER_LENGTH = 19;
    public static final int MAX_CVV_LENGTH = 4;
    public static final int MAX_MONTH_VALUE = 12;
    public static final int MAX_NAME_LENGTH = 64;
    public static final int MIN_CARD_NUMBER_LENGTH = 13;
    public static final int MIN_CVV_LENGTH = 3;
    public static final int MIN_DIGITS_FOR_BRAND_DETECTION = 2;
    public static final int MIN_NAME_LENGTH = 1;
    public static final java.lang.String REGEX_EXPIRY_MONTH = "^(0?[1-9]|1[012])$";
    public static final java.lang.String REGEX_EXPIRY_YEAR = "^[0-9][0-9]$";
    public static final java.lang.String REGEX_NUMERIC = "^[0-9]+$";
    public static final com.paypal.oslo.feature.inappcheckout.domain.util.CardConstants INSTANCE = new com.paypal.oslo.feature.inappcheckout.domain.util.CardConstants();
    private static final java.util.List<java.lang.Integer> DEFAULT_CARD_GROUPING = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.Integer[]{4, 4, 4, 4});
    private static final java.util.List<java.lang.Integer> CARD_BRAND_FETCH_TRIGGERS = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.Integer[]{2, 9, 16});
    public static final int $stable = 8;

    private CardConstants() {
    }

    public final java.util.List<java.lang.Integer> getDEFAULT_CARD_GROUPING() {
        return DEFAULT_CARD_GROUPING;
    }

    public final java.util.List<java.lang.Integer> getCARD_BRAND_FETCH_TRIGGERS() {
        return CARD_BRAND_FETCH_TRIGGERS;
    }
}
