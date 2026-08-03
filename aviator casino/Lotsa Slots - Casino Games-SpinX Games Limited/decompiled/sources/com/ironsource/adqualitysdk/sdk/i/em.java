package com.ironsource.adqualitysdk.sdk.i;

/* loaded from: classes5.dex */
public abstract class em extends com.ironsource.adqualitysdk.sdk.i.ef {

    /* renamed from: ﮐ, reason: contains not printable characters */
    private static int f1994 = 1;

    /* renamed from: ﱡ, reason: contains not printable characters */
    private static int f1995 = 0;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static char f1996 = 0;

    /* renamed from: ｋ, reason: contains not printable characters */
    private static int f1997 = 0;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static long f1998 = -2765212177004768628L;

    /* renamed from: ﻐ, reason: contains not printable characters */
    private final com.ironsource.adqualitysdk.sdk.i.ef f1999;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private final com.ironsource.adqualitysdk.sdk.i.ef f2000;

    /* renamed from: ﻛ, reason: contains not printable characters */
    public abstract java.lang.String mo7731();

    public em(com.ironsource.adqualitysdk.sdk.i.ef efVar, com.ironsource.adqualitysdk.sdk.i.ef efVar2) {
        this.f2000 = efVar;
        this.f1999 = efVar2;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final com.ironsource.adqualitysdk.sdk.i.ef m7732() {
        int i = 2 % 2;
        int i2 = f1994 + 89;
        int i3 = i2 % 128;
        f1995 = i3;
        int i4 = i2 % 2;
        com.ironsource.adqualitysdk.sdk.i.ef efVar = this.f2000;
        int i5 = i3 + 67;
        f1994 = i5 % 128;
        int i6 = i5 % 2;
        return efVar;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final com.ironsource.adqualitysdk.sdk.i.ef m7733() {
        int i = 2 % 2;
        int i2 = f1994;
        int i3 = i2 + 111;
        f1995 = i3 % 128;
        if (i3 % 2 != 0) {
            java.lang.Object obj = null;
            super.hashCode();
            throw null;
        }
        com.ironsource.adqualitysdk.sdk.i.ef efVar = this.f1999;
        int i4 = i2 + 29;
        f1995 = i4 % 128;
        int i5 = i4 % 2;
        return efVar;
    }

    public java.lang.String toString() {
        int i = 2 % 2;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(this.f2000);
        sb.append(m7730((char) (android.text.TextUtils.indexOf("", "", 0) + 64780), "튌ﴋ︬\ud99f", "\ueeaf襤\u0cffࣽ", "ֽ", (-449297) - (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))).intern());
        sb.append(mo7731());
        sb.append(m7730((char) ((android.view.ViewConfiguration.getFadingEdgeLength() >> 16) + 64780), "튌ﴋ︬\ud99f", "\ueeaf襤\u0cffࣽ", "ֽ", (-449298) - (android.view.ViewConfiguration.getScrollBarSize() >> 8)).intern());
        sb.append(this.f1999);
        java.lang.String obj = sb.toString();
        int i2 = f1994 + 29;
        f1995 = i2 % 128;
        if (i2 % 2 == 0) {
            return obj;
        }
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0038, code lost:
    
        if (r3.equals(r7.f2000) == false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0049, code lost:
    
        r3 = r6.f1999;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x004b, code lost:
    
        if (r3 == null) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x004d, code lost:
    
        r1 = com.ironsource.adqualitysdk.sdk.i.em.f1994 + 3;
        com.ironsource.adqualitysdk.sdk.i.em.f1995 = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x005c, code lost:
    
        return r3.equals(r7.f1999);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x005f, code lost:
    
        if (r7.f1999 != null) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0061, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0048, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0041, code lost:
    
        if (r3.equals(r7.f2000) == false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0046, code lost:
    
        if (r7.f2000 != null) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean equals(java.lang.Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = f1994 + 73;
            f1995 = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            com.ironsource.adqualitysdk.sdk.i.em emVar = (com.ironsource.adqualitysdk.sdk.i.em) obj;
            com.ironsource.adqualitysdk.sdk.i.ef efVar = this.f2000;
            if (efVar != null) {
                int i4 = f1995 + 31;
                f1994 = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 61 / 0;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        int i;
        int i2 = 2 % 2;
        com.ironsource.adqualitysdk.sdk.i.ef efVar = this.f2000;
        int i3 = 0;
        if (efVar != null) {
            int i4 = f1994 + 107;
            f1995 = i4 % 128;
            if (i4 % 2 != 0) {
                i = efVar.hashCode();
                int i5 = 39 / 0;
            } else {
                i = efVar.hashCode();
            }
        } else {
            i = 0;
        }
        int i6 = i * 31;
        com.ironsource.adqualitysdk.sdk.i.ef efVar2 = this.f1999;
        if (efVar2 != null) {
            int i7 = f1994 + 69;
            f1995 = i7 % 128;
            int i8 = i7 % 2;
            i3 = efVar2.hashCode();
        }
        return i6 + i3;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static java.lang.String m7730(char c, java.lang.String str, java.lang.String str2, java.lang.String str3, int i) {
        java.lang.String str4;
        char[] cArr = str3;
        if (str3 != null) {
            cArr = str3.toCharArray();
        }
        char[] cArr2 = cArr;
        char[] cArr3 = str2;
        if (str2 != null) {
            cArr3 = str2.toCharArray();
        }
        char[] cArr4 = cArr3;
        char[] cArr5 = str;
        if (str != null) {
            cArr5 = str.toCharArray();
        }
        char[] cArr6 = cArr5;
        synchronized (com.ironsource.adqualitysdk.sdk.i.f.f2052) {
            char[] cArr7 = (char[]) cArr4.clone();
            char[] cArr8 = (char[]) cArr6.clone();
            cArr7[0] = (char) (c ^ cArr7[0]);
            cArr8[2] = (char) (cArr8[2] + ((char) i));
            int length = cArr2.length;
            char[] cArr9 = new char[length];
            com.ironsource.adqualitysdk.sdk.i.f.f2051 = 0;
            while (com.ironsource.adqualitysdk.sdk.i.f.f2051 < length) {
                int i2 = (com.ironsource.adqualitysdk.sdk.i.f.f2051 + 2) % 4;
                int i3 = (com.ironsource.adqualitysdk.sdk.i.f.f2051 + 3) % 4;
                com.ironsource.adqualitysdk.sdk.i.f.f2053 = (char) (((cArr7[com.ironsource.adqualitysdk.sdk.i.f.f2051 % 4] * 32718) + cArr8[i2]) % 65535);
                cArr8[i3] = (char) (((cArr7[i3] * 32718) + cArr8[i2]) / 65535);
                cArr7[i3] = com.ironsource.adqualitysdk.sdk.i.f.f2053;
                cArr9[com.ironsource.adqualitysdk.sdk.i.f.f2051] = (char) ((((cArr7[i3] ^ cArr2[com.ironsource.adqualitysdk.sdk.i.f.f2051]) ^ f1998) ^ f1997) ^ f1996);
                com.ironsource.adqualitysdk.sdk.i.f.f2051++;
            }
            str4 = new java.lang.String(cArr9);
        }
        return str4;
    }
}
