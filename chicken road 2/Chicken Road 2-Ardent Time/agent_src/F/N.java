package F;

/* loaded from: classes.dex */
public final class N extends m1.AbstractC0931b {

    /* renamed from: d, reason: collision with root package name */
    public kotlin.jvm.internal.o f367d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f368e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ F.P f369f;

    /* renamed from: g, reason: collision with root package name */
    public int f370g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public N(F.P p2, m1.AbstractC0931b abstractC0931b) {
        super(abstractC0931b);
        this.f369f = p2;
    }

    @Override // m1.AbstractC0931b
    public final java.lang.Object g(java.lang.Object obj) {
        this.f368e = obj;
        this.f370g |= Integer.MIN_VALUE;
        return this.f369f.j(null, false, this);
    }
}
