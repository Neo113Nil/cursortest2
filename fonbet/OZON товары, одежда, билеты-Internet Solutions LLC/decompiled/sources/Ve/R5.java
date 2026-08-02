package Ve;

import Ae.C2399j;
import Ae.C2406m0;
import Ae.C2417s0;
import Ae.I0;
import Bl0.C2660v;
import h3.C6788a;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class R5 extends AbstractC4599rq implements InterfaceC4572qr {

    /* renamed from: d, reason: collision with root package name */
    public final CountDownTimerC4352ja f29824d;

    /* renamed from: e, reason: collision with root package name */
    public long f29825e;

    /* renamed from: f, reason: collision with root package name */
    public final N1 f29826f;

    /* renamed from: g, reason: collision with root package name */
    public final C2660v f29827g;

    /* renamed from: h, reason: collision with root package name */
    public final Ae.M0 f29828h;

    /* renamed from: i, reason: collision with root package name */
    public final Ae.M0 f29829i;

    /* renamed from: j, reason: collision with root package name */
    public final Ae.x0 f29830j;

    /* renamed from: k, reason: collision with root package name */
    public final Ae.M0 f29831k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public R5(Te metricFacade, Vm sPayDataContract, Ib sPayStorage, Y9 sPaySdkReducer, C4248fl featuresHandler) {
        super(metricFacade, sPayDataContract, sPaySdkReducer);
        Intrinsics.checkNotNullParameter(metricFacade, "metricFacade");
        Intrinsics.checkNotNullParameter(sPayDataContract, "sPayDataContract");
        Intrinsics.checkNotNullParameter(sPayStorage, "sPayStorage");
        Intrinsics.checkNotNullParameter(sPaySdkReducer, "sPaySdkReducer");
        Intrinsics.checkNotNullParameter(featuresHandler, "featuresHandler");
        this.f29825e = 5000L;
        N1 n12 = new N1(this, 0);
        this.f29826f = n12;
        C2660v c2660v = new C2660v(this, 2);
        this.f29827g = c2660v;
        C4673ud c4673ud = (C4673ud) sPayStorage;
        Be.m D11 = C2399j.D(new C4492o5(new A3(c4673ud.f32205b)), new C4428m());
        C6788a a11 = androidx.lifecycle.x0.a(this);
        int i11 = Ae.I0.f818a;
        Ae.M0 M11 = C2399j.M(D11, a11, I0.a.b(3), null);
        this.f29828h = M11;
        this.f29829i = C2399j.M(new C2417s0(C2399j.b(((C4654tn) sPayDataContract).f32157z), c4673ud.f32205b, new B0()), androidx.lifecycle.x0.a(this), I0.a.b(3), null);
        Ae.x0 a12 = Ae.O0.a(null);
        this.f29830j = a12;
        this.f29831k = C2399j.M(new C2417s0(new C2406m0(M11), a12, new U()), androidx.lifecycle.x0.a(this), I0.a.b(3), null);
        if (c4673ud.a().f29004a instanceof Bq) {
            CountDownTimerC4352ja countDownTimerC4352ja = new CountDownTimerC4352ja(this.f29825e, 1000L, n12, c2660v);
            this.f29824d = countDownTimerC4352ja;
            countDownTimerC4352ja.start();
        }
    }

    @Override // Ve.InterfaceC4572qr
    public final Function1 a() {
        return this.f29826f;
    }

    @Override // Ve.InterfaceC4572qr
    public final Function0 b() {
        return this.f29827g;
    }

    @Override // Ve.Yk
    public final void d0(M1.b event) {
        Intrinsics.checkNotNullParameter(event, "event");
        boolean equals = event.equals(C4650tj.f32117a);
        Ae.M0 m02 = this.f29828h;
        if (equals) {
            m02.getValue();
        } else if (event.equals(Vj.f30206a)) {
            try {
                CountDownTimerC4352ja countDownTimerC4352ja = this.f29824d;
                if (countDownTimerC4352ja != null) {
                    countDownTimerC4352ja.cancel();
                }
            } catch (Sc.H unused) {
            }
            m02.getValue();
        }
    }
}
