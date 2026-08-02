package com.paypal.android.threeds.init;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005"}, d2 = {"Lcom/paypal/android/threeds/init/ThreeEnvironment;", "", "<init>", "(Ljava/lang/String;I)V", "STAGING", "PRODUCTION"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class ThreeEnvironment {
    public static final com.paypal.android.threeds.init.ThreeEnvironment PRODUCTION;
    public static final com.paypal.android.threeds.init.ThreeEnvironment STAGING;
    private static final /* synthetic */ com.paypal.android.threeds.init.ThreeEnvironment[] getHighSpeedVideoFpsRanges;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoSizes;

    private ThreeEnvironment(java.lang.String str, int i) {
    }

    static {
        com.paypal.android.threeds.init.ThreeEnvironment threeEnvironment = new com.paypal.android.threeds.init.ThreeEnvironment("STAGING", 0);
        STAGING = threeEnvironment;
        com.paypal.android.threeds.init.ThreeEnvironment threeEnvironment2 = new com.paypal.android.threeds.init.ThreeEnvironment("PRODUCTION", 1);
        PRODUCTION = threeEnvironment2;
        com.paypal.android.threeds.init.ThreeEnvironment[] threeEnvironmentArr = {threeEnvironment, threeEnvironment2};
        getHighSpeedVideoFpsRanges = threeEnvironmentArr;
        getHighSpeedVideoSizes = kotlin.enums.EnumEntriesKt.enumEntries(threeEnvironmentArr);
    }

    public static com.paypal.android.threeds.init.ThreeEnvironment[] values() {
        return (com.paypal.android.threeds.init.ThreeEnvironment[]) getHighSpeedVideoFpsRanges.clone();
    }

    public static com.paypal.android.threeds.init.ThreeEnvironment valueOf(java.lang.String str) {
        return (com.paypal.android.threeds.init.ThreeEnvironment) java.lang.Enum.valueOf(com.paypal.android.threeds.init.ThreeEnvironment.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.android.threeds.init.ThreeEnvironment> getEntries() {
        return getHighSpeedVideoSizes;
    }
}
