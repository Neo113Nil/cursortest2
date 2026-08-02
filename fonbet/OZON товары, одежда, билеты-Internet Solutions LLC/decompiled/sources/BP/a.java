package BP;

import android.view.View;
import kotlin.jvm.functions.Function1;
import ru.ozon.android.messenger.blocks.input.attachments.presentation.b;
import ru.ozon.app.android.fresh.main.widgets.catalogShelf.presentation.row.CatalogShelfItemVO;
import ru.ozon.app.android.fresh.main.widgets.catalogShelf.presentation.row.optimized.CatalogShelfItemViewNew;
import ru.ozon.app.android.fresh.unsorted.widgets.deliveryWidget.v4.presentation.DeliveryWidgetV4VO;
import ru.ozon.app.android.fresh.unsorted.widgets.deliveryWidget.v4.presentation.DeliveryWidgetV4View;
import ru.ozon.app.android.marketing.widgets.highlightProducts.presentation.HighlightProductsVO;
import ru.ozon.app.android.marketing.widgets.highlightProducts.presentation.adapter.HighlightProductsAdapter;
import ru.ozon.app.android.regulardraw.widgets.navbar.data.CarrotNavBarButtonVO;
import ru.ozon.app.android.regulardraw.widgets.navbar.presentation.MorkovskNavBarViewHolder;
import ru.ozon.app.android.travel.feature.avia.widgets.travelServicePackageIndMobileAddToOrder.v3.presentation.ServicePackSelectionV3WidgetViewHolder;
import ru.ozon.app.android.travel.feature.avia.widgets.travelServicePackageIndMobileAddToOrder.v3.view.ServicePackViewV3;
import ru.ozon.app.android.ugc.widgets.reviewFormMobile.reviewFormVariantPicker.VariantPickerVO;
import ru.ozon.app.android.ugc.widgets.reviewFormMobile.reviewFormVariantPicker.VariantsListAdapter;
import ru.ozon.composer.ui.view.issue.PageIssueStateView;
import ru.ozon.uni.atoms.af.AtomAction;
import z00.f;

/* loaded from: classes4.dex */
public final /* synthetic */ class a implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3271a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f3272b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f3273c;

    public /* synthetic */ a(int i11, Object obj, Object obj2) {
        this.f3271a = i11;
        this.f3272b = obj;
        this.f3273c = obj2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f3271a) {
            case 0:
                ((Function1) this.f3272b).invoke((AtomAction) this.f3273c);
                break;
            case 1:
                HighlightProductsAdapter.ViewHolder.bind$lambda$5$lambda$4((HighlightProductsVO.HighlightProduct) this.f3272b, (HighlightProductsAdapter.ViewHolder) this.f3273c, view);
                break;
            case 2:
                CatalogShelfItemViewNew.bindOrGone$lambda$10((CatalogShelfItemVO) this.f3273c, (Function1) this.f3272b, view);
                break;
            case 3:
                PageIssueStateView.d((f) this.f3272b, (PageIssueStateView) this.f3273c);
                break;
            case 4:
                ServicePackSelectionV3WidgetViewHolder.bindServicePacks$lambda$5$lambda$4$lambda$3((ServicePackSelectionV3WidgetViewHolder) this.f3272b, (ServicePackViewV3) this.f3273c, view);
                break;
            case 5:
                DeliveryWidgetV4View.bind$lambda$19$lambda$16((DeliveryWidgetV4View) this.f3272b, (DeliveryWidgetV4VO) this.f3273c, view);
                break;
            case 6:
                MorkovskNavBarViewHolder.bindOrGone$lambda$8((CarrotNavBarButtonVO) this.f3272b, (MorkovskNavBarViewHolder) this.f3273c, view);
                break;
            case 7:
                ru.ozon.android.messenger.blocks.input.attachments.presentation.a.f((ru.ozon.android.messenger.blocks.input.attachments.presentation.a) this.f3272b, (b) this.f3273c);
                break;
            case 8:
                ru.ozon.android.messenger.blocks.paginationerror.b.b((ru.ozon.android.messenger.blocks.paginationerror.a) this.f3272b, (ru.ozon.android.messenger.blocks.paginationerror.b) this.f3273c);
                break;
            default:
                VariantsListAdapter.VariantViewHolder.bind$lambda$1$lambda$0((VariantsListAdapter.VariantViewHolder) this.f3272b, (VariantPickerVO.VariantPickerItem.Variant) this.f3273c, view);
                break;
        }
    }

    public /* synthetic */ a(CatalogShelfItemVO catalogShelfItemVO, Function1 function1) {
        this.f3271a = 2;
        this.f3273c = catalogShelfItemVO;
        this.f3272b = function1;
    }
}
