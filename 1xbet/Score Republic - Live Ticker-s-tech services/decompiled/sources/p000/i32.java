package p000;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class i32 implements Runnable {

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ int f3422j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ l32 f3423k;

    public i32(l32 l32Var, int i) {
        this.f3422j = i;
        switch (i) {
            case 1:
                Objects.requireNonNull(l32Var);
                this.f3423k = l32Var;
                break;
            default:
                Objects.requireNonNull(l32Var);
                this.f3423k = l32Var;
                break;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f3422j;
        l32 l32Var = this.f3423k;
        switch (i) {
            case 0:
                l32Var.f4660n = l32Var.f4665s;
                break;
            default:
                l32Var.f4665s = null;
                break;
        }
    }
}
