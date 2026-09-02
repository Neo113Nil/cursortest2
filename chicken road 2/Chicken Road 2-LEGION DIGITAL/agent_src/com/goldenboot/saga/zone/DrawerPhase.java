package com.goldenboot.saga.zone;

import androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator;
import androidx.compose.ui.layout.GradientActivator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
/* loaded from: classes.dex */
public final class DrawerPhase implements HapticHandler, ConsumerSanitizer {
    public final List applyTask;
    public int attachConfig;
    public final LabelCache clipOrigin;
    public final LazyLayoutItemAnimator connectJob;
    public final int connectPatch;
    public int decodePath;
    public final int detachStream;
    public final Object drawField;
    public long drawRequest;
    public boolean drawScope;
    public final int evictLayout;
    public final int flushSample;
    public int gatherAdapter;
    public final Object growPayload;
    public int inflateAdapter;
    public final boolean injectMetric;
    public final int notifyMessage;
    public final long peekRevision;
    public final long popBlueprint;
    public final long purgeNode;
    public final int reduceScope;
    public final boolean releaseHeader;
    public int resetDelta;
    public final int serializeOffset;
    public final int updateTimer;

    public /* synthetic */ DrawerPhase(int i, Object obj, boolean z, int i2, int i3, boolean z2, LabelCache labelCache, int i4, int i5, List list, long j, Object obj2, LazyLayoutItemAnimator lazyLayoutItemAnimator, long j2, int i6, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, obj, z, i2, i3, z2, labelCache, i4, i5, list, j, obj2, lazyLayoutItemAnimator, j2, i6, i7);
    }

    private final int attachConfig(androidx.compose.ui.layout.GradientActivator gradientActivator) {
        return updateTimer() ? gradientActivator.getHeight() : gradientActivator.getWidth();
    }

    private final int notifyMessage(long j) {
        return updateTimer() ? FontReporter.notifyMessage(j) : FontReporter.serializeOffset(j);
    }

    @Override // com.goldenboot.saga.zone.HapticHandler
    public long applyTask() {
        return this.purgeNode;
    }

    @Override // com.goldenboot.saga.zone.ConsumerSanitizer
    public Object clipOrigin(int i) {
        return ((androidx.compose.ui.layout.GradientActivator) this.applyTask.get(i)).unlockMessage();
    }

    @Override // com.goldenboot.saga.zone.HapticHandler
    public long connectJob() {
        return this.drawRequest;
    }

    public final int connectPatch() {
        return this.notifyMessage;
    }

    @Override // com.goldenboot.saga.zone.ConsumerSanitizer
    public int detachStream() {
        return this.connectPatch;
    }

    @Override // com.goldenboot.saga.zone.ConsumerSanitizer
    public int drawField() {
        return this.serializeOffset;
    }

    public final void drawRequest(int i) {
        this.attachConfig = i;
        this.inflateAdapter = i + this.updateTimer;
    }

    @Override // com.goldenboot.saga.zone.HapticHandler
    public int evictLayout() {
        return this.gatherAdapter;
    }

    @Override // com.goldenboot.saga.zone.ConsumerSanitizer
    public long flushSample() {
        return this.peekRevision;
    }

    @Override // com.goldenboot.saga.zone.HapticHandler, com.goldenboot.saga.zone.ConsumerSanitizer
    public int getIndex() {
        return this.evictLayout;
    }

    @Override // com.goldenboot.saga.zone.ConsumerSanitizer
    public Object getKey() {
        return this.growPayload;
    }

    @Override // com.goldenboot.saga.zone.ConsumerSanitizer
    public int growPayload() {
        return this.applyTask.size();
    }

    public final void inflateAdapter(GradientActivator.ActivityMutator activityMutator) {
        GradientActivator.ActivityMutator activityMutator2;
        int serializeOffset;
        int notifyMessage;
        if (this.attachConfig == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("position() should be called first");
        }
        int growPayload = growPayload();
        int i = 0;
        while (i < growPayload) {
            androidx.compose.ui.layout.GradientActivator gradientActivator = (androidx.compose.ui.layout.GradientActivator) this.applyTask.get(i);
            attachConfig(gradientActivator);
            long connectJob = connectJob();
            this.connectJob.detachStream(getKey(), i);
            if (this.releaseHeader) {
                if (updateTimer()) {
                    serializeOffset = FontReporter.serializeOffset(connectJob);
                } else {
                    serializeOffset = (this.attachConfig - FontReporter.serializeOffset(connectJob)) - attachConfig(gradientActivator);
                }
                if (updateTimer()) {
                    notifyMessage = (this.attachConfig - FontReporter.notifyMessage(connectJob)) - attachConfig(gradientActivator);
                } else {
                    notifyMessage = FontReporter.notifyMessage(connectJob);
                }
                connectJob = RegionListener.evictLayout(serializeOffset, notifyMessage);
            }
            long resetDelta = FontReporter.resetDelta(connectJob, this.popBlueprint);
            if (updateTimer()) {
                activityMutator2 = activityMutator;
                GradientActivator.ActivityMutator.attachVersion(activityMutator2, gradientActivator, resetDelta, 0.0f, null, 6, null);
            } else {
                activityMutator2 = activityMutator;
                GradientActivator.ActivityMutator.closeSource(activityMutator2, gradientActivator, resetDelta, 0.0f, null, 6, null);
            }
            i++;
            activityMutator = activityMutator2;
        }
    }

    @Override // com.goldenboot.saga.zone.ConsumerSanitizer
    public void injectMetric(boolean z) {
        this.drawScope = z;
    }

    @Override // com.goldenboot.saga.zone.HapticHandler
    public int peekRevision() {
        return this.decodePath;
    }

    @Override // com.goldenboot.saga.zone.ConsumerSanitizer
    public long popBlueprint(int i) {
        return connectJob();
    }

    public final void purgeNode(int i, int i2, int i3, int i4, int i5, int i6) {
        this.attachConfig = updateTimer() ? i4 : i3;
        if (!updateTimer()) {
            i3 = i4;
        }
        if (updateTimer() && this.clipOrigin == LabelCache.notifyMessage) {
            i2 = (i3 - i2) - this.detachStream;
        }
        this.drawRequest = updateTimer() ? RegionListener.evictLayout(i2, i) : RegionListener.evictLayout(i, i2);
        this.gatherAdapter = i5;
        this.decodePath = i6;
        this.resetDelta = -this.flushSample;
        this.inflateAdapter = this.attachConfig + this.updateTimer;
    }

    public final void reduceScope(int i) {
        if (resetDelta()) {
            return;
        }
        long connectJob = connectJob();
        int serializeOffset = updateTimer() ? FontReporter.serializeOffset(connectJob) : FontReporter.serializeOffset(connectJob) + i;
        boolean updateTimer = updateTimer();
        int notifyMessage = FontReporter.notifyMessage(connectJob);
        if (updateTimer) {
            notifyMessage += i;
        }
        this.drawRequest = RegionListener.evictLayout(serializeOffset, notifyMessage);
        int growPayload = growPayload();
        for (int i2 = 0; i2 < growPayload; i2++) {
            this.connectJob.detachStream(getKey(), i2);
        }
    }

    @Override // com.goldenboot.saga.zone.ConsumerSanitizer
    public int releaseHeader() {
        return this.reduceScope;
    }

    public boolean resetDelta() {
        return this.drawScope;
    }

    @Override // com.goldenboot.saga.zone.ConsumerSanitizer
    public void serializeOffset(int i, int i2, int i3, int i4) {
        purgeNode(i, i2, i3, i4, -1, -1);
    }

    @Override // com.goldenboot.saga.zone.ConsumerSanitizer
    public boolean updateTimer() {
        return this.injectMetric;
    }

    public DrawerPhase(int i, Object obj, boolean z, int i2, int i3, boolean z2, LabelCache labelCache, int i4, int i5, List list, long j, Object obj2, LazyLayoutItemAnimator lazyLayoutItemAnimator, long j2, int i6, int i7) {
        this.evictLayout = i;
        this.growPayload = obj;
        this.injectMetric = z;
        this.detachStream = i2;
        this.releaseHeader = z2;
        this.clipOrigin = labelCache;
        this.flushSample = i4;
        this.updateTimer = i5;
        this.applyTask = list;
        this.popBlueprint = j;
        this.drawField = obj2;
        this.connectJob = lazyLayoutItemAnimator;
        this.peekRevision = j2;
        this.serializeOffset = i6;
        this.reduceScope = i7;
        this.attachConfig = Integer.MIN_VALUE;
        int size = list.size();
        int i8 = 0;
        for (int i9 = 0; i9 < size; i9++) {
            androidx.compose.ui.layout.GradientActivator gradientActivator = (androidx.compose.ui.layout.GradientActivator) list.get(i9);
            i8 = Math.max(i8, updateTimer() ? gradientActivator.getHeight() : gradientActivator.getWidth());
        }
        this.notifyMessage = i8;
        this.connectPatch = CellEntry.releaseHeader(i3 + i8, 0);
        this.purgeNode = updateTimer() ? ProgressPatch.evictLayout(this.detachStream, i8) : ProgressPatch.evictLayout(i8, this.detachStream);
        this.drawRequest = FontReporter.INSTANCE.growPayload();
        this.gatherAdapter = -1;
        this.decodePath = -1;
    }
}
