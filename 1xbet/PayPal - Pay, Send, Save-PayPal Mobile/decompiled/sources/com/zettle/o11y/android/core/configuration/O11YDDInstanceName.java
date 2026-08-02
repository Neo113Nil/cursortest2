package com.zettle.o11y.android.core.configuration;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0006\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\nj\u0002\b\u000b"}, d2 = {"Lcom/zettle/o11y/android/core/configuration/O11YDDInstanceName;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "instanceName", "Ljava/lang/String;", "getInstanceName", "()Ljava/lang/String;", "POS", "PAYMENT_SDK"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class O11YDDInstanceName {
    public static final com.zettle.o11y.android.core.configuration.O11YDDInstanceName PAYMENT_SDK;
    public static final com.zettle.o11y.android.core.configuration.O11YDDInstanceName POS;
    private static final /* synthetic */ com.zettle.o11y.android.core.configuration.O11YDDInstanceName[] getHighResolutionOutputSizeshNQ4ISI;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRanges;
    private final java.lang.String instanceName;

    private O11YDDInstanceName(java.lang.String str, int i, java.lang.String str2) {
        this.instanceName = str2;
    }

    public final java.lang.String getInstanceName() {
        return this.instanceName;
    }

    static {
        com.zettle.o11y.android.core.configuration.O11YDDInstanceName o11YDDInstanceName = new com.zettle.o11y.android.core.configuration.O11YDDInstanceName("POS", 0, "com.izettle.android");
        POS = o11YDDInstanceName;
        com.zettle.o11y.android.core.configuration.O11YDDInstanceName o11YDDInstanceName2 = new com.zettle.o11y.android.core.configuration.O11YDDInstanceName("PAYMENT_SDK", 1, com.zettle.sdk.BuildConfig.LIBRARY_PACKAGE_NAME);
        PAYMENT_SDK = o11YDDInstanceName2;
        com.zettle.o11y.android.core.configuration.O11YDDInstanceName[] o11YDDInstanceNameArr = {o11YDDInstanceName, o11YDDInstanceName2};
        getHighResolutionOutputSizeshNQ4ISI = o11YDDInstanceNameArr;
        getHighSpeedVideoFpsRanges = kotlin.enums.EnumEntriesKt.enumEntries(o11YDDInstanceNameArr);
    }

    public static com.zettle.o11y.android.core.configuration.O11YDDInstanceName[] values() {
        return (com.zettle.o11y.android.core.configuration.O11YDDInstanceName[]) getHighResolutionOutputSizeshNQ4ISI.clone();
    }

    public static com.zettle.o11y.android.core.configuration.O11YDDInstanceName valueOf(java.lang.String str) {
        return (com.zettle.o11y.android.core.configuration.O11YDDInstanceName) java.lang.Enum.valueOf(com.zettle.o11y.android.core.configuration.O11YDDInstanceName.class, str);
    }

    public static kotlin.enums.EnumEntries<com.zettle.o11y.android.core.configuration.O11YDDInstanceName> getEntries() {
        return getHighSpeedVideoFpsRanges;
    }
}
