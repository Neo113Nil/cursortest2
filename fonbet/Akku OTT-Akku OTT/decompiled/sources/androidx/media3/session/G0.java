package androidx.media3.session;

import androidx.media3.common.PlaybackParameters;
import androidx.media3.common.Player;
import androidx.media3.common.util.Consumer;
import androidx.media3.common.util.ListenerSet;

/* loaded from: classes3.dex */
public final /* synthetic */ class G0 implements ListenerSet.Event, Consumer {
    public final /* synthetic */ Object a;

    public /* synthetic */ G0(Object obj) {
        this.a = obj;
    }

    @Override // androidx.media3.common.util.Consumer
    public void accept(Object obj) {
        ((PlayerWrapper) obj).setPlaybackParameters((PlaybackParameters) this.a);
    }

    @Override // androidx.media3.common.util.ListenerSet.Event
    public void invoke(Object obj) {
        MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$102((PlayerInfo) this.a, (Player.Listener) obj);
    }
}
