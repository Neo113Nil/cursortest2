package androidx.media3.exoplayer.source.preload;

import androidx.media3.exoplayer.source.MediaSource;
import androidx.media3.exoplayer.source.preload.DefaultPreloadManager;
import com.google.android.exoplayer2.ExoPlayer;
import com.google.android.exoplayer2.RenderersFactory;

/* loaded from: classes3.dex */
public final /* synthetic */ class k implements com.google.common.base.s {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ k(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // com.google.common.base.s
    /* renamed from: get */
    public final Object get2() {
        MediaSource.Factory lambda$setMediaSourceFactory$3;
        RenderersFactory lambda$new$2;
        switch (this.a) {
            case 0:
                lambda$setMediaSourceFactory$3 = DefaultPreloadManager.Builder.lambda$setMediaSourceFactory$3((MediaSource.Factory) this.b);
                return lambda$setMediaSourceFactory$3;
            default:
                lambda$new$2 = ExoPlayer.Builder.lambda$new$2((RenderersFactory) this.b);
                return lambda$new$2;
        }
    }
}
