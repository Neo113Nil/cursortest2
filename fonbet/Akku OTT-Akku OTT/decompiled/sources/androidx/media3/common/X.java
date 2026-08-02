package androidx.media3.common;

import android.content.Context;
import androidx.media3.common.SimpleBasePlayer;
import androidx.media3.exoplayer.upstream.BandwidthMeter;
import androidx.media3.exoplayer.upstream.DefaultBandwidthMeter;

/* loaded from: classes3.dex */
public final /* synthetic */ class X implements com.google.common.base.s {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ X(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // com.google.common.base.s
    public final Object get() {
        SimpleBasePlayer.State lambda$decreaseDeviceVolume$26;
        BandwidthMeter singletonInstance;
        switch (this.a) {
            case 0:
                lambda$decreaseDeviceVolume$26 = SimpleBasePlayer.lambda$decreaseDeviceVolume$26((SimpleBasePlayer.State) this.b);
                return lambda$decreaseDeviceVolume$26;
            default:
                singletonInstance = DefaultBandwidthMeter.getSingletonInstance((Context) this.b);
                return singletonInstance;
        }
    }
}
