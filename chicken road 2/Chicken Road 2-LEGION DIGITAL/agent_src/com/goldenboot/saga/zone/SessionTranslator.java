package com.goldenboot.saga.zone;

import kotlin.Metadata;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SessionTranslator {
    public static final SessionTranslator evictLayout = new SessionTranslator();
    public static IconExporter growPayload = IconMaker.growPayload(-2103324701, false, ActivityMutator.reduceScope);

    /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class ActivityMutator implements IconExporter {
        public static final ActivityMutator reduceScope = new ActivityMutator();

        public final void evictLayout(NotificationFence notificationFence, int i) {
            if ((i & 3) == 2 && notificationFence.purgeNode()) {
                notificationFence.syncScope();
                return;
            }
            if (MorphPatch.bindBody()) {
                MorphPatch.formatPosition(-2103324701, i, -1, "com.goldenboot.saga.zone.ui.components.ComposableSingletons$TopBarKt.lambda-1.<anonymous> (TopBar.kt:34)");
            }
            if (MorphPatch.bindBody()) {
                MorphPatch.startResource();
            }
        }

        @Override // com.goldenboot.saga.zone.IconExporter
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            evictLayout((NotificationFence) obj, ((Number) obj2).intValue());
            return DpadBuilder.evictLayout;
        }
    }

    public final IconExporter evictLayout() {
        return growPayload;
    }
}
