package com.goldenboot.saga.zone;

import kotlin.Metadata;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0081\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\u0018\u001a\u0004\b\u0019\u0010\t\"\u0004\b\u001a\u0010\u001bR\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u001c\u001a\u0004\b\u001d\u0010\u000b\"\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Lcom/goldenboot/saga/zone/DoubleTapRecovery;", "", "", "time", "", "dataPoint", "<init>", "(JF)V", "evictLayout", "()J", "growPayload", "()F", "injectMetric", "(JF)Lcom/goldenboot/saga/zone/DoubleTapRecovery;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "clipOrigin", "updateTimer", "(J)V", "F", "releaseHeader", "flushSample", "(F)V", "ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: com.goldenboot.saga.zone.DoubleTapRecovery, reason: from toString */
/* loaded from: classes.dex */
public final /* data */ class DataPointAtTime {
    public static final int injectMetric = 8;

    /* renamed from: evictLayout, reason: from kotlin metadata and from toString */
    private long time;

    /* renamed from: growPayload, reason: from kotlin metadata and from toString */
    private float dataPoint;

    public DataPointAtTime(long j, float f) {
        this.time = j;
        this.dataPoint = f;
    }

    public static /* synthetic */ DataPointAtTime detachStream(DataPointAtTime dataPointAtTime, long j, float f, int i, Object obj) {
        if ((i & 1) != 0) {
            j = dataPointAtTime.time;
        }
        if ((i & 2) != 0) {
            f = dataPointAtTime.dataPoint;
        }
        return dataPointAtTime.injectMetric(j, f);
    }

    /* renamed from: clipOrigin, reason: from getter */
    public final long getTime() {
        return this.time;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DataPointAtTime)) {
            return false;
        }
        DataPointAtTime dataPointAtTime = (DataPointAtTime) other;
        return this.time == dataPointAtTime.time && Float.compare(this.dataPoint, dataPointAtTime.dataPoint) == 0;
    }

    public final long evictLayout() {
        return this.time;
    }

    public final void flushSample(float f) {
        this.dataPoint = f;
    }

    /* renamed from: growPayload, reason: from getter */
    public final float getDataPoint() {
        return this.dataPoint;
    }

    public int hashCode() {
        return (Long.hashCode(this.time) * 31) + Float.hashCode(this.dataPoint);
    }

    public final DataPointAtTime injectMetric(long time, float dataPoint) {
        return new DataPointAtTime(time, dataPoint);
    }

    public final float releaseHeader() {
        return this.dataPoint;
    }

    public String toString() {
        return "DataPointAtTime(time=" + this.time + ", dataPoint=" + this.dataPoint + ')';
    }

    public final void updateTimer(long j) {
        this.time = j;
    }
}
