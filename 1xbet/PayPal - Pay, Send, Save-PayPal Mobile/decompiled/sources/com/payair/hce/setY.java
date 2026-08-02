package com.payair.hce;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\b\u0000\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\t\b\u0016¢\u0006\u0004\b\u0002\u0010\u0003B\u001d\b\u0016\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0002\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\b\u0010\tR$\u0010\f\u001a\u0004\u0018\u00010\u00048\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\t\"\u0004\b\f\u0010\rR$\u0010\u0010\u001a\u0004\u0018\u00010\u00048\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000b\u001a\u0004\b\f\u0010\t\"\u0004\b\u000f\u0010\rR$\u0010\u000f\u001a\u0004\u0018\u00010\u00048\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\f\u0010\u000b\u001a\u0004\b\u0010\u0010\t\"\u0004\b\n\u0010\r"}, d2 = {"Lcom/payair/hce/setY;", "", "<init>", "()V", "", "p0", "p1", "(Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "valueOf", "Ljava/lang/String;", "values", "(Ljava/lang/String;)V", "writeReplace", "DigitizedCardProfile", "AlternateContactlessPaymentDataJson"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class setY {
    private static int AlternateContactlessPaymentDataJson = 0;

    /* renamed from: DigitizedCardProfile, reason: from kotlin metadata */
    public static final com.payair.hce.setY.Companion INSTANCE = new com.payair.hce.setY.Companion(null);
    private static int getAid = 1;

    /* renamed from: valueOf, reason: from kotlin metadata */
    @com.payair.hce.SdkCoreContactlessPaymentDataImpl(valueOf = "base64Jwk")
    private java.lang.String values;

    /* renamed from: values, reason: from kotlin metadata */
    @com.payair.hce.SdkCoreContactlessPaymentDataImpl(valueOf = "type")
    private java.lang.String DigitizedCardProfile;

    /* renamed from: writeReplace, reason: from kotlin metadata */
    @com.payair.hce.SdkCoreContactlessPaymentDataImpl(valueOf = "timestamp")
    private java.lang.String AlternateContactlessPaymentDataJson;

    public static /* synthetic */ java.lang.Object DigitizedCardProfile(java.lang.Object[] objArr, int i, int i2, int i3) {
        int i4 = ~i2;
        int i5 = ~i3;
        int i6 = ~i;
        int i7 = ~(i | i2);
        switch ((i * 371) + (i2 * 371) + (((~(i4 | i5)) | (~(i6 | i3))) * (-370)) + (((~(i3 | i4)) | (~(i5 | i6)) | i7) * (-370)) + (i7 * com.knotapi.knot.utilities.Constants.ID_KROGER)) {
            case 1:
                com.payair.hce.setY sety = (com.payair.hce.setY) objArr[0];
                int i8 = getAid;
                int i9 = i8 & 69;
                int i10 = (i8 ^ 69) | i9;
                int i11 = (((i9 | i10) << 1) - (i10 ^ i9)) % 128;
                AlternateContactlessPaymentDataJson = i11;
                java.lang.String str = sety.AlternateContactlessPaymentDataJson;
                getAid = (i11 + 41) % 128;
                return str;
            case 2:
                return valueOf(objArr);
            case 3:
                return values(objArr);
            case 4:
                return writeReplace(objArr);
            case 5:
                return AlternateContactlessPaymentDataJson(objArr);
            case 6:
                return DigitizedCardProfile(objArr);
            default:
                com.payair.hce.setY sety2 = (com.payair.hce.setY) objArr[0];
                int i12 = getAid ^ 81;
                AlternateContactlessPaymentDataJson = (((((r6 & 81) | i12) << 1) - (~(-i12))) - 1) % 128;
                return sety2.values;
        }
    }

    private static /* synthetic */ java.lang.Object AlternateContactlessPaymentDataJson(java.lang.Object[] objArr) {
        com.payair.hce.setY sety = (com.payair.hce.setY) objArr[0];
        java.lang.String str = (java.lang.String) objArr[1];
        int i = getAid;
        int i2 = i & com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE;
        int i3 = (i | com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) & (~i2);
        int i4 = i2 << 1;
        int i5 = ((i3 | i4) << 1) - (i3 ^ i4);
        AlternateContactlessPaymentDataJson = i5 % 128;
        sety.AlternateContactlessPaymentDataJson = str;
        if (i5 % 2 == 0) {
            return null;
        }
        throw new java.lang.ArithmeticException();
    }

    private static /* synthetic */ java.lang.Object values(java.lang.Object[] objArr) {
        com.payair.hce.setY sety = (com.payair.hce.setY) objArr[0];
        int i = getAid;
        int i2 = i & 117;
        int i3 = (i ^ 117) | i2;
        AlternateContactlessPaymentDataJson = ((i2 ^ i3) + ((i2 & i3) << 1)) % 128;
        java.lang.String str = sety.DigitizedCardProfile;
        int i4 = (i & 63) + (i | 63);
        AlternateContactlessPaymentDataJson = i4 % 128;
        if (i4 % 2 == 0) {
            return str;
        }
        throw new java.lang.ArithmeticException();
    }

    private static /* synthetic */ java.lang.Object writeReplace(java.lang.Object[] objArr) {
        com.payair.hce.setY sety = (com.payair.hce.setY) objArr[0];
        java.lang.String str = (java.lang.String) objArr[1];
        int i = getAid;
        int i2 = ((i ^ 48) + ((i & 48) << 1)) - 1;
        AlternateContactlessPaymentDataJson = i2 % 128;
        sety.DigitizedCardProfile = str;
        if (i2 % 2 != 0) {
            throw null;
        }
        int i3 = i & 39;
        AlternateContactlessPaymentDataJson = (i3 + ((i ^ 39) | i3)) % 128;
        return null;
    }

    private static /* synthetic */ java.lang.Object valueOf(java.lang.Object[] objArr) {
        com.payair.hce.setY sety = (com.payair.hce.setY) objArr[0];
        java.lang.String str = (java.lang.String) objArr[1];
        int i = AlternateContactlessPaymentDataJson;
        int i2 = ((i | 33) << 1) - (i ^ 33);
        getAid = i2 % 128;
        sety.values = str;
        if (i2 % 2 != 0) {
            return null;
        }
        throw new java.lang.ArithmeticException();
    }

    public setY() {
    }

    public setY(java.lang.String str, java.lang.String str2) {
        this.DigitizedCardProfile = str;
        this.values = str2;
        this.AlternateContactlessPaymentDataJson = (java.lang.String) com.payair.hce.setAutoHandwritingEnabled.AlternateContactlessPaymentDataJson(new java.lang.Object[0], 392159898, -392159895, (int) java.lang.System.currentTimeMillis());
    }

    private static /* synthetic */ java.lang.Object DigitizedCardProfile(java.lang.Object[] objArr) {
        com.payair.hce.setY sety = (com.payair.hce.setY) objArr[0];
        int i = AlternateContactlessPaymentDataJson;
        int i2 = i & 111;
        int i3 = (i2 - (~(-(-((i ^ 111) | i2))))) - 1;
        getAid = i3 % 128;
        if (i3 % 2 != 0) {
            java.lang.String str = sety.AlternateContactlessPaymentDataJson;
            java.lang.String str2 = sety.DigitizedCardProfile;
            java.lang.String str3 = sety.values;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("SignKey{, timestamp='");
            sb.append(str);
            sb.append("', type='");
            sb.append(str2);
            sb.append("', base64Jwk='");
            sb.append(str3);
            sb.append("'}");
            return sb.toString();
        }
        java.lang.String str4 = sety.AlternateContactlessPaymentDataJson;
        java.lang.String str5 = sety.DigitizedCardProfile;
        java.lang.String str6 = sety.values;
        throw null;
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/payair/hce/setY$DigitizedCardProfile;", "", "<init>", "()V"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: com.payair.hce.setY$DigitizedCardProfile, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        int i = AlternateContactlessPaymentDataJson;
        int i2 = i & 15;
        int i3 = (i ^ 15) | i2;
        int i4 = ((i2 | i3) << 1) - (i3 ^ i2);
        getAid = i4 % 128;
        if (i4 % 2 == 0) {
            throw new java.lang.ArithmeticException();
        }
    }

    public final java.lang.String toString() {
        return (java.lang.String) DigitizedCardProfile(new java.lang.Object[]{this}, 1031167963, -1031167957, java.lang.System.identityHashCode(this));
    }

    public final void values(java.lang.String str) {
        DigitizedCardProfile(new java.lang.Object[]{this, str}, -438426309, 438426311, java.lang.System.identityHashCode(this));
    }

    public final java.lang.String valueOf() {
        return (java.lang.String) DigitizedCardProfile(new java.lang.Object[]{this}, 564255430, -564255430, java.lang.System.identityHashCode(this));
    }

    public final void valueOf(java.lang.String str) {
        DigitizedCardProfile(new java.lang.Object[]{this, str}, -1124962341, 1124962345, java.lang.System.identityHashCode(this));
    }

    public final java.lang.String AlternateContactlessPaymentDataJson() {
        return (java.lang.String) DigitizedCardProfile(new java.lang.Object[]{this}, 27588780, -27588777, java.lang.System.identityHashCode(this));
    }

    public final void DigitizedCardProfile(java.lang.String str) {
        DigitizedCardProfile(new java.lang.Object[]{this, str}, -596330114, 596330119, java.lang.System.identityHashCode(this));
    }

    public final java.lang.String values() {
        return (java.lang.String) DigitizedCardProfile(new java.lang.Object[]{this}, -1873358955, 1873358956, java.lang.System.identityHashCode(this));
    }
}
