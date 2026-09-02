package com.goldenboot.saga.zone;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087@\u0018\u0000 \"2\u00020\u0001:\u0001#B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J!\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\f\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u0000H\u0087\u0002¢\u0006\u0004\b\f\u0010\rJ\u0018\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u0000H\u0087\u0002¢\u0006\u0004\b\u000e\u0010\rJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0017¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0007\u001a\u00020\u00068FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001c\u0010\u001dR\u001a\u0010\b\u001a\u00020\u00068FX\u0087\u0004¢\u0006\f\u0012\u0004\b!\u0010\u001f\u001a\u0004\b \u0010\u001d\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006$"}, d2 = {"Lcom/goldenboot/saga/zone/CorePump;", "", "", "packedValue", "detachStream", "(J)J", "Lcom/goldenboot/saga/zone/InsetsEdge;", "x", "y", "releaseHeader", "(JFF)J", "other", "reduceScope", "(JJ)J", "notifyMessage", "", "connectPatch", "(J)Ljava/lang/String;", "", "hashCode", "()I", "", "equals", "(Ljava/lang/Object;)Z", "evictLayout", "J", "applyTask", "()J", "popBlueprint", "(J)F", "drawField", "()V", "connectJob", "peekRevision", "growPayload", "ActivityMutator", "ui-unit"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class CorePump {

    /* renamed from: evictLayout, reason: from kotlin metadata */
    private final long packedValue;

    /* renamed from: growPayload, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final long injectMetric = detachStream(0);
    private static final long detachStream = detachStream(StreamSyncer.detachStream);

    /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\b¨\u0006\u000b"}, d2 = {"Lcom/goldenboot/saga/zone/CorePump$ActivityMutator;", "", "<init>", "()V", "Lcom/goldenboot/saga/zone/CorePump;", "Zero", "J", "growPayload", "()J", "Unspecified", "evictLayout", "ui-unit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: com.goldenboot.saga.zone.CorePump$ActivityMutator, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final long evictLayout() {
            return CorePump.detachStream;
        }

        public final long growPayload() {
            return CorePump.injectMetric;
        }

        private Companion() {
        }
    }

    private /* synthetic */ CorePump(long j) {
        this.packedValue = j;
    }

    public static /* synthetic */ long clipOrigin(long j, float f, float f2, int i, Object obj) {
        if ((i & 1) != 0) {
            f = popBlueprint(j);
        }
        if ((i & 2) != 0) {
            f2 = connectJob(j);
        }
        return releaseHeader(j, f, f2);
    }

    public static final float connectJob(long j) {
        return InsetsEdge.drawField(Float.intBitsToFloat((int) (j & 4294967295L)));
    }

    public static String connectPatch(long j) {
        if (j == StreamSyncer.detachStream) {
            return "DpOffset.Unspecified";
        }
        return '(' + ((Object) InsetsEdge.gatherAdapter(popBlueprint(j))) + ", " + ((Object) InsetsEdge.gatherAdapter(connectJob(j))) + ')';
    }

    public static boolean flushSample(long j, Object obj) {
        return (obj instanceof CorePump) && j == ((CorePump) obj).attachConfig();
    }

    public static final /* synthetic */ CorePump injectMetric(long j) {
        return new CorePump(j);
    }

    public static final long notifyMessage(long j, long j2) {
        float drawField = InsetsEdge.drawField(popBlueprint(j) + popBlueprint(j2));
        float drawField2 = InsetsEdge.drawField(connectJob(j) + connectJob(j2));
        return detachStream((Float.floatToRawIntBits(drawField) << 32) | (4294967295L & Float.floatToRawIntBits(drawField2)));
    }

    public static final float popBlueprint(long j) {
        return InsetsEdge.drawField(Float.intBitsToFloat((int) (j >> 32)));
    }

    public static final long reduceScope(long j, long j2) {
        float drawField = InsetsEdge.drawField(popBlueprint(j) - popBlueprint(j2));
        float drawField2 = InsetsEdge.drawField(connectJob(j) - connectJob(j2));
        return detachStream((Float.floatToRawIntBits(drawField) << 32) | (4294967295L & Float.floatToRawIntBits(drawField2)));
    }

    public static final long releaseHeader(long j, float f, float f2) {
        return detachStream((Float.floatToRawIntBits(f) << 32) | (Float.floatToRawIntBits(f2) & 4294967295L));
    }

    public static int serializeOffset(long j) {
        return Long.hashCode(j);
    }

    public static final boolean updateTimer(long j, long j2) {
        return j == j2;
    }

    /* renamed from: applyTask, reason: from getter */
    public final long getPackedValue() {
        return this.packedValue;
    }

    public final /* synthetic */ long attachConfig() {
        return this.packedValue;
    }

    public boolean equals(Object other) {
        return flushSample(this.packedValue, other);
    }

    public int hashCode() {
        return serializeOffset(this.packedValue);
    }

    public String toString() {
        return connectPatch(this.packedValue);
    }

    public static /* synthetic */ void drawField() {
    }

    public static /* synthetic */ void peekRevision() {
    }

    public static long detachStream(long j) {
        return j;
    }
}
