package androidx.media3.session;

import android.os.Bundle;
import android.view.Surface;
import androidx.media3.common.AudioAttributes;
import androidx.media3.common.Player;
import androidx.media3.common.util.Consumer;
import androidx.media3.common.util.ListenerSet;
import androidx.media3.session.MediaSession;
import androidx.media3.session.MediaSessionImpl;

/* loaded from: classes3.dex */
public final /* synthetic */ class V implements ListenerSet.Event, MediaSessionImpl.RemoteControllerTask, Consumer {
    public final /* synthetic */ Object a;

    public /* synthetic */ V(Object obj) {
        this.a = obj;
    }

    @Override // androidx.media3.common.util.Consumer
    public void accept(Object obj) {
        ((PlayerWrapper) obj).setVideoSurface((Surface) this.a);
    }

    @Override // androidx.media3.common.util.ListenerSet.Event
    public void invoke(Object obj) {
        ((Player.Listener) obj).onAudioAttributesChanged((AudioAttributes) this.a);
    }

    @Override // androidx.media3.session.MediaSessionImpl.RemoteControllerTask
    public void run(MediaSession.ControllerCb controllerCb, int i) {
        controllerCb.onSessionExtrasChanged(i, (Bundle) this.a);
    }
}
