package p000;

import java.util.HashSet;
import java.util.LinkedHashSet;

/* JADX INFO: renamed from: tr */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0739tr implements Runnable {

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ int f7574j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ fl0 f7575k;

    public /* synthetic */ RunnableC0739tr(fl0 fl0Var, int i) {
        this.f7574j = i;
        this.f7575k = fl0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f7574j) {
            case 0:
                this.f7575k.f2437j.mo661m();
                return;
            case 1:
                this.f7575k.f2437j.mo660i();
                return;
            default:
                fl0 fl0Var = this.f7575k;
                LinkedHashSet linkedHashSet = fl0Var.f2445r.f2803d.f3973B;
                if (linkedHashSet != null) {
                    linkedHashSet.remove(fl0Var);
                    if (this.f7575k.f2445r.f2803d.f3973B.isEmpty()) {
                        jl0 jl0Var = this.f7575k.f2445r.f2803d;
                        jl0Var.f3996Y.m4577m(jl0Var.f3974C, false);
                        jl0 jl0Var2 = this.f7575k.f2445r.f2803d;
                        jl0Var2.f3973B = null;
                        if (jl0Var2.f3978G.get()) {
                            f71 f71Var = this.f7575k.f2445r.f2803d.f3977F;
                            ja1 ja1Var = jl0.f3967e0;
                            synchronized (f71Var.f2334k) {
                                try {
                                    if (((ja1) f71Var.f2336m) == null) {
                                        f71Var.f2336m = ja1Var;
                                        boolean zIsEmpty = ((HashSet) f71Var.f2335l).isEmpty();
                                        if (zIsEmpty) {
                                            ((jl0) f71Var.f2337n).f3976E.mo3771a(ja1Var);
                                        }
                                    }
                                } catch (Throwable th) {
                                    throw th;
                                }
                            }
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
