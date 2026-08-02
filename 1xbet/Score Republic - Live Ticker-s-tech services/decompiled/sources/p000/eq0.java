package p000;

import java.util.ArrayDeque;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class eq0 extends qk0 {
    @Override // p000.qk0
    /* JADX INFO: renamed from: c */
    public final void mo1494c(Object obj, Object obj2) {
        fq0 fq0Var = (fq0) obj;
        fq0Var.getClass();
        ArrayDeque arrayDeque = fq0.f2473b;
        synchronized (arrayDeque) {
            arrayDeque.offer(fq0Var);
        }
    }
}
