package p155w1;

/* JADX INFO: renamed from: w1.o2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1023o2 extends C0995h2 {
    @Override // java.util.concurrent.FutureTask
    public final void done() {
        AbstractC1027p2 abstractC1027p2 = this.f17736a;
        synchronized (abstractC1027p2) {
            try {
                if (abstractC1027p2.f17832e == this) {
                    abstractC1027p2.f17832e = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        abstractC1027p2.b();
    }
}
