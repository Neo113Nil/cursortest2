package androidx.datastore.preferences.protobuf;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0673s implements Cloneable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AbstractC0675u f9253a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public AbstractC0675u f9254b;

    public AbstractC0673s(AbstractC0675u abstractC0675u) {
        this.f9253a = abstractC0675u;
        if (abstractC0675u.i()) {
            throw new IllegalArgumentException("Default instance must be immutable.");
        }
        this.f9254b = abstractC0675u.k();
    }

    public final AbstractC0675u a() {
        AbstractC0675u abstractC0675uB = b();
        abstractC0675uB.getClass();
        if (AbstractC0675u.h(abstractC0675uB, true)) {
            return abstractC0675uB;
        }
        throw new a0();
    }

    public final AbstractC0675u b() {
        if (!this.f9254b.i()) {
            return this.f9254b;
        }
        AbstractC0675u abstractC0675u = this.f9254b;
        abstractC0675u.getClass();
        Q q7 = Q.f9136c;
        q7.getClass();
        q7.a(abstractC0675u.getClass()).b(abstractC0675u);
        abstractC0675u.j();
        return this.f9254b;
    }

    public final void c() {
        if (this.f9254b.i()) {
            return;
        }
        AbstractC0675u abstractC0675uK = this.f9253a.k();
        AbstractC0675u abstractC0675u = this.f9254b;
        Q q7 = Q.f9136c;
        q7.getClass();
        q7.a(abstractC0675uK.getClass()).a(abstractC0675uK, abstractC0675u);
        this.f9254b = abstractC0675uK;
    }

    public final Object clone() {
        AbstractC0673s abstractC0673s = (AbstractC0673s) this.f9253a.e(5);
        abstractC0673s.f9254b = b();
        return abstractC0673s;
    }
}
