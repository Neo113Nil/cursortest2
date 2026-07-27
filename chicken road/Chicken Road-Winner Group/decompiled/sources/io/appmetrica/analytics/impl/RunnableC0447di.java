package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.di, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0447di implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Sn f7155a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0653li f7156b;

    public RunnableC0447di(C0653li c0653li, Sn sn) {
        this.f7156b = c0653li;
        this.f7155a = sn;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0653li c0653li = this.f7156b;
        C0653li.a(c0653li.f7815a, c0653li.f7818d, c0653li.f7819e).a(this.f7155a);
    }
}
