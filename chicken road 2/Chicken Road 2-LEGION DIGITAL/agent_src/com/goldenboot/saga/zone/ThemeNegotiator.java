package com.goldenboot.saga.zone;

import kotlin.Metadata;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\t\b\u0081@\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0000H\u0086\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0019\u001a\u00020\u00168F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u001c\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u001e\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001b\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006\u001f"}, d2 = {"Lcom/goldenboot/saga/zone/ThemeNegotiator;", "", "", "packedValue", "injectMetric", "(J)J", "other", "", "growPayload", "(JJ)I", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "equals", "(Ljava/lang/Object;)Z", "evictLayout", "J", "flushSample", "()J", "", "clipOrigin", "(J)F", "distance", "popBlueprint", "(J)Z", "isInLayer", "applyTask", "isInExpandedBounds", "ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ThemeNegotiator {

    /* renamed from: evictLayout, reason: from kotlin metadata */
    private final long packedValue;

    private /* synthetic */ ThemeNegotiator(long j) {
        this.packedValue = j;
    }

    public static final boolean applyTask(long j) {
        return (j & 2) != 0;
    }

    public static final float clipOrigin(long j) {
        return Float.intBitsToFloat((int) (j >> 32));
    }

    public static boolean detachStream(long j, Object obj) {
        return (obj instanceof ThemeNegotiator) && j == ((ThemeNegotiator) obj).getPackedValue();
    }

    public static String drawField(long j) {
        return "DistanceAndFlags(packedValue=" + j + ')';
    }

    public static final /* synthetic */ ThemeNegotiator evictLayout(long j) {
        return new ThemeNegotiator(j);
    }

    public static final int growPayload(long j, long j2) {
        boolean popBlueprint = popBlueprint(j);
        if (popBlueprint != popBlueprint(j2)) {
            return popBlueprint ? -1 : 1;
        }
        return (Math.min(clipOrigin(j), clipOrigin(j2)) >= 0.0f && applyTask(j) != applyTask(j2)) ? applyTask(j) ? -1 : 1 : (int) Math.signum(clipOrigin(j) - clipOrigin(j2));
    }

    public static final boolean popBlueprint(long j) {
        return (j & 1) != 0;
    }

    public static final boolean releaseHeader(long j, long j2) {
        return j == j2;
    }

    public static int updateTimer(long j) {
        return Long.hashCode(j);
    }

    /* renamed from: connectJob, reason: from getter */
    public final /* synthetic */ long getPackedValue() {
        return this.packedValue;
    }

    public boolean equals(Object other) {
        return detachStream(this.packedValue, other);
    }

    public final long flushSample() {
        return this.packedValue;
    }

    public int hashCode() {
        return updateTimer(this.packedValue);
    }

    public String toString() {
        return drawField(this.packedValue);
    }

    public static long injectMetric(long j) {
        return j;
    }
}
