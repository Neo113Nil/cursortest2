package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.gi, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0524gi implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0653li f7382a;

    public RunnableC0524gi(C0653li c0653li) {
        this.f7382a = c0653li;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0653li c0653li = this.f7382a;
        C0653li.a(c0653li.f7815a, c0653li.f7818d, c0653li.f7819e).sendEventsBuffer();
    }
}
