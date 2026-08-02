package U5;

import a.AbstractC0603a;

/* renamed from: U5.x, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC0456x extends AbstractC0439f {
    @Override // U5.AbstractC0439f
    public void a(String str, Throwable th) {
        f().a(str, th);
    }

    @Override // U5.AbstractC0439f
    public void b() {
        f().b();
    }

    @Override // U5.AbstractC0439f
    public final void c(int i7) {
        f().c(i7);
    }

    @Override // U5.AbstractC0439f
    public final void d(com.google.protobuf.C c3) {
        f().d(c3);
    }

    @Override // U5.AbstractC0439f
    public void e(AbstractC0457y abstractC0457y, b0 b0Var) {
        f().e(abstractC0457y, b0Var);
    }

    public abstract AbstractC0439f f();

    public final String toString() {
        D3.j u02 = AbstractC0603a.u0(this);
        u02.a(f(), "delegate");
        return u02.toString();
    }
}
