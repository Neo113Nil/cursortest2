package W5;

/* loaded from: classes2.dex */
public final class V1 extends Z1 {
    @Override // W5.Z1
    public final boolean r(W1 w12) {
        synchronized (w12) {
            try {
                if (w12.f7089c != 0) {
                    return false;
                }
                w12.f7089c = -1;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // W5.Z1
    public final void s(W1 w12) {
        synchronized (w12) {
            w12.f7089c = 0;
        }
    }
}
