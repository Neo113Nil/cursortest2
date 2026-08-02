package O4;

/* renamed from: O4.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0263i implements InterfaceC0262h {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f4212k;

    /* renamed from: l, reason: collision with root package name */
    public final C0264j f4213l;

    public /* synthetic */ C0263i(C0264j c0264j, int i) {
        this.f4212k = i;
        this.f4213l = c0264j;
    }

    @Override // O4.InterfaceC0262h
    public final void a(InterfaceC0259e interfaceC0259e, S s2) {
        switch (this.f4212k) {
            case 0:
                boolean d5 = s2.f4188a.d();
                C0264j c0264j = this.f4213l;
                if (!d5) {
                    c0264j.completeExceptionally(new D2.e(s2));
                    break;
                } else {
                    c0264j.complete(s2.f4189b);
                    break;
                }
            default:
                this.f4213l.complete(s2);
                break;
        }
    }

    @Override // O4.InterfaceC0262h
    public final void h(InterfaceC0259e interfaceC0259e, Throwable th) {
        switch (this.f4212k) {
            case 0:
                this.f4213l.completeExceptionally(th);
                break;
            default:
                this.f4213l.completeExceptionally(th);
                break;
        }
    }
}
