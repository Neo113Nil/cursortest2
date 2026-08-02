package androidx.media3.common;

import android.view.SurfaceHolder;
import androidx.media3.common.SimpleBasePlayer;
import com.google.android.exoplayer2.SimpleBasePlayer;

/* loaded from: classes3.dex */
public final /* synthetic */ class Z implements com.google.common.base.s {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ Z(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // com.google.common.base.s
    /* renamed from: get */
    public final Object get2() {
        SimpleBasePlayer.State lambda$setPlaylistMetadata$15;
        SimpleBasePlayer.State lambda$setVideoSurfaceHolder$18;
        switch (this.a) {
            case 0:
                lambda$setPlaylistMetadata$15 = SimpleBasePlayer.lambda$setPlaylistMetadata$15((SimpleBasePlayer.State) this.b, (MediaMetadata) this.c);
                return lambda$setPlaylistMetadata$15;
            default:
                lambda$setVideoSurfaceHolder$18 = com.google.android.exoplayer2.SimpleBasePlayer.lambda$setVideoSurfaceHolder$18((SimpleBasePlayer.State) this.b, (SurfaceHolder) this.c);
                return lambda$setVideoSurfaceHolder$18;
        }
    }
}
