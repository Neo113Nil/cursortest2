package v1;

import java.util.concurrent.ThreadPoolExecutor;

/* loaded from: classes.dex */
public final class l extends j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ j f20352a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ThreadPoolExecutor f20353b;

    public l(j jVar, ThreadPoolExecutor threadPoolExecutor) {
        this.f20352a = jVar;
        this.f20353b = threadPoolExecutor;
    }

    @Override // v1.j
    public final void c(Throwable th) {
        ThreadPoolExecutor threadPoolExecutor = this.f20353b;
        try {
            this.f20352a.c(th);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }

    @Override // v1.j
    public final void d(m2.g gVar) {
        ThreadPoolExecutor threadPoolExecutor = this.f20353b;
        try {
            this.f20352a.d(gVar);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }
}
