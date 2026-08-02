package androidx.media3.session;

import androidx.media3.session.MediaSession;
import androidx.media3.session.MediaSessionImpl;

/* loaded from: classes3.dex */
public final /* synthetic */ class L3 implements MediaSessionImpl.RemoteControllerTask {
    @Override // androidx.media3.session.MediaSessionImpl.RemoteControllerTask
    public final void run(MediaSession.ControllerCb controllerCb, int i) {
        controllerCb.onRenderedFirstFrame(i);
    }
}
