package Ve;

import Ae.C2399j;
import Ae.C2406m0;
import Ae.I0;
import h3.C6788a;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: Ve.k4, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4375k4 extends AbstractC4599rq {

    /* renamed from: d, reason: collision with root package name */
    public final Y9 f31416d;

    /* renamed from: e, reason: collision with root package name */
    public final Ae.M0 f31417e;

    /* renamed from: f, reason: collision with root package name */
    public final Ae.M0 f31418f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4375k4(Te metricFacade, Vm sPayDataContract, Y9 sPaySdkReducer, Ib sPayStorage) {
        super(metricFacade, sPayDataContract, sPaySdkReducer);
        Intrinsics.checkNotNullParameter(metricFacade, "metricFacade");
        Intrinsics.checkNotNullParameter(sPayDataContract, "sPayDataContract");
        Intrinsics.checkNotNullParameter(sPaySdkReducer, "sPaySdkReducer");
        Intrinsics.checkNotNullParameter(sPayStorage, "sPayStorage");
        this.f31416d = sPaySdkReducer;
        C4673ud c4673ud = (C4673ud) sPayStorage;
        C4141c0 c4141c0 = new C4141c0(new V1(c4673ud.f32205b));
        C6788a a11 = androidx.lifecycle.x0.a(this);
        int i11 = Ae.I0.f818a;
        Ae.M0 M11 = C2399j.M(c4141c0, a11, I0.a.b(3), null);
        this.f31417e = M11;
        this.f31418f = C2399j.M(new G3(new C2406m0(M11)), androidx.lifecycle.x0.a(this), I0.a.b(3), C4689v0.f32243c);
        if (!(c4673ud.a().f29004a instanceof C4755xa)) {
            throw new C4581r8(c4673ud.a().toString());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x002e, code lost:
    
        if (r0.f32476b == true) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e0(Lf.a event) {
        Intrinsics.checkNotNullParameter(event, "event");
        boolean equals = event.equals(Qn.f29804b);
        Y9 y92 = this.f31416d;
        if (equals) {
            ((C4238fb) y92).b(C4825zo.f32678a);
        } else if (event.equals(C4684uo.f32234b)) {
            C4755xa c4755xa = (C4755xa) this.f31417e.getValue();
            boolean z11 = c4755xa != null;
            ((C4238fb) y92).b(new C4282gq(z11));
        }
    }
}
