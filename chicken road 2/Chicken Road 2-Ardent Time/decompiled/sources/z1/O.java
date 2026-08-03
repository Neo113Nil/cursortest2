package z1;

/* loaded from: classes.dex */
public final class O extends z1.U {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f8537e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.Object f8538f;

    public /* synthetic */ O(int i2, java.lang.Object obj) {
        this.f8537e = i2;
        this.f8538f = obj;
    }

    @Override // s1.l
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
        switch (this.f8537e) {
            case 0:
                k((java.lang.Throwable) obj);
                break;
            default:
                k((java.lang.Throwable) obj);
                break;
        }
        return h1.C0177i.f3302a;
    }

    @Override // z1.U
    public final void k(java.lang.Throwable th) {
        switch (this.f8537e) {
            case 0:
                ((s1.l) this.f8538f).invoke(th);
                break;
            default:
                java.lang.Object D2 = j().D();
                boolean z2 = D2 instanceof z1.C1061n;
                z1.V v2 = (z1.V) this.f8538f;
                if (!z2) {
                    v2.l(z1.AbstractC1068v.l(D2));
                    break;
                } else {
                    v2.l(a.AbstractC0059a.i(((z1.C1061n) D2).f8581a));
                    break;
                }
        }
    }
}
