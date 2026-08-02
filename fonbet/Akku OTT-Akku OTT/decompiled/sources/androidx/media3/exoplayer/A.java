package androidx.media3.exoplayer;

import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.exoplayer.upstream.BandwidthMeter;
import com.google.android.exoplayer2.ExoPlayer;

/* loaded from: classes3.dex */
public final /* synthetic */ class A implements com.google.common.base.s {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ A(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // com.google.common.base.s
    /* renamed from: get */
    public final Object get2() {
        BandwidthMeter lambda$setBandwidthMeter$20;
        com.google.android.exoplayer2.LoadControl lambda$new$11;
        switch (this.a) {
            case 0:
                lambda$setBandwidthMeter$20 = ExoPlayer.Builder.lambda$setBandwidthMeter$20((BandwidthMeter) this.b);
                return lambda$setBandwidthMeter$20;
            default:
                lambda$new$11 = ExoPlayer.Builder.lambda$new$11((com.google.android.exoplayer2.LoadControl) this.b);
                return lambda$new$11;
        }
    }
}
