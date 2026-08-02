package p000;

import java.util.ArrayList;

/* JADX INFO: renamed from: uw */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class C0781uw implements nb1 {

    /* JADX INFO: renamed from: j */
    public final ArrayList f7915j;

    public C0781uw(int i) {
        switch (i) {
            case 1:
                this.f7915j = new ArrayList(20);
                break;
            case 2:
                this.f7915j = new ArrayList();
                break;
            case 3:
                this.f7915j = new ArrayList();
                break;
            default:
                this.f7915j = new ArrayList();
                break;
        }
    }

    /* JADX INFO: renamed from: a */
    public synchronized ArrayList m4956a(Class cls, Class cls2) {
        ArrayList arrayList = new ArrayList();
        if (cls2.isAssignableFrom(cls)) {
            arrayList.add(cls2);
            return arrayList;
        }
        ArrayList arrayList2 = this.f7915j;
        int size = arrayList2.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList2.get(i);
            i++;
            he1 he1Var = (he1) obj;
            if ((he1Var.f3188a.isAssignableFrom(cls) && cls2.isAssignableFrom(he1Var.f3189b)) && !arrayList.contains(he1Var.f3189b)) {
                arrayList.add(he1Var.f3189b);
            }
        }
        return arrayList;
    }

    @Override // p000.nb1
    public /* synthetic */ Object get() {
        Object obj = x22.f8759j;
        return new g82(this.f7915j);
    }

    public /* synthetic */ C0781uw(ArrayList arrayList) {
        this.f7915j = arrayList;
    }
}
