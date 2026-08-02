package com.payair.hce;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001B=\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0012R\u001a\u0010\u0013\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0014\u001a\u0004\b\u0016\u0010\u0012R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0014\u001a\u0004\b\u0017\u0010\u0012R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0018\u0010\u0012R\u001a\u0010\u0018\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0014\u001a\u0004\b\u0013\u0010\u0012R\u001a\u0010\u001b\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u0014\u001a\u0004\b\u001a\u0010\u0012"}, d2 = {"Lcom/payair/hce/setPictureListener;", "", "", "p0", "p1", "p2", "p3", "p4", "p5", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "DigitizedCardProfile", "Ljava/lang/String;", "values", "AlternateContactlessPaymentDataJson", "writeReplace", "valueOf", "SdkCoreAlternateContactlessPaymentDataImpl", "IccPrivateKeyCrtComponentsJson", "RecordsJson"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class setPictureListener {
    private static int IccPrivateKeyCrtComponentsJson = 1;
    private static int getProfileVersion;

    /* renamed from: AlternateContactlessPaymentDataJson, reason: from kotlin metadata */
    @com.payair.hce.SdkCoreContactlessPaymentDataImpl(valueOf = "osType")
    private final java.lang.String writeReplace;

    /* renamed from: DigitizedCardProfile, reason: from kotlin metadata */
    @com.payair.hce.SdkCoreContactlessPaymentDataImpl(valueOf = "deviceName")
    private final java.lang.String values;

    /* renamed from: SdkCoreAlternateContactlessPaymentDataImpl, reason: from kotlin metadata */
    @com.payair.hce.SdkCoreContactlessPaymentDataImpl(valueOf = "productVersion")
    private final java.lang.String RecordsJson;

    @com.payair.hce.SdkCoreContactlessPaymentDataImpl(valueOf = "productCode")
    private final java.lang.String valueOf;

    /* renamed from: values, reason: from kotlin metadata */
    @com.payair.hce.SdkCoreContactlessPaymentDataImpl(valueOf = "deviceType")
    private final java.lang.String DigitizedCardProfile;

    /* renamed from: writeReplace, reason: from kotlin metadata */
    @com.payair.hce.SdkCoreContactlessPaymentDataImpl(valueOf = "osVersion")
    private final java.lang.String AlternateContactlessPaymentDataJson;

    public static /* synthetic */ java.lang.Object writeReplace(java.lang.Object[] objArr, int i, int i2, int i3) {
        int i4 = ~i;
        int i5 = ~i3;
        switch ((i * (-563)) + (i2 * 565) + (((~((~i2) | i5)) | i4 | (~(i2 | i3))) * (-564)) + ((~(i3 | i4 | i2)) * 1128) + (((~(i | i2)) | (~(i4 | i5))) * 564)) {
            case 1:
                com.payair.hce.setPictureListener setpicturelistener = (com.payair.hce.setPictureListener) objArr[0];
                int i6 = (getProfileVersion + 43) % 128;
                IccPrivateKeyCrtComponentsJson = i6;
                java.lang.String str = setpicturelistener.AlternateContactlessPaymentDataJson;
                int i7 = i6 & 87;
                int i8 = (i6 ^ 87) | i7;
                getProfileVersion = ((i7 ^ i8) + ((i8 & i7) << 1)) % 128;
                return str;
            case 2:
                com.payair.hce.setPictureListener setpicturelistener2 = (com.payair.hce.setPictureListener) objArr[0];
                int i9 = getProfileVersion;
                int i10 = (i9 & 40) + (i9 | 40);
                IccPrivateKeyCrtComponentsJson = ((~i10) + (i10 << 1)) % 128;
                java.lang.String str2 = setpicturelistener2.writeReplace;
                getProfileVersion = ((((r6 | 20) << 1) - (r6 ^ 20)) - 1) % 128;
                return str2;
            case 3:
                com.payair.hce.setPictureListener setpicturelistener3 = (com.payair.hce.setPictureListener) objArr[0];
                int i11 = getProfileVersion;
                IccPrivateKeyCrtComponentsJson = (((i11 | 3) << 1) - (i11 ^ 3)) % 128;
                java.lang.String str3 = setpicturelistener3.RecordsJson;
                IccPrivateKeyCrtComponentsJson = (i11 + 97) % 128;
                return str3;
            case 4:
                com.payair.hce.setPictureListener setpicturelistener4 = (com.payair.hce.setPictureListener) objArr[0];
                int i12 = getProfileVersion;
                IccPrivateKeyCrtComponentsJson = ((i12 & com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) + (i12 | com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE)) % 128;
                java.lang.String str4 = setpicturelistener4.DigitizedCardProfile;
                getProfileVersion = (((r7 ^ 105) - (~((r7 & 105) << 1))) - 1) % 128;
                return str4;
            case 5:
                return values(objArr);
            case 6:
                return AlternateContactlessPaymentDataJson(objArr);
            case 7:
                return DigitizedCardProfile(objArr);
            default:
                return writeReplace(objArr);
        }
    }

    public setPictureListener(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str5, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str6, "");
        this.writeReplace = str;
        this.AlternateContactlessPaymentDataJson = str2;
        this.DigitizedCardProfile = str3;
        this.values = str4;
        this.valueOf = str5;
        this.RecordsJson = str6;
    }

    private static /* synthetic */ java.lang.Object DigitizedCardProfile(java.lang.Object[] objArr) {
        com.payair.hce.setPictureListener setpicturelistener = (com.payair.hce.setPictureListener) objArr[0];
        int i = IccPrivateKeyCrtComponentsJson;
        int i2 = (i ^ 81) + ((i & 81) << 1);
        getProfileVersion = i2 % 128;
        java.lang.String str = setpicturelistener.values;
        if (i2 % 2 == 0) {
            return str;
        }
        throw null;
    }

    private static /* synthetic */ java.lang.Object writeReplace(java.lang.Object[] objArr) {
        com.payair.hce.setPictureListener setpicturelistener = (com.payair.hce.setPictureListener) objArr[0];
        int i = IccPrivateKeyCrtComponentsJson + 83;
        int i2 = i % 128;
        getProfileVersion = i2;
        java.lang.String str = setpicturelistener.valueOf;
        if (i % 2 != 0) {
            throw null;
        }
        int i3 = i2 & 83;
        int i4 = (i2 ^ 83) | i3;
        IccPrivateKeyCrtComponentsJson = ((i3 & i4) + (i3 | i4)) % 128;
        return str;
    }

    private static /* synthetic */ java.lang.Object AlternateContactlessPaymentDataJson(java.lang.Object[] objArr) {
        int hashCode;
        int hashCode2;
        int i = 0;
        com.payair.hce.setPictureListener setpicturelistener = (com.payair.hce.setPictureListener) objArr[0];
        int i2 = getProfileVersion;
        int i3 = i2 + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE;
        IccPrivateKeyCrtComponentsJson = ((~i3) + (i3 << 1)) % 128;
        java.lang.String str = setpicturelistener.writeReplace;
        if (str == null) {
            IccPrivateKeyCrtComponentsJson = (((i2 & 34) + (i2 | 34)) - 1) % 128;
            IccPrivateKeyCrtComponentsJson = ((i2 ^ 111) + ((i2 & 111) << 1)) % 128;
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
            IccPrivateKeyCrtComponentsJson = (getProfileVersion + 21) % 128;
        }
        int i4 = hashCode * 31;
        java.lang.String str2 = setpicturelistener.AlternateContactlessPaymentDataJson;
        if (str2 == null) {
            int i5 = getProfileVersion;
            int i6 = (i5 & 113) + (i5 | 113);
            int i7 = i6 % 128;
            IccPrivateKeyCrtComponentsJson = i7;
            hashCode2 = i6 % 2 == 0 ? 1 : 0;
            int i8 = (i7 & 7) + (i7 | 7);
            getProfileVersion = i8 % 128;
            if (i8 % 2 != 0) {
                int i9 = 3 / 4;
            }
        } else {
            hashCode2 = str2.hashCode();
            IccPrivateKeyCrtComponentsJson = (getProfileVersion + 79) % 128;
        }
        int i10 = (((i4 | hashCode2) << 1) - (~(-((i4 & (~hashCode2)) | ((~i4) & hashCode2))))) - 1;
        int i11 = i10 * 31;
        int hashCode3 = setpicturelistener.DigitizedCardProfile.hashCode();
        int identityHashCode = java.lang.System.identityHashCode(setpicturelistener);
        int i12 = hashCode3 * 141;
        int i13 = i10 * (-8649);
        int i14 = ((~i13) & i12) | ((~i12) & i13);
        int i15 = (i13 & i12) << 1;
        int i16 = (i14 ^ i15) + ((i15 & i14) << 1);
        int i17 = i11 ^ identityHashCode;
        int i18 = i11 & identityHashCode;
        int i19 = ((i17 ^ i18) | (i17 & i18)) * 140;
        int i20 = ((~i19) & i16) | ((~i16) & i19);
        int i21 = -(-((i19 & i16) << 1));
        int i22 = (i20 ^ i21) + ((i21 & i20) << 1);
        int i23 = ~hashCode3;
        int i24 = ~i11;
        int i25 = i23 & i11;
        int i26 = ~((i23 & i24) | ((~i23) & i11) | i25);
        int i27 = ~identityHashCode;
        int i28 = i27 & i11;
        int i29 = ~(i28 | ((~i28) & (i27 | i11)));
        int i30 = ((~i29) & i26) | ((~i26) & i29);
        int i31 = i26 & i29;
        int i32 = ((i31 ^ i30) | (i31 & i30)) * (-280);
        int i33 = ((~i32) & i22) | ((~i22) & i32);
        int i34 = -(-((i22 & i32) << 1));
        int i35 = i24 & (i24 | i11);
        int i36 = i35 & hashCode3;
        int i37 = ~(((i35 | hashCode3) & (~i36)) | i36);
        int i38 = i27 & hashCode3;
        int i39 = (hashCode3 | i27) & (~i38);
        int i40 = (i39 ^ i38) | (i39 & i38);
        int i41 = ~i40;
        int i42 = (i40 | i41) & i41;
        int i43 = (i42 ^ i37) | (i37 & i42);
        int i44 = i11 ^ i23;
        int i45 = (i44 ^ i25) | (i25 & i44);
        int i46 = i45 & identityHashCode;
        int i47 = (i45 | identityHashCode) & (~i46);
        int i48 = ~((i47 ^ i46) | (i47 & i46));
        int i49 = i43 ^ i48;
        int i50 = i48 & i43;
        int i51 = ((((i33 | i34) << 1) - (i34 ^ i33)) - (~(-(-(((i50 ^ i49) | (i50 & i49)) * 140))))) - 1;
        int i52 = i51 * 31;
        java.lang.String str3 = setpicturelistener.values;
        if (str3 == null) {
            int i53 = IccPrivateKeyCrtComponentsJson;
            int i54 = i53 & 125;
            int i55 = (i53 | 125) & (~i54);
            int i56 = i54 << 1;
            int i57 = ((i55 | i56) << 1) - (i55 ^ i56);
            getProfileVersion = i57 % 128;
            if (i57 % 2 != 0) {
                i = 1;
            }
        } else {
            i = str3.hashCode();
            int i58 = IccPrivateKeyCrtComponentsJson;
            int i59 = i58 ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE;
            int i60 = ((i58 & com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) | i59) << 1;
            int i61 = -i59;
            getProfileVersion = (((i60 | i61) << 1) - (i60 ^ i61)) % 128;
        }
        int identityHashCode2 = java.lang.System.identityHashCode(setpicturelistener);
        int i62 = (i * com.knotapi.knot.utilities.Constants.ID_KROGER) + (i51 * 11470);
        int i63 = i ^ i52;
        int i64 = i & i52;
        int i65 = (i63 ^ i64) | (i63 & i64);
        int i66 = ~identityHashCode2;
        int i67 = i65 & i66;
        int i68 = (i65 | i66) & (~i67);
        int i69 = ((i68 ^ i67) | (i68 & i67)) * (-369);
        int i70 = ((((~i69) & i62) | ((~i62) & i69)) - (~(-(-((i69 & i62) << 1))))) - 1;
        int i71 = ~i;
        int i72 = (i71 | i) & i71;
        int i73 = ((~i66) & i72) | ((~i72) & i66);
        int i74 = i72 & i66;
        int i75 = ~((i74 ^ i73) | (i74 & i73));
        int i76 = i52 ^ i75;
        int i77 = i75 & i52;
        int i78 = -(-(((i77 ^ i76) | (i77 & i76)) * (-369)));
        int i79 = i70 ^ i78;
        int i80 = ((((i78 & i70) | i79) << 1) - (~(-i79))) - 1;
        int i81 = ~i52;
        int i82 = i81 & i;
        int i83 = ~(((i81 | i) & (~i82)) | i82);
        int i84 = i ^ identityHashCode2;
        int i85 = i & identityHashCode2;
        int i86 = ~((i85 ^ i84) | (i85 & i84));
        int i87 = (i86 & (~i83)) | ((~i86) & i83) | (i86 & i83);
        int i88 = i71 | i66;
        int i89 = ~((i52 ^ i88) | (i52 & i88));
        int i90 = ((~i89) & i87) | ((~i87) & i89);
        int i91 = i87 & i89;
        int i92 = -(-(((i91 ^ i90) | (i91 & i90)) * 369));
        int i93 = i80 & i92;
        int i94 = -(-((i92 ^ i80) | i93));
        int i95 = (i93 & i94) + (i94 | i93);
        int i96 = i95 * 31;
        int hashCode4 = setpicturelistener.valueOf.hashCode();
        int identityHashCode3 = java.lang.System.identityHashCode(setpicturelistener);
        int i97 = hashCode4 * 51;
        int i98 = i95 * (-1519);
        int i99 = i97 & i98;
        int i100 = ((i98 | i97) & (~i99)) + (i99 << 1);
        int i101 = ~identityHashCode3;
        int i102 = ~hashCode4;
        int i103 = (hashCode4 & i101) | (identityHashCode3 & i102);
        int i104 = hashCode4 & identityHashCode3;
        int i105 = -(-(((i103 ^ i104) | (i103 & i104)) * (-50)));
        int i106 = ((i100 ^ i105) | (i100 & i105)) << 1;
        int i107 = -((i100 & (~i105)) | ((~i100) & i105));
        int i108 = ((i106 | i107) << 1) - (i107 ^ i106);
        int i109 = ~i96;
        int i110 = i102 & i109;
        int i111 = i110 | ((i102 | i109) & (~i110));
        int i112 = (i111 & i101) | ((~i111) & identityHashCode3);
        int i113 = i111 & identityHashCode3;
        int i114 = ~((i113 ^ i112) | (i113 & i112));
        int i115 = (identityHashCode3 | i101) & i101;
        int i116 = i109 & i115;
        int i117 = (~i116) & (i109 | i115);
        int i118 = (i116 & i117) | (i117 ^ i116) | hashCode4;
        int i119 = ~i118;
        int i120 = (i118 | i119) & i119;
        int i121 = i114 ^ i120;
        int i122 = i114 & i120;
        int i123 = ((i122 ^ i121) | (i122 & i121)) * 50;
        int i124 = ((i108 ^ i123) | (i108 & i123)) << 1;
        int i125 = -(((~i123) & i108) | ((~i108) & i123));
        int i126 = i116 | i117;
        int i127 = ~i126;
        int i128 = (i126 | i127) & i127;
        int i129 = ~((i109 ^ hashCode4) | (i109 & hashCode4));
        int i130 = (i129 & (~i128)) | ((~i129) & i128) | (i129 & i128);
        int i131 = (i115 & i102) | ((~i115) & hashCode4);
        int i132 = hashCode4 & i115;
        int i133 = ~((i132 ^ i131) | (i132 & i131));
        int i134 = (((i124 & i125) + (i125 | i124)) - (~(-(~(((i130 ^ i133) | (i130 & i133)) * 50))))) - 2;
        int i135 = i134 * 31;
        int hashCode5 = setpicturelistener.RecordsJson.hashCode();
        int identityHashCode4 = java.lang.System.identityHashCode(setpicturelistener);
        int i136 = hashCode5 * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PROGRESS_VALUE;
        int i137 = -(-(i134 * (-6665)));
        int i138 = i136 & i137;
        int i139 = (i136 ^ i137) | i138;
        int i140 = (hashCode5 ^ identityHashCode4) | (hashCode5 & identityHashCode4);
        int i141 = (i138 ^ i139) + ((i139 & i138) << 1);
        int i142 = ~i140;
        int i143 = (i141 - (~(-(-((i142 & (i140 | i142)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PRODUCT_MONITOR_VALUE))))) - 1;
        int i144 = ~i135;
        int i145 = hashCode5 & i144;
        int i146 = (i144 | hashCode5) & (~i145);
        int i147 = ~identityHashCode4;
        int i148 = -(-((((identityHashCode4 | i147) & i147) | (i146 ^ i145) | (i146 & i145)) * (-216)));
        int i149 = ((~i148) & i143) | ((~i143) & i148);
        int i150 = -(-((i148 & i143) << 1));
        int i151 = ((~hashCode5) & i147) | ((~i147) & hashCode5);
        int i152 = hashCode5 & i147;
        int i153 = ~((i152 ^ i151) | (i151 & i152));
        int i154 = i135 & i153;
        int i155 = (i135 | i153) & (~i154);
        int i156 = (((i149 & i150) + (i150 | i149)) - (~(-(-(((i155 & i154) | (i155 ^ i154)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PRODUCT_MONITOR_VALUE))))) - 1;
        int i157 = IccPrivateKeyCrtComponentsJson;
        int i158 = ((i157 & (-96)) | ((~i157) & 95)) + ((i157 & 95) << 1);
        getProfileVersion = i158 % 128;
        if (i158 % 2 == 0) {
            return java.lang.Integer.valueOf(i156);
        }
        throw new java.lang.ArithmeticException();
    }

    private static /* synthetic */ java.lang.Object values(java.lang.Object[] objArr) {
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        com.payair.hce.setPictureListener setpicturelistener = (com.payair.hce.setPictureListener) objArr[0];
        java.lang.Boolean bool2 = java.lang.Boolean.TRUE;
        java.lang.Object obj = objArr[1];
        int i = getProfileVersion;
        int i2 = i & 101;
        int i3 = (i2 + ((i ^ 101) | i2)) % 128;
        IccPrivateKeyCrtComponentsJson = i3;
        if (setpicturelistener == obj) {
            int i4 = i3 | 13;
            getProfileVersion = ((i4 << 1) - (i4 & (~(i3 & 13)))) % 128;
            int i5 = i3 & 1;
            getProfileVersion = ((((i3 ^ 1) | i5) << 1) - ((~i5) & (i3 | 1))) % 128;
            return bool2;
        }
        if (!(obj instanceof com.payair.hce.setPictureListener)) {
            IccPrivateKeyCrtComponentsJson = ((i ^ 27) + ((i & 27) << 1)) % 128;
            return bool;
        }
        com.payair.hce.setPictureListener setpicturelistener2 = (com.payair.hce.setPictureListener) obj;
        if (!kotlin.jvm.internal.Intrinsics.areEqual(setpicturelistener.writeReplace, setpicturelistener2.writeReplace)) {
            int i6 = IccPrivateKeyCrtComponentsJson;
            int i7 = i6 & 117;
            getProfileVersion = (i7 + ((i6 ^ 117) | i7)) % 128;
            int i8 = (i6 ^ 12) + ((i6 & 12) << 1);
            getProfileVersion = ((~i8) + (i8 << 1)) % 128;
            return bool;
        }
        if (!kotlin.jvm.internal.Intrinsics.areEqual(setpicturelistener.AlternateContactlessPaymentDataJson, setpicturelistener2.AlternateContactlessPaymentDataJson)) {
            int i9 = IccPrivateKeyCrtComponentsJson;
            int i10 = (i9 & (-108)) | ((~i9) & 107);
            int i11 = -(-((i9 & 107) << 1));
            int i12 = ((i10 ^ i11) + ((i11 & i10) << 1)) % 128;
            getProfileVersion = i12;
            int i13 = i12 ^ 9;
            IccPrivateKeyCrtComponentsJson = (((((i12 & 9) | i13) << 1) - (~(-i13))) - 1) % 128;
            return bool;
        }
        if (!kotlin.jvm.internal.Intrinsics.areEqual(setpicturelistener.DigitizedCardProfile, setpicturelistener2.DigitizedCardProfile)) {
            int i14 = IccPrivateKeyCrtComponentsJson;
            int i15 = ~i14;
            getProfileVersion = (((i14 & (-46)) | (i15 & 45)) + ((i14 & 45) << 1)) % 128;
            int i16 = (i14 & (-70)) | (i15 & 69);
            int i17 = (i14 & 69) << 1;
            getProfileVersion = ((i16 & i17) + (i17 | i16)) % 128;
            return bool;
        }
        if (!kotlin.jvm.internal.Intrinsics.areEqual(setpicturelistener.values, setpicturelistener2.values)) {
            int i18 = IccPrivateKeyCrtComponentsJson;
            getProfileVersion = ((i18 & 37) + (i18 | 37)) % 128;
            int i19 = i18 & 21;
            int i20 = (i19 - (~(-(-((i18 ^ 21) | i19))))) - 1;
            getProfileVersion = i20 % 128;
            if (i20 % 2 == 0) {
                return bool;
            }
            throw new java.lang.ArithmeticException();
        }
        if (!kotlin.jvm.internal.Intrinsics.areEqual(setpicturelistener.valueOf, setpicturelistener2.valueOf)) {
            int i21 = IccPrivateKeyCrtComponentsJson;
            int i22 = i21 & 117;
            getProfileVersion = (i22 + ((i21 ^ 117) | i22)) % 128;
            int i23 = i21 & 9;
            int i24 = (i21 | 9) & (~i23);
            int i25 = -(-(i23 << 1));
            getProfileVersion = ((i24 & i25) + (i24 | i25)) % 128;
            return bool;
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(setpicturelistener.RecordsJson, setpicturelistener2.RecordsJson)) {
            int i26 = getProfileVersion;
            IccPrivateKeyCrtComponentsJson = (((i26 | 89) << 1) - (i26 ^ 89)) % 128;
            return bool2;
        }
        int i27 = IccPrivateKeyCrtComponentsJson;
        int i28 = i27 & com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE;
        int i29 = -(-(i27 | com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE));
        getProfileVersion = ((i28 & i29) + (i28 | i29)) % 128;
        int i30 = (((i27 | 100) << 1) - (i27 ^ 100)) - 1;
        getProfileVersion = i30 % 128;
        if (i30 % 2 == 0) {
            return bool;
        }
        throw new java.lang.ArithmeticException();
    }

    public final boolean equals(java.lang.Object p0) {
        return ((java.lang.Boolean) writeReplace(new java.lang.Object[]{this, p0}, 608114865, -608114860, java.lang.System.identityHashCode(this))).booleanValue();
    }

    public final int hashCode() {
        return ((java.lang.Integer) writeReplace(new java.lang.Object[]{this}, -1601601924, 1601601930, java.lang.System.identityHashCode(this))).intValue();
    }

    public final java.lang.String toString() {
        int i = IccPrivateKeyCrtComponentsJson + 6;
        int i2 = (~i) + (i << 1);
        getProfileVersion = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
        java.lang.String str = this.writeReplace;
        java.lang.String str2 = this.AlternateContactlessPaymentDataJson;
        java.lang.String str3 = this.DigitizedCardProfile;
        java.lang.String str4 = this.values;
        java.lang.String str5 = this.valueOf;
        java.lang.String str6 = this.RecordsJson;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("DasDeviceInfoDao(osType=");
        sb.append(str);
        sb.append(", osVersion=");
        sb.append(str2);
        sb.append(", deviceType=");
        sb.append(str3);
        sb.append(", deviceName=");
        sb.append(str4);
        sb.append(", productCode=");
        sb.append(str5);
        sb.append(", productVersion=");
        sb.append(str6);
        sb.append(")");
        return sb.toString();
    }

    public final java.lang.String IccPrivateKeyCrtComponentsJson() {
        return (java.lang.String) writeReplace(new java.lang.Object[]{this}, 1637103439, -1637103436, java.lang.System.identityHashCode(this));
    }

    public final java.lang.String DigitizedCardProfile() {
        return (java.lang.String) writeReplace(new java.lang.Object[]{this}, 544156081, -544156081, java.lang.System.identityHashCode(this));
    }

    public final java.lang.String values() {
        return (java.lang.String) writeReplace(new java.lang.Object[]{this}, -2122665590, 2122665597, java.lang.System.identityHashCode(this));
    }

    public final java.lang.String AlternateContactlessPaymentDataJson() {
        return (java.lang.String) writeReplace(new java.lang.Object[]{this}, 985958856, -985958852, java.lang.System.identityHashCode(this));
    }

    public final java.lang.String valueOf() {
        return (java.lang.String) writeReplace(new java.lang.Object[]{this}, -1024424545, 1024424546, java.lang.System.identityHashCode(this));
    }

    public final java.lang.String writeReplace() {
        return (java.lang.String) writeReplace(new java.lang.Object[]{this}, 1398744060, -1398744058, java.lang.System.identityHashCode(this));
    }
}
