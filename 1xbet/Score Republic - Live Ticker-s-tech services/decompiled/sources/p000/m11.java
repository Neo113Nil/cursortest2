package p000;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class m11 implements InterfaceC0400kl {

    /* JADX INFO: renamed from: a */
    public final m81 f4945a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ n11 f4946b;

    public m11(n11 n11Var, m81 m81Var) {
        this.f4946b = n11Var;
        this.f4945a = m81Var;
    }

    @Override // p000.InterfaceC0400kl
    /* JADX INFO: renamed from: a */
    public final void mo2999a(boolean z) {
        if (z) {
            synchronized (this.f4946b) {
                m81 m81Var = this.f4945a;
                ArrayList arrayListM5898i = zg1.m5898i((Set) m81Var.f5010l);
                int size = arrayListM5898i.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayListM5898i.get(i);
                    i++;
                    h11 h11Var = (h11) obj;
                    if (!h11Var.mo2199k() && !h11Var.mo2196h()) {
                        h11Var.clear();
                        if (m81Var.f5009k) {
                            ((HashSet) m81Var.f5011m).add(h11Var);
                        } else {
                            h11Var.mo2198j();
                        }
                    }
                }
            }
        }
    }
}
