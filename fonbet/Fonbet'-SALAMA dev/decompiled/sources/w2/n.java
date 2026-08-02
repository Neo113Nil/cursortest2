package w2;

import A1.K;
import A1.N;
import A1.X;
import c2.D;
import com.google.android.gms.common.internal.w;
import v2.t;

/* loaded from: classes.dex */
public final /* synthetic */ class n implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18040a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ w f18041b;

    public /* synthetic */ n(w wVar, int i7, long j) {
        this.f18040a = 0;
        this.f18041b = wVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = 5;
        w wVar = this.f18041b;
        int i8 = this.f18040a;
        wVar.getClass();
        switch (i8) {
            case 0:
                int i9 = t.f17153a;
                B1.h hVar = ((K) wVar.f11336c).f109a.f169q;
                hVar.N(hVar.K((D) hVar.f989d.f5826e), 1018, new B1.d(14));
                break;
            case 1:
                int i10 = t.f17153a;
                B1.h hVar2 = ((K) wVar.f11336c).f109a.f169q;
                hVar2.N(hVar2.M(), 1019, new B1.d(28));
                break;
            case 2:
                int i11 = t.f17153a;
                B1.h hVar3 = ((K) wVar.f11336c).f109a.f169q;
                hVar3.N(hVar3.M(), 1030, new B1.f(i7));
                break;
            case 3:
                int i12 = t.f17153a;
                B1.h hVar4 = ((K) wVar.f11336c).f109a.f169q;
                hVar4.N(hVar4.M(), 1016, new B1.d(7));
                break;
            case 4:
                int i13 = t.f17153a;
                N n2 = ((K) wVar.f11336c).f109a;
                n2.getClass();
                B1.h hVar5 = n2.f169q;
                hVar5.N(hVar5.M(), 1015, new B1.d(5));
                break;
            case 5:
                int i14 = t.f17153a;
                N n7 = ((K) wVar.f11336c).f109a;
                n7.getClass();
                B1.h hVar6 = n7.f169q;
                hVar6.N(hVar6.M(), 1017, new B1.d(4));
                break;
            default:
                int i15 = t.f17153a;
                B1.h hVar7 = ((K) wVar.f11336c).f109a.f169q;
                hVar7.N(hVar7.K((D) hVar7.f989d.f5826e), 1021, new B1.d(19));
                break;
        }
    }

    public /* synthetic */ n(w wVar, long j, int i7) {
        this.f18040a = 6;
        this.f18041b = wVar;
    }

    public /* synthetic */ n(w wVar, X x4, D1.i iVar) {
        this.f18040a = 5;
        this.f18041b = wVar;
    }

    public /* synthetic */ n(w wVar, Object obj, int i7) {
        this.f18040a = i7;
        this.f18041b = wVar;
    }

    public /* synthetic */ n(w wVar, String str, long j, long j3) {
        this.f18040a = 3;
        this.f18041b = wVar;
    }
}
