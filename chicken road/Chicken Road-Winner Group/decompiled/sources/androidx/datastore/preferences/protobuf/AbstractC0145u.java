package androidx.datastore.preferences.protobuf;

/* renamed from: androidx.datastore.preferences.protobuf.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0145u implements Cloneable {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC0147w f2298a;

    /* renamed from: b, reason: collision with root package name */
    public AbstractC0147w f2299b;

    public AbstractC0145u(AbstractC0147w abstractC0147w) {
        this.f2298a = abstractC0147w;
        if (abstractC0147w.g()) {
            throw new IllegalArgumentException("Default instance must be immutable.");
        }
        this.f2299b = abstractC0147w.i();
    }

    public final AbstractC0147w a() {
        AbstractC0147w b3 = b();
        b3.getClass();
        if (AbstractC0147w.f(b3, true)) {
            return b3;
        }
        throw new c0();
    }

    public final AbstractC0147w b() {
        if (!this.f2299b.g()) {
            return this.f2299b;
        }
        AbstractC0147w abstractC0147w = this.f2299b;
        abstractC0147w.getClass();
        T t3 = T.f2190c;
        t3.getClass();
        t3.a(abstractC0147w.getClass()).d(abstractC0147w);
        abstractC0147w.h();
        return this.f2299b;
    }

    public final void c() {
        if (this.f2299b.g()) {
            return;
        }
        AbstractC0147w i3 = this.f2298a.i();
        AbstractC0147w abstractC0147w = this.f2299b;
        T t3 = T.f2190c;
        t3.getClass();
        t3.a(i3.getClass()).a(i3, abstractC0147w);
        this.f2299b = i3;
    }

    public final Object clone() {
        AbstractC0145u abstractC0145u = (AbstractC0145u) this.f2298a.c(5);
        abstractC0145u.f2299b = b();
        return abstractC0145u;
    }
}
