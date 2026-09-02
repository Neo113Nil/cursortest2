package z1;

/* renamed from: z1.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1065s extends k1.AbstractC0921a implements k1.f {

    /* renamed from: b, reason: collision with root package name */
    public static final z1.r f8590b = new z1.r(k1.e.f7950a, z1.C1064q.f8587e);

    public AbstractC1065s() {
        super(k1.e.f7950a);
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [kotlin.jvm.internal.j, s1.l] */
    @Override // k1.AbstractC0921a, k1.i
    public final k1.i j(k1.h key) {
        kotlin.jvm.internal.i.e(key, "key");
        boolean z2 = key instanceof z1.r;
        k1.j jVar = k1.j.f7951a;
        if (z2) {
            z1.r rVar = (z1.r) key;
            k1.h hVar = this.f7946a;
            if ((hVar == rVar || rVar.f8589b == hVar) && ((k1.g) rVar.f8588a.invoke(this)) != null) {
                return jVar;
            }
        } else if (k1.e.f7950a == key) {
            return jVar;
        }
        return this;
    }

    public abstract void l(k1.i iVar, java.lang.Runnable runnable);

    /* JADX WARN: Type inference failed for: r4v2, types: [kotlin.jvm.internal.j, s1.l] */
    @Override // k1.AbstractC0921a, k1.i
    public final k1.g m(k1.h key) {
        k1.g gVar;
        kotlin.jvm.internal.i.e(key, "key");
        if (!(key instanceof z1.r)) {
            if (k1.e.f7950a == key) {
                return this;
            }
            return null;
        }
        z1.r rVar = (z1.r) key;
        k1.h hVar = this.f7946a;
        if ((hVar == rVar || rVar.f8589b == hVar) && (gVar = (k1.g) rVar.f8588a.invoke(this)) != null) {
            return gVar;
        }
        return null;
    }

    public boolean n() {
        return !(this instanceof z1.i0);
    }

    public java.lang.String toString() {
        return getClass().getSimpleName() + '@' + z1.AbstractC1068v.b(this);
    }
}
