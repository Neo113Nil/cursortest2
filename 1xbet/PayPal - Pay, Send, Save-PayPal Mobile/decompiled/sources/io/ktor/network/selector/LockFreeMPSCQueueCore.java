package io.ktor.network.selector;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u0000 \u0013*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001:\u0002\u0014\u0013B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\tJ'\u0010\u000b\u001a\u0012\u0012\u0004\u0012\u00028\u00000\u0000j\b\u0012\u0004\u0012\u00028\u0000`\n2\u0006\u0010\u0004\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u000f\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u000eR\u001c\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0012"}, d2 = {"Lio/ktor/network/selector/LockFreeMPSCQueueCore;", "", "E", "", "p0", "<init>", "(I)V", "", "getHighSpeedVideoFpsRangesFor", "()J", "Lio/ktor/network/selector/Core;", "Camera2StreamConfigurationMap", "(J)Lio/ktor/network/selector/LockFreeMPSCQueueCore;", "getHighSpeedVideoSizesFor", com.visa.cbp.getEncExpo.warmup, "getHighSpeedVideoFpsRanges", "getHighSpeedVideoSizes", "Ljava/util/concurrent/atomic/AtomicReferenceArray;", "Ljava/util/concurrent/atomic/AtomicReferenceArray;", "Companion", "Placeholder"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
final class LockFreeMPSCQueueCore<E> {

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    final int getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    final java.util.concurrent.atomic.AtomicReferenceArray<java.lang.Object> getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoSizesFor, reason: from kotlin metadata */
    private final int getHighSpeedVideoFpsRanges;
    private volatile /* synthetic */ java.lang.Object nextRef = null;
    volatile /* synthetic */ long stateRef = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final io.ktor.network.selector.LockFreeMPSCQueueCore.Companion INSTANCE = new io.ktor.network.selector.LockFreeMPSCQueueCore.Companion(null);
    public static final java.lang.Object getHighSpeedVideoFpsRanges = new java.lang.Object() { // from class: io.ktor.network.selector.LockFreeMPSCQueueCore$Companion$REMOVE_FROZEN$1
        public final java.lang.String toString() {
            return "REMOVE_FROZEN";
        }
    };
    private static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater Camera2StreamConfigurationMap = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(io.ktor.network.selector.LockFreeMPSCQueueCore.class, java.lang.Object.class, "nextRef");
    static final /* synthetic */ java.util.concurrent.atomic.AtomicLongFieldUpdater getHighResolutionOutputSizeshNQ4ISI = java.util.concurrent.atomic.AtomicLongFieldUpdater.newUpdater(io.ktor.network.selector.LockFreeMPSCQueueCore.class, "stateRef");

    public LockFreeMPSCQueueCore(int i) {
        this.getHighSpeedVideoFpsRanges = i;
        int i2 = i - 1;
        this.getHighSpeedVideoSizes = i2;
        this.getHighSpeedVideoFpsRangesFor = new java.util.concurrent.atomic.AtomicReferenceArray<>(i);
        if (i2 > 1073741823) {
            throw new java.lang.IllegalStateException("Check failed.");
        }
        if ((i & i2) != 0) {
            throw new java.lang.IllegalStateException("Check failed.");
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\b\u001a\u00020\u00028\u0006¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007"}, d2 = {"Lio/ktor/network/selector/LockFreeMPSCQueueCore$Placeholder;", "", "", "p0", "<init>", "(I)V", "getHighSpeedVideoFpsRanges", com.visa.cbp.getEncExpo.warmup, "getHighResolutionOutputSizeshNQ4ISI"}, k = 1, mv = {2, 1, 0}, xi = 48)
    static final class Placeholder {

        /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
        public final int getHighResolutionOutputSizeshNQ4ISI;

        public Placeholder(int i) {
            this.getHighResolutionOutputSizeshNQ4ISI = i;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0006\u001a\u00020\u00018\u0000X\u0080\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005"}, d2 = {"Lio/ktor/network/selector/LockFreeMPSCQueueCore$Companion;", "", "<init>", "()V", "getHighSpeedVideoFpsRanges", "Ljava/lang/Object;", "getHighResolutionOutputSizeshNQ4ISI"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public static final /* synthetic */ int access$addFailReason(io.ktor.network.selector.LockFreeMPSCQueueCore.Companion companion, long j) {
            return (j & kotlinx.coroutines.internal.LockFreeTaskQueueCore.CLOSED_MASK) != 0 ? 2 : 1;
        }

        public static final /* synthetic */ long access$updateHead(io.ktor.network.selector.LockFreeMPSCQueueCore.Companion companion, long j, int i) {
            return (j & (-1073741824)) | i;
        }

        public static final /* synthetic */ long access$updateTail(io.ktor.network.selector.LockFreeMPSCQueueCore.Companion companion, long j, int i) {
            return (j & (-1152921503533105153L)) | (i << 30);
        }

        public static final /* synthetic */ long access$wo(io.ktor.network.selector.LockFreeMPSCQueueCore.Companion companion, long j, long j2) {
            return j & (~j2);
        }

        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    final long getHighSpeedVideoFpsRangesFor() {
        long j;
        long j2;
        do {
            j = this.stateRef;
            if ((j & kotlinx.coroutines.internal.LockFreeTaskQueueCore.FROZEN_MASK) != 0) {
                return j;
            }
            j2 = j | kotlinx.coroutines.internal.LockFreeTaskQueueCore.FROZEN_MASK;
        } while (!getHighResolutionOutputSizeshNQ4ISI.compareAndSet(this, j, j2));
        return j2;
    }

    final io.ktor.network.selector.LockFreeMPSCQueueCore<E> Camera2StreamConfigurationMap(long p0) {
        while (true) {
            io.ktor.network.selector.LockFreeMPSCQueueCore<E> lockFreeMPSCQueueCore = (io.ktor.network.selector.LockFreeMPSCQueueCore) this.nextRef;
            if (lockFreeMPSCQueueCore != null) {
                return lockFreeMPSCQueueCore;
            }
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = Camera2StreamConfigurationMap;
            io.ktor.network.selector.LockFreeMPSCQueueCore lockFreeMPSCQueueCore2 = new io.ktor.network.selector.LockFreeMPSCQueueCore(this.getHighSpeedVideoFpsRanges * 2);
            int i = (int) (kotlinx.coroutines.internal.LockFreeTaskQueueCore.HEAD_MASK & p0);
            int i2 = (int) ((kotlinx.coroutines.internal.LockFreeTaskQueueCore.TAIL_MASK & p0) >> 30);
            while (true) {
                int i3 = this.getHighSpeedVideoSizes;
                int i4 = i & i3;
                if (i4 != (i3 & i2)) {
                    java.util.concurrent.atomic.AtomicReferenceArray<java.lang.Object> atomicReferenceArray = lockFreeMPSCQueueCore2.getHighSpeedVideoFpsRangesFor;
                    int i5 = lockFreeMPSCQueueCore2.getHighSpeedVideoSizes;
                    java.lang.Object obj = this.getHighSpeedVideoFpsRangesFor.get(i4);
                    if (obj == null) {
                        obj = new io.ktor.network.selector.LockFreeMPSCQueueCore.Placeholder(i);
                    }
                    atomicReferenceArray.set(i5 & i, obj);
                    i++;
                }
            }
            lockFreeMPSCQueueCore2.stateRef = io.ktor.network.selector.LockFreeMPSCQueueCore.Companion.access$wo(INSTANCE, p0, kotlinx.coroutines.internal.LockFreeTaskQueueCore.FROZEN_MASK);
            androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(atomicReferenceFieldUpdater, this, null, lockFreeMPSCQueueCore2);
        }
    }
}
