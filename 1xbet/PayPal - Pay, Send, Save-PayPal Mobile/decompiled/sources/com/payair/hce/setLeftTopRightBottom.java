package com.payair.hce;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B!\b\u0000\u0012\u0016\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u0002j\b\u0012\u0004\u0012\u00020\u0003`\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nR2\u0010\u0010\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u0002j\b\u0012\u0004\u0012\u00020\u0003`\u00048\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0007"}, d2 = {"Lcom/payair/hce/setLeftTopRightBottom;", "Lcom/payair/hce/communication/JsonRequest;", "Ljava/util/ArrayList;", "Lcom/payair/hce/setY;", "Lkotlin/collections/getHighSpeedVideoFpsRanges;", "p0", "<init>", "(Ljava/util/ArrayList;)V", "", "toString", "()Ljava/lang/String;", "DigitizedCardProfile", "Ljava/util/ArrayList;", "writeReplace", "()Ljava/util/ArrayList;", "values", "valueOf"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class setLeftTopRightBottom extends com.payair.hce.communication.JsonRequest {
    private static int AlternateContactlessPaymentDataJson = 0;
    private static int valueOf = 1;

    /* renamed from: DigitizedCardProfile, reason: from kotlin metadata */
    @com.payair.hce.SdkCoreContactlessPaymentDataImpl(valueOf = org.jose4j.jwk.JsonWebKeySet.JWK_SET_MEMBER_NAME)
    private java.util.ArrayList<com.payair.hce.setY> valueOf;

    public static /* synthetic */ java.lang.Object writeReplace(java.lang.Object[] objArr, int i, int i2, int i3) {
        int i4 = ~i;
        int i5 = ~i2;
        int i6 = (i * 70) + (i2 * (-68)) + (((~(i4 | i5 | i3)) | (~(i | i2 | i3))) * 69) + (((~(i2 | i4)) | (~(i3 | i4)) | (~(i2 | i3))) * (-69)) + ((~(i | i5)) * 69);
        return i6 != 1 ? i6 != 2 ? AlternateContactlessPaymentDataJson(objArr) : writeReplace(objArr) : valueOf(objArr);
    }

    private static /* synthetic */ java.lang.Object valueOf(java.lang.Object[] objArr) {
        com.payair.hce.setLeftTopRightBottom setlefttoprightbottom = (com.payair.hce.setLeftTopRightBottom) objArr[0];
        int i = valueOf;
        AlternateContactlessPaymentDataJson = ((-2) - (~((i ^ 18) + ((i & 18) << 1)))) % 128;
        java.util.ArrayList<com.payair.hce.setY> arrayList = setlefttoprightbottom.valueOf;
        int i2 = ((i | 66) << 1) - (i ^ 66);
        int i3 = (~i2) + (i2 << 1);
        AlternateContactlessPaymentDataJson = i3 % 128;
        if (i3 % 2 == 0) {
            return arrayList;
        }
        throw new java.lang.ArithmeticException();
    }

    private static /* synthetic */ java.lang.Object writeReplace(java.lang.Object[] objArr) {
        com.payair.hce.setLeftTopRightBottom setlefttoprightbottom = (com.payair.hce.setLeftTopRightBottom) objArr[0];
        java.util.ArrayList<com.payair.hce.setY> arrayList = (java.util.ArrayList) objArr[1];
        int i = valueOf;
        int i2 = i & 59;
        AlternateContactlessPaymentDataJson = (((i | 59) & (~i2)) + (i2 << 1)) % 128;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(arrayList, "");
        setlefttoprightbottom.valueOf = arrayList;
        int i3 = valueOf;
        int i4 = i3 & 91;
        int i5 = (i3 ^ 91) | i4;
        int i6 = ((i4 | i5) << 1) - (i5 ^ i4);
        AlternateContactlessPaymentDataJson = i6 % 128;
        if (i6 % 2 == 0) {
            return null;
        }
        throw null;
    }

    public setLeftTopRightBottom(java.util.ArrayList<com.payair.hce.setY> arrayList) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(arrayList, "");
        this.valueOf = arrayList;
    }

    private static /* synthetic */ java.lang.Object AlternateContactlessPaymentDataJson(java.lang.Object[] objArr) {
        com.payair.hce.setLeftTopRightBottom setlefttoprightbottom = (com.payair.hce.setLeftTopRightBottom) objArr[0];
        int i = AlternateContactlessPaymentDataJson;
        int i2 = ((i ^ 57) - (~(-(-((i & 57) << 1))))) - 1;
        valueOf = i2 % 128;
        if (i2 % 2 != 0) {
            java.util.ArrayList<com.payair.hce.setY> arrayList = setlefttoprightbottom.valueOf;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("RequestRegisterKeys{keys=");
            sb.append(arrayList);
            sb.append("}");
            java.lang.String obj = sb.toString();
            int i3 = valueOf;
            int i4 = ((i3 ^ 48) + ((i3 & 48) << 1)) - 1;
            AlternateContactlessPaymentDataJson = i4 % 128;
            if (i4 % 2 == 0) {
                return obj;
            }
            throw null;
        }
        java.util.ArrayList<com.payair.hce.setY> arrayList2 = setlefttoprightbottom.valueOf;
        throw null;
    }

    @Override // com.payair.hce.communication.JsonRequest
    public final java.lang.String toString() {
        return (java.lang.String) writeReplace(new java.lang.Object[]{this}, 310907413, -310907413, java.lang.System.identityHashCode(this));
    }

    public final void values(java.util.ArrayList<com.payair.hce.setY> arrayList) {
        writeReplace(new java.lang.Object[]{this, arrayList}, -1273411967, 1273411969, java.lang.System.identityHashCode(this));
    }

    public final java.util.ArrayList<com.payair.hce.setY> writeReplace() {
        return (java.util.ArrayList) writeReplace(new java.lang.Object[]{this}, -1331100547, 1331100548, java.lang.System.identityHashCode(this));
    }
}
