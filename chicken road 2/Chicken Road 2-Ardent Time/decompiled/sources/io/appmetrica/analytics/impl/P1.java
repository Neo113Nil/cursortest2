package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class P1 implements java.lang.Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ io.appmetrica.analytics.impl.InterfaceC0228ae f4804a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ io.appmetrica.analytics.impl.C0842y7 f4805b;

    public P1(io.appmetrica.analytics.impl.R1 r12, io.appmetrica.analytics.impl.C0842y7 c0842y7) {
        this.f4804a = r12;
        this.f4805b = c0842y7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f4804a.consume(this.f4805b);
    }
}
