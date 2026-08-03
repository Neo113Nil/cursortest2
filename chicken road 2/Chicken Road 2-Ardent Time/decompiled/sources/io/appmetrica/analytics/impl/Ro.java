package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final /* synthetic */ class Ro implements java.util.concurrent.Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4925a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f4926b;

    public /* synthetic */ Ro(int i2, java.lang.Object obj) {
        this.f4925a = i2;
        this.f4926b = obj;
    }

    @Override // java.util.concurrent.Callable
    public final java.lang.Object call() {
        switch (this.f4925a) {
            case 0:
                return io.appmetrica.analytics.impl.U.e((io.appmetrica.analytics.impl.U) this.f4926b);
            default:
                return ((io.appmetrica.analytics.impl.C0835y0) this.f4926b).p();
        }
    }
}
