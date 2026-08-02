package com.paypal.oslo.feature.businesscustomers.api.domain.model;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0001\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007"}, d2 = {"Lcom/paypal/oslo/feature/businesscustomers/api/domain/model/CustomerType;", "", "<init>", "(Ljava/lang/String;I)V", "Companion", "USER", "EXTERNAL_CONTACT", "UNKNOWN"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class CustomerType {
    private static final /* synthetic */ com.paypal.oslo.feature.businesscustomers.api.domain.model.CustomerType[] Camera2StreamConfigurationMap;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.businesscustomers.api.domain.model.CustomerType.Companion INSTANCE;
    public static final com.paypal.oslo.feature.businesscustomers.api.domain.model.CustomerType EXTERNAL_CONTACT;
    public static final com.paypal.oslo.feature.businesscustomers.api.domain.model.CustomerType UNKNOWN;
    public static final com.paypal.oslo.feature.businesscustomers.api.domain.model.CustomerType USER;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoSizes;

    private CustomerType(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.businesscustomers.api.domain.model.CustomerType customerType = new com.paypal.oslo.feature.businesscustomers.api.domain.model.CustomerType("USER", 0);
        USER = customerType;
        com.paypal.oslo.feature.businesscustomers.api.domain.model.CustomerType customerType2 = new com.paypal.oslo.feature.businesscustomers.api.domain.model.CustomerType("EXTERNAL_CONTACT", 1);
        EXTERNAL_CONTACT = customerType2;
        com.paypal.oslo.feature.businesscustomers.api.domain.model.CustomerType customerType3 = new com.paypal.oslo.feature.businesscustomers.api.domain.model.CustomerType("UNKNOWN", 2);
        UNKNOWN = customerType3;
        com.paypal.oslo.feature.businesscustomers.api.domain.model.CustomerType[] customerTypeArr = {customerType, customerType2, customerType3};
        Camera2StreamConfigurationMap = customerTypeArr;
        getHighSpeedVideoSizes = kotlin.enums.EnumEntriesKt.enumEntries(customerTypeArr);
        INSTANCE = new com.paypal.oslo.feature.businesscustomers.api.domain.model.CustomerType.Companion(null);
    }

    @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/businesscustomers/api/domain/model/CustomerType$Companion;", "", "<init>", "()V", "", "string", "Lcom/paypal/oslo/feature/businesscustomers/api/domain/model/CustomerType;", "parse", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/businesscustomers/api/domain/model/CustomerType;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes11.dex */
    public static final class Companion {
        private Companion() {
        }

        public final com.paypal.oslo.feature.businesscustomers.api.domain.model.CustomerType parse(java.lang.String string) {
            return kotlin.jvm.internal.Intrinsics.areEqual(string, "USER") ? com.paypal.oslo.feature.businesscustomers.api.domain.model.CustomerType.USER : kotlin.jvm.internal.Intrinsics.areEqual(string, "EXTERNAL_CONTACT") ? com.paypal.oslo.feature.businesscustomers.api.domain.model.CustomerType.EXTERNAL_CONTACT : com.paypal.oslo.feature.businesscustomers.api.domain.model.CustomerType.UNKNOWN;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static com.paypal.oslo.feature.businesscustomers.api.domain.model.CustomerType[] values() {
        return (com.paypal.oslo.feature.businesscustomers.api.domain.model.CustomerType[]) Camera2StreamConfigurationMap.clone();
    }

    public static com.paypal.oslo.feature.businesscustomers.api.domain.model.CustomerType valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.businesscustomers.api.domain.model.CustomerType) java.lang.Enum.valueOf(com.paypal.oslo.feature.businesscustomers.api.domain.model.CustomerType.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.businesscustomers.api.domain.model.CustomerType> getEntries() {
        return getHighSpeedVideoSizes;
    }
}
