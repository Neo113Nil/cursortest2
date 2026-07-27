package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class Qh implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0653li f6475a;

    public Qh(C0653li c0653li) {
        this.f6475a = c0653li;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0653li c0653li = this.f6475a;
        C0653li.a(c0653li.f7815a, c0653li.f7818d, c0653li.f7819e).pauseSession();
    }
}
