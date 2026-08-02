package androidx.media3.session;

import androidx.media3.common.PlaybackParameters;
import androidx.media3.common.Player;
import androidx.media3.common.util.Consumer;
import androidx.media3.common.util.ListenerSet;
import androidx.media3.session.MediaController;
import androidx.media3.session.MediaSession;
import androidx.media3.session.MediaSessionImpl;

/* renamed from: androidx.media3.session.s0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C0573s0 implements ListenerSet.Event, Consumer, MediaSessionImpl.RemoteControllerTask {
    public final /* synthetic */ Object a;

    public /* synthetic */ C0573s0(Object obj) {
        this.a = obj;
    }

    @Override // androidx.media3.common.util.Consumer
    public void accept(Object obj) {
        ((MediaControllerImplBase) this.a).lambda$onAvailableCommandsChangedFromSession$111((MediaController.Listener) obj);
    }

    @Override // androidx.media3.common.util.ListenerSet.Event
    public void invoke(Object obj) {
        MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$90((PlayerInfo) this.a, (Player.Listener) obj);
    }

    @Override // androidx.media3.session.MediaSessionImpl.RemoteControllerTask
    public void run(MediaSession.ControllerCb controllerCb, int i) {
        controllerCb.onPlaybackParametersChanged(i, (PlaybackParameters) this.a);
    }
}
