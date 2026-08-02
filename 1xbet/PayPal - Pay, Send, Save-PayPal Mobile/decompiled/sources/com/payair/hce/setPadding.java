package com.payair.hce;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tR$\u0010\u000e\u001a\u0004\u0018\u00010\u00078\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\t\"\u0004\b\f\u0010\rR$\u0010\u0013\u001a\u0004\u0018\u00010\u000f8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u0010\u001a\u0004\b\u000e\u0010\u0011\"\u0004\b\u000e\u0010\u0012R$\u0010\n\u001a\u0004\u0018\u00010\u00078\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\f\u0010\u000b\u001a\u0004\b\n\u0010\t\"\u0004\b\u0014\u0010\rR$\u0010\f\u001a\u0004\u0018\u00010\u00078\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u000b\u001a\u0004\b\u0015\u0010\t\"\u0004\b\n\u0010\rR$\u0010\u0014\u001a\u0004\u0018\u00010\u00078\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u000b\u001a\u0004\b\u0016\u0010\t\"\u0004\b\u000e\u0010\r"}, d2 = {"Lcom/payair/hce/setPadding;", "Lcom/payair/hce/communication/JsonResponse;", "<init>", "()V", "", "isDataValid", "()Z", "", "toString", "()Ljava/lang/String;", "DigitizedCardProfile", "Ljava/lang/String;", "AlternateContactlessPaymentDataJson", "(Ljava/lang/String;)V", "values", "Lcom/payair/hce/setLayerPaint;", "Lcom/payair/hce/setLayerPaint;", "()Lcom/payair/hce/setLayerPaint;", "(Lcom/payair/hce/setLayerPaint;)V", "valueOf", "writeReplace", "RecordsJson", "getAid"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class setPadding extends com.payair.hce.communication.JsonResponse {
    private static int IccPrivateKeyCrtComponentsJson = 0;
    private static int getProfileVersion = 1;

    /* renamed from: AlternateContactlessPaymentDataJson, reason: from kotlin metadata */
    @com.payair.hce.SdkCoreContactlessPaymentDataImpl(valueOf = "mobileKeysetId")
    private java.lang.String DigitizedCardProfile;

    /* renamed from: DigitizedCardProfile, reason: from kotlin metadata */
    @com.payair.hce.SdkCoreContactlessPaymentDataImpl(valueOf = "hceStatus")
    private java.lang.String values;

    /* renamed from: valueOf, reason: from kotlin metadata */
    @com.payair.hce.SdkCoreContactlessPaymentDataImpl(valueOf = "remoteManagementUrl")
    private java.lang.String AlternateContactlessPaymentDataJson;

    /* renamed from: values, reason: from kotlin metadata */
    @com.payair.hce.SdkCoreContactlessPaymentDataImpl(valueOf = "mobileKeys")
    private com.payair.hce.setLayerPaint valueOf;

    @com.payair.hce.SdkCoreContactlessPaymentDataImpl(valueOf = "sha256HexDeviceFingerprint")
    private java.lang.String writeReplace;

    public static /* synthetic */ java.lang.Object DigitizedCardProfile(java.lang.Object[] objArr, int i, int i2, int i3) {
        int i4 = ~i;
        switch ((i * (-381)) + (i2 * 192) + (i4 * (-191)) + ((i | (~(i2 | i3))) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_2_NEW_VALUE) + (((~(i4 | i2)) | (~(i2 | (~i3)))) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_2_NEW_VALUE)) {
            case 1:
                return DigitizedCardProfile(objArr);
            case 2:
                return valueOf(objArr);
            case 3:
                return AlternateContactlessPaymentDataJson(objArr);
            case 4:
                return values(objArr);
            case 5:
                com.payair.hce.setPadding setpadding = (com.payair.hce.setPadding) objArr[0];
                int i5 = getProfileVersion;
                int i6 = i5 & 91;
                IccPrivateKeyCrtComponentsJson = (i6 + ((i5 ^ 91) | i6)) % 128;
                java.lang.String str = setpadding.writeReplace;
                IccPrivateKeyCrtComponentsJson = ((i5 ^ 13) + ((i5 & 13) << 1)) % 128;
                return str;
            case 6:
                return getAid(objArr);
            case 7:
                return IccPrivateKeyCrtComponentsJson(objArr);
            case 8:
                com.payair.hce.setPadding setpadding2 = (com.payair.hce.setPadding) objArr[0];
                int i7 = getProfileVersion;
                int i8 = (i7 & (-48)) | ((~i7) & 47);
                int i9 = -(-((i7 & 47) << 1));
                int i10 = (((i8 | i9) << 1) - (i9 ^ i8)) % 128;
                IccPrivateKeyCrtComponentsJson = i10;
                java.lang.String str2 = setpadding2.values;
                getProfileVersion = (i10 + 79) % 128;
                return str2;
            case 9:
                return SdkCoreAlternateContactlessPaymentDataImpl(objArr);
            case 10:
                return getProfileVersion(objArr);
            case 11:
                int i11 = getProfileVersion;
                int i12 = i11 | 87;
                int i13 = i12 << 1;
                int i14 = -((~(i11 & 87)) & i12);
                int i15 = ((i13 & i14) + (i14 | i13)) % 128;
                IccPrivateKeyCrtComponentsJson = i15;
                int i16 = i15 & 21;
                int i17 = (i15 ^ 21) | i16;
                getProfileVersion = (((i16 | i17) << 1) - (i16 ^ i17)) % 128;
                return java.lang.Boolean.TRUE;
            default:
                return writeReplace(objArr);
        }
    }

    private static /* synthetic */ java.lang.Object DigitizedCardProfile(java.lang.Object[] objArr) {
        com.payair.hce.setPadding setpadding = (com.payair.hce.setPadding) objArr[0];
        java.lang.String str = (java.lang.String) objArr[1];
        int i = getProfileVersion;
        int i2 = i & 121;
        int i3 = (i | 121) & (~i2);
        int i4 = -(-(i2 << 1));
        int i5 = (i3 ^ i4) + ((i3 & i4) << 1);
        int i6 = i5 % 128;
        IccPrivateKeyCrtComponentsJson = i6;
        setpadding.DigitizedCardProfile = str;
        if (i5 % 2 != 0) {
            throw new java.lang.ArithmeticException();
        }
        getProfileVersion = (i6 + 117) % 128;
        return null;
    }

    private static /* synthetic */ java.lang.Object getAid(java.lang.Object[] objArr) {
        com.payair.hce.setPadding setpadding = (com.payair.hce.setPadding) objArr[0];
        int i = getProfileVersion;
        int i2 = (i & (-24)) | ((~i) & 23);
        int i3 = -(-((i & 23) << 1));
        int i4 = (((i2 | i3) << 1) - (i3 ^ i2)) % 128;
        IccPrivateKeyCrtComponentsJson = i4;
        java.lang.String str = setpadding.DigitizedCardProfile;
        int i5 = i4 & 79;
        int i6 = -(-(i4 | 79));
        int i7 = (i5 ^ i6) + ((i5 & i6) << 1);
        getProfileVersion = i7 % 128;
        if (i7 % 2 != 0) {
            return str;
        }
        throw null;
    }

    private static /* synthetic */ java.lang.Object AlternateContactlessPaymentDataJson(java.lang.Object[] objArr) {
        com.payair.hce.setPadding setpadding = (com.payair.hce.setPadding) objArr[0];
        java.lang.String str = (java.lang.String) objArr[1];
        int i = IccPrivateKeyCrtComponentsJson;
        int i2 = ((((i ^ 51) | (i & 51)) << 1) - ((i & (-52)) | ((~i) & 51))) % 128;
        getProfileVersion = i2;
        setpadding.values = str;
        int i3 = i2 + 99;
        IccPrivateKeyCrtComponentsJson = i3 % 128;
        if (i3 % 2 == 0) {
            return null;
        }
        throw new java.lang.ArithmeticException();
    }

    private static /* synthetic */ java.lang.Object IccPrivateKeyCrtComponentsJson(java.lang.Object[] objArr) {
        com.payair.hce.setPadding setpadding = (com.payair.hce.setPadding) objArr[0];
        com.payair.hce.setLayerPaint setlayerpaint = (com.payair.hce.setLayerPaint) objArr[1];
        int i = getProfileVersion;
        int i2 = (i | 91) << 1;
        int i3 = -(i ^ 91);
        int i4 = (i2 & i3) + (i2 | i3);
        IccPrivateKeyCrtComponentsJson = i4 % 128;
        setpadding.valueOf = setlayerpaint;
        if (i4 % 2 == 0) {
            return null;
        }
        throw null;
    }

    private static /* synthetic */ java.lang.Object values(java.lang.Object[] objArr) {
        com.payair.hce.setPadding setpadding = (com.payair.hce.setPadding) objArr[0];
        int i = IccPrivateKeyCrtComponentsJson;
        int i2 = (i & (-118)) | ((~i) & 117);
        int i3 = -(-((i & 117) << 1));
        getProfileVersion = ((i2 ^ i3) + ((i2 & i3) << 1)) % 128;
        com.payair.hce.setLayerPaint setlayerpaint = setpadding.valueOf;
        int i4 = i + 45;
        getProfileVersion = i4 % 128;
        if (i4 % 2 != 0) {
            return setlayerpaint;
        }
        throw null;
    }

    private static /* synthetic */ java.lang.Object valueOf(java.lang.Object[] objArr) {
        com.payair.hce.setPadding setpadding = (com.payair.hce.setPadding) objArr[0];
        java.lang.String str = (java.lang.String) objArr[1];
        int i = getProfileVersion;
        int i2 = (i & 97) + (i | 97);
        IccPrivateKeyCrtComponentsJson = i2 % 128;
        setpadding.AlternateContactlessPaymentDataJson = str;
        if (i2 % 2 == 0) {
            return null;
        }
        throw null;
    }

    private static /* synthetic */ java.lang.Object writeReplace(java.lang.Object[] objArr) {
        com.payair.hce.setPadding setpadding = (com.payair.hce.setPadding) objArr[0];
        int i = IccPrivateKeyCrtComponentsJson;
        int i2 = i ^ 107;
        int i3 = ((((i & 107) | i2) << 1) - (~(-i2))) - 1;
        getProfileVersion = i3 % 128;
        java.lang.String str = setpadding.AlternateContactlessPaymentDataJson;
        if (i3 % 2 != 0) {
            return str;
        }
        throw null;
    }

    private static /* synthetic */ java.lang.Object SdkCoreAlternateContactlessPaymentDataImpl(java.lang.Object[] objArr) {
        com.payair.hce.setPadding setpadding = (com.payair.hce.setPadding) objArr[0];
        java.lang.String str = (java.lang.String) objArr[1];
        int i = IccPrivateKeyCrtComponentsJson;
        getProfileVersion = (i + 57) % 128;
        setpadding.writeReplace = str;
        int i2 = ((((i ^ 59) | (i & 59)) << 1) - (~(-((i & (-60)) | ((~i) & 59))))) - 1;
        getProfileVersion = i2 % 128;
        if (i2 % 2 != 0) {
            return null;
        }
        throw null;
    }

    private static /* synthetic */ java.lang.Object getProfileVersion(java.lang.Object[] objArr) {
        com.payair.hce.setPadding setpadding = (com.payair.hce.setPadding) objArr[0];
        int i = getProfileVersion;
        int i2 = i & 91;
        int i3 = -(-((i ^ 91) | i2));
        int i4 = (i2 ^ i3) + ((i3 & i2) << 1);
        IccPrivateKeyCrtComponentsJson = i4 % 128;
        if (i4 % 2 == 0) {
            java.lang.String str = setpadding.DigitizedCardProfile;
            java.lang.String str2 = setpadding.values;
            com.payair.hce.setLayerPaint setlayerpaint = setpadding.valueOf;
            java.lang.String str3 = setpadding.AlternateContactlessPaymentDataJson;
            java.lang.String str4 = setpadding.writeReplace;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ResponseRegister{mobileKeysetId='");
            sb.append(str);
            sb.append("', hceStatus='");
            sb.append(str2);
            sb.append("', mobileKeys=");
            sb.append(setlayerpaint);
            sb.append(", remoteManagementUrl='");
            sb.append(str3);
            sb.append("', sha256HexDeviceFingerprint='");
            sb.append(str4);
            sb.append("'}");
            return sb.toString();
        }
        java.lang.String str5 = setpadding.DigitizedCardProfile;
        java.lang.String str6 = setpadding.values;
        com.payair.hce.setLayerPaint setlayerpaint2 = setpadding.valueOf;
        java.lang.String str7 = setpadding.AlternateContactlessPaymentDataJson;
        java.lang.String str8 = setpadding.writeReplace;
        throw null;
    }

    @Override // com.payair.hce.communication.JsonResponse
    public final boolean isDataValid() {
        return ((java.lang.Boolean) DigitizedCardProfile(new java.lang.Object[]{this}, -583962725, 583962736, java.lang.System.identityHashCode(this))).booleanValue();
    }

    @Override // com.payair.hce.communication.JsonResponse
    public final java.lang.String toString() {
        return (java.lang.String) DigitizedCardProfile(new java.lang.Object[]{this}, 550308652, -550308642, java.lang.System.identityHashCode(this));
    }

    public final void values(java.lang.String str) {
        DigitizedCardProfile(new java.lang.Object[]{this, str}, -1373467960, 1373467969, java.lang.System.identityHashCode(this));
    }

    public final java.lang.String getAid() {
        return (java.lang.String) DigitizedCardProfile(new java.lang.Object[]{this}, 1123558447, -1123558442, java.lang.System.identityHashCode(this));
    }

    public final void DigitizedCardProfile(java.lang.String str) {
        DigitizedCardProfile(new java.lang.Object[]{this, str}, 796507311, -796507309, java.lang.System.identityHashCode(this));
    }

    public final java.lang.String RecordsJson() {
        return (java.lang.String) DigitizedCardProfile(new java.lang.Object[]{this}, 882331020, -882331020, java.lang.System.identityHashCode(this));
    }

    public final void values(com.payair.hce.setLayerPaint setlayerpaint) {
        DigitizedCardProfile(new java.lang.Object[]{this, setlayerpaint}, -1794528061, 1794528068, java.lang.System.identityHashCode(this));
    }

    public final com.payair.hce.setLayerPaint values() {
        return (com.payair.hce.setLayerPaint) DigitizedCardProfile(new java.lang.Object[]{this}, 752264062, -752264058, java.lang.System.identityHashCode(this));
    }

    public final void AlternateContactlessPaymentDataJson(java.lang.String str) {
        DigitizedCardProfile(new java.lang.Object[]{this, str}, -436485092, 436485095, java.lang.System.identityHashCode(this));
    }

    public final java.lang.String AlternateContactlessPaymentDataJson() {
        return (java.lang.String) DigitizedCardProfile(new java.lang.Object[]{this}, -875327697, 875327705, java.lang.System.identityHashCode(this));
    }

    public final void writeReplace(java.lang.String str) {
        DigitizedCardProfile(new java.lang.Object[]{this, str}, 1617510796, -1617510795, java.lang.System.identityHashCode(this));
    }

    public final java.lang.String DigitizedCardProfile() {
        return (java.lang.String) DigitizedCardProfile(new java.lang.Object[]{this}, -1252969288, 1252969294, java.lang.System.identityHashCode(this));
    }
}
