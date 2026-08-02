package p000;

import java.util.ArrayList;
import java.util.HashSet;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class k81 implements InterfaceC0400kl {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ m81 f4301a;

    public k81(m81 m81Var) {
        this.f4301a = m81Var;
    }

    @Override // p000.InterfaceC0400kl
    /* JADX INFO: renamed from: a */
    public final void mo2999a(boolean z) {
        ArrayList arrayList;
        zg1.m5891b();
        synchronized (this.f4301a) {
            arrayList = new ArrayList((HashSet) this.f4301a.f5011m);
        }
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((InterfaceC0400kl) obj).mo2999a(z);
        }
    }
}
