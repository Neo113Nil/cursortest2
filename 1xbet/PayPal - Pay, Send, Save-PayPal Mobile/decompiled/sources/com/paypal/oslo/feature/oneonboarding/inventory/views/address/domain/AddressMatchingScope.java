package com.paypal.oslo.feature.oneonboarding.inventory.views.address.domain;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0006\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r"}, d2 = {"Lcom/paypal/oslo/feature/oneonboarding/inventory/views/address/domain/AddressMatchingScope;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "scopeName", "Ljava/lang/String;", "getScopeName", "()Ljava/lang/String;", "LOCALITY_LEVEL", "STREET_LEVEL", "DELIVERYPOINT_LEVEL", "ALL"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class AddressMatchingScope {
    public static final com.paypal.oslo.feature.oneonboarding.inventory.views.address.domain.AddressMatchingScope ALL;
    private static final /* synthetic */ kotlin.enums.EnumEntries Camera2StreamConfigurationMap;
    public static final com.paypal.oslo.feature.oneonboarding.inventory.views.address.domain.AddressMatchingScope DELIVERYPOINT_LEVEL;
    public static final com.paypal.oslo.feature.oneonboarding.inventory.views.address.domain.AddressMatchingScope LOCALITY_LEVEL;
    public static final com.paypal.oslo.feature.oneonboarding.inventory.views.address.domain.AddressMatchingScope STREET_LEVEL;
    private static final /* synthetic */ com.paypal.oslo.feature.oneonboarding.inventory.views.address.domain.AddressMatchingScope[] getHighSpeedVideoFpsRanges;
    private final java.lang.String scopeName;

    private AddressMatchingScope(java.lang.String str, int i, java.lang.String str2) {
        this.scopeName = str2;
    }

    public final java.lang.String getScopeName() {
        return this.scopeName;
    }

    static {
        com.paypal.oslo.feature.oneonboarding.inventory.views.address.domain.AddressMatchingScope addressMatchingScope = new com.paypal.oslo.feature.oneonboarding.inventory.views.address.domain.AddressMatchingScope("LOCALITY_LEVEL", 0, "LOCALITY_LEVEL");
        LOCALITY_LEVEL = addressMatchingScope;
        com.paypal.oslo.feature.oneonboarding.inventory.views.address.domain.AddressMatchingScope addressMatchingScope2 = new com.paypal.oslo.feature.oneonboarding.inventory.views.address.domain.AddressMatchingScope("STREET_LEVEL", 1, "STREET_LEVEL");
        STREET_LEVEL = addressMatchingScope2;
        com.paypal.oslo.feature.oneonboarding.inventory.views.address.domain.AddressMatchingScope addressMatchingScope3 = new com.paypal.oslo.feature.oneonboarding.inventory.views.address.domain.AddressMatchingScope("DELIVERYPOINT_LEVEL", 2, "DELIVERYPOINT_LEVEL");
        DELIVERYPOINT_LEVEL = addressMatchingScope3;
        com.paypal.oslo.feature.oneonboarding.inventory.views.address.domain.AddressMatchingScope addressMatchingScope4 = new com.paypal.oslo.feature.oneonboarding.inventory.views.address.domain.AddressMatchingScope("ALL", 3, "ALL");
        ALL = addressMatchingScope4;
        com.paypal.oslo.feature.oneonboarding.inventory.views.address.domain.AddressMatchingScope[] addressMatchingScopeArr = {addressMatchingScope, addressMatchingScope2, addressMatchingScope3, addressMatchingScope4};
        getHighSpeedVideoFpsRanges = addressMatchingScopeArr;
        Camera2StreamConfigurationMap = kotlin.enums.EnumEntriesKt.enumEntries(addressMatchingScopeArr);
    }

    public static com.paypal.oslo.feature.oneonboarding.inventory.views.address.domain.AddressMatchingScope[] values() {
        return (com.paypal.oslo.feature.oneonboarding.inventory.views.address.domain.AddressMatchingScope[]) getHighSpeedVideoFpsRanges.clone();
    }

    public static com.paypal.oslo.feature.oneonboarding.inventory.views.address.domain.AddressMatchingScope valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.oneonboarding.inventory.views.address.domain.AddressMatchingScope) java.lang.Enum.valueOf(com.paypal.oslo.feature.oneonboarding.inventory.views.address.domain.AddressMatchingScope.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.oneonboarding.inventory.views.address.domain.AddressMatchingScope> getEntries() {
        return Camera2StreamConfigurationMap;
    }
}
