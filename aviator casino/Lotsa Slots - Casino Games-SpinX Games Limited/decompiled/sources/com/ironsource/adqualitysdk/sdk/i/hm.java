package com.ironsource.adqualitysdk.sdk.i;

/* loaded from: classes5.dex */
public final class hm extends com.ironsource.adqualitysdk.sdk.i.hi<android.media.MediaPlayer.OnInfoListener> implements android.media.MediaPlayer.OnInfoListener {

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static long f2373 = -2361711480239749084L;

    /* renamed from: ｋ, reason: contains not printable characters */
    private static int f2374 = 0;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static int f2375 = 1;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private com.ironsource.adqualitysdk.sdk.i.hm.e f2376;

    public interface e {
        /* renamed from: ﻛ */
        boolean mo7407(com.ironsource.adqualitysdk.sdk.i.hm hmVar, android.media.MediaPlayer mediaPlayer, int i, int i2);
    }

    public hm(android.media.MediaPlayer.OnInfoListener onInfoListener, com.ironsource.adqualitysdk.sdk.i.hm.e eVar) {
        super(onInfoListener);
        this.f2376 = eVar;
    }

    @Override // android.media.MediaPlayer.OnInfoListener
    public final boolean onInfo(android.media.MediaPlayer mediaPlayer, int i, int i2) {
        int i3 = 2 % 2;
        try {
            this.f2376.mo7407(this, mediaPlayer, i, i2);
            int i4 = f2374 + 31;
            f2375 = i4 % 128;
            int i5 = i4 % 2;
        } catch (java.lang.Throwable th) {
            com.ironsource.adqualitysdk.sdk.i.kl.m8455(m7837("桤\uf812栫돟㻵\uf058ꏞ⛷䢒탉荋٠⤷넢\ue2d2朗\u09b1醴쉣䒌\uea47爙℥ꐸ쫀劉µ", android.view.View.MeasureSpec.getMode(0)).intern(), m7837("誗\u242f諒`Ⴁⱹ࿕ࢢꩵ\u0cbb⽞⠳쮗洆仓䥏\ueb6b䶒湤櫉ࢲ긥贂詿⡧躴겙ꯔ䦙\uefcd차", (android.os.Process.getThreadPriority(0) + 20) >> 6).intern(), th, false);
        }
        if (mo6360() == null) {
            return false;
        }
        int i6 = f2374 + 5;
        f2375 = i6 % 128;
        int i7 = i6 % 2;
        boolean onInfo = mo6360().onInfo(mediaPlayer, i, i2);
        int i8 = f2374 + 91;
        f2375 = i8 % 128;
        if (i8 % 2 != 0) {
            return onInfo;
        }
        java.lang.Object obj = null;
        super.hashCode();
        throw null;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static java.lang.String m7837(java.lang.String str, int i) {
        java.lang.String str2;
        char[] cArr = str;
        if (str != null) {
            cArr = str.toCharArray();
        }
        char[] cArr2 = cArr;
        synchronized (com.ironsource.adqualitysdk.sdk.i.g.f2165) {
            char[] m7782 = com.ironsource.adqualitysdk.sdk.i.g.m7782(f2373, cArr2, i);
            com.ironsource.adqualitysdk.sdk.i.g.f2167 = 4;
            while (com.ironsource.adqualitysdk.sdk.i.g.f2167 < m7782.length) {
                com.ironsource.adqualitysdk.sdk.i.g.f2166 = com.ironsource.adqualitysdk.sdk.i.g.f2167 - 4;
                m7782[com.ironsource.adqualitysdk.sdk.i.g.f2167] = (char) ((m7782[com.ironsource.adqualitysdk.sdk.i.g.f2167] ^ m7782[com.ironsource.adqualitysdk.sdk.i.g.f2167 % 4]) ^ (com.ironsource.adqualitysdk.sdk.i.g.f2166 * f2373));
                com.ironsource.adqualitysdk.sdk.i.g.f2167++;
            }
            str2 = new java.lang.String(m7782, 4, m7782.length - 4);
        }
        return str2;
    }
}
