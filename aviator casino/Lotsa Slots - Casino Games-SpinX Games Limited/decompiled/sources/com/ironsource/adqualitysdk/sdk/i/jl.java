package com.ironsource.adqualitysdk.sdk.i;

/* loaded from: classes5.dex */
public class jl {

    /* renamed from: ﮐ, reason: contains not printable characters */
    private static char[] f2812 = {23, '4', '2', 'i', 'g', '1', 'H', 'P', 'k', 'i', 'n', 'q', 'l', io.ktor.util.date.GMTDateParser.DAY_OF_MONTH, 23, 'R', 'r', 'i'};

    /* renamed from: ﺙ, reason: contains not printable characters */
    private static int f2813 = 0;

    /* renamed from: ﻏ, reason: contains not printable characters */
    private static int f2814 = 1;

    /* renamed from: ﻐ, reason: contains not printable characters */
    private java.lang.String f2815;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private java.lang.String f2816;

    /* renamed from: ｋ, reason: contains not printable characters */
    private java.lang.String f2817;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private java.lang.String f2818;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private boolean f2819;

    /* synthetic */ jl(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, byte b) {
        this(str, str2, str3, str4);
    }

    private jl(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        this.f2815 = str;
        this.f2818 = str2;
        this.f2816 = str3;
        this.f2817 = str4;
        this.f2819 = true;
    }

    /* renamed from: ﱡ, reason: contains not printable characters */
    private static java.lang.String m8207() {
        int i = 2 % 2;
        int i2 = f2813 + 49;
        f2814 = i2 % 128;
        int i3 = i2 % 2;
        java.lang.String mo6053 = com.ironsource.adqualitysdk.sdk.i.ar.m6038().mo6053();
        int i4 = f2814 + 83;
        f2813 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 0 / 0;
        }
        return mo6053;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    protected final java.lang.String m8216() {
        int i = 2 % 2;
        int i2 = f2814 + 119;
        int i3 = i2 % 128;
        f2813 = i3;
        int i4 = i2 % 2;
        java.lang.String str = this.f2815;
        int i5 = i3 + 83;
        f2814 = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        java.lang.Object obj = null;
        super.hashCode();
        throw null;
    }

    /* renamed from: ﻏ, reason: contains not printable characters */
    private java.lang.String m8209() {
        int i = 2 % 2;
        int i2 = f2814 + 95;
        f2813 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.f2818;
        }
        throw null;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    protected final java.lang.String m8213() {
        int i = 2 % 2;
        int i2 = f2814 + 95;
        f2813 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.f2816;
        }
        throw null;
    }

    /* renamed from: ﱟ, reason: contains not printable characters */
    private java.lang.String m8206() {
        int i = 2 % 2;
        int i2 = f2814;
        int i3 = i2 + 35;
        f2813 = i3 % 128;
        int i4 = i3 % 2;
        java.lang.String str = this.f2817;
        int i5 = i2 + 67;
        f2813 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    public final void m8211() {
        int i = 2 % 2;
        int i2 = f2814 + 107;
        int i3 = i2 % 128;
        f2813 = i3;
        int i4 = i2 % 2;
        this.f2819 = false;
        int i5 = i3 + 79;
        f2814 = i5 % 128;
        int i6 = i5 % 2;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public java.lang.String mo8214() {
        int i = 2 % 2;
        java.lang.String m8208 = m8208();
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(m8208);
        sb.append(this.f2815);
        sb.append(m8210("\u0001", new int[]{0, 1, 0, 1}, true).intern());
        sb.append(this.f2818);
        sb.append(m8210("\u0001", new int[]{1, 1, 59, 0}, true).intern());
        sb.append(m8210("\u0000\u0000\u0001", new int[]{2, 3, 0, 0}, true).intern());
        sb.append(m8210("\u0001", new int[]{1, 1, 59, 0}, true).intern());
        sb.append(this.f2816);
        sb.append(m8210("\u0001", new int[]{1, 1, 59, 0}, true).intern());
        sb.append(this.f2817);
        java.lang.String obj = sb.toString();
        int i2 = f2814 + 89;
        f2813 = i2 % 128;
        if (i2 % 2 == 0) {
            return obj;
        }
        java.lang.Object obj2 = null;
        super.hashCode();
        throw null;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    protected final java.lang.String m8215(java.lang.String str) {
        int i = 2 % 2;
        java.lang.String m8208 = m8208();
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(m8208);
        sb.append(m8216());
        sb.append(m8210("\u0001", new int[]{0, 1, 0, 1}, true).intern());
        sb.append(m8210("\u0000\u0000\u0001", new int[]{2, 3, 0, 0}, true).intern());
        sb.append(m8210("\u0001", new int[]{0, 1, 0, 1}, true).intern());
        sb.append(str);
        sb.append(m8210("\u0001", new int[]{0, 1, 0, 1}, true).intern());
        sb.append(m8209());
        sb.append(m8210("\u0001", new int[]{1, 1, 59, 0}, true).intern());
        sb.append(m8210("\u0000\u0000\u0001", new int[]{2, 3, 0, 0}, true).intern());
        sb.append(m8210("\u0001", new int[]{1, 1, 59, 0}, true).intern());
        sb.append(m8213());
        sb.append(m8210("\u0001", new int[]{1, 1, 59, 0}, true).intern());
        sb.append(m8206());
        java.lang.String obj = sb.toString();
        int i2 = f2813 + 57;
        f2814 = i2 % 128;
        int i3 = i2 % 2;
        return obj;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final java.lang.String m8212() {
        int i = 2 % 2;
        int i2 = f2814 + 81;
        f2813 = i2 % 128;
        int i3 = i2 % 2;
        java.lang.String replace = mo8214().replace(m8210("\u0001", new int[]{0, 1, 0, 1}, true).intern(), m8210("\u0001", new int[]{1, 1, 59, 0}, true).intern());
        int i4 = f2814 + 53;
        f2813 = i4 % 128;
        int i5 = i4 % 2;
        return replace;
    }

    /* renamed from: ﺙ, reason: contains not printable characters */
    private java.lang.String m8208() {
        int i = 2 % 2;
        java.lang.String intern = m8210("\u0000\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0001", new int[]{5, 9, 0, 2}, false).intern();
        java.lang.String m8207 = m8207();
        if (this.f2819) {
            int i2 = f2814 + 69;
            f2813 = i2 % 128;
            int i3 = i2 % 2;
            if (!android.text.TextUtils.isEmpty(m8207)) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append(intern);
                sb.append(m8210("\u0001\u0001\u0000\u0001", new int[]{14, 4, 0, 0}, true).intern());
                sb.append(m8207);
                sb.append(m8210("\u0001", new int[]{0, 1, 0, 1}, true).intern());
                intern = sb.toString();
            }
        }
        int i4 = f2813 + 119;
        f2814 = i4 % 128;
        int i5 = i4 % 2;
        return intern;
    }

    public static class d extends com.ironsource.adqualitysdk.sdk.i.jl {

        /* renamed from: ｋ, reason: contains not printable characters */
        private static char[] f2822 = {135, 274, 278, 273, '1', io.ktor.util.date.GMTDateParser.HOURS, 'i', 'I', 'N', 'n', 'q', 'n'};

        public d(java.lang.String str, java.lang.String str2) {
            super(str, m8217("\u0000\u0000\u0001\u0000", new int[]{0, 4, 168, 0}, true).intern(), str2, m8217("\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0001", new int[]{4, 8, 0, 0}, true).intern(), (byte) 0);
        }

        /* renamed from: ﻛ, reason: contains not printable characters */
        private static java.lang.String m8217(java.lang.String str, int[] iArr, boolean z) {
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
                java.lang.System.arraycopy(f2822, i, cArr, 0, i2);
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

    public static class c extends com.ironsource.adqualitysdk.sdk.i.jl.d {

        /* renamed from: ｋ, reason: contains not printable characters */
        private final java.lang.String f2821;

        public c(java.lang.String str, java.lang.String str2, java.lang.String str3) {
            super(str, str2);
            this.f2821 = str3;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.jl
        /* renamed from: ﾇ */
        public final java.lang.String mo8214() {
            return m8215(this.f2821);
        }
    }

    public static class e extends com.ironsource.adqualitysdk.sdk.i.jl {

        /* renamed from: ﻛ, reason: contains not printable characters */
        private static char f2823 = 3;

        /* renamed from: ﾒ, reason: contains not printable characters */
        private static char[] f2824 = {'c', 'o', 'n', 'j', io.ktor.util.date.GMTDateParser.SECONDS, '.', 'e', io.ktor.util.date.GMTDateParser.DAY_OF_MONTH, 'f'};

        public e(java.lang.String str, java.lang.String str2) {
            super(str, m8218(3 - android.text.TextUtils.lastIndexOf("", '0'), "\u0001\u0002\u0096\u0096", (byte) (android.view.View.getDefaultSize(0, 0) + 40)).intern(), str2, m8218(8 - android.view.KeyEvent.normalizeMetaState(0), "\u0004\u0005\u0002\u0000\u0003\b\u0000\u0001", (byte) (64 - (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)))).intern(), (byte) 0);
        }

        /* renamed from: ﾇ, reason: contains not printable characters */
        private static java.lang.String m8218(int i, java.lang.String str, byte b) {
            java.lang.String str2;
            char[] cArr = str;
            if (str != null) {
                cArr = str.toCharArray();
            }
            char[] cArr2 = cArr;
            synchronized (com.ironsource.adqualitysdk.sdk.i.j.f2684) {
                char[] cArr3 = f2824;
                char c = f2823;
                char[] cArr4 = new char[i];
                if (i % 2 != 0) {
                    i--;
                    cArr4[i] = (char) (cArr2[i] - b);
                }
                if (i > 1) {
                    com.ironsource.adqualitysdk.sdk.i.j.f2691 = 0;
                    while (com.ironsource.adqualitysdk.sdk.i.j.f2691 < i) {
                        com.ironsource.adqualitysdk.sdk.i.j.f2690 = cArr2[com.ironsource.adqualitysdk.sdk.i.j.f2691];
                        com.ironsource.adqualitysdk.sdk.i.j.f2687 = cArr2[com.ironsource.adqualitysdk.sdk.i.j.f2691 + 1];
                        if (com.ironsource.adqualitysdk.sdk.i.j.f2690 == com.ironsource.adqualitysdk.sdk.i.j.f2687) {
                            cArr4[com.ironsource.adqualitysdk.sdk.i.j.f2691] = (char) (com.ironsource.adqualitysdk.sdk.i.j.f2690 - b);
                            cArr4[com.ironsource.adqualitysdk.sdk.i.j.f2691 + 1] = (char) (com.ironsource.adqualitysdk.sdk.i.j.f2687 - b);
                        } else {
                            com.ironsource.adqualitysdk.sdk.i.j.f2689 = com.ironsource.adqualitysdk.sdk.i.j.f2690 / c;
                            com.ironsource.adqualitysdk.sdk.i.j.f2686 = com.ironsource.adqualitysdk.sdk.i.j.f2690 % c;
                            com.ironsource.adqualitysdk.sdk.i.j.f2688 = com.ironsource.adqualitysdk.sdk.i.j.f2687 / c;
                            com.ironsource.adqualitysdk.sdk.i.j.f2685 = com.ironsource.adqualitysdk.sdk.i.j.f2687 % c;
                            if (com.ironsource.adqualitysdk.sdk.i.j.f2686 == com.ironsource.adqualitysdk.sdk.i.j.f2685) {
                                com.ironsource.adqualitysdk.sdk.i.j.f2689 = ((com.ironsource.adqualitysdk.sdk.i.j.f2689 + c) - 1) % c;
                                com.ironsource.adqualitysdk.sdk.i.j.f2688 = ((com.ironsource.adqualitysdk.sdk.i.j.f2688 + c) - 1) % c;
                                int i2 = (com.ironsource.adqualitysdk.sdk.i.j.f2689 * c) + com.ironsource.adqualitysdk.sdk.i.j.f2686;
                                int i3 = (com.ironsource.adqualitysdk.sdk.i.j.f2688 * c) + com.ironsource.adqualitysdk.sdk.i.j.f2685;
                                cArr4[com.ironsource.adqualitysdk.sdk.i.j.f2691] = cArr3[i2];
                                cArr4[com.ironsource.adqualitysdk.sdk.i.j.f2691 + 1] = cArr3[i3];
                            } else if (com.ironsource.adqualitysdk.sdk.i.j.f2689 == com.ironsource.adqualitysdk.sdk.i.j.f2688) {
                                com.ironsource.adqualitysdk.sdk.i.j.f2686 = ((com.ironsource.adqualitysdk.sdk.i.j.f2686 + c) - 1) % c;
                                com.ironsource.adqualitysdk.sdk.i.j.f2685 = ((com.ironsource.adqualitysdk.sdk.i.j.f2685 + c) - 1) % c;
                                int i4 = (com.ironsource.adqualitysdk.sdk.i.j.f2689 * c) + com.ironsource.adqualitysdk.sdk.i.j.f2686;
                                int i5 = (com.ironsource.adqualitysdk.sdk.i.j.f2688 * c) + com.ironsource.adqualitysdk.sdk.i.j.f2685;
                                cArr4[com.ironsource.adqualitysdk.sdk.i.j.f2691] = cArr3[i4];
                                cArr4[com.ironsource.adqualitysdk.sdk.i.j.f2691 + 1] = cArr3[i5];
                            } else {
                                int i6 = (com.ironsource.adqualitysdk.sdk.i.j.f2689 * c) + com.ironsource.adqualitysdk.sdk.i.j.f2685;
                                int i7 = (com.ironsource.adqualitysdk.sdk.i.j.f2688 * c) + com.ironsource.adqualitysdk.sdk.i.j.f2686;
                                cArr4[com.ironsource.adqualitysdk.sdk.i.j.f2691] = cArr3[i6];
                                cArr4[com.ironsource.adqualitysdk.sdk.i.j.f2691 + 1] = cArr3[i7];
                            }
                        }
                        com.ironsource.adqualitysdk.sdk.i.j.f2691 += 2;
                    }
                }
                str2 = new java.lang.String(cArr4);
            }
            return str2;
        }
    }

    public static class a extends com.ironsource.adqualitysdk.sdk.i.jl.e {

        /* renamed from: ﾒ, reason: contains not printable characters */
        private final java.lang.String f2820;

        public a(java.lang.String str, java.lang.String str2, java.lang.String str3) {
            super(str, str2);
            this.f2820 = str3;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.jl
        /* renamed from: ﾇ */
        public final java.lang.String mo8214() {
            return m8215(this.f2820);
        }
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static java.lang.String m8210(java.lang.String str, int[] iArr, boolean z) {
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
            java.lang.System.arraycopy(f2812, i, cArr, 0, i2);
            if (bArr2 != null) {
                char[] cArr2 = new char[i2];
                com.ironsource.adqualitysdk.sdk.i.h.f2297 = 0;
                char c2 = 0;
                while (com.ironsource.adqualitysdk.sdk.i.h.f2297 < i2) {
                    if (bArr2[com.ironsource.adqualitysdk.sdk.i.h.f2297] == 1) {
                        cArr2[com.ironsource.adqualitysdk.sdk.i.h.f2297] = (char) (((cArr[com.ironsource.adqualitysdk.sdk.i.h.f2297] << 1) + 1) - c2);
                    } else {
                        cArr2[com.ironsource.adqualitysdk.sdk.i.h.f2297] = (char) ((cArr[com.ironsource.adqualitysdk.sdk.i.h.f2297] << 1) - c2);
                    }
                    c2 = cArr2[com.ironsource.adqualitysdk.sdk.i.h.f2297];
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
