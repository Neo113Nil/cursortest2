package p000;

import java.util.ArrayList;

/* JADX INFO: renamed from: bt */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public class C0074bt extends C0629qs {

    /* JADX INFO: renamed from: m */
    public int f976m;

    public C0074bt(bj1 bj1Var) {
        super(bj1Var);
        if (bj1Var instanceof gb0) {
            this.f6576e = 2;
        } else {
            this.f6576e = 3;
        }
    }

    @Override // p000.C0629qs
    /* JADX INFO: renamed from: d */
    public final void mo759d(int i) {
        if (this.f6581j) {
            return;
        }
        this.f6581j = true;
        this.f6578g = i;
        ArrayList arrayList = this.f6582k;
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            InterfaceC0518ns interfaceC0518ns = (InterfaceC0518ns) obj;
            interfaceC0518ns.mo1751a(interfaceC0518ns);
        }
    }
}
