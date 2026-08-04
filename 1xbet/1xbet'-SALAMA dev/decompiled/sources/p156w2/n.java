package p156w2;

import A1.K;
import A1.N;
import A1.X;
import B1.d;
import B1.f;
import B1.h;
import D1.i;
import com.google.android.gms.common.internal.w;
import p018c2.D;
import p151v2.t;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class n implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18046a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ w f18047b;

    public /* synthetic */ n(w wVar, int i7, long j) {
        this.f18046a = 0;
        this.f18047b = wVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = 5;
        w wVar = this.f18047b;
        int i8 = this.f18046a;
        wVar.getClass();
        switch (i8) {
            case 0:
                int i9 = t.f17159a;
                h hVar = ((K) wVar.f11336c).f109a.f169q;
                hVar.N(hVar.K((D) hVar.f989d.f5826e), 1018, new d(14));
                break;
            case 1:
                int i10 = t.f17159a;
                h hVar2 = ((K) wVar.f11336c).f109a.f169q;
                hVar2.N(hVar2.M(), 1019, new d(28));
                break;
            case 2:
                int i11 = t.f17159a;
                h hVar3 = ((K) wVar.f11336c).f109a.f169q;
                hVar3.N(hVar3.M(), 1030, new f(i7));
                break;
            case 3:
                int i12 = t.f17159a;
                h hVar4 = ((K) wVar.f11336c).f109a.f169q;
                hVar4.N(hVar4.M(), 1016, new d(7));
                break;
            case 4:
                int i13 = t.f17159a;
                N n2 = ((K) wVar.f11336c).f109a;
                n2.getClass();
                h hVar5 = n2.f169q;
                hVar5.N(hVar5.M(), 1015, new d(5));
                break;
            case 5:
                int i14 = t.f17159a;
                N n7 = ((K) wVar.f11336c).f109a;
                n7.getClass();
                h hVar6 = n7.f169q;
                hVar6.N(hVar6.M(), 1017, new d(4));
                break;
            default:
                int i15 = t.f17159a;
                h hVar7 = ((K) wVar.f11336c).f109a.f169q;
                hVar7.N(hVar7.K((D) hVar7.f989d.f5826e), 1021, new d(19));
                break;
        }
    }

    public /* synthetic */ n(w wVar, long j, int i7) {
        this.f18046a = 6;
        this.f18047b = wVar;
    }

    public /* synthetic */ n(w wVar, X x4, i iVar) {
        this.f18046a = 5;
        this.f18047b = wVar;
    }

    public /* synthetic */ n(w wVar, Object obj, int i7) {
        this.f18046a = i7;
        this.f18047b = wVar;
    }

    public /* synthetic */ n(w wVar, String str, long j, long j3) {
        this.f18046a = 3;
        this.f18047b = wVar;
    }
}
