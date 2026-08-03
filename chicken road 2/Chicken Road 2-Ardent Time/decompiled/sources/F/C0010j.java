package F;

/* renamed from: F.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0010j extends m1.AbstractC0931b {

    /* renamed from: d, reason: collision with root package name */
    public F.C0014n f467d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f468e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ F.C0014n f469f;

    /* renamed from: g, reason: collision with root package name */
    public int f470g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0010j(F.C0014n c0014n, m1.AbstractC0931b abstractC0931b) {
        super(abstractC0931b);
        this.f469f = c0014n;
    }

    @Override // m1.AbstractC0931b
    public final java.lang.Object g(java.lang.Object obj) {
        this.f468e = obj;
        this.f470g |= Integer.MIN_VALUE;
        return this.f469f.b(this);
    }
}
