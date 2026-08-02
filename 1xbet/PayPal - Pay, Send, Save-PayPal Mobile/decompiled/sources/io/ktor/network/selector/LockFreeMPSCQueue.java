package io.ktor.network.selector;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\r\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0004J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00028\u0000¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\u000b\u0010\fR\u0011\u0010\r\u001a\u00020\b8G¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e"}, d2 = {"Lio/ktor/network/selector/LockFreeMPSCQueue;", "", "E", "<init>", "()V", "", "close", "element", "", "addLast", "(Ljava/lang/Object;)Z", "removeFirstOrNull", "()Ljava/lang/Object;", "isEmpty", "()Z"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class LockFreeMPSCQueue<E> {
    private static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater getHighResolutionOutputSizeshNQ4ISI = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(io.ktor.network.selector.LockFreeMPSCQueue.class, java.lang.Object.class, "curRef");
    private volatile /* synthetic */ java.lang.Object curRef = new io.ktor.network.selector.LockFreeMPSCQueueCore(8);

    public final boolean isEmpty() {
        long j = ((io.ktor.network.selector.LockFreeMPSCQueueCore) this.curRef).stateRef;
        return ((int) (kotlinx.coroutines.internal.LockFreeTaskQueueCore.HEAD_MASK & j)) == ((int) ((j & kotlinx.coroutines.internal.LockFreeTaskQueueCore.TAIL_MASK) >> 30));
    }

    public final void close() {
        long j;
        while (true) {
            io.ktor.network.selector.LockFreeMPSCQueueCore lockFreeMPSCQueueCore = (io.ktor.network.selector.LockFreeMPSCQueueCore) this.curRef;
            do {
                j = lockFreeMPSCQueueCore.stateRef;
                if ((j & kotlinx.coroutines.internal.LockFreeTaskQueueCore.CLOSED_MASK) != 0) {
                    return;
                }
                if ((kotlinx.coroutines.internal.LockFreeTaskQueueCore.FROZEN_MASK & j) != 0) {
                    break;
                }
            } while (!io.ktor.network.selector.LockFreeMPSCQueueCore.getHighResolutionOutputSizeshNQ4ISI.compareAndSet(lockFreeMPSCQueueCore, j, j | kotlinx.coroutines.internal.LockFreeTaskQueueCore.CLOSED_MASK));
            return;
            androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(getHighResolutionOutputSizeshNQ4ISI, this, lockFreeMPSCQueueCore, lockFreeMPSCQueueCore.Camera2StreamConfigurationMap(lockFreeMPSCQueueCore.getHighSpeedVideoFpsRangesFor()));
        }
    }

    public final boolean addLast(E element) {
        int access$addFailReason;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(element, "");
        while (true) {
            io.ktor.network.selector.LockFreeMPSCQueueCore lockFreeMPSCQueueCore = (io.ktor.network.selector.LockFreeMPSCQueueCore) this.curRef;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(element, "");
            while (true) {
                long j = lockFreeMPSCQueueCore.stateRef;
                if ((3458764513820540928L & j) != 0) {
                    access$addFailReason = io.ktor.network.selector.LockFreeMPSCQueueCore.Companion.access$addFailReason(io.ktor.network.selector.LockFreeMPSCQueueCore.INSTANCE, j);
                    break;
                }
                io.ktor.network.selector.LockFreeMPSCQueueCore.Companion companion = io.ktor.network.selector.LockFreeMPSCQueueCore.INSTANCE;
                int i = (int) (kotlinx.coroutines.internal.LockFreeTaskQueueCore.HEAD_MASK & j);
                int i2 = (int) ((kotlinx.coroutines.internal.LockFreeTaskQueueCore.TAIL_MASK & j) >> 30);
                int i3 = lockFreeMPSCQueueCore.getHighSpeedVideoSizes;
                if (((i2 + 2) & i3) == (i & i3)) {
                    access$addFailReason = 1;
                    break;
                }
                if (io.ktor.network.selector.LockFreeMPSCQueueCore.getHighResolutionOutputSizeshNQ4ISI.compareAndSet(lockFreeMPSCQueueCore, j, io.ktor.network.selector.LockFreeMPSCQueueCore.Companion.access$updateTail(companion, j, (i2 + 1) & kotlinx.coroutines.internal.LockFreeTaskQueueCore.MAX_CAPACITY_MASK))) {
                    lockFreeMPSCQueueCore.getHighSpeedVideoFpsRangesFor.set(lockFreeMPSCQueueCore.getHighSpeedVideoSizes & i2, element);
                    io.ktor.network.selector.LockFreeMPSCQueueCore lockFreeMPSCQueueCore2 = lockFreeMPSCQueueCore;
                    while ((lockFreeMPSCQueueCore2.stateRef & kotlinx.coroutines.internal.LockFreeTaskQueueCore.FROZEN_MASK) != 0) {
                        lockFreeMPSCQueueCore2 = lockFreeMPSCQueueCore2.Camera2StreamConfigurationMap(lockFreeMPSCQueueCore2.getHighSpeedVideoFpsRangesFor());
                        java.lang.Object obj = lockFreeMPSCQueueCore2.getHighSpeedVideoFpsRangesFor.get(lockFreeMPSCQueueCore2.getHighSpeedVideoSizes & i2);
                        if ((obj instanceof io.ktor.network.selector.LockFreeMPSCQueueCore.Placeholder) && ((io.ktor.network.selector.LockFreeMPSCQueueCore.Placeholder) obj).getHighResolutionOutputSizeshNQ4ISI == i2) {
                            lockFreeMPSCQueueCore2.getHighSpeedVideoFpsRangesFor.set(lockFreeMPSCQueueCore2.getHighSpeedVideoSizes & i2, element);
                        } else {
                            lockFreeMPSCQueueCore2 = null;
                        }
                        if (lockFreeMPSCQueueCore2 == null) {
                            break;
                        }
                    }
                    access$addFailReason = 0;
                }
            }
            if (access$addFailReason == 0) {
                return true;
            }
            if (access$addFailReason == 1) {
                androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(getHighResolutionOutputSizeshNQ4ISI, this, lockFreeMPSCQueueCore, lockFreeMPSCQueueCore.Camera2StreamConfigurationMap(lockFreeMPSCQueueCore.getHighSpeedVideoFpsRangesFor()));
            } else if (access$addFailReason == 2) {
                return false;
            }
        }
    }

    public final E removeFirstOrNull() {
        java.lang.Object obj;
        int i;
        E e;
        while (true) {
            io.ktor.network.selector.LockFreeMPSCQueueCore lockFreeMPSCQueueCore = (io.ktor.network.selector.LockFreeMPSCQueueCore) this.curRef;
            long j = lockFreeMPSCQueueCore.stateRef;
            long j2 = kotlinx.coroutines.internal.LockFreeTaskQueueCore.FROZEN_MASK;
            if ((j & kotlinx.coroutines.internal.LockFreeTaskQueueCore.FROZEN_MASK) != 0) {
                e = (E) io.ktor.network.selector.LockFreeMPSCQueueCore.getHighSpeedVideoFpsRanges;
            } else {
                io.ktor.network.selector.LockFreeMPSCQueueCore.Companion companion = io.ktor.network.selector.LockFreeMPSCQueueCore.INSTANCE;
                int i2 = (int) (j & kotlinx.coroutines.internal.LockFreeTaskQueueCore.HEAD_MASK);
                int i3 = (int) ((kotlinx.coroutines.internal.LockFreeTaskQueueCore.TAIL_MASK & j) >> 30);
                int i4 = lockFreeMPSCQueueCore.getHighSpeedVideoSizes;
                int i5 = i3 & i4;
                int i6 = i4 & i2;
                if (i5 == i6 || (obj = lockFreeMPSCQueueCore.getHighSpeedVideoFpsRangesFor.get(i6)) == null || (obj instanceof io.ktor.network.selector.LockFreeMPSCQueueCore.Placeholder)) {
                    e = null;
                } else {
                    int i7 = 1073741823 & (i2 + 1);
                    int i8 = i7;
                    if (io.ktor.network.selector.LockFreeMPSCQueueCore.getHighResolutionOutputSizeshNQ4ISI.compareAndSet(lockFreeMPSCQueueCore, j, io.ktor.network.selector.LockFreeMPSCQueueCore.Companion.access$updateHead(companion, j, i7))) {
                        lockFreeMPSCQueueCore.getHighSpeedVideoFpsRangesFor.set(lockFreeMPSCQueueCore.getHighSpeedVideoSizes & i2, null);
                    } else {
                        io.ktor.network.selector.LockFreeMPSCQueueCore lockFreeMPSCQueueCore2 = lockFreeMPSCQueueCore;
                        while (true) {
                            long j3 = lockFreeMPSCQueueCore2.stateRef;
                            io.ktor.network.selector.LockFreeMPSCQueueCore.Companion companion2 = io.ktor.network.selector.LockFreeMPSCQueueCore.INSTANCE;
                            int i9 = (int) (j3 & kotlinx.coroutines.internal.LockFreeTaskQueueCore.HEAD_MASK);
                            if (i9 != i2) {
                                throw new java.lang.IllegalStateException("This queue can have only one consumer".toString());
                            }
                            if ((j3 & j2) == 0) {
                                i = i8;
                                if (io.ktor.network.selector.LockFreeMPSCQueueCore.getHighResolutionOutputSizeshNQ4ISI.compareAndSet(lockFreeMPSCQueueCore2, j3, io.ktor.network.selector.LockFreeMPSCQueueCore.Companion.access$updateHead(companion2, j3, i))) {
                                    lockFreeMPSCQueueCore2.getHighSpeedVideoFpsRangesFor.set(lockFreeMPSCQueueCore2.getHighSpeedVideoSizes & i9, null);
                                    lockFreeMPSCQueueCore2 = null;
                                } else {
                                    continue;
                                    i8 = i;
                                    j2 = kotlinx.coroutines.internal.LockFreeTaskQueueCore.FROZEN_MASK;
                                }
                            } else {
                                lockFreeMPSCQueueCore2 = lockFreeMPSCQueueCore2.Camera2StreamConfigurationMap(lockFreeMPSCQueueCore2.getHighSpeedVideoFpsRangesFor());
                                i = i8;
                            }
                            if (lockFreeMPSCQueueCore2 == null) {
                                break;
                            }
                            i8 = i;
                            j2 = kotlinx.coroutines.internal.LockFreeTaskQueueCore.FROZEN_MASK;
                        }
                    }
                    e = (E) obj;
                }
            }
            if (e != io.ktor.network.selector.LockFreeMPSCQueueCore.getHighSpeedVideoFpsRanges) {
                return e;
            }
            androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(getHighResolutionOutputSizeshNQ4ISI, this, lockFreeMPSCQueueCore, lockFreeMPSCQueueCore.Camera2StreamConfigurationMap(lockFreeMPSCQueueCore.getHighSpeedVideoFpsRangesFor()));
        }
    }
}
