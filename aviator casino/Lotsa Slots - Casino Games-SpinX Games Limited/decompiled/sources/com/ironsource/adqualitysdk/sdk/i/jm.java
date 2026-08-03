package com.ironsource.adqualitysdk.sdk.i;

/* loaded from: classes5.dex */
public class jm {

    /* renamed from: ﮐ, reason: contains not printable characters */
    private static int f2825 = 1;

    /* renamed from: ﱡ, reason: contains not printable characters */
    private static int f2826 = 0;

    /* renamed from: ﻏ, reason: contains not printable characters */
    private static boolean f2827 = true;

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static boolean f2828 = true;

    /* renamed from: ｋ, reason: contains not printable characters */
    private static char[] f2829 = {187, 213, 233, 198, 209, 220, 229, 195, 228, 223, 226, kotlin.text.Typography.times, 158, 227, 224, 212};

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static android.os.Handler f2830 = null;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static int f2831 = 112;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private com.ironsource.adqualitysdk.sdk.i.io f2832;

    public interface d {
        /* renamed from: ﾒ, reason: contains not printable characters */
        void mo8234();
    }

    public interface e {
        /* renamed from: ﻐ, reason: contains not printable characters */
        void mo8235(java.lang.String str);
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    static /* synthetic */ void m8223(com.ironsource.adqualitysdk.sdk.i.jm jmVar, com.ironsource.adqualitysdk.sdk.i.jm.d dVar) {
        int i = 2 % 2;
        int i2 = f2826 + 69;
        f2825 = i2 % 128;
        int i3 = i2 % 2;
        jmVar.m8220(dVar);
        int i4 = f2825 + 105;
        f2826 = i4 % 128;
        int i5 = i4 % 2;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    public static android.os.Handler m8219() {
        android.os.Handler handler;
        synchronized (com.ironsource.adqualitysdk.sdk.i.jm.class) {
            if (f2830 == null) {
                android.os.HandlerThread handlerThread = new android.os.HandlerThread(m8221(null, android.text.TextUtils.getOffsetAfter("", 0) + 127, null, "\u0082\u008c\u0085\u008b\u008a\u0089\u0088\u0082\u0087\u0086\u0085\u0084\u0083\u0082\u0081").intern());
                handlerThread.start();
                f2830 = new android.os.Handler(handlerThread.getLooper());
            }
            handler = f2830;
        }
        return handler;
    }

    public jm(android.content.Context context, java.lang.String str, java.lang.String str2) {
        this.f2832 = new com.ironsource.adqualitysdk.sdk.i.io(context, str, str2);
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final int m8228(java.lang.String str) {
        int i = 2 % 2;
        int i2 = f2825 + 113;
        f2826 = i2 % 128;
        int i3 = i2 % 2;
        com.ironsource.adqualitysdk.sdk.i.io ioVar = this.f2832;
        if (i3 == 0) {
            return ioVar.m8082(str);
        }
        ioVar.m8082(str);
        throw null;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public final java.util.HashMap<java.lang.String, java.lang.String> m8231(java.lang.String str, int i) {
        java.util.HashMap<java.lang.String, java.lang.String> m8079;
        int i2 = 2 % 2;
        int i3 = f2825 + 123;
        f2826 = i3 % 128;
        if (i3 % 2 != 0) {
            m8079 = this.f2832.m8079(str, i);
            int i4 = 11 / 0;
        } else {
            m8079 = this.f2832.m8079(str, i);
        }
        int i5 = f2825 + 29;
        f2826 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 96 / 0;
        }
        return m8079;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public final java.lang.String m8230(java.lang.String str) {
        int i = 2 % 2;
        int i2 = f2825 + 71;
        f2826 = i2 % 128;
        int i3 = i2 % 2;
        com.ironsource.adqualitysdk.sdk.i.io ioVar = this.f2832;
        if (i3 == 0) {
            return ioVar.m8078(str);
        }
        ioVar.m8078(str);
        java.lang.Object obj = null;
        super.hashCode();
        throw null;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    public final void m8225(final java.lang.String str, final com.ironsource.adqualitysdk.sdk.i.jm.e eVar) {
        int i = 2 % 2;
        m8219().post(new com.ironsource.adqualitysdk.sdk.i.je() { // from class: com.ironsource.adqualitysdk.sdk.i.jm.1
            @Override // com.ironsource.adqualitysdk.sdk.i.je
            /* renamed from: ｋ */
            public final void mo5825() {
                final java.lang.String m8230 = com.ironsource.adqualitysdk.sdk.i.jm.this.m8230(str);
                com.ironsource.adqualitysdk.sdk.i.p.m8551(new com.ironsource.adqualitysdk.sdk.i.je() { // from class: com.ironsource.adqualitysdk.sdk.i.jm.1.2
                    @Override // com.ironsource.adqualitysdk.sdk.i.je
                    /* renamed from: ｋ */
                    public final void mo5825() {
                        eVar.mo8235(m8230);
                    }
                });
            }
        });
        int i2 = f2825 + 11;
        f2826 = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    public final void m8224(java.lang.String str) {
        int i = 2 % 2;
        int i2 = f2825 + 101;
        f2826 = i2 % 128;
        int i3 = i2 % 2;
        this.f2832.m8080(str);
        int i4 = f2826 + 125;
        f2825 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 87 / 0;
        }
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final void m8229(java.lang.String str, java.lang.String str2) {
        int i = 2 % 2;
        int i2 = f2825 + 83;
        f2826 = i2 % 128;
        int i3 = i2 % 2;
        this.f2832.m8081(str, str2);
        if (i3 != 0) {
            int i4 = 99 / 0;
        }
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    public final void m8226(java.lang.String str, java.lang.String str2) {
        int i = 2 % 2;
        int i2 = f2825 + 33;
        f2826 = i2 % 128;
        int i3 = i2 % 2;
        java.lang.Object obj = null;
        m8233(str, str2, null);
        if (i3 == 0) {
            return;
        }
        super.hashCode();
        throw null;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final void m8233(final java.lang.String str, final java.lang.String str2, final com.ironsource.adqualitysdk.sdk.i.jm.d dVar) {
        int i = 2 % 2;
        m8219().post(new com.ironsource.adqualitysdk.sdk.i.je() { // from class: com.ironsource.adqualitysdk.sdk.i.jm.5
            @Override // com.ironsource.adqualitysdk.sdk.i.je
            /* renamed from: ｋ */
            public final void mo5825() {
                com.ironsource.adqualitysdk.sdk.i.jm.this.m8229(str, str2);
                com.ironsource.adqualitysdk.sdk.i.jm.m8223(com.ironsource.adqualitysdk.sdk.i.jm.this, dVar);
            }
        });
        int i2 = f2825 + 37;
        f2826 = i2 % 128;
        int i3 = i2 % 2;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public final void m8232(java.lang.String str, java.lang.String str2) {
        int i = 2 % 2;
        int i2 = f2825 + 53;
        f2826 = i2 % 128;
        if (i2 % 2 == 0) {
            m8229(str, str2);
            m8229(m8222(str), java.lang.Long.toString(com.ironsource.adqualitysdk.sdk.i.ke.m8354()));
            int i3 = f2826 + 49;
            f2825 = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 88 / 0;
                return;
            }
            return;
        }
        m8229(str, str2);
        m8229(m8222(str), java.lang.Long.toString(com.ironsource.adqualitysdk.sdk.i.ke.m8354()));
        throw null;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    public final void m8227(final java.lang.String str, final java.lang.String str2, final com.ironsource.adqualitysdk.sdk.i.jm.d dVar) {
        int i = 2 % 2;
        m8219().post(new com.ironsource.adqualitysdk.sdk.i.je() { // from class: com.ironsource.adqualitysdk.sdk.i.jm.3
            @Override // com.ironsource.adqualitysdk.sdk.i.je
            /* renamed from: ｋ */
            public final void mo5825() {
                com.ironsource.adqualitysdk.sdk.i.jm.this.m8232(str, str2);
                com.ironsource.adqualitysdk.sdk.i.jm.m8223(com.ironsource.adqualitysdk.sdk.i.jm.this, dVar);
            }
        });
        int i2 = f2826 + 1;
        f2825 = i2 % 128;
        int i3 = i2 % 2;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static java.lang.String m8222(java.lang.String str) {
        int i = 2 % 2;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(str);
        sb.append(m8221(null, (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 127, null, "\u0082\u0089\u0085\u0090\u008f\u0087\u0089\u008e\u0085\u0086\u008d").intern());
        java.lang.String obj = sb.toString();
        int i2 = f2826 + 73;
        f2825 = i2 % 128;
        int i3 = i2 % 2;
        return obj;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private void m8220(com.ironsource.adqualitysdk.sdk.i.jm.d dVar) {
        int i = 2 % 2;
        if (dVar != null) {
            com.ironsource.adqualitysdk.sdk.i.p.m8551(new com.ironsource.adqualitysdk.sdk.i.je(dVar) { // from class: com.ironsource.adqualitysdk.sdk.i.jm.2
                @Override // com.ironsource.adqualitysdk.sdk.i.je
                /* renamed from: ｋ */
                public final void mo5825() {
                }
            });
            int i2 = f2826 + 97;
            f2825 = i2 % 128;
            int i3 = i2 % 2;
        }
        int i4 = f2826 + 33;
        f2825 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 37 / 0;
        }
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    private static java.lang.String m8221(java.lang.String str, int i, int[] iArr, java.lang.String str2) {
        byte[] bArr = str2;
        if (str2 != null) {
            bArr = str2.getBytes(com.google.android.exoplayer2.C.ISO88591_NAME);
        }
        byte[] bArr2 = bArr;
        char[] cArr = str;
        if (str != null) {
            cArr = str.toCharArray();
        }
        char[] cArr2 = cArr;
        synchronized (com.ironsource.adqualitysdk.sdk.i.k.f2966) {
            char[] cArr3 = f2829;
            int i2 = f2831;
            if (f2827) {
                int length = bArr2.length;
                com.ironsource.adqualitysdk.sdk.i.k.f2965 = length;
                char[] cArr4 = new char[length];
                com.ironsource.adqualitysdk.sdk.i.k.f2967 = 0;
                while (com.ironsource.adqualitysdk.sdk.i.k.f2967 < com.ironsource.adqualitysdk.sdk.i.k.f2965) {
                    cArr4[com.ironsource.adqualitysdk.sdk.i.k.f2967] = (char) (cArr3[bArr2[(com.ironsource.adqualitysdk.sdk.i.k.f2965 - 1) - com.ironsource.adqualitysdk.sdk.i.k.f2967] + i] - i2);
                    com.ironsource.adqualitysdk.sdk.i.k.f2967++;
                }
                return new java.lang.String(cArr4);
            }
            if (f2828) {
                int length2 = cArr2.length;
                com.ironsource.adqualitysdk.sdk.i.k.f2965 = length2;
                char[] cArr5 = new char[length2];
                com.ironsource.adqualitysdk.sdk.i.k.f2967 = 0;
                while (com.ironsource.adqualitysdk.sdk.i.k.f2967 < com.ironsource.adqualitysdk.sdk.i.k.f2965) {
                    cArr5[com.ironsource.adqualitysdk.sdk.i.k.f2967] = (char) (cArr3[cArr2[(com.ironsource.adqualitysdk.sdk.i.k.f2965 - 1) - com.ironsource.adqualitysdk.sdk.i.k.f2967] - i] - i2);
                    com.ironsource.adqualitysdk.sdk.i.k.f2967++;
                }
                return new java.lang.String(cArr5);
            }
            int length3 = iArr.length;
            com.ironsource.adqualitysdk.sdk.i.k.f2965 = length3;
            char[] cArr6 = new char[length3];
            com.ironsource.adqualitysdk.sdk.i.k.f2967 = 0;
            while (com.ironsource.adqualitysdk.sdk.i.k.f2967 < com.ironsource.adqualitysdk.sdk.i.k.f2965) {
                cArr6[com.ironsource.adqualitysdk.sdk.i.k.f2967] = (char) (cArr3[iArr[(com.ironsource.adqualitysdk.sdk.i.k.f2965 - 1) - com.ironsource.adqualitysdk.sdk.i.k.f2967] - i] - i2);
                com.ironsource.adqualitysdk.sdk.i.k.f2967++;
            }
            return new java.lang.String(cArr6);
        }
    }
}
