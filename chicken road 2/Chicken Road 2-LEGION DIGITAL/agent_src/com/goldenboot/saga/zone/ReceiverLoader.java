package com.goldenboot.saga.zone;

import android.view.ViewGroup;
import com.goldenboot.saga.zone.ClipboardNegotiator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
/* loaded from: classes.dex */
public final class ReceiverLoader extends WidgetAction implements ContainerVersion, OverlaySampler {
    public final float attachConfig;
    public final boolean connectPatch;
    public final SlotDispatcher decodePath;
    public ApplicationArbitrator drawRequest;
    public long drawScope;
    public int expandArgs;
    public final ElevationNode findTask;
    public final SlotDispatcher gatherAdapter;
    public final MorphCreator inflateAdapter;
    public final ViewGroup purgeNode;
    public final MorphCreator resetDelta;

    /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
    public static final class ActivityMutator extends Lambda implements ElevationNode {
        public ActivityMutator() {
            super(0);
        }

        public final void evictLayout() {
            ReceiverLoader.this.reduceScope(!r1.drawField());
        }

        @Override // com.goldenboot.saga.zone.ElevationNode
        public /* bridge */ /* synthetic */ Object invoke() {
            evictLayout();
            return DpadBuilder.evictLayout;
        }
    }

    public /* synthetic */ ReceiverLoader(boolean z, float f, MorphCreator morphCreator, MorphCreator morphCreator2, ViewGroup viewGroup, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, f, morphCreator, morphCreator2, viewGroup);
    }

    private final void popBlueprint() {
        ApplicationArbitrator applicationArbitrator = this.drawRequest;
        if (applicationArbitrator != null) {
            applicationArbitrator.evictLayout(this);
        }
    }

    @Override // com.goldenboot.saga.zone.ContainerVersion
    public void applyTask() {
        popBlueprint();
    }

    @Override // com.goldenboot.saga.zone.WidgetAction
    public void detachStream(ClipboardNegotiator.BounceHandler bounceHandler) {
        SpacerMutex serializeOffset = serializeOffset();
        if (serializeOffset != null) {
            serializeOffset.releaseHeader();
        }
    }

    public final boolean drawField() {
        return ((Boolean) this.decodePath.getValue()).booleanValue();
    }

    @Override // com.goldenboot.saga.zone.BaseBucket
    public void evictLayout(PublisherSegment publisherSegment) {
        this.drawScope = publisherSegment.releaseHeader();
        this.expandArgs = Float.isNaN(this.attachConfig) ? ChipChain.injectMetric(FlingMolder.evictLayout(publisherSegment, this.connectPatch, publisherSegment.releaseHeader())) : publisherSegment.lookupStream(this.attachConfig);
        long value = ((ContainerSource) this.resetDelta.getValue()).getValue();
        float detachStream = ((StackSyncer) this.inflateAdapter.getValue()).detachStream();
        publisherSegment.compressPrefs();
        injectMetric(publisherSegment, this.attachConfig, value);
        PulseCounter applyTask = publisherSegment.getDrawContext().applyTask();
        drawField();
        SpacerMutex serializeOffset = serializeOffset();
        if (serializeOffset != null) {
            serializeOffset.clipOrigin(publisherSegment.releaseHeader(), value, detachStream);
            serializeOffset.draw(EmitterHook.detachStream(applyTask));
        }
    }

    @Override // com.goldenboot.saga.zone.OverlaySampler
    public void exposeBinding() {
        notifyMessage(null);
    }

    @Override // com.goldenboot.saga.zone.ContainerVersion
    public void flushSample() {
        popBlueprint();
    }

    @Override // com.goldenboot.saga.zone.WidgetAction
    public void growPayload(ClipboardNegotiator.BounceHandler bounceHandler, ProgressValve progressValve) {
        SpacerMutex growPayload = peekRevision().growPayload(this);
        growPayload.growPayload(bounceHandler, this.connectPatch, this.drawScope, this.expandArgs, ((ContainerSource) this.resetDelta.getValue()).getValue(), ((StackSyncer) this.inflateAdapter.getValue()).detachStream(), this.findTask);
        notifyMessage(growPayload);
    }

    public final void notifyMessage(SpacerMutex spacerMutex) {
        this.gatherAdapter.setValue(spacerMutex);
    }

    public final ApplicationArbitrator peekRevision() {
        ApplicationArbitrator injectMetric;
        ApplicationArbitrator applicationArbitrator = this.drawRequest;
        if (applicationArbitrator != null) {
            Intrinsics.checkNotNull(applicationArbitrator);
            return applicationArbitrator;
        }
        injectMetric = HeaderHolder.injectMetric(this.purgeNode);
        this.drawRequest = injectMetric;
        Intrinsics.checkNotNull(injectMetric);
        return injectMetric;
    }

    public final void reduceScope(boolean z) {
        this.decodePath.setValue(Boolean.valueOf(z));
    }

    public final SpacerMutex serializeOffset() {
        return (SpacerMutex) this.gatherAdapter.getValue();
    }

    public ReceiverLoader(boolean z, float f, MorphCreator morphCreator, MorphCreator morphCreator2, ViewGroup viewGroup) {
        super(z, morphCreator2);
        this.connectPatch = z;
        this.attachConfig = f;
        this.resetDelta = morphCreator;
        this.inflateAdapter = morphCreator2;
        this.purgeNode = viewGroup;
        this.gatherAdapter = StylusDetector.releaseHeader(null, null, 2, null);
        this.decodePath = StylusDetector.releaseHeader(Boolean.TRUE, null, 2, null);
        this.drawScope = ShapeSender.INSTANCE.injectMetric();
        this.expandArgs = -1;
        this.findTask = new ActivityMutator();
    }

    @Override // com.goldenboot.saga.zone.ContainerVersion
    public void connectJob() {
    }
}
