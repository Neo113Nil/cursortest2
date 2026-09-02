package s1;

/* loaded from: classes.dex */
public final class c extends Thread {
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0017, code lost:
    
        r1.m();
     */
    @Override // java.lang.Thread, java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        while (true) {
            synchronized (d.class) {
                try {
                    d h2 = d.h();
                    if (h2 != null) {
                        if (h2 == d.f6612j) {
                            d.f6612j = null;
                            return;
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }
}
