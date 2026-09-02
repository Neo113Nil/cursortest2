package com.goldenboot.saga.zone;

import com.goldenboot.saga.zone.RuntimeHeap;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u000e\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000b\u0010\tJ\u0017\u0010\r\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\r\u0010\tJ\u0017\u0010\u000e\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000e\u0010\tJ\u0017\u0010\u000f\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000f\u0010\tJ\u001f\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J'\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0010\u001a\u00020\u00012\u0006\u0010\u0018\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0010\u001a\u00020\u00012\u0006\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010!\u001a\u00020\u001e2\u0006\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b!\u0010\"J\u0018\u0010&\u001a\u00020%2\u0006\u0010$\u001a\u00020#H\u0096\u0002¢\u0006\u0004\b&\u0010'R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u0014\u0010.\u001a\u00020\u00068BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b,\u0010-R\u0011\u00102\u001a\u00020/8F¢\u0006\u0006\u001a\u0004\b0\u00101R\u0014\u00105\u001a\u0002038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b4\u0010-R\u001a\u00109\u001a\b\u0012\u0004\u0012\u00020#068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b7\u00108R\u0016\u0010<\u001a\u0004\u0018\u00010\u00018VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b:\u0010;R\u0016\u0010>\u001a\u0004\u0018\u00010\u00018VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b=\u0010;R\u0014\u0010A\u001a\u00020\u00148VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b?\u0010@R\u0014\u0010C\u001a\u00020\u00148VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bB\u0010@¨\u0006D"}, d2 = {"Lcom/goldenboot/saga/zone/GradientUploader;", "Lcom/goldenboot/saga/zone/PagerReducer;", "Lcom/goldenboot/saga/zone/MorphTimer;", "lookaheadDelegate", "<init>", "(Lcom/goldenboot/saga/zone/MorphTimer;)V", "Lcom/goldenboot/saga/zone/RuntimeHeap;", "relativeToScreen", "parseAsset", "(J)J", "relativeToLocal", "queryModel", "relativeToWindow", "closeSource", "resumeSignature", "pauseNode", "sourceCoordinates", "relativeToSource", "attachVersion", "(Lcom/goldenboot/saga/zone/PagerReducer;J)J", "", "includeMotionFrameOfReference", "drainComponent", "(Lcom/goldenboot/saga/zone/PagerReducer;JZ)J", "clipBounds", "Lcom/goldenboot/saga/zone/ChipSnapshot;", "compressVersion", "(Lcom/goldenboot/saga/zone/PagerReducer;Z)Lcom/goldenboot/saga/zone/ChipSnapshot;", "Lcom/goldenboot/saga/zone/ViewStreamer;", "matrix", "Lcom/goldenboot/saga/zone/DpadBuilder;", "flattenKey", "(Lcom/goldenboot/saga/zone/PagerReducer;[F)V", "saveSnapshot", "([F)V", "Lcom/goldenboot/saga/zone/BottomBarActivator;", "alignmentLine", "", "storeCharset", "(Lcom/goldenboot/saga/zone/BottomBarActivator;)I", "reduceScope", "Lcom/goldenboot/saga/zone/MorphTimer;", "growPayload", "()Lcom/goldenboot/saga/zone/MorphTimer;", "injectMetric", "()J", "lookaheadOffset", "Lcom/goldenboot/saga/zone/BridgeSerializer;", "evictLayout", "()Lcom/goldenboot/saga/zone/BridgeSerializer;", "coordinator", "Lcom/goldenboot/saga/zone/ScaleSaver;", "applyTask", "size", "", "unwrapKey", "()Ljava/util/Set;", "providedAlignmentLines", "openJob", "()Lcom/goldenboot/saga/zone/PagerReducer;", "parentLayoutCoordinates", "formatMessage", "parentCoordinates", "popBlueprint", "()Z", "isAttached", "handleFooter", "introducesMotionFrameOfReference", "ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class GradientUploader implements PagerReducer {
    public static final int notifyMessage = 0;

    /* renamed from: reduceScope, reason: from kotlin metadata */
    private final MorphTimer lookaheadDelegate;

    public GradientUploader(MorphTimer morphTimer) {
        this.lookaheadDelegate = morphTimer;
    }

    private final long injectMetric() {
        MorphTimer evictLayout = DelegateGateway.evictLayout(this.lookaheadDelegate);
        PagerReducer dispatchTimezone = evictLayout.dispatchTimezone();
        RuntimeHeap.Companion companion = RuntimeHeap.INSTANCE;
        return RuntimeHeap.drawRequest(attachVersion(dispatchTimezone, companion.releaseHeader()), evictLayout().attachVersion(evictLayout.getCoordinator(), companion.releaseHeader()));
    }

    @Override // com.goldenboot.saga.zone.PagerReducer
    public long applyTask() {
        MorphTimer morphTimer = this.lookaheadDelegate;
        return ScaleSaver.releaseHeader((morphTimer.getWidth() << 32) | (morphTimer.getHeight() & 4294967295L));
    }

    @Override // com.goldenboot.saga.zone.PagerReducer
    public long attachVersion(PagerReducer sourceCoordinates, long relativeToSource) {
        return drainComponent(sourceCoordinates, relativeToSource, true);
    }

    @Override // com.goldenboot.saga.zone.PagerReducer
    public long closeSource(long relativeToWindow) {
        return RuntimeHeap.gatherAdapter(evictLayout().closeSource(relativeToWindow), injectMetric());
    }

    @Override // com.goldenboot.saga.zone.PagerReducer
    public ChipSnapshot compressVersion(PagerReducer sourceCoordinates, boolean clipBounds) {
        return evictLayout().compressVersion(sourceCoordinates, clipBounds);
    }

    @Override // com.goldenboot.saga.zone.PagerReducer
    public long drainComponent(PagerReducer sourceCoordinates, long relativeToSource, boolean includeMotionFrameOfReference) {
        if (!(sourceCoordinates instanceof GradientUploader)) {
            MorphTimer evictLayout = DelegateGateway.evictLayout(this.lookaheadDelegate);
            long drainComponent = drainComponent(evictLayout.getLookaheadLayoutCoordinates(), relativeToSource, includeMotionFrameOfReference);
            long position = evictLayout.getPosition();
            float serializeOffset = FontReporter.serializeOffset(position);
            float notifyMessage2 = FontReporter.notifyMessage(position);
            long drawRequest = RuntimeHeap.drawRequest(drainComponent, RuntimeHeap.flushSample((4294967295L & Float.floatToRawIntBits(notifyMessage2)) | (Float.floatToRawIntBits(serializeOffset) << 32)));
            PagerReducer formatMessage = evictLayout.getCoordinator().formatMessage();
            if (formatMessage == null) {
                formatMessage = evictLayout.getCoordinator().dispatchTimezone();
            }
            return RuntimeHeap.gatherAdapter(drawRequest, formatMessage.drainComponent(sourceCoordinates, RuntimeHeap.INSTANCE.releaseHeader(), includeMotionFrameOfReference));
        }
        MorphTimer morphTimer = ((GradientUploader) sourceCoordinates).lookaheadDelegate;
        morphTimer.getCoordinator().disposeSnapshot();
        MorphTimer lookaheadDelegate = evictLayout().unpackCharset(morphTimer.getCoordinator()).getLookaheadDelegate();
        if (lookaheadDelegate != null) {
            long attachConfig = FontReporter.attachConfig(FontReporter.resetDelta(morphTimer.decodeDigest(lookaheadDelegate, !includeMotionFrameOfReference), RegionListener.flushSample(relativeToSource)), this.lookaheadDelegate.decodeDigest(lookaheadDelegate, !includeMotionFrameOfReference));
            float serializeOffset2 = FontReporter.serializeOffset(attachConfig);
            float notifyMessage3 = FontReporter.notifyMessage(attachConfig);
            return RuntimeHeap.flushSample((Float.floatToRawIntBits(serializeOffset2) << 32) | (Float.floatToRawIntBits(notifyMessage3) & 4294967295L));
        }
        MorphTimer evictLayout2 = DelegateGateway.evictLayout(morphTimer);
        long resetDelta = FontReporter.resetDelta(FontReporter.resetDelta(morphTimer.decodeDigest(evictLayout2, !includeMotionFrameOfReference), evictLayout2.getPosition()), RegionListener.flushSample(relativeToSource));
        MorphTimer evictLayout3 = DelegateGateway.evictLayout(this.lookaheadDelegate);
        long attachConfig2 = FontReporter.attachConfig(resetDelta, FontReporter.resetDelta(this.lookaheadDelegate.decodeDigest(evictLayout3, !includeMotionFrameOfReference), evictLayout3.getPosition()));
        float serializeOffset3 = FontReporter.serializeOffset(attachConfig2);
        float notifyMessage4 = FontReporter.notifyMessage(attachConfig2);
        long flushSample = RuntimeHeap.flushSample((Float.floatToRawIntBits(serializeOffset3) << 32) | (4294967295L & Float.floatToRawIntBits(notifyMessage4)));
        BridgeSerializer wrappedBy = evictLayout3.getCoordinator().getWrappedBy();
        Intrinsics.checkNotNull(wrappedBy);
        BridgeSerializer wrappedBy2 = evictLayout2.getCoordinator().getWrappedBy();
        Intrinsics.checkNotNull(wrappedBy2);
        return wrappedBy.drainComponent(wrappedBy2, flushSample, includeMotionFrameOfReference);
    }

    public final BridgeSerializer evictLayout() {
        return this.lookaheadDelegate.getCoordinator();
    }

    @Override // com.goldenboot.saga.zone.PagerReducer
    public void flattenKey(PagerReducer sourceCoordinates, float[] matrix) {
        evictLayout().flattenKey(sourceCoordinates, matrix);
    }

    @Override // com.goldenboot.saga.zone.PagerReducer
    public PagerReducer formatMessage() {
        MorphTimer lookaheadDelegate;
        if (!popBlueprint()) {
            PagerBridge.applyTask(BridgeSerializer.handleFooter);
        }
        BridgeSerializer wrappedBy = evictLayout().getWrappedBy();
        if (wrappedBy == null || (lookaheadDelegate = wrappedBy.getLookaheadDelegate()) == null) {
            return null;
        }
        return lookaheadDelegate.dispatchTimezone();
    }

    /* renamed from: growPayload, reason: from getter */
    public final MorphTimer getLookaheadDelegate() {
        return this.lookaheadDelegate;
    }

    @Override // com.goldenboot.saga.zone.PagerReducer
    public boolean handleFooter() {
        return this.lookaheadDelegate.getIsPlacedUnderMotionFrameOfReference();
    }

    @Override // com.goldenboot.saga.zone.PagerReducer
    public PagerReducer openJob() {
        MorphTimer lookaheadDelegate;
        if (!popBlueprint()) {
            PagerBridge.applyTask(BridgeSerializer.handleFooter);
        }
        BridgeSerializer wrappedBy = evictLayout().getLayoutNode().searchHolder().getWrappedBy();
        if (wrappedBy == null || (lookaheadDelegate = wrappedBy.getLookaheadDelegate()) == null) {
            return null;
        }
        return lookaheadDelegate.dispatchTimezone();
    }

    @Override // com.goldenboot.saga.zone.PagerReducer
    public long parseAsset(long relativeToScreen) {
        return RuntimeHeap.gatherAdapter(evictLayout().parseAsset(relativeToScreen), injectMetric());
    }

    @Override // com.goldenboot.saga.zone.PagerReducer
    public long pauseNode(long relativeToLocal) {
        return evictLayout().pauseNode(RuntimeHeap.gatherAdapter(relativeToLocal, injectMetric()));
    }

    @Override // com.goldenboot.saga.zone.PagerReducer
    public boolean popBlueprint() {
        return evictLayout().popBlueprint();
    }

    @Override // com.goldenboot.saga.zone.PagerReducer
    public long queryModel(long relativeToLocal) {
        return evictLayout().queryModel(RuntimeHeap.gatherAdapter(relativeToLocal, injectMetric()));
    }

    @Override // com.goldenboot.saga.zone.PagerReducer
    public long resumeSignature(long relativeToLocal) {
        return evictLayout().resumeSignature(RuntimeHeap.gatherAdapter(relativeToLocal, injectMetric()));
    }

    @Override // com.goldenboot.saga.zone.PagerReducer
    public void saveSnapshot(float[] matrix) {
        evictLayout().saveSnapshot(matrix);
    }

    @Override // com.goldenboot.saga.zone.PagerReducer
    public int storeCharset(BottomBarActivator alignmentLine) {
        return this.lookaheadDelegate.storeCharset(alignmentLine);
    }

    @Override // com.goldenboot.saga.zone.PagerReducer
    public Set<BottomBarActivator> unwrapKey() {
        return evictLayout().unwrapKey();
    }
}
