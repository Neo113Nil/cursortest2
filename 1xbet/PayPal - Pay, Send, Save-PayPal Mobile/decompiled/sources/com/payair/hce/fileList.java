package com.payair.hce;

/* loaded from: classes4.dex */
public class fileList {
    private static int IccPrivateKeyCrtComponentsJson = 0;
    private static int getAid = 1;
    private java.lang.String AlternateContactlessPaymentDataJson;
    private java.lang.String DigitizedCardProfile;
    private java.lang.String valueOf;
    private com.payair.hce.checkPermission values = com.payair.hce.checkPermission.DigitizedCardProfile(com.payair.hce.registerReceiver.values);
    private java.lang.String writeReplace;

    public static /* synthetic */ java.lang.Object DigitizedCardProfile(java.lang.Object[] objArr, int i, int i2, int i3) {
        int i4 = ~i;
        int i5 = ~i2;
        int i6 = i4 | i5;
        int i7 = ~i3;
        int i8 = i | i7;
        int i9 = (i * 569) + (i2 * 569) + (((~i6) | (~(i4 | i7)) | (~(i5 | i7))) * (-1136)) + (((~(i4 | i3)) | (~(i5 | i3)) | (~(i8 | i2))) * (-568)) + (((~(i2 | i7)) | (~i8) | (~(i3 | i6))) * com.gemalto.mfs.mwsdk.provisioning.model.KnownCpsErrorCodes.PUSH_INVALID_CONVERSATION);
        if (i9 == 1) {
            return AlternateContactlessPaymentDataJson(objArr);
        }
        if (i9 == 2) {
            return valueOf(objArr);
        }
        if (i9 == 3) {
            return values(objArr);
        }
        if (i9 == 4) {
            return DigitizedCardProfile(objArr);
        }
        if (i9 == 5) {
            return writeReplace(objArr);
        }
        com.payair.hce.fileList filelist = (com.payair.hce.fileList) objArr[0];
        java.lang.String str = (java.lang.String) objArr[1];
        int i10 = getAid;
        int i11 = i10 & 1;
        int i12 = ((i10 ^ 1) | i11) << 1;
        int i13 = -((i10 | 1) & (~i11));
        int i14 = ((i12 ^ i13) + ((i13 & i12) << 1)) % 128;
        IccPrivateKeyCrtComponentsJson = i14;
        filelist.DigitizedCardProfile = str;
        int i15 = i14 & 49;
        int i16 = -(-(i14 | 49));
        getAid = ((i15 ^ i16) + ((i15 & i16) << 1)) % 128;
        return null;
    }

    public fileList(java.lang.String str, java.lang.String str2) {
        this.valueOf = str;
        this.AlternateContactlessPaymentDataJson = str2;
    }

    public fileList(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        this.valueOf = str;
        this.AlternateContactlessPaymentDataJson = str2;
        this.writeReplace = str3;
        this.DigitizedCardProfile = str4;
    }

    public fileList(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        this.AlternateContactlessPaymentDataJson = str;
        this.writeReplace = str2;
        this.DigitizedCardProfile = str3;
    }

    private static /* synthetic */ java.lang.Object valueOf(java.lang.Object[] objArr) {
        com.payair.hce.fileList filelist = (com.payair.hce.fileList) objArr[0];
        int i = IccPrivateKeyCrtComponentsJson;
        int i2 = i + 111;
        getAid = i2 % 128;
        java.lang.String str = filelist.valueOf;
        if (i2 % 2 == 0) {
            throw null;
        }
        int i3 = i ^ 73;
        int i4 = (i & 73) << 1;
        getAid = (((i3 | i4) << 1) - (i4 ^ i3)) % 128;
        return str;
    }

    private static /* synthetic */ java.lang.Object writeReplace(java.lang.Object[] objArr) {
        com.payair.hce.fileList filelist = (com.payair.hce.fileList) objArr[0];
        int i = getAid;
        int i2 = ((i | 77) << 1) - (i ^ 77);
        IccPrivateKeyCrtComponentsJson = i2 % 128;
        java.lang.String str = filelist.AlternateContactlessPaymentDataJson;
        if (i2 % 2 == 0) {
            return str;
        }
        throw null;
    }

    private static /* synthetic */ java.lang.Object AlternateContactlessPaymentDataJson(java.lang.Object[] objArr) {
        com.payair.hce.fileList filelist = (com.payair.hce.fileList) objArr[0];
        int i = getAid + 105;
        IccPrivateKeyCrtComponentsJson = i % 128;
        java.lang.String str = filelist.writeReplace;
        if (i % 2 == 0) {
            return str;
        }
        throw null;
    }

    private static /* synthetic */ java.lang.Object DigitizedCardProfile(java.lang.Object[] objArr) {
        com.payair.hce.fileList filelist = (com.payair.hce.fileList) objArr[0];
        int i = getAid;
        int i2 = i | 51;
        int i3 = i2 << 1;
        int i4 = -((~(i & 51)) & i2);
        int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
        IccPrivateKeyCrtComponentsJson = i5 % 128;
        java.lang.String str = filelist.DigitizedCardProfile;
        if (i5 % 2 == 0) {
            return str;
        }
        throw new java.lang.ArithmeticException();
    }

    private static /* synthetic */ java.lang.Object values(java.lang.Object[] objArr) {
        com.payair.hce.fileList filelist = (com.payair.hce.fileList) objArr[0];
        java.lang.String str = (java.lang.String) objArr[1];
        int identityHashCode = java.lang.System.identityHashCode(filelist);
        int i = ~identityHashCode;
        int i2 = (i & 2017447247) | (identityHashCode & (-2017447248));
        int i3 = identityHashCode & 2017447247;
        int i4 = ~((i2 ^ i3) | (i2 & i3));
        int i5 = ((~i4) & 92278928) | ((-92278929) & i4);
        int i6 = i4 & 92278928;
        int i7 = (i6 ^ i5) | (i6 & i5);
        int i8 = ((-93966495) & i) | ((~i) & 93966494);
        int i9 = i & 93966494;
        int i10 = (i9 ^ i8) | (i9 & i8);
        int i11 = i10 & (-2017447248);
        int i12 = (i10 | (-2017447248)) & (~i11);
        int i13 = (i12 ^ i11) | (i12 & i11);
        int i14 = ~i13;
        int i15 = (i13 | i14) & i14;
        int i16 = i7 & i15;
        int i17 = (i7 | i15) & (~i16);
        int i18 = ((i17 ^ i16) | (i17 & i16)) * (-470);
        int i19 = (i18 & (-1502057554)) + (i18 | (-1502057554));
        int i20 = ~((identityHashCode ^ 2109726175) | (identityHashCode & 2109726175));
        int i21 = ((~i10) & (-2017447248)) | (2017447247 & i10);
        int i22 = ~((i21 ^ i11) | (i11 & i21));
        int i23 = ((~i22) & i20) | ((~i20) & i22);
        int i24 = i20 & i22;
        int i25 = -(-(((i24 ^ i23) | (i24 & i23)) * 470));
        int i26 = i19 & i25;
        int i27 = -(-((i25 ^ i19) | i26));
        int identityHashCode2 = java.lang.System.identityHashCode(filelist);
        int i28 = ~identityHashCode2;
        int i29 = (i28 | identityHashCode2) & i28;
        int i30 = i29 & 1503817264;
        int i31 = (i29 | 1503817264) & (~i30);
        int i32 = (i31 ^ i30) | (i31 & i30);
        int i33 = ~i32;
        int i34 = (i32 | i33) & i33;
        int i35 = (-810623368) - (~(-(~((((i34 & (-1194345155)) | ((~i34) & 1194345154)) | (i34 & 1194345154)) * (-328)))));
        int i36 = identityHashCode2 ^ 1194345154;
        int i37 = identityHashCode2 & 1194345154;
        int i38 = -(-(((i36 ^ i37) | (i36 & i37)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SIGNIN_HEADER_VALUE));
        int i39 = ((i35 | i38) << 1) - (i38 ^ i35);
        int i40 = (identityHashCode2 ^ (-1503817265)) | (identityHashCode2 & (-1503817265));
        int i41 = ~i40;
        int i42 = (i40 | i41) & i41;
        int i43 = i42 ^ 1092633088;
        int i44 = i42 & 1092633088;
        int i45 = (i44 ^ i43) | (i44 & i43);
        int i46 = ~((i28 & 1194345154) | (i28 ^ 1194345154) | 1503817264);
        int i47 = i45 & i46;
        int i48 = -(~((((i45 | i46) & (~i47)) | i47) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SIGNIN_HEADER_VALUE));
        int i49 = ((i39 | i48) << 1) - (i48 ^ i39);
        if ((i26 & i27) + (i27 | i26) <= (~i49) + (i49 << 1)) {
            filelist.writeReplace = str;
            int i50 = getAid;
            int i51 = i50 & 83;
            int i52 = (i50 | 83) & (~i51);
            int i53 = i51 << 1;
            int i54 = (i52 & i53) + (i52 | i53);
            IccPrivateKeyCrtComponentsJson = i54 % 128;
            if (i54 % 2 == 0) {
                return null;
            }
            throw null;
        }
        filelist.writeReplace = str;
        throw new java.lang.ArithmeticException();
    }

    public java.lang.String toString() {
        int i = IccPrivateKeyCrtComponentsJson;
        int i2 = i & 97;
        int i3 = i | 97;
        getAid = ((i2 & i3) + (i2 | i3)) % 128;
        int i4 = (((i & (-118)) | ((~i) & 117)) - (~((i & 117) << 1))) - 1;
        getAid = i4 % 128;
        if (i4 % 2 != 0) {
            return "fileList";
        }
        throw new java.lang.ArithmeticException();
    }

    public final void AlternateContactlessPaymentDataJson(java.lang.String str) {
        DigitizedCardProfile(new java.lang.Object[]{this, str}, -403792301, 403792301, java.lang.System.identityHashCode(this));
    }

    public final void valueOf(java.lang.String str) {
        DigitizedCardProfile(new java.lang.Object[]{this, str}, -149929902, 149929905, java.lang.System.identityHashCode(this));
    }

    public final java.lang.String AlternateContactlessPaymentDataJson() {
        return (java.lang.String) DigitizedCardProfile(new java.lang.Object[]{this}, -1777947608, 1777947612, java.lang.System.identityHashCode(this));
    }

    public final java.lang.String DigitizedCardProfile() {
        return (java.lang.String) DigitizedCardProfile(new java.lang.Object[]{this}, 1373679103, -1373679102, java.lang.System.identityHashCode(this));
    }

    public final java.lang.String writeReplace() {
        return (java.lang.String) DigitizedCardProfile(new java.lang.Object[]{this}, -2043543314, 2043543319, java.lang.System.identityHashCode(this));
    }

    public final java.lang.String valueOf() {
        return (java.lang.String) DigitizedCardProfile(new java.lang.Object[]{this}, -1279268571, 1279268573, java.lang.System.identityHashCode(this));
    }
}
