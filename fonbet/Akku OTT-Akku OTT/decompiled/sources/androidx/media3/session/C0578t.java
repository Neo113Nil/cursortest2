package androidx.media3.session;

import android.os.Bundle;
import androidx.media3.common.Player;
import androidx.media3.common.util.Consumer;
import androidx.media3.common.util.ListenerSet;
import androidx.media3.session.MediaBrowser;
import androidx.media3.session.MediaBrowserImplLegacy;
import androidx.media3.session.MediaControllerImplLegacy;

/* renamed from: androidx.media3.session.t, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C0578t implements Consumer, ListenerSet.Event {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ C0578t(Object obj, Object obj2, Object obj3) {
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
    }

    @Override // androidx.media3.common.util.Consumer
    public void accept(Object obj) {
        ((MediaBrowserImplLegacy.SubscribeCallback) this.a).lambda$onErrorInternal$0((String) this.b, (Bundle) this.c, (MediaBrowser.Listener) obj);
    }

    @Override // androidx.media3.common.util.ListenerSet.Event
    public void invoke(Object obj) {
        MediaControllerImplLegacy.lambda$updateControllerInfo$10((MediaControllerImplLegacy.ControllerInfo) this.a, (MediaControllerImplLegacy.ControllerInfo) this.b, (Integer) this.c, (Player.Listener) obj);
    }
}
