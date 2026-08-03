package C1;

/* loaded from: classes.dex */
public final class b extends m1.AbstractC0931b {

    /* renamed from: d, reason: collision with root package name */
    public B1.r f115d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f116e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C1.c f117f;

    /* renamed from: g, reason: collision with root package name */
    public int f118g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(C1.c cVar, m1.AbstractC0931b abstractC0931b) {
        super(abstractC0931b);
        this.f117f = cVar;
    }

    @Override // m1.AbstractC0931b
    public final java.lang.Object g(java.lang.Object obj) {
        this.f116e = obj;
        this.f118g |= Integer.MIN_VALUE;
        return this.f117f.a(null, this);
    }
}
