package com.payair.hce;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001J\u001a\u0010\u0004\u001a\u00020\u00032\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u000f\u001a\u00020\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000bR\u001a\u0010\u000e\u001a\u00020\u00108\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0012\u001a\u00020\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\r\u001a\u0004\b\u0014\u0010\u000bR\u001a\u0010\u0014\u001a\u00020\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\r\u001a\u0004\b\u000f\u0010\u000b"}, d2 = {"Lcom/payair/hce/setRendererPriorityPolicy;", "", "p0", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "DigitizedCardProfile", "Ljava/lang/String;", "values", "valueOf", "Lcom/payair/hce/setDownloadListener;", "Lcom/payair/hce/setDownloadListener;", "writeReplace", "()Lcom/payair/hce/setDownloadListener;", "AlternateContactlessPaymentDataJson"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class setRendererPriorityPolicy {
    private static int SdkCoreAlternateContactlessPaymentDataImpl = 1;
    private static int values;

    /* renamed from: AlternateContactlessPaymentDataJson, reason: from kotlin metadata */
    @com.payair.hce.SdkCoreContactlessPaymentDataImpl(valueOf = "exponent")
    private final java.lang.String writeReplace;

    /* renamed from: DigitizedCardProfile, reason: from kotlin metadata */
    @com.payair.hce.SdkCoreContactlessPaymentDataImpl(valueOf = "certificate")
    private final java.lang.String valueOf;

    /* renamed from: valueOf, reason: from kotlin metadata */
    @com.payair.hce.SdkCoreContactlessPaymentDataImpl(valueOf = "expirationDate")
    private final com.payair.hce.setDownloadListener values;

    /* renamed from: writeReplace, reason: from kotlin metadata */
    @com.payair.hce.SdkCoreContactlessPaymentDataImpl(valueOf = "remainder")
    private final java.lang.String AlternateContactlessPaymentDataJson;

    public static /* synthetic */ java.lang.Object writeReplace(java.lang.Object[] objArr, int i, int i2, int i3) {
        int i4 = ~i;
        int i5 = ~i2;
        int i6 = (i * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CARD_DARK_APPEARANCE_VALUE) + (i2 * (-282)) + (((~(i2 | i4)) | (~(i4 | i3))) * (-283)) + ((~(i | i5)) * 283) + ((~(i4 | i5 | i3)) * 283);
        if (i6 == 1) {
            return valueOf(objArr);
        }
        if (i6 == 2) {
            com.payair.hce.setRendererPriorityPolicy setrendererprioritypolicy = (com.payair.hce.setRendererPriorityPolicy) objArr[0];
            int i7 = values;
            SdkCoreAlternateContactlessPaymentDataImpl = (i7 + 87) % 128;
            java.lang.String str = setrendererprioritypolicy.AlternateContactlessPaymentDataJson;
            int i8 = (i7 & (-74)) | ((~i7) & 73);
            int i9 = -(-((i7 & 73) << 1));
            SdkCoreAlternateContactlessPaymentDataImpl = ((i8 & i9) + (i9 | i8)) % 128;
            return str;
        }
        if (i6 == 3) {
            return AlternateContactlessPaymentDataJson(objArr);
        }
        if (i6 == 4) {
            return DigitizedCardProfile(objArr);
        }
        if (i6 != 5) {
            return writeReplace(objArr);
        }
        com.payair.hce.setRendererPriorityPolicy setrendererprioritypolicy2 = (com.payair.hce.setRendererPriorityPolicy) objArr[0];
        SdkCoreAlternateContactlessPaymentDataImpl = ((-2) - (~(values + 60))) % 128;
        int hashCode = setrendererprioritypolicy2.valueOf.hashCode();
        int i10 = hashCode * 31;
        int hashCode2 = setrendererprioritypolicy2.writeReplace.hashCode();
        int identityHashCode = java.lang.System.identityHashCode(setrendererprioritypolicy2);
        int i11 = hashCode2 * (-300);
        int i12 = hashCode * 9362;
        int i13 = ((~i12) & i11) | ((~i11) & i12);
        int i14 = (i12 & i11) << 1;
        int i15 = (i13 & i14) + (i14 | i13);
        int i16 = ~i10;
        int i17 = ~hashCode2;
        int i18 = (hashCode2 & i16) | (i10 & i17);
        int i19 = i10 & hashCode2;
        int i20 = (i19 ^ i18) | (i18 & i19);
        int i21 = ~identityHashCode;
        int i22 = (i20 & i21) | ((~i20) & identityHashCode);
        int i23 = i20 & identityHashCode;
        int i24 = -(-((~((i23 ^ i22) | (i23 & i22))) * (-301)));
        int i25 = i15 | i24;
        int i26 = ((i25 << 1) - (~(-((~(i24 & i15)) & i25)))) - 1;
        int i27 = ~((i16 & identityHashCode) | (i16 ^ identityHashCode));
        int i28 = i21 & i17;
        int i29 = ((~i21) & hashCode2) | i28;
        int i30 = hashCode2 & i21;
        int i31 = ~((i30 ^ i29) | (i29 & i30));
        int i32 = i27 & i31;
        int i33 = -(-((((i27 | i31) & (~i32)) | i32) * (-301)));
        int i34 = i26 & i33;
        int i35 = ((i33 | i26) & (~i34)) + (i34 << 1);
        int i36 = ((~i17) & identityHashCode) | i28;
        int i37 = identityHashCode & i17;
        int i38 = ~((i36 ^ i37) | (i37 & i36));
        int i39 = -(-(((i16 ^ i38) | (i16 & i38)) * 301));
        int i40 = ((i35 | i39) << 1) - (i39 ^ i35);
        int i41 = i40 * 31;
        int hashCode3 = setrendererprioritypolicy2.AlternateContactlessPaymentDataJson.hashCode();
        int identityHashCode2 = java.lang.System.identityHashCode(setrendererprioritypolicy2);
        int i42 = hashCode3 * (-661);
        int i43 = -(-(i40 * (-20491)));
        int i44 = ~identityHashCode2;
        int i45 = ~i41;
        int i46 = ~hashCode3;
        int i47 = ~(i46 | i45);
        int i48 = ((~i47) & i44) | ((~i44) & i47);
        int i49 = i47 & i44;
        int i50 = (((i42 | i43) << 1) - (i43 ^ i42)) + (((i49 & i48) | (i48 ^ i49)) * 1324);
        int i51 = ~((hashCode3 ^ identityHashCode2) | (hashCode3 & identityHashCode2));
        int i52 = (i44 & i41) | (i45 & identityHashCode2);
        int i53 = identityHashCode2 & i41;
        int i54 = ~((i53 ^ i52) | (i53 & i52));
        int i55 = ((~i54) & i51) | ((~i51) & i54);
        int i56 = i51 & i54;
        int i57 = ((i56 ^ i55) | (i56 & i55)) * (-1324);
        int i58 = (i46 | hashCode3) & i46;
        int i59 = ~((i41 ^ i58) | (i58 & i41));
        int i60 = i45 & hashCode3;
        int i61 = (hashCode3 | i45) & (~i60);
        int i62 = (i61 ^ i60) | (i61 & i60);
        int i63 = ~i62;
        int i64 = (i62 | i63) & i63;
        int i65 = i59 & i64;
        int i66 = (i59 | i64) & (~i65);
        int i67 = (((i50 & i57) + (i57 | i50)) - (~(((i66 ^ i65) | (i66 & i65)) * 662))) - 1;
        int i68 = i67 * 31;
        int hashCode4 = setrendererprioritypolicy2.values.hashCode();
        int identityHashCode3 = java.lang.System.identityHashCode(setrendererprioritypolicy2);
        int i69 = hashCode4 * 51;
        int i70 = -(-(i67 * (-1519)));
        int i71 = (i69 ^ i70) + ((i70 & i69) << 1);
        int i72 = hashCode4 ^ identityHashCode3;
        int i73 = hashCode4 & identityHashCode3;
        int i74 = -(-(((i72 ^ i73) | (i72 & i73)) * (-50)));
        int i75 = i71 & i74;
        int i76 = (i74 ^ i71) | i75;
        int i77 = (i75 ^ i76) + ((i76 & i75) << 1);
        int i78 = ~hashCode4;
        int i79 = (i78 | hashCode4) & i78;
        int i80 = ~i68;
        int i81 = ~i80;
        int i82 = (i81 & i79) | ((~i79) & i80);
        int i83 = i79 & i80;
        int i84 = (i83 ^ i82) | (i83 & i82);
        int i85 = (i84 ^ identityHashCode3) | (i84 & identityHashCode3);
        int i86 = ~i85;
        int i87 = (i85 | i86) & i86;
        int i88 = (i68 | i80) & i80;
        int i89 = ~identityHashCode3;
        int i90 = i88 ^ i89;
        int i91 = i88 & i89;
        int i92 = (i91 ^ i90) | (i91 & i90) | hashCode4;
        int i93 = ~i92;
        int i94 = (i92 | i93) & i93;
        int i95 = i87 & i94;
        int i96 = -(-((((i94 | i87) & (~i95)) | i95) * 50));
        int i97 = i77 & i96;
        int i98 = (i97 - (~((i96 ^ i77) | i97))) - 1;
        int i99 = i80 ^ i89;
        int i100 = i80 & i89;
        int i101 = ~((i99 ^ i100) | (i99 & i100));
        int i102 = (i78 & i80) | (hashCode4 & i81);
        int i103 = i80 & hashCode4;
        int i104 = ~((i102 ^ i103) | (i102 & i103));
        int i105 = (i101 ^ i104) | (i101 & i104);
        int i106 = i89 & hashCode4;
        int i107 = (i89 | hashCode4) & (~i106);
        int i108 = (i107 ^ i106) | (i107 & i106);
        int i109 = ~i108;
        int i110 = (i108 | i109) & i109;
        int i111 = -(~(-(-(((i110 ^ i105) | (i110 & i105)) * 50))));
        int i112 = values;
        SdkCoreAlternateContactlessPaymentDataImpl = ((((i112 ^ 45) | (i112 & 45)) << 1) - ((i112 & (-46)) | ((~i112) & 45))) % 128;
        return java.lang.Integer.valueOf(((i98 & i111) + (i111 | i98)) - 1);
    }

    private static /* synthetic */ java.lang.Object DigitizedCardProfile(java.lang.Object[] objArr) {
        com.payair.hce.setRendererPriorityPolicy setrendererprioritypolicy = (com.payair.hce.setRendererPriorityPolicy) objArr[0];
        int i = values + 73;
        SdkCoreAlternateContactlessPaymentDataImpl = i % 128;
        java.lang.String str = setrendererprioritypolicy.valueOf;
        if (i % 2 != 0) {
            return str;
        }
        throw new java.lang.ArithmeticException();
    }

    private static /* synthetic */ java.lang.Object valueOf(java.lang.Object[] objArr) {
        com.payair.hce.setRendererPriorityPolicy setrendererprioritypolicy = (com.payair.hce.setRendererPriorityPolicy) objArr[0];
        int i = values;
        int i2 = i & com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE;
        int i3 = (i ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) | i2;
        int i4 = ((i2 | i3) << 1) - (i3 ^ i2);
        SdkCoreAlternateContactlessPaymentDataImpl = i4 % 128;
        java.lang.String str = setrendererprioritypolicy.writeReplace;
        if (i4 % 2 != 0) {
            return str;
        }
        throw null;
    }

    private static /* synthetic */ java.lang.Object writeReplace(java.lang.Object[] objArr) {
        com.payair.hce.setRendererPriorityPolicy setrendererprioritypolicy = (com.payair.hce.setRendererPriorityPolicy) objArr[0];
        int i = values;
        int i2 = ((i ^ 31) | (i & 31)) << 1;
        int i3 = -((i & (-32)) | ((~i) & 31));
        int i4 = ((i2 | i3) << 1) - (i3 ^ i2);
        SdkCoreAlternateContactlessPaymentDataImpl = i4 % 128;
        com.payair.hce.setDownloadListener setdownloadlistener = setrendererprioritypolicy.values;
        if (i4 % 2 != 0) {
            return setdownloadlistener;
        }
        throw null;
    }

    private static /* synthetic */ java.lang.Object AlternateContactlessPaymentDataJson(java.lang.Object[] objArr) {
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        com.payair.hce.setRendererPriorityPolicy setrendererprioritypolicy = (com.payair.hce.setRendererPriorityPolicy) objArr[0];
        java.lang.Boolean bool2 = java.lang.Boolean.TRUE;
        java.lang.Object obj = objArr[1];
        int i = values;
        int i2 = i & 61;
        int i3 = ((i ^ 61) | i2) << 1;
        int i4 = -((i | 61) & (~i2));
        int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
        int i6 = i5 % 128;
        SdkCoreAlternateContactlessPaymentDataImpl = i6;
        if (i5 % 2 == 0) {
            throw null;
        }
        if (setrendererprioritypolicy == obj) {
            int i7 = (-2) - (~(((i6 | 88) << 1) - (i6 ^ 88)));
            values = i7 % 128;
            if (i7 % 2 == 0) {
                return bool2;
            }
        } else {
            if (!(obj instanceof com.payair.hce.setRendererPriorityPolicy)) {
                int i8 = i6 & 89;
                int i9 = -(-(i6 | 89));
                int i10 = (((i8 | i9) << 1) - (i8 ^ i9)) % 128;
                values = i10;
                int i11 = i10 & 57;
                int i12 = (i11 - (~((i10 ^ 57) | i11))) - 1;
                SdkCoreAlternateContactlessPaymentDataImpl = i12 % 128;
                if (i12 % 2 != 0) {
                    return bool;
                }
                throw null;
            }
            com.payair.hce.setRendererPriorityPolicy setrendererprioritypolicy2 = (com.payair.hce.setRendererPriorityPolicy) obj;
            if (!kotlin.jvm.internal.Intrinsics.areEqual(setrendererprioritypolicy.valueOf, setrendererprioritypolicy2.valueOf)) {
                int i13 = values;
                int i14 = i13 & 55;
                int i15 = ((i13 ^ 55) | i14) << 1;
                int i16 = -((~i14) & (i13 | 55));
                int i17 = ((i15 | i16) << 1) - (i16 ^ i15);
                SdkCoreAlternateContactlessPaymentDataImpl = i17 % 128;
                boolean z = i17 % 2 == 0;
                int i18 = i13 & 25;
                int i19 = -(-(i13 | 25));
                SdkCoreAlternateContactlessPaymentDataImpl = ((i18 ^ i19) + ((i19 & i18) << 1)) % 128;
                return java.lang.Boolean.valueOf(z);
            }
            if (!kotlin.jvm.internal.Intrinsics.areEqual(setrendererprioritypolicy.writeReplace, setrendererprioritypolicy2.writeReplace)) {
                int i20 = SdkCoreAlternateContactlessPaymentDataImpl;
                int i21 = i20 ^ 105;
                int i22 = (i20 & 105) << 1;
                int i23 = ((i21 & i22) + (i22 | i21)) % 128;
                values = i23;
                int i24 = (-2) - (~(((i23 | 106) << 1) - (i23 ^ 106)));
                SdkCoreAlternateContactlessPaymentDataImpl = i24 % 128;
                if (i24 % 2 != 0) {
                    return bool;
                }
                throw null;
            }
            if (!kotlin.jvm.internal.Intrinsics.areEqual(setrendererprioritypolicy.AlternateContactlessPaymentDataJson, setrendererprioritypolicy2.AlternateContactlessPaymentDataJson)) {
                int i25 = values;
                SdkCoreAlternateContactlessPaymentDataImpl = (i25 + 67) % 128;
                int i26 = i25 + 98;
                int i27 = (~i26) + (i26 << 1);
                SdkCoreAlternateContactlessPaymentDataImpl = i27 % 128;
                if (i27 % 2 != 0) {
                    return bool;
                }
                throw null;
            }
            if (!kotlin.jvm.internal.Intrinsics.areEqual(setrendererprioritypolicy.values, setrendererprioritypolicy2.values)) {
                int i28 = SdkCoreAlternateContactlessPaymentDataImpl;
                int i29 = i28 & 81;
                int i30 = -(-((i28 ^ 81) | i29));
                values = ((i29 ^ i30) + ((i29 & i30) << 1)) % 128;
                int i31 = i28 & 101;
                values = ((((i28 | 101) & (~i31)) - (~(-(-(i31 << 1))))) - 1) % 128;
                return bool;
            }
            int i32 = values;
            int i33 = (i32 ^ 111) + ((i32 & 111) << 1);
            SdkCoreAlternateContactlessPaymentDataImpl = i33 % 128;
            if (i33 % 2 != 0) {
                return bool2;
            }
        }
        throw new java.lang.ArithmeticException();
    }

    public final boolean equals(java.lang.Object p0) {
        return ((java.lang.Boolean) writeReplace(new java.lang.Object[]{this, p0}, 937329760, -937329757, java.lang.System.identityHashCode(this))).booleanValue();
    }

    public final int hashCode() {
        return ((java.lang.Integer) writeReplace(new java.lang.Object[]{this}, 1425486620, -1425486615, java.lang.System.identityHashCode(this))).intValue();
    }

    public final java.lang.String toString() {
        SdkCoreAlternateContactlessPaymentDataImpl = (values + 83) % 128;
        java.lang.String str = this.valueOf;
        java.lang.String str2 = this.writeReplace;
        java.lang.String str3 = this.AlternateContactlessPaymentDataJson;
        com.payair.hce.setDownloadListener setdownloadlistener = this.values;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("IccPubKeyCert(certificate=");
        sb.append(str);
        sb.append(", exponent=");
        sb.append(str2);
        sb.append(", remainder=");
        sb.append(str3);
        sb.append(", expirationDate=");
        sb.append(setdownloadlistener);
        sb.append(")");
        java.lang.String obj = sb.toString();
        int i = values;
        int i2 = i & 17;
        int i3 = -(-(i | 17));
        int i4 = (i2 ^ i3) + ((i3 & i2) << 1);
        SdkCoreAlternateContactlessPaymentDataImpl = i4 % 128;
        if (i4 % 2 != 0) {
            return obj;
        }
        throw new java.lang.ArithmeticException();
    }

    public final com.payair.hce.setDownloadListener writeReplace() {
        return (com.payair.hce.setDownloadListener) writeReplace(new java.lang.Object[]{this}, -1504535460, 1504535460, java.lang.System.identityHashCode(this));
    }

    public final java.lang.String valueOf() {
        return (java.lang.String) writeReplace(new java.lang.Object[]{this}, -673294086, 673294088, java.lang.System.identityHashCode(this));
    }

    public final java.lang.String AlternateContactlessPaymentDataJson() {
        return (java.lang.String) writeReplace(new java.lang.Object[]{this}, -2103270542, 2103270543, java.lang.System.identityHashCode(this));
    }

    public final java.lang.String values() {
        return (java.lang.String) writeReplace(new java.lang.Object[]{this}, 868347826, -868347822, java.lang.System.identityHashCode(this));
    }
}
