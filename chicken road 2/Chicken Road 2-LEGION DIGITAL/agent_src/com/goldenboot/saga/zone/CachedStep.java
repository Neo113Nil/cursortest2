package com.goldenboot.saga.zone;

import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class CachedStep {
    public static final CachedStep evictLayout = new CachedStep();
    private static IconExporter growPayload = IconMaker.growPayload(210148896, false, ActivityMutator.reduceScope);

    /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/goldenboot/saga/zone/DpadBuilder;", "evictLayout", "(Lcom/goldenboot/saga/zone/NotificationFence;I)V"}, k = 3, mv = {2, 0, 0})
    public static final class ActivityMutator extends Lambda implements IconExporter {
        public static final ActivityMutator reduceScope = new ActivityMutator();

        public ActivityMutator() {
            super(2);
        }

        public final void evictLayout(NotificationFence notificationFence, int i) {
            if (!notificationFence.injectConstraint((i & 3) != 2, i & 1)) {
                notificationFence.syncScope();
                return;
            }
            if (MorphPatch.bindBody()) {
                MorphPatch.formatPosition(210148896, i, -1, "androidx.compose.ui.window.ComposableSingletons$AndroidDialog_androidKt.lambda$210148896.<anonymous> (AndroidDialog.android.kt:247)");
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
