package N9;

import o9.C8666h;

/* loaded from: classes9.dex */
public final class j extends f {

    /* renamed from: c, reason: collision with root package name */
    private boolean f18811c;

    public j(h9.k kVar) {
        super(kVar);
        this.f18811c = true;
    }

    @Override // N9.f
    protected final h9.c d(h9.n nVar) {
        if (this.f18811c) {
            this.f18811c = false;
            return new h9.c(new C8666h(new h9.i(nVar)));
        }
        this.f18811c = true;
        return new h9.c(new C8666h(nVar));
    }
}
