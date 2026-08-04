package C1;

import A1.C0046u;
import A1.X;
import p155w1.P2;

/* JADX INFO: renamed from: C1.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0107m implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1503a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ P2 f1504b;

    public /* synthetic */ RunnableC0107m(P2 p5, int i7, long j, long j3) {
        this.f1503a = 7;
        this.f1504b = p5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        P2 p5 = this.f1504b;
        int i7 = this.f1503a;
        p5.getClass();
        switch (i7) {
            case 0:
                int i8 = p151v2.t.f17159a;
                B1.h hVar = ((A1.K) p5.f17515c).f109a.f169q;
                hVar.N(hVar.M(), 1012, new B1.d(10));
                break;
            case 1:
                int i9 = p151v2.t.f17159a;
                B1.h hVar2 = ((A1.K) p5.f17515c).f109a.f169q;
                hVar2.N(hVar2.M(), 1008, new C0046u(19));
                break;
            case 2:
                int i10 = p151v2.t.f17159a;
                B1.h hVar3 = ((A1.K) p5.f17515c).f109a.f169q;
                hVar3.N(hVar3.M(), 1029, new C0046u(20));
                break;
            case 3:
                int i11 = p151v2.t.f17159a;
                B1.h hVar4 = ((A1.K) p5.f17515c).f109a.f169q;
                hVar4.N(hVar4.M(), 1010, new B1.d(12));
                break;
            case 4:
                int i12 = p151v2.t.f17159a;
                A1.N n2 = ((A1.K) p5.f17515c).f109a;
                n2.getClass();
                B1.h hVar5 = n2.f169q;
                hVar5.N(hVar5.M(), 1007, new B1.d(21));
                break;
            case 5:
                int i13 = p151v2.t.f17159a;
                A1.N n7 = ((A1.K) p5.f17515c).f109a;
                n7.getClass();
                B1.h hVar6 = n7.f169q;
                hVar6.N(hVar6.M(), 1009, new C0046u(22));
                break;
            case 6:
                int i14 = p151v2.t.f17159a;
                B1.h hVar7 = ((A1.K) p5.f17515c).f109a.f169q;
                hVar7.N(hVar7.M(), 1014, new B1.d(18));
                break;
            default:
                int i15 = p151v2.t.f17159a;
                B1.h hVar8 = ((A1.K) p5.f17515c).f109a.f169q;
                hVar8.N(hVar8.M(), 1011, new B1.d(29));
                break;
        }
    }

    public /* synthetic */ RunnableC0107m(P2 p5, long j) {
        this.f1503a = 3;
        this.f1504b = p5;
    }

    public /* synthetic */ RunnableC0107m(P2 p5, X x4, D1.i iVar) {
        this.f1503a = 5;
        this.f1504b = p5;
    }

    public /* synthetic */ RunnableC0107m(P2 p5, Object obj, int i7) {
        this.f1503a = i7;
        this.f1504b = p5;
    }

    public /* synthetic */ RunnableC0107m(P2 p5, String str, long j, long j3) {
        this.f1503a = 1;
        this.f1504b = p5;
    }
}
