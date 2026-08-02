package com.payair.hce;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005"}, d2 = {"Lcom/payair/hce/setSelectedChildViewEnabled;", "", "<init>", "(Ljava/lang/String;I)V", "SUCCESS", "FAILURE"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class setSelectedChildViewEnabled {
    private static int DigitizedCardProfile = 0;
    private static int valueOf = 1;

    @com.payair.hce.SdkCoreContactlessPaymentDataImpl(valueOf = "SUCCESS")
    public static final com.payair.hce.setSelectedChildViewEnabled SUCCESS = new com.payair.hce.setSelectedChildViewEnabled("SUCCESS", 0);

    @com.payair.hce.SdkCoreContactlessPaymentDataImpl(valueOf = "FAILURE")
    public static final com.payair.hce.setSelectedChildViewEnabled FAILURE = new com.payair.hce.setSelectedChildViewEnabled("FAILURE", 1);
    private static final /* synthetic */ com.payair.hce.setSelectedChildViewEnabled[] values = AlternateContactlessPaymentDataJson();

    private setSelectedChildViewEnabled(java.lang.String str, int i) {
    }

    static {
        int i = valueOf;
        int i2 = (i & (-116)) | ((~i) & 115);
        int i3 = (i & 115) << 1;
        DigitizedCardProfile = ((i2 & i3) + (i3 | i2)) % 128;
    }

    private static final /* synthetic */ com.payair.hce.setSelectedChildViewEnabled[] AlternateContactlessPaymentDataJson() {
        int i = DigitizedCardProfile;
        int i2 = ((i & 9) + (i | 9)) % 128;
        valueOf = i2;
        com.payair.hce.setSelectedChildViewEnabled[] setselectedchildviewenabledArr = {SUCCESS, FAILURE};
        int i3 = i2 & 15;
        int i4 = ((((i2 ^ 15) | i3) << 1) - (~(-((i2 | 15) & (~i3))))) - 1;
        DigitizedCardProfile = i4 % 128;
        if (i4 % 2 == 0) {
            return setselectedchildviewenabledArr;
        }
        throw new java.lang.ArithmeticException();
    }

    public static com.payair.hce.setSelectedChildViewEnabled valueOf(java.lang.String str) {
        int i = DigitizedCardProfile;
        valueOf = (((i & (-116)) | ((~i) & 115)) + ((i & 115) << 1)) % 128;
        com.payair.hce.setSelectedChildViewEnabled setselectedchildviewenabled = (com.payair.hce.setSelectedChildViewEnabled) java.lang.Enum.valueOf(com.payair.hce.setSelectedChildViewEnabled.class, str);
        int i2 = valueOf;
        int i3 = i2 & 99;
        int i4 = -(-(i2 | 99));
        int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
        DigitizedCardProfile = i5 % 128;
        if (i5 % 2 == 0) {
            return setselectedchildviewenabled;
        }
        throw null;
    }

    public static com.payair.hce.setSelectedChildViewEnabled[] values() {
        int i = DigitizedCardProfile + 103;
        valueOf = i % 128;
        com.payair.hce.setSelectedChildViewEnabled[] setselectedchildviewenabledArr = values;
        if (i % 2 != 0) {
            return (com.payair.hce.setSelectedChildViewEnabled[]) setselectedchildviewenabledArr.clone();
        }
        throw null;
    }
}
