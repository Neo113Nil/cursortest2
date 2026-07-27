package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.fi, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0498fi implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ V f7293a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0653li f7294b;

    public RunnableC0498fi(C0653li c0653li, V v3) {
        this.f7294b = c0653li;
        this.f7293a = v3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0653li c0653li = this.f7294b;
        C0653li.a(c0653li.f7815a, c0653li.f7818d, c0653li.f7819e).a(this.f7293a);
    }
}
