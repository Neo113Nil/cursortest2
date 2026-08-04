package D6;

/* JADX INFO: loaded from: classes2.dex */
public abstract class A extends p065i6.a implements p065i6.f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C0142z f1773b = new C0142z(p065i6.e.f14073a, C0141y.f1889a);

    public A() {
        super(p065i6.e.f14073a);
    }

    public abstract void d(p065i6.i iVar, Runnable runnable);

    public boolean e() {
        return !(this instanceof F0);
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [kotlin.jvm.functions.Function1, t6.i] */
    @Override // p065i6.a, p065i6.i
    public final p065i6.g get(p065i6.h hVar) {
        p065i6.g gVar;
        t6.h.e(hVar, "key");
        if (!(hVar instanceof C0142z)) {
            if (p065i6.e.f14073a == hVar) {
                return this;
            }
            return null;
        }
        C0142z c0142z = (C0142z) hVar;
        p065i6.h hVar2 = this.f14069a;
        if ((hVar2 == c0142z || c0142z.f1894b == hVar2) && (gVar = (p065i6.g) c0142z.f1893a.invoke(this)) != null) {
            return gVar;
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [kotlin.jvm.functions.Function1, t6.i] */
    @Override // p065i6.a, p065i6.i
    public final p065i6.i minusKey(p065i6.h hVar) {
        t6.h.e(hVar, "key");
        boolean z4 = hVar instanceof C0142z;
        p065i6.j jVar = p065i6.j.f14074a;
        if (z4) {
            C0142z c0142z = (C0142z) hVar;
            p065i6.h hVar2 = this.f14069a;
            if ((hVar2 == c0142z || c0142z.f1894b == hVar2) && ((p065i6.g) c0142z.f1893a.invoke(this)) != null) {
                return jVar;
            }
        } else if (p065i6.e.f14073a == hVar) {
            return jVar;
        }
        return this;
    }

    public String toString() {
        return getClass().getSimpleName() + '@' + E.i(this);
    }
}
