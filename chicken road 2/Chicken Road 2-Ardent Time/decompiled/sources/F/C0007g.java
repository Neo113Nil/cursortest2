package F;

/* renamed from: F.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0007g extends m1.AbstractC0935f implements s1.l {

    /* renamed from: e, reason: collision with root package name */
    public int f450e;

    @Override // m1.AbstractC0931b
    public final java.lang.Object g(java.lang.Object obj) {
        int i2 = this.f450e;
        if (i2 == 0) {
            a.AbstractC0059a.A(obj);
            this.f450e = 1;
            throw null;
        }
        if (i2 != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        a.AbstractC0059a.A(obj);
        return h1.C0177i.f3302a;
    }

    @Override // s1.l
    public final java.lang.Object invoke(java.lang.Object obj) {
        F.C0007g c0007g = new F.C0007g(1, (k1.d) obj);
        h1.C0177i c0177i = h1.C0177i.f3302a;
        c0007g.g(c0177i);
        return c0177i;
    }
}
