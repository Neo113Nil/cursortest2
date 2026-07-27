package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.ii, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0575ii implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0653li f7547a;

    public RunnableC0575ii(C0653li c0653li) {
        this.f7547a = c0653li;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0653li c0653li = this.f7547a;
        C0653li.a(c0653li.f7815a, c0653li.f7818d, c0653li.f7819e).clearAppEnvironment();
    }
}
