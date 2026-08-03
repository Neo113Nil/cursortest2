package com.ironsource.adqualitysdk.sdk.i;

/* loaded from: classes5.dex */
public final class fx extends com.ironsource.adqualitysdk.sdk.i.gb {

    /* renamed from: ﱟ, reason: contains not printable characters */
    private static int f2147 = 1;

    /* renamed from: ﺙ, reason: contains not printable characters */
    private static int f2148 = 0;

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static long f2149 = -3773275213520157101L;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private final com.ironsource.adqualitysdk.sdk.i.ef f2150;

    /* renamed from: ｋ, reason: contains not printable characters */
    private final com.ironsource.adqualitysdk.sdk.i.ef f2151;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private final com.ironsource.adqualitysdk.sdk.i.gb f2152;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private final com.ironsource.adqualitysdk.sdk.i.ef f2153;

    public fx(com.ironsource.adqualitysdk.sdk.i.ef efVar, com.ironsource.adqualitysdk.sdk.i.ef efVar2, com.ironsource.adqualitysdk.sdk.i.ef efVar3, com.ironsource.adqualitysdk.sdk.i.gb gbVar) {
        this.f2150 = efVar;
        this.f2153 = efVar2;
        this.f2151 = efVar3;
        this.f2152 = gbVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0054, code lost:
    
        return new com.ironsource.adqualitysdk.sdk.i.ea(null);
     */
    @Override // com.ironsource.adqualitysdk.sdk.i.gb
    /* renamed from: ﾒ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final com.ironsource.adqualitysdk.sdk.i.ea mo7773(com.ironsource.adqualitysdk.sdk.i.ee eeVar, com.ironsource.adqualitysdk.sdk.i.cl clVar) {
        int i = 2 % 2;
        m7777(this.f2150, eeVar, clVar);
        while (true) {
            java.lang.Object obj = null;
            if (!this.f2153.m7718(eeVar, clVar).m7679()) {
                break;
            }
            int i2 = f2148 + 77;
            f2147 = i2 % 128;
            if (i2 % 2 != 0) {
                com.ironsource.adqualitysdk.sdk.i.ea m7785 = this.f2152.m7785(eeVar, clVar);
                if (m7785.m7676()) {
                    break;
                }
                if (m7785.m7680()) {
                    return m7785;
                }
                m7777(this.f2151, eeVar, clVar);
                int i3 = f2147 + 87;
                f2148 = i3 % 128;
                int i4 = i3 % 2;
            } else {
                this.f2152.m7785(eeVar, clVar).m7676();
                super.hashCode();
                throw null;
            }
        }
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static com.ironsource.adqualitysdk.sdk.i.ea m7777(com.ironsource.adqualitysdk.sdk.i.ef efVar, com.ironsource.adqualitysdk.sdk.i.ee eeVar, com.ironsource.adqualitysdk.sdk.i.cl clVar) {
        int i = 2 % 2;
        int i2 = f2148 + 7;
        int i3 = i2 % 128;
        f2147 = i3;
        int i4 = i2 % 2;
        if (efVar != null) {
            int i5 = i3 + 85;
            f2148 = i5 % 128;
            if (i5 % 2 == 0) {
                return efVar.m7718(eeVar, clVar);
            }
            com.ironsource.adqualitysdk.sdk.i.ea m7718 = efVar.m7718(eeVar, clVar);
            int i6 = 25 / 0;
            return m7718;
        }
        return new com.ironsource.adqualitysdk.sdk.i.ea(null);
    }

    public final java.lang.String toString() {
        int i = 2 % 2;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(m7778("ਓ㊔ੵ璨䛴쨠伟鷆፷", (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 1).intern());
        com.ironsource.adqualitysdk.sdk.i.ef efVar = this.f2150;
        if (efVar != null) {
            int i2 = f2148 + 7;
            f2147 = i2 % 128;
            if (i2 % 2 == 0) {
                sb.append(efVar);
                int i3 = 82 / 0;
            } else {
                sb.append(efVar);
            }
        }
        sb.append(m7778("岦䛀岝³┙鸈", 1 - (android.view.ViewConfiguration.getEdgeSlop() >> 16)).intern());
        sb.append(this.f2153);
        sb.append(m7778("岦䛀岝³┙鸈", 1 - android.view.Gravity.getAbsoluteGravity(0, 0)).intern());
        com.ironsource.adqualitysdk.sdk.i.ef efVar2 = this.f2151;
        if (efVar2 != null) {
            sb.append(efVar2);
            int i4 = f2148 + 59;
            f2147 = i4 % 128;
            int i5 = i4 % 2;
        }
        sb.append(m7778("鿱捴鿘┇\ue4fcꢓ", 1 - (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1))).intern());
        sb.append(this.f2152);
        return sb.toString();
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0048, code lost:
    
        if (r2.equals(r7.f2153) == false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0050, code lost:
    
        r0 = r6.f2151;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0052, code lost:
    
        if (r0 == null) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x005a, code lost:
    
        if (r0.equals(r7.f2151) != false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0062, code lost:
    
        r0 = r6.f2152;
        r7 = r7.f2152;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0066, code lost:
    
        if (r0 == null) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x006c, code lost:
    
        return r0.equals(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x006d, code lost:
    
        if (r7 != null) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x006f, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0070, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0061, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x005f, code lost:
    
        if (r7.f2151 == null) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x004f, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x004d, code lost:
    
        if (r7.f2153 != null) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean equals(java.lang.Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        java.lang.Object obj2 = null;
        if (obj != null) {
            int i2 = f2147 + 25;
            f2148 = i2 % 128;
            if (i2 % 2 != 0) {
                obj.getClass();
                super.hashCode();
                throw null;
            }
            if (getClass() == obj.getClass()) {
                com.ironsource.adqualitysdk.sdk.i.fx fxVar = (com.ironsource.adqualitysdk.sdk.i.fx) obj;
                com.ironsource.adqualitysdk.sdk.i.ef efVar = this.f2150;
                if (efVar == null ? fxVar.f2150 != null : !efVar.equals(fxVar.f2150)) {
                    return false;
                }
                com.ironsource.adqualitysdk.sdk.i.ef efVar2 = this.f2153;
                if (efVar2 != null) {
                    int i3 = f2148 + 75;
                    f2147 = i3 % 128;
                    int i4 = i3 % 2;
                }
            }
        }
        int i5 = f2147 + 5;
        f2148 = i5 % 128;
        if (i5 % 2 == 0) {
            return false;
        }
        super.hashCode();
        throw null;
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        int i4 = 2 % 2;
        com.ironsource.adqualitysdk.sdk.i.ef efVar = this.f2150;
        if (efVar != null) {
            i = efVar.hashCode();
        } else {
            int i5 = f2147 + 1;
            f2148 = i5 % 128;
            int i6 = i5 % 2;
            i = 0;
        }
        int i7 = i * 31;
        com.ironsource.adqualitysdk.sdk.i.ef efVar2 = this.f2153;
        if (efVar2 != null) {
            int i8 = f2148 + 13;
            f2147 = i8 % 128;
            int i9 = i8 % 2;
            i2 = efVar2.hashCode();
        } else {
            i2 = 0;
        }
        int i10 = (i7 + i2) * 31;
        com.ironsource.adqualitysdk.sdk.i.ef efVar3 = this.f2151;
        if (efVar3 != null) {
            int i11 = f2148 + 105;
            f2147 = i11 % 128;
            int i12 = i11 % 2;
            i3 = efVar3.hashCode();
        } else {
            i3 = 0;
        }
        int i13 = (i10 + i3) * 31;
        com.ironsource.adqualitysdk.sdk.i.gb gbVar = this.f2152;
        return i13 + (gbVar != null ? gbVar.hashCode() : 0);
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static java.lang.String m7778(java.lang.String str, int i) {
        java.lang.String str2;
        char[] cArr = str;
        if (str != null) {
            cArr = str.toCharArray();
        }
        char[] cArr2 = cArr;
        synchronized (com.ironsource.adqualitysdk.sdk.i.g.f2165) {
            char[] m7782 = com.ironsource.adqualitysdk.sdk.i.g.m7782(f2149, cArr2, i);
            com.ironsource.adqualitysdk.sdk.i.g.f2167 = 4;
            while (com.ironsource.adqualitysdk.sdk.i.g.f2167 < m7782.length) {
                com.ironsource.adqualitysdk.sdk.i.g.f2166 = com.ironsource.adqualitysdk.sdk.i.g.f2167 - 4;
                m7782[com.ironsource.adqualitysdk.sdk.i.g.f2167] = (char) ((m7782[com.ironsource.adqualitysdk.sdk.i.g.f2167] ^ m7782[com.ironsource.adqualitysdk.sdk.i.g.f2167 % 4]) ^ (com.ironsource.adqualitysdk.sdk.i.g.f2166 * f2149));
                com.ironsource.adqualitysdk.sdk.i.g.f2167++;
            }
            str2 = new java.lang.String(m7782, 4, m7782.length - 4);
        }
        return str2;
    }
}
