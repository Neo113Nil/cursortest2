package androidx.media3.session;

import androidx.media3.common.FlagSet;
import androidx.media3.common.Player;
import androidx.media3.common.util.ListenerSet;
import androidx.media3.session.MediaControllerStub;

/* renamed from: androidx.media3.session.k1, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C0526k1 implements ListenerSet.IterationFinishedEvent, MediaControllerStub.ControllerTask {
    public final /* synthetic */ Object a;

    public /* synthetic */ C0526k1(Object obj) {
        this.a = obj;
    }

    @Override // androidx.media3.common.util.ListenerSet.IterationFinishedEvent
    public void invoke(Object obj, FlagSet flagSet) {
        ((MediaControllerImplBase) this.a).lambda$new$0((Player.Listener) obj, flagSet);
    }

    @Override // androidx.media3.session.MediaControllerStub.ControllerTask
    public void run(MediaControllerImplBase mediaControllerImplBase) {
        mediaControllerImplBase.onAvailableCommandsChangedFromPlayer((Player.Commands) this.a);
    }
}
