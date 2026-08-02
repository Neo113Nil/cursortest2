package p000;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public abstract class h61 {

    /* JADX INFO: renamed from: a */
    public static final f61 f3071a = new f61(new byte[0], 0, 0, false);

    /* JADX INFO: renamed from: b */
    public static final int f3072b;

    /* JADX INFO: renamed from: c */
    public static final AtomicReference[] f3073c;

    static {
        int iHighestOneBit = Integer.highestOneBit((Runtime.getRuntime().availableProcessors() * 2) - 1);
        f3072b = iHighestOneBit;
        AtomicReference[] atomicReferenceArr = new AtomicReference[iHighestOneBit];
        for (int i = 0; i < iHighestOneBit; i++) {
            atomicReferenceArr[i] = new AtomicReference();
        }
        f3073c = atomicReferenceArr;
    }

    /* JADX INFO: renamed from: a */
    public static final void m2219a(f61 f61Var) {
        f61Var.getClass();
        if (f61Var.f2324f != null || f61Var.f2325g != null) {
            C0270h1.m2190f("Failed requirement.");
            return;
        }
        if (f61Var.f2322d) {
            return;
        }
        AtomicReference atomicReference = f3073c[(int) (Thread.currentThread().getId() & (((long) f3072b) - 1))];
        f61 f61Var2 = f3071a;
        f61 f61Var3 = (f61) atomicReference.getAndSet(f61Var2);
        if (f61Var3 == f61Var2) {
            return;
        }
        int i = f61Var3 != null ? f61Var3.f2321c : 0;
        if (i >= 65536) {
            atomicReference.set(f61Var3);
            return;
        }
        f61Var.f2324f = f61Var3;
        f61Var.f2320b = 0;
        f61Var.f2321c = i + 8192;
        atomicReference.set(f61Var);
    }

    /* JADX INFO: renamed from: b */
    public static final f61 m2220b() {
        AtomicReference atomicReference = f3073c[(int) (Thread.currentThread().getId() & (((long) f3072b) - 1))];
        f61 f61Var = f3071a;
        f61 f61Var2 = (f61) atomicReference.getAndSet(f61Var);
        if (f61Var2 == f61Var) {
            return new f61();
        }
        if (f61Var2 == null) {
            atomicReference.set(null);
            return new f61();
        }
        atomicReference.set(f61Var2.f2324f);
        f61Var2.f2324f = null;
        f61Var2.f2321c = 0;
        return f61Var2;
    }
}
