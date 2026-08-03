package O1;

/* loaded from: classes.dex */
public abstract class b implements V1.w {

    /* renamed from: a, reason: collision with root package name */
    public final V1.k f1168a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f1169b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ M1.o f1170c;

    public b(M1.o this$0) {
        kotlin.jvm.internal.i.e(this$0, "this$0");
        this.f1170c = this$0;
        this.f1168a = new V1.k(((V1.q) this$0.f1098d).f1784a.d());
    }

    public final void a() {
        M1.o oVar = this.f1170c;
        int i2 = oVar.f1095a;
        if (i2 == 6) {
            return;
        }
        if (i2 != 5) {
            throw new java.lang.IllegalStateException(kotlin.jvm.internal.i.h(java.lang.Integer.valueOf(oVar.f1095a), "state: "));
        }
        V1.k kVar = this.f1168a;
        V1.y yVar = kVar.f1769e;
        kVar.f1769e = V1.y.f1800d;
        yVar.a();
        yVar.b();
        oVar.f1095a = 6;
    }

    @Override // V1.w
    public long c(V1.g sink, long j2) {
        M1.o oVar = this.f1170c;
        kotlin.jvm.internal.i.e(sink, "sink");
        try {
            return ((V1.q) oVar.f1098d).c(sink, j2);
        } catch (java.io.IOException e2) {
            ((M1.k) oVar.f1097c).k();
            a();
            throw e2;
        }
    }

    @Override // V1.w
    public final V1.y d() {
        return this.f1168a;
    }
}
