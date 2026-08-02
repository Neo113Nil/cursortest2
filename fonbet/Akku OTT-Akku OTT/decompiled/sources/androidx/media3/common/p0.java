package androidx.media3.common;

import androidx.media3.common.SimpleBasePlayer;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.exoplayer.RenderersFactory;
import com.google.android.exoplayer2.ExoPlayer;
import com.google.android.exoplayer2.source.MediaSource;

/* loaded from: classes3.dex */
public final /* synthetic */ class p0 implements com.google.common.base.s {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ p0(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // com.google.common.base.s
    /* renamed from: get */
    public final Object get2() {
        SimpleBasePlayer.State lambda$prepare$7;
        RenderersFactory lambda$new$8;
        MediaSource.Factory lambda$new$9;
        switch (this.a) {
            case 0:
                lambda$prepare$7 = SimpleBasePlayer.lambda$prepare$7((SimpleBasePlayer.State) this.b);
                return lambda$prepare$7;
            case 1:
                lambda$new$8 = ExoPlayer.Builder.lambda$new$8((RenderersFactory) this.b);
                return lambda$new$8;
            default:
                lambda$new$9 = ExoPlayer.Builder.lambda$new$9((MediaSource.Factory) this.b);
                return lambda$new$9;
        }
    }
}
