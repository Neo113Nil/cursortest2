package kotlinx.coroutines.internal;

@kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B#\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00028\u00000\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0004H\u0082\bJ\r\u0010\u000e\u001a\u00020\u000f*\u00020\u0004H\u0082\bJ\u0006\u0010\u0010\u001a\u00020\u000fJ\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u0012J\r\u0010\u0013\u001a\u00020\u0014H\u0000¢\u0006\u0002\b\u0015J\b\u0010\u0016\u001a\u00020\u0014H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00028\u00000\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\t\u0010\t\u001a\u00020\nX\u0082\u0004R\u0011\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\fX\u0082\u0004¨\u0006\u0017"}, d2 = {"Lkotlinx/coroutines/internal/OnDemandAllocatingPool;", "T", "", "maxCapacity", "", "create", "Lkotlin/Function1;", "<init>", "(ILkotlin/jvm/functions/Function1;)V", "controlState", "Lkotlinx/atomicfu/AtomicInt;", "elements", "Lkotlinx/atomicfu/AtomicArray;", "tryForbidNewElements", "isClosed", "", "allocate", "close", "", "stateRepresentation", "", "stateRepresentation$kotlinx_coroutines_core", "toString", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class OnDemandAllocatingPool<T> {
    private static final /* synthetic */ java.util.concurrent.atomic.AtomicIntegerFieldUpdater getHighSpeedVideoFpsRanges = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(kotlinx.coroutines.internal.OnDemandAllocatingPool.class, "controlState$volatile");
    private final int Camera2StreamConfigurationMap;
    private volatile /* synthetic */ int controlState$volatile;
    private final kotlin.jvm.functions.Function1<java.lang.Integer, T> getHighResolutionOutputSizeshNQ4ISI;
    private final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceArray getHighSpeedVideoSizes;

    /* JADX WARN: Multi-variable type inference failed */
    public OnDemandAllocatingPool(int i, kotlin.jvm.functions.Function1<? super java.lang.Integer, ? extends T> function1) {
        this.Camera2StreamConfigurationMap = i;
        this.getHighResolutionOutputSizeshNQ4ISI = function1;
        this.getHighSpeedVideoSizes = new java.util.concurrent.atomic.AtomicReferenceArray(i);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("OnDemandAllocatingPool(");
        sb.append(stateRepresentation$kotlinx_coroutines_core());
        sb.append(')');
        return sb.toString();
    }

    public final boolean allocate() {
        int i;
        java.util.concurrent.atomic.AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = getHighSpeedVideoFpsRanges;
        do {
            i = atomicIntegerFieldUpdater.get(this);
            if ((Integer.MIN_VALUE & i) != 0) {
                return false;
            }
            if (i >= this.Camera2StreamConfigurationMap) {
                return true;
            }
        } while (!getHighSpeedVideoFpsRanges.compareAndSet(this, i, i + 1));
        this.getHighSpeedVideoSizes.set(i, this.getHighResolutionOutputSizeshNQ4ISI.invoke(java.lang.Integer.valueOf(i)));
        return true;
    }

    public final java.util.List<T> close() {
        int i;
        java.lang.Object andSet;
        java.util.concurrent.atomic.AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = getHighSpeedVideoFpsRanges;
        while (true) {
            i = atomicIntegerFieldUpdater.get(this);
            if ((i & Integer.MIN_VALUE) != 0) {
                i = 0;
                break;
            }
            if (getHighSpeedVideoFpsRanges.compareAndSet(this, i, Integer.MIN_VALUE | i)) {
                break;
            }
        }
        kotlin.ranges.IntRange until = kotlin.ranges.RangesKt.until(0, i);
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(until, 10));
        java.util.Iterator<java.lang.Integer> it = until.iterator();
        while (it.hasNext()) {
            int nextInt = ((kotlin.collections.IntIterator) it).nextInt();
            do {
                andSet = this.getHighSpeedVideoSizes.getAndSet(nextInt, null);
            } while (andSet == null);
            arrayList.add(andSet);
        }
        return arrayList;
    }

    public final java.lang.String stateRepresentation$kotlinx_coroutines_core() {
        int i = getHighSpeedVideoFpsRanges.get(this);
        kotlin.ranges.IntRange until = kotlin.ranges.RangesKt.until(0, Integer.MAX_VALUE & i);
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(until, 10));
        java.util.Iterator<java.lang.Integer> it = until.iterator();
        while (it.hasNext()) {
            arrayList.add(this.getHighSpeedVideoSizes.get(((kotlin.collections.IntIterator) it).nextInt()));
        }
        java.lang.String obj = arrayList.toString();
        java.lang.String str = (i & Integer.MIN_VALUE) != 0 ? "[closed]" : "";
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(obj);
        sb.append(str);
        return sb.toString();
    }
}
