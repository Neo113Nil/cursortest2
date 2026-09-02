package com.goldenboot.saga.zone;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bç\u0080\u0001\u0018\u00002\u00020\u0001J)\u0010\b\u001a\u00020\u0006*\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\b\u0010\tJ)\u0010\u000b\u001a\u00020\u0006*\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\n\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000b\u0010\tJ)\u0010\f\u001a\u00020\u0006*\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\f\u0010\tJ)\u0010\r\u001a\u00020\u0006*\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\n\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\r\u0010\tJ)\u0010\u0013\u001a\u00020\u0012*\u00020\u000e2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00032\u0006\u0010\u0011\u001a\u00020\u0010H&¢\u0006\u0004\b\u0013\u0010\u0014ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0015À\u0006\u0003"}, d2 = {"Lcom/goldenboot/saga/zone/FlexMaterializer;", "", "Lcom/goldenboot/saga/zone/ProducerRecovery;", "", "Lcom/goldenboot/saga/zone/FrameRevision;", "measurables", "", "height", "detachStream", "(Lcom/goldenboot/saga/zone/ProducerRecovery;Ljava/util/List;I)I", "width", "releaseHeader", "injectMetric", "growPayload", "Landroidx/compose/ui/layout/PanelUtil;", "Lcom/goldenboot/saga/zone/BreadcrumbMerger;", "Lcom/goldenboot/saga/zone/PagerPlanner;", "constraints", "Lcom/goldenboot/saga/zone/ContentConfigurator;", "measure", "(Landroidx/compose/ui/layout/PanelUtil;Ljava/util/List;Lcom/goldenboot/saga/zone/PagerPlanner;)Lcom/goldenboot/saga/zone/ContentConfigurator;", "ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public interface FlexMaterializer {

    /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class ActivityMutator {
        @Deprecated
        public static int detachStream(FlexMaterializer flexMaterializer, ProducerRecovery producerRecovery, List<? extends FrameRevision> list, int i) {
            return FlexMaterializer.super.detachStream(producerRecovery, list, i);
        }

        @Deprecated
        public static int evictLayout(FlexMaterializer flexMaterializer, ProducerRecovery producerRecovery, List<? extends FrameRevision> list, int i) {
            return FlexMaterializer.super.growPayload(producerRecovery, list, i);
        }

        @Deprecated
        public static int growPayload(FlexMaterializer flexMaterializer, ProducerRecovery producerRecovery, List<? extends FrameRevision> list, int i) {
            return FlexMaterializer.super.injectMetric(producerRecovery, list, i);
        }

        @Deprecated
        public static int injectMetric(FlexMaterializer flexMaterializer, ProducerRecovery producerRecovery, List<? extends FrameRevision> list, int i) {
            return FlexMaterializer.super.releaseHeader(producerRecovery, list, i);
        }
    }

    default int detachStream(ProducerRecovery producerRecovery, List<? extends FrameRevision> list, int i) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(new DelegateDelta(list.get(i2), WidgetActivator.reduceScope, StyleCycle.reduceScope));
        }
        return evictLayout(new androidx.compose.ui.layout.HeaderUtil(producerRecovery, producerRecovery.getLayoutDirection()), arrayList, SubscriberCache.growPayload(0, 0, 0, i, 7, null)).getEvictLayout();
    }

    ContentConfigurator evictLayout(androidx.compose.ui.layout.PanelUtil panelUtil, List<? extends BreadcrumbMerger> list, long j);

    default int growPayload(ProducerRecovery producerRecovery, List<? extends FrameRevision> list, int i) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(new DelegateDelta(list.get(i2), WidgetActivator.notifyMessage, StyleCycle.notifyMessage));
        }
        return evictLayout(new androidx.compose.ui.layout.HeaderUtil(producerRecovery, producerRecovery.getLayoutDirection()), arrayList, SubscriberCache.growPayload(0, i, 0, 0, 13, null)).getGrowPayload();
    }

    default int injectMetric(ProducerRecovery producerRecovery, List<? extends FrameRevision> list, int i) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(new DelegateDelta(list.get(i2), WidgetActivator.notifyMessage, StyleCycle.reduceScope));
        }
        return evictLayout(new androidx.compose.ui.layout.HeaderUtil(producerRecovery, producerRecovery.getLayoutDirection()), arrayList, SubscriberCache.growPayload(0, 0, 0, i, 7, null)).getEvictLayout();
    }

    default int releaseHeader(ProducerRecovery producerRecovery, List<? extends FrameRevision> list, int i) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(new DelegateDelta(list.get(i2), WidgetActivator.reduceScope, StyleCycle.notifyMessage));
        }
        return evictLayout(new androidx.compose.ui.layout.HeaderUtil(producerRecovery, producerRecovery.getLayoutDirection()), arrayList, SubscriberCache.growPayload(0, i, 0, 0, 13, null)).getGrowPayload();
    }
}
