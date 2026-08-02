package com.payair.hce;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0011\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006JK\u0010\u0010\u001a\u00020\n2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00042\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0007\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0013\u0010\u0014"}, d2 = {"Lcom/payair/hce/setScrollBarFadeDuration;", "", "<init>", "()V", "", "AlternateContactlessPaymentDataJson", "()Ljava/lang/String;", "p0", "Lcom/payair/hce/communication/JsonRequest;", "p1", "Lcom/payair/hce/communication/JsonResponse;", "p2", "", "p3", "p4", "p5", "valueOf", "(Ljava/lang/String;Lcom/payair/hce/communication/JsonRequest;Lcom/payair/hce/communication/JsonResponse;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)Lcom/payair/hce/communication/JsonResponse;", "", "DigitizedCardProfile", "(Ljava/lang/String;)V"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class setScrollBarFadeDuration {
    private static int DigitizedCardProfile = 1;
    public static final com.payair.hce.setScrollBarFadeDuration INSTANCE = new com.payair.hce.setScrollBarFadeDuration();
    private static int writeReplace;

    public static /* synthetic */ java.lang.Object writeReplace(java.lang.Object[] objArr, int i, int i2, int i3) {
        int i4 = ~i;
        int i5 = (i * (-419)) + (i2 * 421) + ((~(i2 | i3)) * androidx.constraintlayout.core.motion.utils.TypedValues.CycleType.TYPE_EASING) + ((i2 | i4) * (-420)) + (((~(i2 | (~i3))) | (~(i4 | (~i2)))) * androidx.constraintlayout.core.motion.utils.TypedValues.CycleType.TYPE_EASING);
        if (i5 == 1) {
            return DigitizedCardProfile(objArr);
        }
        if (i5 == 2) {
            return values(objArr);
        }
        java.lang.String str = (java.lang.String) objArr[0];
        com.payair.hce.communication.JsonRequest jsonRequest = (com.payair.hce.communication.JsonRequest) objArr[1];
        com.payair.hce.communication.JsonResponse jsonResponse = (com.payair.hce.communication.JsonResponse) objArr[2];
        java.lang.Integer num = (java.lang.Integer) objArr[3];
        java.lang.String str2 = (java.lang.String) objArr[4];
        java.lang.String str3 = (java.lang.String) objArr[5];
        int i6 = writeReplace;
        DigitizedCardProfile = ((i6 ^ 87) + ((i6 & 87) << 1)) % 128;
        com.payair.hce.communication.JsonResponse AlternateContactlessPaymentDataJson = com.payair.hce.setScrollBarStyle.AlternateContactlessPaymentDataJson(str, jsonRequest, jsonResponse, num, str2, str3);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(AlternateContactlessPaymentDataJson, "");
        int i7 = writeReplace;
        DigitizedCardProfile = (((i7 & (-16)) | ((~i7) & 15)) + ((i7 & 15) << 1)) % 128;
        return AlternateContactlessPaymentDataJson;
    }

    private setScrollBarFadeDuration() {
    }

    private static /* synthetic */ java.lang.Object DigitizedCardProfile(java.lang.Object[] objArr) {
        java.lang.String str = (java.lang.String) objArr[0];
        int i = DigitizedCardProfile;
        int i2 = i & 57;
        int i3 = (((i | 57) & (~i2)) - (~(i2 << 1))) - 1;
        writeReplace = i3 % 128;
        if (i3 % 2 == 0) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            com.payair.hce.setScrollBarStyle.values(new java.lang.Object[]{str}, 1204300104, -1204300104, (int) java.lang.System.currentTimeMillis());
            return null;
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        com.payair.hce.setScrollBarStyle.values(new java.lang.Object[]{str}, 1204300104, -1204300104, (int) java.lang.System.currentTimeMillis());
        throw null;
    }

    private static /* synthetic */ java.lang.Object values(java.lang.Object[] objArr) {
        int i = DigitizedCardProfile;
        int i2 = i & 41;
        int i3 = (i ^ 41) | i2;
        writeReplace = ((i2 & i3) + (i3 | i2)) % 128;
        java.lang.String writeReplace2 = com.payair.hce.setScrollBarStyle.writeReplace();
        int i4 = writeReplace;
        int i5 = i4 ^ 115;
        int i6 = ((i4 & 115) | i5) << 1;
        int i7 = -i5;
        int i8 = (i6 ^ i7) + ((i6 & i7) << 1);
        DigitizedCardProfile = i8 % 128;
        if (i8 % 2 != 0) {
            return writeReplace2;
        }
        throw null;
    }

    static {
        int i = writeReplace;
        int i2 = i ^ 41;
        int i3 = (i & 41) << 1;
        int i4 = (i2 ^ i3) + ((i3 & i2) << 1);
        DigitizedCardProfile = i4 % 128;
        if (i4 % 2 == 0) {
            throw new java.lang.ArithmeticException();
        }
    }

    @kotlin.jvm.JvmStatic
    public static final java.lang.String AlternateContactlessPaymentDataJson() {
        return (java.lang.String) writeReplace(new java.lang.Object[0], 1864191391, -1864191389, (int) java.lang.System.currentTimeMillis());
    }

    @kotlin.jvm.JvmStatic
    public static final void DigitizedCardProfile(java.lang.String p0) {
        writeReplace(new java.lang.Object[]{p0}, 986077232, -986077231, (int) java.lang.System.currentTimeMillis());
    }

    @kotlin.jvm.JvmStatic
    public static final com.payair.hce.communication.JsonResponse valueOf(java.lang.String p0, com.payair.hce.communication.JsonRequest p1, com.payair.hce.communication.JsonResponse p2, java.lang.Integer p3, java.lang.String p4, java.lang.String p5) {
        return (com.payair.hce.communication.JsonResponse) writeReplace(new java.lang.Object[]{p0, p1, p2, p3, p4, p5}, 2111170022, -2111170022, (int) java.lang.System.currentTimeMillis());
    }
}
