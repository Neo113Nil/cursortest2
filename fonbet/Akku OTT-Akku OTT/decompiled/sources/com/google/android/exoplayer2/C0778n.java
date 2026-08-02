package com.google.android.exoplayer2;

import com.google.android.exoplayer2.Player;
import com.google.android.exoplayer2.SimpleBasePlayer;
import com.google.android.exoplayer2.util.ListenerSet;

/* renamed from: com.google.android.exoplayer2.n, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final /* synthetic */ class C0778n implements ListenerSet.Event {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ C0778n(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // com.google.android.exoplayer2.util.ListenerSet.Event
    public final void invoke(Object obj) {
        switch (this.a) {
            case 0:
                ((Player.Listener) obj).onMediaMetadataChanged((MediaMetadata) this.b);
                break;
            default:
                SimpleBasePlayer.lambda$updateStateAndInformListeners$43((SimpleBasePlayer.State) this.b, (Player.Listener) obj);
                break;
        }
    }
}
