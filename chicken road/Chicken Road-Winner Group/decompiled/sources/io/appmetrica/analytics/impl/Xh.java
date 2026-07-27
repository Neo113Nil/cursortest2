package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class Xh implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f6830a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0653li f6831b;

    public Xh(C0653li c0653li, boolean z3) {
        this.f6831b = c0653li;
        this.f6830a = z3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0653li c0653li = this.f6831b;
        C0653li.a(c0653li.f7815a, c0653li.f7818d, c0653li.f7819e).setDataSendingEnabled(this.f6830a);
    }
}
