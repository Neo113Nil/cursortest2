package p000;

import java.util.concurrent.Callable;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class j92 implements Runnable {

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ int f3861j = 0;

    /* JADX INFO: renamed from: k */
    public Object f3862k;

    /* JADX INFO: renamed from: l */
    public Object f3863l;

    public j92(v92 v92Var, Callable callable) {
        this.f3862k = v92Var;
        this.f3863l = callable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f3861j) {
            case 0:
                this.f3862k = null;
                this.f3863l = null;
                break;
            default:
                v92 v92Var = (v92) this.f3862k;
                try {
                    v92Var.m5135k(((Callable) this.f3863l).call());
                } catch (Exception e) {
                    v92Var.m5136l(e);
                } catch (Throwable th) {
                    v92Var.m5136l(new RuntimeException(th));
                    return;
                }
                break;
        }
    }

    public /* synthetic */ j92() {
    }
}
