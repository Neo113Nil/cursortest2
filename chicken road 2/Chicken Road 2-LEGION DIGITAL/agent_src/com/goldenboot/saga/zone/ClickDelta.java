package com.goldenboot.saga.zone;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0018\n\u0002\u0010%\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u00002\u00020\u0001B\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J'\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\b0\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\u001b\u0010\u0014\u001a\u00020\b*\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0006H$¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0016\u001a\u00020\f¢\u0006\u0004\b\u0016\u0010\u0010J\u000f\u0010\u0017\u001a\u00020\fH\u0000¢\u0006\u0004\b\u0017\u0010\u0010J\r\u0010\u0018\u001a\u00020\f¢\u0006\u0004\b\u0018\u0010\u0010J\u001b\u0010\u001b\u001a\u00020\u0019*\u00020\n2\u0006\u0010\u001a\u001a\u00020\u0019H$¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\"\u0010(\u001a\u00020!8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\"\u0010+\u001a\u00020!8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\r\u0010#\u001a\u0004\b)\u0010%\"\u0004\b*\u0010'R\"\u0010.\u001a\u00020!8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010#\u001a\u0004\b,\u0010%\"\u0004\b-\u0010'R\"\u00102\u001a\u00020!8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b/\u0010#\u001a\u0004\b0\u0010%\"\u0004\b1\u0010'R\"\u00105\u001a\u00020!8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010#\u001a\u0004\b3\u0010%\"\u0004\b4\u0010'R\"\u00108\u001a\u00020!8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b$\u0010#\u001a\u0004\b6\u0010%\"\u0004\b7\u0010'R\u0018\u00109\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u001eR \u0010<\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\b0:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010;R\u0014\u0010>\u001a\u00020!8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b=\u0010%R\u0014\u0010@\u001a\u00020!8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b?\u0010%R$\u0010B\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\b0\u0011*\u00020\n8$X¤\u0004¢\u0006\u0006\u001a\u0004\b/\u0010A\u0082\u0001\u0002CD¨\u0006E"}, d2 = {"Lcom/goldenboot/saga/zone/ClickDelta;", "", "Lcom/goldenboot/saga/zone/AbstractSlot;", "alignmentLinesOwner", "<init>", "(Lcom/goldenboot/saga/zone/AbstractSlot;)V", "Lcom/goldenboot/saga/zone/BottomBarActivator;", "alignmentLine", "", "initialPosition", "Lcom/goldenboot/saga/zone/BridgeSerializer;", "initialCoordinator", "Lcom/goldenboot/saga/zone/DpadBuilder;", "injectMetric", "(Lcom/goldenboot/saga/zone/BottomBarActivator;ILcom/goldenboot/saga/zone/BridgeSerializer;)V", "resetDelta", "()V", "", "updateTimer", "()Ljava/util/Map;", "applyTask", "(Lcom/goldenboot/saga/zone/BridgeSerializer;Lcom/goldenboot/saga/zone/BottomBarActivator;)I", "attachConfig", "inflateAdapter", "connectPatch", "Lcom/goldenboot/saga/zone/RuntimeHeap;", "position", "detachStream", "(Lcom/goldenboot/saga/zone/BridgeSerializer;J)J", "evictLayout", "Lcom/goldenboot/saga/zone/AbstractSlot;", "clipOrigin", "()Lcom/goldenboot/saga/zone/AbstractSlot;", "", "growPayload", "Z", "flushSample", "()Z", "purgeNode", "(Z)V", "dirty", "notifyMessage", "expandArgs", "usedDuringParentMeasurement", "reduceScope", "drawScope", "usedDuringParentLayout", "releaseHeader", "popBlueprint", "drawRequest", "previousUsedDuringParentLayout", "serializeOffset", "decodePath", "usedByModifierMeasurement", "peekRevision", "gatherAdapter", "usedByModifierLayout", "queryOwner", "", "Ljava/util/Map;", "alignmentLineMap", "drawField", "queried", "connectJob", "required", "(Lcom/goldenboot/saga/zone/BridgeSerializer;)Ljava/util/Map;", "alignmentLinesMap", "Lcom/goldenboot/saga/zone/BadgeHelper;", "Lcom/goldenboot/saga/zone/StyleFacilitator;", "ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class ClickDelta {
    public static final int popBlueprint = 8;

    /* renamed from: applyTask, reason: from kotlin metadata */
    private final Map<BottomBarActivator, Integer> alignmentLineMap;

    /* renamed from: clipOrigin, reason: from kotlin metadata */
    private boolean usedByModifierMeasurement;

    /* renamed from: detachStream, reason: from kotlin metadata */
    private boolean usedDuringParentLayout;

    /* renamed from: evictLayout, reason: from kotlin metadata */
    private final AbstractSlot alignmentLinesOwner;

    /* renamed from: flushSample, reason: from kotlin metadata */
    private boolean usedByModifierLayout;

    /* renamed from: growPayload, reason: from kotlin metadata */
    private boolean dirty;

    /* renamed from: injectMetric, reason: from kotlin metadata */
    private boolean usedDuringParentMeasurement;

    /* renamed from: releaseHeader, reason: from kotlin metadata */
    private boolean previousUsedDuringParentLayout;

    /* renamed from: updateTimer, reason: from kotlin metadata */
    private AbstractSlot queryOwner;

    /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/goldenboot/saga/zone/AbstractSlot;", "childOwner", "Lcom/goldenboot/saga/zone/DpadBuilder;", "evictLayout", "(Lcom/goldenboot/saga/zone/AbstractSlot;)V"}, k = 3, mv = {2, 0, 0})
    public static final class ActivityMutator extends Lambda implements TouchRecord {
        public ActivityMutator() {
            super(1);
        }

        public final void evictLayout(AbstractSlot abstractSlot) {
            if (abstractSlot.getIsPlaced()) {
                if (abstractSlot.getAlignmentLines().getDirty()) {
                    abstractSlot.normalizeRecord();
                }
                Map map = abstractSlot.getAlignmentLines().alignmentLineMap;
                ClickDelta clickDelta = ClickDelta.this;
                for (Map.Entry entry : map.entrySet()) {
                    clickDelta.injectMetric((BottomBarActivator) entry.getKey(), ((Number) entry.getValue()).intValue(), abstractSlot.closePayload());
                }
                BridgeSerializer wrappedBy = abstractSlot.closePayload().getWrappedBy();
                Intrinsics.checkNotNull(wrappedBy);
                while (!Intrinsics.areEqual(wrappedBy, ClickDelta.this.getAlignmentLinesOwner().closePayload())) {
                    Set<BottomBarActivator> keySet = ClickDelta.this.releaseHeader(wrappedBy).keySet();
                    ClickDelta clickDelta2 = ClickDelta.this;
                    for (BottomBarActivator bottomBarActivator : keySet) {
                        clickDelta2.injectMetric(bottomBarActivator, clickDelta2.applyTask(wrappedBy, bottomBarActivator), wrappedBy);
                    }
                    wrappedBy = wrappedBy.getWrappedBy();
                    Intrinsics.checkNotNull(wrappedBy);
                }
            }
        }

        @Override // com.goldenboot.saga.zone.TouchRecord
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            evictLayout((AbstractSlot) obj);
            return DpadBuilder.evictLayout;
        }
    }

    public /* synthetic */ ClickDelta(AbstractSlot abstractSlot, DefaultConstructorMarker defaultConstructorMarker) {
        this(abstractSlot);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void injectMetric(BottomBarActivator alignmentLine, int initialPosition, BridgeSerializer initialCoordinator) {
        float f = initialPosition;
        long flushSample = RuntimeHeap.flushSample((Float.floatToRawIntBits(f) << 32) | (Float.floatToRawIntBits(f) & 4294967295L));
        while (true) {
            flushSample = detachStream(initialCoordinator, flushSample);
            initialCoordinator = initialCoordinator.getWrappedBy();
            Intrinsics.checkNotNull(initialCoordinator);
            if (Intrinsics.areEqual(initialCoordinator, this.alignmentLinesOwner.closePayload())) {
                break;
            } else if (releaseHeader(initialCoordinator).containsKey(alignmentLine)) {
                float applyTask = applyTask(initialCoordinator, alignmentLine);
                flushSample = RuntimeHeap.flushSample((Float.floatToRawIntBits(applyTask) << 32) | (Float.floatToRawIntBits(applyTask) & 4294967295L));
            }
        }
        int round = Math.round(alignmentLine instanceof AttrSplitter ? Float.intBitsToFloat((int) (flushSample & 4294967295L)) : Float.intBitsToFloat((int) (flushSample >> 32)));
        Map<BottomBarActivator, Integer> map = this.alignmentLineMap;
        if (map.containsKey(alignmentLine)) {
            round = SelectionParser.injectMetric(alignmentLine, ((Number) AttrConductor.applyTask(this.alignmentLineMap, alignmentLine)).intValue(), round);
        }
        map.put(alignmentLine, Integer.valueOf(round));
    }

    public abstract int applyTask(BridgeSerializer bridgeSerializer, BottomBarActivator bottomBarActivator);

    public final void attachConfig() {
        this.alignmentLineMap.clear();
        this.alignmentLinesOwner.emitStrategy(new ActivityMutator());
        this.alignmentLineMap.putAll(releaseHeader(this.alignmentLinesOwner.closePayload()));
        this.dirty = false;
    }

    /* renamed from: clipOrigin, reason: from getter */
    public final AbstractSlot getAlignmentLinesOwner() {
        return this.alignmentLinesOwner;
    }

    public final boolean connectJob() {
        resetDelta();
        return this.queryOwner != null;
    }

    public final void connectPatch() {
        this.dirty = true;
        AbstractSlot offerHash = this.alignmentLinesOwner.offerHash();
        if (offerHash == null) {
            return;
        }
        if (this.usedDuringParentMeasurement) {
            offerHash.resumeOrigin();
        } else if (this.previousUsedDuringParentLayout || this.usedDuringParentLayout) {
            offerHash.requestLayout();
        }
        if (this.usedByModifierMeasurement) {
            this.alignmentLinesOwner.resumeOrigin();
        }
        if (this.usedByModifierLayout) {
            this.alignmentLinesOwner.requestLayout();
        }
        offerHash.getAlignmentLines().connectPatch();
    }

    public final void decodePath(boolean z) {
        this.usedByModifierMeasurement = z;
    }

    public abstract long detachStream(BridgeSerializer bridgeSerializer, long j);

    public final boolean drawField() {
        return this.usedDuringParentMeasurement || this.previousUsedDuringParentLayout || this.usedByModifierMeasurement || this.usedByModifierLayout;
    }

    public final void drawRequest(boolean z) {
        this.previousUsedDuringParentLayout = z;
    }

    public final void drawScope(boolean z) {
        this.usedDuringParentLayout = z;
    }

    public final void expandArgs(boolean z) {
        this.usedDuringParentMeasurement = z;
    }

    /* renamed from: flushSample, reason: from getter */
    public final boolean getDirty() {
        return this.dirty;
    }

    public final void gatherAdapter(boolean z) {
        this.usedByModifierLayout = z;
    }

    public final void inflateAdapter() {
        this.dirty = true;
        this.usedDuringParentMeasurement = false;
        this.previousUsedDuringParentLayout = false;
        this.usedDuringParentLayout = false;
        this.usedByModifierMeasurement = false;
        this.usedByModifierLayout = false;
        this.queryOwner = null;
    }

    /* renamed from: notifyMessage, reason: from getter */
    public final boolean getUsedDuringParentMeasurement() {
        return this.usedDuringParentMeasurement;
    }

    /* renamed from: peekRevision, reason: from getter */
    public final boolean getUsedByModifierLayout() {
        return this.usedByModifierLayout;
    }

    /* renamed from: popBlueprint, reason: from getter */
    public final boolean getPreviousUsedDuringParentLayout() {
        return this.previousUsedDuringParentLayout;
    }

    public final void purgeNode(boolean z) {
        this.dirty = z;
    }

    /* renamed from: reduceScope, reason: from getter */
    public final boolean getUsedDuringParentLayout() {
        return this.usedDuringParentLayout;
    }

    public abstract Map<BottomBarActivator, Integer> releaseHeader(BridgeSerializer bridgeSerializer);

    public final void resetDelta() {
        AbstractSlot abstractSlot;
        ClickDelta alignmentLines;
        ClickDelta alignmentLines2;
        if (drawField()) {
            abstractSlot = this.alignmentLinesOwner;
        } else {
            AbstractSlot offerHash = this.alignmentLinesOwner.offerHash();
            if (offerHash == null) {
                return;
            }
            abstractSlot = offerHash.getAlignmentLines().queryOwner;
            if (abstractSlot == null || !abstractSlot.getAlignmentLines().drawField()) {
                AbstractSlot abstractSlot2 = this.queryOwner;
                if (abstractSlot2 == null || abstractSlot2.getAlignmentLines().drawField()) {
                    return;
                }
                AbstractSlot offerHash2 = abstractSlot2.offerHash();
                if (offerHash2 != null && (alignmentLines2 = offerHash2.getAlignmentLines()) != null) {
                    alignmentLines2.resetDelta();
                }
                AbstractSlot offerHash3 = abstractSlot2.offerHash();
                abstractSlot = (offerHash3 == null || (alignmentLines = offerHash3.getAlignmentLines()) == null) ? null : alignmentLines.queryOwner;
            }
        }
        this.queryOwner = abstractSlot;
    }

    /* renamed from: serializeOffset, reason: from getter */
    public final boolean getUsedByModifierMeasurement() {
        return this.usedByModifierMeasurement;
    }

    public final Map<BottomBarActivator, Integer> updateTimer() {
        return this.alignmentLineMap;
    }

    private ClickDelta(AbstractSlot abstractSlot) {
        this.alignmentLinesOwner = abstractSlot;
        this.dirty = true;
        this.alignmentLineMap = new HashMap();
    }
}
