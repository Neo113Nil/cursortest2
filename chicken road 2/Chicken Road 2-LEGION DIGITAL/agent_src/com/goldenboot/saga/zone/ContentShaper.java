package com.goldenboot.saga.zone;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
/* loaded from: classes2.dex */
public interface ContentShaper extends DrawerBroadcaster {

    /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
    public static final class ActivityMutator {
        public static DrawerBroadcaster[] evictLayout(ContentShaper contentShaper) {
            return PublisherAdministrator.evictLayout;
        }
    }

    DrawerBroadcaster[] detachStream();

    DrawerBroadcaster[] growPayload();
}
