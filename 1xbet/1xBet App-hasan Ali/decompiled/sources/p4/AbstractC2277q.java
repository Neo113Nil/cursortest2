package p4;

import S3.C0416t;
import a4.AbstractC0470a;

/* renamed from: p4.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2277q extends AbstractC0470a implements a4.e {

    /* renamed from: l, reason: collision with root package name */
    public static final C2276p f18817l = new C2276p(a4.d.f6648k, new C0416t(13));

    public AbstractC2277q() {
        super(a4.d.f6648k);
    }

    public abstract void E(a4.h hVar, Runnable runnable);

    public boolean F(a4.h hVar) {
        return !(this instanceof n0);
    }

    public AbstractC2277q G(int i) {
        u4.a.a(i);
        return new u4.g(this, i);
    }

    @Override // a4.AbstractC0470a, a4.h
    public final a4.f l(a4.g gVar) {
        a4.f fVar;
        kotlin.jvm.internal.l.f("key", gVar);
        if (!(gVar instanceof C2276p)) {
            if (a4.d.f6648k == gVar) {
                return this;
            }
            return null;
        }
        C2276p c2276p = (C2276p) gVar;
        a4.g gVar2 = this.f6645k;
        if ((gVar2 == c2276p || c2276p.f18815l == gVar2) && (fVar = (a4.f) c2276p.f18814k.c(this)) != null) {
            return fVar;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0027 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0026 A[RETURN] */
    @Override // a4.AbstractC0470a, a4.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final a4.h r(a4.g gVar) {
        kotlin.jvm.internal.l.f("key", gVar);
        boolean z3 = gVar instanceof C2276p;
        a4.i iVar = a4.i.f6649k;
        if (z3) {
            C2276p c2276p = (C2276p) gVar;
            a4.g gVar2 = this.f6645k;
            return (gVar2 == c2276p || c2276p.f18815l == gVar2) ? ((a4.f) c2276p.f18814k.c(this)) != null ? iVar : this : this;
        }
        if (a4.d.f6648k == gVar) {
        }
    }

    public String toString() {
        return getClass().getSimpleName() + '@' + AbstractC2282w.i(this);
    }
}
