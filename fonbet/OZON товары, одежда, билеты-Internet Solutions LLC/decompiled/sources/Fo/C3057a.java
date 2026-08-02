package Fo;

import hi.InterfaceC6958a;
import k20.C7475g;
import k20.InterfaceC7469a;
import ru.ozon.app.android.cabinet.profileAvatar.di.ProfileAvatarComponent;
import ru.ozon.app.android.checkoutcomposer.rfbsSplit.di.RealFbsSplitWidgetComponent;
import ru.ozon.app.android.fresh.feature.b2b.widgets.reconciliationActsDecliner.di.ReconciliationActsDeclinerComponent;
import ru.ozon.app.android.fresh.feature.b2b.widgets.reconciliationActsDecliner.presentation.ReconciliationActsDeclinerViewMapper;
import ru.ozon.app.android.fresh.unsorted.widgets.deliveryWidget.v2.di.DeliveryWidgetV2Component;
import ru.ozon.app.android.marketing.widgets.pdpCouponListV2.core.PdpCouponListV2ViewMapper;
import ru.ozon.app.android.marketing.widgets.pdpCouponListV2.di.PdpCouponListV2Component;
import ru.ozon.app.android.marketing.widgets.stickyLadder.di.StickyLadderComponent;
import ru.ozon.app.android.monetization.widgets.unreadMessageIndicator.di.UnreadMessageIndicatorComponent;
import ru.ozon.app.android.pdp.widgets.aspectsV2.di.AspectsComponent;
import ru.ozon.app.android.pdp.widgets.badgeListV2.di.BadgeListV2WidgetComponent;
import ru.ozon.app.android.pdp.widgets.galleryV3.di.GalleryWidgetComponent;
import ru.ozon.app.android.travel.feature.general.common.widgets.bannerWithAction.v1.di.BannerWithActionComponent;
import ru.ozon.app.android.travel.feature.tours.widgets.toursSearchResult.di.ToursSearchResultComponent;
import ru.ozon.app.android.ugc.core.widgets.singlereview.commentFooter.CommentFooterComponent;

/* renamed from: Fo.a, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final /* synthetic */ class C3057a implements InterfaceC7469a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9539a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C7475g f9540b;

    public /* synthetic */ C3057a(C7475g c7475g, int i11) {
        this.f9539a = i11;
        this.f9540b = c7475g;
    }

    @Override // k20.InterfaceC7469a
    public final InterfaceC6958a component() {
        RealFbsSplitWidgetComponent create$lambda$0;
        GalleryWidgetComponent create$lambda$02;
        UnreadMessageIndicatorComponent instance$lambda$0;
        PdpCouponListV2Component widgetComponent$lambda$0;
        ProfileAvatarComponent create$lambda$03;
        ToursSearchResultComponent create$lambda$04;
        AspectsComponent create$lambda$05;
        BadgeListV2WidgetComponent instance$lambda$02;
        DeliveryWidgetV2Component create$lambda$06;
        StickyLadderComponent create$lambda$07;
        ReconciliationActsDeclinerComponent widgetComponent$lambda$02;
        BannerWithActionComponent create$lambda$08;
        CommentFooterComponent create$lambda$09;
        switch (this.f9539a) {
            case 0:
                create$lambda$0 = RealFbsSplitWidgetComponent.Companion.create$lambda$0(this.f9540b);
                return create$lambda$0;
            case 1:
                create$lambda$02 = GalleryWidgetComponent.Companion.create$lambda$0(this.f9540b);
                return create$lambda$02;
            case 2:
                instance$lambda$0 = UnreadMessageIndicatorComponent.Companion.getInstance$lambda$0(this.f9540b);
                return instance$lambda$0;
            case 3:
                widgetComponent$lambda$0 = PdpCouponListV2ViewMapper.widgetComponent$lambda$0(this.f9540b);
                return widgetComponent$lambda$0;
            case 4:
                create$lambda$03 = ProfileAvatarComponent.Companion.create$lambda$0(this.f9540b);
                return create$lambda$03;
            case 5:
                create$lambda$04 = ToursSearchResultComponent.Companion.create$lambda$0(this.f9540b);
                return create$lambda$04;
            case 6:
                create$lambda$05 = AspectsComponent.Companion.create$lambda$0(this.f9540b);
                return create$lambda$05;
            case 7:
                instance$lambda$02 = BadgeListV2WidgetComponent.Companion.getInstance$lambda$0(this.f9540b);
                return instance$lambda$02;
            case 8:
                create$lambda$06 = DeliveryWidgetV2Component.Companion.create$lambda$0(this.f9540b);
                return create$lambda$06;
            case 9:
                create$lambda$07 = StickyLadderComponent.Companion.create$lambda$0(this.f9540b);
                return create$lambda$07;
            case 10:
                widgetComponent$lambda$02 = ReconciliationActsDeclinerViewMapper.widgetComponent$lambda$0(this.f9540b);
                return widgetComponent$lambda$02;
            case 11:
                create$lambda$08 = BannerWithActionComponent.Companion.create$lambda$0(this.f9540b);
                return create$lambda$08;
            default:
                create$lambda$09 = CommentFooterComponent.Companion.create$lambda$0(this.f9540b);
                return create$lambda$09;
        }
    }
}
