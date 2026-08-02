package Bs;

import android.view.View;
import ru.ozon.app.android.atoms.v3.holders.tags.CrossColorTagHolder;
import ru.ozon.app.android.common.progressivemolecula.presentation.ProgressiveTextViewHolder;
import ru.ozon.app.android.deliveryreview.deliveryReviewForm.presentation.item.DeliveryReviewFormItemWidgetViewHolder;
import ru.ozon.app.android.travel.feature.railway.widgets.travelRailwaySearchResults.v4.presentation.train.TravelRailwaySearchResultsV4TrainWidgetViewHolder;
import ru.ozon.app.android.travel.feature.railway.widgets.travelRailwaySeatSelectWithScheme.v2.view.carriageDetails.CarriageDetailsView;
import ru.ozon.app.android.uikit.view.atoms.cells.subtitled.CellWithSubtitle24IconCheckboxRadioView;
import ru.ozon.fintech.ui.menuitem.MenuItemView;
import ru.ozon.uni.atoms.v3.holders.controls.chip.IndicatorLabelChipHolder;

/* renamed from: Bs.b, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final /* synthetic */ class ViewOnClickListenerC2671b implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4040a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f4041b;

    public /* synthetic */ ViewOnClickListenerC2671b(Object obj, int i11) {
        this.f4040a = i11;
        this.f4041b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f4040a) {
            case 0:
                DeliveryReviewFormItemWidgetViewHolder._init_$lambda$2((DeliveryReviewFormItemWidgetViewHolder) this.f4041b, view);
                break;
            case 1:
                IndicatorLabelChipHolder._init_$lambda$1((IndicatorLabelChipHolder) this.f4041b, view);
                break;
            case 2:
                ProgressiveTextViewHolder._init_$lambda$0((ProgressiveTextViewHolder) this.f4041b, view);
                break;
            case 3:
                CrossColorTagHolder._init_$lambda$1((CrossColorTagHolder) this.f4041b, view);
                break;
            case 4:
                TravelRailwaySearchResultsV4TrainWidgetViewHolder.setUpRootView$lambda$2((TravelRailwaySearchResultsV4TrainWidgetViewHolder) this.f4041b, view);
                break;
            case 5:
                CarriageDetailsView._init_$lambda$9((CarriageDetailsView) this.f4041b, view);
                break;
            case 6:
                ru.ozon.android.messenger.framework.presentation.chatdetail.report.a.t((ru.ozon.android.messenger.framework.presentation.chatdetail.report.a) this.f4041b);
                break;
            case 7:
                MenuItemView._init_$lambda$1((MenuItemView) this.f4041b, view);
                break;
            default:
                ((CellWithSubtitle24IconCheckboxRadioView) this.f4041b).onCheckedChange();
                break;
        }
    }
}
