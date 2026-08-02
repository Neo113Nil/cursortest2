package L4;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public abstract class E {

    /* renamed from: a, reason: collision with root package name */
    public static final D f3059a = new D(new byte[0], 0, 0, false);

    /* renamed from: b, reason: collision with root package name */
    public static final int f3060b;

    /* renamed from: c, reason: collision with root package name */
    public static final AtomicReference[] f3061c;

    static {
        int highestOneBit = Integer.highestOneBit((Runtime.getRuntime().availableProcessors() * 2) - 1);
        f3060b = highestOneBit;
        AtomicReference[] atomicReferenceArr = new AtomicReference[highestOneBit];
        for (int i = 0; i < highestOneBit; i++) {
            atomicReferenceArr[i] = new AtomicReference();
        }
        f3061c = atomicReferenceArr;
    }

    public static final void a(D d5) {
        kotlin.jvm.internal.l.f("segment", d5);
        if (d5.f != null || d5.f3058g != null) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (d5.f3056d) {
            return;
        }
        AtomicReference atomicReference = f3061c[(int) (Thread.currentThread().getId() & (f3060b - 1))];
        D d6 = f3059a;
        D d7 = (D) atomicReference.getAndSet(d6);
        if (d7 == d6) {
            return;
        }
        int i = d7 != null ? d7.f3055c : 0;
        if (i >= 65536) {
            atomicReference.set(d7);
            return;
        }
        d5.f = d7;
        d5.f3054b = 0;
        d5.f3055c = i + 8192;
        atomicReference.set(d5);
    }

    public static final D b() {
        AtomicReference atomicReference = f3061c[(int) (Thread.currentThread().getId() & (f3060b - 1))];
        D d5 = f3059a;
        D d6 = (D) atomicReference.getAndSet(d5);
        if (d6 == d5) {
            return new D();
        }
        if (d6 == null) {
            atomicReference.set(null);
            return new D();
        }
        atomicReference.set(d6.f);
        d6.f = null;
        d6.f3055c = 0;
        return d6;
    }
}
