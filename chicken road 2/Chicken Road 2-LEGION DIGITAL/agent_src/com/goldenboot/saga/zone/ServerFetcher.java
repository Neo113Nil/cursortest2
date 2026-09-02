package com.goldenboot.saga.zone;

import kotlin.Metadata;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\f\bÂ\u0002\u0018\u00002\u00020\u0001:\u0004\u0012\u0013\u0014\u0015B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J-\u0010\f\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ-\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\rJ-\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0010\u0010\rJ-\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\n¢\u0006\u0004\b\u0011\u0010\r¨\u0006\u0016"}, d2 = {"Lcom/goldenboot/saga/zone/ServerFetcher;", "", "<init>", "()V", "Lcom/goldenboot/saga/zone/SwipeDownloader;", "modifier", "Lcom/goldenboot/saga/zone/ProducerRecovery;", "intrinsicMeasureScope", "Lcom/goldenboot/saga/zone/FrameRevision;", "intrinsicMeasurable", "", "h", "detachStream", "(Lcom/goldenboot/saga/zone/SwipeDownloader;Lcom/goldenboot/saga/zone/ProducerRecovery;Lcom/goldenboot/saga/zone/FrameRevision;I)I", "w", "injectMetric", "growPayload", "evictLayout", "ActivityMutator", "BounceHandler", "FeedbackFlow", "LayerUseCase", "ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
final class ServerFetcher {
    public static final ServerFetcher evictLayout = new ServerFetcher();

    /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0013\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0013\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0015\u0010\u0012J\u0017\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0016\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0016\u0010&\u001a\u0004\u0018\u00010#8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b$\u0010%¨\u0006'"}, d2 = {"Lcom/goldenboot/saga/zone/ServerFetcher$ActivityMutator;", "Lcom/goldenboot/saga/zone/BreadcrumbMerger;", "Lcom/goldenboot/saga/zone/FrameRevision;", "measurable", "Lcom/goldenboot/saga/zone/ServerFetcher$FeedbackFlow;", "minMax", "Lcom/goldenboot/saga/zone/ServerFetcher$LayerUseCase;", "widthHeight", "<init>", "(Lcom/goldenboot/saga/zone/FrameRevision;Lcom/goldenboot/saga/zone/ServerFetcher$FeedbackFlow;Lcom/goldenboot/saga/zone/ServerFetcher$LayerUseCase;)V", "Lcom/goldenboot/saga/zone/PagerPlanner;", "constraints", "Landroidx/compose/ui/layout/GradientActivator;", "prependArchive", "(J)Landroidx/compose/ui/layout/GradientActivator;", "", "height", "prepareCount", "(I)I", "protectChannel", "width", "applyData", "attachCallback", "reduceScope", "Lcom/goldenboot/saga/zone/FrameRevision;", "evictLayout", "()Lcom/goldenboot/saga/zone/FrameRevision;", "notifyMessage", "Lcom/goldenboot/saga/zone/ServerFetcher$FeedbackFlow;", "growPayload", "()Lcom/goldenboot/saga/zone/ServerFetcher$FeedbackFlow;", "connectPatch", "Lcom/goldenboot/saga/zone/ServerFetcher$LayerUseCase;", "injectMetric", "()Lcom/goldenboot/saga/zone/ServerFetcher$LayerUseCase;", "", "unlockMessage", "()Ljava/lang/Object;", "parentData", "ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class ActivityMutator implements BreadcrumbMerger {

        /* renamed from: connectPatch, reason: from kotlin metadata */
        private final LayerUseCase widthHeight;

        /* renamed from: notifyMessage, reason: from kotlin metadata */
        private final FeedbackFlow minMax;

        /* renamed from: reduceScope, reason: from kotlin metadata */
        private final FrameRevision measurable;

        public ActivityMutator(FrameRevision frameRevision, FeedbackFlow feedbackFlow, LayerUseCase layerUseCase) {
            this.measurable = frameRevision;
            this.minMax = feedbackFlow;
            this.widthHeight = layerUseCase;
        }

        @Override // com.goldenboot.saga.zone.FrameRevision
        public int applyData(int width) {
            return this.measurable.applyData(width);
        }

        @Override // com.goldenboot.saga.zone.FrameRevision
        public int attachCallback(int width) {
            return this.measurable.attachCallback(width);
        }

        /* renamed from: evictLayout, reason: from getter */
        public final FrameRevision getMeasurable() {
            return this.measurable;
        }

        /* renamed from: growPayload, reason: from getter */
        public final FeedbackFlow getMinMax() {
            return this.minMax;
        }

        /* renamed from: injectMetric, reason: from getter */
        public final LayerUseCase getWidthHeight() {
            return this.widthHeight;
        }

        @Override // com.goldenboot.saga.zone.FrameRevision
        public int prepareCount(int height) {
            return this.measurable.prepareCount(height);
        }

        @Override // com.goldenboot.saga.zone.BreadcrumbMerger
        public androidx.compose.ui.layout.GradientActivator prependArchive(long constraints) {
            if (this.widthHeight == LayerUseCase.reduceScope) {
                return new BounceHandler(this.minMax == FeedbackFlow.notifyMessage ? this.measurable.protectChannel(PagerPlanner.reduceScope(constraints)) : this.measurable.prepareCount(PagerPlanner.reduceScope(constraints)), PagerPlanner.applyTask(constraints) ? PagerPlanner.reduceScope(constraints) : 32767);
            }
            return new BounceHandler(PagerPlanner.popBlueprint(constraints) ? PagerPlanner.notifyMessage(constraints) : 32767, this.minMax == FeedbackFlow.notifyMessage ? this.measurable.attachCallback(PagerPlanner.notifyMessage(constraints)) : this.measurable.applyData(PagerPlanner.notifyMessage(constraints)));
        }

        @Override // com.goldenboot.saga.zone.FrameRevision
        public int protectChannel(int height) {
            return this.measurable.protectChannel(height);
        }

        @Override // com.goldenboot.saga.zone.FrameRevision
        public Object unlockMessage() {
            return this.measurable.unlockMessage();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/goldenboot/saga/zone/ServerFetcher$FeedbackFlow;", "", "<init>", "(Ljava/lang/String;I)V", "reduceScope", "notifyMessage", "ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class FeedbackFlow {
        private static final /* synthetic */ ItemProcessor attachConfig;
        private static final /* synthetic */ FeedbackFlow[] connectPatch;
        public static final FeedbackFlow reduceScope = new FeedbackFlow("Min", 0);
        public static final FeedbackFlow notifyMessage = new FeedbackFlow("Max", 1);

        static {
            FeedbackFlow[] evictLayout = evictLayout();
            connectPatch = evictLayout;
            attachConfig = TranslateConductor.evictLayout(evictLayout);
        }

        private FeedbackFlow(String str, int i) {
        }

        private static final /* synthetic */ FeedbackFlow[] evictLayout() {
            return new FeedbackFlow[]{reduceScope, notifyMessage};
        }

        public static ItemProcessor releaseHeader() {
            return attachConfig;
        }

        public static FeedbackFlow valueOf(String str) {
            return (FeedbackFlow) Enum.valueOf(FeedbackFlow.class, str);
        }

        public static FeedbackFlow[] values() {
            return (FeedbackFlow[]) connectPatch.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/goldenboot/saga/zone/ServerFetcher$LayerUseCase;", "", "<init>", "(Ljava/lang/String;I)V", "reduceScope", "notifyMessage", "ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class LayerUseCase {
        private static final /* synthetic */ ItemProcessor attachConfig;
        private static final /* synthetic */ LayerUseCase[] connectPatch;
        public static final LayerUseCase reduceScope = new LayerUseCase("Width", 0);
        public static final LayerUseCase notifyMessage = new LayerUseCase("Height", 1);

        static {
            LayerUseCase[] evictLayout = evictLayout();
            connectPatch = evictLayout;
            attachConfig = TranslateConductor.evictLayout(evictLayout);
        }

        private LayerUseCase(String str, int i) {
        }

        private static final /* synthetic */ LayerUseCase[] evictLayout() {
            return new LayerUseCase[]{reduceScope, notifyMessage};
        }

        public static ItemProcessor releaseHeader() {
            return attachConfig;
        }

        public static LayerUseCase valueOf(String str) {
            return (LayerUseCase) Enum.valueOf(LayerUseCase.class, str);
        }

        public static LayerUseCase[] values() {
            return (LayerUseCase[]) connectPatch.clone();
        }
    }

    private ServerFetcher() {
    }

    public final int detachStream(SwipeDownloader modifier, ProducerRecovery intrinsicMeasureScope, FrameRevision intrinsicMeasurable, int h) {
        return modifier.popBlueprint(new androidx.compose.ui.layout.HeaderUtil(intrinsicMeasureScope, intrinsicMeasureScope.getLayoutDirection()), new ActivityMutator(intrinsicMeasurable, FeedbackFlow.reduceScope, LayerUseCase.reduceScope), SubscriberCache.growPayload(0, 0, 0, h, 7, null)).getEvictLayout();
    }

    public final int evictLayout(SwipeDownloader modifier, ProducerRecovery intrinsicMeasureScope, FrameRevision intrinsicMeasurable, int w) {
        return modifier.popBlueprint(new androidx.compose.ui.layout.HeaderUtil(intrinsicMeasureScope, intrinsicMeasureScope.getLayoutDirection()), new ActivityMutator(intrinsicMeasurable, FeedbackFlow.notifyMessage, LayerUseCase.notifyMessage), SubscriberCache.growPayload(0, w, 0, 0, 13, null)).getGrowPayload();
    }

    public final int growPayload(SwipeDownloader modifier, ProducerRecovery intrinsicMeasureScope, FrameRevision intrinsicMeasurable, int h) {
        return modifier.popBlueprint(new androidx.compose.ui.layout.HeaderUtil(intrinsicMeasureScope, intrinsicMeasureScope.getLayoutDirection()), new ActivityMutator(intrinsicMeasurable, FeedbackFlow.notifyMessage, LayerUseCase.reduceScope), SubscriberCache.growPayload(0, 0, 0, h, 7, null)).getEvictLayout();
    }

    public final int injectMetric(SwipeDownloader modifier, ProducerRecovery intrinsicMeasureScope, FrameRevision intrinsicMeasurable, int w) {
        return modifier.popBlueprint(new androidx.compose.ui.layout.HeaderUtil(intrinsicMeasureScope, intrinsicMeasureScope.getLayoutDirection()), new ActivityMutator(intrinsicMeasurable, FeedbackFlow.reduceScope, LayerUseCase.notifyMessage), SubscriberCache.growPayload(0, w, 0, 0, 13, null)).getGrowPayload();
    }

    /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0096\u0002¢\u0006\u0004\b\t\u0010\nJ5\u0010\u0013\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0014\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u000fH\u0014¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/goldenboot/saga/zone/ServerFetcher$BounceHandler;", "Landroidx/compose/ui/layout/GradientActivator;", "", "width", "height", "<init>", "(II)V", "Lcom/goldenboot/saga/zone/BottomBarActivator;", "alignmentLine", "storeCharset", "(Lcom/goldenboot/saga/zone/BottomBarActivator;)I", "Lcom/goldenboot/saga/zone/FontReporter;", "position", "", "zIndex", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/ScopedMigration;", "Lcom/goldenboot/saga/zone/DpadBuilder;", "layerBlock", "observeView", "(JFLcom/goldenboot/saga/zone/TouchRecord;)V", "ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class BounceHandler extends androidx.compose.ui.layout.GradientActivator {
        public BounceHandler(int i, int i2) {
            wrapMessage(ScaleSaver.releaseHeader((i2 & 4294967295L) | (i << 32)));
        }

        @Override // com.goldenboot.saga.zone.DimenFormatter
        public int storeCharset(BottomBarActivator alignmentLine) {
            return Integer.MIN_VALUE;
        }

        @Override // androidx.compose.ui.layout.GradientActivator
        public void observeView(long position, float zIndex, TouchRecord layerBlock) {
        }
    }
}
