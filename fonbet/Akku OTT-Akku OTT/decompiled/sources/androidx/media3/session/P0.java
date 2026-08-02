package androidx.media3.session;

import android.os.Bundle;
import androidx.media3.common.Player;
import androidx.media3.common.util.ListenerSet;
import androidx.media3.session.MediaSession;
import androidx.media3.session.MediaSessionImpl;

/* loaded from: classes3.dex */
public final /* synthetic */ class P0 implements ListenerSet.Event, MediaSessionImpl.RemoteControllerTask {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;

    public /* synthetic */ P0(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    @Override // androidx.media3.common.util.ListenerSet.Event
    public void invoke(Object obj) {
        MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$86((PlayerInfo) this.a, (Integer) this.b, (Player.Listener) obj);
    }

    @Override // androidx.media3.session.MediaSessionImpl.RemoteControllerTask
    public void run(MediaSession.ControllerCb controllerCb, int i) {
        controllerCb.sendCustomCommand(i, (SessionCommand) this.a, (Bundle) this.b);
    }
}
