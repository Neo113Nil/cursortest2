package androidx.media3.common;

import androidx.media3.common.SimpleBasePlayer;
import androidx.media3.exoplayer.LoadControl;
import androidx.media3.exoplayer.source.preload.DefaultPreloadManager;

/* loaded from: classes3.dex */
public final /* synthetic */ class S implements com.google.common.base.s {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ S(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // com.google.common.base.s
    /* renamed from: get */
    public final Object get2() {
        SimpleBasePlayer.State lambda$increaseDeviceVolume$25;
        LoadControl lambda$setLoadControl$5;
        switch (this.a) {
            case 0:
                lambda$increaseDeviceVolume$25 = SimpleBasePlayer.lambda$increaseDeviceVolume$25((SimpleBasePlayer.State) this.b);
                return lambda$increaseDeviceVolume$25;
            default:
                lambda$setLoadControl$5 = DefaultPreloadManager.Builder.lambda$setLoadControl$5((LoadControl) this.b);
                return lambda$setLoadControl$5;
        }
    }
}
