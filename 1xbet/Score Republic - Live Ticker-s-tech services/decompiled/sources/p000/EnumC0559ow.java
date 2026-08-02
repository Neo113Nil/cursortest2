package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: ow */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC0559ow implements fz0 {

    /* JADX INFO: renamed from: j */
    public static final EnumC0559ow f5924j;

    /* JADX INFO: renamed from: k */
    public static final /* synthetic */ EnumC0559ow[] f5925k;

    static {
        EnumC0559ow enumC0559ow = new EnumC0559ow("INSTANCE", 0);
        f5924j = enumC0559ow;
        f5925k = new EnumC0559ow[]{enumC0559ow};
    }

    /* JADX INFO: renamed from: a */
    public static void m3801a(y30 y30Var) {
        y30Var.mo933e(f5924j);
        y30Var.onComplete();
    }

    /* JADX INFO: renamed from: b */
    public static void m3802b(Throwable th, y30 y30Var) {
        y30Var.mo933e(f5924j);
        y30Var.onError(th);
    }

    public static EnumC0559ow valueOf(String str) {
        return (EnumC0559ow) Enum.valueOf(EnumC0559ow.class, str);
    }

    public static EnumC0559ow[] values() {
        return (EnumC0559ow[]) f5925k.clone();
    }

    @Override // p000.ez0
    /* JADX INFO: renamed from: f */
    public final int mo592f(int i) {
        return 2;
    }

    @Override // p000.y71
    public final boolean isEmpty() {
        return true;
    }

    @Override // p000.y71
    public final boolean offer(Object obj) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // p000.y71
    public final Object poll() {
        return null;
    }

    @Override // p000.ib1
    public final void request(long j) {
        jb1.m2845c(j);
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "EmptySubscription";
    }

    @Override // p000.ib1
    public final void cancel() {
    }

    @Override // p000.y71
    public final void clear() {
    }
}
