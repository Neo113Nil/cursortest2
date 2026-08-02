package com.payair.hce;

/* loaded from: classes4.dex */
public abstract class getCiacDecline {
    private static final byte[] $$d = {97, -8, 44, 77, 13, -1, -62, 67, -14, com.google.common.base.Ascii.EM, -23, 9, 10, -67, 59, -4, 3, -54, 58, -1, 16, -50, 41, -4};
    private static final int $$e = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:4:0x002d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void d(int i, short s, short s2, java.lang.Object[] objArr) {
        int i2;
        int i3;
        int i4 = (s2 * 2) + 21;
        int i5 = (s * 2) + 99;
        byte[] bArr = $$d;
        int i6 = (i * 4) + 4;
        byte[] bArr2 = new byte[i4];
        if (bArr == null) {
            int i7 = i5;
            i3 = 0;
            int i8 = i6;
            int i9 = (i7 + i6) - 1;
            int i10 = i8 + 1;
            i2 = i3;
            i5 = i9;
            i6 = i10;
            i3 = i2 + 1;
            bArr2[i2] = (byte) i5;
            if (i3 == i4) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            int i11 = i5;
            i8 = i6;
            i6 = bArr[i6];
            i7 = i11;
            int i92 = (i7 + i6) - 1;
            int i102 = i8 + 1;
            i2 = i3;
            i5 = i92;
            i6 = i102;
            i3 = i2 + 1;
            bArr2[i2] = (byte) i5;
            if (i3 == i4) {
            }
        } else {
            i2 = 0;
            i3 = i2 + 1;
            bArr2[i2] = (byte) i5;
            if (i3 == i4) {
            }
        }
    }

    public java.lang.Number AlternateContactlessPaymentDataJson() {
        throw new java.lang.UnsupportedOperationException(getClass().getSimpleName());
    }

    public java.lang.String DigitizedCardProfile() {
        throw new java.lang.UnsupportedOperationException(getClass().getSimpleName());
    }

    public java.lang.String toString() {
        try {
            java.io.StringWriter stringWriter = new java.io.StringWriter();
            com.payair.hce.getRemotePaymentData getremotepaymentdata = new com.payair.hce.getRemotePaymentData(stringWriter);
            getremotepaymentdata.valueOf = true;
            com.payair.hce.SdkCoreMChipCvmIssuerOptionsImpl.buildRecords.writeReplace(getremotepaymentdata, this);
            return stringWriter.toString();
        } catch (java.io.IOException e) {
            throw new java.lang.AssertionError(e);
        }
    }

    public final com.payair.hce.getGpoResponse values() {
        if (this instanceof com.payair.hce.getGpoResponse) {
            return (com.payair.hce.getGpoResponse) this;
        }
        throw new java.lang.IllegalStateException("Not a JSON Object: ".concat(java.lang.String.valueOf(this)));
    }

    public final com.payair.hce.getAid writeReplace() {
        byte b = (byte) ($$d[5] + 1);
        byte b2 = b;
        java.lang.Object[] objArr = new java.lang.Object[1];
        d(b, b2, b2, objArr);
        if (java.lang.Class.forName((java.lang.String) objArr[0]).isInstance(this)) {
            return (com.payair.hce.getAid) this;
        }
        throw new java.lang.IllegalStateException("Not a JSON Array: ".concat(java.lang.String.valueOf(this)));
    }

    public final com.payair.hce.getCvmResetTimeout valueOf() {
        if (this instanceof com.payair.hce.getCvmResetTimeout) {
            return (com.payair.hce.getCvmResetTimeout) this;
        }
        throw new java.lang.IllegalStateException("Not a JSON Primitive: ".concat(java.lang.String.valueOf(this)));
    }
}
