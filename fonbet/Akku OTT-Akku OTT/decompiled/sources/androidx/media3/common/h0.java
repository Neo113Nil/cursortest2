package androidx.media3.common;

import androidx.media3.common.SimpleBasePlayer;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.exoplayer.LoadControl;

/* loaded from: classes3.dex */
public final /* synthetic */ class h0 implements com.google.common.base.s {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ h0(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // com.google.common.base.s
    /* renamed from: get */
    public final Object get2() {
        SimpleBasePlayer.State lambda$clearVideoOutput$21;
        LoadControl lambda$setLoadControl$19;
        switch (this.a) {
            case 0:
                lambda$clearVideoOutput$21 = SimpleBasePlayer.lambda$clearVideoOutput$21((SimpleBasePlayer.State) this.b);
                return lambda$clearVideoOutput$21;
            default:
                lambda$setLoadControl$19 = ExoPlayer.Builder.lambda$setLoadControl$19((LoadControl) this.b);
                return lambda$setLoadControl$19;
        }
    }
}
