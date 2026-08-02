package androidx.media3.exoplayer;

import android.content.Context;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.exoplayer.source.MediaSource;
import com.google.android.exoplayer2.ExoPlayer;
import com.google.android.exoplayer2.source.MediaSource;

/* renamed from: androidx.media3.exoplayer.u, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C0442u implements com.google.common.base.s {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ C0442u(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // com.google.common.base.s
    /* renamed from: get */
    public final Object get2() {
        MediaSource.Factory lambda$new$1;
        MediaSource.Factory lambda$setMediaSourceFactory$17;
        switch (this.a) {
            case 0:
                lambda$new$1 = ExoPlayer.Builder.lambda$new$1((Context) this.b);
                return lambda$new$1;
            default:
                lambda$setMediaSourceFactory$17 = ExoPlayer.Builder.lambda$setMediaSourceFactory$17((MediaSource.Factory) this.b);
                return lambda$setMediaSourceFactory$17;
        }
    }
}
