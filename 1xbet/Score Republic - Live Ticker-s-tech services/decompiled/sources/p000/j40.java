package p000;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class j40 implements InterfaceC0291hm {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f3814a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f3815b;

    public /* synthetic */ j40(int i, Object obj) {
        this.f3814a = i;
        this.f3815b = obj;
    }

    @Override // p000.InterfaceC0291hm
    public final void accept(Object obj) {
        switch (this.f3814a) {
            case 0:
                k40 k40Var = (k40) obj;
                if (k40Var == null) {
                    k40Var = new k40(-3);
                }
                ((C0312i6) this.f3815b).m2548t(k40Var);
                return;
            default:
                k40 k40Var2 = (k40) obj;
                synchronized (l40.f4671c) {
                    try {
                        w71 w71Var = l40.f4672d;
                        ArrayList arrayList = (ArrayList) w71Var.get((String) this.f3815b);
                        if (arrayList == null) {
                            return;
                        }
                        w71Var.remove((String) this.f3815b);
                        for (int i = 0; i < arrayList.size(); i++) {
                            ((InterfaceC0291hm) arrayList.get(i)).accept(k40Var2);
                        }
                        return;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
        }
    }
}
