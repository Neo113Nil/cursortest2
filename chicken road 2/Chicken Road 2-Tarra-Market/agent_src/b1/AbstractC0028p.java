package b1;

/* renamed from: b1.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0028p extends M0.a implements M0.f {

    /* renamed from: b, reason: collision with root package name */
    public static final C0027o f677b = new C0027o(M0.e.f225a, C0026n.f674e);

    public AbstractC0028p() {
        super(M0.e.f225a);
    }

    @Override // M0.a, M0.i
    public final M0.i g(M0.h key) {
        kotlin.jvm.internal.j.e(key, "key");
        boolean z2 = key instanceof C0027o;
        M0.j jVar = M0.j.f226a;
        if (z2) {
            C0027o c0027o = (C0027o) key;
            M0.h hVar = this.f221a;
            if ((hVar == c0027o || c0027o.f676b == hVar) && c0027o.a(this) != null) {
                return jVar;
            }
        } else if (M0.e.f225a == key) {
            return jVar;
        }
        return this;
    }

    @Override // M0.a, M0.i
    public final M0.g i(M0.h key) {
        M0.g a2;
        kotlin.jvm.internal.j.e(key, "key");
        if (!(key instanceof C0027o)) {
            if (M0.e.f225a == key) {
                return this;
            }
            return null;
        }
        C0027o c0027o = (C0027o) key;
        M0.h hVar = this.f221a;
        if ((hVar == c0027o || c0027o.f676b == hVar) && (a2 = c0027o.a(this)) != null) {
            return a2;
        }
        return null;
    }

    public abstract void l(M0.i iVar, Runnable runnable);

    public boolean m() {
        return !(this instanceof a0);
    }

    public String toString() {
        return getClass().getSimpleName() + '@' + AbstractC0030s.a(this);
    }
}
