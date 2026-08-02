package Dc0;

import Ve.C4192dm;
import Ve.C4391kk;
import Ve.D1;
import android.view.View;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.account.orders.barcode.presentation.BarcodeFragment;
import ru.ozon.app.android.cml.delivery.widgets.boxList.presentation.adapter.BoxListCardsAdapter;
import ru.ozon.app.android.commonwidgets.widgets.curtainnavbar.presentation.CurtainNavBarViewHolder;
import ru.ozon.app.android.favorites.shoppinglistv2.presentation.createlist.ShoppingListsV2CreateListViewHolder;
import ru.ozon.app.android.marketing.widgets.sellerCarousel.presentation.SellerCarouselAdapter;
import ru.ozon.app.android.pdp.view.photo360.presentation.Photo360Activity;
import ru.ozon.app.android.pdp.widgets.galleryV5.presentation.gallery.image.BaseGalleryV5ImageVH;
import ru.ozon.app.android.travel.feature.avia.widgets.aviaBookedTicketInfo.view.AviaBookedTicketInfoView;
import ru.ozon.app.android.travel.feature.general.services.widgets.supportBenefitsBanner.presentation.view.SupportBenefitsBannerView;
import ru.ozon.app.android.ugc.widgets.common.mediaPicker.presentation.MediaPickerItemVH;
import ru.ozon.app.android.uikit.view.atoms.cells.subtitled.CellWithSubtitleCheckboxRadioView;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.binders.ProductStateRecyclerViewBinder;
import ru.ozon.fintech.permissions.ui.PermissionsScreenStateView;

/* loaded from: classes3.dex */
public final /* synthetic */ class j implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6483a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f6484b;

    public /* synthetic */ j(Object obj, int i11) {
        this.f6483a = i11;
        this.f6484b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object obj = this.f6484b;
        switch (this.f6483a) {
            case 0:
                q.A((q) obj);
                break;
            case 1:
                BoxListCardsAdapter.BoxListViewHolder._init_$lambda$1((BoxListCardsAdapter.BoxListViewHolder) obj, view);
                break;
            case 2:
                ((Photo360Activity) obj).finish();
                break;
            case 3:
                ProductStateRecyclerViewBinder.init$lambda$1((ProductStateRecyclerViewBinder) obj, view);
                break;
            case 4:
                C4192dm this$0 = (C4192dm) obj;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                ((D1) this$0.u()).e0(C4391kk.f31448a);
                break;
            case 5:
                MediaPickerItemVH.lambda$6$lambda$4((MediaPickerItemVH) obj, view);
                break;
            case 6:
                ((SellerCarouselAdapter.SellerViewHolder) obj).onProductClick(0);
                break;
            case 7:
                ((BaseGalleryV5ImageVH) obj).onImageClick();
                break;
            case 8:
                BarcodeFragment.setUpToolbar$lambda$4((BarcodeFragment) obj, view);
                break;
            case 9:
                AviaBookedTicketInfoView.setupRoot$lambda$5((AviaBookedTicketInfoView) obj, view);
                break;
            case 10:
                ShoppingListsV2CreateListViewHolder._init_$lambda$2((ShoppingListsV2CreateListViewHolder) obj, view);
                break;
            case 11:
                CurtainNavBarViewHolder._init_$lambda$5((CurtainNavBarViewHolder) obj, view);
                break;
            case 12:
                ((CellWithSubtitleCheckboxRadioView) obj).onCheckedChange();
                break;
            case 13:
                int i11 = PermissionsScreenStateView.f96633c;
                ((PermissionsScreenStateView) obj).close();
                break;
            case 14:
                ((Function0) obj).invoke();
                break;
            default:
                SupportBenefitsBannerView._init_$lambda$19((SupportBenefitsBannerView) obj, view);
                break;
        }
    }
}
