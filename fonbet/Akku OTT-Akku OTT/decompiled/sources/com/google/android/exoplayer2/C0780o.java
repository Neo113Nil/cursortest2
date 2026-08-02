package com.google.android.exoplayer2;

import com.google.android.exoplayer2.Player;
import com.google.android.exoplayer2.SimpleBasePlayer;
import com.google.android.exoplayer2.util.ListenerSet;

/* renamed from: com.google.android.exoplayer2.o, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final /* synthetic */ class C0780o implements ListenerSet.Event {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ C0780o(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // com.google.android.exoplayer2.util.ListenerSet.Event
    public final void invoke(Object obj) {
        switch (this.a) {
            case 0:
                ExoPlayerImpl.lambda$updatePlaybackInfo$19((PlaybackInfo) this.b, (Player.Listener) obj);
                break;
            default:
                SimpleBasePlayer.lambda$updateStateAndInformListeners$44((SimpleBasePlayer.State) this.b, (Player.Listener) obj);
                break;
        }
    }
}
