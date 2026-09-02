package com.goldenboot.saga.zone;

import androidx.compose.ui.input.pointer.SuspendPointerInputElement;
import com.goldenboot.saga.zone.AlarmMulticaster;
import com.goldenboot.saga.zone.ClientSerializer;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
/* loaded from: classes.dex */
public abstract class SheetResolver {
    public static final SelectionHub evictLayout = CellAllocator.updateTimer(null, ActivityMutator.reduceScope, 1, null);

    /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
    public static final class ActivityMutator extends Lambda implements ElevationNode {
        public static final ActivityMutator reduceScope = new ActivityMutator();

        public ActivityMutator() {
            super(0);
        }

        public final float evictLayout() {
            return InsetsEdge.drawField(0);
        }

        @Override // com.goldenboot.saga.zone.ElevationNode
        public /* bridge */ /* synthetic */ Object invoke() {
            return InsetsEdge.flushSample(evictLayout());
        }
    }

    /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
    public static final class BounceHandler extends Lambda implements IconExporter {
        public final /* synthetic */ float attachConfig;
        public final /* synthetic */ long connectPatch;
        public final /* synthetic */ IconExporter inflateAdapter;
        public final /* synthetic */ ChannelCollector notifyMessage;
        public final /* synthetic */ androidx.compose.ui.RemoteCallback reduceScope;
        public final /* synthetic */ float resetDelta;

        /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
        public static final class ActivityMutator extends Lambda implements TouchRecord {
            public static final ActivityMutator reduceScope = new ActivityMutator();

            public ActivityMutator() {
                super(1);
            }

            public final void evictLayout(ServerMerger serverMerger) {
                SetupCoordinator.writeRequest(serverMerger, true);
            }

            @Override // com.goldenboot.saga.zone.TouchRecord
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                evictLayout((ServerMerger) obj);
                return DpadBuilder.evictLayout;
            }
        }

        /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
        /* renamed from: com.goldenboot.saga.zone.SheetResolver$BounceHandler$BounceHandler, reason: collision with other inner class name */
        public static final class C0157BounceHandler extends PanelRevision implements IconExporter {
            public int reduceScope;

            public C0157BounceHandler(ServiceRegulator serviceRegulator) {
                super(2, serviceRegulator);
            }

            @Override // com.goldenboot.saga.zone.ConfigValidator
            public final ServiceRegulator create(Object obj, ServiceRegulator serviceRegulator) {
                return new C0157BounceHandler(serviceRegulator);
            }

            @Override // com.goldenboot.saga.zone.IconExporter
            /* renamed from: detachStream, reason: merged with bridge method [inline-methods] */
            public final Object invoke(PulseBucket pulseBucket, ServiceRegulator serviceRegulator) {
                return ((C0157BounceHandler) create(pulseBucket, serviceRegulator)).invokeSuspend(DpadBuilder.evictLayout);
            }

            @Override // com.goldenboot.saga.zone.ConfigValidator
            public final Object invokeSuspend(Object obj) {
                RotateReceiver.releaseHeader();
                if (this.reduceScope != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ColumnForger.growPayload(obj);
                return DpadBuilder.evictLayout;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public BounceHandler(androidx.compose.ui.RemoteCallback remoteCallback, ChannelCollector channelCollector, long j, float f, ConnectionQueue connectionQueue, float f2, IconExporter iconExporter) {
            super(2);
            this.reduceScope = remoteCallback;
            this.notifyMessage = channelCollector;
            this.connectPatch = j;
            this.attachConfig = f;
            this.resetDelta = f2;
            this.inflateAdapter = iconExporter;
        }

        public final void evictLayout(NotificationFence notificationFence, int i) {
            androidx.compose.ui.RemoteCallback serializeOffset;
            if ((i & 3) == 2 && notificationFence.purgeNode()) {
                notificationFence.syncScope();
                return;
            }
            if (MorphPatch.bindBody()) {
                MorphPatch.formatPosition(-70914509, i, -1, "androidx.compose.material3.Surface.<anonymous> (Surface.kt:108)");
            }
            serializeOffset = FontPartition.releaseHeader(SheetResolver.detachStream(this.reduceScope, this.notifyMessage, SheetResolver.releaseHeader(this.connectPatch, this.attachConfig, notificationFence, 0), null, ((BackgroundCollection) notificationFence.expandArgs(TrackballConstructor.peekRevision())).purgeEdge(this.resetDelta)), false, ActivityMutator.reduceScope).serializeOffset(new SuspendPointerInputElement(DpadBuilder.evictLayout, null, null, new ClientSerializer.ActivityMutator(new C0157BounceHandler(null)), 6, null));
            IconExporter iconExporter = this.inflateAdapter;
            FlexMaterializer updateTimer = WaveGuard.updateTimer(ChannelUploader.INSTANCE.syncScope(), true);
            int evictLayout = ShadowStack.evictLayout(notificationFence, 0);
            StateMediator inflateEdge = notificationFence.inflateEdge();
            androidx.compose.ui.RemoteCallback serializeOffset2 = androidx.compose.ui.FeedbackFlow.serializeOffset(notificationFence, serializeOffset);
            AlarmMulticaster.Companion companion = AlarmMulticaster.INSTANCE;
            ElevationNode evictLayout2 = companion.evictLayout();
            if (notificationFence.drawRequest() == null) {
                ShadowStack.injectMetric();
            }
            notificationFence.inflateAdapter();
            if (notificationFence.peekRevision()) {
                notificationFence.gatherAdapter(evictLayout2);
            } else {
                notificationFence.packPackage();
            }
            NotificationFence growPayload = ContainerBarrier.growPayload(notificationFence);
            ContainerBarrier.releaseHeader(growPayload, updateTimer, companion.releaseHeader());
            ContainerBarrier.releaseHeader(growPayload, inflateEdge, companion.flushSample());
            IconExporter growPayload2 = companion.growPayload();
            if (growPayload.peekRevision() || !Intrinsics.areEqual(growPayload.clipOrigin(), Integer.valueOf(evictLayout))) {
                growPayload.bindBody(Integer.valueOf(evictLayout));
                growPayload.serializeOffset(Integer.valueOf(evictLayout), growPayload2);
            }
            ContainerBarrier.releaseHeader(growPayload, serializeOffset2, companion.clipOrigin());
            androidx.compose.foundation.layout.BounceHandler bounceHandler = androidx.compose.foundation.layout.BounceHandler.evictLayout;
            iconExporter.invoke(notificationFence, 0);
            notificationFence.updateAction();
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

    public static final androidx.compose.ui.RemoteCallback detachStream(androidx.compose.ui.RemoteCallback remoteCallback, ChannelCollector channelCollector, long j, ConnectionQueue connectionQueue, float f) {
        ChannelCollector channelCollector2;
        androidx.compose.ui.RemoteCallback remoteCallback2;
        if (f > 0.0f) {
            channelCollector2 = channelCollector;
            remoteCallback2 = androidx.compose.ui.graphics.StylusConverter.detachStream(androidx.compose.ui.RemoteCallback.INSTANCE, (r41 & 1) != 0 ? 1.0f : 0.0f, (r41 & 2) != 0 ? 1.0f : 0.0f, (r41 & 4) == 0 ? 0.0f : 1.0f, (r41 & 8) != 0 ? 0.0f : 0.0f, (r41 & 16) != 0 ? 0.0f : 0.0f, (r41 & 32) != 0 ? 0.0f : f, (r41 & 64) != 0 ? 0.0f : 0.0f, (r41 & ContentOperation.SpotShadowColor) != 0 ? 0.0f : 0.0f, (r41 & ContentOperation.RotationX) == 0 ? 0.0f : 0.0f, (r41 & ContentOperation.RotationY) != 0 ? 8.0f : 0.0f, (r41 & ContentOperation.RotationZ) != 0 ? androidx.compose.ui.graphics.MorphDirector.INSTANCE.evictLayout() : 0L, (r41 & ContentOperation.CameraDistance) != 0 ? ClientTunnel.evictLayout() : channelCollector2, (r41 & ContentOperation.TransformOrigin) != 0 ? false : false, (r41 & ContentOperation.Shape) != 0 ? null : null, (r41 & ContentOperation.Clip) != 0 ? WrapperSignal.growPayload() : 0L, (32768 & r41) != 0 ? WrapperSignal.growPayload() : 0L, (r41 & 65536) != 0 ? androidx.compose.ui.graphics.EndpointList.INSTANCE.evictLayout() : 0);
        } else {
            channelCollector2 = channelCollector;
            remoteCallback2 = androidx.compose.ui.RemoteCallback.INSTANCE;
        }
        return ListenerStore.evictLayout(androidx.compose.foundation.ActivityMutator.injectMetric(remoteCallback.serializeOffset(remoteCallback2).serializeOffset(androidx.compose.ui.RemoteCallback.INSTANCE), j, channelCollector2), channelCollector2);
    }

    public static final void evictLayout(androidx.compose.ui.RemoteCallback remoteCallback, ChannelCollector channelCollector, long j, long j2, float f, float f2, ConnectionQueue connectionQueue, IconExporter iconExporter, NotificationFence notificationFence, int i, int i2) {
        if ((i2 & 1) != 0) {
            remoteCallback = androidx.compose.ui.RemoteCallback.INSTANCE;
        }
        if ((i2 & 2) != 0) {
            channelCollector = ClientTunnel.evictLayout();
        }
        if ((i2 & 4) != 0) {
            j = StyleHelper.evictLayout.evictLayout(notificationFence, 6).expandArgs();
        }
        if ((i2 & 8) != 0) {
            j2 = NativeList.injectMetric(j, notificationFence, (i >> 6) & 14);
        }
        if ((i2 & 16) != 0) {
            f = InsetsEdge.drawField(0);
        }
        if ((i2 & 32) != 0) {
            f2 = InsetsEdge.drawField(0);
        }
        if ((i2 & 64) != 0) {
            connectionQueue = null;
        }
        if (MorphPatch.bindBody()) {
            MorphPatch.formatPosition(-513881741, i, -1, "androidx.compose.material3.Surface (Surface.kt:102)");
        }
        SelectionHub selectionHub = evictLayout;
        float drawField = InsetsEdge.drawField(((InsetsEdge) notificationFence.expandArgs(selectionHub)).drawScope() + f);
        CellAllocator.detachStream(new DragInspector[]{RotateModerator.evictLayout().detachStream(ContainerSource.serializeOffset(j2)), selectionHub.detachStream(InsetsEdge.flushSample(drawField))}, IconMaker.detachStream(-70914509, true, new BounceHandler(remoteCallback, channelCollector, j, drawField, connectionQueue, f2, iconExporter), notificationFence, 54), notificationFence, DragInspector.applyTask | 48);
        if (MorphPatch.bindBody()) {
            MorphPatch.startResource();
        }
    }

    public static final long releaseHeader(long j, float f, NotificationFence notificationFence, int i) {
        if (MorphPatch.bindBody()) {
            MorphPatch.formatPosition(-2079918090, i, -1, "androidx.compose.material3.surfaceColorAtElevation (Surface.kt:465)");
        }
        long evictLayout2 = NativeList.evictLayout(StyleHelper.evictLayout.evictLayout(notificationFence, 6), j, f, notificationFence, (i << 3) & 1008);
        if (MorphPatch.bindBody()) {
            MorphPatch.startResource();
        }
        return evictLayout2;
    }
}
