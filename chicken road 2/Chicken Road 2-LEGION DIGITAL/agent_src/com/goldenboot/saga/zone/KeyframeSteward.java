package com.goldenboot.saga.zone;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
/* loaded from: classes.dex */
public final class KeyframeSteward {
    public static final ActivityMutator peekRevision = new ActivityMutator(null);
    public static final int serializeOffset = 8;
    public int clipOrigin;
    public int connectJob;
    public final PagerAnalyzer evictLayout;
    public int flushSample;
    public ScopeShard growPayload;
    public boolean injectMetric;
    public final RemoteDeserializer detachStream = new RemoteDeserializer();
    public boolean releaseHeader = true;
    public final ArrayList updateTimer = BorderLoop.injectMetric(null, 1, null);
    public int applyTask = -1;
    public int popBlueprint = -1;
    public int drawField = -1;

    /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
    public static final class ActivityMutator {
        public /* synthetic */ ActivityMutator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public ActivityMutator() {
        }
    }

    public KeyframeSteward(PagerAnalyzer pagerAnalyzer, ScopeShard scopeShard) {
        this.evictLayout = pagerAnalyzer;
        this.growPayload = scopeShard;
    }

    public static /* synthetic */ void packPackage(KeyframeSteward keyframeSteward, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        keyframeSteward.queryModel(z);
    }

    public static /* synthetic */ void storeCharset(KeyframeSteward keyframeSteward, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        keyframeSteward.injectConstraint(z);
    }

    public final void appendKey(Object obj, int i) {
        injectConstraint(true);
        this.growPayload.queryModel(obj, i);
    }

    public final void applyTask() {
        inflateEdge();
    }

    public final void attachCallback() {
        flattenPackage();
        this.growPayload.drawScope();
        this.clipOrigin += attachConfig().notifyMessage();
    }

    public final PointerEdge attachConfig() {
        return this.evictLayout.sortSnapshot();
    }

    public final void bindBody() {
        PointerEdge attachConfig;
        int purgeNode;
        if (attachConfig().decodePath() <= 0 || this.detachStream.clipOrigin(-2) == (purgeNode = (attachConfig = attachConfig()).purgeNode())) {
            return;
        }
        peekRevision();
        if (purgeNode > 0) {
            TouchEvaluator evictLayout = attachConfig.evictLayout(purgeNode);
            this.detachStream.updateTimer(purgeNode);
            connectJob(evictLayout);
        }
    }

    public final void cancelArchive(ColumnValve columnValve) {
        this.growPayload.flattenPackage(columnValve);
    }

    public final void clipOrigin(TouchRecord touchRecord, FrameHub frameHub) {
        this.growPayload.connectJob(touchRecord, frameHub);
    }

    public final void computeTarget(Object obj) {
        mergeLocale();
        this.growPayload.unlockMessage(obj);
    }

    public final void connectComponent() {
        this.injectMetric = false;
        this.detachStream.evictLayout();
        this.clipOrigin = 0;
        this.releaseHeader = true;
        this.flushSample = 0;
        BorderLoop.evictLayout(this.updateTimer);
        this.applyTask = -1;
        this.popBlueprint = -1;
        this.drawField = -1;
        this.connectJob = 0;
    }

    public final void connectJob(TouchEvaluator touchEvaluator) {
        storeCharset(this, false, 1, null);
        this.growPayload.notifyMessage(touchEvaluator);
        this.injectMetric = true;
    }

    public final boolean connectPatch() {
        return attachConfig().purgeNode() - this.clipOrigin < 0;
    }

    public final void decodePath(int i, int i2, int i3) {
        if (i3 > 0) {
            int i4 = this.connectJob;
            if (i4 > 0 && this.popBlueprint == i - i4 && this.drawField == i2 - i4) {
                this.connectJob = i4 + i3;
                return;
            }
            inflateEdge();
            this.popBlueprint = i;
            this.drawField = i2;
            this.connectJob = i3;
        }
    }

    public final void detachStream() {
        storeCharset(this, false, 1, null);
        this.growPayload.applyTask();
    }

    public final void dispatchTimezone() {
        syncScope();
        if (this.injectMetric) {
            groupArchive();
            drawField();
        }
    }

    public final void drawField() {
        if (this.injectMetric) {
            storeCharset(this, false, 1, null);
            storeCharset(this, false, 1, null);
            this.growPayload.peekRevision();
            this.injectMetric = false;
        }
    }

    public final void drawRequest(int i) {
        flattenPackage();
        this.growPayload.purgeNode(i);
    }

    public final void drawScope(int i) {
        this.clipOrigin += i - attachConfig().drawField();
    }

    public final void evictLayout(TouchEvaluator touchEvaluator, Object obj) {
        this.growPayload.clipOrigin(touchEvaluator, obj);
    }

    public final void expandArgs(int i) {
        this.clipOrigin = i;
    }

    public final void filterPayload(int i, int i2, int i3) {
        mergeLocale();
        this.growPayload.drawRequest(i, i2, i3);
    }

    public final void findTask() {
        inflateEdge();
        if (BorderLoop.clipOrigin(this.updateTimer)) {
            BorderLoop.applyTask(this.updateTimer);
        } else {
            this.flushSample++;
        }
    }

    public final void flattenPackage() {
        packPackage(this, false, 1, null);
        bindBody();
    }

    public final void flushSample() {
        int purgeNode = attachConfig().purgeNode();
        if (!(this.detachStream.clipOrigin(-1) <= purgeNode)) {
            MorphPatch.inflateAdapter("Missed recording an endGroup");
        }
        if (this.detachStream.clipOrigin(-1) == purgeNode) {
            storeCharset(this, false, 1, null);
            this.detachStream.flushSample();
            this.growPayload.peekRevision();
        }
    }

    public final void formatPosition(boolean z) {
        this.releaseHeader = z;
    }

    public final void gatherAdapter(Object obj) {
        inflateEdge();
        BorderLoop.popBlueprint(this.updateTimer, obj);
    }

    public final void groupArchive() {
        this.growPayload.syncScope();
    }

    public final void growPayload(List list, PrimaryFence primaryFence) {
        this.growPayload.flushSample(list, primaryFence);
    }

    public final void inflateAdapter(TouchEvaluator touchEvaluator, ComponentSender componentSender) {
        syncScope();
        flattenPackage();
        inflateEdge();
        this.growPayload.resetDelta(touchEvaluator, componentSender);
    }

    public final void inflateEdge() {
        int i = this.connectJob;
        if (i > 0) {
            int i2 = this.applyTask;
            if (i2 >= 0) {
                unlockMessage(i2, i);
                this.applyTask = -1;
            } else {
                filterPayload(this.drawField, this.popBlueprint, i);
                this.popBlueprint = -1;
                this.drawField = -1;
            }
            this.connectJob = 0;
        }
    }

    public final void injectConstraint(boolean z) {
        queryModel(z);
    }

    public final void injectField(Object obj, IconExporter iconExporter) {
        mergeLocale();
        this.growPayload.inflateEdge(obj, iconExporter);
    }

    public final void injectMetric(GroupBatch groupBatch, WorkerIndex workerIndex, InputChannel inputChannel, InputChannel inputChannel2) {
        this.growPayload.updateTimer(groupBatch, workerIndex, inputChannel, inputChannel2);
    }

    public final void mapJob(ColumnValve columnValve) {
        this.growPayload.decodePath(columnValve);
    }

    public final void mergeLocale() {
        syncScope();
    }

    public final boolean notifyMessage() {
        return this.releaseHeader;
    }

    public final void parseAsset(TimelineHeap timelineHeap) {
        this.growPayload.gatherAdapter(timelineHeap);
    }

    public final void peekRevision() {
        if (this.injectMetric || !this.releaseHeader) {
            return;
        }
        storeCharset(this, false, 1, null);
        this.growPayload.connectPatch();
        this.injectMetric = true;
    }

    public final void popBlueprint(ColumnValve columnValve) {
        this.growPayload.reduceScope(columnValve);
    }

    public final void prepareTask(int i, int i2) {
        if (i2 > 0) {
            if (!(i >= 0)) {
                MorphPatch.inflateAdapter("Invalid remove index " + i);
            }
            if (this.applyTask == i) {
                this.connectJob += i2;
                return;
            }
            inflateEdge();
            this.applyTask = i;
            this.connectJob = i2;
        }
    }

    public final void purgeNode(TouchEvaluator touchEvaluator, ComponentSender componentSender, WrapperRevision wrapperRevision) {
        syncScope();
        flattenPackage();
        inflateEdge();
        this.growPayload.inflateAdapter(touchEvaluator, componentSender, wrapperRevision);
    }

    public final void queryModel(boolean z) {
        int purgeNode = z ? attachConfig().purgeNode() : attachConfig().drawField();
        int i = purgeNode - this.clipOrigin;
        if (!(i >= 0)) {
            MorphPatch.inflateAdapter("Tried to seek backward");
        }
        if (i > 0) {
            this.growPayload.releaseHeader(i);
            this.clipOrigin = purgeNode;
        }
    }

    public final ScopeShard reduceScope() {
        return this.growPayload;
    }

    public final void releaseHeader(PrimaryFence primaryFence, TouchEvaluator touchEvaluator) {
        syncScope();
        this.growPayload.popBlueprint(primaryFence, touchEvaluator);
    }

    public final void resetDelta(ScopeShard scopeShard, PrimaryFence primaryFence) {
        this.growPayload.attachConfig(scopeShard, primaryFence);
    }

    public final void resetValue(Object obj, TouchEvaluator touchEvaluator, int i) {
        this.growPayload.storeCharset(obj, touchEvaluator, i);
    }

    public final void resolveDelta(int i) {
        if (i > 0) {
            flattenPackage();
            this.growPayload.injectConstraint(i);
        }
    }

    public final void resumeSignature(ElevationNode elevationNode) {
        this.growPayload.mergeLocale(elevationNode);
    }

    public final void serializeOffset() {
        syncScope();
        if (this.detachStream.growPayload == 0) {
            return;
        }
        MorphPatch.inflateAdapter("Missed recording an endGroup()");
    }

    public final void serializeTask(Object obj) {
        storeCharset(this, false, 1, null);
        this.growPayload.filterPayload(obj);
    }

    public final void startResource(ScopeShard scopeShard) {
        this.growPayload = scopeShard;
    }

    public final void syncScope() {
        int i = this.flushSample;
        if (i > 0) {
            this.growPayload.packPackage(i);
            this.flushSample = 0;
        }
        if (BorderLoop.clipOrigin(this.updateTimer)) {
            this.growPayload.drawField(BorderLoop.drawField(this.updateTimer));
            BorderLoop.evictLayout(this.updateTimer);
        }
    }

    public final void unlockMessage(int i, int i2) {
        mergeLocale();
        this.growPayload.expandArgs(i, i2);
    }

    public final void updateAction() {
        this.growPayload.findTask();
    }

    public final void updateTimer() {
        this.growPayload.serializeOffset();
        this.clipOrigin = 0;
    }
}
