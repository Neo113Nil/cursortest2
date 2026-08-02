package androidx.media3.common;

import androidx.media3.common.SimpleBasePlayer;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.exoplayer.source.MediaSource;
import com.google.android.exoplayer2.ExoPlayer;
import com.google.android.exoplayer2.trackselection.TrackSelector;

/* loaded from: classes3.dex */
public final /* synthetic */ class q0 implements com.google.common.base.s {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ q0(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // com.google.common.base.s
    /* renamed from: get */
    public final Object get2() {
        SimpleBasePlayer.State lambda$decreaseDeviceVolume$27;
        MediaSource.Factory lambda$new$9;
        TrackSelector lambda$new$10;
        switch (this.a) {
            case 0:
                lambda$decreaseDeviceVolume$27 = SimpleBasePlayer.lambda$decreaseDeviceVolume$27((SimpleBasePlayer.State) this.b);
                return lambda$decreaseDeviceVolume$27;
            case 1:
                lambda$new$9 = ExoPlayer.Builder.lambda$new$9((MediaSource.Factory) this.b);
                return lambda$new$9;
            default:
                lambda$new$10 = ExoPlayer.Builder.lambda$new$10((TrackSelector) this.b);
                return lambda$new$10;
        }
    }
}
