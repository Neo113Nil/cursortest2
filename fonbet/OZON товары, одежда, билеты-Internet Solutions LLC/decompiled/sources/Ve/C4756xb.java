package Ve;

import Ae.C2399j;
import android.net.Uri;
import java.util.List;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import spay.sdk.api.SPayHelpers;
import spay.sdk.domain.model.response.listOfCards.ListOfCardsResponseBody;

/* renamed from: Ve.xb, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4756xb extends AbstractC4642tb {

    /* renamed from: e, reason: collision with root package name */
    public final Y9 f32477e;

    /* renamed from: f, reason: collision with root package name */
    public final Uri f32478f;

    /* renamed from: g, reason: collision with root package name */
    public final Ae.M0 f32479g;

    /* renamed from: h, reason: collision with root package name */
    public final Ae.M0 f32480h;

    /* renamed from: i, reason: collision with root package name */
    public final Ae.x0 f32481i;

    /* renamed from: j, reason: collision with root package name */
    public final Ae.M0 f32482j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4756xb(Te metricFacade, Vm sPayDataContract, Yc clearSdkUtil, Y9 sPaySdkReducer, Ib sPayStorage, H4 helperManager) {
        super(metricFacade, sPayDataContract, clearSdkUtil, sPaySdkReducer);
        ListOfCardsResponseBody.PromoInfo.BannerData bannerData;
        ListOfCardsResponseBody.PromoInfo.BannerData.Buttons buttons;
        Intrinsics.checkNotNullParameter(metricFacade, "metricFacade");
        Intrinsics.checkNotNullParameter(sPayDataContract, "sPayDataContract");
        Intrinsics.checkNotNullParameter(clearSdkUtil, "clearSdkUtil");
        Intrinsics.checkNotNullParameter(sPaySdkReducer, "sPaySdkReducer");
        Intrinsics.checkNotNullParameter(sPayStorage, "sPayStorage");
        Intrinsics.checkNotNullParameter(helperManager, "helperManager");
        this.f32477e = sPaySdkReducer;
        AbstractC4245fi abstractC4245fi = ((Fh) ((C4673ud) sPayStorage).f32205b.getValue()).f29004a;
        Intrinsics.g(abstractC4245fi, "null cannot be cast to non-null type spay.sdk.domain.OutcomeState.HelpersState");
        To to = (To) abstractC4245fi;
        String str = null;
        Ae.x0 a11 = Ae.O0.a(null);
        this.f32479g = C2399j.b(a11);
        Ae.x0 a12 = Ae.O0.a(null);
        this.f32480h = C2399j.b(a12);
        Ae.x0 a13 = Ae.O0.a(null);
        this.f32481i = a13;
        this.f32482j = C2399j.b(a13);
        a11.tryEmit(C7714v.U0(((C4654tn) helperManager.f29117b).f32156y).contains(SPayHelpers.DEBIT_CARD) ? Ta.f30028a : Ta.f30029b);
        List a14 = to.f30074a.a();
        if (a14 == null || (bannerData = (ListOfCardsResponseBody.PromoInfo.BannerData) C7714v.M(a14)) == null) {
            return;
        }
        List<ListOfCardsResponseBody.PromoInfo.BannerData.Buttons> buttons2 = bannerData.getButtons();
        if (buttons2 != null && (buttons = (ListOfCardsResponseBody.PromoInfo.BannerData.Buttons) C7714v.M(buttons2)) != null) {
            str = buttons.getDeeplink();
        }
        this.f32478f = Uri.parse(str);
        a12.tryEmit(bannerData);
    }

    public final void e0(E noMatchingCardsHelperEvent) {
        Intrinsics.checkNotNullParameter(noMatchingCardsHelperEvent, "noMatchingCardsHelperEvent");
        boolean equals = noMatchingCardsHelperEvent.equals(Ec.f28922a);
        Y9 y92 = this.f32477e;
        Te te2 = this.f30497a;
        if (equals) {
            te2.b(new Bi(W.TOUCH_CANCEL, Ur.NO_ACTIVE_CARDS_VIEW, Pe.TOUCH, null, null, null, null, 120));
            ((C4238fb) y92).b(C4825zo.f32678a);
        } else {
            if (noMatchingCardsHelperEvent.equals(C4327id.f31286a)) {
                this.f32481i.tryEmit(new L5(this.f32478f));
                te2.b(new Bi(W.TOUCH_ISSUE_CARD, Ur.NO_ACTIVE_CARDS_VIEW, Pe.TOUCH, null, null, null, null, 120));
                ((C4238fb) y92).b(C4825zo.f32678a);
                return;
            }
            if (noMatchingCardsHelperEvent.equals(Md.f29470a)) {
                te2.b(new Bi(W.LC_NO_ACTIVE_CARDS_VIEW_APPEARED, Ur.NO_ACTIVE_CARDS_VIEW, Pe.LCStart, null, null, null, null, 120));
            } else if (noMatchingCardsHelperEvent.equals(C4587re.f31975a)) {
                te2.b(new Bi(W.LC_NO_ACTIVE_CARDS_VIEW_DISAPPEARED, Ur.NO_ACTIVE_CARDS_VIEW, Pe.LCEnd, null, null, null, null, 120));
            }
        }
    }
}
