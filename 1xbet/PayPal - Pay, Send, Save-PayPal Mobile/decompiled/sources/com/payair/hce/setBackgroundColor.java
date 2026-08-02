package com.payair.hce;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\b\u0080\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\n\u001a\u00020\t2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0014\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0010R\u001a\u0010\u0016\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0012\u001a\u0004\b\u0016\u0010\u0010R\u001a\u0010\u0013\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0012\u001a\u0004\b\u0011\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0012\u001a\u0004\b\u0014\u0010\u0010"}, d2 = {"Lcom/payair/hce/setBackgroundColor;", "", "", "p0", "p1", "p2", "p3", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "valueOf", "Ljava/lang/String;", "AlternateContactlessPaymentDataJson", "DigitizedCardProfile", "writeReplace", "values"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class setBackgroundColor {
    private static int AlternateContactlessPaymentDataJson = 0;
    private static int getAid = 1;

    /* renamed from: DigitizedCardProfile, reason: from kotlin metadata */
    @com.payair.hce.SdkCoreContactlessPaymentDataImpl(valueOf = "tokenStorageType")
    private final java.lang.String valueOf;

    /* renamed from: valueOf, reason: from kotlin metadata */
    @com.payair.hce.SdkCoreContactlessPaymentDataImpl(valueOf = "deviceFingerprint")
    private final java.lang.String DigitizedCardProfile;

    /* renamed from: values, reason: from kotlin metadata */
    @com.payair.hce.SdkCoreContactlessPaymentDataImpl(valueOf = "rgk")
    private final java.lang.String AlternateContactlessPaymentDataJson;

    /* renamed from: writeReplace, reason: from kotlin metadata */
    @com.payair.hce.SdkCoreContactlessPaymentDataImpl(valueOf = "publicKeyFingerprint")
    private final java.lang.String values;

    public static /* synthetic */ java.lang.Object valueOf(java.lang.Object[] objArr, int i, int i2, int i3) {
        int i4 = ~i2;
        int i5 = ~(i3 | i2);
        int i6 = (i * (-391)) + (i2 * (-195)) + (((~(i4 | i)) | i5) * (-196)) + ((i2 | i) * my.com.softspace.reader.internal.kernelconfig.EmvConstants.EMV_READER_CURRENCY_CODE_JPY) + (((~((~i) | i4)) | i5) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_ARROW_DOWN_VALUE);
        if (i6 == 1) {
            return AlternateContactlessPaymentDataJson(objArr);
        }
        if (i6 == 2) {
            return values(objArr);
        }
        if (i6 == 3) {
            return valueOf(objArr);
        }
        if (i6 == 4) {
            return DigitizedCardProfile(objArr);
        }
        if (i6 == 5) {
            return writeReplace(objArr);
        }
        com.payair.hce.setBackgroundColor setbackgroundcolor = (com.payair.hce.setBackgroundColor) objArr[0];
        int i7 = AlternateContactlessPaymentDataJson;
        int i8 = i7 | 67;
        int i9 = i8 << 1;
        int i10 = -((~(i7 & 67)) & i8);
        int i11 = ((i9 & i10) + (i10 | i9)) % 128;
        getAid = i11;
        java.lang.String str = setbackgroundcolor.valueOf;
        int i12 = ((i11 | 6) << 1) - (i11 ^ 6);
        AlternateContactlessPaymentDataJson = ((~i12) + (i12 << 1)) % 128;
        return str;
    }

    public setBackgroundColor(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str4, "");
        this.values = str;
        this.AlternateContactlessPaymentDataJson = str2;
        this.DigitizedCardProfile = str3;
        this.valueOf = str4;
    }

    private static /* synthetic */ java.lang.Object writeReplace(java.lang.Object[] objArr) {
        com.payair.hce.setBackgroundColor setbackgroundcolor = (com.payair.hce.setBackgroundColor) objArr[0];
        int i = getAid;
        int i2 = i & 53;
        int i3 = ((i ^ 53) | i2) << 1;
        int i4 = -((i | 53) & (~i2));
        int i5 = ((i3 & i4) + (i4 | i3)) % 128;
        AlternateContactlessPaymentDataJson = i5;
        java.lang.String str = setbackgroundcolor.values;
        int i6 = i5 | 87;
        int i7 = i6 << 1;
        int i8 = -(i6 & (~(i5 & 87)));
        int i9 = (i7 ^ i8) + ((i8 & i7) << 1);
        getAid = i9 % 128;
        if (i9 % 2 != 0) {
            return str;
        }
        throw new java.lang.ArithmeticException();
    }

    private static /* synthetic */ java.lang.Object values(java.lang.Object[] objArr) {
        com.payair.hce.setBackgroundColor setbackgroundcolor = (com.payair.hce.setBackgroundColor) objArr[0];
        int i = getAid;
        int i2 = i & 3;
        int i3 = -(-((i ^ 3) | i2));
        int i4 = ((i2 | i3) << 1) - (i3 ^ i2);
        AlternateContactlessPaymentDataJson = i4 % 128;
        java.lang.String str = setbackgroundcolor.AlternateContactlessPaymentDataJson;
        if (i4 % 2 == 0) {
            return str;
        }
        throw new java.lang.ArithmeticException();
    }

    private static /* synthetic */ java.lang.Object DigitizedCardProfile(java.lang.Object[] objArr) {
        com.payair.hce.setBackgroundColor setbackgroundcolor = (com.payair.hce.setBackgroundColor) objArr[0];
        int i = AlternateContactlessPaymentDataJson;
        int i2 = (-2) - (~(i + 48));
        getAid = i2 % 128;
        java.lang.String str = setbackgroundcolor.DigitizedCardProfile;
        if (i2 % 2 == 0) {
            throw new java.lang.ArithmeticException();
        }
        getAid = (i + 119) % 128;
        return str;
    }

    private static /* synthetic */ java.lang.Object valueOf(java.lang.Object[] objArr) {
        com.payair.hce.setBackgroundColor setbackgroundcolor = (com.payair.hce.setBackgroundColor) objArr[0];
        int i = getAid;
        AlternateContactlessPaymentDataJson = (((i | 97) << 1) - (i ^ 97)) % 128;
        int hashCode = setbackgroundcolor.values.hashCode() * 31;
        int i2 = -(-setbackgroundcolor.AlternateContactlessPaymentDataJson.hashCode());
        int i3 = ((((~i2) & hashCode) | ((~hashCode) & i2)) - (~(-(-((hashCode & i2) << 1))))) - 1;
        int i4 = i3 * 31;
        int hashCode2 = setbackgroundcolor.DigitizedCardProfile.hashCode();
        int identityHashCode = java.lang.System.identityHashCode(setbackgroundcolor);
        int i5 = hashCode2 * 71;
        int i6 = -(-(i3 * (-2139)));
        int i7 = i5 ^ i6;
        int i8 = ((i6 & i5) | i7) << 1;
        int i9 = -i7;
        int i10 = ~hashCode2;
        int i11 = ~i4;
        int i12 = ~((i10 & i11) | ((~i10) & i4) | (i10 & i4));
        int i13 = ((~identityHashCode) & i4) | (identityHashCode & i11);
        int i14 = i4 & identityHashCode;
        int i15 = ~((i13 ^ i14) | (i13 & i14));
        int i16 = ((~i15) & i12) | ((~i12) & i15);
        int i17 = i12 & i15;
        int i18 = (((i8 ^ i9) + ((i8 & i9) << 1)) - (~(-(~(-(-(((i17 & i16) | (i16 ^ i17)) * (-140)))))))) - 2;
        int i19 = (hashCode2 ^ i4) | (hashCode2 & i4);
        int i20 = i19 ^ identityHashCode;
        int i21 = i19 & identityHashCode;
        int i22 = (~((i21 ^ i20) | (i21 & i20))) * 70;
        int i23 = i18 ^ i22;
        int i24 = (i22 & i18) << 1;
        int i25 = (i23 ^ i24) + ((i24 & i23) << 1);
        int i26 = ~(i4 | i10);
        int i27 = i11 & hashCode2;
        int i28 = (i11 | hashCode2) & (~i27);
        int i29 = (i27 ^ i28) | (i27 & i28);
        int i30 = ~i29;
        int i31 = (i29 | i30) & i30;
        int i32 = i26 & i31;
        int i33 = ((i26 | i31) & (~i32)) | i32;
        int i34 = hashCode2 & identityHashCode;
        int i35 = (hashCode2 | identityHashCode) & (~i34);
        int i36 = (i35 ^ i34) | (i35 & i34);
        int i37 = ~i36;
        int i38 = (i36 | i37) & i37;
        int i39 = -(~(((i33 ^ i38) | (i33 & i38)) * 70));
        int i40 = ((i25 & i39) + (i39 | i25)) - 1;
        int i41 = i40 * 31;
        int hashCode3 = setbackgroundcolor.valueOf.hashCode();
        int identityHashCode2 = java.lang.System.identityHashCode(setbackgroundcolor);
        int i42 = hashCode3 * 569;
        int i43 = -(-(i40 * 17639));
        int i44 = ((i42 | i43) << 1) - (i43 ^ i42);
        int i45 = ~hashCode3;
        int i46 = (i45 | hashCode3) & i45;
        int i47 = ~i41;
        int i48 = (i47 | i41) & i47;
        int i49 = ~i46;
        int i50 = ((~i48) & i46) | (i48 & i49);
        int i51 = i46 & i48;
        int i52 = (i50 & i51) | (i50 ^ i51);
        int i53 = ~i52;
        int i54 = (i52 | i53) & i53;
        int i55 = ~identityHashCode2;
        int i56 = (~i45) & i55;
        int i57 = ~i55;
        int i58 = i45 & i55;
        int i59 = ~(i56 | (i57 & i45) | i58);
        int i60 = (i54 ^ i59) | (i54 & i59);
        int i61 = (i55 | identityHashCode2) & i55;
        int i62 = i48 & i61;
        int i63 = (i61 | i48) & (~i62);
        int i64 = ~((i63 ^ i62) | (i62 & i63));
        int i65 = i60 & i64;
        int i66 = -(-((((i60 | i64) & (~i65)) | i65) * (-1136)));
        int i67 = i44 ^ i66;
        int i68 = ((i44 & i66) | i67) << 1;
        int i69 = -i67;
        int i70 = (i49 & identityHashCode2) | (i46 & i55);
        int i71 = i46 & identityHashCode2;
        int i72 = (i71 ^ i70) | (i70 & i71);
        int i73 = ~i72;
        int i74 = (i72 | i73) & i73;
        int i75 = i47 & i55;
        int i76 = ((~i47) & identityHashCode2) | i75;
        int i77 = i47 & identityHashCode2;
        int i78 = ~((i77 ^ i76) | (i76 & i77));
        int i79 = ((~i78) & i74) | ((~i74) & i78);
        int i80 = i74 & i78;
        int i81 = (i80 ^ i79) | (i80 & i79);
        int i82 = (i57 & hashCode3) | i58;
        int i83 = i55 & hashCode3;
        int i84 = (i82 ^ i83) | (i82 & i83);
        int i85 = i84 & i41;
        int i86 = (i84 | i41) & (~i85);
        int i87 = ~((i86 ^ i85) | (i86 & i85));
        int i88 = (i81 | i87) & (~(i81 & i87));
        int i89 = hashCode3 ^ i55;
        int i90 = ~((i89 ^ i83) | (i89 & i83));
        int i91 = (i57 & i41) | i75;
        int i92 = i41 & i55;
        int i93 = ~((i92 ^ i91) | (i91 & i92));
        int i94 = ((~i93) & i90) | ((~i90) & i93);
        int i95 = i93 & i90;
        int i96 = (i95 ^ i94) | (i95 & i94);
        int i97 = i45 ^ i48;
        int i98 = i45 & i48;
        int i99 = (i98 ^ i97) | (i98 & i97);
        int i100 = i99 ^ identityHashCode2;
        int i101 = identityHashCode2 & i99;
        int i102 = (i101 ^ i100) | (i101 & i100);
        int i103 = ~i102;
        int i104 = (i102 | i103) & i103;
        int i105 = i96 ^ i104;
        int i106 = i104 & i96;
        int i107 = ((((i68 & i69) + (i68 | i69)) - (~(((i88 & r12) | (i88 ^ r12)) * (-568)))) - 1) + (((i106 ^ i105) | (i106 & i105)) * com.gemalto.mfs.mwsdk.provisioning.model.KnownCpsErrorCodes.PUSH_INVALID_CONVERSATION);
        int i108 = getAid + 99;
        AlternateContactlessPaymentDataJson = i108 % 128;
        if (i108 % 2 == 0) {
            return java.lang.Integer.valueOf(i107);
        }
        throw new java.lang.ArithmeticException();
    }

    private static /* synthetic */ java.lang.Object AlternateContactlessPaymentDataJson(java.lang.Object[] objArr) {
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        com.payair.hce.setBackgroundColor setbackgroundcolor = (com.payair.hce.setBackgroundColor) objArr[0];
        java.lang.Object obj = objArr[1];
        int i = getAid;
        int i2 = (i ^ 28) + ((i & 28) << 1);
        int i3 = (~i2) + (i2 << 1);
        int i4 = i3 % 128;
        AlternateContactlessPaymentDataJson = i4;
        if (i3 % 2 != 0) {
            throw null;
        }
        if (setbackgroundcolor == obj) {
            int i5 = i4 ^ 9;
            int i6 = ((((i4 & 9) | i5) << 1) - (~(-i5))) - 1;
            getAid = i6 % 128;
            return java.lang.Boolean.valueOf(i6 % 2 != 0);
        }
        if (!(obj instanceof com.payair.hce.setBackgroundColor)) {
            AlternateContactlessPaymentDataJson = ((i ^ 25) + ((i & 25) << 1)) % 128;
            int i7 = i & 5;
            AlternateContactlessPaymentDataJson = ((((~i7) & (i | 5)) - (~(-(-(i7 << 1))))) - 1) % 128;
            return bool;
        }
        com.payair.hce.setBackgroundColor setbackgroundcolor2 = (com.payair.hce.setBackgroundColor) obj;
        if (!kotlin.jvm.internal.Intrinsics.areEqual(setbackgroundcolor.values, setbackgroundcolor2.values)) {
            int i8 = getAid;
            int i9 = i8 & 19;
            int i10 = (i8 | 19) & (~i9);
            int i11 = -(-(i9 << 1));
            int i12 = (i10 ^ i11) + ((i10 & i11) << 1);
            int i13 = i12 % 128;
            AlternateContactlessPaymentDataJson = i13;
            boolean z = i12 % 2 != 0;
            int i14 = (-2) - (~(((i13 | 6) << 1) - (i13 ^ 6)));
            getAid = i14 % 128;
            if (i14 % 2 != 0) {
                return java.lang.Boolean.valueOf(z);
            }
            throw null;
        }
        if (!kotlin.jvm.internal.Intrinsics.areEqual(setbackgroundcolor.AlternateContactlessPaymentDataJson, setbackgroundcolor2.AlternateContactlessPaymentDataJson)) {
            int i15 = AlternateContactlessPaymentDataJson;
            int i16 = i15 & 7;
            int i17 = (i15 | 7) & (~i16);
            int i18 = i16 << 1;
            int i19 = ((i17 ^ i18) + ((i17 & i18) << 1)) % 128;
            getAid = i19;
            int i20 = i19 & 99;
            int i21 = ((i19 ^ 99) | i20) << 1;
            int i22 = -((~i20) & (i19 | 99));
            AlternateContactlessPaymentDataJson = ((i21 & i22) + (i22 | i21)) % 128;
            return bool;
        }
        if (!kotlin.jvm.internal.Intrinsics.areEqual(setbackgroundcolor.DigitizedCardProfile, setbackgroundcolor2.DigitizedCardProfile)) {
            int i23 = AlternateContactlessPaymentDataJson;
            int i24 = i23 & 95;
            int i25 = (i23 ^ 95) | i24;
            int i26 = ((i24 ^ i25) + ((i25 & i24) << 1)) % 128;
            getAid = i26;
            int i27 = i26 & 21;
            AlternateContactlessPaymentDataJson = (((i26 | 21) & (~i27)) + (i27 << 1)) % 128;
            return bool;
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(setbackgroundcolor.valueOf, setbackgroundcolor2.valueOf)) {
            int i28 = AlternateContactlessPaymentDataJson;
            int i29 = i28 & 47;
            int i30 = (i28 | 47) & (~i29);
            int i31 = i29 << 1;
            getAid = ((i30 ^ i31) + ((i30 & i31) << 1)) % 128;
            return java.lang.Boolean.TRUE;
        }
        int i32 = (getAid + 55) % 128;
        AlternateContactlessPaymentDataJson = i32;
        int i33 = (i32 ^ 37) + ((i32 & 37) << 1);
        getAid = i33 % 128;
        if (i33 % 2 != 0) {
            return bool;
        }
        throw new java.lang.ArithmeticException();
    }

    public final boolean equals(java.lang.Object p0) {
        return ((java.lang.Boolean) valueOf(new java.lang.Object[]{this, p0}, 665905510, -665905509, java.lang.System.identityHashCode(this))).booleanValue();
    }

    public final int hashCode() {
        return ((java.lang.Integer) valueOf(new java.lang.Object[]{this}, -1736123390, 1736123393, java.lang.System.identityHashCode(this))).intValue();
    }

    public final java.lang.String toString() {
        int i = AlternateContactlessPaymentDataJson;
        int i2 = ((i ^ 43) | (i & 43)) << 1;
        int i3 = -((i & (-44)) | ((~i) & 43));
        int i4 = (i2 & i3) + (i3 | i2);
        getAid = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
        java.lang.String str = this.values;
        java.lang.String str2 = this.AlternateContactlessPaymentDataJson;
        java.lang.String str3 = this.DigitizedCardProfile;
        java.lang.String str4 = this.valueOf;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("RequestRegisterMastercard(publicKeyFingerprint=");
        sb.append(str);
        sb.append(", rgk=");
        sb.append(str2);
        sb.append(", deviceFingerprint=");
        sb.append(str3);
        sb.append(", tokenStorageType=");
        sb.append(str4);
        sb.append(")");
        java.lang.String obj = sb.toString();
        int i5 = AlternateContactlessPaymentDataJson;
        int i6 = (((i5 | 79) << 1) - (~(-((i5 & (-80)) | ((~i5) & 79))))) - 1;
        getAid = i6 % 128;
        if (i6 % 2 != 0) {
            return obj;
        }
        throw new java.lang.ArithmeticException();
    }

    public final java.lang.String DigitizedCardProfile() {
        return (java.lang.String) valueOf(new java.lang.Object[]{this}, 1464097489, -1464097489, java.lang.System.identityHashCode(this));
    }

    public final java.lang.String AlternateContactlessPaymentDataJson() {
        return (java.lang.String) valueOf(new java.lang.Object[]{this}, -1359099003, 1359099007, java.lang.System.identityHashCode(this));
    }

    public final java.lang.String valueOf() {
        return (java.lang.String) valueOf(new java.lang.Object[]{this}, 1402616361, -1402616359, java.lang.System.identityHashCode(this));
    }

    public final java.lang.String values() {
        return (java.lang.String) valueOf(new java.lang.Object[]{this}, -304978901, 304978906, java.lang.System.identityHashCode(this));
    }
}
