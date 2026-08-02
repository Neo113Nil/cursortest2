package androidx.media3.exoplayer.source.preload;

import androidx.media3.exoplayer.source.preload.DefaultPreloadManager;
import androidx.media3.exoplayer.upstream.BandwidthMeter;
import com.google.android.exoplayer2.SimpleBasePlayer;

/* loaded from: classes3.dex */
public final /* synthetic */ class g implements com.google.common.base.s {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ g(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // com.google.common.base.s
    /* renamed from: get */
    public final Object get2() {
        BandwidthMeter lambda$setBandwidthMeter$6;
        SimpleBasePlayer.State lambda$clearVideoOutput$21;
        switch (this.a) {
            case 0:
                lambda$setBandwidthMeter$6 = DefaultPreloadManager.Builder.lambda$setBandwidthMeter$6((BandwidthMeter) this.b);
                return lambda$setBandwidthMeter$6;
            default:
                lambda$clearVideoOutput$21 = SimpleBasePlayer.lambda$clearVideoOutput$21((SimpleBasePlayer.State) this.b);
                return lambda$clearVideoOutput$21;
        }
    }
}
