package Cc;

import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReferenceArray;
import tc.InterfaceC9807i;

/* loaded from: classes.dex */
public final class b<E> extends AtomicReferenceArray<E> implements InterfaceC9807i<E> {

    /* renamed from: f, reason: collision with root package name */
    private static final Integer f4659f = Integer.getInteger("jctools.spsc.max.lookahead.step", 4096);

    /* renamed from: a, reason: collision with root package name */
    final int f4660a;

    /* renamed from: b, reason: collision with root package name */
    final AtomicLong f4661b;

    /* renamed from: c, reason: collision with root package name */
    long f4662c;

    /* renamed from: d, reason: collision with root package name */
    final AtomicLong f4663d;

    /* renamed from: e, reason: collision with root package name */
    final int f4664e;

    public b(int i11) {
        super(1 << (32 - Integer.numberOfLeadingZeros(i11 - 1)));
        this.f4660a = length() - 1;
        this.f4661b = new AtomicLong();
        this.f4663d = new AtomicLong();
        this.f4664e = Math.min(i11 / 4, f4659f.intValue());
    }

    @Override // tc.InterfaceC9808j
    public final void clear() {
        while (true) {
            if (poll() == null && isEmpty()) {
                return;
            }
        }
    }

    @Override // tc.InterfaceC9808j
    public final boolean isEmpty() {
        return this.f4661b.get() == this.f4663d.get();
    }

    @Override // tc.InterfaceC9808j
    public final boolean offer(E e11) {
        if (e11 == null) {
            throw new NullPointerException("Null is not a valid element");
        }
        AtomicLong atomicLong = this.f4661b;
        long j11 = atomicLong.get();
        int i11 = this.f4660a;
        int i12 = ((int) j11) & i11;
        if (j11 >= this.f4662c) {
            long j12 = this.f4664e + j11;
            if (get(i11 & ((int) j12)) == null) {
                this.f4662c = j12;
            } else if (get(i12) != null) {
                return false;
            }
        }
        lazySet(i12, e11);
        atomicLong.lazySet(j11 + 1);
        return true;
    }

    @Override // tc.InterfaceC9808j
    public final E poll() {
        AtomicLong atomicLong = this.f4663d;
        long j11 = atomicLong.get();
        int i11 = ((int) j11) & this.f4660a;
        E e11 = get(i11);
        if (e11 == null) {
            return null;
        }
        atomicLong.lazySet(j11 + 1);
        lazySet(i11, null);
        return e11;
    }
}
