package p000;

import java.io.Closeable;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class un1 implements Closeable {

    /* JADX INFO: renamed from: k */
    public static final C0229fz f7864k = new C0229fz(1);

    /* JADX INFO: renamed from: j */
    public int f7865j;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        int i = this.f7865j;
        if (i <= 0) {
            throw new AssertionError("Mismatched calls to RecursionDepth (possible error in core library)");
        }
        this.f7865j = i - 1;
    }
}
