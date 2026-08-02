package p000;

import android.graphics.Bitmap;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class q81 implements jw0 {

    /* JADX INFO: renamed from: a */
    public final mk0 f6414a;

    /* JADX INFO: renamed from: b */
    public int f6415b;

    /* JADX INFO: renamed from: c */
    public Bitmap.Config f6416c;

    public q81(mk0 mk0Var) {
        this.f6414a = mk0Var;
    }

    @Override // p000.jw0
    /* JADX INFO: renamed from: a */
    public final void mo2969a() {
        this.f6414a.m4576l(this);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof q81) {
            q81 q81Var = (q81) obj;
            if (this.f6415b == q81Var.f6415b && zg1.m5892c(this.f6416c, q81Var.f6416c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.f6415b * 31;
        Bitmap.Config config = this.f6416c;
        return i + (config != null ? config.hashCode() : 0);
    }

    public final String toString() {
        return r81.m4276c(this.f6415b, this.f6416c);
    }
}
