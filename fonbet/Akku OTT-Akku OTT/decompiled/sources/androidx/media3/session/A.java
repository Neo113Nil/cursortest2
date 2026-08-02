package androidx.media3.session;

import android.app.PendingIntent;
import androidx.media3.common.util.Consumer;
import androidx.media3.session.MediaController;
import androidx.media3.session.MediaSession;
import androidx.media3.session.MediaSessionImpl;
import androidx.media3.session.MediaSessionLegacyStub;
import androidx.media3.session.MediaSessionStub;

/* loaded from: classes3.dex */
public final /* synthetic */ class A implements Consumer, MediaSessionImpl.RemoteControllerTask, MediaSessionLegacyStub.SessionTask, MediaSessionStub.SessionTask {
    public final /* synthetic */ Object a;

    public /* synthetic */ A(Object obj) {
        this.a = obj;
    }

    @Override // androidx.media3.common.util.Consumer
    public void accept(Object obj) {
        ((MediaControllerImplBase) this.a).lambda$onAvailableCommandsChangedFromPlayer$115((MediaController.Listener) obj);
    }

    @Override // androidx.media3.session.MediaSessionStub.SessionTask
    public Object run(MediaSessionImpl mediaSessionImpl, MediaSession.ControllerInfo controllerInfo, int i) {
        com.google.common.util.concurrent.u lambda$getItem$67;
        lambda$getItem$67 = MediaSessionStub.lambda$getItem$67((String) this.a, (MediaLibrarySessionImpl) mediaSessionImpl, controllerInfo, i);
        return lambda$getItem$67;
    }

    @Override // androidx.media3.session.MediaSessionImpl.RemoteControllerTask
    public void run(MediaSession.ControllerCb controllerCb, int i) {
        controllerCb.onSessionActivityChanged(i, (PendingIntent) this.a);
    }

    @Override // androidx.media3.session.MediaSessionLegacyStub.SessionTask
    public void run(MediaSession.ControllerInfo controllerInfo) {
        ((MediaSessionLegacyStub) this.a).lambda$onSkipToPrevious$11(controllerInfo);
    }
}
