package g0;

import java.util.concurrent.ThreadPoolExecutor;
import w1.F0;

/* loaded from: classes.dex */
public final class l extends p3.f {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p3.f f13033d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ThreadPoolExecutor f13034e;

    public l(p3.f fVar, ThreadPoolExecutor threadPoolExecutor) {
        super(24);
        this.f13033d = fVar;
        this.f13034e = threadPoolExecutor;
    }

    @Override // p3.f
    public final void T(Throwable th) {
        ThreadPoolExecutor threadPoolExecutor = this.f13034e;
        try {
            this.f13033d.T(th);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }

    @Override // p3.f
    public final void U(F0 f02) {
        ThreadPoolExecutor threadPoolExecutor = this.f13034e;
        try {
            this.f13033d.U(f02);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }
}
