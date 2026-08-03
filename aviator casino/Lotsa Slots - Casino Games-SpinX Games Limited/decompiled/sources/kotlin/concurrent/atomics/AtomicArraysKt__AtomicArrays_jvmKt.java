package kotlin.concurrent.atomics;

/* compiled from: AtomicArrays.jvm.kt */
@kotlin.Metadata(d1 = {"\u0000&\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0011\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0007¢\u0006\u0002\u0010\u0003\u001a\u0011\u0010\u0004\u001a\u00020\u0002*\u00020\u0001H\u0007¢\u0006\u0002\u0010\u0003\u001a\u0011\u0010\u0000\u001a\u00020\u0005*\u00020\u0006H\u0007¢\u0006\u0002\u0010\u0007\u001a\u0011\u0010\u0004\u001a\u00020\u0006*\u00020\u0005H\u0007¢\u0006\u0002\u0010\u0007\u001a#\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\t0\b\"\u0004\b\u0000\u0010\t*\b\u0012\u0004\u0012\u0002H\t0\nH\u0007¢\u0006\u0002\u0010\u000b\u001a#\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\t0\n\"\u0004\b\u0000\u0010\t*\b\u0012\u0004\u0012\u0002H\t0\bH\u0007¢\u0006\u0002\u0010\u000b¨\u0006\f"}, d2 = {"asJavaAtomicArray", "Ljava/util/concurrent/atomic/AtomicIntegerArray;", "Lkotlin/concurrent/atomics/AtomicIntArray;", "(Ljava/util/concurrent/atomic/AtomicIntegerArray;)Ljava/util/concurrent/atomic/AtomicIntegerArray;", "asKotlinAtomicArray", "Ljava/util/concurrent/atomic/AtomicLongArray;", "Lkotlin/concurrent/atomics/AtomicLongArray;", "(Ljava/util/concurrent/atomic/AtomicLongArray;)Ljava/util/concurrent/atomic/AtomicLongArray;", "Ljava/util/concurrent/atomic/AtomicReferenceArray;", "T", "Lkotlin/concurrent/atomics/AtomicArray;", "(Ljava/util/concurrent/atomic/AtomicReferenceArray;)Ljava/util/concurrent/atomic/AtomicReferenceArray;", "kotlin-stdlib"}, k = 5, mv = {2, 1, 0}, xi = 49, xs = "kotlin/concurrent/atomics/AtomicArraysKt")
/* loaded from: classes6.dex */
class AtomicArraysKt__AtomicArrays_jvmKt extends kotlin.concurrent.atomics.AtomicArraysKt__AtomicArrays_commonKt {
    public static final java.util.concurrent.atomic.AtomicIntegerArray asJavaAtomicArray(java.util.concurrent.atomic.AtomicIntegerArray atomicIntegerArray) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(atomicIntegerArray, "<this>");
        return atomicIntegerArray;
    }

    public static final java.util.concurrent.atomic.AtomicLongArray asJavaAtomicArray(java.util.concurrent.atomic.AtomicLongArray atomicLongArray) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(atomicLongArray, "<this>");
        return atomicLongArray;
    }

    public static final <T> java.util.concurrent.atomic.AtomicReferenceArray<T> asJavaAtomicArray(java.util.concurrent.atomic.AtomicReferenceArray<T> atomicReferenceArray) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(atomicReferenceArray, "<this>");
        return atomicReferenceArray;
    }

    public static final java.util.concurrent.atomic.AtomicIntegerArray asKotlinAtomicArray(java.util.concurrent.atomic.AtomicIntegerArray atomicIntegerArray) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(atomicIntegerArray, "<this>");
        return atomicIntegerArray;
    }

    public static final java.util.concurrent.atomic.AtomicLongArray asKotlinAtomicArray(java.util.concurrent.atomic.AtomicLongArray atomicLongArray) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(atomicLongArray, "<this>");
        return atomicLongArray;
    }

    public static final <T> java.util.concurrent.atomic.AtomicReferenceArray<T> asKotlinAtomicArray(java.util.concurrent.atomic.AtomicReferenceArray<T> atomicReferenceArray) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(atomicReferenceArray, "<this>");
        return atomicReferenceArray;
    }
}
