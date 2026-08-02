package androidx.media3.exoplayer.source.preload;

import android.content.Context;
import androidx.media3.exoplayer.RenderersFactory;
import androidx.media3.exoplayer.source.preload.DefaultPreloadManager;
import com.google.android.exoplayer2.ExoPlayer;
import com.google.android.exoplayer2.trackselection.TrackSelector;

/* loaded from: classes3.dex */
public final /* synthetic */ class j implements com.google.common.base.s {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ j(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // com.google.common.base.s
    /* renamed from: get */
    public final Object get2() {
        RenderersFactory lambda$new$2;
        TrackSelector lambda$setTrackSelector$18;
        switch (this.a) {
            case 0:
                lambda$new$2 = DefaultPreloadManager.Builder.lambda$new$2((Context) this.b);
                return lambda$new$2;
            default:
                lambda$setTrackSelector$18 = ExoPlayer.Builder.lambda$setTrackSelector$18((TrackSelector) this.b);
                return lambda$setTrackSelector$18;
        }
    }
}
