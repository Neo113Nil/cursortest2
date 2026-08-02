package com.google.common.util.concurrent;

/* loaded from: classes9.dex */
abstract class AggregateFutureState<OutputT> extends com.google.common.util.concurrent.AbstractFuture.TrustedFuture<OutputT> {
    private static final com.google.common.util.concurrent.AggregateFutureState.AtomicHelper ATOMIC_HELPER;
    private static final com.google.common.util.concurrent.LazyLogger log = new com.google.common.util.concurrent.LazyLogger(com.google.common.util.concurrent.AggregateFutureState.class);
    volatile int remainingField;
    volatile java.util.Set<java.lang.Throwable> seenExceptionsField = null;

    abstract void addInitialException(java.util.Set<java.lang.Throwable> set);

    /* JADX WARN: Multi-variable type inference failed */
    static {
        com.google.common.util.concurrent.AggregateFutureState.AtomicHelper atomicHelper;
        java.lang.Throwable th = null;
        java.lang.Object[] objArr = 0;
        try {
            atomicHelper = new com.google.common.util.concurrent.AggregateFutureState.SafeAtomicHelper();
        } catch (java.lang.Throwable th2) {
            com.google.common.util.concurrent.AggregateFutureState.SynchronizedAtomicHelper synchronizedAtomicHelper = new com.google.common.util.concurrent.AggregateFutureState.SynchronizedAtomicHelper();
            th = th2;
            atomicHelper = synchronizedAtomicHelper;
        }
        ATOMIC_HELPER = atomicHelper;
        if (th != null) {
            log.get().log(java.util.logging.Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
    }

    AggregateFutureState(int i) {
        this.remainingField = i;
    }

    final java.util.Set<java.lang.Throwable> getOrInitSeenExceptions() {
        java.util.Set<java.lang.Throwable> set = this.seenExceptionsField;
        if (set != null) {
            return set;
        }
        java.util.Set<java.lang.Throwable> newConcurrentHashSet = com.google.common.collect.Sets.newConcurrentHashSet();
        addInitialException(newConcurrentHashSet);
        ATOMIC_HELPER.compareAndSetSeenExceptions(this, null, newConcurrentHashSet);
        return (java.util.Set) java.util.Objects.requireNonNull(this.seenExceptionsField);
    }

    final int decrementRemainingAndGet() {
        return ATOMIC_HELPER.decrementAndGetRemainingCount(this);
    }

    final void clearSeenExceptions() {
        this.seenExceptionsField = null;
    }

    static java.lang.String atomicHelperTypeForTest() {
        return ATOMIC_HELPER.atomicHelperTypeForTest();
    }

    static abstract class AtomicHelper {
        abstract java.lang.String atomicHelperTypeForTest();

        abstract void compareAndSetSeenExceptions(com.google.common.util.concurrent.AggregateFutureState<?> aggregateFutureState, java.util.Set<java.lang.Throwable> set, java.util.Set<java.lang.Throwable> set2);

        abstract int decrementAndGetRemainingCount(com.google.common.util.concurrent.AggregateFutureState<?> aggregateFutureState);

        private AtomicHelper() {
        }
    }

    static final class SafeAtomicHelper extends com.google.common.util.concurrent.AggregateFutureState.AtomicHelper {
        private static final java.util.concurrent.atomic.AtomicReferenceFieldUpdater<? super com.google.common.util.concurrent.AggregateFutureState<?>, ? super java.util.Set<java.lang.Throwable>> seenExceptionsUpdater = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(com.google.common.util.concurrent.AggregateFutureState.class, java.util.Set.class, "seenExceptionsField");
        private static final java.util.concurrent.atomic.AtomicIntegerFieldUpdater<? super com.google.common.util.concurrent.AggregateFutureState<?>> remainingCountUpdater = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(com.google.common.util.concurrent.AggregateFutureState.class, "remainingField");

        private SafeAtomicHelper() {
            super();
        }

        @Override // com.google.common.util.concurrent.AggregateFutureState.AtomicHelper
        final void compareAndSetSeenExceptions(com.google.common.util.concurrent.AggregateFutureState<?> aggregateFutureState, java.util.Set<java.lang.Throwable> set, java.util.Set<java.lang.Throwable> set2) {
            androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(seenExceptionsUpdater, aggregateFutureState, set, set2);
        }

        @Override // com.google.common.util.concurrent.AggregateFutureState.AtomicHelper
        final int decrementAndGetRemainingCount(com.google.common.util.concurrent.AggregateFutureState<?> aggregateFutureState) {
            return remainingCountUpdater.decrementAndGet(aggregateFutureState);
        }

        @Override // com.google.common.util.concurrent.AggregateFutureState.AtomicHelper
        final java.lang.String atomicHelperTypeForTest() {
            return "SafeAtomicHelper";
        }
    }

    static final class SynchronizedAtomicHelper extends com.google.common.util.concurrent.AggregateFutureState.AtomicHelper {
        private SynchronizedAtomicHelper() {
            super();
        }

        @Override // com.google.common.util.concurrent.AggregateFutureState.AtomicHelper
        final void compareAndSetSeenExceptions(com.google.common.util.concurrent.AggregateFutureState<?> aggregateFutureState, java.util.Set<java.lang.Throwable> set, java.util.Set<java.lang.Throwable> set2) {
            synchronized (aggregateFutureState) {
                if (aggregateFutureState.seenExceptionsField == set) {
                    aggregateFutureState.seenExceptionsField = set2;
                }
            }
        }

        @Override // com.google.common.util.concurrent.AggregateFutureState.AtomicHelper
        final int decrementAndGetRemainingCount(com.google.common.util.concurrent.AggregateFutureState<?> aggregateFutureState) {
            int i;
            synchronized (aggregateFutureState) {
                i = aggregateFutureState.remainingField - 1;
                aggregateFutureState.remainingField = i;
            }
            return i;
        }

        @Override // com.google.common.util.concurrent.AggregateFutureState.AtomicHelper
        final java.lang.String atomicHelperTypeForTest() {
            return "SynchronizedAtomicHelper";
        }
    }
}
