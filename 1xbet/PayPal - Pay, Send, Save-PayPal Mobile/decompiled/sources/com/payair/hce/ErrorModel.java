package com.payair.hce;

/* loaded from: classes4.dex */
public class ErrorModel {
    private static int values = 0;
    private static int writeReplace = 1;

    @com.payair.hce.SdkCoreContactlessPaymentDataImpl(valueOf = com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.DESCRIPTION)
    private java.lang.String AlternateContactlessPaymentDataJson;

    @com.payair.hce.SdkCoreContactlessPaymentDataImpl(valueOf = "errorCode")
    private java.lang.String DigitizedCardProfile;

    @com.payair.hce.SdkCoreContactlessPaymentDataImpl(valueOf = "reasonCode")
    private java.lang.String valueOf;

    public static /* synthetic */ java.lang.Object DigitizedCardProfile(java.lang.Object[] objArr, int i, int i2, int i3) {
        int i4 = ~i2;
        int i5 = ~((~i3) | i | i2);
        int i6 = (i * 471) + (i2 * 471) + ((i2 | i) * (-470)) + (((~((~i) | i4)) | (~(i4 | i3)) | i5) * (-470)) + (((~(i | i4 | i3)) | i5) * 470);
        if (i6 != 1) {
            return i6 != 2 ? values(objArr) : valueOf(objArr);
        }
        com.payair.hce.ErrorModel errorModel = (com.payair.hce.ErrorModel) objArr[0];
        java.lang.String str = (java.lang.String) objArr[1];
        int i7 = writeReplace;
        values = (i7 + 69) % 128;
        errorModel.valueOf = str;
        values = (((i7 ^ 32) + ((i7 & 32) << 1)) - 1) % 128;
        return null;
    }

    public ErrorModel(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        DigitizedCardProfile(new java.lang.Object[]{this, str}, 2078163272, -2078163272, java.lang.System.identityHashCode(this));
        DigitizedCardProfile(new java.lang.Object[]{this, str2}, 1939672065, -1939672064, java.lang.System.identityHashCode(this));
        DigitizedCardProfile(new java.lang.Object[]{this, str3}, 1182360894, -1182360892, java.lang.System.identityHashCode(this));
    }

    public java.lang.String getErrorCode() {
        int i = writeReplace;
        int i2 = ((i & 5) + (i | 5)) % 128;
        values = i2;
        java.lang.String str = this.DigitizedCardProfile;
        writeReplace = (i2 + 15) % 128;
        return str;
    }

    private static /* synthetic */ java.lang.Object values(java.lang.Object[] objArr) {
        com.payair.hce.ErrorModel errorModel = (com.payair.hce.ErrorModel) objArr[0];
        java.lang.String str = (java.lang.String) objArr[1];
        int i = values;
        int i2 = (i ^ 51) + ((i & 51) << 1);
        int i3 = i2 % 128;
        writeReplace = i3;
        if (i2 % 2 != 0) {
            errorModel.DigitizedCardProfile = str;
            int i4 = i3 + 125;
            values = i4 % 128;
            if (i4 % 2 == 0) {
                return null;
            }
            throw new java.lang.ArithmeticException();
        }
        errorModel.DigitizedCardProfile = str;
        throw null;
    }

    public java.lang.String getReasonCode() {
        int i = values;
        int i2 = (-2) - (~(i + 54));
        writeReplace = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
        java.lang.String str = this.valueOf;
        int i3 = ((i | 111) << 1) - (i ^ 111);
        writeReplace = i3 % 128;
        if (i3 % 2 != 0) {
            return str;
        }
        throw new java.lang.ArithmeticException();
    }

    public java.lang.String getDescription() {
        int i = writeReplace;
        values = (((i ^ 40) + ((i & 40) << 1)) - 1) % 128;
        java.lang.String str = this.AlternateContactlessPaymentDataJson;
        values = (i + 89) % 128;
        return str;
    }

    private static /* synthetic */ java.lang.Object valueOf(java.lang.Object[] objArr) {
        com.payair.hce.ErrorModel errorModel = (com.payair.hce.ErrorModel) objArr[0];
        java.lang.String str = (java.lang.String) objArr[1];
        int i = writeReplace + 35;
        int i2 = i % 128;
        values = i2;
        if (i % 2 == 0) {
            errorModel.AlternateContactlessPaymentDataJson = str;
            int i3 = (i2 & (-22)) | ((~i2) & 21);
            int i4 = -(-((i2 & 21) << 1));
            int i5 = ((i3 | i4) << 1) - (i3 ^ i4);
            writeReplace = i5 % 128;
            if (i5 % 2 != 0) {
                return null;
            }
            throw null;
        }
        errorModel.AlternateContactlessPaymentDataJson = str;
        throw null;
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("{ errorCode=");
        sb.append(getErrorCode());
        sb.append(", reasonCode=");
        sb.append(getReasonCode());
        sb.append(", description=");
        sb.append(getDescription());
        sb.append(" }");
        java.lang.String obj = sb.toString();
        int i = values;
        int i2 = (i & 51) + (i | 51);
        writeReplace = i2 % 128;
        if (i2 % 2 != 0) {
            return obj;
        }
        throw new java.lang.ArithmeticException();
    }

    private void writeReplace(java.lang.String str) {
        DigitizedCardProfile(new java.lang.Object[]{this, str}, 1182360894, -1182360892, java.lang.System.identityHashCode(this));
    }

    private void AlternateContactlessPaymentDataJson(java.lang.String str) {
        DigitizedCardProfile(new java.lang.Object[]{this, str}, 1939672065, -1939672064, java.lang.System.identityHashCode(this));
    }

    private void DigitizedCardProfile(java.lang.String str) {
        DigitizedCardProfile(new java.lang.Object[]{this, str}, 2078163272, -2078163272, java.lang.System.identityHashCode(this));
    }
}
