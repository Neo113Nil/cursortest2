package Pf;

import java.util.Arrays;

/* loaded from: classes10.dex */
public final class l extends h {

    /* renamed from: j, reason: collision with root package name */
    private final Qf.c f22482j;

    static {
        String[] strArr = Of.c.f20353a;
        int i11 = Of.k.f20362f;
        Qf.j.s(Of.k.j(", ", Arrays.asList(strArr)));
    }

    public l(org.jsoup.parser.m mVar, b bVar) {
        super(mVar, null, bVar);
        this.f22482j = new Qf.c();
    }

    @Override // Pf.n
    protected final void G(n nVar) {
        super.G(nVar);
        this.f22482j.remove(nVar);
    }

    @Override // Pf.h
    /* renamed from: P */
    public final h k() {
        return (l) super.k();
    }

    public final void Y(h hVar) {
        this.f22482j.add(hVar);
    }

    @Override // Pf.h, Pf.n
    /* renamed from: clone */
    public final Object k() throws CloneNotSupportedException {
        return (l) super.k();
    }

    @Override // Pf.h, Pf.n
    public final n k() {
        return (l) super.k();
    }
}
