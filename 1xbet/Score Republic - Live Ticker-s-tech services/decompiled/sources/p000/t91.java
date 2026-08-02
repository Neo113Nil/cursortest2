package p000;

import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class t91 implements x71 {

    /* JADX INFO: renamed from: r */
    public static final int f7361r = Integer.getInteger("jctools.spsc.max.lookahead.step", 4096).intValue();

    /* JADX INFO: renamed from: s */
    public static final Object f7362s = new Object();

    /* JADX INFO: renamed from: j */
    public final AtomicLong f7363j;

    /* JADX INFO: renamed from: k */
    public final int f7364k;

    /* JADX INFO: renamed from: l */
    public long f7365l;

    /* JADX INFO: renamed from: m */
    public final int f7366m;

    /* JADX INFO: renamed from: n */
    public AtomicReferenceArray f7367n;

    /* JADX INFO: renamed from: o */
    public final int f7368o;

    /* JADX INFO: renamed from: p */
    public AtomicReferenceArray f7369p;

    /* JADX INFO: renamed from: q */
    public final AtomicLong f7370q;

    public t91(int i) {
        AtomicLong atomicLong = new AtomicLong();
        this.f7363j = atomicLong;
        this.f7370q = new AtomicLong();
        int iNumberOfLeadingZeros = 1 << (32 - Integer.numberOfLeadingZeros(Math.max(8, i) - 1));
        int i2 = iNumberOfLeadingZeros - 1;
        AtomicReferenceArray atomicReferenceArray = new AtomicReferenceArray(iNumberOfLeadingZeros + 1);
        this.f7367n = atomicReferenceArray;
        this.f7366m = i2;
        this.f7364k = Math.min(iNumberOfLeadingZeros / 4, f7361r);
        this.f7369p = atomicReferenceArray;
        this.f7368o = i2;
        this.f7365l = iNumberOfLeadingZeros - 2;
        atomicLong.lazySet(0L);
    }

    @Override // p000.y71
    public final void clear() {
        while (true) {
            if (poll() == null && isEmpty()) {
                return;
            }
        }
    }

    @Override // p000.y71
    public final boolean isEmpty() {
        return this.f7363j.get() == this.f7370q.get();
    }

    @Override // p000.y71
    public final boolean offer(Object obj) {
        if (obj == null) {
            C0270h1.m2192h("Null is not a valid element");
            return false;
        }
        AtomicReferenceArray atomicReferenceArray = this.f7367n;
        AtomicLong atomicLong = this.f7363j;
        long j = atomicLong.get();
        int i = this.f7366m;
        int i2 = ((int) j) & i;
        if (j < this.f7365l) {
            atomicReferenceArray.lazySet(i2, obj);
            atomicLong.lazySet(j + 1);
            return true;
        }
        long j2 = ((long) this.f7364k) + j;
        if (atomicReferenceArray.get(((int) j2) & i) == null) {
            this.f7365l = j2 - 1;
            atomicReferenceArray.lazySet(i2, obj);
            atomicLong.lazySet(j + 1);
            return true;
        }
        long j3 = j + 1;
        if (atomicReferenceArray.get(((int) j3) & i) == null) {
            atomicReferenceArray.lazySet(i2, obj);
            atomicLong.lazySet(j3);
            return true;
        }
        AtomicReferenceArray atomicReferenceArray2 = new AtomicReferenceArray(atomicReferenceArray.length());
        this.f7367n = atomicReferenceArray2;
        this.f7365l = (j + ((long) i)) - 1;
        atomicReferenceArray2.lazySet(i2, obj);
        atomicReferenceArray.lazySet(atomicReferenceArray.length() - 1, atomicReferenceArray2);
        atomicReferenceArray.lazySet(i2, f7362s);
        atomicLong.lazySet(j3);
        return true;
    }

    @Override // p000.y71
    public final Object poll() {
        AtomicReferenceArray atomicReferenceArray = this.f7369p;
        AtomicLong atomicLong = this.f7370q;
        long j = atomicLong.get();
        int i = this.f7368o;
        int i2 = ((int) j) & i;
        Object obj = atomicReferenceArray.get(i2);
        boolean z = obj == f7362s;
        if (obj != null && !z) {
            atomicReferenceArray.lazySet(i2, null);
            atomicLong.lazySet(j + 1);
            return obj;
        }
        if (!z) {
            return null;
        }
        int i3 = i + 1;
        AtomicReferenceArray atomicReferenceArray2 = (AtomicReferenceArray) atomicReferenceArray.get(i3);
        atomicReferenceArray.lazySet(i3, null);
        this.f7369p = atomicReferenceArray2;
        Object obj2 = atomicReferenceArray2.get(i2);
        if (obj2 != null) {
            atomicReferenceArray2.lazySet(i2, null);
            atomicLong.lazySet(j + 1);
        }
        return obj2;
    }
}
