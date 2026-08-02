package com.google.android.gms.internal.ads;

import java.util.concurrent.ExecutionException;

/* renamed from: com.google.android.gms.internal.ads.cw, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractRunnableC0866cw extends Gw implements Runnable {

    /* renamed from: r, reason: collision with root package name */
    public E3.a f13063r;

    /* renamed from: s, reason: collision with root package name */
    public Class f13064s;

    /* renamed from: t, reason: collision with root package name */
    public Object f13065t;

    public AbstractRunnableC0866cw(E3.a aVar, Class cls, Object obj) {
        aVar.getClass();
        this.f13063r = aVar;
        this.f13064s = cls;
        this.f13065t = obj;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1403ow
    public final String d() {
        E3.a aVar = this.f13063r;
        Class cls = this.f13064s;
        Object obj = this.f13065t;
        String d5 = super.d();
        String n5 = aVar != null ? L1.a.n("inputFuture=[", aVar.toString(), "], ") : "";
        if (cls == null || obj == null) {
            if (d5 != null) {
                return n5.concat(d5);
            }
            return null;
        }
        return n5 + "exceptionType=[" + cls.toString() + "], fallback=[" + obj.toString() + "]";
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1403ow
    public final void e() {
        k(this.f13063r);
        this.f13063r = null;
        this.f13064s = null;
        this.f13065t = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007c  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        Object obj;
        E3.a aVar = this.f13063r;
        Class cls = this.f13064s;
        Object obj2 = this.f13065t;
        if (((obj2 == null) || ((aVar == 0) | (cls == null))) || (this.f14874k instanceof C0910dw)) {
            return;
        }
        this.f13063r = null;
        try {
            th = aVar instanceof AbstractC0867cx ? ((AbstractC0867cx) aVar).b() : null;
        } catch (ExecutionException e3) {
            Throwable cause = e3.getCause();
            if (cause == null) {
                cause = new NullPointerException("Future type " + String.valueOf(aVar.getClass()) + " threw " + String.valueOf(e3.getClass()) + " without a cause");
            }
            th = cause;
        } catch (Throwable th) {
            th = th;
        }
        if (th == null) {
            obj = AbstractC1400ot.m0(aVar);
            if (th != null) {
                f(obj);
                return;
            }
            if (!cls.isInstance(th)) {
                l(aVar);
                return;
            }
            try {
                Object s2 = s(obj2, th);
                this.f13064s = null;
                this.f13065t = null;
                t(s2);
                return;
            } catch (Throwable th2) {
                try {
                    if (th2 instanceof InterruptedException) {
                        Thread.currentThread().interrupt();
                    }
                    g(th2);
                    return;
                } finally {
                    this.f13064s = null;
                    this.f13065t = null;
                }
            }
        }
        obj = null;
        if (th != null) {
        }
    }

    public abstract Object s(Object obj, Throwable th);

    public abstract void t(Object obj);
}
