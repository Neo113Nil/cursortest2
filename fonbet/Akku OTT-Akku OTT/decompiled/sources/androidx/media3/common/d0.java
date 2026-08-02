package androidx.media3.common;

import android.content.Context;
import androidx.media3.common.SimpleBasePlayer;
import com.google.android.exoplayer2.ExoPlayer;
import com.google.android.exoplayer2.trackselection.TrackSelector;

/* loaded from: classes3.dex */
public final /* synthetic */ class d0 implements com.google.common.base.s {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ d0(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // com.google.common.base.s
    /* renamed from: get */
    public final Object get2() {
        SimpleBasePlayer.State lambda$release$13;
        TrackSelector lambda$new$14;
        switch (this.a) {
            case 0:
                lambda$release$13 = SimpleBasePlayer.lambda$release$13((SimpleBasePlayer.State) this.b);
                return lambda$release$13;
            default:
                lambda$new$14 = ExoPlayer.Builder.lambda$new$14((Context) this.b);
                return lambda$new$14;
        }
    }
}
