package com.goldenboot.saga.zone;

import androidx.compose.ui.RemoteCallback;
import com.goldenboot.saga.zone.AlarmMulticaster;
import com.goldenboot.saga.zone.ChannelUploader;
import com.goldenboot.saga.zone.LayerTunnel;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\u001a9\u0010\u0005\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0007¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u001d\u0010\b\u001a\u00020\u00012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0001¢\u0006\u0004\b\b\u0010\t\u001a9\u0010\u0010\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\f2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0001¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lkotlin/Function0;", "Lcom/goldenboot/saga/zone/DpadBuilder;", "onResume", "onRestart", "onExit", "updateTimer", "(Lcom/goldenboot/saga/zone/ElevationNode;Lcom/goldenboot/saga/zone/ElevationNode;Lcom/goldenboot/saga/zone/ElevationNode;Lcom/goldenboot/saga/zone/NotificationFence;I)V", "content", "clipOrigin", "(Lcom/goldenboot/saga/zone/IconExporter;Lcom/goldenboot/saga/zone/NotificationFence;I)V", "Lcom/goldenboot/saga/zone/CachedCreator;", "icon", "", "title", "subtitle", "body", "detachStream", "(Lcom/goldenboot/saga/zone/CachedCreator;Ljava/lang/String;Ljava/lang/String;Lcom/goldenboot/saga/zone/IconExporter;Lcom/goldenboot/saga/zone/NotificationFence;II)V", "app_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class LifecycleReader {

    /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class ActivityMutator implements IconExporter {
        final /* synthetic */ IconExporter attachConfig;
        final /* synthetic */ CachedCreator connectPatch;
        final /* synthetic */ String notifyMessage;
        final /* synthetic */ String reduceScope;

        public ActivityMutator(String str, String str2, CachedCreator cachedCreator, IconExporter iconExporter) {
            this.reduceScope = str;
            this.notifyMessage = str2;
            this.connectPatch = cachedCreator;
            this.attachConfig = iconExporter;
        }

        public final void evictLayout(NotificationFence notificationFence, int i) {
            if ((i & 3) == 2 && notificationFence.purgeNode()) {
                notificationFence.syncScope();
                return;
            }
            if (MorphPatch.bindBody()) {
                MorphPatch.formatPosition(1423168290, i, -1, "com.goldenboot.saga.zone.ui.screens.game.DialogCard.<anonymous> (PauseDialog.kt:83)");
            }
            ChannelUploader.Companion companion = ChannelUploader.INSTANCE;
            ChannelUploader.BounceHandler peekRevision = companion.peekRevision();
            String str = this.reduceScope;
            String str2 = this.notifyMessage;
            CachedCreator cachedCreator = this.connectPatch;
            IconExporter iconExporter = this.attachConfig;
            RemoteCallback.Companion companion2 = androidx.compose.ui.RemoteCallback.INSTANCE;
            FrameIndex frameIndex = FrameIndex.evictLayout;
            FlexMaterializer evictLayout = FlingDetector.evictLayout(frameIndex.detachStream(), peekRevision, notificationFence, 48);
            int evictLayout2 = ShadowStack.evictLayout(notificationFence, 0);
            StateMediator inflateEdge = notificationFence.inflateEdge();
            androidx.compose.ui.RemoteCallback serializeOffset = androidx.compose.ui.FeedbackFlow.serializeOffset(notificationFence, companion2);
            AlarmMulticaster.Companion companion3 = AlarmMulticaster.INSTANCE;
            ElevationNode evictLayout3 = companion3.evictLayout();
            if (notificationFence.drawRequest() == null) {
                ShadowStack.injectMetric();
            }
            notificationFence.inflateAdapter();
            if (notificationFence.peekRevision()) {
                notificationFence.gatherAdapter(evictLayout3);
            } else {
                notificationFence.packPackage();
            }
            NotificationFence growPayload = ContainerBarrier.growPayload(notificationFence);
            ContainerBarrier.releaseHeader(growPayload, evictLayout, companion3.releaseHeader());
            ContainerBarrier.releaseHeader(growPayload, inflateEdge, companion3.flushSample());
            IconExporter growPayload2 = companion3.growPayload();
            if (growPayload.peekRevision() || !Intrinsics.areEqual(growPayload.clipOrigin(), Integer.valueOf(evictLayout2))) {
                growPayload.bindBody(Integer.valueOf(evictLayout2));
                growPayload.serializeOffset(Integer.valueOf(evictLayout2), growPayload2);
            }
            ContainerBarrier.releaseHeader(growPayload, serializeOffset, companion3.clipOrigin());
            SystemSteward systemSteward = SystemSteward.evictLayout;
            androidx.compose.ui.RemoteCallback releaseHeader = StepperDeserializer.releaseHeader(androidx.compose.foundation.ActivityMutator.growPayload(ListenerStore.evictLayout(androidx.compose.foundation.layout.EndpointList.flushSample(companion2, InsetsEdge.drawField(74)), SaveCycle.releaseHeader()), LayerTunnel.Companion.connectJob(LayerTunnel.INSTANCE, CursorBuilder.notifyMessage(ContainerSource.serializeOffset(DrawerSemaphore.detachStream()), ContainerSource.serializeOffset(DrawerSemaphore.reduceScope())), 0L, 0.0f, 0, 14, null), null, 0.0f, 6, null), InsetsEdge.drawField(2), DrawerSemaphore.flushSample(), SaveCycle.releaseHeader());
            FlexMaterializer updateTimer = WaveGuard.updateTimer(companion.applyTask(), false);
            int evictLayout4 = ShadowStack.evictLayout(notificationFence, 0);
            StateMediator inflateEdge2 = notificationFence.inflateEdge();
            androidx.compose.ui.RemoteCallback serializeOffset2 = androidx.compose.ui.FeedbackFlow.serializeOffset(notificationFence, releaseHeader);
            ElevationNode evictLayout5 = companion3.evictLayout();
            if (notificationFence.drawRequest() == null) {
                ShadowStack.injectMetric();
            }
            notificationFence.inflateAdapter();
            if (notificationFence.peekRevision()) {
                notificationFence.gatherAdapter(evictLayout5);
            } else {
                notificationFence.packPackage();
            }
            NotificationFence growPayload3 = ContainerBarrier.growPayload(notificationFence);
            ContainerBarrier.releaseHeader(growPayload3, updateTimer, companion3.releaseHeader());
            ContainerBarrier.releaseHeader(growPayload3, inflateEdge2, companion3.flushSample());
            IconExporter growPayload4 = companion3.growPayload();
            if (growPayload3.peekRevision() || !Intrinsics.areEqual(growPayload3.clipOrigin(), Integer.valueOf(evictLayout4))) {
                growPayload3.bindBody(Integer.valueOf(evictLayout4));
                growPayload3.serializeOffset(Integer.valueOf(evictLayout4), growPayload4);
            }
            ContainerBarrier.releaseHeader(growPayload3, serializeOffset2, companion3.clipOrigin());
            androidx.compose.foundation.layout.BounceHandler bounceHandler = androidx.compose.foundation.layout.BounceHandler.evictLayout;
            CanvasSignal.evictLayout(cachedCreator, null, androidx.compose.foundation.layout.EndpointList.flushSample(companion2, InsetsEdge.drawField(40)), DrawerSemaphore.attachConfig(), notificationFence, 3504, 0);
            notificationFence.updateAction();
            StyleAllocator.evictLayout(androidx.compose.foundation.layout.EndpointList.releaseHeader(companion2, InsetsEdge.drawField(16)), notificationFence, 6);
            String upperCase = str.toUpperCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
            WatcherCreator.growPayload(upperCase, null, DrawerSemaphore.attachConfig(), FrameSaver.peekRevision(24), null, FontWeight.INSTANCE.releaseHeader(), null, FrameSaver.peekRevision(3), null, null, 0L, 0, false, 0, 0, null, null, notificationFence, 12782976, 0, 130898);
            NotificationFence notificationFence2 = notificationFence;
            notificationFence2.resumeSignature(246813366);
            if (str2 != null) {
                WatcherCreator.growPayload(str2, null, DrawerSemaphore.resetDelta(), FrameSaver.peekRevision(12), null, null, null, FrameSaver.peekRevision(2), null, null, 0L, 0, false, 0, 0, null, null, notificationFence, 12586368, 0, 130930);
                notificationFence2 = notificationFence;
            }
            notificationFence2.unlockMessage();
            StyleAllocator.evictLayout(androidx.compose.foundation.layout.EndpointList.releaseHeader(companion2, InsetsEdge.drawField(20)), notificationFence2, 6);
            androidx.compose.ui.RemoteCallback detachStream = androidx.compose.foundation.layout.EndpointList.detachStream(companion2, 0.0f, 1, null);
            FlexMaterializer evictLayout6 = FlingDetector.evictLayout(frameIndex.detachStream(), companion.peekRevision(), notificationFence2, 48);
            int evictLayout7 = ShadowStack.evictLayout(notificationFence2, 0);
            StateMediator inflateEdge3 = notificationFence2.inflateEdge();
            androidx.compose.ui.RemoteCallback serializeOffset3 = androidx.compose.ui.FeedbackFlow.serializeOffset(notificationFence2, detachStream);
            ElevationNode evictLayout8 = companion3.evictLayout();
            if (notificationFence2.drawRequest() == null) {
                ShadowStack.injectMetric();
            }
            notificationFence2.inflateAdapter();
            if (notificationFence2.peekRevision()) {
                notificationFence2.gatherAdapter(evictLayout8);
            } else {
                notificationFence2.packPackage();
            }
            NotificationFence growPayload5 = ContainerBarrier.growPayload(notificationFence2);
            ContainerBarrier.releaseHeader(growPayload5, evictLayout6, companion3.releaseHeader());
            ContainerBarrier.releaseHeader(growPayload5, inflateEdge3, companion3.flushSample());
            IconExporter growPayload6 = companion3.growPayload();
            if (growPayload5.peekRevision() || !Intrinsics.areEqual(growPayload5.clipOrigin(), Integer.valueOf(evictLayout7))) {
                growPayload5.bindBody(Integer.valueOf(evictLayout7));
                growPayload5.serializeOffset(Integer.valueOf(evictLayout7), growPayload6);
            }
            ContainerBarrier.releaseHeader(growPayload5, serializeOffset3, companion3.clipOrigin());
            iconExporter.invoke(notificationFence2, 0);
            notificationFence2.updateAction();
            notificationFence2.updateAction();
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
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class BounceHandler implements IconExporter {
        final /* synthetic */ ElevationNode connectPatch;
        final /* synthetic */ ElevationNode notifyMessage;
        final /* synthetic */ ElevationNode reduceScope;

        /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class ActivityMutator implements IconExporter {
            final /* synthetic */ ElevationNode connectPatch;
            final /* synthetic */ ElevationNode notifyMessage;
            final /* synthetic */ ElevationNode reduceScope;

            public ActivityMutator(ElevationNode elevationNode, ElevationNode elevationNode2, ElevationNode elevationNode3) {
                this.reduceScope = elevationNode;
                this.notifyMessage = elevationNode2;
                this.connectPatch = elevationNode3;
            }

            public final void evictLayout(NotificationFence notificationFence, int i) {
                if ((i & 3) == 2 && notificationFence.purgeNode()) {
                    notificationFence.syncScope();
                    return;
                }
                if (MorphPatch.bindBody()) {
                    MorphPatch.formatPosition(-732987169, i, -1, "com.goldenboot.saga.zone.ui.screens.game.PauseDialog.<anonymous>.<anonymous> (PauseDialog.kt:50)");
                }
                SwipeBenchmark swipeBenchmark = SwipeBenchmark.evictLayout;
                CachedCreator evictLayout = PanelRepository.evictLayout(swipeBenchmark);
                RemoteCallback.Companion companion = androidx.compose.ui.RemoteCallback.INSTANCE;
                CellAnnouncer.findTask("Resume", androidx.compose.foundation.layout.EndpointList.detachStream(companion, 0.0f, 1, null), evictLayout, false, null, this.reduceScope, notificationFence, 54, 24);
                float f = 10;
                StyleAllocator.evictLayout(androidx.compose.foundation.layout.EndpointList.releaseHeader(companion, InsetsEdge.drawField(f)), notificationFence, 6);
                CachedCreator evictLayout2 = FooterCompiler.evictLayout(swipeBenchmark);
                MenuSequence menuSequence = MenuSequence.connectPatch;
                CellAnnouncer.findTask("Restart", androidx.compose.foundation.layout.EndpointList.detachStream(companion, 0.0f, 1, null), evictLayout2, false, menuSequence, this.notifyMessage, notificationFence, 24630, 8);
                StyleAllocator.evictLayout(androidx.compose.foundation.layout.EndpointList.releaseHeader(companion, InsetsEdge.drawField(f)), notificationFence, 6);
                CellAnnouncer.findTask("Quit Match", androidx.compose.foundation.layout.EndpointList.detachStream(companion, 0.0f, 1, null), TriggerLock.evictLayout(swipeBenchmark), false, menuSequence, this.connectPatch, notificationFence, 24630, 8);
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

        public BounceHandler(ElevationNode elevationNode, ElevationNode elevationNode2, ElevationNode elevationNode3) {
            this.reduceScope = elevationNode;
            this.notifyMessage = elevationNode2;
            this.connectPatch = elevationNode3;
        }

        public final void evictLayout(NotificationFence notificationFence, int i) {
            if ((i & 3) == 2 && notificationFence.purgeNode()) {
                notificationFence.syncScope();
                return;
            }
            if (MorphPatch.bindBody()) {
                MorphPatch.formatPosition(1035672535, i, -1, "com.goldenboot.saga.zone.ui.screens.game.PauseDialog.<anonymous> (PauseDialog.kt:49)");
            }
            LifecycleReader.detachStream(PublisherState.evictLayout(SwipeBenchmark.evictLayout), "Paused", "Take a breath, champ", IconMaker.detachStream(-732987169, true, new ActivityMutator(this.reduceScope, this.notifyMessage, this.connectPatch), notificationFence, 54), notificationFence, 3504, 0);
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

    /* JADX INFO: Access modifiers changed from: private */
    public static final DpadBuilder applyTask(ElevationNode elevationNode, ElevationNode elevationNode2, ElevationNode elevationNode3, int i, NotificationFence notificationFence, int i2) {
        updateTimer(elevationNode, elevationNode2, elevationNode3, notificationFence, NavBarImpl.evictLayout(i | 1));
        return DpadBuilder.evictLayout;
    }

    public static final void clipOrigin(final IconExporter content, NotificationFence notificationFence, final int i) {
        int i2;
        Intrinsics.checkNotNullParameter(content, "content");
        NotificationFence connectPatch = notificationFence.connectPatch(-2039311773);
        if ((i & 6) == 0) {
            i2 = (connectPatch.drawField(content) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && connectPatch.purgeNode()) {
            connectPatch.syncScope();
        } else {
            if (MorphPatch.bindBody()) {
                MorphPatch.formatPosition(-2039311773, i2, -1, "com.goldenboot.saga.zone.ui.screens.game.ModalOverlay (PauseDialog.kt:60)");
            }
            androidx.compose.ui.RemoteCallback detachStream = androidx.compose.foundation.ActivityMutator.detachStream(androidx.compose.foundation.layout.EndpointList.growPayload(androidx.compose.ui.RemoteCallback.INSTANCE, 0.0f, 1, null), ContainerSource.gatherAdapter(DrawerSemaphore.popBlueprint(), 0.85f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null);
            FlexMaterializer updateTimer = WaveGuard.updateTimer(ChannelUploader.INSTANCE.applyTask(), false);
            int evictLayout = ShadowStack.evictLayout(connectPatch, 0);
            StateMediator inflateEdge = connectPatch.inflateEdge();
            androidx.compose.ui.RemoteCallback serializeOffset = androidx.compose.ui.FeedbackFlow.serializeOffset(connectPatch, detachStream);
            AlarmMulticaster.Companion companion = AlarmMulticaster.INSTANCE;
            ElevationNode evictLayout2 = companion.evictLayout();
            if (connectPatch.drawRequest() == null) {
                ShadowStack.injectMetric();
            }
            connectPatch.inflateAdapter();
            if (connectPatch.peekRevision()) {
                connectPatch.gatherAdapter(evictLayout2);
            } else {
                connectPatch.packPackage();
            }
            NotificationFence growPayload = ContainerBarrier.growPayload(connectPatch);
            ContainerBarrier.releaseHeader(growPayload, updateTimer, companion.releaseHeader());
            ContainerBarrier.releaseHeader(growPayload, inflateEdge, companion.flushSample());
            IconExporter growPayload2 = companion.growPayload();
            if (growPayload.peekRevision() || !Intrinsics.areEqual(growPayload.clipOrigin(), Integer.valueOf(evictLayout))) {
                growPayload.bindBody(Integer.valueOf(evictLayout));
                growPayload.serializeOffset(Integer.valueOf(evictLayout), growPayload2);
            }
            ContainerBarrier.releaseHeader(growPayload, serializeOffset, companion.clipOrigin());
            androidx.compose.foundation.layout.BounceHandler bounceHandler = androidx.compose.foundation.layout.BounceHandler.evictLayout;
            content.invoke(connectPatch, Integer.valueOf(i2 & 14));
            connectPatch.updateAction();
            if (MorphPatch.bindBody()) {
                MorphPatch.startResource();
            }
        }
        ShapeCounter drawScope = connectPatch.drawScope();
        if (drawScope != null) {
            drawScope.evictLayout(new IconExporter() { // from class: com.goldenboot.saga.zone.ProgressThread
                @Override // com.goldenboot.saga.zone.IconExporter
                public final Object invoke(Object obj, Object obj2) {
                    DpadBuilder flushSample;
                    flushSample = LifecycleReader.flushSample(IconExporter.this, i, (NotificationFence) obj, ((Integer) obj2).intValue());
                    return flushSample;
                }
            });
        }
    }

    public static final void detachStream(final CachedCreator icon, final String title, String str, final IconExporter body, NotificationFence notificationFence, final int i, final int i2) {
        int i3;
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(body, "body");
        NotificationFence connectPatch = notificationFence.connectPatch(1528477386);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (connectPatch.formatPosition(icon) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= connectPatch.formatPosition(title) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= connectPatch.formatPosition(str) ? ContentOperation.RotationX : ContentOperation.SpotShadowColor;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= connectPatch.drawField(body) ? ContentOperation.CameraDistance : ContentOperation.RotationZ;
        }
        if ((i3 & 1171) == 1170 && connectPatch.purgeNode()) {
            connectPatch.syncScope();
        } else {
            if (i4 != 0) {
                str = null;
            }
            if (MorphPatch.bindBody()) {
                MorphPatch.formatPosition(1528477386, i3, -1, "com.goldenboot.saga.zone.ui.screens.game.DialogCard (PauseDialog.kt:77)");
            }
            CellAnnouncer.queryModel(androidx.compose.foundation.layout.EndpointList.injectMetric(androidx.compose.ui.RemoteCallback.INSTANCE, 0.86f), androidx.compose.foundation.layout.LayerUseCase.evictLayout(InsetsEdge.drawField(24)), IconMaker.detachStream(1423168290, true, new ActivityMutator(title, str, icon, body), connectPatch, 54), connectPatch, 438, 0);
            if (MorphPatch.bindBody()) {
                MorphPatch.startResource();
            }
        }
        final String str2 = str;
        ShapeCounter drawScope = connectPatch.drawScope();
        if (drawScope != null) {
            drawScope.evictLayout(new IconExporter() { // from class: com.goldenboot.saga.zone.CellMaterializer
                @Override // com.goldenboot.saga.zone.IconExporter
                public final Object invoke(Object obj, Object obj2) {
                    DpadBuilder releaseHeader;
                    releaseHeader = LifecycleReader.releaseHeader(CachedCreator.this, title, str2, body, i, i2, (NotificationFence) obj, ((Integer) obj2).intValue());
                    return releaseHeader;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DpadBuilder flushSample(IconExporter iconExporter, int i, NotificationFence notificationFence, int i2) {
        clipOrigin(iconExporter, notificationFence, NavBarImpl.evictLayout(i | 1));
        return DpadBuilder.evictLayout;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DpadBuilder releaseHeader(CachedCreator cachedCreator, String str, String str2, IconExporter iconExporter, int i, int i2, NotificationFence notificationFence, int i3) {
        detachStream(cachedCreator, str, str2, iconExporter, notificationFence, NavBarImpl.evictLayout(i | 1), i2);
        return DpadBuilder.evictLayout;
    }

    public static final void updateTimer(final ElevationNode onResume, final ElevationNode onRestart, final ElevationNode onExit, NotificationFence notificationFence, final int i) {
        int i2;
        Intrinsics.checkNotNullParameter(onResume, "onResume");
        Intrinsics.checkNotNullParameter(onRestart, "onRestart");
        Intrinsics.checkNotNullParameter(onExit, "onExit");
        NotificationFence connectPatch = notificationFence.connectPatch(-150130329);
        if ((i & 6) == 0) {
            i2 = (connectPatch.drawField(onResume) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= connectPatch.drawField(onRestart) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= connectPatch.drawField(onExit) ? ContentOperation.RotationX : ContentOperation.SpotShadowColor;
        }
        if ((i2 & 147) == 146 && connectPatch.purgeNode()) {
            connectPatch.syncScope();
        } else {
            if (MorphPatch.bindBody()) {
                MorphPatch.formatPosition(-150130329, i2, -1, "com.goldenboot.saga.zone.ui.screens.game.PauseDialog (PauseDialog.kt:47)");
            }
            clipOrigin(IconMaker.detachStream(1035672535, true, new BounceHandler(onResume, onRestart, onExit), connectPatch, 54), connectPatch, 6);
            if (MorphPatch.bindBody()) {
                MorphPatch.startResource();
            }
        }
        ShapeCounter drawScope = connectPatch.drawScope();
        if (drawScope != null) {
            drawScope.evictLayout(new IconExporter() { // from class: com.goldenboot.saga.zone.WindowCollector
                @Override // com.goldenboot.saga.zone.IconExporter
                public final Object invoke(Object obj, Object obj2) {
                    DpadBuilder applyTask;
                    applyTask = LifecycleReader.applyTask(ElevationNode.this, onRestart, onExit, i, (NotificationFence) obj, ((Integer) obj2).intValue());
                    return applyTask;
                }
            });
        }
    }
}
