package com.goldenboot.saga.zone;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0010\b\u0087@\u0018\u0000 ,2\u00020\u0001:\u0001-B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006H\u0087\n¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0006H\u0087\n¢\u0006\u0004\b\t\u0010\bJ!\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\n\u001a\u00020\u00062\b\b\u0002\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eH\u0087\b¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u000eH\u0087\b¢\u0006\u0004\b\u0011\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0000H\u0087\n¢\u0006\u0004\b\u0012\u0010\u0005J\u0018\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u0000H\u0087\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0018\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u0000H\u0087\u0002¢\u0006\u0004\b\u0016\u0010\u0015J\u0018\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u0006H\u0087\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0018\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u0006H\u0087\u0002¢\u0006\u0004\b\u001a\u0010\u0019J\u000f\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u001eHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010!\u001a\u00020\u000e2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b!\u0010\"R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u001b\u0010\n\u001a\u00020\u00068Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b(\u0010)\u001a\u0004\b'\u0010\bR\u001b\u0010\u000b\u001a\u00020\u00068Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b+\u0010)\u001a\u0004\b*\u0010\b\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006."}, d2 = {"Lcom/goldenboot/saga/zone/RowIndex;", "", "", "packedValue", "releaseHeader", "(J)J", "", "injectMetric", "(J)F", "detachStream", "x", "y", "clipOrigin", "(JFF)J", "", "attachConfig", "(J)Z", "connectPatch", "gatherAdapter", "other", "resetDelta", "(JJ)J", "inflateAdapter", "operand", "purgeNode", "(JF)J", "updateTimer", "", "drawRequest", "(J)Ljava/lang/String;", "", "hashCode", "()I", "equals", "(Ljava/lang/Object;)Z", "evictLayout", "J", "drawField", "()J", "peekRevision", "connectJob", "()V", "reduceScope", "serializeOffset", "growPayload", "ActivityMutator", "ui-geometry"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class RowIndex {

    /* renamed from: growPayload, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final long injectMetric = releaseHeader(0);

    /* renamed from: evictLayout, reason: from kotlin metadata */
    private final long packedValue;

    /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u0012\u0004\b\t\u0010\u0003\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lcom/goldenboot/saga/zone/RowIndex$ActivityMutator;", "", "<init>", "()V", "Lcom/goldenboot/saga/zone/RowIndex;", "Zero", "J", "evictLayout", "()J", "growPayload", "ui-geometry"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: com.goldenboot.saga.zone.RowIndex$ActivityMutator, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final long evictLayout() {
            return RowIndex.injectMetric;
        }

        private Companion() {
        }

        public static /* synthetic */ void growPayload() {
        }
    }

    private /* synthetic */ RowIndex(long j) {
        this.packedValue = j;
    }

    public static boolean applyTask(long j, Object obj) {
        return (obj instanceof RowIndex) && j == ((RowIndex) obj).getPackedValue();
    }

    public static final boolean attachConfig(long j) {
        long j2 = j & StreamSyncer.evictLayout;
        return (((~j2) & (j2 - StreamSyncer.flushSample)) & (-9223372034707292160L)) != 0;
    }

    public static final long clipOrigin(long j, float f, float f2) {
        return releaseHeader((Float.floatToRawIntBits(f) << 32) | (Float.floatToRawIntBits(f2) & 4294967295L));
    }

    public static final boolean connectPatch(long j) {
        return (j >>> 32) == (j & 4294967295L);
    }

    public static final float detachStream(long j) {
        return Float.intBitsToFloat((int) (j & 4294967295L));
    }

    public static String drawRequest(long j) {
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        if (Float.intBitsToFloat(i) == Float.intBitsToFloat(i2)) {
            return "CornerRadius.circular(" + DialogController.evictLayout(Float.intBitsToFloat(i), 1) + ')';
        }
        return "CornerRadius.elliptical(" + DialogController.evictLayout(Float.intBitsToFloat(i), 1) + ", " + DialogController.evictLayout(Float.intBitsToFloat(i2), 1) + ')';
    }

    public static /* synthetic */ long flushSample(long j, float f, float f2, int i, Object obj) {
        if ((i & 1) != 0) {
            f = Float.intBitsToFloat((int) (j >> 32));
        }
        if ((i & 2) != 0) {
            f2 = Float.intBitsToFloat((int) (4294967295L & j));
        }
        return clipOrigin(j, f, f2);
    }

    public static final long gatherAdapter(long j) {
        return releaseHeader(j ^ (-9223372034707292160L));
    }

    public static final /* synthetic */ RowIndex growPayload(long j) {
        return new RowIndex(j);
    }

    public static final long inflateAdapter(long j, long j2) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) + Float.intBitsToFloat((int) (j2 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L)) + Float.intBitsToFloat((int) (j2 & 4294967295L));
        return releaseHeader((Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L));
    }

    public static final float injectMetric(long j) {
        return Float.intBitsToFloat((int) (j >> 32));
    }

    public static int notifyMessage(long j) {
        return Long.hashCode(j);
    }

    public static final float peekRevision(long j) {
        return Float.intBitsToFloat((int) (j >> 32));
    }

    public static final boolean popBlueprint(long j, long j2) {
        return j == j2;
    }

    public static final long purgeNode(long j, float f) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) * f;
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L)) * f;
        return releaseHeader((Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L));
    }

    public static final float reduceScope(long j) {
        return Float.intBitsToFloat((int) (j & 4294967295L));
    }

    public static final long resetDelta(long j, long j2) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) - Float.intBitsToFloat((int) (j2 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L)) - Float.intBitsToFloat((int) (j2 & 4294967295L));
        return releaseHeader((Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L));
    }

    public static final long updateTimer(long j, float f) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) / f;
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L)) / f;
        return releaseHeader((Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L));
    }

    /* renamed from: decodePath, reason: from getter */
    public final /* synthetic */ long getPackedValue() {
        return this.packedValue;
    }

    public final long drawField() {
        return this.packedValue;
    }

    public boolean equals(Object other) {
        return applyTask(this.packedValue, other);
    }

    public int hashCode() {
        return notifyMessage(this.packedValue);
    }

    public String toString() {
        return drawRequest(this.packedValue);
    }

    public static /* synthetic */ void connectJob() {
    }

    public static /* synthetic */ void serializeOffset() {
    }

    public static long releaseHeader(long j) {
        return j;
    }
}
