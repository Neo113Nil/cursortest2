package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.e0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0317e0 implements io.appmetrica.analytics.impl.Cn {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ io.appmetrica.analytics.impl.C0343f0 f5767a;

    public C0317e0(io.appmetrica.analytics.impl.C0343f0 c0343f0) {
        this.f5767a = c0343f0;
    }

    @Override // io.appmetrica.analytics.impl.Cn
    public final java.lang.Thread a() {
        return this.f5767a.f5868b;
    }

    @Override // io.appmetrica.analytics.impl.Cn
    public final java.lang.StackTraceElement[] b() {
        io.appmetrica.analytics.impl.C0343f0 c0343f0 = this.f5767a;
        return (java.lang.StackTraceElement[]) c0343f0.f5867a.get(c0343f0.f5868b);
    }

    @Override // io.appmetrica.analytics.impl.Cn
    public final java.util.Map<java.lang.Thread, java.lang.StackTraceElement[]> c() {
        return this.f5767a.f5867a;
    }
}
