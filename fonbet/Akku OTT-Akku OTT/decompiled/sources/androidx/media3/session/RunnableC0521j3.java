package androidx.media3.session;

import androidx.media3.session.MediaSession;

/* renamed from: androidx.media3.session.j3, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class RunnableC0521j3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ RunnableC0521j3(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ((MediaSessionImpl) this.b).lambda$applyMediaButtonKeyEvent$26((MediaSession.ControllerInfo) this.c);
                break;
            default:
                ((MediaSessionLegacyStub) this.b).lambda$updateLegacySessionPlaybackState$23((PlayerWrapper) this.c);
                break;
        }
    }
}
