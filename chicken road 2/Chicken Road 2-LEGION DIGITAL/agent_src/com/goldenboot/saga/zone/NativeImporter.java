package com.goldenboot.saga.zone;

import com.goldenboot.saga.zone.AlphaHeap;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\r\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000b¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\b¢\u0006\u0004\b\u0011\u0010\u0003R\u0014\u0010\u0014\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0013R\u0014\u0010\u0017\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0016R\"\u0010\u001d\u001a\u00020\u00068\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0019\u0010\r\"\u0004\b\u001b\u0010\u001cR\"\u0010 \u001a\u00020\u00048\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001a\u001a\u0004\b\u001e\u0010\r\"\u0004\b\u001f\u0010\u001c¨\u0006!"}, d2 = {"Lcom/goldenboot/saga/zone/NativeImporter;", "", "<init>", "()V", "", "timeMillis", "Lcom/goldenboot/saga/zone/RuntimeHeap;", "position", "Lcom/goldenboot/saga/zone/DpadBuilder;", "evictLayout", "(JJ)V", "Lcom/goldenboot/saga/zone/WaveExecutor;", "growPayload", "()J", "maximumVelocity", "injectMetric", "(J)J", "clipOrigin", "Lcom/goldenboot/saga/zone/AlphaHeap$ActivityMutator;", "Lcom/goldenboot/saga/zone/AlphaHeap$ActivityMutator;", "strategy", "Lcom/goldenboot/saga/zone/AlphaHeap;", "Lcom/goldenboot/saga/zone/AlphaHeap;", "xVelocityTracker", "yVelocityTracker", "detachStream", "J", "flushSample", "(J)V", "currentPointerPositionAccumulator", "releaseHeader", "updateTimer", "lastMoveEventTimeStamp", "ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class NativeImporter {
    public static final int clipOrigin = 8;

    /* renamed from: detachStream, reason: from kotlin metadata */
    private long currentPointerPositionAccumulator;

    /* renamed from: evictLayout, reason: from kotlin metadata */
    private final AlphaHeap.ActivityMutator strategy;

    /* renamed from: growPayload, reason: from kotlin metadata */
    private final AlphaHeap xVelocityTracker;

    /* renamed from: injectMetric, reason: from kotlin metadata */
    private final AlphaHeap yVelocityTracker;

    /* renamed from: releaseHeader, reason: from kotlin metadata */
    private long lastMoveEventTimeStamp;

    public NativeImporter() {
        AlphaHeap.ActivityMutator activityMutator = InternalWork.peekRevision() ? AlphaHeap.ActivityMutator.notifyMessage : AlphaHeap.ActivityMutator.reduceScope;
        this.strategy = activityMutator;
        boolean z = false;
        int i = 1;
        DefaultConstructorMarker defaultConstructorMarker = null;
        this.xVelocityTracker = new AlphaHeap(z, activityMutator, i, defaultConstructorMarker);
        this.yVelocityTracker = new AlphaHeap(z, activityMutator, i, defaultConstructorMarker);
        this.currentPointerPositionAccumulator = RuntimeHeap.INSTANCE.releaseHeader();
    }

    public final void clipOrigin() {
        this.xVelocityTracker.clipOrigin();
        this.yVelocityTracker.clipOrigin();
        this.lastMoveEventTimeStamp = 0L;
    }

    /* renamed from: detachStream, reason: from getter */
    public final long getCurrentPointerPositionAccumulator() {
        return this.currentPointerPositionAccumulator;
    }

    public final void evictLayout(long timeMillis, long position) {
        this.xVelocityTracker.evictLayout(timeMillis, Float.intBitsToFloat((int) (position >> 32)));
        this.yVelocityTracker.evictLayout(timeMillis, Float.intBitsToFloat((int) (position & 4294967295L)));
    }

    public final void flushSample(long j) {
        this.currentPointerPositionAccumulator = j;
    }

    public final long growPayload() {
        return injectMetric(InputChunk.evictLayout(Float.MAX_VALUE, Float.MAX_VALUE));
    }

    public final long injectMetric(long maximumVelocity) {
        if (!(WaveExecutor.connectJob(maximumVelocity) > 0.0f && WaveExecutor.serializeOffset(maximumVelocity) > 0.0f)) {
            PagerBridge.applyTask("maximumVelocity should be a positive value. You specified=" + ((Object) WaveExecutor.inflateAdapter(maximumVelocity)));
        }
        return InputChunk.evictLayout(this.xVelocityTracker.detachStream(WaveExecutor.connectJob(maximumVelocity)), this.yVelocityTracker.detachStream(WaveExecutor.serializeOffset(maximumVelocity)));
    }

    /* renamed from: releaseHeader, reason: from getter */
    public final long getLastMoveEventTimeStamp() {
        return this.lastMoveEventTimeStamp;
    }

    public final void updateTimer(long j) {
        this.lastMoveEventTimeStamp = j;
    }
}
