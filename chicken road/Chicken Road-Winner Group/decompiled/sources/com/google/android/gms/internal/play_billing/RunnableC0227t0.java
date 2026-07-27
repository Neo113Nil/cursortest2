package com.google.android.gms.internal.play_billing;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import m0.C1120h;

/* renamed from: com.google.android.gms.internal.play_billing.t0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0227t0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceFutureC0242y0 f2824a;

    /* renamed from: b, reason: collision with root package name */
    public final m0.F f2825b;

    public RunnableC0227t0(InterfaceFutureC0242y0 interfaceFutureC0242y0, m0.F f) {
        this.f2824a = interfaceFutureC0242y0;
        this.f2825b = f;
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
        InterfaceFutureC0242y0 interfaceFutureC0242y0 = this.f2824a;
        boolean z3 = interfaceFutureC0242y0 instanceof K0;
        m0.F f = this.f2825b;
        if (z3) {
            AbstractC0210n0 abstractC0210n0 = (AbstractC0210n0) ((K0) interfaceFutureC0242y0);
            if (abstractC0210n0 instanceof InterfaceC0198j0) {
                Object obj2 = abstractC0210n0.f2782a;
                if (obj2 instanceof C0183e0) {
                    th = ((C0183e0) obj2).f2744a;
                    if (th != null) {
                        f.a(th);
                        return;
                    }
                }
            }
            th = null;
            if (th != null) {
            }
        }
        try {
            if (!interfaceFutureC0242y0.isDone()) {
                throw new IllegalStateException(AbstractC0181d1.f("Future was expected to be done: %s", interfaceFutureC0242y0));
            }
            boolean z4 = false;
            Future future = interfaceFutureC0242y0;
            while (true) {
                try {
                    obj = future.get();
                    break;
                } catch (InterruptedException unused) {
                    z4 = true;
                    future = future;
                } catch (Throwable th2) {
                    if (z4) {
                        Thread.currentThread().interrupt();
                    }
                    throw th2;
                }
            }
            if (z4) {
                Thread.currentThread().interrupt();
            }
            Integer num = (Integer) obj;
            if (num.intValue() <= 0) {
                f.f9948b.run();
                return;
            }
            int intValue = num.intValue();
            m0.J j3 = f.f9949c;
            int i3 = f.f9950d;
            j3.getClass();
            C1120h a3 = m0.O.a(intValue, "Billing override value was set by a license tester.");
            j3.Q(105, i3, a3);
            f.f9947a.accept(a3);
        } catch (ExecutionException e3) {
            f.a(e3.getCause());
        } catch (Throwable th3) {
            f.a(th3);
        }
    }

    public final String toString() {
        A0.j jVar = new A0.j(RunnableC0227t0.class.getSimpleName());
        C0194i c0194i = new C0194i();
        ((C0194i) jVar.f68d).f2765b = c0194i;
        jVar.f68d = c0194i;
        c0194i.f2764a = this.f2825b;
        return jVar.toString();
    }
}
