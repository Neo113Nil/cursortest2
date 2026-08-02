package com.paypal.oslo.feature.businesscustomers.api.domain.model;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0001\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b"}, d2 = {"Lcom/paypal/oslo/feature/businesscustomers/api/domain/model/AddressType;", "", "<init>", "(Ljava/lang/String;I)V", "Companion", "BILLING", "SHIPPING", "PRIMARY", "UNKNOWN"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class AddressType {
    public static final com.paypal.oslo.feature.businesscustomers.api.domain.model.AddressType BILLING;
    private static final /* synthetic */ com.paypal.oslo.feature.businesscustomers.api.domain.model.AddressType[] Camera2StreamConfigurationMap;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.businesscustomers.api.domain.model.AddressType.Companion INSTANCE;
    public static final com.paypal.oslo.feature.businesscustomers.api.domain.model.AddressType PRIMARY;
    public static final com.paypal.oslo.feature.businesscustomers.api.domain.model.AddressType SHIPPING;
    public static final com.paypal.oslo.feature.businesscustomers.api.domain.model.AddressType UNKNOWN;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRangesFor;

    private AddressType(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.businesscustomers.api.domain.model.AddressType addressType = new com.paypal.oslo.feature.businesscustomers.api.domain.model.AddressType("BILLING", 0);
        BILLING = addressType;
        com.paypal.oslo.feature.businesscustomers.api.domain.model.AddressType addressType2 = new com.paypal.oslo.feature.businesscustomers.api.domain.model.AddressType("SHIPPING", 1);
        SHIPPING = addressType2;
        com.paypal.oslo.feature.businesscustomers.api.domain.model.AddressType addressType3 = new com.paypal.oslo.feature.businesscustomers.api.domain.model.AddressType("PRIMARY", 2);
        PRIMARY = addressType3;
        com.paypal.oslo.feature.businesscustomers.api.domain.model.AddressType addressType4 = new com.paypal.oslo.feature.businesscustomers.api.domain.model.AddressType("UNKNOWN", 3);
        UNKNOWN = addressType4;
        com.paypal.oslo.feature.businesscustomers.api.domain.model.AddressType[] addressTypeArr = {addressType, addressType2, addressType3, addressType4};
        Camera2StreamConfigurationMap = addressTypeArr;
        getHighSpeedVideoFpsRangesFor = kotlin.enums.EnumEntriesKt.enumEntries(addressTypeArr);
        INSTANCE = new com.paypal.oslo.feature.businesscustomers.api.domain.model.AddressType.Companion(null);
    }

    @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/businesscustomers/api/domain/model/AddressType$Companion;", "", "<init>", "()V", "", "string", "Lcom/paypal/oslo/feature/businesscustomers/api/domain/model/AddressType;", "parse", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/businesscustomers/api/domain/model/AddressType;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes11.dex */
    public static final class Companion {
        private Companion() {
        }

        public final com.paypal.oslo.feature.businesscustomers.api.domain.model.AddressType parse(java.lang.String string) {
            if (string != null) {
                int hashCode = string.hashCode();
                if (hashCode != 266390958) {
                    if (hashCode != 403216866) {
                        if (hashCode == 608153179 && string.equals("BILLING")) {
                            return com.paypal.oslo.feature.businesscustomers.api.domain.model.AddressType.BILLING;
                        }
                    } else if (string.equals("PRIMARY")) {
                        return com.paypal.oslo.feature.businesscustomers.api.domain.model.AddressType.PRIMARY;
                    }
                } else if (string.equals("SHIPPING")) {
                    return com.paypal.oslo.feature.businesscustomers.api.domain.model.AddressType.SHIPPING;
                }
            }
            return com.paypal.oslo.feature.businesscustomers.api.domain.model.AddressType.UNKNOWN;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static com.paypal.oslo.feature.businesscustomers.api.domain.model.AddressType[] values() {
        return (com.paypal.oslo.feature.businesscustomers.api.domain.model.AddressType[]) Camera2StreamConfigurationMap.clone();
    }

    public static com.paypal.oslo.feature.businesscustomers.api.domain.model.AddressType valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.businesscustomers.api.domain.model.AddressType) java.lang.Enum.valueOf(com.paypal.oslo.feature.businesscustomers.api.domain.model.AddressType.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.businesscustomers.api.domain.model.AddressType> getEntries() {
        return getHighSpeedVideoFpsRangesFor;
    }
}
