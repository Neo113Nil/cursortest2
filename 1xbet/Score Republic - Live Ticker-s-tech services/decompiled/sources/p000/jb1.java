package p000;

import java.util.concurrent.atomic.AtomicReference;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class jb1 implements ib1 {

    /* JADX INFO: renamed from: j */
    public static final jb1 f3893j;

    /* JADX INFO: renamed from: k */
    public static final /* synthetic */ jb1[] f3894k;

    static {
        jb1 jb1Var = new jb1("CANCELLED", 0);
        f3893j = jb1Var;
        f3894k = new jb1[]{jb1Var};
    }

    /* JADX INFO: renamed from: a */
    public static void m2843a(AtomicReference atomicReference) {
        ib1 ib1Var;
        ib1 ib1Var2 = (ib1) atomicReference.get();
        jb1 jb1Var = f3893j;
        if (ib1Var2 == jb1Var || (ib1Var = (ib1) atomicReference.getAndSet(jb1Var)) == jb1Var || ib1Var == null) {
            return;
        }
        ib1Var.cancel();
    }

    /* JADX INFO: renamed from: b */
    public static boolean m2844b(AtomicReference atomicReference, ib1 ib1Var) {
        zg1.m5905p(ib1Var, "s is null");
        while (!atomicReference.compareAndSet(null, ib1Var)) {
            if (atomicReference.get() != null) {
                ib1Var.cancel();
                if (atomicReference.get() == f3893j) {
                    return false;
                }
                vt1.m5196h(new C0877xh("Subscription already set!"));
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: c */
    public static boolean m2845c(long j) {
        if (j > 0) {
            return true;
        }
        vt1.m5196h(new IllegalArgumentException("n > 0 required but it was " + j));
        return false;
    }

    /* JADX INFO: renamed from: d */
    public static boolean m2846d(ib1 ib1Var, ib1 ib1Var2) {
        if (ib1Var2 == null) {
            vt1.m5196h(new NullPointerException("next is null"));
            return false;
        }
        if (ib1Var == null) {
            return true;
        }
        ib1Var2.cancel();
        vt1.m5196h(new C0877xh("Subscription already set!"));
        return false;
    }

    public static jb1 valueOf(String str) {
        return (jb1) Enum.valueOf(jb1.class, str);
    }

    public static jb1[] values() {
        return (jb1[]) f3894k.clone();
    }

    @Override // p000.ib1
    public final void cancel() {
    }

    @Override // p000.ib1
    public final void request(long j) {
    }
}
