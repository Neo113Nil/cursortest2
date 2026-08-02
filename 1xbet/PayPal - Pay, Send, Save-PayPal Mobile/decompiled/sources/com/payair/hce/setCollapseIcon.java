package com.payair.hce;

/* loaded from: classes4.dex */
final class setCollapseIcon extends com.payair.hce.setMaxEms {
    private static int AlternateContactlessPaymentDataJson = 0;
    private static int writeReplace = 1;
    private byte[] valueOf;

    public static /* synthetic */ java.lang.Object writeReplace(java.lang.Object[] objArr, int i, int i2, int i3) {
        int i4 = ~i2;
        int i5 = ~i3;
        int i6 = i4 | i5;
        int i7 = (i * 51) + (i2 * (-49)) + ((i | i3) * (-50)) + (((~((~i) | i4 | i3)) | (~(i6 | i))) * 50) + (((~(i | i4)) | (~i6) | (~(i | i5))) * 50);
        if (i7 == 1) {
            return valueOf(objArr);
        }
        if (i7 != 2) {
            return i7 != 3 ? i7 != 4 ? values(objArr) : writeReplace(objArr) : AlternateContactlessPaymentDataJson(objArr);
        }
        com.payair.hce.setCollapseIcon setcollapseicon = (com.payair.hce.setCollapseIcon) objArr[0];
        int i8 = AlternateContactlessPaymentDataJson;
        writeReplace = (((i8 | 63) << 1) - (i8 ^ 63)) % 128;
        if (setcollapseicon.valueOf != null) {
            int i9 = i8 & 107;
            int i10 = -(-((i8 ^ 107) | i9));
            writeReplace = (((i9 | i10) << 1) - (i10 ^ i9)) % 128;
            writeReplace(new java.lang.Object[]{setcollapseicon}, 956226451, -956226448, java.lang.System.identityHashCode(setcollapseicon));
            int i11 = writeReplace;
            int i12 = i11 & 87;
            int i13 = (i11 | 87) & (~i12);
            int i14 = -(-(i12 << 1));
            AlternateContactlessPaymentDataJson = ((i13 ^ i14) + ((i13 & i14) << 1)) % 128;
        }
        com.payair.hce.setEms DigitizedCardProfile = super.DigitizedCardProfile();
        int i15 = AlternateContactlessPaymentDataJson;
        int i16 = i15 ^ 43;
        int i17 = (i15 & 43) << 1;
        writeReplace = ((i16 & i17) + (i17 | i16)) % 128;
        return DigitizedCardProfile;
    }

    setCollapseIcon(byte[] bArr) throws java.io.IOException {
        this.valueOf = bArr;
    }

    private static /* synthetic */ java.lang.Object AlternateContactlessPaymentDataJson(java.lang.Object[] objArr) {
        com.payair.hce.setCollapseIcon setcollapseicon = (com.payair.hce.setCollapseIcon) objArr[0];
        com.payair.hce.setSubtitleTextColor setsubtitletextcolor = new com.payair.hce.setSubtitleTextColor(setcollapseicon.valueOf);
        int i = writeReplace;
        int i2 = i & 47;
        int i3 = ((i ^ 47) | i2) << 1;
        int i4 = -((i | 47) & (~i2));
        int i5 = i3 ^ i4;
        int i6 = i4 & i3;
        while (true) {
            AlternateContactlessPaymentDataJson = (i5 + (i6 << 1)) % 128;
            if (!setsubtitletextcolor.hasMoreElements()) {
                setcollapseicon.valueOf = null;
                int i7 = writeReplace;
                int i8 = (i7 ^ 41) + ((i7 & 41) << 1);
                AlternateContactlessPaymentDataJson = i8 % 128;
                if (i8 % 2 == 0) {
                    return null;
                }
                throw null;
            }
            int i9 = AlternateContactlessPaymentDataJson;
            int i10 = ((i9 | 81) << 1) - (i9 ^ 81);
            writeReplace = i10 % 128;
            if (i10 % 2 != 0) {
                setcollapseicon.values.addElement(setsubtitletextcolor.nextElement());
                int i11 = writeReplace;
                i5 = i11 ^ 17;
                i6 = i11 & 17;
            } else {
                setcollapseicon.values.addElement(setsubtitletextcolor.nextElement());
                throw null;
            }
        }
    }

    @Override // com.payair.hce.setMaxEms
    public final com.payair.hce.setShadowLayer values(int i) {
        com.payair.hce.setShadowLayer values;
        synchronized (this) {
            int i2 = writeReplace;
            int i3 = i2 & 15;
            int i4 = (i2 | 15) & (~i3);
            int i5 = -(-(i3 << 1));
            int i6 = ((i4 | i5) << 1) - (i4 ^ i5);
            AlternateContactlessPaymentDataJson = i6 % 128;
            if (i6 % 2 == 0) {
                if (this.valueOf != null) {
                    writeReplace(new java.lang.Object[]{this}, 956226451, -956226448, java.lang.System.identityHashCode(this));
                    int i7 = AlternateContactlessPaymentDataJson;
                    writeReplace = ((((i7 | 20) << 1) - (i7 ^ 20)) - 1) % 128;
                }
                values = super.values(i);
                int i8 = writeReplace;
                int i9 = (((i8 ^ 99) | (i8 & 99)) << 1) - ((i8 & (-100)) | ((~i8) & 99));
                AlternateContactlessPaymentDataJson = i9 % 128;
                if (i9 % 2 != 0) {
                    throw null;
                }
            } else {
                throw new java.lang.ArithmeticException();
            }
        }
        return values;
    }

    @Override // com.payair.hce.setMaxEms
    public final java.util.Enumeration values() {
        synchronized (this) {
            int i = AlternateContactlessPaymentDataJson;
            writeReplace = (((i & 58) + (i | 58)) - 1) % 128;
            if (this.valueOf != null) {
                com.payair.hce.setSubtitleTextColor setsubtitletextcolor = new com.payair.hce.setSubtitleTextColor(this.valueOf);
                int i2 = AlternateContactlessPaymentDataJson;
                int i3 = i2 & 15;
                writeReplace = (i3 + ((i2 ^ 15) | i3)) % 128;
                return setsubtitletextcolor;
            }
            writeReplace = (((i & 38) + (i | 38)) - 1) % 128;
            java.util.Enumeration values = super.values();
            int i4 = (-2) - (~(AlternateContactlessPaymentDataJson + 38));
            writeReplace = i4 % 128;
            if (i4 % 2 != 0) {
                return values;
            }
            throw new java.lang.NullPointerException();
        }
    }

    @Override // com.payair.hce.setMaxEms
    public final int valueOf() {
        int valueOf;
        synchronized (this) {
            int i = writeReplace;
            int i2 = i & 39;
            int i3 = (~i2) & (i | 39);
            int i4 = -(-(i2 << 1));
            AlternateContactlessPaymentDataJson = (((i3 | i4) << 1) - (i4 ^ i3)) % 128;
            if (this.valueOf != null) {
                int i5 = i & 97;
                int i6 = ((((i ^ 97) | i5) << 1) - (~(-((i | 97) & (~i5))))) - 1;
                AlternateContactlessPaymentDataJson = i6 % 128;
                if (i6 % 2 == 0) {
                    writeReplace(new java.lang.Object[]{this}, 956226451, -956226448, java.lang.System.identityHashCode(this));
                } else {
                    writeReplace(new java.lang.Object[]{this}, 956226451, -956226448, java.lang.System.identityHashCode(this));
                    throw new java.lang.NullPointerException();
                }
            }
            valueOf = super.valueOf();
            int i7 = writeReplace + 61;
            AlternateContactlessPaymentDataJson = i7 % 128;
            if (i7 % 2 != 0) {
                throw new java.lang.ArithmeticException();
            }
        }
        return valueOf;
    }

    private static /* synthetic */ java.lang.Object valueOf(java.lang.Object[] objArr) {
        com.payair.hce.setCollapseIcon setcollapseicon = (com.payair.hce.setCollapseIcon) objArr[0];
        int i = writeReplace;
        int i2 = i & 61;
        int i3 = (~i2) & (i | 61);
        int i4 = i2 << 1;
        AlternateContactlessPaymentDataJson = ((i3 & i4) + (i4 | i3)) % 128;
        if (setcollapseicon.valueOf != null) {
            int i5 = (i ^ 11) + ((i & 11) << 1);
            AlternateContactlessPaymentDataJson = i5 % 128;
            if (i5 % 2 != 0) {
                writeReplace(new java.lang.Object[]{setcollapseicon}, 956226451, -956226448, java.lang.System.identityHashCode(setcollapseicon));
                throw new java.lang.ArithmeticException();
            }
            writeReplace(new java.lang.Object[]{setcollapseicon}, 956226451, -956226448, java.lang.System.identityHashCode(setcollapseicon));
            int i6 = writeReplace;
            AlternateContactlessPaymentDataJson = (((i6 | 99) << 1) - (i6 ^ 99)) % 128;
        }
        com.payair.hce.setEms IccPrivateKeyCrtComponentsJson = super.IccPrivateKeyCrtComponentsJson();
        int i7 = AlternateContactlessPaymentDataJson;
        int i8 = (-2) - (~((i7 & 64) + (i7 | 64)));
        writeReplace = i8 % 128;
        if (i8 % 2 != 0) {
            return IccPrivateKeyCrtComponentsJson;
        }
        throw null;
    }

    private static /* synthetic */ java.lang.Object writeReplace(java.lang.Object[] objArr) {
        com.payair.hce.setCollapseIcon setcollapseicon = (com.payair.hce.setCollapseIcon) objArr[0];
        int i = writeReplace;
        AlternateContactlessPaymentDataJson = ((i & 13) + (i | 13)) % 128;
        byte[] bArr = setcollapseicon.valueOf;
        if (bArr == null) {
            int AlternateContactlessPaymentDataJson2 = super.IccPrivateKeyCrtComponentsJson().AlternateContactlessPaymentDataJson();
            int i2 = AlternateContactlessPaymentDataJson;
            writeReplace = (((i2 | 9) << 1) - (i2 ^ 9)) % 128;
            return java.lang.Integer.valueOf(AlternateContactlessPaymentDataJson2);
        }
        int i3 = (i | 83) << 1;
        int i4 = -((i & (-84)) | ((~i) & 83));
        AlternateContactlessPaymentDataJson = ((i3 & i4) + (i4 | i3)) % 128;
        int length = bArr.length;
        int intValue = ((java.lang.Integer) com.payair.hce.setNavigationIcon.DigitizedCardProfile(new java.lang.Object[]{java.lang.Integer.valueOf(length)}, -1174070258, 1174070259, length)).intValue();
        int identityHashCode = java.lang.System.identityHashCode(setcollapseicon);
        int i5 = intValue * (-523);
        int i6 = ((i5 ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PLAID_LOGO_VALUE) + ((i5 & com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PLAID_LOGO_VALUE) << 1)) - 1;
        int i7 = ~intValue;
        int i8 = i7 & 1;
        int i9 = (i7 | 1) & (~i8);
        int i10 = ~((i8 ^ i9) | (i9 & i8));
        int i11 = intValue & (-2);
        int i12 = (~i11) & (intValue | (-2));
        int i13 = ~((i12 ^ i11) | (i11 & i12));
        int i14 = ((~i13) & i10) | ((~i10) & i13);
        int i15 = i10 & i13;
        int i16 = (i15 ^ i14) | (i15 & i14);
        int i17 = (identityHashCode ^ (-2)) | (identityHashCode & (-2));
        int i18 = ~i17;
        int i19 = (i17 | i18) & i18;
        int i20 = ((~i19) & i16) | ((~i16) & i19);
        int i21 = i16 & i19;
        int i22 = -(~(((i21 ^ i20) | (i21 & i20)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_WAIT_SOME_TIME_VALUE));
        int i23 = ((((i6 ^ i22) + ((i6 & i22) << 1)) - 1) - (~((~((intValue ^ (-2)) | i11)) * (-786)))) - 1;
        int i24 = ~identityHashCode;
        int i25 = (identityHashCode | i24) & i24;
        int i26 = ~((i25 & 1) | ((~i25) & (-2)) | (i25 & (-2)));
        int i27 = (i7 | intValue) & i7;
        int i28 = (i27 & (-2)) | ((~i27) & 1);
        int i29 = i27 & 1;
        int i30 = (i29 ^ i28) | (i29 & i28);
        int i31 = ~i30;
        int i32 = (i30 | i31) & i31;
        int i33 = (i26 ^ i32) | (i26 & i32);
        int i34 = (intValue & 1) | (i7 & (-2));
        int i35 = ~((i34 ^ i11) | (i11 & i34));
        int i36 = i33 ^ i35;
        int i37 = i35 & i33;
        int i38 = -(-(((i37 ^ i36) | (i37 & i36)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_WAIT_SOME_TIME_VALUE));
        int i39 = i23 & i38;
        int i40 = i38 | i23;
        int i41 = (i39 & i40) + (i40 | i39);
        int length2 = setcollapseicon.valueOf.length;
        int i42 = writeReplace;
        int i43 = (i42 ^ 113) + ((i42 & 113) << 1);
        AlternateContactlessPaymentDataJson = i43 % 128;
        if (i43 % 2 == 0) {
            return java.lang.Integer.valueOf((i41 ^ length2) + ((length2 & i41) << 1));
        }
        throw null;
    }

    private static /* synthetic */ java.lang.Object values(java.lang.Object[] objArr) {
        com.payair.hce.setCollapseIcon setcollapseicon = (com.payair.hce.setCollapseIcon) objArr[0];
        com.payair.hce.setMaxLines setmaxlines = (com.payair.hce.setMaxLines) objArr[1];
        int i = (AlternateContactlessPaymentDataJson + 79) % 128;
        writeReplace = i;
        byte[] bArr = setcollapseicon.valueOf;
        if (bArr == null) {
            super.IccPrivateKeyCrtComponentsJson().values(setmaxlines);
            int i2 = writeReplace + 105;
            AlternateContactlessPaymentDataJson = i2 % 128;
            if (i2 % 2 == 0) {
                return null;
            }
            throw null;
        }
        int i3 = (i ^ 19) + ((i & 19) << 1);
        AlternateContactlessPaymentDataJson = i3 % 128;
        setmaxlines.AlternateContactlessPaymentDataJson(i3 % 2 != 0 ? 52 : 48, bArr);
        return null;
    }

    @Override // com.payair.hce.setMaxEms, com.payair.hce.setEms
    final void values(com.payair.hce.setMaxLines setmaxlines) throws java.io.IOException {
        writeReplace(new java.lang.Object[]{this, setmaxlines}, 867336679, -867336679, java.lang.System.identityHashCode(this));
    }

    @Override // com.payair.hce.setEms
    final int AlternateContactlessPaymentDataJson() throws java.io.IOException {
        return ((java.lang.Integer) writeReplace(new java.lang.Object[]{this}, 343415470, -343415466, java.lang.System.identityHashCode(this))).intValue();
    }

    @Override // com.payair.hce.setMaxEms, com.payair.hce.setEms
    final com.payair.hce.setEms IccPrivateKeyCrtComponentsJson() {
        return (com.payair.hce.setEms) writeReplace(new java.lang.Object[]{this}, -2029085954, 2029085955, java.lang.System.identityHashCode(this));
    }

    @Override // com.payair.hce.setMaxEms, com.payair.hce.setEms
    final com.payair.hce.setEms DigitizedCardProfile() {
        return (com.payair.hce.setEms) writeReplace(new java.lang.Object[]{this}, -620458190, 620458192, java.lang.System.identityHashCode(this));
    }

    private void SdkCoreAlternateContactlessPaymentDataImpl() {
        writeReplace(new java.lang.Object[]{this}, 956226451, -956226448, java.lang.System.identityHashCode(this));
    }
}
