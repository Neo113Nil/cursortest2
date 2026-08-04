package A1;

import com.google.android.exoplayer2.Format$Builder;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class J implements p151v2.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f107a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p156w2.o f108b;

    public /* synthetic */ J(B1.a aVar, p156w2.o oVar) {
        this.f108b = oVar;
    }

    @Override // p151v2.e
    public final void invoke(Object obj) {
        switch (this.f107a) {
            case 0:
                ((z0) obj).v(this.f108b);
                break;
            default:
                B1.n nVar = (B1.n) ((B1.b) obj);
                B1.m mVar = nVar.f1031o;
                p156w2.o oVar = this.f108b;
                if (mVar != null) {
                    X x4 = (X) mVar.f1015c;
                    if (x4.f289I == -1) {
                        Format$Builder format$BuilderA = x4.a();
                        format$BuilderA.f10542p = oVar.f18048a;
                        format$BuilderA.f10543q = oVar.f18049b;
                        nVar.f1031o = new B1.m(new X(format$BuilderA), mVar.f1014b, (String) mVar.f1016d, 0);
                    }
                }
                int i7 = oVar.f18048a;
                break;
        }
    }

    public /* synthetic */ J(p156w2.o oVar) {
        this.f108b = oVar;
    }
}
