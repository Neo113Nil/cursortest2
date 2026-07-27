package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class Ph implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0653li f6424a;

    public Ph(C0653li c0653li) {
        this.f6424a = c0653li;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0653li c0653li = this.f6424a;
        C0653li.a(c0653li.f7815a, c0653li.f7818d, c0653li.f7819e).resumeSession();
    }
}
