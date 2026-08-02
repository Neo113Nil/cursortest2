package a4;

import G4.l;

/* renamed from: a4.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0470a implements f {

    /* renamed from: k, reason: collision with root package name */
    public final g f6645k;

    public AbstractC0470a(g gVar) {
        this.f6645k = gVar;
    }

    @Override // a4.h
    public final Object A(i4.e eVar, Object obj) {
        return eVar.invoke(obj, this);
    }

    @Override // a4.f
    public final g getKey() {
        return this.f6645k;
    }

    @Override // a4.h
    public f l(g gVar) {
        return l.y(this, gVar);
    }

    @Override // a4.h
    public final h m(h hVar) {
        return l.H(this, hVar);
    }

    @Override // a4.h
    public h r(g gVar) {
        return l.F(this, gVar);
    }
}
