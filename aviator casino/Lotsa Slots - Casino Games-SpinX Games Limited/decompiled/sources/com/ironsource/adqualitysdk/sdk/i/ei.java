package com.ironsource.adqualitysdk.sdk.i;

/* loaded from: classes5.dex */
public final class ei extends com.ironsource.adqualitysdk.sdk.i.ef {

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static int f1975 = 1;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static int f1976 = 0;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static int f1977 = 96;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private final java.lang.String f1978;

    public ei(java.lang.String str) {
        this.f1978 = com.ironsource.adqualitysdk.sdk.i.eb.m7682(str);
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.ef
    /* renamed from: ﾇ */
    public final com.ironsource.adqualitysdk.sdk.i.ea mo7719(com.ironsource.adqualitysdk.sdk.i.ee eeVar, com.ironsource.adqualitysdk.sdk.i.cl clVar) {
        int i = 2 % 2;
        com.ironsource.adqualitysdk.sdk.i.ea eaVar = new com.ironsource.adqualitysdk.sdk.i.ea(clVar.m7203().m6380(com.ironsource.adqualitysdk.sdk.i.kn.m8470(this.f1978, m7722(6 - (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16), false, android.graphics.Color.red(0) + 192, "\u0013ￎ\u0003\f\u0001\u0013", (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1))).intern())));
        int i2 = f1975 + 125;
        f1976 = i2 % 128;
        int i3 = i2 % 2;
        return eaVar;
    }

    public final java.lang.String toString() {
        int i = 2 % 2;
        int i2 = f1975;
        int i3 = i2 + 85;
        f1976 = i3 % 128;
        int i4 = i3 % 2;
        java.lang.String str = this.f1978;
        int i5 = i2 + 71;
        f1976 = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0039, code lost:
    
        return r0.equals(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x003a, code lost:
    
        if (r6 != null) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x003c, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x003d, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003e, code lost:
    
        r6 = com.ironsource.adqualitysdk.sdk.i.ei.f1976 + 5;
        com.ironsource.adqualitysdk.sdk.i.ei.f1975 = r6 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0047, code lost:
    
        if ((r6 % 2) == 0) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0049, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x004a, code lost:
    
        r6 = null;
        super.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x004e, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0018, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0016, code lost:
    
        if (r5 == r6) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0013, code lost:
    
        if (r5 == r6) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0019, code lost:
    
        if (r6 == null) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x001b, code lost:
    
        r2 = r2 + 121;
        com.ironsource.adqualitysdk.sdk.i.ei.f1975 = r2 % 128;
        r2 = r2 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x002a, code lost:
    
        if (getClass() == r6.getClass()) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x002d, code lost:
    
        r0 = r5.f1978;
        r6 = ((com.ironsource.adqualitysdk.sdk.i.ei) r6).f1978;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0033, code lost:
    
        if (r0 == null) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean equals(java.lang.Object obj) {
        int i = 2 % 2;
        int i2 = f1975 + 59;
        int i3 = i2 % 128;
        f1976 = i3;
        if (i2 % 2 != 0) {
            int i4 = 15 / 0;
        }
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = f1975 + 23;
        f1976 = i2 % 128;
        int i3 = i2 % 2;
        java.lang.String str = this.f1978;
        if (str == null) {
            return 0;
        }
        int hashCode = str.hashCode();
        int i4 = f1976 + 111;
        f1975 = i4 % 128;
        if (i4 % 2 != 0) {
            return hashCode;
        }
        throw null;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static java.lang.String m7722(int i, boolean z, int i2, java.lang.String str, int i3) {
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
                cArr3[i4] = (char) (cArr3[i4] - f1977);
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
