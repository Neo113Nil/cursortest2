package com.goldenboot.saga.zone;

import androidx.emoji2.text.FeedbackFlow;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u001e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\u0007¨\u0006\f"}, d2 = {"Lcom/goldenboot/saga/zone/FadeRepository;", "Lcom/goldenboot/saga/zone/AnchorState;", "<init>", "()V", "Lcom/goldenboot/saga/zone/MorphCreator;", "", "injectMetric", "()Lcom/goldenboot/saga/zone/MorphCreator;", "evictLayout", "Lcom/goldenboot/saga/zone/MorphCreator;", "loadState", "fontLoaded", "ui-text"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
final class FadeRepository implements AnchorState {

    /* renamed from: evictLayout, reason: from kotlin metadata */
    private MorphCreator loadState;

    /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
    @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u0019\u0010\u0007\u001a\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"com/goldenboot/saga/zone/FadeRepository$ActivityMutator", "Landroidx/emoji2/text/FeedbackFlow$StylusConverter;", "Lcom/goldenboot/saga/zone/DpadBuilder;", "growPayload", "()V", "", "throwable", "evictLayout", "(Ljava/lang/Throwable;)V", "ui-text"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class ActivityMutator extends FeedbackFlow.StylusConverter {
        final /* synthetic */ FadeRepository notifyMessage;
        final /* synthetic */ SlotDispatcher reduceScope;

        public ActivityMutator(SlotDispatcher slotDispatcher, FadeRepository fadeRepository) {
            this.reduceScope = slotDispatcher;
            this.notifyMessage = fadeRepository;
        }

        @Override // androidx.emoji2.text.FeedbackFlow.StylusConverter
        public void evictLayout(Throwable throwable) {
            SingletonPort singletonPort;
            FadeRepository fadeRepository = this.notifyMessage;
            singletonPort = CanvasMutex.evictLayout;
            fadeRepository.loadState = singletonPort;
        }

        @Override // androidx.emoji2.text.FeedbackFlow.StylusConverter
        public void growPayload() {
            this.reduceScope.setValue(Boolean.TRUE);
            this.notifyMessage.loadState = new SingletonPort(true);
        }
    }

    public FadeRepository() {
        this.loadState = androidx.emoji2.text.FeedbackFlow.popBlueprint() ? injectMetric() : null;
    }

    private final MorphCreator injectMetric() {
        androidx.emoji2.text.FeedbackFlow injectMetric = androidx.emoji2.text.FeedbackFlow.injectMetric();
        if (injectMetric.clipOrigin() == 1) {
            return new SingletonPort(true);
        }
        SlotDispatcher releaseHeader = StylusDetector.releaseHeader(Boolean.FALSE, null, 2, null);
        injectMetric.purgeNode(new ActivityMutator(releaseHeader, this));
        return releaseHeader;
    }

    @Override // com.goldenboot.saga.zone.AnchorState
    public MorphCreator evictLayout() {
        SingletonPort singletonPort;
        MorphCreator morphCreator = this.loadState;
        if (morphCreator != null) {
            Intrinsics.checkNotNull(morphCreator);
            return morphCreator;
        }
        if (!androidx.emoji2.text.FeedbackFlow.popBlueprint()) {
            singletonPort = CanvasMutex.evictLayout;
            return singletonPort;
        }
        MorphCreator injectMetric = injectMetric();
        this.loadState = injectMetric;
        Intrinsics.checkNotNull(injectMetric);
        return injectMetric;
    }
}
