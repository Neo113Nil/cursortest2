package com.inmobi.media;

import android.media.MediaPlayer;
import kotlinx.coroutines.CancellableContinuationImpl;

/* loaded from: classes6.dex */
public final class Wo implements MediaPlayer.OnPreparedListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Y9 f6938a;
    public final /* synthetic */ String b;
    public final /* synthetic */ CancellableContinuationImpl c;

    public Wo(Y9 y9, String str, CancellableContinuationImpl cancellableContinuationImpl) {
        this.f6938a = y9;
        this.b = str;
        this.c = cancellableContinuationImpl;
    }

    @Override // android.media.MediaPlayer.OnPreparedListener
    public final void onPrepared(MediaPlayer mediaPlayer) {
        Y9 y9 = this.f6938a;
        if (y9 != null) {
            ((Z9) y9).a("VideoLoaderHelper", "Video Load Success for URL: " + this.b);
        }
        AbstractC4012q5.a(this.c, Boolean.TRUE);
    }
}
