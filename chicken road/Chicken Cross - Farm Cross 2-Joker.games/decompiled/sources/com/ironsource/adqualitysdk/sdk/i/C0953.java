package com.ironsource.adqualitysdk.sdk.i;

import android.media.MediaPlayer;
import com.ironsource.adqualitysdk.sdk.StringFog;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ᴿ, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C0953 extends AbstractC0325 implements MediaPlayer.OnPreparedListener {

    /* renamed from: ｋ, reason: contains not printable characters */
    public static final String f2660 = StringFog.decrypt("/npFwvjVUlLUcFnZ7tFWTtRmUdX+ykFBxXtn\n", "sRQVsJ2lMyA=\n");

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final InterfaceC0961 f2661;

    public C0953(MediaPlayer.OnPreparedListener onPreparedListener, InterfaceC0961 interfaceC0961) {
        super(onPreparedListener);
        this.f2661 = interfaceC0961;
    }

    @Override // android.media.MediaPlayer.OnPreparedListener
    public final void onPrepared(MediaPlayer mediaPlayer) {
        try {
            this.f2661.mo5785(this, mediaPlayer);
        } catch (Throwable th) {
            AbstractC0480.m5464(f2660, StringFog.decrypt("OuOZS5yRYPhf/L9Goth64hr/jlbO3mfGDfSbRZzUbQ==\n", "f5HrJO6xCZY=\n"), th, false);
        }
        Object obj = this.f308;
        if (obj != null) {
            ((MediaPlayer.OnPreparedListener) obj).onPrepared(mediaPlayer);
        }
    }
}
