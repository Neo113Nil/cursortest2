package BS;

import Ve.C4474ng;
import Ve.C4785yc;
import Ve.Vh;
import android.view.View;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.android.composerCommonViewKit.header.presentation.HeaderViewHolder;
import ru.ozon.app.android.account.orders.cancel.presentation.CancelReasonPriceUpBottomSheetFragment;
import ru.ozon.app.android.account.orders.commonBarcode.presentation.rounded.CommonBarcodeViewHolder;
import ru.ozon.app.android.account.orders.emptyscreen.antibot.modal.AntibotBarcodePopoverBottomSheetFragment;
import ru.ozon.app.android.autopicker.view.productpickersearch.presentation.ProductPickerSearchFragment;
import ru.ozon.app.android.cabinet.activationtitle.ActivationTitleWidgetViewHolder;
import ru.ozon.app.android.cabinet.profiledatasettings.presentation.ui.ProfileBirthdayChooseDialog;
import ru.ozon.app.android.search.dialogsearchscreen.searchbar.view.DialogSearchBarView;
import ru.ozon.app.android.search.dialogsearchscreen.withTopFilters.DialogSearchTopFiltersFragment;
import ru.ozon.app.android.travel.feature.general.common.widgets.pricesHistogram.v2.presentation.adapter.PricesHistogramV2DaysViewHolder;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsRoomsList.v5.presentation.view.HotelsRoomsListV5View;
import ru.ozon.app.android.travel.feature.tours.widgets.toursRoomsList.v2.view.ToursRoomsListV2RoomView;
import ru.ozon.app.android.universalwidgets.widgets.uw.old.uobject.gridone.singleitem.UniversalObjectGridOneSingleItemViewHolderOptimized;

/* loaded from: classes4.dex */
public final /* synthetic */ class a implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3280a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f3281b;

    public /* synthetic */ a(Object obj, int i11) {
        this.f3280a = i11;
        this.f3281b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object obj = this.f3281b;
        switch (this.f3280a) {
            case 0:
                HotelsRoomsListV5View.clickableArea$lambda$13$lambda$12((HotelsRoomsListV5View) obj, view);
                break;
            case 1:
                CommonBarcodeViewHolder._init_$lambda$0((CommonBarcodeViewHolder) obj, view);
                break;
            case 2:
                ActivationTitleWidgetViewHolder.setupButtonAppearance$lambda$9$lambda$8((ActivationTitleWidgetViewHolder) obj, view);
                break;
            case 3:
                ((Function0) obj).invoke();
                break;
            case 4:
                ((AntibotBarcodePopoverBottomSheetFragment) obj).dismiss();
                break;
            case 5:
                UniversalObjectGridOneSingleItemViewHolderOptimized._init_$lambda$2((UniversalObjectGridOneSingleItemViewHolderOptimized) obj, view);
                break;
            case 6:
                ToursRoomsListV2RoomView.setupLayout$lambda$10((ToursRoomsListV2RoomView) obj, view);
                break;
            case 7:
                C4474ng this$0 = (C4474ng) obj;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                ((Vh) this$0.u()).f0(C4785yc.f32567a);
                break;
            case 8:
                ((ProfileBirthdayChooseDialog) obj).dismiss();
                break;
            case 9:
                HeaderViewHolder._init_$lambda$1((HeaderViewHolder) obj, view);
                break;
            case 10:
                DialogSearchTopFiltersFragment.setClearButtonClickListener$lambda$38((DialogSearchBarView) obj, view);
                break;
            case 11:
                ProductPickerSearchFragment.onEnableButton$lambda$8$lambda$7((ProductPickerSearchFragment) obj, view);
                break;
            case 12:
                PricesHistogramV2DaysViewHolder._init_$lambda$0((PricesHistogramV2DaysViewHolder) obj, view);
                break;
            case 13:
                CancelReasonPriceUpBottomSheetFragment.bindViews$lambda$3$lambda$2((CancelReasonPriceUpBottomSheetFragment) obj, view);
                break;
            default:
                ((ru.ozon.android.messenger.framework.presentation.chatdetail.coupon.a) obj).dismiss();
                break;
        }
    }
}
