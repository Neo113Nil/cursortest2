package com.goldenboot.saga.zone;

import kotlin.jvm.internal.Lambda;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
/* loaded from: classes.dex */
public abstract class ScrollFacilitator {

    /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
    public static final class ActivityMutator extends Lambda implements IconExporter {
        public final /* synthetic */ ConfigListener notifyMessage;
        public final /* synthetic */ ShapeConverter reduceScope;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ActivityMutator(ShapeConverter shapeConverter, ConfigListener configListener) {
            super(2);
            this.reduceScope = shapeConverter;
            this.notifyMessage = configListener;
        }

        public final void evictLayout(NotificationFence notificationFence, int i) {
            if ((i & 3) == 2 && notificationFence.purgeNode()) {
                notificationFence.syncScope();
                return;
            }
            if (MorphPatch.bindBody()) {
                MorphPatch.formatPosition(1863926504, i, -1, "androidx.compose.foundation.lazy.layout.LazySaveableStateHolderProvider.<anonymous> (LazySaveableStateHolder.kt:49)");
            }
            this.reduceScope.applyTask(ActivityHook.growPayload(notificationFence, 0));
            this.notifyMessage.invoke(this.reduceScope, notificationFence, 0);
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

    /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
    public static final class BounceHandler extends Lambda implements IconExporter {
        public final /* synthetic */ int notifyMessage;
        public final /* synthetic */ ConfigListener reduceScope;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public BounceHandler(ConfigListener configListener, int i) {
            super(2);
            this.reduceScope = configListener;
            this.notifyMessage = i;
        }

        public final void evictLayout(NotificationFence notificationFence, int i) {
            ScrollFacilitator.evictLayout(this.reduceScope, notificationFence, NavBarImpl.evictLayout(this.notifyMessage | 1));
        }

        @Override // com.goldenboot.saga.zone.IconExporter
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            evictLayout((NotificationFence) obj, ((Number) obj2).intValue());
            return DpadBuilder.evictLayout;
        }
    }

    /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
    public static final class FeedbackFlow extends Lambda implements ElevationNode {
        public final /* synthetic */ MotionTunnel reduceScope;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FeedbackFlow(MotionTunnel motionTunnel) {
            super(0);
            this.reduceScope = motionTunnel;
        }

        @Override // com.goldenboot.saga.zone.ElevationNode
        /* renamed from: evictLayout, reason: merged with bridge method [inline-methods] */
        public final ShapeConverter invoke() {
            return new ShapeConverter(this.reduceScope, AttrConductor.updateTimer());
        }
    }

    public static final void evictLayout(ConfigListener configListener, NotificationFence notificationFence, int i) {
        int i2;
        NotificationFence connectPatch = notificationFence.connectPatch(674185128);
        if ((i & 6) == 0) {
            i2 = (connectPatch.drawField(configListener) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && connectPatch.purgeNode()) {
            connectPatch.syncScope();
        } else {
            if (MorphPatch.bindBody()) {
                MorphPatch.formatPosition(674185128, i2, -1, "androidx.compose.foundation.lazy.layout.LazySaveableStateHolderProvider (LazySaveableStateHolder.kt:41)");
            }
            MotionTunnel motionTunnel = (MotionTunnel) connectPatch.expandArgs(SetupCompiler.flushSample());
            Object[] objArr = {motionTunnel};
            PaletteMap evictLayout = ShapeConverter.attachConfig.evictLayout(motionTunnel);
            boolean drawField = connectPatch.drawField(motionTunnel);
            Object clipOrigin = connectPatch.clipOrigin();
            if (drawField || clipOrigin == NotificationFence.evictLayout.evictLayout()) {
                clipOrigin = new FeedbackFlow(motionTunnel);
                connectPatch.bindBody(clipOrigin);
            }
            ShapeConverter shapeConverter = (ShapeConverter) BaseHook.clipOrigin(objArr, evictLayout, null, (ElevationNode) clipOrigin, connectPatch, 0, 4);
            CellAllocator.injectMetric(SetupCompiler.flushSample().detachStream(shapeConverter), IconMaker.detachStream(1863926504, true, new ActivityMutator(shapeConverter, configListener), connectPatch, 54), connectPatch, DragInspector.applyTask | 48);
            if (MorphPatch.bindBody()) {
                MorphPatch.startResource();
            }
        }
        ShapeCounter drawScope = connectPatch.drawScope();
        if (drawScope != null) {
            drawScope.evictLayout(new BounceHandler(configListener, i));
        }
    }
}
