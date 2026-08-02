package androidx.media3.session;

import androidx.media3.common.MediaItem;
import androidx.media3.common.Player;
import androidx.media3.common.util.Consumer;
import androidx.media3.common.util.ListenerSet;
import androidx.media3.session.MediaBrowser;
import androidx.media3.session.MediaBrowserImplLegacy;
import androidx.media3.session.MediaController;
import androidx.media3.session.MediaControllerImplLegacy;

/* renamed from: androidx.media3.session.r, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C0566r implements Consumer, ListenerSet.Event {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ C0566r(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // androidx.media3.common.util.Consumer
    public void accept(Object obj) {
        switch (this.a) {
            case 0:
                ((MediaBrowserImplLegacy.AnonymousClass2) this.b).lambda$onError$1((String) this.c, (MediaBrowser.Listener) obj);
                break;
            default:
                ((MediaControllerImplLegacy) this.b).lambda$updateControllerInfo$27((MediaControllerImplLegacy.ControllerInfo) this.c, (MediaController.Listener) obj);
                break;
        }
    }

    @Override // androidx.media3.common.util.ListenerSet.Event
    public void invoke(Object obj) {
        MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$79((MediaItem) this.b, (Integer) this.c, (Player.Listener) obj);
    }
}
