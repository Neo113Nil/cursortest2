package com.google.common.util.concurrent;

/* loaded from: classes9.dex */
public abstract class Striped<L> {
    private static final int ALL_SET = -1;
    private static final int LARGE_LAZY_CUTOFF = 1024;

    /* JADX INFO: Access modifiers changed from: private */
    public static int smear(int i) {
        int i2 = i ^ ((i >>> 20) ^ (i >>> 12));
        return (i2 ^ (i2 >>> 7)) ^ (i2 >>> 4);
    }

    public abstract L get(java.lang.Object obj);

    public abstract L getAt(int i);

    abstract int indexFor(java.lang.Object obj);

    public abstract int size();

    private Striped() {
    }

    public java.lang.Iterable<L> bulkGet(java.lang.Iterable<? extends java.lang.Object> iterable) {
        java.util.ArrayList newArrayList = com.google.common.collect.Lists.newArrayList(iterable);
        if (newArrayList.isEmpty()) {
            return com.google.common.collect.ImmutableList.of();
        }
        int[] iArr = new int[newArrayList.size()];
        for (int i = 0; i < newArrayList.size(); i++) {
            iArr[i] = indexFor(newArrayList.get(i));
        }
        java.util.Arrays.sort(iArr);
        int i2 = iArr[0];
        newArrayList.set(0, getAt(i2));
        for (int i3 = 1; i3 < newArrayList.size(); i3++) {
            int i4 = iArr[i3];
            if (i4 == i2) {
                newArrayList.set(i3, newArrayList.get(i3 - 1));
            } else {
                newArrayList.set(i3, getAt(i4));
                i2 = i4;
            }
        }
        return java.util.Collections.unmodifiableList(newArrayList);
    }

    public static <L> com.google.common.util.concurrent.Striped<L> custom(int i, com.google.common.base.Supplier<L> supplier) {
        return new com.google.common.util.concurrent.Striped.CompactStriped(i, supplier);
    }

    public static com.google.common.util.concurrent.Striped<java.util.concurrent.locks.Lock> lock(int i) {
        return custom(i, new com.google.common.base.Supplier() { // from class: com.google.common.util.concurrent.Striped$$ExternalSyntheticLambda1
            @Override // com.google.common.base.Supplier
            public final java.lang.Object get() {
                return new com.google.common.util.concurrent.Striped.PaddedLock();
            }
        });
    }

    static /* synthetic */ java.util.concurrent.locks.Lock lambda$lazyWeakLock$0() {
        return new java.util.concurrent.locks.ReentrantLock(false);
    }

    public static com.google.common.util.concurrent.Striped<java.util.concurrent.locks.Lock> lazyWeakLock(int i) {
        return lazyWeakCustom(i, new com.google.common.base.Supplier() { // from class: com.google.common.util.concurrent.Striped$$ExternalSyntheticLambda4
            @Override // com.google.common.base.Supplier
            public final java.lang.Object get() {
                return com.google.common.util.concurrent.Striped.lambda$lazyWeakLock$0();
            }
        });
    }

    static <L> com.google.common.util.concurrent.Striped<L> lazyWeakCustom(int i, com.google.common.base.Supplier<L> supplier) {
        if (i < 1024) {
            return new com.google.common.util.concurrent.Striped.SmallLazyStriped(i, supplier);
        }
        return new com.google.common.util.concurrent.Striped.LargeLazyStriped(i, supplier);
    }

    static /* synthetic */ java.util.concurrent.Semaphore lambda$semaphore$0(int i) {
        return new com.google.common.util.concurrent.Striped.PaddedSemaphore(i);
    }

    public static com.google.common.util.concurrent.Striped<java.util.concurrent.Semaphore> semaphore(int i, final int i2) {
        return custom(i, new com.google.common.base.Supplier() { // from class: com.google.common.util.concurrent.Striped$$ExternalSyntheticLambda2
            @Override // com.google.common.base.Supplier
            public final java.lang.Object get() {
                return com.google.common.util.concurrent.Striped.lambda$semaphore$0(i2);
            }
        });
    }

    static /* synthetic */ java.util.concurrent.Semaphore lambda$lazyWeakSemaphore$0(int i) {
        return new java.util.concurrent.Semaphore(i, false);
    }

    public static com.google.common.util.concurrent.Striped<java.util.concurrent.Semaphore> lazyWeakSemaphore(int i, final int i2) {
        return lazyWeakCustom(i, new com.google.common.base.Supplier() { // from class: com.google.common.util.concurrent.Striped$$ExternalSyntheticLambda3
            @Override // com.google.common.base.Supplier
            public final java.lang.Object get() {
                return com.google.common.util.concurrent.Striped.lambda$lazyWeakSemaphore$0(i2);
            }
        });
    }

    public static com.google.common.util.concurrent.Striped<java.util.concurrent.locks.ReadWriteLock> readWriteLock(int i) {
        return custom(i, new com.google.common.base.Supplier() { // from class: com.google.common.util.concurrent.Striped$$ExternalSyntheticLambda5
            @Override // com.google.common.base.Supplier
            public final java.lang.Object get() {
                return com.google.common.util.concurrent.Striped.$r8$lambda$f7AdVx1gLibS3hZPmjW1JxvV_us();
            }
        });
    }

    public static com.google.common.util.concurrent.Striped<java.util.concurrent.locks.ReadWriteLock> lazyWeakReadWriteLock(int i) {
        return lazyWeakCustom(i, new com.google.common.base.Supplier() { // from class: com.google.common.util.concurrent.Striped$$ExternalSyntheticLambda0
            @Override // com.google.common.base.Supplier
            public final java.lang.Object get() {
                return new com.google.common.util.concurrent.Striped.WeakSafeReadWriteLock();
            }
        });
    }

    static final class WeakSafeReadWriteLock implements java.util.concurrent.locks.ReadWriteLock {
        private final java.util.concurrent.locks.ReadWriteLock delegate = new java.util.concurrent.locks.ReentrantReadWriteLock();

        WeakSafeReadWriteLock() {
        }

        @Override // java.util.concurrent.locks.ReadWriteLock
        public final java.util.concurrent.locks.Lock readLock() {
            return new com.google.common.util.concurrent.Striped.WeakSafeLock(this.delegate.readLock(), this);
        }

        @Override // java.util.concurrent.locks.ReadWriteLock
        public final java.util.concurrent.locks.Lock writeLock() {
            return new com.google.common.util.concurrent.Striped.WeakSafeLock(this.delegate.writeLock(), this);
        }
    }

    static final class WeakSafeLock extends com.google.common.util.concurrent.ForwardingLock {
        private final java.util.concurrent.locks.Lock delegate;
        private final com.google.common.util.concurrent.Striped.WeakSafeReadWriteLock strongReference;

        WeakSafeLock(java.util.concurrent.locks.Lock lock, com.google.common.util.concurrent.Striped.WeakSafeReadWriteLock weakSafeReadWriteLock) {
            this.delegate = lock;
            this.strongReference = weakSafeReadWriteLock;
        }

        @Override // com.google.common.util.concurrent.ForwardingLock
        final java.util.concurrent.locks.Lock delegate() {
            return this.delegate;
        }

        @Override // com.google.common.util.concurrent.ForwardingLock, java.util.concurrent.locks.Lock
        public final java.util.concurrent.locks.Condition newCondition() {
            return new com.google.common.util.concurrent.Striped.WeakSafeCondition(this.delegate.newCondition(), this.strongReference);
        }
    }

    static final class WeakSafeCondition extends com.google.common.util.concurrent.ForwardingCondition {
        private final java.util.concurrent.locks.Condition delegate;
        private final com.google.common.util.concurrent.Striped.WeakSafeReadWriteLock strongReference;

        WeakSafeCondition(java.util.concurrent.locks.Condition condition, com.google.common.util.concurrent.Striped.WeakSafeReadWriteLock weakSafeReadWriteLock) {
            this.delegate = condition;
            this.strongReference = weakSafeReadWriteLock;
        }

        @Override // com.google.common.util.concurrent.ForwardingCondition
        final java.util.concurrent.locks.Condition delegate() {
            return this.delegate;
        }
    }

    static abstract class PowerOfTwoStriped<L> extends com.google.common.util.concurrent.Striped<L> {
        final int mask;

        PowerOfTwoStriped(int i) {
            super();
            com.google.common.base.Preconditions.checkArgument(i > 0, "Stripes must be positive");
            this.mask = i > 1073741824 ? -1 : com.google.common.util.concurrent.Striped.ceilToPowerOfTwo(i) - 1;
        }

        @Override // com.google.common.util.concurrent.Striped
        final int indexFor(java.lang.Object obj) {
            return com.google.common.util.concurrent.Striped.smear(obj.hashCode()) & this.mask;
        }

        @Override // com.google.common.util.concurrent.Striped
        public final L get(java.lang.Object obj) {
            return getAt(indexFor(obj));
        }
    }

    static final class CompactStriped<L> extends com.google.common.util.concurrent.Striped.PowerOfTwoStriped<L> {
        private final java.lang.Object[] array;

        private CompactStriped(int i, com.google.common.base.Supplier<L> supplier) {
            super(i);
            int i2 = 0;
            com.google.common.base.Preconditions.checkArgument(i <= 1073741824, "Stripes must be <= 2^30)");
            this.array = new java.lang.Object[this.mask + 1];
            while (true) {
                java.lang.Object[] objArr = this.array;
                if (i2 >= objArr.length) {
                    return;
                }
                objArr[i2] = supplier.get();
                i2++;
            }
        }

        @Override // com.google.common.util.concurrent.Striped
        public final L getAt(int i) {
            return (L) this.array[i];
        }

        @Override // com.google.common.util.concurrent.Striped
        public final int size() {
            return this.array.length;
        }
    }

    static final class SmallLazyStriped<L> extends com.google.common.util.concurrent.Striped.PowerOfTwoStriped<L> {
        final java.util.concurrent.atomic.AtomicReferenceArray<com.google.common.util.concurrent.Striped.SmallLazyStriped.ArrayReference<? extends L>> locks;
        final java.lang.ref.ReferenceQueue<L> queue;
        final int size;
        final com.google.common.base.Supplier<L> supplier;

        SmallLazyStriped(int i, com.google.common.base.Supplier<L> supplier) {
            super(i);
            this.queue = new java.lang.ref.ReferenceQueue<>();
            int i2 = this.mask == -1 ? Integer.MAX_VALUE : this.mask + 1;
            this.size = i2;
            this.locks = new java.util.concurrent.atomic.AtomicReferenceArray<>(i2);
            this.supplier = supplier;
        }

        @Override // com.google.common.util.concurrent.Striped
        public final L getAt(int i) {
            if (this.size != Integer.MAX_VALUE) {
                com.google.common.base.Preconditions.checkElementIndex(i, size());
            }
            com.google.common.util.concurrent.Striped.SmallLazyStriped.ArrayReference<? extends L> arrayReference = this.locks.get(i);
            L l = arrayReference == null ? null : arrayReference.get();
            if (l != null) {
                return l;
            }
            L l2 = this.supplier.get();
            com.google.common.util.concurrent.Striped.SmallLazyStriped.ArrayReference arrayReference2 = new com.google.common.util.concurrent.Striped.SmallLazyStriped.ArrayReference(l2, i, this.queue);
            while (!com.datadog.trace.api.cache.RadixTreeCache$$ExternalSyntheticBackportWithForwarding0.m(this.locks, i, arrayReference, arrayReference2)) {
                arrayReference = this.locks.get(i);
                L l3 = arrayReference == null ? null : arrayReference.get();
                if (l3 != null) {
                    return l3;
                }
            }
            drainQueue();
            return l2;
        }

        private void drainQueue() {
            while (true) {
                java.lang.ref.Reference<? extends L> poll = this.queue.poll();
                if (poll == null) {
                    return;
                }
                com.google.common.util.concurrent.Striped.SmallLazyStriped.ArrayReference arrayReference = (com.google.common.util.concurrent.Striped.SmallLazyStriped.ArrayReference) poll;
                com.datadog.trace.api.cache.RadixTreeCache$$ExternalSyntheticBackportWithForwarding0.m(this.locks, arrayReference.index, arrayReference, null);
            }
        }

        @Override // com.google.common.util.concurrent.Striped
        public final int size() {
            return this.size;
        }

        static final class ArrayReference<L> extends java.lang.ref.WeakReference<L> {
            final int index;

            ArrayReference(L l, int i, java.lang.ref.ReferenceQueue<L> referenceQueue) {
                super(l, referenceQueue);
                this.index = i;
            }
        }
    }

    static final class LargeLazyStriped<L> extends com.google.common.util.concurrent.Striped.PowerOfTwoStriped<L> {
        final java.util.concurrent.ConcurrentMap<java.lang.Integer, L> locks;
        final int size;
        final com.google.common.base.Supplier<L> supplier;

        LargeLazyStriped(int i, com.google.common.base.Supplier<L> supplier) {
            super(i);
            this.size = this.mask == -1 ? Integer.MAX_VALUE : this.mask + 1;
            this.supplier = supplier;
            this.locks = new com.google.common.collect.MapMaker().weakValues().makeMap();
        }

        @Override // com.google.common.util.concurrent.Striped
        public final L getAt(int i) {
            if (this.size != Integer.MAX_VALUE) {
                com.google.common.base.Preconditions.checkElementIndex(i, size());
            }
            L l = this.locks.get(java.lang.Integer.valueOf(i));
            if (l != null) {
                return l;
            }
            L l2 = this.supplier.get();
            return (L) com.google.common.base.MoreObjects.firstNonNull(this.locks.putIfAbsent(java.lang.Integer.valueOf(i), l2), l2);
        }

        @Override // com.google.common.util.concurrent.Striped
        public final int size() {
            return this.size;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int ceilToPowerOfTwo(int i) {
        return 1 << com.google.common.math.IntMath.log2(i, java.math.RoundingMode.CEILING);
    }

    static final class PaddedLock extends java.util.concurrent.locks.ReentrantLock {
        long unused1;
        long unused2;
        long unused3;

        PaddedLock() {
            super(false);
        }
    }

    static final class PaddedSemaphore extends java.util.concurrent.Semaphore {
        long unused1;
        long unused2;
        long unused3;

        PaddedSemaphore(int i) {
            super(i, false);
        }
    }

    public static /* synthetic */ java.util.concurrent.locks.ReentrantReadWriteLock $r8$lambda$f7AdVx1gLibS3hZPmjW1JxvV_us() {
        return new java.util.concurrent.locks.ReentrantReadWriteLock();
    }
}
