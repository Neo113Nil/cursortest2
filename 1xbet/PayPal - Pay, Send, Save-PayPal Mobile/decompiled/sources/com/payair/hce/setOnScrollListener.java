package com.payair.hce;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0080\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eR\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012"}, d2 = {"Lcom/payair/hce/setOnScrollListener;", "", "Lcom/payair/hce/setWebViewRenderProcessClient;", "p0", "<init>", "(Lcom/payair/hce/setWebViewRenderProcessClient;)V", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "DigitizedCardProfile", "Lcom/payair/hce/setWebViewRenderProcessClient;", "AlternateContactlessPaymentDataJson", "()Lcom/payair/hce/setWebViewRenderProcessClient;", "writeReplace"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class setOnScrollListener {
    private static int valueOf = 0;
    private static int values = 1;

    /* renamed from: DigitizedCardProfile, reason: from kotlin metadata */
    @com.payair.hce.SdkCoreContactlessPaymentDataImpl(valueOf = "deviceKeys")
    private final com.payair.hce.setWebViewRenderProcessClient writeReplace;

    public static /* synthetic */ java.lang.Object AlternateContactlessPaymentDataJson(java.lang.Object[] objArr, int i, int i2, int i3) {
        int i4 = ~i2;
        int i5 = ~i3;
        int i6 = (i * 960) + (i2 * (-1917)) + (((~(i4 | i5)) | (~(i | i3))) * 959) + (i4 * (-959)) + (((~(i | i5)) | (~(i4 | i3))) * 959);
        return i6 != 1 ? i6 != 2 ? writeReplace(objArr) : valueOf(objArr) : DigitizedCardProfile(objArr);
    }

    public setOnScrollListener(com.payair.hce.setWebViewRenderProcessClient setwebviewrenderprocessclient) {
        this.writeReplace = setwebviewrenderprocessclient;
    }

    private static /* synthetic */ java.lang.Object valueOf(java.lang.Object[] objArr) {
        com.payair.hce.setOnScrollListener setonscrolllistener = (com.payair.hce.setOnScrollListener) objArr[0];
        int i = values;
        int i2 = i & 97;
        int i3 = (i ^ 97) | i2;
        int i4 = ((i2 ^ i3) + ((i3 & i2) << 1)) % 128;
        valueOf = i4;
        com.payair.hce.setWebViewRenderProcessClient setwebviewrenderprocessclient = setonscrolllistener.writeReplace;
        int i5 = (-2) - (~(((i4 | 12) << 1) - (i4 ^ 12)));
        values = i5 % 128;
        if (i5 % 2 != 0) {
            return setwebviewrenderprocessclient;
        }
        throw null;
    }

    private static /* synthetic */ java.lang.Object DigitizedCardProfile(java.lang.Object[] objArr) {
        com.payair.hce.setOnScrollListener setonscrolllistener = (com.payair.hce.setOnScrollListener) objArr[0];
        int i = valueOf;
        int i2 = (i ^ 86) + ((i & 86) << 1);
        int i3 = ((~i2) + (i2 << 1)) % 128;
        values = i3;
        com.payair.hce.setWebViewRenderProcessClient setwebviewrenderprocessclient = setonscrolllistener.writeReplace;
        if (setwebviewrenderprocessclient == null) {
            valueOf = ((i3 & 55) + (i3 | 55)) % 128;
            valueOf = ((((i3 | 54) << 1) - (i3 ^ 54)) - 1) % 128;
            return 0;
        }
        int hashCode = setwebviewrenderprocessclient.hashCode();
        int i4 = valueOf;
        int i5 = ((i4 ^ 45) | (i4 & 45)) << 1;
        int i6 = -((i4 & (-46)) | ((~i4) & 45));
        int i7 = ((i5 | i6) << 1) - (i6 ^ i5);
        values = i7 % 128;
        if (i7 % 2 != 0) {
            return java.lang.Integer.valueOf(hashCode);
        }
        throw new java.lang.ArithmeticException();
    }

    private static /* synthetic */ java.lang.Object writeReplace(java.lang.Object[] objArr) {
        com.payair.hce.setOnScrollListener setonscrolllistener = (com.payair.hce.setOnScrollListener) objArr[0];
        java.lang.Boolean bool = java.lang.Boolean.TRUE;
        java.lang.Object obj = objArr[1];
        int i = valueOf;
        int i2 = i ^ 85;
        int i3 = ((i & 85) | i2) << 1;
        int i4 = -i2;
        int i5 = (i3 & i4) + (i4 | i3);
        values = i5 % 128;
        if (i5 % 2 == 0) {
            throw new java.lang.ArithmeticException();
        }
        if (setonscrolllistener == obj) {
            values = (((i & (-50)) | ((~i) & 49)) + ((i & 49) << 1)) % 128;
            return bool;
        }
        if (!(obj instanceof com.payair.hce.setOnScrollListener)) {
            int i6 = (((i | 77) << 1) - (i ^ 77)) % 128;
            values = i6;
            int i7 = (i6 & (-60)) | ((~i6) & 59);
            int i8 = -(-((i6 & 59) << 1));
            valueOf = ((i7 ^ i8) + ((i8 & i7) << 1)) % 128;
        } else {
            if (kotlin.jvm.internal.Intrinsics.areEqual(setonscrolllistener.writeReplace, ((com.payair.hce.setOnScrollListener) obj).writeReplace)) {
                int i9 = values;
                int i10 = i9 & 83;
                int i11 = -(-((i9 ^ 83) | i10));
                int i12 = ((i10 | i11) << 1) - (i11 ^ i10);
                valueOf = i12 % 128;
                if (i12 % 2 == 0) {
                    return bool;
                }
                throw new java.lang.ArithmeticException();
            }
            int i13 = values;
            int i14 = (i13 & 11) + (i13 | 11);
            int i15 = i14 % 128;
            valueOf = i15;
            r0 = i14 % 2 != 0;
            values = (((i15 | 121) << 1) - ((i15 & (-122)) | ((~i15) & 121))) % 128;
        }
        return java.lang.Boolean.valueOf(r0);
    }

    public final boolean equals(java.lang.Object p0) {
        return ((java.lang.Boolean) AlternateContactlessPaymentDataJson(new java.lang.Object[]{this, p0}, 283834394, -283834394, java.lang.System.identityHashCode(this))).booleanValue();
    }

    public final int hashCode() {
        return ((java.lang.Integer) AlternateContactlessPaymentDataJson(new java.lang.Object[]{this}, 540983520, -540983519, java.lang.System.identityHashCode(this))).intValue();
    }

    public final java.lang.String toString() {
        int i = values;
        int i2 = i & 125;
        valueOf = (i2 + ((i ^ 125) | i2)) % 128;
        com.payair.hce.setWebViewRenderProcessClient setwebviewrenderprocessclient = this.writeReplace;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("RequestRegisterVisa(deviceKeys=");
        sb.append(setwebviewrenderprocessclient);
        sb.append(")");
        java.lang.String obj = sb.toString();
        int i3 = values;
        valueOf = ((-2) - (~((i3 ^ 24) + ((i3 & 24) << 1)))) % 128;
        return obj;
    }

    public final com.payair.hce.setWebViewRenderProcessClient AlternateContactlessPaymentDataJson() {
        return (com.payair.hce.setWebViewRenderProcessClient) AlternateContactlessPaymentDataJson(new java.lang.Object[]{this}, -2015753554, 2015753556, java.lang.System.identityHashCode(this));
    }
}
