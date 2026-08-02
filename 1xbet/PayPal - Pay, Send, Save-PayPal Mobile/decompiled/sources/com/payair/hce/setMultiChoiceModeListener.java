package com.payair.hce;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0080\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\b\u001a\u00020\u00072\b\u0010\u0003\u001a\u0004\u0018\u00010\u0006HÖ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013"}, d2 = {"Lcom/payair/hce/setMultiChoiceModeListener;", "Lcom/payair/hce/communication/JsonResponse;", "Lcom/payair/hce/setRendererPriorityPolicy;", "p0", "<init>", "(Lcom/payair/hce/setRendererPriorityPolicy;)V", "", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "valueOf", "Lcom/payair/hce/setRendererPriorityPolicy;", "values", "()Lcom/payair/hce/setRendererPriorityPolicy;", "AlternateContactlessPaymentDataJson"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class setMultiChoiceModeListener extends com.payair.hce.communication.JsonResponse {
    private static int AlternateContactlessPaymentDataJson = 0;
    private static int DigitizedCardProfile = 1;

    /* renamed from: valueOf, reason: from kotlin metadata */
    @com.payair.hce.SdkCoreContactlessPaymentDataImpl(valueOf = "iccPubKeyCert")
    private final com.payair.hce.setRendererPriorityPolicy AlternateContactlessPaymentDataJson;

    public static /* synthetic */ java.lang.Object DigitizedCardProfile(java.lang.Object[] objArr, int i, int i2, int i3) {
        int i4 = ~i;
        int i5 = (~(i4 | (~i2))) | (~(i4 | i3));
        int i6 = (i * (-495)) + (i2 * (-495)) + (i5 * 992) + (((~(i | (~i3) | i2)) | i5) * (-496)) + ((i2 | i3) * 496);
        if (i6 != 1) {
            return i6 != 2 ? values(objArr) : writeReplace(objArr);
        }
        com.payair.hce.setMultiChoiceModeListener setmultichoicemodelistener = (com.payair.hce.setMultiChoiceModeListener) objArr[0];
        int i7 = (DigitizedCardProfile + 87) % 128;
        AlternateContactlessPaymentDataJson = i7;
        com.payair.hce.setRendererPriorityPolicy setrendererprioritypolicy = setmultichoicemodelistener.AlternateContactlessPaymentDataJson;
        if (setrendererprioritypolicy == null) {
            DigitizedCardProfile = ((i7 & 21) + (i7 | 21)) % 128;
            return 0;
        }
        int hashCode = setrendererprioritypolicy.hashCode();
        int i8 = AlternateContactlessPaymentDataJson;
        int i9 = i8 ^ 119;
        int i10 = ((i8 & 119) | i9) << 1;
        int i11 = -i9;
        DigitizedCardProfile = ((i10 & i11) + (i10 | i11)) % 128;
        return java.lang.Integer.valueOf(hashCode);
    }

    public /* synthetic */ setMultiChoiceModeListener(com.payair.hce.setRendererPriorityPolicy setrendererprioritypolicy, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : setrendererprioritypolicy);
    }

    private static /* synthetic */ java.lang.Object values(java.lang.Object[] objArr) {
        com.payair.hce.setMultiChoiceModeListener setmultichoicemodelistener = (com.payair.hce.setMultiChoiceModeListener) objArr[0];
        int i = DigitizedCardProfile;
        int i2 = i & 105;
        int i3 = (i2 + ((i ^ 105) | i2)) % 128;
        AlternateContactlessPaymentDataJson = i3;
        com.payair.hce.setRendererPriorityPolicy setrendererprioritypolicy = setmultichoicemodelistener.AlternateContactlessPaymentDataJson;
        int i4 = i3 + 49;
        DigitizedCardProfile = i4 % 128;
        if (i4 % 2 != 0) {
            return setrendererprioritypolicy;
        }
        throw new java.lang.ArithmeticException();
    }

    private setMultiChoiceModeListener(com.payair.hce.setRendererPriorityPolicy setrendererprioritypolicy) {
        this.AlternateContactlessPaymentDataJson = setrendererprioritypolicy;
    }

    private static /* synthetic */ java.lang.Object writeReplace(java.lang.Object[] objArr) {
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        com.payair.hce.setMultiChoiceModeListener setmultichoicemodelistener = (com.payair.hce.setMultiChoiceModeListener) objArr[0];
        java.lang.Boolean bool2 = java.lang.Boolean.TRUE;
        java.lang.Object obj = objArr[1];
        int i = AlternateContactlessPaymentDataJson;
        int i2 = (i | 35) << 1;
        int i3 = -((i & (-36)) | ((~i) & 35));
        int i4 = (i2 & i3) + (i2 | i3);
        int i5 = i4 % 128;
        DigitizedCardProfile = i5;
        if (i4 % 2 == 0) {
            throw new java.lang.ArithmeticException();
        }
        if (setmultichoicemodelistener == obj) {
            int i6 = (i5 & (-92)) | ((~i5) & 91);
            int i7 = (i5 & 91) << 1;
            AlternateContactlessPaymentDataJson = ((i6 ^ i7) + ((i6 & i7) << 1)) % 128;
            return bool2;
        }
        if (!(obj instanceof com.payair.hce.setMultiChoiceModeListener)) {
            int i8 = i & 115;
            int i9 = -(-(i | 115));
            int i10 = (((i8 | i9) << 1) - (i8 ^ i9)) % 128;
            DigitizedCardProfile = i10;
            int i11 = (i10 & androidx.media3.common.PlaybackException.ERROR_CODE_CONTENT_ALREADY_PLAYING) | ((~i10) & 109);
            int i12 = -(-((i10 & 109) << 1));
            int i13 = ((i11 | i12) << 1) - (i11 ^ i12);
            AlternateContactlessPaymentDataJson = i13 % 128;
            if (i13 % 2 == 0) {
                return bool;
            }
            throw new java.lang.ArithmeticException();
        }
        if (!kotlin.jvm.internal.Intrinsics.areEqual(setmultichoicemodelistener.AlternateContactlessPaymentDataJson, ((com.payair.hce.setMultiChoiceModeListener) obj).AlternateContactlessPaymentDataJson)) {
            int i14 = DigitizedCardProfile;
            AlternateContactlessPaymentDataJson = ((i14 & 113) + (i14 | 113)) % 128;
            int i15 = i14 & 115;
            int i16 = -(-((i14 ^ 115) | i15));
            AlternateContactlessPaymentDataJson = ((i15 & i16) + (i16 | i15)) % 128;
            return bool;
        }
        int i17 = DigitizedCardProfile;
        int i18 = i17 & 103;
        int i19 = -(-(i17 | 103));
        int i20 = (i18 ^ i19) + ((i19 & i18) << 1);
        AlternateContactlessPaymentDataJson = i20 % 128;
        if (i20 % 2 == 0) {
            return bool2;
        }
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public setMultiChoiceModeListener() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final boolean equals(java.lang.Object p0) {
        return ((java.lang.Boolean) DigitizedCardProfile(new java.lang.Object[]{this, p0}, -1301802430, 1301802432, java.lang.System.identityHashCode(this))).booleanValue();
    }

    public final int hashCode() {
        return ((java.lang.Integer) DigitizedCardProfile(new java.lang.Object[]{this}, 812995440, -812995439, java.lang.System.identityHashCode(this))).intValue();
    }

    @Override // com.payair.hce.communication.JsonResponse
    public final java.lang.String toString() {
        int i = DigitizedCardProfile;
        int i2 = (i & (-98)) | ((~i) & 97);
        int i3 = -(-((i & 97) << 1));
        int i4 = (i2 & i3) + (i3 | i2);
        AlternateContactlessPaymentDataJson = i4 % 128;
        if (i4 % 2 != 0) {
            throw new java.lang.ArithmeticException();
        }
        com.payair.hce.setRendererPriorityPolicy setrendererprioritypolicy = this.AlternateContactlessPaymentDataJson;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ReplenishmentOdaResponse(iccPubKeyCert=");
        sb.append(setrendererprioritypolicy);
        sb.append(")");
        java.lang.String obj = sb.toString();
        int i5 = DigitizedCardProfile;
        AlternateContactlessPaymentDataJson = ((((i5 | 20) << 1) - (i5 ^ 20)) - 1) % 128;
        return obj;
    }

    public final com.payair.hce.setRendererPriorityPolicy values() {
        return (com.payair.hce.setRendererPriorityPolicy) DigitizedCardProfile(new java.lang.Object[]{this}, 734786059, -734786059, java.lang.System.identityHashCode(this));
    }
}
