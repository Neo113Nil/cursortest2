package com.payair.hce;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0080\b\u0018\u00002\u00020\u0001J\u001a\u0010\u0004\u001a\u00020\u00032\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u000e\u001a\u00020\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\f\u0010\u000bR\u001a\u0010\u0010\u001a\u00020\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\r\u001a\u0004\b\u000f\u0010\u000b"}, d2 = {"Lcom/payair/hce/setDownloadListener;", "", "p0", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "valueOf", "Ljava/lang/String;", "writeReplace", "DigitizedCardProfile", "AlternateContactlessPaymentDataJson"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class setDownloadListener {
    private static int DigitizedCardProfile = 0;
    private static int values = 1;

    /* renamed from: valueOf, reason: from kotlin metadata */
    @com.payair.hce.SdkCoreContactlessPaymentDataImpl(valueOf = "month")
    private final java.lang.String writeReplace;

    /* renamed from: writeReplace, reason: from kotlin metadata */
    @com.payair.hce.SdkCoreContactlessPaymentDataImpl(valueOf = com.paypal.oslo.feature.taxanddocumentcenter.data.taxreports.mapper.StringResourceConstants.YEAR)
    private final java.lang.String AlternateContactlessPaymentDataJson;

    public static /* synthetic */ java.lang.Object valueOf(java.lang.Object[] objArr, int i, int i2, int i3) {
        int i4 = ~((~i) | i2);
        int i5 = ~i2;
        int i6 = ~i3;
        int i7 = (i * (-1975)) + (i2 * com.paypal.oslo.feature.onboarding.signup.welcome.ui.state.WelcomeAnimationConstantsKt.TransferFrameEnd) + ((i3 | i4) * 988) + (((~(i | i5)) | (~(i | i6))) * (-1976)) + (((~(i5 | i3)) | i4 | (~(i2 | i6))) * 988);
        if (i7 == 1) {
            return DigitizedCardProfile(objArr);
        }
        if (i7 == 2) {
            return values(objArr);
        }
        if (i7 != 3) {
            com.payair.hce.setDownloadListener setdownloadlistener = (com.payair.hce.setDownloadListener) objArr[0];
            int i8 = DigitizedCardProfile;
            int i9 = i8 & 121;
            int i10 = -(-((i8 ^ 121) | i9));
            values = ((i9 ^ i10) + ((i9 & i10) << 1)) % 128;
            java.lang.String str = setdownloadlistener.AlternateContactlessPaymentDataJson;
            values = (i8 + 27) % 128;
            return str;
        }
        com.payair.hce.setDownloadListener setdownloadlistener2 = (com.payair.hce.setDownloadListener) objArr[0];
        int i11 = values;
        int i12 = i11 ^ 41;
        int i13 = (i11 & 41) << 1;
        DigitizedCardProfile = ((i12 & i13) + (i13 | i12)) % 128;
        int hashCode = setdownloadlistener2.writeReplace.hashCode();
        int i14 = hashCode * 31;
        int hashCode2 = setdownloadlistener2.AlternateContactlessPaymentDataJson.hashCode();
        int identityHashCode = java.lang.System.identityHashCode(setdownloadlistener2);
        int i15 = hashCode2 * 165;
        int i16 = -(-(hashCode * (-5053)));
        int i17 = ((i15 & i16) - (~(-(-(i16 | i15))))) - 1;
        int i18 = ~identityHashCode;
        int i19 = i18 & i14;
        int i20 = (i18 | i14) & (~i19);
        int i21 = ~i14;
        int i22 = ~((i19 ^ i20) | (i20 & i19));
        int i23 = hashCode2 & i22;
        int i24 = (i22 | hashCode2) & (~i23);
        int i25 = ((i24 ^ i23) | (i24 & i23)) * (-328);
        int i26 = ((~i25) & i17) | ((~i17) & i25);
        int i27 = -(-((i25 & i17) << 1));
        int i28 = (i26 ^ i27) + ((i27 & i26) << 1);
        int i29 = ((hashCode2 ^ identityHashCode) | (hashCode2 & identityHashCode)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SIGNIN_HEADER_VALUE;
        int i30 = ~hashCode2;
        int i31 = i30 & i21;
        int i32 = (i30 | i21) & (~i31);
        int i33 = ~((i32 ^ i31) | (i32 & i31));
        int i34 = i21 ^ identityHashCode;
        int i35 = identityHashCode & i21;
        int i36 = ~((i35 ^ i34) | (i35 & i34));
        int i37 = ((~i36) & i33) | ((~i33) & i36);
        int i38 = i36 & i33;
        int i39 = (i38 ^ i37) | (i38 & i37);
        int i40 = i18 | hashCode2;
        int i41 = i40 & i14;
        int i42 = (i40 | i14) & (~i41);
        int i43 = ~((i42 ^ i41) | (i42 & i41));
        int i44 = ((~i43) & i39) | ((~i39) & i43);
        int i45 = i39 & i43;
        int i46 = -(-(((i45 ^ i44) | (i45 & i44)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SIGNIN_HEADER_VALUE));
        int i47 = DigitizedCardProfile;
        values = (((((i47 ^ 93) | (i47 & 93)) << 1) - (~(-((i47 & (-94)) | ((~i47) & 93))))) - 1) % 128;
        return java.lang.Integer.valueOf((((((~i29) & i28) | ((~i28) & i29)) + ((i29 & i28) << 1)) - (~i46)) - 1);
    }

    private static /* synthetic */ java.lang.Object values(java.lang.Object[] objArr) {
        com.payair.hce.setDownloadListener setdownloadlistener = (com.payair.hce.setDownloadListener) objArr[0];
        int i = values;
        int i2 = i ^ 45;
        int i3 = ((i & 45) | i2) << 1;
        int i4 = -i2;
        DigitizedCardProfile = (((i3 | i4) << 1) - (i4 ^ i3)) % 128;
        java.lang.String str = setdownloadlistener.writeReplace;
        int i5 = i + 37;
        DigitizedCardProfile = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    private static /* synthetic */ java.lang.Object DigitizedCardProfile(java.lang.Object[] objArr) {
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        com.payair.hce.setDownloadListener setdownloadlistener = (com.payair.hce.setDownloadListener) objArr[0];
        java.lang.Boolean bool2 = java.lang.Boolean.TRUE;
        java.lang.Object obj = objArr[1];
        int i = values;
        int i2 = ((i | 81) << 1) - (i ^ 81);
        int i3 = i2 % 128;
        DigitizedCardProfile = i3;
        if (i2 % 2 != 0) {
            throw new java.lang.ArithmeticException();
        }
        if (setdownloadlistener == obj) {
            int i4 = (i3 & 69) + (i3 | 69);
            values = i4 % 128;
            if (i4 % 2 != 0) {
                return bool2;
            }
            throw null;
        }
        if (!(obj instanceof com.payair.hce.setDownloadListener)) {
            int i5 = ((-2) - (~(((i | 62) << 1) - (i ^ 62)))) % 128;
            DigitizedCardProfile = i5;
            values = (i5 + 13) % 128;
            return bool;
        }
        com.payair.hce.setDownloadListener setdownloadlistener2 = (com.payair.hce.setDownloadListener) obj;
        if (!kotlin.jvm.internal.Intrinsics.areEqual(setdownloadlistener.writeReplace, setdownloadlistener2.writeReplace)) {
            int i6 = DigitizedCardProfile;
            int i7 = i6 & 69;
            int i8 = ((i6 ^ 69) | i7) << 1;
            int i9 = -((i6 | 69) & (~i7));
            int i10 = ((i8 & i9) + (i9 | i8)) % 128;
            values = i10;
            int i11 = i10 & 85;
            int i12 = (i10 | 85) & (~i11);
            int i13 = i11 << 1;
            int i14 = (i12 & i13) + (i13 | i12);
            DigitizedCardProfile = i14 % 128;
            if (i14 % 2 == 0) {
                return bool;
            }
            throw new java.lang.ArithmeticException();
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(setdownloadlistener.AlternateContactlessPaymentDataJson, setdownloadlistener2.AlternateContactlessPaymentDataJson)) {
            int i15 = DigitizedCardProfile;
            int i16 = i15 ^ 47;
            int i17 = -(-((i15 & 47) << 1));
            int i18 = (i16 & i17) + (i17 | i16);
            values = i18 % 128;
            if (i18 % 2 != 0) {
                return bool2;
            }
            throw new java.lang.ArithmeticException();
        }
        int i19 = DigitizedCardProfile;
        int i20 = i19 & 99;
        int i21 = -(-(i19 | 99));
        values = ((i20 ^ i21) + ((i20 & i21) << 1)) % 128;
        int i22 = i19 | 69;
        int i23 = (i22 << 1) - ((~(i19 & 69)) & i22);
        values = i23 % 128;
        if (i23 % 2 != 0) {
            return bool;
        }
        throw null;
    }

    public final boolean equals(java.lang.Object p0) {
        return ((java.lang.Boolean) valueOf(new java.lang.Object[]{this, p0}, -855072876, 855072877, java.lang.System.identityHashCode(this))).booleanValue();
    }

    public final int hashCode() {
        return ((java.lang.Integer) valueOf(new java.lang.Object[]{this}, 89140782, -89140779, java.lang.System.identityHashCode(this))).intValue();
    }

    public final java.lang.String toString() {
        int i = values;
        int i2 = ((i | 73) << 1) - (i ^ 73);
        DigitizedCardProfile = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
        java.lang.String str = this.writeReplace;
        java.lang.String str2 = this.AlternateContactlessPaymentDataJson;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ExpirationDate(month=");
        sb.append(str);
        sb.append(", year=");
        sb.append(str2);
        sb.append(")");
        return sb.toString();
    }

    public final java.lang.String DigitizedCardProfile() {
        return (java.lang.String) valueOf(new java.lang.Object[]{this}, 528822198, -528822198, java.lang.System.identityHashCode(this));
    }

    public final java.lang.String valueOf() {
        return (java.lang.String) valueOf(new java.lang.Object[]{this}, 823132616, -823132614, java.lang.System.identityHashCode(this));
    }
}
