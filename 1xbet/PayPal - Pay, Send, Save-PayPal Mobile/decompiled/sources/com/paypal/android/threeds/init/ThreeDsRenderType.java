package com.paypal.android.threeds.init;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\f\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0006\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e"}, d2 = {"Lcom/paypal/android/threeds/init/ThreeDsRenderType;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "code", "Ljava/lang/String;", "getCode", "()Ljava/lang/String;", "TEXT", "SINGLE_SELECT", "MULTI_SELECT", "OOB", "HTML_OTHER"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class ThreeDsRenderType {
    private static final /* synthetic */ kotlin.enums.EnumEntries Camera2StreamConfigurationMap;
    public static final com.paypal.android.threeds.init.ThreeDsRenderType HTML_OTHER;
    public static final com.paypal.android.threeds.init.ThreeDsRenderType MULTI_SELECT;
    public static final com.paypal.android.threeds.init.ThreeDsRenderType OOB;
    public static final com.paypal.android.threeds.init.ThreeDsRenderType SINGLE_SELECT;
    public static final com.paypal.android.threeds.init.ThreeDsRenderType TEXT;
    private static final /* synthetic */ com.paypal.android.threeds.init.ThreeDsRenderType[] getHighSpeedVideoFpsRangesFor;
    private final java.lang.String code;

    private ThreeDsRenderType(java.lang.String str, int i, java.lang.String str2) {
        this.code = str2;
    }

    public final java.lang.String getCode() {
        return this.code;
    }

    static {
        com.paypal.android.threeds.init.ThreeDsRenderType threeDsRenderType = new com.paypal.android.threeds.init.ThreeDsRenderType("TEXT", 0, "01");
        TEXT = threeDsRenderType;
        com.paypal.android.threeds.init.ThreeDsRenderType threeDsRenderType2 = new com.paypal.android.threeds.init.ThreeDsRenderType("SINGLE_SELECT", 1, my.com.softspace.reader.internal.kernelconfig.EmvConstants.EMV_KERNEL_ID_MASTERCARD);
        SINGLE_SELECT = threeDsRenderType2;
        com.paypal.android.threeds.init.ThreeDsRenderType threeDsRenderType3 = new com.paypal.android.threeds.init.ThreeDsRenderType("MULTI_SELECT", 2, "03");
        MULTI_SELECT = threeDsRenderType3;
        com.paypal.android.threeds.init.ThreeDsRenderType threeDsRenderType4 = new com.paypal.android.threeds.init.ThreeDsRenderType("OOB", 3, "04");
        OOB = threeDsRenderType4;
        com.paypal.android.threeds.init.ThreeDsRenderType threeDsRenderType5 = new com.paypal.android.threeds.init.ThreeDsRenderType("HTML_OTHER", 4, "05");
        HTML_OTHER = threeDsRenderType5;
        com.paypal.android.threeds.init.ThreeDsRenderType[] threeDsRenderTypeArr = {threeDsRenderType, threeDsRenderType2, threeDsRenderType3, threeDsRenderType4, threeDsRenderType5};
        getHighSpeedVideoFpsRangesFor = threeDsRenderTypeArr;
        Camera2StreamConfigurationMap = kotlin.enums.EnumEntriesKt.enumEntries(threeDsRenderTypeArr);
    }

    public static com.paypal.android.threeds.init.ThreeDsRenderType[] values() {
        return (com.paypal.android.threeds.init.ThreeDsRenderType[]) getHighSpeedVideoFpsRangesFor.clone();
    }

    public static com.paypal.android.threeds.init.ThreeDsRenderType valueOf(java.lang.String str) {
        return (com.paypal.android.threeds.init.ThreeDsRenderType) java.lang.Enum.valueOf(com.paypal.android.threeds.init.ThreeDsRenderType.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.android.threeds.init.ThreeDsRenderType> getEntries() {
        return Camera2StreamConfigurationMap;
    }
}
