package p000;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;

/* JADX INFO: renamed from: xj */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0879xj implements f60 {

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ int f8970j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ AbstractActivityC0790v4 f8971k;

    public /* synthetic */ C0879xj(AbstractActivityC0790v4 abstractActivityC0790v4, int i) {
        this.f8970j = i;
        this.f8971k = abstractActivityC0790v4;
    }

    @Override // p000.f60
    /* JADX INFO: renamed from: a */
    public final Object mo1083a() {
        int i = this.f8970j;
        AbstractActivityC0790v4 abstractActivityC0790v4 = this.f8971k;
        switch (i) {
            case 0:
                abstractActivityC0790v4.reportFullyDrawn();
                return kf1.f4365a;
            case 1:
                return new e60(abstractActivityC0790v4.f2779o, new C0879xj(abstractActivityC0790v4, 0));
            case 2:
                C0149dt c0149dt = new C0149dt();
                abstractActivityC0790v4.m2118h().m2152b().m1656b(c0149dt);
                return c0149dt;
            default:
                gu0 gu0Var = new gu0(new RunnableC0842wj(abstractActivityC0790v4, 1));
                if (Build.VERSION.SDK_INT >= 33) {
                    if (af0.m187a(Looper.myLooper(), Looper.getMainLooper())) {
                        abstractActivityC0790v4.f2430j.m437a(new C0916yj(gu0Var, abstractActivityC0790v4));
                    } else {
                        new Handler(Looper.getMainLooper()).post(new RunnableC0195f1(4, abstractActivityC0790v4, gu0Var));
                    }
                }
                return gu0Var;
        }
    }
}
