package com.payair.hce;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\b\u0080\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\t\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0012\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u000eR\u001a\u0010\u0015\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\f"}, d2 = {"Lcom/payair/hce/setChoiceMode;", "", "", "p0", "", "p1", "<init>", "(Ljava/lang/String;I)V", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "()Ljava/lang/String;", "valueOf", "Ljava/lang/String;", "values", "writeReplace", "AlternateContactlessPaymentDataJson", com.visa.cbp.getEncExpo.warmup, "DigitizedCardProfile"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class setChoiceMode {
    private static int DigitizedCardProfile = 0;
    private static int values = 1;

    /* renamed from: AlternateContactlessPaymentDataJson, reason: from kotlin metadata */
    @com.payair.hce.SdkCoreContactlessPaymentDataImpl(valueOf = "sc")
    private final int DigitizedCardProfile;

    /* renamed from: valueOf, reason: from kotlin metadata */
    @com.payair.hce.SdkCoreContactlessPaymentDataImpl(valueOf = com.visa.cbp.getTicketMetaData$6672$values.values.ReplenishRequest)
    private final java.lang.String writeReplace;

    public static /* synthetic */ java.lang.Object DigitizedCardProfile(java.lang.Object[] objArr, int i, int i2, int i3) {
        int i4 = ~i;
        int i5 = ~i3;
        int i6 = ~((~i2) | i3);
        int i7 = (i * (-574)) + (i2 * (-574)) + (((~(i4 | i5)) | i6) * 1150) + (((~(i2 | i5)) | i6) * (-575)) + (((~(i | i5)) | (~(i4 | i3))) * 575);
        if (i7 != 1) {
            return i7 != 2 ? i7 != 3 ? AlternateContactlessPaymentDataJson(objArr) : valueOf(objArr) : values(objArr);
        }
        com.payair.hce.setChoiceMode setchoicemode = (com.payair.hce.setChoiceMode) objArr[0];
        int i8 = values;
        int i9 = i8 & 85;
        DigitizedCardProfile = ((i9 - (~(-(-((i8 ^ 85) | i9))))) - 1) % 128;
        int hashCode = setchoicemode.writeReplace.hashCode();
        int i10 = hashCode * 31;
        int hashCode2 = java.lang.Integer.hashCode(setchoicemode.DigitizedCardProfile);
        int identityHashCode = java.lang.System.identityHashCode(setchoicemode);
        int i11 = hashCode2 * 503;
        int i12 = -(-(hashCode * 15593));
        int i13 = ((i11 | i12) << 1) - (((~i12) & i11) | ((~i11) & i12));
        int i14 = hashCode2 & i10;
        int i15 = (~i14) & (hashCode2 | i10);
        int i16 = (i15 ^ i14) | (i15 & i14);
        int i17 = i16 * (-502);
        int i18 = ((i13 & i17) - (~(i13 | i17))) - 1;
        int i19 = ~hashCode2;
        int i20 = (i19 | hashCode2) & i19;
        int i21 = ~i10;
        int i22 = i20 ^ i21;
        int i23 = i20 & i21;
        int i24 = (i23 ^ i22) | (i23 & i22);
        int i25 = ~i24;
        int i26 = (i24 | i25) & i25;
        int i27 = ~identityHashCode;
        int i28 = ~((i19 & i27) | (i19 ^ i27));
        int i29 = hashCode2 ^ i10;
        int i30 = (i14 ^ i29) | (i14 & i29);
        int i31 = i30 & identityHashCode;
        int i32 = (i30 | identityHashCode) & (~i31);
        int i33 = (i32 ^ i31) | (i32 & i31);
        int i34 = ~i33;
        int i35 = -(-((((i33 | i34) & i34) | (i28 & i26) | (i26 ^ i28)) * (-502)));
        int i36 = i18 & i35;
        int i37 = i36 + ((i35 ^ i18) | i36);
        int i38 = (i27 | identityHashCode) & i27;
        int i39 = i19 & i38;
        int i40 = ((i38 | i19) & (~i39)) | i39;
        int i41 = ~((i40 ^ i10) | (i40 & i10));
        int i42 = i16 & identityHashCode;
        int i43 = (identityHashCode | i16) & (~i42);
        int i44 = ~((i43 ^ i42) | (i43 & i42));
        int i45 = i41 & i44;
        int i46 = (i44 | i41) & (~i45);
        int i47 = -(-(((i46 ^ i45) | (i46 & i45)) * 502));
        int i48 = i37 & i47;
        int i49 = DigitizedCardProfile;
        values = ((((i49 | 87) << 1) - (~(-((i49 & (-88)) | ((~i49) & 87))))) - 1) % 128;
        return java.lang.Integer.valueOf(i48 + ((i47 ^ i37) | i48));
    }

    public setChoiceMode(java.lang.String str, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.writeReplace = str;
        this.DigitizedCardProfile = i;
    }

    private static /* synthetic */ java.lang.Object valueOf(java.lang.Object[] objArr) {
        com.payair.hce.setChoiceMode setchoicemode = (com.payair.hce.setChoiceMode) objArr[0];
        int i = values;
        int i2 = (i & 77) + (i | 77);
        int i3 = i2 % 128;
        DigitizedCardProfile = i3;
        java.lang.String str = setchoicemode.writeReplace;
        if (i2 % 2 != 0) {
            throw null;
        }
        values = ((i3 & 47) + (i3 | 47)) % 128;
        return str;
    }

    private static /* synthetic */ java.lang.Object values(java.lang.Object[] objArr) {
        com.payair.hce.setChoiceMode setchoicemode = (com.payair.hce.setChoiceMode) objArr[0];
        int i = DigitizedCardProfile;
        int i2 = i ^ 39;
        int i3 = (((i & 39) | i2) << 1) - i2;
        values = i3 % 128;
        int i4 = setchoicemode.DigitizedCardProfile;
        if (i3 % 2 != 0) {
            return java.lang.Integer.valueOf(i4);
        }
        throw null;
    }

    private static /* synthetic */ java.lang.Object AlternateContactlessPaymentDataJson(java.lang.Object[] objArr) {
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        com.payair.hce.setChoiceMode setchoicemode = (com.payair.hce.setChoiceMode) objArr[0];
        java.lang.Boolean bool2 = java.lang.Boolean.TRUE;
        java.lang.Object obj = objArr[1];
        int i = values;
        int i2 = i + 71;
        DigitizedCardProfile = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
        if (setchoicemode == obj) {
            DigitizedCardProfile = ((i & 125) + (i | 125)) % 128;
            return bool2;
        }
        if (!(obj instanceof com.payair.hce.setChoiceMode)) {
            int i3 = i | 115;
            int i4 = i3 << 1;
            int i5 = -(i3 & (~(i & 115)));
            int i6 = (i4 & i5) + (i5 | i4);
            DigitizedCardProfile = i6 % 128;
            boolean z = i6 % 2 != 0;
            int i7 = i & 55;
            int i8 = (~i7) & (i | 55);
            int i9 = -(-(i7 << 1));
            int i10 = ((i8 | i9) << 1) - (i9 ^ i8);
            DigitizedCardProfile = i10 % 128;
            if (i10 % 2 == 0) {
                return java.lang.Boolean.valueOf(z);
            }
            throw new java.lang.ArithmeticException();
        }
        com.payair.hce.setChoiceMode setchoicemode2 = (com.payair.hce.setChoiceMode) obj;
        if (!kotlin.jvm.internal.Intrinsics.areEqual(setchoicemode.writeReplace, setchoicemode2.writeReplace)) {
            int i11 = DigitizedCardProfile;
            int i12 = i11 & 21;
            int i13 = (((((i11 ^ 21) | i12) << 1) - (~(-((i11 | 21) & (~i12))))) - 1) % 128;
            values = i13;
            int i14 = i13 + 9;
            DigitizedCardProfile = i14 % 128;
            if (i14 % 2 == 0) {
                return bool;
            }
            throw null;
        }
        if (setchoicemode.DigitizedCardProfile == setchoicemode2.DigitizedCardProfile) {
            int i15 = DigitizedCardProfile;
            int i16 = i15 & 57;
            values = ((((i15 ^ 57) | i16) << 1) - ((i15 | 57) & (~i16))) % 128;
            return bool2;
        }
        int i17 = DigitizedCardProfile;
        int i18 = i17 & 21;
        int i19 = -(-((i17 ^ 21) | i18));
        int i20 = ((i18 ^ i19) + ((i19 & i18) << 1)) % 128;
        values = i20;
        int i21 = (i20 | 47) << 1;
        int i22 = -(((~i20) & 47) | (i20 & (-48)));
        DigitizedCardProfile = (((i21 | i22) << 1) - (i21 ^ i22)) % 128;
        return bool;
    }

    public final boolean equals(java.lang.Object p0) {
        return ((java.lang.Boolean) DigitizedCardProfile(new java.lang.Object[]{this, p0}, 450422031, -450422031, java.lang.System.identityHashCode(this))).booleanValue();
    }

    public final int hashCode() {
        return ((java.lang.Integer) DigitizedCardProfile(new java.lang.Object[]{this}, 648601579, -648601578, java.lang.System.identityHashCode(this))).intValue();
    }

    public final java.lang.String toString() {
        int i = values;
        DigitizedCardProfile = (((i | 45) << 1) - (i ^ 45)) % 128;
        java.lang.String str = this.writeReplace;
        int i2 = this.DigitizedCardProfile;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ReplenishmentAckRequest(api=");
        sb.append(str);
        sb.append(", sc=");
        sb.append(i2);
        sb.append(")");
        java.lang.String obj = sb.toString();
        int i3 = values + 61;
        DigitizedCardProfile = i3 % 128;
        if (i3 % 2 == 0) {
            return obj;
        }
        throw null;
    }

    public final int AlternateContactlessPaymentDataJson() {
        return ((java.lang.Integer) DigitizedCardProfile(new java.lang.Object[]{this}, 96830768, -96830766, java.lang.System.identityHashCode(this))).intValue();
    }

    public final java.lang.String values() {
        return (java.lang.String) DigitizedCardProfile(new java.lang.Object[]{this}, 1993825334, -1993825331, java.lang.System.identityHashCode(this));
    }
}
