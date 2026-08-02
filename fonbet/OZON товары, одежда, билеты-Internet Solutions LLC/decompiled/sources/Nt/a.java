package Nt;

import Ui.C4069c;
import android.view.View;
import l10.InterfaceC7851b;
import ru.ozon.app.android.cart.premiumPointsTrainV2.presentation.multipleCarriageTrain.adapter.HeadCarriageV2ViewHolder;
import ru.ozon.app.android.common.filterWidgets.filters.presentation.multiplerangesfilter.MultipleRangesFilterViewHolder;
import ru.ozon.app.android.fresh.cart.widgets.reorderTile.presentation.item.ReorderTileItemView;
import ru.ozon.app.android.storefront.widgets.financeWidget.presentation.single.SingleCardView;
import ru.ozon.app.android.travel.feature.railway.widgets.travelRailwaySearchResults.v3.presentation.train.TravelRailwaySearchResultsV3TrainProWidgetViewHolder;
import ru.ozon.fintech.features.camera.presentation.qrconfirm.QrScannerResultBottomSheet;
import ru.ozon.fintech.features.pinpad.presentation.pinpad.PinPadFragment;
import ru.ozon.uni.atoms.v3.holders.controls.button.ButtonAtomHolder;
import ru.ozon.uni.atoms.v3.holders.disclaimer.DSDisclaimerHolder;

/* loaded from: classes12.dex */
public final /* synthetic */ class a implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19667a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f19668b;

    public /* synthetic */ a(Object obj, int i11) {
        this.f19667a = i11;
        this.f19668b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f19667a) {
            case 0:
                ((ReorderTileItemView) this.f19668b).performClick();
                break;
            case 1:
                ((MultipleRangesFilterViewHolder) this.f19668b).titleClick();
                break;
            case 2:
                PinPadFragment.D((PinPadFragment) this.f19668b);
                break;
            case 3:
                HeadCarriageV2ViewHolder._init_$lambda$1((HeadCarriageV2ViewHolder) this.f19668b, view);
                break;
            case 4:
                SingleCardView._init_$lambda$7((SingleCardView) this.f19668b, view);
                break;
            case 5:
                ((InterfaceC7851b) this.f19668b).f(true);
                break;
            case 6:
                C4069c.v((C4069c) this.f19668b);
                break;
            case 7:
                ButtonAtomHolder._init_$lambda$1((ButtonAtomHolder) this.f19668b, view);
                break;
            case 8:
                DSDisclaimerHolder._init_$lambda$7((DSDisclaimerHolder) this.f19668b, view);
                break;
            case 9:
                TravelRailwaySearchResultsV3TrainProWidgetViewHolder.setUpRootView$lambda$2((TravelRailwaySearchResultsV3TrainProWidgetViewHolder) this.f19668b, view);
                break;
            default:
                QrScannerResultBottomSheet.onViewCreated$lambda$4((QrScannerResultBottomSheet) this.f19668b, view);
                break;
        }
    }
}
