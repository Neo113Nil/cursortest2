package com.goldenboot.saga.zone;

import androidx.compose.ui.layout.GradientActivator;
import java.util.List;
import kotlin.jvm.internal.Lambda;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
/* loaded from: classes.dex */
public final class BackgroundPresenter implements FlexMaterializer {
    public static final BackgroundPresenter evictLayout = new BackgroundPresenter();

    @Override // com.goldenboot.saga.zone.FlexMaterializer
    public ContentConfigurator evictLayout(androidx.compose.ui.layout.PanelUtil panelUtil, List list, long j) {
        return androidx.compose.ui.layout.PanelUtil.encodeOrigin(panelUtil, PagerPlanner.serializeOffset(j) ? PagerPlanner.notifyMessage(j) : 0, PagerPlanner.connectJob(j) ? PagerPlanner.reduceScope(j) : 0, null, ActivityMutator.reduceScope, 4, null);
    }

    /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
    public static final class ActivityMutator extends Lambda implements TouchRecord {
        public static final ActivityMutator reduceScope = new ActivityMutator();

        public ActivityMutator() {
            super(1);
        }

        @Override // com.goldenboot.saga.zone.TouchRecord
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            evictLayout((GradientActivator.ActivityMutator) obj);
            return DpadBuilder.evictLayout;
        }

        public final void evictLayout(GradientActivator.ActivityMutator activityMutator) {
        }
    }
}
