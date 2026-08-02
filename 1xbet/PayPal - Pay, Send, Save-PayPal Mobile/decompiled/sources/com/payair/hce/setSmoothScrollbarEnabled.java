package com.payair.hce;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0080\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0011R\u001a\u0010\u0015\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0013\u001a\u0004\b\u0015\u0010\u0011R\u001a\u0010\u0014\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u000fR \u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0018\u001a\u0004\b\u0012\u0010\u0019"}, d2 = {"Lcom/payair/hce/setSmoothScrollbarEnabled;", "", "", "p0", "p1", "", "p2", "", "p3", "<init>", "(Ljava/lang/String;Ljava/lang/String;ILjava/util/List;)V", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "()Ljava/lang/String;", "valueOf", "Ljava/lang/String;", "writeReplace", "DigitizedCardProfile", "AlternateContactlessPaymentDataJson", com.visa.cbp.getEncExpo.warmup, "Ljava/util/List;", "()Ljava/util/List;"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class setSmoothScrollbarEnabled {
    private static int IccPrivateKeyCrtComponentsJson = 1;
    private static int values;

    /* renamed from: AlternateContactlessPaymentDataJson, reason: from kotlin metadata */
    @com.payair.hce.SdkCoreContactlessPaymentDataImpl(valueOf = "sc")
    private final int writeReplace;

    /* renamed from: DigitizedCardProfile, reason: from kotlin metadata */
    @com.payair.hce.SdkCoreContactlessPaymentDataImpl(valueOf = "tvl")
    private final java.util.List<java.lang.String> AlternateContactlessPaymentDataJson;

    @com.payair.hce.SdkCoreContactlessPaymentDataImpl(valueOf = com.visa.cbp.getTicketMetaData$6672$values.values.ReplenishRequest)
    private final java.lang.String valueOf;

    /* renamed from: writeReplace, reason: from kotlin metadata */
    @com.payair.hce.SdkCoreContactlessPaymentDataImpl(valueOf = "mac")
    private final java.lang.String DigitizedCardProfile;

    public static /* synthetic */ java.lang.Object writeReplace(java.lang.Object[] objArr, int i, int i2, int i3) {
        int i4 = ~i2;
        int i5 = i4 | i;
        int i6 = (i * (-129)) + (i2 * 131) + ((~(i4 | (~i3) | i)) * 130) + ((~i5) * (-260)) + (((~((~i) | i2)) | (~(i5 | i3))) * 130);
        if (i6 != 1) {
            return i6 != 2 ? i6 != 3 ? i6 != 4 ? i6 != 5 ? writeReplace(objArr) : valueOf(objArr) : DigitizedCardProfile(objArr) : values(objArr) : AlternateContactlessPaymentDataJson(objArr);
        }
        com.payair.hce.setSmoothScrollbarEnabled setsmoothscrollbarenabled = (com.payair.hce.setSmoothScrollbarEnabled) objArr[0];
        int i7 = values;
        int i8 = ((((i7 | 60) << 1) - (i7 ^ 60)) - 1) % 128;
        IccPrivateKeyCrtComponentsJson = i8;
        java.lang.String str = setsmoothscrollbarenabled.DigitizedCardProfile;
        int i9 = i8 & 95;
        int i10 = -(-(i8 | 95));
        values = ((i9 ^ i10) + ((i9 & i10) << 1)) % 128;
        return str;
    }

    public setSmoothScrollbarEnabled(java.lang.String str, java.lang.String str2, int i, java.util.List<java.lang.String> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        this.DigitizedCardProfile = str;
        this.valueOf = str2;
        this.writeReplace = i;
        this.AlternateContactlessPaymentDataJson = list;
    }

    private static /* synthetic */ java.lang.Object AlternateContactlessPaymentDataJson(java.lang.Object[] objArr) {
        com.payair.hce.setSmoothScrollbarEnabled setsmoothscrollbarenabled = (com.payair.hce.setSmoothScrollbarEnabled) objArr[0];
        int i = IccPrivateKeyCrtComponentsJson;
        values = (((i | 53) << 1) - (i ^ 53)) % 128;
        java.lang.String str = setsmoothscrollbarenabled.valueOf;
        int i2 = i + 36;
        int i3 = (~i2) + (i2 << 1);
        values = i3 % 128;
        if (i3 % 2 == 0) {
            return str;
        }
        throw null;
    }

    private static /* synthetic */ java.lang.Object writeReplace(java.lang.Object[] objArr) {
        com.payair.hce.setSmoothScrollbarEnabled setsmoothscrollbarenabled = (com.payair.hce.setSmoothScrollbarEnabled) objArr[0];
        int i = IccPrivateKeyCrtComponentsJson;
        int i2 = ((i | 85) << 1) - (i ^ 85);
        values = i2 % 128;
        int i3 = setsmoothscrollbarenabled.writeReplace;
        if (i2 % 2 != 0) {
            throw null;
        }
        int i4 = i & 75;
        int i5 = ((i ^ 75) | i4) << 1;
        int i6 = -((i | 75) & (~i4));
        values = (((i5 | i6) << 1) - (i6 ^ i5)) % 128;
        return java.lang.Integer.valueOf(i3);
    }

    private static /* synthetic */ java.lang.Object DigitizedCardProfile(java.lang.Object[] objArr) {
        com.payair.hce.setSmoothScrollbarEnabled setsmoothscrollbarenabled = (com.payair.hce.setSmoothScrollbarEnabled) objArr[0];
        int i = values;
        int i2 = i & 95;
        int i3 = (((i | 95) & (~i2)) - (~(i2 << 1))) - 1;
        int i4 = i3 % 128;
        IccPrivateKeyCrtComponentsJson = i4;
        java.util.List<java.lang.String> list = setsmoothscrollbarenabled.AlternateContactlessPaymentDataJson;
        if (i3 % 2 == 0) {
            throw null;
        }
        int i5 = i4 & 17;
        int i6 = -(-((i4 ^ 17) | i5));
        values = ((i5 ^ i6) + ((i5 & i6) << 1)) % 128;
        return list;
    }

    private static /* synthetic */ java.lang.Object valueOf(java.lang.Object[] objArr) {
        com.payair.hce.setSmoothScrollbarEnabled setsmoothscrollbarenabled = (com.payair.hce.setSmoothScrollbarEnabled) objArr[0];
        int i = values;
        IccPrivateKeyCrtComponentsJson = (((i & (-84)) | ((~i) & 83)) + ((i & 83) << 1)) % 128;
        int hashCode = setsmoothscrollbarenabled.DigitizedCardProfile.hashCode();
        int i2 = hashCode * 31;
        int hashCode2 = setsmoothscrollbarenabled.valueOf.hashCode();
        int identityHashCode = java.lang.System.identityHashCode(setsmoothscrollbarenabled);
        int i3 = hashCode2 * (-129);
        int i4 = hashCode * 4061;
        int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
        int i6 = ~i2;
        int i7 = (i6 | i2) & i6;
        int i8 = ~identityHashCode;
        int i9 = ~i7;
        int i10 = (i8 & i9) | ((~i8) & i7) | (i8 & i7);
        int i11 = ~hashCode2;
        int i12 = (i10 & i11) | ((~i10) & hashCode2);
        int i13 = i10 & hashCode2;
        int i14 = (~((i13 ^ i12) | (i13 & i12))) * 130;
        int i15 = i5 | i14;
        int i16 = (i15 << 1) - ((~(i5 & i14)) & i15);
        int i17 = (i7 & i11) | (hashCode2 & i9);
        int i18 = i7 & hashCode2;
        int i19 = (i18 ^ i17) | (i18 & i17);
        int i20 = ~i19;
        int i21 = ((i19 | i20) & i20) * (-260);
        int i22 = (i16 ^ i21) + ((i21 & i16) << 1);
        int i23 = (i2 & i11) | (i11 ^ i2);
        int i24 = ~i23;
        int i25 = (i23 | i24) & i24;
        int i26 = i6 & hashCode2;
        int i27 = (i6 | hashCode2) & (~i26);
        int i28 = (i27 ^ i26) | (i26 & i27);
        int i29 = i28 ^ identityHashCode;
        int i30 = i28 & identityHashCode;
        int i31 = (i30 ^ i29) | (i30 & i29);
        int i32 = ~i31;
        int i33 = (i31 | i32) & i32;
        int i34 = -(~(((i33 ^ i25) | (i25 & i33)) * 130));
        int i35 = (((((i22 | i34) << 1) - (i34 ^ i22)) - 1) * 31) & (-(-java.lang.Integer.hashCode(setsmoothscrollbarenabled.writeReplace)));
        int i36 = ((i35 - (~((r0 ^ r1) | i35))) - 1) * 31;
        int i37 = -(-setsmoothscrollbarenabled.AlternateContactlessPaymentDataJson.hashCode());
        int i38 = IccPrivateKeyCrtComponentsJson;
        int i39 = i38 ^ 83;
        int i40 = ((((i38 & 83) | i39) << 1) - (~(-i39))) - 1;
        values = i40 % 128;
        if (i40 % 2 == 0) {
            return java.lang.Integer.valueOf((((~i37) & i36) | ((~i36) & i37)) + ((i37 & i36) << 1));
        }
        throw null;
    }

    private static /* synthetic */ java.lang.Object values(java.lang.Object[] objArr) {
        boolean z;
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        com.payair.hce.setSmoothScrollbarEnabled setsmoothscrollbarenabled = (com.payair.hce.setSmoothScrollbarEnabled) objArr[0];
        java.lang.Boolean bool2 = java.lang.Boolean.TRUE;
        java.lang.Object obj = objArr[1];
        int i = IccPrivateKeyCrtComponentsJson;
        int i2 = (i & (-40)) | ((~i) & 39);
        int i3 = (i & 39) << 1;
        values = ((i2 ^ i3) + ((i2 & i3) << 1)) % 128;
        if (setsmoothscrollbarenabled == obj) {
            int i4 = i & 107;
            int i5 = -(-((i ^ 107) | i4));
            values = ((i4 ^ i5) + ((i4 & i5) << 1)) % 128;
            return bool2;
        }
        if (!(obj instanceof com.payair.hce.setSmoothScrollbarEnabled)) {
            int i6 = i & 63;
            int i7 = (i6 + ((i ^ 63) | i6)) % 128;
            values = i7;
            int i8 = i7 & 27;
            IccPrivateKeyCrtComponentsJson = ((i8 - (~(-(-((i7 ^ 27) | i8))))) - 1) % 128;
            return bool;
        }
        com.payair.hce.setSmoothScrollbarEnabled setsmoothscrollbarenabled2 = (com.payair.hce.setSmoothScrollbarEnabled) obj;
        if (!kotlin.jvm.internal.Intrinsics.areEqual(setsmoothscrollbarenabled.DigitizedCardProfile, setsmoothscrollbarenabled2.DigitizedCardProfile)) {
            int i9 = IccPrivateKeyCrtComponentsJson;
            int i10 = ((i9 ^ 84) + ((i9 & 84) << 1)) - 1;
            int i11 = i10 % 128;
            values = i11;
            z = i10 % 2 != 0;
            IccPrivateKeyCrtComponentsJson = ((-2) - (~((i11 ^ 114) + ((i11 & 114) << 1)))) % 128;
            return java.lang.Boolean.valueOf(z);
        }
        if (!kotlin.jvm.internal.Intrinsics.areEqual(setsmoothscrollbarenabled.valueOf, setsmoothscrollbarenabled2.valueOf)) {
            int i12 = values;
            int i13 = i12 & 47;
            int i14 = (i12 ^ 47) | i13;
            int i15 = (((i13 | i14) << 1) - (i14 ^ i13)) % 128;
            IccPrivateKeyCrtComponentsJson = i15;
            int i16 = i15 & 7;
            int i17 = i15 | 7;
            values = ((i16 & i17) + (i16 | i17)) % 128;
            return bool;
        }
        if (setsmoothscrollbarenabled.writeReplace != setsmoothscrollbarenabled2.writeReplace) {
            int i18 = IccPrivateKeyCrtComponentsJson;
            int i19 = (-2) - (~((i18 & 120) + (i18 | 120)));
            values = i19 % 128;
            z = i19 % 2 != 0;
            int i20 = i18 ^ 87;
            int i21 = ((((i18 & 87) | i20) << 1) - (~(-i20))) - 1;
            values = i21 % 128;
            if (i21 % 2 == 0) {
                return java.lang.Boolean.valueOf(z);
            }
            throw null;
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(setsmoothscrollbarenabled.AlternateContactlessPaymentDataJson, setsmoothscrollbarenabled2.AlternateContactlessPaymentDataJson)) {
            int i22 = (-2) - (~(values + 84));
            IccPrivateKeyCrtComponentsJson = i22 % 128;
            if (i22 % 2 != 0) {
                return bool2;
            }
            throw null;
        }
        int i23 = ((-2) - (~(values + 32))) % 128;
        IccPrivateKeyCrtComponentsJson = i23;
        int i24 = i23 & 75;
        int i25 = (i23 | 75) & (~i24);
        int i26 = i24 << 1;
        int i27 = (i25 ^ i26) + ((i25 & i26) << 1);
        values = i27 % 128;
        if (i27 % 2 == 0) {
            return bool;
        }
        throw null;
    }

    public final boolean equals(java.lang.Object p0) {
        return ((java.lang.Boolean) writeReplace(new java.lang.Object[]{this, p0}, -1843550600, 1843550603, java.lang.System.identityHashCode(this))).booleanValue();
    }

    public final int hashCode() {
        return ((java.lang.Integer) writeReplace(new java.lang.Object[]{this}, -1737836051, 1737836056, java.lang.System.identityHashCode(this))).intValue();
    }

    public final java.lang.String toString() {
        int i = IccPrivateKeyCrtComponentsJson;
        int i2 = i & com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE;
        int i3 = (i ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) | i2;
        int i4 = (i2 & i3) + (i3 | i2);
        values = i4 % 128;
        if (i4 % 2 != 0) {
            java.util.Objects.toString(this.AlternateContactlessPaymentDataJson);
            throw null;
        }
        java.lang.String str = this.DigitizedCardProfile;
        java.lang.String str2 = this.valueOf;
        int i5 = this.writeReplace;
        java.util.List<java.lang.String> list = this.AlternateContactlessPaymentDataJson;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ReplenishmentRequest(mac=");
        sb.append(str);
        sb.append(", api=");
        sb.append(str2);
        sb.append(", sc=");
        sb.append(i5);
        sb.append(", tvl=");
        sb.append(list);
        sb.append(")");
        return sb.toString();
    }

    public final java.util.List<java.lang.String> valueOf() {
        return (java.util.List) writeReplace(new java.lang.Object[]{this}, 444125934, -444125930, java.lang.System.identityHashCode(this));
    }

    public final int AlternateContactlessPaymentDataJson() {
        return ((java.lang.Integer) writeReplace(new java.lang.Object[]{this}, 390257270, -390257270, java.lang.System.identityHashCode(this))).intValue();
    }

    public final java.lang.String writeReplace() {
        return (java.lang.String) writeReplace(new java.lang.Object[]{this}, 491242709, -491242707, java.lang.System.identityHashCode(this));
    }

    public final java.lang.String DigitizedCardProfile() {
        return (java.lang.String) writeReplace(new java.lang.Object[]{this}, 441482157, -441482156, java.lang.System.identityHashCode(this));
    }
}
