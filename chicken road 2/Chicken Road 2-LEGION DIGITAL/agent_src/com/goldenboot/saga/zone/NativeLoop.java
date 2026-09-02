package com.goldenboot.saga.zone;

import androidx.compose.ui.RemoteCallback;
import androidx.compose.ui.layout.GradientActivator;
import kotlin.jvm.internal.Lambda;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
/* loaded from: classes.dex */
public final class NativeLoop extends RemoteCallback.LayerUseCase implements KeyframeCreator {
    public ListKeeper flattenPackage;
    public float injectConstraint;

    /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
    public static final class ActivityMutator extends Lambda implements TouchRecord {
        public final /* synthetic */ androidx.compose.ui.layout.GradientActivator reduceScope;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ActivityMutator(androidx.compose.ui.layout.GradientActivator gradientActivator) {
            super(1);
            this.reduceScope = gradientActivator;
        }

        public final void evictLayout(GradientActivator.ActivityMutator activityMutator) {
            GradientActivator.ActivityMutator.drawConfig(activityMutator, this.reduceScope, 0, 0, 0.0f, 4, null);
        }

        @Override // com.goldenboot.saga.zone.TouchRecord
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            evictLayout((GradientActivator.ActivityMutator) obj);
            return DpadBuilder.evictLayout;
        }
    }

    public NativeLoop(ListKeeper listKeeper, float f) {
        this.flattenPackage = listKeeper;
        this.injectConstraint = f;
    }

    public final void evictMessage(ListKeeper listKeeper) {
        this.flattenPackage = listKeeper;
    }

    public final void packSnapshot(float f) {
        this.injectConstraint = f;
    }

    @Override // com.goldenboot.saga.zone.KeyframeCreator
    public ContentConfigurator popBlueprint(androidx.compose.ui.layout.PanelUtil panelUtil, BreadcrumbMerger breadcrumbMerger, long j) {
        int attachConfig;
        int notifyMessage;
        int connectPatch;
        int reduceScope;
        if (!PagerPlanner.popBlueprint(j) || this.flattenPackage == ListKeeper.Vertical) {
            attachConfig = PagerPlanner.attachConfig(j);
            notifyMessage = PagerPlanner.notifyMessage(j);
        } else {
            attachConfig = CellEntry.peekRevision(Math.round(PagerPlanner.notifyMessage(j) * this.injectConstraint), PagerPlanner.attachConfig(j), PagerPlanner.notifyMessage(j));
            notifyMessage = attachConfig;
        }
        if (!PagerPlanner.applyTask(j) || this.flattenPackage == ListKeeper.Horizontal) {
            connectPatch = PagerPlanner.connectPatch(j);
            reduceScope = PagerPlanner.reduceScope(j);
        } else {
            connectPatch = CellEntry.peekRevision(Math.round(PagerPlanner.reduceScope(j) * this.injectConstraint), PagerPlanner.connectPatch(j), PagerPlanner.reduceScope(j));
            reduceScope = connectPatch;
        }
        androidx.compose.ui.layout.GradientActivator prependArchive = breadcrumbMerger.prependArchive(SubscriberCache.evictLayout(attachConfig, notifyMessage, connectPatch, reduceScope));
        return androidx.compose.ui.layout.PanelUtil.encodeOrigin(panelUtil, prependArchive.getWidth(), prependArchive.getHeight(), null, new ActivityMutator(prependArchive), 4, null);
    }
}
