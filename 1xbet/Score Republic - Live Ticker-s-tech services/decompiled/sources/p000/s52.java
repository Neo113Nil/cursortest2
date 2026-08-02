package p000;

import android.os.Looper;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class s52 extends mx1 {

    /* JADX INFO: renamed from: l */
    public bm1 f7032l;

    /* JADX INFO: renamed from: m */
    public boolean f7033m;

    /* JADX INFO: renamed from: n */
    public final an0 f7034n;

    /* JADX INFO: renamed from: o */
    public final q52 f7035o;

    /* JADX INFO: renamed from: p */
    public final a81 f7036p;

    public s52(f02 f02Var) {
        super(f02Var);
        this.f7033m = true;
        this.f7034n = new an0(22, this);
        this.f7035o = new q52(this);
        this.f7036p = new a81(18, this);
    }

    @Override // p000.mx1
    /* JADX INFO: renamed from: D */
    public final boolean mo533D() {
        return false;
    }

    /* JADX INFO: renamed from: E */
    public final void m4484E() {
        mo11z();
        if (this.f7032l == null) {
            this.f7032l = new bm1(Looper.getMainLooper(), 2);
        }
    }
}
