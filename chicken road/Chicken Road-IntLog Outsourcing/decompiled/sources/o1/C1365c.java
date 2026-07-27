package o1;

/* renamed from: o1.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1365c implements InterfaceC1364b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ G1.a f11526a;

    public C1365c(G1.a aVar) {
        this.f11526a = aVar;
    }

    @Override // o1.InterfaceC1364b
    public final void a(l1.b bVar) {
        boolean b6 = bVar.b();
        G1.a aVar = this.f11526a;
        if (b6) {
            aVar.o(null, aVar.f4992B);
            return;
        }
        C1371i c1371i = aVar.f5012t;
        if (c1371i != null) {
            ((m1.j) c1371i.f11562a).onConnectionFailed(bVar);
        }
    }
}
