package com.paypal.oslo.feature.taptopay.data.wallet;

@javax.inject.Singleton
@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\n\b\u0001\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\f\u001a\u00020\t¢\u0006\u0004\b\f\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0012\u001a\u00020\u00068C@CX\u0083\u008c\u0002¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/data/wallet/ImplementationSelector;", "", "Lcom/paypal/oslo/core/persistence/appstorage/AppStorage;", "appStorage", "<init>", "(Lcom/paypal/oslo/core/persistence/appstorage/AppStorage;)V", "", "getSelectedVendor", "()Ljava/lang/String;", "", "useThalesImplementation", "()V", "usePayairImplementation", "Lcom/paypal/oslo/core/persistence/appstorage/AppStorage;", "getAppStorage", "()Lcom/paypal/oslo/core/persistence/appstorage/AppStorage;", "getHighSpeedVideoFpsRangesFor", "Lkotlin/properties/ReadWriteProperty;", "Camera2StreamConfigurationMap", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ImplementationSelector {
    public static final java.lang.String DEFAULT_VENDOR = "payair";
    public static final java.lang.String VENDOR_PAYAIR = "payair";
    public static final java.lang.String VENDOR_THALES = "thales";
    private final com.paypal.oslo.core.persistence.appstorage.AppStorage appStorage;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final kotlin.properties.ReadWriteProperty Camera2StreamConfigurationMap;
    static final /* synthetic */ kotlin.reflect.KProperty<java.lang.Object>[] Camera2StreamConfigurationMap = {kotlin.jvm.internal.Reflection.mutableProperty1(new kotlin.jvm.internal.MutablePropertyReference1Impl(com.paypal.oslo.feature.taptopay.data.wallet.ImplementationSelector.class, "storedVendor", "getStoredVendor()Ljava/lang/String;", 0))};
    public static final int $stable = 8;

    @javax.inject.Inject
    public ImplementationSelector(com.paypal.oslo.core.persistence.appstorage.AppStorage appStorage) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appStorage, "");
        this.appStorage = appStorage;
        this.Camera2StreamConfigurationMap = appStorage.string(com.paypal.oslo.feature.taptopay.data.wallet.TapToPayStorageKeys.INSTANCE.getSELECTED_VENDOR(), "payair");
    }

    public final com.paypal.oslo.core.persistence.appstorage.AppStorage getAppStorage() {
        return this.appStorage;
    }

    public final java.lang.String getSelectedVendor() {
        kotlin.properties.ReadWriteProperty readWriteProperty = this.Camera2StreamConfigurationMap;
        kotlin.reflect.KProperty<?>[] kPropertyArr = Camera2StreamConfigurationMap;
        java.lang.String str = (java.lang.String) readWriteProperty.getValue(this, kPropertyArr[0]);
        return (kotlin.jvm.internal.Intrinsics.areEqual(str, "thales") || kotlin.jvm.internal.Intrinsics.areEqual(str, "payair")) ? (java.lang.String) this.Camera2StreamConfigurationMap.getValue(this, kPropertyArr[0]) : "payair";
    }

    public final void usePayairImplementation() {
        this.Camera2StreamConfigurationMap.setValue(this, Camera2StreamConfigurationMap[0], "payair");
    }

    public final void useThalesImplementation() {
        this.Camera2StreamConfigurationMap.setValue(this, Camera2StreamConfigurationMap[0], "thales");
    }
}
