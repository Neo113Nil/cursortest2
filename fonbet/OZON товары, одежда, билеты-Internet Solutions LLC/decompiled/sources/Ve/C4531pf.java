package Ve;

import Ae.C2399j;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: Ve.pf, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4531pf extends AbstractC4599rq implements InterfaceC4572qr {

    /* renamed from: d, reason: collision with root package name */
    public final J7 f31782d;

    /* renamed from: e, reason: collision with root package name */
    public final Ae.x0 f31783e;

    /* renamed from: f, reason: collision with root package name */
    public final Ae.M0 f31784f;

    /* renamed from: g, reason: collision with root package name */
    public CountDownTimerC4352ja f31785g;

    /* renamed from: h, reason: collision with root package name */
    public long f31786h;

    /* renamed from: i, reason: collision with root package name */
    public final long f31787i;

    /* renamed from: j, reason: collision with root package name */
    public final C4633t2 f31788j;

    /* renamed from: k, reason: collision with root package name */
    public final Ed f31789k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4531pf(Te metricFacade, Vm sPayDataContract, J7 restoreSessionIdUseCase, Y9 sPaySdkReducer) {
        super(metricFacade, sPayDataContract, sPaySdkReducer);
        Intrinsics.checkNotNullParameter(metricFacade, "metricFacade");
        Intrinsics.checkNotNullParameter(sPayDataContract, "sPayDataContract");
        Intrinsics.checkNotNullParameter(restoreSessionIdUseCase, "restoreSessionIdUseCase");
        Intrinsics.checkNotNullParameter(sPaySdkReducer, "sPaySdkReducer");
        this.f31782d = restoreSessionIdUseCase;
        Ae.x0 a11 = Ae.O0.a(null);
        this.f31783e = a11;
        this.f31784f = C2399j.b(a11);
        this.f31786h = 4000L;
        this.f31787i = 1000L;
        this.f31788j = new C4633t2(this, 1);
        this.f31789k = new Ed(this, 0);
    }

    @Override // Ve.InterfaceC4572qr
    public final Function1 a() {
        return this.f31788j;
    }

    @Override // Ve.InterfaceC4572qr
    public final Function0 b() {
        return this.f31789k;
    }

    @Override // Ve.Yk
    public final void d0(M1.b viewState) {
        CountDownTimerC4352ja countDownTimerC4352ja;
        Intrinsics.checkNotNullParameter(viewState, "event");
        super.d0(viewState);
        Intrinsics.checkNotNullParameter(viewState, "viewState");
        if (viewState.equals(C4650tj.f32117a)) {
            this.f31785g = new CountDownTimerC4352ja(this.f31786h, this.f31787i, new C4397kq(this), new Qq(this));
            return;
        }
        if (viewState.equals(Qi.f29790a)) {
            CountDownTimerC4352ja countDownTimerC4352ja2 = this.f31785g;
            if (countDownTimerC4352ja2 != null) {
                countDownTimerC4352ja2.start();
                return;
            }
            return;
        }
        if (!viewState.equals(C4534pi.f31799a) || (countDownTimerC4352ja = this.f31785g) == null) {
            return;
        }
        countDownTimerC4352ja.cancel();
    }
}
