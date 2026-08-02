package androidx.media3.exoplayer;

import android.content.Context;
import androidx.media3.exoplayer.ExoPlayer;
import com.google.android.exoplayer2.ExoPlayer;
import com.google.android.exoplayer2.source.MediaSource;

/* renamed from: androidx.media3.exoplayer.v, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C0444v implements com.google.common.base.s {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ C0444v(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // com.google.common.base.s
    /* renamed from: get */
    public final Object get2() {
        RenderersFactory lambda$setRenderersFactory$16;
        MediaSource.Factory lambda$new$1;
        switch (this.a) {
            case 0:
                lambda$setRenderersFactory$16 = ExoPlayer.Builder.lambda$setRenderersFactory$16((RenderersFactory) this.b);
                return lambda$setRenderersFactory$16;
            default:
                lambda$new$1 = ExoPlayer.Builder.lambda$new$1((Context) this.b);
                return lambda$new$1;
        }
    }
}
