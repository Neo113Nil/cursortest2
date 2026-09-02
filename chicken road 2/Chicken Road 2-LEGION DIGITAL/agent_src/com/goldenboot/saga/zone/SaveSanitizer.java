package com.goldenboot.saga.zone;

import androidx.compose.ui.RemoteCallback;
import com.goldenboot.saga.zone.AlarmMulticaster;
import com.goldenboot.saga.zone.ChannelUploader;
import com.goldenboot.saga.zone.ComponentImpl;
import com.goldenboot.saga.zone.FontWeight;
import com.goldenboot.saga.zone.FrameIndex;
import com.goldenboot.saga.zone.LayerTunnel;
import com.goldenboot.saga.zone.SaveSanitizer;
import com.goldenboot.saga.zone.data.PlayerState;
import com.goldenboot.saga.zone.game.LevelConfig;
import com.goldenboot.saga.zone.game.Levels;
import com.goldenboot.saga.zone.ui.GoldenbootApp;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a1\u0010\u0006\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u0003H\u0007¢\u0006\u0004\b\u0006\u0010\u0007\u001a=\u0010\u000f\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\f2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0003¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0013²\u0006\f\u0010\u0012\u001a\u00020\u00118\nX\u008a\u0084\u0002"}, d2 = {"Lkotlin/Function0;", "Lcom/goldenboot/saga/zone/DpadBuilder;", "onBack", "Lkotlin/Function1;", "", "onLevel", "flushSample", "(Lcom/goldenboot/saga/zone/ElevationNode;Lcom/goldenboot/saga/zone/TouchRecord;Lcom/goldenboot/saga/zone/NotificationFence;I)V", "level", "", "unlocked", "stars", "", "label", "onClick", "detachStream", "(IZILjava/lang/String;Lcom/goldenboot/saga/zone/ElevationNode;Lcom/goldenboot/saga/zone/NotificationFence;I)V", "Lcom/goldenboot/saga/zone/data/PlayerState;", "state", "app_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SaveSanitizer {

    /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class ActivityMutator implements ConfigListener {
        final /* synthetic */ TouchRecord connectPatch;
        final /* synthetic */ MorphCreator notifyMessage;
        final /* synthetic */ ElevationNode reduceScope;

        /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        /* renamed from: com.goldenboot.saga.zone.SaveSanitizer$ActivityMutator$ActivityMutator, reason: collision with other inner class name */
        public static final class C0151ActivityMutator implements IconExporter {
            final /* synthetic */ MorphCreator reduceScope;

            public C0151ActivityMutator(MorphCreator morphCreator) {
                this.reduceScope = morphCreator;
            }

            public final void evictLayout(NotificationFence notificationFence, int i) {
                if ((i & 3) == 2 && notificationFence.purgeNode()) {
                    notificationFence.syncScope();
                    return;
                }
                if (MorphPatch.bindBody()) {
                    MorphPatch.formatPosition(898141054, i, -1, "com.goldenboot.saga.zone.ui.screens.levelselect.LevelSelectScreen.<anonymous>.<anonymous>.<anonymous> (LevelSelectScreen.kt:64)");
                }
                CellAnnouncer.connectPatch(SaveSanitizer.updateTimer(this.reduceScope).getCoins(), null, notificationFence, 0, 2);
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
            final /* synthetic */ MorphCreator reduceScope;

            public BounceHandler(MorphCreator morphCreator) {
                this.reduceScope = morphCreator;
            }

            public final void evictLayout(NotificationFence notificationFence, int i) {
                if ((i & 3) == 2 && notificationFence.purgeNode()) {
                    notificationFence.syncScope();
                    return;
                }
                if (MorphPatch.bindBody()) {
                    MorphPatch.formatPosition(-1623279668, i, -1, "com.goldenboot.saga.zone.ui.screens.levelselect.LevelSelectScreen.<anonymous>.<anonymous>.<anonymous> (LevelSelectScreen.kt:72)");
                }
                ChannelUploader.Companion companion = ChannelUploader.INSTANCE;
                ChannelUploader.FeedbackFlow connectPatch = companion.connectPatch();
                MorphCreator morphCreator = this.reduceScope;
                RemoteCallback.Companion companion2 = androidx.compose.ui.RemoteCallback.INSTANCE;
                FrameIndex frameIndex = FrameIndex.evictLayout;
                FlexMaterializer growPayload = StateSegment.growPayload(frameIndex.injectMetric(), connectPatch, notificationFence, 48);
                int evictLayout = ShadowStack.evictLayout(notificationFence, 0);
                StateMediator inflateEdge = notificationFence.inflateEdge();
                androidx.compose.ui.RemoteCallback serializeOffset = androidx.compose.ui.FeedbackFlow.serializeOffset(notificationFence, companion2);
                AlarmMulticaster.Companion companion3 = AlarmMulticaster.INSTANCE;
                ElevationNode evictLayout2 = companion3.evictLayout();
                if (notificationFence.drawRequest() == null) {
                    ShadowStack.injectMetric();
                }
                notificationFence.inflateAdapter();
                if (notificationFence.peekRevision()) {
                    notificationFence.gatherAdapter(evictLayout2);
                } else {
                    notificationFence.packPackage();
                }
                NotificationFence growPayload2 = ContainerBarrier.growPayload(notificationFence);
                ContainerBarrier.releaseHeader(growPayload2, growPayload, companion3.releaseHeader());
                ContainerBarrier.releaseHeader(growPayload2, inflateEdge, companion3.flushSample());
                IconExporter growPayload3 = companion3.growPayload();
                if (growPayload2.peekRevision() || !Intrinsics.areEqual(growPayload2.clipOrigin(), Integer.valueOf(evictLayout))) {
                    growPayload2.bindBody(Integer.valueOf(evictLayout));
                    growPayload2.serializeOffset(Integer.valueOf(evictLayout), growPayload3);
                }
                ContainerBarrier.releaseHeader(growPayload2, serializeOffset, companion3.clipOrigin());
                PopupConverter popupConverter = PopupConverter.evictLayout;
                androidx.compose.ui.RemoteCallback growPayload4 = androidx.compose.foundation.ActivityMutator.growPayload(ListenerStore.evictLayout(androidx.compose.foundation.layout.EndpointList.flushSample(companion2, InsetsEdge.drawField(48)), SaveCycle.releaseHeader()), LayerTunnel.Companion.connectJob(LayerTunnel.INSTANCE, CursorBuilder.notifyMessage(ContainerSource.serializeOffset(DrawerSemaphore.detachStream()), ContainerSource.serializeOffset(DrawerSemaphore.reduceScope())), 0L, 0.0f, 0, 14, null), null, 0.0f, 6, null);
                FlexMaterializer updateTimer = WaveGuard.updateTimer(companion.applyTask(), false);
                int evictLayout3 = ShadowStack.evictLayout(notificationFence, 0);
                StateMediator inflateEdge2 = notificationFence.inflateEdge();
                androidx.compose.ui.RemoteCallback serializeOffset2 = androidx.compose.ui.FeedbackFlow.serializeOffset(notificationFence, growPayload4);
                ElevationNode evictLayout4 = companion3.evictLayout();
                if (notificationFence.drawRequest() == null) {
                    ShadowStack.injectMetric();
                }
                notificationFence.inflateAdapter();
                if (notificationFence.peekRevision()) {
                    notificationFence.gatherAdapter(evictLayout4);
                } else {
                    notificationFence.packPackage();
                }
                NotificationFence growPayload5 = ContainerBarrier.growPayload(notificationFence);
                ContainerBarrier.releaseHeader(growPayload5, updateTimer, companion3.releaseHeader());
                ContainerBarrier.releaseHeader(growPayload5, inflateEdge2, companion3.flushSample());
                IconExporter growPayload6 = companion3.growPayload();
                if (growPayload5.peekRevision() || !Intrinsics.areEqual(growPayload5.clipOrigin(), Integer.valueOf(evictLayout3))) {
                    growPayload5.bindBody(Integer.valueOf(evictLayout3));
                    growPayload5.serializeOffset(Integer.valueOf(evictLayout3), growPayload6);
                }
                ContainerBarrier.releaseHeader(growPayload5, serializeOffset2, companion3.clipOrigin());
                androidx.compose.foundation.layout.BounceHandler bounceHandler = androidx.compose.foundation.layout.BounceHandler.evictLayout;
                CanvasSignal.evictLayout(SpringTransformer.evictLayout(SwipeBenchmark.evictLayout), null, androidx.compose.foundation.layout.EndpointList.flushSample(companion2, InsetsEdge.drawField(26)), DrawerSemaphore.attachConfig(), notificationFence, 3504, 0);
                notificationFence.updateAction();
                StyleAllocator.evictLayout(androidx.compose.foundation.layout.EndpointList.flushSample(companion2, InsetsEdge.drawField(12)), notificationFence, 6);
                androidx.compose.ui.RemoteCallback growPayload7 = ListSupervisor.growPayload(popupConverter, companion2, 1.0f, false, 2, null);
                FlexMaterializer evictLayout5 = FlingDetector.evictLayout(frameIndex.detachStream(), companion.purgeNode(), notificationFence, 0);
                int evictLayout6 = ShadowStack.evictLayout(notificationFence, 0);
                StateMediator inflateEdge3 = notificationFence.inflateEdge();
                androidx.compose.ui.RemoteCallback serializeOffset3 = androidx.compose.ui.FeedbackFlow.serializeOffset(notificationFence, growPayload7);
                ElevationNode evictLayout7 = companion3.evictLayout();
                if (notificationFence.drawRequest() == null) {
                    ShadowStack.injectMetric();
                }
                notificationFence.inflateAdapter();
                if (notificationFence.peekRevision()) {
                    notificationFence.gatherAdapter(evictLayout7);
                } else {
                    notificationFence.packPackage();
                }
                NotificationFence growPayload8 = ContainerBarrier.growPayload(notificationFence);
                ContainerBarrier.releaseHeader(growPayload8, evictLayout5, companion3.releaseHeader());
                ContainerBarrier.releaseHeader(growPayload8, inflateEdge3, companion3.flushSample());
                IconExporter growPayload9 = companion3.growPayload();
                if (growPayload8.peekRevision() || !Intrinsics.areEqual(growPayload8.clipOrigin(), Integer.valueOf(evictLayout6))) {
                    growPayload8.bindBody(Integer.valueOf(evictLayout6));
                    growPayload8.serializeOffset(Integer.valueOf(evictLayout6), growPayload9);
                }
                ContainerBarrier.releaseHeader(growPayload8, serializeOffset3, companion3.clipOrigin());
                SystemSteward systemSteward = SystemSteward.evictLayout;
                WatcherCreator.growPayload("Chapter — Championship Path", null, DrawerSemaphore.detachStream(), FrameSaver.peekRevision(11), null, null, null, FrameSaver.peekRevision(3), null, null, 0L, 0, false, 0, 0, null, null, notificationFence, 12586374, 0, 130930);
                long attachConfig = DrawerSemaphore.attachConfig();
                FontWeight.Companion companion4 = FontWeight.INSTANCE;
                WatcherCreator.growPayload("Pick a match to play", null, attachConfig, FrameSaver.peekRevision(16), null, companion4.injectMetric(), null, 0L, null, null, 0L, 0, false, 0, 0, null, null, notificationFence, 200070, 0, 131026);
                notificationFence.updateAction();
                WatcherCreator.growPayload(SaveSanitizer.updateTimer(morphCreator).getHighestLevel() + "/" + Levels.INSTANCE.getTOTAL(), null, DrawerSemaphore.flushSample(), FrameSaver.peekRevision(18), null, companion4.releaseHeader(), null, 0L, null, null, 0L, 0, false, 0, 0, null, null, notificationFence, 200064, 0, 131026);
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

        /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
        @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "", "index", "", "evictLayout", "(I)Ljava/lang/Object;"}, k = 3, mv = {2, 0, 0})
        public static final class EndpointList extends Lambda implements TouchRecord {
            final /* synthetic */ List notifyMessage;
            final /* synthetic */ TouchRecord reduceScope;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public EndpointList(TouchRecord touchRecord, List list) {
                super(1);
                this.reduceScope = touchRecord;
                this.notifyMessage = list;
            }

            public final Object evictLayout(int i) {
                return this.reduceScope.invoke(this.notifyMessage.get(i));
            }

            @Override // com.goldenboot.saga.zone.TouchRecord
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return evictLayout(((Number) obj).intValue());
            }
        }

        /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class FeedbackFlow implements ElevationNode {
            final /* synthetic */ int connectPatch;
            final /* synthetic */ TouchRecord notifyMessage;
            final /* synthetic */ boolean reduceScope;

            public FeedbackFlow(boolean z, TouchRecord touchRecord, int i) {
                this.reduceScope = z;
                this.notifyMessage = touchRecord;
                this.connectPatch = i;
            }

            public final void evictLayout() {
                if (this.reduceScope) {
                    this.notifyMessage.invoke(Integer.valueOf(this.connectPatch));
                }
            }

            @Override // com.goldenboot.saga.zone.ElevationNode
            public /* bridge */ /* synthetic */ Object invoke() {
                evictLayout();
                return DpadBuilder.evictLayout;
            }
        }

        /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "it", "", "evictLayout", "(Ljava/lang/Object;)Ljava/lang/Void;"}, k = 3, mv = {2, 0, 0})
        public static final class LayerUseCase extends Lambda implements TouchRecord {
            public static final LayerUseCase reduceScope = new LayerUseCase();

            public LayerUseCase() {
                super(1);
            }

            @Override // com.goldenboot.saga.zone.TouchRecord
            /* renamed from: evictLayout, reason: merged with bridge method [inline-methods] */
            public final Void invoke(Integer num) {
                return null;
            }
        }

        /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
        @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u000b¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "Lcom/goldenboot/saga/zone/ModuleInstantiator;", "", "it", "Lcom/goldenboot/saga/zone/DpadBuilder;", "evictLayout", "(Lcom/goldenboot/saga/zone/ModuleInstantiator;ILcom/goldenboot/saga/zone/NotificationFence;I)V"}, k = 3, mv = {2, 0, 0})
        public static final class PluginInterpreter extends Lambda implements BoxSteward {
            final /* synthetic */ MorphCreator connectPatch;
            final /* synthetic */ TouchRecord notifyMessage;
            final /* synthetic */ List reduceScope;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public PluginInterpreter(List list, TouchRecord touchRecord, MorphCreator morphCreator) {
                super(4);
                this.reduceScope = list;
                this.notifyMessage = touchRecord;
                this.connectPatch = morphCreator;
            }

            public final void evictLayout(ModuleInstantiator moduleInstantiator, int i, NotificationFence notificationFence, int i2) {
                int i3;
                if ((i2 & 6) == 0) {
                    i3 = (notificationFence.formatPosition(moduleInstantiator) ? 4 : 2) | i2;
                } else {
                    i3 = i2;
                }
                if ((i2 & 48) == 0) {
                    i3 |= notificationFence.updateTimer(i) ? 32 : 16;
                }
                if ((i3 & 147) == 146 && notificationFence.purgeNode()) {
                    notificationFence.syncScope();
                    return;
                }
                if (MorphPatch.bindBody()) {
                    MorphPatch.formatPosition(699646206, i3, -1, "androidx.compose.foundation.lazy.grid.items.<anonymous> (LazyGridDsl.kt:464)");
                }
                int intValue = ((Number) this.reduceScope.get(i)).intValue();
                notificationFence.resumeSignature(-259171480);
                LevelConfig levelConfig = Levels.INSTANCE.get(intValue);
                boolean z = intValue <= SaveSanitizer.updateTimer(this.connectPatch).getHighestLevel();
                Integer num = SaveSanitizer.updateTimer(this.connectPatch).getLevelStars().get(Integer.valueOf(intValue));
                int intValue2 = num != null ? num.intValue() : 0;
                String displayName = levelConfig.getDisplayName();
                notificationFence.resumeSignature(1515672506);
                boolean injectMetric = notificationFence.injectMetric(z) | notificationFence.formatPosition(this.notifyMessage) | notificationFence.updateTimer(intValue);
                Object clipOrigin = notificationFence.clipOrigin();
                if (injectMetric || clipOrigin == NotificationFence.evictLayout.evictLayout()) {
                    clipOrigin = new FeedbackFlow(z, this.notifyMessage, intValue);
                    notificationFence.bindBody(clipOrigin);
                }
                notificationFence.unlockMessage();
                SaveSanitizer.detachStream(intValue, z, intValue2, displayName, (ElevationNode) clipOrigin, notificationFence, 0);
                notificationFence.unlockMessage();
                if (MorphPatch.bindBody()) {
                    MorphPatch.startResource();
                }
            }

            @Override // com.goldenboot.saga.zone.BoxSteward
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                evictLayout((ModuleInstantiator) obj, ((Number) obj2).intValue(), (NotificationFence) obj3, ((Number) obj4).intValue());
                return DpadBuilder.evictLayout;
            }
        }

        /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
        @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "", "index", "", "evictLayout", "(I)Ljava/lang/Object;"}, k = 3, mv = {2, 0, 0})
        public static final class ScopedMigration extends Lambda implements TouchRecord {
            final /* synthetic */ List notifyMessage;
            final /* synthetic */ TouchRecord reduceScope;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ScopedMigration(TouchRecord touchRecord, List list) {
                super(1);
                this.reduceScope = touchRecord;
                this.notifyMessage = list;
            }

            public final Object evictLayout(int i) {
                return this.reduceScope.invoke(this.notifyMessage.get(i));
            }

            @Override // com.goldenboot.saga.zone.TouchRecord
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return evictLayout(((Number) obj).intValue());
            }
        }

        /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
        @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "Lcom/goldenboot/saga/zone/SnackbarInstantiator;", "", "it", "Lcom/goldenboot/saga/zone/HoverGuard;", "evictLayout", "(Lcom/goldenboot/saga/zone/SnackbarInstantiator;I)J"}, k = 3, mv = {2, 0, 0})
        public static final class StylusConverter extends Lambda implements IconExporter {
            final /* synthetic */ List notifyMessage;
            final /* synthetic */ IconExporter reduceScope;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public StylusConverter(IconExporter iconExporter, List list) {
                super(2);
                this.reduceScope = iconExporter;
                this.notifyMessage = list;
            }

            public final long evictLayout(SnackbarInstantiator snackbarInstantiator, int i) {
                return ((HoverGuard) this.reduceScope.invoke(snackbarInstantiator, this.notifyMessage.get(i))).flushSample();
            }

            @Override // com.goldenboot.saga.zone.IconExporter
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return HoverGuard.evictLayout(evictLayout((SnackbarInstantiator) obj, ((Number) obj2).intValue()));
            }
        }

        public ActivityMutator(ElevationNode elevationNode, MorphCreator morphCreator, TouchRecord touchRecord) {
            this.reduceScope = elevationNode;
            this.notifyMessage = morphCreator;
            this.connectPatch = touchRecord;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final DpadBuilder injectMetric(TouchRecord touchRecord, MorphCreator morphCreator, KeyboardSegment LazyVerticalGrid) {
            Intrinsics.checkNotNullParameter(LazyVerticalGrid, "$this$LazyVerticalGrid");
            List appendEvent = CursorCollector.appendEvent(new WatcherLogger(1, Levels.INSTANCE.getTOTAL()));
            LazyVerticalGrid.detachStream(appendEvent.size(), null, null, new ScopedMigration(LayerUseCase.reduceScope, appendEvent), IconMaker.growPayload(699646206, true, new PluginInterpreter(appendEvent, touchRecord, morphCreator)));
            return DpadBuilder.evictLayout;
        }

        public final void growPayload(BreadcrumbMaker GradientScreen, NotificationFence notificationFence, int i) {
            Intrinsics.checkNotNullParameter(GradientScreen, "$this$GradientScreen");
            if ((i & 17) == 16 && notificationFence.purgeNode()) {
                notificationFence.syncScope();
                return;
            }
            if (MorphPatch.bindBody()) {
                MorphPatch.formatPosition(1466112686, i, -1, "com.goldenboot.saga.zone.ui.screens.levelselect.LevelSelectScreen.<anonymous> (LevelSelectScreen.kt:62)");
            }
            RemoteCallback.Companion companion = androidx.compose.ui.RemoteCallback.INSTANCE;
            androidx.compose.ui.RemoteCallback growPayload = androidx.compose.foundation.layout.EndpointList.growPayload(companion, 0.0f, 1, null);
            ElevationNode elevationNode = this.reduceScope;
            final MorphCreator morphCreator = this.notifyMessage;
            final TouchRecord touchRecord = this.connectPatch;
            FrameIndex frameIndex = FrameIndex.evictLayout;
            FlexMaterializer evictLayout = FlingDetector.evictLayout(frameIndex.detachStream(), ChannelUploader.INSTANCE.purgeNode(), notificationFence, 0);
            int evictLayout2 = ShadowStack.evictLayout(notificationFence, 0);
            StateMediator inflateEdge = notificationFence.inflateEdge();
            androidx.compose.ui.RemoteCallback serializeOffset = androidx.compose.ui.FeedbackFlow.serializeOffset(notificationFence, growPayload);
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
            NotificationFence growPayload2 = ContainerBarrier.growPayload(notificationFence);
            ContainerBarrier.releaseHeader(growPayload2, evictLayout, companion2.releaseHeader());
            ContainerBarrier.releaseHeader(growPayload2, inflateEdge, companion2.flushSample());
            IconExporter growPayload3 = companion2.growPayload();
            if (growPayload2.peekRevision() || !Intrinsics.areEqual(growPayload2.clipOrigin(), Integer.valueOf(evictLayout2))) {
                growPayload2.bindBody(Integer.valueOf(evictLayout2));
                growPayload2.serializeOffset(Integer.valueOf(evictLayout2), growPayload3);
            }
            ContainerBarrier.releaseHeader(growPayload2, serializeOffset, companion2.clipOrigin());
            SystemSteward systemSteward = SystemSteward.evictLayout;
            FadeFormer.injectMetric("Level Select", null, elevationNode, IconMaker.detachStream(898141054, true, new C0151ActivityMutator(morphCreator), notificationFence, 54), notificationFence, 3078, 2);
            float f = 16;
            CellAnnouncer.queryModel(androidx.compose.foundation.layout.LayerUseCase.applyTask(androidx.compose.foundation.layout.EndpointList.detachStream(companion, 0.0f, 1, null), InsetsEdge.drawField(f), 0.0f, 2, null), androidx.compose.foundation.layout.LayerUseCase.evictLayout(InsetsEdge.drawField(f)), IconMaker.detachStream(-1623279668, true, new BounceHandler(morphCreator), notificationFence, 54), notificationFence, 438, 0);
            float f2 = 12;
            StyleAllocator.evictLayout(androidx.compose.foundation.layout.EndpointList.releaseHeader(companion, InsetsEdge.drawField(f2)), notificationFence, 6);
            ComponentImpl.ActivityMutator activityMutator = new ComponentImpl.ActivityMutator(3);
            SessionPhase growPayload4 = androidx.compose.foundation.layout.LayerUseCase.growPayload(InsetsEdge.drawField(f), InsetsEdge.drawField(8));
            FrameIndex.EndpointList drawField = frameIndex.drawField(InsetsEdge.drawField(f2));
            FrameIndex.EndpointList drawField2 = frameIndex.drawField(InsetsEdge.drawField(f2));
            androidx.compose.ui.RemoteCallback detachStream = androidx.compose.foundation.layout.EndpointList.detachStream(companion, 0.0f, 1, null);
            notificationFence.resumeSignature(-1898511855);
            boolean formatPosition = notificationFence.formatPosition(morphCreator) | notificationFence.formatPosition(touchRecord);
            Object clipOrigin = notificationFence.clipOrigin();
            if (formatPosition || clipOrigin == NotificationFence.evictLayout.evictLayout()) {
                clipOrigin = new TouchRecord() { // from class: com.goldenboot.saga.zone.KeyboardGovernor
                    @Override // com.goldenboot.saga.zone.TouchRecord
                    public final Object invoke(Object obj) {
                        DpadBuilder injectMetric;
                        injectMetric = SaveSanitizer.ActivityMutator.injectMetric(TouchRecord.this, morphCreator, (KeyboardSegment) obj);
                        return injectMetric;
                    }
                };
                notificationFence.bindBody(clipOrigin);
            }
            notificationFence.unlockMessage();
            TapConverter.evictLayout(activityMutator, detachStream, null, growPayload4, false, drawField2, drawField, null, false, (TouchRecord) clipOrigin, notificationFence, 1772592, 404);
            notificationFence.updateAction();
            if (MorphPatch.bindBody()) {
                MorphPatch.startResource();
            }
        }

        @Override // com.goldenboot.saga.zone.ConfigListener
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            growPayload((BreadcrumbMaker) obj, (NotificationFence) obj2, ((Number) obj3).intValue());
            return DpadBuilder.evictLayout;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DpadBuilder applyTask(ElevationNode elevationNode, TouchRecord touchRecord, int i, NotificationFence notificationFence, int i2) {
        flushSample(elevationNode, touchRecord, notificationFence, NavBarImpl.evictLayout(i | 1));
        return DpadBuilder.evictLayout;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DpadBuilder clipOrigin(int i, boolean z, int i2, String str, ElevationNode elevationNode, int i3, NotificationFence notificationFence, int i4) {
        detachStream(i, z, i2, str, elevationNode, notificationFence, NavBarImpl.evictLayout(i3 | 1));
        return DpadBuilder.evictLayout;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void detachStream(final int i, final boolean z, final int i2, final String str, final ElevationNode elevationNode, NotificationFence notificationFence, final int i3) {
        int i4;
        int i5;
        int i6;
        RemoteCallback.Companion companion;
        NotificationFence notificationFence2;
        NotificationFence connectPatch = notificationFence.connectPatch(-819773074);
        if ((i3 & 6) == 0) {
            i4 = (connectPatch.updateTimer(i) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= connectPatch.injectMetric(z) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i4 |= connectPatch.updateTimer(i2) ? ContentOperation.RotationX : ContentOperation.SpotShadowColor;
        }
        if ((i3 & 3072) == 0) {
            i4 |= connectPatch.formatPosition(str) ? ContentOperation.CameraDistance : ContentOperation.RotationZ;
        }
        if ((i3 & 24576) == 0) {
            i4 |= connectPatch.drawField(elevationNode) ? 16384 : ContentOperation.Shape;
        }
        int i7 = i4;
        if ((i7 & 9363) == 9362 && connectPatch.purgeNode()) {
            connectPatch.syncScope();
        } else {
            if (MorphPatch.bindBody()) {
                MorphPatch.formatPosition(-819773074, i7, -1, "com.goldenboot.saga.zone.ui.screens.levelselect.LevelCard (LevelSelectScreen.kt:122)");
            }
            LayerTunnel inflateAdapter = z ? LayerTunnel.Companion.inflateAdapter(LayerTunnel.INSTANCE, CursorBuilder.notifyMessage(ContainerSource.serializeOffset(DrawerSemaphore.connectJob()), ContainerSource.serializeOffset(DrawerSemaphore.popBlueprint())), 0.0f, 0.0f, 0, 14, null) : LayerTunnel.Companion.inflateAdapter(LayerTunnel.INSTANCE, CursorBuilder.notifyMessage(ContainerSource.serializeOffset(ContainerSource.gatherAdapter(DrawerSemaphore.drawField(), 0.6f, 0.0f, 0.0f, 0.0f, 14, null)), ContainerSource.serializeOffset(DrawerSemaphore.popBlueprint())), 0.0f, 0.0f, 0, 14, null);
            RemoteCallback.Companion companion2 = androidx.compose.ui.RemoteCallback.INSTANCE;
            float f = 18;
            androidx.compose.ui.RemoteCallback growPayload = androidx.compose.foundation.ActivityMutator.growPayload(ListenerStore.evictLayout(androidx.compose.foundation.layout.ActivityMutator.growPayload(companion2, 0.9f, false, 2, null), SaveCycle.injectMetric(InsetsEdge.drawField(f))), inflateAdapter, null, 0.0f, 6, null);
            float f2 = 1;
            androidx.compose.ui.RemoteCallback releaseHeader = StepperDeserializer.releaseHeader(growPayload, InsetsEdge.drawField(f2), z ? ContainerSource.gatherAdapter(DrawerSemaphore.detachStream(), 0.5f, 0.0f, 0.0f, 0.0f, 14, null) : ContainerSource.gatherAdapter(ContainerSource.INSTANCE.gatherAdapter(), 0.06f, 0.0f, 0.0f, 0.0f, 14, null), SaveCycle.injectMetric(InsetsEdge.drawField(f)));
            connectPatch.resumeSignature(852926772);
            boolean z2 = (57344 & i7) == 16384;
            Object clipOrigin = connectPatch.clipOrigin();
            if (z2 || clipOrigin == NotificationFence.evictLayout.evictLayout()) {
                clipOrigin = new ElevationNode() { // from class: com.goldenboot.saga.zone.PinchTracker
                    @Override // com.goldenboot.saga.zone.ElevationNode
                    public final Object invoke() {
                        DpadBuilder releaseHeader2;
                        releaseHeader2 = SaveSanitizer.releaseHeader(ElevationNode.this);
                        return releaseHeader2;
                    }
                };
                connectPatch.bindBody(clipOrigin);
            }
            connectPatch.unlockMessage();
            androidx.compose.ui.RemoteCallback flushSample = androidx.compose.foundation.layout.LayerUseCase.flushSample(androidx.compose.foundation.BounceHandler.detachStream(releaseHeader, z, null, null, (ElevationNode) clipOrigin, 6, null), InsetsEdge.drawField(10));
            ChannelUploader.Companion companion3 = ChannelUploader.INSTANCE;
            FlexMaterializer updateTimer = WaveGuard.updateTimer(companion3.syncScope(), false);
            int evictLayout = ShadowStack.evictLayout(connectPatch, 0);
            StateMediator inflateEdge = connectPatch.inflateEdge();
            androidx.compose.ui.RemoteCallback serializeOffset = androidx.compose.ui.FeedbackFlow.serializeOffset(connectPatch, flushSample);
            AlarmMulticaster.Companion companion4 = AlarmMulticaster.INSTANCE;
            ElevationNode evictLayout2 = companion4.evictLayout();
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
            ContainerBarrier.releaseHeader(growPayload2, updateTimer, companion4.releaseHeader());
            ContainerBarrier.releaseHeader(growPayload2, inflateEdge, companion4.flushSample());
            IconExporter growPayload3 = companion4.growPayload();
            if (growPayload2.peekRevision() || !Intrinsics.areEqual(growPayload2.clipOrigin(), Integer.valueOf(evictLayout))) {
                growPayload2.bindBody(Integer.valueOf(evictLayout));
                growPayload2.serializeOffset(Integer.valueOf(evictLayout), growPayload3);
            }
            ContainerBarrier.releaseHeader(growPayload2, serializeOffset, companion4.clipOrigin());
            androidx.compose.foundation.layout.BounceHandler bounceHandler = androidx.compose.foundation.layout.BounceHandler.evictLayout;
            androidx.compose.ui.RemoteCallback growPayload4 = androidx.compose.foundation.layout.EndpointList.growPayload(companion2, 0.0f, 1, null);
            FlexMaterializer evictLayout3 = FlingDetector.evictLayout(FrameIndex.evictLayout.detachStream(), companion3.peekRevision(), connectPatch, 48);
            int evictLayout4 = ShadowStack.evictLayout(connectPatch, 0);
            StateMediator inflateEdge2 = connectPatch.inflateEdge();
            androidx.compose.ui.RemoteCallback serializeOffset2 = androidx.compose.ui.FeedbackFlow.serializeOffset(connectPatch, growPayload4);
            ElevationNode evictLayout5 = companion4.evictLayout();
            if (connectPatch.drawRequest() == null) {
                ShadowStack.injectMetric();
            }
            connectPatch.inflateAdapter();
            if (connectPatch.peekRevision()) {
                connectPatch.gatherAdapter(evictLayout5);
            } else {
                connectPatch.packPackage();
            }
            NotificationFence growPayload5 = ContainerBarrier.growPayload(connectPatch);
            ContainerBarrier.releaseHeader(growPayload5, evictLayout3, companion4.releaseHeader());
            ContainerBarrier.releaseHeader(growPayload5, inflateEdge2, companion4.flushSample());
            IconExporter growPayload6 = companion4.growPayload();
            if (growPayload5.peekRevision() || !Intrinsics.areEqual(growPayload5.clipOrigin(), Integer.valueOf(evictLayout4))) {
                growPayload5.bindBody(Integer.valueOf(evictLayout4));
                growPayload5.serializeOffset(Integer.valueOf(evictLayout4), growPayload6);
            }
            ContainerBarrier.releaseHeader(growPayload5, serializeOffset2, companion4.clipOrigin());
            SystemSteward systemSteward = SystemSteward.evictLayout;
            androidx.compose.ui.RemoteCallback releaseHeader2 = StepperDeserializer.releaseHeader(androidx.compose.foundation.ActivityMutator.growPayload(ListenerStore.evictLayout(androidx.compose.foundation.layout.EndpointList.flushSample(companion2, InsetsEdge.drawField(46)), SaveCycle.releaseHeader()), z ? LayerTunnel.Companion.connectJob(LayerTunnel.INSTANCE, CursorBuilder.notifyMessage(ContainerSource.serializeOffset(DrawerSemaphore.detachStream()), ContainerSource.serializeOffset(DrawerSemaphore.reduceScope())), 0L, 0.0f, 0, 14, null) : LayerTunnel.Companion.connectJob(LayerTunnel.INSTANCE, CursorBuilder.notifyMessage(ContainerSource.serializeOffset(DrawerSemaphore.drawField()), ContainerSource.serializeOffset(DrawerSemaphore.popBlueprint())), 0L, 0.0f, 0, 14, null), null, 0.0f, 6, null), InsetsEdge.drawField(f2), z ? DrawerSemaphore.flushSample() : ContainerSource.gatherAdapter(ContainerSource.INSTANCE.gatherAdapter(), 0.15f, 0.0f, 0.0f, 0.0f, 14, null), SaveCycle.releaseHeader());
            FlexMaterializer updateTimer2 = WaveGuard.updateTimer(companion3.applyTask(), false);
            int evictLayout6 = ShadowStack.evictLayout(connectPatch, 0);
            StateMediator inflateEdge3 = connectPatch.inflateEdge();
            androidx.compose.ui.RemoteCallback serializeOffset3 = androidx.compose.ui.FeedbackFlow.serializeOffset(connectPatch, releaseHeader2);
            ElevationNode evictLayout7 = companion4.evictLayout();
            if (connectPatch.drawRequest() == null) {
                ShadowStack.injectMetric();
            }
            connectPatch.inflateAdapter();
            if (connectPatch.peekRevision()) {
                connectPatch.gatherAdapter(evictLayout7);
            } else {
                connectPatch.packPackage();
            }
            NotificationFence growPayload7 = ContainerBarrier.growPayload(connectPatch);
            ContainerBarrier.releaseHeader(growPayload7, updateTimer2, companion4.releaseHeader());
            ContainerBarrier.releaseHeader(growPayload7, inflateEdge3, companion4.flushSample());
            IconExporter growPayload8 = companion4.growPayload();
            if (growPayload7.peekRevision() || !Intrinsics.areEqual(growPayload7.clipOrigin(), Integer.valueOf(evictLayout6))) {
                growPayload7.bindBody(Integer.valueOf(evictLayout6));
                growPayload7.serializeOffset(Integer.valueOf(evictLayout6), growPayload8);
            }
            ContainerBarrier.releaseHeader(growPayload7, serializeOffset3, companion4.clipOrigin());
            if (z) {
                connectPatch.resumeSignature(1614213694);
                i6 = i7;
                i5 = 0;
                companion = companion2;
                WatcherCreator.growPayload(String.valueOf(i), null, DrawerSemaphore.attachConfig(), FrameSaver.peekRevision(18), null, FontWeight.INSTANCE.releaseHeader(), null, 0L, null, null, 0L, 0, false, 0, 0, null, null, connectPatch, 200064, 0, 131026);
                notificationFence2 = connectPatch;
                notificationFence2.unlockMessage();
            } else {
                i5 = 0;
                i6 = i7;
                companion = companion2;
                connectPatch.resumeSignature(1614347149);
                CanvasSignal.evictLayout(ItemBatch.evictLayout(SwipeBenchmark.evictLayout), null, androidx.compose.foundation.layout.EndpointList.flushSample(companion, InsetsEdge.drawField(20)), DrawerSemaphore.resetDelta(), connectPatch, 3504, 0);
                notificationFence2 = connectPatch;
                notificationFence2.unlockMessage();
            }
            notificationFence2.updateAction();
            StyleAllocator.evictLayout(androidx.compose.foundation.layout.EndpointList.flushSample(companion, InsetsEdge.drawField(6)), notificationFence2, 6);
            NotificationFence notificationFence3 = notificationFence2;
            WatcherCreator.growPayload(str, null, z ? DrawerSemaphore.attachConfig() : DrawerSemaphore.resetDelta(), FrameSaver.peekRevision(11), null, FontWeight.INSTANCE.reduceScope(), null, 0L, null, LifecycleGenerator.updateTimer(LifecycleGenerator.INSTANCE.evictLayout()), 0L, 0, false, 2, 0, null, null, notificationFence3, ((i6 >> 9) & 14) | 199680, 3072, 122322);
            connectPatch = notificationFence3;
            StyleAllocator.evictLayout(LabelSyncer.growPayload(systemSteward, companion, 1.0f, false, 2, null), connectPatch, i5);
            CellAnnouncer.mapJob(i2, 0, InsetsEdge.drawField(12), null, connectPatch, ((i6 >> 6) & 14) | 384, 10);
            connectPatch.updateAction();
            connectPatch.updateAction();
            if (MorphPatch.bindBody()) {
                MorphPatch.startResource();
            }
        }
        ShapeCounter drawScope = connectPatch.drawScope();
        if (drawScope != null) {
            drawScope.evictLayout(new IconExporter() { // from class: com.goldenboot.saga.zone.ViewModerator
                @Override // com.goldenboot.saga.zone.IconExporter
                public final Object invoke(Object obj, Object obj2) {
                    DpadBuilder clipOrigin2;
                    clipOrigin2 = SaveSanitizer.clipOrigin(i, z, i2, str, elevationNode, i3, (NotificationFence) obj, ((Integer) obj2).intValue());
                    return clipOrigin2;
                }
            });
        }
    }

    public static final void flushSample(final ElevationNode onBack, final TouchRecord onLevel, NotificationFence notificationFence, final int i) {
        int i2;
        NotificationFence notificationFence2;
        Intrinsics.checkNotNullParameter(onBack, "onBack");
        Intrinsics.checkNotNullParameter(onLevel, "onLevel");
        NotificationFence connectPatch = notificationFence.connectPatch(428748944);
        if ((i & 6) == 0) {
            i2 = (connectPatch.drawField(onBack) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= connectPatch.drawField(onLevel) ? 32 : 16;
        }
        if ((i2 & 19) == 18 && connectPatch.purgeNode()) {
            connectPatch.syncScope();
            notificationFence2 = connectPatch;
        } else {
            if (MorphPatch.bindBody()) {
                MorphPatch.formatPosition(428748944, i2, -1, "com.goldenboot.saga.zone.ui.screens.levelselect.LevelSelectScreen (LevelSelectScreen.kt:58)");
            }
            CellAnnouncer.purgeNode(null, false, IconMaker.detachStream(1466112686, true, new ActivityMutator(onBack, BadgeLauncher.growPayload(GoldenbootApp.INSTANCE.getInstance().growPayload().getState(), null, null, null, connectPatch, 0, 7), onLevel), connectPatch, 54), connectPatch, 384, 3);
            notificationFence2 = connectPatch;
            if (MorphPatch.bindBody()) {
                MorphPatch.startResource();
            }
        }
        ShapeCounter drawScope = notificationFence2.drawScope();
        if (drawScope != null) {
            drawScope.evictLayout(new IconExporter() { // from class: com.goldenboot.saga.zone.TrackballFabricator
                @Override // com.goldenboot.saga.zone.IconExporter
                public final Object invoke(Object obj, Object obj2) {
                    DpadBuilder applyTask;
                    applyTask = SaveSanitizer.applyTask(ElevationNode.this, onLevel, i, (NotificationFence) obj, ((Integer) obj2).intValue());
                    return applyTask;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DpadBuilder releaseHeader(ElevationNode elevationNode) {
        elevationNode.invoke();
        return DpadBuilder.evictLayout;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PlayerState updateTimer(MorphCreator morphCreator) {
        return (PlayerState) morphCreator.getValue();
    }
}
