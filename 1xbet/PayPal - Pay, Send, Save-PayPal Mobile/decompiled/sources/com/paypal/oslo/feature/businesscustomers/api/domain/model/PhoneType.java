package com.paypal.oslo.feature.businesscustomers.api.domain.model;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0001\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t"}, d2 = {"Lcom/paypal/oslo/feature/businesscustomers/api/domain/model/PhoneType;", "", "<init>", "(Ljava/lang/String;I)V", "Companion", "FAX", "HOME", "MOBILE", "PAGER", "OTHER"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class PhoneType {
    private static final /* synthetic */ com.paypal.oslo.feature.businesscustomers.api.domain.model.PhoneType[] Camera2StreamConfigurationMap;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.businesscustomers.api.domain.model.PhoneType.Companion INSTANCE;
    public static final com.paypal.oslo.feature.businesscustomers.api.domain.model.PhoneType FAX;
    public static final com.paypal.oslo.feature.businesscustomers.api.domain.model.PhoneType HOME;
    public static final com.paypal.oslo.feature.businesscustomers.api.domain.model.PhoneType MOBILE;
    public static final com.paypal.oslo.feature.businesscustomers.api.domain.model.PhoneType OTHER;
    public static final com.paypal.oslo.feature.businesscustomers.api.domain.model.PhoneType PAGER;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoSizes;

    private PhoneType(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.businesscustomers.api.domain.model.PhoneType phoneType = new com.paypal.oslo.feature.businesscustomers.api.domain.model.PhoneType("FAX", 0);
        FAX = phoneType;
        com.paypal.oslo.feature.businesscustomers.api.domain.model.PhoneType phoneType2 = new com.paypal.oslo.feature.businesscustomers.api.domain.model.PhoneType("HOME", 1);
        HOME = phoneType2;
        com.paypal.oslo.feature.businesscustomers.api.domain.model.PhoneType phoneType3 = new com.paypal.oslo.feature.businesscustomers.api.domain.model.PhoneType("MOBILE", 2);
        MOBILE = phoneType3;
        com.paypal.oslo.feature.businesscustomers.api.domain.model.PhoneType phoneType4 = new com.paypal.oslo.feature.businesscustomers.api.domain.model.PhoneType("PAGER", 3);
        PAGER = phoneType4;
        com.paypal.oslo.feature.businesscustomers.api.domain.model.PhoneType phoneType5 = new com.paypal.oslo.feature.businesscustomers.api.domain.model.PhoneType("OTHER", 4);
        OTHER = phoneType5;
        com.paypal.oslo.feature.businesscustomers.api.domain.model.PhoneType[] phoneTypeArr = {phoneType, phoneType2, phoneType3, phoneType4, phoneType5};
        Camera2StreamConfigurationMap = phoneTypeArr;
        getHighSpeedVideoSizes = kotlin.enums.EnumEntriesKt.enumEntries(phoneTypeArr);
        INSTANCE = new com.paypal.oslo.feature.businesscustomers.api.domain.model.PhoneType.Companion(null);
    }

    @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/businesscustomers/api/domain/model/PhoneType$Companion;", "", "<init>", "()V", "", "string", "Lcom/paypal/oslo/feature/businesscustomers/api/domain/model/PhoneType;", "parse", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/businesscustomers/api/domain/model/PhoneType;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes11.dex */
    public static final class Companion {
        private Companion() {
        }

        public final com.paypal.oslo.feature.businesscustomers.api.domain.model.PhoneType parse(java.lang.String string) {
            if (string != null) {
                switch (string.hashCode()) {
                    case -2015525726:
                        if (string.equals("MOBILE")) {
                            return com.paypal.oslo.feature.businesscustomers.api.domain.model.PhoneType.MOBILE;
                        }
                        break;
                    case 69373:
                        if (string.equals("FAX")) {
                            return com.paypal.oslo.feature.businesscustomers.api.domain.model.PhoneType.FAX;
                        }
                        break;
                    case 2223327:
                        if (string.equals("HOME")) {
                            return com.paypal.oslo.feature.businesscustomers.api.domain.model.PhoneType.HOME;
                        }
                        break;
                    case 2448015:
                        if (string.equals("PAGE")) {
                            return com.paypal.oslo.feature.businesscustomers.api.domain.model.PhoneType.PAGER;
                        }
                        break;
                    case 75532016:
                        if (string.equals("OTHER")) {
                            return com.paypal.oslo.feature.businesscustomers.api.domain.model.PhoneType.OTHER;
                        }
                        break;
                }
            }
            return com.paypal.oslo.feature.businesscustomers.api.domain.model.PhoneType.OTHER;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static com.paypal.oslo.feature.businesscustomers.api.domain.model.PhoneType[] values() {
        return (com.paypal.oslo.feature.businesscustomers.api.domain.model.PhoneType[]) Camera2StreamConfigurationMap.clone();
    }

    public static com.paypal.oslo.feature.businesscustomers.api.domain.model.PhoneType valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.businesscustomers.api.domain.model.PhoneType) java.lang.Enum.valueOf(com.paypal.oslo.feature.businesscustomers.api.domain.model.PhoneType.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.businesscustomers.api.domain.model.PhoneType> getEntries() {
        return getHighSpeedVideoSizes;
    }
}
