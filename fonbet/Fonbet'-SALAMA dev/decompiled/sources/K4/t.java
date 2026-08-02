package K4;

import F2.C0247p;
import com.google.android.gms.tasks.Tasks;
import w1.C1726n0;

/* loaded from: classes2.dex */
public final /* synthetic */ class t implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4061a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0247p f4062b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ V5.a f4063c;

    public /* synthetic */ t(C0247p c0247p, V5.a aVar, int i7) {
        this.f4061a = i7;
        this.f4062b = c0247p;
        this.f4063c = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f4061a) {
            case 0:
                this.f4062b.a(this.f4063c);
                break;
            case 1:
                C0247p c0247p = this.f4062b;
                c0247p.getClass();
                Q0.a.v(1, "GrpcCallProvider", "connectivityAttemptTimer elapsed. Resetting the channel.", new Object[0]);
                if (((C1726n0) c0247p.f2709d) != null) {
                    Q0.a.v(1, "GrpcCallProvider", "Clearing the connectivityAttemptTimer", new Object[0]);
                    ((C1726n0) c0247p.f2709d).f();
                    c0247p.f2709d = null;
                }
                ((L4.f) c0247p.f2707b).a(new t(c0247p, this.f4063c, 4));
                break;
            case 2:
                C0247p c0247p2 = this.f4062b;
                c0247p2.getClass();
                ((L4.f) c0247p2.f2707b).a(new t(c0247p2, this.f4063c, 3));
                break;
            case 3:
                this.f4062b.a(this.f4063c);
                break;
            default:
                C0247p c0247p3 = this.f4062b;
                c0247p3.getClass();
                this.f4063c.x();
                c0247p3.f2706a = Tasks.call(L4.l.f4378c, new s(c0247p3, 0));
                break;
        }
    }
}
