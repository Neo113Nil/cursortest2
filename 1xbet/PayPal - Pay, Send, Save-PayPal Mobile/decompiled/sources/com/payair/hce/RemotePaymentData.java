package com.payair.hce;

/* loaded from: classes4.dex */
public final class RemotePaymentData {
    private static int getAid = 1;
    private static int getProfileVersion;
    private com.payair.hce.transactionCanBeResumed AlternateContactlessPaymentDataJson;
    private com.payair.hce.getDigitizedCard DigitizedCardProfile;
    private com.payair.hce.transactionCanBeResumed IccPrivateKeyCrtComponentsJson;
    private com.payair.hce.transactionCanBeResumed SdkCoreAlternateContactlessPaymentDataImpl;
    private com.payair.hce.transactionCanBeResumed valueOf;
    private com.payair.hce.setAip values;
    private com.payair.hce.getDigitizedCard writeReplace;

    public static /* synthetic */ java.lang.Object values(java.lang.Object[] objArr, int i, int i2, int i3) {
        int i4 = ~i2;
        int i5 = ~i3;
        switch ((i * (-830)) + (i2 * 832) + (((~(i4 | i5)) | (~(i | i2 | i3))) * (-831)) + ((~(i4 | i | i3)) * (-1662)) + (((~((~i) | i5)) | (~(i | i3)) | (~(i2 | i3))) * 831)) {
            case 1:
                return values(objArr);
            case 2:
                return writeReplace(objArr);
            case 3:
                com.payair.hce.RemotePaymentData remotePaymentData = (com.payair.hce.RemotePaymentData) objArr[0];
                int i6 = getProfileVersion;
                getAid = (((i6 | 3) << 1) - (i6 ^ 3)) % 128;
                com.payair.hce.getDigitizedCard getdigitizedcard = remotePaymentData.writeReplace;
                int i7 = (i6 & (-14)) | ((~i6) & 13);
                int i8 = (i6 & 13) << 1;
                getAid = ((i7 & i8) + (i8 | i7)) % 128;
                return getdigitizedcard;
            case 4:
                com.payair.hce.RemotePaymentData remotePaymentData2 = (com.payair.hce.RemotePaymentData) objArr[0];
                int i9 = getAid;
                int i10 = i9 & 11;
                int i11 = ((i9 ^ 11) | i10) << 1;
                int i12 = -((i9 | 11) & (~i10));
                getProfileVersion = (((i11 | i12) << 1) - (i12 ^ i11)) % 128;
                return remotePaymentData2.SdkCoreAlternateContactlessPaymentDataImpl;
            case 5:
                java.util.List<byte[]> list = (java.util.List) objArr[0];
                int i13 = getAid;
                getProfileVersion = (((i13 | 117) << 1) - (i13 ^ 117)) % 128;
                java.util.Iterator it = list.iterator();
                int i14 = getProfileVersion;
                getAid = ((i14 & 65) + (i14 | 65)) % 128;
                int i15 = 0;
                while (it.hasNext()) {
                    int i16 = getAid;
                    int i17 = i16 & 49;
                    getProfileVersion = ((((i16 ^ 49) | i17) << 1) - ((i16 | 49) & (~i17))) % 128;
                    int length = ((byte[]) it.next()).length;
                    int currentTimeMillis = (int) java.lang.System.currentTimeMillis();
                    int i18 = length * (-129);
                    int i19 = -(-(i15 * 131));
                    int i20 = ((i18 & i19) - (~(i18 | i19))) - 1;
                    int i21 = ~i15;
                    int i22 = ~currentTimeMillis;
                    int i23 = i21 & i22;
                    int i24 = (i22 | i21) & (~i23);
                    int i25 = (i24 ^ i23) | (i24 & i23);
                    int i26 = ~length;
                    int i27 = (i26 & i25) | ((~i25) & length);
                    int i28 = i25 & length;
                    int i29 = -(~((~((i28 ^ i27) | (i28 & i27))) * 130));
                    int i30 = i21 ^ length;
                    int i31 = i21 & length;
                    int i32 = (((((i20 | i29) << 1) - (i29 ^ i20)) - 1) - (~(-(~((~((i31 & i30) | (i30 ^ i31))) * (-260)))))) - 1;
                    int i33 = (~i32) + (i32 << 1);
                    int i34 = i26 ^ i15;
                    int i35 = i15 & i26;
                    int i36 = ~((i35 ^ i34) | (i35 & i34));
                    int i37 = (length | i21) & (~i31);
                    int i38 = (i37 ^ i31) | (i37 & i31);
                    int i39 = i38 & currentTimeMillis;
                    int i40 = (i38 | currentTimeMillis) & (~i39);
                    int i41 = ~((i40 ^ i39) | (i40 & i39));
                    int i42 = i36 ^ i41;
                    int i43 = i36 & i41;
                    int i44 = -(-(((i43 ^ i42) | (i43 & i42)) * 130));
                    i15 = (i44 ^ i33) + ((i44 & i33) << 1);
                    int i45 = getAid;
                    getProfileVersion = (((i45 ^ 68) + ((i45 & 68) << 1)) - 1) % 128;
                }
                byte[] bArr = new byte[i15];
                getAid = (getProfileVersion + 39) % 128;
                int i46 = 0;
                for (byte[] bArr2 : list) {
                    int i47 = getProfileVersion;
                    getAid = ((-2) - (~((i47 ^ 24) + ((i47 & 24) << 1)))) % 128;
                    java.lang.System.arraycopy(bArr2, 0, bArr, i46, bArr2.length);
                    int length2 = bArr2.length;
                    int currentTimeMillis2 = (int) java.lang.System.currentTimeMillis();
                    int i48 = length2 * (-381);
                    int i49 = i46 * 192;
                    int i50 = ((i48 & i49) - (~(i48 | i49))) - 1;
                    int i51 = ~length2;
                    int i52 = i51 & (i51 | length2);
                    int i53 = -(~(i52 * (-191)));
                    int i54 = ((i50 ^ i53) + ((i53 & i50) << 1)) - 1;
                    int i55 = ~currentTimeMillis2;
                    int i56 = (currentTimeMillis2 ^ i46) | (currentTimeMillis2 & i46);
                    int i57 = ~i56;
                    int i58 = (i56 | i57) & i57;
                    int i59 = length2 & i58;
                    int i60 = (length2 | i58) & (~i59);
                    int i61 = -(-(((i60 ^ i59) | (i60 & i59)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_2_NEW_VALUE));
                    int i62 = ((((~i61) & i54) | ((~i54) & i61)) - (~((i61 & i54) << 1))) - 1;
                    int i63 = i52 & i46;
                    int i64 = ~(i63 | ((i52 | i46) & (~i63)));
                    int i65 = ((~i46) & i55) | ((~i55) & i46);
                    int i66 = i46 & i55;
                    int i67 = ~((i66 ^ i65) | (i66 & i65));
                    int i68 = -(~(-(-(((i67 ^ i64) | (i67 & i64)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_2_NEW_VALUE))));
                    i46 = ((i62 & i68) + (i68 | i62)) - 1;
                    int i69 = getProfileVersion;
                    int i70 = i69 & 89;
                    getAid = (i70 + ((i69 ^ 89) | i70)) % 128;
                }
                int i71 = getAid;
                int i72 = i71 & 109;
                getProfileVersion = (i72 + ((i71 ^ 109) | i72)) % 128;
                return bArr;
            case 6:
                com.payair.hce.RemotePaymentData remotePaymentData3 = (com.payair.hce.RemotePaymentData) objArr[0];
                int i73 = getAid;
                getProfileVersion = ((i73 & 97) + (i73 | 97)) % 128;
                com.payair.hce.transactionCanBeResumed transactioncanberesumed = remotePaymentData3.AlternateContactlessPaymentDataJson;
                int i74 = i73 & 107;
                getProfileVersion = (((i73 | 107) & (~i74)) + (i74 << 1)) % 128;
                return transactioncanberesumed;
            case 7:
                return valueOf(objArr);
            case 8:
                return AlternateContactlessPaymentDataJson(objArr);
            default:
                return DigitizedCardProfile(objArr);
        }
    }

    public RemotePaymentData(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5, byte[] bArr6, java.util.List<com.payair.hce.startDeviceAuthenticationForRegistration> list, boolean z) throws com.payair.hce.updateSukFileName {
        this.values = new com.payair.hce.setAip(bArr, list);
        this.writeReplace = new com.payair.hce.getDigitizedCard(bArr2, false);
        this.DigitizedCardProfile = new com.payair.hce.getDigitizedCard(bArr2, true);
        if (bArr3 == null && !z) {
            throw new com.payair.hce.updateSukFileName(com.payair.hce.requestTaskStatusUpdate.getPaymentFci);
        }
        if (bArr4 == null) {
            throw new com.payair.hce.updateSukFileName(com.payair.hce.requestTaskStatusUpdate.getCiacDecline);
        }
        this.AlternateContactlessPaymentDataJson = com.payair.hce.transactionCanBeResumed.AlternateContactlessPaymentDataJson(bArr4);
        if (bArr5 != null) {
            this.SdkCoreAlternateContactlessPaymentDataImpl = com.payair.hce.transactionCanBeResumed.AlternateContactlessPaymentDataJson(bArr5);
        }
        if (bArr6 != null) {
            this.IccPrivateKeyCrtComponentsJson = com.payair.hce.transactionCanBeResumed.AlternateContactlessPaymentDataJson(bArr6);
        }
        if (bArr3 != null) {
            this.valueOf = com.payair.hce.transactionCanBeResumed.AlternateContactlessPaymentDataJson(bArr3);
        }
    }

    private static /* synthetic */ java.lang.Object valueOf(java.lang.Object[] objArr) {
        com.payair.hce.RemotePaymentData remotePaymentData = (com.payair.hce.RemotePaymentData) objArr[0];
        int i = getAid;
        int i2 = i & 111;
        getProfileVersion = (i2 + ((i ^ 111) | i2)) % 128;
        com.payair.hce.setAip setaip = remotePaymentData.values;
        int i3 = i + 56;
        int i4 = (~i3) + (i3 << 1);
        getProfileVersion = i4 % 128;
        if (i4 % 2 == 0) {
            return setaip;
        }
        throw null;
    }

    private static /* synthetic */ java.lang.Object writeReplace(java.lang.Object[] objArr) {
        com.payair.hce.RemotePaymentData remotePaymentData = (com.payair.hce.RemotePaymentData) objArr[0];
        int i = getAid;
        int i2 = i & 73;
        int i3 = (i ^ 73) | i2;
        int i4 = ((i2 | i3) << 1) - (i3 ^ i2);
        getProfileVersion = i4 % 128;
        com.payair.hce.getDigitizedCard getdigitizedcard = remotePaymentData.DigitizedCardProfile;
        if (i4 % 2 == 0) {
            return getdigitizedcard;
        }
        throw new java.lang.ArithmeticException();
    }

    private static /* synthetic */ java.lang.Object values(java.lang.Object[] objArr) {
        com.payair.hce.RemotePaymentData remotePaymentData = (com.payair.hce.RemotePaymentData) objArr[0];
        int i = getAid;
        getProfileVersion = ((i & 25) + (i | 25)) % 128;
        com.payair.hce.transactionCanBeResumed transactioncanberesumed = remotePaymentData.valueOf;
        int i2 = (i & 97) + (i | 97);
        getProfileVersion = i2 % 128;
        if (i2 % 2 == 0) {
            return transactioncanberesumed;
        }
        throw null;
    }

    private static /* synthetic */ java.lang.Object DigitizedCardProfile(java.lang.Object[] objArr) {
        com.payair.hce.RemotePaymentData remotePaymentData = (com.payair.hce.RemotePaymentData) objArr[0];
        int i = getProfileVersion;
        getAid = (i + 33) % 128;
        com.payair.hce.transactionCanBeResumed transactioncanberesumed = remotePaymentData.IccPrivateKeyCrtComponentsJson;
        int i2 = i & 77;
        int i3 = (((i | 77) & (~i2)) - (~(i2 << 1))) - 1;
        getAid = i3 % 128;
        if (i3 % 2 != 0) {
            return transactioncanberesumed;
        }
        throw null;
    }

    public RemotePaymentData() {
    }

    private static /* synthetic */ java.lang.Object AlternateContactlessPaymentDataJson(java.lang.Object[] objArr) {
        byte[] bArr = (byte[]) objArr[0];
        int i = (getProfileVersion + 25) % 128;
        getAid = i;
        if (bArr == null) {
            getProfileVersion = ((i & 85) + (i | 85)) % 128;
            return null;
        }
        int length = bArr.length;
        int i2 = i & 23;
        int i3 = (i | 23) & (~i2);
        int i4 = i2 << 1;
        getProfileVersion = ((i3 & i4) + (i3 | i4)) % 128;
        int i5 = 0;
        while (i5 < length) {
            int i6 = getAid;
            int i7 = ((i6 ^ 12) + ((i6 & 12) << 1)) - 1;
            getProfileVersion = i7 % 128;
            if (i7 % 2 != 0) {
                bArr[i5] = 0;
                int i8 = i5 + 43;
                i5 = (i8 | 50) + (i8 & 50);
            } else {
                bArr[i5] = 0;
                int i9 = (i5 & 91) + (i5 | 91);
                i5 = (i9 & (-90)) + (i9 | (-90));
            }
        }
        int i10 = getProfileVersion;
        int i11 = i10 & 103;
        int i12 = -(-((i10 ^ 103) | i11));
        int i13 = ((i11 | i12) << 1) - (i12 ^ i11);
        getAid = i13 % 128;
        if (i13 % 2 != 0) {
            return null;
        }
        throw null;
    }

    public static byte[] AlternateContactlessPaymentDataJson(java.util.List<byte[]> list) {
        return (byte[]) values(new java.lang.Object[]{list}, -1870759509, 1870759514, (int) java.lang.System.currentTimeMillis());
    }

    public static void AlternateContactlessPaymentDataJson(byte[] bArr) {
        values(new java.lang.Object[]{bArr}, -1763061903, 1763061911, (int) java.lang.System.currentTimeMillis());
    }

    public final com.payair.hce.transactionCanBeResumed getProfileVersion() {
        return (com.payair.hce.transactionCanBeResumed) values(new java.lang.Object[]{this}, 331459817, -331459817, java.lang.System.identityHashCode(this));
    }

    public final com.payair.hce.transactionCanBeResumed SdkCoreAlternateContactlessPaymentDataImpl() {
        return (com.payair.hce.transactionCanBeResumed) values(new java.lang.Object[]{this}, -679041277, 679041281, java.lang.System.identityHashCode(this));
    }

    public final com.payair.hce.transactionCanBeResumed writeReplace() {
        return (com.payair.hce.transactionCanBeResumed) values(new java.lang.Object[]{this}, -37662452, 37662458, java.lang.System.identityHashCode(this));
    }

    public final com.payair.hce.transactionCanBeResumed values() {
        return (com.payair.hce.transactionCanBeResumed) values(new java.lang.Object[]{this}, -2044831319, 2044831320, java.lang.System.identityHashCode(this));
    }

    public final com.payair.hce.getDigitizedCard DigitizedCardProfile() {
        return (com.payair.hce.getDigitizedCard) values(new java.lang.Object[]{this}, 1080004933, -1080004931, java.lang.System.identityHashCode(this));
    }

    public final com.payair.hce.getDigitizedCard valueOf() {
        return (com.payair.hce.getDigitizedCard) values(new java.lang.Object[]{this}, 1072178576, -1072178573, java.lang.System.identityHashCode(this));
    }

    public final com.payair.hce.setAip AlternateContactlessPaymentDataJson() {
        return (com.payair.hce.setAip) values(new java.lang.Object[]{this}, 447738352, -447738345, java.lang.System.identityHashCode(this));
    }
}
