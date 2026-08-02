package com.payair.hce;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u001a\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\t\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u000fR\u001d\u0010\u0013\u001a\u00020\u00028\u0007X\u0087\u0004ø\u0001\u0001¢\u0006\f\n\u0004\b\u0012\u0010\u0011\u001a\u0004\b\u0013\u0010\u000f\u0082\u0002\b\n\u0002\b\u0019\n\u0002\b!"}, d2 = {"Lcom/payair/hce/setTextFilterEnabled;", "", "Lcom/payair/hce/setStackFromBottom;", "p0", "", "p1", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "writeReplace", "Ljava/lang/String;", "AlternateContactlessPaymentDataJson", "valueOf"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class setTextFilterEnabled {
    private static int valueOf = 1;
    private static int values;

    /* renamed from: AlternateContactlessPaymentDataJson, reason: from kotlin metadata */
    @com.payair.hce.SdkCoreContactlessPaymentDataImpl(valueOf = "visaCertificateType")
    private final java.lang.String valueOf;

    @com.payair.hce.SdkCoreContactlessPaymentDataImpl(valueOf = "certId")
    private final java.lang.String writeReplace;

    public static /* synthetic */ java.lang.Object valueOf(java.lang.Object[] objArr, int i, int i2, int i3) {
        int i4;
        int i5 = ~i;
        int i6 = ~i2;
        int i7 = ~(i5 | i6);
        int i8 = (i * (-575)) + (i2 * (-575)) + (((~(i6 | i3)) | i7) * 576) + (((~(i | (~i3) | i6)) | (~(i2 | i5))) * 576) + (i7 * 576);
        if (i8 != 1) {
            if (i8 == 2) {
                return values(objArr);
            }
            if (i8 != 3) {
                return DigitizedCardProfile(objArr);
            }
            com.payair.hce.setTextFilterEnabled settextfilterenabled = (com.payair.hce.setTextFilterEnabled) objArr[0];
            int i9 = valueOf;
            int i10 = i9 & 35;
            values = ((((i9 ^ 35) | i10) << 1) - ((i9 | 35) & (~i10))) % 128;
            return settextfilterenabled.writeReplace;
        }
        com.payair.hce.setTextFilterEnabled settextfilterenabled2 = (com.payair.hce.setTextFilterEnabled) objArr[0];
        int i11 = valueOf;
        int i12 = i11 & 93;
        int i13 = ((i11 | 93) & (~i12)) + (i12 << 1);
        values = i13 % 128;
        if (i13 % 2 != 0) {
            i4 = (((java.lang.Integer) com.payair.hce.setStackFromBottom.DigitizedCardProfile(new java.lang.Object[]{settextfilterenabled2.valueOf}, 2145283880, -2145283878, (int) java.lang.System.currentTimeMillis())).intValue() % 19) >>> settextfilterenabled2.writeReplace.hashCode();
        } else {
            int intValue = ((java.lang.Integer) com.payair.hce.setStackFromBottom.DigitizedCardProfile(new java.lang.Object[]{settextfilterenabled2.valueOf}, 2145283880, -2145283878, (int) java.lang.System.currentTimeMillis())).intValue() * 31;
            int i14 = -(-settextfilterenabled2.writeReplace.hashCode());
            int i15 = ((~i14) & intValue) | ((~intValue) & i14);
            int i16 = -(-((i14 & intValue) << 1));
            i4 = (i16 & i15) + (i16 | i15);
        }
        return java.lang.Integer.valueOf(i4);
    }

    private setTextFilterEnabled(java.lang.String str, java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        this.valueOf = str;
        this.writeReplace = str2;
    }

    private static /* synthetic */ java.lang.Object values(java.lang.Object[] objArr) {
        com.payair.hce.setTextFilterEnabled settextfilterenabled = (com.payair.hce.setTextFilterEnabled) objArr[0];
        int i = valueOf;
        int i2 = i ^ 23;
        int i3 = ((i & 23) | i2) << 1;
        int i4 = -i2;
        int i5 = (i3 ^ i4) + ((i3 & i4) << 1);
        int i6 = i5 % 128;
        values = i6;
        java.lang.String str = settextfilterenabled.valueOf;
        if (i5 % 2 != 0) {
            throw new java.lang.ArithmeticException();
        }
        int i7 = i6 & 115;
        int i8 = i6 | 115;
        int i9 = ((i7 | i8) << 1) - (i8 ^ i7);
        valueOf = i9 % 128;
        if (i9 % 2 != 0) {
            return str;
        }
        throw null;
    }

    private static /* synthetic */ java.lang.Object DigitizedCardProfile(java.lang.Object[] objArr) {
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        com.payair.hce.setTextFilterEnabled settextfilterenabled = (com.payair.hce.setTextFilterEnabled) objArr[0];
        java.lang.Boolean bool2 = java.lang.Boolean.TRUE;
        java.lang.Object obj = objArr[1];
        int i = valueOf;
        int i2 = (-2) - (~((i & 52) + (i | 52)));
        values = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
        if (settextfilterenabled == obj) {
            values = ((i ^ 23) + ((i & 23) << 1)) % 128;
            int i3 = ((i ^ 19) | (i & 19)) << 1;
            int i4 = -((i & (-20)) | ((~i) & 19));
            int i5 = ((i3 | i4) << 1) - (i3 ^ i4);
            values = i5 % 128;
            if (i5 % 2 == 0) {
                return bool2;
            }
            throw null;
        }
        if (!(obj instanceof com.payair.hce.setTextFilterEnabled)) {
            int i6 = i & 37;
            int i7 = ((i ^ 37) | i6) << 1;
            int i8 = -((~i6) & (i | 37));
            values = (((i7 | i8) << 1) - (i8 ^ i7)) % 128;
            int i9 = i & 47;
            int i10 = -(-((i ^ 47) | i9));
            int i11 = (i9 & i10) + (i9 | i10);
            values = i11 % 128;
            if (i11 % 2 == 0) {
                return bool;
            }
            throw null;
        }
        com.payair.hce.setTextFilterEnabled settextfilterenabled2 = (com.payair.hce.setTextFilterEnabled) obj;
        if (!((java.lang.Boolean) com.payair.hce.setStackFromBottom.DigitizedCardProfile(new java.lang.Object[]{settextfilterenabled.valueOf, settextfilterenabled2.valueOf}, 24397604, -24397596, (int) java.lang.System.currentTimeMillis())).booleanValue()) {
            int i12 = valueOf;
            int i13 = i12 & 69;
            values = ((i13 - (~((i12 ^ 69) | i13))) - 1) % 128;
            int i14 = i12 & 59;
            int i15 = (i12 ^ 59) | i14;
            values = (((i14 | i15) << 1) - (i15 ^ i14)) % 128;
            return bool;
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(settextfilterenabled.writeReplace, settextfilterenabled2.writeReplace)) {
            int i16 = values;
            int i17 = (i16 ^ 105) + ((i16 & 105) << 1);
            valueOf = i17 % 128;
            if (i17 % 2 != 0) {
                return bool2;
            }
            throw null;
        }
        int i18 = valueOf;
        int i19 = (i18 & (-2)) | ((~i18) & 1);
        int i20 = (i18 & 1) << 1;
        values = (((i19 | i20) << 1) - (i19 ^ i20)) % 128;
        int i21 = (i18 ^ 103) + ((i18 & 103) << 1);
        values = i21 % 128;
        if (i21 % 2 == 0) {
            return bool;
        }
        throw null;
    }

    public /* synthetic */ setTextFilterEnabled(java.lang.String str, java.lang.String str2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2);
    }

    public final boolean equals(java.lang.Object p0) {
        return ((java.lang.Boolean) valueOf(new java.lang.Object[]{this, p0}, -72733543, 72733543, java.lang.System.identityHashCode(this))).booleanValue();
    }

    public final int hashCode() {
        return ((java.lang.Integer) valueOf(new java.lang.Object[]{this}, -1028447873, 1028447874, java.lang.System.identityHashCode(this))).intValue();
    }

    public final java.lang.String toString() {
        int i = valueOf;
        values = ((i & 109) + (i | 109)) % 128;
        java.lang.String str = (java.lang.String) com.payair.hce.setStackFromBottom.DigitizedCardProfile(new java.lang.Object[]{this.valueOf}, 1037769567, -1037769560, (int) java.lang.System.currentTimeMillis());
        java.lang.String str2 = this.writeReplace;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("VisaCertReferenceDao(visaCertificateType=");
        sb.append(str);
        sb.append(", certId=");
        sb.append(str2);
        sb.append(")");
        java.lang.String obj = sb.toString();
        int i2 = values;
        int i3 = i2 & 1;
        valueOf = ((((i2 ^ 1) | i3) << 1) - ((i2 | 1) & (~i3))) % 128;
        return obj;
    }

    public final java.lang.String AlternateContactlessPaymentDataJson() {
        return (java.lang.String) valueOf(new java.lang.Object[]{this}, 1179345396, -1179345393, java.lang.System.identityHashCode(this));
    }

    public final java.lang.String valueOf() {
        return (java.lang.String) valueOf(new java.lang.Object[]{this}, 753639871, -753639869, java.lang.System.identityHashCode(this));
    }
}
