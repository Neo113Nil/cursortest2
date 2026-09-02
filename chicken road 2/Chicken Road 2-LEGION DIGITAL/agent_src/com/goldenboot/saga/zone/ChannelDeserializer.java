package com.goldenboot.saga.zone;

import androidx.compose.ui.RemoteCallback;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
/* loaded from: classes.dex */
public final class ChannelDeserializer extends RemoteCallback.LayerUseCase implements KeyboardReducer {
    public boolean filterPayload;
    public ElevationNode flattenPackage;
    public boolean inflateEdge;
    public DoubleTapCommand injectConstraint;
    public final TouchRecord packPackage = new BounceHandler();
    public ScrollAxisRange queryModel;
    public BounceSplitter storeCharset;
    public TouchRecord unlockMessage;

    /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
    public static final class ActivityMutator extends Lambda implements ElevationNode {
        public ActivityMutator() {
            super(0);
        }

        @Override // com.goldenboot.saga.zone.ElevationNode
        /* renamed from: evictLayout, reason: merged with bridge method [inline-methods] */
        public final Float invoke() {
            return Float.valueOf(ChannelDeserializer.this.injectConstraint.evictLayout() - ChannelDeserializer.this.injectConstraint.detachStream());
        }
    }

    /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
    public static final class BounceHandler extends Lambda implements TouchRecord {
        public BounceHandler() {
            super(1);
        }

        @Override // com.goldenboot.saga.zone.TouchRecord
        /* renamed from: evictLayout, reason: merged with bridge method [inline-methods] */
        public final Integer invoke(Object obj) {
            PanelRouter panelRouter = (PanelRouter) ChannelDeserializer.this.flattenPackage.invoke();
            int itemCount = panelRouter.getItemCount();
            int i = 0;
            while (true) {
                if (i >= itemCount) {
                    i = -1;
                    break;
                }
                if (Intrinsics.areEqual(panelRouter.evictLayout(i), obj)) {
                    break;
                }
                i++;
            }
            return Integer.valueOf(i);
        }
    }

    /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
    public static final class EndpointList extends Lambda implements TouchRecord {

        /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
        public static final class ActivityMutator extends PanelRevision implements IconExporter {
            public final /* synthetic */ int connectPatch;
            public final /* synthetic */ ChannelDeserializer notifyMessage;
            public int reduceScope;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ActivityMutator(ChannelDeserializer channelDeserializer, int i, ServiceRegulator serviceRegulator) {
                super(2, serviceRegulator);
                this.notifyMessage = channelDeserializer;
                this.connectPatch = i;
            }

            @Override // com.goldenboot.saga.zone.ConfigValidator
            public final ServiceRegulator create(Object obj, ServiceRegulator serviceRegulator) {
                return new ActivityMutator(this.notifyMessage, this.connectPatch, serviceRegulator);
            }

            @Override // com.goldenboot.saga.zone.IconExporter
            public final Object invoke(ProgressValve progressValve, ServiceRegulator serviceRegulator) {
                return ((ActivityMutator) create(progressValve, serviceRegulator)).invokeSuspend(DpadBuilder.evictLayout);
            }

            @Override // com.goldenboot.saga.zone.ConfigValidator
            public final Object invokeSuspend(Object obj) {
                Object releaseHeader = RotateReceiver.releaseHeader();
                int i = this.reduceScope;
                if (i == 0) {
                    ColumnForger.growPayload(obj);
                    DoubleTapCommand doubleTapCommand = this.notifyMessage.injectConstraint;
                    int i2 = this.connectPatch;
                    this.reduceScope = 1;
                    if (doubleTapCommand.injectMetric(i2, this) == releaseHeader) {
                        return releaseHeader;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ColumnForger.growPayload(obj);
                }
                return DpadBuilder.evictLayout;
            }
        }

        public EndpointList() {
            super(1);
        }

        public final Boolean evictLayout(int i) {
            PanelRouter panelRouter = (PanelRouter) ChannelDeserializer.this.flattenPackage.invoke();
            if (i >= 0 && i < panelRouter.getItemCount()) {
                BottomBarDrain.detachStream(ChannelDeserializer.this.trimEntry(), null, null, new ActivityMutator(ChannelDeserializer.this, i, null), 3, null);
                return Boolean.TRUE;
            }
            throw new IllegalArgumentException(("Can't scroll to index " + i + ", it is out of bounds [0, " + panelRouter.getItemCount() + ')').toString());
        }

        @Override // com.goldenboot.saga.zone.TouchRecord
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return evictLayout(((Number) obj).intValue());
        }
    }

    /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
    public static final class FeedbackFlow extends Lambda implements ElevationNode {
        public FeedbackFlow() {
            super(0);
        }

        @Override // com.goldenboot.saga.zone.ElevationNode
        /* renamed from: evictLayout, reason: merged with bridge method [inline-methods] */
        public final Float invoke() {
            return Float.valueOf(ChannelDeserializer.this.injectConstraint.growPayload());
        }
    }

    /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
    public static final class LayerUseCase extends Lambda implements ElevationNode {
        public LayerUseCase() {
            super(0);
        }

        @Override // com.goldenboot.saga.zone.ElevationNode
        /* renamed from: evictLayout, reason: merged with bridge method [inline-methods] */
        public final Float invoke() {
            return Float.valueOf(ChannelDeserializer.this.injectConstraint.releaseHeader());
        }
    }

    public ChannelDeserializer(ElevationNode elevationNode, DoubleTapCommand doubleTapCommand, BounceSplitter bounceSplitter, boolean z, boolean z2) {
        this.flattenPackage = elevationNode;
        this.injectConstraint = doubleTapCommand;
        this.storeCharset = bounceSplitter;
        this.filterPayload = z;
        this.inflateEdge = z2;
        applyState();
    }

    private final boolean storeCache() {
        return this.storeCharset == BounceSplitter.Vertical;
    }

    @Override // com.goldenboot.saga.zone.KeyboardReducer
    public void applyData(ServerMerger serverMerger) {
        SetupCoordinator.expandSnapshot(serverMerger, true);
        SetupCoordinator.subscribeEvent(serverMerger, this.packPackage);
        if (storeCache()) {
            ScrollAxisRange scrollAxisRange = this.queryModel;
            if (scrollAxisRange == null) {
                Intrinsics.throwUninitializedPropertyAccessException("scrollAxisRange");
                scrollAxisRange = null;
            }
            SetupCoordinator.abortBinding(serverMerger, scrollAxisRange);
        } else {
            ScrollAxisRange scrollAxisRange2 = this.queryModel;
            if (scrollAxisRange2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("scrollAxisRange");
                scrollAxisRange2 = null;
            }
            SetupCoordinator.drainComponent(serverMerger, scrollAxisRange2);
        }
        TouchRecord touchRecord = this.unlockMessage;
        if (touchRecord != null) {
            SetupCoordinator.wrapModel(serverMerger, null, touchRecord, 1, null);
        }
        SetupCoordinator.serializeTask(serverMerger, null, new ActivityMutator(), 1, null);
        SetupCoordinator.filterSchema(serverMerger, startBundle());
    }

    public final void applyState() {
        this.queryModel = new ScrollAxisRange(new FeedbackFlow(), new LayerUseCase(), this.inflateEdge);
        this.unlockMessage = this.filterPayload ? new EndpointList() : null;
    }

    @Override // androidx.compose.ui.RemoteCallback.LayerUseCase
    /* renamed from: decodeDigest */
    public boolean getShouldAutoInvalidate() {
        return false;
    }

    public final void resumeMetric(ElevationNode elevationNode, DoubleTapCommand doubleTapCommand, BounceSplitter bounceSplitter, boolean z, boolean z2) {
        this.flattenPackage = elevationNode;
        this.injectConstraint = doubleTapCommand;
        if (this.storeCharset != bounceSplitter) {
            this.storeCharset = bounceSplitter;
            DelegateWriter.growPayload(this);
        }
        if (this.filterPayload == z && this.inflateEdge == z2) {
            return;
        }
        this.filterPayload = z;
        this.inflateEdge = z2;
        applyState();
        DelegateWriter.growPayload(this);
    }

    public final ReceiverStore startBundle() {
        return this.injectConstraint.clipOrigin();
    }
}
