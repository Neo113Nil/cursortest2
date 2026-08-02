package p000;

import java.util.LinkedHashSet;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class bu0 {

    /* JADX INFO: renamed from: a */
    public final cu0 f987a;

    /* JADX INFO: renamed from: b */
    public boolean f988b;

    /* JADX INFO: renamed from: c */
    public f71 f989c;

    /* JADX INFO: renamed from: d */
    public final l50 f990d;

    /* JADX INFO: renamed from: e */
    public boolean f991e;

    public bu0(l50 l50Var, cu0 cu0Var) {
        l50Var.getClass();
        boolean z = l50Var.f4680b;
        this.f987a = cu0Var;
        this.f988b = z;
        this.f990d = l50Var;
        this.f991e = true;
    }

    /* JADX INFO: renamed from: a */
    public final void m776a() {
        f71 f71Var = this.f989c;
        if (f71Var == null || !((LinkedHashSet) f71Var.f2336m).remove(this)) {
            return;
        }
        mr0 mr0Var = (mr0) f71Var.f2335l;
        mr0Var.getClass();
        if (this == mr0Var.f5141f) {
            if (mr0Var.f5142g == -1) {
                this.f990d.m3171a();
            }
            mr0Var.f5141f = null;
            mr0Var.f5142g = 0;
            mr0Var.f5143h = null;
        }
        mr0Var.f5139d.remove(this);
        mr0Var.f5140e.remove(this);
        this.f989c = null;
        mr0Var.m3427b();
    }

    /* JADX INFO: renamed from: b */
    public final void m777b(boolean z) {
        mr0 mr0Var;
        this.f991e = z;
        boolean z2 = z && this.f990d.f4680b;
        if (this.f988b == z2) {
            return;
        }
        this.f988b = z2;
        f71 f71Var = this.f989c;
        if (f71Var == null || (mr0Var = (mr0) f71Var.f2335l) == null) {
            return;
        }
        mr0Var.m3427b();
    }
}
