package com.ironsource.adqualitysdk.sdk.i;

/* loaded from: classes5.dex */
public final class fg extends com.ironsource.adqualitysdk.sdk.i.ey {

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static long f2080 = -4066686193613752618L;

    /* renamed from: ｋ, reason: contains not printable characters */
    private static int f2081 = 1;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static int f2082;

    public fg(com.ironsource.adqualitysdk.sdk.i.ef efVar, com.ironsource.adqualitysdk.sdk.i.ef efVar2) {
        super(efVar, efVar2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001c, code lost:
    
        r1 = r1 + 57;
        com.ironsource.adqualitysdk.sdk.i.fg.f2082 = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0025, code lost:
    
        if ((r7 instanceof java.lang.Double) == false) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x002a, code lost:
    
        if ((r6 instanceof java.lang.Long) != false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x002e, code lost:
    
        if ((r7 instanceof java.lang.Long) == false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0031, code lost:
    
        r6 = java.lang.Integer.valueOf(r6.intValue() % r7.intValue());
        r7 = com.ironsource.adqualitysdk.sdk.i.fg.f2081 + 123;
        com.ironsource.adqualitysdk.sdk.i.fg.f2082 = r7 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0047, code lost:
    
        if ((r7 % 2) != 0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0049, code lost:
    
        return r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x004a, code lost:
    
        super.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x004d, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x005b, code lost:
    
        return java.lang.Long.valueOf(r6.longValue() % r7.longValue());
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x001a, code lost:
    
        if ((r6 instanceof java.lang.Double) == false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0015, code lost:
    
        if ((r6 instanceof java.lang.Double) == false) goto L9;
     */
    @Override // com.ironsource.adqualitysdk.sdk.i.ey
    /* renamed from: ｋ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Number mo7753(java.lang.Number number, java.lang.Number number2) {
        int i = 2 % 2;
        int i2 = f2081;
        int i3 = i2 + 27;
        f2082 = i3 % 128;
        java.lang.Object obj = null;
        if (i3 % 2 != 0) {
            int i4 = 11 / 0;
        }
        java.lang.Double valueOf = java.lang.Double.valueOf(number.doubleValue() % number2.doubleValue());
        int i5 = f2082 + 45;
        f2081 = i5 % 128;
        if (i5 % 2 != 0) {
            return valueOf;
        }
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.em
    /* renamed from: ﻛ */
    public final java.lang.String mo7731() {
        int i = 2 % 2;
        int i2 = f2082 + 109;
        f2081 = i2 % 128;
        int i3 = i2 % 2;
        java.lang.String intern = m7761("ᖅᖠ嘮ܖ້", androidx.core.view.ViewCompat.MEASURED_STATE_MASK - android.graphics.Color.rgb(0, 0, 0)).intern();
        int i4 = f2082 + 123;
        f2081 = i4 % 128;
        int i5 = i4 % 2;
        return intern;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static java.lang.String m7761(java.lang.String str, int i) {
        java.lang.String str2;
        char[] cArr = str;
        if (str != null) {
            cArr = str.toCharArray();
        }
        char[] cArr2 = cArr;
        synchronized (com.ironsource.adqualitysdk.sdk.i.g.f2165) {
            char[] m7782 = com.ironsource.adqualitysdk.sdk.i.g.m7782(f2080, cArr2, i);
            com.ironsource.adqualitysdk.sdk.i.g.f2167 = 4;
            while (com.ironsource.adqualitysdk.sdk.i.g.f2167 < m7782.length) {
                com.ironsource.adqualitysdk.sdk.i.g.f2166 = com.ironsource.adqualitysdk.sdk.i.g.f2167 - 4;
                m7782[com.ironsource.adqualitysdk.sdk.i.g.f2167] = (char) ((m7782[com.ironsource.adqualitysdk.sdk.i.g.f2167] ^ m7782[com.ironsource.adqualitysdk.sdk.i.g.f2167 % 4]) ^ (com.ironsource.adqualitysdk.sdk.i.g.f2166 * f2080));
                com.ironsource.adqualitysdk.sdk.i.g.f2167++;
            }
            str2 = new java.lang.String(m7782, 4, m7782.length - 4);
        }
        return str2;
    }
}
