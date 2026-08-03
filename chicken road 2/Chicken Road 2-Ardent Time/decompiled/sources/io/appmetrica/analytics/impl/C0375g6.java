package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.g6, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0375g6 implements io.appmetrica.analytics.coreapi.internal.backport.Consumer {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.concurrent.Executor f5961a;

    /* renamed from: b, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.Ug f5962b;

    public C0375g6(android.content.Context context, io.appmetrica.analytics.impl.InterfaceC0298d6 interfaceC0298d6, io.appmetrica.analytics.impl.EnumC0251bb enumC0251bb, io.appmetrica.analytics.impl.InterfaceC0235al interfaceC0235al, java.util.concurrent.Executor executor, java.lang.String str) {
        this.f5961a = executor;
        this.f5962b = new io.appmetrica.analytics.impl.Ug(context, interfaceC0298d6, enumC0251bb, interfaceC0235al);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.backport.Consumer
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final void consume(java.io.File file) {
        if (file == null) {
            return;
        }
        java.util.concurrent.Executor executor = this.f5961a;
        io.appmetrica.analytics.impl.Ug ug = this.f5962b;
        io.appmetrica.analytics.impl.C0561nb c0561nb = ug.f5079c;
        io.appmetrica.analytics.coreapi.internal.backport.Consumer consumer = ug.f5081e;
        android.content.Context context = ug.f5077a;
        if (io.appmetrica.analytics.impl.Z9.f5399c == null) {
            synchronized (kotlin.jvm.internal.q.a(io.appmetrica.analytics.impl.Z9.class)) {
                if (io.appmetrica.analytics.impl.Z9.f5399c == null) {
                    io.appmetrica.analytics.impl.Z9.f5399c = new io.appmetrica.analytics.impl.Z9(context);
                }
            }
        }
        io.appmetrica.analytics.impl.Z9 z9 = io.appmetrica.analytics.impl.Z9.f5399c;
        if (z9 != null) {
            executor.execute(new io.appmetrica.analytics.impl.Tf(file, c0561nb, c0561nb, consumer, z9, ug.f5078b));
        } else {
            kotlin.jvm.internal.i.i("INSTANCE");
            throw null;
        }
    }
}
