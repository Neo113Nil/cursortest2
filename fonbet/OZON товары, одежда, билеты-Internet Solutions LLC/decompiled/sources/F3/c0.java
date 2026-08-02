package F3;

import j3.AbstractC7252H;
import j3.C7275q;

/* loaded from: classes8.dex */
public final class c0 extends AbstractC3012q {

    /* renamed from: a, reason: collision with root package name */
    private final C7275q f8632a;

    public c0(AbstractC7252H abstractC7252H, C7275q c7275q) {
        super(abstractC7252H);
        this.f8632a = c7275q;
    }

    @Override // F3.AbstractC3012q, j3.AbstractC7252H
    public final AbstractC7252H.c getWindow(int i11, AbstractC7252H.c cVar, long j11) {
        super.getWindow(i11, cVar, j11);
        C7275q c7275q = this.f8632a;
        cVar.f68948c = c7275q;
        C7275q.f fVar = c7275q.f69184b;
        cVar.f68947b = fVar != null ? fVar.f69246g : null;
        return cVar;
    }
}
