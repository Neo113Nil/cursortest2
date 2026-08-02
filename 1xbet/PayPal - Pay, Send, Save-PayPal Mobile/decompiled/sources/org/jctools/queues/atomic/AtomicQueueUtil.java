package org.jctools.queues.atomic;

/* loaded from: classes18.dex */
final class AtomicQueueUtil {
    static int calcCircularLongElementOffset(long j, int i) {
        return (int) (j & i);
    }

    static int calcCircularRefElementOffset(long j, long j2) {
        return (int) (j & j2);
    }

    static int calcRefElementOffset(long j) {
        return (int) j;
    }

    static int modifiedCalcCircularRefElementOffset(long j, long j2) {
        return ((int) (j & j2)) >> 1;
    }

    AtomicQueueUtil() {
    }

    static <E> E lvRefElement(java.util.concurrent.atomic.AtomicReferenceArray<E> atomicReferenceArray, int i) {
        return atomicReferenceArray.get(i);
    }

    static <E> E lpRefElement(java.util.concurrent.atomic.AtomicReferenceArray<E> atomicReferenceArray, int i) {
        return atomicReferenceArray.get(i);
    }

    static <E> void spRefElement(java.util.concurrent.atomic.AtomicReferenceArray<E> atomicReferenceArray, int i, E e) {
        atomicReferenceArray.lazySet(i, e);
    }

    static void soRefElement(java.util.concurrent.atomic.AtomicReferenceArray atomicReferenceArray, int i, java.lang.Object obj) {
        atomicReferenceArray.lazySet(i, obj);
    }

    static <E> java.util.concurrent.atomic.AtomicReferenceArray<E> allocateRefArray(int i) {
        return new java.util.concurrent.atomic.AtomicReferenceArray<>(i);
    }

    static void soLongElement(java.util.concurrent.atomic.AtomicLongArray atomicLongArray, int i, long j) {
        atomicLongArray.lazySet(i, j);
    }

    static long lvLongElement(java.util.concurrent.atomic.AtomicLongArray atomicLongArray, int i) {
        return atomicLongArray.get(i);
    }

    static int length(java.util.concurrent.atomic.AtomicReferenceArray<?> atomicReferenceArray) {
        return atomicReferenceArray.length();
    }

    static int nextArrayOffset(java.util.concurrent.atomic.AtomicReferenceArray<?> atomicReferenceArray) {
        return length(atomicReferenceArray) - 1;
    }
}
