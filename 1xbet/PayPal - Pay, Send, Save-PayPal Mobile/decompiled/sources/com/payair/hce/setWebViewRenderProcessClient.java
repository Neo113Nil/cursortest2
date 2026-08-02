package com.payair.hce;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\t\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u000fR\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0011\u001a\u0004\b\u0013\u0010\u000fR\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0011\u001a\u0004\b\u0014\u0010\u000f"}, d2 = {"Lcom/payair/hce/setWebViewRenderProcessClient;", "", "", "p0", "p1", "p2", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "values", "Ljava/lang/String;", "valueOf", "AlternateContactlessPaymentDataJson", "writeReplace", "DigitizedCardProfile"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class setWebViewRenderProcessClient {
    private static int DigitizedCardProfile = 0;
    private static int writeReplace = 1;

    /* renamed from: AlternateContactlessPaymentDataJson, reason: from kotlin metadata */
    private java.lang.String DigitizedCardProfile;
    private java.lang.String valueOf;
    private java.lang.String values;

    public static /* synthetic */ java.lang.Object writeReplace(java.lang.Object[] objArr, int i, int i2, int i3) {
        int hashCode;
        int hashCode2;
        int i4;
        int i5;
        int i6 = ~((~i) | (~i2));
        int i7 = i | i2;
        int i8 = (i * (-755)) + (i2 * (-755)) + (i6 * 1512) + (((~(i7 | i3)) | i6) * (-756)) + (((~i3) | i7) * 756);
        if (i8 == 1) {
            return valueOf(objArr);
        }
        int i9 = 0;
        if (i8 == 2) {
            com.payair.hce.setWebViewRenderProcessClient setwebviewrenderprocessclient = (com.payair.hce.setWebViewRenderProcessClient) objArr[0];
            int i10 = (DigitizedCardProfile + 57) % 128;
            writeReplace = i10;
            java.lang.String str = setwebviewrenderprocessclient.values;
            int i11 = i10 & 49;
            int i12 = ((i10 ^ 49) | i11) << 1;
            int i13 = -((i10 | 49) & (~i11));
            DigitizedCardProfile = ((i12 ^ i13) + ((i13 & i12) << 1)) % 128;
            return str;
        }
        if (i8 != 3) {
            return i8 != 4 ? AlternateContactlessPaymentDataJson(objArr) : DigitizedCardProfile(objArr);
        }
        com.payair.hce.setWebViewRenderProcessClient setwebviewrenderprocessclient2 = (com.payair.hce.setWebViewRenderProcessClient) objArr[0];
        int i14 = DigitizedCardProfile;
        writeReplace = (((i14 ^ 26) + ((i14 & 26) << 1)) - 1) % 128;
        java.lang.String str2 = setwebviewrenderprocessclient2.DigitizedCardProfile;
        if (str2 == null) {
            writeReplace = (((i14 ^ 24) + ((i14 & 24) << 1)) - 1) % 128;
            int i15 = ((i14 & com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE) + (i14 | com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE)) - 1;
            writeReplace = i15 % 128;
            if (i15 % 2 == 0) {
                int i16 = 2 / 5;
            }
            hashCode = 0;
        } else {
            hashCode = str2.hashCode();
            int i17 = DigitizedCardProfile;
            int i18 = (i17 & (-78)) | ((~i17) & 77);
            int i19 = (i17 & 77) << 1;
            writeReplace = ((i18 & i19) + (i19 | i18)) % 128;
        }
        int i20 = hashCode * 31;
        java.lang.String str3 = setwebviewrenderprocessclient2.values;
        if (str3 == null) {
            int i21 = writeReplace;
            int i22 = i21 & 15;
            int i23 = (i21 ^ 15) | i22;
            DigitizedCardProfile = ((i22 & i23) + (i22 | i23)) % 128;
            int i24 = ((i21 ^ 29) | (i21 & 29)) << 1;
            int i25 = -((i21 & (-30)) | ((~i21) & 29));
            DigitizedCardProfile = ((i24 & i25) + (i25 | i24)) % 128;
            hashCode2 = 0;
        } else {
            hashCode2 = str3.hashCode();
            DigitizedCardProfile = (writeReplace + 53) % 128;
        }
        int identityHashCode = java.lang.System.identityHashCode(setwebviewrenderprocessclient2);
        int i26 = hashCode2 * 471;
        int i27 = hashCode * 14601;
        int i28 = i26 & i27;
        int i29 = ((((i26 ^ i27) | i28) << 1) - (~(-((i27 | i26) & (~i28))))) - 1;
        int i30 = ~i20;
        int i31 = ~hashCode2;
        int i32 = hashCode2 & i30;
        int i33 = -(-(((i20 & i31) | i32 | (hashCode2 & i20)) * (-470)));
        int i34 = i31 & i30;
        int i35 = (i31 | i30) & (~i34);
        int i36 = ~((i34 ^ i35) | (i35 & i34));
        int i37 = i30 & identityHashCode;
        int i38 = ~(i37 | ((i30 | identityHashCode) & (~i37)));
        int i39 = i36 ^ i38;
        int i40 = i36 & i38;
        int i41 = (i40 ^ i39) | (i40 & i39);
        int i42 = ~identityHashCode;
        int i43 = (i31 & i42) | ((~i42) & hashCode2);
        int i44 = i42 & hashCode2;
        int i45 = (i43 ^ i44) | (i43 & i44);
        int i46 = ~((i45 ^ i20) | (i45 & i20));
        int i47 = (((i29 ^ i33) + ((i29 & i33) << 1)) - (~(-(-(((i46 ^ i41) | (i41 & i46)) * (-470)))))) - 1;
        int i48 = i30 ^ hashCode2;
        int i49 = (i48 ^ i32) | (i32 & i48);
        int i50 = i49 & identityHashCode;
        int i51 = (i49 | identityHashCode) & (~i50);
        int i52 = ~((i51 ^ i50) | (i51 & i50));
        int i53 = (hashCode2 ^ i42) | i44;
        int i54 = i53 & i20;
        int i55 = (i20 | i53) & (~i54);
        int i56 = ~((i55 ^ i54) | (i55 & i54));
        int i57 = i52 & i56;
        int i58 = (i52 | i56) & (~i57);
        int i59 = ((i58 ^ i57) | (i58 & i57)) * 470;
        int i60 = ((i47 & i59) + (i59 | i47)) * 31;
        java.lang.String str4 = setwebviewrenderprocessclient2.valueOf;
        if (str4 == null) {
            int i61 = DigitizedCardProfile;
            int i62 = i61 & 23;
            int i63 = ((i61 ^ 23) | i62) << 1;
            int i64 = -((~i62) & (i61 | 23));
            writeReplace = (((i63 | i64) << 1) - (i64 ^ i63)) % 128;
            i4 = i61 & 3;
            i5 = i61 | 3;
        } else {
            i9 = str4.hashCode();
            int i65 = DigitizedCardProfile;
            i4 = i65 ^ 105;
            i5 = (i65 & 105) << 1;
        }
        int i66 = (i4 + i5) % 128;
        writeReplace = i66;
        int i67 = i60 & i9;
        int i68 = -(-(i60 | i9));
        int i69 = i66 & 93;
        int i70 = (i66 | 93) & (~i69);
        int i71 = i69 << 1;
        DigitizedCardProfile = ((i70 & i71) + (i70 | i71)) % 128;
        return java.lang.Integer.valueOf(((i67 | i68) << 1) - (i67 ^ i68));
    }

    public setWebViewRenderProcessClient(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        this.DigitizedCardProfile = str;
        this.values = str2;
        this.valueOf = str3;
    }

    private static /* synthetic */ java.lang.Object valueOf(java.lang.Object[] objArr) {
        com.payair.hce.setWebViewRenderProcessClient setwebviewrenderprocessclient = (com.payair.hce.setWebViewRenderProcessClient) objArr[0];
        int i = DigitizedCardProfile;
        int i2 = i & 119;
        int i3 = (i ^ 119) | i2;
        int i4 = ((i2 ^ i3) + ((i3 & i2) << 1)) % 128;
        writeReplace = i4;
        java.lang.String str = setwebviewrenderprocessclient.DigitizedCardProfile;
        int i5 = ((i4 | 59) << 1) - (i4 ^ 59);
        DigitizedCardProfile = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    private static /* synthetic */ java.lang.Object DigitizedCardProfile(java.lang.Object[] objArr) {
        com.payair.hce.setWebViewRenderProcessClient setwebviewrenderprocessclient = (com.payair.hce.setWebViewRenderProcessClient) objArr[0];
        int i = DigitizedCardProfile;
        int i2 = (i & (-78)) | ((~i) & 77);
        int i3 = -(-((i & 77) << 1));
        int i4 = (i2 & i3) + (i3 | i2);
        writeReplace = i4 % 128;
        java.lang.String str = setwebviewrenderprocessclient.valueOf;
        if (i4 % 2 != 0) {
            return str;
        }
        throw new java.lang.ArithmeticException();
    }

    public final /* synthetic */ void valueOf(com.payair.hce.getRemotePaymentData getremotepaymentdata, com.payair.hce.getTrack2Equivalent gettrack2equivalent) {
        getremotepaymentdata.AlternateContactlessPaymentDataJson();
        gettrack2equivalent.writeReplace(getremotepaymentdata, 77);
        getremotepaymentdata.DigitizedCardProfile(this.DigitizedCardProfile);
        gettrack2equivalent.writeReplace(getremotepaymentdata, 33);
        getremotepaymentdata.DigitizedCardProfile(this.values);
        gettrack2equivalent.writeReplace(getremotepaymentdata, 0);
        getremotepaymentdata.DigitizedCardProfile(this.valueOf);
        getremotepaymentdata.values();
    }

    public final /* synthetic */ void writeReplace(com.payair.hce.getAckAutomaticallyResetByApplication getackautomaticallyresetbyapplication, com.payair.hce.getPan getpan) {
        getackautomaticallyresetbyapplication.writeReplace();
        while (getackautomaticallyresetbyapplication.values()) {
            int AlternateContactlessPaymentDataJson = getpan.AlternateContactlessPaymentDataJson(getackautomaticallyresetbyapplication);
            boolean z = getackautomaticallyresetbyapplication.getProfileVersion() != com.payair.hce.getAckPreEntryAllowed.NULL;
            if (AlternateContactlessPaymentDataJson != 53) {
                if (AlternateContactlessPaymentDataJson != 72) {
                    if (AlternateContactlessPaymentDataJson != 91) {
                        getackautomaticallyresetbyapplication.getCvrMaskAnd();
                    } else if (z) {
                        this.valueOf = getackautomaticallyresetbyapplication.getProfileVersion() != com.payair.hce.getAckPreEntryAllowed.BOOLEAN ? getackautomaticallyresetbyapplication.getAid() : java.lang.Boolean.toString(getackautomaticallyresetbyapplication.IccPrivateKeyCrtComponentsJson());
                    } else {
                        this.valueOf = null;
                        getackautomaticallyresetbyapplication.RecordsJson();
                    }
                } else if (z) {
                    this.values = getackautomaticallyresetbyapplication.getProfileVersion() != com.payair.hce.getAckPreEntryAllowed.BOOLEAN ? getackautomaticallyresetbyapplication.getAid() : java.lang.Boolean.toString(getackautomaticallyresetbyapplication.IccPrivateKeyCrtComponentsJson());
                } else {
                    this.values = null;
                    getackautomaticallyresetbyapplication.RecordsJson();
                }
            } else if (z) {
                this.DigitizedCardProfile = getackautomaticallyresetbyapplication.getProfileVersion() != com.payair.hce.getAckPreEntryAllowed.BOOLEAN ? getackautomaticallyresetbyapplication.getAid() : java.lang.Boolean.toString(getackautomaticallyresetbyapplication.IccPrivateKeyCrtComponentsJson());
            } else {
                this.DigitizedCardProfile = null;
                getackautomaticallyresetbyapplication.RecordsJson();
            }
        }
        getackautomaticallyresetbyapplication.DigitizedCardProfile();
    }

    private static /* synthetic */ java.lang.Object AlternateContactlessPaymentDataJson(java.lang.Object[] objArr) {
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        com.payair.hce.setWebViewRenderProcessClient setwebviewrenderprocessclient = (com.payair.hce.setWebViewRenderProcessClient) objArr[0];
        java.lang.Boolean bool2 = java.lang.Boolean.TRUE;
        java.lang.Object obj = objArr[1];
        int i = writeReplace;
        int i2 = ((i & 11) + (i | 11)) % 128;
        DigitizedCardProfile = i2;
        if (setwebviewrenderprocessclient == obj) {
            writeReplace = (i2 + 73) % 128;
            int i3 = i2 | 33;
            writeReplace = ((i3 << 1) - (i3 & (~(i2 & 33)))) % 128;
            return bool2;
        }
        if (!(obj instanceof com.payair.hce.setWebViewRenderProcessClient)) {
            DigitizedCardProfile = (i + 95) % 128;
            int i4 = i & 103;
            int i5 = (i ^ 103) | i4;
            DigitizedCardProfile = ((i4 ^ i5) + ((i4 & i5) << 1)) % 128;
            return bool;
        }
        com.payair.hce.setWebViewRenderProcessClient setwebviewrenderprocessclient2 = (com.payair.hce.setWebViewRenderProcessClient) obj;
        if (!kotlin.jvm.internal.Intrinsics.areEqual(setwebviewrenderprocessclient.DigitizedCardProfile, setwebviewrenderprocessclient2.DigitizedCardProfile)) {
            int i6 = writeReplace;
            DigitizedCardProfile = ((i6 & 59) + (i6 | 59)) % 128;
            int i7 = (((i6 & (-34)) | ((~i6) & 33)) - (~(-(-((i6 & 33) << 1))))) - 1;
            DigitizedCardProfile = i7 % 128;
            if (i7 % 2 == 0) {
                return bool;
            }
            throw new java.lang.ArithmeticException();
        }
        if (!kotlin.jvm.internal.Intrinsics.areEqual(setwebviewrenderprocessclient.values, setwebviewrenderprocessclient2.values)) {
            int i8 = writeReplace;
            int i9 = i8 ^ 69;
            int i10 = (((i8 & 69) | i9) << 1) - i9;
            int i11 = i10 % 128;
            DigitizedCardProfile = i11;
            boolean z = i10 % 2 != 0;
            int i12 = ((i11 ^ 1) | (i11 & 1)) << 1;
            int i13 = -((i11 & (-2)) | ((~i11) & 1));
            writeReplace = ((i12 ^ i13) + ((i12 & i13) << 1)) % 128;
            return java.lang.Boolean.valueOf(z);
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(setwebviewrenderprocessclient.valueOf, setwebviewrenderprocessclient2.valueOf)) {
            int i14 = writeReplace;
            int i15 = i14 & 31;
            int i16 = -(-((i14 ^ 31) | i15));
            DigitizedCardProfile = ((i15 ^ i16) + ((i16 & i15) << 1)) % 128;
            return bool2;
        }
        int i17 = DigitizedCardProfile;
        int i18 = i17 & 27;
        int i19 = ((i17 ^ 27) | i18) << 1;
        int i20 = -((i17 | 27) & (~i18));
        int i21 = ((i19 | i20) << 1) - (i20 ^ i19);
        writeReplace = i21 % 128;
        return java.lang.Boolean.valueOf(i21 % 2 == 0);
    }

    public /* synthetic */ setWebViewRenderProcessClient() {
    }

    public final boolean equals(java.lang.Object p0) {
        return ((java.lang.Boolean) writeReplace(new java.lang.Object[]{this, p0}, -1657095034, 1657095034, java.lang.System.identityHashCode(this))).booleanValue();
    }

    public final int hashCode() {
        return ((java.lang.Integer) writeReplace(new java.lang.Object[]{this}, 724580569, -724580566, java.lang.System.identityHashCode(this))).intValue();
    }

    public final java.lang.String toString() {
        int i = writeReplace;
        int i2 = i ^ 125;
        DigitizedCardProfile = ((((i & 125) | i2) << 1) - i2) % 128;
        java.lang.String str = this.DigitizedCardProfile;
        java.lang.String str2 = this.values;
        java.lang.String str3 = this.valueOf;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("DeviceKeysDao(integrityKey=");
        sb.append(str);
        sb.append(", confidentialityKey=");
        sb.append(str2);
        sb.append(", deviceRootKey=");
        sb.append(str3);
        sb.append(")");
        java.lang.String obj = sb.toString();
        int i3 = DigitizedCardProfile;
        int i4 = i3 & 61;
        int i5 = (i3 ^ 61) | i4;
        int i6 = (i4 & i5) + (i5 | i4);
        writeReplace = i6 % 128;
        if (i6 % 2 != 0) {
            return obj;
        }
        throw new java.lang.ArithmeticException();
    }

    public final java.lang.String AlternateContactlessPaymentDataJson() {
        return (java.lang.String) writeReplace(new java.lang.Object[]{this}, -2003471649, 2003471653, java.lang.System.identityHashCode(this));
    }

    public final java.lang.String values() {
        return (java.lang.String) writeReplace(new java.lang.Object[]{this}, 1391850130, -1391850128, java.lang.System.identityHashCode(this));
    }

    public final java.lang.String writeReplace() {
        return (java.lang.String) writeReplace(new java.lang.Object[]{this}, -236544366, 236544367, java.lang.System.identityHashCode(this));
    }
}
