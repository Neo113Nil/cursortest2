package androidx.media3.session;

import android.view.KeyEvent;
import androidx.media3.session.MediaSession;
import androidx.media3.session.MediaSessionImpl;

/* renamed from: androidx.media3.session.v2, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class RunnableC0593v2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ MediaSession.ControllerInfo b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ RunnableC0593v2(Object obj, MediaSession.ControllerInfo controllerInfo, Object obj2, int i) {
        this.a = i;
        this.c = obj;
        this.b = controllerInfo;
        this.d = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ((MediaLibraryServiceLegacyStub) this.c).lambda$onUnsubscribe$2(this.b, (String) this.d);
                break;
            default:
                ((MediaSessionImpl.MediaPlayPauseKeyHandler) this.c).lambda$setPendingPlayPauseTask$0(this.b, (KeyEvent) this.d);
                break;
        }
    }
}
