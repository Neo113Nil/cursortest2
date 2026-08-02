package Ve;

import kotlin.jvm.internal.Intrinsics;
import spay.sdk.domain.model.PayStrategy;
import spay.sdk.view.BnplButtonCompositeView;

/* loaded from: classes6.dex */
public final class Yc {

    /* renamed from: a, reason: collision with root package name */
    public final Vm f30452a;

    /* renamed from: b, reason: collision with root package name */
    public final Ib f30453b;

    /* renamed from: c, reason: collision with root package name */
    public final C4248fl f30454c;

    /* renamed from: d, reason: collision with root package name */
    public final InterfaceC4686uq f30455d;

    /* renamed from: e, reason: collision with root package name */
    public final Y4 f30456e;

    /* renamed from: f, reason: collision with root package name */
    public final C4186dg f30457f;

    public Yc(Vm sPayDataContract, Ib sPayStorage, C4248fl featuresHandler, InterfaceC4686uq authHandler, Y4 setCookieHandler, C4186dg seamlessAuthFeature, Te metricFacade, InterfaceC4524p8 sPayRepository) {
        Intrinsics.checkNotNullParameter(sPayDataContract, "sPayDataContract");
        Intrinsics.checkNotNullParameter(sPayStorage, "sPayStorage");
        Intrinsics.checkNotNullParameter(featuresHandler, "featuresHandler");
        Intrinsics.checkNotNullParameter(authHandler, "authHandler");
        Intrinsics.checkNotNullParameter(setCookieHandler, "setCookieHandler");
        Intrinsics.checkNotNullParameter(seamlessAuthFeature, "seamlessAuthFeature");
        Intrinsics.checkNotNullParameter(metricFacade, "metricFacade");
        Intrinsics.checkNotNullParameter(sPayRepository, "sPayRepository");
        this.f30452a = sPayDataContract;
        this.f30453b = sPayStorage;
        this.f30454c = featuresHandler;
        this.f30455d = authHandler;
        this.f30456e = setCookieHandler;
        this.f30457f = seamlessAuthFeature;
    }

    public final void a(boolean z11) {
        C4248fl c4248fl = this.f30454c;
        EnumC4290h5 tag = EnumC4290h5.BNPL;
        c4248fl.getClass();
        Intrinsics.checkNotNullParameter(tag, "tag");
        InterfaceC4678ui interfaceC4678ui = (InterfaceC4678ui) c4248fl.f31050d.get(tag);
        if (interfaceC4678ui != null) {
            interfaceC4678ui.a(new Ja(false));
        }
        ((C4654tn) this.f30452a).c(EnumC4711vm.f32309b);
        C4673ud c4673ud = (C4673ud) this.f30453b;
        c4673ud.getClass();
        c4673ud.b(new Fh(C4770xp.f32511a, null, false));
        C4248fl c4248fl2 = this.f30454c;
        c4248fl2.getClass();
        Intrinsics.checkNotNullParameter(tag, "tag");
        InterfaceC4678ui interfaceC4678ui2 = (InterfaceC4678ui) c4248fl2.f31050d.get(tag);
        if (interfaceC4678ui2 != null) {
            interfaceC4678ui2.a(new Ja(false));
        }
        ((Yq) this.f30455d).a(Vp.f30226b);
        synchronized (Ul.f30135a) {
            spay.sdk.d.f98848g.a();
        }
        Ul.f30136b = null;
        Ul.f30137c = null;
        spay.sdk.d.f98849h = null;
        C4654tn c4654tn = (C4654tn) this.f30452a;
        c4654tn.getClass();
        c4654tn.f32154w = 0;
        ((C4654tn) this.f30452a).f32138g.setValue(Boolean.TRUE);
        BnplButtonCompositeView.f98858c = false;
        if (z11) {
            Vm vm = this.f30452a;
            PayStrategy.BasePay status = PayStrategy.BasePay.INSTANCE;
            C4654tn c4654tn2 = (C4654tn) vm;
            c4654tn2.getClass();
            Intrinsics.checkNotNullParameter(status, "status");
            c4654tn2.f32128E.setValue(status);
        }
        T0.g.f26423a = true;
        T0.g.f26424b = true;
        Y4 y42 = this.f30456e;
        y42.f30435d = null;
        y42.f30436e = "";
        this.f30457f.getClass();
        C4186dg.f30878c = null;
        Te.f30041h = null;
        Te.f30040g = false;
    }
}
