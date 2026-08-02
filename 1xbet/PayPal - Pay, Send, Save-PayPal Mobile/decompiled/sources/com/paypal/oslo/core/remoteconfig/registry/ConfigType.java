package com.paypal.oslo.core.remoteconfig.registry;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006"}, d2 = {"Lcom/paypal/oslo/core/remoteconfig/registry/ConfigType;", "", "<init>", "(Ljava/lang/String;I)V", "FEATURE_GATE", "EXPERIMENT", "DYNAMIC_CONFIG"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ConfigType {
    public static final com.paypal.oslo.core.remoteconfig.registry.ConfigType DYNAMIC_CONFIG;
    public static final com.paypal.oslo.core.remoteconfig.registry.ConfigType EXPERIMENT;
    public static final com.paypal.oslo.core.remoteconfig.registry.ConfigType FEATURE_GATE;
    private static final /* synthetic */ com.paypal.oslo.core.remoteconfig.registry.ConfigType[] getHighResolutionOutputSizeshNQ4ISI;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRanges;

    private ConfigType(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.core.remoteconfig.registry.ConfigType configType = new com.paypal.oslo.core.remoteconfig.registry.ConfigType("FEATURE_GATE", 0);
        FEATURE_GATE = configType;
        com.paypal.oslo.core.remoteconfig.registry.ConfigType configType2 = new com.paypal.oslo.core.remoteconfig.registry.ConfigType("EXPERIMENT", 1);
        EXPERIMENT = configType2;
        com.paypal.oslo.core.remoteconfig.registry.ConfigType configType3 = new com.paypal.oslo.core.remoteconfig.registry.ConfigType("DYNAMIC_CONFIG", 2);
        DYNAMIC_CONFIG = configType3;
        com.paypal.oslo.core.remoteconfig.registry.ConfigType[] configTypeArr = {configType, configType2, configType3};
        getHighResolutionOutputSizeshNQ4ISI = configTypeArr;
        getHighSpeedVideoFpsRanges = kotlin.enums.EnumEntriesKt.enumEntries(configTypeArr);
    }

    public static com.paypal.oslo.core.remoteconfig.registry.ConfigType[] values() {
        return (com.paypal.oslo.core.remoteconfig.registry.ConfigType[]) getHighResolutionOutputSizeshNQ4ISI.clone();
    }

    public static com.paypal.oslo.core.remoteconfig.registry.ConfigType valueOf(java.lang.String str) {
        return (com.paypal.oslo.core.remoteconfig.registry.ConfigType) java.lang.Enum.valueOf(com.paypal.oslo.core.remoteconfig.registry.ConfigType.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.core.remoteconfig.registry.ConfigType> getEntries() {
        return getHighSpeedVideoFpsRanges;
    }
}
