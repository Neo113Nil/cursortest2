package com.paypal.oslo.core.companion.domain;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005"}, d2 = {"Lcom/paypal/oslo/core/companion/domain/EnvironmentType;", "", "<init>", "(Ljava/lang/String;I)V", "PROD", "STAGE"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class EnvironmentType {
    private static final /* synthetic */ kotlin.enums.EnumEntries Camera2StreamConfigurationMap;
    public static final com.paypal.oslo.core.companion.domain.EnvironmentType PROD;
    public static final com.paypal.oslo.core.companion.domain.EnvironmentType STAGE;
    private static final /* synthetic */ com.paypal.oslo.core.companion.domain.EnvironmentType[] getHighSpeedVideoSizes;

    private EnvironmentType(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.core.companion.domain.EnvironmentType environmentType = new com.paypal.oslo.core.companion.domain.EnvironmentType("PROD", 0);
        PROD = environmentType;
        com.paypal.oslo.core.companion.domain.EnvironmentType environmentType2 = new com.paypal.oslo.core.companion.domain.EnvironmentType("STAGE", 1);
        STAGE = environmentType2;
        com.paypal.oslo.core.companion.domain.EnvironmentType[] environmentTypeArr = {environmentType, environmentType2};
        getHighSpeedVideoSizes = environmentTypeArr;
        Camera2StreamConfigurationMap = kotlin.enums.EnumEntriesKt.enumEntries(environmentTypeArr);
    }

    public static com.paypal.oslo.core.companion.domain.EnvironmentType[] values() {
        return (com.paypal.oslo.core.companion.domain.EnvironmentType[]) getHighSpeedVideoSizes.clone();
    }

    public static com.paypal.oslo.core.companion.domain.EnvironmentType valueOf(java.lang.String str) {
        return (com.paypal.oslo.core.companion.domain.EnvironmentType) java.lang.Enum.valueOf(com.paypal.oslo.core.companion.domain.EnvironmentType.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.core.companion.domain.EnvironmentType> getEntries() {
        return Camera2StreamConfigurationMap;
    }
}
