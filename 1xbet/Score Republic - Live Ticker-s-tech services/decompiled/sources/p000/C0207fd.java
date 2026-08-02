package p000;

import java.util.ArrayDeque;

/* JADX INFO: renamed from: fd */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class C0207fd {

    /* JADX INFO: renamed from: a */
    public final ArrayDeque f2378a;

    public C0207fd(int i) {
        switch (i) {
            case 1:
                this.f2378a = new ArrayDeque();
                break;
            default:
                this.f2378a = new ArrayDeque(0);
                break;
        }
    }

    /* JADX INFO: renamed from: a */
    public synchronized void m1771a(j80 j80Var) {
        j80Var.f3849b = null;
        j80Var.f3850c = null;
        this.f2378a.offer(j80Var);
    }
}
