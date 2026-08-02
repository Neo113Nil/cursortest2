package Sg;

/* loaded from: classes6.dex */
public final class c implements a {

    /* renamed from: b, reason: collision with root package name */
    private volatile a f26234b = d.f26237b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f26235c;

    /* renamed from: d, reason: collision with root package name */
    private volatile Rg.a f26236d;

    @Override // Sg.a
    public final Rg.a a() {
        if (!this.f26235c) {
            return this.f26236d;
        }
        a aVar = this.f26234b;
        if (aVar != null) {
            return aVar.a();
        }
        return null;
    }

    @Override // Sg.a
    public final void b(a aVar) {
        this.f26234b = aVar;
    }

    @Override // Sg.a
    public final void c() {
        this.f26235c = true;
    }

    @Override // Sg.a
    public final a d() {
        return this.f26234b;
    }

    @Override // Sg.a
    public final void e(Rg.a aVar) {
        this.f26236d = aVar;
        a aVar2 = this.f26234b;
        if (aVar2 != null) {
            aVar2.e(aVar);
        }
    }
}
