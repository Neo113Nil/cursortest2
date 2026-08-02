package com.paypal.oslo.core.i18n.domain.model;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005"}, d2 = {"Lcom/paypal/oslo/core/i18n/domain/model/BusinessType;", "", "<init>", "(Ljava/lang/String;I)V", "REGISTERED", "NON_REGISTERED"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class BusinessType {
    private static final /* synthetic */ com.paypal.oslo.core.i18n.domain.model.BusinessType[] Camera2StreamConfigurationMap;
    public static final com.paypal.oslo.core.i18n.domain.model.BusinessType NON_REGISTERED;
    public static final com.paypal.oslo.core.i18n.domain.model.BusinessType REGISTERED;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRangesFor;

    private BusinessType(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.core.i18n.domain.model.BusinessType businessType = new com.paypal.oslo.core.i18n.domain.model.BusinessType("REGISTERED", 0);
        REGISTERED = businessType;
        com.paypal.oslo.core.i18n.domain.model.BusinessType businessType2 = new com.paypal.oslo.core.i18n.domain.model.BusinessType("NON_REGISTERED", 1);
        NON_REGISTERED = businessType2;
        com.paypal.oslo.core.i18n.domain.model.BusinessType[] businessTypeArr = {businessType, businessType2};
        Camera2StreamConfigurationMap = businessTypeArr;
        getHighSpeedVideoFpsRangesFor = kotlin.enums.EnumEntriesKt.enumEntries(businessTypeArr);
    }

    public static com.paypal.oslo.core.i18n.domain.model.BusinessType[] values() {
        return (com.paypal.oslo.core.i18n.domain.model.BusinessType[]) Camera2StreamConfigurationMap.clone();
    }

    public static com.paypal.oslo.core.i18n.domain.model.BusinessType valueOf(java.lang.String str) {
        return (com.paypal.oslo.core.i18n.domain.model.BusinessType) java.lang.Enum.valueOf(com.paypal.oslo.core.i18n.domain.model.BusinessType.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.core.i18n.domain.model.BusinessType> getEntries() {
        return getHighSpeedVideoFpsRangesFor;
    }
}
