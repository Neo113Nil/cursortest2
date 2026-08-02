package com.paypal.oslo.core.telemetry.vendors.adobe.environment;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u00028\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\nj\u0002\b\u000b"}, d2 = {"Lcom/paypal/oslo/core/telemetry/vendors/adobe/environment/AdobeEnvironmentType;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "appId", "Ljava/lang/String;", "getAppId$telemetry_release", "()Ljava/lang/String;", "PROD", "STAGE"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class AdobeEnvironmentType {
    private static final /* synthetic */ com.paypal.oslo.core.telemetry.vendors.adobe.environment.AdobeEnvironmentType[] Camera2StreamConfigurationMap;
    public static final com.paypal.oslo.core.telemetry.vendors.adobe.environment.AdobeEnvironmentType PROD;
    public static final com.paypal.oslo.core.telemetry.vendors.adobe.environment.AdobeEnvironmentType STAGE;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighResolutionOutputSizeshNQ4ISI;
    private final java.lang.String appId;

    private AdobeEnvironmentType(java.lang.String str, int i, java.lang.String str2) {
        this.appId = str2;
    }

    /* renamed from: getAppId$telemetry_release, reason: from getter */
    public final java.lang.String getAppId() {
        return this.appId;
    }

    static {
        com.paypal.oslo.core.telemetry.vendors.adobe.environment.AdobeEnvironmentType adobeEnvironmentType = new com.paypal.oslo.core.telemetry.vendors.adobe.environment.AdobeEnvironmentType("PROD", 0, com.paypal.oslo.core.telemetry.BuildConfig.ADOBE_APP_ID_PROD);
        PROD = adobeEnvironmentType;
        com.paypal.oslo.core.telemetry.vendors.adobe.environment.AdobeEnvironmentType adobeEnvironmentType2 = new com.paypal.oslo.core.telemetry.vendors.adobe.environment.AdobeEnvironmentType("STAGE", 1, com.paypal.oslo.core.telemetry.BuildConfig.ADOBE_APP_ID_STAGE);
        STAGE = adobeEnvironmentType2;
        com.paypal.oslo.core.telemetry.vendors.adobe.environment.AdobeEnvironmentType[] adobeEnvironmentTypeArr = {adobeEnvironmentType, adobeEnvironmentType2};
        Camera2StreamConfigurationMap = adobeEnvironmentTypeArr;
        getHighResolutionOutputSizeshNQ4ISI = kotlin.enums.EnumEntriesKt.enumEntries(adobeEnvironmentTypeArr);
    }

    public static com.paypal.oslo.core.telemetry.vendors.adobe.environment.AdobeEnvironmentType[] values() {
        return (com.paypal.oslo.core.telemetry.vendors.adobe.environment.AdobeEnvironmentType[]) Camera2StreamConfigurationMap.clone();
    }

    public static com.paypal.oslo.core.telemetry.vendors.adobe.environment.AdobeEnvironmentType valueOf(java.lang.String str) {
        return (com.paypal.oslo.core.telemetry.vendors.adobe.environment.AdobeEnvironmentType) java.lang.Enum.valueOf(com.paypal.oslo.core.telemetry.vendors.adobe.environment.AdobeEnvironmentType.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.core.telemetry.vendors.adobe.environment.AdobeEnvironmentType> getEntries() {
        return getHighResolutionOutputSizeshNQ4ISI;
    }
}
