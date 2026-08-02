package androidx.media3.session;

import androidx.media3.common.util.Consumer;
import androidx.media3.session.MediaSession;
import androidx.media3.session.MediaSessionImpl;

/* loaded from: classes3.dex */
public final /* synthetic */ class C3 implements MediaSessionImpl.RemoteControllerTask, Consumer {
    public final /* synthetic */ boolean a;

    public /* synthetic */ C3(boolean z) {
        this.a = z;
    }

    @Override // androidx.media3.common.util.Consumer
    public void accept(Object obj) {
        ((PlayerWrapper) obj).setPlayWhenReady(this.a);
    }

    @Override // androidx.media3.session.MediaSessionImpl.RemoteControllerTask
    public void run(MediaSession.ControllerCb controllerCb, int i) {
        controllerCb.onShuffleModeEnabledChanged(i, this.a);
    }
}
