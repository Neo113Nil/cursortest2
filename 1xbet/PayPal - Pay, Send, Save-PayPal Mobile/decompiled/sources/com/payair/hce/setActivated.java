package com.payair.hce;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tR$\u0010\f\u001a\u0004\u0018\u00010\u00078\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\t\"\u0004\b\n\u0010\r"}, d2 = {"Lcom/payair/hce/setActivated;", "Lcom/payair/hce/communication/JsonResponse;", "<init>", "()V", "", "isDataValid", "()Z", "", "toString", "()Ljava/lang/String;", "AlternateContactlessPaymentDataJson", "Ljava/lang/String;", "values", "(Ljava/lang/String;)V"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class setActivated extends com.payair.hce.communication.JsonResponse {
    private static int DigitizedCardProfile = 1;
    private static int valueOf;

    /* renamed from: AlternateContactlessPaymentDataJson, reason: from kotlin metadata */
    @com.payair.hce.SdkCoreContactlessPaymentDataImpl(valueOf = "certificateData")
    private java.lang.String values;

    public static /* synthetic */ java.lang.Object DigitizedCardProfile(java.lang.Object[] objArr, int i, int i2, int i3) {
        int i4 = ~i2;
        int i5 = (i * 367) + (i2 * 367) + ((i | i2) * (-366)) + (((~(i4 | i3)) | i) * (-366)) + (((~((~i) | i2)) | (~(i3 | i4 | i))) * 366);
        return i5 != 1 ? i5 != 2 ? i5 != 3 ? writeReplace(objArr) : valueOf(objArr) : AlternateContactlessPaymentDataJson(objArr) : DigitizedCardProfile(objArr);
    }

    private static /* synthetic */ java.lang.Object AlternateContactlessPaymentDataJson(java.lang.Object[] objArr) {
        com.payair.hce.setActivated setactivated = (com.payair.hce.setActivated) objArr[0];
        int i = valueOf;
        int i2 = (i ^ 95) + ((i & 95) << 1);
        DigitizedCardProfile = i2 % 128;
        java.lang.String str = setactivated.values;
        if (i2 % 2 != 0) {
            return str;
        }
        throw new java.lang.ArithmeticException();
    }

    private static /* synthetic */ java.lang.Object writeReplace(java.lang.Object[] objArr) {
        com.payair.hce.setActivated setactivated = (com.payair.hce.setActivated) objArr[0];
        java.lang.String str = (java.lang.String) objArr[1];
        int i = ~java.lang.System.identityHashCode(setactivated);
        int i2 = i & 2040092695;
        int i3 = ~((i ^ 2040092695) | i2);
        int i4 = ((~i3) & 1360089109) | ((-1360089110) & i3);
        int i5 = i3 & 1360089109;
        int i6 = -(~(-(-(((i5 ^ i4) | (i5 & i4)) * (-970)))));
        int i7 = (i6 ^ 722560831) + ((i6 & 722560831) << 1);
        int i8 = (~i7) + (i7 << 1);
        int i9 = (i8 & 255660960) + (i8 | 255660960);
        int i10 = ((~i) & 2040092695) | ((-2040092696) & i);
        int i11 = ~((i10 ^ i2) | (i2 & i10));
        int i12 = ((~i11) & 680003586) | ((-680003587) & i11);
        int i13 = i11 & 680003586;
        int i14 = -(-(((i13 ^ i12) | (i13 & i12)) * 970));
        int i15 = ((~i14) & i9) | ((~i9) & i14);
        int i16 = -(-((i14 & i9) << 1));
        int identityHashCode = java.lang.System.identityHashCode(setactivated);
        int i17 = ~identityHashCode;
        int i18 = i17 & (i17 | identityHashCode);
        int i19 = ~(((-1907525073) ^ i18) | (i18 & (-1907525073)));
        int i20 = ~(identityHashCode | 1524724105);
        int i21 = i19 & i20;
        int i22 = (i19 | i20) & (~i21);
        int i23 = ((i22 ^ i21) | (i22 & i21)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_NEW_WINDOW_VALUE;
        int i24 = i23 & (-2139161478);
        int i25 = (i23 | (-2139161478)) & (~i24);
        int i26 = -(-(i24 << 1));
        int i27 = (i25 & i26) + (i25 | i26);
        int i28 = i18 ^ 1524724105;
        int i29 = i18 & 1524724105;
        int i30 = (i29 ^ i28) | (i29 & i28);
        int i31 = i30 & 1907525072;
        int i32 = (i30 | 1907525072) & (~i31);
        int i33 = ~((i32 ^ i31) | (i32 & i31));
        int i34 = identityHashCode & (-1352663425);
        int i35 = (identityHashCode | (-1352663425)) & (~i34);
        int i36 = ~((i35 ^ i34) | (i35 & i34));
        int i37 = -(-(((i36 ^ i33) | (i33 & i36)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_NEW_WINDOW_VALUE));
        int i38 = i27 & i37;
        int i39 = -(-((i37 ^ i27) | i38));
        setactivated.values = str;
        if (((i15 | i16) << 1) - (i16 ^ i15) > (i38 & i39) + (i39 | i38)) {
            throw null;
        }
        int i40 = DigitizedCardProfile;
        valueOf = ((i40 & 53) + (i40 | 53)) % 128;
        return null;
    }

    private static /* synthetic */ java.lang.Object DigitizedCardProfile(java.lang.Object[] objArr) {
        com.payair.hce.setActivated setactivated = (com.payair.hce.setActivated) objArr[0];
        int i = valueOf;
        int i2 = i ^ 59;
        int i3 = -(-((i & 59) << 1));
        int i4 = (i2 ^ i3) + ((i3 & i2) << 1);
        DigitizedCardProfile = i4 % 128;
        if (i4 % 2 == 0) {
            java.lang.String str = setactivated.values;
            throw null;
        }
        java.lang.String str2 = setactivated.values;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("RetrieveConfigurationPkCertResponseWs{certificateData='");
        sb.append(str2);
        sb.append("'}");
        return sb.toString();
    }

    private static /* synthetic */ java.lang.Object valueOf(java.lang.Object[] objArr) {
        int i = valueOf;
        int i2 = i | 71;
        DigitizedCardProfile = (((i2 << 1) - (~(-(i2 & (~(i & 71)))))) - 1) % 128;
        int i3 = i & 125;
        int i4 = (i3 - (~(-(-((i ^ 125) | i3))))) - 1;
        DigitizedCardProfile = i4 % 128;
        if (i4 % 2 != 0) {
            return java.lang.Boolean.TRUE;
        }
        throw null;
    }

    @Override // com.payair.hce.communication.JsonResponse
    public final boolean isDataValid() {
        return ((java.lang.Boolean) DigitizedCardProfile(new java.lang.Object[]{this}, -1378346273, 1378346276, java.lang.System.identityHashCode(this))).booleanValue();
    }

    @Override // com.payair.hce.communication.JsonResponse
    public final java.lang.String toString() {
        return (java.lang.String) DigitizedCardProfile(new java.lang.Object[]{this}, 392970723, -392970722, java.lang.System.identityHashCode(this));
    }

    public final void AlternateContactlessPaymentDataJson(java.lang.String str) {
        DigitizedCardProfile(new java.lang.Object[]{this, str}, 29745412, -29745412, java.lang.System.identityHashCode(this));
    }

    public final java.lang.String values() {
        return (java.lang.String) DigitizedCardProfile(new java.lang.Object[]{this}, -519882721, 519882723, java.lang.System.identityHashCode(this));
    }
}
