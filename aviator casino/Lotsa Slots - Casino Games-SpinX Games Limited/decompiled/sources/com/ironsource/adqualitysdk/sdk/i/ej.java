package com.ironsource.adqualitysdk.sdk.i;

/* loaded from: classes5.dex */
public final class ej extends com.ironsource.adqualitysdk.sdk.i.ef {

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static int f1979 = 1;

    /* renamed from: ｋ, reason: contains not printable characters */
    private static int f1980 = 119;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static int f1981;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private final com.ironsource.adqualitysdk.sdk.i.eq f1982;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private final com.ironsource.adqualitysdk.sdk.i.ef f1983;

    public ej(com.ironsource.adqualitysdk.sdk.i.eq eqVar, com.ironsource.adqualitysdk.sdk.i.ef efVar) {
        this.f1982 = eqVar;
        this.f1983 = efVar;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.ef
    /* renamed from: ﾇ */
    public final com.ironsource.adqualitysdk.sdk.i.ea mo7719(com.ironsource.adqualitysdk.sdk.i.ee eeVar, com.ironsource.adqualitysdk.sdk.i.cl clVar) {
        int i = 2 % 2;
        int i2 = f1979 + 25;
        f1981 = i2 % 128;
        if (i2 % 2 != 0) {
            com.ironsource.adqualitysdk.sdk.i.ea m7718 = this.f1983.m7718(eeVar, clVar);
            eeVar.m7710(this.f1982.m7743(), m7718.m7681());
            int i3 = 57 / 0;
            return m7718;
        }
        com.ironsource.adqualitysdk.sdk.i.ea m77182 = this.f1983.m7718(eeVar, clVar);
        eeVar.m7710(this.f1982.m7743(), m77182.m7681());
        return m77182;
    }

    public final java.lang.String toString() {
        int i = 2 % 2;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(this.f1982);
        sb.append(m7723(3 - (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), false, 160 - android.view.Gravity.getAbsoluteGravity(0, 0), "\u0014\ufff7\ufff7", android.text.TextUtils.getOffsetBefore("", 0) + 2).intern());
        sb.append(this.f1983);
        java.lang.String obj = sb.toString();
        int i2 = f1979 + 85;
        f1981 = i2 % 128;
        int i3 = i2 % 2;
        return obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x002a, code lost:
    
        if (r3.equals(r7.f1982) == false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0032, code lost:
    
        r3 = r6.f1983;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0034, code lost:
    
        if (r3 == null) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0036, code lost:
    
        r1 = com.ironsource.adqualitysdk.sdk.i.ej.f1979 + 47;
        com.ironsource.adqualitysdk.sdk.i.ej.f1981 = r1 % 128;
        r1 = r1 % 2;
        r7 = r7.f1983;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0041, code lost:
    
        if (r1 != 0) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0047, code lost:
    
        return r3.equals(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0048, code lost:
    
        r3.equals(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x004c, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x004f, code lost:
    
        if (r7.f1983 != null) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0051, code lost:
    
        r7 = com.ironsource.adqualitysdk.sdk.i.ej.f1981 + 91;
        com.ironsource.adqualitysdk.sdk.i.ej.f1979 = r7 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x005a, code lost:
    
        if ((r7 % 2) != 0) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x005c, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x005d, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0031, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x002f, code lost:
    
        if (r7.f1982 != null) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean equals(java.lang.Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            com.ironsource.adqualitysdk.sdk.i.ej ejVar = (com.ironsource.adqualitysdk.sdk.i.ej) obj;
            com.ironsource.adqualitysdk.sdk.i.eq eqVar = this.f1982;
            if (eqVar != null) {
                int i2 = f1981 + 123;
                f1979 = i2 % 128;
                int i3 = i2 % 2;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int i2 = 2 % 2;
        int i3 = f1981 + 107;
        int i4 = i3 % 128;
        f1979 = i4;
        if (i3 % 2 == 0) {
            java.lang.Object obj = null;
            super.hashCode();
            throw null;
        }
        com.ironsource.adqualitysdk.sdk.i.eq eqVar = this.f1982;
        int i5 = 0;
        if (eqVar != null) {
            i = eqVar.hashCode();
        } else {
            int i6 = i4 + 61;
            f1981 = i6 % 128;
            int i7 = i6 % 2;
            i = 0;
        }
        int i8 = i * 31;
        com.ironsource.adqualitysdk.sdk.i.ef efVar = this.f1983;
        if (efVar != null) {
            i5 = efVar.hashCode();
            int i9 = f1981 + 49;
            f1979 = i9 % 128;
            int i10 = i9 % 2;
        }
        return i8 + i5;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final com.ironsource.adqualitysdk.sdk.i.eq m7724() {
        int i = 2 % 2;
        int i2 = f1979 + 11;
        f1981 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.f1982;
        }
        java.lang.Object obj = null;
        super.hashCode();
        throw null;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static java.lang.String m7723(int i, boolean z, int i2, java.lang.String str, int i3) {
        java.lang.String str2;
        char[] cArr = str;
        if (str != null) {
            cArr = str.toCharArray();
        }
        char[] cArr2 = cArr;
        synchronized (com.ironsource.adqualitysdk.sdk.i.d.f1654) {
            char[] cArr3 = new char[i];
            com.ironsource.adqualitysdk.sdk.i.d.f1651 = 0;
            while (com.ironsource.adqualitysdk.sdk.i.d.f1651 < i) {
                com.ironsource.adqualitysdk.sdk.i.d.f1653 = cArr2[com.ironsource.adqualitysdk.sdk.i.d.f1651];
                cArr3[com.ironsource.adqualitysdk.sdk.i.d.f1651] = (char) (com.ironsource.adqualitysdk.sdk.i.d.f1653 + i2);
                int i4 = com.ironsource.adqualitysdk.sdk.i.d.f1651;
                cArr3[i4] = (char) (cArr3[i4] - f1980);
                com.ironsource.adqualitysdk.sdk.i.d.f1651++;
            }
            if (i3 > 0) {
                com.ironsource.adqualitysdk.sdk.i.d.f1652 = i3;
                char[] cArr4 = new char[i];
                java.lang.System.arraycopy(cArr3, 0, cArr4, 0, i);
                java.lang.System.arraycopy(cArr4, 0, cArr3, i - com.ironsource.adqualitysdk.sdk.i.d.f1652, com.ironsource.adqualitysdk.sdk.i.d.f1652);
                java.lang.System.arraycopy(cArr4, com.ironsource.adqualitysdk.sdk.i.d.f1652, cArr3, 0, i - com.ironsource.adqualitysdk.sdk.i.d.f1652);
            }
            if (z) {
                char[] cArr5 = new char[i];
                com.ironsource.adqualitysdk.sdk.i.d.f1651 = 0;
                while (com.ironsource.adqualitysdk.sdk.i.d.f1651 < i) {
                    cArr5[com.ironsource.adqualitysdk.sdk.i.d.f1651] = cArr3[(i - com.ironsource.adqualitysdk.sdk.i.d.f1651) - 1];
                    com.ironsource.adqualitysdk.sdk.i.d.f1651++;
                }
                cArr3 = cArr5;
            }
            str2 = new java.lang.String(cArr3);
        }
        return str2;
    }
}
