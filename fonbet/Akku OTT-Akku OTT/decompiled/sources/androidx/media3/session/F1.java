package androidx.media3.session;

import androidx.media3.common.Player;
import androidx.media3.common.util.Consumer;
import androidx.media3.common.util.ListenerSet;

/* loaded from: classes3.dex */
public final /* synthetic */ class F1 implements ListenerSet.Event, Consumer {
    public final /* synthetic */ float a;

    public /* synthetic */ F1(float f) {
        this.a = f;
    }

    @Override // androidx.media3.common.util.Consumer
    public void accept(Object obj) {
        ((PlayerWrapper) obj).setPlaybackSpeed(this.a);
    }

    @Override // androidx.media3.common.util.ListenerSet.Event
    public void invoke(Object obj) {
        ((Player.Listener) obj).onVolumeChanged(this.a);
    }
}
