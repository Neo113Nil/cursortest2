package androidx.media3.common.util;

import androidx.media3.exoplayer.audio.AudioRendererEventListener;

/* loaded from: classes3.dex */
public final /* synthetic */ class b implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ b(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ((BackgroundThreadStateHandler) this.b).lambda$setStateInBackground$2(this.c);
                break;
            default:
                ((AudioRendererEventListener.EventDispatcher) this.b).lambda$decoderReleased$5((String) this.c);
                break;
        }
    }
}
