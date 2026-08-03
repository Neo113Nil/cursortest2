package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class Tf implements java.lang.Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final java.io.File f5019a;

    /* renamed from: b, reason: collision with root package name */
    public final io.appmetrica.analytics.coreapi.internal.backport.Function f5020b;

    /* renamed from: c, reason: collision with root package name */
    public final io.appmetrica.analytics.coreapi.internal.backport.Consumer f5021c;

    /* renamed from: d, reason: collision with root package name */
    public final io.appmetrica.analytics.coreapi.internal.backport.Consumer f5022d;

    /* renamed from: e, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.Z9 f5023e;

    /* renamed from: f, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.InterfaceC0235al f5024f;

    public Tf(java.io.File file, io.appmetrica.analytics.coreapi.internal.backport.Function function, io.appmetrica.analytics.coreapi.internal.backport.Consumer consumer, io.appmetrica.analytics.coreapi.internal.backport.Consumer consumer2, io.appmetrica.analytics.impl.Z9 z9, io.appmetrica.analytics.impl.InterfaceC0235al interfaceC0235al) {
        this.f5019a = file;
        this.f5020b = function;
        this.f5021c = consumer;
        this.f5022d = consumer2;
        this.f5023e = z9;
        this.f5024f = interfaceC0235al;
    }

    public static final void a(java.io.File file) {
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f5019a.exists()) {
            io.appmetrica.analytics.impl.C0818x9 b2 = this.f5023e.b(this.f5019a.getName());
            io.appmetrica.analytics.coreapi.internal.backport.Consumer consumer = this.f5021c;
            try {
                b2.f7103a.lock();
                b2.f7104b.a();
            } catch (java.lang.Throwable unused) {
            }
            if (!this.f5019a.exists()) {
                consumer.consume(this.f5019a);
                b2.c();
                io.appmetrica.analytics.impl.Z9 z9 = this.f5023e;
                java.lang.String name = this.f5019a.getName();
                synchronized (z9) {
                    z9.f5401b.remove(name);
                }
                return;
            }
            java.lang.Object apply = this.f5020b.apply(this.f5019a);
            if (apply != null) {
                if (this.f5024f.a(apply)) {
                    this.f5022d.consume(apply);
                } else {
                    consumer = new io.appmetrica.analytics.impl.Qo();
                }
            }
            consumer.consume(this.f5019a);
            b2.c();
            this.f5023e.a(this.f5019a.getName());
        }
    }
}
