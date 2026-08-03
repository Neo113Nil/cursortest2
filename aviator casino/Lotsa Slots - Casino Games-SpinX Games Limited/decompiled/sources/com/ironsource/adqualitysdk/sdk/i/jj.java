package com.ironsource.adqualitysdk.sdk.i;

/* loaded from: classes5.dex */
public final class jj {

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static int f2752 = 1;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static int f2753 = 170;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static int f2754;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private boolean f2755 = false;

    /* renamed from: ｋ, reason: contains not printable characters */
    private final com.ironsource.adqualitysdk.sdk.i.jg f2756;

    interface a {
        /* renamed from: ｋ */
        com.ironsource.adqualitysdk.sdk.i.jd mo8184();
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    static /* synthetic */ com.ironsource.adqualitysdk.sdk.i.jg m8177(com.ironsource.adqualitysdk.sdk.i.jj jjVar) {
        int i = 2 % 2;
        int i2 = f2754 + 59;
        int i3 = i2 % 128;
        f2752 = i3;
        int i4 = i2 % 2;
        com.ironsource.adqualitysdk.sdk.i.jg jgVar = jjVar.f2756;
        int i5 = i3 + 25;
        f2754 = i5 % 128;
        int i6 = i5 % 2;
        return jgVar;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    static /* synthetic */ void m8179(com.ironsource.adqualitysdk.sdk.i.jj jjVar, com.ironsource.adqualitysdk.sdk.i.ji jiVar, com.ironsource.adqualitysdk.sdk.i.jj.a aVar) {
        int i = 2 % 2;
        int i2 = f2754 + 11;
        f2752 = i2 % 128;
        int i3 = i2 % 2;
        jjVar.m8178(jiVar, aVar);
        int i4 = f2752 + 119;
        f2754 = i4 % 128;
        int i5 = i4 % 2;
    }

    public jj(android.content.Context context) {
        this.f2756 = new com.ironsource.adqualitysdk.sdk.i.jg(context.getApplicationContext());
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public final com.ironsource.adqualitysdk.sdk.i.jg m8181() {
        com.ironsource.adqualitysdk.sdk.i.jg jgVar;
        int i = 2 % 2;
        int i2 = f2754;
        int i3 = i2 + 87;
        f2752 = i3 % 128;
        if (i3 % 2 == 0) {
            jgVar = this.f2756;
            int i4 = 71 / 0;
        } else {
            jgVar = this.f2756;
        }
        int i5 = i2 + 95;
        f2752 = i5 % 128;
        if (i5 % 2 != 0) {
            return jgVar;
        }
        throw null;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final void m8182() {
        int i = 2 % 2;
        int i2 = f2752 + 73;
        f2754 = i2 % 128;
        int i3 = i2 % 2;
        this.f2756.m8158();
        this.f2755 = true;
        int i4 = f2754 + 87;
        f2752 = i4 % 128;
        int i5 = i4 % 2;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final void m8183(final java.lang.String str, final org.json.JSONObject jSONObject, com.ironsource.adqualitysdk.sdk.i.ji jiVar) {
        int i = 2 % 2;
        int i2 = f2754 + 67;
        f2752 = i2 % 128;
        int i3 = i2 % 2;
        if (android.text.TextUtils.isEmpty(str)) {
            int i4 = f2754 + 31;
            f2752 = i4 % 128;
            int i5 = i4 % 2;
            com.ironsource.adqualitysdk.sdk.i.m.m8518(m8180(((android.os.Process.getThreadPriority(0) + 20) >> 6) + 14, true, android.view.Gravity.getAbsoluteGravity(0, 0) + 273, "\ufffa￦\u0004\u000b\b\u0010\r\ufffe\uffe7\u000b\ufffe\u0000\ufffa\u0007", android.graphics.ImageFormat.getBitsPerPixel(0) + 10).intern(), m8180(android.text.TextUtils.indexOf("", "", 0) + 77, true, 266 - android.view.KeyEvent.getDeadChar(0, 0), "\u0012\uffc0\u0012\u000f\uffc0￬\ufff2\ufff5\uffc0\u0012\u0005\b\u0014\t\u0005\uffc0\u0014\u0013\u0005\u0015\u0011\u0005\u0012\uffc0\r\u000f\u0014\u0013\u0015\u0003\uffc0\u0014\u0013\u000f\u0010\uffc0\u000f\u0014\uffc0\u0005\f\u0002\u0001\u000e\ufff5\u0004\u0005\u0004\t\u0016\u000f\u0012\u0010\uffc0\u0014\u000f\u000e\uffc0\u0005\u0012\u0005\u0017\uffc0\u0012\u0005\f\u0004\u000e\u0001￨\u0005\u0013\u000e\u000f\u0010\u0013\u0005", android.graphics.Color.red(0) + 45).intern());
            return;
        }
        m8178(jiVar, new com.ironsource.adqualitysdk.sdk.i.jj.a() { // from class: com.ironsource.adqualitysdk.sdk.i.jj.1
            @Override // com.ironsource.adqualitysdk.sdk.i.jj.a
            /* renamed from: ｋ, reason: contains not printable characters */
            public final com.ironsource.adqualitysdk.sdk.i.jd mo8184() {
                return com.ironsource.adqualitysdk.sdk.i.jf.m8135(jSONObject, str);
            }
        });
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private void m8178(final com.ironsource.adqualitysdk.sdk.i.ji jiVar, final com.ironsource.adqualitysdk.sdk.i.jj.a aVar) {
        int i = 2 % 2;
        int i2 = f2754 + 79;
        int i3 = i2 % 128;
        f2752 = i3;
        int i4 = i2 % 2;
        if (this.f2755) {
            int i5 = i3 + 93;
            f2754 = i5 % 128;
            int i6 = i5 % 2;
            com.ironsource.adqualitysdk.sdk.i.m.m8524(m8180(android.view.View.getDefaultSize(0, 0) + 14, true, 273 - (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), "\ufffa￦\u0004\u000b\b\u0010\r\ufffe\uffe7\u000b\ufffe\u0000\ufffa\u0007", android.graphics.Color.alpha(0) + 9).intern(), m8180(android.view.View.combineMeasuredStates(0, 0) + 63, true, android.view.View.resolveSizeAndState(0, 0, 0) + 268, "\u0012\u0003￬ﾾ\f\u0003\u0006\u0015ﾾ\u0012\u0011\u0003\u0013\u000f\u0003\ufff0\u0003\t\r\u0014\f\u0007ﾾ\r\u0012ﾾ\u0002\u0003\u0007\u0010\u0012ﾾ\u0003\f\r\u0003\u000b\r\ufff1\f\u0015\r\u0002\u0012\u0013\u0006\u0011ﾾ\u0011\uffff\u0015ﾾ\u0010\u0003\u0005\uffff\f\uffff￫\t\u0010\r\u0015", 39 - (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16)).intern());
            return;
        }
        com.ironsource.adqualitysdk.sdk.i.ke.m8353(new com.ironsource.adqualitysdk.sdk.i.je() { // from class: com.ironsource.adqualitysdk.sdk.i.jj.2

            /* renamed from: ﮐ, reason: contains not printable characters */
            private static int f2759 = 1;

            /* renamed from: ﻐ, reason: contains not printable characters */
            private static char[] f2760 = {io.ktor.util.date.GMTDateParser.YEAR, 172, kotlin.text.Typography.section, 165, 168, 168, 152, 157, 175, kotlin.text.Typography.plusMinus, 180, kotlin.text.Typography.paragraph, 173, 154, '9', 'p', 'n', 'F', 'I', 'l', 'k', 't', io.ktor.util.date.GMTDateParser.MINUTES, 'k', 'I', 'K', 'p', 'n', 'n', 'D', 'B', 'b', 'j', 'j', io.ktor.util.date.GMTDateParser.MONTH, '-', '3', kotlinx.serialization.json.internal.AbstractJsonLexerKt.BEGIN_LIST, 'q', 'J', '@', '@', 'I', 't', 'l', 'c', io.ktor.util.date.GMTDateParser.DAY_OF_MONTH, 'l', io.ktor.util.date.GMTDateParser.SECONDS, 'I', 'I', 'k', 'l', 'q', 'o', 'n', 'p', 'l', 'B', 'C', kotlinx.serialization.json.internal.AbstractJsonLexerKt.COLON, io.ktor.util.date.GMTDateParser.SECONDS, 'k', 'k', 'I', 'F', 'n', 'q', io.ktor.util.date.GMTDateParser.SECONDS, 't', 'l', 'A', 'B', 'i', 'i', 'l', 'I', 'G', 'q', 'J', 'B', io.ktor.util.date.GMTDateParser.HOURS, 'g', 'a', 'g', 'a', kotlinx.serialization.json.internal.AbstractJsonLexerKt.COLON, 'J', io.ktor.util.date.GMTDateParser.SECONDS, 'l'};

            /* renamed from: ﻛ, reason: contains not printable characters */
            private static int f2761;

            @Override // com.ironsource.adqualitysdk.sdk.i.je
            /* renamed from: ｋ */
            public final void mo5825() {
                int i7 = 2 % 2;
                int i8 = f2761 + 77;
                f2759 = i8 % 128;
                int i9 = i8 % 2;
                m8186(jiVar, aVar);
                int i10 = f2761 + 9;
                f2759 = i10 % 128;
                if (i10 % 2 == 0) {
                    int i11 = 53 / 0;
                }
            }

            /* renamed from: ﻛ, reason: contains not printable characters */
            private void m8186(final com.ironsource.adqualitysdk.sdk.i.ji jiVar2, com.ironsource.adqualitysdk.sdk.i.jj.a aVar2) {
                int i7 = 2 % 2;
                int i8 = f2761 + 43;
                f2759 = i8 % 128;
                java.lang.Object obj = null;
                if (i8 % 2 != 0) {
                    if (com.ironsource.adqualitysdk.sdk.i.jj.m8177(com.ironsource.adqualitysdk.sdk.i.jj.this).m8155()) {
                        try {
                            final com.ironsource.adqualitysdk.sdk.i.jd mo8184 = aVar2.mo8184();
                            if (mo8184 != null) {
                                java.lang.String m8136 = com.ironsource.adqualitysdk.sdk.i.jf.m8136(mo8184);
                                java.lang.String intern = m8187("\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0001\u0001", new int[]{0, 14, 65, 0}, true).intern();
                                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                                sb.append(m8187("\u0000\u0001\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0000", new int[]{14, 46, 0, 22}, false).intern());
                                sb.append(m8136);
                                com.ironsource.adqualitysdk.sdk.i.m.m8517(intern, sb.toString());
                                com.ironsource.adqualitysdk.sdk.i.p.m8551(new com.ironsource.adqualitysdk.sdk.i.je() { // from class: com.ironsource.adqualitysdk.sdk.i.jj.2.5
                                    @Override // com.ironsource.adqualitysdk.sdk.i.je
                                    /* renamed from: ｋ */
                                    public final void mo5825() throws java.lang.Exception {
                                        com.ironsource.adqualitysdk.sdk.i.ji.this.mo5970(mo8184);
                                    }
                                });
                                return;
                            }
                            com.ironsource.adqualitysdk.sdk.i.p.m8551(new com.ironsource.adqualitysdk.sdk.i.je() { // from class: com.ironsource.adqualitysdk.sdk.i.jj.2.2

                                /* renamed from: ﮐ, reason: contains not printable characters */
                                private static int f2765 = 1;

                                /* renamed from: ﱟ, reason: contains not printable characters */
                                private static int f2766 = 0;

                                /* renamed from: ﱡ, reason: contains not printable characters */
                                private static byte[] f2767 = {34, 17, 46, 65, 59, 59, 57, 74, 47, -114, -19, kotlin.io.encoding.Base64.padSymbol, -118, -22, 63, -117, 44, 60, 58, 78, -18, 73, 53, 48, -112, -24, 66, 69, 47, 73, 59, 60, 57, 65, Byte.MIN_VALUE, -9, kotlin.io.encoding.Base64.padSymbol, 49, 72, Byte.MAX_VALUE, -23, 58, kotlin.io.encoding.Base64.padSymbol, 79, 41, kotlin.io.encoding.Base64.padSymbol, -113, -22, 63, -117, -22, 63, 57, 60, 73, -127, -22, 73, 43, com.google.common.primitives.SignedBytes.MAX_POWER_OF_TWO, 73, 46, -113, -5, 125, -24, 65, 100, 0};

                                /* renamed from: ﻏ, reason: contains not printable characters */
                                private static short[] f2768 = null;

                                /* renamed from: ﻐ, reason: contains not printable characters */
                                private static int f2769 = -2100384281;

                                /* renamed from: ﻛ, reason: contains not printable characters */
                                private static int f2770 = 69;

                                /* renamed from: ﾒ, reason: contains not printable characters */
                                private static int f2771 = -398863579;

                                @Override // com.ironsource.adqualitysdk.sdk.i.je
                                /* renamed from: ｋ */
                                public final void mo5825() throws java.lang.Exception {
                                    int i9;
                                    int i10 = 2 % 2;
                                    com.ironsource.adqualitysdk.sdk.i.jd jdVar = com.ironsource.adqualitysdk.sdk.i.jd.this;
                                    if (jdVar != null) {
                                        int i11 = f2766 + 79;
                                        f2765 = i11 % 128;
                                        if (i11 % 2 == 0) {
                                            jdVar.m8125().m8128();
                                            throw null;
                                        }
                                        i9 = jdVar.m8125().m8128();
                                        int i12 = f2765 + 83;
                                        f2766 = i12 % 128;
                                        int i13 = i12 % 2;
                                    } else {
                                        i9 = -1;
                                    }
                                    com.ironsource.adqualitysdk.sdk.i.ji jiVar3 = jiVar2;
                                    com.ironsource.adqualitysdk.sdk.i.jd jdVar2 = com.ironsource.adqualitysdk.sdk.i.jd.this;
                                    java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                                    sb2.append(m8188((short) ((android.view.ViewConfiguration.getTapTimeout() >> 16) - 60), 398863650 - android.view.View.MeasureSpec.makeMeasureSpec(0, 0), android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16, 2100384281 - (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16), (byte) (1 - (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)))).intern());
                                    sb2.append(i9);
                                    jiVar3.mo5971(jdVar2, sb2.toString());
                                    int i14 = f2765 + 117;
                                    f2766 = i14 % 128;
                                    int i15 = i14 % 2;
                                }

                                /* renamed from: ﾇ, reason: contains not printable characters */
                                private static java.lang.String m8188(short s, int i9, int i10, int i11, byte b) {
                                    java.lang.String obj2;
                                    synchronized (com.ironsource.adqualitysdk.sdk.i.n.f3098) {
                                        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                                        int i12 = f2770;
                                        int i13 = i10 + i12;
                                        int i14 = i13 == -1 ? 1 : 0;
                                        if (i14 != 0) {
                                            byte[] bArr = f2767;
                                            if (bArr != null) {
                                                i13 = (byte) (bArr[f2769 + i11] + i12);
                                            } else {
                                                i13 = (short) (f2768[f2769 + i11] + i12);
                                            }
                                        }
                                        if (i13 > 0) {
                                            com.ironsource.adqualitysdk.sdk.i.n.f3100 = ((i11 + i13) - 2) + f2769 + i14;
                                            com.ironsource.adqualitysdk.sdk.i.n.f3101 = b;
                                            com.ironsource.adqualitysdk.sdk.i.n.f3102 = (char) (i9 + f2771);
                                            sb2.append(com.ironsource.adqualitysdk.sdk.i.n.f3102);
                                            com.ironsource.adqualitysdk.sdk.i.n.f3103 = com.ironsource.adqualitysdk.sdk.i.n.f3102;
                                            com.ironsource.adqualitysdk.sdk.i.n.f3099 = 1;
                                            while (com.ironsource.adqualitysdk.sdk.i.n.f3099 < i13) {
                                                byte[] bArr2 = f2767;
                                                if (bArr2 != null) {
                                                    int i15 = com.ironsource.adqualitysdk.sdk.i.n.f3100;
                                                    com.ironsource.adqualitysdk.sdk.i.n.f3100 = i15 - 1;
                                                    com.ironsource.adqualitysdk.sdk.i.n.f3102 = (char) (com.ironsource.adqualitysdk.sdk.i.n.f3103 + (((byte) (bArr2[i15] + s)) ^ com.ironsource.adqualitysdk.sdk.i.n.f3101));
                                                } else {
                                                    short[] sArr = f2768;
                                                    int i16 = com.ironsource.adqualitysdk.sdk.i.n.f3100;
                                                    com.ironsource.adqualitysdk.sdk.i.n.f3100 = i16 - 1;
                                                    com.ironsource.adqualitysdk.sdk.i.n.f3102 = (char) (com.ironsource.adqualitysdk.sdk.i.n.f3103 + (((short) (sArr[i16] + s)) ^ com.ironsource.adqualitysdk.sdk.i.n.f3101));
                                                }
                                                sb2.append(com.ironsource.adqualitysdk.sdk.i.n.f3102);
                                                com.ironsource.adqualitysdk.sdk.i.n.f3103 = com.ironsource.adqualitysdk.sdk.i.n.f3102;
                                                com.ironsource.adqualitysdk.sdk.i.n.f3099++;
                                            }
                                        }
                                        obj2 = sb2.toString();
                                    }
                                    return obj2;
                                }
                            });
                            return;
                        } catch (java.lang.Exception e) {
                            java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                            sb2.append(m8187("\u0001\u0000\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0000", new int[]{60, 30, 0, 26}, true).intern());
                            sb2.append(e.getLocalizedMessage());
                            jiVar2.mo5971(null, sb2.toString());
                            return;
                        }
                    }
                    int i9 = f2759 + 67;
                    f2761 = i9 % 128;
                    if (i9 % 2 == 0) {
                        m8185(jiVar2, aVar2);
                        return;
                    } else {
                        m8185(jiVar2, aVar2);
                        int i10 = 23 / 0;
                        return;
                    }
                }
                com.ironsource.adqualitysdk.sdk.i.jj.m8177(com.ironsource.adqualitysdk.sdk.i.jj.this).m8155();
                super.hashCode();
                throw null;
            }

            /* renamed from: ﻐ, reason: contains not printable characters */
            private void m8185(final com.ironsource.adqualitysdk.sdk.i.ji jiVar2, final com.ironsource.adqualitysdk.sdk.i.jj.a aVar2) {
                int i7 = 2 % 2;
                com.ironsource.adqualitysdk.sdk.i.jj.m8177(com.ironsource.adqualitysdk.sdk.i.jj.this).m8157(new com.ironsource.adqualitysdk.sdk.i.jb() { // from class: com.ironsource.adqualitysdk.sdk.i.jj.2.3
                    @Override // com.ironsource.adqualitysdk.sdk.i.jb
                    /* renamed from: ﻐ */
                    public final void mo5978() {
                        com.ironsource.adqualitysdk.sdk.i.jj.m8177(com.ironsource.adqualitysdk.sdk.i.jj.this).m8159(this);
                        com.ironsource.adqualitysdk.sdk.i.jj.m8179(com.ironsource.adqualitysdk.sdk.i.jj.this, jiVar2, aVar2);
                    }
                });
                int i8 = f2759 + 51;
                f2761 = i8 % 128;
                if (i8 % 2 != 0) {
                    throw null;
                }
            }

            /* renamed from: ﾇ, reason: contains not printable characters */
            private static java.lang.String m8187(java.lang.String str, int[] iArr, boolean z) {
                java.lang.String str2;
                byte[] bArr = str;
                if (str != null) {
                    bArr = str.getBytes(com.google.android.exoplayer2.C.ISO88591_NAME);
                }
                byte[] bArr2 = bArr;
                synchronized (com.ironsource.adqualitysdk.sdk.i.h.f2296) {
                    int i7 = iArr[0];
                    int i8 = iArr[1];
                    int i9 = iArr[2];
                    int i10 = iArr[3];
                    char[] cArr = new char[i8];
                    java.lang.System.arraycopy(f2760, i7, cArr, 0, i8);
                    if (bArr2 != null) {
                        char[] cArr2 = new char[i8];
                        com.ironsource.adqualitysdk.sdk.i.h.f2297 = 0;
                        char c = 0;
                        while (com.ironsource.adqualitysdk.sdk.i.h.f2297 < i8) {
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
                    if (i10 > 0) {
                        char[] cArr3 = new char[i8];
                        java.lang.System.arraycopy(cArr, 0, cArr3, 0, i8);
                        int i11 = i8 - i10;
                        java.lang.System.arraycopy(cArr3, 0, cArr, i11, i10);
                        java.lang.System.arraycopy(cArr3, i10, cArr, 0, i11);
                    }
                    if (z) {
                        char[] cArr4 = new char[i8];
                        com.ironsource.adqualitysdk.sdk.i.h.f2297 = 0;
                        while (com.ironsource.adqualitysdk.sdk.i.h.f2297 < i8) {
                            cArr4[com.ironsource.adqualitysdk.sdk.i.h.f2297] = cArr[(i8 - com.ironsource.adqualitysdk.sdk.i.h.f2297) - 1];
                            com.ironsource.adqualitysdk.sdk.i.h.f2297++;
                        }
                        cArr = cArr4;
                    }
                    if (i9 > 0) {
                        com.ironsource.adqualitysdk.sdk.i.h.f2297 = 0;
                        while (com.ironsource.adqualitysdk.sdk.i.h.f2297 < i8) {
                            cArr[com.ironsource.adqualitysdk.sdk.i.h.f2297] = (char) (cArr[com.ironsource.adqualitysdk.sdk.i.h.f2297] - iArr[2]);
                            com.ironsource.adqualitysdk.sdk.i.h.f2297++;
                        }
                    }
                    str2 = new java.lang.String(cArr);
                }
                return str2;
            }
        });
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static java.lang.String m8180(int i, boolean z, int i2, java.lang.String str, int i3) {
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
                cArr3[i4] = (char) (cArr3[i4] - f2753);
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
