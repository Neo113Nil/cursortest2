package D7;

import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
final class r extends o {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ TaskCompletionSource f6118b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ o f6119c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ x f6120d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    r(x xVar, TaskCompletionSource taskCompletionSource, TaskCompletionSource taskCompletionSource2, o oVar) {
        super(taskCompletionSource);
        this.f6120d = xVar;
        this.f6118b = taskCompletionSource2;
        this.f6119c = oVar;
    }

    @Override // D7.o
    public final void a() {
        Object obj;
        AtomicInteger atomicInteger;
        n nVar;
        obj = this.f6120d.f6132f;
        synchronized (obj) {
            try {
                x.n(this.f6120d, this.f6118b);
                atomicInteger = this.f6120d.f6137k;
                if (atomicInteger.getAndIncrement() > 0) {
                    nVar = this.f6120d.f6128b;
                    nVar.d("Already connected to the service.", new Object[0]);
                }
                x.p(this.f6120d, this.f6119c);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
