package com.goldenboot.saga.zone;

import androidx.compose.ui.RemoteCallback;
import com.goldenboot.saga.zone.AlarmMulticaster;
import com.goldenboot.saga.zone.ChannelUploader;
import com.goldenboot.saga.zone.LayerTunnel;
import com.goldenboot.saga.zone.data.PlayerState;
import com.goldenboot.saga.zone.ui.GoldenbootApp;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001d\u0010\u0003\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001aC\u0010\u000e\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\n2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00010\fH\u0003¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0012²\u0006\f\u0010\u0011\u001a\u00020\u00108\nX\u008a\u0084\u0002"}, d2 = {"Lkotlin/Function0;", "Lcom/goldenboot/saga/zone/DpadBuilder;", "onBack", "injectMetric", "(Lcom/goldenboot/saga/zone/ElevationNode;Lcom/goldenboot/saga/zone/NotificationFence;I)V", "Lcom/goldenboot/saga/zone/CachedCreator;", "icon", "", "title", "subtitle", "", "checked", "Lkotlin/Function1;", "onChange", "clipOrigin", "(Lcom/goldenboot/saga/zone/CachedCreator;Ljava/lang/String;Ljava/lang/String;ZLcom/goldenboot/saga/zone/TouchRecord;Lcom/goldenboot/saga/zone/NotificationFence;I)V", "Lcom/goldenboot/saga/zone/data/PlayerState;", "state", "app_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class CompatVersion {

    /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class ActivityMutator implements ConfigListener {
        final /* synthetic */ MorphCreator connectPatch;
        final /* synthetic */ ElevationNode notifyMessage;
        final /* synthetic */ androidx.compose.foundation.EndpointList reduceScope;

        /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        /* renamed from: com.goldenboot.saga.zone.CompatVersion$ActivityMutator$ActivityMutator, reason: collision with other inner class name */
        public static final class C0095ActivityMutator implements IconExporter {
            final /* synthetic */ MorphCreator reduceScope;

            public C0095ActivityMutator(MorphCreator morphCreator) {
                this.reduceScope = morphCreator;
            }

            public final void evictLayout(NotificationFence notificationFence, int i) {
                if ((i & 3) == 2 && notificationFence.purgeNode()) {
                    notificationFence.syncScope();
                    return;
                }
                if (MorphPatch.bindBody()) {
                    MorphPatch.formatPosition(1327634534, i, -1, "com.goldenboot.saga.zone.ui.screens.settings.SettingsScreen.<anonymous>.<anonymous>.<anonymous> (SettingsScreen.kt:63)");
                }
                CellAnnouncer.connectPatch(CompatVersion.detachStream(this.reduceScope).getCoins(), null, notificationFence, 0, 2);
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

        public ActivityMutator(androidx.compose.foundation.EndpointList endpointList, ElevationNode elevationNode, MorphCreator morphCreator) {
            this.reduceScope = endpointList;
            this.notifyMessage = elevationNode;
            this.connectPatch = morphCreator;
        }

        public final void evictLayout(BreadcrumbMaker GradientScreen, NotificationFence notificationFence, int i) {
            Intrinsics.checkNotNullParameter(GradientScreen, "$this$GradientScreen");
            if ((i & 17) == 16 && notificationFence.purgeNode()) {
                notificationFence.syncScope();
                return;
            }
            if (MorphPatch.bindBody()) {
                MorphPatch.formatPosition(275576630, i, -1, "com.goldenboot.saga.zone.ui.screens.settings.SettingsScreen.<anonymous> (SettingsScreen.kt:61)");
            }
            RemoteCallback.Companion companion = androidx.compose.ui.RemoteCallback.INSTANCE;
            androidx.compose.ui.RemoteCallback detachStream = androidx.compose.foundation.LayerUseCase.detachStream(androidx.compose.foundation.layout.EndpointList.growPayload(companion, 0.0f, 1, null), this.reduceScope, false, null, false, 14, null);
            ElevationNode elevationNode = this.notifyMessage;
            MorphCreator morphCreator = this.connectPatch;
            FlexMaterializer evictLayout = FlingDetector.evictLayout(FrameIndex.evictLayout.detachStream(), ChannelUploader.INSTANCE.purgeNode(), notificationFence, 0);
            int evictLayout2 = ShadowStack.evictLayout(notificationFence, 0);
            StateMediator inflateEdge = notificationFence.inflateEdge();
            androidx.compose.ui.RemoteCallback serializeOffset = androidx.compose.ui.FeedbackFlow.serializeOffset(notificationFence, detachStream);
            AlarmMulticaster.Companion companion2 = AlarmMulticaster.INSTANCE;
            ElevationNode evictLayout3 = companion2.evictLayout();
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
            ContainerBarrier.releaseHeader(growPayload, evictLayout, companion2.releaseHeader());
            ContainerBarrier.releaseHeader(growPayload, inflateEdge, companion2.flushSample());
            IconExporter growPayload2 = companion2.growPayload();
            if (growPayload.peekRevision() || !Intrinsics.areEqual(growPayload.clipOrigin(), Integer.valueOf(evictLayout2))) {
                growPayload.bindBody(Integer.valueOf(evictLayout2));
                growPayload.serializeOffset(Integer.valueOf(evictLayout2), growPayload2);
            }
            ContainerBarrier.releaseHeader(growPayload, serializeOffset, companion2.clipOrigin());
            SystemSteward systemSteward = SystemSteward.evictLayout;
            FadeFormer.injectMetric("Settings", null, elevationNode, IconMaker.detachStream(1327634534, true, new C0095ActivityMutator(morphCreator), notificationFence, 54), notificationFence, 3078, 2);
            float f = 16;
            androidx.compose.ui.RemoteCallback applyTask = androidx.compose.foundation.layout.LayerUseCase.applyTask(androidx.compose.foundation.layout.EndpointList.detachStream(companion, 0.0f, 1, null), InsetsEdge.drawField(f), 0.0f, 2, null);
            SessionPhase evictLayout4 = androidx.compose.foundation.layout.LayerUseCase.evictLayout(InsetsEdge.drawField(f));
            SchedulerReader schedulerReader = SchedulerReader.evictLayout;
            CellAnnouncer.queryModel(applyTask, evictLayout4, schedulerReader.evictLayout(), notificationFence, 438, 0);
            StyleAllocator.evictLayout(androidx.compose.foundation.layout.EndpointList.releaseHeader(companion, InsetsEdge.drawField(12)), notificationFence, 6);
            CellAnnouncer.queryModel(androidx.compose.foundation.layout.LayerUseCase.applyTask(androidx.compose.foundation.layout.EndpointList.detachStream(companion, 0.0f, 1, null), InsetsEdge.drawField(f), 0.0f, 2, null), null, schedulerReader.growPayload(), notificationFence, 390, 2);
            StyleAllocator.evictLayout(androidx.compose.foundation.layout.EndpointList.releaseHeader(companion, InsetsEdge.drawField(24)), notificationFence, 6);
            notificationFence.updateAction();
            if (MorphPatch.bindBody()) {
                MorphPatch.startResource();
            }
        }

        @Override // com.goldenboot.saga.zone.ConfigListener
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            evictLayout((BreadcrumbMaker) obj, (NotificationFence) obj2, ((Number) obj3).intValue());
            return DpadBuilder.evictLayout;
        }
    }

    private static final void clipOrigin(final CachedCreator cachedCreator, final String str, final String str2, final boolean z, final TouchRecord touchRecord, NotificationFence notificationFence, final int i) {
        CachedCreator cachedCreator2;
        int i2;
        String str3;
        String str4;
        boolean z2;
        NotificationFence notificationFence2;
        NotificationFence connectPatch = notificationFence.connectPatch(-1717302326);
        if ((i & 6) == 0) {
            cachedCreator2 = cachedCreator;
            i2 = (connectPatch.formatPosition(cachedCreator2) ? 4 : 2) | i;
        } else {
            cachedCreator2 = cachedCreator;
            i2 = i;
        }
        if ((i & 48) == 0) {
            str3 = str;
            i2 |= connectPatch.formatPosition(str3) ? 32 : 16;
        } else {
            str3 = str;
        }
        if ((i & 384) == 0) {
            str4 = str2;
            i2 |= connectPatch.formatPosition(str4) ? ContentOperation.RotationX : ContentOperation.SpotShadowColor;
        } else {
            str4 = str2;
        }
        if ((i & 3072) == 0) {
            z2 = z;
            i2 |= connectPatch.injectMetric(z2) ? ContentOperation.CameraDistance : ContentOperation.RotationZ;
        } else {
            z2 = z;
        }
        if ((i & 24576) == 0) {
            i2 |= connectPatch.drawField(touchRecord) ? ContentOperation.Clip : ContentOperation.Shape;
        }
        if ((i2 & 9363) == 9362 && connectPatch.purgeNode()) {
            connectPatch.syncScope();
            notificationFence2 = connectPatch;
        } else {
            if (MorphPatch.bindBody()) {
                MorphPatch.formatPosition(-1717302326, i2, -1, "com.goldenboot.saga.zone.ui.screens.settings.ToggleRow (SettingsScreen.kt:119)");
            }
            ChannelUploader.Companion companion = ChannelUploader.INSTANCE;
            ChannelUploader.FeedbackFlow connectPatch2 = companion.connectPatch();
            RemoteCallback.Companion companion2 = androidx.compose.ui.RemoteCallback.INSTANCE;
            androidx.compose.ui.RemoteCallback applyTask = androidx.compose.foundation.layout.LayerUseCase.applyTask(androidx.compose.foundation.layout.EndpointList.detachStream(companion2, 0.0f, 1, null), 0.0f, InsetsEdge.drawField(8), 1, null);
            FrameIndex frameIndex = FrameIndex.evictLayout;
            FlexMaterializer growPayload = StateSegment.growPayload(frameIndex.injectMetric(), connectPatch2, connectPatch, 48);
            int evictLayout = ShadowStack.evictLayout(connectPatch, 0);
            StateMediator inflateEdge = connectPatch.inflateEdge();
            androidx.compose.ui.RemoteCallback serializeOffset = androidx.compose.ui.FeedbackFlow.serializeOffset(connectPatch, applyTask);
            AlarmMulticaster.Companion companion3 = AlarmMulticaster.INSTANCE;
            ElevationNode evictLayout2 = companion3.evictLayout();
            if (connectPatch.drawRequest() == null) {
                ShadowStack.injectMetric();
            }
            connectPatch.inflateAdapter();
            if (connectPatch.peekRevision()) {
                connectPatch.gatherAdapter(evictLayout2);
            } else {
                connectPatch.packPackage();
            }
            NotificationFence growPayload2 = ContainerBarrier.growPayload(connectPatch);
            ContainerBarrier.releaseHeader(growPayload2, growPayload, companion3.releaseHeader());
            ContainerBarrier.releaseHeader(growPayload2, inflateEdge, companion3.flushSample());
            IconExporter growPayload3 = companion3.growPayload();
            if (growPayload2.peekRevision() || !Intrinsics.areEqual(growPayload2.clipOrigin(), Integer.valueOf(evictLayout))) {
                growPayload2.bindBody(Integer.valueOf(evictLayout));
                growPayload2.serializeOffset(Integer.valueOf(evictLayout), growPayload3);
            }
            ContainerBarrier.releaseHeader(growPayload2, serializeOffset, companion3.clipOrigin());
            PopupConverter popupConverter = PopupConverter.evictLayout;
            float f = 12;
            androidx.compose.ui.RemoteCallback growPayload4 = androidx.compose.foundation.ActivityMutator.growPayload(ListenerStore.evictLayout(androidx.compose.foundation.layout.EndpointList.flushSample(companion2, InsetsEdge.drawField(42)), SaveCycle.injectMetric(InsetsEdge.drawField(f))), LayerTunnel.Companion.inflateAdapter(LayerTunnel.INSTANCE, CursorBuilder.notifyMessage(ContainerSource.serializeOffset(DrawerSemaphore.connectJob()), ContainerSource.serializeOffset(DrawerSemaphore.popBlueprint())), 0.0f, 0.0f, 0, 14, null), null, 0.0f, 6, null);
            FlexMaterializer updateTimer = WaveGuard.updateTimer(companion.applyTask(), false);
            int evictLayout3 = ShadowStack.evictLayout(connectPatch, 0);
            StateMediator inflateEdge2 = connectPatch.inflateEdge();
            androidx.compose.ui.RemoteCallback serializeOffset2 = androidx.compose.ui.FeedbackFlow.serializeOffset(connectPatch, growPayload4);
            ElevationNode evictLayout4 = companion3.evictLayout();
            if (connectPatch.drawRequest() == null) {
                ShadowStack.injectMetric();
            }
            connectPatch.inflateAdapter();
            if (connectPatch.peekRevision()) {
                connectPatch.gatherAdapter(evictLayout4);
            } else {
                connectPatch.packPackage();
            }
            NotificationFence growPayload5 = ContainerBarrier.growPayload(connectPatch);
            ContainerBarrier.releaseHeader(growPayload5, updateTimer, companion3.releaseHeader());
            ContainerBarrier.releaseHeader(growPayload5, inflateEdge2, companion3.flushSample());
            IconExporter growPayload6 = companion3.growPayload();
            if (growPayload5.peekRevision() || !Intrinsics.areEqual(growPayload5.clipOrigin(), Integer.valueOf(evictLayout3))) {
                growPayload5.bindBody(Integer.valueOf(evictLayout3));
                growPayload5.serializeOffset(Integer.valueOf(evictLayout3), growPayload6);
            }
            ContainerBarrier.releaseHeader(growPayload5, serializeOffset2, companion3.clipOrigin());
            androidx.compose.foundation.layout.BounceHandler bounceHandler = androidx.compose.foundation.layout.BounceHandler.evictLayout;
            CanvasSignal.evictLayout(cachedCreator2, null, androidx.compose.foundation.layout.EndpointList.flushSample(companion2, InsetsEdge.drawField(22)), DrawerSemaphore.detachStream(), connectPatch, (i2 & 14) | 3504, 0);
            connectPatch.updateAction();
            StyleAllocator.evictLayout(androidx.compose.foundation.layout.EndpointList.applyTask(companion2, InsetsEdge.drawField(f)), connectPatch, 6);
            androidx.compose.ui.RemoteCallback growPayload7 = ListSupervisor.growPayload(popupConverter, companion2, 1.0f, false, 2, null);
            FlexMaterializer evictLayout5 = FlingDetector.evictLayout(frameIndex.detachStream(), companion.purgeNode(), connectPatch, 0);
            int evictLayout6 = ShadowStack.evictLayout(connectPatch, 0);
            StateMediator inflateEdge3 = connectPatch.inflateEdge();
            androidx.compose.ui.RemoteCallback serializeOffset3 = androidx.compose.ui.FeedbackFlow.serializeOffset(connectPatch, growPayload7);
            ElevationNode evictLayout7 = companion3.evictLayout();
            if (connectPatch.drawRequest() == null) {
                ShadowStack.injectMetric();
            }
            connectPatch.inflateAdapter();
            if (connectPatch.peekRevision()) {
                connectPatch.gatherAdapter(evictLayout7);
            } else {
                connectPatch.packPackage();
            }
            NotificationFence growPayload8 = ContainerBarrier.growPayload(connectPatch);
            ContainerBarrier.releaseHeader(growPayload8, evictLayout5, companion3.releaseHeader());
            ContainerBarrier.releaseHeader(growPayload8, inflateEdge3, companion3.flushSample());
            IconExporter growPayload9 = companion3.growPayload();
            if (growPayload8.peekRevision() || !Intrinsics.areEqual(growPayload8.clipOrigin(), Integer.valueOf(evictLayout6))) {
                growPayload8.bindBody(Integer.valueOf(evictLayout6));
                growPayload8.serializeOffset(Integer.valueOf(evictLayout6), growPayload9);
            }
            ContainerBarrier.releaseHeader(growPayload8, serializeOffset3, companion3.clipOrigin());
            SystemSteward systemSteward = SystemSteward.evictLayout;
            WatcherCreator.growPayload(str3, null, DrawerSemaphore.attachConfig(), FrameSaver.peekRevision(14), null, FontWeight.INSTANCE.reduceScope(), null, 0L, null, null, 0L, 0, false, 0, 0, null, null, connectPatch, ((i2 >> 3) & 14) | 200064, 0, 131026);
            WatcherCreator.growPayload(str4, null, DrawerSemaphore.resetDelta(), FrameSaver.peekRevision(11), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, connectPatch, (14 & (i2 >> 6)) | 3456, 0, 131058);
            connectPatch.updateAction();
            notificationFence2 = connectPatch;
            androidx.compose.material3.ActivityMutator.evictLayout(z2, touchRecord, null, null, false, SectionInterpreter.evictLayout.growPayload(DrawerSemaphore.flushSample(), DrawerSemaphore.reduceScope(), DrawerSemaphore.detachStream(), 0L, DrawerSemaphore.resetDelta(), DrawerSemaphore.drawField(), ContainerSource.gatherAdapter(DrawerSemaphore.detachStream(), 0.4f, 0.0f, 0.0f, 0.0f, 14, null), 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, connectPatch, 1794486, SectionInterpreter.injectMetric << 18, 65416), null, notificationFence2, (i2 >> 9) & 126, 92);
            notificationFence2.updateAction();
            if (MorphPatch.bindBody()) {
                MorphPatch.startResource();
            }
        }
        ShapeCounter drawScope = notificationFence2.drawScope();
        if (drawScope != null) {
            drawScope.evictLayout(new IconExporter() { // from class: com.goldenboot.saga.zone.ToastPump
                @Override // com.goldenboot.saga.zone.IconExporter
                public final Object invoke(Object obj, Object obj2) {
                    DpadBuilder flushSample;
                    flushSample = CompatVersion.flushSample(CachedCreator.this, str, str2, z, touchRecord, i, (NotificationFence) obj, ((Integer) obj2).intValue());
                    return flushSample;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PlayerState detachStream(MorphCreator morphCreator) {
        return (PlayerState) morphCreator.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DpadBuilder flushSample(CachedCreator cachedCreator, String str, String str2, boolean z, TouchRecord touchRecord, int i, NotificationFence notificationFence, int i2) {
        clipOrigin(cachedCreator, str, str2, z, touchRecord, notificationFence, NavBarImpl.evictLayout(i | 1));
        return DpadBuilder.evictLayout;
    }

    public static final void injectMetric(final ElevationNode onBack, NotificationFence notificationFence, final int i) {
        int i2;
        NotificationFence notificationFence2;
        Intrinsics.checkNotNullParameter(onBack, "onBack");
        NotificationFence connectPatch = notificationFence.connectPatch(1451554964);
        if ((i & 6) == 0) {
            i2 = (connectPatch.drawField(onBack) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && connectPatch.purgeNode()) {
            connectPatch.syncScope();
            notificationFence2 = connectPatch;
        } else {
            if (MorphPatch.bindBody()) {
                MorphPatch.formatPosition(1451554964, i2, -1, "com.goldenboot.saga.zone.ui.screens.settings.SettingsScreen (SettingsScreen.kt:55)");
            }
            CellAnnouncer.purgeNode(null, false, IconMaker.detachStream(275576630, true, new ActivityMutator(androidx.compose.foundation.LayerUseCase.evictLayout(0, connectPatch, 0, 1), onBack, BadgeLauncher.growPayload(GoldenbootApp.INSTANCE.getInstance().growPayload().getState(), null, null, null, connectPatch, 0, 7)), connectPatch, 54), connectPatch, 384, 3);
            notificationFence2 = connectPatch;
            if (MorphPatch.bindBody()) {
                MorphPatch.startResource();
            }
        }
        ShapeCounter drawScope = notificationFence2.drawScope();
        if (drawScope != null) {
            drawScope.evictLayout(new IconExporter() { // from class: com.goldenboot.saga.zone.SequenceBinder
                @Override // com.goldenboot.saga.zone.IconExporter
                public final Object invoke(Object obj, Object obj2) {
                    DpadBuilder releaseHeader;
                    releaseHeader = CompatVersion.releaseHeader(ElevationNode.this, i, (NotificationFence) obj, ((Integer) obj2).intValue());
                    return releaseHeader;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DpadBuilder releaseHeader(ElevationNode elevationNode, int i, NotificationFence notificationFence, int i2) {
        injectMetric(elevationNode, notificationFence, NavBarImpl.evictLayout(i | 1));
        return DpadBuilder.evictLayout;
    }
}
