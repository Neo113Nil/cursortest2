package Ve;

import Ae.C2399j;
import Ae.I0;
import Sc.InterfaceC4008j;
import h3.C6788a;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: Ve.mk, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4449mk extends AbstractC4599rq {

    /* renamed from: d, reason: collision with root package name */
    public final Y9 f31598d;

    /* renamed from: e, reason: collision with root package name */
    public EnumC4801z0 f31599e;

    /* renamed from: f, reason: collision with root package name */
    public final Ae.x0 f31600f;

    /* renamed from: g, reason: collision with root package name */
    public final InterfaceC4008j f31601g;

    /* renamed from: h, reason: collision with root package name */
    public final InterfaceC4008j f31602h;

    /* renamed from: i, reason: collision with root package name */
    public final Ae.M0 f31603i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4449mk(Te metricFacade, Vm sPayDataContract, Y9 sPaySdkReducer, Vl sPaySdkConfigRepository) {
        super(metricFacade, sPayDataContract, sPaySdkReducer);
        Intrinsics.checkNotNullParameter(metricFacade, "metricFacade");
        Intrinsics.checkNotNullParameter(sPayDataContract, "sPayDataContract");
        Intrinsics.checkNotNullParameter(sPaySdkReducer, "sPaySdkReducer");
        Intrinsics.checkNotNullParameter(sPaySdkConfigRepository, "sPaySdkConfigRepository");
        this.f31598d = sPaySdkReducer;
        this.f31599e = EnumC4801z0.f32615a;
        this.f31600f = Ae.O0.a(Boolean.TRUE);
        this.f31601g = Sc.k.b(new Ed(sPayDataContract, 1));
        this.f31602h = Sc.k.b(new C4361jj(sPayDataContract));
        C4712vn c4712vn = (C4712vn) sPaySdkConfigRepository;
        c4712vn.getClass();
        Intrinsics.checkNotNullParameter("npmLinkText", "key");
        LinkedHashMap linkedHashMap = c4712vn.f32314d;
        if (linkedHashMap.isEmpty()) {
            c4712vn.c();
        }
        String str = (String) linkedHashMap.get("npmLinkText");
        if (str == null) {
            Lm0.a.f17149a.e("Null localization string for key: npmLinkText", new Object[0]);
            str = "";
        }
        Be.m D11 = C2399j.D(Ae.O0.a(str), new Lj());
        C6788a a11 = androidx.lifecycle.x0.a(this);
        int i11 = Ae.I0.f818a;
        this.f31603i = C2399j.M(D11, a11, I0.a.c(), null);
    }

    public final void e0(Lf.a event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (event.equals(H7.f29124b)) {
            if (AbstractC4129bh.f30736a[this.f31599e.ordinal()] == 1) {
                ((C4238fb) this.f31598d).b(new Oc(Vf.f30201a, false));
                return;
            } else {
                ((C4238fb) this.f31988c).b(C4825zo.f32678a);
                return;
            }
        }
        if (!(event instanceof C4437m8)) {
            throw new Sc.o();
        }
        String str = ((C4437m8) event).f31568b;
        Hh hh2 = new Hh(this);
        C4274gi c4274gi = new C4274gi(this, 0);
        StringBuilder sb2 = new StringBuilder();
        for (int i11 = 0; i11 < str.length(); i11++) {
            char charAt = str.charAt(i11);
            if (charAt != '+' && charAt != ' ' && charAt != '-') {
                sb2.append(charAt);
            }
        }
        String sb3 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(sb3, "toString(...)");
        if (sb3.length() == 11) {
            hh2.invoke(sb3);
        } else {
            c4274gi.invoke();
        }
    }
}
