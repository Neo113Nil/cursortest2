package com.payair.hce;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\u0007\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0004\b\u0007\u0010\t"}, d2 = {"Lcom/payair/hce/setDescendantFocusability;", "", "<init>", "()V", "", "p0", "", "valueOf", "([B)Ljava/lang/String;", "(Ljava/lang/String;)[B"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class setDescendantFocusability {
    public static final com.payair.hce.setDescendantFocusability INSTANCE = new com.payair.hce.setDescendantFocusability();
    private static int values = 0;
    private static int writeReplace = 1;

    public static /* synthetic */ java.lang.Object writeReplace(java.lang.Object[] objArr, int i, int i2, int i3) {
        int i4 = ~i;
        int i5 = (~(i4 | (~i2))) | (~(i4 | i3));
        return ((((i * (-495)) + (i2 * (-495))) + (i5 * 992)) + (((~((i | (~i3)) | i2)) | i5) * (-496))) + ((i2 | i3) * 496) != 1 ? AlternateContactlessPaymentDataJson(objArr) : DigitizedCardProfile(objArr);
    }

    private setDescendantFocusability() {
    }

    private static /* synthetic */ java.lang.Object AlternateContactlessPaymentDataJson(java.lang.Object[] objArr) {
        byte[] bArr = (byte[]) objArr[0];
        int i = values;
        int i2 = i & 1;
        int i3 = i2 + ((i ^ 1) | i2);
        writeReplace = i3 % 128;
        if (i3 % 2 == 0) {
            com.payair.hce.setOnHierarchyChangeListener.valueOf(bArr);
            throw null;
        }
        java.lang.String valueOf = com.payair.hce.setOnHierarchyChangeListener.valueOf(bArr);
        values = (writeReplace + 45) % 128;
        return valueOf;
    }

    private static /* synthetic */ java.lang.Object DigitizedCardProfile(java.lang.Object[] objArr) {
        java.lang.String str = (java.lang.String) objArr[0];
        int i = values;
        writeReplace = (((i ^ 62) + ((i & 62) << 1)) - 1) % 128;
        byte[] AlternateContactlessPaymentDataJson = com.payair.hce.setOnHierarchyChangeListener.AlternateContactlessPaymentDataJson(str);
        int i2 = writeReplace;
        int i3 = i2 & 75;
        int i4 = (i2 | 75) & (~i3);
        int i5 = -(-(i3 << 1));
        int i6 = (i4 ^ i5) + ((i4 & i5) << 1);
        values = i6 % 128;
        if (i6 % 2 == 0) {
            return AlternateContactlessPaymentDataJson;
        }
        throw null;
    }

    static {
        int i = values;
        int i2 = i & 79;
        int i3 = (i ^ 79) | i2;
        writeReplace = (((i2 | i3) << 1) - (i3 ^ i2)) % 128;
    }

    @kotlin.jvm.JvmStatic
    public static final byte[] valueOf(java.lang.String p0) {
        return (byte[]) writeReplace(new java.lang.Object[]{p0}, 2012113923, -2012113922, (int) java.lang.System.currentTimeMillis());
    }

    @kotlin.jvm.JvmStatic
    public static final java.lang.String valueOf(byte[] p0) {
        return (java.lang.String) writeReplace(new java.lang.Object[]{p0}, -5816740, 5816740, (int) java.lang.System.currentTimeMillis());
    }
}
