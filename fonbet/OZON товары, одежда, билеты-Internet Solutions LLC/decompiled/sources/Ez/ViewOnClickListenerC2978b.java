package Ez;

import android.view.View;
import ld0.C7929D;
import ru.ozon.app.android.atoms.v3.holders.multilineBadge.MultilineBadgeHolder;
import ru.ozon.app.android.cart.premiumPointsTrainV2.presentation.multipleCarriageTrain.adapter.TailCarriageV2ViewHolder;
import ru.ozon.app.android.common.filterWidgets.filters.presentation.multiplerangesfilter.MultipleRangesFilterViewHolder;
import ru.ozon.app.android.datePicker.DatePickerDialogFragment;
import ru.ozon.app.android.marketing.widgets.couponPromo.presentation.CouponPromoViewHolder;
import ru.ozon.app.android.marketing.widgets.hammersV3.oldHammers.presentation.binders.OldHammerProductImageBinder;
import ru.ozon.app.android.product.common.richheader.presentation.RichHeaderViewHolder;
import ru.ozon.app.android.sellerproducts.sellerProducts.binders.ProductAdultImageWithVideoCoverBinder;
import ru.ozon.app.android.storefront.widgets.stickyScroll.presentation.StickyScrollViewHolder;
import ru.ozon.app.android.storefront.widgets.videoTile.presentation.VideoTileViewHolder;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelSearchResults.v5.presentation.card.adapter.images.HotelsSearchResultsV5ItemImagesAdapter;
import ru.ozon.app.android.travel.feature.tours.widgets.toursRoomsList.v2.presentation.room.images.ToursRoomsListV2ImagesViewHolder;
import ru.ozon.app.android.travel.molecules.view.cellWithTimer.CellWithTimerView;
import ru.ozon.fintech.features.pinpad.presentation.pinpad.PinPadFragment;
import ru.ozon.fintech.preferences.ui.nativebridge.JsonCodeEditorView;
import ru.ozon.uni.atoms.v3.holders.controls.button.InputSelectButtonHolder;

/* renamed from: Ez.b, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final /* synthetic */ class ViewOnClickListenerC2978b implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8163a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f8164b;

    public /* synthetic */ ViewOnClickListenerC2978b(Object obj, int i11) {
        this.f8163a = i11;
        this.f8164b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f8163a) {
            case 0:
                OldHammerProductImageBinder.init$lambda$0((OldHammerProductImageBinder) this.f8164b, view);
                break;
            case 1:
                RichHeaderViewHolder._init_$lambda$1((RichHeaderViewHolder) this.f8164b, view);
                break;
            case 2:
                JsonCodeEditorView.b((JsonCodeEditorView) this.f8164b);
                break;
            case 3:
                ((MultipleRangesFilterViewHolder) this.f8164b).titleClick();
                break;
            case 4:
                PinPadFragment.J((PinPadFragment) this.f8164b);
                break;
            case 5:
                StickyScrollViewHolder.lambda$14$lambda$13((StickyScrollViewHolder) this.f8164b, view);
                break;
            case 6:
                ToursRoomsListV2ImagesViewHolder._init_$lambda$0((ToursRoomsListV2ImagesViewHolder) this.f8164b, view);
                break;
            case 7:
                TailCarriageV2ViewHolder._init_$lambda$1((TailCarriageV2ViewHolder) this.f8164b, view);
                break;
            case 8:
                VideoTileViewHolder._init_$lambda$1((VideoTileViewHolder) this.f8164b, view);
                break;
            case 9:
                HotelsSearchResultsV5ItemImagesAdapter.getAppCompatImageView$lambda$2$lambda$1((HotelsSearchResultsV5ItemImagesAdapter) this.f8164b, view);
                break;
            case 10:
                InputSelectButtonHolder._init_$lambda$1((InputSelectButtonHolder) this.f8164b, view);
                break;
            case 11:
                MultilineBadgeHolder._init_$lambda$1((MultilineBadgeHolder) this.f8164b, view);
                break;
            case 12:
                CellWithTimerView._init_$lambda$1((CellWithTimerView) this.f8164b, view);
                break;
            case 13:
                ProductAdultImageWithVideoCoverBinder.init$lambda$1((ProductAdultImageWithVideoCoverBinder) this.f8164b, view);
                break;
            case 14:
                C7929D.v((C7929D) this.f8164b);
                break;
            case 15:
                DatePickerDialogFragment.initClicks$lambda$4((DatePickerDialogFragment) this.f8164b, view);
                break;
            default:
                CouponPromoViewHolder.bind$lambda$5$lambda$4((CouponPromoViewHolder) this.f8164b, view);
                break;
        }
    }
}
