package androidx.media3.session;

import androidx.media3.common.Player;
import androidx.media3.common.util.ListenerSet;

/* renamed from: androidx.media3.session.z1, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C0616z1 implements ListenerSet.Event {
    @Override // androidx.media3.common.util.ListenerSet.Event
    public final void invoke(Object obj) {
        ((Player.Listener) obj).onPlaybackStateChanged(1);
    }
}
