package androidx.media3.session;

import androidx.media3.session.MediaSession;
import androidx.media3.session.MediaSessionImpl;
import androidx.media3.session.MediaSessionLegacyStub;

/* renamed from: androidx.media3.session.e3, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C0486e3 implements MediaSessionImpl.RemoteControllerTask, MediaSessionLegacyStub.SessionTask {
    public final /* synthetic */ Object a;

    public /* synthetic */ C0486e3(Object obj) {
        this.a = obj;
    }

    @Override // androidx.media3.session.MediaSessionImpl.RemoteControllerTask
    public void run(MediaSession.ControllerCb controllerCb, int i) {
        controllerCb.onError(i, (SessionError) this.a);
    }

    @Override // androidx.media3.session.MediaSessionLegacyStub.SessionTask
    public void run(MediaSession.ControllerInfo controllerInfo) {
        ((MediaSessionLegacyStub) this.a).lambda$onPrepare$3(controllerInfo);
    }
}
