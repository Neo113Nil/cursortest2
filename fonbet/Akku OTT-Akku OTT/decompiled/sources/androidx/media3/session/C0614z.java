package androidx.media3.session;

import android.app.PendingIntent;
import androidx.media3.common.util.Consumer;
import androidx.media3.session.MediaController;
import androidx.media3.session.MediaSession;
import androidx.media3.session.MediaSessionImpl;
import androidx.media3.session.MediaSessionLegacyStub;

/* renamed from: androidx.media3.session.z, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C0614z implements Consumer, MediaSessionImpl.RemoteControllerTask, MediaSessionLegacyStub.SessionTask {
    public final /* synthetic */ Object a;

    public /* synthetic */ C0614z(Object obj) {
        this.a = obj;
    }

    @Override // androidx.media3.common.util.Consumer
    public void accept(Object obj) {
        ((MediaControllerImplBase) this.a).lambda$onAvailableCommandsChangedFromPlayer$114((MediaController.Listener) obj);
    }

    @Override // androidx.media3.session.MediaSessionImpl.RemoteControllerTask
    public void run(MediaSession.ControllerCb controllerCb, int i) {
        controllerCb.onSessionActivityChanged(i, (PendingIntent) this.a);
    }

    @Override // androidx.media3.session.MediaSessionLegacyStub.SessionTask
    public void run(MediaSession.ControllerInfo controllerInfo) {
        ((MediaSessionLegacyStub) this.a).lambda$onSkipToPrevious$10(controllerInfo);
    }
}
