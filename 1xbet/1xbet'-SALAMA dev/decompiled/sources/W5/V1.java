package W5;

/* JADX INFO: loaded from: classes2.dex */
public final class V1 extends Z1 {
    @Override // W5.Z1
    public final boolean r(W1 w7) {
        synchronized (w7) {
            try {
                if (w7.f7089c != 0) {
                    return false;
                }
                w7.f7089c = -1;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // W5.Z1
    public final void s(W1 w7) {
        synchronized (w7) {
            w7.f7089c = 0;
        }
    }
}
