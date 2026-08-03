package com.ironsource.adqualitysdk.sdk.i;

/* loaded from: classes5.dex */
public final class hq extends com.ironsource.adqualitysdk.sdk.i.hi<android.media.MediaPlayer.OnSeekCompleteListener> implements android.media.MediaPlayer.OnSeekCompleteListener {

    /* renamed from: ﱟ, reason: contains not printable characters */
    private static int f2392 = 1;

    /* renamed from: ﺙ, reason: contains not printable characters */
    private static short[] f2393 = null;

    /* renamed from: ﻏ, reason: contains not printable characters */
    private static int f2394 = 0;

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static int f2395 = 945775359;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static int f2396 = 39;

    /* renamed from: ｋ, reason: contains not printable characters */
    private static int f2397 = -430482725;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static byte[] f2398 = {-87, -95, -71, -107, -87, -78, -92, -57, 120, -77, -99, -81, -105, -89, -80, -61, -115, -105, -75, -97, -94, -87, -92, -46, 126, -84, -90, -72, -117, -59, 70, 100, 78, 81, 88, 83, -127, 45, 91, 85, 103, 58, 84, -92, 3, 98, 76, 94, 70, 86, 95, 114, 63, 99, 60, -94, 7, 90, -98, 3, 88, 82, 85, -126, 0, 0};

    /* renamed from: ﾇ, reason: contains not printable characters */
    private com.ironsource.adqualitysdk.sdk.i.hq.d f2399;

    public interface d {
        /* renamed from: ﻛ */
        void mo7403(com.ironsource.adqualitysdk.sdk.i.hq hqVar, android.media.MediaPlayer mediaPlayer);
    }

    public hq(android.media.MediaPlayer.OnSeekCompleteListener onSeekCompleteListener, com.ironsource.adqualitysdk.sdk.i.hq.d dVar) {
        super(onSeekCompleteListener);
        this.f2399 = dVar;
    }

    @Override // android.media.MediaPlayer.OnSeekCompleteListener
    public final void onSeekComplete(android.media.MediaPlayer mediaPlayer) {
        int i = 2 % 2;
        int i2 = f2394 + 99;
        f2392 = i2 % 128;
        int i3 = i2 % 2;
        try {
            this.f2399.mo7403(this, mediaPlayer);
            int i4 = f2392 + 101;
            f2394 = i4 % 128;
            int i5 = i4 % 2;
        } catch (java.lang.Throwable th) {
            com.ironsource.adqualitysdk.sdk.i.kl.m8455(m7841((short) (android.text.TextUtils.indexOf((java.lang.CharSequence) "", '0', 0, 0) + 91), android.text.TextUtils.indexOf("", "", 0) - 945775280, android.widget.ExpandableListView.getPackedPositionType(0L) - 8, 430482725 - (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16), (byte) (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1))).intern(), m7841((short) (android.graphics.Color.blue(0) - 85), (-945775290) - (android.view.ViewConfiguration.getPressedStateDuration() >> 16), (-4) - android.graphics.drawable.Drawable.resolveOpacity(0, 0), 430482755 - (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (byte) android.view.View.MeasureSpec.getSize(0)).intern(), th, false);
        }
        if (mo6360() != null) {
            mo6360().onSeekComplete(mediaPlayer);
        }
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static java.lang.String m7841(short s, int i, int i2, int i3, byte b) {
        java.lang.String obj;
        synchronized (com.ironsource.adqualitysdk.sdk.i.n.f3098) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            int i4 = f2396;
            int i5 = i2 + i4;
            int i6 = i5 == -1 ? 1 : 0;
            if (i6 != 0) {
                byte[] bArr = f2398;
                if (bArr != null) {
                    i5 = (byte) (bArr[f2397 + i3] + i4);
                } else {
                    i5 = (short) (f2393[f2397 + i3] + i4);
                }
            }
            if (i5 > 0) {
                com.ironsource.adqualitysdk.sdk.i.n.f3100 = ((i3 + i5) - 2) + f2397 + i6;
                com.ironsource.adqualitysdk.sdk.i.n.f3101 = b;
                com.ironsource.adqualitysdk.sdk.i.n.f3102 = (char) (i + f2395);
                sb.append(com.ironsource.adqualitysdk.sdk.i.n.f3102);
                com.ironsource.adqualitysdk.sdk.i.n.f3103 = com.ironsource.adqualitysdk.sdk.i.n.f3102;
                com.ironsource.adqualitysdk.sdk.i.n.f3099 = 1;
                while (com.ironsource.adqualitysdk.sdk.i.n.f3099 < i5) {
                    byte[] bArr2 = f2398;
                    if (bArr2 != null) {
                        int i7 = com.ironsource.adqualitysdk.sdk.i.n.f3100;
                        com.ironsource.adqualitysdk.sdk.i.n.f3100 = i7 - 1;
                        com.ironsource.adqualitysdk.sdk.i.n.f3102 = (char) (com.ironsource.adqualitysdk.sdk.i.n.f3103 + (((byte) (bArr2[i7] + s)) ^ com.ironsource.adqualitysdk.sdk.i.n.f3101));
                    } else {
                        short[] sArr = f2393;
                        int i8 = com.ironsource.adqualitysdk.sdk.i.n.f3100;
                        com.ironsource.adqualitysdk.sdk.i.n.f3100 = i8 - 1;
                        com.ironsource.adqualitysdk.sdk.i.n.f3102 = (char) (com.ironsource.adqualitysdk.sdk.i.n.f3103 + (((short) (sArr[i8] + s)) ^ com.ironsource.adqualitysdk.sdk.i.n.f3101));
                    }
                    sb.append(com.ironsource.adqualitysdk.sdk.i.n.f3102);
                    com.ironsource.adqualitysdk.sdk.i.n.f3103 = com.ironsource.adqualitysdk.sdk.i.n.f3102;
                    com.ironsource.adqualitysdk.sdk.i.n.f3099++;
                }
            }
            obj = sb.toString();
        }
        return obj;
    }
}
