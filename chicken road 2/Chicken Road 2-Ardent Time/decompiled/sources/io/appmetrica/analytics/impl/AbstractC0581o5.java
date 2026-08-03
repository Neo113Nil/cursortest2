package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.o5, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0581o5 implements io.appmetrica.analytics.impl.InterfaceC0311dj {

    /* renamed from: a, reason: collision with root package name */
    public io.appmetrica.analytics.networktasks.internal.BaseRequestConfig f6568a;

    /* renamed from: b, reason: collision with root package name */
    public final io.appmetrica.analytics.networktasks.internal.BaseRequestConfig.RequestConfigLoader f6569b;

    /* renamed from: c, reason: collision with root package name */
    public io.appmetrica.analytics.impl.L5 f6570c;

    public AbstractC0581o5(io.appmetrica.analytics.networktasks.internal.BaseRequestConfig.RequestConfigLoader<java.lang.Object, io.appmetrica.analytics.impl.L5> requestConfigLoader, io.appmetrica.analytics.impl.C0365fm c0365fm, io.appmetrica.analytics.networktasks.internal.ArgumentsMerger<java.lang.Object, java.lang.Object> argumentsMerger) {
        this.f6569b = requestConfigLoader;
        io.appmetrica.analytics.impl.C0560na.k().v().a(this);
        a(new io.appmetrica.analytics.impl.L5(c0365fm, io.appmetrica.analytics.impl.C0560na.k().v(), io.appmetrica.analytics.impl.C0560na.k().s(), argumentsMerger));
    }

    public final synchronized void a(io.appmetrica.analytics.impl.L5 l5) {
        this.f6570c = l5;
    }

    public final synchronized io.appmetrica.analytics.networktasks.internal.ArgumentsMerger<java.lang.Object, java.lang.Object> b() {
        return (io.appmetrica.analytics.networktasks.internal.ArgumentsMerger) this.f6570c.componentArguments;
    }

    public final synchronized io.appmetrica.analytics.impl.C0365fm c() {
        return this.f6570c.f4580a;
    }

    public final void d() {
        synchronized (this) {
            this.f6568a = null;
        }
    }

    public final synchronized void e() {
        this.f6568a = null;
    }

    public synchronized void a(java.lang.Object obj) {
        if (!((io.appmetrica.analytics.networktasks.internal.ArgumentsMerger) this.f6570c.componentArguments).compareWithOtherArguments(obj)) {
            a(new io.appmetrica.analytics.impl.L5(c(), io.appmetrica.analytics.impl.C0560na.f6484I.v(), io.appmetrica.analytics.impl.C0560na.f6484I.s(), (io.appmetrica.analytics.networktasks.internal.ArgumentsMerger) ((io.appmetrica.analytics.networktasks.internal.ArgumentsMerger) this.f6570c.componentArguments).mergeFrom(obj)));
            e();
        }
    }

    public final synchronized void a(io.appmetrica.analytics.impl.C0365fm c0365fm) {
        a(new io.appmetrica.analytics.impl.L5(c0365fm, io.appmetrica.analytics.impl.C0560na.f6484I.v(), io.appmetrica.analytics.impl.C0560na.f6484I.s(), b()));
        e();
    }

    public final synchronized io.appmetrica.analytics.networktasks.internal.BaseRequestConfig a() {
        try {
            if (this.f6568a == null) {
                this.f6568a = this.f6569b.load(this.f6570c);
            }
        } catch (java.lang.Throwable th) {
            throw th;
        }
        return this.f6568a;
    }
}
