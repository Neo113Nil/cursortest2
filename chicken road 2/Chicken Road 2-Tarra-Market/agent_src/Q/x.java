package Q;

/* loaded from: classes.dex */
public final class x extends p {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.google.android.gms.common.internal.a f479g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(com.google.android.gms.common.internal.a aVar, int i2) {
        super(aVar, i2, null);
        this.f479g = aVar;
    }

    @Override // Q.p
    public final void a(N.b bVar) {
        com.google.android.gms.common.internal.a aVar = this.f479g;
        aVar.getClass();
        aVar.f740i.a(bVar);
        System.currentTimeMillis();
    }

    @Override // Q.p
    public final boolean b() {
        this.f479g.f740i.a(N.b.f229e);
        return true;
    }
}
