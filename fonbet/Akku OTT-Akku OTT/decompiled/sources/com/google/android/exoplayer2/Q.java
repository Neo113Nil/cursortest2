package com.google.android.exoplayer2;

import com.google.android.exoplayer2.Player;
import com.google.android.exoplayer2.SimpleBasePlayer;
import com.google.android.exoplayer2.text.CueGroup;
import com.google.android.exoplayer2.util.ListenerSet;

/* loaded from: classes4.dex */
public final /* synthetic */ class Q implements ListenerSet.Event {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ Q(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // com.google.android.exoplayer2.util.ListenerSet.Event
    public final void invoke(Object obj) {
        switch (this.a) {
            case 0:
                ((Player.Listener) obj).onCues((CueGroup) this.b);
                break;
            default:
                SimpleBasePlayer.lambda$updateStateAndInformListeners$40((SimpleBasePlayer.State) this.b, (Player.Listener) obj);
                break;
        }
    }
}
