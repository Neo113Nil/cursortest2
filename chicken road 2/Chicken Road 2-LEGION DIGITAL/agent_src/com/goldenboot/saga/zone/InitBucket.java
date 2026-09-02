package com.goldenboot.saga.zone;

import androidx.compose.ui.RemoteCallback;
import com.goldenboot.saga.zone.AlarmMulticaster;
import com.goldenboot.saga.zone.ChannelUploader;
import com.goldenboot.saga.zone.ComponentImpl;
import com.goldenboot.saga.zone.FontWeight;
import com.goldenboot.saga.zone.FrameIndex;
import com.goldenboot.saga.zone.InitBucket;
import com.goldenboot.saga.zone.LayerTunnel;
import com.goldenboot.saga.zone.data.GameRepository;
import com.goldenboot.saga.zone.data.PlayerState;
import com.goldenboot.saga.zone.ui.GoldenbootApp;
import java.time.LocalDate;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001d\u0010\u0003\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a/\u0010\u000b\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0003¢\u0006\u0004\b\u000b\u0010\f\"\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0013²\u0006\f\u0010\u0012\u001a\u00020\u00118\nX\u008a\u0084\u0002"}, d2 = {"Lkotlin/Function0;", "Lcom/goldenboot/saga/zone/DpadBuilder;", "onBack", "injectMetric", "(Lcom/goldenboot/saga/zone/ElevationNode;Lcom/goldenboot/saga/zone/NotificationFence;I)V", "", "day", "coins", "", "claimed", "active", "clipOrigin", "(IIZZLcom/goldenboot/saga/zone/NotificationFence;I)V", "", "evictLayout", "Ljava/util/List;", "DAILY_REWARDS", "Lcom/goldenboot/saga/zone/data/PlayerState;", "state", "app_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class InitBucket {
    private static final List<Integer> evictLayout = CursorBuilder.notifyMessage(30, 50, 75, 100, 150, 200, 400);

    /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class ActivityMutator implements ConfigListener {
        final /* synthetic */ MorphCreator attachConfig;
        final /* synthetic */ boolean connectPatch;
        final /* synthetic */ GameRepository inflateAdapter;
        final /* synthetic */ int notifyMessage;
        final /* synthetic */ ElevationNode reduceScope;
        final /* synthetic */ long resetDelta;

        /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        /* renamed from: com.goldenboot.saga.zone.InitBucket$ActivityMutator$ActivityMutator, reason: collision with other inner class name */
        public static final class C0122ActivityMutator implements IconExporter {
            final /* synthetic */ MorphCreator reduceScope;

            public C0122ActivityMutator(MorphCreator morphCreator) {
                this.reduceScope = morphCreator;
            }

            public final void evictLayout(NotificationFence notificationFence, int i) {
                if ((i & 3) == 2 && notificationFence.purgeNode()) {
                    notificationFence.syncScope();
                    return;
                }
                if (MorphPatch.bindBody()) {
                    MorphPatch.formatPosition(-732307724, i, -1, "com.goldenboot.saga.zone.ui.screens.daily.DailyRewardScreen.<anonymous>.<anonymous>.<anonymous> (DailyRewardScreen.kt:72)");
                }
                CellAnnouncer.connectPatch(InitBucket.detachStream(this.reduceScope).getCoins(), null, notificationFence, 0, 2);
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
            final /* synthetic */ MorphCreator notifyMessage;
            final /* synthetic */ int reduceScope;

            public BounceHandler(int i, MorphCreator morphCreator) {
                this.reduceScope = i;
                this.notifyMessage = morphCreator;
            }

            public final void evictLayout(NotificationFence notificationFence, int i) {
                if ((i & 3) == 2 && notificationFence.purgeNode()) {
                    notificationFence.syncScope();
                    return;
                }
                if (MorphPatch.bindBody()) {
                    MorphPatch.formatPosition(-195139774, i, -1, "com.goldenboot.saga.zone.ui.screens.daily.DailyRewardScreen.<anonymous>.<anonymous>.<anonymous> (DailyRewardScreen.kt:79)");
                }
                ChannelUploader.Companion companion = ChannelUploader.INSTANCE;
                ChannelUploader.FeedbackFlow connectPatch = companion.connectPatch();
                int i2 = this.reduceScope;
                MorphCreator morphCreator = this.notifyMessage;
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
                androidx.compose.ui.RemoteCallback growPayload4 = androidx.compose.foundation.ActivityMutator.growPayload(ListenerStore.evictLayout(androidx.compose.foundation.layout.EndpointList.flushSample(companion2, InsetsEdge.drawField(56)), SaveCycle.releaseHeader()), LayerTunnel.Companion.connectJob(LayerTunnel.INSTANCE, CursorBuilder.notifyMessage(ContainerSource.serializeOffset(DrawerSemaphore.detachStream()), ContainerSource.serializeOffset(DrawerSemaphore.reduceScope())), 0L, 0.0f, 0, 14, null), null, 0.0f, 6, null);
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
                CanvasSignal.evictLayout(ShapeProfiler.evictLayout(SwipeBenchmark.evictLayout), null, androidx.compose.foundation.layout.EndpointList.flushSample(companion2, InsetsEdge.drawField(28)), DrawerSemaphore.attachConfig(), notificationFence, 3504, 0);
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
                WatcherCreator.growPayload("Streak", null, DrawerSemaphore.detachStream(), FrameSaver.peekRevision(11), null, null, null, FrameSaver.peekRevision(3), null, null, 0L, 0, false, 0, 0, null, null, notificationFence, 12586374, 0, 130930);
                String str = InitBucket.detachStream(morphCreator).getDailyStreak() + " days in a row";
                long attachConfig = DrawerSemaphore.attachConfig();
                FontWeight.Companion companion4 = FontWeight.INSTANCE;
                WatcherCreator.growPayload(str, null, attachConfig, FrameSaver.peekRevision(16), null, companion4.injectMetric(), null, 0L, null, null, 0L, 0, false, 0, 0, null, null, notificationFence, 200064, 0, 131026);
                notificationFence.updateAction();
                WatcherCreator.growPayload("Day " + (i2 + 1), null, DrawerSemaphore.flushSample(), FrameSaver.peekRevision(14), null, companion4.releaseHeader(), null, 0L, null, null, 0L, 0, false, 0, 0, null, null, notificationFence, 200064, 0, 131026);
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
        @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "Lcom/goldenboot/saga/zone/SnackbarInstantiator;", "", "it", "Lcom/goldenboot/saga/zone/HoverGuard;", "evictLayout", "(Lcom/goldenboot/saga/zone/SnackbarInstantiator;I)J"}, k = 3, mv = {2, 0, 0})
        public static final class EndpointList extends Lambda implements IconExporter {
            final /* synthetic */ List notifyMessage;
            final /* synthetic */ IconExporter reduceScope;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public EndpointList(IconExporter iconExporter, List list) {
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

        /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "it", "", "evictLayout", "(Ljava/lang/Object;)Ljava/lang/Void;"}, k = 3, mv = {2, 0, 0})
        public static final class FeedbackFlow extends Lambda implements TouchRecord {
            public static final FeedbackFlow reduceScope = new FeedbackFlow();

            public FeedbackFlow() {
                super(1);
            }

            @Override // com.goldenboot.saga.zone.TouchRecord
            /* renamed from: evictLayout, reason: merged with bridge method [inline-methods] */
            public final Void invoke(Integer num) {
                return null;
            }
        }

        /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
        @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "", "index", "", "evictLayout", "(I)Ljava/lang/Object;"}, k = 3, mv = {2, 0, 0})
        public static final class LayerUseCase extends Lambda implements TouchRecord {
            final /* synthetic */ List notifyMessage;
            final /* synthetic */ TouchRecord reduceScope;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public LayerUseCase(TouchRecord touchRecord, List list) {
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
        @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u000b¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "Lcom/goldenboot/saga/zone/ModuleInstantiator;", "", "it", "Lcom/goldenboot/saga/zone/DpadBuilder;", "evictLayout", "(Lcom/goldenboot/saga/zone/ModuleInstantiator;ILcom/goldenboot/saga/zone/NotificationFence;I)V"}, k = 3, mv = {2, 0, 0})
        public static final class ScopedMigration extends Lambda implements BoxSteward {
            final /* synthetic */ boolean connectPatch;
            final /* synthetic */ int notifyMessage;
            final /* synthetic */ List reduceScope;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ScopedMigration(List list, int i, boolean z) {
                super(4);
                this.reduceScope = list;
                this.notifyMessage = i;
                this.connectPatch = z;
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
                notificationFence.resumeSignature(127499349);
                int intValue2 = ((Number) InitBucket.evictLayout.get(intValue)).intValue();
                int i4 = this.notifyMessage;
                InitBucket.clipOrigin(1 + intValue, intValue2, intValue < i4 || (this.connectPatch && intValue == CellEntry.releaseHeader(i4 - 1, 0)), intValue == this.notifyMessage && !this.connectPatch, notificationFence, 0);
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
        public static final class StylusConverter extends Lambda implements TouchRecord {
            final /* synthetic */ List notifyMessage;
            final /* synthetic */ TouchRecord reduceScope;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public StylusConverter(TouchRecord touchRecord, List list) {
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

        public ActivityMutator(ElevationNode elevationNode, int i, boolean z, MorphCreator morphCreator, long j, GameRepository gameRepository) {
            this.reduceScope = elevationNode;
            this.notifyMessage = i;
            this.connectPatch = z;
            this.attachConfig = morphCreator;
            this.resetDelta = j;
            this.inflateAdapter = gameRepository;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final DpadBuilder detachStream(int i, boolean z, KeyboardSegment LazyVerticalGrid) {
            Intrinsics.checkNotNullParameter(LazyVerticalGrid, "$this$LazyVerticalGrid");
            List appendEvent = CursorCollector.appendEvent(CellEntry.attachConfig(0, 7));
            LazyVerticalGrid.detachStream(appendEvent.size(), null, null, new StylusConverter(FeedbackFlow.reduceScope, appendEvent), IconMaker.growPayload(699646206, true, new ScopedMigration(appendEvent, i, z)));
            return DpadBuilder.evictLayout;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final DpadBuilder releaseHeader(long j, GameRepository gameRepository, int i, MorphCreator morphCreator) {
            int i2 = 1;
            if (InitBucket.detachStream(morphCreator).getLastDailyClaimEpochDay() >= 0 && j - InitBucket.detachStream(morphCreator).getLastDailyClaimEpochDay() <= 1) {
                i2 = 1 + InitBucket.detachStream(morphCreator).getDailyStreak();
            }
            gameRepository.claimDaily(j, i2, ((Number) InitBucket.evictLayout.get(i)).intValue());
            return DpadBuilder.evictLayout;
        }

        public final void injectMetric(BreadcrumbMaker GradientScreen, NotificationFence notificationFence, int i) {
            String str;
            Intrinsics.checkNotNullParameter(GradientScreen, "$this$GradientScreen");
            if ((i & 17) == 16 && notificationFence.purgeNode()) {
                notificationFence.syncScope();
                return;
            }
            if (MorphPatch.bindBody()) {
                MorphPatch.formatPosition(2082000420, i, -1, "com.goldenboot.saga.zone.ui.screens.daily.DailyRewardScreen.<anonymous> (DailyRewardScreen.kt:70)");
            }
            RemoteCallback.Companion companion = androidx.compose.ui.RemoteCallback.INSTANCE;
            androidx.compose.ui.RemoteCallback growPayload = androidx.compose.foundation.layout.EndpointList.growPayload(companion, 0.0f, 1, null);
            ElevationNode elevationNode = this.reduceScope;
            final int i2 = this.notifyMessage;
            final boolean z = this.connectPatch;
            final MorphCreator morphCreator = this.attachConfig;
            final long j = this.resetDelta;
            final GameRepository gameRepository = this.inflateAdapter;
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
            FadeFormer.injectMetric("Daily Reward", null, elevationNode, IconMaker.detachStream(-732307724, true, new C0122ActivityMutator(morphCreator), notificationFence, 54), notificationFence, 3078, 2);
            float f = 16;
            CellAnnouncer.queryModel(androidx.compose.foundation.layout.LayerUseCase.applyTask(androidx.compose.foundation.layout.EndpointList.detachStream(companion, 0.0f, 1, null), InsetsEdge.drawField(f), 0.0f, 2, null), null, IconMaker.detachStream(-195139774, true, new BounceHandler(i2, morphCreator), notificationFence, 54), notificationFence, 390, 2);
            StyleAllocator.evictLayout(androidx.compose.foundation.layout.EndpointList.releaseHeader(companion, InsetsEdge.drawField(12)), notificationFence, 6);
            ComponentImpl.ActivityMutator activityMutator = new ComponentImpl.ActivityMutator(4);
            SessionPhase injectMetric = androidx.compose.foundation.layout.LayerUseCase.injectMetric(InsetsEdge.drawField(f), 0.0f, 2, null);
            float f2 = 10;
            FrameIndex.EndpointList drawField = frameIndex.drawField(InsetsEdge.drawField(f2));
            FrameIndex.EndpointList drawField2 = frameIndex.drawField(InsetsEdge.drawField(f2));
            notificationFence.resumeSignature(-1343378118);
            boolean updateTimer = notificationFence.updateTimer(i2) | notificationFence.injectMetric(z);
            Object clipOrigin = notificationFence.clipOrigin();
            if (updateTimer || clipOrigin == NotificationFence.evictLayout.evictLayout()) {
                clipOrigin = new TouchRecord() { // from class: com.goldenboot.saga.zone.JoystickResolver
                    @Override // com.goldenboot.saga.zone.TouchRecord
                    public final Object invoke(Object obj) {
                        DpadBuilder detachStream;
                        detachStream = InitBucket.ActivityMutator.detachStream(i2, z, (KeyboardSegment) obj);
                        return detachStream;
                    }
                };
                notificationFence.bindBody(clipOrigin);
            }
            notificationFence.unlockMessage();
            TapConverter.evictLayout(activityMutator, null, null, injectMetric, false, drawField2, drawField, null, false, (TouchRecord) clipOrigin, notificationFence, 1772544, 406);
            StyleAllocator.evictLayout(LabelSyncer.growPayload(systemSteward, companion, 1.0f, false, 2, null), notificationFence, 0);
            if (z) {
                str = "Come back tomorrow";
            } else {
                str = "Claim +" + InitBucket.evictLayout.get(i2) + " coins";
            }
            MenuSequence menuSequence = z ? MenuSequence.connectPatch : MenuSequence.notifyMessage;
            boolean z2 = !z;
            androidx.compose.ui.RemoteCallback applyTask = androidx.compose.foundation.layout.LayerUseCase.applyTask(androidx.compose.foundation.layout.EndpointList.detachStream(companion, 0.0f, 1, null), InsetsEdge.drawField(f), 0.0f, 2, null);
            notificationFence.resumeSignature(-1343351506);
            boolean formatPosition = notificationFence.formatPosition(morphCreator) | notificationFence.applyTask(j) | notificationFence.drawField(gameRepository) | notificationFence.updateTimer(i2);
            Object clipOrigin2 = notificationFence.clipOrigin();
            if (formatPosition || clipOrigin2 == NotificationFence.evictLayout.evictLayout()) {
                clipOrigin2 = new ElevationNode() { // from class: com.goldenboot.saga.zone.SlideGraph
                    @Override // com.goldenboot.saga.zone.ElevationNode
                    public final Object invoke() {
                        DpadBuilder releaseHeader;
                        releaseHeader = InitBucket.ActivityMutator.releaseHeader(j, gameRepository, i2, morphCreator);
                        return releaseHeader;
                    }
                };
                notificationFence.bindBody(clipOrigin2);
            }
            notificationFence.unlockMessage();
            CellAnnouncer.findTask(str, applyTask, null, z2, menuSequence, (ElevationNode) clipOrigin2, notificationFence, 48, 4);
            StyleAllocator.evictLayout(androidx.compose.foundation.layout.EndpointList.releaseHeader(companion, InsetsEdge.drawField(20)), notificationFence, 6);
            notificationFence.updateAction();
            if (MorphPatch.bindBody()) {
                MorphPatch.startResource();
            }
        }

        @Override // com.goldenboot.saga.zone.ConfigListener
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            injectMetric((BreadcrumbMaker) obj, (NotificationFence) obj2, ((Number) obj3).intValue());
            return DpadBuilder.evictLayout;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void clipOrigin(final int i, final int i2, final boolean z, final boolean z2, NotificationFence notificationFence, final int i3) {
        int i4;
        NotificationFence connectPatch = notificationFence.connectPatch(495242428);
        if ((i3 & 6) == 0) {
            i4 = (connectPatch.updateTimer(i) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= connectPatch.updateTimer(i2) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i4 |= connectPatch.injectMetric(z) ? ContentOperation.RotationX : ContentOperation.SpotShadowColor;
        }
        if ((i3 & 3072) == 0) {
            i4 |= connectPatch.injectMetric(z2) ? ContentOperation.CameraDistance : ContentOperation.RotationZ;
        }
        if ((i4 & 1171) == 1170 && connectPatch.purgeNode()) {
            connectPatch.syncScope();
        } else {
            if (MorphPatch.bindBody()) {
                MorphPatch.formatPosition(495242428, i4, -1, "com.goldenboot.saga.zone.ui.screens.daily.DayCard (DailyRewardScreen.kt:129)");
            }
            LayerTunnel inflateAdapter = z2 ? LayerTunnel.Companion.inflateAdapter(LayerTunnel.INSTANCE, CursorBuilder.notifyMessage(ContainerSource.serializeOffset(DrawerSemaphore.flushSample()), ContainerSource.serializeOffset(DrawerSemaphore.detachStream()), ContainerSource.serializeOffset(DrawerSemaphore.reduceScope())), 0.0f, 0.0f, 0, 14, null) : z ? LayerTunnel.Companion.inflateAdapter(LayerTunnel.INSTANCE, CursorBuilder.notifyMessage(ContainerSource.serializeOffset(ContainerSource.gatherAdapter(DrawerSemaphore.notifyMessage(), 0.6f, 0.0f, 0.0f, 0.0f, 14, null)), ContainerSource.serializeOffset(DrawerSemaphore.popBlueprint())), 0.0f, 0.0f, 0, 14, null) : LayerTunnel.Companion.inflateAdapter(LayerTunnel.INSTANCE, CursorBuilder.notifyMessage(ContainerSource.serializeOffset(DrawerSemaphore.connectJob()), ContainerSource.serializeOffset(DrawerSemaphore.popBlueprint())), 0.0f, 0.0f, 0, 14, null);
            RemoteCallback.Companion companion = androidx.compose.ui.RemoteCallback.INSTANCE;
            float f = 18;
            androidx.compose.ui.RemoteCallback flushSample = androidx.compose.foundation.layout.LayerUseCase.flushSample(StepperDeserializer.releaseHeader(androidx.compose.foundation.ActivityMutator.growPayload(ListenerStore.evictLayout(androidx.compose.foundation.layout.ActivityMutator.growPayload(companion, 0.9f, false, 2, null), SaveCycle.injectMetric(InsetsEdge.drawField(f))), inflateAdapter, null, 0.0f, 6, null), InsetsEdge.drawField(z2 ? 2 : 1), z2 ? DrawerSemaphore.flushSample() : z ? DrawerSemaphore.notifyMessage() : ContainerSource.gatherAdapter(ContainerSource.INSTANCE.gatherAdapter(), 0.08f, 0.0f, 0.0f, 0.0f, 14, null), SaveCycle.injectMetric(InsetsEdge.drawField(f))), InsetsEdge.drawField(8));
            ChannelUploader.Companion companion2 = ChannelUploader.INSTANCE;
            FlexMaterializer updateTimer = WaveGuard.updateTimer(companion2.syncScope(), false);
            int evictLayout2 = ShadowStack.evictLayout(connectPatch, 0);
            StateMediator inflateEdge = connectPatch.inflateEdge();
            androidx.compose.ui.RemoteCallback serializeOffset = androidx.compose.ui.FeedbackFlow.serializeOffset(connectPatch, flushSample);
            AlarmMulticaster.Companion companion3 = AlarmMulticaster.INSTANCE;
            ElevationNode evictLayout3 = companion3.evictLayout();
            if (connectPatch.drawRequest() == null) {
                ShadowStack.injectMetric();
            }
            connectPatch.inflateAdapter();
            if (connectPatch.peekRevision()) {
                connectPatch.gatherAdapter(evictLayout3);
            } else {
                connectPatch.packPackage();
            }
            NotificationFence growPayload = ContainerBarrier.growPayload(connectPatch);
            ContainerBarrier.releaseHeader(growPayload, updateTimer, companion3.releaseHeader());
            ContainerBarrier.releaseHeader(growPayload, inflateEdge, companion3.flushSample());
            IconExporter growPayload2 = companion3.growPayload();
            if (growPayload.peekRevision() || !Intrinsics.areEqual(growPayload.clipOrigin(), Integer.valueOf(evictLayout2))) {
                growPayload.bindBody(Integer.valueOf(evictLayout2));
                growPayload.serializeOffset(Integer.valueOf(evictLayout2), growPayload2);
            }
            ContainerBarrier.releaseHeader(growPayload, serializeOffset, companion3.clipOrigin());
            androidx.compose.foundation.layout.BounceHandler bounceHandler = androidx.compose.foundation.layout.BounceHandler.evictLayout;
            ChannelUploader.BounceHandler peekRevision = companion2.peekRevision();
            androidx.compose.ui.RemoteCallback growPayload3 = androidx.compose.foundation.layout.EndpointList.growPayload(companion, 0.0f, 1, null);
            FlexMaterializer evictLayout4 = FlingDetector.evictLayout(FrameIndex.evictLayout.detachStream(), peekRevision, connectPatch, 48);
            int evictLayout5 = ShadowStack.evictLayout(connectPatch, 0);
            StateMediator inflateEdge2 = connectPatch.inflateEdge();
            androidx.compose.ui.RemoteCallback serializeOffset2 = androidx.compose.ui.FeedbackFlow.serializeOffset(connectPatch, growPayload3);
            ElevationNode evictLayout6 = companion3.evictLayout();
            if (connectPatch.drawRequest() == null) {
                ShadowStack.injectMetric();
            }
            connectPatch.inflateAdapter();
            if (connectPatch.peekRevision()) {
                connectPatch.gatherAdapter(evictLayout6);
            } else {
                connectPatch.packPackage();
            }
            NotificationFence growPayload4 = ContainerBarrier.growPayload(connectPatch);
            ContainerBarrier.releaseHeader(growPayload4, evictLayout4, companion3.releaseHeader());
            ContainerBarrier.releaseHeader(growPayload4, inflateEdge2, companion3.flushSample());
            IconExporter growPayload5 = companion3.growPayload();
            if (growPayload4.peekRevision() || !Intrinsics.areEqual(growPayload4.clipOrigin(), Integer.valueOf(evictLayout5))) {
                growPayload4.bindBody(Integer.valueOf(evictLayout5));
                growPayload4.serializeOffset(Integer.valueOf(evictLayout5), growPayload5);
            }
            ContainerBarrier.releaseHeader(growPayload4, serializeOffset2, companion3.clipOrigin());
            SystemSteward systemSteward = SystemSteward.evictLayout;
            String upperCase = ("Day " + i).toUpperCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
            long popBlueprint = z2 ? DrawerSemaphore.popBlueprint() : DrawerSemaphore.detachStream();
            long peekRevision2 = FrameSaver.peekRevision(2);
            long peekRevision3 = FrameSaver.peekRevision(10);
            FontWeight.Companion companion4 = FontWeight.INSTANCE;
            WatcherCreator.growPayload(upperCase, null, popBlueprint, peekRevision3, null, companion4.injectMetric(), null, peekRevision2, null, null, 0L, 0, false, 0, 0, null, null, connectPatch, 12782592, 0, 130898);
            StyleAllocator.evictLayout(LabelSyncer.growPayload(systemSteward, companion, 1.0f, false, 2, null), connectPatch, 0);
            SwipeBenchmark swipeBenchmark = SwipeBenchmark.evictLayout;
            CanvasSignal.evictLayout(SpanParser.evictLayout(swipeBenchmark), null, androidx.compose.foundation.layout.EndpointList.flushSample(companion, InsetsEdge.drawField(30)), z2 ? DrawerSemaphore.popBlueprint() : DrawerSemaphore.flushSample(), connectPatch, 432, 0);
            StyleAllocator.evictLayout(androidx.compose.foundation.layout.EndpointList.releaseHeader(companion, InsetsEdge.drawField(4)), connectPatch, 6);
            WatcherCreator.growPayload("+" + i2, null, z2 ? DrawerSemaphore.popBlueprint() : DrawerSemaphore.attachConfig(), FrameSaver.peekRevision(14), null, companion4.releaseHeader(), null, 0L, null, null, 0L, 0, false, 0, 0, null, null, connectPatch, 199680, 0, 131026);
            connectPatch = connectPatch;
            StyleAllocator.evictLayout(LabelSyncer.growPayload(systemSteward, companion, 1.0f, false, 2, null), connectPatch, 0);
            connectPatch.resumeSignature(-1088550510);
            if (z) {
                CanvasSignal.evictLayout(SocketSegment.evictLayout(swipeBenchmark), null, androidx.compose.foundation.layout.EndpointList.flushSample(companion, InsetsEdge.drawField(16)), DrawerSemaphore.notifyMessage(), connectPatch, 3504, 0);
            }
            connectPatch.unlockMessage();
            connectPatch.updateAction();
            connectPatch.updateAction();
            if (MorphPatch.bindBody()) {
                MorphPatch.startResource();
            }
        }
        ShapeCounter drawScope = connectPatch.drawScope();
        if (drawScope != null) {
            drawScope.evictLayout(new IconExporter() { // from class: com.goldenboot.saga.zone.HeaderCounter
                @Override // com.goldenboot.saga.zone.IconExporter
                public final Object invoke(Object obj, Object obj2) {
                    DpadBuilder flushSample2;
                    flushSample2 = InitBucket.flushSample(i, i2, z, z2, i3, (NotificationFence) obj, ((Integer) obj2).intValue());
                    return flushSample2;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PlayerState detachStream(MorphCreator morphCreator) {
        return (PlayerState) morphCreator.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DpadBuilder flushSample(int i, int i2, boolean z, boolean z2, int i3, NotificationFence notificationFence, int i4) {
        clipOrigin(i, i2, z, z2, notificationFence, NavBarImpl.evictLayout(i3 | 1));
        return DpadBuilder.evictLayout;
    }

    public static final void injectMetric(ElevationNode onBack, NotificationFence notificationFence, final int i) {
        int i2;
        final ElevationNode elevationNode;
        Intrinsics.checkNotNullParameter(onBack, "onBack");
        NotificationFence connectPatch = notificationFence.connectPatch(1604315142);
        if ((i & 6) == 0) {
            i2 = (connectPatch.drawField(onBack) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && connectPatch.purgeNode()) {
            connectPatch.syncScope();
            elevationNode = onBack;
        } else {
            if (MorphPatch.bindBody()) {
                MorphPatch.formatPosition(1604315142, i2, -1, "com.goldenboot.saga.zone.ui.screens.daily.DailyRewardScreen (DailyRewardScreen.kt:57)");
            }
            GameRepository growPayload = GoldenbootApp.INSTANCE.getInstance().growPayload();
            MorphCreator growPayload2 = BadgeLauncher.growPayload(growPayload.getState(), null, null, null, connectPatch, 0, 7);
            long epochDay = LocalDate.now().toEpochDay();
            int i3 = 0;
            boolean z = detachStream(growPayload2).getLastDailyClaimEpochDay() == epochDay;
            if (detachStream(growPayload2).getLastDailyClaimEpochDay() >= 0) {
                if (epochDay - detachStream(growPayload2).getLastDailyClaimEpochDay() == 1) {
                    i3 = detachStream(growPayload2).getDailyStreak() % 7;
                } else if (epochDay - detachStream(growPayload2).getLastDailyClaimEpochDay() == 0) {
                    i3 = CellEntry.releaseHeader(detachStream(growPayload2).getDailyStreak() - 1, 0) % 7;
                }
            }
            elevationNode = onBack;
            CellAnnouncer.purgeNode(null, false, IconMaker.detachStream(2082000420, true, new ActivityMutator(onBack, i3, z, growPayload2, epochDay, growPayload), connectPatch, 54), connectPatch, 384, 3);
            if (MorphPatch.bindBody()) {
                MorphPatch.startResource();
            }
        }
        ShapeCounter drawScope = connectPatch.drawScope();
        if (drawScope != null) {
            drawScope.evictLayout(new IconExporter() { // from class: com.goldenboot.saga.zone.GestureBootstrapper
                @Override // com.goldenboot.saga.zone.IconExporter
                public final Object invoke(Object obj, Object obj2) {
                    DpadBuilder releaseHeader;
                    releaseHeader = InitBucket.releaseHeader(ElevationNode.this, i, (NotificationFence) obj, ((Integer) obj2).intValue());
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
