package androidx.datastore.preferences.protobuf;

/* renamed from: androidx.datastore.preferences.protobuf.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0694s implements Cloneable {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC0696u f9253a;

    /* renamed from: b, reason: collision with root package name */
    public AbstractC0696u f9254b;

    public AbstractC0694s(AbstractC0696u abstractC0696u) {
        this.f9253a = abstractC0696u;
        if (abstractC0696u.i()) {
            throw new IllegalArgumentException("Default instance must be immutable.");
        }
        this.f9254b = abstractC0696u.k();
    }

    public final AbstractC0696u a() {
        AbstractC0696u b7 = b();
        b7.getClass();
        if (AbstractC0696u.h(b7, true)) {
            return b7;
        }
        throw new a0();
    }

    public final AbstractC0696u b() {
        if (!this.f9254b.i()) {
            return this.f9254b;
        }
        AbstractC0696u abstractC0696u = this.f9254b;
        abstractC0696u.getClass();
        Q q7 = Q.f9136c;
        q7.getClass();
        q7.a(abstractC0696u.getClass()).b(abstractC0696u);
        abstractC0696u.j();
        return this.f9254b;
    }

    public final void c() {
        if (this.f9254b.i()) {
            return;
        }
        AbstractC0696u k7 = this.f9253a.k();
        AbstractC0696u abstractC0696u = this.f9254b;
        Q q7 = Q.f9136c;
        q7.getClass();
        q7.a(k7.getClass()).a(k7, abstractC0696u);
        this.f9254b = k7;
    }

    public final Object clone() {
        AbstractC0694s abstractC0694s = (AbstractC0694s) this.f9253a.e(5);
        abstractC0694s.f9254b = b();
        return abstractC0694s;
    }
}
