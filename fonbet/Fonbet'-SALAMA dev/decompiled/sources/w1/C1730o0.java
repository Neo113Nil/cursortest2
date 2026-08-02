package w1;

/* renamed from: w1.o0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1730o0 extends AbstractRunnableC1687d1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17811a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f17812b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f17813c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f17814d;

    public /* synthetic */ C1730o0(Object obj, int i7, Object obj2, int i8) {
        this.f17811a = i8;
        this.f17814d = obj;
        this.f17812b = i7;
        this.f17813c = obj2;
    }

    @Override // w1.AbstractRunnableC1687d1
    public final void a() {
        switch (this.f17811a) {
            case 0:
                k1.g gVar = (k1.g) this.f17814d;
                C1743s0 c1743s0 = (C1743s0) gVar.f14677d;
                String h6 = C1743s0.h((String) this.f17813c);
                c1743s0.getClass();
                boolean z4 = H2.a().f17406k.f17724C.get();
                String str = (String) gVar.f14674a;
                int i7 = this.f17812b;
                if (!z4) {
                    AbstractC1707i1.e(i7, "last_streaming_http_error_code");
                    AbstractC1707i1.g("last_streaming_http_error_message", h6);
                    AbstractC1707i1.g("last_streaming_http_report_identifier", str);
                    break;
                } else {
                    AbstractC1706i0.i(h6, i7, str, true);
                    break;
                }
            default:
                int i8 = AbstractC1752v0.f17890a[t.e.e(this.f17812b)];
                if (i8 == 2) {
                    ((u1.j) this.f17813c).f();
                    break;
                } else if (i8 == 3) {
                    ((u1.j) this.f17813c).e();
                    break;
                } else if (i8 == 4) {
                    ((u1.j) this.f17813c).d(((C1755w0) this.f17814d).f17907H);
                    break;
                }
                break;
        }
    }
}
