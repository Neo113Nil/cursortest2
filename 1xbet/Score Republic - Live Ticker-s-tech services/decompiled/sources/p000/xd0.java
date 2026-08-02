package p000;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class xd0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f8894a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f8895b;

    public xd0(int i) {
        this.f8894a = i;
        switch (i) {
            case 1:
                this.f8895b = new ArrayList();
                break;
            default:
                this.f8895b = new ArrayList();
                break;
        }
    }

    /* JADX INFO: renamed from: a */
    public void m5619a(Object obj, String str) {
        this.f8895b.add(str + "=" + obj);
    }

    /* JADX INFO: renamed from: b */
    public synchronized b21 m5620b(Class cls) {
        int size = this.f8895b.size();
        for (int i = 0; i < size; i++) {
            c21 c21Var = (c21) this.f8895b.get(i);
            if (c21Var.f1072a.isAssignableFrom(cls)) {
                return c21Var.f1073b;
            }
        }
        return null;
    }

    public String toString() {
        switch (this.f8894a) {
            case 0:
                return this.f8895b.toString();
            default:
                return super.toString();
        }
    }
}
