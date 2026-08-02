package com.paypal.oslo.feature.qrc.domain.model.session;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n"}, d2 = {"Lcom/paypal/oslo/feature/qrc/domain/model/session/FieldName;", "", "<init>", "(Ljava/lang/String;I)V", "TRANSACTION_AMOUNT", "TIP_AMOUNT", "MEMO", "FUNDING_INSTRUMENT", com.zettle.sdk.commons.network.JsonKt.KEY_PAYMENT_AMOUNT, "TIP", "PAYMENT_PREFERENCE"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class FieldName {
    public static final com.paypal.oslo.feature.qrc.domain.model.session.FieldName AMOUNT;
    public static final com.paypal.oslo.feature.qrc.domain.model.session.FieldName FUNDING_INSTRUMENT;
    public static final com.paypal.oslo.feature.qrc.domain.model.session.FieldName MEMO;
    public static final com.paypal.oslo.feature.qrc.domain.model.session.FieldName PAYMENT_PREFERENCE;
    public static final com.paypal.oslo.feature.qrc.domain.model.session.FieldName TIP;
    public static final com.paypal.oslo.feature.qrc.domain.model.session.FieldName TIP_AMOUNT;
    public static final com.paypal.oslo.feature.qrc.domain.model.session.FieldName TRANSACTION_AMOUNT;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRanges;
    private static final /* synthetic */ com.paypal.oslo.feature.qrc.domain.model.session.FieldName[] getHighSpeedVideoFpsRangesFor;

    private FieldName(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.qrc.domain.model.session.FieldName fieldName = new com.paypal.oslo.feature.qrc.domain.model.session.FieldName("TRANSACTION_AMOUNT", 0);
        TRANSACTION_AMOUNT = fieldName;
        com.paypal.oslo.feature.qrc.domain.model.session.FieldName fieldName2 = new com.paypal.oslo.feature.qrc.domain.model.session.FieldName("TIP_AMOUNT", 1);
        TIP_AMOUNT = fieldName2;
        com.paypal.oslo.feature.qrc.domain.model.session.FieldName fieldName3 = new com.paypal.oslo.feature.qrc.domain.model.session.FieldName("MEMO", 2);
        MEMO = fieldName3;
        com.paypal.oslo.feature.qrc.domain.model.session.FieldName fieldName4 = new com.paypal.oslo.feature.qrc.domain.model.session.FieldName("FUNDING_INSTRUMENT", 3);
        FUNDING_INSTRUMENT = fieldName4;
        com.paypal.oslo.feature.qrc.domain.model.session.FieldName fieldName5 = new com.paypal.oslo.feature.qrc.domain.model.session.FieldName(com.zettle.sdk.commons.network.JsonKt.KEY_PAYMENT_AMOUNT, 4);
        AMOUNT = fieldName5;
        com.paypal.oslo.feature.qrc.domain.model.session.FieldName fieldName6 = new com.paypal.oslo.feature.qrc.domain.model.session.FieldName("TIP", 5);
        TIP = fieldName6;
        com.paypal.oslo.feature.qrc.domain.model.session.FieldName fieldName7 = new com.paypal.oslo.feature.qrc.domain.model.session.FieldName("PAYMENT_PREFERENCE", 6);
        PAYMENT_PREFERENCE = fieldName7;
        com.paypal.oslo.feature.qrc.domain.model.session.FieldName[] fieldNameArr = {fieldName, fieldName2, fieldName3, fieldName4, fieldName5, fieldName6, fieldName7};
        getHighSpeedVideoFpsRangesFor = fieldNameArr;
        getHighSpeedVideoFpsRanges = kotlin.enums.EnumEntriesKt.enumEntries(fieldNameArr);
    }

    public static com.paypal.oslo.feature.qrc.domain.model.session.FieldName[] values() {
        return (com.paypal.oslo.feature.qrc.domain.model.session.FieldName[]) getHighSpeedVideoFpsRangesFor.clone();
    }

    public static com.paypal.oslo.feature.qrc.domain.model.session.FieldName valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.qrc.domain.model.session.FieldName) java.lang.Enum.valueOf(com.paypal.oslo.feature.qrc.domain.model.session.FieldName.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.qrc.domain.model.session.FieldName> getEntries() {
        return getHighSpeedVideoFpsRanges;
    }
}
