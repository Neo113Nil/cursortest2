package androidx.media3.common;

import android.view.SurfaceHolder;
import androidx.media3.common.SimpleBasePlayer;
import com.google.android.exoplayer2.SimpleBasePlayer;
import com.google.android.exoplayer2.util.Size;

/* loaded from: classes3.dex */
public final /* synthetic */ class c0 implements com.google.common.base.s {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ c0(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // com.google.common.base.s
    public final Object get() {
        SimpleBasePlayer.State lambda$setVideoSurfaceHolder$18;
        SimpleBasePlayer.State lambda$setVideoTextureView$20;
        switch (this.a) {
            case 0:
                lambda$setVideoSurfaceHolder$18 = SimpleBasePlayer.lambda$setVideoSurfaceHolder$18((SimpleBasePlayer.State) this.b, (SurfaceHolder) this.c);
                return lambda$setVideoSurfaceHolder$18;
            default:
                lambda$setVideoTextureView$20 = com.google.android.exoplayer2.SimpleBasePlayer.lambda$setVideoTextureView$20((SimpleBasePlayer.State) this.b, (Size) this.c);
                return lambda$setVideoTextureView$20;
        }
    }
}
