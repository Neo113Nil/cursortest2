package com.inmobi.media;

import android.media.MediaPlayer;
import kotlinx.coroutines.CancellableContinuationImpl;

/* loaded from: classes6.dex */
public final class Xo implements MediaPlayer.OnErrorListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Y9 f6958a;
    public final /* synthetic */ String b;
    public final /* synthetic */ CancellableContinuationImpl c;

    public Xo(Y9 y9, String str, CancellableContinuationImpl cancellableContinuationImpl) {
        this.f6958a = y9;
        this.b = str;
        this.c = cancellableContinuationImpl;
    }

    @Override // android.media.MediaPlayer.OnErrorListener
    public final boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
        Y9 y9 = this.f6958a;
        if (y9 != null) {
            ((Z9) y9).b("VideoLoaderHelper", "Video Load Error URL: " + this.b);
        }
        AbstractC4012q5.a(this.c, Boolean.FALSE);
        return true;
    }
}
