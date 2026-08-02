package com.paypal.oslo.core.persistence.appstorage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t"}, d2 = {"Lcom/paypal/oslo/core/persistence/appstorage/SharedPrefDataType;", "", "<init>", "(Ljava/lang/String;I)V", "STRING", "INT", "BOOLEAN", "LONG", "FLOAT", "STRING_SET"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class SharedPrefDataType {
    public static final com.paypal.oslo.core.persistence.appstorage.SharedPrefDataType BOOLEAN;
    private static final /* synthetic */ kotlin.enums.EnumEntries Camera2StreamConfigurationMap;
    public static final com.paypal.oslo.core.persistence.appstorage.SharedPrefDataType FLOAT;
    public static final com.paypal.oslo.core.persistence.appstorage.SharedPrefDataType INT;
    public static final com.paypal.oslo.core.persistence.appstorage.SharedPrefDataType LONG;
    public static final com.paypal.oslo.core.persistence.appstorage.SharedPrefDataType STRING;
    public static final com.paypal.oslo.core.persistence.appstorage.SharedPrefDataType STRING_SET;
    private static final /* synthetic */ com.paypal.oslo.core.persistence.appstorage.SharedPrefDataType[] getHighSpeedVideoSizes;

    static {
        com.paypal.oslo.core.persistence.appstorage.SharedPrefDataType sharedPrefDataType = new com.paypal.oslo.core.persistence.appstorage.SharedPrefDataType("STRING", 0);
        STRING = sharedPrefDataType;
        com.paypal.oslo.core.persistence.appstorage.SharedPrefDataType sharedPrefDataType2 = new com.paypal.oslo.core.persistence.appstorage.SharedPrefDataType("INT", 1);
        INT = sharedPrefDataType2;
        com.paypal.oslo.core.persistence.appstorage.SharedPrefDataType sharedPrefDataType3 = new com.paypal.oslo.core.persistence.appstorage.SharedPrefDataType("BOOLEAN", 2);
        BOOLEAN = sharedPrefDataType3;
        com.paypal.oslo.core.persistence.appstorage.SharedPrefDataType sharedPrefDataType4 = new com.paypal.oslo.core.persistence.appstorage.SharedPrefDataType("LONG", 3);
        LONG = sharedPrefDataType4;
        com.paypal.oslo.core.persistence.appstorage.SharedPrefDataType sharedPrefDataType5 = new com.paypal.oslo.core.persistence.appstorage.SharedPrefDataType("FLOAT", 4);
        FLOAT = sharedPrefDataType5;
        com.paypal.oslo.core.persistence.appstorage.SharedPrefDataType sharedPrefDataType6 = new com.paypal.oslo.core.persistence.appstorage.SharedPrefDataType("STRING_SET", 5);
        STRING_SET = sharedPrefDataType6;
        com.paypal.oslo.core.persistence.appstorage.SharedPrefDataType[] sharedPrefDataTypeArr = {sharedPrefDataType, sharedPrefDataType2, sharedPrefDataType3, sharedPrefDataType4, sharedPrefDataType5, sharedPrefDataType6};
        getHighSpeedVideoSizes = sharedPrefDataTypeArr;
        Camera2StreamConfigurationMap = kotlin.enums.EnumEntriesKt.enumEntries(sharedPrefDataTypeArr);
    }

    private SharedPrefDataType(java.lang.String str, int i) {
    }

    public static com.paypal.oslo.core.persistence.appstorage.SharedPrefDataType[] values() {
        return (com.paypal.oslo.core.persistence.appstorage.SharedPrefDataType[]) getHighSpeedVideoSizes.clone();
    }

    public static com.paypal.oslo.core.persistence.appstorage.SharedPrefDataType valueOf(java.lang.String str) {
        return (com.paypal.oslo.core.persistence.appstorage.SharedPrefDataType) java.lang.Enum.valueOf(com.paypal.oslo.core.persistence.appstorage.SharedPrefDataType.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.core.persistence.appstorage.SharedPrefDataType> getEntries() {
        return Camera2StreamConfigurationMap;
    }
}
