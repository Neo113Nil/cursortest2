package kotlinx.io;

/* compiled from: SegmentPool.kt */
@kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0017\u001a\u00020\tH\u0007J\b\u0010\u0018\u001a\u00020\tH\u0003J\u0010\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\tH\u0007J\u0010\u0010\u001c\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\tH\u0003J\b\u0010\u001d\u001a\u00020\u001eH\u0007J\b\u0010\u001f\u001a\u00020\u0005H\u0002J\b\u0010 \u001a\u00020\u0005H\u0002J\u0010\u0010!\u001a\u00020\u00052\u0006\u0010\"\u001a\u00020#H\u0002R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u00020\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0007R\u000e\u0010\f\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\u00020\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0007R\u000e\u0010\u0011\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0015\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0007¨\u0006$"}, d2 = {"Lkotlinx/io/SegmentPool;", "", "<init>", "()V", "MAX_SIZE", "", "getMAX_SIZE", "()I", "LOCK", "Lkotlinx/io/Segment;", "HASH_BUCKET_COUNT", "getHASH_BUCKET_COUNT$kotlinx_io_core", "HASH_BUCKET_COUNT_L2", "DEFAULT_SECOND_LEVEL_POOL_TOTAL_SIZE", "", "SECOND_LEVEL_POOL_TOTAL_SIZE", "getSECOND_LEVEL_POOL_TOTAL_SIZE$kotlinx_io_core", "SECOND_LEVEL_POOL_BUCKET_SIZE", "hashBuckets", "Ljava/util/concurrent/atomic/AtomicReferenceArray;", "hashBucketsL2", "byteCount", "getByteCount", "take", "takeL2", "recycle", "", com.ironsource.D1.i, "recycleL2", "tracker", "Lkotlinx/io/SegmentCopyTracker;", "l1BucketId", "l2BucketId", "bucketId", "mask", "", "kotlinx-io-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class SegmentPool {
    private static final java.lang.String DEFAULT_SECOND_LEVEL_POOL_TOTAL_SIZE;
    private static final int HASH_BUCKET_COUNT;
    private static final int HASH_BUCKET_COUNT_L2;
    private static final int SECOND_LEVEL_POOL_BUCKET_SIZE;
    private static final int SECOND_LEVEL_POOL_TOTAL_SIZE;
    private static final java.util.concurrent.atomic.AtomicReferenceArray<kotlinx.io.Segment> hashBuckets;
    private static final java.util.concurrent.atomic.AtomicReferenceArray<kotlinx.io.Segment> hashBucketsL2;
    public static final kotlinx.io.SegmentPool INSTANCE = new kotlinx.io.SegmentPool();
    private static final int MAX_SIZE = 65536;
    private static final kotlinx.io.Segment LOCK = kotlinx.io.Segment.INSTANCE.new$kotlinx_io_core(new byte[0], 0, 0, null, false);

    private SegmentPool() {
    }

    static {
        int highestOneBit = java.lang.Integer.highestOneBit((java.lang.Runtime.getRuntime().availableProcessors() * 2) - 1);
        HASH_BUCKET_COUNT = highestOneBit;
        int coerceAtLeast = kotlin.ranges.RangesKt.coerceAtLeast(highestOneBit / 2, 1);
        HASH_BUCKET_COUNT_L2 = coerceAtLeast;
        java.lang.String str = kotlin.jvm.internal.Intrinsics.areEqual(java.lang.System.getProperty("java.vm.name"), "Dalvik") ? "0" : "4194304";
        DEFAULT_SECOND_LEVEL_POOL_TOTAL_SIZE = str;
        java.lang.String property = java.lang.System.getProperty("kotlinx.io.pool.size.bytes", str);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(property, "getProperty(...)");
        java.lang.Integer intOrNull = kotlin.text.StringsKt.toIntOrNull(property);
        int coerceAtLeast2 = intOrNull != null ? kotlin.ranges.RangesKt.coerceAtLeast(intOrNull.intValue(), 0) : 0;
        SECOND_LEVEL_POOL_TOTAL_SIZE = coerceAtLeast2;
        SECOND_LEVEL_POOL_BUCKET_SIZE = kotlin.ranges.RangesKt.coerceAtLeast(coerceAtLeast2 / coerceAtLeast, 8192);
        hashBuckets = new java.util.concurrent.atomic.AtomicReferenceArray<>(highestOneBit);
        hashBucketsL2 = new java.util.concurrent.atomic.AtomicReferenceArray<>(coerceAtLeast);
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
        kotlinx.io.Segment segment = hashBuckets.get(l1BucketId());
        if (segment == null) {
            return 0;
        }
        return segment.getLimit();
    }

    @kotlin.jvm.JvmStatic
    public static final kotlinx.io.Segment take() {
        kotlinx.io.Segment segment;
        kotlinx.io.Segment andSet;
        java.util.concurrent.atomic.AtomicReferenceArray<kotlinx.io.Segment> atomicReferenceArray = hashBuckets;
        int l1BucketId = INSTANCE.l1BucketId();
        do {
            segment = LOCK;
            andSet = atomicReferenceArray.getAndSet(l1BucketId, segment);
        } while (kotlin.jvm.internal.Intrinsics.areEqual(andSet, segment));
        if (andSet == null) {
            atomicReferenceArray.set(l1BucketId, null);
            if (SECOND_LEVEL_POOL_TOTAL_SIZE > 0) {
                return takeL2();
            }
            return kotlinx.io.Segment.INSTANCE.new$kotlinx_io_core();
        }
        atomicReferenceArray.set(l1BucketId, andSet.getNext());
        andSet.setNext(null);
        andSet.setLimit(0);
        return andSet;
    }

    @kotlin.jvm.JvmStatic
    private static final kotlinx.io.Segment takeL2() {
        java.util.concurrent.atomic.AtomicReferenceArray<kotlinx.io.Segment> atomicReferenceArray = hashBucketsL2;
        int l2BucketId = INSTANCE.l2BucketId();
        int i = 0;
        while (true) {
            kotlinx.io.Segment segment = LOCK;
            kotlinx.io.Segment andSet = atomicReferenceArray.getAndSet(l2BucketId, segment);
            if (!kotlin.jvm.internal.Intrinsics.areEqual(andSet, segment)) {
                if (andSet == null) {
                    atomicReferenceArray.set(l2BucketId, null);
                    int i2 = HASH_BUCKET_COUNT_L2;
                    if (i >= i2) {
                        return kotlinx.io.Segment.INSTANCE.new$kotlinx_io_core();
                    }
                    l2BucketId = (l2BucketId + 1) & (i2 - 1);
                    i++;
                } else {
                    atomicReferenceArray.set(l2BucketId, andSet.getNext());
                    andSet.setNext(null);
                    andSet.setLimit(0);
                    return andSet;
                }
            }
        }
    }

    @kotlin.jvm.JvmStatic
    public static final void recycle(kotlinx.io.Segment segment) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(segment, "segment");
        if (segment.getNext() != null || segment.getPrev() != null) {
            throw new java.lang.IllegalArgumentException("Failed requirement.".toString());
        }
        kotlinx.io.SegmentCopyTracker copyTracker = segment.getCopyTracker();
        if (copyTracker != null && copyTracker.removeCopy()) {
            return;
        }
        java.util.concurrent.atomic.AtomicReferenceArray<kotlinx.io.Segment> atomicReferenceArray = hashBuckets;
        int l1BucketId = INSTANCE.l1BucketId();
        segment.setPos(0);
        segment.owner = true;
        while (true) {
            kotlinx.io.Segment segment2 = atomicReferenceArray.get(l1BucketId);
            if (segment2 != LOCK) {
                int limit = segment2 != null ? segment2.getLimit() : 0;
                if (limit >= MAX_SIZE) {
                    if (SECOND_LEVEL_POOL_TOTAL_SIZE > 0) {
                        recycleL2(segment);
                        return;
                    }
                    return;
                } else {
                    segment.setNext(segment2);
                    segment.setLimit(limit + 8192);
                    if (com.google.common.util.concurrent.Striped$SmallLazyStriped$$ExternalSyntheticBackportWithForwarding0.m(atomicReferenceArray, l1BucketId, segment2, segment)) {
                        return;
                    }
                }
            }
        }
    }

    @kotlin.jvm.JvmStatic
    private static final void recycleL2(kotlinx.io.Segment segment) {
        segment.setPos(0);
        segment.owner = true;
        int l2BucketId = INSTANCE.l2BucketId();
        java.util.concurrent.atomic.AtomicReferenceArray<kotlinx.io.Segment> atomicReferenceArray = hashBucketsL2;
        int i = 0;
        while (true) {
            kotlinx.io.Segment segment2 = atomicReferenceArray.get(l2BucketId);
            if (segment2 != LOCK) {
                int limit = (segment2 != null ? segment2.getLimit() : 0) + 8192;
                if (limit > SECOND_LEVEL_POOL_BUCKET_SIZE) {
                    int i2 = HASH_BUCKET_COUNT_L2;
                    if (i >= i2) {
                        return;
                    }
                    i++;
                    l2BucketId = (l2BucketId + 1) & (i2 - 1);
                } else {
                    segment.setNext(segment2);
                    segment.setLimit(limit);
                    if (com.google.common.util.concurrent.Striped$SmallLazyStriped$$ExternalSyntheticBackportWithForwarding0.m(atomicReferenceArray, l2BucketId, segment2, segment)) {
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

    private final int l1BucketId() {
        return bucketId(HASH_BUCKET_COUNT - 1);
    }

    private final int l2BucketId() {
        return bucketId(HASH_BUCKET_COUNT_L2 - 1);
    }

    private final int bucketId(long mask) {
        return (int) (mask & java.lang.Thread.currentThread().getId());
    }
}
