package f1;

/* renamed from: f1.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0126m extends m1.AbstractC0931b {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f2852d;

    /* renamed from: e, reason: collision with root package name */
    public int f2853e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ f1.C0127n f2854f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0126m(f1.C0127n c0127n, k1.d dVar) {
        super(dVar);
        this.f2854f = c0127n;
    }

    @Override // m1.AbstractC0931b
    public final java.lang.Object g(java.lang.Object obj) {
        this.f2852d = obj;
        this.f2853e |= Integer.MIN_VALUE;
        return this.f2854f.a(null, this);
    }
}
