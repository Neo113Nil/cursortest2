package p000;

import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class s91 extends AtomicReferenceArray implements x71 {

    /* JADX INFO: renamed from: o */
    public static final Integer f7070o = Integer.getInteger("jctools.spsc.max.lookahead.step", 4096);

    /* JADX INFO: renamed from: j */
    public final int f7071j;

    /* JADX INFO: renamed from: k */
    public final AtomicLong f7072k;

    /* JADX INFO: renamed from: l */
    public long f7073l;

    /* JADX INFO: renamed from: m */
    public final AtomicLong f7074m;

    /* JADX INFO: renamed from: n */
    public final int f7075n;

    public s91(int i) {
        super(1 << (32 - Integer.numberOfLeadingZeros(i - 1)));
        this.f7071j = length() - 1;
        this.f7072k = new AtomicLong();
        this.f7074m = new AtomicLong();
        this.f7075n = Math.min(i / 4, f7070o.intValue());
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
        return this.f7072k.get() == this.f7074m.get();
    }

    @Override // p000.y71
    public final boolean offer(Object obj) {
        if (obj == null) {
            C0270h1.m2192h("Null is not a valid element");
            return false;
        }
        AtomicLong atomicLong = this.f7072k;
        long j = atomicLong.get();
        int i = this.f7071j;
        int i2 = ((int) j) & i;
        if (j >= this.f7073l) {
            long j2 = ((long) this.f7075n) + j;
            if (get(i & ((int) j2)) == null) {
                this.f7073l = j2;
            } else if (get(i2) != null) {
                return false;
            }
        }
        lazySet(i2, obj);
        atomicLong.lazySet(j + 1);
        return true;
    }

    @Override // p000.y71
    public final Object poll() {
        AtomicLong atomicLong = this.f7074m;
        long j = atomicLong.get();
        int i = ((int) j) & this.f7071j;
        Object obj = get(i);
        if (obj == null) {
            return null;
        }
        atomicLong.lazySet(j + 1);
        lazySet(i, null);
        return obj;
    }
}
