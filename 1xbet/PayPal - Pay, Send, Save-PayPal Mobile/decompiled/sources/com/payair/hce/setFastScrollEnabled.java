package com.payair.hce;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\n\b\u0080\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0013\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u000f\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0014\u001a\u0004\b\u0013\u0010\u000e"}, d2 = {"Lcom/payair/hce/setFastScrollEnabled;", "", "", "p0", "", "p1", "<init>", "(Ljava/lang/String;)V", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "valueOf", "Z", "DigitizedCardProfile", "()Z", "values", "Ljava/lang/String;"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class setFastScrollEnabled {
    private static int AlternateContactlessPaymentDataJson = 1;
    private static int writeReplace;

    /* renamed from: DigitizedCardProfile, reason: from kotlin metadata */
    @com.payair.hce.SdkCoreContactlessPaymentDataImpl(valueOf = "vnotificationId")
    private final java.lang.String valueOf;

    /* renamed from: valueOf, reason: from kotlin metadata */
    @com.payair.hce.SdkCoreContactlessPaymentDataImpl(valueOf = "fullReperso")
    private final boolean values;

    public static /* synthetic */ java.lang.Object writeReplace(java.lang.Object[] objArr, int i, int i2, int i3) {
        int i4 = ~i3;
        int i5 = ~i;
        int i6 = ~i2;
        int i7 = i5 | i6;
        int i8 = i6 | i4;
        int i9 = (i * 193) + (i2 * 193) + ((i4 | (~(i5 | i2))) * (-192)) + (((~i8) | (~i7)) * (-384)) + (((~(i | i8)) | (~(i3 | i7)) | (~(i2 | i | i3))) * 192);
        return i9 != 1 ? i9 != 2 ? i9 != 3 ? valueOf(objArr) : values(objArr) : DigitizedCardProfile(objArr) : writeReplace(objArr);
    }

    public setFastScrollEnabled(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.values = false;
        this.valueOf = str;
    }

    private static /* synthetic */ java.lang.Object writeReplace(java.lang.Object[] objArr) {
        com.payair.hce.setFastScrollEnabled setfastscrollenabled = (com.payair.hce.setFastScrollEnabled) objArr[0];
        int i = AlternateContactlessPaymentDataJson;
        int i2 = ((i & 79) - (~(-(-(i | 79))))) - 1;
        writeReplace = i2 % 128;
        boolean z = setfastscrollenabled.values;
        if (i2 % 2 == 0) {
            return java.lang.Boolean.valueOf(z);
        }
        throw null;
    }

    private static /* synthetic */ java.lang.Object DigitizedCardProfile(java.lang.Object[] objArr) {
        com.payair.hce.setFastScrollEnabled setfastscrollenabled = (com.payair.hce.setFastScrollEnabled) objArr[0];
        int i = writeReplace;
        AlternateContactlessPaymentDataJson = ((i & 27) + (i | 27)) % 128;
        java.lang.String str = setfastscrollenabled.valueOf;
        int i2 = i & 83;
        int i3 = (i | 83) & (~i2);
        int i4 = -(-(i2 << 1));
        int i5 = (i3 ^ i4) + ((i3 & i4) << 1);
        AlternateContactlessPaymentDataJson = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw new java.lang.ArithmeticException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v42 */
    /* JADX WARN: Type inference failed for: r1v43 */
    /* JADX WARN: Type inference failed for: r1v5, types: [int] */
    private static /* synthetic */ java.lang.Object values(java.lang.Object[] objArr) {
        com.payair.hce.setFastScrollEnabled setfastscrollenabled = (com.payair.hce.setFastScrollEnabled) objArr[0];
        int i = AlternateContactlessPaymentDataJson;
        int i2 = ((i & 74) + (i | 74)) - 1;
        writeReplace = i2 % 128;
        if (i2 % 2 != 0) {
            boolean z = setfastscrollenabled.values;
            throw new java.lang.ArithmeticException();
        }
        boolean z2 = setfastscrollenabled.values;
        ?? r1 = z2;
        if (z2) {
            writeReplace = ((i ^ 55) + ((i & 55) << 1)) % 128;
            r1 = 1;
        }
        int i3 = r1 * 31;
        int hashCode = setfastscrollenabled.valueOf.hashCode();
        int identityHashCode = java.lang.System.identityHashCode(setfastscrollenabled);
        int i4 = hashCode * 1773;
        int i5 = -(-(r1 * (-27435)));
        int i6 = i4 & i5;
        int i7 = (i5 ^ i4) | i6;
        int i8 = (i6 ^ i7) + ((i7 & i6) << 1);
        int i9 = ~hashCode;
        int i10 = i9 & (i9 | hashCode);
        int i11 = ~i3;
        int i12 = (i10 ^ i11) | (i10 & i11);
        int i13 = ~i12;
        int i14 = (i12 | i13) & i13;
        int i15 = ~((i11 ^ identityHashCode) | (i11 & identityHashCode));
        int i16 = i14 & i15;
        int i17 = ((i14 | i15) & (~i16)) | i16;
        int i18 = ~identityHashCode;
        int i19 = i18 ^ hashCode;
        int i20 = i18 & hashCode;
        int i21 = (i19 ^ i20) | (i19 & i20);
        int i22 = i21 & i3;
        int i23 = (i21 | i3) & (~i22);
        int i24 = ~((i23 ^ i22) | (i23 & i22));
        int i25 = (((~i17) & i24) | ((~i24) & i17) | (i17 & i24)) * 886;
        int i26 = ((~i25) & i8) | ((~i8) & i25);
        int i27 = (i25 & i8) << 1;
        int i28 = (i26 & i27) + (i27 | i26);
        int i29 = ~(((identityHashCode | i18) & i18) | i3);
        int i30 = hashCode ^ i29;
        int i31 = i29 & hashCode;
        int i32 = ((i31 ^ i30) | (i31 & i30)) * (-1772);
        int i33 = ((((~i32) & i28) | ((~i28) & i32)) - (~(-(-((i32 & i28) << 1))))) - 1;
        int i34 = ((hashCode | i18) & (~i20)) | i20;
        int i35 = ~i34;
        int i36 = -(-(((i34 | i35) & i35) * 886));
        int i37 = -(-((i36 & i33) << 1));
        int i38 = AlternateContactlessPaymentDataJson + 7;
        writeReplace = i38 % 128;
        if (i38 % 2 == 0) {
            return java.lang.Integer.valueOf(((i36 ^ i33) - (~i37)) - 1);
        }
        throw null;
    }

    private static /* synthetic */ java.lang.Object valueOf(java.lang.Object[] objArr) {
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        com.payair.hce.setFastScrollEnabled setfastscrollenabled = (com.payair.hce.setFastScrollEnabled) objArr[0];
        java.lang.Object obj = objArr[1];
        int i = writeReplace;
        int i2 = i + 55;
        int i3 = i2 % 128;
        AlternateContactlessPaymentDataJson = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        if (setfastscrollenabled == obj) {
            int i4 = ((i3 | 7) << 1) - (i3 ^ 7);
            writeReplace = i4 % 128;
            boolean z = i4 % 2 == 0;
            int i5 = i3 + 103;
            writeReplace = i5 % 128;
            if (i5 % 2 == 0) {
                return java.lang.Boolean.valueOf(z);
            }
            throw null;
        }
        if (!(obj instanceof com.payair.hce.setFastScrollEnabled)) {
            writeReplace = (i3 + 11) % 128;
            int i6 = (i3 & (-48)) | ((~i3) & 47);
            int i7 = (i3 & 47) << 1;
            writeReplace = ((i6 & i7) + (i6 | i7)) % 128;
            return bool;
        }
        com.payair.hce.setFastScrollEnabled setfastscrollenabled2 = (com.payair.hce.setFastScrollEnabled) obj;
        if (setfastscrollenabled.values != setfastscrollenabled2.values) {
            int i8 = i & 49;
            AlternateContactlessPaymentDataJson = ((i8 - (~(-(-((i ^ 49) | i8))))) - 1) % 128;
            return bool;
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(setfastscrollenabled.valueOf, setfastscrollenabled2.valueOf)) {
            writeReplace = (AlternateContactlessPaymentDataJson + 35) % 128;
            return java.lang.Boolean.TRUE;
        }
        int i9 = AlternateContactlessPaymentDataJson;
        int i10 = i9 & 83;
        int i11 = (i9 | 83) & (~i10);
        int i12 = -(-(i10 << 1));
        int i13 = (i11 & i12) + (i11 | i12);
        writeReplace = i13 % 128;
        return java.lang.Boolean.valueOf(i13 % 2 != 0);
    }

    public final boolean equals(java.lang.Object p0) {
        return ((java.lang.Boolean) writeReplace(new java.lang.Object[]{this, p0}, -1402894016, 1402894016, java.lang.System.identityHashCode(this))).booleanValue();
    }

    public final int hashCode() {
        return ((java.lang.Integer) writeReplace(new java.lang.Object[]{this}, -1688635214, 1688635217, java.lang.System.identityHashCode(this))).intValue();
    }

    public final java.lang.String toString() {
        int i = writeReplace;
        int i2 = i & 81;
        int i3 = (((i ^ 81) | i2) << 1) - ((i | 81) & (~i2));
        AlternateContactlessPaymentDataJson = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        boolean z = this.values;
        java.lang.String str = this.valueOf;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("RepersoRequest(fullReperso=");
        sb.append(z);
        sb.append(", vnotificationId=");
        sb.append(str);
        sb.append(")");
        return sb.toString();
    }

    public final java.lang.String values() {
        return (java.lang.String) writeReplace(new java.lang.Object[]{this}, -763572721, 763572723, java.lang.System.identityHashCode(this));
    }

    public final boolean DigitizedCardProfile() {
        return ((java.lang.Boolean) writeReplace(new java.lang.Object[]{this}, 1209277213, -1209277212, java.lang.System.identityHashCode(this))).booleanValue();
    }
}
