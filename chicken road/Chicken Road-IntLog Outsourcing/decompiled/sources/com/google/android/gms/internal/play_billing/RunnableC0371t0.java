package com.google.android.gms.internal.play_billing;

import G0.C0060j;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.function.Consumer;

/* renamed from: com.google.android.gms.internal.play_billing.t0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0371t0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceFutureC0386y0 f5260a;

    /* renamed from: b, reason: collision with root package name */
    public final k1.n f5261b;

    public RunnableC0371t0(InterfaceFutureC0386y0 interfaceFutureC0386y0, k1.n nVar) {
        this.f5260a = interfaceFutureC0386y0;
        this.f5261b = nVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0020  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        Object obj;
        Throwable th;
        InterfaceFutureC0386y0 interfaceFutureC0386y0 = this.f5260a;
        boolean z = interfaceFutureC0386y0 instanceof K0;
        k1.n nVar = this.f5261b;
        if (z) {
            AbstractC0354n0 abstractC0354n0 = (AbstractC0354n0) ((K0) interfaceFutureC0386y0);
            if (abstractC0354n0 instanceof InterfaceC0342j0) {
                Object obj2 = abstractC0354n0.f5216a;
                if (obj2 instanceof C0327e0) {
                    th = ((C0327e0) obj2).f5175a;
                    if (th != null) {
                        nVar.b(th);
                        return;
                    }
                }
            }
            th = null;
            if (th != null) {
            }
        }
        try {
            if (!interfaceFutureC0386y0.isDone()) {
                throw new IllegalStateException(AbstractC0325d1.g("Future was expected to be done: %s", interfaceFutureC0386y0));
            }
            boolean z5 = false;
            Future future = interfaceFutureC0386y0;
            while (true) {
                try {
                    obj = future.get();
                    break;
                } catch (InterruptedException unused) {
                    z5 = true;
                    future = future;
                } catch (Throwable th2) {
                    if (z5) {
                        Thread.currentThread().interrupt();
                    }
                    throw th2;
                }
            }
            if (z5) {
                Thread.currentThread().interrupt();
            }
            Integer num = (Integer) obj;
            if (num.intValue() <= 0) {
                ((Runnable) nVar.f10713c).run();
                return;
            }
            int intValue = num.intValue();
            G0.J j2 = (G0.J) nVar.f10714d;
            int i2 = nVar.f10711a;
            j2.getClass();
            C0060j a6 = G0.O.a(intValue, "Billing override value was set by a license tester.");
            j2.Q(105, i2, a6);
            ((Consumer) nVar.f10712b).accept(a6);
        } catch (ExecutionException e3) {
            nVar.b(e3.getCause());
        } catch (Throwable th3) {
            nVar.b(th3);
        }
    }

    public final String toString() {
        B4.i iVar = new B4.i(RunnableC0371t0.class.getSimpleName());
        C0338i c0338i = new C0338i();
        ((C0338i) iVar.f313d).f5197b = c0338i;
        iVar.f313d = c0338i;
        c0338i.f5196a = this.f5261b;
        return iVar.toString();
    }
}
