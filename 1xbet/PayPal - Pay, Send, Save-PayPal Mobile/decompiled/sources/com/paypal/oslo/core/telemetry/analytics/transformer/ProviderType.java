package com.paypal.oslo.core.telemetry.analytics.transformer;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007"}, d2 = {"Lcom/paypal/oslo/core/telemetry/analytics/transformer/ProviderType;", "", "<init>", "(Ljava/lang/String;I)V", "DATADOG", "FPTI", "ADOBE", "PIE"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ProviderType {
    public static final com.paypal.oslo.core.telemetry.analytics.transformer.ProviderType ADOBE;
    public static final com.paypal.oslo.core.telemetry.analytics.transformer.ProviderType DATADOG;
    public static final com.paypal.oslo.core.telemetry.analytics.transformer.ProviderType FPTI;
    public static final com.paypal.oslo.core.telemetry.analytics.transformer.ProviderType PIE;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRangesFor;
    private static final /* synthetic */ com.paypal.oslo.core.telemetry.analytics.transformer.ProviderType[] getHighSpeedVideoSizes;

    private ProviderType(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.core.telemetry.analytics.transformer.ProviderType providerType = new com.paypal.oslo.core.telemetry.analytics.transformer.ProviderType("DATADOG", 0);
        DATADOG = providerType;
        com.paypal.oslo.core.telemetry.analytics.transformer.ProviderType providerType2 = new com.paypal.oslo.core.telemetry.analytics.transformer.ProviderType("FPTI", 1);
        FPTI = providerType2;
        com.paypal.oslo.core.telemetry.analytics.transformer.ProviderType providerType3 = new com.paypal.oslo.core.telemetry.analytics.transformer.ProviderType("ADOBE", 2);
        ADOBE = providerType3;
        com.paypal.oslo.core.telemetry.analytics.transformer.ProviderType providerType4 = new com.paypal.oslo.core.telemetry.analytics.transformer.ProviderType("PIE", 3);
        PIE = providerType4;
        com.paypal.oslo.core.telemetry.analytics.transformer.ProviderType[] providerTypeArr = {providerType, providerType2, providerType3, providerType4};
        getHighSpeedVideoSizes = providerTypeArr;
        getHighSpeedVideoFpsRangesFor = kotlin.enums.EnumEntriesKt.enumEntries(providerTypeArr);
    }

    public static com.paypal.oslo.core.telemetry.analytics.transformer.ProviderType[] values() {
        return (com.paypal.oslo.core.telemetry.analytics.transformer.ProviderType[]) getHighSpeedVideoSizes.clone();
    }

    public static com.paypal.oslo.core.telemetry.analytics.transformer.ProviderType valueOf(java.lang.String str) {
        return (com.paypal.oslo.core.telemetry.analytics.transformer.ProviderType) java.lang.Enum.valueOf(com.paypal.oslo.core.telemetry.analytics.transformer.ProviderType.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.core.telemetry.analytics.transformer.ProviderType> getEntries() {
        return getHighSpeedVideoFpsRangesFor;
    }
}
