package com.paypal.oslo.core.companion.domain;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007"}, d2 = {"Lcom/paypal/oslo/core/companion/domain/FieldType;", "", "<init>", "(Ljava/lang/String;I)V", "STRING", "BOOLEAN", "INTEGER", "DOUBLE"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class FieldType {
    public static final com.paypal.oslo.core.companion.domain.FieldType BOOLEAN;
    public static final com.paypal.oslo.core.companion.domain.FieldType DOUBLE;
    public static final com.paypal.oslo.core.companion.domain.FieldType INTEGER;
    public static final com.paypal.oslo.core.companion.domain.FieldType STRING;
    private static final /* synthetic */ com.paypal.oslo.core.companion.domain.FieldType[] getHighSpeedVideoFpsRangesFor;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoSizes;

    private FieldType(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.core.companion.domain.FieldType fieldType = new com.paypal.oslo.core.companion.domain.FieldType("STRING", 0);
        STRING = fieldType;
        com.paypal.oslo.core.companion.domain.FieldType fieldType2 = new com.paypal.oslo.core.companion.domain.FieldType("BOOLEAN", 1);
        BOOLEAN = fieldType2;
        com.paypal.oslo.core.companion.domain.FieldType fieldType3 = new com.paypal.oslo.core.companion.domain.FieldType("INTEGER", 2);
        INTEGER = fieldType3;
        com.paypal.oslo.core.companion.domain.FieldType fieldType4 = new com.paypal.oslo.core.companion.domain.FieldType("DOUBLE", 3);
        DOUBLE = fieldType4;
        com.paypal.oslo.core.companion.domain.FieldType[] fieldTypeArr = {fieldType, fieldType2, fieldType3, fieldType4};
        getHighSpeedVideoFpsRangesFor = fieldTypeArr;
        getHighSpeedVideoSizes = kotlin.enums.EnumEntriesKt.enumEntries(fieldTypeArr);
    }

    public static com.paypal.oslo.core.companion.domain.FieldType[] values() {
        return (com.paypal.oslo.core.companion.domain.FieldType[]) getHighSpeedVideoFpsRangesFor.clone();
    }

    public static com.paypal.oslo.core.companion.domain.FieldType valueOf(java.lang.String str) {
        return (com.paypal.oslo.core.companion.domain.FieldType) java.lang.Enum.valueOf(com.paypal.oslo.core.companion.domain.FieldType.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.core.companion.domain.FieldType> getEntries() {
        return getHighSpeedVideoSizes;
    }
}
