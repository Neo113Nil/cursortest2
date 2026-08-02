package com.payair.hce;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0080\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\b\u001a\u00020\u00072\b\u0010\u0003\u001a\u0004\u0018\u00010\u0006HÖ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eR\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u000e"}, d2 = {"Lcom/payair/hce/setDataDirectorySuffix;", "Lcom/payair/hce/communication/JsonResponse;", "", "p0", "<init>", "(Ljava/lang/String;)V", "", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "writeReplace", "Ljava/lang/String;", "values", "valueOf"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class setDataDirectorySuffix extends com.payair.hce.communication.JsonResponse {
    private static int AlternateContactlessPaymentDataJson = 1;
    private static int values;

    /* renamed from: writeReplace, reason: from kotlin metadata */
    @com.payair.hce.SdkCoreContactlessPaymentDataImpl(valueOf = "vNotificationId")
    private final java.lang.String valueOf;

    public static /* synthetic */ java.lang.Object DigitizedCardProfile(java.lang.Object[] objArr, int i, int i2, int i3) {
        int i4 = ~i2;
        int i5 = ~i3;
        int i6 = (i * 960) + (i2 * (-1917)) + (((~(i4 | i5)) | (~(i | i3))) * 959) + (i4 * (-959)) + (((~(i | i5)) | (~(i4 | i3))) * 959);
        return i6 != 1 ? i6 != 2 ? AlternateContactlessPaymentDataJson(objArr) : writeReplace(objArr) : DigitizedCardProfile(objArr);
    }

    public /* synthetic */ setDataDirectorySuffix(java.lang.String str, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str);
    }

    private static /* synthetic */ java.lang.Object DigitizedCardProfile(java.lang.Object[] objArr) {
        com.payair.hce.setDataDirectorySuffix setdatadirectorysuffix = (com.payair.hce.setDataDirectorySuffix) objArr[0];
        int i = AlternateContactlessPaymentDataJson;
        int i2 = i & 105;
        int i3 = i | 105;
        int i4 = ((i2 | i3) << 1) - (i2 ^ i3);
        values = i4 % 128;
        java.lang.String str = setdatadirectorysuffix.valueOf;
        if (i4 % 2 != 0) {
            throw null;
        }
        int i5 = i & 49;
        int i6 = ((i ^ 49) | i5) << 1;
        int i7 = -((i | 49) & (~i5));
        int i8 = ((i6 | i7) << 1) - (i7 ^ i6);
        values = i8 % 128;
        if (i8 % 2 == 0) {
            return str;
        }
        throw null;
    }

    private setDataDirectorySuffix(java.lang.String str) {
        this.valueOf = str;
    }

    private static /* synthetic */ java.lang.Object writeReplace(java.lang.Object[] objArr) {
        com.payair.hce.setDataDirectorySuffix setdatadirectorysuffix = (com.payair.hce.setDataDirectorySuffix) objArr[0];
        int i = AlternateContactlessPaymentDataJson;
        int i2 = i ^ 5;
        int i3 = (i & 5) << 1;
        int i4 = ((i2 | i3) << 1) - (i2 ^ i3);
        values = i4 % 128;
        java.lang.String str = setdatadirectorysuffix.valueOf;
        if (i4 % 2 != 0) {
            throw new java.lang.ArithmeticException();
        }
        if (str != null) {
            int hashCode = str.hashCode();
            int i5 = values;
            AlternateContactlessPaymentDataJson = ((i5 ^ 41) + ((i5 & 41) << 1)) % 128;
            return java.lang.Integer.valueOf(hashCode);
        }
        int i6 = ((i & 118) + (i | 118)) - 1;
        values = i6 % 128;
        int i7 = i6 % 2 != 0 ? 1 : 0;
        int i8 = (i ^ 19) + ((i & 19) << 1);
        values = i8 % 128;
        if (i8 % 2 == 0) {
            return java.lang.Integer.valueOf(i7);
        }
        throw null;
    }

    private static /* synthetic */ java.lang.Object AlternateContactlessPaymentDataJson(java.lang.Object[] objArr) {
        com.payair.hce.setDataDirectorySuffix setdatadirectorysuffix = (com.payair.hce.setDataDirectorySuffix) objArr[0];
        java.lang.Boolean bool = java.lang.Boolean.TRUE;
        java.lang.Object obj = objArr[1];
        int i = AlternateContactlessPaymentDataJson;
        int i2 = ((i | 87) << 1) - (i ^ 87);
        values = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
        if (setdatadirectorysuffix == obj) {
            int i3 = ((((i | com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE) << 1) - (i ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE)) - 1) % 128;
            values = i3;
            int i4 = i3 + 91;
            AlternateContactlessPaymentDataJson = i4 % 128;
            if (i4 % 2 != 0) {
                return bool;
            }
            throw null;
        }
        if (!(obj instanceof com.payair.hce.setDataDirectorySuffix)) {
            int i5 = i ^ 49;
            values = (((((i & 49) | i5) << 1) - (~(-i5))) - 1) % 128;
            int i6 = i ^ 107;
            int i7 = (i & 107) << 1;
            int i8 = ((i6 | i7) << 1) - (i6 ^ i7);
            values = i8 % 128;
            if (i8 % 2 == 0) {
                return java.lang.Boolean.FALSE;
            }
            throw new java.lang.ArithmeticException();
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(setdatadirectorysuffix.valueOf, ((com.payair.hce.setDataDirectorySuffix) obj).valueOf)) {
            int i9 = AlternateContactlessPaymentDataJson;
            int i10 = i9 | 67;
            int i11 = i10 << 1;
            int i12 = -((~(i9 & 67)) & i10);
            values = ((i11 & i12) + (i12 | i11)) % 128;
            return bool;
        }
        int i13 = AlternateContactlessPaymentDataJson;
        int i14 = ((i13 & (-100)) | ((~i13) & 99)) + ((i13 & 99) << 1);
        int i15 = i14 % 128;
        values = i15;
        boolean z = i14 % 2 != 0;
        int i16 = i15 & 23;
        int i17 = -(-((i15 ^ 23) | i16));
        int i18 = ((i16 | i17) << 1) - (i17 ^ i16);
        AlternateContactlessPaymentDataJson = i18 % 128;
        if (i18 % 2 != 0) {
            return java.lang.Boolean.valueOf(z);
        }
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public setDataDirectorySuffix() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final boolean equals(java.lang.Object p0) {
        return ((java.lang.Boolean) DigitizedCardProfile(new java.lang.Object[]{this, p0}, 217778890, -217778890, java.lang.System.identityHashCode(this))).booleanValue();
    }

    public final int hashCode() {
        return ((java.lang.Integer) DigitizedCardProfile(new java.lang.Object[]{this}, -705541857, 705541859, java.lang.System.identityHashCode(this))).intValue();
    }

    @Override // com.payair.hce.communication.JsonResponse
    public final java.lang.String toString() {
        int i = AlternateContactlessPaymentDataJson;
        values = (((i | 69) << 1) - (i ^ 69)) % 128;
        java.lang.String str = this.valueOf;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("InitializeRepersoResponse(vNotificationId=");
        sb.append(str);
        sb.append(")");
        java.lang.String obj = sb.toString();
        int i2 = values;
        int i3 = i2 & 63;
        int i4 = (i2 ^ 63) | i3;
        AlternateContactlessPaymentDataJson = ((i3 ^ i4) + ((i4 & i3) << 1)) % 128;
        return obj;
    }

    public final java.lang.String values() {
        return (java.lang.String) DigitizedCardProfile(new java.lang.Object[]{this}, -1069824039, 1069824040, java.lang.System.identityHashCode(this));
    }
}
