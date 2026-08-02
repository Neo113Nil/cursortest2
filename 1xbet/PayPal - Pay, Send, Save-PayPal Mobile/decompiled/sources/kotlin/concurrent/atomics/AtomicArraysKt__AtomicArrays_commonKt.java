package kotlin.concurrent.atomics;

@kotlin.Metadata(d1 = {"\u0000*\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a.\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0005H\u0087\u0088\u0004ø\u0001\u0000¢\u0006\u0002\u0010\u0006\u001a\u001b\u0010\u0007\u001a\u00020\u0003*\u00020\u00012\u0006\u0010\b\u001a\u00020\u0003H\u0087\u0080\u0004¢\u0006\u0002\u0010\t\u001a\u001b\u0010\n\u001a\u00020\u0003*\u00020\u00012\u0006\u0010\b\u001a\u00020\u0003H\u0087\u0080\u0004¢\u0006\u0002\u0010\t\u001a\u001b\u0010\u000b\u001a\u00020\u0003*\u00020\u00012\u0006\u0010\b\u001a\u00020\u0003H\u0087\u0080\u0004¢\u0006\u0002\u0010\t\u001a\u001b\u0010\f\u001a\u00020\u0003*\u00020\u00012\u0006\u0010\b\u001a\u00020\u0003H\u0087\u0080\u0004¢\u0006\u0002\u0010\t\u001a.\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0002\u001a\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000f0\u0005H\u0087\u0088\u0004ø\u0001\u0000¢\u0006\u0002\u0010\u0010\u001a\u001b\u0010\u0007\u001a\u00020\u000f*\u00020\u000e2\u0006\u0010\b\u001a\u00020\u0003H\u0087\u0080\u0004¢\u0006\u0002\u0010\u0011\u001a\u001b\u0010\n\u001a\u00020\u000f*\u00020\u000e2\u0006\u0010\b\u001a\u00020\u0003H\u0087\u0080\u0004¢\u0006\u0002\u0010\u0011\u001a\u001b\u0010\u000b\u001a\u00020\u000f*\u00020\u000e2\u0006\u0010\b\u001a\u00020\u0003H\u0087\u0080\u0004¢\u0006\u0002\u0010\u0011\u001a\u001b\u0010\f\u001a\u00020\u000f*\u00020\u000e2\u0006\u0010\b\u001a\u00020\u0003H\u0087\u0080\u0004¢\u0006\u0002\u0010\u0011\u001a<\u0010\u0012\u001a\b\u0012\u0004\u0012\u0002H\u00140\u0013\"\u0006\b\u0000\u0010\u0014\u0018\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u0002H\u00140\u0005H\u0087\u0088\u0004ø\u0001\u0000¢\u0006\u0002\u0010\u0015\u001a'\u0010\u0016\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001H\u00140\u0013\"\u0006\b\u0000\u0010\u0014\u0018\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0087\u0088\u0004¢\u0006\u0002\u0010\u0017\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0018"}, d2 = {"AtomicIntArray", "Lkotlin/concurrent/atomics/AtomicIntArray;", io.ktor.http.ContentDisposition.Parameters.Size, "", "init", "Lkotlin/Function1;", "(ILkotlin/jvm/functions/Function1;)Ljava/util/concurrent/atomic/AtomicIntegerArray;", "fetchAndIncrementAt", "index", "(Ljava/util/concurrent/atomic/AtomicIntegerArray;I)I", "incrementAndFetchAt", "decrementAndFetchAt", "fetchAndDecrementAt", "AtomicLongArray", "Lkotlin/concurrent/atomics/AtomicLongArray;", "", "(ILkotlin/jvm/functions/Function1;)Ljava/util/concurrent/atomic/AtomicLongArray;", "(Ljava/util/concurrent/atomic/AtomicLongArray;I)J", "AtomicArray", "Lkotlin/concurrent/atomics/AtomicArray;", "T", "(ILkotlin/jvm/functions/Function1;)Ljava/util/concurrent/atomic/AtomicReferenceArray;", "atomicArrayOfNulls", "(I)Ljava/util/concurrent/atomic/AtomicReferenceArray;", "kotlin-stdlib"}, k = 5, mv = {2, 3, 0}, xi = 49, xs = "kotlin/concurrent/atomics/AtomicArraysKt")
/* loaded from: classes17.dex */
class AtomicArraysKt__AtomicArrays_commonKt {
    public static final java.util.concurrent.atomic.AtomicIntegerArray AtomicIntArray(int i, kotlin.jvm.functions.Function1<? super java.lang.Integer, java.lang.Integer> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        int[] iArr = new int[i];
        for (int i2 = 0; i2 < i; i2++) {
            iArr[i2] = function1.invoke(java.lang.Integer.valueOf(i2)).intValue();
        }
        return new java.util.concurrent.atomic.AtomicIntegerArray(iArr);
    }

    public static final int fetchAndIncrementAt(java.util.concurrent.atomic.AtomicIntegerArray atomicIntegerArray, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(atomicIntegerArray, "");
        return atomicIntegerArray.getAndAdd(i, 1);
    }

    public static final int incrementAndFetchAt(java.util.concurrent.atomic.AtomicIntegerArray atomicIntegerArray, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(atomicIntegerArray, "");
        return atomicIntegerArray.addAndGet(i, 1);
    }

    public static final int decrementAndFetchAt(java.util.concurrent.atomic.AtomicIntegerArray atomicIntegerArray, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(atomicIntegerArray, "");
        return atomicIntegerArray.addAndGet(i, -1);
    }

    public static final int fetchAndDecrementAt(java.util.concurrent.atomic.AtomicIntegerArray atomicIntegerArray, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(atomicIntegerArray, "");
        return atomicIntegerArray.getAndAdd(i, -1);
    }

    public static final java.util.concurrent.atomic.AtomicLongArray AtomicLongArray(int i, kotlin.jvm.functions.Function1<? super java.lang.Integer, java.lang.Long> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        long[] jArr = new long[i];
        for (int i2 = 0; i2 < i; i2++) {
            jArr[i2] = function1.invoke(java.lang.Integer.valueOf(i2)).longValue();
        }
        return new java.util.concurrent.atomic.AtomicLongArray(jArr);
    }

    public static final long fetchAndIncrementAt(java.util.concurrent.atomic.AtomicLongArray atomicLongArray, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(atomicLongArray, "");
        return atomicLongArray.getAndAdd(i, 1L);
    }

    public static final long incrementAndFetchAt(java.util.concurrent.atomic.AtomicLongArray atomicLongArray, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(atomicLongArray, "");
        return atomicLongArray.addAndGet(i, 1L);
    }

    public static final long decrementAndFetchAt(java.util.concurrent.atomic.AtomicLongArray atomicLongArray, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(atomicLongArray, "");
        return atomicLongArray.addAndGet(i, -1L);
    }

    public static final long fetchAndDecrementAt(java.util.concurrent.atomic.AtomicLongArray atomicLongArray, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(atomicLongArray, "");
        return atomicLongArray.getAndAdd(i, -1L);
    }

    public static final /* synthetic */ <T> java.util.concurrent.atomic.AtomicReferenceArray<T> AtomicArray(int i, kotlin.jvm.functions.Function1<? super java.lang.Integer, ? extends T> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(0, "T");
        java.lang.Object[] objArr = new java.lang.Object[i];
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = function1.invoke(java.lang.Integer.valueOf(i2));
        }
        return new java.util.concurrent.atomic.AtomicReferenceArray<>(objArr);
    }

    public static final /* synthetic */ <T> java.util.concurrent.atomic.AtomicReferenceArray<T> atomicArrayOfNulls(int i) {
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(0, "T?");
        java.lang.Object[] objArr = new java.lang.Object[i];
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        return new java.util.concurrent.atomic.AtomicReferenceArray<>(objArr);
    }
}
