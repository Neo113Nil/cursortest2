package com.google.android.gms.internal.ads;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

/* renamed from: com.google.android.gms.internal.ads.tw, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractRunnableC1627tw extends Gw implements Runnable {

    /* renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ int f15739t = 0;

    /* renamed from: r, reason: collision with root package name */
    public E3.a f15740r;

    /* renamed from: s, reason: collision with root package name */
    public Object f15741s;

    public AbstractRunnableC1627tw(E3.a aVar, Object obj) {
        aVar.getClass();
        this.f15740r = aVar;
        this.f15741s = obj;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1403ow
    public final String d() {
        E3.a aVar = this.f15740r;
        Object obj = this.f15741s;
        String d5 = super.d();
        String n5 = aVar != null ? L1.a.n("inputFuture=[", aVar.toString(), "], ") : "";
        if (obj == null) {
            if (d5 != null) {
                return n5.concat(d5);
            }
            return null;
        }
        return n5 + "function=[" + obj.toString() + "]";
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1403ow
    public final void e() {
        k(this.f15740r);
        this.f15740r = null;
        this.f15741s = null;
    }

    @Override // java.lang.Runnable
    public final void run() {
        E3.a aVar = this.f15740r;
        Object obj = this.f15741s;
        if (((this.f14874k instanceof C0910dw) | (aVar == null)) || (obj == null)) {
            return;
        }
        this.f15740r = null;
        if (aVar.isCancelled()) {
            l(aVar);
            return;
        }
        try {
            try {
                Object s2 = s(obj, AbstractC1400ot.m0(aVar));
                this.f15741s = null;
                t(s2);
            } catch (Throwable th) {
                try {
                    if (th instanceof InterruptedException) {
                        Thread.currentThread().interrupt();
                    }
                    g(th);
                } finally {
                    this.f15741s = null;
                }
            }
        } catch (Error e3) {
            g(e3);
        } catch (CancellationException unused) {
            cancel(false);
        } catch (ExecutionException e5) {
            g(e5.getCause());
        } catch (Exception e6) {
            g(e6);
        }
    }

    public abstract Object s(Object obj, Object obj2);

    public abstract void t(Object obj);
}
