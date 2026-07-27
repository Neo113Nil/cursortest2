package Z1;

import a2.C0180a;

/* loaded from: classes.dex */
public final class f implements i {

    /* renamed from: a, reason: collision with root package name */
    public final j f3766a;

    /* renamed from: b, reason: collision with root package name */
    public final I1.h f3767b;

    public f(j jVar, I1.h hVar) {
        this.f3766a = jVar;
        this.f3767b = hVar;
    }

    @Override // Z1.i
    public final boolean a(Exception exc) {
        this.f3767b.c(exc);
        return true;
    }

    @Override // Z1.i
    public final boolean b(C0180a c0180a) {
        if (c0180a.f3849b != 4 || this.f3766a.a(c0180a)) {
            return false;
        }
        String str = c0180a.f3850c;
        if (str == null) {
            throw new NullPointerException("Null token");
        }
        this.f3767b.b(new a(c0180a.f3852e, c0180a.f3853f, str));
        return true;
    }
}
