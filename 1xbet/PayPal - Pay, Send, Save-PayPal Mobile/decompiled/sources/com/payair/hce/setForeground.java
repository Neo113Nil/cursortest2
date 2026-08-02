package com.payair.hce;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tR$\u0010\u000f\u001a\u0004\u0018\u00010\u00078\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\t\"\u0004\b\r\u0010\u000eR$\u0010\f\u001a\u0004\u0018\u00010\u00108\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\f\u0010\u0011\u001a\u0004\b\n\u0010\u0012\"\u0004\b\u000f\u0010\u0013R$\u0010\r\u001a\u0004\u0018\u00010\u00078\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u000b\u001a\u0004\b\r\u0010\t\"\u0004\b\u0014\u0010\u000eR$\u0010\u0014\u001a\u0004\u0018\u00010\u00078\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000b\u001a\u0004\b\u0015\u0010\t\"\u0004\b\f\u0010\u000eR$\u0010\n\u001a\u0004\u0018\u00010\u00078\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u000b\u001a\u0004\b\u0016\u0010\t\"\u0004\b\u000f\u0010\u000eR\u0016\u0010\u0016\u001a\u00020\u00178\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0018"}, d2 = {"Lcom/payair/hce/setForeground;", "Lcom/payair/hce/communication/JsonResponse;", "<init>", "()V", "", "isDataValid", "()Z", "", "toString", "()Ljava/lang/String;", "DigitizedCardProfile", "Ljava/lang/String;", "values", "AlternateContactlessPaymentDataJson", "(Ljava/lang/String;)V", "writeReplace", "Lcom/payair/hce/setLayerPaint;", "Lcom/payair/hce/setLayerPaint;", "()Lcom/payair/hce/setLayerPaint;", "(Lcom/payair/hce/setLayerPaint;)V", "valueOf", "getProfileVersion", "getAid", "", "J"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class setForeground extends com.payair.hce.communication.JsonResponse {
    private static int IccPrivateKeyCrtComponentsJson = 1;
    private static int SdkCoreAlternateContactlessPaymentDataImpl;

    /* renamed from: AlternateContactlessPaymentDataJson, reason: from kotlin metadata */
    @com.payair.hce.SdkCoreContactlessPaymentDataImpl(valueOf = "remoteManagementUrl")
    private java.lang.String valueOf;

    /* renamed from: DigitizedCardProfile, reason: from kotlin metadata */
    @com.payair.hce.SdkCoreContactlessPaymentDataImpl(valueOf = "hceStatus")
    private java.lang.String writeReplace;

    /* renamed from: getAid, reason: from kotlin metadata */
    @com.payair.hce.SdkCoreContactlessPaymentDataImpl(valueOf = "sha256HexDeviceFingerprint")
    private java.lang.String DigitizedCardProfile;

    /* renamed from: valueOf, reason: from kotlin metadata */
    @com.payair.hce.SdkCoreContactlessPaymentDataImpl(valueOf = "mobileKeysetId")
    private java.lang.String AlternateContactlessPaymentDataJson;

    @com.payair.hce.SdkCoreContactlessPaymentDataImpl(valueOf = "mobileKeys")
    private com.payair.hce.setLayerPaint values;

    /* renamed from: writeReplace, reason: from kotlin metadata */
    @com.payair.hce.SdkCoreContactlessPaymentDataImpl(valueOf = "userId")
    public long getAid;

    public static /* synthetic */ java.lang.Object AlternateContactlessPaymentDataJson(java.lang.Object[] objArr, int i, int i2, int i3) {
        int i4 = ~i;
        int i5 = ~(i4 | i3);
        int i6 = ~i2;
        int i7 = ~i3;
        switch ((i * 141) + (i2 * (-139)) + (((~(i4 | i2)) | i5) * (-280)) + ((i5 | (~(i6 | i3))) * 140) + (((~(i | i7 | i6)) | (~(i2 | i4 | i7)) | (~(i3 | i4 | i6))) * 140)) {
            case 1:
                com.payair.hce.setForeground setforeground = (com.payair.hce.setForeground) objArr[0];
                java.lang.String str = (java.lang.String) objArr[1];
                int i8 = IccPrivateKeyCrtComponentsJson;
                int i9 = (((i8 ^ 6) + ((i8 & 6) << 1)) - 1) % 128;
                SdkCoreAlternateContactlessPaymentDataImpl = i9;
                setforeground.AlternateContactlessPaymentDataJson = str;
                IccPrivateKeyCrtComponentsJson = (((i9 & 119) - (~(-(-(i9 | 119))))) - 1) % 128;
                return null;
            case 2:
                return values(objArr);
            case 3:
                return AlternateContactlessPaymentDataJson(objArr);
            case 4:
                return DigitizedCardProfile(objArr);
            case 5:
                com.payair.hce.setForeground setforeground2 = (com.payair.hce.setForeground) objArr[0];
                java.lang.String str2 = (java.lang.String) objArr[1];
                int i10 = IccPrivateKeyCrtComponentsJson;
                int i11 = (((i10 & (-70)) | ((~i10) & 69)) + ((i10 & 69) << 1)) % 128;
                SdkCoreAlternateContactlessPaymentDataImpl = i11;
                setforeground2.valueOf = str2;
                IccPrivateKeyCrtComponentsJson = (i11 + 21) % 128;
                return null;
            case 6:
                return writeReplace(objArr);
            case 7:
                return getAid(objArr);
            case 8:
                return SdkCoreAlternateContactlessPaymentDataImpl(objArr);
            case 9:
                return getProfileVersion(objArr);
            case 10:
                return RecordsJson(objArr);
            case 11:
                return IccPrivateKeyCrtComponentsJson(objArr);
            default:
                return valueOf(objArr);
        }
    }

    private static /* synthetic */ java.lang.Object DigitizedCardProfile(java.lang.Object[] objArr) {
        com.payair.hce.setForeground setforeground = (com.payair.hce.setForeground) objArr[0];
        int i = IccPrivateKeyCrtComponentsJson;
        int i2 = i & 113;
        int i3 = ((i ^ 113) | i2) << 1;
        int i4 = -((i | 113) & (~i2));
        int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
        SdkCoreAlternateContactlessPaymentDataImpl = i5 % 128;
        if (i5 % 2 != 0) {
            java.lang.String str = setforeground.AlternateContactlessPaymentDataJson;
            throw null;
        }
        java.lang.String str2 = setforeground.AlternateContactlessPaymentDataJson;
        int identityHashCode = java.lang.System.identityHashCode(setforeground);
        int i6 = identityHashCode & (-97358125);
        int i7 = (identityHashCode ^ (-97358125)) | i6;
        int i8 = ~i7;
        int i9 = (i7 | i8) & i8;
        int i10 = i9 & 436234769;
        int i11 = (i9 | 436234769) & (~i10);
        int i12 = (((i11 ^ i10) | (i11 & i10)) * (-476)) - 1369618935;
        int i13 = ~identityHashCode;
        int i14 = (identityHashCode & 97358124) | ((-97358125) & i13);
        int i15 = -(-((~((i14 ^ i6) | (i6 & i14))) * 952));
        int i16 = (-97489325) | i13;
        int i17 = ((-436365970) & i16) | ((~i16) & 436365969);
        int i18 = i16 & 436365969;
        int i19 = -(~(-(-((~((i18 ^ i17) | (i18 & i17))) * 476))));
        int identityHashCode2 = java.lang.System.identityHashCode(setforeground);
        int i20 = ~identityHashCode2;
        int i21 = (i20 & 1874165502) | ((-1874165503) & identityHashCode2);
        int i22 = 1874165502 & identityHashCode2;
        int i23 = (i22 ^ i21) | (i22 & i21);
        int i24 = ~i23;
        int i25 = -(~(((i23 | i24) & i24) * (-301)));
        int i26 = (-2) - (~((i25 & 1670043536) + (i25 | 1670043536)));
        int i27 = (i20 & (-1737784573)) | (1737784572 & identityHashCode2);
        int i28 = identityHashCode2 & (-1737784573);
        int i29 = ~((i27 ^ i28) | (i27 & i28));
        int i30 = i20 & (i20 | identityHashCode2);
        int i31 = (i30 & (-1772436107)) | ((~i30) & 1772436106);
        int i32 = i30 & 1772436106;
        int i33 = ~((i32 ^ i31) | (i32 & i31));
        int i34 = -(-(((i33 ^ i29) | (i33 & i29)) * (-301)));
        int i35 = i26 & i34;
        int i36 = -(-((i34 ^ i26) | i35));
        int i37 = ~(identityHashCode2 | (-1772436107));
        int i38 = (((i35 | i36) << 1) - (i36 ^ i35)) & (-(-(((i37 ^ (-1737784573)) | (i37 & (-1737784573))) * 301)));
        if ((-2) - (~(((((((~i15) & i12) | ((~i12) & i15)) - (~((i15 & i12) << 1))) - 1) - (~i19)) - 1)) > (i38 - (~((r12 ^ r5) | i38))) - 1) {
            return str2;
        }
        throw new java.lang.ArithmeticException();
    }

    private static /* synthetic */ java.lang.Object AlternateContactlessPaymentDataJson(java.lang.Object[] objArr) {
        com.payair.hce.setForeground setforeground = (com.payair.hce.setForeground) objArr[0];
        java.lang.String str = (java.lang.String) objArr[1];
        int i = SdkCoreAlternateContactlessPaymentDataImpl;
        int i2 = i & 35;
        int i3 = ((i ^ 35) | i2) << 1;
        int i4 = -((i | 35) & (~i2));
        int i5 = (i3 & i4) + (i3 | i4);
        IccPrivateKeyCrtComponentsJson = i5 % 128;
        setforeground.writeReplace = str;
        if (i5 % 2 != 0) {
            return null;
        }
        throw null;
    }

    private static /* synthetic */ java.lang.Object SdkCoreAlternateContactlessPaymentDataImpl(java.lang.Object[] objArr) {
        com.payair.hce.setForeground setforeground = (com.payair.hce.setForeground) objArr[0];
        int i = IccPrivateKeyCrtComponentsJson;
        int i2 = i ^ 111;
        int i3 = -(-((i & 111) << 1));
        int i4 = (i2 & i3) + (i3 | i2);
        int i5 = i4 % 128;
        SdkCoreAlternateContactlessPaymentDataImpl = i5;
        java.lang.String str = setforeground.writeReplace;
        if (i4 % 2 != 0) {
            throw null;
        }
        IccPrivateKeyCrtComponentsJson = (((i5 | 61) << 1) - (i5 ^ 61)) % 128;
        return str;
    }

    private static /* synthetic */ java.lang.Object IccPrivateKeyCrtComponentsJson(java.lang.Object[] objArr) {
        com.payair.hce.setForeground setforeground = (com.payair.hce.setForeground) objArr[0];
        int i = IccPrivateKeyCrtComponentsJson;
        int i2 = ((i ^ 97) | (i & 97)) << 1;
        int i3 = -((i & (-98)) | ((~i) & 97));
        int i4 = ((i2 | i3) << 1) - (i3 ^ i2);
        SdkCoreAlternateContactlessPaymentDataImpl = i4 % 128;
        com.payair.hce.setLayerPaint setlayerpaint = setforeground.values;
        if (i4 % 2 == 0) {
            return setlayerpaint;
        }
        throw null;
    }

    private static /* synthetic */ java.lang.Object valueOf(java.lang.Object[] objArr) {
        com.payair.hce.setForeground setforeground = (com.payair.hce.setForeground) objArr[0];
        com.payair.hce.setLayerPaint setlayerpaint = (com.payair.hce.setLayerPaint) objArr[1];
        int i = SdkCoreAlternateContactlessPaymentDataImpl;
        int i2 = (i | 103) << 1;
        int i3 = -((i & (-104)) | ((~i) & 103));
        IccPrivateKeyCrtComponentsJson = ((i2 ^ i3) + ((i2 & i3) << 1)) % 128;
        setforeground.values = setlayerpaint;
        int i4 = ((i ^ 103) | (i & 103)) << 1;
        int i5 = ((i4 | i3) << 1) - (i4 ^ i3);
        IccPrivateKeyCrtComponentsJson = i5 % 128;
        if (i5 % 2 != 0) {
            return null;
        }
        throw null;
    }

    private static /* synthetic */ java.lang.Object values(java.lang.Object[] objArr) {
        com.payair.hce.setForeground setforeground = (com.payair.hce.setForeground) objArr[0];
        int i = SdkCoreAlternateContactlessPaymentDataImpl;
        int i2 = ((i ^ 62) + ((i & 62) << 1)) - 1;
        IccPrivateKeyCrtComponentsJson = i2 % 128;
        java.lang.String str = setforeground.valueOf;
        if (i2 % 2 == 0) {
            throw new java.lang.ArithmeticException();
        }
        int i3 = i & 37;
        int i4 = -(-((i ^ 37) | i3));
        int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
        IccPrivateKeyCrtComponentsJson = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw new java.lang.ArithmeticException();
    }

    private static /* synthetic */ java.lang.Object RecordsJson(java.lang.Object[] objArr) {
        com.payair.hce.setForeground setforeground = (com.payair.hce.setForeground) objArr[0];
        int identityHashCode = java.lang.System.identityHashCode(setforeground);
        int i = ~identityHashCode;
        int i2 = identityHashCode & 1313634949;
        int i3 = ~((identityHashCode ^ 1313634949) | i2);
        int i4 = (((i3 ^ (-1875705526)) | (i3 & (-1875705526))) * 992) + 1193306517;
        int i5 = (1313634949 & i) | (identityHashCode & (-1313634950));
        int i6 = (i5 ^ i2) | (i2 & i5);
        int i7 = ~i6;
        int i8 = (i6 | i7) & i7;
        int i9 = i & (i | identityHashCode);
        int i10 = i9 ^ (-1313634950);
        int i11 = i9 & (-1313634950);
        int i12 = (i11 ^ i10) | (i11 & i10);
        int i13 = i12 & (-797214261);
        int i14 = (i12 | (-797214261)) & (~i13);
        int i15 = ~((i14 ^ i13) | (i14 & i13));
        int i16 = -(-((i15 | (i8 ^ (-1875705526)) | (i8 & (-1875705526))) * (-496)));
        int i17 = (i4 & i16) + (i16 | i4);
        int i18 = identityHashCode & (-797214261);
        int i19 = (identityHashCode | (-797214261)) & (~i18);
        int i20 = -(-(((i19 ^ i18) | (i19 & i18)) * 496));
        int i21 = i17 & i20;
        int identityHashCode2 = java.lang.System.identityHashCode(setforeground);
        int i22 = identityHashCode2 & (-2126790443);
        int i23 = (~i22) & (identityHashCode2 | (-2126790443));
        int i24 = ~((i23 ^ i22) | (i23 & i22));
        int i25 = ((i24 ^ 446303720) | (i24 & 446303720)) * (-658);
        int i26 = i25 & 1116842690;
        int i27 = -((i25 | 1116842690) & (~i26));
        int i28 = (identityHashCode2 ^ (-2126790443)) | i22;
        int i29 = ~i28;
        int i30 = (i28 | i29) & i29;
        int i31 = ((~i30) & 444599592) | ((-444599593) & i30);
        int i32 = i30 & 444599592;
        java.lang.String str = setforeground.DigitizedCardProfile;
        if (((i20 | i17) & (~i21)) + (i21 << 1) <= ((((i25 ^ 1116842690) | i26) << 1) - (~i27)) + 488755407 + (((i32 & i31) | (i32 ^ i31)) * 658)) {
            return str;
        }
        throw null;
    }

    private static /* synthetic */ java.lang.Object writeReplace(java.lang.Object[] objArr) {
        com.payair.hce.setForeground setforeground = (com.payair.hce.setForeground) objArr[0];
        java.lang.String str = (java.lang.String) objArr[1];
        int i = IccPrivateKeyCrtComponentsJson;
        int i2 = ((i | com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) << 1) - (i ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE);
        SdkCoreAlternateContactlessPaymentDataImpl = i2 % 128;
        setforeground.DigitizedCardProfile = str;
        if (i2 % 2 != 0) {
            throw new java.lang.ArithmeticException();
        }
        SdkCoreAlternateContactlessPaymentDataImpl = ((i ^ 111) + ((i & 111) << 1)) % 128;
        return null;
    }

    private static /* synthetic */ java.lang.Object getProfileVersion(java.lang.Object[] objArr) {
        com.payair.hce.setForeground setforeground = (com.payair.hce.setForeground) objArr[0];
        int i = SdkCoreAlternateContactlessPaymentDataImpl;
        IccPrivateKeyCrtComponentsJson = ((i ^ 83) + ((i & 83) << 1)) % 128;
        java.lang.String str = setforeground.AlternateContactlessPaymentDataJson;
        java.lang.String str2 = setforeground.writeReplace;
        com.payair.hce.setLayerPaint setlayerpaint = setforeground.values;
        java.lang.String str3 = setforeground.valueOf;
        java.lang.String str4 = setforeground.DigitizedCardProfile;
        long j = setforeground.getAid;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ResponseAccount{mobileKeysetId='");
        sb.append(str);
        sb.append("', hceStatus='");
        sb.append(str2);
        sb.append("', mobileKeys=");
        sb.append(setlayerpaint);
        sb.append(", remoteManagementUrl='");
        sb.append(str3);
        sb.append("', sha256HexDeviceFingerprint='");
        sb.append(str4);
        sb.append("', userId=");
        sb.append(j);
        sb.append("}");
        java.lang.String obj = sb.toString();
        int i2 = SdkCoreAlternateContactlessPaymentDataImpl;
        int i3 = (i2 & (-34)) | ((~i2) & 33);
        int i4 = (i2 & 33) << 1;
        int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
        IccPrivateKeyCrtComponentsJson = i5 % 128;
        if (i5 % 2 != 0) {
            return obj;
        }
        throw new java.lang.ArithmeticException();
    }

    private static /* synthetic */ java.lang.Object getAid(java.lang.Object[] objArr) {
        int i = IccPrivateKeyCrtComponentsJson + 100;
        int i2 = ((~i) + (i << 1)) % 128;
        SdkCoreAlternateContactlessPaymentDataImpl = i2;
        int i3 = ((i2 ^ 113) | (i2 & 113)) << 1;
        int i4 = -((i2 & (-114)) | ((~i2) & 113));
        int i5 = ((i3 | i4) << 1) - (i3 ^ i4);
        IccPrivateKeyCrtComponentsJson = i5 % 128;
        if (i5 % 2 != 0) {
            return java.lang.Boolean.TRUE;
        }
        throw null;
    }

    @Override // com.payair.hce.communication.JsonResponse
    public final boolean isDataValid() {
        return ((java.lang.Boolean) AlternateContactlessPaymentDataJson(new java.lang.Object[]{this}, 164382079, -164382072, java.lang.System.identityHashCode(this))).booleanValue();
    }

    @Override // com.payair.hce.communication.JsonResponse
    public final java.lang.String toString() {
        return (java.lang.String) AlternateContactlessPaymentDataJson(new java.lang.Object[]{this}, 1550065526, -1550065517, java.lang.System.identityHashCode(this));
    }

    public final void writeReplace(java.lang.String str) {
        AlternateContactlessPaymentDataJson(new java.lang.Object[]{this, str}, 251263455, -251263449, java.lang.System.identityHashCode(this));
    }

    public final java.lang.String getAid() {
        return (java.lang.String) AlternateContactlessPaymentDataJson(new java.lang.Object[]{this}, 1466285888, -1466285878, java.lang.System.identityHashCode(this));
    }

    public final void values(java.lang.String str) {
        AlternateContactlessPaymentDataJson(new java.lang.Object[]{this, str}, 935844697, -935844692, java.lang.System.identityHashCode(this));
    }

    public final java.lang.String getProfileVersion() {
        return (java.lang.String) AlternateContactlessPaymentDataJson(new java.lang.Object[]{this}, 1609845143, -1609845141, java.lang.System.identityHashCode(this));
    }

    public final void writeReplace(com.payair.hce.setLayerPaint setlayerpaint) {
        AlternateContactlessPaymentDataJson(new java.lang.Object[]{this, setlayerpaint}, -1435307276, 1435307276, java.lang.System.identityHashCode(this));
    }

    public final com.payair.hce.setLayerPaint DigitizedCardProfile() {
        return (com.payair.hce.setLayerPaint) AlternateContactlessPaymentDataJson(new java.lang.Object[]{this}, 778659678, -778659667, java.lang.System.identityHashCode(this));
    }

    public final void AlternateContactlessPaymentDataJson(java.lang.String str) {
        AlternateContactlessPaymentDataJson(new java.lang.Object[]{this, str}, 1690748685, -1690748682, java.lang.System.identityHashCode(this));
    }

    public final java.lang.String values() {
        return (java.lang.String) AlternateContactlessPaymentDataJson(new java.lang.Object[]{this}, -867222160, 867222168, java.lang.System.identityHashCode(this));
    }

    public final void valueOf(java.lang.String str) {
        AlternateContactlessPaymentDataJson(new java.lang.Object[]{this, str}, -1298493834, 1298493835, java.lang.System.identityHashCode(this));
    }

    public final java.lang.String AlternateContactlessPaymentDataJson() {
        return (java.lang.String) AlternateContactlessPaymentDataJson(new java.lang.Object[]{this}, -443567461, 443567465, java.lang.System.identityHashCode(this));
    }
}
