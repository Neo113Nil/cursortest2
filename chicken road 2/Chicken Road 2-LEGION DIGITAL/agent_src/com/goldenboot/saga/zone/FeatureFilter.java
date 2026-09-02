package com.goldenboot.saga.zone;

import androidx.compose.ui.RemoteCallback;
import androidx.compose.ui.layout.GradientActivator;
import kotlin.jvm.internal.Lambda;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
/* loaded from: classes.dex */
public final class FeatureFilter extends RemoteCallback.LayerUseCase implements TileLatch, KeyframeCreator {

    /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
    public static final class ActivityMutator extends Lambda implements TouchRecord {
        public final /* synthetic */ int connectPatch;
        public final /* synthetic */ androidx.compose.ui.layout.GradientActivator notifyMessage;
        public final /* synthetic */ int reduceScope;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ActivityMutator(int i, androidx.compose.ui.layout.GradientActivator gradientActivator, int i2) {
            super(1);
            this.reduceScope = i;
            this.notifyMessage = gradientActivator;
            this.connectPatch = i2;
        }

        public final void evictLayout(GradientActivator.ActivityMutator activityMutator) {
            GradientActivator.ActivityMutator.updateAction(activityMutator, this.notifyMessage, ChipChain.injectMetric((this.reduceScope - this.notifyMessage.getWidth()) / 2.0f), ChipChain.injectMetric((this.connectPatch - this.notifyMessage.getHeight()) / 2.0f), 0.0f, 4, null);
        }

        @Override // com.goldenboot.saga.zone.TouchRecord
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            evictLayout((GradientActivator.ActivityMutator) obj);
            return DpadBuilder.evictLayout;
        }
    }

    @Override // com.goldenboot.saga.zone.KeyframeCreator
    public ContentConfigurator popBlueprint(androidx.compose.ui.layout.PanelUtil panelUtil, BreadcrumbMerger breadcrumbMerger, long j) {
        float f = 0;
        float drawField = InsetsEdge.drawField(CellEntry.detachStream(((InsetsEdge) BoxMap.evictLayout(this, SpanVersion.evictLayout())).drawScope(), InsetsEdge.drawField(f)));
        androidx.compose.ui.layout.GradientActivator prependArchive = breadcrumbMerger.prependArchive(j);
        boolean z = getIsAttached() && !Float.isNaN(drawField) && InsetsEdge.popBlueprint(drawField, InsetsEdge.drawField(f)) > 0;
        int lookupStream = Float.isNaN(drawField) ? 0 : panelUtil.lookupStream(drawField);
        int max = z ? Math.max(prependArchive.getWidth(), lookupStream) : prependArchive.getWidth();
        int max2 = z ? Math.max(prependArchive.getHeight(), lookupStream) : prependArchive.getHeight();
        return androidx.compose.ui.layout.PanelUtil.encodeOrigin(panelUtil, max, max2, null, new ActivityMutator(max, prependArchive, max2), 4, null);
    }
}
