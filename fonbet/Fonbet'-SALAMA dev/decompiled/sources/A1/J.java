package A1;

import com.google.android.exoplayer2.Format$Builder;

/* loaded from: classes.dex */
public final /* synthetic */ class J implements v2.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f107a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ w2.o f108b;

    public /* synthetic */ J(B1.a aVar, w2.o oVar) {
        this.f108b = oVar;
    }

    @Override // v2.e
    public final void invoke(Object obj) {
        switch (this.f107a) {
            case 0:
                ((z0) obj).v(this.f108b);
                break;
            default:
                B1.n nVar = (B1.n) ((B1.b) obj);
                B1.m mVar = nVar.f1031o;
                w2.o oVar = this.f108b;
                if (mVar != null) {
                    X x4 = (X) mVar.f1015c;
                    if (x4.f289I == -1) {
                        Format$Builder a2 = x4.a();
                        a2.f10542p = oVar.f18042a;
                        a2.f10543q = oVar.f18043b;
                        nVar.f1031o = new B1.m(new X(a2), mVar.f1014b, (String) mVar.f1016d, 0);
                    }
                }
                int i7 = oVar.f18042a;
                break;
        }
    }

    public /* synthetic */ J(w2.o oVar) {
        this.f108b = oVar;
    }
}
