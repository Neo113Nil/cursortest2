package EE;

import android.view.View;
import android.widget.ImageButton;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import ru.ozon.android.messenger.framework.analytics.h;
import ru.ozon.android.messenger.framework.core.d;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.account.orders.orderfilters.presentation.OrderFiltersVO;
import ru.ozon.app.android.account.orders.orderfilters.presentation.YearsAdapter;
import ru.ozon.app.android.fresh.cart.widgets.cartTile.presentation.item.SwipeTileLayout;
import ru.ozon.app.android.fresh.main.widgets.catalogShelf.presentation.row.CatalogShelfItemVO;
import ru.ozon.app.android.fresh.main.widgets.catalogShelf.presentation.row.CatalogShelfItemView;
import ru.ozon.app.android.fresh.main.widgets.catalogueTabs.v2.presentation.CatalogTabsV2VO;
import ru.ozon.app.android.fresh.main.widgets.catalogueTabs.v2.presentation.max.CloudTabsLayout;
import ru.ozon.app.android.geo.addressBookBar.presentation.AddressBookBarDelegate;
import ru.ozon.app.android.marketing.widgets.coupon.presentation.CouponBinder;
import ru.ozon.app.android.pdp.view.shared.ExpandableWidget$ExpandButton;
import ru.ozon.app.android.pdp.widgets.galleryV5.presentation.GalleryV5VO;
import ru.ozon.app.android.pdp.widgets.galleryV5.presentation.gallery.info.GalleryV5InfoVH;
import ru.ozon.app.android.pdp.widgets.priceV4.presentation.top.PriceStarsBadgeView;
import ru.ozon.app.android.pdp.widgets.priceV4.presentation.vo.PriceStarsBadgeVO;
import ru.ozon.app.android.pdp.widgets.richContent.presentation.RichContentWidgetViewHolder;
import ru.ozon.app.android.storefront.stories.setContainer.presentation.SetsAdapter;
import ru.ozon.app.android.storefront.stories.setOfPreviews.presentation.PreviewViewHolder;
import ru.ozon.app.android.travel.feature.general.order.widgets.orderNavBar.view.OrderNavBarTitlePlaceholderView;
import ru.ozon.app.android.ugc.widgets.ugccounters.presentation.UgcCountersVO;
import ru.ozon.app.android.ugc.widgets.ugccounters.presentation.recycler.UgcCountersDoubleBlockItemViewHolder;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;

/* loaded from: classes13.dex */
public final /* synthetic */ class a implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7681a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f7682b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f7683c;

    public /* synthetic */ a(int i11, Object obj, Object obj2) {
        this.f7681a = i11;
        this.f7682b = obj;
        this.f7683c = obj2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        AtomAction atomAction;
        switch (this.f7681a) {
            case 0:
                PriceStarsBadgeView.bindOrGone$lambda$3((PriceStarsBadgeVO) this.f7682b, (Function1) this.f7683c, view);
                break;
            case 1:
                ((RichContentWidgetViewHolder) this.f7682b).handleExpandClick((ExpandableWidget$ExpandButton) this.f7683c);
                break;
            case 2:
                SwipeTileLayout.lambda$4$lambda$3((ImageButton) this.f7682b, (SwipeTileLayout) this.f7683c, view);
                break;
            case 3:
                CatalogShelfItemView.bindOrGone$lambda$3((CatalogShelfItemVO) this.f7682b, (Function1) this.f7683c, view);
                break;
            case 4:
                YearsAdapter.YearVH.bind$lambda$1$lambda$0((YearsAdapter) this.f7682b, (OrderFiltersVO.YearVO) this.f7683c, view);
                break;
            case 5:
                UgcCountersDoubleBlockItemViewHolder.bind$lambda$4$lambda$3$lambda$2((UgcCountersDoubleBlockItemViewHolder) this.f7682b, (UgcCountersVO.Block.Single) this.f7683c, view);
                break;
            case 6:
                CloudTabsLayout.getOrCreateTabButton$lambda$12$lambda$11((CloudTabsLayout) this.f7682b, (CatalogTabsV2VO.Tab) this.f7683c, view);
                break;
            case 7:
                OrderNavBarTitlePlaceholderView.bindButtons$lambda$11$lambda$9$lambda$8((IconButtonV3DTO) this.f7682b, (Function1) this.f7683c, view);
                break;
            case 8:
                GalleryV5InfoVH.bind$lambda$2((GalleryV5VO.Item.Info) this.f7682b, (GalleryV5InfoVH) this.f7683c, view);
                break;
            case 9:
                AddressBookBarDelegate._init_$lambda$0((k) this.f7682b, (AddressBookBarDelegate) this.f7683c, view);
                break;
            case 10:
                SetsAdapter.onCreateViewHolder$lambda$1((SetsAdapter) this.f7682b, (PreviewViewHolder) this.f7683c, view);
                break;
            case 11:
                ButtonV3Atom.SmallButtonWithIcon smallButtonWithIcon = (ButtonV3Atom.SmallButtonWithIcon) this.f7682b;
                Map<String, TokenizedTrackingInfo> trackingInfo = smallButtonWithIcon.getTrackingInfo();
                d dVar = (d) this.f7683c;
                if (trackingInfo != null) {
                    dVar.c().m(h.a(trackingInfo));
                }
                AtomActionDTO action = smallButtonWithIcon.getAction();
                if (action != null && (atomAction = AtomActionMapperKt.toAtomAction(action, null)) != null) {
                    dVar.c().q(ru.ozon.android.messenger.framework.navigation.action.b.e(atomAction, null, 3));
                    break;
                }
                break;
            default:
                CouponBinder.setOnClickListener$lambda$1((CouponBinder) this.f7682b, (Function0) this.f7683c, view);
                break;
        }
    }
}
