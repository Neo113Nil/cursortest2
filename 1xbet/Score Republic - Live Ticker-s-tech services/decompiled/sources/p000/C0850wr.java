package p000;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: wr */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class C0850wr extends d71 {

    /* JADX INFO: renamed from: e */
    public final d71 f8645e;

    /* JADX INFO: renamed from: f */
    public volatile boolean f8646f;

    /* JADX INFO: renamed from: g */
    public List f8647g = new ArrayList();

    public C0850wr(d71 d71Var) {
        this.f8645e = d71Var;
    }

    @Override // p000.d71
    /* JADX INFO: renamed from: i */
    public final void mo1120i(ja1 ja1Var, np0 np0Var) {
        m5415y(new RunnableC0702sr(this, ja1Var, np0Var, 1));
    }

    @Override // p000.d71
    /* JADX INFO: renamed from: k */
    public final void mo1122k(np0 np0Var) {
        if (this.f8646f) {
            this.f8645e.mo1122k(np0Var);
        } else {
            m5415y(new RunnableC0529o2(5, this, np0Var));
        }
    }

    @Override // p000.d71
    /* JADX INFO: renamed from: m */
    public final void mo1124m(Object obj) {
        if (this.f8646f) {
            this.f8645e.mo1124m(obj);
        } else {
            m5415y(new RunnableC0529o2(6, this, obj));
        }
    }

    @Override // p000.d71
    /* JADX INFO: renamed from: n */
    public final void mo1125n() {
        if (this.f8646f) {
            this.f8645e.mo1125n();
        } else {
            m5415y(new RunnableC0897y0(4, this));
        }
    }

    /* JADX INFO: renamed from: y */
    public final void m5415y(Runnable runnable) {
        synchronized (this) {
            try {
                if (this.f8646f) {
                    runnable.run();
                } else {
                    this.f8647g.add(runnable);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
