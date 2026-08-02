package androidx.media3.exoplayer.source.preload;

import android.content.Context;
import androidx.media3.exoplayer.source.MediaSource;
import androidx.media3.exoplayer.source.preload.DefaultPreloadManager;
import com.google.android.exoplayer2.ExoPlayer;
import com.google.android.exoplayer2.LoadControl;

/* loaded from: classes3.dex */
public final /* synthetic */ class h implements com.google.common.base.s {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ h(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // com.google.common.base.s
    /* renamed from: get */
    public final Object get2() {
        MediaSource.Factory lambda$new$0;
        LoadControl lambda$setLoadControl$19;
        switch (this.a) {
            case 0:
                lambda$new$0 = DefaultPreloadManager.Builder.lambda$new$0((Context) this.b);
                return lambda$new$0;
            default:
                lambda$setLoadControl$19 = ExoPlayer.Builder.lambda$setLoadControl$19((LoadControl) this.b);
                return lambda$setLoadControl$19;
        }
    }
}
