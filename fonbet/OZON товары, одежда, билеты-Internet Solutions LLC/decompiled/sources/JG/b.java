package JG;

import android.view.View;
import ru.ozon.app.android.atoms.af.holders.LabelAtomHolder;
import ru.ozon.app.android.atoms.v3.holders.buttons.LargePaymentButtonHolder;
import ru.ozon.app.android.checkoutcomposer.split.presentation.elements.productBlock.ProductBlockViewHolder;
import ru.ozon.app.android.regulardraw.widgets.entryBannerWidget.v1.presentation.single.EntryBannerWidgetSingleViewHolder;
import ru.ozon.app.android.returns.creation.molecule.returnCreationDeliveryGroup.presentation.group.viewHolder.ReturnCreationGroupViewHolder;
import ru.ozon.app.android.session.userAdultModalMobile.presentation.AdultConfirmationViewHolder;
import ru.ozon.app.android.storefront.widgets.financeWidget.presentation.carousel.FrameView;
import ru.ozon.app.android.travel.feature.avia.widgets.aviaFavoriteList.view.AviaFavoriteListFlightView;
import ru.ozon.app.android.travel.feature.general.booking.widgets.searchResultsNavTitle.v2.view.SearchResultsNavTitleV2View;
import ru.ozon.app.android.travel.molecules.view.dropDownBanner.DropDownBannerView;
import ru.ozon.app.android.uikit.view.atoms.cells.subtitled.CellWithSubtitle24IconPickerView;
import ru.ozon.id.nativeauth.main.activity.AuthFlowActivity;

/* loaded from: classes13.dex */
public final /* synthetic */ class b implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14279a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f14280b;

    public /* synthetic */ b(Object obj, int i11) {
        this.f14279a = i11;
        this.f14280b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f14279a) {
            case 0:
                ReturnCreationGroupViewHolder.actionSelectClickListener$lambda$1((ReturnCreationGroupViewHolder) this.f14280b, view);
                break;
            case 1:
                AdultConfirmationViewHolder._init_$lambda$2((AdultConfirmationViewHolder) this.f14280b, view);
                break;
            case 2:
                AuthFlowActivity.K((AuthFlowActivity) this.f14280b);
                break;
            case 3:
                ProductBlockViewHolder.lambda$2$lambda$1((ProductBlockViewHolder) this.f14280b, view);
                break;
            case 4:
                LabelAtomHolder.onBind$lambda$3$lambda$2((LabelAtomHolder) this.f14280b, view);
                break;
            case 5:
                FrameView._init_$lambda$8((FrameView) this.f14280b, view);
                break;
            case 6:
                SearchResultsNavTitleV2View._init_$lambda$1((SearchResultsNavTitleV2View) this.f14280b, view);
                break;
            case 7:
                EntryBannerWidgetSingleViewHolder._init_$lambda$0((EntryBannerWidgetSingleViewHolder) this.f14280b, view);
                break;
            case 8:
                LargePaymentButtonHolder._init_$lambda$1((LargePaymentButtonHolder) this.f14280b, view);
                break;
            case 9:
                DropDownBannerView.setUp$lambda$3((DropDownBannerView) this.f14280b, view);
                break;
            case 10:
                ru.ozon.app.android.storefront.widgets.naviBlocks.presentation.single.FrameView._init_$lambda$9((ru.ozon.app.android.storefront.widgets.naviBlocks.presentation.single.FrameView) this.f14280b, view);
                break;
            case 11:
                CellWithSubtitle24IconPickerView._init_$lambda$0((CellWithSubtitle24IconPickerView) this.f14280b, view);
                break;
            default:
                AviaFavoriteListFlightView.setupRoot$lambda$15((AviaFavoriteListFlightView) this.f14280b, view);
                break;
        }
    }
}
