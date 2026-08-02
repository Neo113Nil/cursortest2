package a0;

import G4.l;
import P.C0315s;
import Q.J;
import Q1.j;
import java.util.List;

/* renamed from: a0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0446b implements J, a4.f {

    /* renamed from: l, reason: collision with root package name */
    public static final j f6363l = new j(18);

    /* renamed from: k, reason: collision with root package name */
    public final C0315s f6364k;

    public C0446b(C0315s c0315s) {
        this.f6364k = c0315s;
    }

    @Override // a4.h
    public final Object A(i4.e eVar, Object obj) {
        return eVar.invoke(obj, this);
    }

    @Override // Q.J
    public final List e(Integer num) {
        return this.f6364k.F();
    }

    @Override // a4.f
    public final a4.g getKey() {
        return f6363l;
    }

    @Override // a4.h
    public final a4.f l(a4.g gVar) {
        return l.y(this, gVar);
    }

    @Override // a4.h
    public final a4.h m(a4.h hVar) {
        return l.H(this, hVar);
    }

    @Override // a4.h
    public final a4.h r(a4.g gVar) {
        return l.F(this, gVar);
    }
}
