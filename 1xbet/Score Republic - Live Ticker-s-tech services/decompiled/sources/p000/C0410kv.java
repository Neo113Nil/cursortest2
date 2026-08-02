package p000;

import android.os.Build;
import java.util.ArrayList;

/* JADX INFO: renamed from: kv */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class C0410kv extends d71 {

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C0447lv f4581e;

    public C0410kv(C0447lv c0447lv) {
        this.f4581e = c0447lv;
    }

    @Override // p000.d71
    /* JADX INFO: renamed from: j */
    public final void mo1121j(Throwable th) {
        this.f4581e.f4911a.m3997d(th);
    }

    @Override // p000.d71
    /* JADX INFO: renamed from: l */
    public final void mo1123l(f71 f71Var) {
        C0447lv c0447lv = this.f4581e;
        c0447lv.f4913c = f71Var;
        f71 f71Var2 = c0447lv.f4913c;
        C0595pv c0595pv = c0447lv.f4911a;
        c0447lv.f4912b = new qd0(f71Var2, c0595pv.f6268g, c0595pv.f6270i, Build.VERSION.SDK_INT >= 34 ? AbstractC0706sv.m4597a() : xe1.m5638f());
        C0595pv c0595pv2 = c0447lv.f4911a;
        ArrayList arrayList = new ArrayList();
        c0595pv2.f6262a.writeLock().lock();
        try {
            c0595pv2.f6264c = 1;
            arrayList.addAll(c0595pv2.f6263b);
            c0595pv2.f6263b.clear();
            c0595pv2.f6262a.writeLock().unlock();
            c0595pv2.f6265d.post(new RunnableC0521nv(arrayList, c0595pv2.f6264c, null));
        } catch (Throwable th) {
            c0595pv2.f6262a.writeLock().unlock();
            throw th;
        }
    }
}
