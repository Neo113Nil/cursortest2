package p155w1;

import p072k1.g;
import p136t.e;
import p145u1.j;

/* JADX INFO: renamed from: w1.o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1021o0 extends AbstractRunnableC0978d1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17817a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f17818b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f17819c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f17820d;

    public /* synthetic */ C1021o0(Object obj, int i7, Object obj2, int i8) {
        this.f17817a = i8;
        this.f17820d = obj;
        this.f17818b = i7;
        this.f17819c = obj2;
    }

    @Override // p155w1.AbstractRunnableC0978d1
    public final void a() {
        switch (this.f17817a) {
            case 0:
                g gVar = (g) this.f17820d;
                C1034s0 c1034s0 = (C1034s0) gVar.f14683d;
                String strH = C1034s0.h((String) this.f17819c);
                c1034s0.getClass();
                boolean z4 = H2.a().f17412k.f17730C.get();
                String str = (String) gVar.f14680a;
                int i7 = this.f17818b;
                if (!z4) {
                    AbstractC0998i1.e(i7, "last_streaming_http_error_code");
                    AbstractC0998i1.g("last_streaming_http_error_message", strH);
                    AbstractC0998i1.g("last_streaming_http_report_identifier", str);
                } else {
                    AbstractC0997i0.i(strH, i7, str, true);
                }
                break;
            default:
                int i8 = AbstractC1043v0.f17896a[e.e(this.f17818b)];
                if (i8 == 2) {
                    ((j) this.f17819c).f();
                    break;
                } else if (i8 == 3) {
                    ((j) this.f17819c).e();
                    break;
                } else if (i8 == 4) {
                    ((j) this.f17819c).d(((C1046w0) this.f17820d).f17913H);
                    break;
                }
                break;
        }
    }
}
