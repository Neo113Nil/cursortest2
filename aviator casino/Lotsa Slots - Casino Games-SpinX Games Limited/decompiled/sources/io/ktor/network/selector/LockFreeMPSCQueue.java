package io.ktor.network.selector;

/* compiled from: LockFreeMPSCQueue.kt */
@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\r\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0004J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00028\u0000¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\u000b\u0010\fR\u0011\u0010\r\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lio/ktor/network/selector/LockFreeMPSCQueue;", "", androidx.exifinterface.media.ExifInterface.LONGITUDE_EAST, "<init>", "()V", "", "close", "element", "", "addLast", "(Ljava/lang/Object;)Z", "removeFirstOrNull", "()Ljava/lang/Object;", "isEmpty", "()Z", "ktor-network"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class LockFreeMPSCQueue<E> {
    private static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater curRef$FU = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(io.ktor.network.selector.LockFreeMPSCQueue.class, java.lang.Object.class, "curRef");
    private volatile /* synthetic */ java.lang.Object curRef = new io.ktor.network.selector.LockFreeMPSCQueueCore(8);

    public final boolean isEmpty() {
        return ((io.ktor.network.selector.LockFreeMPSCQueueCore) this.curRef).isEmpty();
    }

    public final void close() {
        while (true) {
            io.ktor.network.selector.LockFreeMPSCQueueCore lockFreeMPSCQueueCore = (io.ktor.network.selector.LockFreeMPSCQueueCore) this.curRef;
            if (lockFreeMPSCQueueCore.close()) {
                return;
            } else {
                androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(curRef$FU, this, lockFreeMPSCQueueCore, lockFreeMPSCQueueCore.next());
            }
        }
    }

    public final boolean addLast(E element) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(element, "element");
        while (true) {
            io.ktor.network.selector.LockFreeMPSCQueueCore lockFreeMPSCQueueCore = (io.ktor.network.selector.LockFreeMPSCQueueCore) this.curRef;
            int addLast = lockFreeMPSCQueueCore.addLast(element);
            if (addLast == 0) {
                return true;
            }
            if (addLast == 1) {
                androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(curRef$FU, this, lockFreeMPSCQueueCore, lockFreeMPSCQueueCore.next());
            } else if (addLast == 2) {
                return false;
            }
        }
    }

    public final E removeFirstOrNull() {
        while (true) {
            io.ktor.network.selector.LockFreeMPSCQueueCore lockFreeMPSCQueueCore = (io.ktor.network.selector.LockFreeMPSCQueueCore) this.curRef;
            E e = (E) lockFreeMPSCQueueCore.removeFirstOrNull();
            if (e != io.ktor.network.selector.LockFreeMPSCQueueCore.REMOVE_FROZEN) {
                return e;
            }
            androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(curRef$FU, this, lockFreeMPSCQueueCore, lockFreeMPSCQueueCore.next());
        }
    }
}
