package Ar;

import android.view.View;
import gj.C6743a;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C7735q;
import oj.C8744a;
import ru.ozon.app.android.common.filterWidgets.filters.presentation.textinputfilter.TextInputFilterViewHolder;
import ru.ozon.app.android.commonwidgets.widgets.themeSelector.ThemeSelectorWidgetViewHolder;
import ru.ozon.app.android.fresh.feature.b2b.widgets.edodatepicker.DateChooseDialog;
import ru.ozon.app.android.fresh.feature.b2b.widgets.legals.addLegalInnMobile.presentation.LegalsAdapter;
import ru.ozon.app.android.fresh.unsorted.widgets.deliveryWidget.v3.presentation.DeliveryWidgetV3View;
import ru.ozon.app.android.pdpvideomolecule.presentation.viewholder.VideoMoleculeViewHolder;
import ru.ozon.app.android.returns.returnableItemsList.presentation.returnableItems.title.viewHolder.ReturnableItemsTitleViewHolder;
import ru.ozon.app.android.travel.feature.general.main.widgets.travelSearchBar.view.TravelSearchBarInputView;
import ru.ozon.app.android.ugc.widgets.additionalReviewV2.presentation.AdditionalReviewV2VH;
import ru.ozon.fintech.features.pinpad.presentation.pinpad.PinPadFragment;
import ru.ozon.fintech.ui.iconcard.IconCardView;
import ru.ozon.fintech.ui.toolbar.FinToolbarView;
import ru.ozon.tracker.sendEvent.ActionType;
import ru.ozon.uni.android.uikit.view.atoms.buttons.jointpurchase.JointPurchaseButtonWithQuantityView;
import ru.ozon.uni.atoms.v3.holders.buttons.LargeBorderlessButtonHolder;

/* loaded from: classes11.dex */
public final /* synthetic */ class d implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1265a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1266b;

    public /* synthetic */ d(Object obj, int i11) {
        this.f1265a = i11;
        this.f1266b = obj;
    }

    /* JADX WARN: Type inference failed for: r2v4, types: [kotlin.jvm.functions.Function0, kotlin.jvm.internal.q] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f1265a) {
            case 0:
                ThemeSelectorWidgetViewHolder.lambda$5$lambda$4((ThemeSelectorWidgetViewHolder) this.f1266b, view);
                break;
            case 1:
                JointPurchaseButtonWithQuantityView.buttonListener$lambda$0((JointPurchaseButtonWithQuantityView) this.f1266b, view);
                break;
            case 2:
                TravelSearchBarInputView.clearInputIcon$lambda$7$lambda$6((TravelSearchBarInputView) this.f1266b, view);
                break;
            case 3:
                PinPadFragment.w((PinPadFragment) this.f1266b);
                break;
            case 4:
                ((TextInputFilterViewHolder) this.f1266b).onTitleClick();
                break;
            case 5:
                ((DateChooseDialog) this.f1266b).passResult();
                break;
            case 6:
                AdditionalReviewV2VH.setProductClickListener$lambda$4((AdditionalReviewV2VH) this.f1266b, view);
                break;
            case 7:
                LargeBorderlessButtonHolder._init_$lambda$1((LargeBorderlessButtonHolder) this.f1266b, view);
                break;
            case 8:
                LegalsAdapter.ViewHolder._init_$lambda$0((LegalsAdapter.ViewHolder) this.f1266b, view);
                break;
            case 9:
                ((C7735q) this.f1266b).invoke();
                break;
            case 10:
                DeliveryWidgetV3View.bindDeliveryIcon$lambda$31$lambda$30((Function0) this.f1266b, view);
                break;
            case 11:
                C6743a.b(ActionType.CLOSE.INSTANCE, null);
                ((C8744a) this.f1266b).dismiss();
                break;
            case 12:
                VideoMoleculeViewHolder._init_$lambda$14((VideoMoleculeViewHolder) this.f1266b, view);
                break;
            case 13:
                IconCardView._init_$lambda$1((IconCardView) this.f1266b, view);
                break;
            case 14:
                FinToolbarView.lambda$3$lambda$2((FinToolbarView) this.f1266b, view);
                break;
            default:
                ReturnableItemsTitleViewHolder.titleClickListener$lambda$0((ReturnableItemsTitleViewHolder) this.f1266b, view);
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ d(Function0 function0) {
        this.f1265a = 9;
        this.f1266b = (C7735q) function0;
    }
}
