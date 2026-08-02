package okio;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0011\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u000bH\u0002¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\u000f\u001a\u00020\u000e8\u0007¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0014\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0013R\u0014\u0010\f\u001a\u00020\u000e8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0010R\"\u0010\u0017\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u000b0\u00168\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0011\u0010\u001a\u001a\u00020\u000e8G¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0012"}, d2 = {"Lokio/SegmentPool;", "", "<init>", "()V", "Lokio/Segment;", "take", "()Lokio/Segment;", com.datadog.android.sessionreplay.internal.net.SegmentRequestBodyFactory.SEGMENT_DATA_FORM_KEY, "", "recycle", "(Lokio/Segment;)V", "Ljava/util/concurrent/atomic/AtomicReference;", "Camera2StreamConfigurationMap", "()Ljava/util/concurrent/atomic/AtomicReference;", "", "MAX_SIZE", com.visa.cbp.getEncExpo.warmup, "getMAX_SIZE", "()I", "Lokio/Segment;", "getHighSpeedVideoFpsRanges", "getHighSpeedVideoFpsRangesFor", "", "getHighSpeedVideoSizes", "[Ljava/util/concurrent/atomic/AtomicReference;", "getByteCount", "byteCount"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SegmentPool {

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private static final int Camera2StreamConfigurationMap;
    private static final java.util.concurrent.atomic.AtomicReference<okio.Segment>[] getHighSpeedVideoSizes;
    public static final okio.SegmentPool INSTANCE = new okio.SegmentPool();
    private static final int MAX_SIZE = 65536;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private static final okio.Segment getHighSpeedVideoFpsRanges = new okio.Segment(new byte[0], 0, 0, false, false);

    private SegmentPool() {
    }

    static {
        int highestOneBit = java.lang.Integer.highestOneBit((java.lang.Runtime.getRuntime().availableProcessors() * 2) - 1);
        Camera2StreamConfigurationMap = highestOneBit;
        java.util.concurrent.atomic.AtomicReference<okio.Segment>[] atomicReferenceArr = new java.util.concurrent.atomic.AtomicReference[highestOneBit];
        for (int i = 0; i < highestOneBit; i++) {
            atomicReferenceArr[i] = new java.util.concurrent.atomic.AtomicReference<>();
        }
        getHighSpeedVideoSizes = atomicReferenceArr;
    }

    public final int getMAX_SIZE() {
        return MAX_SIZE;
    }

    public final int getByteCount() {
        okio.Segment segment = Camera2StreamConfigurationMap().get();
        if (segment == null) {
            return 0;
        }
        return segment.limit;
    }

    @kotlin.jvm.JvmStatic
    public static final okio.Segment take() {
        java.util.concurrent.atomic.AtomicReference<okio.Segment> Camera2StreamConfigurationMap2 = Camera2StreamConfigurationMap();
        okio.Segment segment = getHighSpeedVideoFpsRanges;
        okio.Segment andSet = Camera2StreamConfigurationMap2.getAndSet(segment);
        if (andSet == segment) {
            return new okio.Segment();
        }
        if (andSet == null) {
            Camera2StreamConfigurationMap2.set(null);
            return new okio.Segment();
        }
        Camera2StreamConfigurationMap2.set(andSet.next);
        andSet.next = null;
        andSet.limit = 0;
        return andSet;
    }

    @kotlin.jvm.JvmStatic
    public static final void recycle(okio.Segment segment) {
        java.util.concurrent.atomic.AtomicReference<okio.Segment> Camera2StreamConfigurationMap2;
        okio.Segment segment2;
        okio.Segment andSet;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(segment, "");
        if (segment.next != null || segment.prev != null) {
            throw new java.lang.IllegalArgumentException("Failed requirement.".toString());
        }
        if (segment.shared || (andSet = (Camera2StreamConfigurationMap2 = Camera2StreamConfigurationMap()).getAndSet((segment2 = getHighSpeedVideoFpsRanges))) == segment2) {
            return;
        }
        int i = andSet != null ? andSet.limit : 0;
        if (i >= MAX_SIZE) {
            Camera2StreamConfigurationMap2.set(andSet);
            return;
        }
        segment.next = andSet;
        segment.pos = 0;
        segment.limit = i + 8192;
        Camera2StreamConfigurationMap2.set(segment);
    }

    private static java.util.concurrent.atomic.AtomicReference<okio.Segment> Camera2StreamConfigurationMap() {
        return getHighSpeedVideoSizes[(int) (java.lang.Thread.currentThread().getId() & (Camera2StreamConfigurationMap - 1))];
    }
}
