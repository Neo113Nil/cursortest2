package androidx.datastore.preferences.protobuf;

/* renamed from: androidx.datastore.preferences.protobuf.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0084u implements java.lang.Cloneable {

    /* renamed from: a, reason: collision with root package name */
    public final androidx.datastore.preferences.protobuf.AbstractC0086w f2374a;

    /* renamed from: b, reason: collision with root package name */
    public androidx.datastore.preferences.protobuf.AbstractC0086w f2375b;

    public AbstractC0084u(androidx.datastore.preferences.protobuf.AbstractC0086w abstractC0086w) {
        this.f2374a = abstractC0086w;
        if (abstractC0086w.i()) {
            throw new java.lang.IllegalArgumentException("Default instance must be immutable.");
        }
        this.f2375b = abstractC0086w.k();
    }

    public final androidx.datastore.preferences.protobuf.AbstractC0086w a() {
        androidx.datastore.preferences.protobuf.AbstractC0086w b2 = b();
        b2.getClass();
        if (androidx.datastore.preferences.protobuf.AbstractC0086w.h(b2, true)) {
            return b2;
        }
        throw new androidx.datastore.preferences.protobuf.c0();
    }

    public final androidx.datastore.preferences.protobuf.AbstractC0086w b() {
        if (!this.f2375b.i()) {
            return this.f2375b;
        }
        androidx.datastore.preferences.protobuf.AbstractC0086w abstractC0086w = this.f2375b;
        abstractC0086w.getClass();
        androidx.datastore.preferences.protobuf.T t = androidx.datastore.preferences.protobuf.T.f2259c;
        t.getClass();
        t.a(abstractC0086w.getClass()).h(abstractC0086w);
        abstractC0086w.j();
        return this.f2375b;
    }

    public final void c() {
        if (this.f2375b.i()) {
            return;
        }
        androidx.datastore.preferences.protobuf.AbstractC0086w k2 = this.f2374a.k();
        androidx.datastore.preferences.protobuf.AbstractC0086w abstractC0086w = this.f2375b;
        androidx.datastore.preferences.protobuf.T t = androidx.datastore.preferences.protobuf.T.f2259c;
        t.getClass();
        t.a(k2.getClass()).c(k2, abstractC0086w);
        this.f2375b = k2;
    }

    public final java.lang.Object clone() {
        androidx.datastore.preferences.protobuf.AbstractC0084u abstractC0084u = (androidx.datastore.preferences.protobuf.AbstractC0084u) this.f2374a.e(5);
        abstractC0084u.f2375b = b();
        return abstractC0084u;
    }
}
