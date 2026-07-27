package com.ironsource.adqualitysdk.sdk.i;

import android.media.MediaPlayer;
import com.ironsource.adqualitysdk.sdk.StringFog;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ᖦ, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C0881 extends AbstractC0325 implements MediaPlayer.OnSeekCompleteListener {

    /* renamed from: ｋ, reason: contains not printable characters */
    public static final String f2505 = StringFog.decrypt("MCGFQ6Jx+rISP7pDs3/1tAw7s0iiaP24HCCkR7N1yw==\n", "f0/WJscaud0=\n");

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final InterfaceC0924 f2506;

    public C0881(MediaPlayer.OnSeekCompleteListener onSeekCompleteListener, InterfaceC0924 interfaceC0924) {
        super(onSeekCompleteListener);
        this.f2506 = interfaceC0924;
    }

    @Override // android.media.MediaPlayer.OnSeekCompleteListener
    public final void onSeekComplete(MediaPlayer mediaPlayer) {
        try {
            this.f2506.mo5727(this, mediaPlayer);
        } catch (Throwable th) {
            AbstractC0480.m5464(f2505, StringFog.decrypt("m7em/bmrjmr+qIDwh+KUcLurseDr5IlXu6C/0aTml2i7sbE=\n", "3sXUksuL5wQ=\n"), th, false);
        }
        Object obj = this.f308;
        if (obj != null) {
            ((MediaPlayer.OnSeekCompleteListener) obj).onSeekComplete(mediaPlayer);
        }
    }
}
