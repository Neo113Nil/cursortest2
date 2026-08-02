package com.paypal.android.threeds.init;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0006\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f"}, d2 = {"Lcom/paypal/android/threeds/init/ThreeDsUiType;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "code", "Ljava/lang/String;", "getCode", "()Ljava/lang/String;", "NATIVE", "HTML", "BOTH"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class ThreeDsUiType {
    public static final com.paypal.android.threeds.init.ThreeDsUiType BOTH;
    private static final /* synthetic */ kotlin.enums.EnumEntries Camera2StreamConfigurationMap;
    public static final com.paypal.android.threeds.init.ThreeDsUiType HTML;
    public static final com.paypal.android.threeds.init.ThreeDsUiType NATIVE;
    private static final /* synthetic */ com.paypal.android.threeds.init.ThreeDsUiType[] getHighResolutionOutputSizeshNQ4ISI;
    private final java.lang.String code;

    private ThreeDsUiType(java.lang.String str, int i, java.lang.String str2) {
        this.code = str2;
    }

    public final java.lang.String getCode() {
        return this.code;
    }

    static {
        com.paypal.android.threeds.init.ThreeDsUiType threeDsUiType = new com.paypal.android.threeds.init.ThreeDsUiType("NATIVE", 0, "01");
        NATIVE = threeDsUiType;
        com.paypal.android.threeds.init.ThreeDsUiType threeDsUiType2 = new com.paypal.android.threeds.init.ThreeDsUiType("HTML", 1, my.com.softspace.reader.internal.kernelconfig.EmvConstants.EMV_KERNEL_ID_MASTERCARD);
        HTML = threeDsUiType2;
        com.paypal.android.threeds.init.ThreeDsUiType threeDsUiType3 = new com.paypal.android.threeds.init.ThreeDsUiType("BOTH", 2, "03");
        BOTH = threeDsUiType3;
        com.paypal.android.threeds.init.ThreeDsUiType[] threeDsUiTypeArr = {threeDsUiType, threeDsUiType2, threeDsUiType3};
        getHighResolutionOutputSizeshNQ4ISI = threeDsUiTypeArr;
        Camera2StreamConfigurationMap = kotlin.enums.EnumEntriesKt.enumEntries(threeDsUiTypeArr);
    }

    public static com.paypal.android.threeds.init.ThreeDsUiType[] values() {
        return (com.paypal.android.threeds.init.ThreeDsUiType[]) getHighResolutionOutputSizeshNQ4ISI.clone();
    }

    public static com.paypal.android.threeds.init.ThreeDsUiType valueOf(java.lang.String str) {
        return (com.paypal.android.threeds.init.ThreeDsUiType) java.lang.Enum.valueOf(com.paypal.android.threeds.init.ThreeDsUiType.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.android.threeds.init.ThreeDsUiType> getEntries() {
        return Camera2StreamConfigurationMap;
    }
}
