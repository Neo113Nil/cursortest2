package com.paypal.oslo.feature.dataprivacy.ui.model;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\r\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0019\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0007\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\b\u001a\u0004\b\f\u0010\nj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f"}, d2 = {"Lcom/paypal/oslo/feature/dataprivacy/ui/model/DataPrivacyL2Settings;", "", "", "p0", "p1", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", "key", "Ljava/lang/String;", "getKey", "()Ljava/lang/String;", "configKey", "getConfigKey", "DOWNLOAD_YOUR_DATA", "DELETE_YOUR_DATA", "FACE_SCAN_DATA"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class DataPrivacyL2Settings {
    private static final /* synthetic */ com.paypal.oslo.feature.dataprivacy.ui.model.DataPrivacyL2Settings[] Camera2StreamConfigurationMap;
    public static final com.paypal.oslo.feature.dataprivacy.ui.model.DataPrivacyL2Settings DELETE_YOUR_DATA;
    public static final com.paypal.oslo.feature.dataprivacy.ui.model.DataPrivacyL2Settings DOWNLOAD_YOUR_DATA;
    public static final com.paypal.oslo.feature.dataprivacy.ui.model.DataPrivacyL2Settings FACE_SCAN_DATA;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRanges;
    private final java.lang.String configKey;
    private final java.lang.String key;

    private DataPrivacyL2Settings(java.lang.String str, int i, java.lang.String str2, java.lang.String str3) {
        this.key = str2;
        this.configKey = str3;
    }

    public final java.lang.String getKey() {
        return this.key;
    }

    public final java.lang.String getConfigKey() {
        return this.configKey;
    }

    static {
        com.paypal.oslo.feature.dataprivacy.ui.model.DataPrivacyL2Settings dataPrivacyL2Settings = new com.paypal.oslo.feature.dataprivacy.ui.model.DataPrivacyL2Settings("DOWNLOAD_YOUR_DATA", 0, "download_your_data", com.paypal.oslo.feature.dataprivacy.config.DataPrivacyL2EnabledFeaturesSpecs.L2Settings.DOWNLOAD.getKey());
        DOWNLOAD_YOUR_DATA = dataPrivacyL2Settings;
        com.paypal.oslo.feature.dataprivacy.ui.model.DataPrivacyL2Settings dataPrivacyL2Settings2 = new com.paypal.oslo.feature.dataprivacy.ui.model.DataPrivacyL2Settings("DELETE_YOUR_DATA", 1, "delete_your_data", com.paypal.oslo.feature.dataprivacy.config.DataPrivacyL2EnabledFeaturesSpecs.L2Settings.DELETE_DATA.getKey());
        DELETE_YOUR_DATA = dataPrivacyL2Settings2;
        com.paypal.oslo.feature.dataprivacy.ui.model.DataPrivacyL2Settings dataPrivacyL2Settings3 = new com.paypal.oslo.feature.dataprivacy.ui.model.DataPrivacyL2Settings("FACE_SCAN_DATA", 2, "face_scan_data", com.paypal.oslo.feature.dataprivacy.config.DataPrivacyL2EnabledFeaturesSpecs.L2Settings.FACE_SCAN.getKey());
        FACE_SCAN_DATA = dataPrivacyL2Settings3;
        com.paypal.oslo.feature.dataprivacy.ui.model.DataPrivacyL2Settings[] dataPrivacyL2SettingsArr = {dataPrivacyL2Settings, dataPrivacyL2Settings2, dataPrivacyL2Settings3};
        Camera2StreamConfigurationMap = dataPrivacyL2SettingsArr;
        getHighSpeedVideoFpsRanges = kotlin.enums.EnumEntriesKt.enumEntries(dataPrivacyL2SettingsArr);
    }

    public static com.paypal.oslo.feature.dataprivacy.ui.model.DataPrivacyL2Settings[] values() {
        return (com.paypal.oslo.feature.dataprivacy.ui.model.DataPrivacyL2Settings[]) Camera2StreamConfigurationMap.clone();
    }

    public static com.paypal.oslo.feature.dataprivacy.ui.model.DataPrivacyL2Settings valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.dataprivacy.ui.model.DataPrivacyL2Settings) java.lang.Enum.valueOf(com.paypal.oslo.feature.dataprivacy.ui.model.DataPrivacyL2Settings.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.dataprivacy.ui.model.DataPrivacyL2Settings> getEntries() {
        return getHighSpeedVideoFpsRanges;
    }
}
