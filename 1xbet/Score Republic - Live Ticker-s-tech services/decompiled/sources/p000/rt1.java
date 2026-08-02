package p000;

import android.os.Handler;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public abstract class rt1 {

    /* JADX INFO: renamed from: d */
    public static volatile bm1 f6961d;

    /* JADX INFO: renamed from: a */
    public final f12 f6962a;

    /* JADX INFO: renamed from: b */
    public final f31 f6963b;

    /* JADX INFO: renamed from: c */
    public volatile long f6964c;

    public rt1(f12 f12Var) {
        p80.m3863h(f12Var);
        this.f6962a = f12Var;
        this.f6963b = new f31(7, this, f12Var);
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo23a();

    /* JADX INFO: renamed from: b */
    public final void m4403b(long j) {
        m4404c();
        if (j >= 0) {
            f12 f12Var = this.f6962a;
            f12Var.mo1567f().getClass();
            this.f6964c = System.currentTimeMillis();
            if (m4405d().postDelayed(this.f6963b, j)) {
                return;
            }
            f12Var.mo1563b().f4600o.m5313b(Long.valueOf(j), "Failed to schedule delayed post. time");
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m4404c() {
        this.f6964c = 0L;
        m4405d().removeCallbacks(this.f6963b);
    }

    /* JADX INFO: renamed from: d */
    public final Handler m4405d() {
        bm1 bm1Var;
        if (f6961d != null) {
            return f6961d;
        }
        synchronized (rt1.class) {
            try {
                if (f6961d == null) {
                    f6961d = new bm1(this.f6962a.mo1566e().getMainLooper(), 2);
                }
                bm1Var = f6961d;
            } catch (Throwable th) {
                throw th;
            }
        }
        return bm1Var;
    }
}
