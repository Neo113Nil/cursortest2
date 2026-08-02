package com.visa.cbp.external.common;

/* loaded from: classes5.dex */
public class ICC {
    public static final byte[] $$a = {69, -28, -121, 67};
    public static final int $$b = 89;
    java.lang.String iccCRTCoeffDModP;
    java.lang.String iccCRTCoeffDModQ;
    java.lang.String iccCRTCoeffQModP;
    java.lang.String iccCRTprimep;
    java.lang.String iccCRTprimeq;
    java.lang.String iccKeymod;
    java.lang.String iccPrivKExpo;
    java.lang.String iccPubKCert;
    java.lang.String iccPubKExpo;
    java.lang.String iccPubKRem;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:4:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(short s, int i, short s2, java.lang.Object[] objArr) {
        int i2;
        int i3 = 3 - (i * 2);
        int i4 = (s2 * 3) + 67;
        int i5 = s * 4;
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[1 - i5];
        int i6 = 0 - i5;
        if (bArr == null) {
            int i7 = i6;
            int i8 = 0;
            i4 += -i7;
            i2 = i8;
            bArr2[i2] = (byte) i4;
            i8 = i2 + 1;
            if (i2 == i6) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            i3++;
            i7 = bArr[i3];
            i4 += -i7;
            i2 = i8;
            bArr2[i2] = (byte) i4;
            i8 = i2 + 1;
            if (i2 == i6) {
            }
        } else {
            i2 = 0;
            bArr2[i2] = (byte) i4;
            i8 = i2 + 1;
            if (i2 == i6) {
            }
        }
    }

    public java.lang.String getIccPubKCert() {
        return this.iccPubKCert;
    }

    public void setIccPubKCert(java.lang.String str) {
        this.iccPubKCert = str;
    }

    public java.lang.String getIccPubKExpo() {
        return this.iccPubKExpo;
    }

    public void setIccPubKExpo(java.lang.String str) {
        this.iccPubKExpo = str;
    }

    public java.lang.String getIccPubKRem() {
        return this.iccPubKRem;
    }

    public void setIccPubKRem(java.lang.String str) {
        this.iccPubKRem = str;
    }

    public java.lang.String getIccPrivKExpo() {
        return this.iccPrivKExpo;
    }

    public void setIccPrivKExpo(java.lang.String str) {
        this.iccPrivKExpo = str;
    }

    public java.lang.String getIccKeymod() {
        return this.iccKeymod;
    }

    public void setIccKeymod(java.lang.String str) {
        this.iccKeymod = str;
    }

    public java.lang.String getIccCRTCoeffQModP() {
        return this.iccCRTCoeffQModP;
    }

    public void setIccCRTCoeffQModP(java.lang.String str) {
        this.iccCRTCoeffQModP = str;
    }

    public java.lang.String getIccCRTCoeffDModQ() {
        return this.iccCRTCoeffDModQ;
    }

    public void setIccCRTCoeffDModQ(java.lang.String str) {
        this.iccCRTCoeffDModQ = str;
    }

    public java.lang.String getIccCRTCoeffDModP() {
        return this.iccCRTCoeffDModP;
    }

    public void setIccCRTCoeffDModP(java.lang.String str) {
        this.iccCRTCoeffDModP = str;
    }

    public java.lang.String getIccCRTprimep() {
        return this.iccCRTprimep;
    }

    public void setIccCRTprimep(java.lang.String str) {
        this.iccCRTprimep = str;
    }

    public java.lang.String getIccCRTprimeq() {
        return this.iccCRTprimeq;
    }

    public void setIccCRTprimeq(java.lang.String str) {
        this.iccCRTprimeq = str;
    }

    public static int g(java.lang.Object obj) {
        try {
            java.lang.Object[] objArr = {obj};
            java.lang.Object obj2 = com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.get(-1725818816);
            if (obj2 == null) {
                java.lang.Class cls = (java.lang.Class) com.visa.cbp.setIssuerApplicationDiscretionaryData.valueOf((char) (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), android.view.View.MeasureSpec.makeMeasureSpec(0, 0) + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_SWITCH_IDENTITY_DARK_APPEARANCE_VALUE, (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 27);
                java.lang.Object[] objArr2 = new java.lang.Object[1];
                a((short) 0, 0, (short) 0, objArr2);
                obj2 = cls.getMethod((java.lang.String) objArr2[0], java.lang.Object.class);
                com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.put(-1725818816, obj2);
            }
            return ((java.lang.Integer) ((java.lang.reflect.Method) obj2).invoke(null, objArr)).intValue();
        } catch (java.lang.Throwable th) {
            java.lang.Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }
}
