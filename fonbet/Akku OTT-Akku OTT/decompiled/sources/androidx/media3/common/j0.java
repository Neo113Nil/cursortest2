package androidx.media3.common;

import android.content.Context;
import androidx.media3.common.SimpleBasePlayer;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.exoplayer.RenderersFactory;
import com.google.android.exoplayer2.ExoPlayer;

/* loaded from: classes3.dex */
public final /* synthetic */ class j0 implements com.google.common.base.s {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ j0(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // com.google.common.base.s
    /* renamed from: get */
    public final Object get2() {
        SimpleBasePlayer.State lambda$increaseDeviceVolume$24;
        RenderersFactory lambda$new$0;
        com.google.android.exoplayer2.RenderersFactory lambda$setRenderersFactory$16;
        switch (this.a) {
            case 0:
                lambda$increaseDeviceVolume$24 = SimpleBasePlayer.lambda$increaseDeviceVolume$24((SimpleBasePlayer.State) this.b);
                return lambda$increaseDeviceVolume$24;
            case 1:
                lambda$new$0 = ExoPlayer.Builder.lambda$new$0((Context) this.b);
                return lambda$new$0;
            default:
                lambda$setRenderersFactory$16 = ExoPlayer.Builder.lambda$setRenderersFactory$16((com.google.android.exoplayer2.RenderersFactory) this.b);
                return lambda$setRenderersFactory$16;
        }
    }
}
