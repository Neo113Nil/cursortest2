package Cc;

import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReferenceArray;
import tc.InterfaceC9807i;

/* loaded from: classes.dex */
public final class c<T> implements InterfaceC9807i<T> {

    /* renamed from: i, reason: collision with root package name */
    static final int f4665i = Integer.getInteger("jctools.spsc.max.lookahead.step", 4096).intValue();

    /* renamed from: j, reason: collision with root package name */
    private static final Object f4666j = new Object();

    /* renamed from: a, reason: collision with root package name */
    final AtomicLong f4667a;

    /* renamed from: b, reason: collision with root package name */
    int f4668b;

    /* renamed from: c, reason: collision with root package name */
    long f4669c;

    /* renamed from: d, reason: collision with root package name */
    final int f4670d;

    /* renamed from: e, reason: collision with root package name */
    AtomicReferenceArray<Object> f4671e;

    /* renamed from: f, reason: collision with root package name */
    final int f4672f;

    /* renamed from: g, reason: collision with root package name */
    AtomicReferenceArray<Object> f4673g;

    /* renamed from: h, reason: collision with root package name */
    final AtomicLong f4674h;

    public c(int i11) {
        AtomicLong atomicLong = new AtomicLong();
        this.f4667a = atomicLong;
        this.f4674h = new AtomicLong();
        int numberOfLeadingZeros = 1 << (32 - Integer.numberOfLeadingZeros(Math.max(8, i11) - 1));
        int i12 = numberOfLeadingZeros - 1;
        AtomicReferenceArray<Object> atomicReferenceArray = new AtomicReferenceArray<>(numberOfLeadingZeros + 1);
        this.f4671e = atomicReferenceArray;
        this.f4670d = i12;
        this.f4668b = Math.min(numberOfLeadingZeros / 4, f4665i);
        this.f4673g = atomicReferenceArray;
        this.f4672f = i12;
        this.f4669c = numberOfLeadingZeros - 2;
        atomicLong.lazySet(0L);
    }

    public final void b(Number number, Object obj) {
        AtomicReferenceArray<Object> atomicReferenceArray = this.f4671e;
        AtomicLong atomicLong = this.f4667a;
        long j11 = atomicLong.get();
        long j12 = 2 + j11;
        int i11 = this.f4670d;
        if (atomicReferenceArray.get(((int) j12) & i11) == null) {
            int i12 = ((int) j11) & i11;
            atomicReferenceArray.lazySet(i12 + 1, obj);
            atomicReferenceArray.lazySet(i12, number);
            atomicLong.lazySet(j12);
            return;
        }
        AtomicReferenceArray<Object> atomicReferenceArray2 = new AtomicReferenceArray<>(atomicReferenceArray.length());
        this.f4671e = atomicReferenceArray2;
        int i13 = ((int) j11) & i11;
        atomicReferenceArray2.lazySet(i13 + 1, obj);
        atomicReferenceArray2.lazySet(i13, number);
        atomicReferenceArray.lazySet(atomicReferenceArray.length() - 1, atomicReferenceArray2);
        atomicReferenceArray.lazySet(i13, f4666j);
        atomicLong.lazySet(j12);
    }

    public final T c() {
        AtomicReferenceArray<Object> atomicReferenceArray = this.f4673g;
        int i11 = (int) this.f4674h.get();
        int i12 = this.f4672f;
        int i13 = i11 & i12;
        T t2 = (T) atomicReferenceArray.get(i13);
        if (t2 != f4666j) {
            return t2;
        }
        int i14 = i12 + 1;
        AtomicReferenceArray<Object> atomicReferenceArray2 = (AtomicReferenceArray) atomicReferenceArray.get(i14);
        atomicReferenceArray.lazySet(i14, null);
        this.f4673g = atomicReferenceArray2;
        return (T) atomicReferenceArray2.get(i13);
    }

    @Override // tc.InterfaceC9808j
    public final void clear() {
        while (true) {
            if (poll() == null && isEmpty()) {
                return;
            }
        }
    }

    public final int d() {
        AtomicLong atomicLong = this.f4674h;
        long j11 = atomicLong.get();
        while (true) {
            long j12 = this.f4667a.get();
            long j13 = atomicLong.get();
            if (j11 == j13) {
                return (int) (j12 - j13);
            }
            j11 = j13;
        }
    }

    @Override // tc.InterfaceC9808j
    public final boolean isEmpty() {
        return this.f4667a.get() == this.f4674h.get();
    }

    @Override // tc.InterfaceC9808j
    public final boolean offer(T t2) {
        if (t2 == null) {
            throw new NullPointerException("Null is not a valid element");
        }
        AtomicReferenceArray<Object> atomicReferenceArray = this.f4671e;
        AtomicLong atomicLong = this.f4667a;
        long j11 = atomicLong.get();
        int i11 = this.f4670d;
        int i12 = ((int) j11) & i11;
        if (j11 < this.f4669c) {
            atomicReferenceArray.lazySet(i12, t2);
            atomicLong.lazySet(j11 + 1);
            return true;
        }
        long j12 = this.f4668b + j11;
        if (atomicReferenceArray.get(((int) j12) & i11) == null) {
            this.f4669c = j12 - 1;
            atomicReferenceArray.lazySet(i12, t2);
            atomicLong.lazySet(j11 + 1);
            return true;
        }
        long j13 = j11 + 1;
        if (atomicReferenceArray.get(((int) j13) & i11) == null) {
            atomicReferenceArray.lazySet(i12, t2);
            atomicLong.lazySet(j13);
            return true;
        }
        AtomicReferenceArray<Object> atomicReferenceArray2 = new AtomicReferenceArray<>(atomicReferenceArray.length());
        this.f4671e = atomicReferenceArray2;
        this.f4669c = (j11 + i11) - 1;
        atomicReferenceArray2.lazySet(i12, t2);
        atomicReferenceArray.lazySet(atomicReferenceArray.length() - 1, atomicReferenceArray2);
        atomicReferenceArray.lazySet(i12, f4666j);
        atomicLong.lazySet(j13);
        return true;
    }

    @Override // tc.InterfaceC9808j
    public final T poll() {
        AtomicReferenceArray<Object> atomicReferenceArray = this.f4673g;
        AtomicLong atomicLong = this.f4674h;
        long j11 = atomicLong.get();
        int i11 = this.f4672f;
        int i12 = ((int) j11) & i11;
        T t2 = (T) atomicReferenceArray.get(i12);
        boolean z11 = t2 == f4666j;
        if (t2 != null && !z11) {
            atomicReferenceArray.lazySet(i12, null);
            atomicLong.lazySet(j11 + 1);
            return t2;
        }
        if (!z11) {
            return null;
        }
        int i13 = i11 + 1;
        AtomicReferenceArray<Object> atomicReferenceArray2 = (AtomicReferenceArray) atomicReferenceArray.get(i13);
        atomicReferenceArray.lazySet(i13, null);
        this.f4673g = atomicReferenceArray2;
        T t11 = (T) atomicReferenceArray2.get(i12);
        if (t11 != null) {
            atomicReferenceArray2.lazySet(i12, null);
            atomicLong.lazySet(j11 + 1);
        }
        return t11;
    }
}
