package com.ironsource.adqualitysdk.sdk.i;

import android.media.MediaPlayer;
import com.ironsource.adqualitysdk.sdk.StringFog;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ᵖ, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C0976 extends AbstractC0325 implements MediaPlayer.OnInfoListener {

    /* renamed from: ｋ, reason: contains not printable characters */
    public static final String f2890 = StringFog.decrypt("x49YmRpqtEX7lXSZGXe8SeuOY5YIaoo=\n", "iOER93wF+Cw=\n");

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final InterfaceC0984 f2891;

    public C0976(MediaPlayer.OnInfoListener onInfoListener, InterfaceC0984 interfaceC0984) {
        super(onInfoListener);
        this.f2891 = interfaceC0984;
    }

    @Override // android.media.MediaPlayer.OnInfoListener
    public final boolean onInfo(MediaPlayer mediaPlayer, int i, int i2) {
        try {
            this.f2891.mo5783(this, mediaPlayer, i, i2);
        } catch (Throwable th) {
            AbstractC0480.m5464(f2890, StringFog.decrypt("/UuMSdW47/mYVKpE6/H1491Xm1SH9+je1l+R\n", "uDn+JqeYhpc=\n"), th, false);
        }
        Object obj = this.f308;
        if (obj != null) {
            return ((MediaPlayer.OnInfoListener) obj).onInfo(mediaPlayer, i, i2);
        }
        return false;
    }
}
