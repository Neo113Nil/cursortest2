package p000;

import java.util.concurrent.ThreadPoolExecutor;

/* JADX INFO: renamed from: qv */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class C0632qv extends d71 {

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ d71 f6618e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ ThreadPoolExecutor f6619f;

    public C0632qv(d71 d71Var, ThreadPoolExecutor threadPoolExecutor) {
        this.f6618e = d71Var;
        this.f6619f = threadPoolExecutor;
    }

    @Override // p000.d71
    /* JADX INFO: renamed from: j */
    public final void mo1121j(Throwable th) {
        ThreadPoolExecutor threadPoolExecutor = this.f6619f;
        try {
            this.f6618e.mo1121j(th);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }

    @Override // p000.d71
    /* JADX INFO: renamed from: l */
    public final void mo1123l(f71 f71Var) {
        ThreadPoolExecutor threadPoolExecutor = this.f6619f;
        try {
            this.f6618e.mo1123l(f71Var);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }
}
