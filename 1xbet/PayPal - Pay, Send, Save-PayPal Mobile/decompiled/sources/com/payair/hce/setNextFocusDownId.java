package com.payair.hce;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
final class setNextFocusDownId {
    private static int SdkCoreAlternateContactlessPaymentDataImpl = 1;
    private static int valueOf;
    public static final com.payair.hce.setNextFocusDownId AlternateContactlessPaymentDataJson = new com.payair.hce.setNextFocusDownId("MCHIP_AND_MAGSTRIPE", 0);
    public static final com.payair.hce.setNextFocusDownId DigitizedCardProfile = new com.payair.hce.setNextFocusDownId("MCHIP_ONLY", 1);
    public static final com.payair.hce.setNextFocusDownId values = new com.payair.hce.setNextFocusDownId("MAGSTRIPE_ONLY", 2);
    private static final /* synthetic */ com.payair.hce.setNextFocusDownId[] writeReplace = DigitizedCardProfile();

    private setNextFocusDownId(java.lang.String str, int i) {
    }

    private static /* synthetic */ com.payair.hce.setNextFocusDownId[] DigitizedCardProfile() {
        int i = valueOf;
        int i2 = i ^ 7;
        int i3 = -(-((i & 7) << 1));
        SdkCoreAlternateContactlessPaymentDataImpl = (((i2 | i3) << 1) - (i2 ^ i3)) % 128;
        com.payair.hce.setNextFocusDownId[] setnextfocusdownidArr = {AlternateContactlessPaymentDataJson, DigitizedCardProfile, values};
        int i4 = (i ^ 63) + ((i & 63) << 1);
        SdkCoreAlternateContactlessPaymentDataImpl = i4 % 128;
        if (i4 % 2 != 0) {
            return setnextfocusdownidArr;
        }
        throw null;
    }

    public static com.payair.hce.setNextFocusDownId valueOf(java.lang.String str) {
        int i = SdkCoreAlternateContactlessPaymentDataImpl;
        int i2 = (i & (-46)) | ((~i) & 45);
        int i3 = (i & 45) << 1;
        int i4 = (i2 & i3) + (i3 | i2);
        valueOf = i4 % 128;
        com.payair.hce.setNextFocusDownId setnextfocusdownid = (com.payair.hce.setNextFocusDownId) java.lang.Enum.valueOf(com.payair.hce.setNextFocusDownId.class, str);
        if (i4 % 2 == 0) {
            return setnextfocusdownid;
        }
        throw new java.lang.ArithmeticException();
    }

    public static com.payair.hce.setNextFocusDownId[] values() {
        int i = valueOf;
        SdkCoreAlternateContactlessPaymentDataImpl = (((i & 66) + (i | 66)) - 1) % 128;
        com.payair.hce.setNextFocusDownId[] setnextfocusdownidArr = (com.payair.hce.setNextFocusDownId[]) writeReplace.clone();
        int i2 = SdkCoreAlternateContactlessPaymentDataImpl + 51;
        valueOf = i2 % 128;
        if (i2 % 2 == 0) {
            return setnextfocusdownidArr;
        }
        throw new java.lang.ArithmeticException();
    }

    static {
        int i = valueOf;
        int i2 = (((i | 2) << 1) - (i ^ 2)) - 1;
        SdkCoreAlternateContactlessPaymentDataImpl = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }
}
