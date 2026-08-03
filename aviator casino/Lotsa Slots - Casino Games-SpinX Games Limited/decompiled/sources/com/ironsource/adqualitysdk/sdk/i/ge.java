package com.ironsource.adqualitysdk.sdk.i;

/* loaded from: classes5.dex */
public final class ge extends com.ironsource.adqualitysdk.sdk.i.gb {

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static int f2186 = 1;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static char[] f2187 = {20, kotlin.text.Typography.dollar, 'B', io.ktor.util.date.GMTDateParser.HOURS, 'j', io.ktor.util.date.GMTDateParser.HOURS, 'o', 140, 149};

    /* renamed from: ｋ, reason: contains not printable characters */
    private static int f2188;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private final com.ironsource.adqualitysdk.sdk.i.ef f2189;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private final com.ironsource.adqualitysdk.sdk.i.gb f2190;

    public ge(com.ironsource.adqualitysdk.sdk.i.ef efVar, com.ironsource.adqualitysdk.sdk.i.gb gbVar) {
        this.f2189 = efVar;
        this.f2190 = gbVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0040 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:16:? A[LOOP:0: B:2:0x0003->B:16:?, LOOP_END, SYNTHETIC] */
    @Override // com.ironsource.adqualitysdk.sdk.i.gb
    /* renamed from: ﾒ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final com.ironsource.adqualitysdk.sdk.i.ea mo7773(com.ironsource.adqualitysdk.sdk.i.ee eeVar, com.ironsource.adqualitysdk.sdk.i.cl clVar) {
        com.ironsource.adqualitysdk.sdk.i.ea m7785;
        int i = 2 % 2;
        while (!(!this.f2189.m7718(eeVar, clVar).m7679())) {
            int i2 = f2188 + 53;
            f2186 = i2 % 128;
            if (i2 % 2 == 0) {
                m7785 = this.f2190.m7785(eeVar, clVar);
                int i3 = 95 / 0;
                if (m7785.m7676()) {
                    break;
                }
                if (!m7785.m7680()) {
                    int i4 = f2186 + 23;
                    int i5 = i4 % 128;
                    f2188 = i5;
                    int i6 = i4 % 2;
                    int i7 = i5 + 55;
                    f2186 = i7 % 128;
                    if (i7 % 2 != 0) {
                        return m7785;
                    }
                    throw null;
                }
            } else {
                m7785 = this.f2190.m7785(eeVar, clVar);
                if (m7785.m7676()) {
                    break;
                }
                if (!m7785.m7680()) {
                }
            }
        }
        return new com.ironsource.adqualitysdk.sdk.i.ea(null);
    }

    public final java.lang.String toString() {
        int i = 2 % 2;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(m7791("\u0000\u0000\u0001\u0001\u0001\u0001\u0001", new int[]{0, 7, 0, 7}, true).intern());
        sb.append(this.f2189);
        sb.append(m7791(null, new int[]{7, 2, 108, 2}, true).intern());
        sb.append(this.f2190);
        java.lang.String obj = sb.toString();
        int i2 = f2186 + 121;
        f2188 = i2 % 128;
        if (i2 % 2 == 0) {
            return obj;
        }
        throw null;
    }

    public final boolean equals(java.lang.Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = f2186 + 85;
            f2188 = i2 % 128;
            return i2 % 2 == 0;
        }
        if (obj != null) {
            int i3 = f2186 + 25;
            f2188 = i3 % 128;
            if (i3 % 2 != 0) {
                obj.getClass();
                throw null;
            }
            if (getClass() == obj.getClass()) {
                com.ironsource.adqualitysdk.sdk.i.ge geVar = (com.ironsource.adqualitysdk.sdk.i.ge) obj;
                com.ironsource.adqualitysdk.sdk.i.ef efVar = this.f2189;
                if (efVar == null ? geVar.f2189 != null : !efVar.equals(geVar.f2189)) {
                    int i4 = f2188 + 101;
                    f2186 = i4 % 128;
                    int i5 = i4 % 2;
                    return false;
                }
                com.ironsource.adqualitysdk.sdk.i.gb gbVar = this.f2190;
                com.ironsource.adqualitysdk.sdk.i.gb gbVar2 = geVar.f2190;
                if (gbVar != null) {
                    return gbVar.equals(gbVar2);
                }
                if (gbVar2 != null) {
                    return false;
                }
                int i6 = f2186 + 41;
                f2188 = i6 % 128;
                return i6 % 2 == 0;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x001b, code lost:
    
        r1 = r5.f2189.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0019, code lost:
    
        if (r5.f2189 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0014, code lost:
    
        if (r5.f2189 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0022, code lost:
    
        r1 = 0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int hashCode() {
        int hashCode;
        int i = 2 % 2;
        int i2 = f2188 + 113;
        f2186 = i2 % 128;
        int i3 = 0;
        if (i2 % 2 == 0) {
            int i4 = 95 / 0;
        }
        int i5 = hashCode * 31;
        com.ironsource.adqualitysdk.sdk.i.gb gbVar = this.f2190;
        if (gbVar != null) {
            i3 = gbVar.hashCode();
            int i6 = f2188 + 117;
            f2186 = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 3 / 5;
            }
        }
        int i8 = i5 + i3;
        int i9 = f2188 + 5;
        f2186 = i9 % 128;
        int i10 = i9 % 2;
        return i8;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static java.lang.String m7791(java.lang.String str, int[] iArr, boolean z) {
        java.lang.String str2;
        byte[] bArr = str;
        if (str != null) {
            bArr = str.getBytes(com.google.android.exoplayer2.C.ISO88591_NAME);
        }
        byte[] bArr2 = bArr;
        synchronized (com.ironsource.adqualitysdk.sdk.i.h.f2296) {
            int i = iArr[0];
            int i2 = iArr[1];
            int i3 = iArr[2];
            int i4 = iArr[3];
            char[] cArr = new char[i2];
            java.lang.System.arraycopy(f2187, i, cArr, 0, i2);
            if (bArr2 != null) {
                char[] cArr2 = new char[i2];
                com.ironsource.adqualitysdk.sdk.i.h.f2297 = 0;
                char c = 0;
                while (com.ironsource.adqualitysdk.sdk.i.h.f2297 < i2) {
                    if (bArr2[com.ironsource.adqualitysdk.sdk.i.h.f2297] == 1) {
                        cArr2[com.ironsource.adqualitysdk.sdk.i.h.f2297] = (char) (((cArr[com.ironsource.adqualitysdk.sdk.i.h.f2297] << 1) + 1) - c);
                    } else {
                        cArr2[com.ironsource.adqualitysdk.sdk.i.h.f2297] = (char) ((cArr[com.ironsource.adqualitysdk.sdk.i.h.f2297] << 1) - c);
                    }
                    c = cArr2[com.ironsource.adqualitysdk.sdk.i.h.f2297];
                    com.ironsource.adqualitysdk.sdk.i.h.f2297++;
                }
                cArr = cArr2;
            }
            if (i4 > 0) {
                char[] cArr3 = new char[i2];
                java.lang.System.arraycopy(cArr, 0, cArr3, 0, i2);
                int i5 = i2 - i4;
                java.lang.System.arraycopy(cArr3, 0, cArr, i5, i4);
                java.lang.System.arraycopy(cArr3, i4, cArr, 0, i5);
            }
            if (z) {
                char[] cArr4 = new char[i2];
                com.ironsource.adqualitysdk.sdk.i.h.f2297 = 0;
                while (com.ironsource.adqualitysdk.sdk.i.h.f2297 < i2) {
                    cArr4[com.ironsource.adqualitysdk.sdk.i.h.f2297] = cArr[(i2 - com.ironsource.adqualitysdk.sdk.i.h.f2297) - 1];
                    com.ironsource.adqualitysdk.sdk.i.h.f2297++;
                }
                cArr = cArr4;
            }
            if (i3 > 0) {
                com.ironsource.adqualitysdk.sdk.i.h.f2297 = 0;
                while (com.ironsource.adqualitysdk.sdk.i.h.f2297 < i2) {
                    cArr[com.ironsource.adqualitysdk.sdk.i.h.f2297] = (char) (cArr[com.ironsource.adqualitysdk.sdk.i.h.f2297] - iArr[2]);
                    com.ironsource.adqualitysdk.sdk.i.h.f2297++;
                }
            }
            str2 = new java.lang.String(cArr);
        }
        return str2;
    }
}
