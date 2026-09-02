package com.goldenboot.saga.zone;

import kotlin.Metadata;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0081@\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0012\u0010\u0015\u001a\u00020\t8Æ\u0002¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u000bR\u0012\u0010\u0017\u001a\u00020\t8Æ\u0002¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u000bR\u0012\u0010\u0019\u001a\u00020\t8Æ\u0002¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u000bR\u0012\u0010\u001b\u001a\u00020\t8Æ\u0002¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u000b\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006\u001c"}, d2 = {"Lcom/goldenboot/saga/zone/ConsumerValve;", "", "", "packedValue", "growPayload", "(J)J", "", "drawField", "(J)Ljava/lang/String;", "", "popBlueprint", "(J)I", "other", "", "injectMetric", "(JLjava/lang/Object;)Z", "evictLayout", "J", "flushSample", "()J", "clipOrigin", "left", "applyTask", "top", "updateTimer", "right", "releaseHeader", "bottom", "ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ConsumerValve {

    /* renamed from: evictLayout, reason: from kotlin metadata */
    private final long packedValue;

    private /* synthetic */ ConsumerValve(long j) {
        this.packedValue = j;
    }

    public static final int applyTask(long j) {
        return (int) ((j >>> 32) & 65535);
    }

    public static final int clipOrigin(long j) {
        return (int) ((j >>> 48) & 65535);
    }

    public static final boolean detachStream(long j, long j2) {
        return j == j2;
    }

    public static String drawField(long j) {
        return "ValueInsets(" + ((int) ((j >>> 48) & 65535)) + ", " + ((int) ((j >>> 32) & 65535)) + ", " + ((int) ((j >>> 16) & 65535)) + ", " + ((int) (j & 65535)) + ')';
    }

    public static final /* synthetic */ ConsumerValve evictLayout(long j) {
        return new ConsumerValve(j);
    }

    public static boolean injectMetric(long j, Object obj) {
        return (obj instanceof ConsumerValve) && j == ((ConsumerValve) obj).getPackedValue();
    }

    public static int popBlueprint(long j) {
        return Long.hashCode(j);
    }

    public static final int releaseHeader(long j) {
        return (int) (j & 65535);
    }

    public static final int updateTimer(long j) {
        return (int) ((j >>> 16) & 65535);
    }

    /* renamed from: connectJob, reason: from getter */
    public final /* synthetic */ long getPackedValue() {
        return this.packedValue;
    }

    public boolean equals(Object obj) {
        return injectMetric(this.packedValue, obj);
    }

    public final long flushSample() {
        return this.packedValue;
    }

    public int hashCode() {
        return popBlueprint(this.packedValue);
    }

    public String toString() {
        return drawField(this.packedValue);
    }

    public static long growPayload(long j) {
        return j;
    }
}
