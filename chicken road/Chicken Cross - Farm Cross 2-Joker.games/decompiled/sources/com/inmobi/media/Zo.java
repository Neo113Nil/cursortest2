package com.inmobi.media;

import androidx.media3.common.PlaybackException;
import androidx.media3.common.Player;
import androidx.media3.exoplayer.ExoPlayer;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CancellableContinuationImpl;

/* loaded from: classes6.dex */
public final class Zo implements Player.Listener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ CancellableContinuationImpl f6999a;
    public final /* synthetic */ C3783i3 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ Y9 d;
    public final /* synthetic */ ExoPlayer e;

    public Zo(CancellableContinuationImpl cancellableContinuationImpl, C3783i3 c3783i3, String str, Y9 y9, ExoPlayer exoPlayer) {
        this.f6999a = cancellableContinuationImpl;
        this.b = c3783i3;
        this.c = str;
        this.d = y9;
        this.e = exoPlayer;
    }

    @Override // androidx.media3.common.Player.Listener
    public final void onPlaybackStateChanged(int i) {
        if (i == 3) {
            if (this.f6999a.isActive()) {
                int a2 = this.b.a(this.c);
                Y9 y9 = this.d;
                if (y9 != null) {
                    ((Z9) y9).a("VideoLoaderHelper", "Media loaded successfully from URL with cache progress: " + a2);
                }
                AbstractC4012q5.a(this.f6999a, new L8(a2, this.e.getDuration(), this.c));
            }
            this.e.removeListener(this);
        }
    }

    @Override // androidx.media3.common.Player.Listener
    public final void onPlayerError(PlaybackException error) {
        Intrinsics.checkNotNullParameter(error, "error");
        Y9 y9 = this.d;
        if (y9 != null) {
            Z9 z9 = (Z9) y9;
            z9.b("VideoLoaderHelper", "Failed to load URL (" + this.c + "): " + error.getMessage());
        }
        if (this.f6999a.isActive()) {
            AbstractC4012q5.a(this.f6999a, new I8(Oo.d));
        }
        this.e.removeListener(this);
        this.e.stop();
        this.e.clearMediaItems();
    }
}
