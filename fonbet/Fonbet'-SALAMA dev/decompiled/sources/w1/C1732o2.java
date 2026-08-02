package w1;

/* renamed from: w1.o2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1732o2 extends C1704h2 {
    @Override // java.util.concurrent.FutureTask
    public final void done() {
        AbstractC1736p2 abstractC1736p2 = this.f17730a;
        synchronized (abstractC1736p2) {
            try {
                if (abstractC1736p2.f17826e == this) {
                    abstractC1736p2.f17826e = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        abstractC1736p2.b();
    }
}
