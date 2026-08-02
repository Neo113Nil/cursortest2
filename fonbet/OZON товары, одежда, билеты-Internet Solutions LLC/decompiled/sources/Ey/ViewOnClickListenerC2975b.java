package Ey;

import android.view.View;
import ru.ozon.app.android.account.orders.cancelpostingsv2.presentation.monoposting.CancelPostingsV2MonopostingViewHolder;
import ru.ozon.app.android.account.orders.ordergallery.presentation.PostingsAdapter;
import ru.ozon.app.android.cabinet.profileAvatar.presentation.view.AvatarPickerView;
import ru.ozon.app.android.checkoutcomposer.totalV3.presentation.interactiveSummary.InteractiveSummaryView;
import ru.ozon.app.android.favorites.ui.favoriteMoleculeV4.view.ProductFavoriteMoleculeV4ButtonView;
import ru.ozon.app.android.geo.map.presentation.utils.SheetPageHelper;
import ru.ozon.app.android.marketing.widgets.pdpCouponListV2.presentation.adapter.PdpCouponListV2ItemViewHolder;
import ru.ozon.app.android.storefront.widgets.naviGrid.presentation.NaviGridVerticalCoupleViewHolder;
import ru.ozon.app.android.travel.feature.avia.widgets.buyTogether.view.BuyTogetherView;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsGalleryFull.v1.presentation.pager.HotelsGalleryFullPagerVideoViewHolder;
import ru.ozon.app.android.ugc.core.databinding.ViewGalleryPreviewVideoBinding;
import ru.ozon.app.android.ugc.core.widgets.reviewGalleryPreview.presentation.ReviewGalleryPreviewWidgetVH;
import ru.ozon.fintech.features.pinpad.presentation.pinpad.PinPadFragment;
import ru.ozon.fintech.ui.button.radioV2.FinRadioButtonV2View;
import ru.ozon.uni.android.cell.label.TitleSubtitleCellView;
import ru.ozon.uni.atoms.v3.holders.disclaimer.DSDisclaimerHolder;

/* renamed from: Ey.b, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final /* synthetic */ class ViewOnClickListenerC2975b implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8157a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f8158b;

    public /* synthetic */ ViewOnClickListenerC2975b(Object obj, int i11) {
        this.f8157a = i11;
        this.f8158b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f8157a) {
            case 0:
                SheetPageHelper.attachToPage$lambda$11$lambda$10((SheetPageHelper) this.f8158b, view);
                break;
            case 1:
                BuyTogetherView.setUpRoot$lambda$9((BuyTogetherView) this.f8158b, view);
                break;
            case 2:
                PinPadFragment.K((PinPadFragment) this.f8158b);
                break;
            case 3:
                PdpCouponListV2ItemViewHolder.lambda$2$lambda$1((PdpCouponListV2ItemViewHolder) this.f8158b, view);
                break;
            case 4:
                AvatarPickerView.lambda$4$lambda$2((AvatarPickerView) this.f8158b, view);
                break;
            case 5:
                ((TitleSubtitleCellView) this.f8158b).callOnClick();
                break;
            case 6:
                PostingsAdapter.PostingVH._init_$lambda$1((PostingsAdapter.PostingVH) this.f8158b, view);
                break;
            case 7:
                ReviewGalleryPreviewWidgetVH.bind$lambda$0((ViewGalleryPreviewVideoBinding) this.f8158b, view);
                break;
            case 8:
                FinRadioButtonV2View._init_$lambda$0((FinRadioButtonV2View) this.f8158b, view);
                break;
            case 9:
                DSDisclaimerHolder._init_$lambda$3((DSDisclaimerHolder) this.f8158b, view);
                break;
            case 10:
                HotelsGalleryFullPagerVideoViewHolder.lambda$5$lambda$3((HotelsGalleryFullPagerVideoViewHolder) this.f8158b, view);
                break;
            case 11:
                InteractiveSummaryView._init_$lambda$4((InteractiveSummaryView) this.f8158b, view);
                break;
            case 12:
                ((CancelPostingsV2MonopostingViewHolder) this.f8158b).clickToPriceUpView();
                break;
            case 13:
                ProductFavoriteMoleculeV4ButtonView._init_$lambda$1((ProductFavoriteMoleculeV4ButtonView) this.f8158b, view);
                break;
            default:
                NaviGridVerticalCoupleViewHolder.topOnClickListener$lambda$1((NaviGridVerticalCoupleViewHolder) this.f8158b, view);
                break;
        }
    }
}
