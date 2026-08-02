package com.google.android.exoplayer2;

import com.google.android.exoplayer2.Player;
import com.google.android.exoplayer2.SimpleBasePlayer;
import com.google.android.exoplayer2.util.ListenerSet;

/* loaded from: classes4.dex */
public final /* synthetic */ class G implements ListenerSet.Event {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ G(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // com.google.android.exoplayer2.util.ListenerSet.Event
    public final void invoke(Object obj) {
        switch (this.a) {
            case 0:
                ((ExoPlayerImpl) this.b).lambda$updateAvailableCommands$26((Player.Listener) obj);
                break;
            default:
                SimpleBasePlayer.lambda$updateStateAndInformListeners$59((SimpleBasePlayer.State) this.b, (Player.Listener) obj);
                break;
        }
    }
}
