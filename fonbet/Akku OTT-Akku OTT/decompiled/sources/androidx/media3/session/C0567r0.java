package androidx.media3.session;

import androidx.media3.common.Player;
import androidx.media3.common.util.ListenerSet;

/* renamed from: androidx.media3.session.r0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C0567r0 implements ListenerSet.Event, com.google.common.util.concurrent.h {
    public final /* synthetic */ Object a;

    public /* synthetic */ C0567r0(Object obj) {
        this.a = obj;
    }

    @Override // com.google.common.util.concurrent.h
    public com.google.common.util.concurrent.u apply(Object obj) {
        com.google.common.util.concurrent.u lambda$createMediaItemsToBrowserItemsAsyncFunction$12;
        lambda$createMediaItemsToBrowserItemsAsyncFunction$12 = ((MediaLibraryServiceLegacyStub) this.a).lambda$createMediaItemsToBrowserItemsAsyncFunction$12((LibraryResult) obj);
        return lambda$createMediaItemsToBrowserItemsAsyncFunction$12;
    }

    @Override // androidx.media3.common.util.ListenerSet.Event
    public void invoke(Object obj) {
        MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$89((PlayerInfo) this.a, (Player.Listener) obj);
    }
}
