package com.mastercard.mpsdk.implementation;

/* loaded from: classes4.dex */
public class SingleUseKeyJson {
    private static int DigitizedCardProfile = 1;
    private static int values;

    @com.payair.hce.setSelectionFromTop(valueOf = com.visa.cbp.getTicketMetaData$6672$values.values.valueOf)
    private int mAtc;

    @com.payair.hce.setSelectionFromTop(valueOf = "hash")
    private java.lang.String mHash;

    @com.payair.hce.setSelectionFromTop(valueOf = "id")
    private java.lang.String mId;

    @com.payair.hce.setSelectionFromTop(valueOf = "idn")
    private java.lang.String mIdn;

    @com.payair.hce.setSelectionFromTop(valueOf = "sessionKeyContactlessMd")
    private java.lang.String mSessionKeyContactlessMd;

    @com.payair.hce.setSelectionFromTop(valueOf = "sessionKeyContactlessUmd")
    private java.lang.String mSessionKeyContactlessUmd;

    @com.payair.hce.setSelectionFromTop(valueOf = "sessionKeyRemotePaymentMd")
    private java.lang.String mSessionKeyRemotePaymentMd;

    @com.payair.hce.setSelectionFromTop(valueOf = "sessionKeyRemotePaymentUmd")
    private java.lang.String mSessionKeyRemotePaymentUmd;

    @com.payair.hce.setSelectionFromTop(valueOf = "sukContactlessUmd")
    private java.lang.String mSukContactlessUmd;

    @com.payair.hce.setSelectionFromTop(valueOf = "sukInfo")
    private java.lang.String mSukInfo;

    @com.payair.hce.setSelectionFromTop(valueOf = "sukRemotePaymentUmd")
    private java.lang.String mSukRemotePaymentUmd;

    public SingleUseKeyJson() {
    }

    public SingleUseKeyJson(java.lang.String str, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5, byte[] bArr6, byte[] bArr7, byte[] bArr8, int i, byte[] bArr9) {
        this.mId = str;
        this.mSukInfo = com.payair.hce.bindIsolatedService.AlternateContactlessPaymentDataJson(com.payair.hce.startService.writeReplace(bArr)).writeReplace();
        if (bArr4 != null) {
            this.mSessionKeyContactlessMd = com.payair.hce.bindIsolatedService.AlternateContactlessPaymentDataJson(com.payair.hce.startService.writeReplace(bArr4)).writeReplace();
        }
        if (bArr5 != null) {
            this.mSessionKeyRemotePaymentMd = com.payair.hce.bindIsolatedService.AlternateContactlessPaymentDataJson(com.payair.hce.startService.writeReplace(bArr5)).writeReplace();
        }
        if (bArr2 != null) {
            this.mSukContactlessUmd = com.payair.hce.bindIsolatedService.AlternateContactlessPaymentDataJson(com.payair.hce.startService.writeReplace(bArr2)).writeReplace();
        }
        if (bArr3 != null) {
            this.mSukRemotePaymentUmd = com.payair.hce.bindIsolatedService.AlternateContactlessPaymentDataJson(com.payair.hce.startService.writeReplace(bArr3)).writeReplace();
        }
        if (bArr6 != null) {
            this.mSessionKeyContactlessUmd = com.payair.hce.bindIsolatedService.AlternateContactlessPaymentDataJson(com.payair.hce.startService.writeReplace(bArr6)).writeReplace();
        }
        if (bArr7 != null) {
            this.mSessionKeyRemotePaymentUmd = com.payair.hce.bindIsolatedService.AlternateContactlessPaymentDataJson(com.payair.hce.startService.writeReplace(bArr7)).writeReplace();
        }
        this.mIdn = com.payair.hce.bindIsolatedService.AlternateContactlessPaymentDataJson(com.payair.hce.startService.writeReplace(bArr8)).writeReplace();
        this.mAtc = i;
        this.mHash = com.payair.hce.bindIsolatedService.AlternateContactlessPaymentDataJson(com.payair.hce.startService.writeReplace(bArr9)).writeReplace();
    }

    public java.lang.String getId() {
        int i = values;
        int i2 = i + 99;
        DigitizedCardProfile = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
        java.lang.String str = this.mId;
        DigitizedCardProfile = (i + 41) % 128;
        return str;
    }

    public void setId(java.lang.String str) {
        int i = values;
        int i2 = i & 53;
        int i3 = (i | 53) & (~i2);
        int i4 = -(-(i2 << 1));
        int i5 = ((i3 & i4) + (i3 | i4)) % 128;
        DigitizedCardProfile = i5;
        this.mId = str;
        int i6 = i5 & 75;
        int i7 = -(-((i5 ^ 75) | i6));
        values = ((i6 ^ i7) + ((i6 & i7) << 1)) % 128;
    }

    public java.lang.String getSukInfo() {
        int i = DigitizedCardProfile;
        int i2 = ((i ^ 59) | (i & 59)) << 1;
        int i3 = -((i & (-60)) | ((~i) & 59));
        values = ((i2 & i3) + (i2 | i3)) % 128;
        java.lang.String str = this.mSukInfo;
        int i4 = i ^ 65;
        int i5 = ((i & 65) | i4) << 1;
        int i6 = -i4;
        int i7 = (i5 ^ i6) + ((i5 & i6) << 1);
        values = i7 % 128;
        if (i7 % 2 == 0) {
            return str;
        }
        throw new java.lang.ArithmeticException();
    }

    public void setSukInfo(java.lang.String str) {
        int identityHashCode = java.lang.System.identityHashCode(this);
        int i = ~identityHashCode;
        int i2 = ((~i) & 764515447) | ((-764515448) & i);
        int i3 = i & 764515447;
        int i4 = ~((i2 ^ i3) | (i3 & i2));
        int i5 = i4 & 1865421225;
        int i6 = (-2) - (~((-897941811) - (~(-(~(-(-((((i4 | 1865421225) & (~i5)) | i5) * (-90)))))))));
        int i7 = ~(identityHashCode | 764515447);
        int i8 = (((~i7) & 8488022) | ((-8488023) & i7) | (i7 & 8488022)) * (-45);
        int i9 = i6 | i8;
        int i10 = ((i9 << 1) - (~(-((~(i6 & i8)) & i9)))) - 1;
        int i11 = (i & (-1865421226)) | (identityHashCode & 1865421225);
        int i12 = identityHashCode & (-1865421226);
        int i13 = (i12 ^ i11) | (i12 & i11);
        int i14 = ~i13;
        int i15 = (i13 | i14) & i14;
        int i16 = i15 & 764515447;
        int i17 = (i15 | 764515447) & (~i16);
        int i18 = (i17 ^ i16) | (i17 & i16);
        int i19 = i ^ 1865421225;
        int i20 = i & 1865421225;
        int i21 = (i20 ^ i19) | (i20 & i19);
        int i22 = ~i21;
        int i23 = (i21 | i22) & i22;
        int i24 = -(~(((i18 ^ i23) | (i18 & i23)) * 45));
        int i25 = (i10 & i24) + (i24 | i10);
        int identityHashCode2 = java.lang.System.identityHashCode(this);
        int i26 = ~identityHashCode2;
        int i27 = i26 & 1629323030;
        int i28 = (identityHashCode2 & (-1629323031)) | i27;
        int i29 = 1629323030 & identityHashCode2;
        int i30 = ~((i29 ^ i28) | (i28 & i29));
        int i31 = (-2) - (~((-578974897) - (~(-(~(((i30 ^ (-719713684)) | (i30 & (-719713684))) * (-318)))))));
        int i32 = identityHashCode2 & (-719713684);
        int i33 = (~i32) & (identityHashCode2 | (-719713684));
        int i34 = ~((i32 ^ i33) | (i32 & i33));
        int i35 = i27 | ((~i26) & (-1629323031));
        int i36 = i26 & (-1629323031);
        int i37 = (i35 ^ i36) | (i35 & i36) | 719713683;
        int i38 = ~i37;
        int i39 = (i37 | i38) & i38;
        int i40 = i34 ^ i39;
        int i41 = i39 & i34;
        int i42 = ((i41 ^ i40) | (i41 & i40)) * 318;
        int i43 = (i31 ^ i42) + ((i31 & i42) << 1);
        int i44 = i26 & (-719713684);
        int i45 = (i26 | (-719713684)) & (~i44);
        int i46 = (i45 ^ i44) | (i45 & i44);
        int i47 = ~((i46 ^ (-1629323031)) | (i46 & (-1629323031)));
        int i48 = identityHashCode2 & (-1092094469);
        int i49 = (identityHashCode2 | (-1092094469)) & (~i48);
        int i50 = ~((i49 ^ i48) | (i49 & i48));
        int i51 = -(~(((i50 ^ i47) | (i50 & i47)) * 318));
        if ((~i25) + (i25 << 1) > ((i43 ^ i51) + ((i51 & i43) << 1)) - 1) {
            this.mSukInfo = str;
        } else {
            this.mSukInfo = str;
            throw new java.lang.ArithmeticException();
        }
    }

    public java.lang.String getSukContactlessUmd() {
        int i = values;
        int i2 = i ^ 105;
        int i3 = (i & 105) << 1;
        DigitizedCardProfile = (((i2 | i3) << 1) - (i2 ^ i3)) % 128;
        java.lang.String str = this.mSukContactlessUmd;
        DigitizedCardProfile = ((-2) - (~(i + 104))) % 128;
        return str;
    }

    public void setSukContactlessUmd(java.lang.String str) {
        int i = values;
        int i2 = ((i & 114) + (i | 114)) - 1;
        DigitizedCardProfile = i2 % 128;
        if (i2 % 2 != 0) {
            this.mSukContactlessUmd = str;
        } else {
            this.mSukContactlessUmd = str;
            throw new java.lang.ArithmeticException();
        }
    }

    public java.lang.String getSukRemotePaymentUmd() {
        int i = DigitizedCardProfile;
        int i2 = (i ^ 27) + ((i & 27) << 1);
        values = i2 % 128;
        java.lang.String str = this.mSukRemotePaymentUmd;
        if (i2 % 2 == 0) {
            return str;
        }
        throw new java.lang.ArithmeticException();
    }

    public void setSukRemotePaymentUmd(java.lang.String str) {
        int i = values;
        int i2 = ((i | 82) << 1) - (i ^ 82);
        DigitizedCardProfile = ((~i2) + (i2 << 1)) % 128;
        this.mSukRemotePaymentUmd = str;
        int i3 = (((i & (-40)) | ((~i) & 39)) - (~(-(-((i & 39) << 1))))) - 1;
        DigitizedCardProfile = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
    }

    public java.lang.String getSessionKeyContactlessMd() {
        int i = DigitizedCardProfile;
        int i2 = ((i & 10) + (i | 10)) - 1;
        values = i2 % 128;
        java.lang.String str = this.mSessionKeyContactlessMd;
        if (i2 % 2 == 0) {
            return str;
        }
        throw new java.lang.ArithmeticException();
    }

    public void setSessionKeyContactlessMd(java.lang.String str) {
        int i = DigitizedCardProfile;
        int i2 = i & 97;
        int i3 = i | 97;
        values = (((i2 | i3) << 1) - (i2 ^ i3)) % 128;
        this.mSessionKeyContactlessMd = str;
        int i4 = i & 7;
        int i5 = (((i | 7) & (~i4)) - (~(-(-(i4 << 1))))) - 1;
        values = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    public java.lang.String getSessionKeyRemotePaymentMd() {
        int i = DigitizedCardProfile + 113;
        int i2 = i % 128;
        values = i2;
        if (i % 2 != 0) {
            throw new java.lang.ArithmeticException();
        }
        java.lang.String str = this.mSessionKeyRemotePaymentMd;
        int i3 = i2 & 95;
        int i4 = -(-(i2 | 95));
        DigitizedCardProfile = (((i3 | i4) << 1) - (i4 ^ i3)) % 128;
        return str;
    }

    public void setSessionKeyRemotePaymentMd(java.lang.String str) {
        int i = values;
        int i2 = i & 105;
        DigitizedCardProfile = (((~i2) & (i | 105)) + (i2 << 1)) % 128;
        this.mSessionKeyRemotePaymentMd = str;
        int i3 = i & 81;
        int i4 = -(-((i ^ 81) | i3));
        DigitizedCardProfile = ((i3 & i4) + (i3 | i4)) % 128;
    }

    public void setSessionKeyContactlessUmd(java.lang.String str) {
        int i = values;
        DigitizedCardProfile = ((i & 5) + (i | 5)) % 128;
        this.mSessionKeyContactlessUmd = str;
        int i2 = (i & 17) + (i | 17);
        DigitizedCardProfile = i2 % 128;
        if (i2 % 2 == 0) {
            throw new java.lang.ArithmeticException();
        }
    }

    public void setSessionKeyRemotePaymentUmd(java.lang.String str) {
        int i = values;
        int i2 = ((i | 69) << 1) - (i ^ 69);
        DigitizedCardProfile = i2 % 128;
        if (i2 % 2 != 0) {
            this.mSessionKeyRemotePaymentUmd = str;
        } else {
            this.mSessionKeyRemotePaymentUmd = str;
            throw null;
        }
    }

    public java.lang.String getIdn() {
        int i = values;
        int i2 = (i & (-98)) | ((~i) & 97);
        int i3 = -(-((i & 97) << 1));
        DigitizedCardProfile = ((i2 ^ i3) + ((i2 & i3) << 1)) % 128;
        java.lang.String str = this.mIdn;
        int i4 = i ^ 41;
        int i5 = ((i & 41) | i4) << 1;
        int i6 = -i4;
        int i7 = (i5 ^ i6) + ((i5 & i6) << 1);
        DigitizedCardProfile = i7 % 128;
        if (i7 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public void setIdn(java.lang.String str) {
        int i = DigitizedCardProfile;
        int i2 = (i ^ 15) + ((i & 15) << 1);
        values = i2 % 128;
        if (i2 % 2 == 0) {
            this.mIdn = str;
        } else {
            this.mIdn = str;
            throw null;
        }
    }

    public int getAtc() {
        int i = DigitizedCardProfile + 39;
        values = i % 128;
        if (i % 2 == 0) {
            return this.mAtc;
        }
        throw null;
    }

    public void setAtc(int i) {
        int i2 = DigitizedCardProfile;
        int i3 = i2 ^ 53;
        int i4 = ((i2 & 53) | i3) << 1;
        int i5 = -i3;
        int i6 = ((i4 ^ i5) + ((i4 & i5) << 1)) % 128;
        values = i6;
        this.mAtc = i;
        int i7 = i6 ^ 95;
        int i8 = -(-((i6 & 95) << 1));
        int i9 = (i7 ^ i8) + ((i7 & i8) << 1);
        DigitizedCardProfile = i9 % 128;
        if (i9 % 2 == 0) {
            throw null;
        }
    }

    public java.lang.String getHash() {
        int i = DigitizedCardProfile;
        int i2 = i & 69;
        int i3 = -(-((i ^ 69) | i2));
        values = ((i2 ^ i3) + ((i3 & i2) << 1)) % 128;
        java.lang.String str = this.mHash;
        DigitizedCardProfile = (((r2 ^ 4) + ((r2 & 4) << 1)) - 1) % 128;
        return str;
    }

    public void setHash(java.lang.String str) {
        int i = values;
        int i2 = (-2) - (~(((i | 14) << 1) - (i ^ 14)));
        DigitizedCardProfile = i2 % 128;
        if (i2 % 2 != 0) {
            this.mHash = str;
        } else {
            this.mHash = str;
            throw null;
        }
    }

    public java.lang.String getSessionKeyContactlessUmd() {
        int identityHashCode = java.lang.System.identityHashCode(this);
        int i = identityHashCode & 1947382645;
        int i2 = ~identityHashCode;
        int i3 = i2 ^ 1947382645;
        int i4 = (i | ((~i) & (identityHashCode | 1947382645)) | (-1882673846)) * (-676);
        int i5 = (i4 ^ 328565034) + ((i4 & 328565034) << 1);
        int i6 = 1947382645 & i2;
        int i7 = ~((i6 ^ i3) | (i6 & i3));
        int i8 = ((~i7) & 2441344) | ((-2441345) & i7);
        int i9 = i7 & 2441344;
        int i10 = -(-(((i9 ^ i8) | (i9 & i8)) * 676));
        int i11 = (i5 ^ i10) + ((i10 & i5) << 1);
        int i12 = ((~i2) & (-1882673846)) | (1882673845 & i2);
        int i13 = i2 & (-1882673846);
        int i14 = ~((i12 ^ i13) | (i13 & i12));
        int i15 = (i14 & (-1880232502)) | (1880232501 & (~i14)) | (i14 & 1880232501);
        int i16 = ~((identityHashCode ^ 1949823989) | (identityHashCode & 1949823989));
        int i17 = -(~(-(-(((i16 ^ i15) | (i16 & i15)) * 676))));
        int identityHashCode2 = java.lang.System.identityHashCode(this);
        int i18 = ~identityHashCode2;
        int i19 = ((~i18) & 1099481396) | (i18 & (-1099481397));
        int i20 = i18 & 1099481396;
        int i21 = (i19 ^ i20) | (i20 & i19);
        int i22 = ~i21;
        int i23 = (i21 | i22) & i22;
        int i24 = ((-1082146833) & i23) | ((~i23) & 1082146832);
        int i25 = i23 & 1082146832;
        int i26 = (i25 ^ i24) | (i25 & i24);
        int i27 = ~(((-1099481397) & identityHashCode2) | (identityHashCode2 ^ (-1099481397)));
        int i28 = i26 & i27;
        int i29 = (i26 | i27) & (~i28);
        int i30 = -(-(((i29 ^ i28) | (i29 & i28)) * (-338)));
        int i31 = i30 & 1605136603;
        int i32 = (i30 | 1605136603) & (~i31);
        int i33 = i31 << 1;
        int i34 = (i32 ^ i33) + ((i32 & i33) << 1);
        int i35 = i34 & (-185479198);
        int i36 = i35 + (((-185479198) ^ i34) | i35);
        int i37 = (i18 | 1099481396) & (~i20);
        int i38 = ~((i37 ^ i20) | (i37 & i20));
        int i39 = identityHashCode2 & (-17334565);
        int i40 = (identityHashCode2 | (-17334565)) & (~i39);
        int i41 = ~((i40 ^ i39) | (i40 & i39));
        int i42 = i38 & i41;
        int i43 = (i41 | i38) & (~i42);
        int i44 = ((i43 ^ i42) | (i43 & i42)) * 338;
        int i45 = i36 & i44;
        int i46 = -(-((i44 ^ i36) | i45));
        java.lang.String str = this.mSessionKeyContactlessUmd;
        if ((((i11 | i17) << 1) - (i17 ^ i11)) - 1 > (i45 ^ i46) + ((i46 & i45) << 1)) {
            throw new java.lang.ArithmeticException();
        }
        int i47 = values;
        DigitizedCardProfile = (((i47 ^ 32) + ((i47 & 32) << 1)) - 1) % 128;
        return str;
    }

    public java.lang.String getSessionKeyRemotePaymentUmd() {
        int i = DigitizedCardProfile;
        int i2 = ((i | 23) << 1) - (i ^ 23);
        values = i2 % 128;
        java.lang.String str = this.mSessionKeyRemotePaymentUmd;
        if (i2 % 2 == 0) {
            return str;
        }
        throw new java.lang.ArithmeticException();
    }
}
