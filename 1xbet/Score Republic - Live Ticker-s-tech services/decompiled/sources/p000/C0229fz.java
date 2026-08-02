package p000;

import java.util.Random;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: fz */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class C0229fz extends ThreadLocal {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f2539a;

    @Override // java.lang.ThreadLocal
    public final Object initialValue() {
        switch (this.f2539a) {
            case 0:
                return new Random();
            case 1:
                un1 un1Var = new un1();
                un1Var.f7865j = 0;
                return un1Var;
            case 2:
                return 0L;
            case 3:
                n80.m3502k(Thread.currentThread());
                ga2 ga2Var = new ga2();
                ga2Var.f2680a = false;
                ga2Var.f2681b = null;
                Thread threadCurrentThread = Thread.currentThread();
                WeakHashMap weakHashMap = s92.f7077b;
                synchronized (weakHashMap) {
                    weakHashMap.put(threadCurrentThread, ga2Var);
                    break;
                }
                return ga2Var;
            default:
                return new Random();
        }
    }
}
