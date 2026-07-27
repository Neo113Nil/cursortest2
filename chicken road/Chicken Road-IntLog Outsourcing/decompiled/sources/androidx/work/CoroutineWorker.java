package androidx.work;

import B0.f;
import B2.b;
import C0.n;
import D0.a;
import D0.k;
import D4.AbstractC0020u;
import D4.AbstractC0024y;
import D4.C0007g;
import D4.E;
import D4.InterfaceC0014n;
import D4.a0;
import D4.g0;
import F4.o;
import I4.e;
import android.content.Context;
import f4.v;
import java.util.concurrent.ExecutionException;
import k4.InterfaceC1218d;
import kotlin.jvm.internal.i;
import l4.EnumC1260a;
import n2.AbstractC1341c;
import s0.C1417e;
import s0.C1418f;
import s0.g;
import s0.h;
import s0.l;
import s0.m;
import s0.r;

/* loaded from: classes.dex */
public abstract class CoroutineWorker extends r {
    private final AbstractC0020u coroutineContext;
    private final k future;
    private final InterfaceC0014n job;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoroutineWorker(Context appContext, WorkerParameters params) {
        super(appContext, params);
        i.e(appContext, "appContext");
        i.e(params, "params");
        this.job = new a0(null);
        k kVar = new k();
        this.future = kVar;
        kVar.a(new b(21, this), (n) ((B4.i) getTaskExecutor()).f311b);
        this.coroutineContext = E.f459a;
    }

    public static void a(CoroutineWorker this$0) {
        i.e(this$0, "this$0");
        if (this$0.future.f428a instanceof a) {
            ((g0) this$0.job).b(null);
        }
    }

    public static /* synthetic */ void getCoroutineContext$annotations() {
    }

    public static /* synthetic */ Object getForegroundInfo$suspendImpl(CoroutineWorker coroutineWorker, InterfaceC1218d interfaceC1218d) {
        throw new IllegalStateException("Not implemented");
    }

    public abstract Object doWork(InterfaceC1218d interfaceC1218d);

    public AbstractC0020u getCoroutineContext() {
        return this.coroutineContext;
    }

    public Object getForegroundInfo(InterfaceC1218d interfaceC1218d) {
        return getForegroundInfo$suspendImpl(this, interfaceC1218d);
    }

    @Override // s0.r
    public final J1.a getForegroundInfoAsync() {
        a0 a0Var = new a0(null);
        AbstractC0020u coroutineContext = getCoroutineContext();
        coroutineContext.getClass();
        e b6 = AbstractC0024y.b(AbstractC1341c.A(coroutineContext, a0Var));
        l lVar = new l(a0Var);
        AbstractC0024y.n(b6, null, 0, new C1417e(lVar, this, null), 3);
        return lVar;
    }

    public final k getFuture$work_runtime_ktx_release() {
        return this.future;
    }

    public final InterfaceC0014n getJob$work_runtime_ktx_release() {
        return this.job;
    }

    @Override // s0.r
    public final void onStopped() {
        this.future.cancel(false);
    }

    public final Object setForeground(s0.i iVar, InterfaceC1218d interfaceC1218d) {
        J1.a foregroundAsync = setForegroundAsync(iVar);
        i.d(foregroundAsync, "setForegroundAsync(foregroundInfo)");
        if (foregroundAsync.isDone()) {
            try {
                foregroundAsync.get();
            } catch (ExecutionException e3) {
                Throwable cause = e3.getCause();
                if (cause == null) {
                    throw e3;
                }
                throw cause;
            }
        } else {
            C0007g c0007g = new C0007g(1, f.F(interfaceC1218d));
            c0007g.s();
            foregroundAsync.a(new m(c0007g, 0, foregroundAsync), h.f11779a);
            c0007g.u(new o(8, foregroundAsync));
            Object r5 = c0007g.r();
            if (r5 == EnumC1260a.f11058a) {
                return r5;
            }
        }
        return v.f5689a;
    }

    public final Object setProgress(g gVar, InterfaceC1218d interfaceC1218d) {
        J1.a progressAsync = setProgressAsync(gVar);
        i.d(progressAsync, "setProgressAsync(data)");
        if (progressAsync.isDone()) {
            try {
                progressAsync.get();
            } catch (ExecutionException e3) {
                Throwable cause = e3.getCause();
                if (cause == null) {
                    throw e3;
                }
                throw cause;
            }
        } else {
            C0007g c0007g = new C0007g(1, f.F(interfaceC1218d));
            c0007g.s();
            progressAsync.a(new m(c0007g, 0, progressAsync), h.f11779a);
            c0007g.u(new o(8, progressAsync));
            Object r5 = c0007g.r();
            if (r5 == EnumC1260a.f11058a) {
                return r5;
            }
        }
        return v.f5689a;
    }

    @Override // s0.r
    public final J1.a startWork() {
        AbstractC0020u coroutineContext = getCoroutineContext();
        InterfaceC0014n interfaceC0014n = this.job;
        coroutineContext.getClass();
        AbstractC0024y.n(AbstractC0024y.b(AbstractC1341c.A(coroutineContext, interfaceC0014n)), null, 0, new C1418f(this, null), 3);
        return this.future;
    }
}
