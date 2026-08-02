package com.google.android.exoplayer2;

import com.google.android.exoplayer2.ExoPlayerImplInternal;
import com.google.android.exoplayer2.Player;
import com.google.android.exoplayer2.SimpleBasePlayer;
import com.google.android.exoplayer2.util.ListenerSet;

/* loaded from: classes4.dex */
public final /* synthetic */ class B implements ExoPlayerImplInternal.PlaybackInfoUpdateListener, ListenerSet.Event {
    public final /* synthetic */ Object a;

    public /* synthetic */ B(Object obj) {
        this.a = obj;
    }

    @Override // com.google.android.exoplayer2.util.ListenerSet.Event
    public void invoke(Object obj) {
        SimpleBasePlayer.lambda$updateStateAndInformListeners$55((SimpleBasePlayer.State) this.a, (Player.Listener) obj);
    }

    @Override // com.google.android.exoplayer2.ExoPlayerImplInternal.PlaybackInfoUpdateListener
    public void onPlaybackInfoUpdate(ExoPlayerImplInternal.PlaybackInfoUpdate playbackInfoUpdate) {
        ((ExoPlayerImpl) this.a).lambda$new$2(playbackInfoUpdate);
    }
}
