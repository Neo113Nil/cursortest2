package com.paypal.oslo.feature.dataprivacy.config;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\rB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R-\u0010\f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00050\u00048GX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/dataprivacy/config/DataPrivacyL2EnabledFeaturesSpecs;", "Lcom/paypal/oslo/core/remoteconfig/contract/DynamicConfigurationSpec;", "<init>", "()V", "Lcom/paypal/oslo/core/remoteconfig/contract/RemoteConfigAnyKey;", "", "", "", "allRows$delegate", "Lkotlin/properties/ReadOnlyProperty;", "getAllRows", "()Lcom/paypal/oslo/core/remoteconfig/contract/RemoteConfigAnyKey;", "allRows", "L2Settings"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class DataPrivacyL2EnabledFeaturesSpecs extends com.paypal.oslo.core.remoteconfig.contract.DynamicConfigurationSpec {
    public static final int $stable;
    public static final com.paypal.oslo.feature.dataprivacy.config.DataPrivacyL2EnabledFeaturesSpecs INSTANCE;

    /* renamed from: allRows$delegate, reason: from kotlin metadata */
    private static final kotlin.properties.ReadOnlyProperty allRows;
    static final /* synthetic */ kotlin.reflect.KProperty<java.lang.Object>[] getHighSpeedVideoSizes;

    private DataPrivacyL2EnabledFeaturesSpecs() {
        super("data_privacy", "l2_enabled_rows");
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0006\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f"}, d2 = {"Lcom/paypal/oslo/feature/dataprivacy/config/DataPrivacyL2EnabledFeaturesSpecs$L2Settings;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "key", "Ljava/lang/String;", "getKey", "()Ljava/lang/String;", "DOWNLOAD", "DELETE_DATA", "FACE_SCAN"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class L2Settings {
        public static final com.paypal.oslo.feature.dataprivacy.config.DataPrivacyL2EnabledFeaturesSpecs.L2Settings DELETE_DATA;
        public static final com.paypal.oslo.feature.dataprivacy.config.DataPrivacyL2EnabledFeaturesSpecs.L2Settings DOWNLOAD;
        public static final com.paypal.oslo.feature.dataprivacy.config.DataPrivacyL2EnabledFeaturesSpecs.L2Settings FACE_SCAN;
        private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRangesFor;
        private static final /* synthetic */ com.paypal.oslo.feature.dataprivacy.config.DataPrivacyL2EnabledFeaturesSpecs.L2Settings[] getHighSpeedVideoSizes;
        private final java.lang.String key;

        private L2Settings(java.lang.String str, int i, java.lang.String str2) {
            this.key = str2;
        }

        public final java.lang.String getKey() {
            return this.key;
        }

        static {
            com.paypal.oslo.feature.dataprivacy.config.DataPrivacyL2EnabledFeaturesSpecs.L2Settings l2Settings = new com.paypal.oslo.feature.dataprivacy.config.DataPrivacyL2EnabledFeaturesSpecs.L2Settings("DOWNLOAD", 0, "data_privacy.your_data.download");
            DOWNLOAD = l2Settings;
            com.paypal.oslo.feature.dataprivacy.config.DataPrivacyL2EnabledFeaturesSpecs.L2Settings l2Settings2 = new com.paypal.oslo.feature.dataprivacy.config.DataPrivacyL2EnabledFeaturesSpecs.L2Settings("DELETE_DATA", 1, "data_privacy.your_data.delete_data");
            DELETE_DATA = l2Settings2;
            com.paypal.oslo.feature.dataprivacy.config.DataPrivacyL2EnabledFeaturesSpecs.L2Settings l2Settings3 = new com.paypal.oslo.feature.dataprivacy.config.DataPrivacyL2EnabledFeaturesSpecs.L2Settings("FACE_SCAN", 2, "data_privacy.your_data.face_scan");
            FACE_SCAN = l2Settings3;
            com.paypal.oslo.feature.dataprivacy.config.DataPrivacyL2EnabledFeaturesSpecs.L2Settings[] l2SettingsArr = {l2Settings, l2Settings2, l2Settings3};
            getHighSpeedVideoSizes = l2SettingsArr;
            getHighSpeedVideoFpsRangesFor = kotlin.enums.EnumEntriesKt.enumEntries(l2SettingsArr);
        }

        public static com.paypal.oslo.feature.dataprivacy.config.DataPrivacyL2EnabledFeaturesSpecs.L2Settings[] values() {
            return (com.paypal.oslo.feature.dataprivacy.config.DataPrivacyL2EnabledFeaturesSpecs.L2Settings[]) getHighSpeedVideoSizes.clone();
        }

        public static com.paypal.oslo.feature.dataprivacy.config.DataPrivacyL2EnabledFeaturesSpecs.L2Settings valueOf(java.lang.String str) {
            return (com.paypal.oslo.feature.dataprivacy.config.DataPrivacyL2EnabledFeaturesSpecs.L2Settings) java.lang.Enum.valueOf(com.paypal.oslo.feature.dataprivacy.config.DataPrivacyL2EnabledFeaturesSpecs.L2Settings.class, str);
        }

        public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.dataprivacy.config.DataPrivacyL2EnabledFeaturesSpecs.L2Settings> getEntries() {
            return getHighSpeedVideoFpsRangesFor;
        }
    }

    public final com.paypal.oslo.core.remoteconfig.contract.RemoteConfigAnyKey<java.util.Map<java.lang.String, java.lang.Boolean>> getAllRows() {
        return (com.paypal.oslo.core.remoteconfig.contract.RemoteConfigAnyKey) allRows.getValue(this, getHighSpeedVideoSizes[0]);
    }

    static {
        java.lang.Boolean bool = java.lang.Boolean.TRUE;
        getHighSpeedVideoSizes = new kotlin.reflect.KProperty[]{kotlin.jvm.internal.Reflection.property1(new kotlin.jvm.internal.PropertyReference1Impl(com.paypal.oslo.feature.dataprivacy.config.DataPrivacyL2EnabledFeaturesSpecs.class, "allRows", "getAllRows()Lcom/paypal/oslo/core/remoteconfig/contract/RemoteConfigAnyKey;", 0))};
        com.paypal.oslo.feature.dataprivacy.config.DataPrivacyL2EnabledFeaturesSpecs dataPrivacyL2EnabledFeaturesSpecs = new com.paypal.oslo.feature.dataprivacy.config.DataPrivacyL2EnabledFeaturesSpecs();
        INSTANCE = dataPrivacyL2EnabledFeaturesSpecs;
        allRows = dataPrivacyL2EnabledFeaturesSpecs.create(kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.paypal.oslo.feature.dataprivacy.config.DataPrivacyL2EnabledFeaturesSpecs.L2Settings.DOWNLOAD.getKey(), bool), kotlin.TuplesKt.to(com.paypal.oslo.feature.dataprivacy.config.DataPrivacyL2EnabledFeaturesSpecs.L2Settings.DELETE_DATA.getKey(), bool), kotlin.TuplesKt.to(com.paypal.oslo.feature.dataprivacy.config.DataPrivacyL2EnabledFeaturesSpecs.L2Settings.FACE_SCAN.getKey(), bool)), "rows");
        $stable = 8;
    }
}
