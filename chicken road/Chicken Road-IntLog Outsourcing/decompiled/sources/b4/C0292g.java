package b4;

import B0.n;
import Y2.k;
import a4.C0195a;
import c4.C0313c;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: b4.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0292g implements k, Closeable {

    /* renamed from: d, reason: collision with root package name */
    public static final Logger f4839d = Logger.getLogger(C0292g.class.getName());

    /* renamed from: a, reason: collision with root package name */
    public final C0295j f4840a;

    /* renamed from: b, reason: collision with root package name */
    public final n f4841b = new n(new M3.n(3, this));

    /* renamed from: c, reason: collision with root package name */
    public final L3.i f4842c;

    public C0292g(J3.d dVar, EnumC0290e enumC0290e, C0195a c0195a, D3.h hVar, C0313c c0313c, ArrayList arrayList, L3.i iVar) {
        this.f4840a = new C0295j(dVar, enumC0290e, c0195a, hVar, c0313c, arrayList);
        this.f4842c = iVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        shutdown().c(10L, TimeUnit.SECONDS);
    }

    @Override // Y2.k
    public final Y2.j get() {
        return (Y2.j) this.f4841b.a(Q2.a.f2475d, "noop");
    }

    public final J3.c shutdown() {
        J3.c cVar;
        if (this.f4840a.f4858h != null) {
            f4839d.log(Level.INFO, "Calling shutdown() multiple times.");
            return J3.c.f1361e;
        }
        C0295j c0295j = this.f4840a;
        synchronized (c0295j.f4851a) {
            try {
                if (c0295j.f4858h != null) {
                    cVar = c0295j.f4858h;
                } else {
                    c0295j.f4858h = c0295j.f4857g.shutdown();
                    cVar = c0295j.f4858h;
                }
            } finally {
            }
        }
        return cVar;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SdkTracerProvider{clock=");
        C0295j c0295j = this.f4840a;
        sb.append(c0295j.f4852b);
        sb.append(", idGenerator=");
        sb.append(c0295j.f4853c);
        sb.append(", resource=");
        sb.append(c0295j.f4854d);
        sb.append(", spanLimitsSupplier=");
        c0295j.f4855e.getClass();
        sb.append(C0286a.f4829a);
        sb.append(", sampler=");
        sb.append(c0295j.f4856f);
        sb.append(", spanProcessor=");
        sb.append(c0295j.f4857g);
        sb.append(", tracerConfigurator=");
        sb.append(this.f4842c);
        sb.append('}');
        return sb.toString();
    }
}
