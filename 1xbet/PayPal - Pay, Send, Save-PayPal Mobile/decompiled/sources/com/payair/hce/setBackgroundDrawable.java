package com.payair.hce;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\r\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\tR\u001a\u0010\f\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000b\u001a\u0004\b\u000e\u0010\t"}, d2 = {"Lcom/payair/hce/setBackgroundDrawable;", "", "Lcom/payair/hce/TokenType;", "p0", "", "p1", "<init>", "(Lcom/payair/hce/TokenType;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "DigitizedCardProfile", "Ljava/lang/String;", "values", "AlternateContactlessPaymentDataJson", "valueOf"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class setBackgroundDrawable {
    private static int AlternateContactlessPaymentDataJson = 0;
    private static int values = 1;

    /* renamed from: DigitizedCardProfile, reason: from kotlin metadata */
    @com.payair.hce.SdkCoreContactlessPaymentDataImpl(valueOf = "type")
    private final java.lang.String AlternateContactlessPaymentDataJson;

    /* renamed from: valueOf, reason: from kotlin metadata */
    @com.payair.hce.SdkCoreContactlessPaymentDataImpl(valueOf = com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE)
    private final java.lang.String values;

    public static /* synthetic */ java.lang.Object DigitizedCardProfile(java.lang.Object[] objArr, int i, int i2, int i3) {
        int i4 = ~i3;
        int i5 = ~i;
        int i6 = (i * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_ACTIVATION_SCRP_FAIL) + (i2 * (-520)) + (((~(i4 | i2)) | i) * (-1042)) + ((i2 | i3) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_ATTEST_SCRP_FAIL) + (((~(i | i4 | i2)) | (~((~i2) | i5)) | (~(i3 | i5))) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_ATTEST_SCRP_FAIL);
        if (i6 != 1) {
            return i6 != 2 ? values(objArr) : writeReplace(objArr);
        }
        com.payair.hce.setBackgroundDrawable setbackgrounddrawable = (com.payair.hce.setBackgroundDrawable) objArr[0];
        int i7 = (values + 79) % 128;
        AlternateContactlessPaymentDataJson = i7;
        java.lang.String str = setbackgrounddrawable.AlternateContactlessPaymentDataJson;
        int i8 = i7 & 113;
        values = (i8 + ((i7 ^ 113) | i8)) % 128;
        return str;
    }

    public setBackgroundDrawable(com.payair.hce.TokenType tokenType, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tokenType, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.values = str;
        java.lang.String tokenType2 = tokenType.getTokenType();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(tokenType2, "");
        this.AlternateContactlessPaymentDataJson = tokenType2;
    }

    private static /* synthetic */ java.lang.Object values(java.lang.Object[] objArr) {
        com.payair.hce.setBackgroundDrawable setbackgrounddrawable = (com.payair.hce.setBackgroundDrawable) objArr[0];
        int i = values;
        int i2 = (-2) - (~((i & 54) + (i | 54)));
        AlternateContactlessPaymentDataJson = i2 % 128;
        java.lang.String str = setbackgrounddrawable.values;
        if (i2 % 2 == 0) {
            return str;
        }
        throw new java.lang.ArithmeticException();
    }

    private static /* synthetic */ java.lang.Object writeReplace(java.lang.Object[] objArr) {
        com.payair.hce.setBackgroundDrawable setbackgrounddrawable = (com.payair.hce.setBackgroundDrawable) objArr[0];
        int i = AlternateContactlessPaymentDataJson;
        int i2 = (i ^ 47) + ((i & 47) << 1);
        values = i2 % 128;
        if (i2 % 2 != 0) {
            java.lang.String str = setbackgrounddrawable.AlternateContactlessPaymentDataJson;
            java.lang.String str2 = setbackgrounddrawable.values;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("RequestToken{type='");
            sb.append(str);
            sb.append("', value='");
            sb.append(str2);
            sb.append("'}");
            java.lang.String obj = sb.toString();
            int i3 = values;
            int i4 = i3 & 93;
            int i5 = -(-((i3 ^ 93) | i4));
            int i6 = (i4 & i5) + (i5 | i4);
            AlternateContactlessPaymentDataJson = i6 % 128;
            if (i6 % 2 == 0) {
                return obj;
            }
            throw new java.lang.ArithmeticException();
        }
        java.lang.String str3 = setbackgrounddrawable.AlternateContactlessPaymentDataJson;
        java.lang.String str4 = setbackgrounddrawable.values;
        throw null;
    }

    public final java.lang.String toString() {
        return (java.lang.String) DigitizedCardProfile(new java.lang.Object[]{this}, -729994450, 729994452, java.lang.System.identityHashCode(this));
    }

    public final java.lang.String values() {
        return (java.lang.String) DigitizedCardProfile(new java.lang.Object[]{this}, 1664583156, -1664583155, java.lang.System.identityHashCode(this));
    }

    public final java.lang.String valueOf() {
        return (java.lang.String) DigitizedCardProfile(new java.lang.Object[]{this}, 1788224115, -1788224115, java.lang.System.identityHashCode(this));
    }
}
