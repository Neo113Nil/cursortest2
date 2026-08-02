package androidx.media3.exoplayer;

import androidx.media3.exoplayer.ExoPlayer;
import com.google.android.exoplayer2.ExoPlayer;
import com.google.android.exoplayer2.upstream.BandwidthMeter;

/* renamed from: androidx.media3.exoplayer.y, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C0450y implements com.google.common.base.s {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ C0450y(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // com.google.common.base.s
    /* renamed from: get */
    public final Object get2() {
        RenderersFactory lambda$new$2;
        BandwidthMeter lambda$setBandwidthMeter$20;
        switch (this.a) {
            case 0:
                lambda$new$2 = ExoPlayer.Builder.lambda$new$2((RenderersFactory) this.b);
                return lambda$new$2;
            default:
                lambda$setBandwidthMeter$20 = ExoPlayer.Builder.lambda$setBandwidthMeter$20((BandwidthMeter) this.b);
                return lambda$setBandwidthMeter$20;
        }
    }
}
