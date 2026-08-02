package com.payair.hce;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\fJ\u001a\u0010\u0004\u001a\u00020\u00032\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\u00020\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000bR\u001a\u0010\u000f\u001a\u00020\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\r\u001a\u0004\b\u0010\u0010\u000bR\u001a\u0010\u000e\u001a\u00020\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\r\u001a\u0004\b\f\u0010\u000bR\u001a\u0010\u0013\u001a\u00020\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\r\u001a\u0004\b\u0012\u0010\u000bR\u001a\u0010\u0010\u001a\u00020\u00148\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0015\u001a\u0004\b\u000f\u0010\u0016R\u001a\u0010\u0017\u001a\u00020\u00148\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0015\u001a\u0004\b\u0013\u0010\u0016"}, d2 = {"Lcom/payair/hce/setFilterText;", "", "p0", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "valueOf", "Ljava/lang/String;", "DigitizedCardProfile", "writeReplace", "values", "SdkCoreAlternateContactlessPaymentDataImpl", "getProfileVersion", "AlternateContactlessPaymentDataJson", "Lcom/payair/hce/setFilterText$valueOf;", "Lcom/payair/hce/setFilterText$valueOf;", "()Lcom/payair/hce/setFilterText$valueOf;", "IccPrivateKeyCrtComponentsJson"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class setFilterText {
    private static int IccPrivateKeyCrtComponentsJson = 1;
    private static int getAid;

    /* renamed from: AlternateContactlessPaymentDataJson, reason: from kotlin metadata */
    @com.payair.hce.SdkCoreContactlessPaymentDataImpl(valueOf = "iccPubKeyCert")
    private final com.payair.hce.setFilterText.valueOf values;

    /* renamed from: DigitizedCardProfile, reason: from kotlin metadata */
    @com.payair.hce.SdkCoreContactlessPaymentDataImpl(valueOf = "tokenBinPubKeyCert")
    private final com.payair.hce.setFilterText.valueOf IccPrivateKeyCrtComponentsJson;

    /* renamed from: SdkCoreAlternateContactlessPaymentDataImpl, reason: from kotlin metadata */
    @com.payair.hce.SdkCoreContactlessPaymentDataImpl(valueOf = "enciccPrivateKey")
    private final java.lang.String AlternateContactlessPaymentDataJson;

    @com.payair.hce.SdkCoreContactlessPaymentDataImpl(valueOf = "appFileLocator")
    private final java.lang.String valueOf;

    /* renamed from: values, reason: from kotlin metadata */
    @com.payair.hce.SdkCoreContactlessPaymentDataImpl(valueOf = "caPubKeyIndex")
    private final java.lang.String DigitizedCardProfile;

    @com.payair.hce.SdkCoreContactlessPaymentDataImpl(valueOf = "appProfile")
    private final java.lang.String writeReplace;

    public static /* synthetic */ java.lang.Object valueOf(java.lang.Object[] objArr, int i, int i2, int i3) {
        int i4 = ~i2;
        switch (((i * (-963)) - 964) + (i2 * 965) + (((~i) | (~(i4 | i3))) * (-964)) + (((~(i | i4)) | (~((~i3) | i4))) * (-964))) {
            case 1:
                return valueOf(objArr);
            case 2:
                com.payair.hce.setFilterText setfiltertext = (com.payair.hce.setFilterText) objArr[0];
                int i5 = IccPrivateKeyCrtComponentsJson;
                int i6 = i5 ^ 79;
                int i7 = -(-((i5 & 79) << 1));
                int i8 = ((i6 ^ i7) + ((i7 & i6) << 1)) % 128;
                getAid = i8;
                java.lang.String str = setfiltertext.AlternateContactlessPaymentDataJson;
                IccPrivateKeyCrtComponentsJson = (i8 + 5) % 128;
                return str;
            case 3:
                return DigitizedCardProfile(objArr);
            case 4:
                return values(objArr);
            case 5:
                com.payair.hce.setFilterText setfiltertext2 = (com.payair.hce.setFilterText) objArr[0];
                int i9 = getAid;
                int i10 = i9 & 21;
                int i11 = (i9 | 21) & (~i10);
                int i12 = i10 << 1;
                IccPrivateKeyCrtComponentsJson = ((i11 ^ i12) + ((i11 & i12) << 1)) % 128;
                int hashCode = setfiltertext2.valueOf.hashCode() * 31;
                int hashCode2 = setfiltertext2.writeReplace.hashCode();
                int i13 = hashCode ^ hashCode2;
                int i14 = ((hashCode & hashCode2) | i13) << 1;
                int i15 = -i13;
                int i16 = ((i14 | i15) << 1) - (i14 ^ i15);
                int i17 = i16 * 31;
                int hashCode3 = setfiltertext2.DigitizedCardProfile.hashCode();
                int identityHashCode = java.lang.System.identityHashCode(setfiltertext2);
                int i18 = hashCode3 * 615;
                int i19 = -(-(i16 * (-19003)));
                int i20 = (i18 & i19) + (i19 | i18);
                int i21 = ~hashCode3;
                int i22 = i21 & i17;
                int i23 = i21 | i17;
                int i24 = (~i22) & i23;
                int i25 = ~i17;
                int i26 = (i25 | i17) & i25;
                int i27 = i26 & hashCode3;
                int i28 = (i26 | hashCode3) & (~i27);
                int i29 = (i28 ^ i27) | (i28 & i27);
                int i30 = (~((i22 ^ i24) | (i22 & i24))) | identityHashCode;
                int i31 = ~i29;
                int i32 = (i30 | (i31 & (i29 | i31))) * 614;
                int i33 = ~identityHashCode;
                int i34 = i21 & i33;
                int i35 = (i21 | i33) & (~i34);
                int i36 = ~((i34 ^ i35) | (i35 & i34));
                int i37 = ~i23;
                int i38 = (i23 | i37) & i37;
                int i39 = ((~i38) & i36) | ((~i36) & i38);
                int i40 = i38 & i36;
                int i41 = (i40 ^ i39) | (i40 & i39);
                int i42 = i33 ^ i17;
                int i43 = i33 & i17;
                int i44 = ~((i42 ^ i43) | (i42 & i43));
                int i45 = (((i20 | i32) << 1) - (((~i32) & i20) | ((~i20) & i32))) + (((i41 & i44) | (i41 ^ i44)) * (-1228));
                int i46 = ((~i21) & i25) | ((~i25) & i21) | (i25 & i21);
                int i47 = (identityHashCode | i33) & i33;
                int i48 = ((~i47) & i46) | ((~i46) & i47);
                int i49 = i46 & i47;
                int i50 = (i49 ^ i48) | (i49 & i48);
                int i51 = ~i50;
                int i52 = (i50 | i51) & i51;
                int i53 = i33 & hashCode3;
                int i54 = (hashCode3 | i33) & (~i53);
                int i55 = (i54 ^ i53) | (i54 & i53);
                int i56 = i55 ^ i17;
                int i57 = i17 & i55;
                int i58 = (i57 ^ i56) | (i57 & i56);
                int i59 = ~i58;
                int i60 = (i58 | i59) & i59;
                int i61 = -(-(((i60 & (~i52)) | ((~i60) & i52) | (i60 & i52)) * 614));
                int hashCode4 = ((((((i45 ^ i61) | (i45 & i61)) << 1) - (((~i61) & i45) | ((~i45) & i61))) * 31) + setfiltertext2.values.hashCode()) * 31;
                int i62 = -(-setfiltertext2.IccPrivateKeyCrtComponentsJson.hashCode());
                int i63 = (hashCode4 ^ i62) + ((i62 & hashCode4) << 1);
                int i64 = i63 * 31;
                int hashCode5 = setfiltertext2.AlternateContactlessPaymentDataJson.hashCode();
                int identityHashCode2 = java.lang.System.identityHashCode(setfiltertext2);
                int i65 = hashCode5 * (-751);
                int i66 = -(-(i63 * (-23281)));
                int i67 = (i65 ^ i66) + ((i66 & i65) << 1);
                int i68 = ~hashCode5;
                int i69 = ~i64;
                int i70 = i68 & i69;
                int i71 = i70 | ((i69 | i68) & (~i70));
                int i72 = ~i71;
                int i73 = (i71 | i72) & i72;
                int i74 = i68 & identityHashCode2;
                int i75 = i74 | ((~i74) & (i68 | identityHashCode2));
                int i76 = ~i75;
                int i77 = (i75 | i76) & i76;
                int i78 = ((~i77) & i73) | ((~i73) & i77);
                int i79 = i73 & i77;
                int i80 = ((i79 ^ i78) | (i79 & i78)) * 1504;
                int i81 = ((i67 | i80) << 1) - (i67 ^ i80);
                int i82 = i68 & (i68 | hashCode5);
                int i83 = i82 & i64;
                int i84 = (i82 | i64) & (~i83);
                int i85 = (i84 ^ i83) | (i84 & i83);
                int i86 = (~((identityHashCode2 ^ i85) | (identityHashCode2 & i85))) * (-1504);
                int i87 = i81 & i86;
                int i88 = ((i81 ^ i86) | i87) << 1;
                int i89 = -((i86 | i81) & (~i87));
                int i90 = (i88 ^ i89) + ((i89 & i88) << 1);
                int i91 = ~((i82 ^ i64) | i83);
                int i92 = ~((i69 ^ hashCode5) | (hashCode5 & i69));
                int i93 = i91 & i92;
                int i94 = (i91 | i92) & (~i93);
                int i95 = -(~(-(-(((i94 ^ i93) | (i94 & i93)) * 752))));
                int i96 = getAid;
                int i97 = i96 & 37;
                int i98 = -(-((i96 ^ 37) | i97));
                IccPrivateKeyCrtComponentsJson = (((i97 | i98) << 1) - (i98 ^ i97)) % 128;
                return java.lang.Integer.valueOf((-2) - (~(((i90 | i95) << 1) - (i95 ^ i90))));
            case 6:
                return AlternateContactlessPaymentDataJson(objArr);
            case 7:
                return RecordsJson(objArr);
            default:
                return writeReplace(objArr);
        }
    }

    private static /* synthetic */ java.lang.Object writeReplace(java.lang.Object[] objArr) {
        com.payair.hce.setFilterText setfiltertext = (com.payair.hce.setFilterText) objArr[0];
        int i = getAid;
        int i2 = i & 119;
        int i3 = (((i ^ 119) | i2) << 1) - ((i | 119) & (~i2));
        IccPrivateKeyCrtComponentsJson = i3 % 128;
        java.lang.String str = setfiltertext.valueOf;
        if (i3 % 2 != 0) {
            return str;
        }
        throw null;
    }

    private static /* synthetic */ java.lang.Object RecordsJson(java.lang.Object[] objArr) {
        com.payair.hce.setFilterText setfiltertext = (com.payair.hce.setFilterText) objArr[0];
        int i = getAid;
        int i2 = (i & 87) + (i | 87);
        IccPrivateKeyCrtComponentsJson = i2 % 128;
        java.lang.String str = setfiltertext.writeReplace;
        if (i2 % 2 != 0) {
            return str;
        }
        throw null;
    }

    private static /* synthetic */ java.lang.Object AlternateContactlessPaymentDataJson(java.lang.Object[] objArr) {
        com.payair.hce.setFilterText setfiltertext = (com.payair.hce.setFilterText) objArr[0];
        int i = IccPrivateKeyCrtComponentsJson;
        int i2 = i & 73;
        int i3 = (i | 73) & (~i2);
        int i4 = -(-(i2 << 1));
        int i5 = ((i3 & i4) + (i3 | i4)) % 128;
        getAid = i5;
        java.lang.String str = setfiltertext.DigitizedCardProfile;
        int i6 = i5 & 59;
        int i7 = (i5 ^ 59) | i6;
        int i8 = ((i6 | i7) << 1) - (i6 ^ i7);
        IccPrivateKeyCrtComponentsJson = i8 % 128;
        if (i8 % 2 != 0) {
            return str;
        }
        throw null;
    }

    private static /* synthetic */ java.lang.Object values(java.lang.Object[] objArr) {
        com.payair.hce.setFilterText setfiltertext = (com.payair.hce.setFilterText) objArr[0];
        int i = IccPrivateKeyCrtComponentsJson;
        int i2 = ((i ^ 116) + ((i & 116) << 1)) - 1;
        int i3 = i2 % 128;
        getAid = i3;
        com.payair.hce.setFilterText.valueOf valueof = setfiltertext.values;
        if (i2 % 2 != 0) {
            throw null;
        }
        int i4 = (i3 ^ 98) + ((i3 & 98) << 1);
        IccPrivateKeyCrtComponentsJson = ((~i4) + (i4 << 1)) % 128;
        return valueof;
    }

    private static /* synthetic */ java.lang.Object valueOf(java.lang.Object[] objArr) {
        com.payair.hce.setFilterText setfiltertext = (com.payair.hce.setFilterText) objArr[0];
        int i = getAid;
        int i2 = ((i | 41) << 1) - ((i & (-42)) | ((~i) & 41));
        IccPrivateKeyCrtComponentsJson = i2 % 128;
        com.payair.hce.setFilterText.valueOf valueof = setfiltertext.IccPrivateKeyCrtComponentsJson;
        if (i2 % 2 != 0) {
            return valueof;
        }
        throw null;
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001J\u001a\u0010\u0004\u001a\u00020\u00032\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u000e\u001a\u00020\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000bR\u001a\u0010\f\u001a\u00020\u000f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0010\u001a\u00020\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\r\u001a\u0004\b\u0010\u0010\u000bR\u001a\u0010\u0014\u001a\u00020\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\r\u001a\u0004\b\f\u0010\u000b"}, d2 = {"Lcom/payair/hce/setFilterText$valueOf;", "", "p0", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "writeReplace", "Ljava/lang/String;", "AlternateContactlessPaymentDataJson", "Lcom/payair/hce/visa/tokenization/ExpirationDate;", "values", "Lcom/payair/hce/visa/tokenization/ExpirationDate;", "valueOf", "()Lcom/payair/hce/visa/tokenization/ExpirationDate;", "DigitizedCardProfile"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class valueOf {
        private static int DigitizedCardProfile = 0;
        private static int getProfileVersion = 1;

        /* renamed from: AlternateContactlessPaymentDataJson, reason: from kotlin metadata */
        @com.payair.hce.SdkCoreContactlessPaymentDataImpl(valueOf = "remainder")
        private final java.lang.String DigitizedCardProfile;

        /* renamed from: valueOf, reason: from kotlin metadata */
        @com.payair.hce.SdkCoreContactlessPaymentDataImpl(valueOf = "exponent")
        private final java.lang.String values;

        /* renamed from: values, reason: from kotlin metadata */
        @com.payair.hce.SdkCoreContactlessPaymentDataImpl(valueOf = "expirationDate")
        private final com.payair.hce.visa.tokenization.ExpirationDate writeReplace;

        /* renamed from: writeReplace, reason: from kotlin metadata */
        @com.payair.hce.SdkCoreContactlessPaymentDataImpl(valueOf = "certificate")
        private final java.lang.String AlternateContactlessPaymentDataJson;

        public static /* synthetic */ java.lang.Object writeReplace(java.lang.Object[] objArr, int i, int i2, int i3) {
            int i4 = ~i;
            int i5 = ~i3;
            int i6 = ~i2;
            int i7 = i4 | i6;
            int i8 = (i * 868) + (i2 * 868) + (((~(i4 | i5)) | (~(i6 | i5))) * (-867)) + (((~i7) | (~(i4 | i3)) | (~(i6 | i3))) * (-1734)) + (((~(i | i6 | i3)) | (~(i2 | i4 | i3)) | (~(i5 | i7))) * 867);
            if (i8 == 1) {
                return AlternateContactlessPaymentDataJson(objArr);
            }
            if (i8 == 2) {
                return DigitizedCardProfile(objArr);
            }
            if (i8 == 3) {
                return valueOf(objArr);
            }
            if (i8 != 4) {
                return i8 != 5 ? writeReplace(objArr) : values(objArr);
            }
            com.payair.hce.setFilterText.valueOf valueof = (com.payair.hce.setFilterText.valueOf) objArr[0];
            int i9 = getProfileVersion;
            int i10 = i9 & 93;
            DigitizedCardProfile = ((i10 - (~((i9 ^ 93) | i10))) - 1) % 128;
            java.lang.String str = valueof.values;
            DigitizedCardProfile = ((((i9 | 80) << 1) - (i9 ^ 80)) - 1) % 128;
            return str;
        }

        private static /* synthetic */ java.lang.Object AlternateContactlessPaymentDataJson(java.lang.Object[] objArr) {
            com.payair.hce.setFilterText.valueOf valueof = (com.payair.hce.setFilterText.valueOf) objArr[0];
            int i = DigitizedCardProfile;
            int i2 = ((((i & (-60)) | ((~i) & 59)) - (~(-(-((i & 59) << 1))))) - 1) % 128;
            getProfileVersion = i2;
            java.lang.String str = valueof.AlternateContactlessPaymentDataJson;
            int i3 = ((i2 ^ 32) + ((i2 & 32) << 1)) - 1;
            DigitizedCardProfile = i3 % 128;
            if (i3 % 2 == 0) {
                return str;
            }
            throw null;
        }

        private static /* synthetic */ java.lang.Object valueOf(java.lang.Object[] objArr) {
            com.payair.hce.setFilterText.valueOf valueof = (com.payair.hce.setFilterText.valueOf) objArr[0];
            int i = DigitizedCardProfile;
            int i2 = i & 15;
            int i3 = i | 15;
            int i4 = (i2 ^ i3) + ((i3 & i2) << 1);
            getProfileVersion = i4 % 128;
            java.lang.String str = valueof.DigitizedCardProfile;
            if (i4 % 2 != 0) {
                return str;
            }
            throw null;
        }

        private static /* synthetic */ java.lang.Object values(java.lang.Object[] objArr) {
            com.payair.hce.setFilterText.valueOf valueof = (com.payair.hce.setFilterText.valueOf) objArr[0];
            int i = DigitizedCardProfile;
            getProfileVersion = (i + 11) % 128;
            com.payair.hce.visa.tokenization.ExpirationDate expirationDate = valueof.writeReplace;
            int i2 = ((i & 40) + (i | 40)) - 1;
            getProfileVersion = i2 % 128;
            if (i2 % 2 != 0) {
                return expirationDate;
            }
            throw null;
        }

        private static /* synthetic */ java.lang.Object DigitizedCardProfile(java.lang.Object[] objArr) {
            java.lang.Boolean bool = java.lang.Boolean.FALSE;
            com.payair.hce.setFilterText.valueOf valueof = (com.payair.hce.setFilterText.valueOf) objArr[0];
            java.lang.Boolean bool2 = java.lang.Boolean.TRUE;
            java.lang.Object obj = objArr[1];
            int i = getProfileVersion;
            int i2 = ((i | 5) << 1) - (i ^ 5);
            DigitizedCardProfile = i2 % 128;
            if (i2 % 2 != 0) {
                throw new java.lang.ArithmeticException();
            }
            if (valueof == obj) {
                int i3 = i ^ 55;
                int i4 = (i & 55) << 1;
                int i5 = (i3 ^ i4) + ((i3 & i4) << 1);
                DigitizedCardProfile = i5 % 128;
                if (i5 % 2 == 0) {
                    return bool2;
                }
                throw null;
            }
            if (!(obj instanceof com.payair.hce.setFilterText.valueOf)) {
                DigitizedCardProfile = ((((i | com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE) << 1) - (i ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE)) - 1) % 128;
                int i6 = i + 9;
                DigitizedCardProfile = i6 % 128;
                if (i6 % 2 == 0) {
                    return bool;
                }
                throw new java.lang.ArithmeticException();
            }
            com.payair.hce.setFilterText.valueOf valueof2 = (com.payair.hce.setFilterText.valueOf) obj;
            if (!kotlin.jvm.internal.Intrinsics.areEqual(valueof.AlternateContactlessPaymentDataJson, valueof2.AlternateContactlessPaymentDataJson)) {
                int i7 = getProfileVersion;
                int i8 = i7 & 87;
                int i9 = (~i8) & (i7 | 87);
                int i10 = -(-(i8 << 1));
                DigitizedCardProfile = ((i9 & i10) + (i10 | i9)) % 128;
                DigitizedCardProfile = (((i7 & (-50)) | ((~i7) & 49)) + ((i7 & 49) << 1)) % 128;
                return bool;
            }
            if (!kotlin.jvm.internal.Intrinsics.areEqual(valueof.values, valueof2.values)) {
                int i11 = getProfileVersion;
                int i12 = i11 & 69;
                int i13 = -(-((i11 ^ 69) | i12));
                int i14 = (i12 ^ i13) + ((i13 & i12) << 1);
                DigitizedCardProfile = i14 % 128;
                return java.lang.Boolean.valueOf(i14 % 2 != 0);
            }
            if (!kotlin.jvm.internal.Intrinsics.areEqual(valueof.DigitizedCardProfile, valueof2.DigitizedCardProfile)) {
                int i15 = DigitizedCardProfile;
                getProfileVersion = (i15 + 35) % 128;
                getProfileVersion = (((i15 | 21) << 1) - (i15 ^ 21)) % 128;
                return bool;
            }
            if (kotlin.jvm.internal.Intrinsics.areEqual(valueof.writeReplace, valueof2.writeReplace)) {
                int i16 = getProfileVersion;
                DigitizedCardProfile = ((i16 & 53) + (i16 | 53)) % 128;
                return bool2;
            }
            int i17 = DigitizedCardProfile;
            int i18 = i17 & 49;
            int i19 = ((i18 - (~((i17 ^ 49) | i18))) - 1) % 128;
            getProfileVersion = i19;
            int i20 = i19 & 125;
            int i21 = ((i19 | 125) & (~i20)) + (i20 << 1);
            DigitizedCardProfile = i21 % 128;
            if (i21 % 2 == 0) {
                return bool;
            }
            throw null;
        }

        private static /* synthetic */ java.lang.Object writeReplace(java.lang.Object[] objArr) {
            com.payair.hce.setFilterText.valueOf valueof = (com.payair.hce.setFilterText.valueOf) objArr[0];
            int i = getProfileVersion;
            int i2 = i & 61;
            int i3 = i | 61;
            DigitizedCardProfile = ((i2 ^ i3) + ((i3 & i2) << 1)) % 128;
            int hashCode = valueof.AlternateContactlessPaymentDataJson.hashCode() * 31;
            int i4 = -(-valueof.values.hashCode());
            int i5 = (((((~i4) & hashCode) | ((~hashCode) & i4)) - (~(-(-((hashCode & i4) << 1))))) - 1) * 31;
            int i6 = -(~valueof.DigitizedCardProfile.hashCode());
            int i7 = (((i5 ^ i6) + ((i6 & i5) << 1)) - 1) * 31;
            int hashCode2 = valueof.writeReplace.hashCode();
            int i8 = i7 & hashCode2;
            int i9 = ((i7 ^ hashCode2) | i8) << 1;
            int i10 = -((hashCode2 | i7) & (~i8));
            int i11 = DigitizedCardProfile;
            int i12 = i11 & 61;
            int i13 = i11 | 61;
            int i14 = ((i12 | i13) << 1) - (i13 ^ i12);
            getProfileVersion = i14 % 128;
            if (i14 % 2 != 0) {
                return java.lang.Integer.valueOf((i9 ^ i10) + ((i10 & i9) << 1));
            }
            throw null;
        }

        public final boolean equals(java.lang.Object p0) {
            return ((java.lang.Boolean) writeReplace(new java.lang.Object[]{this, p0}, -150940871, 150940873, java.lang.System.identityHashCode(this))).booleanValue();
        }

        public final int hashCode() {
            return ((java.lang.Integer) writeReplace(new java.lang.Object[]{this}, 913723217, -913723217, java.lang.System.identityHashCode(this))).intValue();
        }

        public final java.lang.String toString() {
            int i = DigitizedCardProfile;
            getProfileVersion = (((i ^ 117) - (~(-(-((i & 117) << 1))))) - 1) % 128;
            java.lang.String str = this.AlternateContactlessPaymentDataJson;
            java.lang.String str2 = this.values;
            java.lang.String str3 = this.DigitizedCardProfile;
            com.payair.hce.visa.tokenization.ExpirationDate expirationDate = this.writeReplace;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("VisaPublicKeyCert(certificate=");
            sb.append(str);
            sb.append(", exponent=");
            sb.append(str2);
            sb.append(", remainder=");
            sb.append(str3);
            sb.append(", expirationDate=");
            sb.append(expirationDate);
            sb.append(")");
            java.lang.String obj = sb.toString();
            int i2 = DigitizedCardProfile;
            int i3 = ((i2 | 33) << 1) - (i2 ^ 33);
            getProfileVersion = i3 % 128;
            if (i3 % 2 != 0) {
                return obj;
            }
            throw null;
        }

        public final com.payair.hce.visa.tokenization.ExpirationDate valueOf() {
            return (com.payair.hce.visa.tokenization.ExpirationDate) writeReplace(new java.lang.Object[]{this}, 61138054, -61138049, java.lang.System.identityHashCode(this));
        }

        public final java.lang.String writeReplace() {
            return (java.lang.String) writeReplace(new java.lang.Object[]{this}, 968987173, -968987170, java.lang.System.identityHashCode(this));
        }

        public final java.lang.String values() {
            return (java.lang.String) writeReplace(new java.lang.Object[]{this}, -576569145, 576569149, java.lang.System.identityHashCode(this));
        }

        public final java.lang.String AlternateContactlessPaymentDataJson() {
            return (java.lang.String) writeReplace(new java.lang.Object[]{this}, -1382099800, 1382099801, java.lang.System.identityHashCode(this));
        }
    }

    private static /* synthetic */ java.lang.Object DigitizedCardProfile(java.lang.Object[] objArr) {
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        com.payair.hce.setFilterText setfiltertext = (com.payair.hce.setFilterText) objArr[0];
        java.lang.Object obj = objArr[1];
        int i = IccPrivateKeyCrtComponentsJson;
        int i2 = (((i & 46) + (i | 46)) - 1) % 128;
        getAid = i2;
        if (setfiltertext == obj) {
            int i3 = (((i ^ 55) | (i & 55)) << 1) - ((i & (-56)) | ((~i) & 55));
            getAid = i3 % 128;
            return java.lang.Boolean.valueOf(i3 % 2 == 0);
        }
        if (!(obj instanceof com.payair.hce.setFilterText)) {
            int i4 = i2 & 87;
            int i5 = -(-((i2 ^ 87) | i4));
            int i6 = ((i4 ^ i5) + ((i4 & i5) << 1)) % 128;
            IccPrivateKeyCrtComponentsJson = i6;
            int i7 = i6 & 41;
            int i8 = (i6 | 41) & (~i7);
            int i9 = -(-(i7 << 1));
            getAid = ((i8 ^ i9) + ((i9 & i8) << 1)) % 128;
            return bool;
        }
        com.payair.hce.setFilterText setfiltertext2 = (com.payair.hce.setFilterText) obj;
        if (!kotlin.jvm.internal.Intrinsics.areEqual(setfiltertext.valueOf, setfiltertext2.valueOf)) {
            int i10 = IccPrivateKeyCrtComponentsJson;
            int i11 = i10 & 91;
            int i12 = ((i10 ^ 91) | i11) << 1;
            int i13 = -((~i11) & (i10 | 91));
            int i14 = (i12 & i13) + (i13 | i12);
            getAid = i14 % 128;
            boolean z = i14 % 2 != 0;
            getAid = (((i10 | 89) << 1) - (i10 ^ 89)) % 128;
            return java.lang.Boolean.valueOf(z);
        }
        if (!kotlin.jvm.internal.Intrinsics.areEqual(setfiltertext.writeReplace, setfiltertext2.writeReplace)) {
            int i15 = getAid;
            int i16 = ((i15 & 63) + (i15 | 63)) % 128;
            IccPrivateKeyCrtComponentsJson = i16;
            int i17 = i16 & 5;
            int i18 = -(-((i16 ^ 5) | i17));
            int i19 = (i17 ^ i18) + ((i17 & i18) << 1);
            getAid = i19 % 128;
            if (i19 % 2 == 0) {
                return bool;
            }
            throw new java.lang.ArithmeticException();
        }
        if (!kotlin.jvm.internal.Intrinsics.areEqual(setfiltertext.DigitizedCardProfile, setfiltertext2.DigitizedCardProfile)) {
            int i20 = IccPrivateKeyCrtComponentsJson + 112;
            int i21 = (~i20) + (i20 << 1);
            getAid = i21 % 128;
            return java.lang.Boolean.valueOf(i21 % 2 != 0);
        }
        if (!kotlin.jvm.internal.Intrinsics.areEqual(setfiltertext.values, setfiltertext2.values)) {
            int i22 = IccPrivateKeyCrtComponentsJson;
            int i23 = (i22 | 69) << 1;
            int i24 = -((i22 & (-70)) | ((~i22) & 69));
            getAid = ((i23 & i24) + (i23 | i24)) % 128;
            int i25 = i22 & 103;
            getAid = ((i25 - (~((i22 ^ 103) | i25))) - 1) % 128;
            return bool;
        }
        if (!kotlin.jvm.internal.Intrinsics.areEqual(setfiltertext.IccPrivateKeyCrtComponentsJson, setfiltertext2.IccPrivateKeyCrtComponentsJson)) {
            int i26 = IccPrivateKeyCrtComponentsJson;
            int i27 = i26 & 89;
            getAid = ((i27 - (~((i26 ^ 89) | i27))) - 1) % 128;
            int i28 = i26 & 63;
            int i29 = (i28 - (~((i26 ^ 63) | i28))) - 1;
            getAid = i29 % 128;
            if (i29 % 2 == 0) {
                return bool;
            }
            throw new java.lang.ArithmeticException();
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(setfiltertext.AlternateContactlessPaymentDataJson, setfiltertext2.AlternateContactlessPaymentDataJson)) {
            int i30 = IccPrivateKeyCrtComponentsJson;
            getAid = ((i30 & 113) + (i30 | 113)) % 128;
            return java.lang.Boolean.TRUE;
        }
        int i31 = getAid;
        int i32 = i31 & 113;
        int i33 = -(-((i31 ^ 113) | i32));
        int i34 = (((i32 | i33) << 1) - (i33 ^ i32)) % 128;
        IccPrivateKeyCrtComponentsJson = i34;
        int i35 = ((i34 | 10) << 1) - (i34 ^ 10);
        getAid = ((~i35) + (i35 << 1)) % 128;
        return bool;
    }

    public final boolean equals(java.lang.Object p0) {
        return ((java.lang.Boolean) valueOf(new java.lang.Object[]{this, p0}, -2071619862, 2071619865, java.lang.System.identityHashCode(this))).booleanValue();
    }

    public final int hashCode() {
        return ((java.lang.Integer) valueOf(new java.lang.Object[]{this}, 680955669, -680955664, java.lang.System.identityHashCode(this))).intValue();
    }

    public final java.lang.String toString() {
        int i = IccPrivateKeyCrtComponentsJson;
        getAid = (((i | 73) << 1) - (i ^ 73)) % 128;
        java.lang.String str = this.valueOf;
        java.lang.String str2 = this.writeReplace;
        java.lang.String str3 = this.DigitizedCardProfile;
        com.payair.hce.setFilterText.valueOf valueof = this.values;
        com.payair.hce.setFilterText.valueOf valueof2 = this.IccPrivateKeyCrtComponentsJson;
        java.lang.String str4 = this.AlternateContactlessPaymentDataJson;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("TokenODAData(appFileLocator=");
        sb.append(str);
        sb.append(", appProfile=");
        sb.append(str2);
        sb.append(", caPubKeyIndex=");
        sb.append(str3);
        sb.append(", iccPubKeyCert=");
        sb.append(valueof);
        sb.append(", tokenBinPubKeyCert=");
        sb.append(valueof2);
        sb.append(", enciccPrivateKey=");
        sb.append(str4);
        sb.append(")");
        java.lang.String obj = sb.toString();
        int i2 = IccPrivateKeyCrtComponentsJson;
        int i3 = i2 ^ 121;
        int i4 = -(-((i2 & 121) << 1));
        getAid = ((i3 & i4) + (i4 | i3)) % 128;
        return obj;
    }

    public final java.lang.String getProfileVersion() {
        return (java.lang.String) valueOf(new java.lang.Object[]{this}, 1081881664, -1081881662, java.lang.System.identityHashCode(this));
    }

    public final com.payair.hce.setFilterText.valueOf AlternateContactlessPaymentDataJson() {
        return (com.payair.hce.setFilterText.valueOf) valueOf(new java.lang.Object[]{this}, 388492089, -388492088, java.lang.System.identityHashCode(this));
    }

    public final com.payair.hce.setFilterText.valueOf writeReplace() {
        return (com.payair.hce.setFilterText.valueOf) valueOf(new java.lang.Object[]{this}, -152857876, 152857880, java.lang.System.identityHashCode(this));
    }

    public final java.lang.String valueOf() {
        return (java.lang.String) valueOf(new java.lang.Object[]{this}, -131302742, 131302748, java.lang.System.identityHashCode(this));
    }

    public final java.lang.String values() {
        return (java.lang.String) valueOf(new java.lang.Object[]{this}, 117439756, -117439749, java.lang.System.identityHashCode(this));
    }

    public final java.lang.String DigitizedCardProfile() {
        return (java.lang.String) valueOf(new java.lang.Object[]{this}, 2131932752, -2131932752, java.lang.System.identityHashCode(this));
    }
}
