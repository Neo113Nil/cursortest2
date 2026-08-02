package com.paypal.oslo.core.telemetry.vendors.adobe.environment;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u000f\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\r\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0011\u001a\u00020\u00138C@CX\u0082\u008c\u0002¢\u0006\u0006\n\u0004\b\u000f\u0010\u0014"}, d2 = {"Lcom/paypal/oslo/core/telemetry/vendors/adobe/environment/AdobeEnvironmentManagerImpl;", "Lcom/paypal/oslo/core/telemetry/vendors/adobe/environment/AdobeEnvironmentManager;", "Lcom/paypal/oslo/core/persistence/appstorage/AppStorage;", "appStorage", "<init>", "(Lcom/paypal/oslo/core/persistence/appstorage/AppStorage;)V", "Lcom/paypal/oslo/core/telemetry/vendors/adobe/environment/AdobeEnvironmentType;", "environmentType", "()Lcom/paypal/oslo/core/telemetry/vendors/adobe/environment/AdobeEnvironmentType;", "type", "", "setEnvironmentType", "(Lcom/paypal/oslo/core/telemetry/vendors/adobe/environment/AdobeEnvironmentType;)V", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/core/persistence/appstorage/AppStorage;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/core/persistence/appstorage/AppStorageKey$Unencrypted;", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/core/persistence/appstorage/AppStorageKey$Unencrypted;", "", "Lkotlin/properties/ReadWriteProperty;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class AdobeEnvironmentManagerImpl implements com.paypal.oslo.core.telemetry.vendors.adobe.environment.AdobeEnvironmentManager {

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final kotlin.properties.ReadWriteProperty getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.core.persistence.appstorage.AppStorage getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.core.persistence.appstorage.AppStorageKey.Unencrypted getHighSpeedVideoFpsRanges;
    static final /* synthetic */ kotlin.reflect.KProperty<java.lang.Object>[] getHighSpeedVideoSizes = {kotlin.jvm.internal.Reflection.mutableProperty1(new kotlin.jvm.internal.MutablePropertyReference1Impl(com.paypal.oslo.core.telemetry.vendors.adobe.environment.AdobeEnvironmentManagerImpl.class, "environmentTypeString", "getEnvironmentTypeString()Ljava/lang/String;", 0))};
    public static final int $stable = 8;

    @javax.inject.Inject
    public AdobeEnvironmentManagerImpl(com.paypal.oslo.core.persistence.appstorage.AppStorage appStorage) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appStorage, "");
        this.getHighResolutionOutputSizeshNQ4ISI = appStorage;
        com.paypal.oslo.core.persistence.appstorage.AppStorageKey.Unencrypted unencrypted = new com.paypal.oslo.core.persistence.appstorage.AppStorageKey.Unencrypted("adobe_environment_key");
        this.getHighSpeedVideoFpsRanges = unencrypted;
        this.getHighSpeedVideoFpsRangesFor = appStorage.string(unencrypted, "PROD");
    }

    @Override // com.paypal.oslo.core.telemetry.vendors.adobe.environment.AdobeEnvironmentManager
    public final com.paypal.oslo.core.telemetry.vendors.adobe.environment.AdobeEnvironmentType environmentType() {
        java.lang.Object obj;
        java.util.Iterator<E> it = com.paypal.oslo.core.telemetry.vendors.adobe.environment.AdobeEnvironmentType.getEntries().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.core.telemetry.vendors.adobe.environment.AdobeEnvironmentType) obj).name(), (java.lang.String) this.getHighSpeedVideoFpsRangesFor.getValue(this, getHighSpeedVideoSizes[0]))) {
                break;
            }
        }
        com.paypal.oslo.core.telemetry.vendors.adobe.environment.AdobeEnvironmentType adobeEnvironmentType = (com.paypal.oslo.core.telemetry.vendors.adobe.environment.AdobeEnvironmentType) obj;
        return adobeEnvironmentType == null ? com.paypal.oslo.core.telemetry.vendors.adobe.environment.AdobeEnvironmentType.PROD : adobeEnvironmentType;
    }

    @Override // com.paypal.oslo.core.telemetry.vendors.adobe.environment.AdobeEnvironmentManager
    public final void setEnvironmentType(com.paypal.oslo.core.telemetry.vendors.adobe.environment.AdobeEnvironmentType type) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "");
        this.getHighSpeedVideoFpsRangesFor.setValue(this, getHighSpeedVideoSizes[0], type.name());
    }
}
