package com.ironsource.adqualitysdk.sdk.i;

/* loaded from: classes5.dex */
public final class ho extends com.ironsource.adqualitysdk.sdk.i.hi<android.media.MediaPlayer.OnPreparedListener> implements android.media.MediaPlayer.OnPreparedListener {

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static int f2381 = 1;

    /* renamed from: ｋ, reason: contains not printable characters */
    private static int f2382;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static char[] f2383 = {'\'', '^', '_', 'a', 'k', 'j', io.ktor.util.date.GMTDateParser.HOURS, 'i', 'k', io.ktor.util.date.GMTDateParser.DAY_OF_MONTH, 'X', 'Z', 'n', io.ktor.util.date.GMTDateParser.SECONDS, 'l', 'i', 'i', 'k', kotlinx.serialization.json.internal.AbstractJsonLexerKt.BEGIN_LIST, 'T', io.ktor.util.date.GMTDateParser.DAY_OF_MONTH, 'i', 'p', 'i', 'j', 'q', 'p', '9', io.ktor.util.date.GMTDateParser.SECONDS, 'l', 'i', 'i', 'k', 'I', 'G', 'n', '_', 'a', 'k', 'j', io.ktor.util.date.GMTDateParser.HOURS, 'i', 'k', io.ktor.util.date.GMTDateParser.DAY_OF_MONTH, 'T', kotlinx.serialization.json.internal.AbstractJsonLexerKt.BEGIN_LIST, 'r', 'p', 'p', 'I', 'D', 'k', 'G', 'F', '`', kotlinx.serialization.json.internal.AbstractJsonLexerKt.BEGIN_LIST, 'W', 'Z'};

    /* renamed from: ﻛ, reason: contains not printable characters */
    private com.ironsource.adqualitysdk.sdk.i.ho.c f2384;

    public interface c {
        /* renamed from: ﾇ */
        void mo7405(com.ironsource.adqualitysdk.sdk.i.ho hoVar, android.media.MediaPlayer mediaPlayer);
    }

    public ho(android.media.MediaPlayer.OnPreparedListener onPreparedListener, com.ironsource.adqualitysdk.sdk.i.ho.c cVar) {
        super(onPreparedListener);
        this.f2384 = cVar;
    }

    @Override // android.media.MediaPlayer.OnPreparedListener
    public final void onPrepared(android.media.MediaPlayer mediaPlayer) {
        int i = 2 % 2;
        int i2 = f2381 + 27;
        f2382 = i2 % 128;
        try {
            if (i2 % 2 != 0) {
                this.f2384.mo7405(this, mediaPlayer);
                int i3 = 26 / 0;
            } else {
                this.f2384.mo7405(this, mediaPlayer);
            }
        } catch (java.lang.Throwable th) {
            com.ironsource.adqualitysdk.sdk.i.kl.m8455(m7839("\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0001", new int[]{0, 27, 0, 0}, false).intern(), m7839("\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0000\u0001", new int[]{27, 31, 0, 17}, false).intern(), th, false);
        }
        if (mo6360() != null) {
            mo6360().onPrepared(mediaPlayer);
            int i4 = f2381 + 109;
            f2382 = i4 % 128;
            int i5 = i4 % 2;
        }
        int i6 = f2382 + 49;
        f2381 = i6 % 128;
        if (i6 % 2 == 0) {
            throw null;
        }
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static java.lang.String m7839(java.lang.String str, int[] iArr, boolean z) {
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
            java.lang.System.arraycopy(f2383, i, cArr, 0, i2);
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
