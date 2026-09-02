package z1;

/* loaded from: classes.dex */
public final class k0 implements k1.g, k1.h {

    /* renamed from: a, reason: collision with root package name */
    public static final z1.k0 f8574a = new z1.k0();

    @Override // k1.i
    public final k1.i g(k1.i context) {
        kotlin.jvm.internal.i.e(context, "context");
        return context == k1.j.f7951a ? this : (k1.i) context.k(this, new k1.C0922b(1));
    }

    @Override // k1.i
    public final k1.i j(k1.h hVar) {
        return a.AbstractC0059a.t(this, hVar);
    }

    @Override // k1.i
    public final java.lang.Object k(java.lang.Object obj, s1.p pVar) {
        return pVar.invoke(obj, this);
    }

    @Override // k1.i
    public final k1.g m(k1.h hVar) {
        return a.AbstractC0059a.p(this, hVar);
    }

    @Override // k1.g
    public final k1.h getKey() {
        return this;
    }
}
