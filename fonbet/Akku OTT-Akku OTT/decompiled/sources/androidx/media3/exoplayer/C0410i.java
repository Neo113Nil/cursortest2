package androidx.media3.exoplayer;

import androidx.media3.common.Player;
import androidx.media3.common.TrackSelectionParameters;
import androidx.media3.common.util.BackgroundThreadStateHandler;
import androidx.media3.common.util.ListenerSet;
import androidx.media3.exoplayer.DefaultSuitableOutputChecker;
import androidx.media3.exoplayer.SuitableOutputChecker;

/* renamed from: androidx.media3.exoplayer.i, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C0410i implements BackgroundThreadStateHandler.StateChangeListener, ListenerSet.Event {
    public final /* synthetic */ Object a;

    public /* synthetic */ C0410i(Object obj) {
        this.a = obj;
    }

    @Override // androidx.media3.common.util.ListenerSet.Event
    public void invoke(Object obj) {
        ((Player.Listener) obj).onTrackSelectionParametersChanged((TrackSelectionParameters) this.a);
    }

    @Override // androidx.media3.common.util.BackgroundThreadStateHandler.StateChangeListener
    public void onStateChanged(Object obj, Object obj2) {
        DefaultSuitableOutputChecker.ImplApi23.lambda$enable$0((SuitableOutputChecker.Callback) this.a, (Boolean) obj, (Boolean) obj2);
    }
}
