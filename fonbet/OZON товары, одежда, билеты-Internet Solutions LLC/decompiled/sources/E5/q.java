package E5;

import java.util.Collections;

/* loaded from: classes8.dex */
public final class q<K, A> extends a<K, A> {

    /* renamed from: i, reason: collision with root package name */
    private final A f7536i;

    public q(P5.c<A> cVar) {
        this(cVar, null);
    }

    @Override // E5.a
    final float c() {
        return 1.0f;
    }

    @Override // E5.a
    public final A g() {
        P5.c<A> cVar = this.f7479e;
        float f7 = this.f7478d;
        A a11 = this.f7536i;
        return cVar.b(0.0f, 0.0f, a11, a11, f7, f7, f7);
    }

    @Override // E5.a
    final A h(P5.a<K> aVar, float f7) {
        return g();
    }

    @Override // E5.a
    public final void j() {
        if (this.f7479e != null) {
            super.j();
        }
    }

    @Override // E5.a
    public final void l(float f7) {
        this.f7478d = f7;
    }

    public q(P5.c<A> cVar, A a11) {
        super(Collections.EMPTY_LIST);
        m(cVar);
        this.f7536i = a11;
    }
}
