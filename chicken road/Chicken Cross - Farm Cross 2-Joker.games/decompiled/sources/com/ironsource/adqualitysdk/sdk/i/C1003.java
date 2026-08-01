package com.ironsource.adqualitysdk.sdk.i;

import android.media.MediaPlayer;
import com.ironsource.adqualitysdk.sdk.StringFog;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ḷ, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C1003 extends AbstractC0325 implements MediaPlayer.OnCompletionListener {

    /* renamed from: ｋ, reason: contains not printable characters */
    public static final String f2927 = StringFog.decrypt("zYhpgt/7GyD2j0WD/uIEMeeIT5/27hQq8IdegsA=\n", "guYq7bKLd0U=\n");

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final InterfaceC1010 f2928;

    public C1003(MediaPlayer.OnCompletionListener onCompletionListener, InterfaceC1010 interfaceC1010) {
        super(onCompletionListener);
        this.f2928 = interfaceC1010;
    }

    @Override // android.media.MediaPlayer.OnCompletionListener
    public final void onCompletion(MediaPlayer mediaPlayer) {
        try {
            this.f2928.mo5777(this, mediaPlayer);
        } catch (Throwable th) {
            AbstractC0480.m5464(f2927, StringFog.decrypt("ZVJbuDDls3AATX21DqypakVOTKViqrRdT01Zuyexs3FO\n", "ICAp10LF2h4=\n"), th, false);
        }
        Object obj = this.f308;
        if (obj != null) {
            ((MediaPlayer.OnCompletionListener) obj).onCompletion(mediaPlayer);
        }
    }
}
