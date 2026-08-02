package com.zettle.o11y.android.core.configuration;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0006\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f"}, d2 = {"Lcom/zettle/o11y/android/core/configuration/O11YEnvironment;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "envName", "Ljava/lang/String;", "getEnvName", "()Ljava/lang/String;", "PRODUCTION", "SANDBOX", "STAGING"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class O11YEnvironment {
    public static final com.zettle.o11y.android.core.configuration.O11YEnvironment PRODUCTION;
    public static final com.zettle.o11y.android.core.configuration.O11YEnvironment SANDBOX;
    public static final com.zettle.o11y.android.core.configuration.O11YEnvironment STAGING;
    private static final /* synthetic */ com.zettle.o11y.android.core.configuration.O11YEnvironment[] getHighResolutionOutputSizeshNQ4ISI;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRanges;
    private final java.lang.String envName;

    private O11YEnvironment(java.lang.String str, int i, java.lang.String str2) {
        this.envName = str2;
    }

    public final java.lang.String getEnvName() {
        return this.envName;
    }

    static {
        com.zettle.o11y.android.core.configuration.O11YEnvironment o11YEnvironment = new com.zettle.o11y.android.core.configuration.O11YEnvironment("PRODUCTION", 0, com.adjust.sdk.AdjustConfig.ENVIRONMENT_PRODUCTION);
        PRODUCTION = o11YEnvironment;
        com.zettle.o11y.android.core.configuration.O11YEnvironment o11YEnvironment2 = new com.zettle.o11y.android.core.configuration.O11YEnvironment("SANDBOX", 1, com.adjust.sdk.AdjustConfig.ENVIRONMENT_SANDBOX);
        SANDBOX = o11YEnvironment2;
        com.zettle.o11y.android.core.configuration.O11YEnvironment o11YEnvironment3 = new com.zettle.o11y.android.core.configuration.O11YEnvironment("STAGING", 2, "staging");
        STAGING = o11YEnvironment3;
        com.zettle.o11y.android.core.configuration.O11YEnvironment[] o11YEnvironmentArr = {o11YEnvironment, o11YEnvironment2, o11YEnvironment3};
        getHighResolutionOutputSizeshNQ4ISI = o11YEnvironmentArr;
        getHighSpeedVideoFpsRanges = kotlin.enums.EnumEntriesKt.enumEntries(o11YEnvironmentArr);
    }

    public static com.zettle.o11y.android.core.configuration.O11YEnvironment[] values() {
        return (com.zettle.o11y.android.core.configuration.O11YEnvironment[]) getHighResolutionOutputSizeshNQ4ISI.clone();
    }

    public static com.zettle.o11y.android.core.configuration.O11YEnvironment valueOf(java.lang.String str) {
        return (com.zettle.o11y.android.core.configuration.O11YEnvironment) java.lang.Enum.valueOf(com.zettle.o11y.android.core.configuration.O11YEnvironment.class, str);
    }

    public static kotlin.enums.EnumEntries<com.zettle.o11y.android.core.configuration.O11YEnvironment> getEntries() {
        return getHighSpeedVideoFpsRanges;
    }
}
