package F;

/* renamed from: F.z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0025z extends m1.AbstractC0931b {

    /* renamed from: d, reason: collision with root package name */
    public F.P f537d;

    /* renamed from: e, reason: collision with root package name */
    public H1.d f538e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f539f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ F.P f540g;

    /* renamed from: h, reason: collision with root package name */
    public int f541h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0025z(F.P p2, m1.AbstractC0931b abstractC0931b) {
        super(abstractC0931b);
        this.f540g = p2;
    }

    @Override // m1.AbstractC0931b
    public final java.lang.Object g(java.lang.Object obj) {
        this.f539f = obj;
        this.f541h |= Integer.MIN_VALUE;
        return F.P.c(this.f540g, this);
    }
}
