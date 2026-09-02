package com.goldenboot.saga.zone;

import androidx.compose.ui.layout.GradientActivator;
import com.goldenboot.saga.zone.AlarmMulticaster;
import com.goldenboot.saga.zone.ChannelUploader;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
/* loaded from: classes.dex */
public abstract class WaveGuard {
    public static final HashMap evictLayout = detachStream(true);
    public static final HashMap growPayload = detachStream(false);
    public static final FlexMaterializer injectMetric = new LazyBus(ChannelUploader.INSTANCE.syncScope(), false);
    public static final FlexMaterializer detachStream = BounceHandler.evictLayout;

    /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
    public static final class ActivityMutator extends Lambda implements IconExporter {
        public final /* synthetic */ int notifyMessage;
        public final /* synthetic */ androidx.compose.ui.RemoteCallback reduceScope;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ActivityMutator(androidx.compose.ui.RemoteCallback remoteCallback, int i) {
            super(2);
            this.reduceScope = remoteCallback;
            this.notifyMessage = i;
        }

        public final void evictLayout(NotificationFence notificationFence, int i) {
            WaveGuard.evictLayout(this.reduceScope, notificationFence, NavBarImpl.evictLayout(this.notifyMessage | 1));
        }

        @Override // com.goldenboot.saga.zone.IconExporter
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            evictLayout((NotificationFence) obj, ((Number) obj2).intValue());
            return DpadBuilder.evictLayout;
        }
    }

    public static final void applyTask(GradientActivator.ActivityMutator activityMutator, androidx.compose.ui.layout.GradientActivator gradientActivator, BreadcrumbMerger breadcrumbMerger, LabelCache labelCache, int i, int i2, ChannelUploader channelUploader) {
        ChannelUploader evictMessage;
        AttrTrigger clipOrigin = clipOrigin(breadcrumbMerger);
        GradientActivator.ActivityMutator.startResource(activityMutator, gradientActivator, ((clipOrigin == null || (evictMessage = clipOrigin.evictMessage()) == null) ? channelUploader : evictMessage).evictLayout(ProgressPatch.evictLayout(gradientActivator.getWidth(), gradientActivator.getHeight()), ProgressPatch.evictLayout(i, i2), labelCache), 0.0f, 2, null);
    }

    public static final AttrTrigger clipOrigin(BreadcrumbMerger breadcrumbMerger) {
        Object parentData = breadcrumbMerger.getParentData();
        if (parentData instanceof AttrTrigger) {
            return (AttrTrigger) parentData;
        }
        return null;
    }

    public static final HashMap detachStream(boolean z) {
        HashMap hashMap = new HashMap(9);
        ChannelUploader.Companion companion = ChannelUploader.INSTANCE;
        releaseHeader(hashMap, z, companion.syncScope());
        releaseHeader(hashMap, z, companion.drawScope());
        releaseHeader(hashMap, z, companion.findTask());
        releaseHeader(hashMap, z, companion.reduceScope());
        releaseHeader(hashMap, z, companion.applyTask());
        releaseHeader(hashMap, z, companion.drawField());
        releaseHeader(hashMap, z, companion.flushSample());
        releaseHeader(hashMap, z, companion.injectMetric());
        releaseHeader(hashMap, z, companion.releaseHeader());
        return hashMap;
    }

    public static final void evictLayout(androidx.compose.ui.RemoteCallback remoteCallback, NotificationFence notificationFence, int i) {
        int i2;
        NotificationFence connectPatch = notificationFence.connectPatch(-211209833);
        if ((i & 6) == 0) {
            i2 = (connectPatch.formatPosition(remoteCallback) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && connectPatch.purgeNode()) {
            connectPatch.syncScope();
        } else {
            if (MorphPatch.bindBody()) {
                MorphPatch.formatPosition(-211209833, i2, -1, "androidx.compose.foundation.layout.Box (Box.kt:236)");
            }
            FlexMaterializer flexMaterializer = detachStream;
            int evictLayout2 = ShadowStack.evictLayout(connectPatch, 0);
            androidx.compose.ui.RemoteCallback serializeOffset = androidx.compose.ui.FeedbackFlow.serializeOffset(connectPatch, remoteCallback);
            StateMediator inflateEdge = connectPatch.inflateEdge();
            AlarmMulticaster.Companion companion = AlarmMulticaster.INSTANCE;
            ElevationNode evictLayout3 = companion.evictLayout();
            if (connectPatch.drawRequest() == null) {
                ShadowStack.injectMetric();
            }
            connectPatch.inflateAdapter();
            if (connectPatch.peekRevision()) {
                connectPatch.gatherAdapter(evictLayout3);
            } else {
                connectPatch.packPackage();
            }
            NotificationFence growPayload2 = ContainerBarrier.growPayload(connectPatch);
            ContainerBarrier.releaseHeader(growPayload2, flexMaterializer, companion.releaseHeader());
            ContainerBarrier.releaseHeader(growPayload2, inflateEdge, companion.flushSample());
            ContainerBarrier.releaseHeader(growPayload2, serializeOffset, companion.clipOrigin());
            IconExporter growPayload3 = companion.growPayload();
            if (growPayload2.peekRevision() || !Intrinsics.areEqual(growPayload2.clipOrigin(), Integer.valueOf(evictLayout2))) {
                growPayload2.bindBody(Integer.valueOf(evictLayout2));
                growPayload2.serializeOffset(Integer.valueOf(evictLayout2), growPayload3);
            }
            connectPatch.updateAction();
            if (MorphPatch.bindBody()) {
                MorphPatch.startResource();
            }
        }
        ShapeCounter drawScope = connectPatch.drawScope();
        if (drawScope != null) {
            drawScope.evictLayout(new ActivityMutator(remoteCallback, i));
        }
    }

    public static final boolean flushSample(BreadcrumbMerger breadcrumbMerger) {
        AttrTrigger clipOrigin = clipOrigin(breadcrumbMerger);
        if (clipOrigin != null) {
            return clipOrigin.packSnapshot();
        }
        return false;
    }

    public static final void releaseHeader(HashMap hashMap, boolean z, ChannelUploader channelUploader) {
        hashMap.put(channelUploader, new LazyBus(channelUploader, z));
    }

    public static final FlexMaterializer updateTimer(ChannelUploader channelUploader, boolean z) {
        FlexMaterializer flexMaterializer = (FlexMaterializer) (z ? evictLayout : growPayload).get(channelUploader);
        return flexMaterializer == null ? new LazyBus(channelUploader, z) : flexMaterializer;
    }

    /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
    public static final class BounceHandler implements FlexMaterializer {
        public static final BounceHandler evictLayout = new BounceHandler();

        @Override // com.goldenboot.saga.zone.FlexMaterializer
        public final ContentConfigurator evictLayout(androidx.compose.ui.layout.PanelUtil panelUtil, List list, long j) {
            return androidx.compose.ui.layout.PanelUtil.encodeOrigin(panelUtil, PagerPlanner.attachConfig(j), PagerPlanner.connectPatch(j), null, ActivityMutator.reduceScope, 4, null);
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
}
