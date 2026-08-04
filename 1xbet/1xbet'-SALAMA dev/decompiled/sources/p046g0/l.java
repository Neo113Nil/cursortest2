package p046g0;

import java.util.concurrent.ThreadPoolExecutor;
import p113p3.f;
import p155w1.F0;

/* JADX INFO: loaded from: classes.dex */
public final class l extends f {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ f f13039d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ThreadPoolExecutor f13040e;

    public l(f fVar, ThreadPoolExecutor threadPoolExecutor) {
        super(24);
        this.f13039d = fVar;
        this.f13040e = threadPoolExecutor;
    }

    @Override // p113p3.f
    public final void T(Throwable th) {
        ThreadPoolExecutor threadPoolExecutor = this.f13040e;
        try {
            this.f13039d.T(th);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }

    @Override // p113p3.f
    public final void U(F0 f7) {
        ThreadPoolExecutor threadPoolExecutor = this.f13040e;
        try {
            this.f13039d.U(f7);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }
}
