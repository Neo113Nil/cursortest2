package Ve;

import Ae.C2399j;
import Ae.C2406m0;
import Ae.I0;
import android.net.Uri;
import h3.C6788a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import spay.sdk.api.SPayHelpers;
import spay.sdk.domain.model.PayStrategy;
import spay.sdk.domain.model.response.listOfCards.ListOfCardsResponseBody;
import xe.C10727i;

/* loaded from: classes6.dex */
public final class N9 extends AbstractC4642tb {

    /* renamed from: e, reason: collision with root package name */
    public final Y9 f29533e;

    /* renamed from: f, reason: collision with root package name */
    public final Ib f29534f;

    /* renamed from: g, reason: collision with root package name */
    public final C4248fl f29535g;

    /* renamed from: h, reason: collision with root package name */
    public final Ae.M0 f29536h;

    /* renamed from: i, reason: collision with root package name */
    public final Ae.x0 f29537i;

    /* renamed from: j, reason: collision with root package name */
    public final Ae.M0 f29538j;

    /* renamed from: k, reason: collision with root package name */
    public final Ae.x0 f29539k;

    /* renamed from: l, reason: collision with root package name */
    public final Ae.M0 f29540l;

    /* renamed from: m, reason: collision with root package name */
    public final Ae.x0 f29541m;

    /* renamed from: n, reason: collision with root package name */
    public final Ae.M0 f29542n;

    /* renamed from: o, reason: collision with root package name */
    public final Ae.M0 f29543o;

    /* renamed from: p, reason: collision with root package name */
    public final C4380k9 f29544p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public N9(Te metricFacade, Vm sPayDataContract, Yc clearSdkUtil, Y9 sPaySdkReducer, Ib sPayStorage, H4 helperManager, Vl sPaySdkConfigRepository, C4248fl featuresHandler) {
        super(metricFacade, sPayDataContract, clearSdkUtil, sPaySdkReducer);
        Zi c4399l;
        ListOfCardsResponseBody.PromoInfo.BannerData.Buttons buttons;
        ListOfCardsResponseBody.PromoInfo.BannerData.Buttons buttons2;
        ListOfCardsResponseBody.PromoInfo.BannerData.Buttons buttons3;
        Intrinsics.checkNotNullParameter(metricFacade, "metricFacade");
        Intrinsics.checkNotNullParameter(sPayDataContract, "sPayDataContract");
        Intrinsics.checkNotNullParameter(clearSdkUtil, "clearSdkUtil");
        Intrinsics.checkNotNullParameter(sPaySdkReducer, "sPaySdkReducer");
        Intrinsics.checkNotNullParameter(sPayStorage, "sPayStorage");
        Intrinsics.checkNotNullParameter(helperManager, "helperManager");
        Intrinsics.checkNotNullParameter(sPaySdkConfigRepository, "sPaySdkConfigRepository");
        Intrinsics.checkNotNullParameter(featuresHandler, "featuresHandler");
        this.f29533e = sPaySdkReducer;
        this.f29534f = sPayStorage;
        this.f29535g = featuresHandler;
        Be.m D11 = C2399j.D(((C4654tn) sPayDataContract).f32141j, new S5(0));
        C6788a a11 = androidx.lifecycle.x0.a(this);
        int i11 = Ae.I0.f818a;
        Ae.M0 M11 = C2399j.M(D11, a11, I0.a.c(), null);
        this.f29536h = M11;
        kotlin.collections.K k11 = kotlin.collections.K.f71697a;
        Ae.x0 a12 = Ae.O0.a(k11);
        this.f29537i = a12;
        this.f29538j = C2399j.b(a12);
        Ae.x0 a13 = Ae.O0.a(k11);
        this.f29539k = a13;
        this.f29540l = C2399j.b(a13);
        Ae.x0 a14 = Ae.O0.a(null);
        this.f29541m = a14;
        this.f29542n = C2399j.b(a14);
        this.f29543o = C2399j.M(new C4808z7(new C2406m0(M11), sPaySdkConfigRepository), androidx.lifecycle.x0.a(this), I0.a.b(3), null);
        this.f29544p = new C4380k9(new C2406m0(M11), this);
        C4673ud c4673ud = (C4673ud) sPayStorage;
        if (!(c4673ud.a().f29004a instanceof To)) {
            throw new C4581r8(c4673ud.a().toString());
        }
        AbstractC4245fi abstractC4245fi = c4673ud.a().f29004a;
        Intrinsics.g(abstractC4245fi, "null cannot be cast to non-null type spay.sdk.domain.OutcomeState.HelpersState");
        List a15 = ((To) abstractC4245fi).f30074a.a();
        if (a15 != null) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : a15) {
                if (!Intrinsics.d(((ListOfCardsResponseBody.PromoInfo.BannerData) obj).getType(), SPayHelpers.DEBIT_CARD.getTag())) {
                    arrayList.add(obj);
                }
            }
            Ae.x0 x0Var = this.f29537i;
            Collection collection = (Collection) x0Var.getValue();
            ArrayList arrayList2 = new ArrayList(C7714v.z(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ListOfCardsResponseBody.PromoInfo.BannerData bannerData = (ListOfCardsResponseBody.PromoInfo.BannerData) it.next();
                if (arrayList.size() == 1) {
                    String header = bannerData.getHeader();
                    String str = header == null ? "" : header;
                    String text = bannerData.getText();
                    String str2 = text == null ? "" : text;
                    List<ListOfCardsResponseBody.PromoInfo.BannerData.Buttons> buttons4 = bannerData.getButtons();
                    String deeplink = (buttons4 == null || (buttons3 = (ListOfCardsResponseBody.PromoInfo.BannerData.Buttons) C7714v.M(buttons4)) == null) ? null : buttons3.getDeeplink();
                    String str3 = deeplink == null ? "" : deeplink;
                    String iconUrl = bannerData.getIconUrl();
                    c4399l = new Rc(str, str2, str3, iconUrl == null ? "" : iconUrl, bannerData.getType());
                } else if (Intrinsics.d(bannerData.getType(), SPayHelpers.BNPL.getTag())) {
                    String header2 = bannerData.getHeader();
                    String str4 = header2 == null ? "" : header2;
                    String text2 = bannerData.getText();
                    String str5 = text2 == null ? "" : text2;
                    List<ListOfCardsResponseBody.PromoInfo.BannerData.Buttons> buttons5 = bannerData.getButtons();
                    String deeplink2 = (buttons5 == null || (buttons2 = (ListOfCardsResponseBody.PromoInfo.BannerData.Buttons) C7714v.M(buttons5)) == null) ? null : buttons2.getDeeplink();
                    String str6 = deeplink2 == null ? "" : deeplink2;
                    String iconUrl2 = bannerData.getIconUrl();
                    c4399l = new C4728wb(str4, str5, str6, iconUrl2 == null ? "" : iconUrl2, bannerData.getType());
                } else {
                    String header3 = bannerData.getHeader();
                    String str7 = header3 == null ? "" : header3;
                    String text3 = bannerData.getText();
                    String str8 = text3 == null ? "" : text3;
                    List<ListOfCardsResponseBody.PromoInfo.BannerData.Buttons> buttons6 = bannerData.getButtons();
                    String deeplink3 = (buttons6 == null || (buttons = (ListOfCardsResponseBody.PromoInfo.BannerData.Buttons) C7714v.M(buttons6)) == null) ? null : buttons.getDeeplink();
                    String str9 = deeplink3 == null ? "" : deeplink3;
                    String iconUrl3 = bannerData.getIconUrl();
                    c4399l = new C4399l(str7, str8, str9, iconUrl3 == null ? "" : iconUrl3, bannerData.getType());
                }
                arrayList2.add(c4399l);
            }
            x0Var.setValue(C7714v.p0(arrayList2, collection));
        }
        List<C4671ub> a16 = helperManager.a();
        Ae.x0 x0Var2 = this.f29539k;
        ArrayList arrayList3 = new ArrayList(C7714v.z(a16, 10));
        for (C4671ub c4671ub : a16) {
            arrayList3.add(new Zb(c4671ub.f32201a, c4671ub.f32202b));
        }
        x0Var2.setValue(arrayList3);
    }

    public final void e0(E mainHelpersEvent) {
        Intrinsics.checkNotNullParameter(mainHelpersEvent, "mainHelpersEvent");
        boolean equals = mainHelpersEvent.equals(Ug.f30128a);
        Y9 y92 = this.f29533e;
        Te te2 = this.f30497a;
        if (equals) {
            te2.b(new Bi(Sa.TOUCH_CANCEL, Ur.HELPERS_VIEW, Pe.TOUCH, null, null, null, null, 120));
            ((C4238fb) y92).b(C4825zo.f32678a);
            return;
        }
        if (mainHelpersEvent.equals(Ah.f28614a)) {
            if (((Collection) this.f29539k.getValue()).isEmpty()) {
                return;
            }
            C10727i.c(androidx.lifecycle.x0.a(this), null, null, new C4521p5(this, null), 3);
            return;
        }
        if (mainHelpersEvent.equals(C4102aj.f30678a)) {
            te2.b(new Bi(Sa.LC_HELPERS_VIEW_APPEARED, Ur.HELPERS_VIEW, Pe.LCStart, null, null, null, null, 120));
            return;
        }
        if (mainHelpersEvent.equals(Ej.f28937a)) {
            te2.b(new Bi(Sa.LC_HELPERS_VIEW_DISAPPEARED, Ur.HELPERS_VIEW, Pe.LCEnd, null, null, null, null, 120));
            return;
        }
        if (!(mainHelpersEvent instanceof Ai)) {
            if (mainHelpersEvent.equals(C4101ai.f30677a)) {
                AbstractC4245fi abstractC4245fi = ((C4673ud) this.f29534f).a().f29004a;
                Intrinsics.g(abstractC4245fi, "null cannot be cast to non-null type spay.sdk.domain.OutcomeState.HelpersState");
                ((C4238fb) y92).b(new Ae(new C4383kc(((To) abstractC4245fi).f30074a)));
                return;
            }
            return;
        }
        Zi zi2 = ((Ai) mainHelpersEvent).f28615a;
        int length = zi2.a().length();
        Ae.x0 x0Var = this.f29541m;
        if (length > 0) {
            Uri parse = Uri.parse(zi2.a());
            Intrinsics.checkNotNullExpressionValue(parse, "parse(this)");
            x0Var.setValue(new L5(parse));
            ((C4238fb) y92).b(C4825zo.f32678a);
        } else if (Intrinsics.d(zi2.b(), SPayHelpers.BNPL.getTag())) {
            C4654tn c4654tn = (C4654tn) this.f30498b;
            long a11 = c4654tn.a();
            EnumC4290h5 tag = EnumC4290h5.BNPL;
            C4248fl c4248fl = this.f29535g;
            c4248fl.getClass();
            Intrinsics.checkNotNullParameter(tag, "tag");
            InterfaceC4678ui interfaceC4678ui = (InterfaceC4678ui) c4248fl.f31050d.get(tag);
            if (interfaceC4678ui != null) {
                interfaceC4678ui.a(new Ja(true));
            }
            c4654tn.f32145n.setValue(Long.valueOf(a11));
            PayStrategy.PayWithPartsOnly status = PayStrategy.PayWithPartsOnly.INSTANCE;
            Intrinsics.checkNotNullParameter(status, "status");
            c4654tn.f32128E.setValue(status);
            ((C4238fb) y92).b(Df.f28862a);
        }
        if (zi2.a().length() > 0) {
            x0Var.setValue(new L5(Uri.parse(zi2.a())));
        }
        te2.b(new Bi(Intrinsics.d(zi2.b(), SPayHelpers.SBP.getTag()) ? Sa.TOUCH_MAKE_TRANSFER : Sa.TOUCH_MAKE_CARD, Ur.HELPERS_VIEW, Pe.TOUCH, null, null, null, null, 120));
    }
}
