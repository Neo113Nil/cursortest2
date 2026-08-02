package p000;

/* JADX INFO: renamed from: zq */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class C0960zq extends AbstractC0893xx {

    /* JADX INFO: renamed from: m */
    public static final C0960zq f9905m;

    /* JADX INFO: renamed from: l */
    public ExecutorC0439ln f9906l;

    static {
        int i = tc1.f7433c;
        int i2 = tc1.f7434d;
        long j = tc1.f7435e;
        String str = tc1.f7431a;
        C0960zq c0960zq = new C0960zq();
        c0960zq.f9906l = new ExecutorC0439ln(i, i2, j, str);
        f9905m = c0960zq;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new UnsupportedOperationException("Dispatchers.Default cannot be closed");
    }

    @Override // p000.AbstractC0292hn
    /* JADX INFO: renamed from: o */
    public final void mo1225o(InterfaceC0180en interfaceC0180en, Runnable runnable) {
        this.f9906l.m3231e(runnable, false);
    }

    @Override // p000.AbstractC0292hn
    public final String toString() {
        return "Dispatchers.Default";
    }
}
