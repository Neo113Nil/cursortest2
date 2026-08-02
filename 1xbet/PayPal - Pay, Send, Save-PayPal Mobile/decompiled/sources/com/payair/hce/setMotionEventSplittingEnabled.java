package com.payair.hce;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\t\u001a\u00020\u00072\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\t\u0010\nJ+\u0010\u000b\u001a\u00020\u00072\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\u000b\u0010\n"}, d2 = {"Lcom/payair/hce/setMotionEventSplittingEnabled;", "", "<init>", "()V", "", "p0", "p1", "", "p2", "AlternateContactlessPaymentDataJson", "(Ljava/lang/String;Ljava/lang/String;)Z", "values"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class setMotionEventSplittingEnabled {
    private static int AlternateContactlessPaymentDataJson = 0;
    private static int DigitizedCardProfile = 1;
    public static final com.payair.hce.setMotionEventSplittingEnabled INSTANCE = new com.payair.hce.setMotionEventSplittingEnabled();

    public static /* synthetic */ java.lang.Object DigitizedCardProfile(java.lang.Object[] objArr, int i, int i2, int i3) {
        int i4 = ~i;
        int i5 = ~i2;
        int i6 = ~i3;
        if ((i * 69) + (i2 * (-67)) + (((~(i | i2)) | (~(i4 | i5 | i6)) | (~(i3 | i2))) * (-68)) + ((~(i4 | i6 | i2)) * (-68)) + (((~(i5 | i6)) | i4) * 68) != 1) {
            java.lang.String str = (java.lang.String) objArr[0];
            java.lang.String str2 = (java.lang.String) objArr[1];
            int i7 = AlternateContactlessPaymentDataJson;
            int i8 = (i7 & (-22)) | ((~i7) & 21);
            int i9 = (i7 & 21) << 1;
            DigitizedCardProfile = ((i8 ^ i9) + ((i9 & i8) << 1)) % 128;
            return java.lang.Boolean.valueOf(com.payair.hce.setViewTranslationCallback.values(str, str2, false));
        }
        java.lang.String str3 = (java.lang.String) objArr[0];
        java.lang.String str4 = (java.lang.String) objArr[1];
        int i10 = AlternateContactlessPaymentDataJson;
        int i11 = i10 & 17;
        int i12 = (i11 - (~((i10 ^ 17) | i11))) - 1;
        DigitizedCardProfile = i12 % 128;
        return java.lang.Boolean.valueOf(i12 % 2 == 0 ? com.payair.hce.setViewTranslationCallback.AlternateContactlessPaymentDataJson(str3, str4, true) : com.payair.hce.setViewTranslationCallback.AlternateContactlessPaymentDataJson(str3, str4, false));
    }

    private setMotionEventSplittingEnabled() {
    }

    static {
        int i = DigitizedCardProfile;
        int i2 = ((i | 23) << 1) - (i ^ 23);
        AlternateContactlessPaymentDataJson = i2 % 128;
        if (i2 % 2 != 0) {
            throw new java.lang.ArithmeticException();
        }
    }

    @kotlin.jvm.JvmStatic
    public static final boolean values(java.lang.String str, java.lang.String str2) {
        return ((java.lang.Boolean) DigitizedCardProfile(new java.lang.Object[]{str, str2}, -29560201, 29560202, (int) java.lang.System.currentTimeMillis())).booleanValue();
    }

    @kotlin.jvm.JvmStatic
    public static final boolean AlternateContactlessPaymentDataJson(java.lang.String str, java.lang.String str2) {
        return ((java.lang.Boolean) DigitizedCardProfile(new java.lang.Object[]{str, str2}, -1924051175, 1924051175, (int) java.lang.System.currentTimeMillis())).booleanValue();
    }
}
