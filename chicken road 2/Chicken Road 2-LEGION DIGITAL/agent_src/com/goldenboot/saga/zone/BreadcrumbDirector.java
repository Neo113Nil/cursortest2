package com.goldenboot.saga.zone;

import androidx.compose.ui.RemoteCallback;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
@Metadata(d1 = {"\u0000\u001f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0004\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0002¢\u0006\u0004\b\u0002\u0010\u0003\"\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006\" \u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\t0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b\" \u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\t0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000b¨\u0006\u000f"}, d2 = {"Lcom/goldenboot/saga/zone/ViewLauncher;", "", "releaseHeader", "(Lcom/goldenboot/saga/zone/ViewLauncher;)Z", "com/goldenboot/saga/zone/BreadcrumbDirector$ActivityMutator", "evictLayout", "Lcom/goldenboot/saga/zone/BreadcrumbDirector$ActivityMutator;", "DetachedModifierLocalReadScope", "Lkotlin/Function1;", "Lcom/goldenboot/saga/zone/DpadBuilder;", "growPayload", "Lcom/goldenboot/saga/zone/TouchRecord;", "onDrawCacheReadsChanged", "injectMetric", "updateModifierLocalConsumer", "ui_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class BreadcrumbDirector {
    private static final ActivityMutator evictLayout = new ActivityMutator();
    private static final TouchRecord growPayload = BounceHandler.reduceScope;
    private static final TouchRecord injectMetric = FeedbackFlow.reduceScope;

    /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
    @Metadata(d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R$\u0010\u0006\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00000\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"com/goldenboot/saga/zone/BreadcrumbDirector$ActivityMutator", "Lcom/goldenboot/saga/zone/RuntimeFetcher;", "T", "Lcom/goldenboot/saga/zone/VibrationParser;", "updateAction", "(Lcom/goldenboot/saga/zone/VibrationParser;)Ljava/lang/Object;", "current", "ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class ActivityMutator implements RuntimeFetcher {
        @Override // com.goldenboot.saga.zone.RuntimeFetcher
        public <T> T updateAction(VibrationParser<T> vibrationParser) {
            return (T) vibrationParser.getDefaultFactory().invoke();
        }
    }

    /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/goldenboot/saga/zone/ViewLauncher;", "it", "Lcom/goldenboot/saga/zone/DpadBuilder;", "evictLayout", "(Lcom/goldenboot/saga/zone/ViewLauncher;)V"}, k = 3, mv = {2, 0, 0})
    public static final class BounceHandler extends Lambda implements TouchRecord {
        public static final BounceHandler reduceScope = new BounceHandler();

        public BounceHandler() {
            super(1);
        }

        public final void evictLayout(ViewLauncher viewLauncher) {
            viewLauncher.resumeMetric();
        }

        @Override // com.goldenboot.saga.zone.TouchRecord
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            evictLayout((ViewLauncher) obj);
            return DpadBuilder.evictLayout;
        }
    }

    /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/goldenboot/saga/zone/ViewLauncher;", "it", "Lcom/goldenboot/saga/zone/DpadBuilder;", "evictLayout", "(Lcom/goldenboot/saga/zone/ViewLauncher;)V"}, k = 3, mv = {2, 0, 0})
    public static final class FeedbackFlow extends Lambda implements TouchRecord {
        public static final FeedbackFlow reduceScope = new FeedbackFlow();

        public FeedbackFlow() {
            super(1);
        }

        public final void evictLayout(ViewLauncher viewLauncher) {
            viewLauncher.processAdapter();
        }

        @Override // com.goldenboot.saga.zone.TouchRecord
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            evictLayout((ViewLauncher) obj);
            return DpadBuilder.evictLayout;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean releaseHeader(ViewLauncher viewLauncher) {
        RemoteCallback.LayerUseCase tail = LayoutConstructor.purgeNode(viewLauncher).getNodes().getTail();
        Intrinsics.checkNotNull(tail, "null cannot be cast to non-null type androidx.compose.ui.node.TailModifierNode");
        return ((GestureCustodian) tail).getAttachHasBeenRun();
    }
}
