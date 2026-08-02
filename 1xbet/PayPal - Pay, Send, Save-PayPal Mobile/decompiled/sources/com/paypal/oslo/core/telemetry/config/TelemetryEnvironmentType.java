package com.paypal.oslo.core.telemetry.config;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0006\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\nj\u0002\b\u000b"}, d2 = {"Lcom/paypal/oslo/core/telemetry/config/TelemetryEnvironmentType;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "PROD", "STAGE"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class TelemetryEnvironmentType {
    private static final /* synthetic */ kotlin.enums.EnumEntries Camera2StreamConfigurationMap;
    public static final com.paypal.oslo.core.telemetry.config.TelemetryEnvironmentType PROD;
    public static final com.paypal.oslo.core.telemetry.config.TelemetryEnvironmentType STAGE;
    private static final /* synthetic */ com.paypal.oslo.core.telemetry.config.TelemetryEnvironmentType[] getHighSpeedVideoSizes;
    private final java.lang.String value;

    private TelemetryEnvironmentType(java.lang.String str, int i, java.lang.String str2) {
        this.value = str2;
    }

    public final java.lang.String getValue() {
        return this.value;
    }

    static {
        com.paypal.oslo.core.telemetry.config.TelemetryEnvironmentType telemetryEnvironmentType = new com.paypal.oslo.core.telemetry.config.TelemetryEnvironmentType("PROD", 0, "prod");
        PROD = telemetryEnvironmentType;
        com.paypal.oslo.core.telemetry.config.TelemetryEnvironmentType telemetryEnvironmentType2 = new com.paypal.oslo.core.telemetry.config.TelemetryEnvironmentType("STAGE", 1, "stage");
        STAGE = telemetryEnvironmentType2;
        com.paypal.oslo.core.telemetry.config.TelemetryEnvironmentType[] telemetryEnvironmentTypeArr = {telemetryEnvironmentType, telemetryEnvironmentType2};
        getHighSpeedVideoSizes = telemetryEnvironmentTypeArr;
        Camera2StreamConfigurationMap = kotlin.enums.EnumEntriesKt.enumEntries(telemetryEnvironmentTypeArr);
    }

    public static com.paypal.oslo.core.telemetry.config.TelemetryEnvironmentType[] values() {
        return (com.paypal.oslo.core.telemetry.config.TelemetryEnvironmentType[]) getHighSpeedVideoSizes.clone();
    }

    public static com.paypal.oslo.core.telemetry.config.TelemetryEnvironmentType valueOf(java.lang.String str) {
        return (com.paypal.oslo.core.telemetry.config.TelemetryEnvironmentType) java.lang.Enum.valueOf(com.paypal.oslo.core.telemetry.config.TelemetryEnvironmentType.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.core.telemetry.config.TelemetryEnvironmentType> getEntries() {
        return Camera2StreamConfigurationMap;
    }
}
