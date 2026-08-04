package C1;

import A1.C0048w;
import p155w1.P2;

/* JADX INFO: renamed from: C1.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0108n implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1505a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f1506b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f1507c;

    public /* synthetic */ RunnableC0108n(Object obj, boolean z4, int i7) {
        this.f1505a = i7;
        this.f1507c = obj;
        this.f1506b = z4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z4 = this.f1506b;
        Object obj = this.f1507c;
        switch (this.f1505a) {
            case 0:
                P2 p5 = (P2) obj;
                p5.getClass();
                int i7 = p151v2.t.f17159a;
                A1.N n2 = ((A1.K) p5.f17515c).f109a;
                if (n2.f147V != z4) {
                    n2.f147V = z4;
                    n2.f164l.k(23, new C0048w(z4, 2));
                    break;
                }
                break;
            default:
                ((E4.t) obj).f2235g.f2997g.f2872b = z4;
                break;
        }
    }
}
