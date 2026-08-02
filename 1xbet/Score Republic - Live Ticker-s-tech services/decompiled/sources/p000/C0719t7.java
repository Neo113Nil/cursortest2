package p000;

import java.util.concurrent.Executors;

/* JADX INFO: renamed from: t7 */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class C0719t7 extends yd0 {

    /* JADX INFO: renamed from: q */
    public static volatile C0719t7 f7327q;

    /* JADX INFO: renamed from: p */
    public final Object f7328p;

    public C0719t7(int i) {
        switch (i) {
            case 1:
                this.f7328p = new Object();
                Executors.newFixedThreadPool(4, new ThreadFactoryC0480mr());
                break;
            default:
                this.f7328p = new C0719t7(1);
                break;
        }
    }

    /* JADX INFO: renamed from: G */
    public static C0719t7 m4750G() {
        if (f7327q != null) {
            return f7327q;
        }
        synchronized (C0719t7.class) {
            try {
                if (f7327q == null) {
                    f7327q = new C0719t7(0);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f7327q;
    }
}
