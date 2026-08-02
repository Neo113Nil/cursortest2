package androidx.media3.exoplayer;

import android.content.Context;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.exoplayer.source.MediaSource;
import com.google.android.exoplayer2.ExoPlayer;

/* renamed from: androidx.media3.exoplayer.z, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C0452z implements com.google.common.base.s {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ C0452z(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // com.google.common.base.s
    /* renamed from: get */
    public final Object get2() {
        MediaSource.Factory lambda$new$3;
        com.google.android.exoplayer2.RenderersFactory lambda$new$8;
        switch (this.a) {
            case 0:
                lambda$new$3 = ExoPlayer.Builder.lambda$new$3((Context) this.b);
                return lambda$new$3;
            default:
                lambda$new$8 = ExoPlayer.Builder.lambda$new$8((com.google.android.exoplayer2.RenderersFactory) this.b);
                return lambda$new$8;
        }
    }
}
