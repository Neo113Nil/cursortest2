package EL;

import hi.InterfaceC6958a;
import k20.C7475g;
import k20.InterfaceC7469a;
import ru.ozon.app.android.common.header.core.HeaderViewMapper2;
import ru.ozon.app.android.common.header.di.HeaderComponent;
import ru.ozon.app.android.marketing.widgets.sellerActionsLadder.di.SellerActionsLadderComponent;
import ru.ozon.app.android.marketing.widgets.timerWidget.di.TimerWidgetComponent;
import ru.ozon.app.android.monetization.widgets.playerShowCase.v1.di.PlayerShowcaseComponent;
import ru.ozon.app.android.pdp.widgets.preOrderSubscriptionButton.di.PreOrderSubscriptionButtonComponent;
import ru.ozon.app.android.regulardraw.widgets.lotteryResult.di.LotteryResultWidgetComponent;
import ru.ozon.app.android.returns.creation.widgets.itemInfo.di.ItemComponent;
import ru.ozon.app.android.returns.creation.widgets.itemInfo.presentation.sticky.ItemWidgetViewMapper;
import ru.ozon.app.android.storefront.widgets.profile.di.ProfileCellComponent;
import ru.ozon.app.android.ugc.payout.widgets.promoReviewProductsV3.di.PromoReviewProductsV3Component;

/* loaded from: classes7.dex */
public final /* synthetic */ class a implements InterfaceC7469a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7691a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C7475g f7692b;

    public /* synthetic */ a(C7475g c7475g, int i11) {
        this.f7691a = i11;
        this.f7692b = c7475g;
    }

    @Override // k20.InterfaceC7469a
    public final InterfaceC6958a component() {
        ProfileCellComponent create$lambda$0;
        PlayerShowcaseComponent instance$lambda$0;
        PromoReviewProductsV3Component instance$lambda$02;
        ItemComponent widgetComponent$lambda$1;
        SellerActionsLadderComponent create$lambda$02;
        HeaderComponent widgetComponent$lambda$0;
        LotteryResultWidgetComponent instance$lambda$03;
        TimerWidgetComponent create$lambda$03;
        PreOrderSubscriptionButtonComponent create$lambda$04;
        switch (this.f7691a) {
            case 0:
                create$lambda$0 = ProfileCellComponent.Companion.create$lambda$0(this.f7692b);
                return create$lambda$0;
            case 1:
                instance$lambda$0 = PlayerShowcaseComponent.Companion.getInstance$lambda$0(this.f7692b);
                return instance$lambda$0;
            case 2:
                instance$lambda$02 = PromoReviewProductsV3Component.Companion.getInstance$lambda$0(this.f7692b);
                return instance$lambda$02;
            case 3:
                widgetComponent$lambda$1 = ItemWidgetViewMapper.widgetComponent$lambda$1(this.f7692b);
                return widgetComponent$lambda$1;
            case 4:
                create$lambda$02 = SellerActionsLadderComponent.Companion.create$lambda$0(this.f7692b);
                return create$lambda$02;
            case 5:
                widgetComponent$lambda$0 = HeaderViewMapper2.widgetComponent$lambda$0(this.f7692b);
                return widgetComponent$lambda$0;
            case 6:
                instance$lambda$03 = LotteryResultWidgetComponent.Companion.getInstance$lambda$0(this.f7692b);
                return instance$lambda$03;
            case 7:
                create$lambda$03 = TimerWidgetComponent.Companion.create$lambda$0(this.f7692b);
                return create$lambda$03;
            default:
                create$lambda$04 = PreOrderSubscriptionButtonComponent.Companion.create$lambda$0(this.f7692b);
                return create$lambda$04;
        }
    }
}
