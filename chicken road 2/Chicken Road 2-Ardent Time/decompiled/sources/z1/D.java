package z1;

/* loaded from: classes.dex */
public final class D implements z1.c0, s1.l {

    /* renamed from: a, reason: collision with root package name */
    public final z1.C f8523a;

    public D(z1.C c2) {
        this.f8523a = c2;
    }

    public final void a(java.lang.Throwable th) {
        this.f8523a.a();
    }

    @Override // s1.l
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
        a((java.lang.Throwable) obj);
        return h1.C0177i.f3302a;
    }

    public final java.lang.String toString() {
        return "DisposeOnCancel[" + this.f8523a + ']';
    }
}
