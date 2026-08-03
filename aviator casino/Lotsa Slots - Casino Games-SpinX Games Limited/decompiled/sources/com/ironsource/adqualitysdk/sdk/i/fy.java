package com.ironsource.adqualitysdk.sdk.i;

/* loaded from: classes5.dex */
public final class fy extends com.ironsource.adqualitysdk.sdk.i.gb {

    /* renamed from: ﺙ, reason: contains not printable characters */
    private static int f2154 = 1;

    /* renamed from: ﻏ, reason: contains not printable characters */
    private static int f2155;

    /* renamed from: ﻐ, reason: contains not printable characters */
    private final com.ironsource.adqualitysdk.sdk.i.ft f2158;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private final com.ironsource.adqualitysdk.sdk.i.ft f2159;

    /* renamed from: ｋ, reason: contains not printable characters */
    private final com.ironsource.adqualitysdk.sdk.i.eq f2160;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static char[] f2157 = {'\n', 't', 42286, 19137, 61492, ' ', 42303, 19161, 61536, 38163, 15012, 57352, 34220, ')', 42364};

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static long f2156 = 3196417587089745244L;

    public fy(com.ironsource.adqualitysdk.sdk.i.ft ftVar, com.ironsource.adqualitysdk.sdk.i.ft ftVar2, com.ironsource.adqualitysdk.sdk.i.eq eqVar) {
        this.f2158 = ftVar;
        this.f2159 = ftVar2;
        this.f2160 = eqVar;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gb
    /* renamed from: ﾒ */
    public final com.ironsource.adqualitysdk.sdk.i.ea mo7773(com.ironsource.adqualitysdk.sdk.i.ee eeVar, com.ironsource.adqualitysdk.sdk.i.cl clVar) {
        int i = 2 % 2;
        int i2 = f2154 + 17;
        f2155 = i2 % 128;
        int i3 = i2 % 2;
        java.lang.Object obj = null;
        try {
            com.ironsource.adqualitysdk.sdk.i.ft ftVar = this.f2158;
            if (ftVar != null) {
                com.ironsource.adqualitysdk.sdk.i.ea m7785 = ftVar.m7785(new com.ironsource.adqualitysdk.sdk.i.ee(eeVar), clVar);
                int i4 = f2154 + 121;
                f2155 = i4 % 128;
                if (i4 % 2 == 0) {
                    return m7785;
                }
                super.hashCode();
                throw null;
            }
        } catch (java.lang.Throwable th) {
            eeVar.m7712(this.f2158);
            if (this.f2159 != null) {
                eeVar.m7709(this);
                java.util.HashMap hashMap = new java.util.HashMap();
                com.ironsource.adqualitysdk.sdk.i.eq eqVar = this.f2160;
                if (eqVar != null) {
                    hashMap.put(com.ironsource.adqualitysdk.sdk.i.eb.m7682(eqVar.m7743()), th);
                }
                com.ironsource.adqualitysdk.sdk.i.ea m77852 = this.f2159.m7785(new com.ironsource.adqualitysdk.sdk.i.ee(hashMap, eeVar), clVar);
                int i5 = f2155 + 31;
                f2154 = i5 % 128;
                int i6 = i5 % 2;
                return m77852;
            }
        }
        return new com.ironsource.adqualitysdk.sdk.i.ea(null);
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gb
    /* renamed from: ﻛ */
    public final int mo7772(com.ironsource.adqualitysdk.sdk.i.ee eeVar) {
        int i = 2 % 2;
        int i2 = f2155 + 113;
        f2154 = i2 % 128;
        java.lang.Object obj = null;
        if (i2 % 2 != 0) {
            if (!eeVar.m7715(this)) {
                return this.f2158.toString().split(m7779((char) android.graphics.drawable.Drawable.resolveOpacity(0, 0), android.view.KeyEvent.normalizeMetaState(0), android.view.View.getDefaultSize(0, 0) + 1).intern()).length;
            }
            int i3 = f2155 + 3;
            f2154 = i3 % 128;
            if (i3 % 2 != 0) {
                return 1;
            }
            throw null;
        }
        eeVar.m7715(this);
        super.hashCode();
        throw null;
    }

    public final java.lang.String toString() {
        int i = 2 % 2;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(m7779((char) android.text.TextUtils.indexOf("", ""), -android.text.TextUtils.indexOf((java.lang.CharSequence) "", '0', 0, 0), (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 4).intern());
        sb.append(this.f2158);
        sb.append(m7779((char) android.view.View.resolveSizeAndState(0, 0, 0), android.graphics.Color.argb(0, 0, 0, 0) + 5, 8 - (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))).intern());
        sb.append(this.f2160);
        sb.append(m7779((char) (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16), 13 - ((android.os.Process.getThreadPriority(0) + 20) >> 6), (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 2).intern());
        sb.append(this.f2159);
        java.lang.String obj = sb.toString();
        int i2 = f2155 + 69;
        f2154 = i2 % 128;
        int i3 = i2 % 2;
        return obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0048, code lost:
    
        if (r3.equals(r8.f2159) == false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0056, code lost:
    
        r3 = r7.f2160;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0058, code lost:
    
        if (r3 == null) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x005a, code lost:
    
        r1 = com.ironsource.adqualitysdk.sdk.i.fy.f2155 + 87;
        com.ironsource.adqualitysdk.sdk.i.fy.f2154 = r1 % 128;
        r1 = r1 % 2;
        r8 = r8.f2160;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0065, code lost:
    
        if (r1 == 0) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x006b, code lost:
    
        return r3.equals(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x006c, code lost:
    
        r3.equals(r8);
        super.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0072, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0075, code lost:
    
        if (r8.f2160 != null) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0077, code lost:
    
        r8 = com.ironsource.adqualitysdk.sdk.i.fy.f2154 + 27;
        com.ironsource.adqualitysdk.sdk.i.fy.f2155 = r8 % 128;
        r8 = r8 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0080, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0055, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0053, code lost:
    
        if (r8.f2159 != null) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean equals(java.lang.Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = f2154 + 63;
            f2155 = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            com.ironsource.adqualitysdk.sdk.i.fy fyVar = (com.ironsource.adqualitysdk.sdk.i.fy) obj;
            com.ironsource.adqualitysdk.sdk.i.ft ftVar = this.f2158;
            if (ftVar == null ? fyVar.f2158 != null : !ftVar.equals(fyVar.f2158)) {
                return false;
            }
            com.ironsource.adqualitysdk.sdk.i.ft ftVar2 = this.f2159;
            java.lang.Object obj2 = null;
            if (ftVar2 != null) {
                int i4 = f2155 + 87;
                f2154 = i4 % 128;
                if (i4 % 2 == 0) {
                    ftVar2.equals(fyVar.f2159);
                    throw null;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3 = 2 % 2;
        int i4 = f2154 + 37;
        int i5 = i4 % 128;
        f2155 = i5;
        int i6 = i4 % 2;
        com.ironsource.adqualitysdk.sdk.i.ft ftVar = this.f2158;
        int i7 = 0;
        if (ftVar != null) {
            i = ftVar.hashCode();
        } else {
            int i8 = i5 + 97;
            f2154 = i8 % 128;
            if (i8 % 2 == 0) {
                int i9 = 3 / 4;
            }
            i = 0;
        }
        int i10 = i * 31;
        com.ironsource.adqualitysdk.sdk.i.ft ftVar2 = this.f2159;
        if (ftVar2 != null) {
            i2 = ftVar2.hashCode();
        } else {
            int i11 = f2155 + 107;
            f2154 = i11 % 128;
            int i12 = i11 % 2;
            i2 = 0;
        }
        int i13 = (i10 + i2) * 31;
        com.ironsource.adqualitysdk.sdk.i.eq eqVar = this.f2160;
        if (eqVar != null) {
            int i14 = f2155 + 33;
            f2154 = i14 % 128;
            if (i14 % 2 == 0) {
                eqVar.hashCode();
                java.lang.Object obj = null;
                super.hashCode();
                throw null;
            }
            i7 = eqVar.hashCode();
        }
        return i13 + i7;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    private static java.lang.String m7779(char c, int i, int i2) {
        java.lang.String str;
        synchronized (com.ironsource.adqualitysdk.sdk.i.c.f1207) {
            char[] cArr = new char[i2];
            com.ironsource.adqualitysdk.sdk.i.c.f1208 = 0;
            while (com.ironsource.adqualitysdk.sdk.i.c.f1208 < i2) {
                cArr[com.ironsource.adqualitysdk.sdk.i.c.f1208] = (char) ((f2157[com.ironsource.adqualitysdk.sdk.i.c.f1208 + i] ^ (com.ironsource.adqualitysdk.sdk.i.c.f1208 * f2156)) ^ c);
                com.ironsource.adqualitysdk.sdk.i.c.f1208++;
            }
            str = new java.lang.String(cArr);
        }
        return str;
    }
}
