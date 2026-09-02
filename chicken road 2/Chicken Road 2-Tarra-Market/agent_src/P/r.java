package P;

import Q.InterfaceC0004b;

/* loaded from: classes.dex */
public final class r implements InterfaceC0004b {

    /* renamed from: a, reason: collision with root package name */
    public boolean f346a;

    /* renamed from: b, reason: collision with root package name */
    public Object f347b;

    /* renamed from: c, reason: collision with root package name */
    public Object f348c;

    /* renamed from: d, reason: collision with root package name */
    public Object f349d;

    /* renamed from: e, reason: collision with root package name */
    public Object f350e;

    /* renamed from: f, reason: collision with root package name */
    public Object f351f;

    @Override // Q.InterfaceC0004b
    public void a(N.b bVar) {
        ((C0002c) this.f351f).f314m.post(new q(0, this, bVar));
    }

    public void b(N.b bVar) {
        o oVar = (o) ((C0002c) this.f351f).f311j.get((C0000a) this.f348c);
        if (oVar != null) {
            oVar.p(bVar);
        }
    }
}
