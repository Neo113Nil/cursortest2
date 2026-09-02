package f1;

/* loaded from: classes.dex */
public final class w extends m1.AbstractC0931b {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f2893d;

    /* renamed from: e, reason: collision with root package name */
    public int f2894e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ f1.C0127n f2895f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(f1.C0127n c0127n, k1.d dVar) {
        super(dVar);
        this.f2895f = c0127n;
    }

    @Override // m1.AbstractC0931b
    public final java.lang.Object g(java.lang.Object obj) {
        this.f2893d = obj;
        this.f2894e |= Integer.MIN_VALUE;
        return this.f2895f.a(null, this);
    }
}
