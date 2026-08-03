package io.ktor.network.selector;

/* compiled from: LockFreeMPSCQueue.kt */
@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u0000 &*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001:\u0002'&B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\u000b\u001a\u00020\u00032\u0006\u0010\n\u001a\u00028\u0000¢\u0006\u0004\b\u000b\u0010\fJ3\u0010\u000f\u001a\u0016\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0000j\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001`\u000e2\u0006\u0010\r\u001a\u00020\u00032\u0006\u0010\n\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0011\u0010\u0012J3\u0010\u0015\u001a\u0016\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0000j\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001`\u000e2\u0006\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0013\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ'\u0010\u001d\u001a\u0012\u0012\u0004\u0012\u00028\u00000\u0000j\b\u0012\u0004\u0012\u00028\u0000`\u000e2\u0006\u0010\u001c\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ'\u0010\u001f\u001a\u0012\u0012\u0004\u0012\u00028\u00000\u0000j\b\u0012\u0004\u0012\u00028\u0000`\u000e2\u0006\u0010\u001c\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001f\u0010\u001eR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010 R\u0014\u0010!\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010 R\u001c\u0010#\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0011\u0010%\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b%\u0010\t¨\u0006("}, d2 = {"Lio/ktor/network/selector/LockFreeMPSCQueueCore;", "", androidx.exifinterface.media.ExifInterface.LONGITUDE_EAST, "", "capacity", "<init>", "(I)V", "", "close", "()Z", "element", "addLast", "(Ljava/lang/Object;)I", com.google.firebase.analytics.FirebaseAnalytics.Param.INDEX, "Lio/ktor/network/selector/Core;", "fillPlaceholder", "(ILjava/lang/Object;)Lio/ktor/network/selector/LockFreeMPSCQueueCore;", "removeFirstOrNull", "()Ljava/lang/Object;", "oldHead", "newHead", "removeSlowPath", "(II)Lio/ktor/network/selector/LockFreeMPSCQueueCore;", io.ktor.http.LinkHeader.Rel.Next, "()Lio/ktor/network/selector/LockFreeMPSCQueueCore;", "", "markFrozen", "()J", "state", "allocateOrGetNextCopy", "(J)Lio/ktor/network/selector/LockFreeMPSCQueueCore;", "allocateNextCopy", "I", "mask", "Ljava/util/concurrent/atomic/AtomicReferenceArray;", "array", "Ljava/util/concurrent/atomic/AtomicReferenceArray;", "isEmpty", com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, "Placeholder", "ktor-network"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
final class LockFreeMPSCQueueCore<E> {
    public static final int ADD_CLOSED = 2;
    public static final int ADD_FROZEN = 1;
    public static final int ADD_SUCCESS = 0;
    private static final int CAPACITY_BITS = 30;
    private static final long CLOSED_MASK = 2305843009213693952L;
    private static final int CLOSED_SHIFT = 61;
    private static final long FROZEN_MASK = 1152921504606846976L;
    private static final int FROZEN_SHIFT = 60;
    private static final long HEAD_MASK = 1073741823;
    private static final int HEAD_SHIFT = 0;
    public static final int INITIAL_CAPACITY = 8;
    private static final int MAX_CAPACITY_MASK = 1073741823;
    private static final long TAIL_MASK = 1152921503533105152L;
    private static final int TAIL_SHIFT = 30;
    private final java.util.concurrent.atomic.AtomicReferenceArray<java.lang.Object> array;
    private final int capacity;
    private final int mask;
    private volatile /* synthetic */ java.lang.Object nextRef = null;
    private volatile /* synthetic */ long stateRef = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final io.ktor.network.selector.LockFreeMPSCQueueCore.Companion INSTANCE = new io.ktor.network.selector.LockFreeMPSCQueueCore.Companion(null);
    public static final java.lang.Object REMOVE_FROZEN = new java.lang.Object() { // from class: io.ktor.network.selector.LockFreeMPSCQueueCore$Companion$REMOVE_FROZEN$1
        public java.lang.String toString() {
            return "REMOVE_FROZEN";
        }
    };
    private static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater nextRef$FU = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(io.ktor.network.selector.LockFreeMPSCQueueCore.class, java.lang.Object.class, "nextRef");
    private static final /* synthetic */ java.util.concurrent.atomic.AtomicLongFieldUpdater stateRef$FU = java.util.concurrent.atomic.AtomicLongFieldUpdater.newUpdater(io.ktor.network.selector.LockFreeMPSCQueueCore.class, "stateRef");

    public LockFreeMPSCQueueCore(int i) {
        this.capacity = i;
        int i2 = i - 1;
        this.mask = i2;
        this.array = new java.util.concurrent.atomic.AtomicReferenceArray<>(i);
        if (i2 > 1073741823) {
            throw new java.lang.IllegalStateException("Check failed.");
        }
        if ((i & i2) != 0) {
            throw new java.lang.IllegalStateException("Check failed.");
        }
    }

    public final boolean isEmpty() {
        long j = this.stateRef;
        return ((int) (1073741823 & j)) == ((int) ((j & 1152921503533105152L) >> 30));
    }

    private final io.ktor.network.selector.LockFreeMPSCQueueCore<E> fillPlaceholder(int index, E element) {
        java.lang.Object obj = this.array.get(this.mask & index);
        if (!(obj instanceof io.ktor.network.selector.LockFreeMPSCQueueCore.Placeholder) || ((io.ktor.network.selector.LockFreeMPSCQueueCore.Placeholder) obj).index != index) {
            return null;
        }
        this.array.set(index & this.mask, element);
        return this;
    }

    public final io.ktor.network.selector.LockFreeMPSCQueueCore<E> next() {
        return allocateOrGetNextCopy(markFrozen());
    }

    private final io.ktor.network.selector.LockFreeMPSCQueueCore<E> allocateNextCopy(long state) {
        io.ktor.network.selector.LockFreeMPSCQueueCore<E> lockFreeMPSCQueueCore = new io.ktor.network.selector.LockFreeMPSCQueueCore<>(this.capacity * 2);
        int i = (int) (1073741823 & state);
        int i2 = (int) ((1152921503533105152L & state) >> 30);
        while (true) {
            int i3 = this.mask;
            if ((i & i3) != (i2 & i3)) {
                java.util.concurrent.atomic.AtomicReferenceArray<java.lang.Object> atomicReferenceArray = lockFreeMPSCQueueCore.array;
                int i4 = lockFreeMPSCQueueCore.mask & i;
                java.lang.Object obj = this.array.get(i3 & i);
                if (obj == null) {
                    obj = new io.ktor.network.selector.LockFreeMPSCQueueCore.Placeholder(i);
                }
                atomicReferenceArray.set(i4, obj);
                i++;
            } else {
                lockFreeMPSCQueueCore.stateRef = INSTANCE.wo(state, 1152921504606846976L);
                return lockFreeMPSCQueueCore;
            }
        }
    }

    /* compiled from: LockFreeMPSCQueue.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0006¨\u0006\u0007"}, d2 = {"Lio/ktor/network/selector/LockFreeMPSCQueueCore$Placeholder;", "", "", com.google.firebase.analytics.FirebaseAnalytics.Param.INDEX, "<init>", "(I)V", "I", "ktor-network"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final class Placeholder {
        public final int index;

        public Placeholder(int i) {
            this.index = i;
        }
    }

    /* compiled from: LockFreeMPSCQueue.kt */
    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u001b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001c\u0010\u0006\u001a\u00020\u0004*\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0082\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001b\u0010\n\u001a\u00020\u0004*\u00020\u00042\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001b\u0010\r\u001a\u00020\u0004*\u00020\u00042\u0006\u0010\f\u001a\u00020\bH\u0002¢\u0006\u0004\b\r\u0010\u000bJR\u0010\u0015\u001a\u00028\u0001\"\u0004\b\u0001\u0010\u000e*\u00020\u000426\u0010\u0014\u001a2\u0012\u0013\u0012\u00110\b¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0012\u0012\u0013\u0012\u00110\b¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u00028\u00010\u000fH\u0082\b¢\u0006\u0004\b\u0015\u0010\u0016J\u0013\u0010\u0017\u001a\u00020\b*\u00020\u0004H\u0002¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0019\u001a\u00020\b8\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001b\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001b\u0010\u001aR\u0014\u0010\u001c\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001c\u0010\u001aR\u0014\u0010\u001d\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001d\u0010\u001aR\u0014\u0010\u001e\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010 \u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b \u0010\u001aR\u0014\u0010!\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b!\u0010\u001fR\u0014\u0010\"\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\"\u0010\u001aR\u0014\u0010#\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b#\u0010\u001fR\u0014\u0010$\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b$\u0010\u001aR\u0014\u0010%\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b%\u0010\u001fR\u0014\u0010&\u001a\u00020\u00018\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010(\u001a\u00020\b8\u0000X\u0080T¢\u0006\u0006\n\u0004\b(\u0010\u001aR\u0014\u0010)\u001a\u00020\b8\u0000X\u0080T¢\u0006\u0006\n\u0004\b)\u0010\u001aR\u0014\u0010*\u001a\u00020\b8\u0000X\u0080T¢\u0006\u0006\n\u0004\b*\u0010\u001a¨\u0006+"}, d2 = {"Lio/ktor/network/selector/LockFreeMPSCQueueCore$Companion;", "", "<init>", "()V", "", "other", "wo", "(JJ)J", "", "newHead", "updateHead", "(JI)J", "newTail", "updateTail", "T", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "head", "tail", "block", "withState", "(JLkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "addFailReason", "(J)I", "INITIAL_CAPACITY", "I", "CAPACITY_BITS", "MAX_CAPACITY_MASK", "HEAD_SHIFT", "HEAD_MASK", "J", "TAIL_SHIFT", "TAIL_MASK", "FROZEN_SHIFT", "FROZEN_MASK", "CLOSED_SHIFT", "CLOSED_MASK", "REMOVE_FROZEN", "Ljava/lang/Object;", "ADD_SUCCESS", "ADD_FROZEN", "ADD_CLOSED", "ktor-network"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final int addFailReason(long j) {
            return (j & 2305843009213693952L) != 0 ? 2 : 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final long wo(long j, long j2) {
            return j & (~j2);
        }

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final long updateHead(long j, int i) {
            return wo(j, 1073741823L) | i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final long updateTail(long j, int i) {
            return wo(j, 1152921503533105152L) | (i << 30);
        }

        private final <T> T withState(long j, kotlin.jvm.functions.Function2<? super java.lang.Integer, ? super java.lang.Integer, ? extends T> function2) {
            return function2.invoke(java.lang.Integer.valueOf((int) (1073741823 & j)), java.lang.Integer.valueOf((int) ((j & 1152921503533105152L) >> 30)));
        }
    }

    public final boolean close() {
        long j;
        do {
            j = this.stateRef;
            if ((j & 2305843009213693952L) != 0) {
                return true;
            }
            if ((1152921504606846976L & j) != 0) {
                return false;
            }
        } while (!stateRef$FU.compareAndSet(this, j, j | 2305843009213693952L));
        return true;
    }

    public final int addLast(E element) {
        long j;
        io.ktor.network.selector.LockFreeMPSCQueueCore.Companion companion;
        int i;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(element, "element");
        do {
            j = this.stateRef;
            if ((3458764513820540928L & j) == 0) {
                companion = INSTANCE;
                int i2 = (int) (1073741823 & j);
                i = (int) ((1152921503533105152L & j) >> 30);
                int i3 = this.mask;
                if (((i + 2) & i3) == (i2 & i3)) {
                    return 1;
                }
            } else {
                return INSTANCE.addFailReason(j);
            }
        } while (!stateRef$FU.compareAndSet(this, j, companion.updateTail(j, (i + 1) & 1073741823)));
        this.array.set(this.mask & i, element);
        io.ktor.network.selector.LockFreeMPSCQueueCore<E> lockFreeMPSCQueueCore = this;
        while ((lockFreeMPSCQueueCore.stateRef & 1152921504606846976L) != 0 && (lockFreeMPSCQueueCore = lockFreeMPSCQueueCore.next().fillPlaceholder(i, element)) != null) {
        }
        return 0;
    }

    public final java.lang.Object removeFirstOrNull() {
        java.lang.Object obj;
        long j = this.stateRef;
        if ((1152921504606846976L & j) != 0) {
            return REMOVE_FROZEN;
        }
        io.ktor.network.selector.LockFreeMPSCQueueCore.Companion companion = INSTANCE;
        int i = (int) (1073741823 & j);
        int i2 = (int) ((1152921503533105152L & j) >> 30);
        int i3 = this.mask;
        if ((i2 & i3) == (i & i3) || (obj = this.array.get(i3 & i)) == null || (obj instanceof io.ktor.network.selector.LockFreeMPSCQueueCore.Placeholder)) {
            return null;
        }
        int i4 = (i + 1) & 1073741823;
        if (stateRef$FU.compareAndSet(this, j, companion.updateHead(j, i4))) {
            this.array.set(this.mask & i, null);
            return obj;
        }
        io.ktor.network.selector.LockFreeMPSCQueueCore<E> lockFreeMPSCQueueCore = this;
        do {
            lockFreeMPSCQueueCore = lockFreeMPSCQueueCore.removeSlowPath(i, i4);
        } while (lockFreeMPSCQueueCore != null);
        return obj;
    }

    private final io.ktor.network.selector.LockFreeMPSCQueueCore<E> removeSlowPath(int oldHead, int newHead) {
        long j;
        io.ktor.network.selector.LockFreeMPSCQueueCore.Companion companion;
        int i;
        do {
            j = this.stateRef;
            companion = INSTANCE;
            i = (int) (1073741823 & j);
            if (i != oldHead) {
                throw new java.lang.IllegalStateException("This queue can have only one consumer".toString());
            }
            if ((1152921504606846976L & j) != 0) {
                return next();
            }
        } while (!stateRef$FU.compareAndSet(this, j, companion.updateHead(j, newHead)));
        this.array.set(this.mask & i, null);
        return null;
    }

    private final long markFrozen() {
        long j;
        long j2;
        do {
            j = this.stateRef;
            if ((j & 1152921504606846976L) != 0) {
                return j;
            }
            j2 = j | 1152921504606846976L;
        } while (!stateRef$FU.compareAndSet(this, j, j2));
        return j2;
    }

    private final io.ktor.network.selector.LockFreeMPSCQueueCore<E> allocateOrGetNextCopy(long state) {
        while (true) {
            io.ktor.network.selector.LockFreeMPSCQueueCore<E> lockFreeMPSCQueueCore = (io.ktor.network.selector.LockFreeMPSCQueueCore) this.nextRef;
            if (lockFreeMPSCQueueCore != null) {
                return lockFreeMPSCQueueCore;
            }
            androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(nextRef$FU, this, null, allocateNextCopy(state));
        }
    }
}
