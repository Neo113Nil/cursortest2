package androidx.media3.session;

import androidx.media3.common.Player;
import androidx.media3.common.util.ListenerSet;
import androidx.media3.session.MediaControllerImplBase;

/* renamed from: androidx.media3.session.w0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C0597w0 implements ListenerSet.Event, MediaControllerImplBase.RemoteSessionTask {
    public final /* synthetic */ Object a;

    public /* synthetic */ C0597w0(Object obj) {
        this.a = obj;
    }

    @Override // androidx.media3.common.util.ListenerSet.Event
    public void invoke(Object obj) {
        MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$94((PlayerInfo) this.a, (Player.Listener) obj);
    }

    @Override // androidx.media3.session.MediaControllerImplBase.RemoteSessionTask
    public void run(IMediaSession iMediaSession, int i) {
        ((MediaControllerImplBase.SurfaceCallback) this.a).lambda$surfaceCreated$0(iMediaSession, i);
    }
}
