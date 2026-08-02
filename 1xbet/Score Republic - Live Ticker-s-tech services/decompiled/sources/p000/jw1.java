package p000;

import android.os.SystemClock;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public abstract class jw1 implements Runnable {

    /* JADX INFO: renamed from: j */
    public final long f4100j;

    /* JADX INFO: renamed from: k */
    public final long f4101k;

    /* JADX INFO: renamed from: l */
    public final boolean f4102l;

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ mw1 f4103m;

    public jw1(mw1 mw1Var, boolean z) {
        Objects.requireNonNull(mw1Var);
        this.f4103m = mw1Var;
        this.f4100j = System.currentTimeMillis();
        this.f4101k = SystemClock.elapsedRealtime();
        this.f4102l = z;
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo492a();

    @Override // java.lang.Runnable
    public final void run() {
        mw1 mw1Var = this.f4103m;
        if (mw1Var.f5173e) {
            mo493b();
            return;
        }
        try {
            mo492a();
        } catch (Exception e) {
            mw1Var.m3435c(e, false, this.f4102l);
            mo493b();
        }
    }

    /* JADX INFO: renamed from: b */
    public void mo493b() {
    }
}
