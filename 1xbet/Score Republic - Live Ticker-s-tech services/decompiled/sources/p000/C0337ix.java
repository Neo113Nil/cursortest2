package p000;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: ix */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class C0337ix implements hb1, wy0 {

    /* JADX INFO: renamed from: a */
    public final HashMap f3688a;

    /* JADX INFO: renamed from: b */
    public ArrayDeque f3689b;

    /* JADX INFO: renamed from: c */
    public final cf1 f3690c;

    public C0337ix() {
        cf1 cf1Var = cf1.f1245j;
        this.f3688a = new HashMap();
        this.f3689b = new ArrayDeque();
        this.f3690c = cf1Var;
    }

    /* JADX INFO: renamed from: a */
    public final synchronized void m2714a(Executor executor, InterfaceC0375jx interfaceC0375jx) {
        try {
            executor.getClass();
            if (!this.f3688a.containsKey(AbstractC0477mo.class)) {
                this.f3688a.put(AbstractC0477mo.class, new ConcurrentHashMap());
            }
            ((ConcurrentHashMap) this.f3688a.get(AbstractC0477mo.class)).put(interfaceC0375jx, executor);
        } catch (Throwable th) {
            throw th;
        }
    }
}
