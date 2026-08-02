package com.payair.hce;

/* loaded from: classes4.dex */
public class setAllowedHandwritingDelegatePackage {
    private static int DigitizedCardProfile = 0;
    private static int valueOf = 1;
    private java.lang.String AlternateContactlessPaymentDataJson;
    private transient java.lang.String values = "";
    private com.payair.hce.setElevation[] writeReplace;

    public static /* synthetic */ java.lang.Object valueOf(java.lang.Object[] objArr, int i, int i2, int i3) {
        int i4 = ~i3;
        int i5 = ~i;
        int i6 = (i * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_ACTIVATION_SCRP_FAIL) + (i2 * (-520)) + (((~(i4 | i2)) | i) * (-1042)) + ((i2 | i3) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_ATTEST_SCRP_FAIL) + (((~(i | i4 | i2)) | (~((~i2) | i5)) | (~(i3 | i5))) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_ATTEST_SCRP_FAIL);
        int i7 = 0;
        switch (i6) {
            case 1:
                return values(objArr);
            case 2:
                return valueOf(objArr);
            case 3:
                com.payair.hce.setAllowedHandwritingDelegatePackage setallowedhandwritingdelegatepackage = (com.payair.hce.setAllowedHandwritingDelegatePackage) objArr[0];
                int i8 = valueOf;
                DigitizedCardProfile = ((((i8 ^ 21) | (i8 & 21)) << 1) - ((i8 & (-22)) | ((~i8) & 21))) % 128;
                com.payair.hce.setElevation[] setelevationArr = setallowedhandwritingdelegatepackage.writeReplace;
                DigitizedCardProfile = ((-2) - (~(((i8 | 94) << 1) - (i8 ^ 94)))) % 128;
                return setelevationArr;
            case 4:
                return AlternateContactlessPaymentDataJson(objArr);
            case 5:
                return DigitizedCardProfile(objArr);
            case 6:
                com.payair.hce.bindIsolatedService bindisolatedservice = (com.payair.hce.bindIsolatedService) objArr[0];
                int i9 = DigitizedCardProfile;
                valueOf = ((-2) - (~(((i9 | 94) << 1) - (i9 ^ 94)))) % 128;
                int AlternateContactlessPaymentDataJson = bindisolatedservice.AlternateContactlessPaymentDataJson();
                com.payair.hce.bindIsolatedService bindisolatedservice2 = (com.payair.hce.bindIsolatedService) com.payair.hce.bindIsolatedService.DigitizedCardProfile(new java.lang.Object[]{java.lang.Integer.valueOf(AlternateContactlessPaymentDataJson)}, 1372926577, -1372926576, AlternateContactlessPaymentDataJson);
                int i10 = valueOf;
                int i11 = i10 ^ 43;
                int i12 = ((i10 & 43) | i11) << 1;
                int i13 = -i11;
                DigitizedCardProfile = ((i12 ^ i13) + ((i12 & i13) << 1)) % 128;
                while (i7 < bindisolatedservice.AlternateContactlessPaymentDataJson()) {
                    int i14 = DigitizedCardProfile;
                    int i15 = (i14 & (-26)) | ((~i14) & 25);
                    int i16 = (i14 & 25) << 1;
                    int i17 = ((i15 | i16) << 1) - (i16 ^ i15);
                    valueOf = i17 % 128;
                    if (i17 % 2 == 0) {
                        bindisolatedservice2.valueOf(i7, (byte) (((java.lang.Byte) com.payair.hce.bindIsolatedService.DigitizedCardProfile(new java.lang.Object[]{bindisolatedservice, java.lang.Integer.valueOf(i7)}, 504288689, -504288687, i7)).byteValue() >>> 1));
                        i7 = ((i7 & 25) << 1) + (i7 ^ 25);
                    } else {
                        bindisolatedservice2.valueOf(i7, (byte) (((java.lang.Byte) com.payair.hce.bindIsolatedService.DigitizedCardProfile(new java.lang.Object[]{bindisolatedservice, java.lang.Integer.valueOf(i7)}, 504288689, -504288687, i7)).byteValue() << 1));
                        int i18 = (((i7 | (-16)) << 1) - (~(-((i7 & 15) | ((~i7) & (-16)))))) - 1;
                        i7 = (((i18 | 18) << 1) - (i18 ^ 18)) - 1;
                    }
                }
                int i19 = DigitizedCardProfile;
                int i20 = i19 ^ 125;
                int i21 = (i19 & 125) << 1;
                valueOf = (((i20 | i21) << 1) - (i21 ^ i20)) % 128;
                return bindisolatedservice2;
            case 7:
                return writeReplace(objArr);
            default:
                com.payair.hce.setAllowedHandwritingDelegatePackage setallowedhandwritingdelegatepackage2 = (com.payair.hce.setAllowedHandwritingDelegatePackage) objArr[0];
                java.lang.String str = (java.lang.String) objArr[1];
                int i22 = valueOf;
                DigitizedCardProfile = ((-2) - (~(i22 + 12))) % 128;
                setallowedhandwritingdelegatepackage2.values = str;
                DigitizedCardProfile = (((i22 ^ 10) + ((i22 & 10) << 1)) - 1) % 128;
                return null;
        }
    }

    private static /* synthetic */ java.lang.Object AlternateContactlessPaymentDataJson(java.lang.Object[] objArr) {
        com.payair.hce.setAllowedHandwritingDelegatePackage setallowedhandwritingdelegatepackage = (com.payair.hce.setAllowedHandwritingDelegatePackage) new com.payair.hce.IccPrivateKeyCrtComponentsJson().writeReplace((java.lang.String) objArr[0], com.payair.hce.setAllowedHandwritingDelegatePackage.class);
        int i = DigitizedCardProfile;
        int i2 = (-2) - (~((i ^ 50) + ((i & 50) << 1)));
        valueOf = i2 % 128;
        if (i2 % 2 != 0) {
            return setallowedhandwritingdelegatepackage;
        }
        throw new java.lang.ArithmeticException();
    }

    private static /* synthetic */ java.lang.Object valueOf(java.lang.Object[] objArr) {
        byte[] bArr;
        byte[] bArr2;
        byte[] bArr3;
        byte[] bArr4;
        com.payair.hce.setAllowedHandwritingDelegatePackage setallowedhandwritingdelegatepackage = (com.payair.hce.setAllowedHandwritingDelegatePackage) objArr[0];
        com.payair.hce.setTransitionAlpha settransitionalpha = (com.payair.hce.setTransitionAlpha) objArr[1];
        int i = DigitizedCardProfile;
        int i2 = i & 81;
        valueOf = ((i2 - (~(-(-((i ^ 81) | i2))))) - 1) % 128;
        com.mastercard.mpsdk.remotemanagement.api.json.TransactionCredential[] transactionCredentialArr = new com.mastercard.mpsdk.remotemanagement.api.json.TransactionCredential[setallowedhandwritingdelegatepackage.writeReplace.length];
        valueOf = ((i ^ 63) + ((i & 63) << 1)) % 128;
        int i3 = 0;
        while (true) {
            com.payair.hce.setElevation[] setelevationArr = setallowedhandwritingdelegatepackage.writeReplace;
            if (i3 >= setelevationArr.length) {
                int i4 = DigitizedCardProfile;
                int i5 = i4 & 23;
                int i6 = (i4 | 23) & (~i5);
                int i7 = i5 << 1;
                valueOf = (((i6 | i7) << 1) - (i6 ^ i7)) % 128;
                return transactionCredentialArr;
            }
            com.payair.hce.setElevation setelevation = setelevationArr[i3];
            com.payair.hce.bindIsolatedService bindisolatedservice = (com.payair.hce.bindIsolatedService) valueOf(new java.lang.Object[]{setallowedhandwritingdelegatepackage, (java.lang.String) com.payair.hce.setElevation.DigitizedCardProfile(new java.lang.Object[]{setelevation}, -829104869, 829104869, java.lang.System.identityHashCode(setelevation)), settransitionalpha}, 1341897872, -1341897871, java.lang.System.identityHashCode(setallowedhandwritingdelegatepackage));
            com.payair.hce.bindIsolatedService bindisolatedservice2 = (com.payair.hce.bindIsolatedService) valueOf(new java.lang.Object[]{setallowedhandwritingdelegatepackage, (java.lang.String) com.payair.hce.setElevation.DigitizedCardProfile(new java.lang.Object[]{setelevation}, 854617093, -854617091, java.lang.System.identityHashCode(setelevation)), settransitionalpha}, 1341897872, -1341897871, java.lang.System.identityHashCode(setallowedhandwritingdelegatepackage));
            com.payair.hce.bindIsolatedService bindisolatedservice3 = (com.payair.hce.bindIsolatedService) valueOf(new java.lang.Object[]{setallowedhandwritingdelegatepackage, (java.lang.String) com.payair.hce.setElevation.DigitizedCardProfile(new java.lang.Object[]{setelevation}, 1547533570, -1547533565, java.lang.System.identityHashCode(setelevation)), settransitionalpha}, 1341897872, -1341897871, java.lang.System.identityHashCode(setallowedhandwritingdelegatepackage));
            com.payair.hce.bindIsolatedService bindisolatedservice4 = (com.payair.hce.bindIsolatedService) valueOf(new java.lang.Object[]{setallowedhandwritingdelegatepackage, (java.lang.String) com.payair.hce.setElevation.DigitizedCardProfile(new java.lang.Object[]{setelevation}, -1997861224, 1997861228, java.lang.System.identityHashCode(setelevation)), settransitionalpha}, 1341897872, -1341897871, java.lang.System.identityHashCode(setallowedhandwritingdelegatepackage));
            com.payair.hce.bindIsolatedService bindisolatedservice5 = (com.payair.hce.bindIsolatedService) valueOf(new java.lang.Object[]{setallowedhandwritingdelegatepackage, (java.lang.String) com.payair.hce.setElevation.DigitizedCardProfile(new java.lang.Object[]{setelevation}, -2072818063, 2072818064, java.lang.System.identityHashCode(setelevation)), settransitionalpha}, 1341897872, -1341897871, java.lang.System.identityHashCode(setallowedhandwritingdelegatepackage));
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(setallowedhandwritingdelegatepackage.values.substring(0, 19).replace(com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER, ""));
            sb.append("-pin");
            java.lang.String AlternateContactlessPaymentDataJson = com.payair.hce.setAnimationMatrix.AlternateContactlessPaymentDataJson(sb.toString());
            if (AlternateContactlessPaymentDataJson == null) {
                int i8 = valueOf;
                int i9 = i8 & 69;
                int i10 = -(-((i8 ^ 69) | i9));
                int i11 = ((i9 | i10) << 1) - (i10 ^ i9);
                DigitizedCardProfile = i11 % 128;
                if (i11 % 2 != 0) {
                    com.payair.hce.setAnimationMatrix.AlternateContactlessPaymentDataJson("default-pin");
                    throw new java.lang.ArithmeticException();
                }
                AlternateContactlessPaymentDataJson = com.payair.hce.setAnimationMatrix.AlternateContactlessPaymentDataJson("default-pin");
                valueOf = ((-2) - (~(DigitizedCardProfile + 52))) % 128;
            }
            com.payair.hce.bindIsolatedService AlternateContactlessPaymentDataJson2 = com.payair.hce.bindIsolatedService.AlternateContactlessPaymentDataJson(new java.lang.String(org.apache.commons.codec.binary.Hex.encodeHex(AlternateContactlessPaymentDataJson.getBytes())));
            com.mastercard.mpsdk.remotemanagement.api.json.TransactionCredential transactionCredential = new com.mastercard.mpsdk.remotemanagement.api.json.TransactionCredential();
            transactionCredential.setAtc(((java.lang.Integer) com.payair.hce.setElevation.DigitizedCardProfile(new java.lang.Object[]{setelevation}, 373630701, -373630698, java.lang.System.identityHashCode(setelevation))).intValue());
            byte[] bArr5 = null;
            if (bindisolatedservice != null) {
                int i12 = DigitizedCardProfile;
                int i13 = i12 ^ 115;
                int i14 = ((i12 & 115) | i13) << 1;
                int i15 = -i13;
                valueOf = ((i14 ^ i15) + ((i14 & i15) << 1)) % 128;
                bArr = bindisolatedservice.DigitizedCardProfile();
                int i16 = valueOf;
                int i17 = (i16 & (-116)) | ((~i16) & 115);
                int i18 = -(-((i16 & 115) << 1));
                DigitizedCardProfile = ((i17 & i18) + (i18 | i17)) % 128;
            } else {
                valueOf = (DigitizedCardProfile + 31) % 128;
                bArr = null;
            }
            transactionCredential.setContactlessMdSessionKey(bArr);
            if (bindisolatedservice3 != null) {
                valueOf = (DigitizedCardProfile + 81) % 128;
                bArr2 = bindisolatedservice3.DigitizedCardProfile();
                DigitizedCardProfile = (valueOf + 53) % 128;
            } else {
                int i19 = DigitizedCardProfile;
                int i20 = i19 & 69;
                valueOf = (((i19 | 69) & (~i20)) + (i20 << 1)) % 128;
                bArr2 = null;
            }
            transactionCredential.setDsrpMdSessionKey(bArr2);
            if (bindisolatedservice2 != null) {
                int i21 = DigitizedCardProfile;
                int i22 = i21 & 13;
                int i23 = (i21 | 13) & (~i22);
                int i24 = i22 << 1;
                valueOf = ((i23 ^ i24) + ((i23 & i24) << 1)) % 128;
                bArr3 = bindisolatedservice2.DigitizedCardProfile();
                DigitizedCardProfile = (valueOf + 111) % 128;
            } else {
                int i25 = DigitizedCardProfile;
                int i26 = i25 & 15;
                valueOf = ((((i25 ^ 15) | i26) << 1) - ((i25 | 15) & (~i26))) % 128;
                bArr3 = null;
            }
            transactionCredential.setContactlessUmdSessionKey(bArr3);
            if (bindisolatedservice4 != null) {
                int i27 = DigitizedCardProfile;
                valueOf = (((i27 ^ 59) - (~(-(-((i27 & 59) << 1))))) - 1) % 128;
                bArr4 = bindisolatedservice4.DigitizedCardProfile();
                int i28 = DigitizedCardProfile;
                valueOf = ((i28 & 29) + (i28 | 29)) % 128;
            } else {
                int i29 = valueOf;
                DigitizedCardProfile = (((i29 | 103) << 1) - (i29 ^ 103)) % 128;
                bArr4 = null;
            }
            transactionCredential.setDsrpUmdSessionKey(bArr4);
            if (bindisolatedservice5 != null) {
                int i30 = valueOf;
                int i31 = i30 ^ 67;
                int i32 = -(-((i30 & 67) << 1));
                int i33 = (i31 & i32) + (i32 | i31);
                DigitizedCardProfile = i33 % 128;
                bArr5 = i33 % 2 != 0 ? bindisolatedservice5.DigitizedCardProfile(108, 113).DigitizedCardProfile() : bindisolatedservice5.DigitizedCardProfile(8, 16).DigitizedCardProfile();
            } else {
                int i34 = DigitizedCardProfile;
                valueOf = (((i34 | 39) << 1) - (i34 ^ 39)) % 128;
            }
            transactionCredential.setIdn(bArr5);
            transactionCredential.setDsrpUmdSingleUseKey((byte[]) valueOf(new java.lang.Object[]{bindisolatedservice4, AlternateContactlessPaymentDataJson2}, -1858122552, 1858122559, (int) java.lang.System.currentTimeMillis()));
            transactionCredential.setContactlessUmdSingleUseKey((byte[]) valueOf(new java.lang.Object[]{bindisolatedservice2, AlternateContactlessPaymentDataJson2}, -1858122552, 1858122559, (int) java.lang.System.currentTimeMillis()));
            transactionCredentialArr[i3] = transactionCredential;
            int i35 = (i3 & 47) + (i3 | 47);
            i3 = ((i35 | (-46)) << 1) - (i35 ^ (-46));
            int i36 = DigitizedCardProfile;
            valueOf = (((i36 | 85) << 1) - (i36 ^ 85)) % 128;
        }
    }

    private static /* synthetic */ java.lang.Object values(java.lang.Object[] objArr) {
        com.payair.hce.setAllowedHandwritingDelegatePackage setallowedhandwritingdelegatepackage = (com.payair.hce.setAllowedHandwritingDelegatePackage) objArr[0];
        java.lang.String str = (java.lang.String) objArr[1];
        com.payair.hce.setTransitionAlpha settransitionalpha = (com.payair.hce.setTransitionAlpha) objArr[2];
        int i = valueOf;
        int i2 = i ^ 31;
        int i3 = ((i & 31) | i2) << 1;
        int i4 = -i2;
        int i5 = (((i3 | i4) << 1) - (i3 ^ i4)) % 128;
        DigitizedCardProfile = i5;
        if (str == null) {
            int i6 = i5 ^ 7;
            int i7 = -(-((i5 & 7) << 1));
            int i8 = ((i6 ^ i7) + ((i6 & i7) << 1)) % 128;
            valueOf = i8;
            int i9 = i8 & 93;
            DigitizedCardProfile = ((((i8 | 93) & (~i9)) - (~(-(-(i9 << 1))))) - 1) % 128;
            return null;
        }
        try {
            com.payair.hce.bindIsolatedService AlternateContactlessPaymentDataJson = com.payair.hce.bindIsolatedService.AlternateContactlessPaymentDataJson((byte[]) com.payair.hce.setTransitionAlpha.values(new java.lang.Object[]{settransitionalpha, com.payair.hce.bindIsolatedService.AlternateContactlessPaymentDataJson(str).DigitizedCardProfile(), com.payair.hce.bindIsolatedService.AlternateContactlessPaymentDataJson(com.payair.hce.setAnimationMatrix.AlternateContactlessPaymentDataJson(setallowedhandwritingdelegatepackage.AlternateContactlessPaymentDataJson)).DigitizedCardProfile()}, -1532971113, 1532971120, java.lang.System.identityHashCode(settransitionalpha)));
            int i10 = valueOf;
            int i11 = (((i10 | 104) << 1) - (i10 ^ 104)) - 1;
            DigitizedCardProfile = i11 % 128;
            if (i11 % 2 == 0) {
                return AlternateContactlessPaymentDataJson;
            }
            throw null;
        } catch (java.security.GeneralSecurityException unused) {
            return null;
        }
    }

    private static /* synthetic */ java.lang.Object writeReplace(java.lang.Object[] objArr) {
        com.payair.hce.bindIsolatedService bindisolatedservice = (com.payair.hce.bindIsolatedService) objArr[0];
        com.payair.hce.bindIsolatedService bindisolatedservice2 = (com.payair.hce.bindIsolatedService) objArr[1];
        int i = valueOf;
        int i2 = i ^ 87;
        int i3 = ((((i & 87) | i2) << 1) - (~(-i2))) - 1;
        int i4 = i3 % 128;
        DigitizedCardProfile = i4;
        if (i3 % 2 != 0) {
            throw new java.lang.ArithmeticException();
        }
        if (bindisolatedservice == null) {
            int i5 = i4 ^ 7;
            int i6 = ((i4 & 7) | i5) << 1;
            int i7 = -i5;
            valueOf = ((i6 ^ i7) + ((i7 & i6) << 1)) % 128;
            return null;
        }
        byte[] DigitizedCardProfile2 = ((com.payair.hce.bindIsolatedService) valueOf(new java.lang.Object[]{bindisolatedservice, (com.payair.hce.bindIsolatedService) valueOf(new java.lang.Object[]{bindisolatedservice2}, 833747399, -833747393, (int) java.lang.System.currentTimeMillis())}, -1512277483, 1512277488, (int) java.lang.System.currentTimeMillis())).DigitizedCardProfile();
        int i8 = valueOf;
        int i9 = i8 & 111;
        int i10 = (((i8 | 111) & (~i9)) - (~(-(-(i9 << 1))))) - 1;
        DigitizedCardProfile = i10 % 128;
        if (i10 % 2 == 0) {
            return DigitizedCardProfile2;
        }
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x003a, code lost:
    
        r7 = com.payair.hce.setAllowedHandwritingDelegatePackage.DigitizedCardProfile;
        r8 = r7 & 39;
        r7 = -(-((r7 ^ 39) | r8));
        r9 = (r8 ^ r7) + ((r7 & r8) << 1);
        com.payair.hce.setAllowedHandwritingDelegatePackage.valueOf = r9 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x004e, code lost:
    
        if ((r9 % 2) == 0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0050, code lost:
    
        r7 = r3.AlternateContactlessPaymentDataJson();
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0055, code lost:
    
        r3.AlternateContactlessPaymentDataJson();
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0058, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0038, code lost:
    
        if (r3.AlternateContactlessPaymentDataJson() < 8) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x002d, code lost:
    
        if (r3.AlternateContactlessPaymentDataJson() < 58) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0059, code lost:
    
        r7 = com.payair.hce.setAllowedHandwritingDelegatePackage.DigitizedCardProfile;
        r8 = ((r7 & 97) - (~(r7 | 97))) - 1;
        com.payair.hce.setAllowedHandwritingDelegatePackage.valueOf = r8 % 128;
        r8 = r8 % 2;
        r7 = 8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ java.lang.Object DigitizedCardProfile(java.lang.Object[] objArr) {
        com.payair.hce.bindIsolatedService writeReplace;
        int AlternateContactlessPaymentDataJson;
        int i = 0;
        com.payair.hce.bindIsolatedService bindisolatedservice = (com.payair.hce.bindIsolatedService) objArr[0];
        com.payair.hce.bindIsolatedService bindisolatedservice2 = (com.payair.hce.bindIsolatedService) objArr[1];
        int i2 = DigitizedCardProfile;
        int i3 = i2 ^ 51;
        int i4 = ((i2 & 51) | i3) << 1;
        int i5 = -i3;
        int i6 = ((i4 | i5) << 1) - (i4 ^ i5);
        valueOf = i6 % 128;
        int i7 = 8;
        if (i6 % 2 == 0) {
            writeReplace = com.payair.hce.bindIsolatedService.writeReplace(bindisolatedservice);
        } else {
            writeReplace = com.payair.hce.bindIsolatedService.writeReplace(bindisolatedservice);
        }
        valueOf = (DigitizedCardProfile + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) % 128;
        while (i < AlternateContactlessPaymentDataJson) {
            int i8 = DigitizedCardProfile;
            valueOf = ((i8 & 115) + (i8 | 115)) % 128;
            byte byteValue = ((java.lang.Byte) com.payair.hce.bindIsolatedService.DigitizedCardProfile(new java.lang.Object[]{bindisolatedservice, java.lang.Integer.valueOf(i)}, 504288689, -504288687, i)).byteValue();
            byte byteValue2 = ((java.lang.Byte) com.payair.hce.bindIsolatedService.DigitizedCardProfile(new java.lang.Object[]{bindisolatedservice2, java.lang.Integer.valueOf(i)}, 504288689, -504288687, i)).byteValue();
            int i9 = (~byteValue2) & byteValue;
            int i10 = (~byteValue) & byteValue2;
            writeReplace.valueOf(i, (byte) ((i10 ^ i9) | (i10 & i9)));
            int currentTimeMillis = (int) java.lang.System.currentTimeMillis();
            int i11 = i * 339;
            int i12 = i11 ^ (-2696);
            int i13 = -(-((i11 & (-2696)) << 1));
            int i14 = (i12 & i13) + (i13 | i12);
            int i15 = ~currentTimeMillis;
            int i16 = (i15 | currentTimeMillis) & i15;
            int i17 = ~((i16 & (-9)) | (i16 ^ (-9)));
            int i18 = ~i;
            int i19 = i18 & (i18 | i);
            int i20 = i19 & 8;
            int i21 = ~(((~i20) & (i19 | i7)) | i20);
            int i22 = (i21 & (~i17)) | ((~i21) & i17) | (i21 & i17);
            int i23 = (i15 & 8) | (currentTimeMillis & (-9));
            int i24 = currentTimeMillis & 8;
            int i25 = ~((i23 ^ i24) | (i23 & i24));
            int i26 = i22 ^ i25;
            int i27 = i22 & i25;
            int i28 = -(~(-(-(((i27 ^ i26) | (i27 & i26)) * (-338)))));
            int i29 = ((i14 & i28) + (i28 | i14)) - 1;
            int i30 = i & (-9);
            int i31 = (~(i30 | ((~i30) & (i | (-9))))) * 338;
            int i32 = (((i29 ^ i31) | (i29 & i31)) << 1) - (((~i31) & i29) | ((~i29) & i31));
            int i33 = ~((i15 ^ (-9)) | (i15 & (-9)));
            int i34 = i & 8;
            int i35 = (i ^ 8) | i34;
            int i36 = ~(((~i35) & currentTimeMillis) | (i15 & i35) | (i35 & currentTimeMillis));
            int i37 = i33 ^ i36;
            int i38 = i36 & i33;
            int i39 = -(-(((i38 ^ i37) | (i38 & i37)) * 338));
            int i40 = -(((~i32) & i39) | ((~i39) & i32));
            int i41 = -(-i35);
            int i42 = (i34 & i41) + (i41 | i34);
            byte byteValue3 = ((java.lang.Byte) com.payair.hce.bindIsolatedService.DigitizedCardProfile(new java.lang.Object[]{bindisolatedservice, java.lang.Integer.valueOf(i42)}, 504288689, -504288687, i42)).byteValue();
            byte byteValue4 = ((java.lang.Byte) com.payair.hce.bindIsolatedService.DigitizedCardProfile(new java.lang.Object[]{bindisolatedservice2, java.lang.Integer.valueOf(i)}, 504288689, -504288687, i)).byteValue();
            int i43 = (~byteValue4) & byteValue3;
            int i44 = (~byteValue3) & byteValue4;
            writeReplace.valueOf(((((i39 & i32) | (i32 ^ i39)) << 1) - (~i40)) - 1, (byte) ((i44 & i43) | (i44 ^ i43)));
            int i45 = i & 1;
            int i46 = -(-((i ^ 1) | i45));
            i = ((i45 | i46) << 1) - (i46 ^ i45);
            int i47 = valueOf;
            int i48 = i47 & 113;
            int i49 = -(-((i47 ^ 113) | i48));
            DigitizedCardProfile = ((i48 ^ i49) + ((i49 & i48) << 1)) % 128;
            i7 = 8;
        }
        int i50 = valueOf;
        int i51 = i50 & 99;
        int i52 = ((i50 | 99) & (~i51)) + (i51 << 1);
        DigitizedCardProfile = i52 % 128;
        if (i52 % 2 == 0) {
            return writeReplace;
        }
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final /* synthetic */ void writeReplace(com.payair.hce.IccPrivateKeyCrtComponentsJson iccPrivateKeyCrtComponentsJson, com.payair.hce.getRemotePaymentData getremotepaymentdata, com.payair.hce.getTrack2Equivalent gettrack2equivalent) {
        getremotepaymentdata.AlternateContactlessPaymentDataJson();
        if (this != this.writeReplace) {
            gettrack2equivalent.writeReplace(getremotepaymentdata, 73);
            com.payair.hce.setElevation[] setelevationArr = this.writeReplace;
            com.payair.hce.getApplicationExpiryDate.values(iccPrivateKeyCrtComponentsJson, com.payair.hce.setElevation[].class, setelevationArr).writeReplace(getremotepaymentdata, setelevationArr);
        }
        if (this != this.AlternateContactlessPaymentDataJson) {
            gettrack2equivalent.writeReplace(getremotepaymentdata, 2);
            getremotepaymentdata.DigitizedCardProfile(this.AlternateContactlessPaymentDataJson);
        }
        getremotepaymentdata.values();
    }

    public final /* synthetic */ void DigitizedCardProfile(com.payair.hce.IccPrivateKeyCrtComponentsJson iccPrivateKeyCrtComponentsJson, com.payair.hce.getAckAutomaticallyResetByApplication getackautomaticallyresetbyapplication, com.payair.hce.getPan getpan) {
        getackautomaticallyresetbyapplication.writeReplace();
        while (getackautomaticallyresetbyapplication.values()) {
            int AlternateContactlessPaymentDataJson = getpan.AlternateContactlessPaymentDataJson(getackautomaticallyresetbyapplication);
            boolean z = getackautomaticallyresetbyapplication.getProfileVersion() != com.payair.hce.getAckPreEntryAllowed.NULL;
            if (AlternateContactlessPaymentDataJson != 10) {
                if (AlternateContactlessPaymentDataJson != 36) {
                    getackautomaticallyresetbyapplication.getCvrMaskAnd();
                } else if (z) {
                    this.writeReplace = (com.payair.hce.setElevation[]) iccPrivateKeyCrtComponentsJson.valueOf(new com.payair.hce.getPinAlwaysRequiredIfCurrencyProvided(com.payair.hce.setElevation[].class)).AlternateContactlessPaymentDataJson(getackautomaticallyresetbyapplication);
                } else {
                    this.writeReplace = null;
                    getackautomaticallyresetbyapplication.RecordsJson();
                }
            } else if (z) {
                this.AlternateContactlessPaymentDataJson = getackautomaticallyresetbyapplication.getProfileVersion() != com.payair.hce.getAckPreEntryAllowed.BOOLEAN ? getackautomaticallyresetbyapplication.getAid() : java.lang.Boolean.toString(getackautomaticallyresetbyapplication.IccPrivateKeyCrtComponentsJson());
            } else {
                this.AlternateContactlessPaymentDataJson = null;
                getackautomaticallyresetbyapplication.RecordsJson();
            }
        }
        getackautomaticallyresetbyapplication.DigitizedCardProfile();
    }

    public final com.payair.hce.setElevation[] AlternateContactlessPaymentDataJson() {
        return (com.payair.hce.setElevation[]) valueOf(new java.lang.Object[]{this}, 917462212, -917462209, java.lang.System.identityHashCode(this));
    }

    private static com.payair.hce.bindIsolatedService DigitizedCardProfile(com.payair.hce.bindIsolatedService bindisolatedservice) {
        return (com.payair.hce.bindIsolatedService) valueOf(new java.lang.Object[]{bindisolatedservice}, 833747399, -833747393, (int) java.lang.System.currentTimeMillis());
    }

    private static com.payair.hce.bindIsolatedService values(com.payair.hce.bindIsolatedService bindisolatedservice, com.payair.hce.bindIsolatedService bindisolatedservice2) {
        return (com.payair.hce.bindIsolatedService) valueOf(new java.lang.Object[]{bindisolatedservice, bindisolatedservice2}, -1512277483, 1512277488, (int) java.lang.System.currentTimeMillis());
    }

    private static byte[] valueOf(com.payair.hce.bindIsolatedService bindisolatedservice, com.payair.hce.bindIsolatedService bindisolatedservice2) {
        return (byte[]) valueOf(new java.lang.Object[]{bindisolatedservice, bindisolatedservice2}, -1858122552, 1858122559, (int) java.lang.System.currentTimeMillis());
    }

    private com.payair.hce.bindIsolatedService values(java.lang.String str, com.payair.hce.setTransitionAlpha settransitionalpha) {
        return (com.payair.hce.bindIsolatedService) valueOf(new java.lang.Object[]{this, str, settransitionalpha}, 1341897872, -1341897871, java.lang.System.identityHashCode(this));
    }

    public final com.mastercard.mpsdk.remotemanagement.api.json.TransactionCredential[] DigitizedCardProfile(com.payair.hce.setTransitionAlpha settransitionalpha) {
        return (com.mastercard.mpsdk.remotemanagement.api.json.TransactionCredential[]) valueOf(new java.lang.Object[]{this, settransitionalpha}, -2027828101, 2027828103, java.lang.System.identityHashCode(this));
    }

    public final void DigitizedCardProfile(java.lang.String str) {
        valueOf(new java.lang.Object[]{this, str}, 486987112, -486987112, java.lang.System.identityHashCode(this));
    }

    public static com.payair.hce.setAllowedHandwritingDelegatePackage AlternateContactlessPaymentDataJson(java.lang.String str) {
        return (com.payair.hce.setAllowedHandwritingDelegatePackage) valueOf(new java.lang.Object[]{str}, -965814242, 965814246, (int) java.lang.System.currentTimeMillis());
    }
}
