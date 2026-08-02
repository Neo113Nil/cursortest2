package androidx.media3.session;

import androidx.media3.common.Player;
import androidx.media3.common.util.ListenerSet;
import androidx.media3.session.MediaControllerImplLegacy;
import androidx.media3.session.MediaSession;
import androidx.media3.session.MediaSessionLegacyStub;

/* renamed from: androidx.media3.session.y, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C0608y implements ListenerSet.Event, MediaSessionLegacyStub.SessionTask {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ C0608y(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // androidx.media3.common.util.ListenerSet.Event
    public void invoke(Object obj) {
        switch (this.a) {
            case 0:
                ((MediaControllerImplBase) this.b).lambda$onAvailableCommandsChangedFromPlayer$113((Player.Listener) obj);
                break;
            default:
                MediaControllerImplLegacy.lambda$updateControllerInfo$16((MediaControllerImplLegacy.ControllerInfo) this.b, (Player.Listener) obj);
                break;
        }
    }

    @Override // androidx.media3.session.MediaSessionLegacyStub.SessionTask
    public void run(MediaSession.ControllerInfo controllerInfo) {
        ((MediaSessionLegacyStub) this.b).lambda$onFastForward$14(controllerInfo);
    }
}
