package androidx.media3.session;

import com.google.android.exoplayer2.video.VideoRendererEventListener;

/* renamed from: androidx.media3.session.p4, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class RunnableC0559p4 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ RunnableC0559p4(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ((MediaSessionService) this.b).lambda$removeSession$1((MediaSession) this.c);
                break;
            default:
                ((VideoRendererEventListener.EventDispatcher) this.b).lambda$videoCodecError$9((Exception) this.c);
                break;
        }
    }
}
