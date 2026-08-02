package com.google.android.exoplayer2;

import com.google.android.exoplayer2.Player;
import com.google.android.exoplayer2.SimpleBasePlayer;
import com.google.android.exoplayer2.util.FlagSet;
import com.google.android.exoplayer2.util.ListenerSet;

/* loaded from: classes4.dex */
public final /* synthetic */ class A implements ListenerSet.IterationFinishedEvent, ListenerSet.Event {
    public final /* synthetic */ Object a;

    public /* synthetic */ A(Object obj) {
        this.a = obj;
    }

    @Override // com.google.android.exoplayer2.util.ListenerSet.Event
    public void invoke(Object obj) {
        SimpleBasePlayer.lambda$updateStateAndInformListeners$54((SimpleBasePlayer.State) this.a, (Player.Listener) obj);
    }

    @Override // com.google.android.exoplayer2.util.ListenerSet.IterationFinishedEvent
    public void invoke(Object obj, FlagSet flagSet) {
        ((ExoPlayerImpl) this.a).lambda$new$0((Player.Listener) obj, flagSet);
    }
}
