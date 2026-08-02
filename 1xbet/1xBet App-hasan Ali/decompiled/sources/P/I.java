package P;

/* loaded from: classes.dex */
public final class I implements G0 {

    /* renamed from: k, reason: collision with root package name */
    public final i4.c f4321k;

    /* renamed from: l, reason: collision with root package name */
    public J f4322l;

    public I(i4.c cVar) {
        this.f4321k = cVar;
    }

    @Override // P.G0
    public final void a() {
        this.f4322l = (J) this.f4321k.c(AbstractC0329z.f4606b);
    }

    @Override // P.G0
    public final void e() {
        J j5 = this.f4322l;
        if (j5 != null) {
            j5.a();
        }
        this.f4322l = null;
    }

    @Override // P.G0
    public final void c() {
    }
}
