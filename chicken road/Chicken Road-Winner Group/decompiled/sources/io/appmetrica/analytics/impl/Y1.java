package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class Y1 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0546he f6845a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ G7 f6846b;

    public Y1(C0353a2 c0353a2, G7 g7) {
        this.f6845a = c0353a2;
        this.f6846b = g7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f6845a.consume(this.f6846b);
    }
}
