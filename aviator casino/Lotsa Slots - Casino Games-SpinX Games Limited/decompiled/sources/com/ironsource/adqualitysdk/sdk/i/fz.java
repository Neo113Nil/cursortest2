package com.ironsource.adqualitysdk.sdk.i;

/* loaded from: classes5.dex */
public class fz extends com.ironsource.adqualitysdk.sdk.i.gb {

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static int f2161 = 1;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static long f2162 = -1570867619190363659L;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static int f2163;

    /* renamed from: ｋ, reason: contains not printable characters */
    private final com.ironsource.adqualitysdk.sdk.i.ef f2164;

    public fz(com.ironsource.adqualitysdk.sdk.i.ef efVar) {
        this.f2164 = efVar;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    final com.ironsource.adqualitysdk.sdk.i.ef m7781() {
        int i = 2 % 2;
        int i2 = f2161 + 121;
        int i3 = i2 % 128;
        f2163 = i3;
        java.lang.Object obj = null;
        if (i2 % 2 != 0) {
            super.hashCode();
            throw null;
        }
        com.ironsource.adqualitysdk.sdk.i.ef efVar = this.f2164;
        int i4 = i3 + 123;
        f2161 = i4 % 128;
        if (i4 % 2 != 0) {
            return efVar;
        }
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gb
    /* renamed from: ﾒ */
    public com.ironsource.adqualitysdk.sdk.i.ea mo7773(com.ironsource.adqualitysdk.sdk.i.ee eeVar, com.ironsource.adqualitysdk.sdk.i.cl clVar) {
        int i = 2 % 2;
        com.ironsource.adqualitysdk.sdk.i.ef efVar = this.f2164;
        java.lang.Object obj = null;
        if (efVar != null) {
            int i2 = f2161 + 71;
            f2163 = i2 % 128;
            if (i2 % 2 == 0) {
                return efVar.m7718(eeVar, clVar);
            }
            efVar.m7718(eeVar, clVar);
            super.hashCode();
            throw null;
        }
        com.ironsource.adqualitysdk.sdk.i.ea eaVar = new com.ironsource.adqualitysdk.sdk.i.ea(null);
        int i3 = f2161 + 37;
        f2163 = i3 % 128;
        if (i3 % 2 == 0) {
            return eaVar;
        }
        super.hashCode();
        throw null;
    }

    public java.lang.String toString() {
        int i = 2 % 2;
        int i2 = f2161 + 115;
        f2163 = i2 % 128;
        if (i2 % 2 == 0) {
            if (this.f2164 != null) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append(this.f2164);
                sb.append(m7780("뺀뺻䛤誆\ue08d", -android.text.TextUtils.lastIndexOf("", '0', 0, 0)).intern());
                return sb.toString();
            }
            java.lang.String intern = m7780("뺀뺻䛤誆\ue08d", (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))).intern();
            int i3 = f2163 + 53;
            f2161 = i3 % 128;
            int i4 = i3 % 2;
            return intern;
        }
        throw null;
    }

    public boolean equals(java.lang.Object obj) {
        int i = 2 % 2;
        int i2 = f2161 + 113;
        f2163 = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            int i3 = f2161 + 105;
            f2163 = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 27 / 0;
            }
            return false;
        }
        com.ironsource.adqualitysdk.sdk.i.fz fzVar = (com.ironsource.adqualitysdk.sdk.i.fz) obj;
        com.ironsource.adqualitysdk.sdk.i.ef efVar = this.f2164;
        if (efVar != null) {
            int i5 = f2163 + 73;
            f2161 = i5 % 128;
            int i6 = i5 % 2;
            return efVar.equals(fzVar.f2164);
        }
        if (fzVar.f2164 != null) {
            return false;
        }
        int i7 = f2163 + 113;
        f2161 = i7 % 128;
        int i8 = i7 % 2;
        return true;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = f2163 + 117;
        int i3 = i2 % 128;
        f2161 = i3;
        java.lang.Object obj = null;
        if (i2 % 2 == 0) {
            super.hashCode();
            throw null;
        }
        com.ironsource.adqualitysdk.sdk.i.ef efVar = this.f2164;
        if (efVar != null) {
            int hashCode = efVar.hashCode();
            int i4 = f2163 + 113;
            f2161 = i4 % 128;
            int i5 = i4 % 2;
            return hashCode;
        }
        int i6 = i3 + 49;
        f2163 = i6 % 128;
        if (i6 % 2 == 0) {
            return 0;
        }
        throw null;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    private static java.lang.String m7780(java.lang.String str, int i) {
        java.lang.String str2;
        char[] cArr = str;
        if (str != null) {
            cArr = str.toCharArray();
        }
        char[] cArr2 = cArr;
        synchronized (com.ironsource.adqualitysdk.sdk.i.g.f2165) {
            char[] m7782 = com.ironsource.adqualitysdk.sdk.i.g.m7782(f2162, cArr2, i);
            com.ironsource.adqualitysdk.sdk.i.g.f2167 = 4;
            while (com.ironsource.adqualitysdk.sdk.i.g.f2167 < m7782.length) {
                com.ironsource.adqualitysdk.sdk.i.g.f2166 = com.ironsource.adqualitysdk.sdk.i.g.f2167 - 4;
                m7782[com.ironsource.adqualitysdk.sdk.i.g.f2167] = (char) ((m7782[com.ironsource.adqualitysdk.sdk.i.g.f2167] ^ m7782[com.ironsource.adqualitysdk.sdk.i.g.f2167 % 4]) ^ (com.ironsource.adqualitysdk.sdk.i.g.f2166 * f2162));
                com.ironsource.adqualitysdk.sdk.i.g.f2167++;
            }
            str2 = new java.lang.String(m7782, 4, m7782.length - 4);
        }
        return str2;
    }
}
