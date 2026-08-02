package kotlinx.io;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\u000f\u001a\u00020\u000e8\u0007¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0013\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u00020\u000e8\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0010\u001a\u0004\b\u0016\u0010\u0012R\u0014\u0010\u0018\u001a\u00020\u000e8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0010R\u0014\u0010\u0017\u001a\u00020\u00198\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001c\u001a\u00020\u000e8\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u0010\u001a\u0004\b\u001d\u0010\u0012R\u0014\u0010\u001e\u001a\u00020\u000e8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0010R\u001c\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u001f8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010 R\u001c\u0010\"\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u001f8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b!\u0010 R\u0011\u0010$\u001a\u00020\u000e8G¢\u0006\u0006\u001a\u0004\b#\u0010\u0012"}, d2 = {"Lkotlinx/io/SegmentPool;", "", "<init>", "()V", "Lkotlinx/io/Segment;", "take", "()Lkotlinx/io/Segment;", com.datadog.android.sessionreplay.internal.net.SegmentRequestBodyFactory.SEGMENT_DATA_FORM_KEY, "", "recycle", "(Lkotlinx/io/Segment;)V", "Lkotlinx/io/SegmentCopyTracker;", "tracker", "()Lkotlinx/io/SegmentCopyTracker;", "", "MAX_SIZE", com.visa.cbp.getEncExpo.warmup, "getMAX_SIZE", "()I", "getHighSpeedVideoFpsRangesFor", "Lkotlinx/io/Segment;", "HASH_BUCKET_COUNT", "getHASH_BUCKET_COUNT$kotlinx_io_core", "Camera2StreamConfigurationMap", "getHighSpeedVideoFpsRanges", "", "getHighSpeedVideoSizes", "Ljava/lang/String;", "SECOND_LEVEL_POOL_TOTAL_SIZE", "getSECOND_LEVEL_POOL_TOTAL_SIZE$kotlinx_io_core", "getHighResolutionOutputSizeshNQ4ISI", "Ljava/util/concurrent/atomic/AtomicReferenceArray;", "Ljava/util/concurrent/atomic/AtomicReferenceArray;", "getOutputFormats", "getInputSizeshNQ4ISI", "getByteCount", "byteCount"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class SegmentPool {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private static final int getHighSpeedVideoFpsRanges;
    private static final int HASH_BUCKET_COUNT;
    private static final int SECOND_LEVEL_POOL_TOTAL_SIZE;
    private static final int getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private static final java.util.concurrent.atomic.AtomicReferenceArray<kotlinx.io.Segment> getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private static final java.lang.String Camera2StreamConfigurationMap;

    /* renamed from: getOutputFormats, reason: from kotlin metadata */
    private static final java.util.concurrent.atomic.AtomicReferenceArray<kotlinx.io.Segment> getInputSizeshNQ4ISI;
    public static final kotlinx.io.SegmentPool INSTANCE = new kotlinx.io.SegmentPool();
    private static final int MAX_SIZE = 65536;
    private static final kotlinx.io.Segment getHighSpeedVideoFpsRangesFor = kotlinx.io.Segment.INSTANCE.new$kotlinx_io_core(new byte[0], 0, 0, null, false);

    private SegmentPool() {
    }

    static {
        int highestOneBit = java.lang.Integer.highestOneBit((java.lang.Runtime.getRuntime().availableProcessors() * 2) - 1);
        HASH_BUCKET_COUNT = highestOneBit;
        int coerceAtLeast = kotlin.ranges.RangesKt.coerceAtLeast(highestOneBit / 2, 1);
        getHighSpeedVideoFpsRanges = coerceAtLeast;
        java.lang.String str = kotlin.jvm.internal.Intrinsics.areEqual(java.lang.System.getProperty("java.vm.name"), "Dalvik") ? "0" : "4194304";
        Camera2StreamConfigurationMap = str;
        java.lang.String property = java.lang.System.getProperty("kotlinx.io.pool.size.bytes", str);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(property, "");
        java.lang.Integer intOrNull = kotlin.text.StringsKt.toIntOrNull(property);
        int coerceAtLeast2 = intOrNull != null ? kotlin.ranges.RangesKt.coerceAtLeast(intOrNull.intValue(), 0) : 0;
        SECOND_LEVEL_POOL_TOTAL_SIZE = coerceAtLeast2;
        getHighResolutionOutputSizeshNQ4ISI = kotlin.ranges.RangesKt.coerceAtLeast(coerceAtLeast2 / coerceAtLeast, 8192);
        getHighSpeedVideoSizes = new java.util.concurrent.atomic.AtomicReferenceArray<>(highestOneBit);
        getInputSizeshNQ4ISI = new java.util.concurrent.atomic.AtomicReferenceArray<>(coerceAtLeast);
    }

    public final int getMAX_SIZE() {
        return MAX_SIZE;
    }

    public final int getHASH_BUCKET_COUNT$kotlinx_io_core() {
        return HASH_BUCKET_COUNT;
    }

    public final int getSECOND_LEVEL_POOL_TOTAL_SIZE$kotlinx_io_core() {
        return SECOND_LEVEL_POOL_TOTAL_SIZE;
    }

    public final int getByteCount() {
        kotlinx.io.Segment segment = getHighSpeedVideoSizes.get((int) ((HASH_BUCKET_COUNT - 1) & java.lang.Thread.currentThread().getId()));
        if (segment == null) {
            return 0;
        }
        return segment.getLimit();
    }

    @kotlin.jvm.JvmStatic
    public static final kotlinx.io.Segment take() {
        kotlinx.io.Segment segment;
        kotlinx.io.Segment andSet;
        java.util.concurrent.atomic.AtomicReferenceArray<kotlinx.io.Segment> atomicReferenceArray = getHighSpeedVideoSizes;
        int id = (int) ((HASH_BUCKET_COUNT - 1) & java.lang.Thread.currentThread().getId());
        do {
            segment = getHighSpeedVideoFpsRangesFor;
            andSet = atomicReferenceArray.getAndSet(id, segment);
        } while (kotlin.jvm.internal.Intrinsics.areEqual(andSet, segment));
        if (andSet == null) {
            atomicReferenceArray.set(id, null);
            if (SECOND_LEVEL_POOL_TOTAL_SIZE <= 0) {
                return kotlinx.io.Segment.INSTANCE.new$kotlinx_io_core();
            }
            java.util.concurrent.atomic.AtomicReferenceArray<kotlinx.io.Segment> atomicReferenceArray2 = getInputSizeshNQ4ISI;
            int id2 = (int) (java.lang.Thread.currentThread().getId() & (getHighSpeedVideoFpsRanges - 1));
            int i = 0;
            while (true) {
                kotlinx.io.Segment segment2 = getHighSpeedVideoFpsRangesFor;
                kotlinx.io.Segment andSet2 = atomicReferenceArray2.getAndSet(id2, segment2);
                if (!kotlin.jvm.internal.Intrinsics.areEqual(andSet2, segment2)) {
                    if (andSet2 == null) {
                        atomicReferenceArray2.set(id2, null);
                        int i2 = getHighSpeedVideoFpsRanges;
                        if (i >= i2) {
                            return kotlinx.io.Segment.INSTANCE.new$kotlinx_io_core();
                        }
                        id2 = (id2 + 1) & (i2 - 1);
                        i++;
                    } else {
                        atomicReferenceArray2.set(id2, andSet2.getNext());
                        andSet2.setNext(null);
                        andSet2.setLimit(0);
                        return andSet2;
                    }
                }
            }
        } else {
            atomicReferenceArray.set(id, andSet.getNext());
            andSet.setNext(null);
            andSet.setLimit(0);
            return andSet;
        }
    }

    @kotlin.jvm.JvmStatic
    public static final void recycle(kotlinx.io.Segment segment) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(segment, "");
        if (segment.getNext() != null || segment.getPrev() != null) {
            throw new java.lang.IllegalArgumentException("Failed requirement.".toString());
        }
        kotlinx.io.SegmentCopyTracker copyTracker = segment.getCopyTracker();
        if (copyTracker != null && copyTracker.removeCopy()) {
            return;
        }
        java.util.concurrent.atomic.AtomicReferenceArray<kotlinx.io.Segment> atomicReferenceArray = getHighSpeedVideoSizes;
        int id = (int) ((HASH_BUCKET_COUNT - 1) & java.lang.Thread.currentThread().getId());
        segment.setPos(0);
        segment.owner = true;
        while (true) {
            kotlinx.io.Segment segment2 = atomicReferenceArray.get(id);
            if (segment2 != getHighSpeedVideoFpsRangesFor) {
                int limit = segment2 != null ? segment2.getLimit() : 0;
                if (limit >= MAX_SIZE) {
                    if (SECOND_LEVEL_POOL_TOTAL_SIZE <= 0) {
                        return;
                    }
                    segment.setPos(0);
                    segment.owner = true;
                    int id2 = (int) ((getHighSpeedVideoFpsRanges - 1) & java.lang.Thread.currentThread().getId());
                    java.util.concurrent.atomic.AtomicReferenceArray<kotlinx.io.Segment> atomicReferenceArray2 = getInputSizeshNQ4ISI;
                    int i = 0;
                    while (true) {
                        kotlinx.io.Segment segment3 = atomicReferenceArray2.get(id2);
                        if (segment3 != getHighSpeedVideoFpsRangesFor) {
                            int limit2 = (segment3 != null ? segment3.getLimit() : 0) + 8192;
                            if (limit2 > getHighResolutionOutputSizeshNQ4ISI) {
                                int i2 = getHighSpeedVideoFpsRanges;
                                if (i >= i2) {
                                    return;
                                }
                                i++;
                                id2 = (id2 + 1) & (i2 - 1);
                            } else {
                                segment.setNext(segment3);
                                segment.setLimit(limit2);
                                if (com.datadog.trace.api.cache.RadixTreeCache$$ExternalSyntheticBackportWithForwarding0.m(atomicReferenceArray2, id2, segment3, segment)) {
                                    return;
                                }
                            }
                        }
                    }
                } else {
                    segment.setNext(segment2);
                    segment.setLimit(limit + 8192);
                    if (com.datadog.trace.api.cache.RadixTreeCache$$ExternalSyntheticBackportWithForwarding0.m(atomicReferenceArray, id, segment2, segment)) {
                        return;
                    }
                }
            }
        }
    }

    @kotlin.jvm.JvmStatic
    public static final kotlinx.io.SegmentCopyTracker tracker() {
        return new kotlinx.io.RefCountingCopyTracker();
    }
}
