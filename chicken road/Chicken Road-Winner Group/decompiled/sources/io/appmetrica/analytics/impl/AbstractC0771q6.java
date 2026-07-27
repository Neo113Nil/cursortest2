package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.ICrashTransformer;

/* renamed from: io.appmetrica.analytics.impl.q6, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0771q6 implements Ma {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC0745p6 f8117a;

    /* renamed from: b, reason: collision with root package name */
    public final ICrashTransformer f8118b;

    /* renamed from: c, reason: collision with root package name */
    public final T9 f8119c;

    public AbstractC0771q6(InterfaceC0745p6 interfaceC0745p6, ICrashTransformer iCrashTransformer, T9 t9) {
        this.f8117a = interfaceC0745p6;
        this.f8118b = iCrashTransformer;
        this.f8119c = t9;
    }

    @Override // io.appmetrica.analytics.impl.Ma
    public final void a(Throwable th, V v3) {
        if (this.f8117a.a(th)) {
            ICrashTransformer iCrashTransformer = this.f8118b;
            if (iCrashTransformer == null || th == null || (th = iCrashTransformer.process(th)) != null) {
                Sn a3 = Vn.a(th, v3, null, (String) this.f8119c.f6653b.a(), (Boolean) this.f8119c.f6654c.a());
                C0673mc c0673mc = (C0673mc) ((Gh) this).f5999d;
                c0673mc.f6881a.a().a(c0673mc.f7858b).a(a3);
            }
        }
    }

    public final InterfaceC0745p6 b() {
        return this.f8117a;
    }

    public final ICrashTransformer a() {
        return this.f8118b;
    }
}
